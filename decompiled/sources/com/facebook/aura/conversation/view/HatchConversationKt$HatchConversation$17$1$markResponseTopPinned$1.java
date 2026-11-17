package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$17$1$markResponseTopPinned$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $topAnchorKey;
    public final /* synthetic */ MutableState<String> $topPinnedResponseStartKey$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationKt$HatchConversation$17$1$markResponseTopPinned$1(String str, MutableState<String> mutableState) {
        super(0);
        this.$topAnchorKey = str;
        this.$topPinnedResponseStartKey$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$topPinnedResponseStartKey$delegate.Af8(this.$topAnchorKey);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
