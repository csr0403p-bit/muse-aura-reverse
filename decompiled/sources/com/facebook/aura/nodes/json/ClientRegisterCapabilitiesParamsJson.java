package com.facebook.aura.nodes.json;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
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
public final class ClientRegisterCapabilitiesParamsJson extends C06G {
    public final CapabilitiesJson capabilities;
    public final String client_id;
    public final DeviceMetadataJson device_metadata;
    public final String display_name;
    public final List<String> enabled_permissions;
    public final String platform;
    public final String version;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, ClientRegisterCapabilitiesParamsJson$Companion$$childSerializers$1.INSTANCE), null};

    public final class Companion {
        public final C9hr<ClientRegisterCapabilitiesParamsJson> serializer() {
            return ClientRegisterCapabilitiesParamsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClientRegisterCapabilitiesParamsJson) {
                ClientRegisterCapabilitiesParamsJson clientRegisterCapabilitiesParamsJson = (ClientRegisterCapabilitiesParamsJson) obj;
                if (!C7384Etj.areEqual(this.client_id, clientRegisterCapabilitiesParamsJson.client_id) || !C7384Etj.areEqual(this.platform, clientRegisterCapabilitiesParamsJson.platform) || !C7384Etj.areEqual(this.display_name, clientRegisterCapabilitiesParamsJson.display_name) || !C7384Etj.areEqual(this.version, clientRegisterCapabilitiesParamsJson.version) || !C7384Etj.areEqual(this.device_metadata, clientRegisterCapabilitiesParamsJson.device_metadata) || !C7384Etj.areEqual(this.enabled_permissions, clientRegisterCapabilitiesParamsJson.enabled_permissions) || !C7384Etj.areEqual(this.capabilities, clientRegisterCapabilitiesParamsJson.capabilities)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ClientRegisterCapabilitiesParamsJson(int i, String str, String str2, String str3, String str4, DeviceMetadataJson deviceMetadataJson, List list, CapabilitiesJson capabilitiesJson, C2hx c2hx) {
        if (127 != (i & 127)) {
            C9iI.A00(ClientRegisterCapabilitiesParamsJson$$serializer.descriptor, i, 127);
            throw F60.createAndThrow();
        }
        this.client_id = str;
        this.platform = str2;
        this.display_name = str3;
        this.version = str4;
        this.device_metadata = deviceMetadataJson;
        this.enabled_permissions = list;
        this.capabilities = capabilitiesJson;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClientRegisterCapabilitiesParamsJson copy$default(ClientRegisterCapabilitiesParamsJson clientRegisterCapabilitiesParamsJson, String str, String str2, String str3, String str4, DeviceMetadataJson deviceMetadataJson, List list, CapabilitiesJson capabilitiesJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clientRegisterCapabilitiesParamsJson.client_id;
        }
        if ((i & 2) != 0) {
            str2 = clientRegisterCapabilitiesParamsJson.platform;
        }
        if ((i & 4) != 0) {
            str3 = clientRegisterCapabilitiesParamsJson.display_name;
        }
        if ((i & 8) != 0) {
            str4 = clientRegisterCapabilitiesParamsJson.version;
        }
        if ((i & 16) != 0) {
            deviceMetadataJson = clientRegisterCapabilitiesParamsJson.device_metadata;
        }
        if ((i & 32) != 0) {
            list = clientRegisterCapabilitiesParamsJson.enabled_permissions;
        }
        if ((i & 64) != 0) {
            capabilitiesJson = clientRegisterCapabilitiesParamsJson.capabilities;
        }
        return clientRegisterCapabilitiesParamsJson.copy(str, str2, str3, str4, deviceMetadataJson, list, capabilitiesJson);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_json_json(ClientRegisterCapabilitiesParamsJson clientRegisterCapabilitiesParamsJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(clientRegisterCapabilitiesParamsJson.client_id, c9iZ, 0);
        c9j5.AAV(clientRegisterCapabilitiesParamsJson.platform, c9iZ, 1);
        c9j5.AAV(clientRegisterCapabilitiesParamsJson.display_name, c9iZ, 2);
        c9j5.AAV(clientRegisterCapabilitiesParamsJson.version, c9iZ, 3);
        c9j5.AAQ(clientRegisterCapabilitiesParamsJson.device_metadata, DeviceMetadataJson$$serializer.INSTANCE, c9iZ, 4);
        c9j5.AAQ(clientRegisterCapabilitiesParamsJson.enabled_permissions, C3cH.A15(f0cArr, 5), c9iZ, 5);
        c9j5.AAQ(clientRegisterCapabilitiesParamsJson.capabilities, CapabilitiesJson$$serializer.INSTANCE, c9iZ, 6);
    }

    public final String component1() {
        return this.client_id;
    }

    public final String component2() {
        return this.platform;
    }

    public final String component3() {
        return this.display_name;
    }

    public final String component4() {
        return this.version;
    }

    public final DeviceMetadataJson component5() {
        return this.device_metadata;
    }

    public final List<String> component6() {
        return this.enabled_permissions;
    }

    public final CapabilitiesJson component7() {
        return this.capabilities;
    }

    public final CapabilitiesJson getCapabilities() {
        return this.capabilities;
    }

    public final String getClient_id() {
        return this.client_id;
    }

    public final DeviceMetadataJson getDevice_metadata() {
        return this.device_metadata;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final List<String> getEnabled_permissions() {
        return this.enabled_permissions;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.capabilities, AnonymousClass005.A0F(this.enabled_permissions, AnonymousClass005.A0F(this.device_metadata, AnonymousClass005.A0I(this.version, AnonymousClass005.A0I(this.display_name, AnonymousClass005.A0I(this.platform, AnonymousClass001.A0G(this.client_id)))))));
    }

    public final ClientRegisterCapabilitiesParamsJson copy(String str, String str2, String str3, String str4, DeviceMetadataJson deviceMetadataJson, List<String> list, CapabilitiesJson capabilitiesJson) {
        AnonymousClass005.A17(str, str2, str3, str4, deviceMetadataJson);
        AnonymousClass003.A0z(list, capabilitiesJson);
        return new ClientRegisterCapabilitiesParamsJson(str, str2, str3, str4, deviceMetadataJson, list, capabilitiesJson);
    }

    public String toString() {
        return super.toString();
    }

    public ClientRegisterCapabilitiesParamsJson(String str, String str2, String str3, String str4, DeviceMetadataJson deviceMetadataJson, List<String> list, CapabilitiesJson capabilitiesJson) {
        AnonymousClass005.A17(str, str2, str3, str4, deviceMetadataJson);
        AnonymousClass003.A0z(list, capabilitiesJson);
        this.client_id = str;
        this.platform = str2;
        this.display_name = str3;
        this.version = str4;
        this.device_metadata = deviceMetadataJson;
        this.enabled_permissions = list;
        this.capabilities = capabilitiesJson;
    }
}
