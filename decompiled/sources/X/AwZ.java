package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;

/* loaded from: classes4.dex */
public final class AwZ {
    public final Integer A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AwZ) {
                AwZ awZ = (AwZ) obj;
                if (this.A01 != awZ.A01 || this.A00 != awZ.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iIntValue = this.A01.intValue();
        int iHashCode = ((1 != iIntValue ? "Start" : "End").hashCode() + iIntValue) * 31;
        int iIntValue2 = this.A00.intValue();
        return iHashCode + (1 != iIntValue2 ? "Start" : "End").hashCode() + iIntValue2;
    }

    public final String toString() {
        Integer num = this.A01;
        String str = num != null ? 1 - num.intValue() != 0 ? "Start" : "End" : HatchCcvLoggingKt.NO_POSTAL_FIELD;
        Integer num2 = this.A00;
        return FGI.A0e("SelectionWedgeAffinity(startAffinity=", str, ", endAffinity=", num2 != null ? 1 - num2.intValue() != 0 ? "Start" : "End" : HatchCcvLoggingKt.NO_POSTAL_FIELD, ')');
    }

    public AwZ(Integer num, Integer num2) {
        this.A01 = num;
        this.A00 = num2;
    }
}
