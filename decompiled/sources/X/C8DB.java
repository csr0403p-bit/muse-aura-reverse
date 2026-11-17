package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;

/* renamed from: X.8DB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8DB {
    public long A00 = 0;
    public long A01 = 0;
    public Integer A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C8DB c8db = (C8DB) obj;
                if (this.A00 != c8db.A00 || this.A01 != c8db.A01 || this.A02 != c8db.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode;
        String str;
        Integer num = this.A02;
        if (num != null) {
            int iIntValue = num.intValue();
            switch (iIntValue) {
                case 1:
                    str = "GCM";
                    break;
                case 2:
                    str = "ALARM";
                    break;
                default:
                    str = "JOB_SCHEDULER";
                    break;
            }
            iHashCode = str.hashCode() + iIntValue;
        } else {
            iHashCode = 0;
        }
        return AnonymousClass006.A06(this.A00, iHashCode * 31) + C3cG.A02(this.A01);
    }

    public final String toString() {
        String str;
        StringBuilder sbA0x = C60O.A0x("{reason=");
        Integer num = this.A02;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "GCM";
                    break;
                case 2:
                    str = "ALARM";
                    break;
                default:
                    str = "JOB_SCHEDULER";
                    break;
            }
        } else {
            str = HatchCcvLoggingKt.NO_POSTAL_FIELD;
        }
        sbA0x.append(str);
        sbA0x.append(AbstractC7606F5t.A00(6));
        sbA0x.append(this.A00);
        sbA0x.append(", wakeupTimeMs=");
        sbA0x.append(this.A01);
        return AnonymousClass001.A0v("}", sbA0x);
    }
}
