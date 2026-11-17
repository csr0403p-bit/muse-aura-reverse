package com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.C7614F6q;
import X.C8j3;
import X.EnumC10460Hji;
import X.EnumC9706GeK;
import X.FH5;
import X.G0V;
import X.GPF;
import X.HiU;
import X.HtJ;
import X.Hwg;
import X.HyA;
import X.HyF;
import X.InterfaceC10512HoG;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient$getBillingConfigAsync$1", f = "DcpRetriableBillingClient.kt", l = {94}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class DcpRetriableBillingClient$getBillingConfigAsync$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HyF $dcpListener;
    public final /* synthetic */ String $productType;
    public long J$0;
    public int label;
    public final /* synthetic */ DcpRetriableBillingClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lcom/facebook/payments/dcp/xapp/billingclient/impl/retriablev2/DcpRetriableBillingClient;Ljava/lang/String;LX/HyF;LX/HtJ<-Lcom/facebook/payments/dcp/xapp/billingclient/impl/retriablev2/DcpRetriableBillingClient$getBillingConfigAsync$1;>;)V */
    public DcpRetriableBillingClient$getBillingConfigAsync$1(DcpRetriableBillingClient dcpRetriableBillingClient, HyF hyF, String str, HtJ htJ) {
        super(2, htJ);
        this.this$0 = dcpRetriableBillingClient;
        this.$productType = str;
        this.$dcpListener = hyF;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new DcpRetriableBillingClient$getBillingConfigAsync$1(this.this$0, this.$dcpListener, this.$productType, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            jCurrentTimeMillis = System.currentTimeMillis();
            this.this$0.A00.A0Y("getBillingConfigAsync", this.$productType, null, null);
            C7614F6q c7614F6q = new C7614F6q(this.$productType, this.this$0, 1);
            this.J$0 = jCurrentTimeMillis;
            this.label = 1;
            obj = HyA.A00(c7614F6q, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            jCurrentTimeMillis = this.J$0;
            Hwg.A00(obj);
        }
        HyF hyF = this.$dcpListener;
        DcpRetriableBillingClient dcpRetriableBillingClient = this.this$0;
        String str = this.$productType;
        FH5 fh5 = (FH5) obj;
        InterfaceC10512HoG interfaceC10512HoG = fh5.A00;
        GPF gpf = (GPF) fh5.A01;
        if (hyF != null) {
            hyF.ARy(gpf, interfaceC10512HoG);
        }
        if (interfaceC10512HoG.AJk() == EnumC9706GeK.A0H) {
            dcpRetriableBillingClient.A00.A0X(C3cG.A0S(jCurrentTimeMillis), "getBillingConfigAsync", str, null, null);
        } else {
            dcpRetriableBillingClient.A00.A0O(HiU.A00(interfaceC10512HoG, "LOAD_DCPIAP"), C3cG.A0S(jCurrentTimeMillis), "getBillingConfigAsync", str, null, null);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((DcpRetriableBillingClient$getBillingConfigAsync$1) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
