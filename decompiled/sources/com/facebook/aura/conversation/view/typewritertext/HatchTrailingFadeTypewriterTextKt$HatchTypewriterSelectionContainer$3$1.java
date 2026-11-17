package com.facebook.aura.conversation.view.typewritertext;

import X.AbstractC7559F3s;
import X.C0Hi;
import X.C1JY;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchTrailingFadeTypewriterTextKt$HatchTypewriterSelectionContainer$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ C1JY $textToolbar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTrailingFadeTypewriterTextKt$HatchTypewriterSelectionContainer$3$1(C1JY c1jy, C0Hi c0Hi) {
        super(0);
        this.$textToolbar = c1jy;
        this.$focusManager = c0Hi;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchTrailingFadeTypewriterTextKt.removeSelectionFocus(this.$textToolbar, this.$focusManager);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
