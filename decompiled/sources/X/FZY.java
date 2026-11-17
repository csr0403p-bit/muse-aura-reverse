package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.widget.AppCompatSpinner$SavedState;

/* loaded from: classes6.dex */
public final class FZY extends Spinner {
    public static final int[] A08 = {R.attr.spinnerMode};
    public int A00;
    public SpinnerAdapter A01;
    public InterfaceC8216FZj A02;
    public FYM A03;
    public final Context A04;
    public final Rect A05;
    public final C8173FXp A06;
    public final boolean A07;

    public final int A00(Drawable drawable, SpinnerAdapter spinnerAdapter) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iA0D = AbstractC7607F5u.A0D(iMax, 15 - (iMin - iMax), 0); iA0D < iMin; iA0D++) {
            int itemViewType = spinnerAdapter.getItemViewType(iA0D);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iA0D, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.A05;
        drawable.getPadding(rect);
        return iMax2 + rect.left + rect.right;
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC8216FZj interfaceC8216FZj = this.A02;
        return interfaceC8216FZj != null ? interfaceC8216FZj.AGH() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC8216FZj interfaceC8216FZj = this.A02;
        return interfaceC8216FZj != null ? interfaceC8216FZj.AMc() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.A02 != null ? this.A00 : super.getDropDownWidth();
    }

    public final InterfaceC8216FZj getInternalPopup() {
        return this.A02;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC8216FZj interfaceC8216FZj = this.A02;
        return interfaceC8216FZj != null ? interfaceC8216FZj.ACj() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.A04;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC8216FZj interfaceC8216FZj = this.A02;
        return interfaceC8216FZj != null ? interfaceC8216FZj.AGG() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C8173FXp c8173FXp = this.A06;
        if (c8173FXp != null) {
            return C8173FXp.A00(c8173FXp);
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C8173FXp c8173FXp = this.A06;
        if (c8173FXp != null) {
            return C8173FXp.A01(c8173FXp);
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = (AppCompatSpinner$SavedState) parcelable;
        super.onRestoreInstanceState(appCompatSpinner$SavedState.getSuperState());
        if (!appCompatSpinner$SavedState.A00 || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new I14(this, 2));
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FYM fym = this.A03;
        if (fym == null || !fym.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC8216FZj interfaceC8216FZj = this.A02;
        if (interfaceC8216FZj == null) {
            return super.performClick();
        }
        if (interfaceC8216FZj.AP1()) {
            return true;
        }
        interfaceC8216FZj.Afe(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.A07) {
            this.A01 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC8216FZj interfaceC8216FZj = this.A02;
        if (interfaceC8216FZj != null) {
            Context context = this.A04;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C8219FZm c8219FZm = new C8219FZm();
            c8219FZm.A01 = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c8219FZm.A00 = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (!Ht0.A00(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            }
            interfaceC8216FZj.Aci(c8219FZm);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC8216FZj interfaceC8216FZj = this.A02;
        if (interfaceC8216FZj == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            interfaceC8216FZj.AdV(i);
            interfaceC8216FZj.AdU(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC8216FZj interfaceC8216FZj = this.A02;
        if (interfaceC8216FZj != null) {
            interfaceC8216FZj.AfB(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.A02 != null) {
            this.A00 = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC8216FZj interfaceC8216FZj = this.A02;
        if (interfaceC8216FZj != null) {
            interfaceC8216FZj.Acs(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(FWf.A00(this.A04, i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC8216FZj interfaceC8216FZj = this.A02;
        if (interfaceC8216FZj != null) {
            interfaceC8216FZj.AeH(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C8173FXp c8173FXp = this.A06;
        if (c8173FXp != null) {
            c8173FXp.A05(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C8173FXp c8173FXp = this.A06;
        if (c8173FXp != null) {
            c8173FXp.A06(mode);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FZY(android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r10 = this;
            r6 = 2130969831(0x7f0404e7, float:1.7548355E38)
            r5 = 0
            r9 = -1
            r10.<init>(r11, r12, r6)
            android.graphics.Rect r0 = X.AbstractC7607F5u.A0X()
            r10.A05 = r0
            X.AbstractC7608F5v.A1D(r10)
            int[] r8 = X.FYT.A0K
            r4 = 0
            X.FWd r1 = X.C8140FWd.A00(r11, r12, r8, r6, r4)
            X.FXp r0 = new X.FXp
            r0.<init>(r10)
            r10.A06 = r0
            r0 = 4
            android.content.res.TypedArray r3 = r1.A02
            int r1 = r3.getResourceId(r0, r4)
            if (r1 == 0) goto L32
            X.Fas r0 = new X.Fas
            r0.<init>(r11)
            r0.A00 = r1
            r10.A04 = r0
            goto L34
        L32:
            r10.A04 = r11
        L34:
            int[] r0 = X.FZY.A08     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            android.content.res.TypedArray r7 = r11.obtainStyledAttributes(r12, r0, r6, r4)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            boolean r0 = r7.hasValue(r4)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> Lc7
            if (r0 == 0) goto L54
            int r9 = r7.getInt(r4, r4)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> Lc7
            goto L54
        L45:
            r2 = move-exception
            goto L4b
        L47:
            r0 = move-exception
            throw r0
        L49:
            r2 = move-exception
            r7 = r5
        L4b:
            java.lang.String r1 = "AppCompatSpinner"
            java.lang.String r0 = "Could not read android:spinnerMode"
            android.util.Log.i(r1, r0, r2)     // Catch: java.lang.Throwable -> Lc7
            if (r7 == 0) goto L57
        L54:
            r7.recycle()
        L57:
            r2 = 1
            if (r9 == 0) goto Lb8
            if (r9 != r2) goto L8d
            android.content.Context r0 = r10.A04
            X.FZa r7 = new X.FZa
            r7.<init>(r0, r12, r10)
            android.content.Context r0 = r10.A04
            X.FWd r9 = X.C8140FWd.A00(r0, r12, r8, r6, r4)
            r8 = 3
            r0 = -2
            android.content.res.TypedArray r1 = r9.A02
            int r0 = r1.getLayoutDimension(r8, r0)
            r10.A00 = r0
            android.graphics.drawable.Drawable r0 = r9.A02(r2)
            r7.Acs(r0)
            r0 = 2
            java.lang.String r0 = r3.getString(r0)
            r7.A02 = r0
            r1.recycle()
            r10.A02 = r7
            X.FZk r0 = new X.FZk
            r0.<init>(r10, r7, r10)
            r10.A03 = r0
        L8d:
            java.lang.CharSequence[] r4 = r3.getTextArray(r4)
            if (r4 == 0) goto La4
            r0 = 17367048(0x1090008, float:2.5162948E-38)
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r1.<init>(r11, r0, r4)
            r0 = 2131559247(0x7f0d034f, float:1.8743833E38)
            r1.setDropDownViewResource(r0)
            r10.setAdapter(r1)
        La4:
            r3.recycle()
            r10.A07 = r2
            android.widget.SpinnerAdapter r0 = r10.A01
            if (r0 == 0) goto Lb2
            r10.setAdapter(r0)
            r10.A01 = r5
        Lb2:
            X.FXp r0 = r10.A06
            r0.A07(r12, r6)
            return
        Lb8:
            X.FZd r1 = new X.FZd
            r1.<init>(r10)
            r10.A02 = r1
            r0 = 2
            java.lang.String r0 = r3.getString(r0)
            r1.A01 = r0
            goto L8d
        Lc7:
            r0 = move-exception
            if (r7 == 0) goto Lcd
            r7.recycle()
        Lcd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FZY.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C8173FXp c8173FXp = this.A06;
        if (c8173FXp != null) {
            c8173FXp.A02();
        }
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC8216FZj interfaceC8216FZj = this.A02;
        if (interfaceC8216FZj == null || !interfaceC8216FZj.AP1()) {
            return;
        }
        interfaceC8216FZj.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A02 == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), A00(getBackground(), getAdapter())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Parcelable onSaveInstanceState() {
        /*
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            androidx.appcompat.widget.AppCompatSpinner$SavedState r2 = new androidx.appcompat.widget.AppCompatSpinner$SavedState
            r2.<init>(r0)
            X.FZj r0 = r3.A02
            if (r0 == 0) goto L14
            boolean r1 = r0.AP1()
            r0 = 1
            if (r1 != 0) goto L15
        L14:
            r0 = 0
        L15:
            r2.A00 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FZY.onSaveInstanceState():android.os.Parcelable");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C8173FXp c8173FXp = this.A06;
        if (c8173FXp != null) {
            c8173FXp.A03();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C8173FXp c8173FXp = this.A06;
        if (c8173FXp != null) {
            c8173FXp.A04(i);
        }
    }
}
