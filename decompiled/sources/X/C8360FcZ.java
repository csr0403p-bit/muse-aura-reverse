package X;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.window.SplashScreen;
import android.window.SplashScreenView;

/* renamed from: X.FcZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8360FcZ extends C8359FcY {
    public boolean A00;
    public ViewTreeObserver.OnPreDrawListener A01;
    public final ViewGroup.OnHierarchyChangeListener A02;

    public static final void A00(SplashScreenView splashScreenView, C8360FcZ c8360FcZ, InterfaceC8368Fci interfaceC8368Fci) {
        C7384Etj.A0Y(splashScreenView, 2);
        if (Build.VERSION.SDK_INT < 33) {
            TypedValue typedValueA0Z = AbstractC7607F5u.A0Z();
            Activity activity = c8360FcZ.A07;
            Resources.Theme theme = activity.getTheme();
            Window window = activity.getWindow();
            if (theme.resolveAttribute(R.attr.statusBarColor, typedValueA0Z, true)) {
                window.setStatusBarColor(typedValueA0Z.data);
            }
            if (theme.resolveAttribute(R.attr.navigationBarColor, typedValueA0Z, true)) {
                window.setNavigationBarColor(typedValueA0Z.data);
            }
            if (theme.resolveAttribute(R.attr.windowDrawsSystemBarBackgrounds, typedValueA0Z, true)) {
                if (typedValueA0Z.data != 0) {
                    window.addFlags(Integer.MIN_VALUE);
                } else {
                    window.clearFlags(Integer.MIN_VALUE);
                }
            }
            View decorView = window.getDecorView();
            C7384Etj.A0Z(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) decorView;
            Hnr.A00(theme, typedValueA0Z, viewGroup);
            viewGroup.setOnHierarchyChangeListener(null);
            window.setDecorFitsSystemWindows(c8360FcZ.A00);
        }
        interfaceC8368Fci.onSplashScreenExit(new C8364Fcd(c8360FcZ.A07, splashScreenView));
    }

    public static final boolean A01(SplashScreenView splashScreenView) {
        C7384Etj.A0Y(splashScreenView, 0);
        WindowInsets windowInsetsBuild = new WindowInsets.Builder().build();
        C7384Etj.A0U(windowInsetsBuild);
        Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        return (windowInsetsBuild == splashScreenView.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect) && rect.isEmpty()) ? false : true;
    }

    @Override // X.C8359FcY
    public final void A02() {
        int i;
        Activity activity = this.A07;
        Resources.Theme theme = activity.getTheme();
        C7384Etj.A0U(theme);
        TypedValue typedValueA0Z = AbstractC7607F5u.A0Z();
        if (theme.resolveAttribute(com.facebook.aura.R.attr._name_removed__res_0x7f040465, typedValueA0Z, true) && (i = typedValueA0Z.resourceId) != 0) {
            activity.setTheme(i);
        }
        if (Build.VERSION.SDK_INT < 33) {
            View viewA0a = AbstractC7607F5u.A0a(activity);
            C7384Etj.A0Z(viewA0a, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) viewA0a).setOnHierarchyChangeListener(this.A02);
        }
    }

    @Override // X.C8359FcY
    public final void A03(InterfaceC8370Fck interfaceC8370Fck) {
        super.A00 = interfaceC8370Fck;
        View viewFindViewById = this.A07.findViewById(R.id.content);
        ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
        if (this.A01 != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.A01);
        }
        ViewTreeObserverOnPreDrawListenerC10643I0n viewTreeObserverOnPreDrawListenerC10643I0n = new ViewTreeObserverOnPreDrawListenerC10643I0n(1, viewFindViewById, this);
        this.A01 = viewTreeObserverOnPreDrawListenerC10643I0n;
        viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC10643I0n);
    }

    @Override // X.C8359FcY
    public final void A04(final InterfaceC8368Fci interfaceC8368Fci) {
        this.A07.getSplashScreen().setOnExitAnimationListener(new SplashScreen.OnExitAnimationListener() { // from class: X.Fch
            @Override // android.window.SplashScreen.OnExitAnimationListener
            public final void onSplashScreenExit(SplashScreenView splashScreenView) {
                C8360FcZ.A00(splashScreenView, this.A00, interfaceC8368Fci);
            }
        });
    }

    public final void A05(boolean z) {
        this.A00 = z;
    }

    public C8360FcZ(Activity activity) {
        super(activity);
        this.A00 = true;
        this.A02 = new ViewGroupOnHierarchyChangeListenerC8363Fcc(activity, this);
    }
}
