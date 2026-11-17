package X;

import java.util.Arrays;

/* renamed from: X.Cwf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4463Cwf extends COS {
    public final DA8 A00;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        DA8 da8;
        DA8 da82;
        COS cos = (COS) obj;
        int iA01 = cos.A01();
        int iA03 = 2;
        return (2 == iA01 && (iA03 = (da8 = this.A00).A03()) == (iA01 = (da82 = ((C4463Cwf) cos).A00).A03())) ? F3Q.A00.compare(da8.A04(), da82.A04()) : iA03 - iA01;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C4463Cwf) obj).A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        C4468Cwk c4468Cwk;
        int i;
        boolean z;
        C4464Cwg c4464Cwg = (C4464Cwg) AbstractC4467Cwj.A00;
        AbstractC4467Cwj c4466Cwi = c4464Cwg.A02;
        if (c4466Cwi == null) {
            C4468Cwk c4468Cwk2 = c4464Cwg.A00;
            int i2 = 0;
            while (true) {
                char[] cArr = c4468Cwk2.A07;
                int length = cArr.length;
                if (i2 >= length) {
                    c4468Cwk = c4468Cwk2;
                    break;
                }
                char c = cArr[i2];
                if (c < 'a' || c > 'z') {
                    i2++;
                } else {
                    int i3 = 0;
                    while (true) {
                        i = 65;
                        if (i3 >= length) {
                            z = false;
                            break;
                        }
                        char c2 = cArr[i3];
                        if (c2 >= 'A' && c2 <= 'Z') {
                            z = true;
                            break;
                        }
                        i3++;
                    }
                    if (!(!z)) {
                        throw C3cG.A0Q("Cannot call upperCase() on a mixed-case alphabet");
                    }
                    char[] cArr2 = new char[length];
                    for (int i4 = 0; i4 < length; i4++) {
                        char c3 = cArr[i4];
                        if (c3 >= 97 && c3 <= 122) {
                            c3 ^= 32;
                        }
                        cArr2[i4] = (char) c3;
                    }
                    c4468Cwk = new C4468Cwk(c4468Cwk2.A04.concat(".upperCase()"), cArr2);
                    if (c4468Cwk2.A05 && !c4468Cwk.A05) {
                        byte[] bArr = c4468Cwk.A06;
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        do {
                            int i5 = i | 32;
                            byte b = bArr[i];
                            byte b2 = bArr[i5];
                            if (b == -1) {
                                bArrCopyOf[i] = b2;
                            } else {
                                char c4 = (char) i;
                                char c5 = (char) i5;
                                if (b2 != -1) {
                                    throw C3cG.A0Q(CL4.A00("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                                }
                                bArrCopyOf[i5] = b;
                            }
                            i++;
                        } while (i <= 90);
                        c4468Cwk = new C4468Cwk(c4468Cwk.A04.concat(".ignoreCase()"), bArrCopyOf, c4468Cwk.A07, true);
                    }
                }
            }
            if (c4468Cwk == c4468Cwk2) {
                c4466Cwi = c4464Cwg;
            } else {
                Character ch = c4464Cwg.A01;
                if (c4464Cwg instanceof C4465Cwh) {
                    c4466Cwi = new C4465Cwh(c4468Cwk, ch);
                    if (c4468Cwk.A07.length != 64) {
                        throw BV4.A0P();
                    }
                } else {
                    c4466Cwi = c4464Cwg instanceof C4466Cwi ? new C4466Cwi(c4468Cwk) : new C4464Cwg(c4468Cwk, ch);
                }
            }
            c4464Cwg.A02 = c4466Cwi;
        }
        return FGI.A0U("h'", BV7.A0v(c4466Cwi, this.A00), "'");
    }

    public C4463Cwf(DA8 da8) {
        this.A00 = da8;
    }

    public final int hashCode() {
        return BV7.A0D(BV4.A0X(), this.A00);
    }
}
