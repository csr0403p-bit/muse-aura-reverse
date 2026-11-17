package X;

/* renamed from: X.9sb, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9sb {
    public int A00;
    public int[] A01;
    public Object[] A02 = new Object[8];

    public final String A00() {
        String strAF5;
        StringBuilder sbA0x = C60O.A0x("$");
        int i = this.A00 + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.A02[i2];
            if (obj instanceof C9iZ) {
                C9iZ c9iZ = (C9iZ) obj;
                boolean zAreEqual = C7384Etj.areEqual(c9iZ.AGs(), C9tD.A00);
                int[] iArr = this.A01;
                int i3 = iArr[i2];
                if (zAreEqual) {
                    if (i3 != -1) {
                        sbA0x.append("[");
                        sbA0x.append(iArr[i2]);
                        strAF5 = "]";
                        sbA0x.append(strAF5);
                    }
                } else if (i3 >= 0) {
                    sbA0x.append(".");
                    strAF5 = c9iZ.AF5(i3);
                    sbA0x.append(strAF5);
                }
            } else if (obj != C9tG.A00) {
                sbA0x.append("['");
                sbA0x.append(obj);
                strAF5 = "']";
                sbA0x.append(strAF5);
            }
        }
        return sbA0x.toString();
    }

    public C9sb() {
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.A01 = iArr;
        this.A00 = -1;
    }

    public final String toString() {
        return A00();
    }
}
