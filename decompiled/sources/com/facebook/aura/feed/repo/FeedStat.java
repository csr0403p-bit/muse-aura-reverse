package com.facebook.aura.feed.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class FeedStat extends C06G {
    public static final int $stable = 0;
    public final String label;
    public final String value;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedStat) {
                FeedStat feedStat = (FeedStat) obj;
                if (!C7384Etj.areEqual(this.label, feedStat.label) || !C7384Etj.areEqual(this.value, feedStat.value)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FeedStat copy$default(FeedStat feedStat, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedStat.label;
        }
        if ((i & 2) != 0) {
            str2 = feedStat.value;
        }
        AnonymousClass003.A0u(str, str2);
        return new FeedStat(str, str2);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.value;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.value, AnonymousClass001.A0G(this.label));
    }

    public FeedStat(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.label = str;
        this.value = str2;
    }

    public final FeedStat copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new FeedStat(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
