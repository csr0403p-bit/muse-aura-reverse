package com.facebook.aura.confidentialvm.vmswitch;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistRepository", f = "ConfidentialVmWaitlistRepository.kt", l = {97}, m = "fetch-0E7RQCE", v = 2)
/* loaded from: classes.dex */
public final class ConfidentialVmWaitlistRepository$fetch$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ConfidentialVmWaitlistRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmWaitlistRepository$fetch$1(ConfidentialVmWaitlistRepository confidentialVmWaitlistRepository, HtJ<? super ConfidentialVmWaitlistRepository$fetch$1> htJ) {
        super(htJ);
        this.this$0 = confidentialVmWaitlistRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m488fetch0E7RQCE(null, null, this));
    }
}
