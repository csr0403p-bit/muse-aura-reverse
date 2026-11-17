package com.facebook.aura.skills.repo;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.skills.repo.RecipientPermissionsRepository", f = "RecipientPermissionsRepository.kt", l = {59}, m = "revokePermission-gIAlu-s", v = 2)
/* loaded from: classes2.dex */
public final class RecipientPermissionsRepository$revokePermission$1 extends HzP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RecipientPermissionsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecipientPermissionsRepository$revokePermission$1(RecipientPermissionsRepository recipientPermissionsRepository, HtJ<? super RecipientPermissionsRepository$revokePermission$1> htJ) {
        super(htJ);
        this.this$0 = recipientPermissionsRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m2125revokePermissiongIAlus(null, this));
    }
}
