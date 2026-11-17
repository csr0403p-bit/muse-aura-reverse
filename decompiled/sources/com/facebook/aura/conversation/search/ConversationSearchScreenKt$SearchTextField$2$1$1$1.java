package com.facebook.aura.conversation.search;

import X.AbstractC7559F3s;
import X.G0U;
import X.InterfaceC1497Ak4;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ConversationSearchScreenKt$SearchTextField$2$1$1$1 extends AbstractC7559F3s implements G0U<InterfaceC1497Ak4, Unit> {
    public final /* synthetic */ MutableState<Boolean> $isTextFieldPositioned$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationSearchScreenKt$SearchTextField$2$1$1$1(MutableState<Boolean> mutableState) {
        super(1);
        this.$isTextFieldPositioned$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC1497Ak4 interfaceC1497Ak4) {
        MutableState<Boolean> mutableState = this.$isTextFieldPositioned$delegate;
        float f = ConversationSearchScreenKt.SearchFieldCornerRadius;
        MutableState.A09(true, mutableState);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1497Ak4 interfaceC1497Ak4) {
        invoke2(interfaceC1497Ak4);
        return Unit.INSTANCE;
    }
}
