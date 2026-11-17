package X;

import androidx.health.platform.client.proto.CodedOutputStream$OutOfSpaceException;
import androidx.health.platform.client.proto.InvalidProtocolBufferException;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class GFI {
    public static final GFI A05;
    public int A01 = -1;
    public int A00 = 0;
    public int[] A03 = new int[8];
    public Object[] A04 = new Object[8];
    public boolean A02 = true;

    static {
        GFI gfi = new GFI();
        gfi.A01 = -1;
        gfi.A00 = 0;
        gfi.A03 = new int[0];
        gfi.A04 = new Object[0];
        gfi.A02 = false;
        A05 = gfi;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof GFI)) {
                GFI gfi = (GFI) obj;
                int i = this.A00;
                if (i == gfi.A00) {
                    int[] iArr = this.A03;
                    int[] iArr2 = gfi.A03;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= i) {
                            Object[] objArr = this.A04;
                            Object[] objArr2 = gfi.A04;
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

    public static void A00(GFI gfi, int i) {
        int[] iArr = gfi.A03;
        if (i > iArr.length) {
            int i2 = gfi.A00;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            gfi.A03 = Arrays.copyOf(iArr, i);
            gfi.A04 = Arrays.copyOf(gfi.A04, i);
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
                boolean z = GFE.A05;
                iA0G = AbstractC7610F5x.A0G(jA05, AbstractC7610F5x.A08(i5));
            } else if (i6 != 1) {
                if (i6 == 2) {
                    GEY gey = (GEY) this.A04[i3];
                    boolean z2 = GFE.A05;
                    iA08 = AbstractC7610F5x.A08(i5);
                    iA06 = AbstractC7610F5x.A06(gey.A01());
                } else if (i6 == 3) {
                    iA08 = AbstractC7610F5x.A0C(i5) * 2;
                    iA06 = ((GFI) this.A04[i3]).A01();
                } else {
                    if (i6 != 5) {
                        InvalidProtocolBufferException.InvalidWireTypeException invalidWireTypeException = new InvalidProtocolBufferException.InvalidWireTypeException("Protocol message tag had invalid wire type.");
                        invalidWireTypeException.unfinishedMessage = null;
                        throw new IllegalStateException(invalidWireTypeException);
                    }
                    iA0G = AbstractC7610F5x.A0C(i5) + 4;
                }
                iA0G = iA08 + iA06;
            } else {
                iA0G = AbstractC7610F5x.A0C(i5) + 8;
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

    public final void A03(GFQ writer) throws CodedOutputStream$OutOfSpaceException {
        if (this.A00 != 0) {
            for (int i = 0; i < this.A00; i++) {
                int i2 = this.A03[i];
                Object obj = this.A04[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    AbstractC9345GFe.A04(((GFD) writer).A00, i3, C3cG.A05(obj));
                } else if (i4 == 1) {
                    AbstractC9345GFe.A03(((GFD) writer).A00, i3, C3cG.A05(obj));
                } else if (i4 == 2) {
                    GFE gfe = ((GFD) writer).A00;
                    AbstractC9345GFe.A01(gfe, i3);
                    gfe.A07((GEY) obj);
                } else if (i4 == 3) {
                    GFE gfe2 = ((GFD) writer).A00;
                    int i5 = i3 << 3;
                    gfe2.A04(i5 | 3);
                    ((GFI) obj).A03(writer);
                    gfe2.A04(i5 | 4);
                } else {
                    if (i4 != 5) {
                        InvalidProtocolBufferException.InvalidWireTypeException invalidWireTypeException = new InvalidProtocolBufferException.InvalidWireTypeException("Protocol message tag had invalid wire type.");
                        invalidWireTypeException.unfinishedMessage = null;
                        throw BV4.A0e(invalidWireTypeException);
                    }
                    AbstractC9345GFe.A02(((GFD) writer).A00, i3, AnonymousClass001.A0F(obj));
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
