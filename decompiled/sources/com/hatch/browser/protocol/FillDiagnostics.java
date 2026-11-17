package com.hatch.browser.protocol;

import X.AnonymousClass006;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class FillDiagnostics {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public byte clearAttempts;
    public boolean directFocusUsed;
    public FillFailureStage failureStage;
    public Boolean focusedAfter;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FillDiagnostics) {
                FillDiagnostics fillDiagnostics = (FillDiagnostics) obj;
                if (this.failureStage != fillDiagnostics.failureStage || !C7384Etj.areEqual(this.focusedAfter, fillDiagnostics.focusedAfter) || this.directFocusUsed != fillDiagnostics.directFocusUsed || this.clearAttempts != fillDiagnostics.clearAttempts) {
                }
            }
            return false;
        }
        return true;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* renamed from: copy-jDvRwcg$default, reason: not valid java name */
    public static /* synthetic */ FillDiagnostics m3600copyjDvRwcg$default(FillDiagnostics fillDiagnostics, FillFailureStage fillFailureStage, Boolean bool, boolean z, byte b, int i, Object obj) {
        if ((i & 1) != 0) {
            fillFailureStage = fillDiagnostics.failureStage;
        }
        if ((i & 2) != 0) {
            bool = fillDiagnostics.focusedAfter;
        }
        if ((i & 4) != 0) {
            z = fillDiagnostics.directFocusUsed;
        }
        if ((i & 8) != 0) {
            b = fillDiagnostics.clearAttempts;
        }
        return new FillDiagnostics(fillFailureStage, bool, z, b);
    }

    public final FillFailureStage component1() {
        return this.failureStage;
    }

    public final Boolean component2() {
        return this.focusedAfter;
    }

    public final boolean component3() {
        return this.directFocusUsed;
    }

    /* renamed from: component4-w2LRezQ, reason: not valid java name */
    public final byte m3601component4w2LRezQ() {
        return this.clearAttempts;
    }

    /* renamed from: copy-jDvRwcg, reason: not valid java name */
    public final FillDiagnostics m3602copyjDvRwcg(FillFailureStage fillFailureStage, Boolean bool, boolean z, byte b) {
        return new FillDiagnostics(fillFailureStage, bool, z, b);
    }

    /* renamed from: getClearAttempts-w2LRezQ, reason: not valid java name */
    public final byte m3603getClearAttemptsw2LRezQ() {
        return this.clearAttempts;
    }

    public final boolean getDirectFocusUsed() {
        return this.directFocusUsed;
    }

    public final FillFailureStage getFailureStage() {
        return this.failureStage;
    }

    public final Boolean getFocusedAfter() {
        return this.focusedAfter;
    }

    public int hashCode() {
        return C0KA.A01(((AnonymousClass006.A0D(this.failureStage) * 31) + C3cH.A02(this.focusedAfter)) * 31, this.directFocusUsed) + this.clearAttempts;
    }

    /* renamed from: setClearAttempts-7apg3OU, reason: not valid java name */
    public final void m3604setClearAttempts7apg3OU(byte b) {
        this.clearAttempts = b;
    }

    public final void setDirectFocusUsed(boolean z) {
        this.directFocusUsed = z;
    }

    public final void setFailureStage(FillFailureStage fillFailureStage) {
        this.failureStage = fillFailureStage;
    }

    public final void setFocusedAfter(Boolean bool) {
        this.focusedAfter = bool;
    }

    public String toString() {
        FillFailureStage fillFailureStage = this.failureStage;
        Boolean bool = this.focusedAfter;
        boolean z = this.directFocusUsed;
        String strValueOf = String.valueOf(this.clearAttempts & 255);
        StringBuilder sbA0f = C3cG.A0f(fillFailureStage, "FillDiagnostics(failureStage=");
        sbA0f.append(", focusedAfter=");
        sbA0f.append(bool);
        sbA0f.append(", directFocusUsed=");
        sbA0f.append(z);
        return C3cJ.A0N(", clearAttempts=", strValueOf, sbA0f);
    }

    public FillDiagnostics(FillFailureStage fillFailureStage, Boolean bool, boolean z, byte b) {
        this.failureStage = fillFailureStage;
        this.focusedAfter = bool;
        this.directFocusUsed = z;
        this.clearAttempts = b;
    }

    public /* synthetic */ FillDiagnostics(FillFailureStage fillFailureStage, Boolean bool, boolean z, byte b, C06H c06h) {
        this(fillFailureStage, bool, z, b);
    }
}
