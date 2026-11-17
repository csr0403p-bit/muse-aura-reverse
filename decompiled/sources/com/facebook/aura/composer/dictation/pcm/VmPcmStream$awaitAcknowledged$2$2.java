package com.facebook.aura.composer.dictation.pcm;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.composer.dictation.pcm.VmPcmStream$awaitAcknowledged$2$2", f = "VmPcmStream.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VmPcmStream$awaitAcknowledged$2$2 extends AbstractC07127nr implements G0V<String, HtJ<? super Boolean>, Object> {
    public int label;

    public VmPcmStream$awaitAcknowledged$2$2(HtJ<? super VmPcmStream$awaitAcknowledged$2$2> htJ) {
        super(2, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VmPcmStream$awaitAcknowledged$2$2(htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return AnonymousClass001.A0h();
    }

    @Override // X.G0V
    public final Object invoke(String str, HtJ<? super Boolean> htJ) {
        return new VmPcmStream$awaitAcknowledged$2$2(htJ).invokeSuspend(Unit.INSTANCE);
    }
}
