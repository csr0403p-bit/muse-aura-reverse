package X;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowManager;

/* renamed from: X.B0a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2164B0a implements B0d {
    public static final C2164B0a A00 = new C2164B0a();

    @Override // X.B0d
    public final Rect A89(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        C7384Etj.A0U(bounds);
        return bounds;
    }
}
