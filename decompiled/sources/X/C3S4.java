package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.3S4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3S4 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public final /* synthetic */ AOP<T> $transition;
    public final /* synthetic */ G0U<T, Boolean> $visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/G0U<-TT;Ljava/lang/Boolean;>;LX/AOP<TT;>;)V */
    public C3S4(AOP aop, G0U g0u) {
        super(3);
        this.$visible = g0u;
        this.$transition = aop;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    @Override // X.G0W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ X.InterfaceC1134Abi invoke(X.AXY r10, X.C3TG r11, androidx.compose.ui.unit.Constraints r12) {
        /*
            r9 = this;
            X.AXY r10 = (X.AXY) r10
            X.3TG r11 = (X.C3TG) r11
            androidx.compose.ui.unit.Constraints r12 = (androidx.compose.ui.unit.Constraints) r12
            long r0 = r12.A00
            X.AZE r6 = r11.AQW(r0)
            boolean r0 = r10.AOh()
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r4 = 32
            if (r0 == 0) goto L3b
            X.G0U<T, java.lang.Boolean> r1 = r9.$visible
            X.AOP<T> r0 = r9.$transition
            androidx.compose.runtime.MutableState r0 = r0.A07
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.AnonymousClass003.A1X(r0, r1)
            if (r0 != 0) goto L3b
            r2 = 0
        L2b:
            long r0 = r2 >> r4
            int r5 = (int) r0
            long r2 = r2 & r7
            int r4 = (int) r2
            r1 = 1
            X.3bs r0 = new X.3bs
            r0.<init>(r6, r1)
            X.Abi r0 = X.AnonymousClass002.A0X(r10, r0, r5, r4)
            return r0
        L3b:
            int r1 = r6.A01
            int r0 = r6.A00
            long r2 = (long) r1
            long r2 = r2 << r4
            long r0 = (long) r0
            long r0 = r0 & r7
            long r2 = r2 | r0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3S4.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
