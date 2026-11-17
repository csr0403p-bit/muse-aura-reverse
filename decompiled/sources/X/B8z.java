package X;

import androidx.compose.ui.text.font.AsyncTypefaceCache;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class B8z {
    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<+LX/B9B;>;LX/B0J;Landroidx/compose/ui/text/font/AsyncTypefaceCache;LX/B98;LX/G0U<-LX/B0J;+Ljava/lang/Object;>;)LX/HxE<Ljava/util/List<LX/B9B;>;Ljava/lang/Object;>; */
    public static final HxE A00(AsyncTypefaceCache asyncTypefaceCache, B98 b98, B0J b0j, List list, G0U g0u) {
        Object objInvoke;
        Object objInvoke2;
        int i;
        B94 b94A02;
        int size = list.size();
        ArrayList arrayListA0y = null;
        for (int i2 = 0; i2 < size; i2++) {
            B9B b9b = (B9B) list.get(i2);
            int iMo20getLoadingStrategyPKNRLFQ = b9b.mo20getLoadingStrategyPKNRLFQ();
            if (iMo20getLoadingStrategyPKNRLFQ == 0) {
                synchronized (asyncTypefaceCache.A02) {
                    A4D a4d = new A4D(b9b);
                    B94 b94A022 = asyncTypefaceCache.A00.A02(a4d);
                    if (b94A022 == null && (b94A022 = asyncTypefaceCache.A01.A05(a4d)) == null) {
                        try {
                            objInvoke2 = b98.APi(b9b);
                        } catch (Exception unused) {
                            objInvoke2 = g0u.invoke(b0j);
                        }
                        AsyncTypefaceCache.A00(asyncTypefaceCache, b9b, objInvoke2);
                    } else {
                        objInvoke2 = b94A022.A00;
                    }
                }
                if (objInvoke2 == null) {
                    objInvoke2 = g0u.invoke(b0j);
                }
            } else {
                if (iMo20getLoadingStrategyPKNRLFQ == 1) {
                    synchronized (asyncTypefaceCache.A02) {
                        A4D a4d2 = new A4D(b9b);
                        B94 b94A023 = asyncTypefaceCache.A00.A02(a4d2);
                        if (b94A023 == null && (b94A023 = asyncTypefaceCache.A01.A05(a4d2)) == null) {
                            try {
                                objInvoke2 = b98.APi(b9b);
                            } catch (Throwable th) {
                                objInvoke2 = new C10571Hud(th);
                            }
                            if (objInvoke2 instanceof C10571Hud) {
                                objInvoke2 = null;
                            }
                            AsyncTypefaceCache.A00(asyncTypefaceCache, b9b, objInvoke2);
                        } else {
                            objInvoke2 = b94A023.A00;
                        }
                    }
                    if (objInvoke2 != null) {
                    }
                } else {
                    if (iMo20getLoadingStrategyPKNRLFQ != 2) {
                        throw C3cG.A0Q(AnonymousClass007.A0a("Unknown font type ", b9b));
                    }
                    A4D a4d3 = new A4D(b9b);
                    synchronized (asyncTypefaceCache.A02) {
                        b94A02 = asyncTypefaceCache.A00.A02(a4d3);
                        if (b94A02 == null) {
                            b94A02 = asyncTypefaceCache.A01.A05(a4d3);
                        }
                    }
                    if (b94A02 != null) {
                        objInvoke2 = b94A02.A00;
                        if (objInvoke2 != null) {
                            i = b0j.A01;
                            objInvoke = B95.A00(b9b, b0j.A03, objInvoke2, i, b0j.A00);
                            break;
                        }
                    } else if (arrayListA0y == null) {
                        arrayListA0y = AbstractC0885AGm.A0y(b9b);
                    } else {
                        arrayListA0y.add(b9b);
                    }
                }
            }
            i = b0j.A01;
            objInvoke = B95.A00(b9b, b0j.A03, objInvoke2, i, b0j.A00);
            break;
        }
        objInvoke = g0u.invoke(b0j);
        return C3cG.A0r(arrayListA0y, objInvoke);
    }
}
