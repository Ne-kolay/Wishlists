package com.example.Wishlists.Wishlist;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

@Repository
public class WishlistRepository {

    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<Wishlist> rowMapper = new BeanPropertyRowMapper<>(Wishlist.class);

    public WishlistRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Wishlist saveWishlist(Wishlist wishlist) {
        if (wishlist.getId() == null) {
            String sql = "INSERT INTO wishlists (name, description, user_id, privacy_level) VALUES(?, ?, ?, ?)";
            KeyHolder keyHolder = new GeneratedKeyHolder();

            jdbcTemplate.update(connection -> {
                PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, wishlist.getName());
                ps.setString(2, wishlist.getDescription());
                ps.setLong(3, wishlist.getUserId());
                ps.setString(4, wishlist.getPrivacyLevel().name());
                return ps;
            }, keyHolder);

            if (keyHolder.getKey() != null) { wishlist.setId(keyHolder.getKey().longValue()); }

        } else {
            String sql = "UPDATE wishlists SET name = ?, description = ?, user_id = ?, privacy_level = ? WHERE id = ?";
            jdbcTemplate.update(sql, wishlist.getName(), wishlist.getDescription(),
                    wishlist.getUserId(), wishlist.getPrivacyLevel().name(), wishlist.getId());
        }
        return wishlist;
    }
}
