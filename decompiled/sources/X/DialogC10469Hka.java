package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.savedstate.SavedStateRegistry;
import com.facebook.aura.R;
import kotlin.Deprecated;

/* renamed from: X.Hka, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class DialogC10469Hka extends Dialog implements C1HY, A6I, InterfaceC2262BMi, C28u {
    public C5303Dfm A00;
    public final F0C A01;
    public final A6O A02;
    public final F0C A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC10469Hka(Context context, int i) {
        super(context, i);
        C7384Etj.A0Y(context, 0);
        this.A02 = A6O.A00(this);
        this.A01 = AbstractC7607F5u.A1A(null, new Hil(this, 5));
        this.A03 = AbstractC7607F5u.A1A(null, new C2292BSs(this, 0));
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C7384Etj.A0Y(view, 0);
        A04();
        super.addContentView(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        C7384Etj.A0Y(view, 0);
        A04();
        super.setContentView(view);
    }

    @Override // X.C1HY
    public final F2N getLifecycle() {
        C5303Dfm c5303Dfm = this.A00;
        if (c5303Dfm != null) {
            return c5303Dfm;
        }
        C5303Dfm c5303Dfm2 = new C5303Dfm(this, true);
        this.A00 = c5303Dfm2;
        return c5303Dfm2;
    }

    @Override // X.InterfaceC2262BMi
    public final C2186B9f getOnBackPressedDispatcher() {
        return (C2186B9f) this.A03.getValue();
    }

    @Override // X.A6I
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.A02.A00;
    }

    @Override // android.app.Dialog
    @Deprecated(message = "This method has been deprecated in favor of using the\n      {@link OnBackPressedDispatcher} via {@link #getOnBackPressedDispatcher()}.\n      The OnBackPressedDispatcher controls how back button events are dispatched\n      to one or more {@link OnBackPressedCallback} objects.")
    public final void onBackPressed() {
        ((AbstractC2184B9c) this.A01.getValue()).A03();
    }

    @Override // android.app.Dialog
    public void onStop() {
        C5303Dfm c5303Dfm = this.A00;
        if (c5303Dfm == null) {
            c5303Dfm = new C5303Dfm(this, true);
            this.A00 = c5303Dfm;
        }
        c5303Dfm.A06(EnumC3085Bxl.ON_DESTROY);
        this.A00 = null;
        super.onStop();
    }

    public final void A04() {
        Window window = getWindow();
        C7384Etj.A0X(window);
        View decorView = window.getDecorView();
        C7384Etj.A0U(decorView);
        AbstractC1720Ap8.A01(decorView, this);
        Window window2 = getWindow();
        C7384Etj.A0X(window2);
        View decorView2 = window2.getDecorView();
        C7384Etj.A0U(decorView2);
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        C7384Etj.A0X(window3);
        View decorView3 = window3.getDecorView();
        C7384Etj.A0U(decorView3);
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        C7384Etj.A0X(window4);
        View decorView4 = window4.getDecorView();
        C7384Etj.A0U(decorView4);
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // X.C28u
    public final C2183B9b getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().A02;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            C2186B9f onBackPressedDispatcher = getOnBackPressedDispatcher();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            C7384Etj.A0U(onBackInvokedDispatcher);
            onBackPressedDispatcher.A00(onBackInvokedDispatcher);
        }
        this.A02.A01(bundle);
        C5303Dfm c5303Dfm = this.A00;
        if (c5303Dfm == null) {
            c5303Dfm = new C5303Dfm(this, true);
            this.A00 = c5303Dfm;
        }
        c5303Dfm.A06(EnumC3085Bxl.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        C7384Etj.A0U(bundleOnSaveInstanceState);
        this.A02.A02(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        C5303Dfm c5303Dfm = this.A00;
        if (c5303Dfm == null) {
            c5303Dfm = new C5303Dfm(this, true);
            this.A00 = c5303Dfm;
        }
        c5303Dfm.A06(EnumC3085Bxl.ON_RESUME);
    }

    public static final void A03(DialogC10469Hka dialogC10469Hka) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C7384Etj.A0Y(view, 0);
        A04();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        A04();
        super.setContentView(i);
    }
}
