package com.facebook.aura.conversation.viewmodel;

import X.AbstractC07127nr;
import X.G0V;
import X.HtJ;
import com.facebook.aura.conversation.repo.HatchConversationState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$observeOfflinePersistence$1$initialNetworkHistory$1", f = "HatchConversationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationViewModel$observeOfflinePersistence$1$initialNetworkHistory$1 extends AbstractC07127nr implements G0V<HatchConversationState, HtJ<? super Boolean>, Object> {
    public /* synthetic */ Object L$0;
    public int label;

    public HatchConversationViewModel$observeOfflinePersistence$1$initialNetworkHistory$1(HtJ<? super HatchConversationViewModel$observeOfflinePersistence$1$initialNetworkHistory$1> htJ) {
        super(2, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchConversationViewModel$observeOfflinePersistence$1$initialNetworkHistory$1 hatchConversationViewModel$observeOfflinePersistence$1$initialNetworkHistory$1 = new HatchConversationViewModel$observeOfflinePersistence$1$initialNetworkHistory$1(htJ);
        hatchConversationViewModel$observeOfflinePersistence$1$initialNetworkHistory$1.L$0 = obj;
        return hatchConversationViewModel$observeOfflinePersistence$1$initialNetworkHistory$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r2 = r3.L$0
            com.facebook.aura.conversation.repo.HatchConversationState r2 = (com.facebook.aura.conversation.repo.HatchConversationState) r2
            int r0 = r3.label
            if (r0 != 0) goto L26
            X.Hwg.A00(r4)
            com.facebook.aura.conversation.repo.StreamingState r1 = r2.streamingState
            com.facebook.aura.conversation.repo.StreamingState r0 = com.facebook.aura.conversation.repo.StreamingState.Done
            if (r1 != r0) goto L20
            com.facebook.aura.conversation.repo.HistoryLoadingState r1 = r2.historyLoadingState
            com.facebook.aura.conversation.repo.HistoryLoadingState r0 = com.facebook.aura.conversation.repo.HistoryLoadingState.SUCCESS
            if (r1 != r0) goto L20
            java.util.List<com.facebook.aura.model.HatchMessage> r0 = r2.history
            boolean r1 = r0.isEmpty()
            r0 = 1
            if (r1 == 0) goto L21
        L20:
            r0 = 0
        L21:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L26:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchConversationViewModel$observeOfflinePersistence$1$initialNetworkHistory$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(HatchConversationState hatchConversationState, HtJ<? super Boolean> htJ) {
        HatchConversationViewModel$observeOfflinePersistence$1$initialNetworkHistory$1 hatchConversationViewModel$observeOfflinePersistence$1$initialNetworkHistory$1 = new HatchConversationViewModel$observeOfflinePersistence$1$initialNetworkHistory$1(htJ);
        hatchConversationViewModel$observeOfflinePersistence$1$initialNetworkHistory$1.L$0 = hatchConversationState;
        return hatchConversationViewModel$observeOfflinePersistence$1$initialNetworkHistory$1.invokeSuspend(Unit.INSTANCE);
    }
}
