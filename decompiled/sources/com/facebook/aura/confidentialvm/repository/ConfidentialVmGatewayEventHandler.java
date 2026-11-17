package com.facebook.aura.confidentialvm.repository;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmRpcMethod;
import com.facebook.aura.gateway.intf.GatewayEventHandler;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class ConfidentialVmGatewayEventHandler implements GatewayEventHandler {
    public static final ConfidentialVmGatewayEventHandler INSTANCE = new ConfidentialVmGatewayEventHandler();

    @Override // com.facebook.aura.gateway.intf.GatewayEventHandler
    public boolean handle(String str, JsonObject jsonObject, AbstractC3358CGz abstractC3358CGz) {
        boolean zA1Z = AnonymousClass005.A1Z(str, jsonObject, abstractC3358CGz);
        if (str.equals(ConfidentialVmRpcMethod.PinUpdated.INSTANCE.getValue())) {
            JsonObject jsonObjectOptJsonObject = JsonObjectExtensionsKt.optJsonObject(jsonObject, "payload");
            if (jsonObjectOptJsonObject != null) {
                ConfidentialVmRepository.Companion.getInstance(abstractC3358CGz).applyPinSnapshotAsync(jsonObjectOptJsonObject);
            }
        } else {
            if (!str.equals(ConfidentialVmRpcMethod.SshOperatorUpdated.INSTANCE.getValue())) {
                return false;
            }
            JsonObject jsonObjectOptJsonObject2 = JsonObjectExtensionsKt.optJsonObject(jsonObject, "payload");
            if (jsonObjectOptJsonObject2 != null) {
                ConfidentialVmRepository.Companion.getInstance(abstractC3358CGz).applyOperatorSshStatus(jsonObjectOptJsonObject2);
                return zA1Z;
            }
        }
        return zA1Z;
    }
}
