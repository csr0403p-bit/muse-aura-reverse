package com.facebook.aura.composer.dictation.vm;

import X.AnonymousClass003;
import X.C7438Evz;
import X.G0V;
import com.facebook.aura.composer.dictation.engine.DictationOutcome;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final /* synthetic */ class VmDictationEngine$start$vmClient$1$3 extends C7438Evz implements G0V<DictationOutcome, String, Unit> {
    public VmDictationEngine$start$vmClient$1$3(Object obj) {
        super(2, obj, VmDictationEngine.class, "finish", "finish(Lcom/facebook/aura/composer/dictation/engine/DictationOutcome;Ljava/lang/String;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DictationOutcome dictationOutcome, String str) {
        AnonymousClass003.A0u(dictationOutcome, str);
        ((VmDictationEngine) this.receiver).finish(dictationOutcome, str);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(DictationOutcome dictationOutcome, String str) {
        invoke2(dictationOutcome, str);
        return Unit.INSTANCE;
    }
}
