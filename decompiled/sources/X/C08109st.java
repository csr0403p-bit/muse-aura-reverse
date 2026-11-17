package X;

/* renamed from: X.9st, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C08109st implements CharSequence {
    public int A00;
    public final char[] A01;

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return this.A01[i];
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return this.A00;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        char[] cArr = this.A01;
        int iMin = Math.min(i2, length());
        AH7.A03(i, iMin, cArr.length);
        return new String(cArr, i, iMin - i);
    }

    public C08109st(char[] cArr) {
        this.A01 = cArr;
        this.A00 = cArr.length;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int length = length();
        char[] cArr = this.A01;
        int iMin = Math.min(length, length);
        AH7.A03(0, iMin, cArr.length);
        return new String(cArr, 0, iMin);
    }
}
