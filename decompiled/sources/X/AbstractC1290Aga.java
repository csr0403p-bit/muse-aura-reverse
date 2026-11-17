package X;

import android.graphics.Canvas;

/* renamed from: X.Aga, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1290Aga {
    public static final Canvas A00 = new Canvas();

    public static final Canvas A00(InterfaceC1327AhE interfaceC1327AhE) {
        C7384Etj.A0Z(interfaceC1327AhE, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((C1572Alm) interfaceC1327AhE).A00;
    }

    public static final C1572Alm A01(InterfaceC2178B0w interfaceC2178B0w) {
        C1572Alm c1572Alm = new C1572Alm();
        c1572Alm.A00 = new Canvas(B10.A00(interfaceC2178B0w));
        return c1572Alm;
    }
}
