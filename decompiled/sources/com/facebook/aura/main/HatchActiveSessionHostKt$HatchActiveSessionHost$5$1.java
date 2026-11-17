package com.facebook.aura.main;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.HatchSidePanelController;
import com.facebook.aura.ui.adaptive.AuraSidePanelPresentation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchActiveSessionHostKt$HatchActiveSessionHost$5$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchSidePanelController $sidePanelController;
    public final /* synthetic */ AuraSidePanelPresentation $sidePanelPresentation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchActiveSessionHostKt$HatchActiveSessionHost$5$1(HatchSidePanelController hatchSidePanelController, AuraSidePanelPresentation auraSidePanelPresentation) {
        super(0);
        this.$sidePanelController = hatchSidePanelController;
        this.$sidePanelPresentation = auraSidePanelPresentation;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$sidePanelController.updatePresentation(this.$sidePanelPresentation);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
