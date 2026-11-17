package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.C1BO;
import X.G0U;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ReorderableColumnKt$rememberMoveAccessibilityActions$1$1$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ C1BO<G0U<T, Unit>> $currentOnMoveTo$delegate;
    public final /* synthetic */ int $index;
    public final /* synthetic */ List<T> $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReorderableColumnKt$rememberMoveAccessibilityActions$1$1$1(List<? extends T> list, int i, C1BO<? extends G0U<? super T, Unit>> c1bo) {
        super(0);
        this.$items = list;
        this.$index = i;
        this.$currentOnMoveTo$delegate = c1bo;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C1BO.A0B(this.$currentOnMoveTo$delegate).invoke(this.$items.get(this.$index - 1));
        return true;
    }
}
