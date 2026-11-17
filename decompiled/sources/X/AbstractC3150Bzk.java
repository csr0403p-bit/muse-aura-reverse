package X;

import java.nio.ByteBuffer;

/* renamed from: X.Bzk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3150Bzk {
    public static void A00(ByteBuffer byteBuffer) {
        int iA0F;
        int iLimit = byteBuffer.limit();
        if (iLimit != 0) {
            int i = 0;
            int i2 = 0;
            boolean z = false;
            while (i < iLimit) {
                byte b = byteBuffer.get(i);
                int i3 = b & 255;
                boolean zA1L = AnonymousClass002.A1L(b & 128);
                int i4 = ((i3 >> 2) & 1) + 1;
                if (((i3 >> 1) & 1) != 0) {
                    int i5 = i + i4;
                    if (i5 >= iLimit) {
                        break;
                    }
                    int i6 = 0;
                    int i7 = 0;
                    int i8 = 0;
                    do {
                        int i9 = i5 + i6;
                        if (i9 >= iLimit) {
                            break;
                        }
                        byte b2 = byteBuffer.get(i9);
                        i7 |= (b2 & Byte.MAX_VALUE) << (i6 * 7);
                        i8++;
                        if ((b2 & 128) == 0) {
                            break;
                        } else {
                            i6++;
                        }
                    } while (i6 < 8);
                    iA0F = C8j3.A0F(iLimit, i, i4 + i8 + i7);
                    if (zA1L) {
                        i += iA0F;
                        z = true;
                    } else {
                        if (z) {
                            for (int i10 = 0; i10 < iA0F; i10++) {
                                byteBuffer.put(i2 + i10, byteBuffer.get(i + i10));
                            }
                        }
                        i2 += iA0F;
                        i += iA0F;
                    }
                } else if (zA1L) {
                    while (true) {
                        i++;
                        if (i >= iLimit) {
                            break;
                        }
                        byte b3 = byteBuffer.get(i);
                        int i11 = b3 & 255;
                        if ((b3 & 128) == 0) {
                            int i12 = (i11 >> 3) & 15;
                            int i13 = (i11 >> 1) & 1;
                            if (i12 >= 1 && (i12 <= 8 || i12 == 15)) {
                                if (i13 == 1) {
                                    break;
                                }
                            }
                        }
                    }
                    z = true;
                } else {
                    iA0F = iLimit - i;
                    if (z) {
                        for (int i14 = 0; i14 < iA0F; i14++) {
                            byteBuffer.put(i2 + i14, byteBuffer.get(i + i14));
                        }
                    }
                    i2 += iA0F;
                    i += iA0F;
                }
            }
            if (z) {
                byteBuffer.limit(i2);
                CFK.A06("Av1ObuSanitizer", FGI.A0Y("Stripped invalid AV1 OBUs: buffer reduced from ", " to ", " bytes", iLimit, i2));
            }
        }
    }
}
