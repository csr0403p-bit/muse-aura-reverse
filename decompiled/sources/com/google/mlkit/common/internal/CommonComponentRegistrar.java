package com.google.mlkit.common.internal;

import X.AbstractC3777CeK;
import X.BV8;
import X.C3532CSn;
import X.C3555CTs;
import X.C3565CUi;
import X.C3566CUj;
import X.C3567CUm;
import X.C3577CUy;
import X.C3669CcR;
import X.C3776CeJ;
import X.CLu;
import X.CW6;
import X.CWA;
import X.CWB;
import X.CWC;
import X.CWE;
import X.CWF;
import X.CWG;
import X.CWH;
import X.CWJ;
import X.CWL;
import X.CWO;
import X.CWP;
import X.CWQ;
import X.F0L;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* loaded from: classes5.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C3565CUi<?> c3565CUi = C3577CUy.A01;
        C3566CUj c3566CUjA00 = C3566CUj.A00(CWL.class);
        C3566CUj.A02(c3566CUjA00, C3555CTs.class, 1);
        C3565CUi c3565CUiA01 = C3566CUj.A01(c3566CUjA00, new CWE());
        C3565CUi c3565CUiA012 = C3566CUj.A01(C3566CUj.A00(CLu.class), new C3532CSn());
        C3566CUj c3566CUjA002 = C3566CUj.A00(CWB.class);
        C3566CUj.A02(c3566CUjA002, CWO.class, 2);
        C3565CUi c3565CUiA013 = C3566CUj.A01(c3566CUjA002, new CWA());
        C3566CUj c3566CUjA003 = C3566CUj.A00(CWQ.class);
        c3566CUjA003.A04(new C3567CUm(CLu.class, 1, 1));
        C3565CUi c3565CUiA014 = C3566CUj.A01(c3566CUjA003, new CW6());
        C3565CUi c3565CUiA015 = C3566CUj.A01(C3566CUj.A00(CWJ.class), new CWH());
        C3566CUj c3566CUjA004 = C3566CUj.A00(CWP.class);
        C3566CUj.A02(c3566CUjA004, CWJ.class, 1);
        C3565CUi c3565CUiA016 = C3566CUj.A01(c3566CUjA004, new CWF());
        C3566CUj c3566CUjA005 = C3566CUj.A00(C3669CcR.class);
        C3566CUj.A02(c3566CUjA005, C3555CTs.class, 1);
        C3565CUi c3565CUiA017 = C3566CUj.A01(c3566CUjA005, new CWG());
        C3566CUj c3566CUjA006 = C3566CUj.A00(CWO.class);
        c3566CUjA006.A01 = 1;
        c3566CUjA006.A04(new C3567CUm(C3669CcR.class, 1, 1));
        C3565CUi c3565CUiA018 = C3566CUj.A01(c3566CUjA006, new CWC());
        F0L f0l = AbstractC3777CeK.A00;
        Object[] objArr = {c3565CUi, c3565CUiA01, c3565CUiA012, c3565CUiA013, c3565CUiA014, c3565CUiA015, c3565CUiA016, c3565CUiA017, c3565CUiA018};
        int i = 0;
        while (objArr[i] != null) {
            i++;
            if (i >= 9) {
                return new C3776CeJ(9, objArr);
            }
        }
        throw BV8.A0n(i);
    }
}
