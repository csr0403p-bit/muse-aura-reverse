package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.explore.repo.IdeaCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$ideaListSection$1$1$9$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ IdeaCard $card;
    public final /* synthetic */ G0U<IdeaCard, Unit> $onDismissed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchIdeasTabScreenKt$ideaListSection$1$1$9$1(G0U<? super IdeaCard, Unit> g0u, IdeaCard ideaCard) {
        super(0);
        this.$onDismissed = g0u;
        this.$card = ideaCard;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onDismissed.invoke(this.$card);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
