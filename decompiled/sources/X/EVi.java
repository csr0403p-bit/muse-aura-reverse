package X;

import com.facebook.aura.bloks.fbpay.pttprovider.AuraFBPayExecutors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Observable;

/* loaded from: classes5.dex */
public abstract class EVi<VMResult, ApiResult> {
    public C8439Fe3 A00;
    public boolean A01;
    public final AuraFBPayExecutors A02;

    /* JADX WARN: Incorrect inner types in field signature: LX/EVi<TVMResult;TApiResult;>.RequestObservableLiveData; */
    public final EVh A03 = new EVh(this);

    public static void A00(AbstractC5306Dfp abstractC5306Dfp, EVi eVi) throws Throwable {
        C6693EVo c6693EVo;
        boolean z;
        if (eVi.A01) {
            EVh eVh = eVi.A03;
            eVh.A0C();
            C8439Fe3 c8439Fe3 = eVi.A00;
            if (c8439Fe3 != null) {
                synchronized (c8439Fe3) {
                    z = c8439Fe3.A02;
                }
                if (!z) {
                    eVi.A00.A00();
                }
            }
            if (abstractC5306Dfp == null && eVh.A02() != (c6693EVo = new C6693EVo(C79.A0C, null, null))) {
                eVh.A0A(c6693EVo);
            }
            eVi.A00 = new C8439Fe3();
            eVh.A0D(abstractC5306Dfp, C79.A0C);
            if (!(eVi instanceof EVf)) {
                EVa eVa = ((EVb) eVi).A01;
                HashMap mapA0u = BV4.A0u();
                Iterator itA0n = AnonymousClass002.A0n(eVa.A00.getAll());
                while (itA0n.hasNext()) {
                    Map.Entry entryA0l = C3cH.A0l(itA0n);
                    if (entryA0l.getValue() instanceof String) {
                        String strA0t = C60O.A0t(entryA0l);
                        String str = eVa.A01;
                        if (strA0t.startsWith(str)) {
                            mapA0u.put(C60O.A0t(entryA0l).substring(str.length()), entryA0l.getValue());
                        }
                    }
                }
                new ArrayList(mapA0u.values());
            }
            C6694EVp c6694EVp = new C6694EVp();
            eVh.A0C();
            eVh.A01 = c6694EVp;
            if (((AbstractC5306Dfp) eVh).A00 > 0) {
                Observable observable = c6694EVp.A00;
                EVj eVj = new EVj();
                eVj.A00 = eVh;
                observable.addObserver(eVj);
            }
        }
    }

    public EVi(AuraFBPayExecutors auraFBPayExecutors) {
        this.A02 = auraFBPayExecutors;
    }
}
