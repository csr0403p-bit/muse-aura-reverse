package X;

import android.os.Build;
import android.view.View;

/* renamed from: X.Axg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2066Axg {
    public final Az8 A00;

    public C2066Axg(View view) {
        this.A00 = Build.VERSION.SDK_INT >= 30 ? new AzA(view) : new Az9(view);
    }
}
