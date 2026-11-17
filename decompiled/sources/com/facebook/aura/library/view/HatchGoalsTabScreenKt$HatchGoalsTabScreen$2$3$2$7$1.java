package com.facebook.aura.library.view;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C7438Evz;
import X.G0V;
import com.facebook.aura.library.model.HatchGoalsTabViewModel;

/* loaded from: classes2.dex */
public final /* synthetic */ class HatchGoalsTabScreenKt$HatchGoalsTabScreen$2$3$2$7$1 extends C7438Evz implements G0V<String, Boolean, Boolean> {
    public HatchGoalsTabScreenKt$HatchGoalsTabScreen$2$3$2$7$1(Object obj) {
        super(2, obj, HatchGoalsTabViewModel.class, "setGoalCompleted", "setGoalCompleted(Ljava/lang/String;Z)Z", 0);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Boolean invoke(String str, Boolean bool) {
        return invoke(str, AnonymousClass001.A1X(bool));
    }

    public final Boolean invoke(String str, boolean z) {
        return Boolean.valueOf(((HatchGoalsTabViewModel) AnonymousClass006.A0o(str, this)).dataSource.setGoalCompleted(str, z));
    }
}
