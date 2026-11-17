package X;

import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.3Sp, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3Sp<T> extends AbstractC1439Aj8 implements InterfaceC1356Ahh {
    public EnumC1108AYu A00;
    public AnchoredDraggableState<T> A01;
    public G0V<? super BL4, ? super Constraints, ? extends HxE<? extends C3Sn<T>, ? extends T>> A02;
    public boolean A03;

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        this.A03 = false;
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQN(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A00(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQP(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A01(c3Tr, c3tf, this, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    @Override // X.InterfaceC1356Ahh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1134Abi AQV(X.AXY r10, X.C3TG r11, long r12) {
        /*
            r9 = this;
            X.AZE r4 = r11.AQW(r12)
            boolean r0 = r10.AOh()
            if (r0 == 0) goto Le
            boolean r0 = r9.A03
            if (r0 != 0) goto L89
        Le:
            int r0 = r4.A01
            int r1 = r4.A00
            long r2 = (long) r0
            r0 = 32
            long r2 = r2 << r0
            long r0 = (long) r1
            long r0 = X.AnonymousClass002.A0G(r0, r2)
            X.G0V<? super X.BL4, ? super androidx.compose.ui.unit.Constraints, ? extends X.HxE<? extends X.3Sn<T>, ? extends T>> r3 = r9.A02
            X.BL4 r2 = new X.BL4
            r2.<init>(r0)
            androidx.compose.ui.unit.Constraints r0 = new androidx.compose.ui.unit.Constraints
            r0.<init>(r12)
            java.lang.Object r0 = r3.invoke(r2, r0)
            X.HxE r0 = (X.HxE) r0
            androidx.compose.material3.internal.AnchoredDraggableState<T> r8 = r9.A01
            A r2 = r0.first
            B r7 = r0.second
            androidx.compose.runtime.MutableState r1 = r8.A06
            java.lang.Object r0 = r1.getValue()
            boolean r0 = X.C7384Etj.areEqual(r0, r2)
            if (r0 != 0) goto L89
            r1.Af8(r2)
            X.3St r0 = r8.A03
            X.BLa r6 = r0.A01
            r5 = 0
            boolean r0 = r6.AhW(r5)
            if (r0 == 0) goto L80
            X.3TN r1 = r8.A02     // Catch: java.lang.Throwable -> L7b
            androidx.compose.runtime.MutableState r0 = r8.A06     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L7b
            X.3Sn r0 = (X.C3Sn) r0     // Catch: java.lang.Throwable -> L7b
            float r3 = r0.AYD(r7)     // Catch: java.lang.Throwable -> L7b
            boolean r0 = java.lang.Float.isNaN(r3)     // Catch: java.lang.Throwable -> L7b
            if (r0 != 0) goto L75
            r2 = 0
            X.3T6 r1 = (X.C3T6) r1     // Catch: java.lang.Throwable -> L7b
            androidx.compose.material3.internal.AnchoredDraggableState<T> r1 = r1.A00     // Catch: java.lang.Throwable -> L7b
            X.00q r0 = r1.A05     // Catch: java.lang.Throwable -> L7b
            r0.AdS(r3)     // Catch: java.lang.Throwable -> L7b
            X.00q r0 = r1.A04     // Catch: java.lang.Throwable -> L7b
            r0.AdS(r2)     // Catch: java.lang.Throwable -> L7b
            androidx.compose.runtime.MutableState r0 = r8.A08     // Catch: java.lang.Throwable -> L7b
            r0.Af8(r5)     // Catch: java.lang.Throwable -> L7b
        L75:
            androidx.compose.runtime.MutableState r0 = r8.A07     // Catch: java.lang.Throwable -> L7b
            r0.Af8(r7)     // Catch: java.lang.Throwable -> L7b
            goto L86
        L7b:
            r0 = move-exception
            r6.Ahe(r5)
            throw r0
        L80:
            androidx.compose.runtime.MutableState r0 = r8.A08
            r0.Af8(r7)
            goto L89
        L86:
            r6.Ahe(r5)
        L89:
            boolean r0 = r10.AOh()
            if (r0 != 0) goto L94
            boolean r1 = r9.A03
            r0 = 0
            if (r1 == 0) goto L95
        L94:
            r0 = 1
        L95:
            r9.A03 = r0
            int r3 = r4.A01
            int r2 = r4.A00
            r1 = 2
            X.3c4 r0 = new X.3c4
            r0.<init>(r9, r4, r10, r1)
            X.Abi r0 = X.AnonymousClass002.A0X(r10, r0, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3Sp.AQV(X.AXY, X.3TG, long):X.Abi");
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQp(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A02(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQr(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A03(c3Tr, c3tf, this, i);
    }
}
