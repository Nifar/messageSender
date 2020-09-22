package ODL.study.messageSender.entity.channel;

import ODL.study.messageSender.entity.AbstractEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AbstractChannel extends AbstractEntity {

    ChannelType type;

}
