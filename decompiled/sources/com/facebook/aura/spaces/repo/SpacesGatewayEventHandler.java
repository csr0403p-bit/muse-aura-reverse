package com.facebook.aura.spaces.repo;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import X.C0881AGi;
import X.C3cG;
import X.C60O;
import X.CFK;
import X.FGI;
import com.facebook.aura.gateway.intf.GatewayEventHandler;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import com.facebook.aura.spaces.repo.SpacesRpcMethod;
import com.facebook.aura.widgets.SpaceWidgetRefreshWorkerKt;
import java.util.Iterator;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class SpacesGatewayEventHandler implements GatewayEventHandler {
    public static final SpacesGatewayEventHandler INSTANCE = new SpacesGatewayEventHandler();
    public static final String TAG = "SpacesGatewayEventHandler";

    @Override // com.facebook.aura.gateway.intf.GatewayEventHandler
    public boolean handle(String str, JsonObject jsonObject, AbstractC3358CGz abstractC3358CGz) {
        boolean zA1Z = AnonymousClass005.A1Z(str, jsonObject, abstractC3358CGz);
        if (str.equals(SpacesRpcMethod.Updated.INSTANCE.getValue())) {
            handleUpdated(jsonObject, abstractC3358CGz);
            return zA1Z;
        }
        if (!str.equals(SpacesRpcMethod.DataInvalidated.INSTANCE.getValue())) {
            return false;
        }
        handleDataInvalidated(jsonObject, abstractC3358CGz);
        return zA1Z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    private final void handleDataInvalidated(JsonObject jsonObject, AbstractC3358CGz abstractC3358CGz) {
        ?? A0h;
        JsonObject jsonObjectA1J = C60O.A1J(jsonObject);
        if (jsonObjectA1J != null) {
            String strOptString = JsonObjectExtensionsKt.optString(jsonObjectA1J, SpaceWidgetRefreshWorkerKt.KEY_SLUG, "");
            if (strOptString.length() > 0) {
                JsonArray jsonArrayOptJsonArray = JsonObjectExtensionsKt.optJsonArray(jsonObjectA1J, "query_keys");
                if (jsonArrayOptJsonArray != null) {
                    A0h = C3cG.A0h();
                    Iterator<JsonElement> it = jsonArrayOptJsonArray.iterator();
                    while (it.hasNext()) {
                        JsonElement next = it.next();
                        if ((next instanceof JsonArray) && next != null) {
                            A0h.add(next);
                        }
                    }
                } else {
                    A0h = C0881AGi.A00;
                }
                String strOptString2 = JsonObjectExtensionsKt.optString(jsonObjectA1J, "origin_action_call_id", "");
                SpacesGatewayEvents.Companion.getInstance(abstractC3358CGz).emitDataInvalidated$fbandroid_express_aura_java_com_facebook_aura_spaces_repo_repo(new SpacesDataInvalidatedEvent(strOptString, A0h, strOptString2.length() > 0 ? strOptString2 : null));
            }
        }
    }

    private final void handleUpdated(JsonObject jsonObject, AbstractC3358CGz abstractC3358CGz) {
        JsonObject jsonObjectA1J = C60O.A1J(jsonObject);
        if (jsonObjectA1J != null) {
            String strA0u = C60O.A0u(jsonObjectA1J, SpaceWidgetRefreshWorkerKt.KEY_SLUG);
            if (strA0u.length() > 0) {
                CFK.A05(TAG, FGI.A0M("Handling spaces.updated event for slug=", strA0u));
                SpacesGatewayEvents.Companion.getInstance(abstractC3358CGz).emitUpdate$fbandroid_express_aura_java_com_facebook_aura_spaces_repo_repo(strA0u);
            }
        }
    }
}
