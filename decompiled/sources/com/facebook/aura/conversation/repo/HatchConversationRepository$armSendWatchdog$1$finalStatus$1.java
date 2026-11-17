package com.facebook.aura.conversation.repo;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.model.HatchMessageSendStatus;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$armSendWatchdog$1$finalStatus$1", f = "HatchConversationRepository.kt", l = {1371}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchConversationRepository$armSendWatchdog$1$finalStatus$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchMessageSendStatus>, Object> {
    public final /* synthetic */ String $requestId;
    public int label;
    public final /* synthetic */ HatchConversationRepository this$0;

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$armSendWatchdog$1$finalStatus$1$2", f = "HatchConversationRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$armSendWatchdog$1$finalStatus$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<HatchMessageSendStatus, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.G0V
        public final Object invoke(HatchMessageSendStatus hatchMessageSendStatus, HtJ<? super Boolean> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = hatchMessageSendStatus;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(AnonymousClass006.A1Z(obj2, HatchMessageSendStatus.SENDING));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationRepository$armSendWatchdog$1$finalStatus$1(HatchConversationRepository hatchConversationRepository, String str, HtJ<? super HatchConversationRepository$armSendWatchdog$1$finalStatus$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchConversationRepository;
        this.$requestId = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationRepository$armSendWatchdog$1$finalStatus$1(this.this$0, this.$requestId, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchConversationRepository$armSendWatchdog$1$finalStatus$1$invokeSuspend$$inlined$mapNotNull$1 hatchConversationRepository$armSendWatchdog$1$finalStatus$1$invokeSuspend$$inlined$mapNotNull$1 = new HatchConversationRepository$armSendWatchdog$1$finalStatus$1$invokeSuspend$$inlined$mapNotNull$1(this.this$0._conversationState, this.$requestId);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
            this.label = 1;
            obj = AbstractC9777Gfy.A00(this, anonymousClass2, hatchConversationRepository$armSendWatchdog$1$finalStatus$1$invokeSuspend$$inlined$mapNotNull$1);
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
    public final Object invoke(C3UX c3ux, HtJ<? super HatchMessageSendStatus> htJ) {
        return ((HatchConversationRepository$armSendWatchdog$1$finalStatus$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
