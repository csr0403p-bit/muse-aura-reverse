package com.facebook.aura.activation.repo;

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
public final class AcceptTosRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String disclosure_text;
    public final String disclosure_version;
    public final String retos_content_version;

    public final class Companion {
        public final C9hr<AcceptTosRequestJson> serializer() {
            return AcceptTosRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo(AcceptTosRequestJson acceptTosRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || acceptTosRequestJson.disclosure_text != null) {
            c9j5.AAP(acceptTosRequestJson.disclosure_text, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || acceptTosRequestJson.disclosure_version != null) {
            c9j5.AAP(acceptTosRequestJson.disclosure_version, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || acceptTosRequestJson.retos_content_version != null) {
            c9j5.AAP(acceptTosRequestJson.retos_content_version, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AcceptTosRequestJson) {
                AcceptTosRequestJson acceptTosRequestJson = (AcceptTosRequestJson) obj;
                if (!C7384Etj.areEqual(this.disclosure_text, acceptTosRequestJson.disclosure_text) || !C7384Etj.areEqual(this.disclosure_version, acceptTosRequestJson.disclosure_version) || !C7384Etj.areEqual(this.retos_content_version, acceptTosRequestJson.retos_content_version)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AcceptTosRequestJson copy$default(AcceptTosRequestJson acceptTosRequestJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = acceptTosRequestJson.disclosure_text;
        }
        if ((i & 2) != 0) {
            str2 = acceptTosRequestJson.disclosure_version;
        }
        if ((i & 4) != 0) {
            str3 = acceptTosRequestJson.retos_content_version;
        }
        return new AcceptTosRequestJson(str, str2, str3);
    }

    public final String component1() {
        return this.disclosure_text;
    }

    public final String component2() {
        return this.disclosure_version;
    }

    public final String component3() {
        return this.retos_content_version;
    }

    public final AcceptTosRequestJson copy(String str, String str2, String str3) {
        return new AcceptTosRequestJson(str, str2, str3);
    }

    public final String getDisclosure_text() {
        return this.disclosure_text;
    }

    public final String getDisclosure_version() {
        return this.disclosure_version;
    }

    public final String getRetos_content_version() {
        return this.retos_content_version;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.disclosure_text) * 31) + AnonymousClass006.A0G(this.disclosure_version)) * 31) + AnonymousClass005.A0H(this.retos_content_version);
    }

    public AcceptTosRequestJson(String str, String str2, String str3) {
        this.disclosure_text = str;
        this.disclosure_version = str2;
        this.retos_content_version = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AcceptTosRequestJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.disclosure_text = null;
        } else {
            this.disclosure_text = str;
        }
        if ((i & 2) == 0) {
            this.disclosure_version = null;
        } else {
            this.disclosure_version = str2;
        }
        if ((i & 4) == 0) {
            this.retos_content_version = null;
        } else {
            this.retos_content_version = str3;
        }
    }

    public /* synthetic */ AcceptTosRequestJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public AcceptTosRequestJson() {
        this(null, null, null);
    }
}
