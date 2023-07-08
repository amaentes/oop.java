package FileRepository;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class FileRepository {
    private String databaseName;
    private Map<Integer, Serializable> database;

    public FileRepository(String databaseName) {
        this.databaseName = databaseName;
        this.database = new HashMap<>();
    }

    public void saveObject(int id, Serializable object) {
        database.put(id, object);
        saveDatabase();
    }

    public Serializable getObject(int id) {
        return database.get(id);
    }

    public void updateObject(int id, Serializable object) {
        if (database.containsKey(id)) {
            database.put(id, object);
            saveDatabase();
        } else {
            System.out.println("Object with id " + id + " does not exist in the database.");
        }
    }

    public void deleteObject(int id) {
        if (database.containsKey(id)) {
            database.remove(id);
            saveDatabase();
        } else {
            System.out.println("Object with id " + id + " does not exist in the database.");
        }
    }

    private void saveDatabase() {
        try (FileOutputStream fileOutputStream = new FileOutputStream(databaseName + ".txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(database);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public void loadDatabase() {
        try (FileInputStream fileInputStream = new FileInputStream(databaseName + ".txt");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            database = (Map<Integer, Serializable>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
