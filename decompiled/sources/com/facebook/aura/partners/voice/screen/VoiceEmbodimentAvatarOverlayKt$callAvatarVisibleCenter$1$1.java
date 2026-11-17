package com.facebook.aura.partners.voice.screen;

import X.AXY;
import X.AYU;
import X.AZE;
import X.AbstractC7559F3s;
import X.AnonymousClass004;
import X.C3TG;
import X.C3WD;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class VoiceEmbodimentAvatarOverlayKt$callAvatarVisibleCenter$1$1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public final /* synthetic */ VoiceAvatarFullScreenState $fullScreen;
    public final /* synthetic */ boolean $inSystemPip;

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt$callAvatarVisibleCenter$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
        public final /* synthetic */ AZE $child;
        public final /* synthetic */ int $visibleHeight;
        public final /* synthetic */ int $width;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AYU ayu) {
            C7384Etj.A0Y(ayu, 0);
            AZE aze = this.$child;
            ayu.A0A(aze, 0.0f, (this.$width - aze.A01) / 2, (this.$visibleHeight - aze.A00) / 2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AZE aze, int i, int i2) {
            super(1);
            this.$child = aze;
            this.$width = i;
            this.$visibleHeight = i2;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
            invoke2(ayu);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentAvatarOverlayKt$callAvatarVisibleCenter$1$1(boolean z, VoiceAvatarFullScreenState voiceAvatarFullScreenState) {
        super(3);
        this.$inSystemPip = z;
        this.$fullScreen = voiceAvatarFullScreenState;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m1772invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1134Abi m1772invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
        boolean zA1b = AnonymousClass004.A1b(axy, c3tg);
        int iA01 = Constraints.A01(j);
        int iA00 = Constraints.A00(j);
        return AXY.A01(axy, new AnonymousClass1(c3tg.AQW(Constraints.A05(zA1b ? 1 : 0, iA01, zA1b ? 1 : 0, iA00)), iA01, this.$inSystemPip ? iA00 : C3WD.A01(this.$fullScreen.getProgress(), iA01, iA00)), iA01, iA00);
    }
}
