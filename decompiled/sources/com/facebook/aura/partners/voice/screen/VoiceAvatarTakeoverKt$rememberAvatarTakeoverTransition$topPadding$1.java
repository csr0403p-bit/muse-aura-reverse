package com.facebook.aura.partners.voice.screen;

import X.AOB;
import X.AOe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C1DG;
import X.G0W;
import com.facebook.aura.header.api.AvatarTakeoverLayout;

/* loaded from: classes.dex */
public final class VoiceAvatarTakeoverKt$rememberAvatarTakeoverTransition$topPadding$1 extends AbstractC7559F3s implements G0W<AOB<Boolean>, BFM, Integer, AOe<C1DG>> {
    public final /* synthetic */ AvatarTakeoverLayout $layout;
    public final /* synthetic */ float $selectedAvatarSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceAvatarTakeoverKt$rememberAvatarTakeoverTransition$topPadding$1(AvatarTakeoverLayout avatarTakeoverLayout, float f) {
        super(3);
        this.$layout = avatarTakeoverLayout;
        this.$selectedAvatarSize = f;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ AOe<C1DG> invoke(AOB<Boolean> aob, BFM bfm, Integer num) {
        return invoke(aob, bfm, AnonymousClass001.A0F(num));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AOe<X.C1DG> invoke(X.AOB<java.lang.Boolean> r4, X.BFM r5, int r6) {
        /*
            r3 = this;
            r2 = 0
            X.C7384Etj.A0Y(r4, r2)
            r0 = -866633856(0xffffffffcc583780, float:-5.6679936E7)
            r5.AgE(r0)
            java.lang.Object r0 = r4.ALW()
            boolean r0 = X.AnonymousClass001.A1X(r0)
            if (r0 == 0) goto L24
            com.facebook.aura.header.api.AvatarTakeoverLayout r0 = r3.$layout
            if (r0 == 0) goto L2e
            float r1 = r0.size
        L1a:
            float r0 = r3.$selectedAvatarSize
            int r1 = X.C1DG.A01(r1, r0)
            r0 = 220(0xdc, float:3.08E-43)
            if (r1 < 0) goto L26
        L24:
            r0 = 350(0x15e, float:4.9E-43)
        L26:
            X.ASj r0 = X.AnonymousClass001.A0K(r0, r2)
            X.AnonymousClass001.A1D(r5)
            return r0
        L2e:
            float r1 = r3.$selectedAvatarSize
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$rememberAvatarTakeoverTransition$topPadding$1.invoke(X.AOB, X.BFM, int):X.AOe");
    }
}
