package fr.louiskhanh.airbnbclone.listing.repository;

import fr.louiskhanh.airbnbclone.listing.domain.ListingPicture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingPictureRepository extends JpaRepository<ListingPicture, Long> {
}
