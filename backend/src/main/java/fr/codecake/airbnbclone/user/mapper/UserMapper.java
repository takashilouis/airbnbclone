package fr.louiskhanh.airbnbclone.user.mapper;

import fr.louiskhanh.airbnbclone.user.application.dto.ReadUserDTO;
import fr.louiskhanh.airbnbclone.user.domain.Authority;
import fr.louiskhanh.airbnbclone.user.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO readUserDTOToUser(User user);

    default String mapAuthoritiesToString(Authority authority) {
        return authority.getName();
    }

}
