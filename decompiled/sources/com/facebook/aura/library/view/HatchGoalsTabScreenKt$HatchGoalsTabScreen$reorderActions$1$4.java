package com.facebook.aura.library.view;

import X.AnonymousClass003;
import X.C7438Evz;
import X.G0V;
import com.facebook.aura.library.model.HatchGoalsTabViewModel;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class HatchGoalsTabScreenKt$HatchGoalsTabScreen$reorderActions$1$4 extends C7438Evz implements G0V<String, String, Unit> {
    public HatchGoalsTabScreenKt$HatchGoalsTabScreen$reorderActions$1$4(Object obj) {
        super(2, obj, HatchGoalsTabViewModel.class, "nestGoalUnder", "nestGoalUnder(Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        ((HatchGoalsTabViewModel) this.receiver).nestGoalUnder(str, str2);
    }
}
