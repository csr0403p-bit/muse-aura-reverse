package com.facebook.aura.skills.connect;

import X.AHD;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public interface LinkedAccountsTitle {

    public final class AddAccount implements LinkedAccountsTitle {
        public static final int $stable = 0;
        public static final AddAccount INSTANCE = new AddAccount();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AddAccount);
        }

        public String toString() {
            return "AddAccount";
        }

        public int hashCode() {
            return -1144112191;
        }
    }

    public final class Chip extends C06G implements LinkedAccountsTitle {
        public static final int $stable = 0;
        public final LinkedAccountsChipLabel label;
        public final AHD<LinkedAccountMenuItem> menuItems;
        public final AHD<String> photoUrls;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Chip) {
                    Chip chip = (Chip) obj;
                    if (!C7384Etj.areEqual(this.photoUrls, chip.photoUrls) || !C7384Etj.areEqual(this.label, chip.label) || !C7384Etj.areEqual(this.menuItems, chip.menuItems)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Chip copy$default(Chip chip, AHD ahd, LinkedAccountsChipLabel linkedAccountsChipLabel, AHD ahd2, int i, Object obj) {
            if ((i & 1) != 0) {
                ahd = chip.photoUrls;
            }
            if ((i & 2) != 0) {
                linkedAccountsChipLabel = chip.label;
            }
            if ((i & 4) != 0) {
                ahd2 = chip.menuItems;
            }
            return chip.copy(ahd, linkedAccountsChipLabel, ahd2);
        }

        public final AHD<String> component1() {
            return this.photoUrls;
        }

        public final LinkedAccountsChipLabel component2() {
            return this.label;
        }

        public final AHD<LinkedAccountMenuItem> component3() {
            return this.menuItems;
        }

        public final LinkedAccountsChipLabel getLabel() {
            return this.label;
        }

        public final AHD<LinkedAccountMenuItem> getMenuItems() {
            return this.menuItems;
        }

        public final AHD<String> getPhotoUrls() {
            return this.photoUrls;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.menuItems, AnonymousClass005.A0F(this.label, AnonymousClass005.A0E(this.photoUrls)));
        }

        public Chip(AHD<String> ahd, LinkedAccountsChipLabel linkedAccountsChipLabel, AHD<LinkedAccountMenuItem> ahd2) {
            AnonymousClass005.A0x(ahd, linkedAccountsChipLabel, ahd2);
            this.photoUrls = ahd;
            this.label = linkedAccountsChipLabel;
            this.menuItems = ahd2;
        }

        public final Chip copy(AHD<String> ahd, LinkedAccountsChipLabel linkedAccountsChipLabel, AHD<LinkedAccountMenuItem> ahd2) {
            AnonymousClass005.A0x(ahd, linkedAccountsChipLabel, ahd2);
            return new Chip(ahd, linkedAccountsChipLabel, ahd2);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Loading implements LinkedAccountsTitle {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return -579468313;
        }
    }

    public final class None implements LinkedAccountsTitle {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public String toString() {
            return "None";
        }

        public int hashCode() {
            return -101022611;
        }
    }
}
