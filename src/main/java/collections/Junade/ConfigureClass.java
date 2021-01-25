package collections.Junade;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigureClass
{
    @Bean(name="PersonCount")

    public PersonsInterface getService()
    {
        return new PersonsInterfaceImplementation();
    }
}