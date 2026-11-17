package com.facebook.aura.explore.view.cards;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class IdeaCardsKt$IdeaCardCompact$1$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ IdeaIcon $icon;
    public final /* synthetic */ G0U<IdeaIcon, Unit> $share;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IdeaCardsKt$IdeaCardCompact$1$2$1$1(G0U<? super IdeaIcon, Unit> g0u, IdeaIcon ideaIcon) {
        super(0);
        this.$share = g0u;
        this.$icon = ideaIcon;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$share.invoke(this.$icon);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
