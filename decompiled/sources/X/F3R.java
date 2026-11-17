package X;

import android.content.Context;
import androidx.work.OperationKt;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes5.dex */
public abstract class F3R {
    public static final EK5 A02(Context context) {
        C7384Etj.A0Y(context, 0);
        EK5 ek5A00 = EK5.A00(context);
        C7384Etj.A0U(ek5A00);
        return ek5A00;
    }

    public final ListenableFuture<List<EKN>> A03(EIF eif) {
        EK5 ek5 = (EK5) this;
        WorkDatabase workDatabase = ek5.A04;
        ENP enp = ek5.A06;
        boolean zA1Y = C60P.A1Y(workDatabase, enp);
        C7590F5d c7590F5d = new C7590F5d(eif, 10);
        ExecutorC6622EKr executorC6622EKr = ((C6616EKj) enp).A01;
        C7384Etj.A0U(executorC6622EKr);
        return AbstractC2947Bpi.A00(new E91(executorC6622EKr, new C7593F5g(20, workDatabase, c7590F5d), "loadStatusFuture", zA1Y ? 1 : 0));
    }

    public final C7499EyE A05(UUID uuid) {
        EK5 ek5 = (EK5) this;
        C7384Etj.A0Y(uuid, 0);
        ENF enf = ek5.A02.A04;
        ExecutorC6622EKr executorC6622EKr = ((C6616EKj) ek5.A06).A01;
        C7384Etj.A0U(executorC6622EKr);
        return OperationKt.A00(enf, "CancelWorkById", executorC6622EKr, new C7593F5g(19, uuid, ek5));
    }

    public final InterfaceC6657EMp A04(C7yC c7yC, C7yw c7yw, String str) {
        AnonymousClass003.A0u(str, c7yC);
        return new EKG(c7yC, (EK5) this, str, Collections.singletonList(c7yw)).A00();
    }

    public final void A06(AbstractC6631ELb abstractC6631ELb) {
        List listSingletonList = Collections.singletonList(abstractC6631ELb);
        EK5 ek5 = (EK5) this;
        if (listSingletonList.isEmpty()) {
            throw C60O.A0i("enqueue needs at least one WorkRequest.");
        }
        new EKG(C7yC.A04, ek5, null, listSingletonList).A00();
    }
}
