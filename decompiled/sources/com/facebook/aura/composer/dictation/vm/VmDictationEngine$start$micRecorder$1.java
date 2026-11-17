package com.facebook.aura.composer.dictation.vm;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final /* synthetic */ class VmDictationEngine$start$micRecorder$1 extends C7438Evz implements G0U<byte[], Unit> {
    public VmDictationEngine$start$micRecorder$1(Object obj) {
        super(1, obj, VmDictationEngine.class, "routePcm", "routePcm([B)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(byte[] bArr) {
        ((VmDictationEngine) AnonymousClass006.A0o(bArr, this)).routePcm(bArr);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
        invoke2(bArr);
        return Unit.INSTANCE;
    }
}
