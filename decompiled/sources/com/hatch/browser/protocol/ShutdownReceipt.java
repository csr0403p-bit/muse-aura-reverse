package com.hatch.browser.protocol;

import X.C06H;
import X.C0KA;
import X.FGI;

/* loaded from: classes6.dex */
public final class ShutdownReceipt {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public boolean closed;
    public boolean settled;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShutdownReceipt) {
                ShutdownReceipt shutdownReceipt = (ShutdownReceipt) obj;
                if (this.closed != shutdownReceipt.closed || this.settled != shutdownReceipt.settled) {
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

    public static /* synthetic */ ShutdownReceipt copy$default(ShutdownReceipt shutdownReceipt, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = shutdownReceipt.closed;
        }
        if ((i & 2) != 0) {
            z2 = shutdownReceipt.settled;
        }
        return new ShutdownReceipt(z, z2);
    }

    public final boolean component1() {
        return this.closed;
    }

    public final boolean component2() {
        return this.settled;
    }

    public final ShutdownReceipt copy(boolean z, boolean z2) {
        return new ShutdownReceipt(z, z2);
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final boolean getSettled() {
        return this.settled;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A02(this.closed), this.settled);
    }

    public final void setClosed(boolean z) {
        this.closed = z;
    }

    public final void setSettled(boolean z) {
        this.settled = z;
    }

    public String toString() {
        return FGI.A0p("ShutdownReceipt(closed=", ", settled=", ")", this.closed, this.settled);
    }

    public ShutdownReceipt(boolean z, boolean z2) {
        this.closed = z;
        this.settled = z2;
    }
}
