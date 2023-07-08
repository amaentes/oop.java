package FileRepository;

public class Main {
    public static void main(String[] args) {
        FileRepository fileRepository = new FileRepository("database");
        fileRepository.saveObject(1, "Object 1");
        fileRepository.saveObject(2, "Object 2");

        fileRepository.loadDatabase();
        System.out.println(fileRepository.getObject(1)); // Output: Object 1
        System.out.println(fileRepository.getObject(2)); // Output: Object 2

        fileRepository.updateObject(1, "Updated Object 1");
        System.out.println(fileRepository.getObject(1)); // Output: Updated Object 1

        fileRepository.deleteObject(2);
        System.out.println(fileRepository.getObject(2)); // Output: null (object was deleted)
    }
}
