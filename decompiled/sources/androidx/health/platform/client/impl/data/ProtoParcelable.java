package androidx.health.platform.client.impl.data;

import X.BV7;
import X.C5322DgG;
import X.C7384Etj;
import X.F0C;
import X.FZO;
import X.GF8;
import X.HoU;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SharedMemory;
import android.system.ErrnoException;
import android.system.OsConstants;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public abstract class ProtoParcelable<T extends GF8> extends HoU<T> implements Parcelable {
    public final F0C A00 = C5322DgG.A01((Function0) new FZO(this, 1));

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws ErrnoException {
        C7384Etj.A0Y(parcel, 0);
        F0C f0c = this.A00;
        if (((byte[]) C7384Etj.A0G(f0c)).length <= 16384) {
            parcel.writeInt(0);
            parcel.writeByteArray((byte[]) C7384Etj.A0G(f0c));
            return;
        }
        parcel.writeInt(1);
        byte[] bArr = (byte[]) C7384Etj.A0G(f0c);
        C7384Etj.A0Y(bArr, 1);
        SharedMemory sharedMemoryCreate = SharedMemory.create("ProtoParcelable", bArr.length);
        try {
            int i2 = OsConstants.PROT_READ;
            sharedMemoryCreate.setProtect(OsConstants.PROT_WRITE | i2);
            sharedMemoryCreate.mapReadWrite().put(bArr);
            sharedMemoryCreate.setProtect(i2);
            sharedMemoryCreate.writeToParcel(parcel, i);
            sharedMemoryCreate.close();
        } finally {
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return !BV7.A1S(((byte[]) C7384Etj.A0G(this.A00)).length, 16384) ? 1 : 0;
    }
}
