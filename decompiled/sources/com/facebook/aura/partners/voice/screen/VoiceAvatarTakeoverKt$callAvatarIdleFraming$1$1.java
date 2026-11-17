package com.facebook.aura.partners.voice.screen;

import X.AWA;
import X.AXY;
import X.AYU;
import X.AZE;
import X.AbstractC7559F3s;
import X.BLU;
import X.C3TG;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class VoiceAvatarTakeoverKt$callAvatarIdleFraming$1$1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public final /* synthetic */ AWA $content;
    public final /* synthetic */ float $cropTopFraction;
    public final /* synthetic */ VoiceAvatarFullScreenState $fullScreen;
    public final /* synthetic */ boolean $inSystemPip;

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$callAvatarIdleFraming$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
        public final /* synthetic */ AZE $child;
        public final /* synthetic */ BLU $frame;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AYU ayu) {
            C7384Etj.A0Y(ayu, 0);
            AZE aze = this.$child;
            BLU blu = this.$frame;
            int i = blu.A01;
            int i2 = i + (((blu.A02 - i) - aze.A01) / 2);
            int i3 = blu.A03;
            ayu.A0A(aze, 0.0f, i2, i3 + (((blu.A00 - i3) - aze.A00) / 2));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AZE aze, BLU blu) {
            super(1);
            this.$child = aze;
            this.$frame = blu;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
            invoke2(ayu);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceAvatarTakeoverKt$callAvatarIdleFraming$1$1(float f, VoiceAvatarFullScreenState voiceAvatarFullScreenState, boolean z, AWA awa) {
        super(3);
        this.$cropTopFraction = f;
        this.$fullScreen = voiceAvatarFullScreenState;
        this.$inSystemPip = z;
        this.$content = awa;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m1752invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Type inference failed for: r8v0, types: [boolean] */
    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1134Abi m1752invoke3p2s80s(X.AXY r11, X.C3TG r12, long r13) {
        /*
            r10 = this;
            boolean r8 = X.C60P.A1Y(r11, r12)
            int r6 = androidx.compose.ui.unit.Constraints.A01(r13)
            if (r6 >= r8) goto Lb
            r6 = 1
        Lb:
            int r5 = androidx.compose.ui.unit.Constraints.A00(r13)
            if (r5 >= r8) goto L12
            r5 = 1
        L12:
            float r2 = r10.$cropTopFraction
            float r1 = (float) r6
            com.facebook.aura.partners.voice.screen.VoiceAvatarFullScreenState r0 = r10.$fullScreen
            float r0 = r0.getAspectRatio()
            float r1 = r1 / r0
            int r1 = X.Ab3.A01(r1)
            boolean r0 = r10.$inSystemPip
            if (r0 == 0) goto L7a
            r0 = 0
        L25:
            X.BLU r7 = com.facebook.aura.partners.voice.screen.VoiceEmbodimentBackdropKt.callAvatarExpandingFrameBounds(r6, r5, r2, r1, r0)
            X.AWA r0 = r10.$content
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r0 == 0) goto L69
            long r3 = r0.A00
            boolean r0 = X.AWA.A06(r3)
            if (r0 != 0) goto L69
        L3a:
            int r9 = r7.A02
            int r0 = r7.A01
            int r9 = r9 - r0
            float r10 = (float) r9
            float r0 = X.AnonymousClass001.A00(r3)
            float r10 = r10 / r0
            int r9 = X.Ab3.A02(r0, r10)
            if (r9 >= r8) goto L4c
            r9 = 1
        L4c:
            float r0 = X.AnonymousClass001.A01(r1, r3)
            int r0 = X.Ab3.A02(r0, r10)
            if (r0 >= r8) goto L57
            r0 = 1
        L57:
            long r0 = X.AYL.A06(r9, r9, r0, r0)
            X.AZE r1 = r12.AQW(r0)
            com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$callAvatarIdleFraming$1$1$1 r0 = new com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$callAvatarIdleFraming$1$1$1
            r0.<init>(r1, r7)
            X.Abi r0 = X.AXY.A01(r11, r0, r6, r5)
            return r0
        L69:
            int r3 = r7.A02
            int r0 = r7.A01
            int r3 = r3 - r0
            float r4 = (float) r3
            int r3 = r7.A00
            int r0 = r7.A03
            int r3 = r3 - r0
            float r0 = (float) r3
            long r3 = X.AnonymousClass005.A0L(r4, r0)
            goto L3a
        L7a:
            com.facebook.aura.partners.voice.screen.VoiceAvatarFullScreenState r0 = r10.$fullScreen
            float r0 = r0.getProgress()
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$callAvatarIdleFraming$1$1.m1752invoke3p2s80s(X.AXY, X.3TG, long):X.Abi");
    }
}
