package androidx.media3.common;

import X.AbstractC5400Dhr;
import X.AbstractC6161Dx4;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C6xC;
import X.C7580F4t;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new C7580F4t(10);
    public int A00;
    public final int A01;
    public final String A02;
    public final SchemeData[] A03;

    public final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new C7580F4t(11);
        public int A00;
        public final String A01;
        public final String A02;
        public final UUID A03;
        public final byte[] A04;

        public final boolean A00(UUID uuid) {
            UUID uuid2 = AbstractC5400Dhr.A03;
            UUID uuid3 = this.A03;
            return uuid2.equals(uuid3) || uuid.equals(uuid3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof SchemeData) {
                if (obj != this) {
                    SchemeData schemeData = (SchemeData) obj;
                    if (!C6xC.A00(this.A01, schemeData.A01) || !C6xC.A00(this.A02, schemeData.A02) || !C6xC.A00(this.A03, schemeData.A03) || !Arrays.equals(this.A04, schemeData.A04)) {
                    }
                }
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i = this.A00;
            if (i != 0) {
                return i;
            }
            int iA0I = AnonymousClass005.A0I(this.A02, (AnonymousClass005.A0E(this.A03) + AnonymousClass006.A0G(this.A01)) * 31) + Arrays.hashCode(this.A04);
            this.A00 = iA0I;
            return iA0I;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            UUID uuid = this.A03;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.A01);
            parcel.writeString(this.A02);
            parcel.writeByteArray(this.A04);
        }

        public SchemeData(Parcel parcel) {
            this.A03 = new UUID(parcel.readLong(), parcel.readLong());
            this.A01 = parcel.readString();
            this.A02 = parcel.readString();
            this.A04 = parcel.createByteArray();
        }

        public SchemeData(String str, String str2, UUID uuid, byte[] bArr) {
            this.A03 = uuid;
            this.A01 = str;
            str2.getClass();
            this.A02 = AbstractC6161Dx4.A06(str2);
            this.A04 = bArr;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                DrmInitData drmInitData = (DrmInitData) obj;
                if (!C6xC.A00(this.A02, drmInitData.A02) || !Arrays.equals(this.A03, drmInitData.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final DrmInitData A00(String str) {
        return C6xC.A00(this.A02, str) ? this : new DrmInitData(str, this.A03, false);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(SchemeData schemeData, SchemeData schemeData2) {
        UUID uuid = AbstractC5400Dhr.A03;
        UUID uuid2 = schemeData.A03;
        boolean zEquals = uuid.equals(uuid2);
        UUID uuid3 = schemeData2.A03;
        return zEquals ? uuid.equals(uuid3) ? 0 : 1 : uuid2.compareTo(uuid3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int iA0G = (AnonymousClass006.A0G(this.A02) * 31) + Arrays.hashCode(this.A03);
        this.A00 = iA0G;
        return iA0G;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeTypedArray(this.A03, 0);
    }

    public DrmInitData(Parcel parcel) {
        this.A02 = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        this.A03 = schemeDataArr;
        this.A01 = schemeDataArr.length;
    }

    public DrmInitData(String str, SchemeData[] schemeDataArr, boolean z) {
        this.A02 = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.A03 = schemeDataArr;
        this.A01 = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }
}
