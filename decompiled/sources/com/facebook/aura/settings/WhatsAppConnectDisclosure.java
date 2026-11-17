package com.facebook.aura.settings;

import X.AHD;
import X.AnonymousClass000;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public interface WhatsAppConnectDisclosure {

    /* loaded from: classes6.dex */
    public final class Failed implements WhatsAppConnectDisclosure {
        public static final int $stable = 0;
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return 1222673345;
        }
    }

    public final class Loaded extends C06G implements WhatsAppConnectDisclosure {
        public static final int $stable = 0;
        public final AHD<WhatsAppConnectDisclosureRun> footerRuns;

        public Loaded(AHD<WhatsAppConnectDisclosureRun> ahd) {
            C7384Etj.A0Y(ahd, 0);
            this.footerRuns = ahd;
        }

        public final Loaded copy(AHD<WhatsAppConnectDisclosureRun> ahd) {
            C7384Etj.A0Y(ahd, 0);
            return new Loaded(ahd);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Loaded) && C7384Etj.areEqual(this.footerRuns, ((Loaded) obj).footerRuns));
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, AHD ahd, int i, Object obj) {
            if ((i & 1) != 0) {
                ahd = loaded.footerRuns;
            }
            C7384Etj.A0Y(ahd, 0);
            return new Loaded(ahd);
        }

        public final AHD<WhatsAppConnectDisclosureRun> component1() {
            return this.footerRuns;
        }

        public final AHD<WhatsAppConnectDisclosureRun> getFooterRuns() {
            return this.footerRuns;
        }

        public int hashCode() {
            return this.footerRuns.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes6.dex */
    public final class Loading implements WhatsAppConnectDisclosure {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return AnonymousClass000.A00(22);
        }

        public int hashCode() {
            return 671408696;
        }
    }
}
