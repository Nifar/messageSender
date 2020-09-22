package ODL.study.messageSender.entity;

import java.time.LocalDateTime;
import java.util.List;

import ODL.study.messageSender.entity.channel.Channel;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Message extends AbstractEntity {

    String owner;

    LocalDateTime dateMessageTo;

    String text;

    List<Attachment> attachments;

    List<Channel> channels;

}
