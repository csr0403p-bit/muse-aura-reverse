package X;

import android.app.Activity;
import android.os.Build;
import android.window.SplashScreenView;

/* renamed from: X.Fcd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8364Fcd {
    public final C8362Fcb A00;

    public C8364Fcd(Activity activity) {
        C8362Fcb c8361Fca = Build.VERSION.SDK_INT >= 31 ? new C8361Fca(activity) : new C8362Fcb(activity);
        c8361Fca.A01();
        this.A00 = c8361Fca;
    }

    public C8364Fcd(Activity activity, SplashScreenView splashScreenView) {
        this(activity);
        ((C8361Fca) this.A00).A03(splashScreenView);
    }
}
