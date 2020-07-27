package server;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class StudentServer {
    private static final Logger LOG = LoggerFactory.getLogger(StudentServer.class);

    public static void main(String[] args) {
        System.out.println("Strating server");
        try {
            Server server = ServerBuilder.forPort(8089)
                    .addService(new StudentServiceImpl())
                    .build();
            server.start();
            System.out.println("Server started at port:" + server.getPort());

            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                System.out.println("Received Shutdown Request");
                server.shutdown();
                System.out.println("Successfully stopped the server");
            }));

            server.awaitTermination();
        }catch (IOException | IllegalStateException exception){
            System.out.println("Exception occurred while starting the server." +exception.getMessage());}
        catch (InterruptedException exception){
            System.out.println("Exception occurred while waiting for server to be terminated." +exception.getMessage());
        }catch (Exception ex){
            System.out.println("Exception occurred:"+ex.getMessage());
        }

    }
}
