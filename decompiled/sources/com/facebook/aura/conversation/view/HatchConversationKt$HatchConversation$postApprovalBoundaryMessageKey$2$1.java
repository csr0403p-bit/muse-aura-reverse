package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$postApprovalBoundaryMessageKey$2$1 extends AbstractC7559F3s implements Function0<MutableState<String>> {
    public final /* synthetic */ boolean $hasTrailingAgentPermissionRequest;
    public final /* synthetic */ HatchConversationListItem.Message $lastMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationKt$HatchConversation$postApprovalBoundaryMessageKey$2$1(boolean z, HatchConversationListItem.Message message) {
        super(0);
        this.$hasTrailingAgentPermissionRequest = z;
        this.$lastMessage = message;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final MutableState<String> invoke() {
        HatchConversationListItem.Message message;
        String str = null;
        if (this.$hasTrailingAgentPermissionRequest && (message = this.$lastMessage) != null) {
            str = message.key;
        }
        return AnonymousClass002.A0P(str);
    }
}
