package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class PasskeyCredentialDescriptorJson extends C06G {
    public final String id;
    public final List<String> transports;
    public final String type;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1V(C79.A01, null, null, PasskeyCredentialDescriptorJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<PasskeyCredentialDescriptorJson> serializer() {
            return PasskeyCredentialDescriptorJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PasskeyCredentialDescriptorJson) {
                PasskeyCredentialDescriptorJson passkeyCredentialDescriptorJson = (PasskeyCredentialDescriptorJson) obj;
                if (!C7384Etj.areEqual(this.id, passkeyCredentialDescriptorJson.id) || !C7384Etj.areEqual(this.type, passkeyCredentialDescriptorJson.type) || !C7384Etj.areEqual(this.transports, passkeyCredentialDescriptorJson.transports)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PasskeyCredentialDescriptorJson copy$default(PasskeyCredentialDescriptorJson passkeyCredentialDescriptorJson, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = passkeyCredentialDescriptorJson.id;
        }
        if ((i & 2) != 0) {
            str2 = passkeyCredentialDescriptorJson.type;
        }
        if ((i & 4) != 0) {
            list = passkeyCredentialDescriptorJson.transports;
        }
        return passkeyCredentialDescriptorJson.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(PasskeyCredentialDescriptorJson passkeyCredentialDescriptorJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(passkeyCredentialDescriptorJson.id)) {
            c9j5.AAV(passkeyCredentialDescriptorJson.id, c9iZ, 0);
        }
        if (zAfR || !"".equals(passkeyCredentialDescriptorJson.type)) {
            c9j5.AAV(passkeyCredentialDescriptorJson.type, c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(passkeyCredentialDescriptorJson.transports)) {
            c9j5.AAQ(passkeyCredentialDescriptorJson.transports, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.type;
    }

    public final List<String> component3() {
        return this.transports;
    }

    public final String getId() {
        return this.id;
    }

    public final List<String> getTransports() {
        return this.transports;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.transports, AnonymousClass005.A0I(this.type, AnonymousClass001.A0G(this.id)));
    }

    public final HatchPasskeyDescriptor toDomain() {
        return new HatchPasskeyDescriptor(this.id, HatchAuthApiJsonKt.PUBLIC_KEY, this.transports);
    }

    public PasskeyCredentialDescriptorJson(String str, String str2, List<String> list) {
        AnonymousClass005.A0x(str, str2, list);
        this.id = str;
        this.type = str2;
        this.transports = list;
    }

    public final PasskeyCredentialDescriptorJson copy(String str, String str2, List<String> list) {
        AnonymousClass005.A0x(str, str2, list);
        return new PasskeyCredentialDescriptorJson(str, str2, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PasskeyCredentialDescriptorJson(int i, String str, String str2, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.type = "";
        } else {
            this.type = str2;
        }
        if ((i & 4) == 0) {
            this.transports = C0881AGi.A00;
        } else {
            this.transports = list;
        }
    }

    public /* synthetic */ PasskeyCredentialDescriptorJson(String str, String str2, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, C3cI.A12(list, i));
    }

    public PasskeyCredentialDescriptorJson() {
        this("", "", C0881AGi.A00);
    }
}
