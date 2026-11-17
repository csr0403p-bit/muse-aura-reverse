package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.qpl.startup.StartupRenderCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$24$2$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ StartupRenderCallback $conversationRender;
    public final /* synthetic */ MutableState<Boolean> $hasDrawnConversationContent$delegate;
    public final /* synthetic */ Function0<Unit> $onFirstChatViewFinished;
    public final /* synthetic */ Function0<Unit> $onFirstConversationContentDrawn;
    public final /* synthetic */ Function0<Unit> $onViewFinished;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationKt$HatchConversation$24$2$4$1(StartupRenderCallback startupRenderCallback, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, MutableState<Boolean> mutableState) {
        super(0);
        this.$conversationRender = startupRenderCallback;
        this.$onViewFinished = function0;
        this.$onFirstConversationContentDrawn = function02;
        this.$onFirstChatViewFinished = function03;
        this.$hasDrawnConversationContent$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(true, this.$hasDrawnConversationContent$delegate);
        this.$conversationRender.onRendered();
        Function0<Unit> function0 = this.$onViewFinished;
        if (function0 != null) {
            function0.invoke();
        }
        Function0<Unit> function02 = this.$onFirstConversationContentDrawn;
        if (function02 != null) {
            function02.invoke();
        }
        Function0<Unit> function03 = this.$onFirstChatViewFinished;
        if (function03 != null) {
            function03.invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
