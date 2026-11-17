package X;

/* loaded from: classes4.dex */
public abstract class Ao8 {
    public static final boolean A00(C1756Aq9 c1756Aq9, long j) {
        if (!c1756Aq9.node.isAttached) {
            return false;
        }
        Ai8 ai8 = AbstractC1414Aij.A04(c1756Aq9).A0f.A07;
        if (!AZE.A03(ai8)) {
            return false;
        }
        long jAPo = ai8.APo(0L);
        float fA00 = AnonymousClass001.A00(jAPo);
        float fA01 = AnonymousClass001.A01(jAPo, 4294967295L);
        long j2 = c1756Aq9.A00;
        float f = ((int) (j2 >> 32)) + fA00;
        float f2 = ((int) (j2 & 4294967295L)) + fA01;
        float fA002 = AnonymousClass001.A00(j);
        if (fA00 > fA002 || fA002 > f) {
            return false;
        }
        float fA012 = AnonymousClass001.A01(j, 4294967295L);
        return fA01 <= fA012 && fA012 <= f2;
    }
}
