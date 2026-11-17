package android.support.v4.media.session;

import X.AbstractC7609F5w;
import X.BV4;
import X.C8853FrI;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class MediaSessionCompat$MediaSessionImplApi21$ExtraSession extends Binder implements IMediaSession {
    public final AtomicReference<C8853FrI> A00;

    public static AssertionError A00(Parcel parcel) {
        A01(parcel, Bundle.CREATOR);
        return new AssertionError();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0150  */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTransact(int r26, android.os.Parcel r27, android.os.Parcel r28, int r29) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21$ExtraSession.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public MediaSessionCompat$MediaSessionImplApi21$ExtraSession() {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(Landroid/os/Parcel;Landroid/os/Parcelable$Creator<TT;>;)TT; */
    public static void A01(Parcel parcel, Parcelable.Creator creator) {
        AbstractC7609F5w.A17(parcel, creator);
    }

    public MediaSessionCompat$MediaSessionImplApi21$ExtraSession(C8853FrI c8853FrI) {
        this();
        this.A00 = BV4.A16(c8853FrI);
    }
}
