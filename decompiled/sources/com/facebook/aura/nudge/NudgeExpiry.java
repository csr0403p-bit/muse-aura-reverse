package com.facebook.aura.nudge;

import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cI;

/* loaded from: classes2.dex */
public final class NudgeExpiry extends C06G {
    public static final int $stable = 0;
    public final boolean dismissOnBackground;
    public final long visibleForMs;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NudgeExpiry) {
                NudgeExpiry nudgeExpiry = (NudgeExpiry) obj;
                if (this.visibleForMs != nudgeExpiry.visibleForMs || this.dismissOnBackground != nudgeExpiry.dismissOnBackground) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NudgeExpiry copy$default(NudgeExpiry nudgeExpiry, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = nudgeExpiry.visibleForMs;
        }
        if ((i & 2) != 0) {
            z = nudgeExpiry.dismissOnBackground;
        }
        return new NudgeExpiry(j, z);
    }

    public final long component1() {
        return this.visibleForMs;
    }

    public final boolean component2() {
        return this.dismissOnBackground;
    }

    public final NudgeExpiry copy(long j, boolean z) {
        return new NudgeExpiry(j, z);
    }

    public final boolean getDismissOnBackground() {
        return this.dismissOnBackground;
    }

    public final long getVisibleForMs() {
        return this.visibleForMs;
    }

    public int hashCode() {
        return C0KA.A00(C3cI.A01(this.visibleForMs), this.dismissOnBackground);
    }

    public NudgeExpiry(long j, boolean z) {
        this.visibleForMs = j;
        this.dismissOnBackground = z;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NudgeExpiry(long j, boolean z, int i, C06H c06h) {
        this((i & 1) != 0 ? 60000L : j, C3cG.A1J(i, z));
    }

    public NudgeExpiry() {
        this(60000L, true);
    }
}
