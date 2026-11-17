package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import X.G0V;
import com.facebook.aura.explore.repo.IdeaCard;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$ideaListSection$1$1$2$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ IdeaCard $card;
    public final /* synthetic */ G0V<IdeaCard, Boolean, Unit> $onSwipingChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchIdeasTabScreenKt$ideaListSection$1$1$2$1(G0V<? super IdeaCard, ? super Boolean, Unit> g0v, IdeaCard ideaCard) {
        super(1);
        this.$onSwipingChange = g0v;
        this.$card = ideaCard;
    }

    public final void invoke(boolean z) {
        this.$onSwipingChange.invoke(this.$card, Boolean.valueOf(z));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
