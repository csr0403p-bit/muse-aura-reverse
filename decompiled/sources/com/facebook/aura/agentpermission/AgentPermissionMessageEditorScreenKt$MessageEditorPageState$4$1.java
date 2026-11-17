package com.facebook.aura.agentpermission;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class AgentPermissionMessageEditorScreenKt$MessageEditorPageState$4$1 extends C7438Evz implements Function0<Unit> {
    public AgentPermissionMessageEditorScreenKt$MessageEditorPageState$4$1(Object obj) {
        super(0, obj, AgentPermissionMessageEditorViewModel.class, "reload", "reload()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AgentPermissionMessageEditorViewModel) this.receiver).reload();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
