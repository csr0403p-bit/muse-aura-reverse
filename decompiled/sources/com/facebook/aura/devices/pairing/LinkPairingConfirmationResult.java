package com.facebook.aura.devices.pairing;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public interface LinkPairingConfirmationResult {

    public final class Confirmed extends C06G implements LinkPairingConfirmationResult {
        public static final int $stable = 0;
        public final LinkPairingConfirmation confirmation;

        public Confirmed(LinkPairingConfirmation linkPairingConfirmation) {
            C7384Etj.A0Y(linkPairingConfirmation, 0);
            this.confirmation = linkPairingConfirmation;
        }

        public final Confirmed copy(LinkPairingConfirmation linkPairingConfirmation) {
            C7384Etj.A0Y(linkPairingConfirmation, 0);
            return new Confirmed(linkPairingConfirmation);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Confirmed) && C7384Etj.areEqual(this.confirmation, ((Confirmed) obj).confirmation));
        }

        public static /* synthetic */ Confirmed copy$default(Confirmed confirmed, LinkPairingConfirmation linkPairingConfirmation, int i, Object obj) {
            if ((i & 1) != 0) {
                linkPairingConfirmation = confirmed.confirmation;
            }
            C7384Etj.A0Y(linkPairingConfirmation, 0);
            return new Confirmed(linkPairingConfirmation);
        }

        public final LinkPairingConfirmation component1() {
            return this.confirmation;
        }

        public final LinkPairingConfirmation getConfirmation() {
            return this.confirmation;
        }

        public int hashCode() {
            return this.confirmation.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class SdkTokenMissing implements LinkPairingConfirmationResult {
        public static final int $stable = 0;
        public static final SdkTokenMissing INSTANCE = new SdkTokenMissing();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SdkTokenMissing);
        }

        public String toString() {
            return "SdkTokenMissing";
        }

        public int hashCode() {
            return -584264686;
        }
    }

    public final class Superseded implements LinkPairingConfirmationResult {
        public static final int $stable = 0;
        public static final Superseded INSTANCE = new Superseded();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Superseded);
        }

        public String toString() {
            return "Superseded";
        }

        public int hashCode() {
            return -473558677;
        }
    }

    public final class TimedOut implements LinkPairingConfirmationResult {
        public static final int $stable = 0;
        public static final TimedOut INSTANCE = new TimedOut();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof TimedOut);
        }

        public String toString() {
            return "TimedOut";
        }

        public int hashCode() {
            return 516538732;
        }
    }
}
