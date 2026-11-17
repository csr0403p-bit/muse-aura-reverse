package com.google.mlkit.vision.common.internal;

import X.AbstractC3804Cen;
import X.BV8;
import X.C3565CUi;
import X.C3566CUj;
import X.C3794Ced;
import X.CVy;
import X.CVz;
import X.CW1;
import X.F0K;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* loaded from: classes5.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C3566CUj c3566CUjA00 = C3566CUj.A00(CVy.class);
        C3566CUj.A02(c3566CUjA00, CW1.class, 2);
        C3565CUi c3565CUiA01 = C3566CUj.A01(c3566CUjA00, CVz.A00);
        F0K f0k = AbstractC3804Cen.A00;
        Object[] objArr = {c3565CUiA01};
        if (objArr[0] != null) {
            return new C3794Ced(1, objArr);
        }
        throw BV8.A0n(0);
    }
}
