package com.facebook.aura.permissions.defaults;

import X.AGI;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.permissions.defaults.PermissionDefaultMode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PermissionSettingsResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final List<ConfidentialVmSettingJson> confidential_vm;
    public final String confidential_vm_heading;
    public final String connector_default;
    public final PermissionDefaultsContentJson default_content;
    public final String network_default;

    public final class Companion {
        public final C9hr<PermissionSettingsResponseJson> serializer() {
            return PermissionSettingsResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_permissions_defaults_defaults(PermissionSettingsResponseJson permissionSettingsResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || permissionSettingsResponseJson.connector_default != null) {
            c9j5.AAP(permissionSettingsResponseJson.connector_default, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || permissionSettingsResponseJson.network_default != null) {
            c9j5.AAP(permissionSettingsResponseJson.network_default, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || permissionSettingsResponseJson.default_content != null) {
            c9j5.AAP(permissionSettingsResponseJson.default_content, PermissionDefaultsContentJson$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || permissionSettingsResponseJson.confidential_vm_heading != null) {
            c9j5.AAP(permissionSettingsResponseJson.confidential_vm_heading, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || permissionSettingsResponseJson.confidential_vm != null) {
            c9j5.AAP(permissionSettingsResponseJson.confidential_vm, ConfidentialVmRowsSerializer.INSTANCE, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PermissionSettingsResponseJson) {
                PermissionSettingsResponseJson permissionSettingsResponseJson = (PermissionSettingsResponseJson) obj;
                if (!C7384Etj.areEqual(this.connector_default, permissionSettingsResponseJson.connector_default) || !C7384Etj.areEqual(this.network_default, permissionSettingsResponseJson.network_default) || !C7384Etj.areEqual(this.default_content, permissionSettingsResponseJson.default_content) || !C7384Etj.areEqual(this.confidential_vm_heading, permissionSettingsResponseJson.confidential_vm_heading) || !C7384Etj.areEqual(this.confidential_vm, permissionSettingsResponseJson.confidential_vm)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PermissionSettingsResponseJson copy$default(PermissionSettingsResponseJson permissionSettingsResponseJson, String str, String str2, PermissionDefaultsContentJson permissionDefaultsContentJson, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = permissionSettingsResponseJson.connector_default;
        }
        if ((i & 2) != 0) {
            str2 = permissionSettingsResponseJson.network_default;
        }
        if ((i & 4) != 0) {
            permissionDefaultsContentJson = permissionSettingsResponseJson.default_content;
        }
        if ((i & 8) != 0) {
            str3 = permissionSettingsResponseJson.confidential_vm_heading;
        }
        if ((i & 16) != 0) {
            list = permissionSettingsResponseJson.confidential_vm;
        }
        return permissionSettingsResponseJson.copy(str, str2, permissionDefaultsContentJson, str3, list);
    }

    @Serializable(with = ConfidentialVmRowsSerializer.class)
    public static /* synthetic */ void getConfidential_vm$annotations() {
    }

    public final String component1() {
        return this.connector_default;
    }

    public final String component2() {
        return this.network_default;
    }

    public final PermissionDefaultsContentJson component3() {
        return this.default_content;
    }

    public final String component4() {
        return this.confidential_vm_heading;
    }

    public final List<ConfidentialVmSettingJson> component5() {
        return this.confidential_vm;
    }

    public final PermissionSettingsResponseJson copy(String str, String str2, PermissionDefaultsContentJson permissionDefaultsContentJson, String str3, List<ConfidentialVmSettingJson> list) {
        return new PermissionSettingsResponseJson(str, str2, permissionDefaultsContentJson, str3, list);
    }

    public final List<ConfidentialVmSettingJson> getConfidential_vm() {
        return this.confidential_vm;
    }

    public final String getConfidential_vm_heading() {
        return this.confidential_vm_heading;
    }

    public final String getConnector_default() {
        return this.connector_default;
    }

    public final PermissionDefaultsContentJson getDefault_content() {
        return this.default_content;
    }

    public final String getNetwork_default() {
        return this.network_default;
    }

    public int hashCode() {
        return (((((((AnonymousClass006.A0G(this.connector_default) * 31) + AnonymousClass006.A0G(this.network_default)) * 31) + AnonymousClass006.A0D(this.default_content)) * 31) + AnonymousClass006.A0G(this.confidential_vm_heading)) * 31) + C3cH.A02(this.confidential_vm);
    }

    public final ConfidentialVmSettings toConfidentialVmSettings() {
        ArrayList arrayListA0h;
        List<ConfidentialVmSettingJson> list = this.confidential_vm;
        if (list != null) {
            ArrayList arrayListA0h2 = C3cG.A0h();
            Iterator<ConfidentialVmSettingJson> it = list.iterator();
            while (it.hasNext()) {
                ConfidentialVmToggle toggle = it.next().toToggle();
                if (toggle != null) {
                    arrayListA0h2.add(toggle);
                }
            }
            HashSet hashSetA13 = C60O.A13();
            arrayListA0h = C3cG.A0h();
            for (Object obj : arrayListA0h2) {
                if (hashSetA13.add(((ConfidentialVmToggle) obj).key)) {
                    arrayListA0h.add(obj);
                }
            }
        } else {
            arrayListA0h = null;
        }
        String str = this.confidential_vm_heading;
        if (str == null || C7BY.A0j(str) || arrayListA0h == null || arrayListA0h.isEmpty()) {
            return null;
        }
        return new ConfidentialVmSettings(this.confidential_vm_heading, AGI.A07(arrayListA0h));
    }

    public final PermissionSettings toDomain() {
        PermissionDefaultSurfaceContentJson permissionDefaultSurfaceContentJson;
        PermissionDefaultSurfaceContentJson permissionDefaultSurfaceContentJson2;
        PermissionDefaultMode.Companion companion = PermissionDefaultMode.Companion;
        PermissionDefaultMode permissionDefaultModeFromWire = companion.fromWire(this.connector_default);
        PermissionDefaultMode permissionDefaultModeFromWire2 = companion.fromWire(this.network_default);
        PermissionDefaultsContentJson permissionDefaultsContentJson = this.default_content;
        PermissionDefaultSurfaceContent domain = null;
        PermissionDefaultSurfaceContent domain2 = (permissionDefaultsContentJson == null || (permissionDefaultSurfaceContentJson2 = permissionDefaultsContentJson.connector) == null) ? null : permissionDefaultSurfaceContentJson2.toDomain();
        PermissionDefaultsContentJson permissionDefaultsContentJson2 = this.default_content;
        if (permissionDefaultsContentJson2 != null && (permissionDefaultSurfaceContentJson = permissionDefaultsContentJson2.network) != null) {
            domain = permissionDefaultSurfaceContentJson.toDomain();
        }
        return new PermissionSettings(permissionDefaultModeFromWire, permissionDefaultModeFromWire2, domain2, domain);
    }

    public PermissionSettingsResponseJson(String str, String str2, PermissionDefaultsContentJson permissionDefaultsContentJson, String str3, List<ConfidentialVmSettingJson> list) {
        this.connector_default = str;
        this.network_default = str2;
        this.default_content = permissionDefaultsContentJson;
        this.confidential_vm_heading = str3;
        this.confidential_vm = list;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PermissionSettingsResponseJson(String str, String str2, PermissionDefaultsContentJson permissionDefaultsContentJson, String str3, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : permissionDefaultsContentJson, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : list);
    }

    public /* synthetic */ PermissionSettingsResponseJson(int i, String str, String str2, PermissionDefaultsContentJson permissionDefaultsContentJson, String str3, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.connector_default = null;
        } else {
            this.connector_default = str;
        }
        if ((i & 2) == 0) {
            this.network_default = null;
        } else {
            this.network_default = str2;
        }
        if ((i & 4) == 0) {
            this.default_content = null;
        } else {
            this.default_content = permissionDefaultsContentJson;
        }
        if ((i & 8) == 0) {
            this.confidential_vm_heading = null;
        } else {
            this.confidential_vm_heading = str3;
        }
        if ((i & 16) == 0) {
            this.confidential_vm = null;
        } else {
            this.confidential_vm = list;
        }
    }

    public PermissionSettingsResponseJson() {
        this(null, null, null, null, null);
    }
}
