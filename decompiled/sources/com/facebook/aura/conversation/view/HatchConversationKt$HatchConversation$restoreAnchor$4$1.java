package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C00r;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$restoreAnchor$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $autoFollowEnabled$delegate;
    public final /* synthetic */ C00r $bottomRevealRequestGeneration$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationKt$HatchConversation$restoreAnchor$4$1(MutableState<Boolean> mutableState, C00r c00r) {
        super(0);
        this.$autoFollowEnabled$delegate = mutableState;
        this.$bottomRevealRequestGeneration$delegate = c00r;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(true, this.$autoFollowEnabled$delegate);
        this.$bottomRevealRequestGeneration$delegate.AdX(this.$bottomRevealRequestGeneration$delegate.AGd() + 1);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
