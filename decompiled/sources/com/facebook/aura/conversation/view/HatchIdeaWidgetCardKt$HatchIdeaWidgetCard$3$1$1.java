package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.explore.view.cards.IdeaIcon;
import com.facebook.aura.model.IdeaWidgetData;
import com.facebook.aura.sharesheet.HatchIdeaShareAction;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchIdeaWidgetCardKt$HatchIdeaWidgetCard$3$1$1 extends AbstractC7559F3s implements G0U<IdeaIcon, Unit> {
    public final /* synthetic */ IdeaWidgetData $data;
    public final /* synthetic */ HatchIdeaShareAction $share;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchIdeaWidgetCardKt$HatchIdeaWidgetCard$3$1$1(IdeaWidgetData ideaWidgetData, Map<String, String> map, HatchIdeaShareAction hatchIdeaShareAction) {
        super(1);
        this.$data = ideaWidgetData;
        this.$threadLogMetadata = map;
        this.$share = hatchIdeaShareAction;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(IdeaIcon ideaIcon) {
        HatchIdeaWidgetCardKt.logIdeaWidgetClick(HatchComponent.SHARE_BUTTON, this.$data.ideaId, this.$threadLogMetadata, null);
        this.$share.onClick.invoke(ideaIcon);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(IdeaIcon ideaIcon) {
        invoke2(ideaIcon);
        return Unit.INSTANCE;
    }
}
