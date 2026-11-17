package X;

/* loaded from: classes4.dex */
public final class BTA implements Ht9, G0U {
    public final int $t;
    public final Object A00;
    public final Object A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02be A[PHI: r2
  0x02be: PHI (r2v46 X.G0U) = (r2v45 X.G0U), (r2v48 X.G0U) binds: [B:85:0x02bc, B:80:0x02aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.AbstractCollection, java.util.AbstractList, java.util.ArrayList] */
    @Override // X.G0U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 1692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BTA.invoke(java.lang.Object):java.lang.Object");
    }

    public BTA(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public static BTA A00(BFM bfm, Object obj, Object obj2, int i) {
        BTA bta = new BTA(i, obj, obj2);
        bfm.Ai0(bta);
        return bta;
    }

    public static BTA A01(Object obj, Object obj2, int i) {
        return new BTA(i, obj, obj2);
    }
}
