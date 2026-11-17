package X;

import androidx.glance.appwidget.protobuf.CodedOutputStream;
import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class GG7 {
    public static final GG7 A05;
    public int A01 = -1;
    public int A00 = 0;
    public int[] A03 = new int[8];
    public Object[] A04 = new Object[8];
    public boolean A02 = true;

    static {
        GG7 gg7 = new GG7();
        gg7.A01 = -1;
        gg7.A00 = 0;
        gg7.A03 = new int[0];
        gg7.A04 = new Object[0];
        gg7.A02 = false;
        A05 = gg7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof GG7)) {
                GG7 gg7 = (GG7) obj;
                int i = this.A00;
                if (i == gg7.A00) {
                    int[] iArr = this.A03;
                    int[] iArr2 = gg7.A03;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= i) {
                            Object[] objArr = this.A04;
                            Object[] objArr2 = gg7.A04;
                            for (int i3 = 0; i3 < i; i3++) {
                                if (objArr[i3].equals(objArr2[i3])) {
                                }
                            }
                        } else {
                            if (iArr[i2] != iArr2[i2]) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(GG7 gg7, int i) {
        int[] iArr = gg7.A03;
        if (i > iArr.length) {
            int i2 = gg7.A00;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            gg7.A03 = Arrays.copyOf(iArr, i);
            gg7.A04 = Arrays.copyOf(gg7.A04, i);
        }
    }

    public final int A01() {
        int iA0G;
        int iA08;
        int iA06;
        int i = this.A01;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.A00; i3++) {
            int i4 = this.A03[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                long jA05 = C3cG.A05(this.A04[i3]);
                boolean z = CodedOutputStream.A02;
                iA0G = AbstractC7610F5x.A0G(jA05, AbstractC7610F5x.A08(i5));
            } else if (i6 != 1) {
                if (i6 == 2) {
                    AbstractC9320GEb abstractC9320GEb = (AbstractC9320GEb) this.A04[i3];
                    boolean z2 = CodedOutputStream.A02;
                    iA08 = AbstractC7610F5x.A08(i5);
                    iA06 = AbstractC7610F5x.A06(abstractC9320GEb.A02());
                } else if (i6 == 3) {
                    iA08 = AbstractC7610F5x.A09(i5) * 2;
                    iA06 = ((GG7) this.A04[i3]).A01();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.A00());
                    }
                    iA0G = AbstractC7610F5x.A09(i5) + 4;
                }
                iA0G = iA08 + iA06;
            } else {
                iA0G = AbstractC7610F5x.A09(i5) + 8;
            }
            i2 += iA0G;
        }
        this.A01 = i2;
        return i2;
    }

    public final void A02(int tag, Object value) {
        if (!this.A02) {
            throw C8j3.A17();
        }
        A00(this, this.A00 + 1);
        int[] iArr = this.A03;
        int i = this.A00;
        iArr[i] = tag;
        this.A04[i] = value;
        this.A00 = i + 1;
    }

    public final void A03(InterfaceC9380GGt writer) throws IOException {
        if (this.A00 != 0) {
            for (int i = 0; i < this.A00; i++) {
                int i2 = this.A03[i];
                Object obj = this.A04[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    ((C9372GGi) writer).A00.A09(i3, C3cG.A05(obj));
                } else if (i4 == 1) {
                    ((C9372GGi) writer).A00.A08(i3, C3cG.A05(obj));
                } else if (i4 == 2) {
                    ((C9372GGi) writer).A00.A0E((AbstractC9320GEb) obj, i3);
                } else if (i4 == 3) {
                    CodedOutputStream codedOutputStream = ((C9372GGi) writer).A00;
                    int i5 = i3 << 3;
                    codedOutputStream.A04(i5 | 3);
                    ((GG7) obj).A03(writer);
                    codedOutputStream.A04(i5 | 4);
                } else {
                    if (i4 != 5) {
                        throw BV4.A0e(InvalidProtocolBufferException.A00());
                    }
                    ((C9372GGi) writer).A00.A05(i3, AnonymousClass001.A0F(obj));
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.A00;
        int iA02 = AbstractC7608F5v.A02(i);
        int[] iArr = this.A03;
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        int i4 = (iA02 + i2) * 31;
        Object[] objArr = this.A04;
        int iA0G = 17;
        for (int i5 = 0; i5 < i; i5++) {
            iA0G = AnonymousClass005.A0G(objArr[i5], iA0G * 31);
        }
        return i4 + iA0G;
    }
}
