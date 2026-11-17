package com.facebook.aura.pairs;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1161Act;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.pairs.PairsHistoryScreenKt$PairsHistoryScrollEffects$1$1", f = "PairsHistoryScreen.kt", l = {213}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class PairsHistoryScreenKt$PairsHistoryScrollEffects$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ int $messageCount;
    public final /* synthetic */ MutableState<Boolean> $scrolledToEnd$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsHistoryScreenKt$PairsHistoryScrollEffects$1$1(int i, LazyListState lazyListState, MutableState<Boolean> mutableState, HtJ<? super PairsHistoryScreenKt$PairsHistoryScrollEffects$1$1> htJ) {
        super(2, htJ);
        this.$messageCount = i;
        this.$listState = lazyListState;
        this.$scrolledToEnd$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new PairsHistoryScreenKt$PairsHistoryScrollEffects$1$1(this.$messageCount, this.$listState, this.$scrolledToEnd$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (!MutableState.A0A((MutableState) this.$scrolledToEnd$delegate) && this.$messageCount > 0) {
                LazyListState lazyListState = this.$listState;
                int i2 = ((C1161Act) lazyListState.A04()).A05;
                if (i2 < 1) {
                    i2 = 1;
                }
                this.label = 1;
                if (lazyListState.A06(i2 - 1, 0, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        MutableState.A09(true, this.$scrolledToEnd$delegate);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((PairsHistoryScreenKt$PairsHistoryScrollEffects$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
