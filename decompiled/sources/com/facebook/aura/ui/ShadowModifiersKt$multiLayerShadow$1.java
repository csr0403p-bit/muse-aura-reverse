package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.BRg;
import X.G0W;

/* loaded from: classes.dex */
public final class ShadowModifiersKt$multiLayerShadow$1 extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, BRg> {
    public final /* synthetic */ float $alpha;
    public final /* synthetic */ float $borderRadius;
    public final /* synthetic */ long $color;
    public final /* synthetic */ int $layers;
    public final /* synthetic */ float $shadowRadius;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowModifiersKt$multiLayerShadow$1(int i, long j, float f, float f2, float f3) {
        super(3);
        this.$layers = i;
        this.$color = j;
        this.$alpha = f;
        this.$shadowRadius = f2;
        this.$borderRadius = f3;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ BRg invoke(BRg bRg, BFM bfm, Integer num) {
        return invoke(bRg, bfm, AnonymousClass001.A0F(num));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.BRg invoke(X.BRg r10, X.BFM r11, int r12) {
        /*
            r9 = this;
            r0 = 0
            X.C7384Etj.A0Y(r10, r0)
            r0 = 1907824152(0x71b71618, float:1.813199E30)
            r11.AgE(r0)
            int r0 = r9.$layers
            boolean r0 = r11.A63(r0)
            int r2 = r9.$layers
            java.lang.Object r8 = r11.AaT()
            if (r0 != 0) goto L1c
            java.lang.Object r0 = X.C78N.A00
            if (r8 != r0) goto L2e
        L1c:
            X.AhH[] r8 = new X.InterfaceC1330AhH[r2]
            r1 = 0
        L1f:
            if (r1 >= r2) goto L2b
            X.AqX r0 = new X.AqX
            r0.<init>()
            r8[r1] = r0
            int r1 = r1 + 1
            goto L1f
        L2b:
            r11.Ai0(r8)
        L2e:
            X.AhH[] r8 = (X.InterfaceC1330AhH[]) r8
            long r0 = r9.$color
            boolean r1 = r11.A64(r0)
            int r0 = r9.$layers
            boolean r1 = X.AnonymousClass001.A1a(r1, r11, r0)
            float r0 = r9.$alpha
            boolean r0 = r11.A62(r0)
            r1 = r1 | r0
            float r0 = r9.$shadowRadius
            boolean r0 = r11.A62(r0)
            boolean r1 = X.AnonymousClass002.A1V(r11, r8, r1, r0)
            float r0 = r9.$borderRadius
            boolean r0 = r11.A62(r0)
            r1 = r1 | r0
            long r3 = r9.$color
            int r5 = r9.$layers
            float r6 = r9.$alpha
            float r7 = r9.$shadowRadius
            float r9 = r9.$borderRadius
            java.lang.Object r2 = r11.AaT()
            if (r1 != 0) goto L68
            java.lang.Object r0 = X.C78N.A00
            if (r2 != r0) goto L70
        L68:
            com.facebook.aura.ui.ShadowModifiersKt$multiLayerShadow$1$1$1 r2 = new com.facebook.aura.ui.ShadowModifiersKt$multiLayerShadow$1$1$1
            r2.<init>(r3, r5, r6, r7, r8, r9)
            r11.Ai0(r2)
        L70:
            X.G0U r2 = (X.G0U) r2
            X.BRg r0 = X.AEk.A01(r10, r2)
            X.AnonymousClass001.A1D(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.ShadowModifiersKt$multiLayerShadow$1.invoke(X.BRg, X.BFM, int):X.BRg");
    }
}
