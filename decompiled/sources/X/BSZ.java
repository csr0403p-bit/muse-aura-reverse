package X;

import java.util.Map;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BSZ implements InterfaceC1134Abi {
    public final int $t;
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public BSZ(C1369Ahv c1369Ahv, InterfaceC1134Abi interfaceC1134Abi, InterfaceC1134Abi interfaceC1134Abi2, int i, int i2) {
        this.$t = i2;
        this.A03 = c1369Ahv;
        this.A00 = i;
        this.A02 = interfaceC1134Abi2;
        this.A01 = interfaceC1134Abi;
    }

    @Override // X.InterfaceC1134Abi
    public final Map<AbstractC1493Ak0, Integer> ACJ() {
        return ((InterfaceC1134Abi) this.A01).ACJ();
    }

    @Override // X.InterfaceC1134Abi
    public final G0U<InterfaceC1620Amr, Unit> AJs() {
        return ((InterfaceC1134Abi) this.A01).AJs();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    @Override // X.InterfaceC1134Abi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AXv() {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.$t
            java.lang.Object r11 = r1.A03
            X.Ahv r11 = (X.C1369Ahv) r11
            if (r0 == 0) goto L21
            int r0 = r1.A00
            r11.A01 = r0
            java.lang.Object r0 = r1.A02
            X.Abi r0 = (X.InterfaceC1134Abi) r0
            r0.AXv()
            X.AjM r0 = r11.A0D
            X.AjM r0 = r0.A0B
            if (r0 != 0) goto L20
        L1b:
            int r0 = r11.A01
            r11.A0B(r0)
        L20:
            return
        L21:
            int r0 = r1.A00
            r11.A00 = r0
            java.lang.Object r0 = r1.A02
            X.Abi r0 = (X.InterfaceC1134Abi) r0
            r0.AXv()
            X.AHu<java.lang.Object, X.AfC> r10 = r11.A06
            long[] r9 = r10.A03
            int r0 = r9.length
            int r8 = r0 + (-2)
            if (r8 < 0) goto L1b
            r7 = 0
        L36:
            r16 = r9[r7]
            long r3 = X.C8j5.A0A(r16)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L9b
            int r0 = X.C8j3.A0E(r7, r8)
            r6 = 8
            int r5 = 8 - r0
            r4 = 0
        L4f:
            if (r4 >= r5) goto L99
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r16
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 >= 0) goto L91
            int r3 = r7 << 3
            int r3 = r3 + r4
            java.lang.Object[] r0 = r10.A04
            r12 = r0[r3]
            java.lang.Object[] r0 = r10.A05
            r15 = r0[r3]
            X.AfC r15 = (X.AfC) r15
            X.AHm<java.lang.Object> r13 = r11.A0A
            T[] r14 = r13.A01
            int r1 = r13.A00
            r2 = 0
        L6f:
            if (r2 >= r1) goto L83
            boolean r0 = X.C8j3.A1X(r12, r14, r2)
            if (r0 == 0) goto L96
            if (r2 < 0) goto L83
            int r0 = r11.A00
            if (r2 < r0) goto L91
            java.lang.Object r1 = X.AbstractC1360Ahl.A01
            T[] r0 = r13.A01
            r0[r2] = r1
        L83:
            X.AHu<java.lang.Object, X.AjM> r0 = r11.A08
            boolean r0 = r0.A06(r12)
            if (r0 == 0) goto L8e
            r15.dispose()
        L8e:
            r10.A0A(r3)
        L91:
            long r16 = r16 >> r6
            int r4 = r4 + 1
            goto L4f
        L96:
            int r2 = r2 + 1
            goto L6f
        L99:
            if (r5 != r6) goto L1b
        L9b:
            if (r7 == r8) goto L1b
            int r7 = r7 + 1
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BSZ.AXv():void");
    }

    @Override // X.InterfaceC1134Abi
    public final int getHeight() {
        return ((InterfaceC1134Abi) this.A01).getHeight();
    }

    @Override // X.InterfaceC1134Abi
    public final int getWidth() {
        return ((InterfaceC1134Abi) this.A01).getWidth();
    }
}
