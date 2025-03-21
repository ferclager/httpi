package io.github.ferclager.httpi.config;

import io.github.ferclager.httpi.client.JokeClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class JokeConfig {
    @Bean
    JokeClient getJokeClient() {
        RestClient client = RestClient.create("https://api.chucknorris.io/jokes");
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(RestClientAdapter.create(client)).build();
        return factory.createClient(JokeClient.class);
    }
}
