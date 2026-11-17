package android.support.v4.media.session;

import X.AnonymousClass006;
import X.C10638I0i;
import X.C3cG;
import X.E1K;
import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* loaded from: classes6.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new C10638I0i(6);
    public IMediaSession A00;
    public final Object A02;
    public final Object A03 = C3cG.A0T();
    public E1K A01 = null;

    public MediaSessionCompat$Token(IMediaSession iMediaSession, Object obj) {
        this.A02 = obj;
        this.A00 = iMediaSession;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MediaSessionCompat$Token) {
                Object obj2 = this.A02;
                Object obj3 = ((MediaSessionCompat$Token) obj).A02;
                if (obj2 == null) {
                    if (obj3 == null) {
                    }
                } else if (obj3 != null) {
                    return obj2.equals(obj3);
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return AnonymousClass006.A0D(this.A02);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) this.A02, i);
    }
}
