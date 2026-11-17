package androidx.room;

import X.AnonymousClass001;
import X.C5297Dfd;
import X.C7384Etj;
import X.EZB;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes5.dex */
public final class MultiInstanceInvalidationClient$invalidationCallback$1 extends Binder implements IMultiInstanceInvalidationCallback {
    public final /* synthetic */ C5297Dfd A00;

    @Override // androidx.room.IMultiInstanceInvalidationCallback
    public final void ATh(String[] strArr) {
        C7384Etj.A0Y(strArr, 0);
        C5297Dfd c5297Dfd = this.A00;
        AnonymousClass001.A1J(new EZB(c5297Dfd, strArr, null, 0), c5297Dfd.A09);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiInstanceInvalidationClient$invalidationCallback$1(C5297Dfd c5297Dfd) {
        this();
        this.A00 = c5297Dfd;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = IMultiInstanceInvalidationCallback.A00;
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface(str);
                if (i == 1) {
                    ATh(parcel.createStringArray());
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }

    public MultiInstanceInvalidationClient$invalidationCallback$1() {
        attachInterface(this, IMultiInstanceInvalidationCallback.A00);
    }
}
