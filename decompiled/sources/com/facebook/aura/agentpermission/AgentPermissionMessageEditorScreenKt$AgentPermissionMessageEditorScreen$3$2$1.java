package com.facebook.aura.agentpermission;

import X.C7438Evz;
import com.facebook.aura.settings.HatchDataExportLoggingKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class AgentPermissionMessageEditorScreenKt$AgentPermissionMessageEditorScreen$3$2$1 extends C7438Evz implements Function0<Unit> {
    public AgentPermissionMessageEditorScreenKt$AgentPermissionMessageEditorScreen$3$2$1(Object obj) {
        super(0, obj, AgentPermissionMessageEditorViewModel.class, HatchDataExportLoggingKt.PHASE_SAVE, "save()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AgentPermissionMessageEditorViewModel) this.receiver).save();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
