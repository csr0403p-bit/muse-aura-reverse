package X;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.callmanager.gen.AppModelListener;
import java.util.Map;

/* renamed from: X.GRn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9606GRn extends AppModelListener {
    public Integer A00;
    public final /* synthetic */ C9597GRd A01;

    @Override // com.facebook.rsys.callmanager.gen.AppModelListener
    public final void onModels(Map<Long, McfReference> map) {
        C7384Etj.A0Y(map, 0);
        C9597GRd c9597GRd = this.A01;
        c9597GRd.A07.invoke(new RunnableC9596GRc(this, c9597GRd, map));
    }

    public C9606GRn(C9597GRd c9597GRd) {
        this.A01 = c9597GRd;
    }
}
