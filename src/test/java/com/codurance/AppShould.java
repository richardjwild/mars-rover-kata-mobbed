package com.codurance;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class AppShould {

    @Mock Console console;

    @Test public void
    greet_the_user() {
        App app = new App(console);

        app.greet();

        Mockito.verify(console).print("Hello!");
    }
}
