package com.facebook.aura.spaces.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.header.view.HeaderButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSpacesModalScreenKt$SpaceScreenFrame$1$2$1 extends AbstractC7559F3s implements G0U<HeaderButton, Unit> {
    public final /* synthetic */ Function0<Unit> $onMoreClick;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HeaderButton headerButton) {
        Function0<Unit> function0;
        C7384Etj.A0Y(headerButton, 0);
        if (headerButton != HeaderButton.MoreOptions || (function0 = this.$onMoreClick) == null) {
            return;
        }
        function0.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSpacesModalScreenKt$SpaceScreenFrame$1$2$1(Function0<Unit> function0) {
        super(1);
        this.$onMoreClick = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HeaderButton headerButton) {
        invoke2(headerButton);
        return Unit.INSTANCE;
    }
}
