package com.hatch.browser.core;

import X.C06H;
import X.FGI;

/* loaded from: classes6.dex */
public final class NativeControlDecision {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public boolean allowed;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof NativeControlDecision) && this.allowed == ((NativeControlDecision) obj).allowed);
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ NativeControlDecision copy$default(NativeControlDecision nativeControlDecision, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = nativeControlDecision.allowed;
        }
        return new NativeControlDecision(z);
    }

    public final boolean component1() {
        return this.allowed;
    }

    public final NativeControlDecision copy(boolean z) {
        return new NativeControlDecision(z);
    }

    public final boolean getAllowed() {
        return this.allowed;
    }

    public int hashCode() {
        return this.allowed ? 1231 : 1237;
    }

    public final void setAllowed(boolean z) {
        this.allowed = z;
    }

    public String toString() {
        return FGI.A0q("NativeControlDecision(allowed=", ")", this.allowed);
    }

    public NativeControlDecision(boolean z) {
        this.allowed = z;
    }
}
