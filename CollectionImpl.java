import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CollectionImpl extends UnicastRemoteObject implements Collection {
    // Private member variables
    private int m_number_of_books;
    private String m_name_of_collection;

    // Constructor
    public CollectionImpl() throws RemoteException {
        super(); // Call UnicastRemoteObject constructor
        m_number_of_books = 0;
        m_name_of_collection = "ger757024";
    }

    public int number_of_books() throws RemoteException {
        return m_number_of_books;
    }

    public String name_of_collection() throws RemoteException {
        return m_name_of_collection;
    }

    public void name_of_collection(String _new_value) throws RemoteException {
        this.m_name_of_collection = _new_value;
    }

    public static void main(String args[]){
        // Set the directory where the java.policy is located
        // The second argument is the path to the java.policy
        System.setProperty("java.security.policy", "./java.policy");

        // Create security administrator
        System.setSecurityManager(new SecurityManager());

        // Name or IP of the host where the server object resides
        String hostName = "127.0.0.1"; // It can be "IP:PORT"

        try {
            // Create remote object
            CollectionImpl obj = new CollectionImpl();
            System.out.println("Creado!");
            // Register remote object
            Naming.rebind("//" + hostName + "/ger757024", obj);
            System.out.println("Estoy registrado!");
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
