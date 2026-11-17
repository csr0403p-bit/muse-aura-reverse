package com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.FH5;
import X.G0U;
import X.HtJ;
import X.Hwg;
import X.InterfaceC10512HoG;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient$connect$result$1", f = "DcpRetriableBillingClient.kt", l = {81}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class DcpRetriableBillingClient$connect$result$1 extends AbstractC07127nr implements G0U<HtJ<? super FH5<Unit>>, Object> {
    public final /* synthetic */ String $productType;
    public int label;
    public final /* synthetic */ DcpRetriableBillingClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DcpRetriableBillingClient$connect$result$1(DcpRetriableBillingClient dcpRetriableBillingClient, String str, HtJ<? super DcpRetriableBillingClient$connect$result$1> htJ) {
        super(1, htJ);
        this.this$0 = dcpRetriableBillingClient;
        this.$productType = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new DcpRetriableBillingClient$connect$result$1(this.this$0, this.$productType, htJ);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(HtJ<? super FH5<Unit>> htJ) {
        return ((DcpRetriableBillingClient$connect$result$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            CoroutineConnectionManager coroutineConnectionManager = this.this$0.A01;
            String str = this.$productType;
            C7384Etj.A0Y(str, 0);
            coroutineConnectionManager.A00 = str;
            CoroutineConnectionManager coroutineConnectionManager2 = this.this$0.A01;
            this.label = 1;
            obj = coroutineConnectionManager2.A00(this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return new FH5((InterfaceC10512HoG) obj, Unit.INSTANCE);
    }
}
