package X;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: X.Dlo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5609Dlo {
    public final Uri A00;
    public final ImmutableList<Integer> A01;

    @Deprecated
    public final ImmutableList<Integer> A02;
    public final ImmutableMap<String, String> A03;

    @Deprecated
    public final ImmutableMap<String, String> A04;
    public final UUID A05;

    @Deprecated
    public final UUID A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final byte[] A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5609Dlo) {
                C5609Dlo c5609Dlo = (C5609Dlo) obj;
                if (!this.A05.equals(c5609Dlo.A05) || !C6xC.A00(this.A00, c5609Dlo.A00) || !C6xC.A00(this.A03, c5609Dlo.A03) || this.A08 != c5609Dlo.A08 || this.A07 != c5609Dlo.A07 || this.A09 != c5609Dlo.A09 || !this.A01.equals(c5609Dlo.A01) || !Arrays.equals(this.A0A, c5609Dlo.A0A)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0F(this.A01, (((((AnonymousClass005.A0F(this.A03, (AnonymousClass005.A0E(this.A05) + C60R.A01(this.A00)) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + Arrays.hashCode(this.A0A);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5609Dlo(X.C5714Dnx r4) {
        /*
            r3 = this;
            r3.<init>()
            boolean r2 = r4.A04
            if (r2 == 0) goto Lc
            android.net.Uri r1 = r4.A00
            r0 = 0
            if (r1 == 0) goto Ld
        Lc:
            r0 = 1
        Ld:
            X.C1G.A08(r0)
            java.util.UUID r0 = r4.A03
            r0.getClass()
            r3.A05 = r0
            r3.A06 = r0
            android.net.Uri r0 = r4.A00
            r3.A00 = r0
            com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> r0 = r4.A02
            r3.A04 = r0
            r3.A03 = r0
            boolean r0 = r4.A05
            r3.A08 = r0
            r3.A07 = r2
            boolean r0 = r4.A06
            r3.A09 = r0
            com.google.common.collect.ImmutableList<java.lang.Integer> r0 = r4.A01
            r3.A02 = r0
            r3.A01 = r0
            byte[] r1 = r4.A07
            if (r1 == 0) goto L3f
            int r0 = r1.length
            byte[] r0 = java.util.Arrays.copyOf(r1, r0)
        L3c:
            r3.A0A = r0
            return
        L3f:
            r0 = 0
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5609Dlo.<init>(X.Dnx):void");
    }
}
