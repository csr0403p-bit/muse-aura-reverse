package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$postApprovalBoundaryContentSignature$2$1 extends AbstractC7559F3s implements Function0<MutableState<String>> {
    public final /* synthetic */ boolean $hasTrailingAgentPermissionRequest;
    public final /* synthetic */ String $latestResponseContentSignature;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationKt$HatchConversation$postApprovalBoundaryContentSignature$2$1(boolean z, String str) {
        super(0);
        this.$hasTrailingAgentPermissionRequest = z;
        this.$latestResponseContentSignature = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final MutableState<String> invoke() {
        return AnonymousClass002.A0P(this.$hasTrailingAgentPermissionRequest ? this.$latestResponseContentSignature : "");
    }
}
