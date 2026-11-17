package com.facebook.aura.network.transport.tigon;

import X.AbstractC0878AGe;
import X.BV4;
import X.C0881AGi;
import X.C4256CrU;
import X.C60Q;
import X.C7384Etj;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes5.dex */
public abstract class TigonHatchWebSocketKt {
    public static final String[] WELL_KNOWN_HANDSHAKE_HEADERS = {"X-Connection-Id", "X-Request-Id", "Sec-WebSocket-Protocol"};

    public static final Map<String, String> handshakeHeaders(C4256CrU c4256CrU) {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        C7384Etj.A0V(comparator);
        TreeMap treeMap = new TreeMap(comparator);
        for (String str : WELL_KNOWN_HANDSHAKE_HEADERS) {
            C7384Etj.A0Y(str, 0);
            List listA0z = BV4.A0z(C60Q.A0g(str), c4256CrU.A01);
            if (listA0z == null) {
                listA0z = C0881AGi.A00;
            }
            Object objA0G = AbstractC0878AGe.A0G(listA0z);
            if (objA0G != null) {
                treeMap.put(str, objA0G);
            }
        }
        return treeMap;
    }
}
