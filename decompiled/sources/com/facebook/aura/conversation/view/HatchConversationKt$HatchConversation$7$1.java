package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C0Hi;
import X.C1C3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$7$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ boolean $isImeVisible;
    public final /* synthetic */ C1C3 $keyboardController;
    public final /* synthetic */ Function0<Unit> $requestBottomFollow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationKt$HatchConversation$7$1(boolean z, C1C3 c1c3, C0Hi c0Hi, Function0<Unit> function0) {
        super(0);
        this.$isImeVisible = z;
        this.$keyboardController = c1c3;
        this.$focusManager = c0Hi;
        this.$requestBottomFollow = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (!this.$isImeVisible) {
            this.$requestBottomFollow.invoke();
            return;
        }
        C1C3 c1c3 = this.$keyboardController;
        if (c1c3 != null) {
            c1c3.hide();
        }
        this.$focusManager.A6G(false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
