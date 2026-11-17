package X;

import com.facebook.aura.devices.link.ordering.HatchLinkOrderStateMachine;

/* loaded from: classes5.dex */
public abstract class BXs {
    public static byte[] A00(final byte[] value) {
        if (value.length != 16) {
            throw C60O.A0i("value must be a block.");
        }
        byte[] bArr = new byte[16];
        for (int i = 0; i < 16; i++) {
            byte b = (byte) ((value[i] << 1) & HatchLinkOrderStateMachine.MAX_EMAIL_LENGTH);
            bArr[i] = b;
            if (i < 15) {
                BV6.A0x((byte) ((value[i + 1] >> 7) & 1), bArr, b, i);
            }
        }
        bArr[15] = (byte) (((byte) ((value[0] >> 7) & 135)) ^ bArr[15]);
        return bArr;
    }
}
