package X;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: X.CSv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3538CSv {
    public final C3536CSs A01;
    public int A00 = 0;
    public final Map<Integer, CSE<Void>> A02 = new DQd(0);

    public static final String A00(C3538CSv c3538CSv) {
        String string;
        C3536CSs c3536CSs = c3538CSv.A01;
        synchronized (c3536CSs) {
            string = c3536CSs.A01.getString("topic_operation_queue", "");
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String[] strArrSplit = string.split(",");
        if (strArrSplit.length <= 1 || TextUtils.isEmpty(strArrSplit[1])) {
            return null;
        }
        return strArrSplit[1];
    }

    public C3538CSv(C3536CSs c3536CSs) {
        this.A01 = c3536CSs;
    }
}
