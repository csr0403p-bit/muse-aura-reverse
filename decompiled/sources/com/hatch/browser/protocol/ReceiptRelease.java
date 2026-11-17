package com.hatch.browser.protocol;

import X.C06H;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public abstract class ReceiptRelease {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    public final class Available extends ReceiptRelease {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final TypedReceipt receipt;

        public Available(TypedReceipt typedReceipt) {
            C7384Etj.A0Y(typedReceipt, 0);
            this.receipt = typedReceipt;
        }

        public final Available copy(TypedReceipt typedReceipt) {
            C7384Etj.A0Y(typedReceipt, 0);
            return new Available(typedReceipt);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Available) && C7384Etj.areEqual(this.receipt, ((Available) obj).receipt));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Available copy$default(Available available, TypedReceipt typedReceipt, int i, Object obj) {
            if ((i & 1) != 0) {
                typedReceipt = available.receipt;
            }
            C7384Etj.A0Y(typedReceipt, 0);
            return new Available(typedReceipt);
        }

        public final TypedReceipt component1() {
            return this.receipt;
        }

        public final TypedReceipt getReceipt() {
            return this.receipt;
        }

        public int hashCode() {
            return this.receipt.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("Available(receipt=", this.receipt);
        }
    }

    public final class NotProduced extends ReceiptRelease {
        public static final int $stable = 0;
        public static final NotProduced INSTANCE = new NotProduced();
    }

    public final class Withheld extends ReceiptRelease {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final ReleaseReason reason;

        public Withheld(ReleaseReason releaseReason) {
            C7384Etj.A0Y(releaseReason, 0);
            this.reason = releaseReason;
        }

        public final Withheld copy(ReleaseReason releaseReason) {
            C7384Etj.A0Y(releaseReason, 0);
            return new Withheld(releaseReason);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Withheld) && this.reason == ((Withheld) obj).reason);
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Withheld copy$default(Withheld withheld, ReleaseReason releaseReason, int i, Object obj) {
            if ((i & 1) != 0) {
                releaseReason = withheld.reason;
            }
            C7384Etj.A0Y(releaseReason, 0);
            return new Withheld(releaseReason);
        }

        public final ReleaseReason component1() {
            return this.reason;
        }

        public final ReleaseReason getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("Withheld(reason=", this.reason);
        }
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public ReceiptRelease() {
    }

    public /* synthetic */ ReceiptRelease(C06H c06h) {
    }
}
