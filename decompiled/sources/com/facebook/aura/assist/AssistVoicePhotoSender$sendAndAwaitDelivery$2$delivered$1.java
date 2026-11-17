package com.facebook.aura.assist;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C27k;
import X.C3UX;
import X.C78T;
import X.C9273GCa;
import X.EnumC10460Hji;
import X.G0V;
import X.GBM;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.DeliveryAck;
import com.facebook.aura.gateway.DeliveryError;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.assist.AssistVoicePhotoSender$sendAndAwaitDelivery$2$delivered$1", f = "AssistVoicePhotoSender.kt", l = {174}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class AssistVoicePhotoSender$sendAndAwaitDelivery$2$delivered$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ C27k<DeliveryAck> $acknowledgement;
    public final /* synthetic */ C27k<DeliveryError> $failure;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistVoicePhotoSender$sendAndAwaitDelivery$2$delivered$1(C27k<DeliveryAck> c27k, C27k<DeliveryError> c27k2, HtJ<? super AssistVoicePhotoSender$sendAndAwaitDelivery$2$delivered$1> htJ) {
        super(2, htJ);
        this.$acknowledgement = c27k;
        this.$failure = c27k2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AssistVoicePhotoSender$sendAndAwaitDelivery$2$delivered$1(this.$acknowledgement, this.$failure, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C78T c78t = this.$acknowledgement;
            C78T c78t2 = this.$failure;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C9273GCa.A05;
            C9273GCa c9273GCa = new C9273GCa(getContext());
            c9273GCa.A07(new AssistVoicePhotoSender$sendAndAwaitDelivery$2$delivered$1$1$1(null), ((GBM) c78t).A0H());
            c9273GCa.A07(new AssistVoicePhotoSender$sendAndAwaitDelivery$2$delivered$1$1$2(null), ((GBM) c78t2).A0H());
            this.L$0 = null;
            this.label = 1;
            obj = C9273GCa.A03(this, c9273GCa);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return ((AssistVoicePhotoSender$sendAndAwaitDelivery$2$delivered$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
