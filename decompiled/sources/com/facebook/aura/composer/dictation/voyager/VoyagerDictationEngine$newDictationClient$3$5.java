package com.facebook.aura.composer.dictation.voyager;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class VoyagerDictationEngine$newDictationClient$3$5 extends C7438Evz implements Function0<Unit> {
    public VoyagerDictationEngine$newDictationClient$3$5(Object obj) {
        super(0, obj, VoyagerDictationEngine.class, "handleSpeechStart", "handleSpeechStart()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((VoyagerDictationEngine) this.receiver).handleSpeechStart();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
