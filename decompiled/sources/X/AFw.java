package X;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AFw implements AFx, A6I {
    public C5303Dfm A00;
    public A6O A01;
    public final /* synthetic */ AFx A02;

    @Override // X.A6I
    public final SavedStateRegistry getSavedStateRegistry() {
        A6O a6oA00 = this.A01;
        if (a6oA00 == null) {
            a6oA00 = A6O.A00(this);
            this.A01 = a6oA00;
            a6oA00.A01(null);
        }
        return a6oA00.A00;
    }

    @Override // X.AFx
    public final boolean A5t(Object obj) {
        return this.A02.A5t(obj);
    }

    @Override // X.AFx
    public final Object A71(String str) {
        return this.A02.A71(str);
    }

    @Override // X.AFx
    public final Map<String, List<Object>> AXs() {
        return this.A02.AXs();
    }

    @Override // X.AFx
    public final AG2 Aa3(String str, Function0<? extends Object> function0) {
        return this.A02.Aa3(str, function0);
    }

    @Override // X.C1HY
    public final /* bridge */ /* synthetic */ F2N getLifecycle() {
        C5303Dfm c5303Dfm = this.A00;
        if (c5303Dfm != null) {
            return c5303Dfm;
        }
        C5303Dfm c5303Dfm2 = new C5303Dfm(this, false);
        this.A00 = c5303Dfm2;
        return c5303Dfm2;
    }

    public AFw(AFx aFx) {
        Bundle bundle;
        this.A02 = aFx;
        Object objA71 = aFx.A71("androidx.savedstate.SavedStateRegistry");
        if ((objA71 instanceof Bundle) && (bundle = (Bundle) objA71) != null && this.A01 == null) {
            A6O a6oA00 = A6O.A00(this);
            this.A01 = a6oA00;
            a6oA00.A01(bundle);
        }
        Aa3("androidx.savedstate.SavedStateRegistry", C2293BSt.A00(this, 28));
    }
}
