package com.facebook.aura.main;

import X.ATD;
import X.AbstractC7559F3s;
import X.B6A;
import X.C1D8;
import X.C2av;
import X.C7384Etj;
import X.EnumC1820Arj;
import X.G0U;
import com.facebook.aura.navigation.HatchSidePanelController;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSidePanelHostKt$hatchSidePanelScreenCard$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ HatchSidePanelController $controller;
    public final /* synthetic */ EnumC1820Arj $layoutDirection;
    public final /* synthetic */ float $panelWidthPx;
    public final /* synthetic */ long $shadowColor;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        float screenRevealOffsetPx = this.$controller.getScreenRevealOffsetPx();
        float f = this.$panelWidthPx;
        float fA03 = f > 0.0f ? ATD.A03(screenRevealOffsetPx / f, 0.0f, 1.0f) : 0.0f;
        c2av.Af5(screenRevealOffsetPx * HatchSidePanelHostKt.towardsOpenSign(this.$layoutDirection));
        if (fA03 != 0.0f) {
            c2av.Aeg(C1D8.A00(HatchSidePanelHostKt.SIDE_PANEL_SCREEN_CORNER_RADIUS * fA03));
            c2av.Ad2(true);
            if (this.$shadowColor != B6A.A06) {
                c2av.Aef(c2av.Ah4(HatchSidePanelHostKt.SIDE_PANEL_SCREEN_SHADOW_ELEVATION) * fA03);
                long j = this.$shadowColor;
                c2av.Acl(j);
                c2av.Aej(j);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSidePanelHostKt$hatchSidePanelScreenCard$1(HatchSidePanelController hatchSidePanelController, float f, EnumC1820Arj enumC1820Arj, long j) {
        super(1);
        this.$controller = hatchSidePanelController;
        this.$panelWidthPx = f;
        this.$layoutDirection = enumC1820Arj;
        this.$shadowColor = j;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
