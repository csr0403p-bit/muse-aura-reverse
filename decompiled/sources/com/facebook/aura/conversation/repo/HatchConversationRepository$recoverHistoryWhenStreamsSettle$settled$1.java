package com.facebook.aura.conversation.repo;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.BLG;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$recoverHistoryWhenStreamsSettle$settled$1", f = "HatchConversationRepository.kt", l = {2411}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchConversationRepository$recoverHistoryWhenStreamsSettle$settled$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchConversationState>, Object> {
    public int label;
    public final /* synthetic */ HatchConversationRepository this$0;

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationRepository$recoverHistoryWhenStreamsSettle$settled$1$1", f = "HatchConversationRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationRepository$recoverHistoryWhenStreamsSettle$settled$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<HatchConversationState, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ HatchConversationRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchConversationRepository hatchConversationRepository, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.this$0 = hatchConversationRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Set setA0g;
            HatchConversationState hatchConversationState = (HatchConversationState) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            HatchConversationRepository hatchConversationRepository = this.this$0;
            synchronized (hatchConversationRepository.streamIdsAwaitingSettle) {
                setA0g = AbstractC0878AGe.A0g(hatchConversationRepository.streamIdsAwaitingSettle);
            }
            Set<String> activeStreamingMessageIds = hatchConversationState.getActiveStreamingMessageIds();
            boolean z = true;
            if (!(activeStreamingMessageIds instanceof Collection) || !activeStreamingMessageIds.isEmpty()) {
                Iterator<String> it = activeStreamingMessageIds.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (setA0g.contains(it.next())) {
                        z = false;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z);
        }

        @Override // X.G0V
        public final Object invoke(HatchConversationState hatchConversationState, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass1) create(hatchConversationState, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationRepository$recoverHistoryWhenStreamsSettle$settled$1(HatchConversationRepository hatchConversationRepository, HtJ<? super HatchConversationRepository$recoverHistoryWhenStreamsSettle$settled$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchConversationRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationRepository$recoverHistoryWhenStreamsSettle$settled$1(this.this$0, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super HatchConversationState> htJ) {
        return new HatchConversationRepository$recoverHistoryWhenStreamsSettle$settled$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchConversationRepository hatchConversationRepository = this.this$0;
            BLG<HatchConversationState> blg = hatchConversationRepository._conversationState;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(hatchConversationRepository, null);
            this.label = 1;
            obj = AbstractC9777Gfy.A00(this, anonymousClass1, blg);
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
}
