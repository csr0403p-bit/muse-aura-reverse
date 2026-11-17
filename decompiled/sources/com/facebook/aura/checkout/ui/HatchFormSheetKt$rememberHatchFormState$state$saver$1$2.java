package com.facebook.aura.checkout.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C0881AGi;
import X.C1805ArO;
import X.C3cH;
import X.C7384Etj;
import X.G0U;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class HatchFormSheetKt$rememberHatchFormState$state$saver$1$2 extends AbstractC7559F3s implements G0U<Map<String, ? extends Object>, HatchFormState> {
    public static final HatchFormSheetKt$rememberHatchFormState$state$saver$1$2 INSTANCE = new HatchFormSheetKt$rememberHatchFormState$state$saver$1$2();

    public HatchFormSheetKt$rememberHatchFormState$state$saver$1$2() {
        super(1);
    }

    @Override // X.G0U
    public final HatchFormState invoke(Map<String, ? extends Object> map) {
        C1805ArO c1805ArOAbb;
        C7384Etj.A0Y(map, 0);
        HatchFormState hatchFormState = new HatchFormState(C0881AGi.A00);
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            Object key = entryA0l.getKey();
            Object value = entryA0l.getValue();
            if (value != null && (c1805ArOAbb = C1805ArO.A03.Abb(value)) != null) {
                hatchFormState.values.put(key, c1805ArOAbb);
            }
        }
        return hatchFormState;
    }
}
