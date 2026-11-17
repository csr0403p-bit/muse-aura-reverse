package com.facebook.aura.nodes.core;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C2nw;
import X.C3cJ;
import X.C60O;
import X.C60R;
import X.C7384Etj;
import X.C7qW;
import X.FGI;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.model.ReplyAttributionSerializer;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.aura.pairs.PairsInviteMailboxKt;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public abstract class NodeErrorsKt {
    public static final String BACKGROUND_LOCATION_DENIED_MESSAGE = "Background location permission is not granted. The user needs to select 'Allow all the time' in the system Settings app under Location permissions.";
    public static final String NOTIFICATION_ACCESS_DENIED_MESSAGE = "Notification access is not enabled. The user needs to enable notification access in the system Settings app under Special app access.";

    public static final JsonObject nodeError(String str, String str2, Map<String, ? extends JsonElement> map, String str3) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass002.A1A(str2, 1, map);
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A06(AuraDeeplinkRouteMapper.STATUS_ROUTE, "error", c2nwA1K);
        C7qW.A06("error_code", str, c2nwA1K);
        C7qW.A06(ReplyAttributionSerializer.TYPE_MESSAGE, str2, c2nwA1K);
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            C3cJ.A0v(itA0n, c2nwA1K);
        }
        JsonObject jsonObjectA00 = c2nwA1K.A00();
        C2nw c2nwA1K2 = C60O.A1K();
        C7qW.A03(true, jsonObjectA00, str3, c2nwA1K2);
        return c2nwA1K2.A00();
    }

    public static final String permissionDeniedMessage(String str) {
        C7384Etj.A0Y(str, 0);
        return FGI.A0M(str, " permission is not granted. The user can enable it in the app settings under Device Permissions, or in the system Settings app under App Permissions.");
    }

    public static final JsonObject nodeCardResult(String str, String str2) {
        C2nw c2nwA0s = C60R.A0s(str);
        Boolean boolA0i = AnonymousClass001.A0i();
        C7qW.A04(boolA0i, PairsInviteMailboxKt.OUTCOME_OK, c2nwA0s);
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A04(boolA0i, PairsInviteMailboxKt.OUTCOME_OK, c2nwA1K);
        C7qW.A06("payload_json", C60O.A0v(c2nwA1K), c2nwA0s);
        C7qW.A06("card_json", str, c2nwA0s);
        if (str2 != null) {
            C7qW.A06(HatchWebPageParserKt.DESCRIPTION, str2, c2nwA0s);
        }
        return c2nwA0s.A00();
    }

    public static final String permissionDeniedMessage(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return FGI.A0d(str, " permission is not granted. [Tap here to grant permission](", str2, "), or enable it in the system Settings app.");
    }
}
