package com.facebook.aura.ui;

import X.AOW;
import X.AT5;
import X.AbstractC7559F3s;
import X.C00q;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ReorderableRowKt$ReorderableRow$6$3$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ C00q $dragOffsetX$delegate;
    public final /* synthetic */ MutableState<Integer> $draggingIndex$delegate;
    public final /* synthetic */ int $index;
    public final /* synthetic */ AT5<Float, AOW> $swapOffset;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        Integer value = this.$draggingIndex$delegate.getValue();
        int i = this.$index;
        if (value == null || value.intValue() != i) {
            c2av.Af5(MutableState.A00(this.$swapOffset));
            return;
        }
        c2av.Af5(this.$dragOffsetX$delegate.AFn());
        c2av.AeX(1.1f);
        c2av.AeY(1.1f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderableRowKt$ReorderableRow$6$3$1(int i, AT5<Float, AOW> at5, MutableState<Integer> mutableState, C00q c00q) {
        super(1);
        this.$index = i;
        this.$swapOffset = at5;
        this.$draggingIndex$delegate = mutableState;
        this.$dragOffsetX$delegate = c00q;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
