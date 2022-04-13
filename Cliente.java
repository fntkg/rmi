import java.rmi.Naming;

public class Cliente {
    public static void main (String[] args){
        // Set the directory where the java.policy is located
        // The second argument is the path to the java.policy
        System.setProperty("java.security.policy", "./java.policy");

        if (System.getSecurityManager() == null) {
            // Create security administrator
            System.setSecurityManager(new SecurityManager());
        }

        try {
            // Step 1: Get a reference to the server object created earlier
            // Name of the server host or its IP. This is where the remote object will be looked for.
            String hostname = "155.210.152.177";
            Collection server = (Collection) Naming.lookup("//" + hostname + "/ger757024");

            // Step 2: Remotely invoke server object methods
            System.out.println(server.name_of_collection());
            System.out.println(server.number_of_books());
            server.name_of_collection("757ger024");
            System.out.println(server.name_of_collection());

            //String resultado = server.practica_hecha("A757024", "/home/A757024/RMI/");
            //System.out.println("El profesor me responde: " + resultado);
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
}