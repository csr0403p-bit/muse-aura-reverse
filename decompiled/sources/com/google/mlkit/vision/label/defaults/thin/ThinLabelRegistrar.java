package com.google.mlkit.vision.label.defaults.thin;

import X.AbstractC3820Cf8;
import X.BV8;
import X.C3555CTs;
import X.C3565CUi;
import X.C3566CUj;
import X.C3567CUm;
import X.C3591CWa;
import X.C3796Cef;
import X.CW1;
import X.CW2;
import X.CW4;
import X.CW5;
import X.CWQ;
import X.Cb6;
import X.F0I;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* loaded from: classes5.dex */
public class ThinLabelRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C3566CUj c3566CUjA00 = C3566CUj.A00(Cb6.class);
        C3566CUj.A02(c3566CUjA00, C3555CTs.class, 1);
        C3565CUi c3565CUiA01 = C3566CUj.A01(c3566CUjA00, CW5.A00);
        C3566CUj c3566CUjA002 = C3566CUj.A00(C3591CWa.class);
        C3566CUj.A02(c3566CUjA002, Cb6.class, 1);
        C3566CUj.A02(c3566CUjA002, CWQ.class, 1);
        C3565CUi c3565CUiA012 = C3566CUj.A01(c3566CUjA002, CW4.A00);
        C3566CUj c3566CUjA003 = C3566CUj.A00(CW1.class);
        c3566CUjA003.A01 = 1;
        c3566CUjA003.A04(new C3567CUm(C3591CWa.class, 1, 1));
        C3565CUi c3565CUiA013 = C3566CUj.A01(c3566CUjA003, CW2.A00);
        F0I f0i = AbstractC3820Cf8.A00;
        Object[] objArr = {c3565CUiA01, c3565CUiA012, c3565CUiA013};
        int i = 0;
        while (objArr[i] != null) {
            i++;
            if (i >= 3) {
                return new C3796Cef(3, objArr);
            }
        }
        throw BV8.A0n(i);
    }
}
