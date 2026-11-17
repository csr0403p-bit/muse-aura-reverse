package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public interface HatchReTosScreen {

    /* loaded from: classes2.dex */
    public final class Itemized extends C06G implements HatchReTosScreen {
        public final HatchItemizedConsent consent;

        public Itemized(HatchItemizedConsent hatchItemizedConsent) {
            C7384Etj.A0Y(hatchItemizedConsent, 0);
            this.consent = hatchItemizedConsent;
        }

        public final Itemized copy(HatchItemizedConsent hatchItemizedConsent) {
            C7384Etj.A0Y(hatchItemizedConsent, 0);
            return new Itemized(hatchItemizedConsent);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Itemized) && C7384Etj.areEqual(this.consent, ((Itemized) obj).consent));
        }

        public static /* synthetic */ Itemized copy$default(Itemized itemized, HatchItemizedConsent hatchItemizedConsent, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchItemizedConsent = itemized.consent;
            }
            C7384Etj.A0Y(hatchItemizedConsent, 0);
            return new Itemized(hatchItemizedConsent);
        }

        public final HatchItemizedConsent component1() {
            return this.consent;
        }

        public final HatchItemizedConsent getConsent() {
            return this.consent;
        }

        public int hashCode() {
            return this.consent.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Prose extends C06G implements HatchReTosScreen {
        public final HatchTosDisclosure clause;
        public final String confirmLabel;
        public final String title;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Prose) {
                    Prose prose = (Prose) obj;
                    if (!C7384Etj.areEqual(this.title, prose.title) || !C7384Etj.areEqual(this.clause, prose.clause) || !C7384Etj.areEqual(this.confirmLabel, prose.confirmLabel)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Prose copy$default(Prose prose, String str, HatchTosDisclosure hatchTosDisclosure, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = prose.title;
            }
            if ((i & 2) != 0) {
                hatchTosDisclosure = prose.clause;
            }
            if ((i & 4) != 0) {
                str2 = prose.confirmLabel;
            }
            return prose.copy(str, hatchTosDisclosure, str2);
        }

        public final String component1() {
            return this.title;
        }

        public final HatchTosDisclosure component2() {
            return this.clause;
        }

        public final String component3() {
            return this.confirmLabel;
        }

        public final HatchTosDisclosure getClause() {
            return this.clause;
        }

        public final String getConfirmLabel() {
            return this.confirmLabel;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.confirmLabel, AnonymousClass005.A0F(this.clause, AnonymousClass001.A0G(this.title)));
        }

        public Prose(String str, HatchTosDisclosure hatchTosDisclosure, String str2) {
            AnonymousClass005.A0x(str, hatchTosDisclosure, str2);
            this.title = str;
            this.clause = hatchTosDisclosure;
            this.confirmLabel = str2;
        }

        public final Prose copy(String str, HatchTosDisclosure hatchTosDisclosure, String str2) {
            AnonymousClass005.A0x(str, hatchTosDisclosure, str2);
            return new Prose(str, hatchTosDisclosure, str2);
        }

        public String toString() {
            return super.toString();
        }
    }
}
