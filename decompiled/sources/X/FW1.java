package X;

import X.FW1;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.facebook.aura.R;
import com.facebook.aura.vds.toast.AuraToast;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FW1<B extends FW1<B>> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public View A06;
    public List<FWH<B>> A08;
    public Rect A09;
    public final Context A0A;
    public final ViewGroup A0B;
    public final AccessibilityManager A0D;
    public final FW2 A0E;
    public final HsX A0F;
    public static final int[] A0I = {R.attr._name_removed__res_0x7f0404df};
    public static final Handler A0H = new Handler(Looper.getMainLooper(), new C8135FVy());
    public final ViewTreeObserver.OnGlobalLayoutListener A0C = new I14(this, 5);
    public final Runnable A0G = new FW0(this);
    public FVe A07 = new FWC(this);

    public static void A00(FW1 fw1) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = fw1.A0D;
        if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
            fw1.A0E.post(new FW3(fw1));
            return;
        }
        FW2 fw2 = fw1.A0E;
        if (fw2.getParent() != null) {
            fw2.setVisibility(0);
        }
        fw1.A03();
    }

    public static void A01(FW1 fw1) {
        Rect rect;
        FW2 fw2 = fw1.A0E;
        ViewGroup.LayoutParams layoutParams = fw2.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (rect = fw1.A09) == null) {
            Log.w("BaseTransientBottomBar", "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = rect.bottom + (fw1.A06 != null ? fw1.A01 : fw1.A03);
        marginLayoutParams.leftMargin = rect.left + fw1.A04;
        marginLayoutParams.rightMargin = rect.right + fw1.A05;
        fw2.requestLayout();
        if (fw1.A02 > 0) {
            ViewGroup.LayoutParams layoutParams2 = fw2.getLayoutParams();
            if ((layoutParams2 instanceof C8128FUx) && (((C8128FUx) layoutParams2).A0A instanceof SwipeDismissBehavior)) {
                Runnable runnable = fw1.A0G;
                fw2.removeCallbacks(runnable);
                fw2.post(runnable);
            }
        }
    }

    public FW1(Context context, View view, ViewGroup viewGroup, HsX hsX) {
        if (view == null) {
            throw C60O.A0i("Transient bottom bar must have non-null content");
        }
        if (hsX == null) {
            throw C60O.A0i("Transient bottom bar must have non-null callback");
        }
        this.A0B = viewGroup;
        this.A0F = hsX;
        this.A0A = context;
        FW7.A02(context, "Theme.AppCompat", FW7.A00);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = this.A0A.obtainStyledAttributes(A0I);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        FW2 fw2 = (FW2) layoutInflaterFrom.inflate(resourceId != -1 ? R.layout._name_removed__res_0x7f0d029e : R.layout._name_removed__res_0x7f0d013f, viewGroup, false);
        this.A0E = fw2;
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            float f = fw2.A05;
            if (f != 1.0f) {
                snackbarContentLayout.A00.setTextColor(FWP.A00(f, FWM.A01(snackbarContentLayout, R.attr._name_removed__res_0x7f040139), snackbarContentLayout.A00.getCurrentTextColor()));
            }
        }
        fw2.addView(view);
        ViewGroup.LayoutParams layoutParams = fw2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.A09 = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        fw2.setAccessibilityLiveRegion(1);
        fw2.setImportantForAccessibility(1);
        fw2.setFitsSystemWindows(true);
        AbstractC8082FSn.A00(fw2, new I10(this, 4));
        AbstractC8060FRo.A06(fw2, new I0C(this, 7));
        this.A0D = AbstractC7608F5v.A0F(context);
    }

    public final void A02() {
        FW5 fw5A00 = FW5.A00();
        FVe fVe = this.A07;
        synchronized (fw5A00.A03) {
            if (FW5.A03(fVe, fw5A00)) {
                fw5A00.A00 = null;
                if (fw5A00.A01 != null) {
                    FW5.A02(fw5A00);
                }
            }
        }
        List<FWH<B>> list = this.A08;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((AuraToast.AnonymousClass1) this.A08.get(size)).$callback.invoke();
                }
            }
        }
        AbstractC7610F5x.A19(this.A0E);
    }

    public final void A03() {
        FW5 fw5A00 = FW5.A00();
        FVe fVe = this.A07;
        synchronized (fw5A00.A03) {
            if (FW5.A03(fVe, fw5A00)) {
                FW5.A01(fw5A00.A00, fw5A00);
            }
        }
        List<FWH<B>> list = this.A08;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                this.A08.get(size);
            }
        }
    }

    public final void A04(int i) {
        FW8 fw8;
        FW5 fw5A00 = FW5.A00();
        FVe fVe = this.A07;
        synchronized (fw5A00.A03) {
            if (FW5.A03(fVe, fw5A00)) {
                fw8 = fw5A00.A00;
            } else {
                fw8 = fw5A00.A01;
                if (fw8 != null && fVe != null && fw8.A02.get() == fVe) {
                }
            }
            FW5.A04(fw8, fw5A00, i);
        }
    }
}
