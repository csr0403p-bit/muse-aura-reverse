package com.facebook.aura.shopping.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class SavedDefaultRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String citation_id;
    public final String message_id;
    public final String product_id;
    public final String session_id;
    public final String widget_id;

    public final class Companion {
        public final C9hr<SavedDefaultRequestJson> serializer() {
            return SavedDefaultRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(SavedDefaultRequestJson savedDefaultRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || savedDefaultRequestJson.widget_id != null) {
            c9j5.AAP(savedDefaultRequestJson.widget_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || savedDefaultRequestJson.product_id != null) {
            c9j5.AAP(savedDefaultRequestJson.product_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || savedDefaultRequestJson.citation_id != null) {
            c9j5.AAP(savedDefaultRequestJson.citation_id, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || savedDefaultRequestJson.message_id != null) {
            c9j5.AAP(savedDefaultRequestJson.message_id, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || savedDefaultRequestJson.session_id != null) {
            c9j5.AAP(savedDefaultRequestJson.session_id, C07779iq.A01, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SavedDefaultRequestJson) {
                SavedDefaultRequestJson savedDefaultRequestJson = (SavedDefaultRequestJson) obj;
                if (!C7384Etj.areEqual(this.widget_id, savedDefaultRequestJson.widget_id) || !C7384Etj.areEqual(this.product_id, savedDefaultRequestJson.product_id) || !C7384Etj.areEqual(this.citation_id, savedDefaultRequestJson.citation_id) || !C7384Etj.areEqual(this.message_id, savedDefaultRequestJson.message_id) || !C7384Etj.areEqual(this.session_id, savedDefaultRequestJson.session_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SavedDefaultRequestJson copy$default(SavedDefaultRequestJson savedDefaultRequestJson, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savedDefaultRequestJson.widget_id;
        }
        if ((i & 2) != 0) {
            str2 = savedDefaultRequestJson.product_id;
        }
        if ((i & 4) != 0) {
            str3 = savedDefaultRequestJson.citation_id;
        }
        if ((i & 8) != 0) {
            str4 = savedDefaultRequestJson.message_id;
        }
        if ((i & 16) != 0) {
            str5 = savedDefaultRequestJson.session_id;
        }
        return savedDefaultRequestJson.copy(str, str2, str3, str4, str5);
    }

    public final String component1() {
        return this.widget_id;
    }

    public final String component2() {
        return this.product_id;
    }

    public final String component3() {
        return this.citation_id;
    }

    public final String component4() {
        return this.message_id;
    }

    public final String component5() {
        return this.session_id;
    }

    public final SavedDefaultRequestJson copy(String str, String str2, String str3, String str4, String str5) {
        return new SavedDefaultRequestJson(str, str2, str3, str4, str5);
    }

    public final String getCitation_id() {
        return this.citation_id;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final String getProduct_id() {
        return this.product_id;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final String getWidget_id() {
        return this.widget_id;
    }

    public int hashCode() {
        return (((((((AnonymousClass006.A0G(this.widget_id) * 31) + AnonymousClass006.A0G(this.product_id)) * 31) + AnonymousClass006.A0G(this.citation_id)) * 31) + AnonymousClass006.A0G(this.message_id)) * 31) + AnonymousClass005.A0H(this.session_id);
    }

    public /* synthetic */ SavedDefaultRequestJson(int i, String str, String str2, String str3, String str4, String str5, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.widget_id = null;
        } else {
            this.widget_id = str;
        }
        if ((i & 2) == 0) {
            this.product_id = null;
        } else {
            this.product_id = str2;
        }
        if ((i & 4) == 0) {
            this.citation_id = null;
        } else {
            this.citation_id = str3;
        }
        if ((i & 8) == 0) {
            this.message_id = null;
        } else {
            this.message_id = str4;
        }
        if ((i & 16) == 0) {
            this.session_id = null;
        } else {
            this.session_id = str5;
        }
    }

    public String toString() {
        return super.toString();
    }

    public SavedDefaultRequestJson(String str, String str2, String str3, String str4, String str5) {
        this.widget_id = str;
        this.product_id = str2;
        this.citation_id = str3;
        this.message_id = str4;
        this.session_id = str5;
    }

    public /* synthetic */ SavedDefaultRequestJson(String str, String str2, String str3, String str4, String str5, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public SavedDefaultRequestJson() {
        this(null, null, null, null, null);
    }
}
