package pl.coderslab.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import pl.coderslab.entity.Publisher;

@Component
public class StringToPublisherConverter implements Converter<String, Publisher> {

    @Override
    public Publisher convert(String source) {

        try {

            long publisherId = Long.parseLong(source);

            Publisher publisher = new Publisher();
            publisher.setId(publisherId);

            return publisher;
        } catch (NumberFormatException e) {

        }
        return null;
    }
}
