package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.C0Hi;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.header.api.HeaderAction;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchTabHeaderKt$HatchTabHeader$5$1$4$3$3$1 extends AbstractC7559F3s implements G0U<HeaderAction, Unit> {
    public final /* synthetic */ C0Hi $focusManager;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HeaderAction headerAction) {
        C7384Etj.A0Y(headerAction, 0);
        this.$focusManager.A6G(false);
        headerAction.onClick.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTabHeaderKt$HatchTabHeader$5$1$4$3$3$1(C0Hi c0Hi) {
        super(1);
        this.$focusManager = c0Hi;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HeaderAction headerAction) {
        invoke2(headerAction);
        return Unit.INSTANCE;
    }
}
