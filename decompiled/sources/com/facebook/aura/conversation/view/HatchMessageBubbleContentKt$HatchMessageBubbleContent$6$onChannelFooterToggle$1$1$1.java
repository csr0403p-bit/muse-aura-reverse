package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageBubbleContentKt$HatchMessageBubbleContent$6$onChannelFooterToggle$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $isChannelFooterVisible$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageBubbleContentKt$HatchMessageBubbleContent$6$onChannelFooterToggle$1$1$1(MutableState<Boolean> mutableState) {
        super(0);
        this.$isChannelFooterVisible$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(!MutableState.A0A((MutableState) r1), this.$isChannelFooterVisible$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
