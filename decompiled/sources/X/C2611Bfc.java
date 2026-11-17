package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;

/* renamed from: X.Bfc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2611Bfc extends BfR {
    public final int A00;
    public final BhO A01;
    public final Integer A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof BfR) {
                C2611Bfc c2611Bfc = (C2611Bfc) ((BfR) obj);
                if (this.A00 == c2611Bfc.A00 && this.A02.equals(c2611Bfc.A02)) {
                    BhO bhO = this.A01;
                    BhO bhO2 = c2611Bfc.A01;
                    if (bhO == null) {
                        if (bhO2 == null) {
                        }
                    } else if (bhO.equals(bhO2)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = (this.A00 ^ 1000003) * 1000003;
        int iIntValue = this.A02.intValue();
        return ((i ^ ((1 != iIntValue ? "ACTIVE" : "INACTIVE").hashCode() + iIntValue)) * 1000003) ^ AnonymousClass006.A0D(this.A01);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("StreamInfo{id=");
        sbA0x.append(this.A00);
        sbA0x.append(", streamState=");
        Integer num = this.A02;
        sbA0x.append(num != null ? 1 - num.intValue() != 0 ? "ACTIVE" : "INACTIVE" : HatchCcvLoggingKt.NO_POSTAL_FIELD);
        sbA0x.append(", inProgressTransformationInfo=");
        return BV8.A0v(this.A01, sbA0x);
    }

    public C2611Bfc(BhO bhO, Integer num, int i) {
        this.A00 = i;
        this.A02 = num;
        this.A01 = bhO;
    }
}
