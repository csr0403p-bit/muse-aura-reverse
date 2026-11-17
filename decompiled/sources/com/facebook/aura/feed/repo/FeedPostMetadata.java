package com.facebook.aura.feed.repo;

import X.AHD;
import X.AHI;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import X.C7BY;

/* loaded from: classes.dex */
public final class FeedPostMetadata extends C06G {
    public static final int $stable = 0;
    public final AHD<FeedPostMetadataDetail> details;
    public final String explanation;
    public final Long generatedAtMs;

    public FeedPostMetadata(Long l, String str, AHD<FeedPostMetadataDetail> ahd) {
        C7384Etj.A0Y(ahd, 2);
        this.generatedAtMs = l;
        this.explanation = str;
        this.details = ahd;
    }

    public final FeedPostMetadata copy(Long l, String str, AHD<FeedPostMetadataDetail> ahd) {
        C7384Etj.A0Y(ahd, 2);
        return new FeedPostMetadata(l, str, ahd);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedPostMetadata) {
                FeedPostMetadata feedPostMetadata = (FeedPostMetadata) obj;
                if (!C7384Etj.areEqual(this.generatedAtMs, feedPostMetadata.generatedAtMs) || !C7384Etj.areEqual(this.explanation, feedPostMetadata.explanation) || !C7384Etj.areEqual(this.details, feedPostMetadata.details)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeedPostMetadata copy$default(FeedPostMetadata feedPostMetadata, Long l, String str, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            l = feedPostMetadata.generatedAtMs;
        }
        if ((i & 2) != 0) {
            str = feedPostMetadata.explanation;
        }
        if ((i & 4) != 0) {
            ahd = feedPostMetadata.details;
        }
        return feedPostMetadata.copy(l, str, ahd);
    }

    public final Long component1() {
        return this.generatedAtMs;
    }

    public final String component2() {
        return this.explanation;
    }

    public final AHD<FeedPostMetadataDetail> component3() {
        return this.details;
    }

    public final AHD<FeedPostMetadataDetail> getDetails() {
        return this.details;
    }

    public final String getExplanation() {
        return this.explanation;
    }

    public final Long getGeneratedAtMs() {
        return this.generatedAtMs;
    }

    public final boolean getHasContent() {
        String str;
        return (this.generatedAtMs == null && ((str = this.explanation) == null || C7BY.A0j(str)) && this.details.isEmpty()) ? false : true;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.details, ((AnonymousClass006.A0D(this.generatedAtMs) * 31) + AnonymousClass005.A0H(this.explanation)) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FeedPostMetadata(Long l, String str, AHD ahd, int i, C06H c06h) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? AHI.A01 : ahd);
    }

    public FeedPostMetadata() {
        this(null, null, AHI.A01);
    }
}
