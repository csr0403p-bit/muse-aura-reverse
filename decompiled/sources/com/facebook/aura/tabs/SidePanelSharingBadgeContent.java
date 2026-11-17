package com.facebook.aura.tabs;

import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.library.repo.ArtifactSharingRecipient;
import java.util.List;

/* loaded from: classes.dex */
public interface SidePanelSharingBadgeContent {

    public final class People extends C06G implements SidePanelSharingBadgeContent {
        public static final int $stable = 8;
        public final List<ArtifactSharingRecipient> faces;
        public final int overflow;

        public People(List<ArtifactSharingRecipient> list, int i) {
            C7384Etj.A0Y(list, 0);
            this.faces = list;
            this.overflow = i;
        }

        public final People copy(List<ArtifactSharingRecipient> list, int i) {
            C7384Etj.A0Y(list, 0);
            return new People(list, i);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof People) {
                    People people = (People) obj;
                    if (!C7384Etj.areEqual(this.faces, people.faces) || this.overflow != people.overflow) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ People copy$default(People people, List list, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = people.faces;
            }
            if ((i2 & 2) != 0) {
                i = people.overflow;
            }
            C7384Etj.A0Y(list, 0);
            return new People(list, i);
        }

        public final List<ArtifactSharingRecipient> component1() {
            return this.faces;
        }

        public final int component2() {
            return this.overflow;
        }

        public final List<ArtifactSharingRecipient> getFaces() {
            return this.faces;
        }

        public final int getOverflow() {
            return this.overflow;
        }

        public int hashCode() {
            return AnonymousClass005.A0E(this.faces) + this.overflow;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Public implements SidePanelSharingBadgeContent {
        public static final int $stable = 0;
        public static final Public INSTANCE = new Public();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Public);
        }

        public String toString() {
            return "Public";
        }

        public int hashCode() {
            return -1437543950;
        }
    }
}
