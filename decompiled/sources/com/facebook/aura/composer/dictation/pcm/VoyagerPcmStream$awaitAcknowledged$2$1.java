package com.facebook.aura.composer.dictation.pcm;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.composer.dictation.pcm.VoyagerPcmStream$awaitAcknowledged$2$1", f = "VoyagerPcmStream.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class VoyagerPcmStream$awaitAcknowledged$2$1 extends AbstractC07127nr implements G0V<Unit, HtJ<? super Boolean>, Object> {
    public int label;

    public VoyagerPcmStream$awaitAcknowledged$2$1(HtJ<? super VoyagerPcmStream$awaitAcknowledged$2$1> htJ) {
        super(2, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoyagerPcmStream$awaitAcknowledged$2$1(htJ);
    }

    @Override // X.G0V
    public final Object invoke(Unit unit, HtJ<? super Boolean> htJ) {
        return new VoyagerPcmStream$awaitAcknowledged$2$1(htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return AnonymousClass001.A0i();
    }
}
