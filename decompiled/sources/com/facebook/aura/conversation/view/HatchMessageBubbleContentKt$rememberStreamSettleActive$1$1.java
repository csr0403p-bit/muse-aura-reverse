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
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchMessageBubbleContentKt$rememberStreamSettleActive$1$1", f = "HatchMessageBubbleContent.kt", l = {97}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchMessageBubbleContentKt$rememberStreamSettleActive$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $isStreaming;
    public final /* synthetic */ MutableState<Boolean> $settling$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageBubbleContentKt$rememberStreamSettleActive$1$1(boolean z, MutableState<Boolean> mutableState, HtJ<? super HatchMessageBubbleContentKt$rememberStreamSettleActive$1$1> htJ) {
        super(2, htJ);
        this.$isStreaming = z;
        this.$settling$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchMessageBubbleContentKt$rememberStreamSettleActive$1$1(this.$isStreaming, this.$settling$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            boolean z = this.$isStreaming;
            MutableState<Boolean> mutableState = this.$settling$delegate;
            if (z) {
                MutableState.A09(true, mutableState);
            } else if (MutableState.A0A((MutableState) mutableState)) {
                this.label = 1;
                if (C7Bq.A01(350L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        MutableState.A09(false, this.$settling$delegate);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchMessageBubbleContentKt$rememberStreamSettleActive$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
