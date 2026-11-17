package com.facebook.aura.library.view;

import X.AGI;
import X.AHG;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import java.util.List;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$expandedGoalIdsSaver$2 extends AbstractC7559F3s implements G0U<List<? extends String>, AHG<? extends String>> {
    public static final HatchGoalsTabScreenKt$expandedGoalIdsSaver$2 INSTANCE = new HatchGoalsTabScreenKt$expandedGoalIdsSaver$2();

    public HatchGoalsTabScreenKt$expandedGoalIdsSaver$2() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ AHG<? extends String> invoke(List<? extends String> list) {
        List<? extends String> list2 = list;
        C7384Etj.A0Y(list2, 0);
        return AGI.A0H(list2);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final AHG<String> invoke2(List<String> list) {
        C7384Etj.A0Y(list, 0);
        return AGI.A0H(list);
    }
}
