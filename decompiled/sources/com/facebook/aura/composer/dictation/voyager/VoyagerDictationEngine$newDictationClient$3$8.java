package com.facebook.aura.composer.dictation.voyager;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class VoyagerDictationEngine$newDictationClient$3$8 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ VoyagerAsrClient $next;
    public final /* synthetic */ G0U<VoyagerAsrClient, Unit> $onAcknowledged;
    public final /* synthetic */ VoyagerDictationEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoyagerDictationEngine$newDictationClient$3$8(VoyagerDictationEngine voyagerDictationEngine, VoyagerAsrClient voyagerAsrClient, G0U<? super VoyagerAsrClient, Unit> g0u) {
        super(0);
        this.this$0 = voyagerDictationEngine;
        this.$next = voyagerAsrClient;
        this.$onAcknowledged = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.notifyConnected(this.$next);
        this.$onAcknowledged.invoke(this.$next);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
