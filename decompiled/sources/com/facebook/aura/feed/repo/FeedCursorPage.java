package com.facebook.aura.feed.repo;

import X.AHD;
import X.AHI;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class FeedCursorPage extends C06G {
    public static final int $stable = 0;
    public final String nextCursor;
    public final String previousCursor;
    public final String promptId;
    public final AHD<FeedUnit> units;

    public final FeedCursorPage copy(String str, AHD<? extends FeedUnit> ahd, String str2, String str3) {
        C7384Etj.A0Y(ahd, 1);
        return new FeedCursorPage(str, ahd, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedCursorPage) {
                FeedCursorPage feedCursorPage = (FeedCursorPage) obj;
                if (!C7384Etj.areEqual(this.promptId, feedCursorPage.promptId) || !C7384Etj.areEqual(this.units, feedCursorPage.units) || !C7384Etj.areEqual(this.nextCursor, feedCursorPage.nextCursor) || !C7384Etj.areEqual(this.previousCursor, feedCursorPage.previousCursor)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ FeedCursorPage(String str, AHD ahd, String str2, String str3, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? AHI.A01 : ahd, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ FeedCursorPage copy$default(FeedCursorPage feedCursorPage, String str, AHD ahd, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedCursorPage.promptId;
        }
        if ((i & 2) != 0) {
            ahd = feedCursorPage.units;
        }
        if ((i & 4) != 0) {
            str2 = feedCursorPage.nextCursor;
        }
        if ((i & 8) != 0) {
            str3 = feedCursorPage.previousCursor;
        }
        C7384Etj.A0Y(ahd, 1);
        return new FeedCursorPage(str, ahd, str2, str3);
    }

    public final String component1() {
        return this.promptId;
    }

    public final AHD<FeedUnit> component2() {
        return this.units;
    }

    public final String component3() {
        return this.nextCursor;
    }

    public final String component4() {
        return this.previousCursor;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final String getPreviousCursor() {
        return this.previousCursor;
    }

    public final String getPromptId() {
        return this.promptId;
    }

    public final AHD<FeedUnit> getUnits() {
        return this.units;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.units, AnonymousClass006.A0G(this.promptId) * 31) + AnonymousClass006.A0G(this.nextCursor)) * 31) + AnonymousClass005.A0H(this.previousCursor);
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FeedCursorPage(String str, AHD<? extends FeedUnit> ahd, String str2, String str3) {
        C7384Etj.A0Y(ahd, 1);
        this.promptId = str;
        this.units = ahd;
        this.nextCursor = str2;
        this.previousCursor = str3;
    }
}
