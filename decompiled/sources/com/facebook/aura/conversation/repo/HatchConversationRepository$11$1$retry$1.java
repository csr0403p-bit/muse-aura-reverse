package com.facebook.aura.conversation.repo;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C60O;
import X.C7384Etj;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzS;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.model.HatchMessage;
import com.facebook.aura.model.HatchMessageSendStatus;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$11$1$retry$1", f = "HatchConversationRepository.kt", l = {993}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchConversationRepository$11$1$retry$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ long $delayMs;
    public final /* synthetic */ String $reqId;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ HatchConversationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationRepository$11$1$retry$1(long j, HatchConversationRepository hatchConversationRepository, String str, HtJ<? super HatchConversationRepository$11$1$retry$1> htJ) {
        super(2, htJ);
        this.$delayMs = j;
        this.this$0 = hatchConversationRepository;
        this.$reqId = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchConversationRepository$11$1$retry$1 hatchConversationRepository$11$1$retry$1 = new HatchConversationRepository$11$1$retry$1(this.$delayMs, this.this$0, this.$reqId, htJ);
        hatchConversationRepository$11$1$retry$1.L$0 = obj;
        return hatchConversationRepository$11$1$retry$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        boolean zRemove;
        HatchMessage next;
        C3UX c3ux = (C3UX) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            long j = this.$delayMs;
            this.L$0 = c3ux;
            this.label = 1;
            if (C7Bq.A01(j, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        HatchConversationRepository hatchConversationRepository = this.this$0;
        Object obj2 = hatchConversationRepository.pendingMessagesLock;
        String str = this.$reqId;
        synchronized (obj2) {
            zRemove = hatchConversationRepository.transportRejectionRetryJobs.remove(str, HzS.A02(c3ux.AEA()));
        }
        if (zRemove) {
            List<HatchMessage> list = C60O.A04(this.this$0).messages;
            String str2 = this.$reqId;
            Iterator<HatchMessage> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                HatchMessage hatchMessage = next;
                if (C7384Etj.areEqual(hatchMessage.requestId, str2) && hatchMessage.sendStatus == HatchMessageSendStatus.SENDING) {
                    break;
                }
            }
            HatchMessage hatchMessage2 = next;
            HatchConversationRepository hatchConversationRepository2 = this.this$0;
            if (hatchMessage2 == null) {
                hatchConversationRepository2.releaseRejectedSend(this.$reqId);
            } else {
                hatchConversationRepository2.requeuePendingMessage(hatchMessage2);
                if (this.this$0.gateway.connectionState.getValue() instanceof HatchGatewayConnectionState.Connected) {
                    this.this$0.flushPendingMessages();
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchConversationRepository$11$1$retry$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
