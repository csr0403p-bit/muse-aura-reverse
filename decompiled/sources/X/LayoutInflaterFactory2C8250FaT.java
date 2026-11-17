package X;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.Window;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.acra.util.minidump.MinidumpReader;
import com.facebook.aura.shopping.repo.MarketplaceDetailsNormalizationKt;
import java.util.LinkedHashSet;
import java.util.Locale;

/* renamed from: X.FaT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class LayoutInflaterFactory2C8250FaT extends EC9 implements InterfaceC8322Fbo, LayoutInflater.Factory2 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Configuration A04;
    public Rect A05;
    public Rect A06;
    public MenuInflater A07;
    public ViewGroup A08;
    public Window A09;
    public PopupWindow A0A;
    public TextView A0B;
    public OnBackInvokedDispatcher A0C;
    public AbstractC8276Fb0 A0D;
    public C8259Faf A0E;
    public ECM A0F;
    public ECM A0G;
    public C8278Fb2 A0H;
    public C8275Faz A0I;
    public FX8 A0J;
    public AbstractC8280Fb4 A0K;
    public ActionBarContextView A0L;
    public InterfaceC8305FbX A0M;
    public CharSequence A0O;
    public Runnable A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public C8278Fb2[] A0f;
    public OnBackInvokedCallback A0g;
    public C8290FbE A0h;
    public boolean A0i;
    public boolean A0j;
    public final Context A0k;
    public final InterfaceC8351FcP A0l;
    public final Object A0m;
    public static final DQZ<String, Integer> A0p = new DQZ<>(0);
    public static final int[] A0q = {R.attr.windowBackground};
    public static final boolean A0o = !"robolectric".equals(Build.FINGERPRINT);
    public C8093FSz A0N = null;
    public boolean A0W = true;
    public final Runnable A0n = new RunnableC8304FbV(this);

    public static Configuration A05(Context context, Configuration configuration, C7528Ezc c7528Ezc, int i, boolean z) {
        int iA00 = i != 1 ? i != 2 ? z ? 0 : C60P.A00(context.getApplicationContext()) : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = iA00 | (configuration2.uiMode & (-49));
        if (c7528Ezc != null) {
            configuration2.setLocales(LocaleList.forLanguageTags(((F2l) c7528Ezc.A00).A00.toLanguageTags()));
        }
        return configuration2;
    }

    private final void A0Q() {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcherA00 = null;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.A0C;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.A0g) != null) {
            AbstractC8302FbS.A02(onBackInvokedDispatcher, onBackInvokedCallback);
            this.A0g = null;
        }
        Object obj = this.A0m;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                onBackInvokedDispatcherA00 = AbstractC8302FbS.A00(activity);
            }
        }
        this.A0C = onBackInvokedDispatcherA00;
        A0R();
    }

    @Override // X.EC9
    public final void A0L() throws PackageManager.NameNotFoundException {
        this.A0R = true;
        A0G(this, false, true);
        A0A();
        Object obj = this.A0m;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    if (AbstractC10459Hjh.A00(activity.getComponentName(), activity) != null) {
                        AbstractC8276Fb0 abstractC8276Fb0 = this.A0D;
                        if (abstractC8276Fb0 == null) {
                            this.A0j = true;
                        } else if (abstractC8276Fb0 instanceof C8251FaW) {
                            C8251FaW c8251FaW = (C8251FaW) abstractC8276Fb0;
                            if (!c8251FaW.A0E) {
                                c8251FaW.A06(true);
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
            }
            synchronized (EC9.A07) {
                EC9.A03(this);
                EC9.A06.add(BV4.A0q(this));
            }
        }
        this.A04 = new Configuration(C8j3.A0Z(this.A0k));
        this.A0S = true;
    }

    public final void A0S(int i) {
        C8278Fb2 c8278Fb2A0P = A0P(i);
        if (c8278Fb2A0P.A0A != null) {
            Bundle bundleA0N = BV6.A0N();
            c8278Fb2A0P.A0A.A0A(bundleA0N);
            if (bundleA0N.size() > 0) {
                c8278Fb2A0P.A05 = bundleA0N;
            }
            C8249FaR c8249FaR = c8278Fb2A0P.A0A;
            c8249FaR.A07();
            c8249FaR.clear();
        }
        c8278Fb2A0P.A0F = true;
        c8278Fb2A0P.A0E = true;
        if ((i == 108 || i == 0) && this.A0M != null) {
            C8278Fb2 c8278Fb2A0P2 = A0P(0);
            c8278Fb2A0P2.A0D = false;
            A0H(null, c8278Fb2A0P2, this);
        }
    }

    public static final int A00(Context context, LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT, int i) {
        ECM ecmA06;
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw C3cG.A0Q("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        ecmA06 = layoutInflaterFactory2C8250FaT.A0F;
                        if (ecmA06 == null) {
                            ecmA06 = new DBW(context, layoutInflaterFactory2C8250FaT);
                            layoutInflaterFactory2C8250FaT.A0F = ecmA06;
                        }
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    ecmA06 = layoutInflaterFactory2C8250FaT.A06(context);
                }
                return ecmA06.A00();
            }
            return i;
        }
        return -1;
    }

    private ECM A06(Context context) {
        ECM ecm = this.A0G;
        if (ecm != null) {
            return ecm;
        }
        DBY dby = DBY.A03;
        if (dby == null) {
            Context applicationContext = context.getApplicationContext();
            dby = new DBY(applicationContext, (LocationManager) applicationContext.getSystemService(MarketplaceDetailsNormalizationKt.LOCATION_VARIANT_LABEL));
            DBY.A03 = dby;
        }
        DBV dbv = new DBV(this, dby);
        this.A0G = dbv;
        return dbv;
    }

    public static ActionMenuView A07(LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) layoutInflaterFactory2C8250FaT.A0M;
        ActionBarOverlayLayout.A01(actionBarOverlayLayout);
        return ((C8254Faa) actionBarOverlayLayout.A03).A09.A0A;
    }

    public static final C7528Ezc A08(Context context) {
        C7528Ezc c7528Ezc;
        C7528Ezc c7528Ezc2 = null;
        if (Build.VERSION.SDK_INT < 33 && (c7528Ezc = EC9.A02) != null) {
            C7528Ezc c7528EzcA09 = A09(C8j3.A0Z(context.getApplicationContext()));
            if (((F2l) c7528Ezc.A00).A00.isEmpty()) {
                c7528Ezc2 = C7528Ezc.A01;
            } else {
                LinkedHashSet linkedHashSetA0k = C3cG.A0k();
                int i = 0;
                while (i < c7528Ezc.A01() + c7528EzcA09.A01()) {
                    Locale localeA02 = i < c7528Ezc.A01() ? c7528Ezc.A02(i) : c7528EzcA09.A02(i - c7528Ezc.A01());
                    if (localeA02 != null) {
                        linkedHashSetA0k.add(localeA02);
                    }
                    i++;
                }
                c7528Ezc2 = new C7528Ezc(new F2l(new LocaleList((Locale[]) linkedHashSetA0k.toArray(new Locale[linkedHashSetA0k.size()]))));
            }
            if (((F2l) c7528Ezc2.A00).A00.isEmpty()) {
                return c7528EzcA09;
            }
        }
        return c7528Ezc2;
    }

    private void A0A() {
        if (this.A09 == null) {
            Object obj = this.A0m;
            if (obj instanceof Activity) {
                A0D(((Activity) obj).getWindow());
            }
        }
        if (this.A09 == null) {
            throw C3cG.A0Q("We have not been given a Window");
        }
    }

    private void A0B() {
        if (this.A0d) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0112, code lost:
    
        if (r0.getCount() > 0) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0C(android.view.KeyEvent r16, X.C8278Fb2 r17) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LayoutInflaterFactory2C8250FaT.A0C(android.view.KeyEvent, X.Fb2):void");
    }

    private void A0D(Window window) {
        if (this.A09 != null) {
            throw C3cG.A0Q("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof C8259Faf) {
            throw C3cG.A0Q("AppCompat has already installed itself into the Window");
        }
        C8259Faf c8259Faf = new C8259Faf(callback, this);
        this.A0E = c8259Faf;
        window.setCallback(c8259Faf);
        Context context = this.A0k;
        C8140FWd c8140FWd = new C8140FWd(context, context.obtainStyledAttributes((AttributeSet) null, A0q));
        Drawable drawableA03 = c8140FWd.A03(0);
        if (drawableA03 != null) {
            window.setBackgroundDrawable(drawableA03);
        }
        c8140FWd.A02.recycle();
        this.A09 = window;
        if (Build.VERSION.SDK_INT < 33 || this.A0C != null) {
            return;
        }
        A0Q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (r6 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0E(X.LayoutInflaterFactory2C8250FaT r10) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LayoutInflaterFactory2C8250FaT.A0E(X.FaT):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0G(X.LayoutInflaterFactory2C8250FaT r13, boolean r14, boolean r15) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LayoutInflaterFactory2C8250FaT.A0G(X.FaT, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00db A[PHI: r7
  0x00db: PHI (r7v1 X.FaR) = (r7v0 X.FaR), (r7v9 X.FaR) binds: [B:29:0x0051, B:53:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0H(android.view.KeyEvent r11, X.C8278Fb2 r12, X.LayoutInflaterFactory2C8250FaT r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LayoutInflaterFactory2C8250FaT.A0H(android.view.KeyEvent, X.Fb2, X.FaT):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b7  */
    @Override // X.EC9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC8280Fb4 A0I(X.InterfaceC8306FbY r11) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LayoutInflaterFactory2C8250FaT.A0I(X.FbY):X.Fb4");
    }

    @Override // X.EC9
    public final void A0J() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.A0k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C8250FaT) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // X.EC9
    public final void A0K() {
        if (this.A0D != null) {
            A0F(this);
            AbstractC8276Fb0 abstractC8276Fb0 = this.A0D;
            if (abstractC8276Fb0 instanceof C8256Fac) {
                C8256Fac c8256Fac = (C8256Fac) abstractC8276Fb0;
                Toolbar toolbar = ((C8254Faa) c8256Fac.A06).A09;
                Runnable runnable = c8256Fac.A07;
                toolbar.removeCallbacks(runnable);
                toolbar.postOnAnimation(runnable);
                return;
            }
            this.A01 = (1 << 0) | this.A01;
            if (this.A0Y) {
                return;
            }
            this.A09.getDecorView().postOnAnimation(this.A0n);
            this.A0Y = true;
        }
    }

    @Override // X.EC9
    public final void A0M() {
        Object obj = this.A0m;
        boolean z = obj instanceof Activity;
        if (z) {
            synchronized (EC9.A07) {
                EC9.A03(this);
            }
        }
        if (this.A0Y) {
            this.A09.getDecorView().removeCallbacks(this.A0n);
        }
        this.A0T = true;
        int i = this.A02;
        if (i != -100 && z && ((Activity) obj).isChangingConfigurations()) {
            A0p.put(C60Q.A0e(obj), Integer.valueOf(i));
        } else {
            A0p.remove(C60Q.A0e(obj));
        }
        AbstractC8276Fb0 abstractC8276Fb0 = this.A0D;
        if (abstractC8276Fb0 != null && (abstractC8276Fb0 instanceof C8256Fac)) {
            C8256Fac c8256Fac = (C8256Fac) abstractC8276Fb0;
            ((C8254Faa) c8256Fac.A06).A09.removeCallbacks(c8256Fac.A07);
        }
        ECM ecm = this.A0G;
        if (ecm != null) {
            ecm.A01();
        }
        ECM ecm2 = this.A0F;
        if (ecm2 != null) {
            ecm2.A01();
        }
    }

    @Override // X.EC9
    public final void A0N(CharSequence charSequence) {
        this.A0O = charSequence;
        InterfaceC8305FbX interfaceC8305FbX = this.A0M;
        if (interfaceC8305FbX != null) {
            interfaceC8305FbX.setWindowTitle(charSequence);
            return;
        }
        AbstractC8276Fb0 abstractC8276Fb0 = this.A0D;
        if (abstractC8276Fb0 != null) {
            (abstractC8276Fb0 instanceof C8251FaW ? ((C8251FaW) abstractC8276Fb0).A0B : ((C8256Fac) abstractC8276Fb0).A06).setWindowTitle(charSequence);
            return;
        }
        TextView textView = this.A0B;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // X.EC9
    public final boolean A0O(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = MinidumpReader.MODULE_FULL_SIZE;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.A0e && i == 108) {
            return false;
        }
        if (this.A0X && i == 1) {
            this.A0X = false;
        } else if (i != 1) {
            if (i == 2) {
                A0B();
                this.A0V = true;
                return true;
            }
            if (i == 5) {
                A0B();
                this.A0U = true;
                return true;
            }
            if (i == 10) {
                A0B();
                this.A0c = true;
                return true;
            }
            if (i == 108) {
                A0B();
                this.A0X = true;
                return true;
            }
            if (i != 109) {
                return this.A09.requestFeature(i);
            }
            A0B();
            this.A0b = true;
            return true;
        }
        A0B();
        this.A0e = true;
        return true;
    }

    public final C8278Fb2 A0P(int i) {
        C8278Fb2[] c8278Fb2Arr = this.A0f;
        if (c8278Fb2Arr == null || c8278Fb2Arr.length <= i) {
            C8278Fb2[] c8278Fb2Arr2 = new C8278Fb2[i + 1];
            if (c8278Fb2Arr != null) {
                System.arraycopy(c8278Fb2Arr, 0, c8278Fb2Arr2, 0, c8278Fb2Arr.length);
            }
            this.A0f = c8278Fb2Arr2;
            c8278Fb2Arr = c8278Fb2Arr2;
        }
        C8278Fb2 c8278Fb2 = c8278Fb2Arr[i];
        if (c8278Fb2 != null) {
            return c8278Fb2;
        }
        C8278Fb2 c8278Fb22 = new C8278Fb2();
        c8278Fb22.A01 = i;
        c8278Fb22.A0E = false;
        c8278Fb2Arr[i] = c8278Fb22;
        return c8278Fb22;
    }

    public final void A0R() {
        C8321Fbn c8321FbnA01;
        if (Build.VERSION.SDK_INT >= 33) {
            if (this.A0C == null || (!A0P(0).A0C && this.A0K == null)) {
                OnBackInvokedCallback onBackInvokedCallback = this.A0g;
                if (onBackInvokedCallback == null) {
                    return;
                }
                AbstractC8302FbS.A02(this.A0C, onBackInvokedCallback);
                c8321FbnA01 = null;
            } else if (this.A0g != null) {
                return;
            } else {
                c8321FbnA01 = AbstractC8302FbS.A01(this, this.A0C);
            }
            this.A0g = c8321FbnA01;
        }
    }

    public final void A0T(Menu menu, C8278Fb2 c8278Fb2, int i) {
        if (menu == null) {
            menu = c8278Fb2.A0A;
        }
        if (!c8278Fb2.A0C || this.A0T) {
            return;
        }
        C8259Faf c8259Faf = this.A0E;
        Window.Callback callback = this.A09.getCallback();
        try {
            c8259Faf.A03 = true;
            callback.onPanelClosed(i, menu);
        } finally {
            c8259Faf.A03 = false;
        }
    }

    public final void A0U(C8278Fb2 c8278Fb2, boolean z) {
        ViewGroup viewGroup;
        InterfaceC8305FbX interfaceC8305FbX;
        if (z && c8278Fb2.A01 == 0 && (interfaceC8305FbX = this.A0M) != null && interfaceC8305FbX.AOr()) {
            A0V(c8278Fb2.A0A);
            return;
        }
        ViewManager viewManager = (ViewManager) this.A0k.getSystemService("window");
        if (viewManager != null && c8278Fb2.A0C && (viewGroup = c8278Fb2.A08) != null) {
            viewManager.removeView(viewGroup);
            if (z) {
                A0T(null, c8278Fb2, c8278Fb2.A01);
            }
        }
        c8278Fb2.A0D = false;
        c8278Fb2.A0B = false;
        c8278Fb2.A0C = false;
        c8278Fb2.A07 = null;
        c8278Fb2.A0E = true;
        if (this.A0H == c8278Fb2) {
            this.A0H = null;
        }
        if (c8278Fb2.A01 == 0) {
            A0R();
        }
    }

    public final void A0V(C8249FaR c8249FaR) {
        C8243FaJ c8243FaJ;
        if (this.A0i) {
            return;
        }
        this.A0i = true;
        ActionMenuView actionMenuViewA07 = A07(this);
        if (actionMenuViewA07 != null && (c8243FaJ = actionMenuViewA07.A04) != null) {
            c8243FaJ.A01();
        }
        Window.Callback callback = this.A09.getCallback();
        if (callback != null && !this.A0T) {
            callback.onPanelClosed(MinidumpReader.MODULE_FULL_SIZE, c8249FaR);
        }
        this.A0i = false;
    }

    public final boolean A0W() {
        InterfaceC8333Fc0 interfaceC8333Fc0;
        C8252FaX c8252FaX;
        boolean z = this.A0a;
        this.A0a = false;
        C8278Fb2 c8278Fb2A0P = A0P(0);
        if (c8278Fb2A0P.A0C) {
            if (!z) {
                A0U(c8278Fb2A0P, true);
            }
            return true;
        }
        AbstractC8280Fb4 abstractC8280Fb4 = this.A0K;
        if (abstractC8280Fb4 != null) {
            abstractC8280Fb4.A00();
            return true;
        }
        A0F(this);
        AbstractC8276Fb0 abstractC8276Fb0 = this.A0D;
        if (abstractC8276Fb0 != null) {
            if (abstractC8276Fb0 instanceof C8251FaW) {
                interfaceC8333Fc0 = ((C8251FaW) abstractC8276Fb0).A0B;
                if (interfaceC8333Fc0 != null) {
                }
            } else {
                interfaceC8333Fc0 = ((C8256Fac) abstractC8276Fb0).A06;
            }
            C8257Fad c8257Fad = ((C8254Faa) interfaceC8333Fc0).A09.A0C;
            if (c8257Fad != null && (c8252FaX = c8257Fad.A01) != null) {
                c8252FaX.collapseActionView();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a9, code lost:
    
        if (r1 != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e4, code lost:
    
        if (A0H(r7, r4, r6) != false) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0X(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LayoutInflaterFactory2C8250FaT.A0X(android.view.KeyEvent):boolean");
    }

    @Override // X.InterfaceC8322Fbo
    public final boolean AU9(MenuItem menuItem, C8249FaR c8249FaR) {
        Window.Callback callback = this.A09.getCallback();
        if (callback == null || this.A0T) {
            return false;
        }
        C8249FaR c8249FaRA03 = c8249FaR.A03();
        C8278Fb2[] c8278Fb2Arr = this.A0f;
        if (c8278Fb2Arr == null) {
            return false;
        }
        for (C8278Fb2 c8278Fb2 : c8278Fb2Arr) {
            if (c8278Fb2 != null && c8278Fb2.A0A == c8249FaRA03) {
                return callback.onMenuItemSelected(c8278Fb2.A01, menuItem);
            }
        }
        return false;
    }

    @Override // X.InterfaceC8322Fbo
    public final void AUA(C8249FaR c8249FaR) {
        ActionMenuView actionMenuView;
        C8243FaJ c8243FaJ;
        C8243FaJ c8243FaJ2;
        ActionMenuView actionMenuViewA07;
        C8243FaJ c8243FaJ3;
        InterfaceC8305FbX interfaceC8305FbX = this.A0M;
        if (interfaceC8305FbX != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC8305FbX;
            ActionBarOverlayLayout.A01(actionBarOverlayLayout);
            Toolbar toolbar = ((C8254Faa) actionBarOverlayLayout.A03).A09;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.A0A) != null && actionMenuView.A06 && (!ViewConfiguration.get(this.A0k).hasPermanentMenuKey() || ((actionMenuViewA07 = A07(this)) != null && (c8243FaJ3 = actionMenuViewA07.A04) != null && (c8243FaJ3.A0B != null || c8243FaJ3.A03())))) {
                Window.Callback callback = this.A09.getCallback();
                if (this.A0M.AOr()) {
                    ActionMenuView actionMenuViewA072 = A07(this);
                    if (actionMenuViewA072 != null && (c8243FaJ2 = actionMenuViewA072.A04) != null) {
                        c8243FaJ2.A02();
                    }
                    if (this.A0T) {
                        return;
                    }
                    callback.onPanelClosed(MinidumpReader.MODULE_FULL_SIZE, A0P(0).A0A);
                    return;
                }
                if (callback == null || this.A0T) {
                    return;
                }
                if (this.A0Y && (this.A01 & 1) != 0) {
                    View decorView = this.A09.getDecorView();
                    Runnable runnable = this.A0n;
                    decorView.removeCallbacks(runnable);
                    runnable.run();
                }
                C8278Fb2 c8278Fb2A0P = A0P(0);
                C8249FaR c8249FaR2 = c8278Fb2A0P.A0A;
                if (c8249FaR2 == null || c8278Fb2A0P.A0F || !callback.onPreparePanel(0, c8278Fb2A0P.A06, c8249FaR2)) {
                    return;
                }
                callback.onMenuOpened(MinidumpReader.MODULE_FULL_SIZE, c8278Fb2A0P.A0A);
                ActionMenuView actionMenuViewA073 = A07(this);
                if (actionMenuViewA073 == null || (c8243FaJ = actionMenuViewA073.A04) == null) {
                    return;
                }
                c8243FaJ.A04();
                return;
            }
        }
        C8278Fb2 c8278Fb2A0P2 = A0P(0);
        c8278Fb2A0P2.A0E = true;
        A0U(c8278Fb2A0P2, false);
        A0C(null, c8278Fb2A0P2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.FXi] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [X.FXn] */
    /* JADX WARN: Type inference failed for: r3v13, types: [X.FZY] */
    /* JADX WARN: Type inference failed for: r3v14, types: [X.FWW] */
    /* JADX WARN: Type inference failed for: r3v15, types: [X.FXt] */
    /* JADX WARN: Type inference failed for: r3v16, types: [X.FXh] */
    /* JADX WARN: Type inference failed for: r3v17, types: [X.FXh, android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r3v18, types: [X.FXk] */
    /* JADX WARN: Type inference failed for: r3v19, types: [X.FXl] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.material.button.MaterialButton] */
    /* JADX WARN: Type inference failed for: r3v20, types: [X.FWY] */
    /* JADX WARN: Type inference failed for: r3v21, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v22, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.FXg] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.FXm] */
    /* JADX WARN: Type inference failed for: r3v6, types: [X.FXj] */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.FYK] */
    /* JADX WARN: Type inference failed for: r3v8, types: [X.FXu] */
    /* JADX WARN: Type inference failed for: r3v9, types: [X.FXq] */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r8, java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LayoutInflaterFactory2C8250FaT.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public LayoutInflaterFactory2C8250FaT(Context context, Window window, InterfaceC8351FcP interfaceC8351FcP, Object obj) {
        DQZ<String, Integer> dqz;
        String strA0e;
        Integer num;
        this.A02 = -100;
        this.A0k = context;
        this.A0l = interfaceC8351FcP;
        this.A0m = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AppCompatActivity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        AppCompatActivity appCompatActivity = (AppCompatActivity) context;
                        if (appCompatActivity != null) {
                            this.A02 = ((LayoutInflaterFactory2C8250FaT) appCompatActivity.getDelegate()).A02;
                        }
                    }
                } else {
                    break;
                }
            }
        }
        if (this.A02 == -100 && (num = (dqz = A0p).get((strA0e = C60Q.A0e(obj)))) != null) {
            this.A02 = num.intValue();
            dqz.remove(strA0e);
        }
        if (window != null) {
            A0D(window);
        }
        C8139FWc.A01();
    }

    public static C7528Ezc A09(Configuration configuration) {
        return C7528Ezc.A00(configuration.getLocales().toLanguageTags());
    }

    public static void A0F(LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT) {
        C8251FaW c8251FaW;
        A0E(layoutInflaterFactory2C8250FaT);
        if (layoutInflaterFactory2C8250FaT.A0X && layoutInflaterFactory2C8250FaT.A0D == null) {
            Object obj = layoutInflaterFactory2C8250FaT.A0m;
            if (obj instanceof Activity) {
                c8251FaW = new C8251FaW((Activity) obj, layoutInflaterFactory2C8250FaT.A0b);
            } else if (!(obj instanceof Dialog)) {
                return;
            } else {
                c8251FaW = new C8251FaW((Dialog) obj);
            }
            layoutInflaterFactory2C8250FaT.A0D = c8251FaW;
            boolean z = layoutInflaterFactory2C8250FaT.A0j;
            if (c8251FaW.A0E) {
                return;
            }
            c8251FaW.A06(z);
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
