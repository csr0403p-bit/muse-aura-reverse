package com.facebook.aura.library.view;

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

@DebugMetadata(c = "com.facebook.aura.library.view.GoalCheckboxKt$rememberDelayedPendingIndicator$1$1", f = "GoalCheckbox.kt", l = {162}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class GoalCheckboxKt$rememberDelayedPendingIndicator$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $pending;
    public final /* synthetic */ MutableState<Boolean> $visible$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalCheckboxKt$rememberDelayedPendingIndicator$1$1(boolean z, MutableState<Boolean> mutableState, HtJ<? super GoalCheckboxKt$rememberDelayedPendingIndicator$1$1> htJ) {
        super(2, htJ);
        this.$pending = z;
        this.$visible$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new GoalCheckboxKt$rememberDelayedPendingIndicator$1$1(this.$pending, this.$visible$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (!this.$pending) {
                MutableState.A09(false, this.$visible$delegate);
                return Unit.INSTANCE;
            }
            this.label = 1;
            if (C7Bq.A01(150L, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        MutableState.A09(true, this.$visible$delegate);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((GoalCheckboxKt$rememberDelayedPendingIndicator$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
