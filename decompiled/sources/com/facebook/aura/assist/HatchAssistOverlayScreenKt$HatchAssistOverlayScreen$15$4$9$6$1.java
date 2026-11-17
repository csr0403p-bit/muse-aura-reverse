package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.C0Hi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$9$6$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ Function0<Unit> $onSendClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$9$6$1(C0Hi c0Hi, Function0<Unit> function0) {
        super(0);
        this.$focusManager = c0Hi;
        this.$onSendClick = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$focusManager.A6G(false);
        this.$onSendClick.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
