package com.facebook.aura.skills.repo;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.skills.repo.TaskPermissionsRepository", f = "TaskPermissionsRepository.kt", l = {111}, m = "revokeWebsite-gIAlu-s", v = 2)
/* loaded from: classes3.dex */
public final class TaskPermissionsRepository$revokeWebsite$1 extends HzP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TaskPermissionsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskPermissionsRepository$revokeWebsite$1(TaskPermissionsRepository taskPermissionsRepository, HtJ<? super TaskPermissionsRepository$revokeWebsite$1> htJ) {
        super(htJ);
        this.this$0 = taskPermissionsRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m2130revokeWebsitegIAlus(null, this));
    }
}
