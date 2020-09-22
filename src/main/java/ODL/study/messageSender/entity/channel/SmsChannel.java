package ODL.study.messageSender.entity.channel;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SmsChannel extends AbstractChannel implements Channel {

    String telephone;

    public SmsChannel(final String telephone) {
        super(ChannelType.SMS);
        this.telephone = telephone;
    }

    @Override
    public String getContact() {
        return telephone;
    }

    @Override
    public String toString() {
        return "SmsChannel [id=" + getId() + "; telephone=" + getTelephone() + "]";
    }

}