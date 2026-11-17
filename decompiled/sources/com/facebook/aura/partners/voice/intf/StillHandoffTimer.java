package com.facebook.aura.partners.voice.intf;

import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C3cI;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class StillHandoffTimer extends C06G {
    public final int attempt;
    public final long callGeneration;
    public final int failures;
    public final boolean inFlight;
    public final String key;

    public StillHandoffTimer(long j, String str, int i, int i2, boolean z) {
        C7384Etj.A0Y(str, 1);
        this.callGeneration = j;
        this.key = str;
        this.attempt = i;
        this.failures = i2;
        this.inFlight = z;
    }

    public final StillHandoffTimer copy(long j, String str, int i, int i2, boolean z) {
        C7384Etj.A0Y(str, 1);
        return new StillHandoffTimer(j, str, i, i2, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StillHandoffTimer) {
                StillHandoffTimer stillHandoffTimer = (StillHandoffTimer) obj;
                if (this.callGeneration != stillHandoffTimer.callGeneration || !C7384Etj.areEqual(this.key, stillHandoffTimer.key) || this.attempt != stillHandoffTimer.attempt || this.failures != stillHandoffTimer.failures || this.inFlight != stillHandoffTimer.inFlight) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ StillHandoffTimer copy$default(StillHandoffTimer stillHandoffTimer, long j, String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = stillHandoffTimer.callGeneration;
        }
        if ((i3 & 2) != 0) {
            str = stillHandoffTimer.key;
        }
        if ((i3 & 4) != 0) {
            i = stillHandoffTimer.attempt;
        }
        if ((i3 & 8) != 0) {
            i2 = stillHandoffTimer.failures;
        }
        if ((i3 & 16) != 0) {
            z = stillHandoffTimer.inFlight;
        }
        return stillHandoffTimer.copy(j, str, i, i2, z);
    }

    public final long component1() {
        return this.callGeneration;
    }

    public final String component2() {
        return this.key;
    }

    public final int component3() {
        return this.attempt;
    }

    public final int component4() {
        return this.failures;
    }

    public final boolean component5() {
        return this.inFlight;
    }

    public final int getAttempt() {
        return this.attempt;
    }

    public final long getCallGeneration() {
        return this.callGeneration;
    }

    public final int getFailures() {
        return this.failures;
    }

    public final boolean getInFlight() {
        return this.inFlight;
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return C0KA.A00((((AnonymousClass005.A0I(this.key, C3cI.A01(this.callGeneration)) + this.attempt) * 31) + this.failures) * 31, this.inFlight);
    }

    public String toString() {
        return super.toString();
    }
}
