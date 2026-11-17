package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.model.IdeaWidgetData;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.IdeaWidgetDetailSheetKey;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchIdeaWidgetCardKt$HatchIdeaWidgetCard$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ IdeaWidgetData $data;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchIdeaWidgetCardKt$HatchIdeaWidgetCard$1$1(IdeaWidgetData ideaWidgetData, Map<String, String> map, AuraNavigator auraNavigator) {
        super(0);
        this.$data = ideaWidgetData;
        this.$threadLogMetadata = map;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchIdeaWidgetCardKt.logIdeaWidgetClick(HatchComponent.IDEA_CARD, this.$data.ideaId, this.$threadLogMetadata, 0);
        IdeaWidgetDetailDataHolder.INSTANCE.put(this.$data);
        this.$navigator.navigate((AuraNavKey) new IdeaWidgetDetailSheetKey(this.$data.ideaId), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
