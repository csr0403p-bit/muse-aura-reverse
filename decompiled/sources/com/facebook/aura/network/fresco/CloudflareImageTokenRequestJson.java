package com.facebook.aura.network.fresco;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class CloudflareImageTokenRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final boolean include_recipient_identities;
    public final String share_key;
    public final String shortcode;

    public final class Companion {
        public final C9hr<CloudflareImageTokenRequestJson> serializer() {
            return CloudflareImageTokenRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public CloudflareImageTokenRequestJson(String str, boolean z, String str2) {
        C7384Etj.A0Y(str, 0);
        this.shortcode = str;
        this.include_recipient_identities = z;
        this.share_key = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_network_fresco_fresco(CloudflareImageTokenRequestJson cloudflareImageTokenRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(cloudflareImageTokenRequestJson.shortcode, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || !cloudflareImageTokenRequestJson.include_recipient_identities) {
            c9j5.AA7(c9iZ, 1, cloudflareImageTokenRequestJson.include_recipient_identities);
        }
        if (zAfR || cloudflareImageTokenRequestJson.share_key != null) {
            c9j5.AAP(cloudflareImageTokenRequestJson.share_key, C07779iq.A01, c9iZ, 2);
        }
    }

    public final CloudflareImageTokenRequestJson copy(String str, boolean z, String str2) {
        C7384Etj.A0Y(str, 0);
        return new CloudflareImageTokenRequestJson(str, z, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CloudflareImageTokenRequestJson) {
                CloudflareImageTokenRequestJson cloudflareImageTokenRequestJson = (CloudflareImageTokenRequestJson) obj;
                if (!C7384Etj.areEqual(this.shortcode, cloudflareImageTokenRequestJson.shortcode) || this.include_recipient_identities != cloudflareImageTokenRequestJson.include_recipient_identities || !C7384Etj.areEqual(this.share_key, cloudflareImageTokenRequestJson.share_key)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CloudflareImageTokenRequestJson copy$default(CloudflareImageTokenRequestJson cloudflareImageTokenRequestJson, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cloudflareImageTokenRequestJson.shortcode;
        }
        if ((i & 2) != 0) {
            z = cloudflareImageTokenRequestJson.include_recipient_identities;
        }
        if ((i & 4) != 0) {
            str2 = cloudflareImageTokenRequestJson.share_key;
        }
        return cloudflareImageTokenRequestJson.copy(str, z, str2);
    }

    public final String component1() {
        return this.shortcode;
    }

    public final boolean component2() {
        return this.include_recipient_identities;
    }

    public final String component3() {
        return this.share_key;
    }

    public final boolean getInclude_recipient_identities() {
        return this.include_recipient_identities;
    }

    public final String getShare_key() {
        return this.share_key;
    }

    public final String getShortcode() {
        return this.shortcode;
    }

    public int hashCode() {
        return C0KA.A01(AnonymousClass001.A0G(this.shortcode), this.include_recipient_identities) + AnonymousClass006.A0G(this.share_key);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CloudflareImageTokenRequestJson(int i, String str, boolean z, String str2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(CloudflareImageTokenRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.shortcode = str;
        if ((i & 2) == 0) {
            this.include_recipient_identities = true;
        } else {
            this.include_recipient_identities = z;
        }
        if ((i & 4) == 0) {
            this.share_key = null;
        } else {
            this.share_key = str2;
        }
    }

    public /* synthetic */ CloudflareImageTokenRequestJson(String str, boolean z, String str2, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? true : z, AnonymousClass006.A0t(i, str2));
    }
}
