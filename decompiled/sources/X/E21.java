package X;

import com.google.common.collect.ImmutableList;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class E21 implements E2D {
    public final List<C6154Dwx> A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static List A00(E21 e21, E3T e3t) {
        boolean z;
        String str;
        int i;
        List<byte[]> listSingletonList;
        E1P e1pA0Z = BV6.A0Z(e3t.A04);
        ?? A0h = e21.A00;
        while (e1pA0Z.A04() > 0) {
            int iA0A = e1pA0Z.A0A();
            int iA0A2 = e1pA0Z.A01 + e1pA0Z.A0A();
            if (iA0A == 134) {
                A0h = C3cG.A0h();
                int iA0A3 = e1pA0Z.A0A() & 31;
                for (int i2 = 0; i2 < iA0A3; i2++) {
                    String strA0M = e1pA0Z.A0M(StandardCharsets.UTF_8, 3);
                    int iA0A4 = e1pA0Z.A0A();
                    if ((iA0A4 & 128) != 0) {
                        z = true;
                        i = iA0A4 & 63;
                        str = "application/cea-708";
                    } else {
                        z = false;
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bA0A = (byte) e1pA0Z.A0A();
                    e1pA0Z.A0S(1);
                    if (z) {
                        boolean z2 = (bA0A & 64) != 0;
                        byte[] bArr = new byte[1];
                        if (z2) {
                            bArr[0] = 1;
                        } else {
                            bArr[0] = 0;
                        }
                        listSingletonList = Collections.singletonList(bArr);
                    } else {
                        listSingletonList = null;
                    }
                    C6162Dx5 c6162Dx5A00 = C6162Dx5.A00();
                    c6162Dx5A00.A06(str);
                    c6162Dx5A00.A0Y = strA0M;
                    c6162Dx5A00.A02 = i;
                    c6162Dx5A00.A0a = listSingletonList;
                    A0h.add(BV6.A0U(c6162Dx5A00));
                }
            }
            e1pA0Z.A0R(iA0A2);
            A0h = A0h;
        }
        return A0h;
    }

    public E21(List list) {
        this.A00 = list;
    }

    public E21() {
        this(ImmutableList.of());
    }
}
