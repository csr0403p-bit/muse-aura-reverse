package com.facebook.aura.pairs;

import X.C10571Hud;
import X.C3cG;
import X.C60O;
import X.CFK;
import X.FGI;
import X.HsJ;
import com.facebook.aura.json.HatchJsonKt;
import java.util.Set;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public abstract class PairsGatewayEventHandlerKt {
    public static final String ACTIVITY_ADDED = "peer.activity_added";
    public static final Set<String> PEER_EVENTS = C60O.A1A("peer.contact_updated", "peer.grant_updated", ACTIVITY_ADDED);
    public static final String TAG = "PairsGatewayEventHandler";

    public static final String activityEventId(JsonObject jsonObject) {
        Object objA0s;
        String str;
        try {
            objA0s = (PeerActivityAddedEventJson) HatchJsonKt.HatchJson.A01(PeerActivityAddedEventJson$$serializer.INSTANCE, jsonObject);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (HsJ.A00(objA0s) != null) {
            CFK.A06(TAG, "Invalid peer.activity_added event");
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        PeerActivityAddedEventJson peerActivityAddedEventJson = (PeerActivityAddedEventJson) objA0s;
        if (peerActivityAddedEventJson != null) {
            PeerActivityAddedPayloadJson peerActivityAddedPayloadJson = peerActivityAddedEventJson.payload;
            if (peerActivityAddedPayloadJson != null && (str = peerActivityAddedPayloadJson.activity_id) != null) {
                if (str.length() <= 0) {
                    str = null;
                }
                if (str != null) {
                    return str;
                }
            }
            Long l = peerActivityAddedEventJson.seq;
            if (l != null) {
                return FGI.A0B(l.longValue(), "seq:");
            }
        }
        return null;
    }
}
