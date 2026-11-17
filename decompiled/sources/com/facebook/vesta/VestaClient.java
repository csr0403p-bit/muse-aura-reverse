package com.facebook.vesta;

import X.ETi;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes6.dex */
public final class VestaClient {
    public static final VestaClient $redex_init_class = null;

    public static native int beginLoginNative(byte[] bArr, int i, byte[] bArr2);

    public static native int beginLoginNative(byte[] bArr, byte[] bArr2);

    public static native int beginRegisterNative(byte[] bArr, int i, byte[] bArr2);

    public static native int beginRegisterNative(byte[] bArr, byte[] bArr2);

    public static native int finishLoginNative(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5, byte[] bArr6);

    public static native int finishLoginNative(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5);

    public static native int finishRegisterNative(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte b, int i, byte[] bArr9, byte[] bArr10);

    public static native int finishRegisterNative(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte b, byte[] bArr9);

    public static native int finishRegisterProtoNative(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte b, int i, byte[] bArr9, byte[] bArr10);

    public static native int finishRegisterProtoNative(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte b, byte[] bArr9);

    public static native int getApiVersionNative();

    public static native int getProtocolVersionNative();

    public static native int pqUnwrapFinishLoginResponseNative(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static native int pqWrapFinishLoginNative(byte[] bArr, byte[] bArr2);

    public static native int pqWrapFinishRegisterNative(byte[] bArr, byte[] bArr2);

    public static native int pqWrapSchemeNative();

    public static native int unpackLoginPayloadNative(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4);

    public static native int unpackLoginPayloadNative(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public static native int unpackLoginPayloadProtoNative(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4);

    public static native int unpackLoginPayloadProtoNative(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public static native int validateHsmKeyNative(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static native int validateHsmKeysWithOtaBundleNative(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte b, byte[] bArr7, byte[] bArr8, byte[] bArr9, byte[] bArr10, byte[] bArr11);

    public static native int verifyRestoreHistoryNative(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8);

    static {
        ETi.loadLibrary("vesta_client_jni");
    }

    public static boolean validateHsmKey(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[8192];
        int iValidateHsmKeyNative = validateHsmKeyNative(bArr, bArr2, bArr3);
        if (iValidateHsmKeyNative == 0) {
            return parseNativeResults(bArr3)[0][0] != 0;
        }
        throw new VestaClientException(iValidateHsmKeyNative);
    }

    public static byte[][] parseNativeResults(byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        int i = byteBufferWrap.get();
        byte[][] bArr2 = new byte[i][];
        for (int i2 = 0; i2 < i; i2++) {
            byte[] bArr3 = new byte[byteBufferWrap.getInt()];
            bArr2[i2] = bArr3;
            byteBufferWrap.get(bArr3);
        }
        return bArr2;
    }
}
