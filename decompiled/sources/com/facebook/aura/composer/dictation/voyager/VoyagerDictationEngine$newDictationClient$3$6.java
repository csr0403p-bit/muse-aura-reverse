package com.facebook.aura.composer.dictation.voyager;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class VoyagerDictationEngine$newDictationClient$3$6 extends C7438Evz implements Function0<Unit> {
    public VoyagerDictationEngine$newDictationClient$3$6(Object obj) {
        super(0, obj, VoyagerDictationEngine.class, "handleSpeechEnd", "handleSpeechEnd()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((VoyagerDictationEngine) this.receiver).handleSpeechEnd();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
