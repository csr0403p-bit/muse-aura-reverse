package com.facebook.aura.startup.fresco;

import X.AnonymousClass003;
import X.BV4;
import X.BV5;
import X.C6988Edo;
import X.C7003Ee6;
import X.C7198EiA;
import X.C7384Etj;
import X.CA7;
import X.Ee8;
import X.HB8;
import X.HBA;
import X.InterfaceC7004Ee9;
import X.InterfaceC7034Eeg;
import X.InterfaceC7064EfB;
import X.InterfaceC7068EfO;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class AuraSvgDecoder {
    public static final AuraSvgDecoder INSTANCE = new AuraSvgDecoder();
    public static final C7003Ee6 format = new C7003Ee6("SVG", "svg");

    public final class Decoder implements InterfaceC7068EfO {
        public static final Decoder INSTANCE = new Decoder();

        @Override // X.InterfaceC7068EfO
        public InterfaceC7064EfB decode(C6988Edo c6988Edo, int i, InterfaceC7034Eeg interfaceC7034Eeg, C7198EiA c7198EiA) {
            C7384Etj.A0Y(c6988Edo, 0);
            try {
                HBA hbaA0X = new HB8().A0X(c6988Edo.A07());
                C7384Etj.A0U(hbaA0X);
                return new AuraCloseableSvgImage(hbaA0X, i);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public final class SvgFormatChecker implements InterfaceC7004Ee9 {
        public static final int headerSize = 256;
        public static final SvgFormatChecker INSTANCE = new SvgFormatChecker();
        public static final byte[] svgTag = CA7.A00("<svg");

        @Override // X.InterfaceC7004Ee9
        public C7003Ee6 determineFormat(byte[] bArr, int i) {
            C7384Etj.A0Y(bArr, 0);
            byte[] bArr2 = svgTag;
            int length = bArr2.length;
            if (i >= length && length <= i) {
                int i2 = 0;
                byte b = bArr2[0];
                int i3 = i - length;
                while (true) {
                    if (i2 > i3) {
                        break;
                    }
                    if (bArr[i2] != b) {
                        do {
                            i2++;
                            if (i2 > i3) {
                                break;
                            }
                        } while (bArr[i2] != b);
                    }
                    if (i2 <= i3) {
                        int i4 = i2 + 1;
                        int i5 = (i4 + length) - 1;
                        for (int i6 = 1; i4 < i5 && bArr[i4] == bArr2[i6]; i6++) {
                            i4++;
                        }
                        if (i4 == i5) {
                            if (i2 >= 0) {
                                return AuraSvgDecoder.format;
                            }
                        }
                    }
                    i2++;
                }
            }
            return C7003Ee6.A02;
        }

        @Override // X.InterfaceC7004Ee9
        public int getHeaderSize() {
            return headerSize;
        }
    }

    public final Ee8 createConfig() {
        HashMap mapA0u = null;
        C7003Ee6 c7003Ee6 = format;
        SvgFormatChecker svgFormatChecker = SvgFormatChecker.INSTANCE;
        Decoder decoder = Decoder.INSTANCE;
        AnonymousClass003.A0u(c7003Ee6, svgFormatChecker);
        ArrayList arrayListA0u = BV5.A0u(svgFormatChecker);
        if (decoder != null) {
            mapA0u = BV4.A0u();
            mapA0u.put(c7003Ee6, decoder);
        }
        return new Ee8(arrayListA0u, mapA0u);
    }

    public final C7003Ee6 getFormat() {
        return format;
    }
}
