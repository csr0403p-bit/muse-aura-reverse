package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C00r;
import X.C1BO;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ReorderableColumnKt$ReorderableColumn$8$1$3$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ C1BO<Function0<Float>> $currentDragTranslationY$delegate;
    public final /* synthetic */ C00r $displayedRoomSourceHeight$delegate;
    public final /* synthetic */ boolean $isDragging;
    public final /* synthetic */ boolean $roomAboveDecoration;
    public final /* synthetic */ int $roomInsertionIndex;
    public final /* synthetic */ C1BO<Float> $roomProgress;
    public final /* synthetic */ int $roomSourceIndex;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        if (this.$isDragging) {
            int i = this.$roomInsertionIndex;
            c2av.Af6(AnonymousClass003.A04(C1BO.A0A(this.$currentDragTranslationY$delegate)) - (((i < 0 || i >= this.$roomSourceIndex) && !this.$roomAboveDecoration) ? 0.0f : this.$displayedRoomSourceHeight$delegate.AGd() * C1BO.A01(this.$roomProgress)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReorderableColumnKt$ReorderableColumn$8$1$3$1(boolean z, int i, int i2, boolean z2, C1BO<Float> c1bo, C00r c00r, C1BO<? extends Function0<Float>> c1bo2) {
        super(1);
        this.$isDragging = z;
        this.$roomInsertionIndex = i;
        this.$roomSourceIndex = i2;
        this.$roomAboveDecoration = z2;
        this.$roomProgress = c1bo;
        this.$displayedRoomSourceHeight$delegate = c00r;
        this.$currentDragTranslationY$delegate = c1bo2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
