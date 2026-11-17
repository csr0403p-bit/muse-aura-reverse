package X;

import android.app.Activity;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class DB9 implements DBA {
    public final G0U<String, Unit> A00;

    @Override // X.DBA
    public final void uninstall() {
    }

    @Override // X.DBA
    public final void onActivityResumed(Activity activity) {
        this.A00.invoke("OnResume");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DB9(G0U<? super String, Unit> g0u) {
        this.A00 = g0u;
    }
}
