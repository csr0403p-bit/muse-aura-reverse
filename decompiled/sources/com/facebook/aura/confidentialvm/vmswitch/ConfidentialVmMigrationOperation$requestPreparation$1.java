package com.facebook.aura.confidentialvm.vmswitch;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import com.facebook.aura.auth.credentialmanager.MC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation", f = "ConfidentialVmMigrationOperation.kt", l = {MC.frl_google_credential_manager.__CONFIG__}, m = "requestPreparation-gIAlu-s", v = 2)
/* loaded from: classes2.dex */
public final class ConfidentialVmMigrationOperation$requestPreparation$1 extends HzP {
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ConfidentialVmMigrationOperation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmMigrationOperation$requestPreparation$1(ConfidentialVmMigrationOperation confidentialVmMigrationOperation, HtJ<? super ConfidentialVmMigrationOperation$requestPreparation$1> htJ) {
        super(htJ);
        this.this$0 = confidentialVmMigrationOperation;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m486requestPreparationgIAlus(null, this));
    }
}
