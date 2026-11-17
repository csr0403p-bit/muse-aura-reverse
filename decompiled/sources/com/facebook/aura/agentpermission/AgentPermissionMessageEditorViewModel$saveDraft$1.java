package com.facebook.aura.agentpermission;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionMessageEditorViewModel", f = "AgentPermissionMessageEditorViewModel.kt", l = {183, 188}, m = "saveDraft-gIAlu-s", v = 2)
/* loaded from: classes2.dex */
public final class AgentPermissionMessageEditorViewModel$saveDraft$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AgentPermissionMessageEditorViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionMessageEditorViewModel$saveDraft$1(AgentPermissionMessageEditorViewModel agentPermissionMessageEditorViewModel, HtJ<? super AgentPermissionMessageEditorViewModel$saveDraft$1> htJ) {
        super(htJ);
        this.this$0 = agentPermissionMessageEditorViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m166saveDraftgIAlus(null, this));
    }
}
