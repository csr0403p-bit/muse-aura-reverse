package X;

import com.facebook.rsys.state.gen.State;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.GRl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9604GRl implements GSB {
    public final /* synthetic */ GRZ A00;
    public final /* synthetic */ AtomicReference<GSQ> A01;
    public final /* synthetic */ G0U<GRH, Boolean> A02;
    public final /* synthetic */ G0U<GRH, Unit> A03;
    public final /* synthetic */ G0U<GSQ, Unit> A04;
    public final /* synthetic */ C10543Hqv<Function0<Unit>> A05;
    public final /* synthetic */ C10543Hqv<HoC> A06;

    @Override // X.GSB
    public final void ANw(GRH grh) {
        C7384Etj.A0Y(grh, 0);
        G0U<GRH, Unit> g0u = this.A03;
        if (g0u != null) {
            g0u.invoke(grh);
        }
        if (AnonymousClass003.A1X(grh, this.A02)) {
            AtomicReference<GSQ> atomicReference = this.A01;
            C10543Hqv<HoC> c10543Hqv = this.A06;
            C10543Hqv<Function0<Unit>> c10543Hqv2 = this.A05;
            AbstractC9603GRj.A01(new GS5(this.A00), atomicReference, this.A04, c10543Hqv, c10543Hqv2);
        }
        State state = (State) grh.A00(State.class);
        if (state == null || state.callState != 0) {
            return;
        }
        AtomicReference<GSQ> atomicReference2 = this.A01;
        C10543Hqv<HoC> c10543Hqv3 = this.A06;
        C10543Hqv<Function0<Unit>> c10543Hqv4 = this.A05;
        AbstractC9603GRj.A01(GSG.A00, atomicReference2, this.A04, c10543Hqv3, c10543Hqv4);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/G0U<-LX/GRH;Lkotlin/Unit;>;LX/G0U<-LX/GRH;Ljava/lang/Boolean;>;LX/GRZ;Ljava/util/concurrent/atomic/AtomicReference<LX/GSQ;>;LX/Hqv<LX/HoC;>;LX/Hqv<Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;>;LX/G0U<-LX/GSQ;Lkotlin/Unit;>;)V */
    public C9604GRl(GRZ grz, AtomicReference atomicReference, G0U g0u, G0U g0u2, G0U g0u3, C10543Hqv c10543Hqv, C10543Hqv c10543Hqv2) {
        this.A03 = g0u;
        this.A02 = g0u2;
        this.A00 = grz;
        this.A01 = atomicReference;
        this.A06 = c10543Hqv;
        this.A05 = c10543Hqv2;
        this.A04 = g0u3;
    }
}
