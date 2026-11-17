package com.facebook.aura.composer.dictation.voyager;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class VoyagerDictationEngine$newDictationClient$3$7 extends AbstractC7559F3s implements G0U<VoyagerAsrResult, Unit> {
    public final /* synthetic */ VoyagerAsrClient $next;
    public final /* synthetic */ VoyagerDictationEngine this$0;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(VoyagerAsrResult voyagerAsrResult) {
        C7384Etj.A0Y(voyagerAsrResult, 0);
        this.this$0.onClientClosed(this.$next, voyagerAsrResult);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoyagerDictationEngine$newDictationClient$3$7(VoyagerDictationEngine voyagerDictationEngine, VoyagerAsrClient voyagerAsrClient) {
        super(1);
        this.this$0 = voyagerDictationEngine;
        this.$next = voyagerAsrClient;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(VoyagerAsrResult voyagerAsrResult) {
        invoke2(voyagerAsrResult);
        return Unit.INSTANCE;
    }
}
