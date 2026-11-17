package X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class FD4 {
    public final C7727FCd A01;
    public final G0U<FD4, Unit> A03;
    public final AIG<HxE<InterfaceC7646F8n, C7658F9a>> A02 = new AIG<>();
    public Integer A00 = C79.A00;

    public final void A00() throws Exception {
        Integer num = this.A00;
        Integer num2 = C79.A0K;
        if (num != num2) {
            this.A00 = num2;
            this.A02.clear();
            ((C8631Fhi) this.A03).invoke(this);
        }
    }

    public final void A01() {
        int size;
        AIG<HxE<InterfaceC7646F8n, C7658F9a>> aig = this.A02;
        Iterator<HxE<InterfaceC7646F8n, C7658F9a>> it = aig.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            HxE<InterfaceC7646F8n, C7658F9a> next = it.next();
            C7384Etj.A0Y(next, 0);
            if (!next.second.A00) {
                i++;
            } else if (i != -1) {
                size = i + 1;
            }
        }
        size = aig.size();
        List<HxE<InterfaceC7646F8n, C7658F9a>> listSubList = aig.subList(0, size);
        ArrayList arrayListA0R = AbstractC0878AGe.A0R(listSubList);
        listSubList.clear();
        if (arrayListA0R.isEmpty()) {
            A00();
        } else {
            ((Handler) AbstractC8162FXe.A01.getValue()).post(new FD5(this, arrayListA0R));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FD4(C7727FCd c7727FCd, G0U<? super FD4, Unit> g0u) {
        this.A01 = c7727FCd;
        this.A03 = g0u;
    }
}
