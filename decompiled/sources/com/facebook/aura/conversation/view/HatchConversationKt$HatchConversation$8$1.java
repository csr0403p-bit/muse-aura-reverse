package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$8$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ G0U<G0U<? super String, Unit>, Unit> $onProvideScrollToMessage;
    public final /* synthetic */ G0U<String, Unit> $onScrollToMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationKt$HatchConversation$8$1(G0U<? super G0U<? super String, Unit>, Unit> g0u, G0U<? super String, Unit> g0u2) {
        super(1);
        this.$onProvideScrollToMessage = g0u;
        this.$onScrollToMessage = g0u2;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        G0U<G0U<? super String, Unit>, Unit> g0u = this.$onProvideScrollToMessage;
        if (g0u != null) {
            g0u.invoke(this.$onScrollToMessage);
        }
        return new C78g() { // from class: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$8$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
