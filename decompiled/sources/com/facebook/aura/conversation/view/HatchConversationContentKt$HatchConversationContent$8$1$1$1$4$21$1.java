package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C1BO;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.viewmodel.HatchConversationUiState;
import com.facebook.aura.conversation.viewmodel.ReplyContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$21$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<G0U<String, Unit>> $scrollToMessage$delegate;
    public final /* synthetic */ C1BO<HatchConversationUiState> $uiState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationContentKt$HatchConversationContent$8$1$1$1$4$21$1(C1BO<HatchConversationUiState> c1bo, MutableState<G0U<String, Unit>> mutableState) {
        super(0);
        this.$uiState$delegate = c1bo;
        this.$scrollToMessage$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String messageId;
        G0U<String, Unit> value;
        ReplyContext replyContext = this.$uiState$delegate.getValue().replyContext;
        if (replyContext == null || (messageId = replyContext.getMessageId()) == null || (value = this.$scrollToMessage$delegate.getValue()) == null) {
            return;
        }
        value.invoke(messageId);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
