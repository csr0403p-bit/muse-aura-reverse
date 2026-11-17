package X;

import com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class Hw5 extends AbstractC07127nr implements G0U {
    public final int $t;
    public int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Hw5(Object obj, DcpRetriableBillingClient dcpRetriableBillingClient, GOz gOz, boolean z, HtJ<? super Hw5> htJ) {
        super(1, gOz);
        this.$t = z ? 1 : 0;
        this.A02 = obj;
        this.A01 = dcpRetriableBillingClient;
        this.A03 = htJ;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        int i = this.$t;
        return new Hw5(this.A02, this.A01, htJ, i != 0 ? 1 : 0, this.A03);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((Hw5) create((HtJ) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.$t != 0) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            if (this.A00 != 0) {
                Hwg.A00(obj);
            } else {
                Hwg.A00(obj);
                HuC huC = ((DcpRetriableBillingClient) this.A02).A02;
                GOz gOz = (GOz) this.A01;
                boolean z = this.A03;
                this.A00 = 1;
                obj = huC.AYy(gOz, this, z);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            HzU hzU = (HzU) obj;
            return new FH5(hzU.A00, hzU.A01);
        }
        EnumC10460Hji enumC10460Hji2 = EnumC10460Hji.A02;
        if (this.A00 != 0) {
            Hwg.A00(obj);
        } else {
            Hwg.A00(obj);
            HuC huC2 = ((DcpRetriableBillingClient) this.A02).A02;
            Hkg hkg = (Hkg) this.A01;
            boolean z2 = this.A03;
            this.A00 = 1;
            obj = huC2.AYx(hkg, this, z2);
            if (obj == enumC10460Hji2) {
                return enumC10460Hji2;
            }
        }
        Hkf hkf = (Hkf) obj;
        return new FH5(hkf.A00, hkf);
    }
}
