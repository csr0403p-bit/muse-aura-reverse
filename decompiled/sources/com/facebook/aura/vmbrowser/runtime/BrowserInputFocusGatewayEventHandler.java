package com.facebook.aura.vmbrowser.runtime;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import com.facebook.aura.gateway.intf.GatewayEventHandler;
import com.facebook.aura.vmbrowser.runtime.VmBrowserRpcMethod;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes2.dex */
public final class BrowserInputFocusGatewayEventHandler implements GatewayEventHandler {
    public static final int $stable = 0;
    public static final BrowserInputFocusGatewayEventHandler INSTANCE = new BrowserInputFocusGatewayEventHandler();

    @Override // com.facebook.aura.gateway.intf.GatewayEventHandler
    public boolean handle(String str, JsonObject jsonObject, AbstractC3358CGz abstractC3358CGz) {
        boolean zA1Z = AnonymousClass005.A1Z(str, jsonObject, abstractC3358CGz);
        if (!str.equals(VmBrowserRpcMethod.BrowserInputFocus.INSTANCE.getValue())) {
            return false;
        }
        BrowserInputFocusEvents.Companion.getInstance(abstractC3358CGz).dispatch(jsonObject);
        return zA1Z;
    }
}
