package com.google.firebase.iid;

import X.BV4;
import X.C4157CoC;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class zzm implements Parcelable {
    public static final Parcelable.Creator<zzm> CREATOR = C4157CoC.A00(63);
    public Messenger A00;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.A00;
            if (messenger == null) {
                throw BV4.A0a("asBinder");
            }
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((zzm) obj).A00;
            if (messenger2 != null) {
                return binder.equals(messenger2.getBinder());
            }
            throw BV4.A0a("asBinder");
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        Messenger messenger = this.A00;
        if (messenger != null) {
            return messenger.getBinder().hashCode();
        }
        throw BV4.A0a("asBinder");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.A00;
        if (messenger == null) {
            throw BV4.A0a("asBinder");
        }
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
