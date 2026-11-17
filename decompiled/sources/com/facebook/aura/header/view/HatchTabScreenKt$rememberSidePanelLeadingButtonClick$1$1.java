package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.HatchSidePanelContentKey;
import com.facebook.aura.navigation.HatchSidePanelController;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchTabScreenKt$rememberSidePanelLeadingButtonClick$1$1 extends AbstractC7559F3s implements G0U<HeaderLeadingButton, Unit> {
    public final /* synthetic */ C1BO<G0U<HeaderLeadingButton, Unit>> $currentOnLeadingButtonClick$delegate;
    public final /* synthetic */ HatchSidePanelController $sidePanelController;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HeaderLeadingButton headerLeadingButton) {
        C7384Etj.A0Y(headerLeadingButton, 0);
        if (headerLeadingButton == HeaderLeadingButton.SidePanel) {
            this.$sidePanelController.toggle(HatchSidePanelContentKey.ConversationHistory.INSTANCE);
        }
        C1BO.A0B(this.$currentOnLeadingButtonClick$delegate).invoke(headerLeadingButton);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchTabScreenKt$rememberSidePanelLeadingButtonClick$1$1(HatchSidePanelController hatchSidePanelController, C1BO<? extends G0U<? super HeaderLeadingButton, Unit>> c1bo) {
        super(1);
        this.$sidePanelController = hatchSidePanelController;
        this.$currentOnLeadingButtonClick$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HeaderLeadingButton headerLeadingButton) {
        invoke2(headerLeadingButton);
        return Unit.INSTANCE;
    }
}
