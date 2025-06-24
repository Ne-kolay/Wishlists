package com.example.Wishlists.Wishlist;

import java.time.LocalDateTime;

public class Wishlist {

    private Long id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime lastUpdatedAt;
    private String shareableLinkToken;
    private PrivacyLevel privacyLevel;

    //reference to owner
    private Long userId;

    //empty constructor
    public Wishlist() {};

    //full constructor
    public Wishlist(Long id, String name, String description, LocalDateTime createdAt,
                    LocalDateTime lastUpdatedAt, String shareableLinkToken,
                    PrivacyLevel privacyLevel, Long userId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.lastUpdatedAt = lastUpdatedAt;
        this.shareableLinkToken = shareableLinkToken;
        this.userId = userId;
        this.privacyLevel = privacyLevel;
    }

    //partial constructor
    public Wishlist(String name, String description, Long userId, PrivacyLevel privacyLevel) {
        this.name = name;
        this.description = description;
        this.userId = userId;
        this.privacyLevel = privacyLevel;
    }

    //get&set
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getLastUpdatedAt() { return lastUpdatedAt; }
    public void setLastUpdatedAt(LocalDateTime lastUpdatedAt) { this.lastUpdatedAt = lastUpdatedAt; }

    public String getShareableLinkToken() { return shareableLinkToken; }
    public void setShareableLinkToken(String shareableLinkToken) { this.shareableLinkToken = shareableLinkToken; }

    public PrivacyLevel getPrivacyLevel() { return privacyLevel; }
    public void setPrivacyLevel(PrivacyLevel privacyLevel) { this.privacyLevel = privacyLevel; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
}
