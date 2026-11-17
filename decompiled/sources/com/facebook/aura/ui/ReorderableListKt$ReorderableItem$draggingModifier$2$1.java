package com.facebook.aura.ui;

import X.AOW;
import X.AT5;
import X.AbstractC7559F3s;
import X.C2av;
import X.C3cH;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ReorderableListKt$ReorderableItem$draggingModifier$2$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ DragSettlement $settlement;
    public final /* synthetic */ AT5<Float, AOW> $settlementProgress;
    public final /* synthetic */ ReorderableLazyListState $state;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        c2av.Af6(this.$state.settlementTranslationY$fbandroid_express_aura_java_com_facebook_aura_ui_ui(this.$settlement, C3cH.A00(this.$settlementProgress)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderableListKt$ReorderableItem$draggingModifier$2$1(ReorderableLazyListState reorderableLazyListState, DragSettlement dragSettlement, AT5<Float, AOW> at5) {
        super(1);
        this.$state = reorderableLazyListState;
        this.$settlement = dragSettlement;
        this.$settlementProgress = at5;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
