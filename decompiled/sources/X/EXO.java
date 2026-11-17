package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class EXO implements CQG {
    public final /* synthetic */ EXP A00;
    public final /* synthetic */ C6729EXn A01;
    public final /* synthetic */ C6718EXb A02;
    public final /* synthetic */ G0U<String, Unit> A03;
    public final /* synthetic */ Hm1<Hkf> A04;

    @Override // X.CQG
    public final void onFailure(Throwable th) {
        C7384Etj.A0Y(th, 0);
        this.A03.invoke(FGI.A0M("Product info query failed: ", th.getMessage()));
    }

    /* JADX WARN: Incorrect types in method signature: (LX/EXP;LX/EXn;LX/EXb;LX/Hm1<-LX/Hkf;>;LX/G0U<-Ljava/lang/String;Lkotlin/Unit;>;)V */
    public EXO(EXP exp, C6729EXn c6729EXn, C6718EXb c6718EXb, G0U g0u, Hm1 hm1) {
        this.A00 = exp;
        this.A01 = c6729EXn;
        this.A02 = c6718EXb;
        this.A04 = hm1;
        this.A03 = g0u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.CQG
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        A7N a7n;
        String strAIJ;
        String strAIJ2;
        F1G f1g = (F1G) obj;
        if (f1g != null && (a7n = (A7N) ((CPX) f1g).A01) != null) {
            ImmutableList<? extends A7O> immutableListAJc = a7n.innerData.AJc(-1005628997);
            ArrayList arrayListA0i = AnonymousClass003.A0i(immutableListAJc);
            Iterator<? extends A7O> it = immutableListAJc.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(new C5233Ddr(C7384Etj.A0A(it.next())));
            }
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) arrayListA0i);
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator<E> it2 = immutableListCopyOf.iterator();
            while (it2.hasNext()) {
                A7N a7n2 = (A7N) it2.next();
                String strAIJ3 = a7n2.innerData.AIJ(756285279);
                if (strAIJ3 != null) {
                    A7O a7oAIK = a7n2.innerData.AIK(754431350);
                    Double dA0v = (a7oAIK == null || (strAIJ2 = a7oAIK.AIJ(-1413853096)) == null) ? null : C9tJ.A0v(strAIJ2);
                    A7O a7oAIK2 = a7n2.innerData.AIK(754431350);
                    if (a7oAIK2 == null || (strAIJ = a7oAIK2.AIJ(575402001)) == null) {
                        strAIJ = "USD";
                    }
                    arrayListA0h.add(new HyC(strAIJ3, dA0v != null ? String.format(Locale.ROOT, "%.2f %s", Arrays.copyOf(new Object[]{dA0v, strAIJ}, 2)) : "$0.99", (long) ((dA0v != null ? dA0v.doubleValue() : 0.99d) * 1000000.0d), strAIJ));
                }
            }
            if (!arrayListA0h.isEmpty()) {
                C6725EXj c6725EXj = this.A00.A02;
                C6729EXn c6729EXnA0y = C6729EXn.A0y(this.A01, null, Long.valueOf(this.A02.A00()), null);
                C8ee c8eeA00 = C6725EXj.A00(c6725EXj);
                if (c8eeA00 != null) {
                    Eu1 eu1AcquireEvent = c8eeA00.acquireEvent("client_fetch_dcpiacproductinfo_success");
                    if (eu1AcquireEvent.isSampled()) {
                        Eu1.A00(eu1AcquireEvent);
                        Eu1.A01(eu1AcquireEvent, AbstractC6727EXl.A00(c6729EXnA0y));
                        EVX.A00(eu1AcquireEvent);
                    }
                }
                this.A04.resumeWith(new Hkf(C9732Gel.A03, arrayListA0h, C0881AGi.A00));
                return;
            }
        }
        this.A03.invoke("Empty product info response");
    }
}
