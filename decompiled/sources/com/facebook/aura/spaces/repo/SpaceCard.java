package com.facebook.aura.spaces.repo;

import X.AHD;
import X.AHI;
import X.AbstractC0878AGe;
import X.AbstractC2159Azp;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.json.ClockCardWireActionsKt;
import com.facebook.aura.model.SpaceConstructionStatus;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class SpaceCard extends C06G {
    public static final Companion Companion = new Companion();
    public final String actionUrl;
    public final AHD<String> actions;
    public final SpaceConstructionStatus constructionStatus;
    public final Double favoriteOrder;
    public final Boolean hasServerActions;
    public final String icon;
    public final String id;
    public final String imageUrl;
    public final String imageVersion;
    public final boolean isShared;
    public final AHD<SpaceArticleItem> items;
    public final String message;
    public final CardMetadata metadata;
    public final AHD<String> options;
    public final SpaceCardPriority priority;
    public final String question;
    public final String sharedShortcode;
    public final String spaceId;
    public final AHD<MarketStockItem> stocks;
    public final String subtitle;
    public final String timestamp;
    public final String title;
    public final SpaceCardType type;
    public final String viewShareKey;
    public final String viewShortcode;

    /* loaded from: classes.dex */
    public final class Companion {
        public static /* synthetic */ SpaceCard create$default(Companion companion, SpaceCardType spaceCardType, String str, String str2, SpaceCardPriority spaceCardPriority, String str3, CardMetadata cardMetadata, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                spaceCardPriority = SpaceCardPriority.MEDIUM;
            }
            if ((i & 16) != 0) {
                str3 = null;
            }
            if ((i & 32) != 0) {
                cardMetadata = null;
            }
            return companion.create(spaceCardType, str, str2, spaceCardPriority, str3, cardMetadata);
        }

        public final SpaceCard create(SpaceCardType spaceCardType, String str, String str2, SpaceCardPriority spaceCardPriority, String str3, CardMetadata cardMetadata) {
            boolean zA1b = AnonymousClass004.A1b(spaceCardType, str);
            C7384Etj.A0Y(spaceCardPriority, 3);
            String value = spaceCardType.getValue();
            UUID uuidRandomUUID = UUID.randomUUID();
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return new SpaceCard(AnonymousClass006.A0y(uuidRandomUUID, "-", sb), spaceCardType, str, null, str2, null, spaceCardPriority, str3, null, null, null, null, null, null, null, null, AHI.A01, cardMetadata, null, zA1b, null, null, null, null, null);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpaceCard) {
                SpaceCard spaceCard = (SpaceCard) obj;
                if (!C7384Etj.areEqual(this.id, spaceCard.id) || this.type != spaceCard.type || !C7384Etj.areEqual(this.title, spaceCard.title) || !C7384Etj.areEqual(this.spaceId, spaceCard.spaceId) || !C7384Etj.areEqual(this.message, spaceCard.message) || !C7384Etj.areEqual(this.subtitle, spaceCard.subtitle) || this.priority != spaceCard.priority || !C7384Etj.areEqual(this.imageUrl, spaceCard.imageUrl) || !C7384Etj.areEqual(this.imageVersion, spaceCard.imageVersion) || !C7384Etj.areEqual(this.actionUrl, spaceCard.actionUrl) || !C7384Etj.areEqual(this.timestamp, spaceCard.timestamp) || !C7384Etj.areEqual(this.icon, spaceCard.icon) || !C7384Etj.areEqual(this.question, spaceCard.question) || !C7384Etj.areEqual(this.options, spaceCard.options) || !C7384Etj.areEqual(this.stocks, spaceCard.stocks) || !C7384Etj.areEqual(this.items, spaceCard.items) || !C7384Etj.areEqual(this.actions, spaceCard.actions) || !C7384Etj.areEqual(this.metadata, spaceCard.metadata) || !C7384Etj.areEqual(this.favoriteOrder, spaceCard.favoriteOrder) || this.isShared != spaceCard.isShared || !C7384Etj.areEqual(this.sharedShortcode, spaceCard.sharedShortcode) || !C7384Etj.areEqual(this.viewShortcode, spaceCard.viewShortcode) || !C7384Etj.areEqual(this.viewShareKey, spaceCard.viewShareKey) || this.constructionStatus != spaceCard.constructionStatus || !C7384Etj.areEqual(this.hasServerActions, spaceCard.hasServerActions)) {
                }
            }
            return false;
        }
        return true;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SpaceConstructionStatus.values().length];
            try {
                AnonymousClass005.A0v(SpaceConstructionStatus.CONSTRUCTING, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(SpaceConstructionStatus.UPDATING, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(SpaceConstructionStatus.SUCCEEDED, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(SpaceConstructionStatus.FAILED, iArr, 4);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass005.A0v(SpaceConstructionStatus.INTERRUPTED, iArr, 5);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SpaceCardType.values().length];
            try {
                AnonymousClass005.A0v(SpaceCardType.BRIEFING, iArr2, 1);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass005.A0v(SpaceCardType.ARTICLES, iArr2, 2);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass005.A0v(SpaceCardType.HERO_ARTICLE, iArr2, 3);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass005.A0v(SpaceCardType.VIDEO, iArr2, 4);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass005.A0v(SpaceCardType.MARKETS, iArr2, 5);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass002.A18(SpaceCardType.MUSIC, iArr2);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass006.A1G(SpaceCardType.WEATHER, iArr2);
            } catch (NoSuchFieldError unused12) {
            }
            try {
                AnonymousClass006.A1H(SpaceCardType.REMINDER, iArr2);
            } catch (NoSuchFieldError unused13) {
            }
            try {
                AnonymousClass006.A1I(SpaceCardType.FLIGHT_DARK, iArr2);
            } catch (NoSuchFieldError unused14) {
            }
            try {
                AnonymousClass006.A1J(SpaceCardType.SUGGESTIONS, iArr2);
            } catch (NoSuchFieldError unused15) {
            }
            try {
                AnonymousClass006.A1K(SpaceCardType.INSIGHT, iArr2);
            } catch (NoSuchFieldError unused16) {
            }
            try {
                AnonymousClass006.A1L(SpaceCardType.META_AI_PULSE, iArr2);
            } catch (NoSuchFieldError unused17) {
            }
            try {
                C60Q.A1C(SpaceCardType.DECISION, iArr2);
            } catch (NoSuchFieldError unused18) {
            }
            try {
                C60Q.A1D(SpaceCardType.HTML_WEB_VIEW, iArr2);
            } catch (NoSuchFieldError unused19) {
            }
            try {
                C60Q.A1E(SpaceCardType.UNKNOWN, iArr2);
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.actionUrl;
    }

    public final String component11() {
        return this.timestamp;
    }

    public final String component12() {
        return this.icon;
    }

    public final String component13() {
        return this.question;
    }

    public final AHD<String> component14() {
        return this.options;
    }

    public final AHD<MarketStockItem> component15() {
        return this.stocks;
    }

    public final AHD<SpaceArticleItem> component16() {
        return this.items;
    }

    public final AHD<String> component17() {
        return this.actions;
    }

    public final CardMetadata component18() {
        return this.metadata;
    }

    public final Double component19() {
        return this.favoriteOrder;
    }

    public final SpaceCardType component2() {
        return this.type;
    }

    public final boolean component20() {
        return this.isShared;
    }

    public final String component21() {
        return this.sharedShortcode;
    }

    public final String component22() {
        return this.viewShortcode;
    }

    public final String component23() {
        return this.viewShareKey;
    }

    public final SpaceConstructionStatus component24() {
        return this.constructionStatus;
    }

    public final Boolean component25() {
        return this.hasServerActions;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.spaceId;
    }

    public final String component5() {
        return this.message;
    }

    public final String component6() {
        return this.subtitle;
    }

    public final SpaceCardPriority component7() {
        return this.priority;
    }

    public final String component8() {
        return this.imageUrl;
    }

    public final String component9() {
        return this.imageVersion;
    }

    public final String getActionUrl() {
        return this.actionUrl;
    }

    public final AHD<String> getActions() {
        return this.actions;
    }

    public final AHD<SpaceArticleItem> getArticleItems() {
        return this.items;
    }

    public final SpaceConstructionStatus getConstructionStatus() {
        return this.constructionStatus;
    }

    public final Date getDate() {
        String str = this.timestamp;
        if (str == null || C7BY.A0j(str)) {
            return null;
        }
        try {
            try {
                return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US).parse(str);
            } catch (Exception unused) {
                return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US).parse(str);
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public final String getEffectiveActionUrl() {
        AHD<String> ahd;
        String str = this.actionUrl;
        if (str != null && str.length() != 0) {
            return str;
        }
        CardMetadata cardMetadata = this.metadata;
        if (cardMetadata == null || (ahd = cardMetadata.sources) == null) {
            return null;
        }
        return (String) AbstractC0878AGe.A0G(ahd);
    }

    public final Double getFavoriteOrder() {
        return this.favoriteOrder;
    }

    public final Boolean getHasServerActions() {
        return this.hasServerActions;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getImageVersion() {
        return this.imageVersion;
    }

    public final AHD<SpaceArticleItem> getItems() {
        return this.items;
    }

    public final String getMessage() {
        return this.message;
    }

    public final CardMetadata getMetadata() {
        return this.metadata;
    }

    public final AHD<String> getOptions() {
        return this.options;
    }

    public final SpaceCardPriority getPriority() {
        return this.priority;
    }

    public final String getQuestion() {
        return this.question;
    }

    public final String getSharedShortcode() {
        return this.sharedShortcode;
    }

    public final String getSpaceId() {
        return this.spaceId;
    }

    public final AHD<MarketStockItem> getStockItems() {
        AHD<MarketStockItem> ahd = this.stocks;
        if (ahd != null) {
            return ahd;
        }
        CardMetadata cardMetadata = this.metadata;
        if (cardMetadata != null) {
            return cardMetadata.marketItems;
        }
        return null;
    }

    public final AHD<MarketStockItem> getStocks() {
        return this.stocks;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final String getTitle() {
        return this.title;
    }

    public final SpaceCardType getType() {
        return this.type;
    }

    public final String getTypeLabel() {
        SpaceCardType spaceCardType = this.type;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (spaceCardType.ordinal()) {
            case 0:
                return "BRIEFING";
            case 1:
                return "ARTICLES";
            case 2:
                return "ARTICLE";
            case 3:
                return "VIDEO";
            case 4:
                return "MARKETS";
            case 5:
                return "MUSIC";
            case 6:
                return "WEATHER";
            case 7:
                return "REMINDER";
            case 8:
                return "FLIGHT";
            case 9:
                return "SUGGESTIONS";
            case 10:
                return "INSIGHT";
            case 11:
                return "META AI PULSE";
            case 12:
                return "DECISION";
            case 13:
                return "WEB VIEW";
            case 14:
                return AbstractC2159Azp.A0z(spaceCardType.getValue().toUpperCase(Locale.ROOT), "-", InviteCodeScratcherKt.CODE_SEPARATOR);
            default:
                throw C3cG.A0q();
        }
    }

    public final String getViewShareKey() {
        return this.viewShareKey;
    }

    public final String getViewShortcode() {
        return this.viewShortcode;
    }

    public final boolean hasDismissAction() {
        return this.actions.contains(ClockCardWireActionsKt.CLOCK_ACTION_DISMISS);
    }

    public int hashCode() {
        return ((((((((C0KA.A01((((AnonymousClass005.A0F(this.actions, (((((((((((((((((AnonymousClass005.A0F(this.priority, (((((AnonymousClass005.A0I(this.title, AnonymousClass005.A0F(this.type, AnonymousClass001.A0G(this.id))) + AnonymousClass006.A0G(this.spaceId)) * 31) + AnonymousClass006.A0G(this.message)) * 31) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0G(this.imageUrl)) * 31) + AnonymousClass006.A0G(this.imageVersion)) * 31) + AnonymousClass006.A0G(this.actionUrl)) * 31) + AnonymousClass006.A0G(this.timestamp)) * 31) + AnonymousClass006.A0G(this.icon)) * 31) + AnonymousClass006.A0G(this.question)) * 31) + AnonymousClass006.A0D(this.options)) * 31) + AnonymousClass006.A0D(this.stocks)) * 31) + AnonymousClass006.A0D(this.items)) * 31) + AnonymousClass006.A0D(this.metadata)) * 31) + AnonymousClass006.A0D(this.favoriteOrder)) * 31, this.isShared) + AnonymousClass006.A0G(this.sharedShortcode)) * 31) + AnonymousClass006.A0G(this.viewShortcode)) * 31) + AnonymousClass006.A0G(this.viewShareKey)) * 31) + AnonymousClass006.A0D(this.constructionStatus)) * 31) + C3cH.A02(this.hasServerActions);
    }

    public final boolean isBlockingSpaceSurface() {
        return AnonymousClass002.A1Z(this.constructionStatus, SpaceConstructionStatus.CONSTRUCTING);
    }

    public final boolean isInProgress() {
        SpaceConstructionStatus spaceConstructionStatus = this.constructionStatus;
        if (spaceConstructionStatus != null) {
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int iOrdinal = spaceConstructionStatus.ordinal();
            if (iOrdinal != -1) {
                if (iOrdinal == 0 || iOrdinal == 1) {
                    return true;
                }
                if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
                    throw C3cG.A0q();
                }
            }
        }
        return false;
    }

    public final boolean isShared() {
        return this.isShared;
    }

    public SpaceCard(String str, SpaceCardType spaceCardType, String str2, String str3, String str4, String str5, SpaceCardPriority spaceCardPriority, String str6, String str7, String str8, String str9, String str10, String str11, AHD<String> ahd, AHD<MarketStockItem> ahd2, AHD<SpaceArticleItem> ahd3, AHD<String> ahd4, CardMetadata cardMetadata, Double d, boolean z, String str12, String str13, String str14, SpaceConstructionStatus spaceConstructionStatus, Boolean bool) {
        AnonymousClass005.A0x(str, spaceCardType, str2);
        C7384Etj.A0Y(spaceCardPriority, 6);
        C7384Etj.A0Y(ahd4, 16);
        this.id = str;
        this.type = spaceCardType;
        this.title = str2;
        this.spaceId = str3;
        this.message = str4;
        this.subtitle = str5;
        this.priority = spaceCardPriority;
        this.imageUrl = str6;
        this.imageVersion = str7;
        this.actionUrl = str8;
        this.timestamp = str9;
        this.icon = str10;
        this.question = str11;
        this.options = ahd;
        this.stocks = ahd2;
        this.items = ahd3;
        this.actions = ahd4;
        this.metadata = cardMetadata;
        this.favoriteOrder = d;
        this.isShared = z;
        this.sharedShortcode = str12;
        this.viewShortcode = str13;
        this.viewShareKey = str14;
        this.constructionStatus = spaceConstructionStatus;
        this.hasServerActions = bool;
    }

    public final SpaceCard copy(String str, SpaceCardType spaceCardType, String str2, String str3, String str4, String str5, SpaceCardPriority spaceCardPriority, String str6, String str7, String str8, String str9, String str10, String str11, AHD<String> ahd, AHD<MarketStockItem> ahd2, AHD<SpaceArticleItem> ahd3, AHD<String> ahd4, CardMetadata cardMetadata, Double d, boolean z, String str12, String str13, String str14, SpaceConstructionStatus spaceConstructionStatus, Boolean bool) {
        AnonymousClass005.A0x(str, spaceCardType, str2);
        C7384Etj.A0Y(spaceCardPriority, 6);
        C7384Etj.A0Y(ahd4, 16);
        return new SpaceCard(str, spaceCardType, str2, str3, str4, str5, spaceCardPriority, str6, str7, str8, str9, str10, str11, ahd, ahd2, ahd3, ahd4, cardMetadata, d, z, str12, str13, str14, spaceConstructionStatus, bool);
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ SpaceCard copy$default(SpaceCard spaceCard, String str, SpaceCardType spaceCardType, String str2, String str3, String str4, String str5, SpaceCardPriority spaceCardPriority, String str6, String str7, String str8, String str9, String str10, String str11, AHD ahd, AHD ahd2, AHD ahd3, AHD ahd4, CardMetadata cardMetadata, Double d, boolean z, String str12, String str13, String str14, SpaceConstructionStatus spaceConstructionStatus, Boolean bool, int i, Object obj) {
        String str15 = str;
        SpaceCardType spaceCardType2 = spaceCardType;
        String str16 = str2;
        String str17 = str3;
        String str18 = str4;
        String str19 = str5;
        SpaceCardPriority spaceCardPriority2 = spaceCardPriority;
        String str20 = str6;
        String str21 = str7;
        String str22 = str8;
        String str23 = str9;
        String str24 = str10;
        String str25 = str11;
        AHD ahd5 = ahd;
        AHD ahd6 = ahd2;
        AHD ahd7 = ahd3;
        boolean z2 = z;
        String str26 = str12;
        String str27 = str13;
        String str28 = str14;
        SpaceConstructionStatus spaceConstructionStatus2 = spaceConstructionStatus;
        AHD ahd8 = ahd4;
        CardMetadata cardMetadata2 = cardMetadata;
        Double d2 = d;
        Boolean bool2 = bool;
        if ((i & 1) != 0) {
            str15 = spaceCard.id;
        }
        if ((i & 2) != 0) {
            spaceCardType2 = spaceCard.type;
        }
        if ((i & 4) != 0) {
            str16 = spaceCard.title;
        }
        if ((i & 8) != 0) {
            str17 = spaceCard.spaceId;
        }
        if ((i & 16) != 0) {
            str18 = spaceCard.message;
        }
        if ((i & 32) != 0) {
            str19 = spaceCard.subtitle;
        }
        if ((i & 64) != 0) {
            spaceCardPriority2 = spaceCard.priority;
        }
        if ((i & 128) != 0) {
            str20 = spaceCard.imageUrl;
        }
        if ((i & 256) != 0) {
            str21 = spaceCard.imageVersion;
        }
        if ((i & 512) != 0) {
            str22 = spaceCard.actionUrl;
        }
        if ((i & 1024) != 0) {
            str23 = spaceCard.timestamp;
        }
        if ((i & 2048) != 0) {
            str24 = spaceCard.icon;
        }
        if ((i & 4096) != 0) {
            str25 = spaceCard.question;
        }
        if ((i & 8192) != 0) {
            ahd5 = spaceCard.options;
        }
        if ((i & 16384) != 0) {
            ahd6 = spaceCard.stocks;
        }
        if ((i & 32768) != 0) {
            ahd7 = spaceCard.items;
        }
        if ((i & 65536) != 0) {
            ahd8 = spaceCard.actions;
        }
        if ((i & 131072) != 0) {
            cardMetadata2 = spaceCard.metadata;
        }
        if ((i & 262144) != 0) {
            d2 = spaceCard.favoriteOrder;
        }
        if ((i & 524288) != 0) {
            z2 = spaceCard.isShared;
        }
        if ((i & 1048576) != 0) {
            str26 = spaceCard.sharedShortcode;
        }
        if ((i & 2097152) != 0) {
            str27 = spaceCard.viewShortcode;
        }
        if ((i & 4194304) != 0) {
            str28 = spaceCard.viewShareKey;
        }
        if ((i & 8388608) != 0) {
            spaceConstructionStatus2 = spaceCard.constructionStatus;
        }
        if ((i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0) {
            bool2 = spaceCard.hasServerActions;
        }
        String str29 = str25;
        return spaceCard.copy(str15, spaceCardType2, str16, str17, str18, str19, spaceCardPriority2, str20, str21, str22, str23, str24, str29, ahd5, ahd6, ahd7, ahd8, cardMetadata2, d2, z2, str26, str27, str28, spaceConstructionStatus2, bool2);
    }

    public /* synthetic */ SpaceCard(String str, SpaceCardType spaceCardType, String str2, String str3, String str4, String str5, SpaceCardPriority spaceCardPriority, String str6, String str7, String str8, String str9, String str10, String str11, AHD ahd, AHD ahd2, AHD ahd3, AHD ahd4, CardMetadata cardMetadata, Double d, boolean z, String str12, String str13, String str14, SpaceConstructionStatus spaceConstructionStatus, Boolean bool, int i, C06H c06h) {
        this(str, spaceCardType, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? SpaceCardPriority.MEDIUM : spaceCardPriority, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : ahd, (i & 16384) != 0 ? null : ahd2, (32768 & i) != 0 ? null : ahd3, (65536 & i) != 0 ? AHI.A01 : ahd4, (131072 & i) != 0 ? null : cardMetadata, (262144 & i) != 0 ? null : d, C3cH.A1L(524288, i, z), (1048576 & i) != 0 ? null : str12, (2097152 & i) != 0 ? null : str13, (4194304 & i) != 0 ? null : str14, (8388608 & i) != 0 ? null : spaceConstructionStatus, (i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0 ? null : bool);
    }
}
