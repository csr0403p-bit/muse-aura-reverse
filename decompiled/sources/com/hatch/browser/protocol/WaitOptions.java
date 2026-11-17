package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;
import X.FKC;

/* loaded from: classes6.dex */
public final class WaitOptions {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public FKC pollMs;
    public FKC timeoutMs;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WaitOptions) {
                WaitOptions waitOptions = (WaitOptions) obj;
                if (!C7384Etj.areEqual(this.timeoutMs, waitOptions.timeoutMs) || !C7384Etj.areEqual(this.pollMs, waitOptions.pollMs)) {
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

    /* renamed from: copy-1A3ddvw$default, reason: not valid java name */
    public static /* synthetic */ WaitOptions m3873copy1A3ddvw$default(WaitOptions waitOptions, FKC fkc, FKC fkc2, int i, Object obj) {
        if ((i & 1) != 0) {
            fkc = waitOptions.timeoutMs;
        }
        if ((i & 2) != 0) {
            fkc2 = waitOptions.pollMs;
        }
        return new WaitOptions(fkc, fkc2);
    }

    /* renamed from: component1-0hXNFcg, reason: not valid java name */
    public final FKC m3874component10hXNFcg() {
        return this.timeoutMs;
    }

    /* renamed from: component2-0hXNFcg, reason: not valid java name */
    public final FKC m3875component20hXNFcg() {
        return this.pollMs;
    }

    /* renamed from: copy-1A3ddvw, reason: not valid java name */
    public final WaitOptions m3876copy1A3ddvw(FKC fkc, FKC fkc2) {
        return new WaitOptions(fkc, fkc2);
    }

    /* renamed from: getPollMs-0hXNFcg, reason: not valid java name */
    public final FKC m3877getPollMs0hXNFcg() {
        return this.pollMs;
    }

    /* renamed from: getTimeoutMs-0hXNFcg, reason: not valid java name */
    public final FKC m3878getTimeoutMs0hXNFcg() {
        return this.timeoutMs;
    }

    public int hashCode() {
        FKC fkc = this.timeoutMs;
        int i = (fkc == null ? 0 : fkc.A00) * 31;
        FKC fkc2 = this.pollMs;
        return i + (fkc2 != null ? fkc2.A00 : 0);
    }

    /* renamed from: setPollMs-ExVfyTY, reason: not valid java name */
    public final void m3879setPollMsExVfyTY(FKC fkc) {
        this.pollMs = fkc;
    }

    /* renamed from: setTimeoutMs-ExVfyTY, reason: not valid java name */
    public final void m3880setTimeoutMsExVfyTY(FKC fkc) {
        this.timeoutMs = fkc;
    }

    public String toString() {
        return C3cJ.A0L(this.pollMs, ", pollMs=", C3cG.A0f(this.timeoutMs, "WaitOptions(timeoutMs="));
    }

    public WaitOptions(FKC fkc, FKC fkc2) {
        this.timeoutMs = fkc;
        this.pollMs = fkc2;
    }

    public /* synthetic */ WaitOptions(FKC fkc, FKC fkc2, C06H c06h) {
        this(fkc, fkc2);
    }
}
