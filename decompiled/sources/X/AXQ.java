package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class AXQ {
    public static int A00(C3TF c3tf, InterfaceC1380AiA interfaceC1380AiA, List list, int i) {
        ArrayList arrayListA0t = C60Q.A0t(list);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3Tr c3TrA0a = C8j4.A0a(list, i2);
            Integer num = C79.A01;
            arrayListA0t.add(new AXR(c3TrA0a, num, num));
        }
        return interfaceC1380AiA.mo7measure3p2s80s(AXP.A00(c3tf), arrayListA0t, AYL.A04(i)).getHeight();
    }

    public static int A01(C3TF c3tf, InterfaceC1380AiA interfaceC1380AiA, List list, int i) {
        ArrayList arrayListA0t = C60Q.A0t(list);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayListA0t.add(new AXR(C8j4.A0a(list, i2), C79.A01, C79.A00));
        }
        return interfaceC1380AiA.mo7measure3p2s80s(AXP.A00(c3tf), arrayListA0t, AYL.A03(i)).getWidth();
    }

    public static int A02(C3TF c3tf, InterfaceC1380AiA interfaceC1380AiA, List list, int i) {
        ArrayList arrayListA0t = C60Q.A0t(list);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayListA0t.add(new AXR(C8j4.A0a(list, i2), C79.A00, C79.A01));
        }
        return interfaceC1380AiA.mo7measure3p2s80s(AXP.A00(c3tf), arrayListA0t, AYL.A04(i)).getHeight();
    }

    public static int A03(C3TF c3tf, InterfaceC1380AiA interfaceC1380AiA, List list, int i) {
        ArrayList arrayListA0t = C60Q.A0t(list);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3Tr c3TrA0a = C8j4.A0a(list, i2);
            Integer num = C79.A00;
            arrayListA0t.add(new AXR(c3TrA0a, num, num));
        }
        return interfaceC1380AiA.mo7measure3p2s80s(AXP.A00(c3tf), arrayListA0t, AYL.A03(i)).getWidth();
    }
}
