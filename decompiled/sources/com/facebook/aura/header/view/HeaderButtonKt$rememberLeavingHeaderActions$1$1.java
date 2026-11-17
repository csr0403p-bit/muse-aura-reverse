package com.facebook.aura.header.view;

import X.AHD;
import X.AbstractC7559F3s;
import com.facebook.aura.header.api.HeaderAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HeaderButtonKt$rememberLeavingHeaderActions$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ComposedHeaderActions $composed;
    public final /* synthetic */ AHD<HeaderAction> $headerActions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderButtonKt$rememberLeavingHeaderActions$1$1(ComposedHeaderActions composedHeaderActions, AHD<HeaderAction> ahd) {
        super(0);
        this.$composed = composedHeaderActions;
        this.$headerActions = ahd;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$composed.setValue(this.$headerActions);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
