package com.facebook.aura.conversation.view;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.C06G;
import X.C1BN;
import X.C3Pi;
import X.C7384Etj;
import X.C9286GCn;
import X.FGI;
import X.HwN;

/* loaded from: classes.dex */
public final class FlightOfferBookingRequest {
    public static final int $stable = 0;
    public static final FlightOfferBookingRequest INSTANCE = new FlightOfferBookingRequest();
    public static final C1BN<Booking> pending;
    public static final BLG<Booking> staged;

    public final class Booking extends C06G {
        public static final int $stable = 0;
        public final String hiddenPrompt;
        public final String sessionId;
        public final String text;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Booking) {
                    Booking booking = (Booking) obj;
                    if (!C7384Etj.areEqual(this.sessionId, booking.sessionId) || !C7384Etj.areEqual(this.text, booking.text) || !C7384Etj.areEqual(this.hiddenPrompt, booking.hiddenPrompt)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Booking copy$default(Booking booking, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = booking.sessionId;
            }
            if ((i & 2) != 0) {
                str2 = booking.text;
            }
            if ((i & 4) != 0) {
                str3 = booking.hiddenPrompt;
            }
            return booking.copy(str, str2, str3);
        }

        public final String component1() {
            return this.sessionId;
        }

        public final String component2() {
            return this.text;
        }

        public final String component3() {
            return this.hiddenPrompt;
        }

        public final String getHiddenPrompt() {
            return this.hiddenPrompt;
        }

        public final String getSessionId() {
            return this.sessionId;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return AnonymousClass005.A0I(this.text, AnonymousClass001.A0G(this.sessionId)) + AnonymousClass006.A0G(this.hiddenPrompt);
        }

        public Booking(String str, String str2, String str3) {
            AnonymousClass003.A0u(str, str2);
            this.sessionId = str;
            this.text = str2;
            this.hiddenPrompt = str3;
        }

        public final Booking copy(String str, String str2, String str3) {
            AnonymousClass003.A0u(str, str2);
            return new Booking(str, str2, str3);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final synchronized void clear() {
        staged.Af8(null);
    }

    public final synchronized Booking consume(String str) {
        C7384Etj.A0Y(str, 0);
        BLG<Booking> blg = staged;
        Booking value = blg.getValue();
        if (value == null || !str.equals(value.sessionId)) {
            return null;
        }
        blg.Af8(null);
        return value;
    }

    public final synchronized void stage(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        if (str2.length() != 0) {
            AnonymousClass002.A1I(staged, new Booking(str, str2, str3));
        }
    }

    static {
        C9286GCn c9286GCn = new C9286GCn(HwN.A01);
        staged = c9286GCn;
        pending = new C3Pi(null, c9286GCn);
    }

    public final C1BN<Booking> getPending() {
        return pending;
    }

    public final void stageOffer(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        stage(str, str3, str2.length() > 0 ? FGI.A0M(FlightOfferBookingRequestKt.OFFER_ID_PROMPT, str2) : null);
    }
}
