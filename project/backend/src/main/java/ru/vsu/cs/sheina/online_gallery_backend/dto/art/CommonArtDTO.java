package ru.vsu.cs.sheina.online_gallery_backend.dto.art;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigInteger;
import java.util.UUID;

@Data
@RequiredArgsConstructor
public class CommonArtDTO {

    Integer artId;

    String name;

    String photoUrl;

    BigInteger price;

    Boolean isPrivate;

    UUID artistId;

    String artistName;

    String avatarUrl;

    UUID customerId;

    String customerName;
}