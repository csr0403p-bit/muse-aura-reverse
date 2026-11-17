package X;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.Fjn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8748Fjn {
    public static final C6823Eab A00 = AbstractC7607F5u.A0p("ty", "d");

    /* JADX WARN: Multi-variable type inference failed */
    public static C8765Fk4 A00(C6837Eap c6837Eap, AbstractC6806EaH abstractC6806EaH, int i) {
        float[] fArr;
        int length;
        float[] fArr2;
        int length2;
        C8747Fjm c8747Fjm = new C8747Fjm();
        c8747Fjm.A00 = i;
        ArrayList arrayListA00 = AbstractC8753Fjs.A00(c6837Eap, c8747Fjm, abstractC6806EaH, 1.0f, false);
        for (int i2 = 0; i2 < arrayListA00.size(); i2++) {
            C8725FjQ c8725FjQ = (C8725FjQ) arrayListA00.get(i2);
            C8746Fjl c8746Fjl = (C8746Fjl) c8725FjQ.A0E;
            C8746Fjl c8746Fjl2 = (C8746Fjl) c8725FjQ.A07;
            if (c8746Fjl != null && c8746Fjl2 != null && (length = (fArr = c8746Fjl.A00).length) != (length2 = (fArr2 = c8746Fjl2.A00).length)) {
                int i3 = length + length2;
                float[] fArr3 = new float[i3];
                System.arraycopy(fArr, 0, fArr3, 0, length);
                System.arraycopy(fArr2, 0, fArr3, length, length2);
                Arrays.sort(fArr3);
                float f = Float.NaN;
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    float f2 = fArr3[i5];
                    if (f2 != f) {
                        fArr3[i4] = f2;
                        i4++;
                        f = fArr3[i5];
                    }
                }
                float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i4);
                c8725FjQ = new C8725FjQ(c8746Fjl.A00(fArrCopyOfRange), c8746Fjl2.A00(fArrCopyOfRange));
            }
            arrayListA00.set(i2, c8725FjQ);
        }
        return new C8765Fk4(arrayListA00);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042 A[LOOP:1: B:15:0x003c->B:17:0x0042, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0117 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.InterfaceC8696Fiw A02(X.C6837Eap r22, X.AbstractC6806EaH r23) {
        /*
            Method dump skipped, instructions count: 1896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC8748Fjn.A02(X.Eap, X.EaH):X.Fiw");
    }

    public static C8767Fk6 A01(C6837Eap c6837Eap, AbstractC6806EaH abstractC6806EaH) {
        return new C8767Fk6(AbstractC8753Fjs.A00(c6837Eap, Hu3.A00, abstractC6806EaH, AbstractC8712FjD.A00(), true));
    }
}
