package androidx.fragment.app;

import X.AnonymousClass002;
import X.C10638I0i;
import X.C3cG;
import X.C60O;
import X.C8573FgU;
import X.C8598Fh0;
import X.FgY;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new C10638I0i(14);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final CharSequence A04;
    public final CharSequence A05;
    public final String A06;
    public final ArrayList<String> A07;
    public final ArrayList<String> A08;
    public final ArrayList<String> A09;
    public final boolean A0A;
    public final int[] A0B;
    public final int[] A0C;
    public final int[] A0D;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.A0D);
        parcel.writeStringList(this.A07);
        parcel.writeIntArray(this.A0C);
        parcel.writeIntArray(this.A0B);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        TextUtils.writeToParcel(this.A05, parcel, 0);
        parcel.writeInt(this.A00);
        TextUtils.writeToParcel(this.A04, parcel, 0);
        parcel.writeStringList(this.A08);
        parcel.writeStringList(this.A09);
        parcel.writeInt(this.A0A ? 1 : 0);
    }

    public BackStackRecordState(C8573FgU c8573FgU) {
        ArrayList<C8598Fh0> arrayList = c8573FgU.A0B;
        int size = arrayList.size();
        int[] iArr = new int[size * 6];
        this.A0D = iArr;
        if (!c8573FgU.A0E) {
            throw C3cG.A0Q("Not on back stack");
        }
        ArrayList<String> arrayListA11 = C60O.A11(size);
        this.A07 = arrayListA11;
        int[] iArr2 = new int[size];
        this.A0C = iArr2;
        int[] iArr3 = new int[size];
        this.A0B = iArr3;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C8598Fh0 c8598Fh0 = arrayList.get(i2);
            int i3 = i + 1;
            iArr[i] = c8598Fh0.A00;
            Fragment fragment = c8598Fh0.A05;
            arrayListA11.add(fragment != null ? fragment.mWho : null);
            iArr[i3] = c8598Fh0.A08 ? 1 : 0;
            iArr[i + 2] = c8598Fh0.A01;
            iArr[i + 3] = c8598Fh0.A02;
            int i4 = i + 5;
            iArr[i + 4] = c8598Fh0.A03;
            i += 6;
            iArr[i4] = c8598Fh0.A04;
            iArr2[i2] = c8598Fh0.A07.ordinal();
            iArr3[i2] = c8598Fh0.A06.ordinal();
        }
        this.A03 = c8573FgU.A06;
        this.A06 = c8573FgU.A09;
        this.A02 = c8573FgU.A00;
        this.A01 = ((FgY) c8573FgU).A01;
        this.A05 = c8573FgU.A08;
        this.A00 = ((FgY) c8573FgU).A00;
        this.A04 = c8573FgU.A07;
        this.A08 = c8573FgU.A0C;
        this.A09 = c8573FgU.A0D;
        this.A0A = c8573FgU.A0G;
    }

    public BackStackRecordState(Parcel parcel) {
        this.A0D = parcel.createIntArray();
        this.A07 = parcel.createStringArrayList();
        this.A0C = parcel.createIntArray();
        this.A0B = parcel.createIntArray();
        this.A03 = parcel.readInt();
        this.A06 = parcel.readString();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.A05 = (CharSequence) creator.createFromParcel(parcel);
        this.A00 = parcel.readInt();
        this.A04 = (CharSequence) creator.createFromParcel(parcel);
        this.A08 = parcel.createStringArrayList();
        this.A09 = parcel.createStringArrayList();
        this.A0A = AnonymousClass002.A1L(parcel.readInt());
    }
}
