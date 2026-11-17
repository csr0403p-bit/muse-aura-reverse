package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.conversation.view.HatchIdeaCardRow;
import com.facebook.aura.model.IdeaWidgetData;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchIdeaRowCardKt$HatchIdeaRowCard$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $index;
    public final /* synthetic */ G0U<IdeaWidgetData, Unit> $onOpenIdea;
    public final /* synthetic */ HatchIdeaCardRow $row;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchIdeaRowCardKt$HatchIdeaRowCard$2$1$1$1(HatchIdeaCardRow hatchIdeaCardRow, int i, Map<String, String> map, G0U<? super IdeaWidgetData, Unit> g0u) {
        super(0);
        this.$row = hatchIdeaCardRow;
        this.$index = i;
        this.$threadLogMetadata = map;
        this.$onOpenIdea = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchIdeaRowCardKt.logIdeaRowClick(((HatchIdeaCardRow.Idea) this.$row).data.ideaId, this.$index, this.$threadLogMetadata);
        this.$onOpenIdea.invoke(((HatchIdeaCardRow.Idea) this.$row).data);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
