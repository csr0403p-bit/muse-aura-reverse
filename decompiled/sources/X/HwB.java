package X;

/* JADX INFO: Add missing generic type declarations: [R] */
/* loaded from: classes6.dex */
public final class HwB<R> implements C20Q<R> {
    public final /* synthetic */ Object A00;
    public final /* synthetic */ G0W A01;
    public final /* synthetic */ C20Q A02;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    @Override // X.C20Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(X.C20Z<? super R> r10, X.HtJ<? super kotlin.Unit> r11) {
        /*
            r9 = this;
            r3 = 7
            boolean r0 = r11 instanceof X.C8907FtP
            if (r0 == 0) goto L63
            r8 = r11
            X.FtP r8 = (X.C8907FtP) r8
            int r0 = r8.$t
            if (r0 != r3) goto L63
            int r2 = r8.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L63
            int r2 = r2 - r1
            r8.A01 = r2
        L17:
            java.lang.Object r1 = r8.A04
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r8.A01
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L2b
            if (r0 == r5) goto L43
            if (r0 != r6) goto L69
            X.Hwg.A00(r1)
        L28:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L2b:
            X.Hqv r3 = X.C3cG.A10(r1)
            java.lang.Object r0 = r9.A00
            r3.element = r0
            r8.A02 = r10
            r8.A03 = r3
            r4 = 0
            r8.A00 = r4
            r8.A01 = r5
            java.lang.Object r0 = r10.emit(r0, r8)
            if (r0 != r7) goto L4c
            return r7
        L43:
            int r4 = r8.A00
            java.lang.Object r3 = r8.A03
            java.lang.Object r10 = r8.A02
            X.Hwg.A00(r1)
        L4c:
            X.20Q r2 = r9.A02
            X.G0W r1 = r9.A01
            X.F5B r0 = new X.F5B
            r0.<init>(r1, r3, r10, r5)
            X.C8907FtP.A01(r8)
            r8.A00 = r4
            r8.A01 = r6
            java.lang.Object r0 = r2.collect(r0, r8)
            if (r0 != r7) goto L28
            return r7
        L63:
            X.FtP r8 = new X.FtP
            r8.<init>(r9, r11, r3)
            goto L17
        L69:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HwB.collect(X.20Z, X.HtJ):java.lang.Object");
    }

    public HwB(Object obj, G0W g0w, C20Q c20q) {
        this.A00 = obj;
        this.A02 = c20q;
        this.A01 = g0w;
    }
}
