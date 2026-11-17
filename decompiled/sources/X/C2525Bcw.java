package X;

import java.util.List;

/* renamed from: X.Bcw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2525Bcw extends AbstractC2526Bcx {
    public final int A00;
    public final int A01;
    public final List<AbstractC2528Bcz> A02;
    public final List<AbstractC2509Bcf> A03;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC2526Bcx) {
                AbstractC2526Bcx abstractC2526Bcx = (AbstractC2526Bcx) obj;
                if (this.A00 != abstractC2526Bcx.AEh() || this.A01 != abstractC2526Bcx.AJS() || !this.A02.equals(abstractC2526Bcx.ACZ()) || !this.A03.equals(abstractC2526Bcx.AMe())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC2523Bcu
    public final List<AbstractC2528Bcz> ACZ() {
        return this.A02;
    }

    @Override // X.InterfaceC2523Bcu
    public final int AEh() {
        return this.A00;
    }

    @Override // X.InterfaceC2523Bcu
    public final int AJS() {
        return this.A01;
    }

    @Override // X.InterfaceC2523Bcu
    public final List<AbstractC2509Bcf> AMe() {
        return this.A03;
    }

    public final int hashCode() {
        return ((((((this.A00 ^ 1000003) * 1000003) ^ this.A01) * 1000003) ^ this.A02.hashCode()) * 1000003) ^ this.A03.hashCode();
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ImmutableEncoderProfilesProxy{defaultDurationSeconds=");
        sbA0x.append(this.A00);
        sbA0x.append(", recommendedFileFormat=");
        sbA0x.append(this.A01);
        sbA0x.append(", audioProfiles=");
        sbA0x.append(this.A02);
        sbA0x.append(", videoProfiles=");
        return BV8.A0v(this.A03, sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (IILjava/util/List<LX/Bcz;>;Ljava/util/List<LX/Bcf;>;)V */
    public C2525Bcw(List list, List list2, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        if (list == null) {
            throw BV4.A0a("Null audioProfiles");
        }
        this.A02 = list;
        if (list2 == null) {
            throw BV4.A0a("Null videoProfiles");
        }
        this.A03 = list2;
    }
}
