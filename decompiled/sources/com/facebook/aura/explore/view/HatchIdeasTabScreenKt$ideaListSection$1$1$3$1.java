package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.explore.repo.IdeaCard;
import com.facebook.aura.explore.repo.IdeaFeedback;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$ideaListSection$1$1$3$1 extends AbstractC7559F3s implements G0U<IdeaFeedback, Unit> {
    public final /* synthetic */ IdeaCard $card;
    public final /* synthetic */ int $index;
    public final /* synthetic */ G0W<IdeaCard, Integer, IdeaFeedback, Unit> $onSwipeFeedback;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(IdeaFeedback ideaFeedback) {
        C7384Etj.A0Y(ideaFeedback, 0);
        this.$onSwipeFeedback.invoke(this.$card, Integer.valueOf(this.$index), ideaFeedback);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchIdeasTabScreenKt$ideaListSection$1$1$3$1(G0W<? super IdeaCard, ? super Integer, ? super IdeaFeedback, Unit> g0w, IdeaCard ideaCard, int i) {
        super(1);
        this.$onSwipeFeedback = g0w;
        this.$card = ideaCard;
        this.$index = i;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(IdeaFeedback ideaFeedback) {
        invoke2(ideaFeedback);
        return Unit.INSTANCE;
    }
}
