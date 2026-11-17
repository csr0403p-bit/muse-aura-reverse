package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.window.SplashScreenView;

/* renamed from: X.Fcc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewGroupOnHierarchyChangeListenerC8363Fcc implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C8360FcZ A01;

    public ViewGroupOnHierarchyChangeListenerC8363Fcc(Activity activity, C8360FcZ c8360FcZ) {
        this.A01 = c8360FcZ;
        this.A00 = activity;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        if (view2 instanceof SplashScreenView) {
            this.A01.A05(C8360FcZ.A01((SplashScreenView) view2));
            View viewA0a = AbstractC7607F5u.A0a(this.A00);
            C7384Etj.A0Z(viewA0a, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) viewA0a).setOnHierarchyChangeListener(null);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }
}
