package com.facebook.aura.conversation.view;

import X.AaC;
import X.AbstractC7559F3s;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$ConversationHistoryRow$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<AaC> $bounds$delegate;
    public final /* synthetic */ G0U<AaC, Unit> $callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationHistorySidePanelKt$ConversationHistoryRow$1$1$1$1(G0U<? super AaC, Unit> g0u, MutableState<AaC> mutableState) {
        super(0);
        this.$callback = g0u;
        this.$bounds$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        G0U<AaC, Unit> g0u = this.$callback;
        MutableState<AaC> mutableState = this.$bounds$delegate;
        float f = HatchConversationHistorySidePanelKt.SidePanelBottomActionSize;
        g0u.invoke(mutableState.getValue());
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
