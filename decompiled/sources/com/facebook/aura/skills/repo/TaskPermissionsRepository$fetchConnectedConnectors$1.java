package com.facebook.aura.skills.repo;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.skills.repo.TaskPermissionsRepository", f = "TaskPermissionsRepository.kt", l = {61}, m = "fetchConnectedConnectors-IoAF18A", v = 2)
/* loaded from: classes3.dex */
public final class TaskPermissionsRepository$fetchConnectedConnectors$1 extends HzP {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TaskPermissionsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskPermissionsRepository$fetchConnectedConnectors$1(TaskPermissionsRepository taskPermissionsRepository, HtJ<? super TaskPermissionsRepository$fetchConnectedConnectors$1> htJ) {
        super(htJ);
        this.this$0 = taskPermissionsRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m2128fetchConnectedConnectorsIoAF18A(this));
    }
}
