package com.facebook.aura.partners.accountlinking.nativeauthlogging;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class NativeAuthAccountJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String access_token;
    public final String credential_source;
    public final String source_app;

    public final class Companion {
        public final C9hr<NativeAuthAccountJson> serializer() {
            return NativeAuthAccountJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_accountlinking_nativeauthlogging_nativeauthlogging(NativeAuthAccountJson nativeAuthAccountJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(nativeAuthAccountJson.source_app, c9iZ, 0);
        c9j5.AAV(nativeAuthAccountJson.credential_source, c9iZ, 1);
        c9j5.AAV(nativeAuthAccountJson.access_token, c9iZ, 2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NativeAuthAccountJson) {
                NativeAuthAccountJson nativeAuthAccountJson = (NativeAuthAccountJson) obj;
                if (!C7384Etj.areEqual(this.source_app, nativeAuthAccountJson.source_app) || !C7384Etj.areEqual(this.credential_source, nativeAuthAccountJson.credential_source) || !C7384Etj.areEqual(this.access_token, nativeAuthAccountJson.access_token)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NativeAuthAccountJson copy$default(NativeAuthAccountJson nativeAuthAccountJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nativeAuthAccountJson.source_app;
        }
        if ((i & 2) != 0) {
            str2 = nativeAuthAccountJson.credential_source;
        }
        if ((i & 4) != 0) {
            str3 = nativeAuthAccountJson.access_token;
        }
        return nativeAuthAccountJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.source_app;
    }

    public final String component2() {
        return this.credential_source;
    }

    public final String component3() {
        return this.access_token;
    }

    public final String getAccess_token() {
        return this.access_token;
    }

    public final String getCredential_source() {
        return this.credential_source;
    }

    public final String getSource_app() {
        return this.source_app;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.access_token, AnonymousClass005.A0I(this.credential_source, AnonymousClass001.A0G(this.source_app)));
    }

    public NativeAuthAccountJson(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.source_app = str;
        this.credential_source = str2;
        this.access_token = str3;
    }

    public final NativeAuthAccountJson copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new NativeAuthAccountJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NativeAuthAccountJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(NativeAuthAccountJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.source_app = str;
        this.credential_source = str2;
        this.access_token = str3;
    }
}
