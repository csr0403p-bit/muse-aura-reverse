package X;

import com.facebook.pando.PandoGraphQLConsistencyJNI;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class E86 extends AbstractC7559F3s implements Function0 {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public E86(Object obj, PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI, DYD dyd, CPW<T> cpw, Executor executor, G0U<? super A7O, ? extends T> g0u) {
        super(0);
        this.$t = g0u;
        this.A04 = dyd;
        this.A00 = obj;
        this.A02 = pandoGraphQLConsistencyJNI;
        this.A01 = cpw;
        this.A03 = executor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        EXP exp;
        C6729EXn c6729EXn;
        C6718EXb c6718EXb;
        EXZ exz;
        Object obj;
        switch (this.$t) {
            case 0:
                return ((PandoGraphQLConsistencyJNI) this.A04).subscribeToBuilder(null, (CPW) this.A02, (Executor) this.A01, (G0U) this.A03);
            case 1:
                exp = (EXP) this.A04;
                c6729EXn = (C6729EXn) this.A01;
                c6718EXb = (C6718EXb) this.A02;
                exz = (EXZ) this.A00;
                obj = this.A03;
                break;
            default:
                exp = (EXP) this.A04;
                c6729EXn = (C6729EXn) this.A02;
                c6718EXb = (C6718EXb) this.A03;
                exz = (EXZ) this.A01;
                obj = this.A00;
                break;
        }
        EXP.A03(exz, exp, c6729EXn, c6718EXb, FGI.A0M("IAC: sandbox session creation failed: ", ((Throwable) obj).getMessage()));
        return Unit.INSTANCE;
    }
}
