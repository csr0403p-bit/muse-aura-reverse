package com.facebook.aura.agentpermission.pastapprovals;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository", f = "ActivePermissionsRepository.kt", l = {111}, m = "resetPermissions-IoAF18A", v = 2)
/* loaded from: classes3.dex */
public final class ActivePermissionsRepository$resetPermissions$1 extends HzP {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ActivePermissionsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivePermissionsRepository$resetPermissions$1(ActivePermissionsRepository activePermissionsRepository, HtJ<? super ActivePermissionsRepository$resetPermissions$1> htJ) {
        super(htJ);
        this.this$0 = activePermissionsRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m198resetPermissionsIoAF18A(this));
    }
}
