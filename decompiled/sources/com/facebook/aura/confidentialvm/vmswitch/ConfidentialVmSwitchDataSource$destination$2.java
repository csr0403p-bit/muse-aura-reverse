package com.facebook.aura.confidentialvm.vmswitch;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchDataSource$destination$2", f = "ConfidentialVmSwitchDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ConfidentialVmSwitchDataSource$destination$2 extends AbstractC07127nr implements G0V<C20Z<? super ConfidentialVmSwitchDestination>, HtJ<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ ConfidentialVmSwitchDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmSwitchDataSource$destination$2(ConfidentialVmSwitchDataSource confidentialVmSwitchDataSource, HtJ<? super ConfidentialVmSwitchDataSource$destination$2> htJ) {
        super(2, htJ);
        this.this$0 = confidentialVmSwitchDataSource;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ConfidentialVmSwitchDataSource$destination$2(this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        this.this$0.refresh();
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C20Z<? super ConfidentialVmSwitchDestination> c20z, HtJ<? super Unit> htJ) {
        return new ConfidentialVmSwitchDataSource$destination$2(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
