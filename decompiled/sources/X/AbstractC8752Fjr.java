package X;

import java.util.ArrayList;

/* renamed from: X.Fjr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8752Fjr {
    public static final C6823Eab A00 = C6823Eab.A00("k", "x", "y");

    public static C8737Fjc A00(C6837Eap c6837Eap, AbstractC6806EaH abstractC6806EaH) {
        ArrayList arrayList = new ArrayList();
        if (abstractC6806EaH.A0C() == C79.A00) {
            abstractC6806EaH.A0F();
            while (abstractC6806EaH.A0L()) {
                boolean z = false;
                if (abstractC6806EaH.A0C() == C79.A0C) {
                    z = true;
                }
                arrayList.add(new C8726FjR(c6837Eap, AbstractC8751Fjq.A01(c6837Eap, C10496Hmn.A00, abstractC6806EaH, AbstractC8712FjD.A00(), z, false)));
            }
            abstractC6806EaH.A0H();
            AbstractC8753Fjs.A01(arrayList);
        } else {
            arrayList.add(new C8725FjQ(HwH.A02(abstractC6806EaH, AbstractC8712FjD.A00())));
        }
        return new C8737Fjc(arrayList);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/EaH;LX/Eap;)LX/Fk0<Landroid/graphics/PointF;Landroid/graphics/PointF;>; */
    public static InterfaceC8761Fk0 A01(C6837Eap c6837Eap, AbstractC6806EaH abstractC6806EaH) {
        abstractC6806EaH.A0G();
        C8737Fjc c8737FjcA00 = null;
        C8689Fip c8689FipA01 = null;
        C8689Fip c8689FipA012 = null;
        boolean z = false;
        while (abstractC6806EaH.A0C() != C79.A0K) {
            int iA0B = abstractC6806EaH.A0B(A00);
            if (iA0B == 0) {
                c8737FjcA00 = A00(c6837Eap, abstractC6806EaH);
            } else if (iA0B != 1) {
                if (iA0B != 2) {
                    abstractC6806EaH.A0J();
                    abstractC6806EaH.A0K();
                } else if (abstractC6806EaH.A0C() != C79.A0T) {
                    c8689FipA012 = AbstractC8756Fjv.A01(c6837Eap, abstractC6806EaH, true);
                } else {
                    abstractC6806EaH.A0K();
                    z = true;
                }
            } else if (abstractC6806EaH.A0C() != C79.A0T) {
                c8689FipA01 = AbstractC8756Fjv.A01(c6837Eap, abstractC6806EaH, true);
            } else {
                abstractC6806EaH.A0K();
                z = true;
            }
        }
        abstractC6806EaH.A0I();
        if (z) {
            c6837Eap.A02("Lottie doesn't support expressions.");
        }
        return c8737FjcA00 == null ? new C8743Fji(c8689FipA01, c8689FipA012) : c8737FjcA00;
    }
}
