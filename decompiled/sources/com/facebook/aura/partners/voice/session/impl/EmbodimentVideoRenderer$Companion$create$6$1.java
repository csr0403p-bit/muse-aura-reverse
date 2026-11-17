package com.facebook.aura.partners.voice.session.impl;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.webrtc.EglRenderer;
import org.webrtc.SurfaceEglRenderer;

/* loaded from: classes5.dex */
public final /* synthetic */ class EmbodimentVideoRenderer$Companion$create$6$1 extends C7438Evz implements Function0<Unit> {
    public EmbodimentVideoRenderer$Companion$create$6$1(Object obj) {
        super(0, obj, SurfaceEglRenderer.class, "release", "release()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((EglRenderer) this.receiver).release();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
