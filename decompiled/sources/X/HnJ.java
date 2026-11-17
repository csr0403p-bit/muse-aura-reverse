package X;

import com.facebook.aura.ccv.nativeflow.HatchCheckoutClientKt;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* loaded from: classes6.dex */
public abstract class HnJ {
    public static final HrH A00 = HrH.A00(HatchPersistedMessageJson.UNSEND_STATUS_NONE);
    public static final HrH A01 = HrH.A00(HatchCheckoutClientKt.CHECKOUT_STATUS_PENDING);

    /* JADX WARN: Removed duplicated region for block: B:14:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0005  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C20Q A00(java.lang.Integer r1, X.C78T r2, X.C1BN r3, int r4) {
        /*
            if (r4 < 0) goto L11
            r0 = 2
            if (r4 >= r0) goto Lb
        L5:
            java.lang.Integer r0 = X.C79.A01
            if (r1 == r0) goto L1c
            if (r4 == 0) goto L17
        Lb:
            X.3pT r0 = new X.3pT
            r0.<init>(r1, r2, r3, r4)
            return r0
        L11:
            r0 = -2
            if (r4 == r0) goto L5
            r0 = -3
            if (r4 != r0) goto Lb
        L17:
            java.lang.Integer r0 = X.C79.A00
            if (r1 != r0) goto Lb
            return r3
        L1c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HnJ.A00(java.lang.Integer, X.78T, X.1BN, int):X.20Q");
    }

    public static final <T> BLG<T> A01(T t) {
        if (t == null) {
            t = (T) HwN.A01;
        }
        return new C9286GCn(t);
    }
}
