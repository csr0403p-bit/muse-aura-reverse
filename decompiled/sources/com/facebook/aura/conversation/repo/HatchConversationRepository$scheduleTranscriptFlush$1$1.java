package com.facebook.aura.conversation.repo;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$scheduleTranscriptFlush$1$1", f = "HatchConversationRepository.kt", l = {546}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchConversationRepository$scheduleTranscriptFlush$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ long $generation;
    public int label;
    public final /* synthetic */ HatchConversationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationRepository$scheduleTranscriptFlush$1$1(HatchConversationRepository hatchConversationRepository, long j, HtJ<? super HatchConversationRepository$scheduleTranscriptFlush$1$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchConversationRepository;
        this.$generation = j;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationRepository$scheduleTranscriptFlush$1$1(this.this$0, this.$generation, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            this.label = 1;
            if (C7Bq.A01(50L, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        HatchConversationRepository hatchConversationRepository = this.this$0;
        Object obj2 = hatchConversationRepository.transcriptFlushLock;
        long j = this.$generation;
        synchronized (obj2) {
            if (hatchConversationRepository.transcriptFlushGeneration != j) {
                return Unit.INSTANCE;
            }
            hatchConversationRepository.transcriptFlushJob = null;
            String str = hatchConversationRepository.pendingTranscriptTurnId;
            hatchConversationRepository.pendingTranscriptTurnId = null;
            this.this$0.flushTranscript(str, C3cG.A0S(this.$generation));
            return Unit.INSTANCE;
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchConversationRepository$scheduleTranscriptFlush$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
