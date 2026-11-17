package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import com.facebook.aura.bloks.common.cds.bottomsheet.AuraRealityLabsCdsBottomSheetFragment;
import com.facebook.dsp.core.ColorData;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* loaded from: classes6.dex */
public final class FOS implements InterfaceC8013FPk {
    public int A00;
    public C8372Fcm A01;
    public InterfaceC8010FPf A02;
    public FOl A03;
    public FOV A04;
    public FOB A05;
    public C7997FOq A06;
    public C7993FOm A07;
    public FOX A08;
    public AuraRealityLabsCdsBottomSheetFragment A09;
    public FOY A0A;
    public InterfaceC10557Hsn A0B;
    public C8005FOz A0C;
    public Integer A0D;
    public Runnable A0E;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final List<FSC> A0N = C3cG.A0h();
    public final List<FSC> A0L = C3cG.A0h();
    public final Deque<FNZ> A0K = new ArrayDeque();
    public final List<FNZ> A0M = C3cG.A0h();
    public boolean A0F = !FLP.A00;

    /* JADX WARN: Removed duplicated region for block: B:21:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.widget.FrameLayout A0A(android.content.Context r25, X.InterfaceC8010FPf r26) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FOS.A0A(android.content.Context, X.FPf):android.widget.FrameLayout");
    }

    public final void A0B(Context context) {
        FOl fOl;
        Integer numA01;
        FOP fop;
        FNW fnw = FOF.A00;
        Deque<FNZ> deque = this.A0K;
        AbstractC7610F5x.A1T(deque);
        F0C<String> f0c = FNW.A00;
        String str = (String) C7384Etj.A0G(f0c);
        if (!str.equals("DEFAULT")) {
            throw AbstractC7610F5x.A0o(str);
        }
        FOl fOl2 = this.A03;
        if ((fOl2 == null || fOl2.getVisibility() != 0) && (fOl = this.A03) != null) {
            fOl.setVisibility(0);
        }
        FNZ fnzPeek = deque.peek();
        if (fnzPeek != null && (fop = fnzPeek.A01) != null && fop.ARu(fnzPeek.A03)) {
            numA01 = C79.A0K;
        } else if (deque.size() > 1) {
            A08(context, this, null, C79.A0C);
            numA01 = C79.A00;
        } else {
            numA01 = A01(this);
        }
        AbstractC7954FMk abstractC7954FMk = AbstractC7954FMk.$redex_init_class;
        numA01.intValue();
        String str2 = (String) C7384Etj.A0G(f0c);
        if (!str2.equals("DEFAULT")) {
            throw AbstractC7610F5x.A0o(str2);
        }
    }

    public static final Window A00(Context context, FOS fos) {
        Context context2;
        Window window;
        Activity activity;
        FNZ fnzPeek = fos.A0K.peek();
        if (fnzPeek != null) {
            context2 = fnzPeek.A03.getContext();
            window = null;
        } else {
            context2 = null;
            window = null;
        }
        FOX fox = fos.A08;
        if (fox != null) {
            return fox.getWindow();
        }
        if (context2 instanceof Activity) {
            activity = (Activity) context2;
        } else {
            if (!(context instanceof Activity)) {
                return window;
            }
            activity = (Activity) context;
        }
        return activity.getWindow();
    }

    public static final Integer A01(FOS fos) {
        InterfaceC8010FPf interfaceC8010FPf = fos.A02;
        if ((fos.A0A.A0J instanceof FOE) && interfaceC8010FPf != null) {
            interfaceC8010FPf.onDismissFullScreen();
            return C79.A0K;
        }
        FOX fox = fos.A08;
        if (fox == null) {
            return C79.A0C;
        }
        fox.dismiss();
        return C79.A01;
    }

    public static final void A02(Context context, FOS fos, C7964FMu c7964FMu, InterfaceC7992FOj interfaceC7992FOj, C7944FLz c7944FLz) {
        FOP fny;
        int i;
        if (fos.A03 == null) {
            throw C3cG.A0Q(C8472Feb.A00(1).toString());
        }
        fos.A07(interfaceC7992FOj);
        Deque<FNZ> deque = fos.A0K;
        deque.isEmpty();
        C7994FOn c7994FOn = c7964FMu.A05;
        FOY foyA00 = c7994FOn != null ? FOY.A00(null, null, null, null, fos.A0A, c7994FOn.A01, null, -2, false) : fos.A0A;
        C7963FMt c7963FMt = c7964FMu.A00;
        if (c7963FMt != null) {
            FOO foo = c7963FMt.A01;
            fny = foo != null ? new FNY(foo) : c7963FMt.A00;
        } else {
            fny = null;
        }
        FNZ fnz = new FNZ(interfaceC7992FOj, fny, foyA00);
        FNW fnw = FOF.A00;
        InterfaceC7992FOj interfaceC7992FOj2 = fnz.A03;
        interfaceC7992FOj2.ACO();
        fnw.A00();
        fnw.A03();
        deque.push(fnz);
        fnw.A03();
        View viewAE7 = interfaceC7992FOj.AE7(context);
        fnw.A03();
        fnz.A00 = viewAE7;
        HiG hiG = c7944FLz.A00;
        FOl fOl = fos.A03;
        if (fOl == null) {
            throw C3cG.A0Q("Cannot show Screen content without initializing the CDS bottom sheet. Please call onCreateDialog() and onCreateView().");
        }
        String strACt = interfaceC7992FOj.ACt();
        C7384Etj.A0Y(strACt, 0);
        C7747FCz c7747FCz = AbstractC7724FCa.A00;
        if (c7747FCz == null || !strACt.equals(c7747FCz.A03) || c7747FCz.A08) {
            FOT contentPager = fOl.getContentPager();
            Interpolator interpolator = FOT.A08;
            i = 1;
            C7384Etj.A0Y(viewAE7, 0);
            if (hiG == null) {
                hiG = HiG.A02;
            }
            FOT.A01(viewAE7, hiG, contentPager, true, true);
        } else {
            c7747FCz.A06.add(FZO.A02(fOl, 6));
            FOT contentPager2 = fOl.getContentPager();
            HiG hiG2 = HiG.A03;
            C7384Etj.A0Y(viewAE7, 0);
            i = 1;
            FOT.A01(viewAE7, hiG2, contentPager2, true, false);
        }
        fos.A04(interfaceC7992FOj.AGB());
        interfaceC7992FOj.AXK(fos.A0C);
        interfaceC7992FOj.AT0();
        fnw.A03();
        fos.A0C(context, c7964FMu);
        if (deque.size() == i && fos.A0G) {
            fos.A0G = false;
            interfaceC7992FOj2.AT0();
        }
        deque.size();
        FON fon = FON.$redex_init_class;
        fnw.A02();
    }

    public static final void A03(Context context, FOS fos, C7942FLo c7942FLo) {
        WindowManager.LayoutParams attributes;
        if (fos.A0D == null) {
            Window windowA00 = A00(context, fos);
            fos.A0D = (windowA00 == null || (attributes = windowA00.getAttributes()) == null) ? null : Integer.valueOf(attributes.softInputMode);
        }
        FOY foy = fos.A0A;
        EnumC7946FMb enumC7946FMb = c7942FLo.A00;
        fos.A0A = FOY.A00(null, null, null, null, foy, null, enumC7946FMb, -33554433, false);
        C8005FOz c8005FOz = fos.A0C;
        if (c8005FOz != null) {
            c8005FOz.setKeyboardMode(enumC7946FMb);
            Window windowA002 = A00(context, fos);
            if (windowA002 != null) {
                int iOrdinal = enumC7946FMb.ordinal();
                int i = 32;
                if (iOrdinal != 2) {
                    i = 48;
                    if (iOrdinal != 3 && Build.VERSION.SDK_INT <= 29) {
                        i = 16;
                    }
                }
                windowA002.setSoftInputMode(i);
            }
        }
    }

    private final void A04(View view) {
        ViewGroup headerContainer;
        FOl fOl = this.A03;
        if (fOl == null || (headerContainer = fOl.getHeaderContainer()) == null) {
            return;
        }
        headerContainer.removeAllViews();
        AbstractC7611F5y.A0h(view);
        headerContainer.addView(view);
    }

    public static final void A05(FOS fos, int i) {
        FPA fpa = new FPA(fos, i);
        if (C7384Etj.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            fpa.run();
        } else {
            ((Handler) AbstractC3084BxQ.A00.getValue()).post(fpa);
        }
    }

    public static final void A06(FOS fos, C8005FOz c8005FOz) {
        if (c8005FOz != null) {
            c8005FOz.A00 = 0;
            c8005FOz.setDecorFitsSystemWindow(false);
            FOY foy = fos.A0A;
            boolean z = foy.A0J instanceof FOE;
            boolean z2 = foy.A0U;
            if (z) {
                boolean zA1M = AnonymousClass002.A1M(z2 ? 1 : 0);
                c8005FOz.setAutomaticNavigationBarInsets(zA1M);
                if (zA1M && !fos.A0A.A04) {
                    z = true;
                }
            } else {
                c8005FOz.setAutomaticNavigationBarInsets(z2 ? false : true);
                z = !fos.A0A.A04;
            }
            c8005FOz.setAutomaticStatusBarInsets(z);
            fos.A0C = c8005FOz;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A07(X.InterfaceC7992FOj r9) {
        /*
            r8 = this;
            X.FNW r7 = X.FOF.A00
            r7.A03()
            java.util.Deque<X.FNZ> r0 = r8.A0K
            r0.peek()
            r7.A00()
            r7.A00()
            X.FOB r4 = r8.A05
            if (r4 == 0) goto L92
            X.FND r6 = r9.AIl()
            r0 = 0
            X.C7384Etj.A0Y(r6, r0)
            X.FND r0 = r4.A02
            java.lang.String r5 = "currentType"
            if (r0 != 0) goto L2a
            X.C7384Etj.A0b(r5)
        L25:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L2a:
            if (r0 == r6) goto L92
            r4.A02 = r6
            androidx.fragment.app.Fragment r0 = r4.A03
            X.Dfm r0 = r0.mLifecycleRegistry
            X.Huf r0 = r0.A01
            X.Huf r3 = X.EnumC10573Huf.A05
            boolean r0 = r0.A00(r3)
            java.lang.String r2 = "lifecycle"
            if (r0 == 0) goto L4b
            X.Dfm r1 = r4.A00
            if (r1 != 0) goto L46
            X.C7384Etj.A0b(r2)
            goto L25
        L46:
            X.Huf r0 = X.EnumC10573Huf.A06
            r1.A07(r0)
        L4b:
            java.util.Map r0 = r4.A04
            java.lang.Object r0 = r0.get(r6)
            X.HxE r0 = (X.HxE) r0
            if (r0 != 0) goto L59
            X.HxE r0 = X.FOB.A00(r4, r6)
        L59:
            A r1 = r0.first
            X.FOA r1 = (X.FOA) r1
            B r0 = r0.second
            X.FOD r0 = (X.FOD) r0
            X.Dfm r0 = r0.A00
            r4.A00 = r0
            r4.A01 = r1
            r7.A01()
            X.FND r0 = r4.A02
            if (r0 != 0) goto L72
            X.C7384Etj.A0b(r5)
            goto L25
        L72:
            X.F0C<java.lang.String> r0 = X.FNW.A00
            java.lang.Object r1 = X.C7384Etj.A0G(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "DEFAULT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L8a
            X.Dfm r0 = r4.A00
            if (r0 != 0) goto L8f
            X.C7384Etj.A0b(r2)
            goto L25
        L8a:
            java.lang.IllegalArgumentException r0 = X.AbstractC7610F5x.A0o(r1)
            throw r0
        L8f:
            r0.A07(r3)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FOS.A07(X.FOj):void");
    }

    public static final boolean A08(Context context, FOS fos, HiG hiG, Integer num) {
        HiG hiG2 = hiG;
        FNW fnw = FOF.A00;
        num.intValue();
        fnw.A00();
        if (!A09(fos)) {
            return false;
        }
        Deque<FNZ> deque = fos.A0K;
        FNZ fnzPop = deque.pop();
        fnw.A03();
        if (fos.A03 == null) {
            throw C3cG.A0Q(C8472Feb.A00(0).toString());
        }
        InterfaceC7992FOj interfaceC7992FOj = fnzPop.A03;
        interfaceC7992FOj.stop();
        interfaceC7992FOj.ATC(true);
        fos.A0M.add(fnzPop);
        FNZ fnzPeek = deque.peek();
        FOl fOl = fos.A03;
        if (fnzPeek == null) {
            throw C3cG.A0Q(C8472Feb.A00(2).toString());
        }
        if (fOl == null) {
            throw C3cG.A0Q(C8472Feb.A00(3).toString());
        }
        InterfaceC7992FOj interfaceC7992FOj2 = fnzPeek.A03;
        String strACt = interfaceC7992FOj2.ACt();
        C7384Etj.A0Y(strACt, 0);
        C7747FCz c7747FCz = AbstractC7724FCa.A01.get(strACt);
        if (c7747FCz == null || c7747FCz.A08) {
            c7747FCz = null;
        }
        if (c7747FCz == null) {
            FOY foy = fnzPeek.A02;
            FPN fpn = foy.A0J;
            EnumC7946FMb enumC7946FMb = foy.A0K;
            ColorData colorData = foy.A0A;
            Boolean boolValueOf = Boolean.valueOf(foy.A0U);
            EnumC7949FMf enumC7949FMf = foy.A0I;
            C7999FOs c7999FOs = colorData != null ? new C7999FOs(null, colorData) : null;
            fos.A0C(context, new C7964FMu(null, new C7941FLn(enumC7949FMf), c7999FOs, null, new C10464Hju(boolValueOf), new C7994FOn(null, fpn, null), new C7942FLo(enumC7946FMb)));
        }
        C7993FOm c7993FOm = fos.A07;
        if (c7993FOm != null) {
            c7993FOm.A02.post(new FPQ(c7993FOm));
        }
        C7997FOq c7997FOq = fos.A06;
        if (c7997FOq != null) {
            c7997FOq.A02.post(new RunnableC8001FOv(c7997FOq));
        }
        fos.A07(interfaceC7992FOj2);
        View viewAE7 = fnzPeek.A00;
        if (viewAE7 == null) {
            viewAE7 = interfaceC7992FOj2.AE7(context);
        }
        fnzPeek.A00 = viewAE7;
        if (c7747FCz != null) {
            c7747FCz.A06.add(FZO.A02(fOl, 7));
            FOT contentPager = fOl.getContentPager();
            HiG hiG3 = HiG.A03;
            C7384Etj.A0Y(viewAE7, 0);
            FOT.A01(viewAE7, hiG3, contentPager, false, false);
        } else {
            FOT contentPager2 = fOl.getContentPager();
            Interpolator interpolator = FOT.A08;
            C7384Etj.A0Y(viewAE7, 0);
            if (hiG2 == null) {
                hiG2 = HiG.A02;
            }
            FOT.A01(viewAE7, hiG2, contentPager2, false, true);
        }
        fos.A04(interfaceC7992FOj2.AGB());
        interfaceC7992FOj2.AXK(fos.A0C);
        interfaceC7992FOj2.AT0();
        fnw.A03();
        return true;
    }

    public static final boolean A09(FOS fos) {
        String str;
        Deque<FNZ> deque = fos.A0K;
        if (deque.isEmpty() || fos.A03 == null) {
            str = "Cannot pop from an empty bottom sheet.";
        } else {
            if (deque.size() != 1) {
                return true;
            }
            str = "Attempting to pop to the root screen in the CDS bottom sheet or full screen, so no pop action was performed. This is a no-op.";
        }
        FFI.A01(null, str, null);
        FNW fnw = FOF.A00;
        deque.size();
        String str2 = (String) C7384Etj.A0G(FNW.A00);
        if (str2.equals("DEFAULT")) {
            return false;
        }
        throw AbstractC7610F5x.A0o(str2);
    }

    public final void A0C(Context context, C7964FMu c7964FMu) {
        View view;
        FNZ fnzPeek = this.A0K.peek();
        if (fnzPeek != null && (view = fnzPeek.A00) != null) {
            FOW fow = new FOW(context, this, c7964FMu);
            if (view.isLaidOut()) {
                fow.run();
            } else {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC8002FOw(view, viewTreeObserver, fow));
            }
        }
        FOF.A00.A03();
    }

    public FOS(FOY foy) {
        this.A0A = foy;
    }
}
