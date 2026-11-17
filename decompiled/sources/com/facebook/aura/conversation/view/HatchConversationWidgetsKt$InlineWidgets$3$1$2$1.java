package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.model.NavigationUiControl;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationWidgetsKt$InlineWidgets$3$1$2$1 extends AbstractC7559F3s implements G0U<NavigationUiControl, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NavigationUiControl navigationUiControl) {
        C7384Etj.A0Y(navigationUiControl, 0);
        HatchConversationWidgetsKt.performNavigationUiControl(navigationUiControl, this.$navigator);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationWidgetsKt$InlineWidgets$3$1$2$1(AuraNavigator auraNavigator) {
        super(1);
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(NavigationUiControl navigationUiControl) {
        invoke2(navigationUiControl);
        return Unit.INSTANCE;
    }
}
