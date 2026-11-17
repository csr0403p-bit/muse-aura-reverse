package com.facebook.aura.nudge;

import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class NudgePolicy extends C06G {
    public static final int $stable = 0;
    public final NudgeExpiry expiry;
    public final boolean isCompletionFinal;
    public final int maxShows;
    public final int minDaysBetweenShows;

    public NudgePolicy(int i, int i2, NudgeExpiry nudgeExpiry, boolean z) {
        C7384Etj.A0Y(nudgeExpiry, 2);
        this.maxShows = i;
        this.minDaysBetweenShows = i2;
        this.expiry = nudgeExpiry;
        this.isCompletionFinal = z;
    }

    public final NudgePolicy copy(int i, int i2, NudgeExpiry nudgeExpiry, boolean z) {
        C7384Etj.A0Y(nudgeExpiry, 2);
        return new NudgePolicy(i, i2, nudgeExpiry, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NudgePolicy) {
                NudgePolicy nudgePolicy = (NudgePolicy) obj;
                if (this.maxShows != nudgePolicy.maxShows || this.minDaysBetweenShows != nudgePolicy.minDaysBetweenShows || !C7384Etj.areEqual(this.expiry, nudgePolicy.expiry) || this.isCompletionFinal != nudgePolicy.isCompletionFinal) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NudgePolicy copy$default(NudgePolicy nudgePolicy, int i, int i2, NudgeExpiry nudgeExpiry, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = nudgePolicy.maxShows;
        }
        if ((i3 & 2) != 0) {
            i2 = nudgePolicy.minDaysBetweenShows;
        }
        if ((i3 & 4) != 0) {
            nudgeExpiry = nudgePolicy.expiry;
        }
        if ((i3 & 8) != 0) {
            z = nudgePolicy.isCompletionFinal;
        }
        C7384Etj.A0Y(nudgeExpiry, 2);
        return new NudgePolicy(i, i2, nudgeExpiry, z);
    }

    public final int component1() {
        return this.maxShows;
    }

    public final int component2() {
        return this.minDaysBetweenShows;
    }

    public final NudgeExpiry component3() {
        return this.expiry;
    }

    public final boolean component4() {
        return this.isCompletionFinal;
    }

    public final NudgeExpiry getExpiry() {
        return this.expiry;
    }

    public final int getMaxShows() {
        return this.maxShows;
    }

    public final int getMinDaysBetweenShows() {
        return this.minDaysBetweenShows;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.expiry, ((this.maxShows * 31) + this.minDaysBetweenShows) * 31), this.isCompletionFinal);
    }

    public final boolean isCompletionFinal() {
        return this.isCompletionFinal;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NudgePolicy(int i, int i2, NudgeExpiry nudgeExpiry, boolean z, int i3, C06H c06h) {
        this((i3 & 1) != 0 ? 1 : i, C3cG.A01(i3, i2), (i3 & 4) != 0 ? new NudgeExpiry(60000L, true) : nudgeExpiry, (i3 & 8) != 0 ? true : z);
    }

    public NudgePolicy() {
        this(1, 0, new NudgeExpiry(60000L, true), true);
    }
}
