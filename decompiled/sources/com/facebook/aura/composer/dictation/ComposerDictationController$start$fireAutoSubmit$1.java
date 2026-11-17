package com.facebook.aura.composer.dictation;

import X.AbstractC7559F3s;
import X.C3cI;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class ComposerDictationController$start$fireAutoSubmit$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchVoiceDictationService $activeService;
    public final /* synthetic */ Function0<Unit> $onAutoSubmit;
    public final /* synthetic */ ComposerDictationController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerDictationController$start$fireAutoSubmit$1(ComposerDictationController composerDictationController, HatchVoiceDictationService hatchVoiceDictationService, Function0<Unit> function0) {
        super(0);
        this.this$0 = composerDictationController;
        this.$activeService = hatchVoiceDictationService;
        this.$onAutoSubmit = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function0<Unit> function0;
        ComposerDictationController composerDictationController = this.this$0;
        if (composerDictationController.voiceDictationService == this.$activeService && composerDictationController.sessionLog.stopRequestedAtMs == 0 && C3cI.A1W(composerDictationController.autoSubmitFired) && (function0 = this.$onAutoSubmit) != null) {
            function0.invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
