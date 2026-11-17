package com.facebook.aura.composer.dictation.vm;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class VmDictationEngine$start$vmClient$1$2 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ VmDictationEngine this$0;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.this$0.handleTranscript(str, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VmDictationEngine$start$vmClient$1$2(VmDictationEngine vmDictationEngine) {
        super(1);
        this.this$0 = vmDictationEngine;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
