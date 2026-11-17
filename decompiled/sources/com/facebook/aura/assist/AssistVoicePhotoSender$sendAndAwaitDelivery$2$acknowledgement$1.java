package com.facebook.aura.assist;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.C22I;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.DeliveryAck;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.model.HatchSendMessage;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.assist.AssistVoicePhotoSender$sendAndAwaitDelivery$2$acknowledgement$1", f = "AssistVoicePhotoSender.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class AssistVoicePhotoSender$sendAndAwaitDelivery$2$acknowledgement$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super DeliveryAck>, Object> {
    public final /* synthetic */ HatchGatewayConnection $gateway;
    public final /* synthetic */ HatchSendMessage $message;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.assist.AssistVoicePhotoSender$sendAndAwaitDelivery$2$acknowledgement$1$1", f = "AssistVoicePhotoSender.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.assist.AssistVoicePhotoSender$sendAndAwaitDelivery$2$acknowledgement$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<DeliveryAck, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ HatchSendMessage $message;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchSendMessage hatchSendMessage, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$message = hatchSendMessage;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$message, htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            DeliveryAck deliveryAck = (DeliveryAck) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(C7384Etj.areEqual(deliveryAck.requestId, this.$message.requestId));
        }

        @Override // X.G0V
        public final Object invoke(DeliveryAck deliveryAck, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass1) create(deliveryAck, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistVoicePhotoSender$sendAndAwaitDelivery$2$acknowledgement$1(HatchGatewayConnection hatchGatewayConnection, HatchSendMessage hatchSendMessage, HtJ<? super AssistVoicePhotoSender$sendAndAwaitDelivery$2$acknowledgement$1> htJ) {
        super(2, htJ);
        this.$gateway = hatchGatewayConnection;
        this.$message = hatchSendMessage;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AssistVoicePhotoSender$sendAndAwaitDelivery$2$acknowledgement$1(this.$gateway, this.$message, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<DeliveryAck> deliveryAcks = this.$gateway.getDeliveryAcks();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$message, null);
            this.label = 1;
            obj = AbstractC9777Gfy.A00(this, anonymousClass1, deliveryAcks);
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
    public final Object invoke(C3UX c3ux, HtJ<? super DeliveryAck> htJ) {
        return ((AssistVoicePhotoSender$sendAndAwaitDelivery$2$acknowledgement$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
