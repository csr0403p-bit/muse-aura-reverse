package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.facebook.aura.R;

/* loaded from: classes6.dex */
public final class FYK extends C8167FXj {
    public final Rect A00;
    public final AccessibilityManager A01;
    public final FZZ A02;

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.A01;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.A02.Afd();
        }
    }

    public FYK(Context context, AttributeSet attributeSet) {
        super(AbstractC8218FZl.A00(context, attributeSet, R.attr._name_removed__res_0x7f04005a, 0), attributeSet, R.attr._name_removed__res_0x7f04005a);
        this.A00 = AbstractC7607F5u.A0X();
        Context context2 = getContext();
        TypedArray typedArrayA00 = FW7.A00(context2, attributeSet, FX0.A06, R.attr._name_removed__res_0x7f04005a, R.style._name_removed__res_0x7f1300de);
        if (typedArrayA00.hasValue(0) && typedArrayA00.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.A01 = AbstractC7608F5v.A0F(context2);
        FZZ fzz = new FZZ(context2, null, R.attr._name_removed__res_0x7f04034b, 0);
        this.A02 = fzz;
        fzz.A0D = true;
        PopupWindow popupWindow = fzz.A09;
        popupWindow.setFocusable(true);
        fzz.A06 = this;
        popupWindow.setInputMethodMode(2);
        fzz.Aci(getAdapter());
        fzz.A07 = new FYP(this);
        typedArrayA00.recycle();
    }

    public static void A00(FYK fyk, Object obj) {
        fyk.setText(fyk.convertSelectionToString(obj), false);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        ViewParent parent = getParent();
        while (true) {
            if (parent == null) {
                break;
            }
            if (0 == 0) {
                parent = parent.getParent();
            } else if (0 != 0) {
                throw new NullPointerException("isProvidingHint");
            }
        }
        return super.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (0 != 0) {
                if (0 != 0) {
                    throw new NullPointerException("isProvidingHint");
                }
                return;
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            for (ViewParent parent = getParent(); parent != null && 0 == 0; parent = parent.getParent()) {
            }
            int i3 = 0;
            if (adapter == null || 0 == 0) {
                setMeasuredDimension(Math.min(Math.max(measuredWidth, 0), View.MeasureSpec.getSize(i)), getMeasuredHeight());
                return;
            }
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
            FZZ fzz = this.A02;
            PopupWindow popupWindow = fzz.A09;
            int iMin = Math.min(adapter.getCount(), Math.max(0, !popupWindow.isShowing() ? -1 : fzz.A0A.getSelectedItemPosition()) + 15);
            View view = null;
            int iMax = 0;
            for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                int itemViewType = adapter.getItemViewType(iMax2);
                if (itemViewType != i3) {
                    view = null;
                    i3 = itemViewType;
                }
                view = adapter.getView(iMax2, view, null);
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                }
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                iMax = Math.max(iMax, view.getMeasuredWidth());
            }
            Drawable background = popupWindow.getBackground();
            if (background != null) {
                background.getPadding(this.A00);
            }
            throw new NullPointerException("endIconView");
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.A02.Aci(getAdapter());
    }
}
