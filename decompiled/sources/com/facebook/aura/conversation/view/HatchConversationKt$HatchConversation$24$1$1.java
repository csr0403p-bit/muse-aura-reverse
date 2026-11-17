package com.facebook.aura.conversation.view;

import X.AaC;
import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$24$1$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ MutableState<AaC> $scrollViewportBounds$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationKt$HatchConversation$24$1$1(MutableState<AaC> mutableState) {
        super(0);
        this.$scrollViewportBounds$delegate = mutableState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        AaC value = this.$scrollViewportBounds$delegate.getValue();
        return Float.valueOf(value != null ? value.A03 : 0.0f);
    }
}
