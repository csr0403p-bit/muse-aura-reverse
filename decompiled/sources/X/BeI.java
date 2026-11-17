package X;

import android.util.Size;
import java.util.List;

/* loaded from: classes5.dex */
public final class BeI extends BeJ {
    public final Size A00;
    public final C2643Bga A01;
    public final AbstractC2481Bc8 A02;
    public final BfN<?> A03;
    public final Class<?> A04;
    public final String A05;
    public final List<EnumC2489BcG> A06;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof BeJ) {
                BeI beI = (BeI) ((BeJ) obj);
                if (this.A05.equals(beI.A05) && this.A04.equals(beI.A04) && this.A01.equals(beI.A01) && this.A03.equals(beI.A03)) {
                    Size size = this.A00;
                    Size size2 = beI.A00;
                    if (size != null ? size.equals(size2) : size2 == null) {
                        AbstractC2481Bc8 abstractC2481Bc8 = this.A02;
                        AbstractC2481Bc8 abstractC2481Bc82 = beI.A02;
                        if (abstractC2481Bc8 != null ? abstractC2481Bc8.equals(abstractC2481Bc82) : abstractC2481Bc82 == null) {
                            List<EnumC2489BcG> list = this.A06;
                            List<EnumC2489BcG> list2 = beI.A06;
                            if (list == null) {
                                if (list2 == null) {
                                }
                            } else if (list.equals(list2)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iA08 = (((BV6.A08(this.A03, BV6.A08(this.A01, BV6.A08(this.A04, (this.A05.hashCode() ^ 1000003) * 1000003))) ^ AnonymousClass006.A0D(this.A00)) * 1000003) ^ AnonymousClass006.A0D(this.A02)) * 1000003;
        List<EnumC2489BcG> list = this.A06;
        return iA08 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("UseCaseInfo{useCaseId=");
        sbA0x.append(this.A05);
        sbA0x.append(", useCaseType=");
        sbA0x.append(this.A04);
        sbA0x.append(", sessionConfig=");
        sbA0x.append(this.A01);
        sbA0x.append(", useCaseConfig=");
        sbA0x.append(this.A03);
        sbA0x.append(", surfaceResolution=");
        sbA0x.append(this.A00);
        sbA0x.append(", streamSpec=");
        sbA0x.append(this.A02);
        sbA0x.append(", captureTypes=");
        return BV8.A0v(this.A06, sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/Class<*>;LX/Bga;LX/BfN<*>;Landroid/util/Size;LX/Bc8;Ljava/util/List<LX/BcG;>;)V */
    public BeI(Size size, C2643Bga c2643Bga, AbstractC2481Bc8 abstractC2481Bc8, BfN bfN, Class cls, String str, List list) {
        if (str == null) {
            throw BV4.A0a("Null useCaseId");
        }
        this.A05 = str;
        if (cls == null) {
            throw BV4.A0a("Null useCaseType");
        }
        this.A04 = cls;
        if (c2643Bga == null) {
            throw BV4.A0a("Null sessionConfig");
        }
        this.A01 = c2643Bga;
        if (bfN == null) {
            throw BV4.A0a("Null useCaseConfig");
        }
        this.A03 = bfN;
        this.A00 = size;
        this.A02 = abstractC2481Bc8;
        this.A06 = list;
    }
}
