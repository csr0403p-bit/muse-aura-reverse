package com.facebook.aura.nodes.core;

import X.AnonymousClass003;
import X.C2nw;
import X.C60O;
import X.C7384Etj;
import X.C7qW;
import X.FGI;
import X.G0U;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class NodeCardEnvelopeKt {
    public static final List<String> NODE_CARD_CLIENTS_ANDROID_ONLY = Collections.singletonList("android");
    public static final String NODE_CARD_CLIENT_ANDROID = "android";

    public static final List<String> getNODE_CARD_CLIENTS_ANDROID_ONLY() {
        return NODE_CARD_CLIENTS_ANDROID_ONLY;
    }

    public static final String nodeCardEnvelope(String str, List<String> list, String str2, String str3, G0U<? super C2nw, Unit> g0u) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(g0u, 4);
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A05(1, "version", c2nwA1K);
        C7qW.A06("type", str, c2nwA1K);
        if (list != null) {
            C7qW.A07("supported_clients", new NodeCardEnvelopeKt$nodeCardEnvelope$1$1$1(list), c2nwA1K);
        }
        if (str2 != null) {
            C7qW.A06("fallback_text", str2, c2nwA1K);
        }
        C7qW.A08("data", new NodeCardEnvelopeKt$nodeCardEnvelope$1$3(g0u, str3), c2nwA1K);
        return C60O.A0v(c2nwA1K);
    }

    public static /* synthetic */ String nodeCardEnvelope$default(String str, List list, String str2, String str3, G0U g0u, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        return nodeCardEnvelope(str, list, str2, str3, g0u);
    }

    public static final String nodeCardDeviceActionFallback(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return FGI.A0h("Open Muse on ", str, " to ", str2, ".");
    }

    public static final String nodeCardDeviceInfoFallback(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return FGI.A0d(str2, " on ", str, ".");
    }
}
