package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.ApiMetadata;

/* renamed from: X.Cqh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4233Cqh implements Parcelable.Creator {
    public static final C4233Cqh A01 = new C4233Cqh(C4158CoD.A03(19));
    public final Parcelable.Creator A00;

    public C4233Cqh(Parcelable.Creator creator) {
        this.A00 = creator;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        if (parcel.readInt() == -204102970) {
            return C4158CoD.A04(parcel);
        }
        parcel.setDataPosition(iDataPosition - 4);
        return ApiMetadata.A01;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ApiMetadata[i];
    }
}
