package com.google.mlkit.vision.face.internal;

import X.AbstractC3815Cey;
import X.BV8;
import X.C3555CTs;
import X.C3565CUi;
import X.C3566CUj;
import X.C3795Cee;
import X.CW9;
import X.CWD;
import X.CWM;
import X.CWQ;
import X.Cbm;
import X.F0J;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* loaded from: classes5.dex */
public class FaceRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C3566CUj c3566CUjA00 = C3566CUj.A00(Cbm.class);
        C3566CUj.A02(c3566CUjA00, C3555CTs.class, 1);
        C3565CUi c3565CUiA01 = C3566CUj.A01(c3566CUjA00, CWD.A00);
        C3566CUj c3566CUjA002 = C3566CUj.A00(CWM.class);
        C3566CUj.A02(c3566CUjA002, Cbm.class, 1);
        C3566CUj.A02(c3566CUjA002, CWQ.class, 1);
        C3565CUi c3565CUiA012 = C3566CUj.A01(c3566CUjA002, CW9.A00);
        F0J f0j = AbstractC3815Cey.A00;
        int i = 0;
        Object[] objArr = {c3565CUiA01, c3565CUiA012};
        while (objArr[i] != null) {
            i++;
            if (i >= 2) {
                return new C3795Cee(2, objArr);
            }
        }
        throw BV8.A0n(i);
    }
}
