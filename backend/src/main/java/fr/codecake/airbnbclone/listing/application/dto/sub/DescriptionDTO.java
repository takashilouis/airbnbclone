package fr.louiskhanh.airbnbclone.listing.application.dto.sub;

import fr.louiskhanh.airbnbclone.listing.application.dto.vo.DescriptionVO;
import fr.louiskhanh.airbnbclone.listing.application.dto.vo.TitleVO;
import jakarta.validation.constraints.NotNull;

public record DescriptionDTO(
        @NotNull TitleVO title,
        @NotNull DescriptionVO description
        ) {
}
