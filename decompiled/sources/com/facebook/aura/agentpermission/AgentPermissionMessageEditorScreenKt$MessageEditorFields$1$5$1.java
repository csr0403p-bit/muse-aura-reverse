package com.facebook.aura.agentpermission;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class AgentPermissionMessageEditorScreenKt$MessageEditorFields$1$5$1 extends C7438Evz implements G0U<String, Unit> {
    public AgentPermissionMessageEditorScreenKt$MessageEditorFields$1$5$1(Object obj) {
        super(1, obj, AgentPermissionMessageEditorViewModel.class, "updateBody", "updateBody(Ljava/lang/String;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((AgentPermissionMessageEditorViewModel) AnonymousClass006.A0o(str, this)).updateBody(str);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
