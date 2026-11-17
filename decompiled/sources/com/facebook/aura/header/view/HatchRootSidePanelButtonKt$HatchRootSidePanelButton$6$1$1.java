package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.C0Hi;
import com.facebook.aura.navigation.HatchSidePanelContentKey;
import com.facebook.aura.navigation.HatchSidePanelController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchRootSidePanelButtonKt$HatchRootSidePanelButton$6$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ HatchSidePanelController $sidePanelController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRootSidePanelButtonKt$HatchRootSidePanelButton$6$1$1(C0Hi c0Hi, HatchSidePanelController hatchSidePanelController) {
        super(0);
        this.$focusManager = c0Hi;
        this.$sidePanelController = hatchSidePanelController;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$focusManager.A6G(false);
        this.$sidePanelController.toggle(HatchSidePanelContentKey.ConversationHistory.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
