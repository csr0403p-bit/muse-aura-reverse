package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$14$1 extends AbstractC7559F3s implements G0U<G0U<? super String, ? extends Unit>, Unit> {
    public final /* synthetic */ G0U<G0U<? super String, Unit>, Unit> $onProvideScrollToMessage;
    public final /* synthetic */ MutableState<G0U<String, Unit>> $scrollToMessage$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(G0U<? super String, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.$scrollToMessage$delegate.Af8(g0u);
        G0U<G0U<? super String, Unit>, Unit> g0u2 = this.$onProvideScrollToMessage;
        if (g0u2 != null) {
            g0u2.invoke(g0u);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$14$1(G0U<? super G0U<? super String, Unit>, Unit> g0u, MutableState<G0U<String, Unit>> mutableState) {
        super(1);
        this.$onProvideScrollToMessage = g0u;
        this.$scrollToMessage$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(G0U<? super String, ? extends Unit> g0u) {
        invoke2((G0U<? super String, Unit>) g0u);
        return Unit.INSTANCE;
    }
}
