package com.facebook.aura.login.nativeflow;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class PasskeyRequestOptionsJson extends C06G {
    public final List<PasskeyCredentialDescriptorJson> allow_credentials;
    public final String challenge;
    public final String rp_id;
    public final long timeout_ms;
    public final String user_verification;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, AbstractC5321DgF.A02(C79.A01, PasskeyRequestOptionsJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<PasskeyRequestOptionsJson> serializer() {
            return PasskeyRequestOptionsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PasskeyRequestOptionsJson) {
                PasskeyRequestOptionsJson passkeyRequestOptionsJson = (PasskeyRequestOptionsJson) obj;
                if (!C7384Etj.areEqual(this.challenge, passkeyRequestOptionsJson.challenge) || !C7384Etj.areEqual(this.rp_id, passkeyRequestOptionsJson.rp_id) || !C7384Etj.areEqual(this.user_verification, passkeyRequestOptionsJson.user_verification) || this.timeout_ms != passkeyRequestOptionsJson.timeout_ms || !C7384Etj.areEqual(this.allow_credentials, passkeyRequestOptionsJson.allow_credentials)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PasskeyRequestOptionsJson copy$default(PasskeyRequestOptionsJson passkeyRequestOptionsJson, String str, String str2, String str3, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = passkeyRequestOptionsJson.challenge;
        }
        if ((i & 2) != 0) {
            str2 = passkeyRequestOptionsJson.rp_id;
        }
        if ((i & 4) != 0) {
            str3 = passkeyRequestOptionsJson.user_verification;
        }
        if ((i & 8) != 0) {
            j = passkeyRequestOptionsJson.timeout_ms;
        }
        if ((i & 16) != 0) {
            list = passkeyRequestOptionsJson.allow_credentials;
        }
        return passkeyRequestOptionsJson.copy(str, str2, str3, j, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(PasskeyRequestOptionsJson passkeyRequestOptionsJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(passkeyRequestOptionsJson.challenge)) {
            c9j5.AAV(passkeyRequestOptionsJson.challenge, c9iZ, 0);
        }
        if (zAfR || !"".equals(passkeyRequestOptionsJson.rp_id)) {
            c9j5.AAV(passkeyRequestOptionsJson.rp_id, c9iZ, 1);
        }
        if (zAfR || !"".equals(passkeyRequestOptionsJson.user_verification)) {
            c9j5.AAV(passkeyRequestOptionsJson.user_verification, c9iZ, 2);
        }
        if (zAfR || passkeyRequestOptionsJson.timeout_ms != 0) {
            c9j5.AAN(c9iZ, 3, passkeyRequestOptionsJson.timeout_ms);
        }
        if (zAfR || !C3cG.A1L(passkeyRequestOptionsJson.allow_credentials)) {
            c9j5.AAQ(passkeyRequestOptionsJson.allow_credentials, C3cH.A15(f0cArr, 4), c9iZ, 4);
        }
    }

    public final String component1() {
        return this.challenge;
    }

    public final String component2() {
        return this.rp_id;
    }

    public final String component3() {
        return this.user_verification;
    }

    public final long component4() {
        return this.timeout_ms;
    }

    public final List<PasskeyCredentialDescriptorJson> component5() {
        return this.allow_credentials;
    }

    public final List<PasskeyCredentialDescriptorJson> getAllow_credentials() {
        return this.allow_credentials;
    }

    public final String getChallenge() {
        return this.challenge;
    }

    public final String getRp_id() {
        return this.rp_id;
    }

    public final long getTimeout_ms() {
        return this.timeout_ms;
    }

    public final String getUser_verification() {
        return this.user_verification;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.allow_credentials, AnonymousClass006.A05(this.timeout_ms, AnonymousClass005.A0I(this.user_verification, AnonymousClass005.A0I(this.rp_id, AnonymousClass001.A0G(this.challenge)))) * 31);
    }

    public final HatchPasskeyRequestOptions toDomain() {
        String str;
        if (C7BY.A0j(this.challenge) || C7BY.A0j(this.rp_id)) {
            return null;
        }
        List<PasskeyCredentialDescriptorJson> list = this.allow_credentials;
        ArrayList arrayListA0h = C3cG.A0h();
        for (PasskeyCredentialDescriptorJson passkeyCredentialDescriptorJson : list) {
            PasskeyCredentialDescriptorJson passkeyCredentialDescriptorJson2 = passkeyCredentialDescriptorJson;
            if (!C7BY.A0j(passkeyCredentialDescriptorJson2.id) && (str = passkeyCredentialDescriptorJson2.type) != null && str.equalsIgnoreCase(HatchAuthApiJsonKt.PUBLIC_KEY)) {
                arrayListA0h.add(passkeyCredentialDescriptorJson);
            }
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h);
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(((PasskeyCredentialDescriptorJson) it.next()).toDomain());
        }
        if (this.allow_credentials.isEmpty() || !arrayListA0i.isEmpty()) {
            return new HatchPasskeyRequestOptions(this.challenge, this.rp_id, this.user_verification, this.timeout_ms, arrayListA0i);
        }
        return null;
    }

    public PasskeyRequestOptionsJson(String str, String str2, String str3, long j, List<PasskeyCredentialDescriptorJson> list) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(list, 4);
        this.challenge = str;
        this.rp_id = str2;
        this.user_verification = str3;
        this.timeout_ms = j;
        this.allow_credentials = list;
    }

    public final PasskeyRequestOptionsJson copy(String str, String str2, String str3, long j, List<PasskeyCredentialDescriptorJson> list) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(list, 4);
        return new PasskeyRequestOptionsJson(str, str2, str3, j, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PasskeyRequestOptionsJson(String str, String str2, String str3, long j, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? C0881AGi.A00 : list);
    }

    public /* synthetic */ PasskeyRequestOptionsJson(int i, String str, String str2, String str3, long j, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.challenge = "";
        } else {
            this.challenge = str;
        }
        if ((i & 2) == 0) {
            this.rp_id = "";
        } else {
            this.rp_id = str2;
        }
        if ((i & 4) == 0) {
            this.user_verification = "";
        } else {
            this.user_verification = str3;
        }
        if ((i & 8) == 0) {
            this.timeout_ms = 0L;
        } else {
            this.timeout_ms = j;
        }
        if ((i & 16) == 0) {
            this.allow_credentials = C0881AGi.A00;
        } else {
            this.allow_credentials = list;
        }
    }

    public PasskeyRequestOptionsJson() {
        this("", "", "", 0L, C0881AGi.A00);
    }
}
