package X;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* renamed from: X.BcE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2487BcE extends AbstractC2480Bc7 {
    public final int A00;
    public final Range<Integer> A01;
    public final Size A02;
    public final C2507Bcd A03;
    public final InterfaceC2585Beh A04;
    public final Bb3 A05;
    public final List<EnumC2489BcG> A06;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC2480Bc7) {
                C2487BcE c2487BcE = (C2487BcE) ((AbstractC2480Bc7) obj);
                if (this.A05.equals(c2487BcE.A05) && this.A00 == c2487BcE.A00 && this.A02.equals(c2487BcE.A02) && this.A03.equals(c2487BcE.A03) && this.A06.equals(c2487BcE.A06)) {
                    InterfaceC2585Beh interfaceC2585Beh = this.A04;
                    InterfaceC2585Beh interfaceC2585Beh2 = c2487BcE.A04;
                    if (interfaceC2585Beh != null ? interfaceC2585Beh.equals(interfaceC2585Beh2) : interfaceC2585Beh2 == null) {
                        Range<Integer> range = this.A01;
                        Range<Integer> range2 = c2487BcE.A01;
                        if (range == null) {
                            if (range2 == null) {
                            }
                        } else if (range.equals(range2)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((BV6.A08(this.A03, BV6.A08(this.A02, (((this.A05.hashCode() ^ 1000003) * 1000003) ^ this.A00) * 1000003)) ^ this.A06.hashCode()) * 1000003) ^ AnonymousClass006.A0D(this.A04)) * 1000003) ^ C3cH.A02(this.A01);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AttachedSurfaceInfo{surfaceConfig=");
        sbA0x.append(this.A05);
        sbA0x.append(", imageFormat=");
        sbA0x.append(this.A00);
        sbA0x.append(", size=");
        sbA0x.append(this.A02);
        sbA0x.append(", dynamicRange=");
        sbA0x.append(this.A03);
        sbA0x.append(", captureTypes=");
        sbA0x.append(this.A06);
        sbA0x.append(", implementationOptions=");
        sbA0x.append(this.A04);
        sbA0x.append(", targetFrameRate=");
        return BV8.A0v(this.A01, sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Bb3;ILandroid/util/Size;LX/Bcd;Ljava/util/List<LX/BcG;>;LX/Beh;Landroid/util/Range<Ljava/lang/Integer;>;)V */
    public C2487BcE(Range range, Size size, C2507Bcd c2507Bcd, InterfaceC2585Beh interfaceC2585Beh, Bb3 bb3, List list, int i) {
        if (bb3 == null) {
            throw BV4.A0a("Null surfaceConfig");
        }
        this.A05 = bb3;
        this.A00 = i;
        if (size == null) {
            throw BV4.A0a("Null size");
        }
        this.A02 = size;
        if (c2507Bcd == null) {
            throw BV4.A0a("Null dynamicRange");
        }
        this.A03 = c2507Bcd;
        this.A06 = list;
        this.A04 = interfaceC2585Beh;
        this.A01 = range;
    }
}
