package com.facebook.aura.assist;

import X.AXY;
import X.AYU;
import X.AZE;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C1BO;
import X.C3TG;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$3$1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public final /* synthetic */ AssistVoicePresentation $presentation;

    /* renamed from: com.facebook.aura.assist.HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
        public final /* synthetic */ AZE $child;
        public final /* synthetic */ AssistVoicePresentation $presentation;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AYU ayu) {
            C7384Etj.A0Y(ayu, 0);
            if (C1BO.A01(this.$presentation.progress) < 1.0f) {
                AYU.A04(ayu, this.$child, 0, 0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AssistVoicePresentation assistVoicePresentation, AZE aze) {
            super(1);
            this.$presentation = assistVoicePresentation;
            this.$child = aze;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
            invoke2(ayu);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$3$1(AssistVoicePresentation assistVoicePresentation) {
        super(3);
        this.$presentation = assistVoicePresentation;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m271invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1134Abi m271invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
        AnonymousClass003.A0u(axy, c3tg);
        AZE azeAQW = c3tg.AQW(j);
        return AnonymousClass002.A0X(axy, new AnonymousClass1(this.$presentation, azeAQW), azeAQW.A01, azeAQW.A00);
    }
}
