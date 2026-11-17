package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HeaderButtonKt$PillHeaderButtonIcon$1$1$1 extends AbstractC7559F3s implements G0U<HeaderButton, Unit> {
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ G0U<HeaderButton, Unit> $onHeaderButtonClick;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HeaderButton headerButton) {
        C7384Etj.A0Y(headerButton, 0);
        this.$onClick.invoke();
        this.$onHeaderButtonClick.invoke(headerButton);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HeaderButtonKt$PillHeaderButtonIcon$1$1$1(Function0<Unit> function0, G0U<? super HeaderButton, Unit> g0u) {
        super(1);
        this.$onClick = function0;
        this.$onHeaderButtonClick = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HeaderButton headerButton) {
        invoke2(headerButton);
        return Unit.INSTANCE;
    }
}
