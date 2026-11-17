package com.facebook.aura.main;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.HatchSidePanelController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSidePanelHostKt$HatchSidePanelScreenScrim$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchSidePanelController $sidePanelController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSidePanelHostKt$HatchSidePanelScreenScrim$1$1$1(HatchSidePanelController hatchSidePanelController) {
        super(0);
        this.$sidePanelController = hatchSidePanelController;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.CHAT, null, HatchScreen.CONVERSATION_HISTORY, HatchComponent.THREAD_SIDEBAR, null, null);
        this.$sidePanelController.close();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
