package X;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: X.Avc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1971Avc {
    public final AbstractC0973AKh A00;

    public final void A00(boolean z) {
        this.A00.A01(z);
    }

    public final void A01(boolean z) {
        this.A00.A02(z);
    }

    public C1971Avc(View view, Window window) {
        C2066Axg c2066Axg = new C2066Axg(view);
        int i = Build.VERSION.SDK_INT;
        this.A00 = i >= 35 ? new C2054AxR(window, c2066Axg, this) : i >= 30 ? new C2055AxS(window, c2066Axg, this) : new C2101AyQ(window, c2066Axg);
    }
}
