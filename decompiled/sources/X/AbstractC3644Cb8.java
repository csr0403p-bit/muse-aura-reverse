package X;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.Map;

/* renamed from: X.Cb8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3644Cb8<K, V> {
    public final Map A00 = BV4.A0u();

    /* JADX WARN: Multi-variable type inference failed */
    public final V A00(K k) {
        Object c3704Cd2;
        Map map = this.A00;
        synchronized (map) {
            if (map.containsKey(k)) {
                c3704Cd2 = (V) map.get(k);
            } else {
                if (this instanceof Cb6) {
                    C3104ByR c3104ByR = (C3104ByR) k;
                    Context context = (Context) ((Cb6) this).A00.A02(Context.class);
                    c3704Cd2 = (V) new C3658CcB(AbstractC3643Cb7.A00(), c3104ByR, GooglePlayServicesUtil.A00(context) >= 204700000 ? new CbS(context, c3104ByR) : new CbR(context));
                } else if (this instanceof Cbm) {
                    C4209CqH c4209CqH = (C4209CqH) k;
                    Context context2 = (Context) ((Cbm) this).A00.A02(Context.class);
                    C3696Ccu c3696CcuA00 = AbstractC3655Cbu.A00(true != Cbw.A02() ? "play-services-mlkit-face-detection" : "face-detection");
                    c3704Cd2 = new Cc0(AbstractC3655Cbu.A00(true != Cbw.A02() ? "play-services-mlkit-face-detection" : "face-detection"), c4209CqH, (Cb9.A00(context2, "com.google.mlkit.dynamite.face") > 0 || GooglePlayServicesUtil.A00(context2) >= 204500000) ? new C3654Cbl(context2, c3696CcuA00, c4209CqH) : new C3653Cbk(context2, c3696CcuA00, c4209CqH));
                } else if (this instanceof C3681Ccf) {
                    AbstractC3743Cdg abstractC3743Cdg = (AbstractC3743Cdg) k;
                    C3555CTs c3555CTsA00 = C3555CTs.A00();
                    c3704Cd2 = new C3695Cct((Context) c3555CTsA00.A02(Context.class), new C3682Ccg((Context) C3555CTs.A00().A02(Context.class), abstractC3743Cdg), (C3577CUy) c3555CTsA00.A02(C3577CUy.class), ((C3676Cca) abstractC3743Cdg).A01);
                } else if (this instanceof C3679Ccd) {
                    AbstractC3750Cdn abstractC3750Cdn = (AbstractC3750Cdn) k;
                    C3555CTs c3555CTsA002 = C3555CTs.A00();
                    c3704Cd2 = new C3696Ccu((Context) c3555CTsA002.A02(Context.class), new C3680Cce((Context) C3555CTs.A00().A02(Context.class), abstractC3750Cdn), (C3577CUy) c3555CTsA002.A02(C3577CUy.class), ((C3678Ccc) abstractC3750Cdn).A01);
                } else if (this instanceof C3673CcX) {
                    AbstractC3747Cdk abstractC3747Cdk = (AbstractC3747Cdk) k;
                    C3555CTs c3555CTsA003 = C3555CTs.A00();
                    c3704Cd2 = new C3672CcW((Context) c3555CTsA003.A02(Context.class), new C3674CcY((Context) C3555CTs.A00().A02(Context.class), abstractC3747Cdk), (C3577CUy) c3555CTsA003.A02(C3577CUy.class), ((C3675CcZ) abstractC3747Cdk).A01);
                } else {
                    AbstractC3744Cdh abstractC3744Cdh = (AbstractC3744Cdh) k;
                    C3772CeF c3772CeF = C3704Cd2.A05;
                    C3555CTs c3555CTsA004 = C3555CTs.A00();
                    c3704Cd2 = new C3704Cd2((Context) c3555CTsA004.A02(Context.class), new C3684Cci((Context) C3555CTs.A00().A02(Context.class), abstractC3744Cdh), (C3577CUy) c3555CTsA004.A02(C3577CUy.class), ((C3677Ccb) abstractC3744Cdh).A01);
                }
                map.put(k, c3704Cd2);
            }
        }
        return (V) c3704Cd2;
    }
}
