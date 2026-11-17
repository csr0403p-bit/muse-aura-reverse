package com.facebook.aura.widgets;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.spaces.repo.SpaceCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SpaceWidgetPickerScreenKt$SpaceWidgetPickerList$1$1$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<SpaceCard, Unit> $onSpacePicked;
    public final /* synthetic */ SpaceCard $space;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SpaceWidgetPickerScreenKt$SpaceWidgetPickerList$1$1$3$1$1(G0U<? super SpaceCard, Unit> g0u, SpaceCard spaceCard) {
        super(0);
        this.$onSpacePicked = g0u;
        this.$space = spaceCard;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onSpacePicked.invoke(this.$space);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
