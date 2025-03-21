package io.github.ferclager.httpi.client;

import io.github.ferclager.httpi.model.JokeResponse;
import org.springframework.web.service.annotation.GetExchange;

public interface JokeClient {
    @GetExchange("/random")
    JokeResponse getJoke();
}
