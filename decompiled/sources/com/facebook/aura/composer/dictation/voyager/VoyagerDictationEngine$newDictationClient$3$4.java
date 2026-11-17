package com.facebook.aura.composer.dictation.voyager;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class VoyagerDictationEngine$newDictationClient$3$4 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ VoyagerDictationEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoyagerDictationEngine$newDictationClient$3$4(VoyagerDictationEngine voyagerDictationEngine) {
        super(1);
        this.this$0 = voyagerDictationEngine;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        this.this$0.encodedAudioBytesSent.addAndGet(i);
    }
}
