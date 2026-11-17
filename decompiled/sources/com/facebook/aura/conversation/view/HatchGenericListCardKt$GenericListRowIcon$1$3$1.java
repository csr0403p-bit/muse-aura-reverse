package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C00r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchGenericListCardKt$GenericListRowIcon$1$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C00r $linkImageIndex$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGenericListCardKt$GenericListRowIcon$1$3$1(C00r c00r) {
        super(0);
        this.$linkImageIndex$delegate = c00r;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        C00r c00r = this.$linkImageIndex$delegate;
        float f = HatchGenericListCardKt.CardPadding;
        this.$linkImageIndex$delegate.AdX(c00r.AGd() + 1);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
