package com.facebook.aura.ui;

import X.AOW;
import X.AT5;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C1003AOr;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.ui.ReorderableRowKt$ReorderableRow$6$1$1", f = "ReorderableRow.kt", l = {89}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ReorderableRowKt$ReorderableRow$6$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $isSwapTarget;
    public final /* synthetic */ MutableState<Integer> $swapAnimIndex$delegate;
    public final /* synthetic */ AT5<Float, AOW> $swapOffset;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderableRowKt$ReorderableRow$6$1$1(boolean z, AT5<Float, AOW> at5, MutableState<Integer> mutableState, HtJ<? super ReorderableRowKt$ReorderableRow$6$1$1> htJ) {
        super(2, htJ);
        this.$isSwapTarget = z;
        this.$swapOffset = at5;
        this.$swapAnimIndex$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ReorderableRowKt$ReorderableRow$6$1$1(this.$isSwapTarget, this.$swapOffset, this.$swapAnimIndex$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$isSwapTarget) {
                AT5<Float, AOW> at5 = this.$swapOffset;
                Float fA0l = AnonymousClass001.A0l();
                C1003AOr c1003AOr = new C1003AOr(null, 0.7f, 400.0f);
                this.label = 1;
                if (AnonymousClass002.A0i(at5, c1003AOr, fA0l, this, null) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        this.$swapAnimIndex$delegate.Af8(null);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ReorderableRowKt$ReorderableRow$6$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
