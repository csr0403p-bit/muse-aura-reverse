package com.hatch.browser.protocol;

import X.C06H;
import X.C0KA;
import X.FGI;

/* loaded from: classes6.dex */
public final class PageRemovalReceipt {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public boolean removed;
    public boolean settled;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PageRemovalReceipt) {
                PageRemovalReceipt pageRemovalReceipt = (PageRemovalReceipt) obj;
                if (this.removed != pageRemovalReceipt.removed || this.settled != pageRemovalReceipt.settled) {
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

    public static /* synthetic */ PageRemovalReceipt copy$default(PageRemovalReceipt pageRemovalReceipt, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = pageRemovalReceipt.removed;
        }
        if ((i & 2) != 0) {
            z2 = pageRemovalReceipt.settled;
        }
        return new PageRemovalReceipt(z, z2);
    }

    public final boolean component1() {
        return this.removed;
    }

    public final boolean component2() {
        return this.settled;
    }

    public final PageRemovalReceipt copy(boolean z, boolean z2) {
        return new PageRemovalReceipt(z, z2);
    }

    public final boolean getRemoved() {
        return this.removed;
    }

    public final boolean getSettled() {
        return this.settled;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A02(this.removed), this.settled);
    }

    public final void setRemoved(boolean z) {
        this.removed = z;
    }

    public final void setSettled(boolean z) {
        this.settled = z;
    }

    public String toString() {
        return FGI.A0p("PageRemovalReceipt(removed=", ", settled=", ")", this.removed, this.settled);
    }

    public PageRemovalReceipt(boolean z, boolean z2) {
        this.removed = z;
        this.settled = z2;
    }
}
