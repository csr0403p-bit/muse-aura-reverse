package X;

import com.google.common.base.Preconditions;

/* renamed from: X.CzZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4594CzZ extends C4592CzX {
    public final char[] A00;

    public C4594CzZ(CzV alphabet) {
        super(alphabet, null);
        this.A00 = new char[512];
        char[] cArr = alphabet.A07;
        int i = 0;
        Preconditions.checkArgument(AnonymousClass002.A1Q(cArr.length, 16));
        do {
            char[] cArr2 = this.A00;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
            i++;
        } while (i < 256);
    }
}
