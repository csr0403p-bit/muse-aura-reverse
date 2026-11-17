package androidx.compose.ui.platform;

import X.A6I;
import X.AGE;
import X.AGN;
import X.AGO;
import X.AIB;
import X.AIC;
import X.AKH;
import X.AKK;
import X.BUS;
import X.BUT;
import X.C1599AmR;
import X.C1607AmZ;
import X.C1HY;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;

/* loaded from: classes4.dex */
public abstract class AndroidCompositionLocals_androidKt {
    public static final AKH<Configuration> A00 = new AGN(AGE.A00, new BUS(17));
    public static final AKH<Context> A01 = AGO.A00(18);
    public static final AKH<Resources> A04 = new AKK(BUT.A00(48));
    public static final AKH<C1599AmR> A02 = AGO.A00(19);
    public static final AKH<C1607AmZ> A03 = AGO.A00(20);
    public static final AKH<View> A05 = AGO.A00(21);

    public static final AKH<C1HY> getLocalLifecycleOwner() {
        return AIC.A00;
    }

    public static final AKH<A6I> getLocalSavedStateRegistryOwner() {
        return AIB.A00;
    }
}
