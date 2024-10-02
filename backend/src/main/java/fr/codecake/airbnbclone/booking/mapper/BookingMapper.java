package fr.louiskhanh.airbnbclone.booking.mapper;

import fr.louiskhanh.airbnbclone.booking.application.dto.BookedDateDTO;
import fr.louiskhanh.airbnbclone.booking.application.dto.NewBookingDTO;
import fr.louiskhanh.airbnbclone.booking.domain.Booking;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookingMapper {

    Booking newBookingToBooking(NewBookingDTO newBookingDTO);

    BookedDateDTO bookingToCheckAvailability(Booking booking);
}
