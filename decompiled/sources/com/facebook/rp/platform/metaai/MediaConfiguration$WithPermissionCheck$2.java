package com.facebook.rp.platform.metaai;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0U;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.rp.platform.metaai.MediaConfiguration$WithPermissionCheck$2", f = "MetaAiRealTimeSessionController.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class MediaConfiguration$WithPermissionCheck$2 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
    public int label;

    public MediaConfiguration$WithPermissionCheck$2(HtJ<? super MediaConfiguration$WithPermissionCheck$2> htJ) {
        super(1, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new MediaConfiguration$WithPermissionCheck$2(htJ);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(HtJ<? super Boolean> htJ) {
        return new MediaConfiguration$WithPermissionCheck$2(htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return AnonymousClass001.A0h();
    }
}
