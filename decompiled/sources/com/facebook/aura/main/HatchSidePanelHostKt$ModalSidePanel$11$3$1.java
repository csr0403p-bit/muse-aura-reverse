package com.facebook.aura.main;

import X.AnonymousClass001;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.navigation.HatchSidePanelController;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchSidePanelHostKt$ModalSidePanel$11$3$1 extends C7438Evz implements G0U<Boolean, Unit> {
    public HatchSidePanelHostKt$ModalSidePanel$11$3$1(Object obj) {
        super(1, obj, HatchSidePanelController.class, "updateSearchExpanded", "updateSearchExpanded(Z)V", 0);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((HatchSidePanelController) this.receiver).updateSearchExpanded(z);
    }
}
