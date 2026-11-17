package X;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* renamed from: X.AlG, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ComponentCallbacks2C1551AlG implements ComponentCallbacks2 {
    public final /* synthetic */ C1548AlB A00;

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    public ComponentCallbacks2C1551AlG(C1548AlB c1548AlB) {
        this.A00 = c1548AlB;
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i >= 40) {
            C1548AlB.A00(this.A00);
        }
    }
}
