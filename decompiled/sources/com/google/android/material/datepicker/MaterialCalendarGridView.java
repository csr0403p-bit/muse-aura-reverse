package com.google.android.material.datepicker;

import X.AbstractC7609F5w;
import X.AbstractC8060FRo;
import X.BV4;
import X.BV5;
import X.FWM;
import X.FZ1;
import X.I0C;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.facebook.aura.R;
import java.util.Calendar;

/* loaded from: classes6.dex */
public final class MaterialCalendarGridView extends GridView {
    public final Calendar A00;
    public final boolean A01;

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int iA00;
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            Month month = ((FZ1) super.getAdapter()).A02;
            iA00 = (month.A00() + month.A01) - 1;
        } else {
            if (i != 130) {
                super.onFocusChanged(true, i, rect);
                return;
            }
            iA00 = ((FZ1) super.getAdapter()).A02.A00();
        }
        setSelection(iA00);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.A01) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof FZ1)) {
            throw BV5.A0T("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), FZ1.class.getCanonicalName()});
        }
        super.setAdapter(listAdapter);
    }

    public final FZ1 A00() {
        return (FZ1) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final /* bridge */ /* synthetic */ Adapter getAdapter() {
        return super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((BaseAdapter) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        FZ1 fz1 = (FZ1) super.getAdapter();
        fz1.getItem(fz1.A02.A00());
        fz1.getItem((r2.A00() + r2.A01) - 1);
        throw BV4.A0a("getSelectedRanges");
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (super.onKeyDown(i, keyEvent)) {
            if (getSelectedItemPosition() != -1 && getSelectedItemPosition() < ((FZ1) super.getAdapter()).A02.A00()) {
                if (19 == i) {
                    setSelection(((FZ1) super.getAdapter()).A02.A00());
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((FZ1) super.getAdapter()).A02.A00()) {
            super.setSelection(((FZ1) super.getAdapter()).A02.A00());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        this.A00 = AbstractC7609F5w.A0y();
        Context context2 = getContext();
        if (MaterialDatePicker.A00(context2)) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(FWM.A00(context2, MaterialCalendar.class.getCanonicalName(), R.attr._name_removed__res_0x7f0403c4), new int[]{R.attr._name_removed__res_0x7f040410});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        this.A01 = z;
        AbstractC8060FRo.A06(this, new I0C(this, 5));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final /* bridge */ /* synthetic */ ListAdapter getAdapter() {
        return super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final /* bridge */ /* synthetic */ void setAdapter(Adapter adapter) {
        setAdapter((ListAdapter) adapter);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
