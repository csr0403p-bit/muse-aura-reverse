package com.facebook.aura.partners.voice.screen;

import X.AXY;
import X.AYL;
import X.AYU;
import X.AZE;
import X.Ab3;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C3TG;
import X.C60P;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class VoiceAvatarTakeoverKt$callAvatarIdleViewport$1$1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public final /* synthetic */ VoiceAvatarFullScreenState $fullScreen;

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$callAvatarIdleViewport$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
        public final /* synthetic */ AZE $child;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AYU ayu) {
            C7384Etj.A0Y(ayu, 0);
            ayu.A0A(this.$child, 0.0f, 0, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AZE aze) {
            super(1);
            this.$child = aze;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
            invoke2(ayu);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceAvatarTakeoverKt$callAvatarIdleViewport$1$1(VoiceAvatarFullScreenState voiceAvatarFullScreenState) {
        super(3);
        this.$fullScreen = voiceAvatarFullScreenState;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m1753invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [boolean] */
    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1134Abi m1753invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
        ?? A1Y = C60P.A1Y(axy, c3tg);
        int iA01 = Constraints.A01(j);
        if (iA01 < A1Y) {
            iA01 = 1;
        }
        int iA00 = Constraints.A00(j);
        int iA012 = Ab3.A01(AnonymousClass003.A01(this.$fullScreen.getProgress(), iA00, iA01 / this.$fullScreen.getAspectRatio()));
        if (iA012 < A1Y) {
            iA012 = 1;
        }
        return AXY.A01(axy, new AnonymousClass1(c3tg.AQW(AYL.A06(iA01, iA01, iA012, iA012))), iA01, iA00);
    }
}
