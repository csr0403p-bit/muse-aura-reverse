package X;

import java.util.Arrays;

/* renamed from: X.Cd9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3710Cd9 extends AbstractC3749Cdm {
    public boolean A01;
    public Object[] A02 = new Object[4];
    public int A00 = 0;

    public final void A00(Object obj) {
        obj.getClass();
        int i = this.A00 + 1;
        Object[] objArrCopyOf = this.A02;
        int length = objArrCopyOf.length;
        if (length >= i) {
            if (this.A01) {
                objArrCopyOf = (Object[]) objArrCopyOf.clone();
            }
            int i2 = this.A00;
            this.A00 = i2 + 1;
            objArrCopyOf[i2] = obj;
        }
        objArrCopyOf = Arrays.copyOf(objArrCopyOf, BV8.A02(length, i));
        this.A02 = objArrCopyOf;
        this.A01 = false;
        int i22 = this.A00;
        this.A00 = i22 + 1;
        objArrCopyOf[i22] = obj;
    }
}
