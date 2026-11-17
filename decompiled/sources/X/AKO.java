package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.navigation.AuraNavigator;

/* loaded from: classes4.dex */
public abstract class AKO {
    public static Context A01(BBI bbi) {
        return (Context) A08(AndroidCompositionLocals_androidKt.A01, BBI.A04(bbi));
    }

    /* JADX WARN: Incorrect types in method signature: ([LX/AKJ<*>;LX/AKQ;LX/AKQ;)LX/AKQ; */
    public static final C0967AJu A03(AKQ akq, AKQ akq2, AKJ[] akjArr) {
        C0967AJu c0967AJu = C0967AJu.A00;
        C0969AJw c0969AJw = new C0969AJw(c0967AJu);
        c0969AJw.A00 = c0967AJu;
        for (AKJ akj : akjArr) {
            AKN<T> akn = akj.A01;
            C7384Etj.A0Z(akn, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            if (akj.A00 || !akq.containsKey(akn)) {
                c0969AJw.put(akn, akn.A03(akj, (AKP) akq2.get(akn)));
            }
        }
        return C0969AJw.A00(c0969AJw);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/AKQ;LX/AKN<TT;>;)TT; */
    public static final Object A08(AKN akn, AKQ akq) {
        C7384Etj.A0Z(akn, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Object objA02 = akq.get(akn);
        if (objA02 == null) {
            objA02 = akn.A02();
        }
        return ((AKP) objA02).AZc(akq);
    }

    public static Context A00(AKN akn, BBI bbi) {
        return (Context) A08(akn, BBI.A04(bbi));
    }

    public static LocaleList A02(AKN akn, BBI bbi) {
        return ((Configuration) A08(akn, BBI.A04(bbi))).getLocales();
    }

    public static AXN A04(AKN akn, BBI bbi) {
        return (AXN) A08(akn, BBI.A04(bbi));
    }

    public static AuraNavigator A05(AKN akn, BBI bbi) {
        return (AuraNavigator) A08(akn, BBI.A04(bbi));
    }

    public static AbstractC3358CGz A06(AKN akn, BBI bbi) {
        return (AbstractC3358CGz) A08(akn, BBI.A04(bbi));
    }

    public static Object A07(AKN akn, BBI bbi) {
        return A08(akn, BBI.A04(bbi));
    }

    public static boolean A09(AKN akn, BBI bbi) {
        return ((Boolean) A08(akn, BBI.A04(bbi))).booleanValue();
    }
}
