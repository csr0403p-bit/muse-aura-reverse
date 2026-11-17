package com.facebook.aura.partners.voice.impl;

import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.C9hr;
import X.F0C;
import com.facebook.aura.nodes.api.HatchNodeCapabilityContributor;
import com.facebook.aura.nodes.json.CapabilitiesJson;
import com.facebook.aura.nodes.json.ClientRegisterCapabilitiesParamsJson;
import com.facebook.aura.partners.voice.intf.Voice;

/* loaded from: classes2.dex */
public final class VoiceNodeCapabilityContributor implements HatchNodeCapabilityContributor {
    public static final int $stable = 0;
    public static final VoiceNodeCapabilityContributor INSTANCE = new VoiceNodeCapabilityContributor();

    @Override // com.facebook.aura.nodes.api.HatchNodeCapabilityContributor
    public ClientRegisterCapabilitiesParamsJson contribute(ClientRegisterCapabilitiesParamsJson clientRegisterCapabilitiesParamsJson, AbstractC3358CGz abstractC3358CGz, long j) {
        AnonymousClass003.A0u(clientRegisterCapabilitiesParamsJson, abstractC3358CGz);
        CapabilitiesJson capabilitiesJson = clientRegisterCapabilitiesParamsJson.capabilities;
        Boolean boolValueOf = Boolean.valueOf(Voice.INSTANCE.isCallSupported(abstractC3358CGz));
        F0C<C9hr<Object>>[] f0cArr = CapabilitiesJson.$childSerializers;
        return clientRegisterCapabilitiesParamsJson.copy(clientRegisterCapabilitiesParamsJson.client_id, clientRegisterCapabilitiesParamsJson.platform, clientRegisterCapabilitiesParamsJson.display_name, clientRegisterCapabilitiesParamsJson.version, clientRegisterCapabilitiesParamsJson.device_metadata, clientRegisterCapabilitiesParamsJson.enabled_permissions, capabilitiesJson.copy(capabilitiesJson.data_sources, capabilitiesJson.device_commands, capabilitiesJson.hatch_app_commands, capabilitiesJson.rendering, boolValueOf));
    }
}
