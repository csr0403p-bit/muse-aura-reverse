package com.facebook.aura.assist;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.DeliveryError;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.assist.AssistVoicePhotoSender$sendAndAwaitDelivery$2$delivered$1$1$2", f = "AssistVoicePhotoSender.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class AssistVoicePhotoSender$sendAndAwaitDelivery$2$delivered$1$1$2 extends AbstractC07127nr implements G0V<DeliveryError, HtJ<? super Boolean>, Object> {
    public int label;

    public AssistVoicePhotoSender$sendAndAwaitDelivery$2$delivered$1$1$2(HtJ<? super AssistVoicePhotoSender$sendAndAwaitDelivery$2$delivered$1$1$2> htJ) {
        super(2, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AssistVoicePhotoSender$sendAndAwaitDelivery$2$delivered$1$1$2(htJ);
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
    public final Object invoke(DeliveryError deliveryError, HtJ<? super Boolean> htJ) {
        return new AssistVoicePhotoSender$sendAndAwaitDelivery$2$delivered$1$1$2(htJ).invokeSuspend(Unit.INSTANCE);
    }
}
