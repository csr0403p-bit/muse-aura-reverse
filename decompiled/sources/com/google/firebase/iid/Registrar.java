package com.google.firebase.iid;

import X.AbstractC3568CUn;
import X.AnonymousClass002;
import X.C3541CSy;
import X.C3554CTr;
import X.C3565CUi;
import X.C3566CUj;
import X.C3572CUs;
import X.C3576CUx;
import X.C3cG;
import X.CSj;
import X.CT8;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public final class Registrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<C3565CUi<?>> getComponents() {
        C3566CUj c3566CUjA00 = C3566CUj.A00(FirebaseInstanceId.class);
        C3566CUj.A02(c3566CUjA00, C3554CTr.class, 1);
        C3566CUj.A02(c3566CUjA00, CT8.class, 1);
        C3566CUj.A02(c3566CUjA00, CSj.class, 1);
        c3566CUjA00.A02 = C3541CSy.A00;
        if (!AnonymousClass002.A1M(c3566CUjA00.A00)) {
            throw C3cG.A0Q("Instantiation type has already been set.");
        }
        c3566CUjA00.A00 = 1;
        C3565CUi c3565CUiA03 = c3566CUjA00.A03();
        C3566CUj c3566CUjA002 = C3566CUj.A00(C3576CUx.class);
        C3566CUj.A02(c3566CUjA002, FirebaseInstanceId.class, 1);
        return Arrays.asList(c3565CUiA03, C3566CUj.A01(c3566CUjA002, C3572CUs.A00), AbstractC3568CUn.A00("fire-iid", "18.0.0"));
    }
}
