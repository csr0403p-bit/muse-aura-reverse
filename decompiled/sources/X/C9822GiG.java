package X;

import java.util.Arrays;

/* renamed from: X.GiG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9822GiG {
    public int A00;
    public AbstractC9807GhW[] A01;
    public int A02;

    public final void A00(AbstractC9807GhW abstractC9807GhW) {
        AbstractC9807GhW[] abstractC9807GhWArr;
        int i = this.A00;
        int i2 = this.A02;
        AbstractC9807GhW[] abstractC9807GhWArr2 = this.A01;
        if (i < i2) {
            this.A00 = i + 1;
            abstractC9807GhWArr2[i] = abstractC9807GhW;
            return;
        }
        if (abstractC9807GhWArr2 == null) {
            this.A02 = 10;
            abstractC9807GhWArr = new AbstractC9807GhW[10];
        } else {
            int iMin = i2 + Math.min(4000, Math.max(20, i2 >> 1));
            this.A02 = iMin;
            abstractC9807GhWArr = (AbstractC9807GhW[]) Arrays.copyOf(abstractC9807GhWArr2, iMin);
        }
        this.A01 = abstractC9807GhWArr;
        int i3 = this.A00;
        this.A00 = i3 + 1;
        abstractC9807GhWArr[i3] = abstractC9807GhW;
    }
}
