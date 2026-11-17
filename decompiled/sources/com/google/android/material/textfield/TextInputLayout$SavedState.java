package com.google.android.material.textfield;

import X.AbstractC7609F5w;
import X.BV7;
import X.BV8;
import X.C60O;
import X.I15;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes6.dex */
public final class TextInputLayout$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<TextInputLayout$SavedState> CREATOR = new I15(8);
    public CharSequence A00;
    public CharSequence A01;
    public CharSequence A02;
    public CharSequence A03;
    public boolean A04;

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("TextInputLayout.SavedState{");
        AbstractC7609F5w.A1K(sbA0x, this);
        sbA0x.append(" error=");
        sbA0x.append((Object) this.A00);
        sbA0x.append(" hint=");
        sbA0x.append((Object) this.A02);
        sbA0x.append(" helperText=");
        sbA0x.append((Object) this.A01);
        sbA0x.append(" placeholderText=");
        return BV8.A0v(this.A03, sbA0x);
    }

    public TextInputLayout$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.A00 = (CharSequence) creator.createFromParcel(parcel);
        this.A04 = BV7.A1Q(parcel.readInt());
        this.A02 = (CharSequence) creator.createFromParcel(parcel);
        this.A01 = (CharSequence) creator.createFromParcel(parcel);
        this.A03 = (CharSequence) creator.createFromParcel(parcel);
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.A00, parcel, i);
        parcel.writeInt(this.A04 ? 1 : 0);
        TextUtils.writeToParcel(this.A02, parcel, i);
        TextUtils.writeToParcel(this.A01, parcel, i);
        TextUtils.writeToParcel(this.A03, parcel, i);
    }
}
