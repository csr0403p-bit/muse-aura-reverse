package android.support.v4.media.session;

import X.AbstractC7609F5w;
import X.BV6;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;

/* loaded from: classes6.dex */
public interface IMediaControllerCallback extends IInterface {

    public abstract class Stub extends Binder implements IMediaControllerCallback {

        public final class Proxy implements IMediaControllerCallback {
            public IBinder A00;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.A00;
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public final void AUh(PlaybackStateCompat playbackStateCompat) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (playbackStateCompat != null) {
                        parcelObtain.writeInt(1);
                        playbackStateCompat.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.A00.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    switch (i) {
                        case 1:
                            parcel.readString();
                            AbstractC7609F5w.A17(parcel, Bundle.CREATOR);
                            break;
                        case 2:
                            throw BV6.A0f();
                        case 3:
                            AUh(parcel.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcel) : null);
                            return true;
                        case 4:
                            AbstractC7609F5w.A17(parcel, MediaMetadataCompat.CREATOR);
                            throw BV6.A0f();
                        case 5:
                            parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR);
                            throw BV6.A0f();
                        case 6:
                            AbstractC7609F5w.A17(parcel, TextUtils.CHAR_SEQUENCE_CREATOR);
                            throw BV6.A0f();
                        case 7:
                            AbstractC7609F5w.A17(parcel, Bundle.CREATOR);
                            throw BV6.A0f();
                        case 8:
                            AbstractC7609F5w.A17(parcel, ParcelableVolumeInfo.CREATOR);
                            throw BV6.A0f();
                        case 9:
                        case 11:
                        case 12:
                            parcel.readInt();
                            break;
                        case 10:
                            parcel.readInt();
                            return true;
                    }
                    ((MediaControllerCompat$MediaControllerImplApi21$ExtraCallback) this).A00.get();
                    return true;
                }
                if (i == 1598968902) {
                    parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                    return true;
                }
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public Stub() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }
    }

    void AUh(PlaybackStateCompat playbackStateCompat);
}
