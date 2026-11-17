package com.facebook.aura.skills.viewmodel;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public interface DirectSignInOutcome {

    public final class OpenSignInPage extends C06G implements DirectSignInOutcome {
        public final String url;

        public OpenSignInPage(String str) {
            C7384Etj.A0Y(str, 0);
            this.url = str;
        }

        public final OpenSignInPage copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new OpenSignInPage(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof OpenSignInPage) && C7384Etj.areEqual(this.url, ((OpenSignInPage) obj).url));
        }

        public static /* synthetic */ OpenSignInPage copy$default(OpenSignInPage openSignInPage, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = openSignInPage.url;
            }
            C7384Etj.A0Y(str, 0);
            return new OpenSignInPage(str);
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

    public final class ShowConnectSheet implements DirectSignInOutcome {
        public static final ShowConnectSheet INSTANCE = new ShowConnectSheet();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowConnectSheet);
        }

        public String toString() {
            return "ShowConnectSheet";
        }

        public int hashCode() {
            return -1916798753;
        }
    }
}
