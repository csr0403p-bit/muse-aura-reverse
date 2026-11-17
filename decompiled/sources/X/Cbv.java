package X;

import com.google.android.gms.common.Feature;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class Cbv extends C3503CRd<List<C4208CqE>> implements Bra {
    public final boolean A00;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Cbv(CWQ cwq, Cc0 cc0) {
        Executor executor = (Executor) cwq.A00.get();
        C3696Ccu c3696CcuA00 = AbstractC3655Cbu.A00(true != Cbw.A02() ? "play-services-mlkit-face-detection" : "face-detection");
        super(cc0, executor);
        boolean zA02 = Cbw.A02();
        this.A00 = zA02;
        C3712CdB c3712CdB = new C3712CdB();
        c3712CdB.A01 = zA02 ? EnumC3720CdJ.TYPE_THICK : EnumC3720CdJ.TYPE_THIN;
        c3712CdB.A03 = new C3827CfF(Cbw.A00(), null, null, null, null);
        RunnableC3698Ccw.A00(EnumC10420Hbt.A29, new C3717CdG(c3712CdB, 1), c3696CcuA00);
    }

    @Override // X.InterfaceC3593CWc
    public final Feature[] AII() {
        return this.A00 ? AbstractC3782CeQ.A0B : new Feature[]{AbstractC3782CeQ.A02};
    }
}
