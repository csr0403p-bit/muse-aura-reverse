package com.facebook.aura.modellock;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import X.C60O;
import X.CFK;
import com.facebook.aura.gateway.intf.GatewayEventHandler;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.modellock.ModelLockRpcMethod;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class ModelLockGatewayEventHandler implements GatewayEventHandler {
    public static final ModelLockGatewayEventHandler INSTANCE = new ModelLockGatewayEventHandler();

    @Override // com.facebook.aura.gateway.intf.GatewayEventHandler
    public boolean handle(String str, JsonObject jsonObject, AbstractC3358CGz abstractC3358CGz) {
        boolean zA1Z = AnonymousClass005.A1Z(str, jsonObject, abstractC3358CGz);
        if (!str.equals(ModelLockRpcMethod.Updated.INSTANCE.getValue())) {
            return false;
        }
        JsonObject jsonObjectA1J = C60O.A1J(jsonObject);
        if (jsonObjectA1J == null) {
            return zA1Z;
        }
        try {
            ModelLockRepository.Companion.getInstance(abstractC3358CGz).apply$fbandroid_express_aura_java_com_facebook_aura_modellock_modellock((ModelLockUpdatedJson) HatchJsonKt.HatchJson.A01(ModelLockUpdatedJson$$serializer.INSTANCE, jsonObjectA1J));
            return zA1Z;
        } catch (IllegalArgumentException e) {
            CFK.A0K(ModelLockGatewayEventHandlerKt.TAG, e, "handle: undecodable model_lock.updated payload");
            return zA1Z;
        }
    }
}
