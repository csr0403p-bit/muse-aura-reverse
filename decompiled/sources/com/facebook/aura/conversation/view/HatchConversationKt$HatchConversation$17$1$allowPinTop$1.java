package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$17$1$allowPinTop$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ String $topAnchorKey;
    public final /* synthetic */ MutableState<String> $topPinnedResponseStartKey$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationKt$HatchConversation$17$1$allowPinTop$1(String str, MutableState<String> mutableState) {
        super(0);
        this.$topAnchorKey = str;
        this.$topPinnedResponseStartKey$delegate = mutableState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(!MutableState.A0B(this.$topPinnedResponseStartKey$delegate, this.$topAnchorKey));
    }
}
