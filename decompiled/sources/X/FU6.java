package X;

import android.os.Build;
import android.view.View;

/* loaded from: classes6.dex */
public final class FU6 {
    public final FUI A00;

    public FU6(View view) {
        this.A00 = Build.VERSION.SDK_INT >= 35 ? new FUD(view) : new FUW();
    }
}
