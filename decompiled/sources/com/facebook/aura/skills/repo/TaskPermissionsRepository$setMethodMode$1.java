package com.facebook.aura.skills.repo;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.skills.repo.TaskPermissionsRepository", f = "TaskPermissionsRepository.kt", l = {90}, m = "setMethodMode-hUnOzRk", v = 2)
/* loaded from: classes3.dex */
public final class TaskPermissionsRepository$setMethodMode$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TaskPermissionsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskPermissionsRepository$setMethodMode$1(TaskPermissionsRepository taskPermissionsRepository, HtJ<? super TaskPermissionsRepository$setMethodMode$1> htJ) {
        super(htJ);
        this.this$0 = taskPermissionsRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m2131setMethodModehUnOzRk(null, null, null, null, null, this));
    }
}
