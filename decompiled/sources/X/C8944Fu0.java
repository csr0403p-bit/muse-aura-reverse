package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Fu0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8944Fu0 implements Ht9, G0U {
    public final int $t;
    public final Object A00;

    public C8944Fu0(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.G0U
    public final Object invoke(Object obj) {
        String str;
        if (this.$t == 0) {
            FHC fhc = (FHC) this.A00;
            HxO<? super Unit> hxO = fhc.A04;
            C7384Etj.A0X(hxO);
            if (C7384Etj.areEqual(fhc.A04, hxO)) {
                C0917AHt<Object> c0917AHt = fhc.A01;
                Object obj2 = fhc.A03;
                if (c0917AHt == null) {
                    if (obj2 == null) {
                        fhc.A03 = obj;
                    } else {
                        C0917AHt<Object> c0917AHtA02 = C0917AHt.A02();
                        c0917AHtA02.A0B(obj2);
                        c0917AHtA02.A0B(obj);
                        fhc.A01 = c0917AHtA02;
                        fhc.A03 = null;
                    }
                } else if (obj2 == null) {
                    c0917AHt.A0B(obj);
                } else {
                    str = "workingSoleWatchedObject must be null when workingWatchSet is non-null";
                }
            } else {
                str = "Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions";
            }
            AK7.A00(str);
            throw F60.createAndThrow();
        }
        ((Function0) this.A00).invoke();
        return Unit.INSTANCE;
    }
}
