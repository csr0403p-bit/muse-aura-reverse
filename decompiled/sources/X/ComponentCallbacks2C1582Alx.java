package X;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.MutableState;
import kotlin.Deprecated;

/* renamed from: X.Alx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ComponentCallbacks2C1582Alx implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ C1575Alq A00;

    public ComponentCallbacks2C1582Alx(C1575Alq c1575Alq) {
        this.A00 = c1575Alq;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.A00.A02(configuration);
    }

    @Override // android.content.ComponentCallbacks
    @Deprecated(message = "This callback is superseded by onTrimMemory")
    public final void onLowMemory() {
        C1575Alq c1575Alq = this.A00;
        c1575Alq.A0G.A00.clear();
        c1575Alq.A0H.A00();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        C1575Alq c1575Alq = this.A00;
        c1575Alq.A0G.A00.clear();
        c1575Alq.A0H.A00();
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        MutableState.A09(z, this.A00.A0F.A02);
    }
}
