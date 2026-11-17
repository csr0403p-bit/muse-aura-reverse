package X;

import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;

/* loaded from: classes6.dex */
public final class HBJ {
    public static final HBJ A02;
    public static final HBJ A03;
    public HHN A00;
    public Integer A01;

    static {
        HHN hhn = HHN.none;
        HBJ hbj = new HBJ();
        hbj.A00 = hhn;
        hbj.A01 = null;
        A03 = hbj;
        HHN hhn2 = HHN.xMidYMid;
        Integer num = C79.A00;
        HBJ hbj2 = new HBJ();
        hbj2.A00 = hhn2;
        hbj2.A01 = num;
        A02 = hbj2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                HBJ hbj = (HBJ) obj;
                if (this.A00 != hbj.A00 || this.A01 != hbj.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(this.A00);
        sbA0w.append(InviteCodeScratcherKt.CODE_SEPARATOR);
        Integer num = this.A01;
        return AnonymousClass001.A0v(num != null ? 1 - num.intValue() != 0 ? "meet" : "slice" : HatchCcvLoggingKt.NO_POSTAL_FIELD, sbA0w);
    }
}
