package X;

import java.util.StringTokenizer;

/* renamed from: X.GjC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9864GjC extends StringTokenizer {
    public int A00;
    public String A01;
    public final String A02;

    public C9864GjC(String str) {
        super(str, "<,>", true);
        this.A02 = str;
    }

    @Override // java.util.StringTokenizer
    public final boolean hasMoreTokens() {
        return this.A01 != null || super.hasMoreTokens();
    }

    @Override // java.util.StringTokenizer
    public final String nextToken() {
        String str = this.A01;
        if (str != null) {
            this.A01 = null;
            return str;
        }
        String strNextToken = super.nextToken();
        this.A00 += strNextToken.length();
        return strNextToken.trim();
    }
}
