package br.coop.unimed.portal.config;

//import io.quarkus.jsonb.JsonbConfigCustomizer;
import javax.inject.Singleton;
import javax.json.bind.JsonbConfig;
import javax.json.bind.serializer.JsonbSerializer;

@Singleton
public class FooSerializerRegistrationCustomizer {  //implements JsonbConfigCustomizer {

//    public void customize(JsonbConfig config) {
//        config.withSerializers(new FooSerializer());
//    }
}