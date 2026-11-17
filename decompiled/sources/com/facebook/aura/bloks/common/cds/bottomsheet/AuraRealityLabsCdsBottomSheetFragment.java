package com.facebook.aura.bloks.common.cds.bottomsheet;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BAG;
import X.BV6;
import X.C06H;
import X.C7384Etj;
import X.C7967FMy;
import X.C7993FOm;
import X.C7997FOq;
import X.C7998FOr;
import X.C8j3;
import X.EGb;
import X.F60;
import X.FBD;
import X.FNZ;
import X.FOE;
import X.FOH;
import X.FOS;
import X.FOV;
import X.FOX;
import X.FOY;
import X.FOl;
import X.FP2;
import X.FP3;
import X.FP4;
import X.FPI;
import X.FPL;
import X.FPN;
import X.FPQ;
import X.FSC;
import X.G0U;
import X.Hi4;
import X.HiG;
import X.Hky;
import X.HsN;
import X.InterfaceC10557Hsn;
import X.InterfaceC8010FPf;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.PathInterpolator;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.bloks.activity.CDSBloksConstants;
import com.facebook.aura.ccv.CcvBloksHelperKt;
import com.facebook.dsp.core.ColorData;
import com.meta.foa.cds.CdsOpenScreenCallerDismissCallback;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public abstract class AuraRealityLabsCdsBottomSheetFragment extends DialogFragment implements FOH {
    public static final String BUNDLE_KEY_REQUEST_DATA = "request_data";
    public static final Companion Companion = new Companion();
    public FOS bottomSheetDelegate;
    public C7967FMy delegateCdsBottomSheet;
    public FOY openScreenConfig;
    public final int hostId = -1;
    public final InterfaceC8010FPf dismissFullScreenCallback = new InterfaceC8010FPf() { // from class: com.facebook.aura.bloks.common.cds.bottomsheet.AuraRealityLabsCdsBottomSheetFragment$dismissFullScreenCallback$1
        @Override // X.InterfaceC8010FPf
        public final void onDismissFullScreen() {
            AuraRealityLabsCdsBottomSheetFragment.dismissFullScreen$default(this.this$0, false, 1, null);
        }
    };

    /* renamed from: com.facebook.aura.bloks.common.cds.bottomsheet.AuraRealityLabsCdsBottomSheetFragment$onCreate$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public AnonymousClass1() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AuraRealityLabsCdsBottomSheetFragment.this.dismissFullScreen(true);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.bloks.common.cds.bottomsheet.AuraRealityLabsCdsBottomSheetFragment$onCreate$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public AnonymousClass2() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AuraRealityLabsCdsBottomSheetFragment.dismissFullScreen$default(AuraRealityLabsCdsBottomSheetFragment.this, false, 1, null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public abstract FBD getBloksHost();

    public abstract int getHostId();

    public final void init(String str, FOY foy) {
        C7384Etj.A0Y(foy, 1);
        Bundle bundleA0N = BV6.A0N();
        bundleA0N.putString(BUNDLE_KEY_REQUEST_DATA, str);
        Bundle bundleA0N2 = BV6.A0N();
        FPN fpn = foy.A0J;
        bundleA0N2.putString("layout_config_type", fpn.getName());
        Bundle bundleAgu = fpn.Agu();
        if (bundleAgu != null) {
            bundleA0N2.putBundle("layout_config", bundleAgu);
        }
        bundleA0N2.putString("drag_to_dismiss", foy.A0I.value);
        bundleA0N2.putString("background_mode", foy.A0E.value);
        bundleA0N2.putString("dimmed_background_tap_to_dismiss", foy.A0H.value);
        HiG hiG = foy.A00;
        if (hiG != null) {
            bundleA0N2.putString("animation_type", String.valueOf(hiG));
        }
        HiG hiG2 = foy.A01;
        if (hiG2 != null) {
            bundleA0N2.putString("dismiss_animation_type", String.valueOf(hiG2));
        }
        CcvBloksHelperKt.AnonymousClass5 anonymousClass5 = foy.A06;
        if (anonymousClass5 != null) {
            bundleA0N2.putInt("native_custom_loading_view_resolver", Hi4.A00(anonymousClass5));
        }
        CdsOpenScreenCallerDismissCallback cdsOpenScreenCallerDismissCallback = foy.A02;
        if (cdsOpenScreenCallerDismissCallback != null) {
            bundleA0N2.putInt("on_dismiss_callback", Hi4.A00(cdsOpenScreenCallerDismissCallback));
        }
        bundleA0N2.putBoolean("native_use_slide_animation_for_full_screen", foy.A0W);
        bundleA0N2.putBoolean("disable_loading_screen_cancel_button", foy.A0T);
        bundleA0N2.putBoolean("should_clear_top_activity", foy.A0Z);
        bundleA0N2.putBoolean("activity_clear_task", foy.A0R);
        bundleA0N2.putParcelable("dimmed_background_color", foy.A08);
        bundleA0N2.putParcelable("background_overlay_color", foy.A07);
        bundleA0N2.putParcelable("bottom_sheet_margins", foy.A0F);
        bundleA0N2.putString("corner_style", foy.A0G.value);
        Float f = foy.A0M;
        if (f != null) {
            bundleA0N2.putFloat("corner_radius", f.floatValue());
        }
        bundleA0N2.setClassLoader(FOY.class.getClassLoader());
        String str2 = foy.A0Q;
        if (str2 != null) {
            bundleA0N2.putString(CDSBloksConstants.BLOKS_SCREEN_ID, str2);
        }
        bundleA0N2.putString("dark_mode", FPI.A00(foy.A0P));
        bundleA0N2.putParcelable("bottom_sheet_top_span", foy.A0D);
        bundleA0N2.putBoolean("slide_to_anchor_immediately", foy.A0b);
        bundleA0N2.putBoolean("render_behind_navbar", foy.A0Y);
        bundleA0N2.putBoolean("disable_fade_out_gradient_background", foy.A0S);
        bundleA0N2.putBoolean("remove_gradient_background", foy.A0X);
        bundleA0N2.putParcelable("dimming_behaviour", foy.A0C);
        bundleA0N2.putBoolean("skip_exit_animation", foy.A0a);
        bundleA0N2.putBoolean("hide_status_bar_background", foy.A05);
        bundleA0N2.putBoolean("draw_under_status_bar", foy.A04);
        bundleA0N2.putBoolean("keeps_host_orientation", foy.A0V);
        bundleA0N2.putString("keyboard_mode", foy.A0K.name());
        ColorData colorData = foy.A0A;
        if (colorData != null) {
            bundleA0N2.putParcelable("solid_background_color", colorData);
        }
        bundleA0N2.putBoolean("enable_full_screen_edge_to_edge", foy.A0U);
        ColorData colorData2 = foy.A09;
        if (colorData2 != null) {
            bundleA0N2.putParcelable("drag_handle_color", colorData2);
        }
        Float f2 = foy.A0O;
        if (f2 != null) {
            bundleA0N2.putFloat("drag_handle_top_bound_px", f2.floatValue());
        }
        Float f3 = foy.A0N;
        if (f3 != null) {
            bundleA0N2.putFloat("dismiss_friction", f3.floatValue());
        }
        Boolean bool = foy.A0L;
        if (bool != null) {
            bundleA0N2.putBoolean("drag_handle_hidden", bool.booleanValue());
        }
        bundleA0N2.putString("bottom_sheet_top_margins", foy.A0B.name());
        G0U<?, Boolean> g0u = foy.A03;
        if (g0u != null) {
            bundleA0N2.putInt("on_back_pressed", Hi4.A00(g0u));
        }
        bundleA0N.putBundle("foa_bottom_sheet_config", bundleA0N2);
        bundleA0N.putString("cds_platform", "Bloks");
        setArguments(bundleA0N);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.mCalled = true;
        FOS bottomSheetDelegate = getBottomSheetDelegate();
        C7384Etj.A0U(requireContext());
        Deque<FNZ> deque = bottomSheetDelegate.A0K;
        FNZ fnzPeek = deque.peek();
        Iterator<FNZ> it = deque.iterator();
        C7384Etj.A0U(it);
        while (it.hasNext()) {
            FNZ next = it.next();
            if (C7384Etj.areEqual(next, fnzPeek)) {
                next.A03.ATC(true);
            }
            next.A03.destroy();
        }
        deque.clear();
        bottomSheetDelegate.A09 = null;
    }

    public void onExit(Hky hky) {
        C7384Etj.A0Y(hky, 0);
        FOS bottomSheetDelegate = getBottomSheetDelegate();
        boolean zA1Z = AnonymousClass002.A1Z(hky, Hky.A02);
        bottomSheetDelegate.A0G = false;
        FNZ fnzPeek = bottomSheetDelegate.A0K.peek();
        if (fnzPeek != null) {
            fnzPeek.A03.ATC(zA1Z);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        C7384Etj.A0Y(bundle, 0);
        bundle.putBoolean("is_fullscreen", getBottomSheetDelegate().A0A.A0J instanceof FOE);
        super.onSaveInstanceState(bundle);
    }

    public void overrideDimmedBackgroundColor(ColorData colorData) {
        C7384Etj.A0Y(colorData, 0);
        FOS bottomSheetDelegate = getBottomSheetDelegate();
        C7384Etj.A0U(requireContext());
        FOV fov = bottomSheetDelegate.A04;
        if (fov != null) {
            InterfaceC10557Hsn interfaceC10557Hsn = bottomSheetDelegate.A0B;
            if (interfaceC10557Hsn == null) {
                C7384Etj.A0b("isDarkModeProvider");
                throw F60.createAndThrow();
            }
            int iA00 = InterfaceC10557Hsn.A00(colorData, interfaceC10557Hsn);
            fov.A03 = iA00;
            fov.A02 = Color.alpha(iA00);
        }
    }

    public final void setBottomSheetDelegate(FOS fos) {
        C7384Etj.A0Y(fos, 0);
        this.bottomSheetDelegate = fos;
    }

    public final void setDelegateCdsBottomSheet(C7967FMy c7967FMy) {
        C7384Etj.A0Y(c7967FMy, 0);
        this.delegateCdsBottomSheet = c7967FMy;
    }

    public final void setOpenScreenConfig(FOY foy) {
        C7384Etj.A0Y(foy, 0);
        this.openScreenConfig = foy;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ void dismissFullScreen$default(AuraRealityLabsCdsBottomSheetFragment auraRealityLabsCdsBottomSheetFragment, boolean z, int i, Object obj) {
        if (obj != null) {
            throw C8j3.A18("Super calls with default arguments not supported in this target, function: dismissFullScreen");
        }
        auraRealityLabsCdsBottomSheetFragment.dismissFullScreen(AnonymousClass001.A1P(i, z));
    }

    public final FOS getBottomSheetDelegate() {
        FOS fos = this.bottomSheetDelegate;
        if (fos != null) {
            return fos;
        }
        C7384Etj.A0b("bottomSheetDelegate");
        throw F60.createAndThrow();
    }

    public final C7967FMy getDelegateCdsBottomSheet() {
        C7967FMy c7967FMy = this.delegateCdsBottomSheet;
        if (c7967FMy != null) {
            return c7967FMy;
        }
        C7384Etj.A0b("delegateCdsBottomSheet");
        throw F60.createAndThrow();
    }

    public final FOY getOpenScreenConfig() {
        FOY foy = this.openScreenConfig;
        if (foy != null) {
            return foy;
        }
        C7384Etj.A0b("openScreenConfig");
        throw F60.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r48) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bloks.common.cds.bottomsheet.AuraRealityLabsCdsBottomSheetFragment.onCreate(android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissFullScreen(boolean z) {
        if (getParentFragmentManager().A0R() > 1 && !getParentFragmentManager().A0F && !z) {
            getParentFragmentManager().A0d();
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public FBD createBloksHost(HsN hsN) {
        return getBloksHost();
    }

    public C7967FMy getBottomSheet() {
        return getDelegateCdsBottomSheet();
    }

    public /* bridge */ C7967FMy getBottomSheetOrNull() {
        return getDelegateCdsBottomSheet();
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x023c  */
    @Override // androidx.fragment.app.DialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.app.Dialog onCreateDialog(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bloks.common.cds.bottomsheet.AuraRealityLabsCdsBottomSheetFragment.onCreateDialog(android.os.Bundle):android.app.Dialog");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        throw F60.createAndThrow();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ViewGroup headerContainer;
        Window windowA00;
        super.onDestroyView();
        FOS bottomSheetDelegate = getBottomSheetDelegate();
        Context contextRequireContext = requireContext();
        C7384Etj.A0U(contextRequireContext);
        Integer num = bottomSheetDelegate.A0D;
        if (num != null) {
            int iIntValue = num.intValue();
            Window windowA002 = FOS.A00(contextRequireContext, bottomSheetDelegate);
            if (windowA002 != null) {
                windowA002.setSoftInputMode(iIntValue);
            }
            bottomSheetDelegate.A0D = null;
        }
        if (bottomSheetDelegate.A0I && (windowA00 = FOS.A00(contextRequireContext, bottomSheetDelegate)) != null) {
            BAG.A01(windowA00, null, null, null, null, false);
        }
        AuraRealityLabsCdsBottomSheetFragment auraRealityLabsCdsBottomSheetFragment = bottomSheetDelegate.A09;
        if (auraRealityLabsCdsBottomSheetFragment != null) {
            auraRealityLabsCdsBottomSheetFragment.onOverlayingBottomSheetDragged(0.0f);
        }
        FOl fOl = bottomSheetDelegate.A03;
        if (fOl != null && (headerContainer = fOl.getHeaderContainer()) != null) {
            headerContainer.removeAllViews();
        }
        Deque<FNZ> deque = bottomSheetDelegate.A0K;
        Iterator<FNZ> it = deque.iterator();
        C7384Etj.A0U(it);
        while (it.hasNext()) {
            FNZ next = it.next();
            if (next.A00 != null) {
                if (next.equals(deque.peek())) {
                    next.A03.stop();
                }
                next.A03.ASB();
                next.A00 = null;
            }
        }
        C7993FOm c7993FOm = bottomSheetDelegate.A07;
        if (c7993FOm != null) {
            c7993FOm.A00 = null;
        }
        bottomSheetDelegate.A07 = null;
        C7997FOq c7997FOq = bottomSheetDelegate.A06;
        if (c7997FOq != null) {
            c7997FOq.A00 = null;
        }
        bottomSheetDelegate.A06 = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        FOS bottomSheetDelegate = getBottomSheetDelegate();
        CdsOpenScreenCallerDismissCallback cdsOpenScreenCallerDismissCallback = bottomSheetDelegate.A0A.A02;
        if (cdsOpenScreenCallerDismissCallback != null) {
            cdsOpenScreenCallerDismissCallback.A00.run(bottomSheetDelegate.A00);
        }
        bottomSheetDelegate.A0A.A02 = null;
        Runnable runnable = bottomSheetDelegate.A0E;
        if (runnable != null) {
            runnable.run();
        }
        bottomSheetDelegate.A04 = null;
        bottomSheetDelegate.A03 = null;
        List<FSC> list = bottomSheetDelegate.A0L;
        for (FSC fsc : list) {
            C7384Etj.A0Y(fsc, 0);
            FOX fox = bottomSheetDelegate.A08;
            if (fox != null) {
                fox.A0A.A0J.remove(fsc);
            }
            list.remove(fsc);
        }
        bottomSheetDelegate.A08 = null;
        bottomSheetDelegate.A0E = null;
        bottomSheetDelegate.A02 = null;
        bottomSheetDelegate.A0C = null;
    }

    public void onEnter() {
        FOS bottomSheetDelegate = getBottomSheetDelegate();
        Deque<FNZ> deque = bottomSheetDelegate.A0K;
        if (deque.isEmpty()) {
            bottomSheetDelegate.A0G = true;
            return;
        }
        FNZ fnzPeek = deque.peek();
        if (fnzPeek != null) {
            fnzPeek.A03.AT0();
        }
    }

    public void onOverlayingBottomSheetDragged(float f) {
        int iA05;
        FOV fov = getBottomSheetDelegate().A04;
        if (fov != null) {
            ColorDrawable colorDrawable = null;
            if (f > 0.0f && (iA05 = EGb.A05(fov.A03, (int) (fov.A02 * Math.min(f, 1.0f)))) != 0) {
                colorDrawable = new ColorDrawable(iA05);
            }
            fov.setForeground(colorDrawable);
        }
    }

    @Override // X.FOH
    public void onRenderSurface(int i) {
        Handler handler;
        Runnable fp3;
        FOS bottomSheetDelegate = getBottomSheetDelegate();
        if (i == 0) {
            FOV fov = bottomSheetDelegate.A04;
            if (fov != null) {
                C7993FOm c7993FOm = bottomSheetDelegate.A07;
                if (c7993FOm != null) {
                    c7993FOm.A02.post(new FP2(fov, c7993FOm));
                }
                bottomSheetDelegate.A0J = true;
                return;
            }
            return;
        }
        if (i == 5) {
            C7997FOq c7997FOq = bottomSheetDelegate.A06;
            FOV fov2 = bottomSheetDelegate.A04;
            if (c7997FOq == null || fov2 == null) {
                return;
            }
            C7993FOm c7993FOm2 = bottomSheetDelegate.A07;
            if (c7993FOm2 != null) {
                c7993FOm2.A02.post(new FPQ(c7993FOm2));
            }
            FOS.A05(bottomSheetDelegate, 8);
            handler = c7997FOq.A02;
            fp3 = new FP3(fov2, c7997FOq);
        } else {
            if (i != 6) {
                return;
            }
            FOS.A05(bottomSheetDelegate, 0);
            bottomSheetDelegate.A0J = false;
            C7993FOm c7993FOm3 = bottomSheetDelegate.A07;
            if (c7993FOm3 == null) {
                return;
            }
            handler = c7993FOm3.A02;
            fp3 = new FPQ(c7993FOm3);
        }
        handler.post(fp3);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        FOV fov;
        C7998FOr c7998FOr;
        super.onStart();
        FOS bottomSheetDelegate = getBottomSheetDelegate();
        FOY foy = bottomSheetDelegate.A0A;
        if (foy.A0S || foy.A0X || (fov = bottomSheetDelegate.A04) == null || !FP4.A00.supportXMDSThreeBackground() || fov.A05 != null || (c7998FOr = fov.A08) == null || c7998FOr.getAlpha() == 0.0f) {
            return;
        }
        if (c7998FOr.getVisibility() != 0 && c7998FOr.getAlpha() != 0.0f) {
            c7998FOr.setAlpha(0.0f);
            return;
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = c7998FOr.animate();
        viewPropertyAnimatorAnimate.setDuration(600L);
        viewPropertyAnimatorAnimate.setStartDelay(500L);
        viewPropertyAnimatorAnimate.setInterpolator(new PathInterpolator(0.0f, 0.0f, 1.0f, 1.0f));
        viewPropertyAnimatorAnimate.alpha(0.0f);
        viewPropertyAnimatorAnimate.withEndAction(new FPL(c7998FOr, fov));
        viewPropertyAnimatorAnimate.start();
        fov.A05 = viewPropertyAnimatorAnimate;
    }
}
