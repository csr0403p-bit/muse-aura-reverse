package com.facebook.aura.composer.dictation.voyager;

import X.AnonymousClass001;
import X.C3cG;
import X.C7438Evz;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final /* synthetic */ class VoyagerDictationEngine$newDictationClient$3$3 extends C7438Evz implements G0V<Long, Boolean, Unit> {
    public VoyagerDictationEngine$newDictationClient$3$3(Object obj) {
        super(2, obj, VoyagerDictationEngine.class, "handleAudioDropped", "handleAudioDropped(JZ)V", 0);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(Long l, Boolean bool) {
        invoke(C3cG.A05(l), AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }

    public final void invoke(long j, boolean z) {
        ((VoyagerDictationEngine) this.receiver).handleAudioDropped(j, z);
    }
}
