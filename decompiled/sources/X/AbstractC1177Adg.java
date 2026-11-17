package X;

/* renamed from: X.Adg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1177Adg {
    public static final <T> int A00(C0910AHm<C1181Adk<T>> c0910AHm, int i) {
        int i2 = c0910AHm.A00 - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            C1181Adk<T>[] c1181AdkArr = c0910AHm.A01;
            int i5 = c1181AdkArr[i4].A01;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < c1181AdkArr[i3].A01) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }
}
