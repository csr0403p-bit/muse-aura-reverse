package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C1C3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationWidgetsKt$HatchWidget$5$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1C3 $keyboardController;
    public final /* synthetic */ Function0<Unit> $onFocusComposer;
    public final /* synthetic */ String $selectedText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationWidgetsKt$HatchWidget$5$1(String str, Function0<Unit> function0, C1C3 c1c3) {
        super(0);
        this.$selectedText = str;
        this.$onFocusComposer = function0;
        this.$keyboardController = c1c3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$selectedText == null) {
            this.$onFocusComposer.invoke();
            C1C3 c1c3 = this.$keyboardController;
            if (c1c3 != null) {
                c1c3.Afd();
            }
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
