package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.conversation.repo.HistoryLoadingState;
import com.facebook.aura.conversation.viewmodel.HatchConversationUiState;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.qpl.startup.StartupRenderCallback;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$21$1", f = "HatchConversation.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$21$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ StartupRenderCallback $conversationRender;
    public final /* synthetic */ Function0<Unit> $onFirstChatViewFinished;
    public final /* synthetic */ HatchConversationUiState $uiState;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationKt$HatchConversation$21$1(HatchConversationUiState hatchConversationUiState, StartupRenderCallback startupRenderCallback, Function0<Unit> function0, HtJ<? super HatchConversationKt$HatchConversation$21$1> htJ) {
        super(2, htJ);
        this.$uiState = hatchConversationUiState;
        this.$conversationRender = startupRenderCallback;
        this.$onFirstChatViewFinished = function0;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationKt$HatchConversation$21$1(this.$uiState, this.$conversationRender, this.$onFirstChatViewFinished, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        StartupRenderCallback startupRenderCallback;
        String str;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        HatchConversationUiState hatchConversationUiState = this.$uiState;
        if (hatchConversationUiState.historyLoadingState != HistoryLoadingState.FAILED) {
            if (hatchConversationUiState.connectionState instanceof HatchGatewayConnectionState.Error) {
                startupRenderCallback = this.$conversationRender;
                str = "gateway_connection_error";
            }
            return Unit.INSTANCE;
        }
        startupRenderCallback = this.$conversationRender;
        str = "history_load_failed";
        startupRenderCallback.onRenderFailed(str);
        Function0<Unit> function0 = this.$onFirstChatViewFinished;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchConversationKt$HatchConversation$21$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
