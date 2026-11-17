package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BU0 extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BU0(Object obj, C1719Ap4 c1719Ap4, HtJ<? super BU0> htJ) {
        super(2, c1719Ap4);
        this.$t = htJ;
        this.A01 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        int i;
        int i2 = this.$t;
        Object obj2 = this.A01;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            default:
                i = 4;
                break;
        }
        return new BU0(obj2, htJ, i);
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        int i2 = this.$t;
        HtJ htJ = (HtJ) obj2;
        Object obj3 = this.A01;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            default:
                i = 4;
                break;
        }
        return new BU0(obj3, htJ, i).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0028 A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.$t
            switch(r0) {
                case 0: goto L29;
                case 1: goto L42;
                case 2: goto L5b;
                case 3: goto L70;
                default: goto L5;
            }
        L5:
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r6.A00
            r5 = 1
            if (r0 != 0) goto Lad
            X.Hwg.A00(r7)
            java.lang.Object r4 = r6.A01
            com.meta.compose.indication.bouncy.BouncyNode r4 = (com.meta.compose.indication.bouncy.BouncyNode) r4
            X.0dy r0 = r4.A00
            X.1qN r0 = (X.C1qN) r0
            X.3Em<X.1Xu> r3 = r0.A00
            r1 = 8
            X.BSP r0 = new X.BSP
            r0.<init>(r4, r1)
            r6.A00 = r5
            java.lang.Object r0 = r3.collect(r0, r6)
        L26:
            if (r0 != r2) goto Lb0
            return r2
        L29:
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r6.A00
            r1 = 1
            if (r0 != 0) goto Lad
            X.Hwg.A00(r7)
            java.lang.Object r0 = r6.A01
            X.Ap4 r0 = (X.C1719Ap4) r0
            androidx.compose.ui.platform.AndroidComposeView r0 = r0.A04
            r6.A00 = r1
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r0 = r0.A0v
            java.lang.Object r0 = r0.A0R(r6)
            goto L26
        L42:
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r6.A00
            r1 = 1
            if (r0 != 0) goto Lad
            X.Hwg.A00(r7)
            java.lang.Object r0 = r6.A01
            X.Ap4 r0 = (X.C1719Ap4) r0
            androidx.compose.ui.platform.AndroidComposeView r0 = r0.A04
            r6.A00 = r1
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager r0 = r0.A06
            java.lang.Object r0 = r0.A07(r6)
            goto L26
        L5b:
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r6.A00
            r1 = 1
            if (r0 != 0) goto Lad
            X.Hwg.A00(r7)
            java.lang.Object r0 = r6.A01
            androidx.compose.ui.text.font.AsyncFontListLoader r0 = (androidx.compose.ui.text.font.AsyncFontListLoader) r0
            r6.A00 = r1
            java.lang.Object r0 = r0.A01(r6)
            goto L26
        L70:
            int r0 = r6.A00
            if (r0 != 0) goto La8
            X.Hwg.A00(r7)
            com.meta.maps.core.MapsSdkProvider$Companion r2 = com.meta.maps.core.MapsSdkProvider.Companion
            com.meta.maps.display.SdkModule r0 = com.meta.maps.display.SdkModule.INSTANCE
            r1 = 0
            r2.register(r0, r1)
            com.meta.maps.display.camera.SdkModule r0 = com.meta.maps.display.camera.SdkModule.INSTANCE
            r2.register(r0, r1)
            com.meta.maps.display.logging.SdkModule r0 = com.meta.maps.display.logging.SdkModule.INSTANCE
            r2.register(r0, r1)
            com.meta.maps.display.routeline.SdkModule r0 = com.meta.maps.display.routeline.SdkModule.INSTANCE
            r2.register(r0, r1)
            com.meta.maps.fancypins.SdkModule r0 = com.meta.maps.fancypins.SdkModule.INSTANCE
            r2.register(r0, r1)
            com.meta.maps.display.fancypins.SdkModule r0 = com.meta.maps.display.fancypins.SdkModule.INSTANCE
            r2.register(r0, r1)
            r2.loadLibrary()
            java.lang.Object r0 = r6.A01
            X.AL9 r0 = (X.AL9) r0
            X.AFV r0 = r0.A0X
            kotlin.jvm.functions.Function0<com.meta.maps.core.MapsSdkProvider> r0 = r0.A03
            java.lang.Object r2 = r0.invoke()
            return r2
        La8:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        Lad:
            X.Hwg.A00(r7)
        Lb0:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BU0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
