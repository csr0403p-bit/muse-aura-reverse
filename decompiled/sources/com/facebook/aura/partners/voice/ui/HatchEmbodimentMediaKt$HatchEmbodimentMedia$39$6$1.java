package com.facebook.aura.partners.voice.ui;

import X.AWA;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BBI;
import X.BFM;
import X.BRg;
import X.G0W;

/* loaded from: classes.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$39$6$1 extends AbstractC7559F3s implements G0W<AWA, BFM, Integer, BRg> {
    public final /* synthetic */ BRg $activityContentModifier;
    public final /* synthetic */ G0W<AWA, BFM, Integer, BRg> $generatedIdleContentModifier;
    public final /* synthetic */ boolean $isGeneratedIdle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$39$6$1(boolean z, G0W<? super AWA, ? super BFM, ? super Integer, ? extends BRg> g0w, BRg bRg) {
        super(3);
        this.$isGeneratedIdle = z;
        this.$generatedIdleContentModifier = g0w;
        this.$activityContentModifier = bRg;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ BRg invoke(AWA awa, BFM bfm, Integer num) {
        return m1814invoken_ex7bg(awa, bfm, AnonymousClass001.A0F(num));
    }

    /* renamed from: invoke-n_ex7bg, reason: not valid java name */
    public final BRg m1814invoken_ex7bg(AWA awa, BFM bfm, int i) {
        BBI bbi;
        boolean z;
        BRg bRgInvoke;
        bfm.AgE(263428334);
        if (this.$isGeneratedIdle) {
            bfm.AgE(-248439917);
            bRgInvoke = this.$generatedIdleContentModifier.invoke(awa, bfm, Integer.valueOf(i & 14));
            bbi = (BBI) bfm;
            z = false;
            BBI.A0R(bbi, false);
        } else {
            bfm.AgE(-248438107);
            bbi = (BBI) bfm;
            z = false;
            BBI.A0R(bbi, false);
            bRgInvoke = this.$activityContentModifier;
        }
        BBI.A0R(bbi, z);
        return bRgInvoke;
    }
}
