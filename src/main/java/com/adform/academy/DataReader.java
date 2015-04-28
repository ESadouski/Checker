package com.adform.academy;


import com.adform.kafka.KafkaClient;
import com.adform.kafka.KafkaReader;
import kafka.serializer.StringDecoder;
import kafka.utils.VerifiableProperties;

import scala.collection.immutable.List;

public class DataReader {

    private KafkaReader reader;
    private KafkaClient client;

    public DataReader() {
        client = new KafkaClient("54.148.2.89:2181", "freak");
        reader = client.mkReader("events", new StringDecoder(new VerifiableProperties()),
                new StringDecoder(new VerifiableProperties()), "smallest", true, 3000);
    }

    public List readFromKafka() {
        List data = reader.read(100);
        reader.shutdown();
        client.shutdown();
        return data;
    }

}
