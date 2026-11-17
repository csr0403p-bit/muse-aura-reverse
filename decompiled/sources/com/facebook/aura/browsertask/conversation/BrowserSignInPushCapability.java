package com.facebook.aura.browsertask.conversation;

import X.AGH;
import X.AbstractC3358CGz;
import X.AnonymousClass006;
import X.C7384Etj;
import com.facebook.aura.nodes.api.HatchNodeCapabilityContributor;
import com.facebook.aura.nodes.json.ClientRegisterCapabilitiesParamsJson;
import com.facebook.aura.nodes.json.DeviceMetadataJson;
import java.util.Map;

/* loaded from: classes2.dex */
public final class BrowserSignInPushCapability implements HatchNodeCapabilityContributor {
    public static final int $stable = 0;
    public static final BrowserSignInPushCapability INSTANCE = new BrowserSignInPushCapability();

    @Override // com.facebook.aura.nodes.api.HatchNodeCapabilityContributor
    public ClientRegisterCapabilitiesParamsJson contribute(ClientRegisterCapabilitiesParamsJson clientRegisterCapabilitiesParamsJson, AbstractC3358CGz abstractC3358CGz, long j) {
        C7384Etj.A0Y(clientRegisterCapabilitiesParamsJson, 0);
        DeviceMetadataJson deviceMetadataJson = clientRegisterCapabilitiesParamsJson.device_metadata;
        Map mapA0E = deviceMetadataJson.metadata;
        if (mapA0E == null) {
            mapA0E = AGH.A0E();
        }
        return clientRegisterCapabilitiesParamsJson.copy(clientRegisterCapabilitiesParamsJson.client_id, clientRegisterCapabilitiesParamsJson.platform, clientRegisterCapabilitiesParamsJson.display_name, clientRegisterCapabilitiesParamsJson.version, deviceMetadataJson.copy(deviceMetadataJson.device_family, deviceMetadataJson.model_id, deviceMetadataJson.is_wakeup_supported, deviceMetadataJson.delivery_app, AnonymousClass006.A11("browser_needs_you_push", "true", mapA0E)), clientRegisterCapabilitiesParamsJson.enabled_permissions, clientRegisterCapabilitiesParamsJson.capabilities);
    }
}
