package X;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: X.Ebi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6886Ebi implements Closeable {
    public final int A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final C6797Ea8 A04;
    public final C6844Eaw A05;
    public final EnumC6905Ec1 A06;
    public final Eb0 A07;
    public final C6886Ebi A08;
    public final C6886Ebi A09;
    public final C6886Ebi A0A;
    public final Eb4 A0B;
    public final C6871EbT A0C;

    public static final String A00(String str, C6886Ebi c6886Ebi) {
        String strA03 = c6886Ebi.A05.A03(str);
        if (strA03 == null) {
            return null;
        }
        return strA03;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Eb4 eb4 = this.A0B;
        if (eb4 == null) {
            throw C3cG.A0Q("response is not eligible for a body and must not be closed");
        }
        eb4.close();
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Response{protocol=");
        sbA0x.append(this.A06);
        sbA0x.append(", code=");
        sbA0x.append(this.A00);
        sbA0x.append(", message=");
        sbA0x.append(this.A03);
        sbA0x.append(", url=");
        sbA0x.append(this.A07.A04);
        return C8j3.A15(sbA0x);
    }

    public C6886Ebi(String str, C6797Ea8 c6797Ea8, C6844Eaw c6844Eaw, EnumC6905Ec1 enumC6905Ec1, Eb0 eb0, C6886Ebi c6886Ebi, C6886Ebi c6886Ebi2, C6886Ebi c6886Ebi3, Eb4 eb4, C6871EbT c6871EbT, int i, long j, long j2) {
        this.A07 = eb0;
        this.A06 = enumC6905Ec1;
        this.A03 = str;
        this.A00 = i;
        this.A04 = c6797Ea8;
        this.A05 = c6844Eaw;
        this.A0B = eb4;
        this.A09 = c6886Ebi;
        this.A08 = c6886Ebi2;
        this.A0A = c6886Ebi3;
        this.A02 = j;
        this.A01 = j2;
        this.A0C = c6871EbT;
    }
}
