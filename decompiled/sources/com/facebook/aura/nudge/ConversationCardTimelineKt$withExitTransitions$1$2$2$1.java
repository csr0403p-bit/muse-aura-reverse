package com.facebook.aura.nudge;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BLG;
import X.C3UX;
import X.C3cG;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.nudge.ConversationCardTimelineKt$withExitTransitions$1$2$2$1", f = "ConversationCardTimeline.kt", l = {126}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class ConversationCardTimelineKt$withExitTransitions$1$2$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ BLG<List<RequestedCardRow>> $rows;
    public final /* synthetic */ long $sequenceId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationCardTimelineKt$withExitTransitions$1$2$2$1(BLG<List<RequestedCardRow>> blg, long j, HtJ<? super ConversationCardTimelineKt$withExitTransitions$1$2$2$1> htJ) {
        super(2, htJ);
        this.$rows = blg;
        this.$sequenceId = j;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ConversationCardTimelineKt$withExitTransitions$1$2$2$1(this.$rows, this.$sequenceId, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        List<RequestedCardRow> value;
        ArrayList arrayListA0h;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            this.label = 1;
            if (C7Bq.A01(280L, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        BLG<List<RequestedCardRow>> blg = this.$rows;
        long j = this.$sequenceId;
        do {
            value = blg.getValue();
            arrayListA0h = C3cG.A0h();
            for (RequestedCardRow requestedCardRow : value) {
                RequestedCardRow requestedCardRow2 = requestedCardRow;
                if (requestedCardRow2.card.sequenceId != j || requestedCardRow2.isVisible) {
                    arrayListA0h.add(requestedCardRow);
                }
            }
        } while (!blg.A6e(value, arrayListA0h));
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ConversationCardTimelineKt$withExitTransitions$1$2$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
