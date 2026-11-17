package com.facebook.aura.composer.dictation.voyager;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class VoyagerAsrSession$onTextMessage$1$3 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ VoyagerAsrSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoyagerAsrSession$onTextMessage$1$3(VoyagerAsrSession voyagerAsrSession) {
        super(0);
        this.this$0 = voyagerAsrSession;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        VoyagerAsrSession voyagerAsrSession = this.this$0;
        int i = VoyagerAsrSession.BYTES_PER_SAMPLE;
        voyagerAsrSession.listener.onHandshakeAcknowledged();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
