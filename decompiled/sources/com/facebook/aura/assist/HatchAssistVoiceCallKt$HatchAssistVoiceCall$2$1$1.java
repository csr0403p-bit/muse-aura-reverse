package com.facebook.aura.assist;

import X.AXY;
import X.AYU;
import X.AZE;
import X.Ab3;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C3TG;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAssistVoiceCallKt$HatchAssistVoiceCall$2$1$1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public final /* synthetic */ AssistVoiceLayout $layout;

    /* renamed from: com.facebook.aura.assist.HatchAssistVoiceCallKt$HatchAssistVoiceCall$2$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
        public final /* synthetic */ AZE $child;
        public final /* synthetic */ AssistVoiceLayout $layout;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AYU ayu) {
            C7384Etj.A0Y(ayu, 0);
            AZE aze = this.$child;
            int iA01 = Ab3.A01((this.$layout.controlsTop - aze.A00) - (12.0f * ayu.AEm()));
            if (iA01 < 0) {
                iA01 = 0;
            }
            ayu.A0A(aze, 0.0f, 0, iA01);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AZE aze, AssistVoiceLayout assistVoiceLayout) {
            super(1);
            this.$child = aze;
            this.$layout = assistVoiceLayout;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
            invoke2(ayu);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAssistVoiceCallKt$HatchAssistVoiceCall$2$1$1(AssistVoiceLayout assistVoiceLayout) {
        super(3);
        this.$layout = assistVoiceLayout;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m274invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1134Abi m274invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
        ?? A1b = AnonymousClass004.A1b(axy, c3tg);
        int iA01 = Ab3.A01(this.$layout.controlsTop);
        if (iA01 < A1b) {
            iA01 = 0;
        }
        int iA03 = Constraints.A03(j);
        int iA012 = Constraints.A01(j);
        AZE azeAQW = c3tg.AQW(Constraints.A05(iA03, iA012, A1b == true ? 1 : 0, iA01));
        return AnonymousClass002.A0X(axy, new AnonymousClass1(azeAQW, this.$layout), iA012, Constraints.A00(j));
    }
}
