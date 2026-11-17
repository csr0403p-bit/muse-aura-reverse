package com.google.android.material.internal;

import X.AbstractC8060FRo;
import X.C8177FXt;
import X.I0C;
import X.I15;
import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes6.dex */
public class CheckableImageButton extends C8177FXt implements Checkable {
    public static final int[] A03 = {R.attr.state_checked};
    public boolean A00;
    public boolean A01;
    public boolean A02;

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new I15(7);
        public boolean A00;

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00 ? 1 : 0);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.A02;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (!this.A02) {
            return super.onCreateDrawableState(i);
        }
        return View.mergeDrawableStates(super.onCreateDrawableState(i + 1), A03);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(((AbsSavedState) savedState).A00);
        setChecked(savedState.A00);
    }

    public void setCheckable(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.A00 || this.A02 == z) {
            return;
        }
        this.A02 = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.A01 = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.A01) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.A02);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.A00 = this.A02;
        return savedState;
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = true;
        this.A01 = true;
        AbstractC8060FRo.A06(this, new I0C(this, 6));
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.facebook.aura.R.attr._name_removed__res_0x7f04029c);
    }
}
