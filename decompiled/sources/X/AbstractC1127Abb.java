package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Abb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1127Abb {
    /* JADX WARN: Incorrect types in method signature: (LX/Abd;LX/A4A;LX/Aby;)Ljava/util/List<Ljava/lang/Integer;>; */
    public static final List A00(C1145Aby c1145Aby, InterfaceC1129Abd interfaceC1129Abd, A4A a4a) {
        ADq aDq;
        C0910AHm<AcP> c0910AHm = c1145Aby.A00;
        if (c0910AHm.A00 == 0 && a4a.isEmpty()) {
            return C0881AGi.A00;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        int i = c0910AHm.A00;
        if (i != 0) {
            AcP[] acPArr = c0910AHm.A01;
            AcP acP = acPArr[0];
            int i2 = acP.A01;
            for (int i3 = 0; i3 < i; i3++) {
                AcP acP2 = acPArr[i3];
                if (acP2.A01 < i2) {
                    i2 = acP2.A01;
                }
            }
            if (i2 < 0) {
                AbstractC1061ATk.A00("negative minIndex");
                throw F60.createAndThrow();
            }
            int i4 = acP.A00;
            for (int i5 = 0; i5 < i; i5++) {
                AcP acP3 = acPArr[i5];
                if (acP3.A00 > i4) {
                    i4 = acP3.A00;
                }
            }
            aDq = new ADq(i2, Math.min(i4, interfaceC1129Abd.getItemCount() - 1));
        } else {
            aDq = ADq.A00;
        }
        int size = a4a.size();
        for (int i6 = 0; i6 < size; i6++) {
            C1209Aek c1209Aek = (C1209Aek) ((A4B) a4a.get(i6));
            int iA00 = AbstractC1128Abc.A00(interfaceC1129Abd, c1209Aek.A05, c1209Aek.A00);
            int i7 = aDq.A00;
            if ((iA00 > aDq.A01 || i7 > iA00) && iA00 >= 0 && iA00 < interfaceC1129Abd.getItemCount()) {
                arrayListA0h.add(Integer.valueOf(iA00));
            }
        }
        int i8 = aDq.A00;
        int i9 = aDq.A01;
        if (i8 > i9) {
            return arrayListA0h;
        }
        while (true) {
            arrayListA0h.add(Integer.valueOf(i8));
            if (i8 == i9) {
                return arrayListA0h;
            }
            i8++;
        }
    }
}
