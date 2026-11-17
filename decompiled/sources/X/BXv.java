package X;

import android.app.ActivityThread;
import android.text.TextUtils;
import android.util.Pair;

/* loaded from: classes5.dex */
public final class BXv {
    public static volatile BXv A02;
    public final BXu A00;
    public final String A01;

    public BXv() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            String str = this.A01;
            String str2 = ((BXv) obj).A01;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 != null) {
                return false;
            }
        }
        return true;
    }

    public static BXv A00() {
        BXv bXv;
        BXv bXv2 = A02;
        if (bXv2 != null) {
            return bXv2;
        }
        synchronized (BXv.class) {
            bXv = A02;
            if (bXv == null) {
                ActivityThread activityThreadA00 = BXw.A00();
                if (activityThreadA00 != null) {
                    bXv = A01(activityThreadA00.getProcessName());
                    A02 = bXv;
                    if (TextUtils.isEmpty(bXv.A01)) {
                        Pair pairA00 = BXy.A00();
                        if (TextUtils.isEmpty((CharSequence) pairA00.first)) {
                            bXv = A02;
                        } else {
                            bXv = A01((String) pairA00.first);
                            A02 = bXv;
                        }
                    }
                } else {
                    bXv = new BXv(null, null);
                }
            }
        }
        return bXv;
    }

    public static BXv A01(String str) {
        String str2;
        if (str == null) {
            return new BXv(null, null);
        }
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length > 1) {
            str2 = strArrSplit[1];
            if (str2 == null) {
                throw C60O.A0i("Invalid name");
            }
        } else {
            str2 = "";
        }
        return new BXv("".equals(str2) ? BXu.A01 : new BXu(str2), str);
    }

    public final int hashCode() {
        return BV7.A0I(this.A01);
    }

    public final String toString() {
        String str = this.A01;
        return str == null ? "<unknown>" : str;
    }

    public BXv(BXu bXu, String str) {
        this.A01 = str;
        this.A00 = bXu;
    }
}
