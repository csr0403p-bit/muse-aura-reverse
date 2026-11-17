package com.facebook.aura.conversation.repo;

import X.C06G;
import X.C7384Etj;
import com.facebook.aura.gateway.HatchSessionItem;

/* loaded from: classes3.dex */
public interface SessionRefreshResult {

    public final class Failed implements SessionRefreshResult {
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return 300590920;
        }
    }

    /* loaded from: classes.dex */
    public final class Found extends C06G implements SessionRefreshResult {
        public final HatchSessionItem session;

        public Found(HatchSessionItem hatchSessionItem) {
            C7384Etj.A0Y(hatchSessionItem, 0);
            this.session = hatchSessionItem;
        }

        public final Found copy(HatchSessionItem hatchSessionItem) {
            C7384Etj.A0Y(hatchSessionItem, 0);
            return new Found(hatchSessionItem);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Found) && C7384Etj.areEqual(this.session, ((Found) obj).session));
        }

        public static /* synthetic */ Found copy$default(Found found, HatchSessionItem hatchSessionItem, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchSessionItem = found.session;
            }
            C7384Etj.A0Y(hatchSessionItem, 0);
            return new Found(hatchSessionItem);
        }

        public final HatchSessionItem component1() {
            return this.session;
        }

        public final HatchSessionItem getSession() {
            return this.session;
        }

        public int hashCode() {
            return this.session.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class NotFound implements SessionRefreshResult {
        public static final NotFound INSTANCE = new NotFound();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NotFound);
        }

        public String toString() {
            return "NotFound";
        }

        public int hashCode() {
            return 1982940346;
        }
    }
}
