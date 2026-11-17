package X;

import java.util.Calendar;

/* loaded from: classes5.dex */
public final class CGk {
    public final int A00;
    public final long A01;
    public final Integer A02;
    public final String A03;

    public CGk(long j, String str, int i, String str2) {
        Integer num;
        if (str2.equals("ENCRYPTION_WITH_TAGGING")) {
            num = C79.A00;
        } else {
            if (!str2.equals("PLAINTEXT_WITH_TAGGING")) {
                throw C60O.A0i(str2);
            }
            num = C79.A01;
        }
        this.A00 = i;
        this.A03 = str;
        this.A01 = j;
        this.A02 = num;
    }

    public CGk(int i, String str, long j) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis() + (j * 1000);
        Integer num = C79.A00;
        this.A00 = i;
        this.A03 = str;
        this.A01 = timeInMillis;
        this.A02 = num;
    }
}
