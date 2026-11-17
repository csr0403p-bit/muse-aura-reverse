package X;

import android.media.MediaCodec;

/* loaded from: classes5.dex */
public final /* synthetic */ class CGY implements InterfaceC2349BUy, InterfaceC2983Bqs {
    public static final CGY A00 = new CGY();

    @Override // X.InterfaceC2983Bqs
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        MediaCodec mediaCodec = (MediaCodec) obj;
        C7384Etj.A0Y(mediaCodec, 0);
        mediaCodec.detachOutputSurface();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC2983Bqs) && (obj instanceof InterfaceC2349BUy)) {
            return C3cI.A1V(obj, getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC2349BUy
    public final Ht9<?> getFunctionDelegate() {
        return new C7438Evz(1, MediaCodec.class, "detachOutputSurface", "detachOutputSurface()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
