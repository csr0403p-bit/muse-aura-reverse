package X;

/* renamed from: X.0eo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC04540eo {
    public static /* synthetic */ BRg A00(BRg bRg, C1DM c1dm, float f, int i, long j, long j2) {
        C1DM c1dm2 = c1dm;
        long j3 = j;
        long j4 = j2;
        if ((i & 2) != 0) {
            c1dm2 = C1OM.A00;
        }
        int iA01 = C1DG.A01(f, 0.0f);
        boolean z = iA01 > 0;
        if ((i & 8) != 0) {
            j3 = C0er.A00;
        }
        if ((i & 16) != 0) {
            j4 = C0er.A00;
        }
        return (iA01 > 0 || z) ? bRg.then(new C1416Ail(c1dm2, f, j3, j4, z)) : bRg;
    }
}
