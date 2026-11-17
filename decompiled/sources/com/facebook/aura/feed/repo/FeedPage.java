package com.facebook.aura.feed.repo;

import X.AHD;
import X.AHI;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class FeedPage extends C06G {
    public static final int $stable = 0;
    public final String promptId;
    public final AHD<FeedUnit> units;

    /* JADX WARN: Multi-variable type inference failed */
    public FeedPage(String str, AHD<? extends FeedUnit> ahd) {
        C7384Etj.A0Y(ahd, 1);
        this.promptId = str;
        this.units = ahd;
    }

    public final FeedPage copy(String str, AHD<? extends FeedUnit> ahd) {
        C7384Etj.A0Y(ahd, 1);
        return new FeedPage(str, ahd);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedPage) {
                FeedPage feedPage = (FeedPage) obj;
                if (!C7384Etj.areEqual(this.promptId, feedPage.promptId) || !C7384Etj.areEqual(this.units, feedPage.units)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FeedPage copy$default(FeedPage feedPage, String str, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedPage.promptId;
        }
        if ((i & 2) != 0) {
            ahd = feedPage.units;
        }
        C7384Etj.A0Y(ahd, 1);
        return new FeedPage(str, ahd);
    }

    public final String component1() {
        return this.promptId;
    }

    public final AHD<FeedUnit> component2() {
        return this.units;
    }

    public final String getPromptId() {
        return this.promptId;
    }

    public final AHD<FeedUnit> getUnits() {
        return this.units;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.units, AnonymousClass006.A0G(this.promptId) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FeedPage(String str, AHD ahd, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? AHI.A01 : ahd);
    }
}
