package X;

/* renamed from: X.GDi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9306GDi extends AbstractC9305GDh {
    public static final long serialVersionUID = 1;
    public final byte[] bytes;

    @Override // X.AbstractC9309GDl
    public final boolean equals(Object obj) {
        int iA01;
        AbstractC9309GDl abstractC9309GDl;
        int iA012;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC9309GDl) && (iA01 = A01()) == (iA012 = (abstractC9309GDl = (AbstractC9309GDl) obj).A01())) {
            if (iA01 == 0) {
                return true;
            }
            if (!(obj instanceof C9306GDi)) {
                return obj.equals(this);
            }
            int i = this.hash;
            int i2 = abstractC9309GDl.hash;
            if (i == 0 || i2 == 0 || i == i2) {
                if (iA01 > iA012) {
                    throw AbstractC7611F5y.A0R(iA01);
                }
                boolean z = abstractC9309GDl instanceof C9306GDi;
                C9306GDi c9306GDi = (C9306GDi) abstractC9309GDl;
                if (!z) {
                    int iA00 = AbstractC9309GDl.A00(0, iA01, c9306GDi.A01());
                    Object c9308GDk = iA00 == 0 ? AbstractC9309GDl.A01 : new C9308GDk(c9306GDi.bytes, c9306GDi.A02(), iA00);
                    int iA002 = AbstractC9309GDl.A00(0, iA01, A01());
                    return c9308GDk.equals(iA002 == 0 ? AbstractC9309GDl.A01 : new C9308GDk(this.bytes, A02(), iA002));
                }
                byte[] bArr = this.bytes;
                byte[] bArr2 = c9306GDi.bytes;
                int iA02 = A02();
                int i3 = iA01 + iA02;
                int iA022 = c9306GDi.A02();
                while (iA02 < i3) {
                    if (bArr[iA02] != bArr2[iA022]) {
                        return false;
                    }
                    iA02++;
                    iA022++;
                }
                return true;
            }
        }
        return false;
    }

    public final int A02() {
        if (this instanceof C9308GDk) {
            return ((C9308GDk) this).bytesOffset;
        }
        return 0;
    }

    public C9306GDi(byte[] bArr) {
        bArr.getClass();
        this.bytes = bArr;
    }
}
