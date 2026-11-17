package X;

import android.os.ConditionVariable;

/* loaded from: classes5.dex */
public abstract class CIV {
    public final CIX A00;

    public CIV(CIX cix) {
        Object[] objArrA1Y;
        String str;
        ConditionVariable conditionVariable = CIU.A00;
        boolean zBlock = conditionVariable.block(-1L);
        Integer numA0X = BV5.A0X(conditionVariable);
        if (zBlock) {
            objArrA1Y = new Object[]{numA0X};
            str = "Not blocking Provider (%s)";
        } else {
            CFK.A0H("InitStatus", "Blocking Provider (%s)", numA0X);
            conditionVariable.block();
            objArrA1Y = BV5.A1Y(conditionVariable.hashCode());
            str = "Unblocked Provider (%s)";
        }
        CFK.A0H("InitStatus", str, objArrA1Y);
        this.A00 = cix;
    }
}
