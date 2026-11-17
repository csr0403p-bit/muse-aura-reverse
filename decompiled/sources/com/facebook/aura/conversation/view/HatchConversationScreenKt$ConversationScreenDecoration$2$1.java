package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.model.HatchMessageChannel;
import com.facebook.aura.status.view.HatchStatusPillStateHolder;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationScreenKt$ConversationScreenDecoration$2$1", f = "HatchConversationScreen.kt", l = {851}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationScreenKt$ConversationScreenDecoration$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HatchMessageChannel $channel;
    public final /* synthetic */ HatchStatusPillStateHolder $pillStateHolder;
    public final /* synthetic */ MutableState<Boolean> $showThreadIntroHeader$delegate;
    public final /* synthetic */ String $threadId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationScreenKt$ConversationScreenDecoration$2$1(HatchStatusPillStateHolder hatchStatusPillStateHolder, HatchMessageChannel hatchMessageChannel, String str, MutableState<Boolean> mutableState, HtJ<? super HatchConversationScreenKt$ConversationScreenDecoration$2$1> htJ) {
        super(2, htJ);
        this.$pillStateHolder = hatchStatusPillStateHolder;
        this.$channel = hatchMessageChannel;
        this.$threadId = str;
        this.$showThreadIntroHeader$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationScreenKt$ConversationScreenDecoration$2$1(this.$pillStateHolder, this.$channel, this.$threadId, this.$showThreadIntroHeader$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (MutableState.A0A((MutableState) this.$showThreadIntroHeader$delegate)) {
                this.$pillStateHolder.setRevealed(null);
                long j = this.$channel != null ? 3000L : HatchConversationScreenKt.THREAD_HEADER_INTRO_DURATION_MS;
                this.label = 1;
                if (C7Bq.A01(j, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            this.$pillStateHolder.setRevealed(this.$threadId);
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        MutableState.A09(false, this.$showThreadIntroHeader$delegate);
        this.$pillStateHolder.setRevealed(this.$threadId);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchConversationScreenKt$ConversationScreenDecoration$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
