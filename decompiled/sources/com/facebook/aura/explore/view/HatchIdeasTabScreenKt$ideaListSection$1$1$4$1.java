package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0V;
import com.facebook.aura.explore.repo.IdeaCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$ideaListSection$1$1$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ IdeaCard $card;
    public final /* synthetic */ int $index;
    public final /* synthetic */ G0V<IdeaCard, Integer, Unit> $onCardClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchIdeasTabScreenKt$ideaListSection$1$1$4$1(G0V<? super IdeaCard, ? super Integer, Unit> g0v, IdeaCard ideaCard, int i) {
        super(0);
        this.$onCardClick = g0v;
        this.$card = ideaCard;
        this.$index = i;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AnonymousClass001.A1H(this.$card, this.$onCardClick, this.$index);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
