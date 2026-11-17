package com.meta.compose.indication.bouncy;

import X.AOW;
import X.AT5;
import X.AT8;
import X.AW9;
import X.AaI;
import X.AbstractC1439Aj8;
import X.AnonymousClass001;
import X.BU0;
import X.C0dy;
import X.C1003AOr;
import X.C16Z;
import X.C7384Etj;
import X.InterfaceC1279AgP;
import X.InterfaceC1332AhJ;
import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class BouncyNode extends AbstractC1439Aj8 implements InterfaceC1332AhJ {
    public final C0dy A00;
    public final float A01 = 0.9f;
    public final AT5<Float, AOW> A02 = AT8.A00(1.0f);
    public final C1003AOr<Float> A03 = new C1003AOr<>(null, 0.5f, 400.0f);
    public final C1003AOr<Float> A04 = new C1003AOr<>(null, 0.5f, 400.0f);

    @Override // X.InterfaceC1332AhJ
    public final void draw(C16Z c16z) {
        C7384Etj.A0Y(c16z, 0);
        float fA00 = MutableState.A00(this.A02);
        long jADU = c16z.ADU();
        InterfaceC1279AgP interfaceC1279AgPAEq = c16z.AEq();
        AaI aaI = (AaI) interfaceC1279AgPAEq;
        AW9 aw9 = aaI.A02.A02;
        long jA00 = AW9.A00(aw9);
        try {
            aaI.A01.Ac6(fA00, fA00, jADU);
            c16z.A9O();
        } finally {
            AW9.A02(aw9, interfaceC1279AgPAEq, jA00);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.meta.compose.indication.bouncy.BouncyNode r7, X.HtJ r8) {
        /*
            r3 = 27
            boolean r0 = r8 instanceof X.C2310BTk
            if (r0 == 0) goto L40
            r6 = r8
            X.BTk r6 = (X.C2310BTk) r6
            int r0 = r6.$t
            if (r0 != r3) goto L40
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L40
            int r2 = r2 - r1
            r6.A00 = r2
        L18:
            java.lang.Object r1 = r6.A01
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L29
            if (r0 != r4) goto L46
            X.Hwg.A00(r1)
        L26:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L29:
            X.Hwg.A00(r1)
            X.AT5<java.lang.Float, X.AOW> r3 = r7.A02
            float r0 = r7.A01
            java.lang.Float r2 = X.C8j3.A0u(r0)
            X.AOr<java.lang.Float> r1 = r7.A03
            r6.A00 = r4
            r0 = 0
            java.lang.Object r0 = X.AnonymousClass002.A0i(r3, r1, r2, r6, r0)
            if (r0 != r5) goto L26
            return r5
        L40:
            X.BTk r6 = new X.BTk
            r6.<init>(r7, r8, r3)
            goto L18
        L46:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.compose.indication.bouncy.BouncyNode.A00(com.meta.compose.indication.bouncy.BouncyNode, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.meta.compose.indication.bouncy.BouncyNode r8, X.HtJ r9, boolean r10) {
        /*
            boolean r0 = r9 instanceof X.C1071AWc
            if (r0 == 0) goto L3e
            r7 = r9
            X.AWc r7 = (X.C1071AWc) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r3 = r7.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r7.label
            r0 = 1
            if (r1 == 0) goto L23
            if (r1 != r0) goto L44
            X.Hwg.A00(r3)
        L20:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L23:
            X.Hwg.A00(r3)
            X.AT5<java.lang.Float, X.AOW> r3 = r8.A02
            java.lang.Float r5 = X.AnonymousClass001.A0m()
            X.AOr<java.lang.Float> r4 = r8.A04
            java.lang.Float r6 = X.AnonymousClass001.A0l()
            r7.Z$0 = r10
            r7.label = r0
            r8 = 0
            java.lang.Object r0 = X.AT5.A00(r3, r4, r5, r6, r7, r8)
            if (r0 != r2) goto L20
            return r2
        L3e:
            X.AWc r7 = new X.AWc
            r7.<init>(r8, r9)
            goto L12
        L44:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.compose.indication.bouncy.BouncyNode.A01(com.meta.compose.indication.bouncy.BouncyNode, X.HtJ, boolean):java.lang.Object");
    }

    @Override // X.InterfaceC1332AhJ
    public final /* synthetic */ void onMeasureResultChanged() {
    }

    public BouncyNode(C0dy c0dy) {
        this.A00 = c0dy;
    }

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        AnonymousClass001.A1J(new BU0(this, null, 4), getCoroutineScope());
    }
}
