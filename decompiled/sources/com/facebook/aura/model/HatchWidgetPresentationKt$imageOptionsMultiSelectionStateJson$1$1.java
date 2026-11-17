package com.facebook.aura.model;

import X.AbstractC7559F3s;
import X.C60Q;
import X.C7384Etj;
import X.C7pd;
import X.C9oY;
import X.G0U;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchWidgetPresentationKt$imageOptionsMultiSelectionStateJson$1$1 extends AbstractC7559F3s implements G0U<C7pd, Unit> {
    public final /* synthetic */ List<Integer> $indices;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C7pd c7pd) {
        C7384Etj.A0Y(c7pd, 0);
        Iterator<Integer> it = this.$indices.iterator();
        while (it.hasNext()) {
            c7pd.A06(C9oY.A06(Integer.valueOf(C60Q.A03(it))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWidgetPresentationKt$imageOptionsMultiSelectionStateJson$1$1(List<Integer> list) {
        super(1);
        this.$indices = list;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C7pd c7pd) {
        invoke2(c7pd);
        return Unit.INSTANCE;
    }
}
