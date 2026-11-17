package X;

import kotlin.Unit;

/* loaded from: classes5.dex */
public final class F5A implements C20Z {
    public final int $t;
    public final Object A00;
    public final Object A01;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(int r6, X.HtJ<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            r4 = 1
            boolean r0 = r7 instanceof X.C6925EcY
            if (r0 == 0) goto L47
            r3 = r7
            X.EcY r3 = (X.C6925EcY) r3
            int r0 = r3.$t
            if (r0 != r4) goto L47
            int r2 = r3.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r3.A01 = r2
        L17:
            java.lang.Object r1 = r3.A02
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.A01
            if (r0 == 0) goto L27
            if (r0 != r4) goto L4d
            X.Hwg.A00(r1)
        L24:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L27:
            X.Hwg.A00(r1)
            if (r6 <= 0) goto L24
            java.lang.Object r1 = r5.A00
            X.F1F r1 = (X.F1F) r1
            boolean r0 = r1.element
            if (r0 != 0) goto L24
            r1.element = r4
            java.lang.Object r1 = r5.A01
            X.20Z r1 = (X.C20Z) r1
            X.3Eq r0 = X.C3Eq.A02
            r3.A00 = r6
            r3.A01 = r4
            java.lang.Object r0 = r1.emit(r0, r3)
            if (r0 != r2) goto L24
            return r2
        L47:
            X.EcY r3 = new X.EcY
            r3.<init>(r5, r7, r4)
            goto L17
        L4d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F5A.A00(int, X.HtJ):java.lang.Object");
    }

    public F5A(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    @Override // X.C20Z
    public final /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
        if (this.$t != 0) {
            return A00(AnonymousClass001.A0F(obj), htJ);
        }
        ((EMu) this.A00).ASQ((ENN) obj, (EKE) this.A01);
        return Unit.INSTANCE;
    }
}
