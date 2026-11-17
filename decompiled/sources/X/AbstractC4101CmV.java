package X;

import android.os.Parcel;
import android.os.SharedMemory;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.CmV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4101CmV {
    public static final <U> U A00(Parcel parcel, G0U<? super byte[], ? extends U> g0u) throws IOException {
        Closeable closeable = (Closeable) SharedMemory.CREATOR.createFromParcel(parcel);
        try {
            ByteBuffer byteBufferMapReadOnly = ((SharedMemory) closeable).mapReadOnly();
            C7384Etj.A0U(byteBufferMapReadOnly);
            U uInvoke = g0u.invoke(BV5.A1X(byteBufferMapReadOnly));
            if (closeable != null) {
                closeable.close();
            }
            return uInvoke;
        } finally {
        }
    }
}
