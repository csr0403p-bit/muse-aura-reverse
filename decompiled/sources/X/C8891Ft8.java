package X;

import com.facebook.payments.dcp.xapp.controller.prefetch.IapPrefetchDataController;
import kotlin.Unit;

/* renamed from: X.Ft8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8891Ft8 extends AbstractC07127nr implements G0V {
    public final int $t = 1;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final Object A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8891Ft8(GSV gsv, String str, HtJ<? super C8891Ft8> htJ) {
        super(2, htJ);
        this.A05 = gsv;
        this.A06 = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        if (this.$t != 0) {
            C8891Ft8 c8891Ft8 = new C8891Ft8((GSV) this.A05, this.A06, htJ);
            c8891Ft8.A01 = obj;
            return c8891Ft8;
        }
        IapPrefetchDataController iapPrefetchDataController = (IapPrefetchDataController) this.A05;
        C8891Ft8 c8891Ft82 = new C8891Ft8((Hs8) this.A02, iapPrefetchDataController, (C9698Ge3) this.A01, this.A06, htJ);
        c8891Ft82.A03 = obj;
        return c8891Ft82;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws Exception {
        GSV gsv;
        InterfaceC2261BLa interfaceC2261BLa;
        Object obj2;
        Object objA0s;
        Integer num;
        if (this.$t == 0) {
            G0U g0u = (G0U) this.A03;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            if (this.A00 != 0) {
                g0u = (G0U) this.A04;
                Hwg.A00(obj);
            } else {
                Hwg.A00(obj);
                IapPrefetchDataController iapPrefetchDataController = (IapPrefetchDataController) this.A05;
                Hs8 hs8 = (Hs8) this.A02;
                String str = this.A06;
                C9698Ge3 c9698Ge3 = (C9698Ge3) this.A01;
                this.A03 = null;
                this.A04 = g0u;
                this.A00 = 1;
                obj = IapPrefetchDataController.A00(hs8, iapPrefetchDataController, c9698Ge3, str, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            g0u.invoke(obj);
            return Unit.INSTANCE;
        }
        Object obj3 = this.A01;
        EnumC10460Hji enumC10460Hji2 = EnumC10460Hji.A02;
        if (this.A00 != 0) {
            obj2 = this.A04;
            gsv = (GSV) this.A03;
            interfaceC2261BLa = (InterfaceC2261BLa) this.A02;
            Hwg.A00(obj);
        } else {
            Hwg.A00(obj);
            gsv = (GSV) this.A05;
            interfaceC2261BLa = gsv.A07;
            obj2 = this.A06;
            this.A01 = obj3;
            this.A02 = interfaceC2261BLa;
            this.A03 = gsv;
            this.A04 = obj2;
            this.A00 = 1;
            if (interfaceC2261BLa.APs(null, this) == enumC10460Hji2) {
                return enumC10460Hji2;
            }
        }
        try {
            if (C7384Etj.areEqual(gsv.A0A, obj2)) {
                try {
                    objA0s = gsv.A03.recordingSessionId();
                } catch (Throwable th) {
                    objA0s = C3cG.A0s(th);
                }
                if (HsJ.A00(objA0s) != null) {
                    AbstractC7608F5v.A1L("Failed to read recording session ID");
                }
                if (objA0s instanceof C10571Hud) {
                    objA0s = null;
                }
                if (!C7384Etj.areEqual(gsv.A0A, obj2)) {
                    objA0s = null;
                }
                num = (Integer) objA0s;
            } else {
                num = null;
            }
            return num;
        } finally {
            interfaceC2261BLa.Ahe(null);
        }
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C8891Ft8) C8j3.A1E(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lcom/facebook/payments/dcp/xapp/controller/prefetch/IapPrefetchDataController;LX/Hs8;Ljava/lang/String;LX/Ge3;LX/HtJ<-LX/Ft8;>;)V */
    public C8891Ft8(Hs8 hs8, IapPrefetchDataController iapPrefetchDataController, C9698Ge3 c9698Ge3, String str, HtJ htJ) {
        super(2, htJ);
        this.A05 = iapPrefetchDataController;
        this.A02 = hs8;
        this.A06 = str;
        this.A01 = c9698Ge3;
    }
}
