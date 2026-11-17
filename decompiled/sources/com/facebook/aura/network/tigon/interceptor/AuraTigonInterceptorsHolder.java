package com.facebook.aura.network.tigon.interceptor;

import X.AbstractC0878AGe;
import X.C06H;
import X.C0881AGi;
import X.C3cG;
import X.C7384Etj;
import com.facebook.tigon.interceptors.Interceptor;
import com.facebook.tigon.interceptors.RequestInterceptor;
import com.facebook.tigon.interceptors.TigonXplatInterceptorsHolder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class AuraTigonInterceptorsHolder extends TigonXplatInterceptorsHolder {
    public final List<RequestInterceptor> requestInterceptors;

    public AuraTigonInterceptorsHolder(List<? extends RequestInterceptor> list) {
        C7384Etj.A0Y(list, 0);
        ArrayList arrayListA0P = AbstractC0878AGe.A0P(list, Collections.singletonList(new AuraCorrelationTigonInterceptor()));
        this.requestInterceptors = arrayListA0P;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = arrayListA0P.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!((Interceptor) next).disabled) {
                arrayListA0h.add(next);
            }
        }
        Iterator it2 = arrayListA0h.iterator();
        while (it2.hasNext()) {
            registerRequestInterceptor((RequestInterceptor) it2.next());
        }
    }

    public /* synthetic */ AuraTigonInterceptorsHolder(List list, int i, C06H c06h) {
        this((i & 1) != 0 ? C0881AGi.A00 : list);
    }

    public AuraTigonInterceptorsHolder() {
        this(C0881AGi.A00);
    }
}
