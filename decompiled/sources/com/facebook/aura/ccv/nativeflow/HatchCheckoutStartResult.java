package com.facebook.aura.ccv.nativeflow;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public interface HatchCheckoutStartResult {

    public final class Failed extends C06G implements HatchCheckoutStartResult {
        public final HatchCheckoutUnavailableReason reason;

        public Failed(HatchCheckoutUnavailableReason hatchCheckoutUnavailableReason) {
            C7384Etj.A0Y(hatchCheckoutUnavailableReason, 0);
            this.reason = hatchCheckoutUnavailableReason;
        }

        public final Failed copy(HatchCheckoutUnavailableReason hatchCheckoutUnavailableReason) {
            C7384Etj.A0Y(hatchCheckoutUnavailableReason, 0);
            return new Failed(hatchCheckoutUnavailableReason);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Failed) && this.reason == ((Failed) obj).reason);
        }

        public static /* synthetic */ Failed copy$default(Failed failed, HatchCheckoutUnavailableReason hatchCheckoutUnavailableReason, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchCheckoutUnavailableReason = failed.reason;
            }
            C7384Etj.A0Y(hatchCheckoutUnavailableReason, 0);
            return new Failed(hatchCheckoutUnavailableReason);
        }

        public final HatchCheckoutUnavailableReason component1() {
            return this.reason;
        }

        public final HatchCheckoutUnavailableReason getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Opened extends C06G implements HatchCheckoutStartResult {
        public final HatchCheckoutSession session;

        public Opened(HatchCheckoutSession hatchCheckoutSession) {
            C7384Etj.A0Y(hatchCheckoutSession, 0);
            this.session = hatchCheckoutSession;
        }

        public final Opened copy(HatchCheckoutSession hatchCheckoutSession) {
            C7384Etj.A0Y(hatchCheckoutSession, 0);
            return new Opened(hatchCheckoutSession);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Opened) && C7384Etj.areEqual(this.session, ((Opened) obj).session));
        }

        public static /* synthetic */ Opened copy$default(Opened opened, HatchCheckoutSession hatchCheckoutSession, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchCheckoutSession = opened.session;
            }
            C7384Etj.A0Y(hatchCheckoutSession, 0);
            return new Opened(hatchCheckoutSession);
        }

        public final HatchCheckoutSession component1() {
            return this.session;
        }

        public final HatchCheckoutSession getSession() {
            return this.session;
        }

        public int hashCode() {
            return this.session.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
