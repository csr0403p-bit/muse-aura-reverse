package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.explore.repo.IdeaCard;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1$1$10 extends AbstractC7559F3s implements G0U<IdeaCard, Unit> {
    public final /* synthetic */ G0U<String, Unit> $finishDismissal;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(IdeaCard ideaCard) {
        C7384Etj.A0Y(ideaCard, 0);
        this.$finishDismissal.invoke(ideaCard.ideaCardId);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1$1$10(G0U<? super String, Unit> g0u) {
        super(1);
        this.$finishDismissal = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(IdeaCard ideaCard) {
        invoke2(ideaCard);
        return Unit.INSTANCE;
    }
}
