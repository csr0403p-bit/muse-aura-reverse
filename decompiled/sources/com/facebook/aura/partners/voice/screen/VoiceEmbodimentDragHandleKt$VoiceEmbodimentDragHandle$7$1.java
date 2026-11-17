package com.facebook.aura.partners.voice.screen;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class VoiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$7$1 extends C7438Evz implements Function0<Unit> {
    public VoiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$7$1(Object obj) {
        super(0, obj, VoiceEmbodimentResize.class, "tap", "tap()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((VoiceEmbodimentResize) this.receiver).tap();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
