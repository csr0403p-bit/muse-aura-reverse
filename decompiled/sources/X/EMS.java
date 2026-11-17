package X;

import androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class EMS implements C20Q<ENN> {
    public final /* synthetic */ C20Q[] A00;

    public EMS(C20Q[] c20qArr) {
        this.A00 = c20qArr;
    }

    @Override // X.C20Q
    public final Object collect(C20Z<? super ENN> c20z, HtJ htJ) {
        C20Q[] c20qArr = this.A00;
        Object objA00 = C4vq.A00(htJ, new C7589F5c(c20qArr, 22), new WorkConstraintsTracker$track$$inlined$combine$1$3(null), c20z, c20qArr);
        return objA00 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA00;
    }
}
