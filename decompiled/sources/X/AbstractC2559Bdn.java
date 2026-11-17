package X;

/* renamed from: X.Bdn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2559Bdn {
    public static C2558Bdm A00(Be3 be3, AbstractC2440BbT abstractC2440BbT, Integer num) {
        String strA0M = abstractC2440BbT == null ? " videoSpec" : "";
        if (be3 == null) {
            strA0M = FGI.A0M(strA0M, " audioSpec");
        }
        if (num == null) {
            strA0M = FGI.A0M(strA0M, " outputFormat");
        }
        if (strA0M.isEmpty()) {
            return new C2558Bdm(be3, abstractC2440BbT, num.intValue());
        }
        throw BV8.A0l(strA0M);
    }
}
