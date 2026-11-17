package androidx.appcompat.widget;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7611F5y;
import X.AbstractC8301FbR;
import X.AbstractC8339Fc7;
import X.AnonymousClass002;
import X.BV7;
import X.C10449Hii;
import X.C3cG;
import X.C8140FWd;
import X.C8165FXh;
import X.C8177FXt;
import X.C8178FXu;
import X.C8243FaJ;
import X.C8249FaR;
import X.C8253FaY;
import X.C8254Faa;
import X.C8257Fad;
import X.C8283Fb7;
import X.C8314Fbg;
import X.C8318Fbk;
import X.C8419Fdc;
import X.C8421Fde;
import X.FWf;
import X.FYT;
import X.I0W;
import X.I15;
import X.InterfaceC8322Fbo;
import X.InterfaceC8331Fby;
import X.InterfaceC8333Fc0;
import X.InterfaceC8348FcM;
import X.InterfaceC8354FcS;
import X.InterfaceC8357FcV;
import X.InterfaceC8620FhQ;
import X.RunnableC8297FbM;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.customview.view.AbsSavedState;
import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class Toolbar extends ViewGroup implements InterfaceC8620FhQ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public View A04;
    public ImageButton A05;
    public ImageView A06;
    public TextView A07;
    public TextView A08;
    public InterfaceC8322Fbo A09;
    public ActionMenuView A0A;
    public C10449Hii A0B;
    public C8257Fad A0C;
    public InterfaceC8354FcS A0D;
    public CharSequence A0E;
    public CharSequence A0F;
    public ArrayList<MenuItem> A0G;
    public boolean A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public Context A0Q;
    public ColorStateList A0R;
    public ColorStateList A0S;
    public Drawable A0T;
    public ImageButton A0U;
    public OnBackInvokedCallback A0V;
    public OnBackInvokedDispatcher A0W;
    public InterfaceC8331Fby A0X;
    public C8243FaJ A0Y;
    public C8254Faa A0Z;
    public CharSequence A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public final C8419Fdc A0e;
    public final Runnable A0f;
    public final ArrayList<View> A0g;
    public final InterfaceC8357FcV A0h;
    public final ArrayList<View> A0i;
    public final int[] A0j;

    public Toolbar(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C8318Fbk(-2);
    }

    public final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new I15(0);
        public int A00;
        public boolean A01;

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00);
            parcel.writeInt(this.A01 ? 1 : 0);
        }
    }

    public static final C8318Fbk A04(ViewGroup.LayoutParams layoutParams) {
        C8318Fbk c8318Fbk;
        int i;
        if (layoutParams instanceof C8318Fbk) {
            C8318Fbk c8318Fbk2 = (C8318Fbk) layoutParams;
            c8318Fbk = new C8318Fbk(c8318Fbk2);
            ((AbstractC8339Fc7) c8318Fbk).A00 = 0;
            ((AbstractC8339Fc7) c8318Fbk).A00 = ((AbstractC8339Fc7) c8318Fbk2).A00;
            c8318Fbk.A00 = 0;
            i = c8318Fbk2.A00;
        } else if (layoutParams instanceof AbstractC8339Fc7) {
            AbstractC8339Fc7 abstractC8339Fc7 = (AbstractC8339Fc7) layoutParams;
            c8318Fbk = new C8318Fbk(abstractC8339Fc7);
            ((AbstractC8339Fc7) c8318Fbk).A00 = 0;
            ((AbstractC8339Fc7) c8318Fbk).A00 = abstractC8339Fc7.A00;
            i = 0;
        } else {
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                C8318Fbk c8318Fbk3 = new C8318Fbk(marginLayoutParams);
                ((AbstractC8339Fc7) c8318Fbk3).A00 = 0;
                c8318Fbk3.A00 = 0;
                ((ViewGroup.MarginLayoutParams) c8318Fbk3).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) c8318Fbk3).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) c8318Fbk3).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) c8318Fbk3).bottomMargin = marginLayoutParams.bottomMargin;
                return c8318Fbk3;
            }
            c8318Fbk = new C8318Fbk(layoutParams);
            i = 0;
            ((AbstractC8339Fc7) c8318Fbk).A00 = 0;
        }
        c8318Fbk.A00 = i;
        return c8318Fbk;
    }

    private void A06() {
        if (this.A0A == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.A0A = actionMenuView;
            actionMenuView.setPopupTheme(this.A0L);
            ActionMenuView actionMenuView2 = this.A0A;
            actionMenuView2.A05 = this.A0h;
            actionMenuView2.setMenuCallbacks(this.A0X, new C8283Fb7(this));
            C8318Fbk c8318Fbk = new C8318Fbk(-2);
            ((AbstractC8339Fc7) c8318Fbk).A00 = (this.A00 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 8388613;
            this.A0A.setLayoutParams(c8318Fbk);
            A09(this.A0A, false);
        }
    }

    private void A07() {
        if (this.A0U == null) {
            this.A0U = new C8177FXt(getContext(), null, R.attr._name_removed__res_0x7f0405ad);
            C8318Fbk c8318Fbk = new C8318Fbk(-2);
            ((AbstractC8339Fc7) c8318Fbk).A00 = (this.A00 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 8388611;
            this.A0U.setLayoutParams(c8318Fbk);
        }
    }

    private boolean A0C(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void A0D() {
        if (this.A05 == null) {
            C8177FXt c8177FXt = new C8177FXt(getContext(), null, R.attr._name_removed__res_0x7f0405ad);
            this.A05 = c8177FXt;
            c8177FXt.setImageDrawable(this.A0T);
            this.A05.setContentDescription(this.A0a);
            C8318Fbk c8318Fbk = new C8318Fbk(-2);
            ((AbstractC8339Fc7) c8318Fbk).A00 = (this.A00 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 8388611;
            c8318Fbk.A00 = 2;
            this.A05.setLayoutParams(c8318Fbk);
            this.A05.setOnClickListener(new I0W(this, 1));
        }
    }

    public final void A0E() {
        Iterator<MenuItem> it = this.A0G.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        C8419Fdc c8419Fdc = this.A0e;
        MenuInflater menuInflater = getMenuInflater();
        Iterator<InterfaceC8348FcM> it2 = c8419Fdc.A02.iterator();
        while (it2.hasNext()) {
            C8421Fde.A00(it2).A0u(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.A0G = currentMenuItems2;
    }

    public final void A0F() {
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA00 = AbstractC8301FbR.A00(this);
            C8257Fad c8257Fad = this.A0C;
            if (c8257Fad == null || c8257Fad.A01 == null || onBackInvokedDispatcherA00 == null || !isAttachedToWindow() || !this.A0b) {
                OnBackInvokedDispatcher onBackInvokedDispatcher = this.A0W;
                if (onBackInvokedDispatcher == null) {
                    return;
                }
                AbstractC8301FbR.A03(onBackInvokedDispatcher, this.A0V);
                onBackInvokedDispatcherA00 = null;
            } else {
                if (this.A0W != null) {
                    return;
                }
                OnBackInvokedCallback onBackInvokedCallbackA01 = this.A0V;
                if (onBackInvokedCallbackA01 == null) {
                    onBackInvokedCallbackA01 = AbstractC8301FbR.A01(new Runnable() { // from class: X.Fbq
                        public static final String __redex_internal_original_name = "Toolbar$$ExternalSyntheticLambda0";

                        @Override // java.lang.Runnable
                        public final void run() {
                            C8252FaX c8252FaX;
                            C8257Fad c8257Fad2 = this.A00.A0C;
                            if (c8257Fad2 == null || (c8252FaX = c8257Fad2.A01) == null) {
                                return;
                            }
                            c8252FaX.collapseActionView();
                        }
                    });
                    this.A0V = onBackInvokedCallbackA01;
                }
                AbstractC8301FbR.A02(onBackInvokedDispatcherA00, onBackInvokedCallbackA01);
            }
            this.A0W = onBackInvokedDispatcherA00;
        }
    }

    @Override // X.InterfaceC8620FhQ
    public final void addMenuProvider(InterfaceC8348FcM interfaceC8348FcM) {
        C8419Fdc c8419Fdc = this.A0e;
        c8419Fdc.A02.add(interfaceC8348FcM);
        c8419Fdc.A00.run();
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.A05;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.A05;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C10449Hii c10449Hii = this.A0B;
        if (c10449Hii != null) {
            return c10449Hii.A07 ? c10449Hii.A03 : c10449Hii.A04;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.A0I;
        return i == Integer.MIN_VALUE ? getContentInsetEnd() : i;
    }

    public int getContentInsetLeft() {
        C10449Hii c10449Hii = this.A0B;
        if (c10449Hii != null) {
            return c10449Hii.A03;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C10449Hii c10449Hii = this.A0B;
        if (c10449Hii != null) {
            return c10449Hii.A04;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C10449Hii c10449Hii = this.A0B;
        if (c10449Hii != null) {
            return c10449Hii.A07 ? c10449Hii.A04 : c10449Hii.A03;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.A0J;
        return i == Integer.MIN_VALUE ? getContentInsetStart() : i;
    }

    public int getCurrentContentInsetEnd() {
        C8249FaR c8249FaR;
        ActionMenuView actionMenuView = this.A0A;
        return (actionMenuView == null || (c8249FaR = actionMenuView.A03) == null || !c8249FaR.hasVisibleItems()) ? getContentInsetEnd() : AbstractC7608F5v.A06(this.A0I, 0, getContentInsetEnd());
    }

    public Drawable getLogo() {
        ImageView imageView = this.A06;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.A06;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public View getNavButtonView() {
        return this.A0U;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.A0U;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.A0U;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public C8243FaJ getOuterActionMenuPresenter() {
        return this.A0Y;
    }

    public Context getPopupContext() {
        return this.A0Q;
    }

    public int getPopupTheme() {
        return this.A0L;
    }

    public CharSequence getSubtitle() {
        return this.A0E;
    }

    public final TextView getSubtitleTextView() {
        return this.A07;
    }

    public CharSequence getTitle() {
        return this.A0F;
    }

    public int getTitleMarginBottom() {
        return this.A0M;
    }

    public int getTitleMarginEnd() {
        return this.A0N;
    }

    public int getTitleMarginStart() {
        return this.A0O;
    }

    public int getTitleMarginTop() {
        return this.A0P;
    }

    public final TextView getTitleTextView() {
        return this.A08;
    }

    public InterfaceC8333Fc0 getWrapper() {
        C8254Faa c8254Faa = this.A0Z;
        if (c8254Faa != null) {
            return c8254Faa;
        }
        C8254Faa c8254Faa2 = new C8254Faa(this, true);
        this.A0Z = c8254Faa2;
        return c8254Faa2;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0270 A[LOOP:1: B:103:0x026e->B:104:0x0270, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x028a A[LOOP:2: B:106:0x0288->B:107:0x028a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d0 A[LOOP:3: B:114:0x02ce->B:115:0x02d0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0190 A[LOOP:0: B:67:0x018e->B:68:0x0190, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r21, int r22, int r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iA08;
        int iMax;
        int iA09;
        int iA082;
        int iMax2;
        int i3;
        int[] iArr = this.A0j;
        boolean zA1Q = BV7.A1Q(getLayoutDirection());
        int i4 = 0;
        int i5 = !zA1Q ? 1 : 0;
        if (A0C(this.A0U)) {
            A08(this.A0U, i, 0, i2, this.A0K);
            iA08 = AbstractC7611F5y.A08(this.A0U, this.A0U.getMeasuredWidth());
            int measuredHeight = this.A0U.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParamsA0e = AbstractC7607F5u.A0e(this.A0U);
            iMax = Math.max(0, measuredHeight + marginLayoutParamsA0e.topMargin + marginLayoutParamsA0e.bottomMargin);
            iA09 = AbstractC7608F5v.A09(this.A0U, 0);
        } else {
            iA08 = 0;
            iMax = 0;
            iA09 = 0;
        }
        if (A0C(this.A05)) {
            A08(this.A05, i, 0, i2, this.A0K);
            iA08 = AbstractC7611F5y.A08(this.A05, this.A05.getMeasuredWidth());
            int measuredHeight2 = this.A05.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParamsA0e2 = AbstractC7607F5u.A0e(this.A05);
            iMax = Math.max(iMax, measuredHeight2 + marginLayoutParamsA0e2.topMargin + marginLayoutParamsA0e2.bottomMargin);
            iA09 = AbstractC7608F5v.A09(this.A05, iA09);
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iA08);
        iArr[zA1Q ? 1 : 0] = AbstractC7607F5u.A0D(currentContentInsetStart, iA08, 0);
        if (A0C(this.A0A)) {
            A08(this.A0A, i, iMax3, i2, this.A0K);
            iA082 = AbstractC7611F5y.A08(this.A0A, this.A0A.getMeasuredWidth());
            int measuredHeight3 = this.A0A.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParamsA0e3 = AbstractC7607F5u.A0e(this.A0A);
            iMax = Math.max(iMax, measuredHeight3 + marginLayoutParamsA0e3.topMargin + marginLayoutParamsA0e3.bottomMargin);
            iA09 = AbstractC7608F5v.A09(this.A0A, iA09);
        } else {
            iA082 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, iA082);
        iArr[i5] = AbstractC7607F5u.A0D(currentContentInsetEnd, iA082, 0);
        if (A0C(this.A04)) {
            iMax4 += A03(this.A04, iArr, i, iMax4, i2, 0);
            int measuredHeight4 = this.A04.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParamsA0e4 = AbstractC7607F5u.A0e(this.A04);
            iMax = Math.max(iMax, measuredHeight4 + marginLayoutParamsA0e4.topMargin + marginLayoutParamsA0e4.bottomMargin);
            iA09 = AbstractC7608F5v.A09(this.A04, iA09);
        }
        if (A0C(this.A06)) {
            iMax4 += A03(this.A06, iArr, i, iMax4, i2, 0);
            int measuredHeight5 = this.A06.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParamsA0e5 = AbstractC7607F5u.A0e(this.A06);
            iMax = Math.max(iMax, measuredHeight5 + marginLayoutParamsA0e5.topMargin + marginLayoutParamsA0e5.bottomMargin);
            iA09 = AbstractC7608F5v.A09(this.A06, iA09);
        }
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (((C8318Fbk) childAt.getLayoutParams()).A00 == 0 && A0C(childAt)) {
                iMax4 += A03(childAt, iArr, i, iMax4, i2, 0);
                int measuredHeight6 = childAt.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParamsA0e6 = AbstractC7607F5u.A0e(childAt);
                iMax = Math.max(iMax, measuredHeight6 + marginLayoutParamsA0e6.topMargin + marginLayoutParamsA0e6.bottomMargin);
                iA09 = AbstractC7608F5v.A09(childAt, iA09);
            }
        }
        int i7 = this.A0P + this.A0M;
        int i8 = this.A0O + this.A0N;
        if (A0C(this.A08)) {
            A03(this.A08, iArr, i, iMax4 + i8, i2, i7);
            iMax2 = AbstractC7611F5y.A08(this.A08, this.A08.getMeasuredWidth());
            int measuredHeight7 = this.A08.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParamsA0e7 = AbstractC7607F5u.A0e(this.A08);
            i3 = measuredHeight7 + marginLayoutParamsA0e7.topMargin + marginLayoutParamsA0e7.bottomMargin;
            iA09 = AbstractC7608F5v.A09(this.A08, iA09);
        } else {
            iMax2 = 0;
            i3 = 0;
        }
        if (A0C(this.A07)) {
            iMax2 = Math.max(iMax2, A03(this.A07, iArr, i, iMax4 + i8, i2, i3 + i7));
            int measuredHeight8 = this.A07.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParamsA0e8 = AbstractC7607F5u.A0e(this.A07);
            i3 += measuredHeight8 + marginLayoutParamsA0e8.topMargin + marginLayoutParamsA0e8.bottomMargin;
            iA09 = AbstractC7608F5v.A09(this.A07, iA09);
        }
        if (A0C(this.A08) || A0C(this.A07)) {
            i3 += i7;
        }
        int iMax5 = Math.max(iMax, i3);
        int iA092 = iMax4 + iMax2 + AbstractC7609F5w.A09(this);
        int iA0B = iMax5 + AbstractC7609F5w.A0B(this);
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(iA092, getSuggestedMinimumWidth()), i, (-16777216) & iA09);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(iA0B, getSuggestedMinimumHeight()), i2, iA09 << 16);
        if (!this.A0H) {
            i4 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i9 = 0; i9 < childCount2; i9++) {
            View childAt2 = getChildAt(i9);
            if (A0C(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i4 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i4);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(((AbsSavedState) savedState).A00);
        ActionMenuView actionMenuView = this.A0A;
        C8249FaR c8249FaR = actionMenuView != null ? actionMenuView.A03 : null;
        int i = savedState.A00;
        if (i != 0 && this.A0C != null && c8249FaR != null && (menuItemFindItem = c8249FaR.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.A01) {
            Runnable runnable = this.A0f;
            removeCallbacks(runnable);
            post(runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Parcelable onSaveInstanceState() {
        /*
            r3 = this;
            android.os.Parcelable$Creator<androidx.appcompat.widget.Toolbar$SavedState> r0 = androidx.appcompat.widget.Toolbar.SavedState.CREATOR
            android.os.Parcelable r0 = super.onSaveInstanceState()
            androidx.appcompat.widget.Toolbar$SavedState r2 = new androidx.appcompat.widget.Toolbar$SavedState
            r2.<init>(r0)
            X.Fad r0 = r3.A0C
            if (r0 == 0) goto L19
            X.FaX r0 = r0.A01
            if (r0 == 0) goto L19
            int r0 = r0.getItemId()
            r2.A00 = r0
        L19:
            androidx.appcompat.widget.ActionMenuView r0 = r3.A0A
            if (r0 == 0) goto L28
            X.FaJ r0 = r0.A04
            if (r0 == 0) goto L28
            boolean r1 = r0.A03()
            r0 = 1
            if (r1 != 0) goto L29
        L28:
            r0 = 0
        L29:
            r2.A01 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onSaveInstanceState():android.os.Parcelable");
    }

    @Override // X.InterfaceC8620FhQ
    public final void removeMenuProvider(InterfaceC8348FcM interfaceC8348FcM) {
        this.A0e.A00(interfaceC8348FcM);
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.A0b != z) {
            this.A0b = z;
            A0F();
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            A0D();
            this.A05.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.A05;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.A0T);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.A0H = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.A0I) {
            this.A0I = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.A0J) {
            this.A0J = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            ImageView c8178FXu = this.A06;
            if (c8178FXu == null) {
                c8178FXu = new C8178FXu(getContext(), null, 0);
                this.A06 = c8178FXu;
            }
            if (!A0B(c8178FXu)) {
                A09(this.A06, true);
            }
        } else {
            View view = this.A06;
            if (view != null && A0B(view)) {
                removeView(this.A06);
                this.A0g.remove(this.A06);
            }
        }
        ImageView imageView = this.A06;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public void setMenu(C8249FaR c8249FaR, C8243FaJ c8243FaJ) {
        if (c8249FaR == null && this.A0A == null) {
            return;
        }
        A06();
        C8249FaR c8249FaR2 = this.A0A.A03;
        if (c8249FaR2 != c8249FaR) {
            if (c8249FaR2 != null) {
                c8249FaR2.A0B(this.A0Y);
                c8249FaR2.A0B(this.A0C);
            }
            if (this.A0C == null) {
                this.A0C = new C8257Fad(this);
            }
            c8243FaJ.A0E = true;
            Context context = this.A0Q;
            if (c8249FaR != null) {
                c8249FaR.A08(context, c8243FaJ);
                c8249FaR.A08(this.A0Q, this.A0C);
            } else {
                c8243FaJ.ANd(context, null);
                this.A0C.ANd(this.A0Q, null);
                c8243FaJ.Ahy();
                this.A0C.Ahy();
            }
            this.A0A.setPopupTheme(this.A0L);
            this.A0A.setPresenter(c8243FaJ);
            this.A0Y = c8243FaJ;
            A0F();
        }
    }

    public void setMenuCallbacks(InterfaceC8331Fby interfaceC8331Fby, InterfaceC8322Fbo interfaceC8322Fbo) {
        this.A0X = interfaceC8331Fby;
        this.A09 = interfaceC8322Fbo;
        ActionMenuView actionMenuView = this.A0A;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(interfaceC8331Fby, interfaceC8322Fbo);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            A07();
            if (!A0B(this.A0U)) {
                A09(this.A0U, true);
            }
        } else {
            ImageButton imageButton = this.A0U;
            if (imageButton != null && A0B(imageButton)) {
                removeView(this.A0U);
                this.A0g.remove(this.A0U);
            }
        }
        ImageButton imageButton2 = this.A0U;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setOnMenuItemClickListener(InterfaceC8354FcS interfaceC8354FcS) {
        this.A0D = interfaceC8354FcS;
    }

    public void setPopupTheme(int i) {
        if (this.A0L != i) {
            this.A0L = i;
            this.A0Q = i == 0 ? getContext() : new ContextThemeWrapper(getContext(), i);
        }
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A0R = colorStateList;
        TextView textView = this.A07;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitleMarginBottom(int i) {
        this.A0M = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.A0N = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.A0O = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.A0P = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.A0S = colorStateList;
        TextView textView = this.A08;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r1 != 80) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A00(android.view.View r9, int r10) {
        /*
            r8 = this;
            android.view.ViewGroup$LayoutParams r6 = r9.getLayoutParams()
            X.Fc7 r6 = (X.AbstractC8339Fc7) r6
            int r7 = r9.getMeasuredHeight()
            r5 = 0
            if (r10 <= 0) goto L52
            int r0 = r7 - r10
            int r3 = r0 / 2
        L11:
            int r0 = r6.A00
            r1 = r0 & 112(0x70, float:1.57E-43)
            r0 = 16
            if (r1 == r0) goto L2b
            r0 = 48
            if (r1 == r0) goto L54
            r2 = 80
            if (r1 == r2) goto L59
            int r0 = r8.A01
            r1 = r0 & 112(0x70, float:1.57E-43)
            r0 = 48
            if (r1 == r0) goto L54
            if (r1 == r2) goto L59
        L2b:
            int r1 = r8.getPaddingTop()
            int r4 = r8.getPaddingBottom()
            int r3 = r8.getHeight()
            int r0 = r3 - r1
            int r0 = r0 - r4
            int r0 = r0 - r7
            int r2 = r0 / 2
            int r0 = r6.topMargin
            if (r2 >= r0) goto L44
            r2 = r0
        L42:
            int r1 = r1 + r2
            return r1
        L44:
            int r3 = r3 - r4
            int r3 = r3 - r7
            int r3 = r3 - r2
            int r3 = r3 - r1
            int r0 = r6.bottomMargin
            if (r3 >= r0) goto L42
            int r0 = r0 - r3
            int r2 = X.AbstractC7607F5u.A0D(r2, r0, r5)
            goto L42
        L52:
            r3 = 0
            goto L11
        L54:
            int r1 = r8.getPaddingTop()
            goto L61
        L59:
            int r1 = X.AbstractC7609F5w.A0A(r8)
            int r1 = r1 - r7
            int r0 = r6.bottomMargin
            int r1 = r1 - r0
        L61:
            int r1 = r1 - r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.A00(android.view.View, int):int");
    }

    private int A01(View view, int[] iArr, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParamsA0e = AbstractC7607F5u.A0e(view);
        int i3 = marginLayoutParamsA0e.leftMargin - iArr[0];
        int iMax = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int iA00 = A00(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iA00, iMax + measuredWidth, view.getMeasuredHeight() + iA00);
        return iMax + measuredWidth + marginLayoutParamsA0e.rightMargin;
    }

    private int A02(View view, int[] iArr, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParamsA0e = AbstractC7607F5u.A0e(view);
        int i3 = marginLayoutParamsA0e.rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iA00 = A00(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iA00, iMax, view.getMeasuredHeight() + iA00);
        return iMax - (measuredWidth + marginLayoutParamsA0e.leftMargin);
    }

    private int A03(View view, int[] iArr, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParamsA0e = AbstractC7607F5u.A0e(view);
        int i5 = marginLayoutParamsA0e.leftMargin - iArr[0];
        int i6 = marginLayoutParamsA0e.rightMargin - iArr[1];
        int iMax = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, AbstractC7609F5w.A09(this) + iMax + i2, ((ViewGroup.LayoutParams) marginLayoutParamsA0e).width), ViewGroup.getChildMeasureSpec(i3, AbstractC7609F5w.A0B(this) + marginLayoutParamsA0e.topMargin + marginLayoutParamsA0e.bottomMargin + i4, ((ViewGroup.LayoutParams) marginLayoutParamsA0e).height));
        return view.getMeasuredWidth() + iMax;
    }

    private void A05() {
        A06();
        ActionMenuView actionMenuView = this.A0A;
        if (actionMenuView.A03 == null) {
            C8249FaR c8249FaR = (C8249FaR) actionMenuView.getMenu();
            C8257Fad c8257Fad = this.A0C;
            if (c8257Fad == null) {
                c8257Fad = new C8257Fad(this);
                this.A0C = c8257Fad;
            }
            this.A0A.setExpandedActionViewsExclusive(true);
            c8249FaR.A08(this.A0Q, c8257Fad);
            A0F();
        }
    }

    private void A08(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParamsA0e = AbstractC7607F5u.A0e(view);
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, AbstractC7608F5v.A0A(marginLayoutParamsA0e, AbstractC7609F5w.A09(this)) + i2, ((ViewGroup.LayoutParams) marginLayoutParamsA0e).width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, AbstractC7609F5w.A0B(this) + marginLayoutParamsA0e.topMargin + marginLayoutParamsA0e.bottomMargin, ((ViewGroup.LayoutParams) marginLayoutParamsA0e).height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void A09(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C8318Fbk c8318Fbk = layoutParams == null ? new C8318Fbk(-2) : !checkLayoutParams(layoutParams) ? A04(layoutParams) : (C8318Fbk) layoutParams;
        c8318Fbk.A00 = 1;
        if (!z || this.A04 == null) {
            addView(view, c8318Fbk);
        } else {
            view.setLayoutParams(c8318Fbk);
            this.A0g.add(view);
        }
    }

    private void A0A(List<View> list, int i) {
        boolean zA1Q = AnonymousClass002.A1Q(getLayoutDirection(), 1);
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (!zA1Q) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C8318Fbk c8318Fbk = (C8318Fbk) childAt.getLayoutParams();
                if (c8318Fbk.A00 == 0 && A0C(childAt)) {
                    int i3 = ((AbstractC8339Fc7) c8318Fbk).A00;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = 3;
                        if (layoutDirection == 1) {
                            absoluteGravity2 = 5;
                        }
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        list.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            C8318Fbk c8318Fbk2 = (C8318Fbk) childAt2.getLayoutParams();
            if (c8318Fbk2.A00 == 0 && A0C(childAt2)) {
                int i5 = ((AbstractC8339Fc7) c8318Fbk2).A00;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = 3;
                    if (layoutDirection2 == 1) {
                        absoluteGravity3 = 5;
                    }
                }
                if (absoluteGravity3 == absoluteGravity) {
                    list.add(childAt2);
                }
            }
        }
    }

    private boolean A0B(View view) {
        return view.getParent() == this || this.A0g.contains(view);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayListA0h = C3cG.A0h();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayListA0h.add(menu.getItem(i));
        }
        return arrayListA0h;
    }

    private MenuInflater getMenuInflater() {
        return new C8253FaY(getContext());
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C8318Fbk);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C8318Fbk c8318Fbk = new C8318Fbk(context, attributeSet);
        ((AbstractC8339Fc7) c8318Fbk).A00 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FYT.A01);
        ((AbstractC8339Fc7) c8318Fbk).A00 = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        c8318Fbk.A00 = 0;
        return c8318Fbk;
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        Drawable navigationIcon = getNavigationIcon();
        int contentInsetStart = getContentInsetStart();
        return navigationIcon != null ? AbstractC7608F5v.A06(this.A0J, 0, contentInsetStart) : contentInsetStart;
    }

    public Menu getMenu() {
        A05();
        return this.A0A.getMenu();
    }

    public Drawable getOverflowIcon() {
        A05();
        return this.A0A.getOverflowIcon();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A0F();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.A0f);
        A0F();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHoverEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r4 = r6.getActionMasked()
            r3 = 0
            r2 = 9
            if (r4 != r2) goto Lb
            r5.A0c = r3
        Lb:
            boolean r0 = r5.A0c
            r1 = 1
            if (r0 != 0) goto L1b
            boolean r0 = super.onHoverEvent(r6)
            if (r4 != r2) goto L1b
            if (r0 != 0) goto L1a
            r5.A0c = r1
        L1a:
            return r1
        L1b:
            r0 = 10
            if (r4 == r0) goto L22
            r0 = 3
            if (r4 != r0) goto L1a
        L22:
            r5.A0c = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        int i2;
        super.onRtlPropertiesChanged(i);
        C10449Hii c10449Hii = this.A0B;
        if (c10449Hii == null) {
            c10449Hii = new C10449Hii();
            this.A0B = c10449Hii;
        }
        boolean zA1Q = BV7.A1Q(i);
        if (zA1Q != c10449Hii.A07) {
            c10449Hii.A07 = zA1Q;
            if (c10449Hii.A06) {
                if (zA1Q) {
                    int i3 = c10449Hii.A00;
                    if (i3 == Integer.MIN_VALUE) {
                        i3 = c10449Hii.A01;
                    }
                    c10449Hii.A03 = i3;
                    i2 = c10449Hii.A05;
                } else {
                    int i4 = c10449Hii.A05;
                    if (i4 == Integer.MIN_VALUE) {
                        i4 = c10449Hii.A01;
                    }
                    c10449Hii.A03 = i4;
                    i2 = c10449Hii.A00;
                }
                if (i2 == Integer.MIN_VALUE) {
                }
                c10449Hii.A04 = i2;
            }
            c10449Hii.A03 = c10449Hii.A01;
            i2 = c10449Hii.A02;
            c10449Hii.A04 = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r3 = r5.getActionMasked()
            r2 = 0
            if (r3 != 0) goto L9
            r4.A0d = r2
        L9:
            boolean r0 = r4.A0d
            r1 = 1
            if (r0 != 0) goto L19
            boolean r0 = super.onTouchEvent(r5)
            if (r3 != 0) goto L19
            if (r0 != 0) goto L18
            r4.A0d = r1
        L18:
            return r1
        L19:
            if (r3 == r1) goto L1e
            r0 = 3
            if (r3 != r0) goto L18
        L1e:
            r4.A0d = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            A0D();
        }
        ImageButton imageButton = this.A05;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.A06 == null) {
            this.A06 = new C8178FXu(getContext(), null, 0);
        }
        ImageView imageView = this.A06;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            A07();
        }
        ImageButton imageButton = this.A0U;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            this.A0U.setTooltipText(charSequence);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        A07();
        this.A0U.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        A05();
        this.A0A.setOverflowIcon(drawable);
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.A07;
        if (!zIsEmpty) {
            if (textView == null) {
                Context context = getContext();
                C8165FXh c8165FXh = new C8165FXh(context);
                this.A07 = c8165FXh;
                c8165FXh.setSingleLine();
                this.A07.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.A02;
                if (i != 0) {
                    this.A07.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A0R;
                if (colorStateList != null) {
                    this.A07.setTextColor(colorStateList);
                }
            }
            if (!A0B(this.A07)) {
                A09(this.A07, true);
            }
        } else if (textView != null && A0B(textView)) {
            removeView(this.A07);
            this.A0g.remove(this.A07);
        }
        TextView textView2 = this.A07;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.A0E = charSequence;
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.A08;
        if (!zIsEmpty) {
            if (textView == null) {
                Context context = getContext();
                C8165FXh c8165FXh = new C8165FXh(context);
                this.A08 = c8165FXh;
                c8165FXh.setSingleLine();
                this.A08.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.A03;
                if (i != 0) {
                    this.A08.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A0S;
                if (colorStateList != null) {
                    this.A08.setTextColor(colorStateList);
                }
            }
            if (!A0B(this.A08)) {
                A09(this.A08, true);
            }
        } else if (textView != null && A0B(textView)) {
            removeView(this.A08);
            this.A0g.remove(this.A08);
        }
        TextView textView2 = this.A08;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.A0F = charSequence;
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A01 = 8388627;
        this.A0i = C3cG.A0h();
        this.A0g = C3cG.A0h();
        this.A0j = new int[2];
        this.A0e = new C8419Fdc(new Runnable() { // from class: X.Fbr
            public static final String __redex_internal_original_name = "Toolbar$$ExternalSyntheticLambda1";

            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A0E();
            }
        });
        this.A0G = C3cG.A0h();
        this.A0h = new C8314Fbg(this);
        this.A0f = new RunnableC8297FbM(this);
        Context context2 = getContext();
        int[] iArr = FYT.A0M;
        C8140FWd c8140FWdA00 = C8140FWd.A00(context2, attributeSet, iArr, i, 0);
        TypedArray typedArray = c8140FWdA00.A02;
        saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, 0);
        this.A03 = typedArray.getResourceId(28, 0);
        this.A02 = typedArray.getResourceId(19, 0);
        this.A01 = typedArray.getInteger(0, this.A01);
        this.A00 = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.A0M = dimensionPixelOffset;
        this.A0P = dimensionPixelOffset;
        this.A0N = dimensionPixelOffset;
        this.A0O = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.A0O = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.A0N = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.A0P = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.A0M = dimensionPixelOffset5;
        }
        this.A0K = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        C10449Hii c10449Hii = this.A0B;
        if (c10449Hii == null) {
            c10449Hii = new C10449Hii();
            this.A0B = c10449Hii;
        }
        c10449Hii.A06 = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c10449Hii.A01 = dimensionPixelSize;
            c10449Hii.A03 = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c10449Hii.A02 = dimensionPixelSize2;
            c10449Hii.A04 = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c10449Hii.A00(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.A0J = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.A0I = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.A0T = c8140FWdA00.A02(4);
        this.A0a = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.A0Q = context2;
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableA02 = c8140FWdA00.A02(16);
        if (drawableA02 != null) {
            setNavigationIcon(drawableA02);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableA022 = c8140FWdA00.A02(11);
        if (drawableA022 != null) {
            setLogo(drawableA022);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(c8140FWdA00.A01(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(c8140FWdA00.A01(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        typedArray.recycle();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return A04(layoutParams);
    }

    public void setCollapseContentDescription(int i) {
        CharSequence text;
        if (i != 0) {
            text = getContext().getText(i);
        } else {
            text = null;
        }
        setCollapseContentDescription(text);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(FWf.A01(this, i));
    }

    public void setLogo(int i) {
        setLogo(FWf.A01(this, i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        CharSequence text;
        if (i != 0) {
            text = getContext().getText(i);
        } else {
            text = null;
        }
        setNavigationContentDescription(text);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(FWf.A01(this, i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr._name_removed__res_0x7f0405ae);
    }
}
