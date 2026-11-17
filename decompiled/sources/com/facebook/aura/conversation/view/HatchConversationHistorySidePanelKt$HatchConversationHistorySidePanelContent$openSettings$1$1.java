package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchSettingsPushScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$openSettings$1$1 extends AbstractC7559F3s implements G0U<HatchSubsurface, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onDismissRequest;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSubsurface hatchSubsurface) {
        C7384Etj.A0Y(hatchSubsurface, 0);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, hatchSubsurface, HatchScreen.CONVERSATION_HISTORY, HatchComponent.TAB_SETTINGS, null, null, null);
        this.$onDismissRequest.invoke();
        this.$navigator.navigate((AuraNavKey) new HatchSettingsPushScreenKey(null), false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$openSettings$1$1(Function0<Unit> function0, AuraNavigator auraNavigator) {
        super(1);
        this.$onDismissRequest = function0;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSubsurface hatchSubsurface) {
        invoke2(hatchSubsurface);
        return Unit.INSTANCE;
    }
}
