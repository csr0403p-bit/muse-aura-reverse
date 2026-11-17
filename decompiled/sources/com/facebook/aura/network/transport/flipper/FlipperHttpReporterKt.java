package com.facebook.aura.network.transport.flipper;

import X.AnonymousClass002;
import X.C3cH;
import X.C60O;
import X.C8L0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class FlipperHttpReporterKt {
    public static final List<C8L0> toFlipperHeaders(Map<String, String> map) {
        ArrayList arrayListA11 = C60O.A11(map.size());
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            arrayListA11.add(new C8L0(C60O.A0t(entryA0l), (String) entryA0l.getValue()));
        }
        return new ArrayList(arrayListA11);
    }
}
