package X;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Build;
import android.view.ViewGroup;
import android.window.SplashScreenView;

/* renamed from: X.Fca, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8361Fca extends C8362Fcb {
    public SplashScreenView A00;

    @Override // X.C8362Fcb
    public final /* bridge */ /* synthetic */ ViewGroup A00() {
        SplashScreenView splashScreenView = this.A00;
        if (splashScreenView != null) {
            return splashScreenView;
        }
        C7384Etj.A0b("platformView");
        throw F60.createAndThrow();
    }

    @Override // X.C8362Fcb
    public final void A01() {
    }

    @Override // X.C8362Fcb
    public final void A02() {
        SplashScreenView splashScreenView = this.A00;
        if (splashScreenView == null) {
            C7384Etj.A0b("platformView");
            throw F60.createAndThrow();
        }
        splashScreenView.remove();
        if (Build.VERSION.SDK_INT < 33) {
            Activity activity = super.A00;
            Resources.Theme theme = activity.getTheme();
            C7384Etj.A0U(theme);
            Hnr.A00(theme, AbstractC7607F5u.A0Z(), AbstractC7607F5u.A0b(activity));
        }
    }

    public final void A03(SplashScreenView splashScreenView) {
        this.A00 = splashScreenView;
    }

    public C8361Fca(Activity activity) {
        super(activity);
    }
}
