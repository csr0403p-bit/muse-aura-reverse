package com.facebook.aura.ui;

import X.ART;
import X.AT3;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C16a;
import X.C1BO;
import X.C7384Etj;
import X.C8j3;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ReorderableColumnKt$reorderableItemElevation$2$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ float $cornerRadius;
    public final /* synthetic */ C1BO<Float> $lift$delegate;
    public final /* synthetic */ long $surface;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        if (C1BO.A01(this.$lift$delegate) > 0.0f) {
            long j = this.$surface;
            long jA0N = AnonymousClass003.A0N(C8j3.A0P(at3.Ah4(this.$cornerRadius)));
            at3.A9j(null, C16a.A00, 1.0f, 3, j, 0L, ART.A00(at3.AKb(), 0L), jA0N);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderableColumnKt$reorderableItemElevation$2$1(long j, float f, C1BO<Float> c1bo) {
        super(1);
        this.$surface = j;
        this.$cornerRadius = f;
        this.$lift$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
