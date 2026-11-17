package com.facebook.aura.conversation.view;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import com.facebook.aura.explore.model.HatchExploreViewModel;
import com.facebook.aura.explore.repo.IdeaCardDetailOrigin;
import com.facebook.aura.model.IdeaWidgetData;
import com.facebook.aura.model.IdeaWidgetItemData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchIdeaWidgetCardKt$HatchIdeaWidgetCard$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ IdeaWidgetData $data;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;
    public final /* synthetic */ HatchExploreViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchIdeaWidgetCardKt$HatchIdeaWidgetCard$2$1(IdeaWidgetData ideaWidgetData, Map<String, String> map, HatchExploreViewModel hatchExploreViewModel) {
        super(0);
        this.$data = ideaWidgetData;
        this.$threadLogMetadata = map;
        this.$viewModel = hatchExploreViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchIdeaWidgetCardKt.logIdeaExecuteClick(this.$data.ideaId, this.$threadLogMetadata);
        HatchExploreViewModel hatchExploreViewModel = this.$viewModel;
        IdeaWidgetData ideaWidgetData = this.$data;
        String str = ideaWidgetData.ideaId;
        List<IdeaWidgetItemData> list = ideaWidgetData.items;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<IdeaWidgetItemData> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().id);
        }
        List<String> listA0W = AbstractC0878AGe.A0W(arrayListA0i);
        if (listA0W.isEmpty()) {
            listA0W = null;
        }
        hatchExploreViewModel.executeCard(str, listA0W, IdeaCardDetailOrigin.CHAT, null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
