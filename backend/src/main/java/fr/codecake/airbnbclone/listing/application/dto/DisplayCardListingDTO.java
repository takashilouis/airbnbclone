package fr.louiskhanh.airbnbclone.listing.application.dto;

import fr.louiskhanh.airbnbclone.listing.application.dto.sub.PictureDTO;
import fr.louiskhanh.airbnbclone.listing.application.dto.vo.PriceVO;
import fr.louiskhanh.airbnbclone.listing.domain.BookingCategory;

import java.util.UUID;

public record DisplayCardListingDTO(PriceVO price,
                                    String location,
                                    PictureDTO cover,
                                    BookingCategory bookingCategory,
                                    UUID publicId) {
}
