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
public final class VoiceEmbodimentAvatarOverlayKt$callAvatarFraming$1$1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public final /* synthetic */ AWA $content;
    public final /* synthetic */ float $cropTop;
    public final /* synthetic */ VoiceAvatarFullScreenState $fullScreen;
    public final /* synthetic */ boolean $inSystemPip;

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt$callAvatarFraming$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
        public final /* synthetic */ AZE $child;
        public final /* synthetic */ BLU $frame;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AYU ayu) {
            C7384Etj.A0Y(ayu, 0);
            AZE aze = this.$child;
            BLU blu = this.$frame;
            int i = blu.A01;
            int i2 = blu.A03;
            ayu.A0A(aze, 0.0f, i, i2 + (((blu.A00 - i2) - aze.A00) / 2));
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
    public VoiceEmbodimentAvatarOverlayKt$callAvatarFraming$1$1(boolean z, VoiceAvatarFullScreenState voiceAvatarFullScreenState, float f, AWA awa) {
        super(3);
        this.$inSystemPip = z;
        this.$fullScreen = voiceAvatarFullScreenState;
        this.$cropTop = f;
        this.$content = awa;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m1771invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1134Abi m1771invoke3p2s80s(X.AXY r8, X.C3TG r9, long r10) {
        /*
            r7 = this;
            boolean r6 = X.C60P.A1Y(r8, r9)
            int r5 = androidx.compose.ui.unit.Constraints.A01(r10)
            if (r5 >= r6) goto Lb
            r5 = 1
        Lb:
            int r4 = androidx.compose.ui.unit.Constraints.A00(r10)
            if (r4 >= r6) goto L12
            r4 = 1
        L12:
            boolean r0 = r7.$inSystemPip
            if (r0 == 0) goto L6a
            r2 = 0
        L17:
            boolean r0 = r7.$inSystemPip
            if (r0 == 0) goto L65
            r1 = r4
        L1c:
            float r0 = r7.$cropTop
            X.BLU r3 = com.facebook.aura.partners.voice.screen.VoiceEmbodimentBackdropKt.callAvatarExpandingFrameBounds(r5, r1, r0, r4, r2)
            X.AWA r0 = r7.$content
            if (r0 == 0) goto L5f
            long r0 = r0.A00
            boolean r2 = X.AWA.A06(r0)
            if (r2 != 0) goto L5f
            int r7 = r3.A02
            int r2 = r3.A01
            int r7 = r7 - r2
            float r7 = (float) r7
            float r2 = X.C8j5.A03(r0)
            float r7 = r7 * r2
            float r0 = X.AnonymousClass003.A03(r0)
            float r7 = r7 / r0
            int r1 = X.Ab3.A01(r7)
        L42:
            int r2 = r3.A02
            int r0 = r3.A01
            int r2 = r2 - r0
            if (r2 >= r6) goto L4a
            r2 = 1
        L4a:
            if (r1 >= r6) goto L4d
            r1 = 1
        L4d:
            long r0 = androidx.compose.ui.unit.Constraints.A04(r2, r1)
            X.AZE r1 = r9.AQW(r0)
            com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt$callAvatarFraming$1$1$1 r0 = new com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt$callAvatarFraming$1$1$1
            r0.<init>(r1, r3)
            X.Abi r0 = X.AXY.A01(r8, r0, r5, r4)
            return r0
        L5f:
            int r1 = r3.A00
            int r0 = r3.A03
            int r1 = r1 - r0
            goto L42
        L65:
            int r1 = X.C3WD.A01(r2, r5, r4)
            goto L1c
        L6a:
            com.facebook.aura.partners.voice.screen.VoiceAvatarFullScreenState r0 = r7.$fullScreen
            float r2 = r0.getProgress()
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt$callAvatarFraming$1$1.m1771invoke3p2s80s(X.AXY, X.3TG, long):X.Abi");
    }
}
