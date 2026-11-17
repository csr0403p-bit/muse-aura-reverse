package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import com.facebook.aura.gateway.HatchGatewayConnectionState;

/* loaded from: classes.dex */
public final class HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$16$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchGatewayConnectionState $connectionState;
    public final /* synthetic */ MutableState<Long> $lastForegroundEdgeMs$delegate;
    public final /* synthetic */ C1BO<AHD<HatchConversationListItem>> $listItems$delegate;
    public final /* synthetic */ MutableState<Boolean> $showConnectionError$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$16$1(HatchGatewayConnectionState hatchGatewayConnectionState, MutableState<Long> mutableState, C1BO<? extends AHD<? extends HatchConversationListItem>> c1bo, MutableState<Boolean> mutableState2) {
        super(1);
        this.$connectionState = hatchGatewayConnectionState;
        this.$lastForegroundEdgeMs$delegate = mutableState;
        this.$listItems$delegate = c1bo;
        this.$showConnectionError$delegate = mutableState2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0023  */
    @Override // X.G0U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C78g invoke(X.C0Yr r8) {
        /*
            r7 = this;
            com.facebook.aura.gateway.HatchGatewayConnectionState r0 = r7.$connectionState
            boolean r6 = r0 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Error
            androidx.compose.runtime.MutableState<java.lang.Long> r0 = r7.$lastForegroundEdgeMs$delegate
            long r3 = com.facebook.aura.conversation.view.HatchConversationContentKt$HatchConversationContent$8.AnonymousClass2.AnonymousClass1.C00971.invoke_8Feqmps$lambda$0$20(r0)
            r1 = 0
            r5 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L23
            long r3 = java.lang.System.currentTimeMillis()
            androidx.compose.runtime.MutableState<java.lang.Long> r0 = r7.$lastForegroundEdgeMs$delegate
            long r0 = com.facebook.aura.conversation.view.HatchConversationContentKt$HatchConversationContent$8.AnonymousClass2.AnonymousClass1.C00971.invoke_8Feqmps$lambda$0$20(r0)
            long r3 = r3 - r0
            r1 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 1
            if (r0 < 0) goto L24
        L23:
            r2 = 0
        L24:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r1 = r7.$showConnectionError$delegate
            if (r6 == 0) goto L3b
            X.1BO<X.AHD<com.facebook.aura.conversation.viewmodel.HatchConversationListItem>> r0 = r7.$listItems$delegate
            boolean r0 = X.C1BO.A0E(r0)
            if (r0 == 0) goto L3b
            if (r2 != 0) goto L3b
        L32:
            androidx.compose.runtime.MutableState.A09(r5, r1)
            com.facebook.aura.conversation.view.HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$16$1$invoke$$inlined$onDispose$1 r0 = new com.facebook.aura.conversation.view.HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$16$1$invoke$$inlined$onDispose$1
            r0.<init>()
            return r0
        L3b:
            r5 = 0
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$16$1.invoke(X.0Yr):X.78g");
    }
}
