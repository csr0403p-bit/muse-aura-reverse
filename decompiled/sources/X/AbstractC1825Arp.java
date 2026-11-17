package X;

/* renamed from: X.Arp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1825Arp {
    public static final long A01 = C19U.A03(14);
    public static final long A02 = C19U.A03(0);
    public static final long A00 = B6A.A06;
    public static final InterfaceC1829Art A03 = InterfaceC1829Art.A00(B6A.A01);

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(TT;TT;F)TT; */
    public static final Object A02(float f, Object obj, Object obj2) {
        return ((double) f) < 0.5d ? obj : obj2;
    }

    public static final long A00(long j, long j2, float f) {
        long j3 = j & 1095216660480L;
        if (j3 == 0 || (j2 & 1095216660480L) == 0) {
            return ((C1809ArT) A02(f, new C1809ArT(j), new C1809ArT(j2))).A00;
        }
        if (C1809ArT.A01(j) == C1809ArT.A01(j2)) {
            return C19U.A04(j3, AnonymousClass003.A01(f, C1809ArT.A00(j), C1809ArT.A00(j2)));
        }
        StringBuilder sbA0x = C60O.A0x("Cannot perform operation for ");
        sbA0x.append((Object) C1813ArX.A00(C1809ArT.A01(j)));
        sbA0x.append(" and ");
        throw C60O.A0i(C8j3.A14(C1813ArX.A00(C1809ArT.A01(j2)), sbA0x));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1824Aro A01(X.C1EQ r31, X.C1780Aqg r32, X.C16b r33, X.C1848AsL r34, X.C1824Aro r35, X.AbstractC1996Aw5 r36, X.B0A r37, X.B0I r38, X.C1736ApY r39, X.C0874AGa r40, X.ArS r41, X.BG3 r42, X.C1807ArQ r43, java.lang.String r44, float r45, long r46, long r48, long r50, long r52) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1825Arp.A01(X.1EQ, X.Aqg, X.16b, X.AsL, X.Aro, X.Aw5, X.B0A, X.B0I, X.ApY, X.AGa, X.ArS, X.BG3, X.ArQ, java.lang.String, float, long, long, long, long):X.Aro");
    }
}
