package X;

import android.os.Looper;
import com.facebook.payments.dcp.xapp.controller.productinfo.ProductInfoController;
import com.facebook.payments.dcp.xapp.controller.purchase.IapPurchaseController;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.FYj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8192FYj extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8192FYj(FBB fbb, FDW fdw, HsM hsM, int i) {
        super(1);
        this.$t = i;
        if (1 - i != 0) {
            this.A02 = fdw;
            this.A01 = hsM;
            this.A00 = fbb;
        } else {
            this.A00 = hsM;
            this.A02 = fdw;
            this.A01 = fbb;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        InterfaceC9761GfF<Hs0> c9719GeX;
        AbstractC6676EOt abstractC6676EOt;
        String str;
        String str2;
        AbstractC8150FWo abstractC8150FWo;
        String str3;
        switch (this.$t) {
            case 0:
                Throwable th = (Throwable) obj;
                ((G0U) this.A00).invoke(th);
                HzR<T> hzR = ((C8983Fvi) this.A02).A03;
                hzR.A6R(th);
                while (true) {
                    Object objAhX = hzR.AhX();
                    if ((objAhX instanceof C2zT) || objAhX == null) {
                        break;
                    } else {
                        ((G0V) this.A01).invoke(objAhX, th);
                    }
                }
                break;
            case 1:
                F6D.A03((FBB) this.A01, (FDW) this.A02, Hj6.A02, (HsM) this.A00);
                break;
            case 2:
                return HxQ.A00((C7377EtL) this.A01, (FDW) this.A02, (FBB) this.A00, ((Hjq) obj).A00);
            case 3:
                C7384Etj.A0Y(obj, 0);
                F6D.A03((FBB) this.A00, (FDW) this.A02, C9115Fyg.A04(obj), (HsM) this.A01);
                break;
            case 4:
                int iA0F = AnonymousClass001.A0F(obj);
                FDW fdw = (FDW) this.A02;
                HsM hsM = (HsM) this.A01;
                C9115Fyg c9115FygA00 = C9115Fyg.A00();
                c9115FygA00.A06(Integer.valueOf(iA0F), 0);
                F9J.A03((FBB) this.A00, fdw, c9115FygA00, hsM, 1);
                break;
            case 5:
                EVS evs = (EVS) obj;
                C9699Ge6 c9699Ge6 = (C9699Ge6) this.A02;
                AbstractC7607F5u.A1L(evs, c9699Ge6.A0B);
                evs.A00(HVq.A02, "product_type");
                AbstractC7611F5y.A0m(evs);
                String str4 = ((EnumC9578GPp) this.A00).eventName;
                C7384Etj.A0Y(str4, 0);
                C9744Gex c9744Gex = new C9744Gex();
                AbstractC8150FWo.A02(c9744Gex, "debug_step", str4);
                evs.A01(c9744Gex, "event_payload");
                C9699Ge6.A0B(evs, c9699Ge6, (Map) ((Function0) this.A01).invoke());
                return evs;
            case 6:
                abstractC6676EOt = (AbstractC6676EOt) obj;
                C9699Ge6 c9699Ge62 = (C9699Ge6) this.A02;
                C9698Ge3 c9698Ge3 = (C9698Ge3) this.A01;
                if (c9698Ge3 == null || (str = c9698Ge3.A04) == null) {
                    str = c9699Ge62.A0B;
                }
                AbstractC7607F5u.A1L(abstractC6676EOt, str);
                if (c9698Ge3 == null || (str2 = c9698Ge3.A09) == null) {
                    str2 = "ALL_PRODUCTS";
                }
                HVr.A01(abstractC6676EOt, str2);
                AbstractC7611F5y.A0m(abstractC6676EOt);
                abstractC8150FWo = (AbstractC8150FWo) this.A00;
                abstractC6676EOt.A01(abstractC8150FWo, "event_payload");
                return abstractC6676EOt;
            case 7:
            case 8:
            default:
                abstractC6676EOt = (AbstractC6676EOt) obj;
                C9699Ge6 c9699Ge63 = (C9699Ge6) this.A02;
                C9698Ge3 c9698Ge32 = (C9698Ge3) this.A01;
                if (c9698Ge32 == null || (str3 = c9698Ge32.A04) == null) {
                    str3 = c9699Ge63.A0B;
                }
                AbstractC7607F5u.A1L(abstractC6676EOt, str3);
                HVr.A01(abstractC6676EOt, c9698Ge32.A09);
                AbstractC7611F5y.A0m(abstractC6676EOt);
                abstractC8150FWo = (AbstractC8150FWo) this.A00;
                abstractC6676EOt.A01(abstractC8150FWo, "event_payload");
                return abstractC6676EOt;
            case 9:
                Throwable th2 = (Throwable) obj;
                C7384Etj.A0Y(th2, 0);
                HuV.A01(((C78U) this.A01).A06() ? C9732Gel.A00 : new C10506Hnq(th2), (HuV) this.A02, (InterfaceC10560Hsz) this.A00);
                break;
            case 10:
                if (obj instanceof CancellationException) {
                    ProductInfoController.A04(C9732Gel.A00, (ProductInfoController) this.A02, (Hvy) this.A00, (C9691Gdw) this.A01, C9jH.A00);
                    break;
                }
                break;
            case 11:
                Throwable th3 = (Throwable) obj;
                C7384Etj.A0Y(th3, 0);
                IapPurchaseController iapPurchaseController = (IapPurchaseController) this.A02;
                boolean zA06 = iapPurchaseController.A09.A06();
                C9717GeV c9717GeV = (C9717GeV) this.A00;
                if (zA06) {
                    c9719GeX = C9758GfC.A00;
                } else {
                    String str5 = (String) ((C10543Hqv) this.A01).element;
                    C7384Etj.A0Y(c9717GeV, 0);
                    C7384Etj.A0Y(str5, 1);
                    c9719GeX = new C9719GeX(HiU.A00.A04(iapPurchaseController.A02, str5, th3));
                }
                iapPurchaseController.A02(c9717GeV, c9719GeX);
                break;
            case 12:
                HoL hoL = (HoL) obj;
                C7384Etj.A0Y(hoL, 0);
                F9R f9r = new F9R((F9Q) this.A02, (F6D) this.A00, hoL, (F9S) this.A01);
                if (!C7384Etj.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
                    F9Q.A07.post(f9r);
                    break;
                } else {
                    f9r.run();
                    break;
                }
            case 13:
                C7384Etj.A0Y(obj, 0);
                return ((G0W) this.A00).invoke(this.A02, this.A01, obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8192FYj(Object obj, G0U<? super Throwable, Unit> g0u, C8983Fvi<T> c8983Fvi, G0V<? super T, ? super Throwable, Unit> g0v) {
        super(1);
        this.$t = g0v;
        this.A00 = g0u;
        this.A02 = obj;
        this.A01 = c8983Fvi;
    }
}
