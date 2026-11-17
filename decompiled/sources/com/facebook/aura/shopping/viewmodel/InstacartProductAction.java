package com.facebook.aura.shopping.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public interface InstacartProductAction {

    public final class AddToCart implements InstacartProductAction {
        public static final int $stable = 0;
        public static final AddToCart INSTANCE = new AddToCart();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AddToCart);
        }

        public String toString() {
            return "AddToCart";
        }

        public int hashCode() {
            return -853689384;
        }
    }

    public final class OpenLink extends C06G implements InstacartProductAction {
        public static final int $stable = 0;
        public final String label;
        public final String url;

        public OpenLink(String str, String str2) {
            C7384Etj.A0Y(str2, 1);
            this.label = str;
            this.url = str2;
        }

        public final OpenLink copy(String str, String str2) {
            C7384Etj.A0Y(str2, 1);
            return new OpenLink(str, str2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof OpenLink) {
                    OpenLink openLink = (OpenLink) obj;
                    if (!C7384Etj.areEqual(this.label, openLink.label) || !C7384Etj.areEqual(this.url, openLink.url)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ OpenLink copy$default(OpenLink openLink, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = openLink.label;
            }
            if ((i & 2) != 0) {
                str2 = openLink.url;
            }
            C7384Etj.A0Y(str2, 1);
            return new OpenLink(str, str2);
        }

        public final String component1() {
            return this.label;
        }

        public final String component2() {
            return this.url;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.url, AnonymousClass006.A0G(this.label) * 31);
        }

        public String toString() {
            return super.toString();
        }
    }
}
