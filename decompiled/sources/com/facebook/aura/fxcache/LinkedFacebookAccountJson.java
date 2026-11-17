package com.facebook.aura.fxcache;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class LinkedFacebookAccountJson extends C06G {
    public static final Companion Companion = new Companion();
    public final boolean connected;
    public final String fb_user_id;
    public final String name;
    public final String profile_pic_url;

    public final class Companion {
        public final C9hr<LinkedFacebookAccountJson> serializer() {
            return LinkedFacebookAccountJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public LinkedFacebookAccountJson() {
        this(null, null, null, false);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_fxcache_fxcache(LinkedFacebookAccountJson linkedFacebookAccountJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || linkedFacebookAccountJson.fb_user_id != null) {
            c9j5.AAP(linkedFacebookAccountJson.fb_user_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || linkedFacebookAccountJson.name != null) {
            c9j5.AAP(linkedFacebookAccountJson.name, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || linkedFacebookAccountJson.profile_pic_url != null) {
            c9j5.AAP(linkedFacebookAccountJson.profile_pic_url, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || linkedFacebookAccountJson.connected) {
            c9j5.AA7(c9iZ, 3, linkedFacebookAccountJson.connected);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkedFacebookAccountJson) {
                LinkedFacebookAccountJson linkedFacebookAccountJson = (LinkedFacebookAccountJson) obj;
                if (!C7384Etj.areEqual(this.fb_user_id, linkedFacebookAccountJson.fb_user_id) || !C7384Etj.areEqual(this.name, linkedFacebookAccountJson.name) || !C7384Etj.areEqual(this.profile_pic_url, linkedFacebookAccountJson.profile_pic_url) || this.connected != linkedFacebookAccountJson.connected) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LinkedFacebookAccountJson copy$default(LinkedFacebookAccountJson linkedFacebookAccountJson, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkedFacebookAccountJson.fb_user_id;
        }
        if ((i & 2) != 0) {
            str2 = linkedFacebookAccountJson.name;
        }
        if ((i & 4) != 0) {
            str3 = linkedFacebookAccountJson.profile_pic_url;
        }
        if ((i & 8) != 0) {
            z = linkedFacebookAccountJson.connected;
        }
        return new LinkedFacebookAccountJson(str, str2, str3, z);
    }

    public final String component1() {
        return this.fb_user_id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.profile_pic_url;
    }

    public final boolean component4() {
        return this.connected;
    }

    public final LinkedFacebookAccountJson copy(String str, String str2, String str3, boolean z) {
        return new LinkedFacebookAccountJson(str, str2, str3, z);
    }

    public final boolean getConnected() {
        return this.connected;
    }

    public final String getFb_user_id() {
        return this.fb_user_id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProfile_pic_url() {
        return this.profile_pic_url;
    }

    public int hashCode() {
        return C0KA.A00(((((AnonymousClass006.A0G(this.fb_user_id) * 31) + AnonymousClass006.A0G(this.name)) * 31) + AnonymousClass005.A0H(this.profile_pic_url)) * 31, this.connected);
    }

    public String toString() {
        return super.toString();
    }

    public LinkedFacebookAccountJson(String str, String str2, String str3, boolean z) {
        this.fb_user_id = str;
        this.name = str2;
        this.profile_pic_url = str3;
        this.connected = z;
    }

    public /* synthetic */ LinkedFacebookAccountJson(String str, String str2, String str3, boolean z, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, AnonymousClass005.A1P(i, z));
    }

    public /* synthetic */ LinkedFacebookAccountJson(int i, String str, String str2, String str3, boolean z, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.fb_user_id = null;
        } else {
            this.fb_user_id = str;
        }
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.profile_pic_url = null;
        } else {
            this.profile_pic_url = str3;
        }
        if ((i & 8) == 0) {
            this.connected = false;
        } else {
            this.connected = z;
        }
    }
}
