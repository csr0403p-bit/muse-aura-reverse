package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.facebook.aura.R;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.util.ArrayList;

/* renamed from: X.FaW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8251FaW extends AbstractC8276Fb0 implements InterfaceC8355FcT {
    public static final Interpolator A0R = new AccelerateInterpolator();
    public static final Interpolator A0S = new DecelerateInterpolator();
    public Context A01;
    public Context A02;
    public View A03;
    public C8258Fae A04;
    public InterfaceC8306FbY A05;
    public AbstractC8280Fb4 A06;
    public C8264Fam A07;
    public ActionBarContainer A08;
    public ActionBarContextView A09;
    public ActionBarOverlayLayout A0A;
    public InterfaceC8333Fc0 A0B;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public Activity A0L;
    public ArrayList A0M = C3cG.A0h();
    public ArrayList A0C = C3cG.A0h();
    public int A00 = 0;
    public boolean A0D = true;
    public boolean A0N = true;
    public final FT0 A0O = new I0E(this, 3);
    public final FT0 A0P = new I0E(this, 4);
    public final InterfaceC8349FcN A0Q = new C8311Fbd(this);

    public static void A01(C8251FaW c8251FaW, boolean z) {
        View view;
        View view2;
        View view3;
        boolean z2 = c8251FaW.A0F;
        boolean z3 = c8251FaW.A0G;
        boolean z4 = true;
        if (!c8251FaW.A0K && (z2 || z3)) {
            z4 = false;
        }
        boolean z5 = c8251FaW.A0N;
        if (!z4) {
            if (z5) {
                c8251FaW.A0N = false;
                C8264Fam c8264Fam = c8251FaW.A07;
                if (c8264Fam != null) {
                    c8264Fam.A00();
                }
                if (c8251FaW.A00 != 0 || (!c8251FaW.A0J && !z)) {
                    c8251FaW.A0O.onAnimationEnd(null);
                    return;
                }
                c8251FaW.A08.setAlpha(1.0f);
                c8251FaW.A08.setTransitioning(true);
                C8264Fam c8264Fam2 = new C8264Fam();
                float f = -c8251FaW.A08.getHeight();
                if (z) {
                    c8251FaW.A08.getLocationInWindow(new int[]{0, 0});
                    f -= r1[1];
                }
                C8093FSz c8093FSzA02 = AbstractC8060FRo.A02(c8251FaW.A08);
                View viewA00 = C8093FSz.A00(c8093FSzA02);
                if (viewA00 != null) {
                    viewA00.animate().translationY(f);
                }
                InterfaceC8349FcN interfaceC8349FcN = c8251FaW.A0Q;
                View viewA002 = C8093FSz.A00(c8093FSzA02);
                if (viewA002 != null) {
                    viewA002.animate().setUpdateListener(interfaceC8349FcN != null ? new C8917FtZ(0, viewA002, interfaceC8349FcN) : null);
                }
                if (!c8264Fam2.A03) {
                    c8264Fam2.A04.add(c8093FSzA02);
                }
                if (c8251FaW.A0D && (view = c8251FaW.A03) != null) {
                    C8093FSz c8093FSzA022 = AbstractC8060FRo.A02(view);
                    View viewA003 = C8093FSz.A00(c8093FSzA022);
                    if (viewA003 != null) {
                        viewA003.animate().translationY(f);
                    }
                    if (!c8264Fam2.A03) {
                        c8264Fam2.A04.add(c8093FSzA022);
                    }
                }
                Interpolator interpolator = A0R;
                boolean z6 = c8264Fam2.A03;
                if (!z6) {
                    c8264Fam2.A01 = interpolator;
                    c8264Fam2.A00 = 250L;
                }
                FT0 ft0 = c8251FaW.A0O;
                if (!z6) {
                    c8264Fam2.A02 = ft0;
                }
                c8251FaW.A07 = c8264Fam2;
                c8264Fam2.A01();
                return;
            }
            return;
        }
        if (z5) {
            return;
        }
        c8251FaW.A0N = true;
        C8264Fam c8264Fam3 = c8251FaW.A07;
        if (c8264Fam3 != null) {
            c8264Fam3.A00();
        }
        c8251FaW.A08.setVisibility(0);
        if (c8251FaW.A00 == 0 && (c8251FaW.A0J || z)) {
            c8251FaW.A08.setTranslationY(0.0f);
            float f2 = -c8251FaW.A08.getHeight();
            if (z) {
                c8251FaW.A08.getLocationInWindow(new int[]{0, 0});
                f2 -= r1[1];
            }
            c8251FaW.A08.setTranslationY(f2);
            C8264Fam c8264Fam4 = new C8264Fam();
            C8093FSz c8093FSzA023 = AbstractC8060FRo.A02(c8251FaW.A08);
            View viewA004 = C8093FSz.A00(c8093FSzA023);
            if (viewA004 != null) {
                viewA004.animate().translationY(0.0f);
            }
            InterfaceC8349FcN interfaceC8349FcN2 = c8251FaW.A0Q;
            View viewA005 = C8093FSz.A00(c8093FSzA023);
            if (viewA005 != null) {
                viewA005.animate().setUpdateListener(interfaceC8349FcN2 != null ? new C8917FtZ(0, viewA005, interfaceC8349FcN2) : null);
            }
            if (!c8264Fam4.A03) {
                c8264Fam4.A04.add(c8093FSzA023);
            }
            if (c8251FaW.A0D && (view3 = c8251FaW.A03) != null) {
                view3.setTranslationY(f2);
                C8093FSz c8093FSzA024 = AbstractC8060FRo.A02(view3);
                View viewA006 = C8093FSz.A00(c8093FSzA024);
                if (viewA006 != null) {
                    viewA006.animate().translationY(0.0f);
                }
                if (!c8264Fam4.A03) {
                    c8264Fam4.A04.add(c8093FSzA024);
                }
            }
            Interpolator interpolator2 = A0S;
            boolean z7 = c8264Fam4.A03;
            if (!z7) {
                c8264Fam4.A01 = interpolator2;
                c8264Fam4.A00 = 250L;
            }
            FT0 ft02 = c8251FaW.A0P;
            if (!z7) {
                c8264Fam4.A02 = ft02;
            }
            c8251FaW.A07 = c8264Fam4;
            c8264Fam4.A01();
        } else {
            c8251FaW.A08.setAlpha(1.0f);
            c8251FaW.A08.setTranslationY(0.0f);
            if (c8251FaW.A0D && (view2 = c8251FaW.A03) != null) {
                view2.setTranslationY(0.0f);
            }
            c8251FaW.A0P.onAnimationEnd(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = c8251FaW.A0A;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public final void A07(boolean z) {
        boolean z2;
        C8093FSz c8093FSzA02;
        C8093FSz c8093FSzA022;
        boolean z3 = this.A0K;
        if (z) {
            if (!z3) {
                this.A0K = true;
                z2 = false;
                A01(this, z2);
            }
        } else if (z3) {
            z2 = false;
            this.A0K = false;
            A01(this, z2);
        }
        boolean zIsLaidOut = this.A08.isLaidOut();
        InterfaceC8333Fc0 interfaceC8333Fc0 = this.A0B;
        if (!zIsLaidOut) {
            if (z) {
                ((C8254Faa) interfaceC8333Fc0).A09.setVisibility(4);
                this.A09.setVisibility(0);
                return;
            } else {
                ((C8254Faa) interfaceC8333Fc0).A09.setVisibility(0);
                this.A09.setVisibility(8);
                return;
            }
        }
        if (z) {
            C8254Faa c8254Faa = (C8254Faa) interfaceC8333Fc0;
            c8093FSzA022 = AbstractC8060FRo.A02(c8254Faa.A09);
            c8093FSzA022.A02(0.0f);
            c8093FSzA022.A03(100L);
            c8093FSzA022.A04(new I0F(c8254Faa, 4));
            ActionBarContextView actionBarContextView = this.A09;
            C8093FSz c8093FSz = actionBarContextView.A06;
            if (c8093FSz != null) {
                c8093FSz.A01();
            }
            if (actionBarContextView.getVisibility() != 0) {
                actionBarContextView.setAlpha(0.0f);
            }
            c8093FSzA02 = AbstractC8060FRo.A02(actionBarContextView);
            c8093FSzA02.A02(1.0f);
            c8093FSzA02.A03(200L);
            C8292FbH c8292FbH = actionBarContextView.A0Q;
            c8292FbH.A02.A06 = c8093FSzA02;
            c8292FbH.A00 = 0;
            c8093FSzA02.A04(c8292FbH);
        } else {
            C8254Faa c8254Faa2 = (C8254Faa) interfaceC8333Fc0;
            c8093FSzA02 = AbstractC8060FRo.A02(c8254Faa2.A09);
            c8093FSzA02.A02(1.0f);
            c8093FSzA02.A03(200L);
            c8093FSzA02.A04(new I0F(c8254Faa2, 0));
            ActionBarContextView actionBarContextView2 = this.A09;
            C8093FSz c8093FSz2 = actionBarContextView2.A06;
            if (c8093FSz2 != null) {
                c8093FSz2.A01();
            }
            c8093FSzA022 = AbstractC8060FRo.A02(actionBarContextView2);
            c8093FSzA022.A02(0.0f);
            c8093FSzA022.A03(100L);
            C8292FbH c8292FbH2 = actionBarContextView2.A0Q;
            c8292FbH2.A02.A06 = c8093FSzA022;
            c8292FbH2.A00 = 8;
            c8093FSzA022.A04(c8292FbH2);
        }
        C8264Fam c8264Fam = new C8264Fam();
        ArrayList<C8093FSz> arrayList = c8264Fam.A04;
        arrayList.add(c8093FSzA022);
        View viewA00 = C8093FSz.A00(c8093FSzA022);
        long duration = viewA00 != null ? viewA00.animate().getDuration() : 0L;
        View viewA002 = C8093FSz.A00(c8093FSzA02);
        if (viewA002 != null) {
            viewA002.animate().setStartDelay(duration);
        }
        arrayList.add(c8093FSzA02);
        c8264Fam.A01();
    }

    public C8251FaW(Dialog dialog) throws Resources.NotFoundException {
        A00(dialog.getWindow().getDecorView());
    }

    private void A00(View view) throws Resources.NotFoundException {
        InterfaceC8333Fc0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.A0A = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC8333Fc0) {
            wrapper = (InterfaceC8333Fc0) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw BV5.A0U("Can't make a decor toolbar out of ", callbackFindViewById != null ? C3cI.A0Y(callbackFindViewById) : HatchCcvLoggingKt.NO_POSTAL_FIELD);
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.A0B = wrapper;
        this.A09 = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.A08 = actionBarContainer;
        InterfaceC8333Fc0 interfaceC8333Fc0 = this.A0B;
        if (interfaceC8333Fc0 == null || this.A09 == null || actionBarContainer == null) {
            throw BV5.A0U(C3cI.A0Y(this), " can only be used with a compatible window decor layout");
        }
        C8254Faa c8254Faa = (C8254Faa) interfaceC8333Fc0;
        Context context = c8254Faa.A09.getContext();
        this.A01 = context;
        if ((c8254Faa.A01 & 4) != 0) {
            this.A0E = true;
        }
        context.getApplicationInfo();
        context.getResources().getBoolean(R.bool._name_removed__res_0x7f050000);
        this.A08.setTabContainer(null);
        ((C8254Faa) this.A0B).A09.setCollapsible(false);
        this.A0A.A05 = false;
        TypedArray typedArrayObtainStyledAttributes = this.A01.obtainStyledAttributes(null, FYT.A00, R.attr._name_removed__res_0x7f040007, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.A0A;
            if (!actionBarOverlayLayout2.A06) {
                throw C3cG.A0Q("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.A0H = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            this.A08.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public C8251FaW(Activity activity, boolean z) throws Resources.NotFoundException {
        this.A0L = activity;
        View viewA0a = AbstractC7607F5u.A0a(activity);
        A00(viewA0a);
        if (!z) {
            this.A03 = viewA0a.findViewById(android.R.id.content);
        }
    }
}
