package ODL.study.messageSender.entity.channel;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FacebookChannel extends AbstractChannel implements Channel {

    String userID;

    public FacebookChannel(final String userID) {
        super(ChannelType.FACEBOOK);
        this.userID = userID;
    }

    @Override
    public String getContact() {
        return userID;
    }

    @Override
    public String toString() {
        return "FacebookChannel [id=" + getId() + "; userID=" + getUserID() + "]";
    }

}
