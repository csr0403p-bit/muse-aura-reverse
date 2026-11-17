package com.facebook.aura.partners.voice.screen;

import X.AXY;
import X.AYL;
import X.AYU;
import X.AZE;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C1BO;
import X.C1Ny;
import X.C3TG;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class VoiceCallCaptionOverlayKt$VoiceCallCaptionOverlay$4$1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public final /* synthetic */ C1BO<Integer> $animatedChromeInset;
    public final /* synthetic */ C1Ny $ime;

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallCaptionOverlayKt$VoiceCallCaptionOverlay$4$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
        public final /* synthetic */ AZE $placeable;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AYU ayu) {
            C7384Etj.A0Y(ayu, 0);
            ayu.A0A(this.$placeable, 0.0f, 0, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AZE aze) {
            super(1);
            this.$placeable = aze;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
            invoke2(ayu);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallCaptionOverlayKt$VoiceCallCaptionOverlay$4$1(C1BO<Integer> c1bo, C1Ny c1Ny) {
        super(3);
        this.$animatedChromeInset = c1bo;
        this.$ime = c1Ny;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m1756invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1134Abi m1756invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
        boolean zA1b = AnonymousClass004.A1b(axy, c3tg);
        AZE azeAQW = c3tg.AQW(AYL.A08(j, zA1b ? 1 : 0, -(Math.max(C1BO.A02(this.$animatedChromeInset), this.$ime.ACy(axy)) + axy.Abr(AuraDimensKt.SpacingSmall))));
        return AnonymousClass002.A0X(axy, new AnonymousClass1(azeAQW), Constraints.A01(j), Constraints.A00(j));
    }
}
