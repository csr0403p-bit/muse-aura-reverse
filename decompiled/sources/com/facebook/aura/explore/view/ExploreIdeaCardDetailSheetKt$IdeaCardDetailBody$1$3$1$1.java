package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import X.G0V;
import com.facebook.aura.explore.repo.IdeaCardItem;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ExploreIdeaCardDetailSheetKt$IdeaCardDetailBody$1$3$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ IdeaCardItem $item;
    public final /* synthetic */ G0V<String, Boolean, Unit> $onItemSelectionChanged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExploreIdeaCardDetailSheetKt$IdeaCardDetailBody$1$3$1$1(G0V<? super String, ? super Boolean, Unit> g0v, IdeaCardItem ideaCardItem) {
        super(1);
        this.$onItemSelectionChanged = g0v;
        this.$item = ideaCardItem;
    }

    public final void invoke(boolean z) {
        this.$onItemSelectionChanged.invoke(this.$item.itemId, Boolean.valueOf(z));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
