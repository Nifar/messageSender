package ODL.study.messageSender;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import ODL.study.messageSender.entity.Attachment;
import ODL.study.messageSender.entity.AttachmentType;
import ODL.study.messageSender.entity.Message;
import ODL.study.messageSender.entity.channel.Channel;
import ODL.study.messageSender.entity.channel.EmailChannel;
import ODL.study.messageSender.entity.channel.FacebookChannel;
import ODL.study.messageSender.entity.channel.SmsChannel;
import ODL.study.messageSender.service.Sender;

public class Runner {

    public static void main(String[] args) {
        List<Attachment> attachs = Arrays.asList(new Attachment(AttachmentType.DOCUMENT, new byte[10]),
                new Attachment(AttachmentType.PICTURE, new byte[10]),
                new Attachment(AttachmentType.SOUND, new byte[10]));
        List<Channel> channels = Arrays.asList(new EmailChannel("email@email.com"), new SmsChannel("+375291111111"),
                new FacebookChannel("123"));
        System.out.println("Write a message:");
        try (Scanner sc = new Scanner(System.in)) {
            Message message = new Message(System.getProperty("user.name"), LocalDateTime.now(), sc.nextLine(), attachs,
                    channels);
            if (new Sender().send(message))
                System.out.println(message + " is sended");
            else
                System.out.println("Message is no sended");
            main(args);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

    }

}
