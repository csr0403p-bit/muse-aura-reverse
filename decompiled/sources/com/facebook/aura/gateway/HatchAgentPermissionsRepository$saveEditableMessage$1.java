package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchAgentPermissionsRepository", f = "HatchAgentPermissionsRepository.kt", l = {201}, m = "saveEditableMessage-bMdYcbs", v = 2)
/* loaded from: classes2.dex */
public final class HatchAgentPermissionsRepository$saveEditableMessage$1 extends HzP {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchAgentPermissionsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAgentPermissionsRepository$saveEditableMessage$1(HatchAgentPermissionsRepository hatchAgentPermissionsRepository, HtJ<? super HatchAgentPermissionsRepository$saveEditableMessage$1> htJ) {
        super(htJ);
        this.this$0 = hatchAgentPermissionsRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m952saveEditableMessagebMdYcbs(null, null, null, null, 0L, null, this));
    }
}
