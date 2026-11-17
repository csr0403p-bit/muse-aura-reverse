package X;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;

/* loaded from: classes4.dex */
public interface B0d {
    Rect A89(Activity activity);

    static B0d A00() {
        return Build.VERSION.SDK_INT >= 30 ? C2164B0a.A00 : BAO.A00;
    }
}
