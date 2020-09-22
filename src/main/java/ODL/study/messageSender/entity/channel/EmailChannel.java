package ODL.study.messageSender.entity.channel;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmailChannel extends AbstractChannel implements Channel {

    String address;

    public EmailChannel(String address) {
        super(ChannelType.EMAIL);
        this.address = address;
    }

    @Override
    public String getContact() {
        return address;
    }

    @Override
    public String toString() {
        return "EmailChannel [id=" + getId() + "; address=" + getAddress() + "]";
    }

}
