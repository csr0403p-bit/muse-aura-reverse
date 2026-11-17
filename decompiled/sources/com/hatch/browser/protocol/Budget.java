package com.hatch.browser.protocol;

import X.AnonymousClass002;
import X.BV4;
import X.C06H;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C9314GDq;

/* loaded from: classes6.dex */
public final class Budget {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public C9314GDq expiresAtUnixMs;
    public int remainingMs;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Budget) {
                Budget budget = (Budget) obj;
                if (this.remainingMs != budget.remainingMs || !C7384Etj.areEqual(this.expiresAtUnixMs, budget.expiresAtUnixMs)) {
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

    /* renamed from: copy-FqK-lVc$default, reason: not valid java name */
    public static /* synthetic */ Budget m3283copyFqKlVc$default(Budget budget, int i, C9314GDq c9314GDq, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = budget.remainingMs;
        }
        if ((i2 & 2) != 0) {
            c9314GDq = budget.expiresAtUnixMs;
        }
        return new Budget(i, c9314GDq);
    }

    /* renamed from: component1-pVg5ArA, reason: not valid java name */
    public final int m3284component1pVg5ArA() {
        return this.remainingMs;
    }

    /* renamed from: component2-6VbMDqA, reason: not valid java name */
    public final C9314GDq m3285component26VbMDqA() {
        return this.expiresAtUnixMs;
    }

    /* renamed from: copy-FqK-lVc, reason: not valid java name */
    public final Budget m3286copyFqKlVc(int i, C9314GDq c9314GDq) {
        return new Budget(i, c9314GDq);
    }

    /* renamed from: getExpiresAtUnixMs-6VbMDqA, reason: not valid java name */
    public final C9314GDq m3287getExpiresAtUnixMs6VbMDqA() {
        return this.expiresAtUnixMs;
    }

    /* renamed from: getRemainingMs-pVg5ArA, reason: not valid java name */
    public final int m3288getRemainingMspVg5ArA() {
        return this.remainingMs;
    }

    public int hashCode() {
        int i = this.remainingMs * 31;
        C9314GDq c9314GDq = this.expiresAtUnixMs;
        return i + (c9314GDq == null ? 0 : AnonymousClass002.A0A(c9314GDq.A00));
    }

    /* renamed from: setExpiresAtUnixMs-ADd3fzo, reason: not valid java name */
    public final void m3289setExpiresAtUnixMsADd3fzo(C9314GDq c9314GDq) {
        this.expiresAtUnixMs = c9314GDq;
    }

    /* renamed from: setRemainingMs-WZ4Q5Ns, reason: not valid java name */
    public final void m3290setRemainingMsWZ4Q5Ns(int i) {
        this.remainingMs = i;
    }

    public String toString() {
        return C3cJ.A0L(this.expiresAtUnixMs, ", expiresAtUnixMs=", C3cI.A0x("Budget(remainingMs=", String.valueOf(BV4.A03(this.remainingMs))));
    }

    public Budget(int i, C9314GDq c9314GDq) {
        this.remainingMs = i;
        this.expiresAtUnixMs = c9314GDq;
    }

    public /* synthetic */ Budget(int i, C9314GDq c9314GDq, C06H c06h) {
        this(i, c9314GDq);
    }
}
