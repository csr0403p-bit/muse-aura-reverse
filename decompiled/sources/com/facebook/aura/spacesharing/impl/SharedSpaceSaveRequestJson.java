package com.facebook.aura.spacesharing.impl;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C8j4;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class SharedSpaceSaveRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String share_url;
    public final String shortcode;

    public final class Companion {
        public final C9hr<SharedSpaceSaveRequestJson> serializer() {
            return SharedSpaceSaveRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SharedSpaceSaveRequestJson(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.shortcode = str;
        this.share_url = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_spacesharing_impl_impl(SharedSpaceSaveRequestJson sharedSpaceSaveRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(sharedSpaceSaveRequestJson.shortcode, c9iZ, 0);
        if (c9j5.AfR() || sharedSpaceSaveRequestJson.share_url != null) {
            c9j5.AAP(sharedSpaceSaveRequestJson.share_url, C07779iq.A01, c9iZ, 1);
        }
    }

    public final SharedSpaceSaveRequestJson copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new SharedSpaceSaveRequestJson(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SharedSpaceSaveRequestJson) {
                SharedSpaceSaveRequestJson sharedSpaceSaveRequestJson = (SharedSpaceSaveRequestJson) obj;
                if (!C7384Etj.areEqual(this.shortcode, sharedSpaceSaveRequestJson.shortcode) || !C7384Etj.areEqual(this.share_url, sharedSpaceSaveRequestJson.share_url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SharedSpaceSaveRequestJson copy$default(SharedSpaceSaveRequestJson sharedSpaceSaveRequestJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sharedSpaceSaveRequestJson.shortcode;
        }
        if ((i & 2) != 0) {
            str2 = sharedSpaceSaveRequestJson.share_url;
        }
        C7384Etj.A0Y(str, 0);
        return new SharedSpaceSaveRequestJson(str, str2);
    }

    public final String component1() {
        return this.shortcode;
    }

    public final String component2() {
        return this.share_url;
    }

    public final String getShare_url() {
        return this.share_url;
    }

    public final String getShortcode() {
        return this.shortcode;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.shortcode) + AnonymousClass006.A0G(this.share_url);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SharedSpaceSaveRequestJson(int i, String str, String str2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(SharedSpaceSaveRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.shortcode = str;
        this.share_url = C8j4.A0t(i, str2);
    }

    public /* synthetic */ SharedSpaceSaveRequestJson(String str, String str2, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2));
    }
}
