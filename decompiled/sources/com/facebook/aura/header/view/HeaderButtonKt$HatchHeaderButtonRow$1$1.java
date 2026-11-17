package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.header.api.HeaderAction;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HeaderButtonKt$HatchHeaderButtonRow$1$1 extends AbstractC7559F3s implements G0U<HeaderAction, Unit> {
    public static final HeaderButtonKt$HatchHeaderButtonRow$1$1 INSTANCE = new HeaderButtonKt$HatchHeaderButtonRow$1$1();

    public HeaderButtonKt$HatchHeaderButtonRow$1$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HeaderAction headerAction) {
        C7384Etj.A0Y(headerAction, 0);
        headerAction.onClick.invoke();
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HeaderAction headerAction) {
        invoke2(headerAction);
        return Unit.INSTANCE;
    }
}
