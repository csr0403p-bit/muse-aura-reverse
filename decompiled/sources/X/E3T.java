package X;

import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class E3T {
    public final int A00;
    public final int A01;
    public final String A02;
    public final List<E53> A03;
    public final byte[] A04;

    public final int A00() {
        int i = this.A00;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/lang/String;ILjava/util/List<LX/E53;>;[B)V */
    public E3T(String str, List list, byte[] bArr, int i, int i2) {
        this.A01 = i;
        this.A02 = str;
        this.A00 = i2;
        this.A03 = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
        this.A04 = bArr;
    }
}
