package X;

import java.util.List;

/* renamed from: X.Bcv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2524Bcv extends AbstractC2527Bcy {
    public final AbstractC2528Bcz A00;
    public final AbstractC2509Bcf A01;
    public final int A02;
    public final int A03;
    public final List<AbstractC2528Bcz> A04;
    public final List<AbstractC2509Bcf> A05;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC2527Bcy) {
                AbstractC2527Bcy abstractC2527Bcy = (AbstractC2527Bcy) obj;
                if (this.A02 == abstractC2527Bcy.AEh() && this.A03 == abstractC2527Bcy.AJS() && this.A04.equals(abstractC2527Bcy.ACZ()) && this.A05.equals(abstractC2527Bcy.AMe())) {
                    AbstractC2528Bcz abstractC2528Bcz = this.A00;
                    C2524Bcv c2524Bcv = (C2524Bcv) abstractC2527Bcy;
                    AbstractC2528Bcz abstractC2528Bcz2 = c2524Bcv.A00;
                    if (abstractC2528Bcz != null ? abstractC2528Bcz.equals(abstractC2528Bcz2) : abstractC2528Bcz2 == null) {
                        if (this.A01.equals(c2524Bcv.A01)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC2523Bcu
    public final List<AbstractC2528Bcz> ACZ() {
        return this.A04;
    }

    @Override // X.InterfaceC2523Bcu
    public final int AEh() {
        return this.A02;
    }

    @Override // X.InterfaceC2523Bcu
    public final int AJS() {
        return this.A03;
    }

    @Override // X.InterfaceC2523Bcu
    public final List<AbstractC2509Bcf> AMe() {
        return this.A05;
    }

    public final int hashCode() {
        return BV6.A09(this.A01, (((((((((this.A02 ^ 1000003) * 1000003) ^ this.A03) * 1000003) ^ this.A04.hashCode()) * 1000003) ^ this.A05.hashCode()) * 1000003) ^ AnonymousClass006.A0D(this.A00)) * 1000003);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=");
        sbA0x.append(this.A02);
        sbA0x.append(", recommendedFileFormat=");
        sbA0x.append(this.A03);
        sbA0x.append(", audioProfiles=");
        sbA0x.append(this.A04);
        sbA0x.append(", videoProfiles=");
        sbA0x.append(this.A05);
        sbA0x.append(", defaultAudioProfile=");
        sbA0x.append(this.A00);
        sbA0x.append(", defaultVideoProfile=");
        return BV8.A0v(this.A01, sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (IILjava/util/List<LX/Bcz;>;Ljava/util/List<LX/Bcf;>;LX/Bcz;LX/Bcf;)V */
    public C2524Bcv(AbstractC2528Bcz abstractC2528Bcz, AbstractC2509Bcf abstractC2509Bcf, List list, List list2, int i, int i2) {
        this.A02 = i;
        this.A03 = i2;
        if (list == null) {
            throw BV4.A0a("Null audioProfiles");
        }
        this.A04 = list;
        if (list2 == null) {
            throw BV4.A0a("Null videoProfiles");
        }
        this.A05 = list2;
        this.A00 = abstractC2528Bcz;
        if (abstractC2509Bcf == null) {
            throw BV4.A0a("Null defaultVideoProfile");
        }
        this.A01 = abstractC2509Bcf;
    }
}
