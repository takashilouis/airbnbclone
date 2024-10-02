package fr.louiskhanh.airbnbclone.infrastructure.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories({"fr.louiskhanh.airbnbclone.user.repository",
        "fr.louiskhanh.airbnbclone.listing.repository",
        "fr.louiskhanh.airbnbclone.booking.repository"})
@EnableTransactionManagement
@EnableJpaAuditing
public class DatabaseConfiguration {
}
