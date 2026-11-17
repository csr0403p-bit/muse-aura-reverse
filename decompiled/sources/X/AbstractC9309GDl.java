package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

/* renamed from: X.GDl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9309GDl implements Iterable<Byte>, Serializable {
    public static final InterfaceC9312GDo A00;
    public static final AbstractC9309GDl A01 = new C9306GDi(GGV.A04);
    public int hash = 0;

    public abstract boolean equals(Object obj);

    static {
        A00 = (AbstractC9316GDs.A00 == null || AbstractC9316GDs.A01) ? new C9311GDn() : new C9310GDm();
    }

    public static int A00(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw FGI.A05(i);
        }
        if (i2 < i) {
            throw C8j3.A0y("Beginning index larger than ending index: ", ", ", i, i2);
        }
        throw C8j3.A0y("End index: ", " >= ", i2, i3);
    }

    public final int A01() {
        C9306GDi c9306GDi = (C9306GDi) this;
        return c9306GDi instanceof C9308GDk ? ((C9308GDk) c9306GDi).bytesLength : c9306GDi.bytes.length;
    }

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int iA01 = A01();
            C9306GDi c9306GDi = (C9306GDi) this;
            byte[] bArr = c9306GDi.bytes;
            int iA02 = c9306GDi.A02();
            i = iA01;
            Charset charset = GGV.A03;
            for (int i2 = iA02; i2 < iA02 + iA01; i2++) {
                i = (i * 31) + bArr[i2];
            }
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        return new I11(this);
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", BV5.A1a(BV7.A0x(this), A01()));
    }
}
