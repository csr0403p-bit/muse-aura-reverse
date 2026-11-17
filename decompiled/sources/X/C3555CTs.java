package X;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: X.CTs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3555CTs {
    public static C3555CTs A01;
    public static final Object A02 = C3cG.A0T();
    public CUO A00;

    public static C3555CTs A00() {
        C3555CTs c3555CTs;
        synchronized (A02) {
            CRy.A09(AnonymousClass002.A1X(A01), "MlKitContext has not been initialized");
            c3555CTs = A01;
            CRy.A03(c3555CTs);
        }
        return c3555CTs;
    }

    public static void A01(Context context) {
        synchronized (A02) {
            Executor executor = AbstractC3097ByB.A00;
            CRy.A09(AnonymousClass002.A1Y(A01), "MlKitContext is already initialized");
            C3555CTs c3555CTs = new C3555CTs();
            A01 = c3555CTs;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator it = AbstractC7379Eta.A00(MlKitComponentDiscoveryService.class, context).iterator();
            while (it.hasNext()) {
                arrayListA0h.add(new C3558CTv(AnonymousClass005.A0j(it)));
            }
            ArrayList arrayListA0h2 = C3cG.A0h();
            ArrayList arrayListA0h3 = C3cG.A0h();
            arrayListA0h2.addAll(arrayListA0h);
            C3565CUi.A01(Context.class, context, arrayListA0h3);
            C3565CUi.A01(C3555CTs.class, c3555CTs, arrayListA0h3);
            CUO cuo = new CUO(arrayListA0h2, arrayListA0h3, executor);
            c3555CTs.A00 = cuo;
            cuo.A06(true);
        }
    }

    public final <T> T A02(Class<T> cls) {
        CRy.A09(AnonymousClass002.A1Z(A01, this), "MlKitContext has been deleted");
        CUO cuo = this.A00;
        CRy.A03(cuo);
        return (T) cuo.A02(cls);
    }
}
