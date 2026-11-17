package com.facebook.aura.spaces.repo;

import X.AHD;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;

/* loaded from: classes3.dex */
public final class CardMetadata extends C06G {
    public final String airline;
    public final String arrivalGate;
    public final String arrivalTerminal;
    public final String arriveCode;
    public final String arriveStatus;
    public final String arriveTime;
    public final String bagClaim;
    public final String departCode;
    public final String departStatus;
    public final String departTime;
    public final String duration;
    public final String expiresAt;
    public final String flightNumber;
    public final Double flightProgress;
    public final String header;
    public final String htmlContent;
    public final Integer htmlHeight;
    public final AHD<MarketStockItem> marketItems;
    public final AHD<CardMediaItem> media;
    public final String platform;
    public final String primaryAction;
    public final String source;
    public final String sourceUrl;
    public final AHD<String> sources;
    public final String state;
    public final String status;
    public final AHD<Suggestion> suggestions;
    public final String summary;
    public final Long updatedAtMs;
    public final String videoUrl;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CardMetadata) {
                CardMetadata cardMetadata = (CardMetadata) obj;
                if (!C7384Etj.areEqual(this.expiresAt, cardMetadata.expiresAt) || !C7384Etj.areEqual(this.state, cardMetadata.state) || !C7384Etj.areEqual(this.header, cardMetadata.header) || !C7384Etj.areEqual(this.primaryAction, cardMetadata.primaryAction) || !C7384Etj.areEqual(this.summary, cardMetadata.summary) || !C7384Etj.areEqual(this.source, cardMetadata.source) || !C7384Etj.areEqual(this.sources, cardMetadata.sources) || !C7384Etj.areEqual(this.platform, cardMetadata.platform) || !C7384Etj.areEqual(this.airline, cardMetadata.airline) || !C7384Etj.areEqual(this.flightNumber, cardMetadata.flightNumber) || !C7384Etj.areEqual(this.status, cardMetadata.status) || !C7384Etj.areEqual(this.departCode, cardMetadata.departCode) || !C7384Etj.areEqual(this.departTime, cardMetadata.departTime) || !C7384Etj.areEqual(this.arriveCode, cardMetadata.arriveCode) || !C7384Etj.areEqual(this.arriveTime, cardMetadata.arriveTime) || !C7384Etj.areEqual(this.arrivalTerminal, cardMetadata.arrivalTerminal) || !C7384Etj.areEqual(this.arrivalGate, cardMetadata.arrivalGate) || !C7384Etj.areEqual(this.bagClaim, cardMetadata.bagClaim) || !C7384Etj.areEqual(this.duration, cardMetadata.duration) || !C7384Etj.areEqual(this.flightProgress, cardMetadata.flightProgress) || !C7384Etj.areEqual(this.departStatus, cardMetadata.departStatus) || !C7384Etj.areEqual(this.arriveStatus, cardMetadata.arriveStatus) || !C7384Etj.areEqual(this.marketItems, cardMetadata.marketItems) || !C7384Etj.areEqual(this.suggestions, cardMetadata.suggestions) || !C7384Etj.areEqual(this.videoUrl, cardMetadata.videoUrl) || !C7384Etj.areEqual(this.media, cardMetadata.media) || !C7384Etj.areEqual(this.htmlContent, cardMetadata.htmlContent) || !C7384Etj.areEqual(this.sourceUrl, cardMetadata.sourceUrl) || !C7384Etj.areEqual(this.htmlHeight, cardMetadata.htmlHeight) || !C7384Etj.areEqual(this.updatedAtMs, cardMetadata.updatedAtMs)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.expiresAt;
    }

    public final String component10() {
        return this.flightNumber;
    }

    public final String component11() {
        return this.status;
    }

    public final String component12() {
        return this.departCode;
    }

    public final String component13() {
        return this.departTime;
    }

    public final String component14() {
        return this.arriveCode;
    }

    public final String component15() {
        return this.arriveTime;
    }

    public final String component16() {
        return this.arrivalTerminal;
    }

    public final String component17() {
        return this.arrivalGate;
    }

    public final String component18() {
        return this.bagClaim;
    }

    public final String component19() {
        return this.duration;
    }

    public final String component2() {
        return this.state;
    }

    public final Double component20() {
        return this.flightProgress;
    }

    public final String component21() {
        return this.departStatus;
    }

    public final String component22() {
        return this.arriveStatus;
    }

    public final AHD<MarketStockItem> component23() {
        return this.marketItems;
    }

    public final AHD<Suggestion> component24() {
        return this.suggestions;
    }

    public final String component25() {
        return this.videoUrl;
    }

    public final AHD<CardMediaItem> component26() {
        return this.media;
    }

    public final String component27() {
        return this.htmlContent;
    }

    public final String component28() {
        return this.sourceUrl;
    }

    public final Integer component29() {
        return this.htmlHeight;
    }

    public final String component3() {
        return this.header;
    }

    public final Long component30() {
        return this.updatedAtMs;
    }

    public final String component4() {
        return this.primaryAction;
    }

    public final String component5() {
        return this.summary;
    }

    public final String component6() {
        return this.source;
    }

    public final AHD<String> component7() {
        return this.sources;
    }

    public final String component8() {
        return this.platform;
    }

    public final String component9() {
        return this.airline;
    }

    public final CardMetadata copy(String str, String str2, String str3, String str4, String str5, String str6, AHD<String> ahd, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Double d, String str19, String str20, AHD<MarketStockItem> ahd2, AHD<Suggestion> ahd3, String str21, AHD<CardMediaItem> ahd4, String str22, String str23, Integer num, Long l) {
        return new CardMetadata(str, str2, str3, str4, str5, str6, ahd, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, d, str19, str20, ahd2, ahd3, str21, ahd4, str22, str23, num, l);
    }

    public final String getAirline() {
        return this.airline;
    }

    public final String getArrivalGate() {
        return this.arrivalGate;
    }

    public final String getArrivalTerminal() {
        return this.arrivalTerminal;
    }

    public final String getArriveCode() {
        return this.arriveCode;
    }

    public final String getArriveStatus() {
        return this.arriveStatus;
    }

    public final String getArriveTime() {
        return this.arriveTime;
    }

    public final String getBagClaim() {
        return this.bagClaim;
    }

    public final String getDepartCode() {
        return this.departCode;
    }

    public final String getDepartStatus() {
        return this.departStatus;
    }

    public final String getDepartTime() {
        return this.departTime;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getExpiresAt() {
        return this.expiresAt;
    }

    public final String getFlightNumber() {
        return this.flightNumber;
    }

    public final Double getFlightProgress() {
        return this.flightProgress;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getHtmlContent() {
        return this.htmlContent;
    }

    public final Integer getHtmlHeight() {
        return this.htmlHeight;
    }

    public final AHD<MarketStockItem> getMarketItems() {
        return this.marketItems;
    }

    public final AHD<CardMediaItem> getMedia() {
        return this.media;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getPrimaryAction() {
        return this.primaryAction;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getSourceUrl() {
        return this.sourceUrl;
    }

    public final AHD<String> getSources() {
        return this.sources;
    }

    public final String getState() {
        return this.state;
    }

    public final String getStatus() {
        return this.status;
    }

    public final AHD<Suggestion> getSuggestions() {
        return this.suggestions;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final Long getUpdatedAtMs() {
        return this.updatedAtMs;
    }

    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((AnonymousClass006.A0G(this.expiresAt) * 31) + AnonymousClass006.A0G(this.state)) * 31) + AnonymousClass006.A0G(this.header)) * 31) + AnonymousClass006.A0G(this.primaryAction)) * 31) + AnonymousClass006.A0G(this.summary)) * 31) + AnonymousClass006.A0G(this.source)) * 31) + AnonymousClass006.A0D(this.sources)) * 31) + AnonymousClass006.A0G(this.platform)) * 31) + AnonymousClass006.A0G(this.airline)) * 31) + AnonymousClass006.A0G(this.flightNumber)) * 31) + AnonymousClass006.A0G(this.status)) * 31) + AnonymousClass006.A0G(this.departCode)) * 31) + AnonymousClass006.A0G(this.departTime)) * 31) + AnonymousClass006.A0G(this.arriveCode)) * 31) + AnonymousClass006.A0G(this.arriveTime)) * 31) + AnonymousClass006.A0G(this.arrivalTerminal)) * 31) + AnonymousClass006.A0G(this.arrivalGate)) * 31) + AnonymousClass006.A0G(this.bagClaim)) * 31) + AnonymousClass006.A0G(this.duration)) * 31) + AnonymousClass006.A0D(this.flightProgress)) * 31) + AnonymousClass006.A0G(this.departStatus)) * 31) + AnonymousClass006.A0G(this.arriveStatus)) * 31) + AnonymousClass006.A0D(this.marketItems)) * 31) + AnonymousClass006.A0D(this.suggestions)) * 31) + AnonymousClass006.A0G(this.videoUrl)) * 31) + AnonymousClass006.A0D(this.media)) * 31) + AnonymousClass006.A0G(this.htmlContent)) * 31) + AnonymousClass006.A0G(this.sourceUrl)) * 31) + AnonymousClass006.A0D(this.htmlHeight)) * 31) + C3cH.A02(this.updatedAtMs);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CardMetadata(String str, String str2, String str3, String str4, String str5, String str6, AHD ahd, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Double d, String str19, String str20, AHD ahd2, AHD ahd3, String str21, AHD ahd4, String str22, String str23, Integer num, Long l, int i, C06H c06h) {
        this(C3cG.A0e(str, i & 1), C3cG.A0e(str2, i & 2), C3cG.A0e(str3, i & 4), C3cG.A0e(str4, i & 8), C3cG.A0e(str5, i & 16), C3cG.A0e(str6, i & 32), (i & 64) != 0 ? null : ahd, C3cG.A0e(str7, i & 128), C3cG.A0e(str8, i & 256), C3cG.A0e(str9, i & 512), C3cG.A0e(str10, i & 1024), C3cG.A0e(str11, i & 2048), C3cG.A0e(str12, i & 4096), C3cG.A0e(str13, i & 8192), C3cG.A0e(str14, i & 16384), C3cI.A0V(i, 32768, str15), C3cI.A0V(i, 65536, str16), C3cI.A0V(i, 131072, str17), C3cI.A0V(i, 262144, str18), (i & 524288) != 0 ? null : d, C3cI.A0V(i, 1048576, str19), C3cI.A0V(i, 2097152, str20), (i & 4194304) != 0 ? null : ahd2, (i & 8388608) != 0 ? null : ahd3, C3cI.A0V(i, HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES, str21), (i & 33554432) != 0 ? null : ahd4, C3cI.A0V(i, 67108864, str22), C3cI.A0V(i, 134217728, str23), (i & 268435456) != 0 ? null : num, (i & 536870912) != 0 ? null : l);
    }

    public static /* synthetic */ CardMetadata copy$default(CardMetadata cardMetadata, String str, String str2, String str3, String str4, String str5, String str6, AHD ahd, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Double d, String str19, String str20, AHD ahd2, AHD ahd3, String str21, AHD ahd4, String str22, String str23, Integer num, Long l, int i, Object obj) {
        String str24 = str;
        String str25 = str2;
        String str26 = str3;
        String str27 = str4;
        String str28 = str5;
        String str29 = str6;
        AHD ahd5 = ahd;
        String str30 = str7;
        String str31 = str8;
        String str32 = str9;
        String str33 = str10;
        String str34 = str11;
        String str35 = str12;
        String str36 = str13;
        String str37 = str14;
        String str38 = str15;
        AHD ahd6 = ahd4;
        String str39 = str22;
        String str40 = str23;
        Integer num2 = num;
        String str41 = str16;
        String str42 = str17;
        String str43 = str18;
        Double d2 = d;
        String str44 = str19;
        String str45 = str20;
        AHD ahd7 = ahd2;
        AHD ahd8 = ahd3;
        String str46 = str21;
        Long l2 = l;
        if ((i & 1) != 0) {
            str24 = cardMetadata.expiresAt;
        }
        if ((i & 2) != 0) {
            str25 = cardMetadata.state;
        }
        if ((i & 4) != 0) {
            str26 = cardMetadata.header;
        }
        if ((i & 8) != 0) {
            str27 = cardMetadata.primaryAction;
        }
        if ((i & 16) != 0) {
            str28 = cardMetadata.summary;
        }
        if ((i & 32) != 0) {
            str29 = cardMetadata.source;
        }
        if ((i & 64) != 0) {
            ahd5 = cardMetadata.sources;
        }
        if ((i & 128) != 0) {
            str30 = cardMetadata.platform;
        }
        if ((i & 256) != 0) {
            str31 = cardMetadata.airline;
        }
        if ((i & 512) != 0) {
            str32 = cardMetadata.flightNumber;
        }
        if ((i & 1024) != 0) {
            str33 = cardMetadata.status;
        }
        if ((i & 2048) != 0) {
            str34 = cardMetadata.departCode;
        }
        if ((i & 4096) != 0) {
            str35 = cardMetadata.departTime;
        }
        if ((i & 8192) != 0) {
            str36 = cardMetadata.arriveCode;
        }
        if ((i & 16384) != 0) {
            str37 = cardMetadata.arriveTime;
        }
        if ((i & 32768) != 0) {
            str38 = cardMetadata.arrivalTerminal;
        }
        if ((i & 65536) != 0) {
            str41 = cardMetadata.arrivalGate;
        }
        if ((i & 131072) != 0) {
            str42 = cardMetadata.bagClaim;
        }
        if ((i & 262144) != 0) {
            str43 = cardMetadata.duration;
        }
        if ((i & 524288) != 0) {
            d2 = cardMetadata.flightProgress;
        }
        if ((i & 1048576) != 0) {
            str44 = cardMetadata.departStatus;
        }
        if ((i & 2097152) != 0) {
            str45 = cardMetadata.arriveStatus;
        }
        if ((i & 4194304) != 0) {
            ahd7 = cardMetadata.marketItems;
        }
        if ((i & 8388608) != 0) {
            ahd8 = cardMetadata.suggestions;
        }
        if ((i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0) {
            str46 = cardMetadata.videoUrl;
        }
        if ((i & 33554432) != 0) {
            ahd6 = cardMetadata.media;
        }
        if ((i & 67108864) != 0) {
            str39 = cardMetadata.htmlContent;
        }
        if ((i & 134217728) != 0) {
            str40 = cardMetadata.sourceUrl;
        }
        if ((i & 268435456) != 0) {
            num2 = cardMetadata.htmlHeight;
        }
        if ((i & 536870912) != 0) {
            l2 = cardMetadata.updatedAtMs;
        }
        return new CardMetadata(str24, str25, str26, str27, str28, str29, ahd5, str30, str31, str32, str33, str34, str35, str36, str37, str38, str41, str42, str43, d2, str44, str45, ahd7, ahd8, str46, ahd6, str39, str40, num2, l2);
    }

    public CardMetadata(String str, String str2, String str3, String str4, String str5, String str6, AHD<String> ahd, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Double d, String str19, String str20, AHD<MarketStockItem> ahd2, AHD<Suggestion> ahd3, String str21, AHD<CardMediaItem> ahd4, String str22, String str23, Integer num, Long l) {
        this.expiresAt = str;
        this.state = str2;
        this.header = str3;
        this.primaryAction = str4;
        this.summary = str5;
        this.source = str6;
        this.sources = ahd;
        this.platform = str7;
        this.airline = str8;
        this.flightNumber = str9;
        this.status = str10;
        this.departCode = str11;
        this.departTime = str12;
        this.arriveCode = str13;
        this.arriveTime = str14;
        this.arrivalTerminal = str15;
        this.arrivalGate = str16;
        this.bagClaim = str17;
        this.duration = str18;
        this.flightProgress = d;
        this.departStatus = str19;
        this.arriveStatus = str20;
        this.marketItems = ahd2;
        this.suggestions = ahd3;
        this.videoUrl = str21;
        this.media = ahd4;
        this.htmlContent = str22;
        this.sourceUrl = str23;
        this.htmlHeight = num;
        this.updatedAtMs = l;
    }

    public CardMetadata() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }
}
