package com.facebook.aura.sharedcontent;

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
/* loaded from: classes3.dex */
public final class FetchSharedUrlResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String asset_id;
    public final String sandbox_url;
    public final String share_type;
    public final String slug;
    public final String type;
    public final String vm_hostname;

    public final class Companion {
        public final C9hr<FetchSharedUrlResponseJson> serializer() {
            return FetchSharedUrlResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ FetchSharedUrlResponseJson copy$default(FetchSharedUrlResponseJson fetchSharedUrlResponseJson, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        if ((i & 1) != 0) {
            str7 = fetchSharedUrlResponseJson.type;
        }
        if ((i & 2) != 0) {
            str8 = fetchSharedUrlResponseJson.asset_id;
        }
        if ((i & 4) != 0) {
            str9 = fetchSharedUrlResponseJson.slug;
        }
        if ((i & 8) != 0) {
            str10 = fetchSharedUrlResponseJson.sandbox_url;
        }
        if ((i & 16) != 0) {
            str11 = fetchSharedUrlResponseJson.vm_hostname;
        }
        if ((i & 32) != 0) {
            str12 = fetchSharedUrlResponseJson.share_type;
        }
        return new FetchSharedUrlResponseJson(str7, str8, str9, str10, str11, str12);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_sharedcontent_sharedcontent(FetchSharedUrlResponseJson fetchSharedUrlResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || fetchSharedUrlResponseJson.type != null) {
            c9j5.AAP(fetchSharedUrlResponseJson.type, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || fetchSharedUrlResponseJson.asset_id != null) {
            c9j5.AAP(fetchSharedUrlResponseJson.asset_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || fetchSharedUrlResponseJson.slug != null) {
            c9j5.AAP(fetchSharedUrlResponseJson.slug, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || fetchSharedUrlResponseJson.sandbox_url != null) {
            c9j5.AAP(fetchSharedUrlResponseJson.sandbox_url, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || fetchSharedUrlResponseJson.vm_hostname != null) {
            c9j5.AAP(fetchSharedUrlResponseJson.vm_hostname, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || fetchSharedUrlResponseJson.share_type != null) {
            c9j5.AAP(fetchSharedUrlResponseJson.share_type, C07779iq.A01, c9iZ, 5);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FetchSharedUrlResponseJson) {
                FetchSharedUrlResponseJson fetchSharedUrlResponseJson = (FetchSharedUrlResponseJson) obj;
                if (!C7384Etj.areEqual(this.type, fetchSharedUrlResponseJson.type) || !C7384Etj.areEqual(this.asset_id, fetchSharedUrlResponseJson.asset_id) || !C7384Etj.areEqual(this.slug, fetchSharedUrlResponseJson.slug) || !C7384Etj.areEqual(this.sandbox_url, fetchSharedUrlResponseJson.sandbox_url) || !C7384Etj.areEqual(this.vm_hostname, fetchSharedUrlResponseJson.vm_hostname) || !C7384Etj.areEqual(this.share_type, fetchSharedUrlResponseJson.share_type)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.asset_id;
    }

    public final String component3() {
        return this.slug;
    }

    public final String component4() {
        return this.sandbox_url;
    }

    public final String component5() {
        return this.vm_hostname;
    }

    public final String component6() {
        return this.share_type;
    }

    public final FetchSharedUrlResponseJson copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new FetchSharedUrlResponseJson(str, str2, str3, str4, str5, str6);
    }

    public final String getAsset_id() {
        return this.asset_id;
    }

    public final String getSandbox_url() {
        return this.sandbox_url;
    }

    public final String getShare_type() {
        return this.share_type;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final String getType() {
        return this.type;
    }

    public final String getVm_hostname() {
        return this.vm_hostname;
    }

    public int hashCode() {
        return (((((((((AnonymousClass006.A0G(this.type) * 31) + AnonymousClass006.A0G(this.asset_id)) * 31) + AnonymousClass006.A0G(this.slug)) * 31) + AnonymousClass006.A0G(this.sandbox_url)) * 31) + AnonymousClass006.A0G(this.vm_hostname)) * 31) + AnonymousClass005.A0H(this.share_type);
    }

    public FetchSharedUrlResponseJson(String str, String str2, String str3, String str4, String str5, String str6) {
        this.type = str;
        this.asset_id = str2;
        this.slug = str3;
        this.sandbox_url = str4;
        this.vm_hostname = str5;
        this.share_type = str6;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FetchSharedUrlResponseJson(String str, String str2, String str3, String str4, String str5, String str6, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }

    public /* synthetic */ FetchSharedUrlResponseJson(int i, String str, String str2, String str3, String str4, String str5, String str6, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.asset_id = null;
        } else {
            this.asset_id = str2;
        }
        if ((i & 4) == 0) {
            this.slug = null;
        } else {
            this.slug = str3;
        }
        if ((i & 8) == 0) {
            this.sandbox_url = null;
        } else {
            this.sandbox_url = str4;
        }
        if ((i & 16) == 0) {
            this.vm_hostname = null;
        } else {
            this.vm_hostname = str5;
        }
        if ((i & 32) == 0) {
            this.share_type = null;
        } else {
            this.share_type = str6;
        }
    }

    public FetchSharedUrlResponseJson() {
        this(null, null, null, null, null, null);
    }
}
