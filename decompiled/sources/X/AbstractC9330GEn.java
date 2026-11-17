package X;

import java.io.Serializable;

/* renamed from: X.GEn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9330GEn implements Iterable, Serializable {
    public static final InterfaceC9337GEu A00;
    public static final C9332GEp A01 = new C9332GEp(AbstractC9307GDj.A00);
    public int a = 0;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC9330GEn) {
                AbstractC9330GEn abstractC9330GEn = (AbstractC9330GEn) obj;
                int iA01 = A01();
                if (iA01 == abstractC9330GEn.A01()) {
                    if (iA01 != 0) {
                        int i = this.a;
                        int i2 = abstractC9330GEn.a;
                        if (i == 0 || i2 == 0 || i == i2) {
                            return A04(abstractC9330GEn);
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    static {
        A00 = (GEG.A00 == null || GEG.A01) ? new C9335GEs() : new C9336GEt();
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

    private final AbstractC9334GEr A02(int i, int i2) {
        if (this instanceof C9332GEp) {
            C9332GEp c9332GEp = (C9332GEp) this;
            int iA00 = A00(0, i2, c9332GEp.d.length);
            if (iA00 != 0) {
                return new C9331GEo(c9332GEp.d, 0, iA00);
            }
        } else {
            C9331GEo c9331GEo = (C9331GEo) this;
            int iA002 = A00(i, i2, c9331GEo.f);
            if (iA002 != 0) {
                return new C9331GEo(c9331GEo.d, c9331GEo.e + i, iA002);
            }
        }
        return A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if ((r9 instanceof X.C9331GEo) != false) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A04(X.AbstractC9330GEn r9) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.C9332GEp
            if (r0 == 0) goto L44
            X.GEp r8 = (X.C9332GEp) r8
            boolean r0 = r9 instanceof X.C9332GEp
            if (r0 == 0) goto L15
            byte[] r1 = r8.d
            X.GEp r9 = (X.C9332GEp) r9
            byte[] r0 = r9.d
            boolean r0 = java.util.Arrays.equals(r1, r0)
            return r0
        L15:
            boolean r0 = r9 instanceof X.C9331GEo
            if (r0 == 0) goto Lb8
            byte[] r6 = r8.d
            int r5 = r6.length
            int r0 = r9.A01()
            if (r5 > r0) goto L3f
            X.GEo r9 = (X.C9331GEo) r9
            byte[] r4 = r9.d
            int r3 = r9.e
            r2 = 0
            A00(r2, r5, r5)
            int r1 = r5 + r3
            int r0 = r4.length
            A00(r3, r1, r0)
        L32:
            if (r2 >= r5) goto La1
            r1 = r6[r2]
            r0 = r4[r3]
            if (r1 != r0) goto L9f
            int r2 = r2 + 1
            int r3 = r3 + 1
            goto L32
        L3f:
            java.lang.IllegalArgumentException r0 = X.AbstractC7611F5y.A0R(r5)
            throw r0
        L44:
            X.GEo r8 = (X.C9331GEo) r8
            boolean r2 = r9 instanceof X.C9332GEp
            if (r2 != 0) goto L4e
            boolean r0 = r9 instanceof X.C9331GEo
            if (r0 == 0) goto Lb8
        L4e:
            int r7 = r8.f
            int r0 = r9.A01()
            if (r7 > r0) goto Lb3
            r1 = 0
            if (r2 == 0) goto L79
            X.GEp r9 = (X.C9332GEp) r9
            byte[] r6 = r8.d
            int r5 = r8.e
            byte[] r4 = r9.d
            r3 = 0
            int r2 = r5 + r7
            int r0 = r6.length
            A00(r5, r2, r0)
            int r0 = r4.length
            A00(r1, r7, r0)
        L6c:
            if (r5 >= r2) goto La1
            r1 = r6[r5]
            r0 = r4[r3]
            if (r1 != r0) goto L9f
            int r5 = r5 + 1
            int r3 = r3 + 1
            goto L6c
        L79:
            boolean r0 = r9 instanceof X.C9331GEo
            if (r0 == 0) goto La3
            X.GEo r9 = (X.C9331GEo) r9
            byte[] r6 = r8.d
            int r5 = r8.e
            byte[] r4 = r9.d
            int r3 = r9.e
            int r2 = r5 + r7
            int r0 = r6.length
            A00(r5, r2, r0)
            int r7 = r7 + r3
            int r0 = r4.length
            A00(r3, r7, r0)
        L92:
            if (r5 >= r2) goto La1
            r1 = r6[r5]
            r0 = r4[r3]
            if (r1 != r0) goto L9f
            int r5 = r5 + 1
            int r3 = r3 + 1
            goto L92
        L9f:
            r0 = 0
            return r0
        La1:
            r0 = 1
            return r0
        La3:
            X.GEr r1 = r9.A02(r1, r7)
            int r0 = r8.e
            int r7 = r7 + r0
            X.GEr r0 = r8.A02(r0, r7)
            boolean r0 = r1.equals(r0)
            return r0
        Lb3:
            java.lang.IllegalArgumentException r0 = X.AbstractC7611F5y.A0R(r7)
            throw r0
        Lb8:
            boolean r0 = r9.A04(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9330GEn.A04(X.GEn):boolean");
    }

    public final int A01() {
        return this instanceof C9332GEp ? ((C9332GEp) this).d.length : ((C9331GEo) this).f;
    }

    public final void A03(byte[] bArr, int i) {
        if (this instanceof C9332GEp) {
            System.arraycopy(((C9332GEp) this).d, 0, bArr, 0, i);
        } else {
            C9331GEo c9331GEo = (C9331GEo) this;
            System.arraycopy(c9331GEo.d, c9331GEo.e, bArr, 0, i);
        }
    }

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int iA01 = A01();
            if (this instanceof C9332GEp) {
                i = iA01;
                byte[] bArr = ((C9332GEp) this).d;
                byte[] bArr2 = AbstractC9307GDj.A00;
                for (int i2 = 0; i2 < iA01; i2++) {
                    i = (i * 31) + bArr[i2];
                }
            } else {
                C9331GEo c9331GEo = (C9331GEo) this;
                i = iA01;
                byte[] bArr3 = c9331GEo.d;
                int i3 = c9331GEo.e;
                byte[] bArr4 = AbstractC9307GDj.A00;
                for (int i4 = i3; i4 < i3 + iA01; i4++) {
                    i = (i * 31) + bArr3[i4];
                }
            }
            if (i == 0) {
                i = 1;
            }
            this.a = i;
        }
        return i;
    }

    public final String toString() {
        byte[] bArr;
        String strA0M;
        byte[] bArr2;
        String strA0x = BV7.A0x(this);
        int iA01 = A01();
        if (iA01 <= 50) {
            if (iA01 == 0) {
                bArr2 = AbstractC9307GDj.A00;
            } else {
                bArr2 = new byte[iA01];
                A03(bArr2, iA01);
            }
            strA0M = HnT.A00(bArr2);
        } else {
            AbstractC9334GEr abstractC9334GErA02 = A02(0, 47);
            int iA012 = abstractC9334GErA02.A01();
            if (iA012 == 0) {
                bArr = AbstractC9307GDj.A00;
            } else {
                bArr = new byte[iA012];
                abstractC9334GErA02.A03(bArr, iA012);
            }
            strA0M = FGI.A0M(HnT.A00(bArr), "...");
        }
        StringBuilder sbA0x = C3cI.A0x("<ByteString@", strA0x);
        sbA0x.append(" size=");
        sbA0x.append(iA01);
        sbA0x.append(" contents=\"");
        sbA0x.append(strA0M);
        return AnonymousClass001.A0v("\">", sbA0x);
    }
}
