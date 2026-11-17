package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.BackStackRecordState;
import androidx.fragment.app.BackStackState;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager$LaunchedFragmentInfo;
import androidx.fragment.app.FragmentManagerState;
import androidx.fragment.app.FragmentState;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import com.facebook.aura.R;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.FgQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8571FgQ {
    public C2186B9f A01;
    public HwU<String[]> A02;
    public HwU<Intent> A03;
    public HwU<IntentSenderRequest> A04;
    public Fragment A06;
    public Fragment A07;
    public AbstractC8330Fbx A08;
    public AbstractC8595Fgx<?> A09;
    public C8574FgV A0A;
    public boolean A0F;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public ArrayList<Fragment> A0N;
    public ArrayList<Fragment> A0O;
    public ArrayList<Boolean> A0P;
    public ArrayList<C8573FgU> A0Q;
    public boolean mExecutingActions;
    public final ArrayList<InterfaceC8038FQp> A0V = C3cG.A0h();
    public final C8575FgX A0U = new C8575FgX();
    public ArrayList<C8573FgU> A0D = C3cG.A0h();
    public final LayoutInflaterFactory2C8517FfO A0S = new LayoutInflaterFactory2C8517FfO(this);
    public C8573FgU A05 = null;
    public boolean A0G = false;
    public final AbstractC2185B9e A0R = new C8562FgG(this);
    public final AtomicInteger A0Y = new AtomicInteger();
    public final Map<String, BackStackState> A0W = BV5.A14();
    public final Map<String, Bundle> A0f = BV5.A14();
    public final Map A0e = BV5.A14();
    public ArrayList<InterfaceC8627Fhb> A0E = C3cG.A0h();
    public final C8584Fgj A0T = new C8584Fgj(this);
    public final CopyOnWriteArrayList<InterfaceC8626Fha> A0X = new CopyOnWriteArrayList<>();
    public final BeM<Configuration> A0Z = new C10637I0h(this, 5);
    public final BeM<Integer> A0c = new C10637I0h(this, 6);
    public final BeM<C8622FhS> A0a = new C10637I0h(this, 7);
    public final BeM<HqA> A0b = new C10637I0h(this, 8);
    public final InterfaceC8348FcM A0d = new C8421Fde(this);
    public int A00 = -1;
    public C8518FfP A0L = new C8518FfP(this);
    public InterfaceC8561FgE A0M = new C8608FhD(this);
    public ArrayDeque<FragmentManager$LaunchedFragmentInfo> A0C = new ArrayDeque<>();
    public Runnable A0B = new RunnableC8607FhC(this);

    public static Fragment A01(View view) {
        Fragment fragment;
        while (view != null) {
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            if ((tag instanceof Fragment) && (fragment = (Fragment) tag) != null) {
                return fragment;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private void A05() {
        this.mExecutingActions = false;
        this.A0P.clear();
        this.A0Q.clear();
    }

    public static void A0C(AbstractC8571FgQ abstractC8571FgQ) {
        abstractC8571FgQ.A0J = false;
        abstractC8571FgQ.A0K = false;
        abstractC8571FgQ.A0A.A01 = false;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.AbstractCollection, java.util.HashSet] */
    public static void A0G(AbstractC8571FgQ abstractC8571FgQ, int i) {
        try {
            abstractC8571FgQ.mExecutingActions = true;
            Iterator itA0x = BV5.A0x(abstractC8571FgQ.A0U.A02);
            while (itA0x.hasNext()) {
                C8572FgR c8572FgR = (C8572FgR) itA0x.next();
                if (c8572FgR != null) {
                    c8572FgR.A00 = i;
                }
            }
            abstractC8571FgQ.A07(i, false);
            Iterator it = abstractC8571FgQ.A02().iterator();
            while (it.hasNext()) {
                ((AbstractC8541Ffu) it.next()).A09();
            }
            abstractC8571FgQ.mExecutingActions = false;
            abstractC8571FgQ.A0s(true);
        } catch (Throwable th) {
            abstractC8571FgQ.mExecutingActions = false;
            throw th;
        }
    }

    public static boolean A0L() {
        return A0N(2);
    }

    public static boolean A0M() {
        return A0N(3);
    }

    public static boolean A0Q(AbstractC8571FgQ abstractC8571FgQ, int i, int i2) {
        abstractC8571FgQ.A0s(false);
        abstractC8571FgQ.A0K(true);
        Fragment fragment = abstractC8571FgQ.A07;
        if (fragment != null && i < 0 && A0Q(fragment.getChildFragmentManager(), -1, 0)) {
            return true;
        }
        ArrayList<C8573FgU> arrayList = abstractC8571FgQ.A0Q;
        ArrayList<Boolean> arrayList2 = abstractC8571FgQ.A0P;
        boolean zA0x = abstractC8571FgQ.A0x(null, arrayList, arrayList2, i, i2);
        if (zA0x) {
            abstractC8571FgQ.mExecutingActions = true;
            try {
                abstractC8571FgQ.A0I(arrayList, arrayList2);
            } finally {
                abstractC8571FgQ.A05();
            }
        }
        A0F(abstractC8571FgQ);
        if (abstractC8571FgQ.A0H) {
            abstractC8571FgQ.A0H = false;
            abstractC8571FgQ.A06();
        }
        abstractC8571FgQ.A0U.A02.values().removeAll(Collections.singleton(null));
        return zA0x;
    }

    private final void A0g(Fragment fragment) {
        if (A0N(2)) {
            Log.v("FragmentManager", AnonymousClass007.A0a("attach: ", fragment));
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.A0U.A04(fragment);
            if (A0N(2)) {
                Log.v("FragmentManager", AnonymousClass007.A0a("add from attach: ", fragment));
            }
            if (A0O(fragment)) {
                this.A0I = true;
            }
        }
    }

    private final void A0h(Fragment fragment) {
        if (A0N(2)) {
            Log.v("FragmentManager", AnonymousClass007.A0a("detach: ", fragment));
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (A0N(2)) {
                Log.v("FragmentManager", AnonymousClass007.A0a("remove from detach: ", fragment));
            }
            ArrayList<Fragment> arrayList = this.A0U.A01;
            synchronized (arrayList) {
                arrayList.remove(fragment);
            }
            fragment.mAdded = false;
            if (A0O(fragment)) {
                this.A0I = true;
            }
            A08(fragment);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0a() {
        /*
            r5 = this;
            r0 = 1
            r5.A0F = r0
            r5.A0s(r0)
            A0D(r5)
            X.Fgx<?> r1 = r5.A09
            boolean r0 = r1 instanceof X.BOD
            if (r0 == 0) goto L42
            X.FgX r0 = r5.A0U
            X.FgV r0 = r0.A00
            boolean r0 = r0.A00
        L15:
            if (r0 == 0) goto L51
        L17:
            java.util.Map<java.lang.String, androidx.fragment.app.BackStackState> r0 = r5.A0W
            java.util.Iterator r4 = X.BV5.A10(r0)
        L1d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L51
            java.lang.Object r0 = r4.next()
            androidx.fragment.app.BackStackState r0 = (androidx.fragment.app.BackStackState) r0
            java.util.List<java.lang.String> r0 = r0.A00
            java.util.Iterator r3 = r0.iterator()
        L2f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            java.lang.String r2 = X.AnonymousClass005.A0j(r3)
            X.FgX r0 = r5.A0U
            X.FgV r1 = r0.A00
            r0 = 0
            r1.A06(r2, r0)
            goto L2f
        L42:
            android.content.Context r1 = r1.A01
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L17
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r1.isChangingConfigurations()
            r0 = r0 ^ 1
            goto L15
        L51:
            r0 = -1
            A0G(r5, r0)
            X.Fgx<?> r1 = r5.A09
            boolean r0 = r1 instanceof X.InterfaceC8615FhK
            if (r0 == 0) goto L62
            X.FhK r1 = (X.InterfaceC8615FhK) r1
            X.BeM<java.lang.Integer> r0 = r5.A0c
            r1.removeOnTrimMemoryListener(r0)
        L62:
            X.Fgx<?> r1 = r5.A09
            boolean r0 = r1 instanceof X.Hr3
            if (r0 == 0) goto L6f
            X.Hr3 r1 = (X.Hr3) r1
            X.BeM<android.content.res.Configuration> r0 = r5.A0Z
            r1.removeOnConfigurationChangedListener(r0)
        L6f:
            X.Fgx<?> r1 = r5.A09
            boolean r0 = r1 instanceof X.InterfaceC8617FhM
            if (r0 == 0) goto L7c
            X.FhM r1 = (X.InterfaceC8617FhM) r1
            X.BeM<X.FhS> r0 = r5.A0a
            r1.removeOnMultiWindowModeChangedListener(r0)
        L7c:
            X.Fgx<?> r1 = r5.A09
            boolean r0 = r1 instanceof X.InterfaceC8616FhL
            if (r0 == 0) goto L89
            X.FhL r1 = (X.InterfaceC8616FhL) r1
            X.BeM<X.HqA> r0 = r5.A0b
            r1.removeOnPictureInPictureModeChangedListener(r0)
        L89:
            X.Fgx<?> r1 = r5.A09
            boolean r0 = r1 instanceof X.InterfaceC8620FhQ
            if (r0 == 0) goto L9a
            androidx.fragment.app.Fragment r0 = r5.A06
            if (r0 != 0) goto L9a
            X.FhQ r1 = (X.InterfaceC8620FhQ) r1
            X.FcM r0 = r5.A0d
            r1.removeMenuProvider(r0)
        L9a:
            r1 = 0
            r5.A09 = r1
            r5.A08 = r1
            r5.A06 = r1
            X.B9f r0 = r5.A01
            if (r0 == 0) goto Lac
            X.B9e r0 = r5.A0R
            r0.A01()
            r5.A01 = r1
        Lac:
            X.HwU<android.content.Intent> r0 = r5.A03
            if (r0 == 0) goto Lbd
            r0.A00()
            X.HwU<androidx.activity.result.IntentSenderRequest> r0 = r5.A04
            r0.A00()
            X.HwU<java.lang.String[]> r0 = r5.A02
            r0.A00()
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC8571FgQ.A0a():void");
    }

    public final void A0d() {
        A0p(new FNH(this, null, -1, 0), false);
    }

    public final boolean A0w(Fragment fragment) {
        if (fragment != null) {
            AbstractC8571FgQ abstractC8571FgQ = fragment.mFragmentManager;
            if (!fragment.equals(abstractC8571FgQ.A07) || !A0w(abstractC8571FgQ.A06)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/ArrayList<LX/FgU;>;Ljava/util/ArrayList<Ljava/lang/Boolean;>;Ljava/lang/String;II)Z */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0x(java.lang.String r8, java.util.ArrayList r9, java.util.ArrayList r10, int r11, int r12) {
        /*
            r7 = this;
            r3 = 1
            r0 = r12 & 1
            r6 = 0
            boolean r2 = X.AnonymousClass002.A1L(r0)
            java.util.ArrayList<X.FgU> r5 = r7.A0D
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L7e
            if (r8 != 0) goto L30
            if (r11 >= 0) goto L30
            if (r2 == 0) goto L76
            r4 = 0
        L17:
            java.util.ArrayList<X.FgU> r2 = r7.A0D
            int r1 = X.AbstractC7607F5u.A0I(r2, r3)
        L1d:
            if (r1 < r4) goto L7d
            java.lang.Object r0 = r2.remove(r1)
            r9.add(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r10.add(r0)
            int r1 = r1 + (-1)
            goto L1d
        L30:
            int r4 = r5.size()
        L34:
            int r4 = r4 + (-1)
            if (r4 < 0) goto L7e
            java.lang.Object r1 = r5.get(r4)
            X.FgU r1 = (X.C8573FgU) r1
            if (r8 == 0) goto L53
            java.lang.String r0 = r1.A09
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L53
        L48:
            if (r2 != 0) goto L5a
            int r0 = X.C8j3.A0K(r5)
            if (r4 == r0) goto L7e
            int r4 = r4 + 1
            goto L7a
        L53:
            if (r11 < 0) goto L34
            int r0 = r1.A00
            if (r11 != r0) goto L34
            goto L48
        L5a:
            if (r4 <= 0) goto L7a
            int r2 = r4 + (-1)
            java.lang.Object r1 = r5.get(r2)
            X.FgU r1 = (X.C8573FgU) r1
            if (r8 == 0) goto L6e
            java.lang.String r0 = r1.A09
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L74
        L6e:
            if (r11 < 0) goto L17
            int r0 = r1.A00
            if (r11 != r0) goto L17
        L74:
            r4 = r2
            goto L5a
        L76:
            int r4 = X.C8j3.A0K(r5)
        L7a:
            if (r4 >= 0) goto L17
            return r6
        L7d:
            return r3
        L7e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC8571FgQ.A0x(java.lang.String, java.util.ArrayList, java.util.ArrayList, int, int):boolean");
    }

    private ViewGroup A00(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId <= 0 || !this.A08.A02()) {
            return null;
        }
        View viewA01 = this.A08.A01(fragment.mContainerId);
        if (viewA01 instanceof ViewGroup) {
            return (ViewGroup) viewA01;
        }
        return null;
    }

    public static Iterator A04(AbstractC8571FgQ abstractC8571FgQ) {
        return abstractC8571FgQ.A0U.A03().iterator();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    private void A06() {
        Iterator it = this.A0U.A02().iterator();
        while (it.hasNext()) {
            C8572FgR c8572FgR = (C8572FgR) it.next();
            Fragment fragment = c8572FgR.A02;
            if (fragment.mDeferStart) {
                if (this.mExecutingActions) {
                    this.A0H = true;
                } else {
                    fragment.mDeferStart = false;
                    c8572FgR.A04();
                }
            }
        }
    }

    private final void A07(int i, boolean z) {
        AbstractC8595Fgx<?> abstractC8595Fgx;
        if (this.A09 == null && i != -1) {
            throw C3cG.A0Q("No activity");
        }
        if (z || i != this.A00) {
            this.A00 = i;
            C8575FgX c8575FgX = this.A0U;
            Iterator<Fragment> it = c8575FgX.A01.iterator();
            while (it.hasNext()) {
                C8572FgR c8572FgR = c8575FgX.A02.get(it.next().mWho);
                if (c8572FgR != null) {
                    c8572FgR.A04();
                }
            }
            Iterator itA0x = BV5.A0x(c8575FgX.A02);
            while (itA0x.hasNext()) {
                C8572FgR c8572FgR2 = (C8572FgR) itA0x.next();
                if (c8572FgR2 != null) {
                    c8572FgR2.A04();
                    Fragment fragment = c8572FgR2.A02;
                    if (fragment.mRemoving && !AnonymousClass002.A1N(fragment.mBackStackNesting)) {
                        if (fragment.mBeingSaved) {
                            HashMap<String, Bundle> map = c8575FgX.A03;
                            if (!map.containsKey(fragment.mWho)) {
                                map.put(fragment.mWho, c8572FgR2.A01());
                            }
                        }
                        c8575FgX.A06(c8572FgR2);
                    }
                }
            }
            A06();
            if (this.A0I && (abstractC8595Fgx = this.A09) != null && this.A00 == 7) {
                ((C8576FgZ) abstractC8595Fgx).A00.invalidateOptionsMenu();
                this.A0I = false;
            }
        }
    }

    public static void A0A(Fragment fragment, AbstractC8571FgQ abstractC8571FgQ) {
        if (fragment != null) {
            if (fragment.equals(abstractC8571FgQ.A0U.A00(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public static void A0B(Fragment fragment, C8598Fh0 c8598Fh0) {
        fragment.setAnimations(c8598Fh0.A01, c8598Fh0.A02, c8598Fh0.A03, c8598Fh0.A04);
    }

    public static void A0F(AbstractC8571FgQ abstractC8571FgQ) {
        ArrayList<InterfaceC8038FQp> arrayList = abstractC8571FgQ.A0V;
        synchronized (arrayList) {
            if (!arrayList.isEmpty()) {
                abstractC8571FgQ.A0R.A02(true);
                if (A0N(3)) {
                    Log.d("FragmentManager", AnonymousClass001.A0v(" enabling OnBackPressedCallback, caused by non-empty pending actions", C3cG.A0f(abstractC8571FgQ, "FragmentManager ")));
                }
            } else {
                boolean z = abstractC8571FgQ.A0R() > 0 && abstractC8571FgQ.A0w(abstractC8571FgQ.A06);
                if (A0N(3)) {
                    Log.d("FragmentManager", C60P.A1P(" enabled state is ", C3cG.A0f(abstractC8571FgQ, "OnBackPressedCallback for FragmentManager "), z));
                }
                abstractC8571FgQ.A0R.A02(z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0256 A[PHI: r1
  0x0256: PHI (r1v25 int) = (r1v23 int), (r1v26 int) binds: [B:89:0x01d8, B:94:0x01e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015b  */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.AbstractCollection, java.util.HashSet] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0J(java.util.ArrayList<X.C8573FgU> r23, java.util.ArrayList<java.lang.Boolean> r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 1138
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC8571FgQ.A0J(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    private void A0K(boolean z) {
        if (this.mExecutingActions) {
            throw C3cG.A0Q("FragmentManager is already executing transactions");
        }
        if (this.A09 == null) {
            if (!this.A0F) {
                throw C3cG.A0Q("FragmentManager has not been attached to a host.");
            }
            throw C3cG.A0Q("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.A09.A02.getLooper()) {
            throw C3cG.A0Q("Must be called from main thread of fragment host");
        }
        if (!z && (this.A0J || this.A0K)) {
            throw C3cG.A0Q("Can not perform this action after onSaveInstanceState");
        }
        if (this.A0Q == null) {
            this.A0Q = C3cG.A0h();
            this.A0P = C3cG.A0h();
        }
    }

    public static boolean A0N(int i) {
        return AnonymousClass002.A1L(Log.isLoggable("FragmentManager", i) ? 1 : 0);
    }

    public static boolean A0O(Fragment fragment) {
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        C8575FgX c8575FgX = fragment.mChildFragmentManager.A0U;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator itA0x = BV5.A0x(c8575FgX.A02);
        while (itA0x.hasNext()) {
            C8572FgR c8572FgR = (C8572FgR) itA0x.next();
            arrayListA0h.add(c8572FgR != null ? c8572FgR.A02 : null);
        }
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            Fragment fragment2 = (Fragment) it.next();
            if (fragment2 != null && A0O(fragment2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0P(AbstractC8571FgQ abstractC8571FgQ) {
        Fragment fragment = abstractC8571FgQ.A06;
        return fragment == null || (fragment.isAdded() && A0P(fragment.getParentFragmentManager()));
    }

    private final void A0k(Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.A0U.A00(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                throw BV5.A0P(this, " is not an active fragment of FragmentManager ", AbstractC7609F5w.A0u(fragment));
            }
        }
        Fragment fragment2 = this.A07;
        this.A07 = fragment;
        A0A(fragment2, this);
        A0A(this.A07, this);
    }

    private final void A0m(Fragment fragment, EnumC10573Huf enumC10573Huf) {
        if (!fragment.equals(this.A0U.A00(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
            throw BV5.A0P(this, " is not an active fragment of FragmentManager ", AbstractC7609F5w.A0u(fragment));
        }
        fragment.mMaxState = enumC10573Huf;
    }

    public final int A0R() {
        return this.A0D.size() + (AnonymousClass002.A1X(this.A05) ? 1 : 0);
    }

    public final Fragment A0T(int i) {
        C8575FgX c8575FgX = this.A0U;
        ArrayList<Fragment> arrayList = c8575FgX.A01;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                Iterator itA0x = BV5.A0x(c8575FgX.A02);
                while (itA0x.hasNext()) {
                    C8572FgR c8572FgR = (C8572FgR) itA0x.next();
                    if (c8572FgR != null) {
                        Fragment fragment = c8572FgR.A02;
                        if (fragment.mFragmentId == i) {
                            return fragment;
                        }
                    }
                }
                return null;
            }
            Fragment fragment2 = arrayList.get(size);
            if (fragment2 != null && fragment2.mFragmentId == i) {
                return fragment2;
            }
        }
    }

    public final Fragment A0U(String str) {
        C8575FgX c8575FgX = this.A0U;
        ArrayList<Fragment> arrayList = c8575FgX.A01;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                Iterator itA0x = BV5.A0x(c8575FgX.A02);
                while (itA0x.hasNext()) {
                    C8572FgR c8572FgR = (C8572FgR) itA0x.next();
                    if (c8572FgR != null) {
                        Fragment fragment = c8572FgR.A02;
                        if (str.equals(fragment.mTag)) {
                            return fragment;
                        }
                    }
                }
                return null;
            }
            Fragment fragment2 = arrayList.get(size);
            if (fragment2 != null && str.equals(fragment2.mTag)) {
                return fragment2;
            }
        }
    }

    public final C8518FfP A0V() {
        Fragment fragment = this.A06;
        return fragment != null ? fragment.mFragmentManager.A0V() : this.A0L;
    }

    public final C8572FgR A0W(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            Hi5 hi5 = AbstractC8519FfS.A00;
            FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, str);
            AbstractC8519FfS.A02(fragmentReuseViolation);
            Hi5 hi5A00 = AbstractC8519FfS.A00(fragment);
            AbstractC7611F5y.A0k(hi5A00, fragmentReuseViolation, EnumC8520FfT.DETECT_FRAGMENT_REUSE, fragment, hi5A00.A01);
        }
        if (A0L()) {
            AbstractC7607F5u.A1N(AnonymousClass007.A0a("add: ", fragment));
        }
        C8572FgR c8572FgRA0X = A0X(fragment);
        fragment.mFragmentManager = this;
        C8575FgX c8575FgX = this.A0U;
        c8575FgX.A05(c8572FgRA0X);
        if (!fragment.mDetached) {
            c8575FgX.A04(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (A0O(fragment)) {
                this.A0I = true;
            }
        }
        return c8572FgRA0X;
    }

    public final C8572FgR A0X(Fragment fragment) {
        C8575FgX c8575FgX = this.A0U;
        C8572FgR c8572FgR = c8575FgX.A02.get(fragment.mWho);
        if (c8572FgR != null) {
            return c8572FgR;
        }
        C8572FgR c8572FgR2 = new C8572FgR(fragment, this.A0T, c8575FgX);
        c8572FgR2.A05(this.A09.A01.getClassLoader());
        c8572FgR2.A00 = this.A00;
        return c8572FgR2;
    }

    public final InterfaceC8561FgE A0Y() {
        Fragment fragment = this.A06;
        return fragment != null ? fragment.mFragmentManager.A0Y() : this.A0M;
    }

    public final void A0b() {
        C8575FgX c8575FgX = this.A0U;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator itA0x = BV5.A0x(c8575FgX.A02);
        while (itA0x.hasNext()) {
            C8572FgR c8572FgR = (C8572FgR) itA0x.next();
            arrayListA0h.add(c8572FgR != null ? c8572FgR.A02 : null);
        }
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                fragment.mChildFragmentManager.A0b();
            }
        }
    }

    public final void A0c() {
        if (this.A09 != null) {
            A0C(this);
            Iterator itA04 = A04(this);
            while (itA04.hasNext()) {
                Fragment fragment = (Fragment) itA04.next();
                if (fragment != null) {
                    fragment.noteStateNotSaved();
                }
            }
        }
    }

    public final void A0e(Parcelable parcelable) throws IOException {
        C8572FgR c8572FgR;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        Iterator<String> it = bundle3.keySet().iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            if (strA0j.startsWith("result_") && (bundle2 = bundle3.getBundle(strA0j)) != null) {
                bundle2.setClassLoader(this.A09.A01.getClassLoader());
                this.A0f.put(strA0j.substring(7), bundle2);
            }
        }
        HashMap mapA0u = BV4.A0u();
        Iterator<String> it2 = bundle3.keySet().iterator();
        while (it2.hasNext()) {
            String strA0j2 = AnonymousClass005.A0j(it2);
            if (strA0j2.startsWith("fragment_") && (bundle = bundle3.getBundle(strA0j2)) != null) {
                bundle.setClassLoader(this.A09.A01.getClassLoader());
                mapA0u.put(strA0j2.substring(9), bundle);
            }
        }
        C8575FgX c8575FgX = this.A0U;
        HashMap<String, Bundle> map = c8575FgX.A03;
        map.clear();
        map.putAll(mapA0u);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState != null) {
            HashMap<String, C8572FgR> map2 = c8575FgX.A02;
            map2.clear();
            Iterator<String> it3 = fragmentManagerState.A02.iterator();
            while (it3.hasNext()) {
                Bundle bundleRemove = map.remove(it3.next());
                if (bundleRemove != null) {
                    FragmentState fragmentState = (FragmentState) bundleRemove.getParcelable("state");
                    Fragment fragment = this.A0A.A03.get(fragmentState.mWho);
                    if (fragment != null) {
                        if (A0N(2)) {
                            Log.v("FragmentManager", AnonymousClass007.A0a("restoreSaveState: re-attaching retained ", fragment));
                        }
                        c8572FgR = new C8572FgR(bundleRemove, fragment, this.A0T, c8575FgX);
                    } else {
                        c8572FgR = new C8572FgR(bundleRemove, this.A0T, A0V(), c8575FgX, this.A09.A01.getClassLoader());
                    }
                    Fragment fragment2 = c8572FgR.A02;
                    fragment2.mSavedFragmentState = bundleRemove;
                    fragment2.mFragmentManager = this;
                    if (A0N(2)) {
                        StringBuilder sbA0x = C60O.A0x("restoreSaveState: active (");
                        sbA0x.append(fragment2.mWho);
                        AbstractC7610F5x.A1M(fragment2, "): ", sbA0x);
                    }
                    c8572FgR.A05(this.A09.A01.getClassLoader());
                    c8575FgX.A05(c8572FgR);
                    c8572FgR.A00 = this.A00;
                }
            }
            Iterator itA0z = BV5.A0z(this.A0A.A03.values());
            while (itA0z.hasNext()) {
                Fragment fragment3 = (Fragment) itA0z.next();
                if (map2.get(fragment3.mWho) == null) {
                    if (A0N(2)) {
                        StringBuilder sbA0f = C3cG.A0f(fragment3, "Discarding retained Fragment ");
                        sbA0f.append(" that was not found in the set of active Fragments ");
                        Log.v("FragmentManager", C8j3.A14(fragmentManagerState.A02, sbA0f));
                    }
                    this.A0A.A05(fragment3);
                    fragment3.mFragmentManager = this;
                    C8572FgR c8572FgR2 = new C8572FgR(fragment3, this.A0T, c8575FgX);
                    c8572FgR2.A00 = 1;
                    c8572FgR2.A04();
                    fragment3.mRemoving = true;
                    c8572FgR2.A04();
                }
            }
            ArrayList<String> arrayList = fragmentManagerState.A03;
            c8575FgX.A01.clear();
            if (arrayList != null) {
                Iterator<String> it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    String strA0j3 = AnonymousClass005.A0j(it4);
                    Fragment fragmentA00 = c8575FgX.A00(strA0j3);
                    if (fragmentA00 == null) {
                        throw BV5.A0V("No instantiated fragment for (", strA0j3, ")");
                    }
                    if (A0N(2)) {
                        AbstractC7610F5x.A1M(fragmentA00, "): ", C3cI.A0x("restoreSaveState: added (", strA0j3));
                    }
                    c8575FgX.A04(fragmentA00);
                }
            }
            BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.A07;
            if (backStackRecordStateArr != null) {
                this.A0D = C60O.A11(backStackRecordStateArr.length);
                int i = 0;
                while (true) {
                    BackStackRecordState[] backStackRecordStateArr2 = fragmentManagerState.A07;
                    if (i >= backStackRecordStateArr2.length) {
                        break;
                    }
                    BackStackRecordState backStackRecordState = backStackRecordStateArr2[i];
                    C8573FgU c8573FgU = new C8573FgU(this);
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        int[] iArr = backStackRecordState.A0D;
                        boolean z = true;
                        if (i2 >= iArr.length) {
                            break;
                        }
                        C8598Fh0 c8598Fh0 = new C8598Fh0();
                        int i4 = i2 + 1;
                        c8598Fh0.A00 = iArr[i2];
                        if (A0N(2)) {
                            StringBuilder sbA0f2 = C3cG.A0f(c8573FgU, "Instantiate ");
                            sbA0f2.append(" op #");
                            sbA0f2.append(i3);
                            sbA0f2.append(" base fragment #");
                            Log.v("FragmentManager", BV4.A0l(sbA0f2, iArr[i4]));
                        }
                        c8598Fh0.A07 = EnumC10573Huf.values()[backStackRecordState.A0C[i3]];
                        c8598Fh0.A06 = EnumC10573Huf.values()[backStackRecordState.A0B[i3]];
                        int i5 = i2 + 2;
                        if (iArr[i4] == 0) {
                            z = false;
                        }
                        c8598Fh0.A08 = z;
                        int i6 = iArr[i5];
                        c8598Fh0.A01 = i6;
                        int i7 = iArr[i2 + 3];
                        c8598Fh0.A02 = i7;
                        int i8 = i2 + 5;
                        int i9 = iArr[i2 + 4];
                        c8598Fh0.A03 = i9;
                        i2 += 6;
                        int i10 = iArr[i8];
                        c8598Fh0.A04 = i10;
                        ((FgY) c8573FgU).A02 = i6;
                        c8573FgU.A03 = i7;
                        c8573FgU.A04 = i9;
                        c8573FgU.A05 = i10;
                        c8573FgU.A02(c8598Fh0);
                        i3++;
                    }
                    c8573FgU.A06 = backStackRecordState.A03;
                    c8573FgU.A09 = backStackRecordState.A06;
                    c8573FgU.A0E = true;
                    ((FgY) c8573FgU).A01 = backStackRecordState.A01;
                    c8573FgU.A08 = backStackRecordState.A05;
                    ((FgY) c8573FgU).A00 = backStackRecordState.A00;
                    c8573FgU.A07 = backStackRecordState.A04;
                    c8573FgU.A0C = backStackRecordState.A08;
                    c8573FgU.A0D = backStackRecordState.A09;
                    c8573FgU.A0G = backStackRecordState.A0A;
                    c8573FgU.A00 = backStackRecordState.A02;
                    int i11 = 0;
                    while (true) {
                        ArrayList<String> arrayList2 = backStackRecordState.A07;
                        if (i11 >= arrayList2.size()) {
                            break;
                        }
                        String str = arrayList2.get(i11);
                        if (str != null) {
                            c8573FgU.A0B.get(i11).A05 = c8575FgX.A00(str);
                        }
                        i11++;
                    }
                    c8573FgU.A05(1);
                    if (A0N(2)) {
                        StringBuilder sbA0y = C60O.A0y("restoreAllState: back stack #", i);
                        sbA0y.append(" (index ");
                        sbA0y.append(c8573FgU.A00);
                        AbstractC7610F5x.A1M(c8573FgU, "): ", sbA0y);
                        PrintWriter printWriter = new PrintWriter(new HlN());
                        c8573FgU.A07(printWriter, "  ", false);
                        printWriter.close();
                    }
                    this.A0D.add(c8573FgU);
                    i++;
                }
            } else {
                this.A0D = C3cG.A0h();
            }
            this.A0Y.set(fragmentManagerState.A00);
            String str2 = fragmentManagerState.A01;
            if (str2 != null) {
                Fragment fragmentA002 = c8575FgX.A00(str2);
                this.A07 = fragmentA002;
                A0A(fragmentA002, this);
            }
            ArrayList<String> arrayList3 = fragmentManagerState.A04;
            if (arrayList3 != null) {
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    this.A0W.put(arrayList3.get(i12), fragmentManagerState.A05.get(i12));
                }
            }
            this.A0C = new ArrayDeque<>(fragmentManagerState.A06);
        }
    }

    public final void A0f(Menu menu) {
        if (this.A00 >= 1) {
            Iterator itA04 = A04(this);
            while (itA04.hasNext()) {
                Fragment fragment = (Fragment) itA04.next();
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Fgx<*>;LX/Fbx;Landroidx/fragment/app/Fragment;)V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0l(androidx.fragment.app.Fragment r7, X.AbstractC8330Fbx r8, X.AbstractC8595Fgx r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC8571FgQ.A0l(androidx.fragment.app.Fragment, X.Fbx, X.Fgx):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        r3.remove(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0o(X.AbstractC8601Fh5 r4) {
        /*
            r3 = this;
            X.Fgj r0 = r3.A0T
            java.util.concurrent.CopyOnWriteArrayList<X.FRB> r3 = r0.A00
            monitor-enter(r3)
            int r2 = r3.size()     // Catch: java.lang.Throwable -> L1f
            r1 = 0
        La:
            if (r1 >= r2) goto L1d
            java.lang.Object r0 = r3.get(r1)     // Catch: java.lang.Throwable -> L1f
            X.FRB r0 = (X.FRB) r0     // Catch: java.lang.Throwable -> L1f
            X.Fh5 r0 = r0.A00     // Catch: java.lang.Throwable -> L1f
            if (r0 != r4) goto L1a
            r3.remove(r1)     // Catch: java.lang.Throwable -> L1f
            goto L1d
        L1a:
            int r1 = r1 + 1
            goto La
        L1d:
            monitor-exit(r3)
            return
        L1f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC8571FgQ.A0o(X.Fh5):void");
    }

    public final void A0p(InterfaceC8038FQp interfaceC8038FQp, boolean z) {
        if (!z) {
            if (this.A09 == null) {
                if (!this.A0F) {
                    throw C3cG.A0Q("FragmentManager has not been attached to a host.");
                }
                throw C3cG.A0Q("FragmentManager has been destroyed");
            }
            if (this.A0J || this.A0K) {
                throw C3cG.A0Q("Can not perform this action after onSaveInstanceState");
            }
        }
        ArrayList<InterfaceC8038FQp> arrayList = this.A0V;
        synchronized (arrayList) {
            if (this.A09 != null) {
                arrayList.add(interfaceC8038FQp);
                try {
                    if (arrayList.size() == 1) {
                        Handler handler = this.A09.A02;
                        Runnable runnable = this.A0B;
                        handler.removeCallbacks(runnable);
                        this.A09.A02.post(runnable);
                        A0F(this);
                    }
                } catch (Throwable th) {
                }
            } else if (!z) {
                throw C3cG.A0Q("Activity has been destroyed");
            }
        }
    }

    public final void A0q(InterfaceC8038FQp interfaceC8038FQp, boolean z) {
        if (z && (this.A09 == null || this.A0F)) {
            return;
        }
        A0K(z);
        C8573FgU c8573FgU = this.A05;
        boolean z2 = false;
        if (c8573FgU != null) {
            c8573FgU.A01 = false;
            c8573FgU.A04();
            if (A0M()) {
                StringBuilder sbA0x = C60O.A0x("Reversing mTransitioningOp ");
                sbA0x.append(this.A05);
                AbstractC7607F5u.A1O(AnonymousClass006.A0y(interfaceC8038FQp, " as part of execSingleAction for action ", sbA0x));
            }
            this.A05.A03(false, false);
            boolean zABs = this.A05.ABs(this.A0Q, this.A0P);
            Iterator<C8598Fh0> it = this.A05.A0B.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().A05;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.A05 = null;
            z2 = zABs;
        }
        boolean zABs2 = interfaceC8038FQp.ABs(this.A0Q, this.A0P);
        if (z2 || zABs2) {
            this.mExecutingActions = true;
            try {
                A0I(this.A0Q, this.A0P);
            } finally {
                A05();
            }
        }
        A0F(this);
        if (this.A0H) {
            this.A0H = false;
            A06();
        }
        this.A0U.A02.values().removeAll(Collections.singleton(null));
    }

    public final void A0r(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strA0M = FGI.A0M(str, "    ");
        C8575FgX c8575FgX = this.A0U;
        String strA0M2 = FGI.A0M(str, "    ");
        HashMap<String, C8572FgR> map = c8575FgX.A02;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            Iterator itA0x = BV5.A0x(map);
            while (itA0x.hasNext()) {
                C8572FgR c8572FgR = (C8572FgR) itA0x.next();
                printWriter.print(str);
                if (c8572FgR != null) {
                    Fragment fragment = c8572FgR.A02;
                    printWriter.println(fragment);
                    fragment.dump(strA0M2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println(HatchCcvLoggingKt.NO_POSTAL_FIELD);
                }
            }
        }
        ArrayList<Fragment> arrayList = c8575FgX.A01;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            int i = 0;
            do {
                Fragment fragment2 = arrayList.get(i);
                A0H(printWriter, str, i);
                printWriter.println(fragment2.toString());
                i++;
            } while (i < size2);
        }
        ArrayList<Fragment> arrayList2 = this.A0N;
        int i2 = 0;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            int i3 = 0;
            do {
                Fragment fragment3 = this.A0N.get(i3);
                A0H(printWriter, str, i3);
                printWriter.println(fragment3.toString());
                i3++;
            } while (i3 < size);
        }
        int size3 = this.A0D.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            int i4 = 0;
            do {
                C8573FgU c8573FgU = this.A0D.get(i4);
                A0H(printWriter, str, i4);
                printWriter.println(c8573FgU.toString());
                c8573FgU.A07(printWriter, strA0M, true);
                i4++;
            } while (i4 < size3);
        }
        printWriter.print(str);
        printWriter.println(FGI.A0H("Back Stack Index: ", this.A0Y.get()));
        ArrayList<InterfaceC8038FQp> arrayList3 = this.A0V;
        synchronized (arrayList3) {
            int size4 = arrayList3.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                do {
                    Object obj = (InterfaceC8038FQp) arrayList3.get(i2);
                    A0H(printWriter, str, i2);
                    printWriter.println(obj);
                    i2++;
                } while (i2 < size4);
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.A09);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.A08);
        if (this.A06 != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.A06);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.A00);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.A0J);
        printWriter.print(" mStopped=");
        printWriter.print(this.A0K);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.A0F);
        if (this.A0I) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.A0I);
        }
    }

    public final boolean A0t(Menu menu) {
        boolean z = false;
        if (this.A00 >= 1) {
            Iterator itA04 = A04(this);
            while (itA04.hasNext()) {
                Fragment fragment = (Fragment) itA04.next();
                if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final boolean A0u(Menu menu, MenuInflater menuInflater) {
        int i = 0;
        if (this.A00 < 1) {
            return false;
        }
        Iterator itA04 = A04(this);
        ArrayList<Fragment> arrayListA0x = null;
        boolean z = false;
        while (itA04.hasNext()) {
            Fragment fragment = (Fragment) itA04.next();
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                arrayListA0x = AbstractC7609F5w.A0x(arrayListA0x);
                arrayListA0x.add(fragment);
                z = true;
            }
        }
        if (this.A0N != null) {
            while (true) {
                ArrayList<Fragment> arrayList = this.A0N;
                if (i >= arrayList.size()) {
                    break;
                }
                Fragment fragment2 = arrayList.get(i);
                if (arrayListA0x != null) {
                    arrayListA0x.contains(fragment2);
                }
                i++;
            }
        }
        this.A0N = arrayListA0x;
        return z;
    }

    public final boolean A0v(MenuItem menuItem) {
        if (this.A00 >= 1) {
            Iterator itA04 = A04(this);
            while (itA04.hasNext()) {
                Fragment fragment = (Fragment) itA04.next();
                if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sbA0p = BV4.A0p(128);
        sbA0p.append("FragmentManager{");
        AbstractC7609F5w.A1K(sbA0p, this);
        sbA0p.append(" in ");
        Object obj = this.A06;
        String str = "}";
        if (obj == null && (obj = this.A09) == null) {
            str = HatchCcvLoggingKt.NO_POSTAL_FIELD;
        } else {
            AbstractC7609F5w.A1L(sbA0p, obj);
            sbA0p.append("{");
            AbstractC7609F5w.A1K(sbA0p, obj);
        }
        sbA0p.append(str);
        return AnonymousClass001.A0v("}}", sbA0p);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    private Set<AbstractC8541Ffu> A02() {
        HashSet hashSetA13 = C60O.A13();
        Iterator it = this.A0U.A02().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C8572FgR) it.next()).A02.mContainer;
            if (viewGroup != null) {
                C7384Etj.A0Y(A0Y(), 1);
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (!(tag instanceof AbstractC8541Ffu)) {
                    tag = new C8560FgD(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, tag);
                }
                hashSetA13.add(tag);
            }
        }
        return hashSetA13;
    }

    public static final Set<Fragment> A03(C8573FgU c8573FgU) {
        HashSet hashSetA13 = C60O.A13();
        int i = 0;
        while (true) {
            ArrayList<C8598Fh0> arrayList = c8573FgU.A0B;
            if (i >= arrayList.size()) {
                return hashSetA13;
            }
            Fragment fragment = arrayList.get(i).A05;
            if (fragment != null && c8573FgU.A0E) {
                hashSetA13.add(fragment);
            }
            i++;
        }
    }

    private void A08(Fragment fragment) {
        ViewGroup viewGroupA00 = A00(fragment);
        if (viewGroupA00 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        if (viewGroupA00.getTag(R.id.visible_removing_fragment_view_tag) == null) {
            viewGroupA00.setTag(R.id.visible_removing_fragment_view_tag, fragment);
        }
        ((Fragment) viewGroupA00.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
    }

    public static final void A09(Fragment fragment) {
        if (A0L()) {
            AbstractC7607F5u.A1N(AnonymousClass007.A0a("show: ", fragment));
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.HashSet] */
    public static void A0D(AbstractC8571FgQ abstractC8571FgQ) {
        Iterator it = abstractC8571FgQ.A02().iterator();
        while (it.hasNext()) {
            ((AbstractC8541Ffu) it.next()).A09();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.HashSet] */
    public static void A0E(AbstractC8571FgQ abstractC8571FgQ) {
        Iterator it = abstractC8571FgQ.A02().iterator();
        while (it.hasNext()) {
            AbstractC8541Ffu abstractC8541Ffu = (AbstractC8541Ffu) it.next();
            if (abstractC8541Ffu.A00) {
                if (A0L()) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                abstractC8541Ffu.A00 = false;
                abstractC8541Ffu.A08();
            }
        }
    }

    public static void A0H(PrintWriter printWriter, String str, int i) {
        printWriter.print(str);
        printWriter.print("  #");
        printWriter.print(i);
        printWriter.print(": ");
    }

    private void A0I(ArrayList<C8573FgU> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw C3cG.A0Q("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!arrayList.get(i).A0G) {
                if (i2 != i) {
                    A0J(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (AnonymousClass001.A1X(arrayList2.get(i))) {
                    while (i2 < size && AnonymousClass001.A1X(arrayList2.get(i2)) && !arrayList.get(i2).A0G) {
                        i2++;
                    }
                }
                A0J(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            A0J(arrayList, arrayList2, i2, size);
        }
    }

    private final void A0i(Fragment fragment) {
        if (A0L()) {
            AbstractC7607F5u.A1N(AnonymousClass007.A0a("hide: ", fragment));
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = !fragment.mHiddenChanged;
        A08(fragment);
    }

    private final void A0j(Fragment fragment) {
        if (A0L()) {
            StringBuilder sbA0f = C3cG.A0f(fragment, "remove: ");
            sbA0f.append(" nesting=");
            AbstractC7607F5u.A1N(BV4.A0l(sbA0f, fragment.mBackStackNesting));
        }
        boolean zA1N = AnonymousClass002.A1N(fragment.mBackStackNesting);
        if (fragment.mDetached && zA1N) {
            return;
        }
        ArrayList<Fragment> arrayList = this.A0U.A01;
        synchronized (arrayList) {
            arrayList.remove(fragment);
        }
        fragment.mAdded = false;
        if (A0O(fragment)) {
            this.A0I = true;
        }
        fragment.mRemoving = true;
        A08(fragment);
    }

    private final void A0n(Fragment fragment, boolean z) {
        ViewGroup viewGroupA00 = A00(fragment);
        if (viewGroupA00 == null || !(viewGroupA00 instanceof C8403FdK)) {
            return;
        }
        ((C8403FdK) viewGroupA00).A00 = !z;
    }

    public final Bundle A0S() {
        ArrayList<String> arrayListA11;
        BackStackRecordState[] backStackRecordStateArr;
        Bundle bundleA0N = BV6.A0N();
        A0E(this);
        A0D(this);
        A0s(true);
        this.A0J = true;
        this.A0A.A01 = true;
        C8575FgX c8575FgX = this.A0U;
        HashMap<String, C8572FgR> map = c8575FgX.A02;
        ArrayList<String> arrayListA112 = C60O.A11(map.size());
        Iterator itA0x = BV5.A0x(map);
        while (itA0x.hasNext()) {
            C8572FgR c8572FgR = (C8572FgR) itA0x.next();
            if (c8572FgR != null) {
                Fragment fragment = c8572FgR.A02;
                c8575FgX.A03.put(fragment.mWho, c8572FgR.A01());
                arrayListA112.add(fragment.mWho);
                if (A0L()) {
                    StringBuilder sbA0f = C3cG.A0f(fragment, "Saved state of ");
                    sbA0f.append(": ");
                    AbstractC7607F5u.A1N(C8j3.A14(fragment.mSavedFragmentState, sbA0f));
                }
            }
        }
        HashMap<String, Bundle> map2 = c8575FgX.A03;
        if (!map2.isEmpty()) {
            ArrayList<Fragment> arrayList = c8575FgX.A01;
            synchronized (arrayList) {
                if (arrayList.isEmpty()) {
                    arrayListA11 = null;
                } else {
                    arrayListA11 = C60O.A11(arrayList.size());
                    Iterator<Fragment> it = arrayList.iterator();
                    while (it.hasNext()) {
                        Fragment next = it.next();
                        arrayListA11.add(next.mWho);
                        if (A0N(2)) {
                            StringBuilder sbA0w = C60O.A0w();
                            sbA0w.append("saveAllState: adding fragment (");
                            sbA0w.append(next.mWho);
                            AbstractC7610F5x.A1M(next, "): ", sbA0w);
                        }
                    }
                }
            }
            int size = this.A0D.size();
            if (size > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                int i = 0;
                do {
                    backStackRecordStateArr[i] = new BackStackRecordState(this.A0D.get(i));
                    if (A0N(2)) {
                        StringBuilder sbA0y = C60O.A0y("saveAllState: adding back stack #", i);
                        sbA0y.append(": ");
                        Log.v("FragmentManager", C8j3.A14(this.A0D.get(i), sbA0y));
                    }
                    i++;
                } while (i < size);
            } else {
                backStackRecordStateArr = null;
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.A02 = arrayListA112;
            fragmentManagerState.A03 = arrayListA11;
            fragmentManagerState.A07 = backStackRecordStateArr;
            fragmentManagerState.A00 = this.A0Y.get();
            Fragment fragment2 = this.A07;
            if (fragment2 != null) {
                fragmentManagerState.A01 = fragment2.mWho;
            }
            ArrayList<String> arrayList2 = fragmentManagerState.A04;
            Map<String, BackStackState> map3 = this.A0W;
            arrayList2.addAll(map3.keySet());
            fragmentManagerState.A05.addAll(map3.values());
            fragmentManagerState.A06 = BV4.A0t(this.A0C);
            bundleA0N.putParcelable("state", fragmentManagerState);
            Map<String, Bundle> map4 = this.A0f;
            Iterator itA11 = BV5.A11(map4);
            while (itA11.hasNext()) {
                String strA0j = AnonymousClass005.A0j(itA11);
                bundleA0N.putBundle(FGI.A0M("result_", strA0j), map4.get(strA0j));
            }
            Iterator itA0y = BV5.A0y(map2);
            while (itA0y.hasNext()) {
                String strA0j2 = AnonymousClass005.A0j(itA0y);
                bundleA0N.putBundle(FGI.A0M("fragment_", strA0j2), map2.get(strA0j2));
            }
        } else if (A0N(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundleA0N;
    }

    public final Set<AbstractC8541Ffu> A0Z(ArrayList<C8573FgU> arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSetA13 = C60O.A13();
        while (i < i2) {
            Iterator<C8598Fh0> it = arrayList.get(i).A0B.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().A05;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSetA13.add(AbstractC8541Ffu.A02(viewGroup, this));
                }
            }
            i++;
        }
        return hashSetA13;
    }

    public final void A0s(boolean z) {
        C8573FgU c8573FgU;
        A0K(z);
        if (!this.A0G && (c8573FgU = this.A05) != null) {
            c8573FgU.A01 = false;
            c8573FgU.A04();
            if (A0M()) {
                StringBuilder sbA0x = C60O.A0x("Reversing mTransitioningOp ");
                sbA0x.append(this.A05);
                sbA0x.append(" as part of execPendingActions for actions ");
                AbstractC7607F5u.A1O(C8j3.A14(this.A0V, sbA0x));
            }
            this.A05.A03(false, false);
            ArrayList<InterfaceC8038FQp> arrayList = this.A0V;
            C8573FgU c8573FgU2 = this.A05;
            arrayList.add(0, c8573FgU2);
            Iterator<C8598Fh0> it = c8573FgU2.A0B.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().A05;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.A05 = null;
        }
        while (true) {
            ArrayList<C8573FgU> arrayList2 = this.A0Q;
            ArrayList<Boolean> arrayList3 = this.A0P;
            ArrayList<InterfaceC8038FQp> arrayList4 = this.A0V;
            synchronized (arrayList4) {
                if (arrayList4.isEmpty()) {
                    break;
                }
                try {
                    int size = arrayList4.size();
                    boolean zABs = false;
                    for (int i = 0; i < size; i++) {
                        zABs |= arrayList4.get(i).ABs(arrayList2, arrayList3);
                    }
                    if (!zABs) {
                        break;
                    }
                    this.mExecutingActions = true;
                    try {
                        A0I(this.A0Q, this.A0P);
                    } finally {
                        A05();
                    }
                } finally {
                    arrayList4.clear();
                    this.A09.A02.removeCallbacks(this.A0B);
                }
            }
        }
        A0F(this);
        if (this.A0H) {
            this.A0H = false;
            A06();
        }
        this.A0U.A02.values().removeAll(Collections.singleton(null));
    }
}
