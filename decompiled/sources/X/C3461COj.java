package X;

import android.os.Process;

/* renamed from: X.COj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3461COj {
    public final StringBuilder A00;

    public static C3461COj A00(String str, char c) {
        C3461COj c3461COj = new C3461COj(c);
        c3461COj.A01(Process.myPid());
        c3461COj.A00.append('|');
        c3461COj.A02(str);
        return c3461COj;
    }

    public final void A01(int i) {
        StringBuilder sb = this.A00;
        sb.append('|');
        sb.append(i);
    }

    public final String toString() {
        return this.A00.toString();
    }

    public C3461COj(char c) {
        StringBuilder sbA0p = BV4.A0p(1024);
        this.A00 = sbA0p;
        sbA0p.append(c);
    }

    public final void A02(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            StringBuilder sb = this.A00;
            char cCharAt = str.charAt(i);
            if (cCharAt == 0 || cCharAt == '\r' || cCharAt == ';' || cCharAt == '|' || cCharAt == '\t' || cCharAt == '\n') {
                cCharAt = ' ';
            }
            sb.append(cCharAt);
        }
    }
}
