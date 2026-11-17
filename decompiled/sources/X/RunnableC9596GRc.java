package X;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.state.gen.State;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.GRc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC9596GRc implements Runnable {
    public static final String __redex_internal_original_name = "DefaultCall$1$onModels$1";
    public final /* synthetic */ C9606GRn A00;
    public final /* synthetic */ C9597GRd A01;
    public final /* synthetic */ Map<Long, McfReference> A02;

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<Ljava/lang/Long;Lcom/facebook/djinni/msys/infra/McfReference;>;LX/GRd;LX/GRn;)V */
    public RunnableC9596GRc(C9606GRn c9606GRn, C9597GRd c9597GRd, Map map) {
        this.A02 = map;
        this.A01 = c9597GRd;
        this.A00 = c9606GRn;
    }

    public static final int A00(GRD grd) {
        Object objA01 = ((GR7) grd).A00.A01(State.CONVERTER);
        if (objA01 != null) {
            return ((State) objA01).callState;
        }
        throw BV4.A0U();
    }

    @Override // java.lang.Runnable
    public final void run() {
        GR7 gr7 = new GR7(this.A02);
        C9597GRd c9597GRd = this.A01;
        boolean zA1Z = AnonymousClass002.A1Z(c9597GRd.A04, C79.A00);
        if (A00(gr7) == 0) {
            c9597GRd.A00 = null;
            if (c9597GRd.A08 && zA1Z) {
                Iterator<GS8> it = c9597GRd.A06.iterator();
                while (it.hasNext()) {
                    it.next().AUC(c9597GRd, gr7);
                }
            }
        } else if (zA1Z) {
            c9597GRd.A00 = gr7;
            Iterator<GS8> it2 = c9597GRd.A06.iterator();
            while (it2.hasNext()) {
                it2.next().AUC(c9597GRd, gr7);
            }
        }
        C9606GRn c9606GRn = this.A00;
        Integer num = c9606GRn.A00;
        int iA00 = A00(gr7);
        if ((num == null || num.intValue() != iA00) && A00(gr7) == 0) {
            synchronized (c9597GRd) {
                if (!c9597GRd.A01) {
                    c9597GRd.A01 = true;
                    Iterator<GS8> it3 = c9597GRd.A06.iterator();
                    while (it3.hasNext()) {
                        it3.next().AS4(c9597GRd);
                    }
                }
            }
        }
        c9606GRn.A00 = Integer.valueOf(A00(gr7));
    }
}
