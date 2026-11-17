package com.facebook.aura.devices.token;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.BFI;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.C8j3;
import X.G0U;
import java.util.Arrays;
import java.util.Base64;

/* loaded from: classes4.dex */
public abstract class LinkDeviceKeyKt {
    public static final int LINK_DEVICE_KEY_ID_HINT_BYTES = 4;
    public static final int LINK_DEVICE_KEY_ID_SIZE = 16;
    public static final int LINK_DEVICE_KEY_SIZE = 32;

    /* renamed from: com.facebook.aura.devices.token.LinkDeviceKeyKt$linkDeviceKeyIdHint$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Byte, CharSequence> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final CharSequence invoke(byte b) {
            String string = Integer.toString(b & 255, 16);
            C7384Etj.A0U(string);
            return C7BY.A0P(string, 2);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
            return invoke(b.byteValue());
        }
    }

    public static final byte[] decodeLinkDeviceKeyBase64(String str, int i) {
        if (C8j3.A0J(str, 0) != ((i + 2) / 3) * 4) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.getDecoder().decode(str);
            int length = bArrDecode.length;
            if (length == i) {
                return bArrDecode;
            }
            Arrays.fill(bArrDecode, 0, length, (byte) 0);
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public static final String linkDeviceKeyIdHint(byte[] bArr) {
        ?? A11;
        C7384Etj.A0Y(bArr, 0);
        int length = bArr.length;
        if (4 < length) {
            int i = 0;
            A11 = C60O.A11(4);
            int i2 = 0;
            do {
                A11.add(Byte.valueOf(bArr[i]));
                i2++;
                if (i2 == 4) {
                    break;
                }
                i++;
            } while (i < length);
        } else {
            A11 = BFI.A0D(bArr);
        }
        return AbstractC0878AGe.A0L("", "", "", A11, AnonymousClass1.INSTANCE);
    }
}
