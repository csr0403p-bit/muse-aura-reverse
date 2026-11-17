package com.facebook.aura.conversation.view.richcontent;

import X.AXY;
import X.AYU;
import X.AZE;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C3TG;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchWidgetWebViewKt$HatchWidgetWebView$heightModifier$1$1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public final /* synthetic */ WidgetHeightState $heightState;

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt$HatchWidgetWebView$heightModifier$1$1$1, reason: invalid class name */
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
    public HatchWidgetWebViewKt$HatchWidgetWebView$heightModifier$1$1(WidgetHeightState widgetHeightState) {
        super(3);
        this.$heightState = widgetHeightState;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m692invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1134Abi m692invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
        long jA05;
        AnonymousClass003.A0u(axy, c3tg);
        int iClampWidgetHeightPx = HatchWidgetWebViewKt.clampWidgetHeightPx(this.$heightState.contentHeightPx.AGd());
        int iA00 = Constraints.A00(j);
        int i = 560 > iA00 ? iA00 : 560;
        if (iClampWidgetHeightPx > 0) {
            int iMax = Math.max(iClampWidgetHeightPx, HatchWidgetWebViewKt.clampWidgetHeightPx(this.$heightState.webViewHeightPx.AGd()));
            jA05 = Constraints.A05(Constraints.A03(j), Constraints.A01(j), iMax, iMax);
        } else {
            jA05 = Constraints.A05(Constraints.A03(j), Constraints.A01(j), i, i);
        }
        AZE azeAQW = c3tg.AQW(jA05);
        if (iClampWidgetHeightPx <= 0) {
            iClampWidgetHeightPx = Math.max(azeAQW.A00, i);
        }
        return AXY.A01(axy, new AnonymousClass1(azeAQW), azeAQW.A01, iClampWidgetHeightPx);
    }
}
