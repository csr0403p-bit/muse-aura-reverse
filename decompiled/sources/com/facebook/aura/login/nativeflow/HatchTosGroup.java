package com.facebook.aura.login.nativeflow;

import X.AHD;
import X.AHI;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public interface HatchTosGroup {

    public final class Documents extends C06G implements HatchTosGroup {
        public final AHD<HatchTosDocument> documents;
        public final String subtitle;
        public final String title;

        public Documents(String str, String str2, AHD<HatchTosDocument> ahd) {
            C7384Etj.A0Y(ahd, 2);
            this.title = str;
            this.subtitle = str2;
            this.documents = ahd;
        }

        public final Documents copy(String str, String str2, AHD<HatchTosDocument> ahd) {
            C7384Etj.A0Y(ahd, 2);
            return new Documents(str, str2, ahd);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Documents) {
                    Documents documents = (Documents) obj;
                    if (!C7384Etj.areEqual(this.title, documents.title) || !C7384Etj.areEqual(this.subtitle, documents.subtitle) || !C7384Etj.areEqual(this.documents, documents.documents)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Documents copy$default(Documents documents, String str, String str2, AHD ahd, int i, Object obj) {
            if ((i & 1) != 0) {
                str = documents.title;
            }
            if ((i & 2) != 0) {
                str2 = documents.subtitle;
            }
            if ((i & 4) != 0) {
                ahd = documents.documents;
            }
            return documents.copy(str, str2, ahd);
        }

        public final String component1() {
            return this.title;
        }

        public final String component2() {
            return this.subtitle;
        }

        public final AHD<HatchTosDocument> component3() {
            return this.documents;
        }

        public final AHD<HatchTosDocument> getDocuments() {
            return this.documents;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.documents, ((AnonymousClass006.A0G(this.title) * 31) + AnonymousClass005.A0H(this.subtitle)) * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Prose extends C06G implements HatchTosGroup {
        public final String body;
        public final AHD<HatchTosBodyRun> bodyRuns;
        public final String confirmLabel;
        public final String declineLabel;
        public final String pageTitle;
        public final String subtitle;
        public final String title;
        public final AHD<HatchTosProseVariant> variants;

        public Prose(String str, String str2, String str3, AHD<HatchTosBodyRun> ahd, AHD<HatchTosProseVariant> ahd2, String str4, String str5, String str6) {
            AnonymousClass005.A12(str3, ahd, ahd2, 2);
            this.title = str;
            this.subtitle = str2;
            this.body = str3;
            this.bodyRuns = ahd;
            this.variants = ahd2;
            this.pageTitle = str4;
            this.confirmLabel = str5;
            this.declineLabel = str6;
        }

        public final Prose copy(String str, String str2, String str3, AHD<HatchTosBodyRun> ahd, AHD<HatchTosProseVariant> ahd2, String str4, String str5, String str6) {
            AnonymousClass005.A12(str3, ahd, ahd2, 2);
            return new Prose(str, str2, str3, ahd, ahd2, str4, str5, str6);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Prose) {
                    Prose prose = (Prose) obj;
                    if (!C7384Etj.areEqual(this.title, prose.title) || !C7384Etj.areEqual(this.subtitle, prose.subtitle) || !C7384Etj.areEqual(this.body, prose.body) || !C7384Etj.areEqual(this.bodyRuns, prose.bodyRuns) || !C7384Etj.areEqual(this.variants, prose.variants) || !C7384Etj.areEqual(this.pageTitle, prose.pageTitle) || !C7384Etj.areEqual(this.confirmLabel, prose.confirmLabel) || !C7384Etj.areEqual(this.declineLabel, prose.declineLabel)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Prose copy$default(Prose prose, String str, String str2, String str3, AHD ahd, AHD ahd2, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = prose.title;
            }
            if ((i & 2) != 0) {
                str2 = prose.subtitle;
            }
            if ((i & 4) != 0) {
                str3 = prose.body;
            }
            if ((i & 8) != 0) {
                ahd = prose.bodyRuns;
            }
            if ((i & 16) != 0) {
                ahd2 = prose.variants;
            }
            if ((i & 32) != 0) {
                str4 = prose.pageTitle;
            }
            if ((i & 64) != 0) {
                str5 = prose.confirmLabel;
            }
            if ((i & 128) != 0) {
                str6 = prose.declineLabel;
            }
            return prose.copy(str, str2, str3, ahd, ahd2, str4, str5, str6);
        }

        public final String component1() {
            return this.title;
        }

        public final String component2() {
            return this.subtitle;
        }

        public final String component3() {
            return this.body;
        }

        public final AHD<HatchTosBodyRun> component4() {
            return this.bodyRuns;
        }

        public final AHD<HatchTosProseVariant> component5() {
            return this.variants;
        }

        public final String component6() {
            return this.pageTitle;
        }

        public final String component7() {
            return this.confirmLabel;
        }

        public final String component8() {
            return this.declineLabel;
        }

        public final String getBody() {
            return this.body;
        }

        public final AHD<HatchTosBodyRun> getBodyRuns() {
            return this.bodyRuns;
        }

        public final String getConfirmLabel() {
            return this.confirmLabel;
        }

        public final String getDeclineLabel() {
            return this.declineLabel;
        }

        public final String getPageTitle() {
            return this.pageTitle;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public final AHD<HatchTosProseVariant> getVariants() {
            return this.variants;
        }

        public int hashCode() {
            return ((((AnonymousClass005.A0F(this.variants, AnonymousClass005.A0F(this.bodyRuns, AnonymousClass005.A0I(this.body, ((AnonymousClass006.A0G(this.title) * 31) + AnonymousClass006.A0G(this.subtitle)) * 31))) + AnonymousClass006.A0G(this.pageTitle)) * 31) + AnonymousClass006.A0G(this.confirmLabel)) * 31) + AnonymousClass005.A0H(this.declineLabel);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Prose(String str, String str2, String str3, AHD ahd, AHD ahd2, String str4, String str5, String str6, int i, C06H c06h) {
            this(str, str2, str3, (i & 8) != 0 ? AHI.A01 : ahd, (i & 16) != 0 ? AHI.A01 : ahd2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6);
        }
    }

    public final class Url extends C06G implements HatchTosGroup {
        public final String url;

        public Url(String str) {
            C7384Etj.A0Y(str, 0);
            this.url = str;
        }

        public final Url copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Url(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Url) && C7384Etj.areEqual(this.url, ((Url) obj).url));
        }

        public static /* synthetic */ Url copy$default(Url url, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = url.url;
            }
            C7384Etj.A0Y(str, 0);
            return new Url(str);
        }

        public final String component1() {
            return this.url;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
