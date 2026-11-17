package org.webrtc;

import X.BV4;
import X.BV6;
import X.BV8;
import X.C60O;
import X.C8j3;
import X.FGI;
import com.facebook.aura.commands.invite.InviteUpsellHandlerKt;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public class YuvHelper {

    public interface Natives {
        void abgrToI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6);

        void copyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4);

        void i420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8);

        void i420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8, int i9);

        void i420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = (i5 + 1) / 2;
        int i11 = i6 * i5;
        int i12 = i6 * i7;
        int i13 = (i8 * i10) + i12;
        int i14 = (i8 * i9) + i12;
        int i15 = ((i10 - 1) * i8) + i14 + ((i4 + 1) / 2);
        if (byteBuffer4.capacity() < i15) {
            throw C8j3.A0v("Expected destination buffer capacity to be at least ", " was ", i15, byteBuffer4.capacity());
        }
        byteBuffer4.limit(i11);
        ByteBuffer byteBufferA0t = BV6.A0t(byteBuffer4, 0);
        byteBuffer4.limit(i13);
        ByteBuffer byteBufferA0t2 = BV6.A0t(byteBuffer4, i12);
        byteBuffer4.limit(i15);
        I420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBufferA0t, i6, byteBufferA0t2, i8, BV6.A0t(byteBuffer4, i14), i8, i4, i5);
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6) {
        BV8.A1K(byteBuffer, byteBuffer2, byteBuffer3);
        checkNotNull(byteBuffer4, "dst");
        int i7 = i5;
        int i8 = i4;
        if (i6 % 180 == 0) {
            i7 = i8;
            i8 = i5;
        }
        int i9 = (i8 + 1) / 2;
        int i10 = (i7 + 1) / 2;
        int i11 = i8 * i7;
        int i12 = i9 * i10;
        int i13 = (i12 * 2) + i11;
        if (byteBuffer4.capacity() < i13) {
            throw C8j3.A0v("Expected destination buffer capacity to be at least ", " was ", i13, byteBuffer4.capacity());
        }
        YuvHelperJni.get().i420Rotate(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, BV6.A0t(byteBuffer4, 0), i7, BV6.A0t(byteBuffer4, i11), i10, BV6.A0t(byteBuffer4, i12 + i11), i10, i4, i5, i6);
    }

    public static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw BV4.A0a(FGI.A0M(str, " should not be null"));
    }

    public static void ABGRToI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6) {
        Natives natives = YuvHelperJni.get();
        checkNotNull(byteBuffer, InviteUpsellHandlerKt.SRC_PARAM);
        checkNotNull(byteBuffer2, "dstY");
        checkNotNull(byteBuffer3, "dstU");
        checkNotNull(byteBuffer4, "dstV");
        natives.abgrToI420(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, i5, i6);
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7) {
        BV8.A1K(byteBuffer, byteBuffer2, byteBuffer3);
        checkNotNull(byteBuffer4, "dstY");
        checkNotNull(byteBuffer5, "dstUV");
        if (i6 <= 0 || i7 <= 0) {
            throw C60O.A0i("I420ToNV12: width and height should not be negative");
        }
        YuvHelperJni.get().i420ToNV12(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, i6, i7);
    }

    public static void copyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4) {
        Natives natives = YuvHelperJni.get();
        checkNotNull(byteBuffer, InviteUpsellHandlerKt.SRC_PARAM);
        checkNotNull(byteBuffer2, "dst");
        natives.copyPlane(byteBuffer, i, byteBuffer2, i2, i3, i4);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6, int i7) {
        I420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, i5, i6, i7, (i6 + 1) / 2, (i7 + 1) / 2);
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8, int i9) {
        BV8.A1K(byteBuffer, byteBuffer2, byteBuffer3);
        checkNotNull(byteBuffer4, "dstY");
        checkNotNull(byteBuffer5, "dstU");
        checkNotNull(byteBuffer6, "dstV");
        YuvHelperJni.get().i420Rotate(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, byteBuffer6, i6, i7, i8, i9);
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6, int i7) {
        int i8 = (i4 + 1) / 2;
        int i9 = i6 * i5;
        int i10 = i6 * i7;
        int i11 = (((i5 + 1) / 2) * i8 * 2) + i10;
        if (byteBuffer4.capacity() >= i11) {
            byteBuffer4.limit(i9);
            ByteBuffer byteBufferA0t = BV6.A0t(byteBuffer4, 0);
            byteBuffer4.limit(i11);
            I420ToNV12(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBufferA0t, i6, BV6.A0t(byteBuffer4, i10), i8 * 2, i4, i5);
            return;
        }
        throw C8j3.A0v("Expected destination buffer capacity to be at least ", " was ", i11, byteBuffer4.capacity());
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8) {
        BV8.A1K(byteBuffer, byteBuffer2, byteBuffer3);
        checkNotNull(byteBuffer4, "dstY");
        checkNotNull(byteBuffer5, "dstU");
        checkNotNull(byteBuffer6, "dstV");
        if (i7 > 0 && i8 > 0) {
            YuvHelperJni.get().i420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, byteBuffer6, i6, i7, i8);
            return;
        }
        throw C60O.A0i("I420Copy: width and height should not be negative");
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5) {
        I420ToNV12(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, i5, i4, i5);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5) {
        I420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, i5, i4, i5, (i4 + 1) / 2, (i5 + 1) / 2);
    }
}
