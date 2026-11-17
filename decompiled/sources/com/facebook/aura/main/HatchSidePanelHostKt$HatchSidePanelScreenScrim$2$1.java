package com.facebook.aura.main;

import X.AT3;
import X.ATD;
import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.HatchSidePanelController;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSidePanelHostKt$HatchSidePanelScreenScrim$2$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ float $panelWidthPx;
    public final /* synthetic */ long $scrimColor;
    public final /* synthetic */ HatchSidePanelController $sidePanelController;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        float fA03 = ATD.A03(this.$sidePanelController.revealOffsetPx$delegate.AFn() / this.$panelWidthPx, 0.0f, 1.0f);
        if (fA03 > 0.0f) {
            AnonymousClass005.A0r(at3, fA03, this.$scrimColor);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSidePanelHostKt$HatchSidePanelScreenScrim$2$1(HatchSidePanelController hatchSidePanelController, float f, long j) {
        super(1);
        this.$sidePanelController = hatchSidePanelController;
        this.$panelWidthPx = f;
        this.$scrimColor = j;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
