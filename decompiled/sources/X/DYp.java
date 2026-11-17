package X;

import com.facebook.pando.PandoGraphQLConsistencyJNI;
import com.facebook.pando.PandoGraphQLServiceJNI;
import com.facebook.pando.PandoParseConfig;
import com.facebook.pando.PandoPrimaryExecution;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class DYp {
    public final C5120DZw A00;
    public final DYx A01;
    public final PandoParseConfig A02;
    public final Executor A03;
    public final F0C<PandoGraphQLConsistencyJNI> A04;
    public final F0C<PandoGraphQLServiceJNI> A05;
    public final F0C<PandoGraphQLServiceJNI> A06;
    public final F0C A07;
    public final F0C<PandoGraphQLServiceJNI> A08;
    public final boolean A09;

    public /* synthetic */ DYp(DZK dzk, C5120DZw c5120DZw, DYx dYx, Executor executor, F0C f0c, F0C f0c2, boolean z) {
        PandoParseConfig pandoParseConfig = new PandoParseConfig(false, false, null);
        C7384Etj.A0Y(c5120DZw, 3);
        this.A04 = f0c2;
        this.A03 = executor;
        this.A00 = c5120DZw;
        this.A01 = dYx;
        this.A02 = pandoParseConfig;
        this.A09 = z;
        this.A06 = new C5322DgG(null, new C6597EIz(this, (DYp) f0c, (F0C<? extends PandoPrimaryExecution>) 5));
        this.A05 = new C5322DgG(null, new C6597EIz(this, (DYp) f0c, (F0C<? extends PandoPrimaryExecution>) 4));
        this.A07 = AbstractC5321DgF.A02(C79.A0C, new EEA(dzk, this, f0c, 0));
        this.A08 = new C5322DgG(null, new C6597EIz(this));
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/F0C<+TT;>;LX/G0U<-TT;+LX/DYe;>;LX/CPS;Ljava/util/concurrent/Executor;)LX/DYe; */
    public static final InterfaceC5106DYe A00(CPS cps, Executor executor, F0C f0c, G0U g0u) {
        try {
            return (InterfaceC5106DYe) g0u.invoke(f0c.getValue());
        } catch (Exception | LinkageError e) {
            if (cps == null) {
                CFK.A08("PandoQueryExecutor", "Failed to initialize Pando service", e);
            } else {
                executor.execute(new RunnableC5112DYo(cps, e));
            }
            return new DY8();
        }
    }
}
