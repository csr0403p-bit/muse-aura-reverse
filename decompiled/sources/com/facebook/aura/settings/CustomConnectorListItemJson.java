package com.facebook.aura.settings;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
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
public final class CustomConnectorListItemJson extends C06G {
    public static final int $stable = 8;
    public final boolean connected;
    public final boolean disabled;
    public final List<String> hosts;
    public final String mode;
    public final String name;
    public final boolean privsep;
    public final String schema;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, AbstractC5321DgF.A02(C79.A01, CustomConnectorListItemJson$Companion$$childSerializers$1.INSTANCE), null, null, null, null, null};

    public final class Companion {
        public final C9hr<CustomConnectorListItemJson> serializer() {
            return CustomConnectorListItemJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CustomConnectorListItemJson) {
                CustomConnectorListItemJson customConnectorListItemJson = (CustomConnectorListItemJson) obj;
                if (!C7384Etj.areEqual(this.name, customConnectorListItemJson.name) || !C7384Etj.areEqual(this.hosts, customConnectorListItemJson.hosts) || !C7384Etj.areEqual(this.schema, customConnectorListItemJson.schema) || !C7384Etj.areEqual(this.mode, customConnectorListItemJson.mode) || this.privsep != customConnectorListItemJson.privsep || this.disabled != customConnectorListItemJson.disabled || this.connected != customConnectorListItemJson.connected) {
                }
            }
            return false;
        }
        return true;
    }

    public CustomConnectorListItemJson() {
        this("", C0881AGi.A00, "", "", false, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomConnectorListItemJson copy$default(CustomConnectorListItemJson customConnectorListItemJson, String str, List list, String str2, String str3, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customConnectorListItemJson.name;
        }
        if ((i & 2) != 0) {
            list = customConnectorListItemJson.hosts;
        }
        if ((i & 4) != 0) {
            str2 = customConnectorListItemJson.schema;
        }
        if ((i & 8) != 0) {
            str3 = customConnectorListItemJson.mode;
        }
        if ((i & 16) != 0) {
            z = customConnectorListItemJson.privsep;
        }
        if ((i & 32) != 0) {
            z2 = customConnectorListItemJson.disabled;
        }
        if ((i & 64) != 0) {
            z3 = customConnectorListItemJson.connected;
        }
        return customConnectorListItemJson.copy(str, list, str2, str3, z, z2, z3);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_settings(CustomConnectorListItemJson customConnectorListItemJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(customConnectorListItemJson.name)) {
            c9j5.AAV(customConnectorListItemJson.name, c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(customConnectorListItemJson.hosts)) {
            c9j5.AAQ(customConnectorListItemJson.hosts, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || !"".equals(customConnectorListItemJson.schema)) {
            c9j5.AAV(customConnectorListItemJson.schema, c9iZ, 2);
        }
        if (zAfR || !"".equals(customConnectorListItemJson.mode)) {
            c9j5.AAV(customConnectorListItemJson.mode, c9iZ, 3);
        }
        if (zAfR || customConnectorListItemJson.privsep) {
            c9j5.AA7(c9iZ, 4, customConnectorListItemJson.privsep);
        }
        if (zAfR || customConnectorListItemJson.disabled) {
            c9j5.AA7(c9iZ, 5, customConnectorListItemJson.disabled);
        }
        if (zAfR || customConnectorListItemJson.connected) {
            c9j5.AA7(c9iZ, 6, customConnectorListItemJson.connected);
        }
    }

    public final String component1() {
        return this.name;
    }

    public final List<String> component2() {
        return this.hosts;
    }

    public final String component3() {
        return this.schema;
    }

    public final String component4() {
        return this.mode;
    }

    public final boolean component5() {
        return this.privsep;
    }

    public final boolean component6() {
        return this.disabled;
    }

    public final boolean component7() {
        return this.connected;
    }

    public final boolean getConnected() {
        return this.connected;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public final List<String> getHosts() {
        return this.hosts;
    }

    public final String getMode() {
        return this.mode;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getPrivsep() {
        return this.privsep;
    }

    public final String getSchema() {
        return this.schema;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.mode, AnonymousClass005.A0I(this.schema, AnonymousClass005.A0F(this.hosts, AnonymousClass001.A0G(this.name)))), this.privsep), this.disabled), this.connected);
    }

    public final CustomConnectorListItemJson copy(String str, List<String> list, String str2, String str3, boolean z, boolean z2, boolean z3) {
        AnonymousClass005.A14(str, list, str2, str3);
        return new CustomConnectorListItemJson(str, list, str2, str3, z, z2, z3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CustomConnectorListItemJson(int i, String str, List list, String str2, String str3, boolean z, boolean z2, boolean z3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.hosts = C0881AGi.A00;
        } else {
            this.hosts = list;
        }
        if ((i & 4) == 0) {
            this.schema = "";
        } else {
            this.schema = str2;
        }
        if ((i & 8) == 0) {
            this.mode = "";
        } else {
            this.mode = str3;
        }
        if ((i & 16) == 0) {
            this.privsep = false;
        } else {
            this.privsep = z;
        }
        if ((i & 32) == 0) {
            this.disabled = false;
        } else {
            this.disabled = z2;
        }
        if ((i & 64) == 0) {
            this.connected = false;
        } else {
            this.connected = z3;
        }
    }

    public CustomConnectorListItemJson(String str, List<String> list, String str2, String str3, boolean z, boolean z2, boolean z3) {
        AnonymousClass005.A14(str, list, str2, str3);
        this.name = str;
        this.hosts = list;
        this.schema = str2;
        this.mode = str3;
        this.privsep = z;
        this.disabled = z2;
        this.connected = z3;
    }

    public /* synthetic */ CustomConnectorListItemJson(String str, List list, String str2, String str3, boolean z, boolean z2, boolean z3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, C3cI.A11(list, i), (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, AnonymousClass005.A1Q(i, z), (i & 32) != 0 ? false : z2, C3cH.A1M(i, z3));
    }
}
