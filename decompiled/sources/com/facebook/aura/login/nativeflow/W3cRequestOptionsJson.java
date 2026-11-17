package com.facebook.aura.login.nativeflow;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class W3cRequestOptionsJson extends C06G {
    public final List<W3cDescriptorJson> allowCredentials;
    public final String challenge;
    public final String rpId;
    public final long timeout;
    public final String userVerification;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, AbstractC5321DgF.A02(C79.A01, W3cRequestOptionsJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<W3cRequestOptionsJson> serializer() {
            return W3cRequestOptionsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof W3cRequestOptionsJson) {
                W3cRequestOptionsJson w3cRequestOptionsJson = (W3cRequestOptionsJson) obj;
                if (!C7384Etj.areEqual(this.challenge, w3cRequestOptionsJson.challenge) || !C7384Etj.areEqual(this.rpId, w3cRequestOptionsJson.rpId) || this.timeout != w3cRequestOptionsJson.timeout || !C7384Etj.areEqual(this.userVerification, w3cRequestOptionsJson.userVerification) || !C7384Etj.areEqual(this.allowCredentials, w3cRequestOptionsJson.allowCredentials)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ W3cRequestOptionsJson copy$default(W3cRequestOptionsJson w3cRequestOptionsJson, String str, String str2, long j, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = w3cRequestOptionsJson.challenge;
        }
        if ((i & 2) != 0) {
            str2 = w3cRequestOptionsJson.rpId;
        }
        if ((i & 4) != 0) {
            j = w3cRequestOptionsJson.timeout;
        }
        if ((i & 8) != 0) {
            str3 = w3cRequestOptionsJson.userVerification;
        }
        if ((i & 16) != 0) {
            list = w3cRequestOptionsJson.allowCredentials;
        }
        return w3cRequestOptionsJson.copy(str, str2, j, str3, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(W3cRequestOptionsJson w3cRequestOptionsJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(w3cRequestOptionsJson.challenge, c9iZ, 0);
        c9j5.AAV(w3cRequestOptionsJson.rpId, c9iZ, 1);
        c9j5.AAN(c9iZ, 2, w3cRequestOptionsJson.timeout);
        c9j5.AAV(w3cRequestOptionsJson.userVerification, c9iZ, 3);
        c9j5.AAQ(w3cRequestOptionsJson.allowCredentials, C3cH.A15(f0cArr, 4), c9iZ, 4);
    }

    public final String component1() {
        return this.challenge;
    }

    public final String component2() {
        return this.rpId;
    }

    public final long component3() {
        return this.timeout;
    }

    public final String component4() {
        return this.userVerification;
    }

    public final List<W3cDescriptorJson> component5() {
        return this.allowCredentials;
    }

    public final List<W3cDescriptorJson> getAllowCredentials() {
        return this.allowCredentials;
    }

    public final String getChallenge() {
        return this.challenge;
    }

    public final String getRpId() {
        return this.rpId;
    }

    public final long getTimeout() {
        return this.timeout;
    }

    public final String getUserVerification() {
        return this.userVerification;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.allowCredentials, AnonymousClass005.A0I(this.userVerification, AnonymousClass006.A05(this.timeout, AnonymousClass005.A0I(this.rpId, AnonymousClass001.A0G(this.challenge))) * 31));
    }

    public W3cRequestOptionsJson(String str, String str2, long j, String str3, List<W3cDescriptorJson> list) {
        AnonymousClass005.A0y(str, str2, str3);
        C7384Etj.A0Y(list, 4);
        this.challenge = str;
        this.rpId = str2;
        this.timeout = j;
        this.userVerification = str3;
        this.allowCredentials = list;
    }

    public final W3cRequestOptionsJson copy(String str, String str2, long j, String str3, List<W3cDescriptorJson> list) {
        AnonymousClass005.A0y(str, str2, str3);
        C7384Etj.A0Y(list, 4);
        return new W3cRequestOptionsJson(str, str2, j, str3, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ W3cRequestOptionsJson(int i, String str, String str2, long j, String str3, List list, C2hx c2hx) {
        if (31 != (i & 31)) {
            C9iI.A00(W3cRequestOptionsJson$$serializer.descriptor, i, 31);
            throw F60.createAndThrow();
        }
        this.challenge = str;
        this.rpId = str2;
        this.timeout = j;
        this.userVerification = str3;
        this.allowCredentials = list;
    }
}
