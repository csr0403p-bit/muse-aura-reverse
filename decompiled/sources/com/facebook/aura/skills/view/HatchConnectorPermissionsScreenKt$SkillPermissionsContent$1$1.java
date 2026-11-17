package com.facebook.aura.skills.view;

import X.C7438Evz;
import com.facebook.aura.skills.viewmodel.SkillPermissionsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class HatchConnectorPermissionsScreenKt$SkillPermissionsContent$1$1 extends C7438Evz implements Function0<Unit> {
    public HatchConnectorPermissionsScreenKt$SkillPermissionsContent$1$1(Object obj) {
        super(0, obj, SkillPermissionsViewModel.class, "refresh", "refresh()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((SkillPermissionsViewModel) this.receiver).refresh();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
