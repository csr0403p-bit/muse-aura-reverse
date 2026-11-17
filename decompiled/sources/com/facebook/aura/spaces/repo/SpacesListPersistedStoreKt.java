package com.facebook.aura.spaces.repo;

import X.AHI;
import com.facebook.aura.common.url.HatchUrl;

/* loaded from: classes3.dex */
public abstract class SpacesListPersistedStoreKt {
    public static final SpaceCard toDomain(PersistedSpaceCardJson persistedSpaceCardJson) {
        String str;
        HatchUrl.SharedLink sharedLinkViewUrlLink = HatchUrl.INSTANCE.viewUrlLink(persistedSpaceCardJson.source_url);
        String str2 = persistedSpaceCardJson.id;
        String str3 = persistedSpaceCardJson.space_id;
        SpaceCardType spaceCardTypeFromString = SpaceCardType.Companion.fromString(persistedSpaceCardJson.type);
        String str4 = persistedSpaceCardJson.title;
        String str5 = persistedSpaceCardJson.subtitle;
        String str6 = persistedSpaceCardJson.message;
        String str7 = persistedSpaceCardJson.icon;
        String str8 = persistedSpaceCardJson.image_url;
        String str9 = persistedSpaceCardJson.image_version;
        Double d = persistedSpaceCardJson.favorite_order;
        String str10 = persistedSpaceCardJson.source_url;
        String str11 = null;
        CardMetadata cardMetadata = (str10 == null && persistedSpaceCardJson.updated_at_ms == null) ? null : new CardMetadata(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str10, null, persistedSpaceCardJson.updated_at_ms);
        boolean z = persistedSpaceCardJson.is_shared;
        String str12 = persistedSpaceCardJson.shared_shortcode;
        if (sharedLinkViewUrlLink != null) {
            str = sharedLinkViewUrlLink.slug;
            str11 = sharedLinkViewUrlLink.shareKey;
        } else {
            str = null;
        }
        return new SpaceCard(str2, spaceCardTypeFromString, str4, str3, str6, str5, SpaceCardPriority.MEDIUM, str8, str9, null, null, str7, null, null, null, null, AHI.A01, cardMetadata, d, z, str12, str, str11, null, null);
    }

    public static final PersistedSpaceCardJson toPersisted(SpaceCard spaceCard) {
        String str;
        String str2 = spaceCard.id;
        String str3 = spaceCard.spaceId;
        String value = spaceCard.type.getValue();
        String str4 = spaceCard.title;
        String str5 = spaceCard.subtitle;
        String str6 = spaceCard.message;
        String str7 = spaceCard.icon;
        String str8 = spaceCard.imageUrl;
        String str9 = spaceCard.imageVersion;
        Double d = spaceCard.favoriteOrder;
        CardMetadata cardMetadata = spaceCard.metadata;
        Long l = null;
        if (cardMetadata != null) {
            str = cardMetadata.sourceUrl;
            l = cardMetadata.updatedAtMs;
        } else {
            str = null;
        }
        return new PersistedSpaceCardJson(str2, str3, value, str4, str5, str6, str7, str8, str9, d, str, l, spaceCard.isShared, spaceCard.sharedShortcode, null);
    }
}
