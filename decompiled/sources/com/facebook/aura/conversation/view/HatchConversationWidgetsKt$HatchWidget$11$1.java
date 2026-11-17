package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.model.IdeaWidgetData;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.IdeaWidgetDetailSheetKey;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationWidgetsKt$HatchWidget$11$1 extends AbstractC7559F3s implements G0U<IdeaWidgetData, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(IdeaWidgetData ideaWidgetData) {
        C7384Etj.A0Y(ideaWidgetData, 0);
        IdeaWidgetDetailDataHolder.INSTANCE.put(ideaWidgetData);
        this.$navigator.navigate((AuraNavKey) new IdeaWidgetDetailSheetKey(ideaWidgetData.ideaId), false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationWidgetsKt$HatchWidget$11$1(AuraNavigator auraNavigator) {
        super(1);
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(IdeaWidgetData ideaWidgetData) {
        invoke2(ideaWidgetData);
        return Unit.INSTANCE;
    }
}
