package ODL.study.messageSender.service;

import java.util.Random;

import ODL.study.messageSender.entity.Message;

public class Sender {

    public boolean send(Message message) {
        return new Random().nextBoolean();
    }

}
