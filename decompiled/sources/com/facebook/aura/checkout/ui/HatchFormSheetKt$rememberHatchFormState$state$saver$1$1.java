package com.facebook.aura.checkout.ui;

import X.AIW;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C0981AMm;
import X.C1805ArO;
import X.C1bi;
import X.C3cH;
import X.C60O;
import X.G0V;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class HatchFormSheetKt$rememberHatchFormState$state$saver$1$1 extends AbstractC7559F3s implements G0V<C1bi, HatchFormState, Map<String, ? extends Object>> {
    public static final HatchFormSheetKt$rememberHatchFormState$state$saver$1$1 INSTANCE = new HatchFormSheetKt$rememberHatchFormState$state$saver$1$1();

    public HatchFormSheetKt$rememberHatchFormState$state$saver$1$1() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.G0V
    public final Map<String, Object> invoke(C1bi c1bi, HatchFormState hatchFormState) {
        AnonymousClass003.A0u(c1bi, hatchFormState);
        C0981AMm<String, C1805ArO> c0981AMm = hatchFormState.values;
        LinkedHashMap linkedHashMapA15 = C60O.A15(AIW.A0H(c0981AMm.size()));
        Iterator<Map.Entry<String, C1805ArO>> it = c0981AMm.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(it);
            linkedHashMapA15.put(entryA0l.getKey(), C1805ArO.A03.Ac1(c1bi, entryA0l.getValue()));
        }
        return linkedHashMapA15;
    }
}
