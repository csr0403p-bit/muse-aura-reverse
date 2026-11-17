package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$restoreAnchor$3$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ MutableState<Boolean> $autoFollowEnabled$delegate;
    public final /* synthetic */ LazyListState $listState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationKt$HatchConversation$restoreAnchor$3$1(LazyListState lazyListState, MutableState<Boolean> mutableState) {
        super(0);
        this.$listState = lazyListState;
        this.$autoFollowEnabled$delegate = mutableState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke() {
        /*
            r1 = this;
            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r1.$autoFollowEnabled$delegate
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r0)
            if (r0 != 0) goto L11
            androidx.compose.foundation.lazy.LazyListState r0 = r1.$listState
            boolean r1 = com.facebook.aura.conversation.view.HatchConversationScrollingKt.isAtBottom(r0)
            r0 = 0
            if (r1 == 0) goto L12
        L11:
            r0 = 1
        L12:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$restoreAnchor$3$1.invoke():java.lang.Boolean");
    }
}
