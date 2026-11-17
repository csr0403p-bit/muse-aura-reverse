package X;

import androidx.compose.animation.core.SeekableTransitionState;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BUJ extends AbstractC07127nr implements G0V {
    public final int $t = 0;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BUJ(List list, List list2, HtJ htJ) {
        super(2, htJ);
        this.A06 = list;
        this.A05 = list2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        switch (this.$t) {
            case 0:
                SeekableTransitionState seekableTransitionState = (SeekableTransitionState) this.A04;
                Object obj2 = this.A06;
                return new BUJ((AOe) this.A05, seekableTransitionState, (AOP) this.A01, obj2, htJ);
            case 1:
                BUJ buj = new BUJ((BRr) this.A03, htJ, (G0U) this.A05, (G0U) this.A06, (G0U) this.A02, (G0W) this.A01);
                buj.A04 = obj;
                return buj;
            default:
                BUJ buj2 = new BUJ((List) this.A06, (List) this.A05, htJ);
                buj2.A01 = obj;
                return buj2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0262 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0158 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016c  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BUJ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BUJ) C8j3.A1E(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/BRr;LX/G0U<-LX/AWx;Lkotlin/Unit;>;LX/G0U<-LX/AWx;Lkotlin/Unit;>;LX/G0W<-LX/AWo;-LX/AWx;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/G0U<-LX/AWx;Lkotlin/Unit;>;LX/HtJ<-LX/BUJ;>;)V */
    public BUJ(BRr bRr, HtJ htJ, G0U g0u, G0U g0u2, G0U g0u3, G0W g0w) {
        super(2, htJ);
        this.A03 = bRr;
        this.A05 = g0u;
        this.A06 = g0u2;
        this.A01 = g0w;
        this.A02 = g0u3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/animation/core/SeekableTransitionState<TS;>;TS;LX/AOP<TS;>;LX/AOe<Ljava/lang/Float;>;LX/HtJ<-LX/BUJ;>;)V */
    public BUJ(AOe aOe, SeekableTransitionState seekableTransitionState, AOP aop, Object obj, HtJ htJ) {
        super(2, htJ);
        this.A04 = seekableTransitionState;
        this.A06 = obj;
        this.A01 = aop;
        this.A05 = aOe;
    }
}
