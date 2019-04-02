package nlc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class AsyncService {

    private static final Logger logger = LoggerFactory.getLogger(AsyncService.class);


    @Async
    public CompletableFuture<String> findUser(String user, Long l) throws InterruptedException {
        logger.info("Looking up " + user);
        String url = String.format("https://api.github.com/users/%s", user);
        System.out.println(url);
        //    User results = getRestTemplate().getForObject(url, User.class);
        // Artificial delay of 1s for demonstration purposes
        Thread.sleep(l);
        System.out.println(url);
        System.out.println(url);


        return CompletableFuture.completedFuture(user);
    }

}
