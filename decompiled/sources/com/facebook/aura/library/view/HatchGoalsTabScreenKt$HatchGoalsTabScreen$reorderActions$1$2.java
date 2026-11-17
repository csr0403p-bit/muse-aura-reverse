package com.facebook.aura.library.view;

import X.AnonymousClass003;
import X.C7438Evz;
import X.G0W;
import com.facebook.aura.library.model.HatchGoalsTabViewModel;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class HatchGoalsTabScreenKt$HatchGoalsTabScreen$reorderActions$1$2 extends C7438Evz implements G0W<String, List<? extends String>, String, Unit> {
    public HatchGoalsTabScreenKt$HatchGoalsTabScreen$reorderActions$1$2(Object obj) {
        super(3, obj, HatchGoalsTabViewModel.class, "setSubGoalOrder", "setSubGoalOrder(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", 0);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(String str, List<? extends String> list, String str2) {
        invoke2(str, (List<String>) list, str2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, List<String> list, String str2) {
        AnonymousClass003.A0u(str, list);
        ((HatchGoalsTabViewModel) this.receiver).setSubGoalOrder(str, list, str2);
    }
}
