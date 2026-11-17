package X;

import android.util.Range;
import android.util.Size;

/* renamed from: X.BcJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2492BcJ extends AbstractC2481Bc8 {
    public final Range<Integer> A00;
    public final Size A01;
    public final C2507Bcd A02;
    public final InterfaceC2585Beh A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC2481Bc8) {
                C2492BcJ c2492BcJ = (C2492BcJ) ((AbstractC2481Bc8) obj);
                if (this.A01.equals(c2492BcJ.A01) && this.A02.equals(c2492BcJ.A02) && this.A00.equals(c2492BcJ.A00)) {
                    InterfaceC2585Beh interfaceC2585Beh = this.A03;
                    InterfaceC2585Beh interfaceC2585Beh2 = c2492BcJ.A03;
                    if (interfaceC2585Beh != null ? interfaceC2585Beh.equals(interfaceC2585Beh2) : interfaceC2585Beh2 == null) {
                        if (this.A04 == c2492BcJ.A04) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((BV6.A08(this.A00, BV6.A08(this.A02, (this.A01.hashCode() ^ 1000003) * 1000003)) ^ AnonymousClass006.A0D(this.A03)) * 1000003) ^ BV7.A02(this.A04 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("StreamSpec{resolution=");
        sbA0x.append(this.A01);
        sbA0x.append(", dynamicRange=");
        sbA0x.append(this.A02);
        sbA0x.append(", expectedFrameRateRange=");
        sbA0x.append(this.A00);
        sbA0x.append(", implementationOptions=");
        sbA0x.append(this.A03);
        sbA0x.append(", zslDisabled=");
        sbA0x.append(this.A04);
        return BV7.A11(sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/util/Size;LX/Bcd;Landroid/util/Range<Ljava/lang/Integer;>;LX/Beh;Z)V */
    public C2492BcJ(Range range, Size size, C2507Bcd c2507Bcd, InterfaceC2585Beh interfaceC2585Beh, boolean z) {
        this.A01 = size;
        this.A02 = c2507Bcd;
        this.A00 = range;
        this.A03 = interfaceC2585Beh;
        this.A04 = z;
    }
}
