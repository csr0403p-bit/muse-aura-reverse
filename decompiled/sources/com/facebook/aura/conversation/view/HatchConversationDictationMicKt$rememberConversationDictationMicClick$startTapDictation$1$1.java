package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import android.content.Context;
import com.facebook.aura.composer.dictation.ComposerDictationController;
import com.facebook.aura.composer.dictation.DictationStartTrigger;
import com.facebook.aura.composer.dictation.engine.DictationMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationDictationMicKt$rememberConversationDictationMicClick$startTapDictation$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ ComposerDictationController $dictation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationDictationMicKt$rememberConversationDictationMicClick$startTapDictation$1$1(ComposerDictationController composerDictationController, Context context) {
        super(0);
        this.$dictation = composerDictationController;
        this.$context = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$dictation.start(this.$context, DictationStartTrigger.MIC, DictationMode.MANUAL, null, null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
