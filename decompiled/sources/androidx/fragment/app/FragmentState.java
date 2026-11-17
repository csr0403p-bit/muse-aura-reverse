package androidx.fragment.app;

import X.AnonymousClass002;
import X.BV4;
import X.C10638I0i;
import X.C60Q;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C10638I0i(18);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final String mClassName;
    public final String mWho;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbA0p = BV4.A0p(128);
        sbA0p.append("FragmentState{");
        sbA0p.append(this.mClassName);
        sbA0p.append(" (");
        sbA0p.append(this.mWho);
        sbA0p.append(")}:");
        if (this.A07) {
            sbA0p.append(" fromLayout");
        }
        if (this.A09) {
            sbA0p.append(" dynamicContainer");
        }
        int i = this.A00;
        if (i != 0) {
            sbA0p.append(" id=0x");
            BV4.A1N(sbA0p, i);
        }
        String str = this.A04;
        if (str != null && !str.isEmpty()) {
            sbA0p.append(" tag=");
            sbA0p.append(str);
        }
        if (this.A0B) {
            sbA0p.append(" retainInstance");
        }
        if (this.A0A) {
            sbA0p.append(" removing");
        }
        if (this.A06) {
            sbA0p.append(" detached");
        }
        if (this.A08) {
            sbA0p.append(" hidden");
        }
        String str2 = this.A05;
        if (str2 != null) {
            sbA0p.append(" targetWho=");
            sbA0p.append(str2);
            sbA0p.append(" targetRequestCode=");
            sbA0p.append(this.A03);
        }
        if (this.A0C) {
            sbA0p.append(" userVisibleHint");
        }
        return sbA0p.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mClassName);
        parcel.writeString(this.mWho);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A0C ? 1 : 0);
    }

    public FragmentState(Parcel parcel) {
        this.mClassName = parcel.readString();
        this.mWho = parcel.readString();
        this.A07 = AnonymousClass002.A1L(parcel.readInt());
        this.A09 = AnonymousClass002.A1L(parcel.readInt());
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A04 = parcel.readString();
        this.A0B = AnonymousClass002.A1L(parcel.readInt());
        this.A0A = AnonymousClass002.A1L(parcel.readInt());
        this.A06 = AnonymousClass002.A1L(parcel.readInt());
        this.A08 = AnonymousClass002.A1L(parcel.readInt());
        this.A02 = parcel.readInt();
        this.A05 = parcel.readString();
        this.A03 = parcel.readInt();
        this.A0C = parcel.readInt() != 0;
    }

    public FragmentState(Fragment fragment) {
        this.mClassName = C60Q.A0e(fragment);
        this.mWho = fragment.mWho;
        this.A07 = fragment.mFromLayout;
        this.A09 = fragment.mInDynamicContainer;
        this.A01 = fragment.mFragmentId;
        this.A00 = fragment.mContainerId;
        this.A04 = fragment.mTag;
        this.A0B = fragment.mRetainInstance;
        this.A0A = fragment.mRemoving;
        this.A06 = fragment.mDetached;
        this.A08 = fragment.mHidden;
        this.A02 = fragment.mMaxState.ordinal();
        this.A05 = fragment.mTargetWho;
        this.A03 = fragment.mTargetRequestCode;
        this.A0C = fragment.mUserVisibleHint;
    }
}
