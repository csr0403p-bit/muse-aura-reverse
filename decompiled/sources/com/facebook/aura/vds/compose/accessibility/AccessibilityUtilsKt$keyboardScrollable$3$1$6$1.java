package com.facebook.aura.vds.compose.accessibility;

import X.AFs;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.vds.compose.accessibility.AccessibilityUtilsKt$keyboardScrollable$3$1$6$1", f = "AccessibilityUtils.kt", l = {169}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AccessibilityUtilsKt$keyboardScrollable$3$1$6$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ int $idx;
    public final /* synthetic */ LazyListState $state;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessibilityUtilsKt$keyboardScrollable$3$1$6$1(LazyListState lazyListState, int i, HtJ<? super AccessibilityUtilsKt$keyboardScrollable$3$1$6$1> htJ) {
        super(2, htJ);
        this.$state = lazyListState;
        this.$idx = i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AccessibilityUtilsKt$keyboardScrollable$3$1$6$1(this.$state, this.$idx, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            LazyListState lazyListState = this.$state;
            int i2 = this.$idx;
            this.label = 1;
            AFs<LazyListState, ?> aFs = LazyListState.A0Q;
            if (lazyListState.A05(i2, 0, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AccessibilityUtilsKt$keyboardScrollable$3$1$6$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
