package com.facebook.aura.confidentialvm.vmswitch;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation", f = "ConfidentialVmDowngradeOperation.kt", l = {346}, m = "enableExport-IoAF18A", v = 2)
/* loaded from: classes2.dex */
public final class ConfidentialVmDowngradeOperation$enableExport$1 extends HzP {
    public int I$0;
    public int I$1;
    public int I$2;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ConfidentialVmDowngradeOperation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmDowngradeOperation$enableExport$1(ConfidentialVmDowngradeOperation confidentialVmDowngradeOperation, HtJ<? super ConfidentialVmDowngradeOperation$enableExport$1> htJ) {
        super(htJ);
        this.this$0 = confidentialVmDowngradeOperation;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m483enableExportIoAF18A(this));
    }
}
