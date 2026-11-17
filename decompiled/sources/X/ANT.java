package X;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ANT extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ G2j<C06c, S, BFM, Integer, Unit> $content;
    public final /* synthetic */ SnapshotStateList<S> $currentlyVisible;
    public final /* synthetic */ C0995ANh<S> $rootScope;
    public final /* synthetic */ S $stateForContent;
    public final /* synthetic */ AOP<S> $this_AnimatedContent;
    public final /* synthetic */ G0U<ANi<S>, ANU> $transitionSpec;

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfm2 = bfm;
        int iA0F = AnonymousClass001.A0F(num);
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(iA0F), bfm2, iA0F)) {
            G0U<ANi<S>, ANU> g0u = this.$transitionSpec;
            AOB aob = this.$rootScope;
            ANU anuAaT = bfm2.AaT();
            Object obj = C78N.A00;
            if (anuAaT == obj) {
                anuAaT = g0u.invoke(aob);
                bfm2.Ai0(anuAaT);
            }
            ANU anu = (ANU) anuAaT;
            boolean zA66 = bfm2.A66(C7384Etj.areEqual(this.$this_AnimatedContent.A03().ALW(), this.$stateForContent));
            AOP<S> aop = this.$this_AnimatedContent;
            S s = this.$stateForContent;
            G0U<ANi<S>, ANU> g0u2 = this.$transitionSpec;
            AOB aob2 = this.$rootScope;
            Object objAaT = bfm2.AaT();
            if (zA66 || objAaT == obj) {
                objAaT = C7384Etj.areEqual(aop.A03().ALW(), s) ? APt.A00 : g0u2.invoke(aob2).A02;
                bfm2.Ai0(objAaT);
            }
            APt aPt = (APt) objAaT;
            S s2 = this.$stateForContent;
            AOP<S> aop2 = this.$this_AnimatedContent;
            Object objAaT2 = bfm2.AaT();
            if (objAaT2 == obj) {
                objAaT2 = new Ab9(MutableState.A0B(aop2.A07, s2));
                BBI.A0T(bfm2, objAaT2);
            }
            Ab9 ab9 = (Ab9) objAaT2;
            APu aPu = anu.A01;
            BS0 bs0 = BRg.A00;
            boolean zA67 = bfm2.A67(anu);
            Object objAaT3 = bfm2.AaT();
            if (zA67 || objAaT3 == obj) {
                objAaT3 = new BUY(anu, 0);
                bfm2.Ai0(objAaT3);
            }
            BRg bRgA00 = C3UC.A00(bs0, (G0W) objAaT3);
            MutableState.A09(MutableState.A0B(this.$this_AnimatedContent.A07, this.$stateForContent), ab9.A00);
            BRg bRgThen = bRgA00.then(ab9);
            AOP<S> aop3 = this.$this_AnimatedContent;
            boolean zA672 = bfm2.A67(this.$stateForContent);
            S s3 = this.$stateForContent;
            Object objAaT4 = bfm2.AaT();
            if (zA672 || objAaT4 == obj) {
                objAaT4 = BUX.A00(s3, 0);
                bfm2.Ai0(objAaT4);
            }
            G0U g0u3 = (G0U) objAaT4;
            boolean zA65 = bfm2.A65(aPt);
            Object objAaT5 = bfm2.AaT();
            if (zA65 || objAaT5 == obj) {
                objAaT5 = new BUZ(aPt, 0);
                bfm2.Ai0(objAaT5);
            }
            AbstractC04661Bq.A03(aPu, aPt, aop3, bfm2, bRgThen, g0u3, (G0V) objAaT5, B1V.A00(bfm2, new ANQ(this.$rootScope, this.$currentlyVisible, this.$stateForContent, this.$content), -143346359), 12582912, 64);
        } else {
            bfm2.Afo();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/AOP<TS;>;TS;LX/G0U<-LX/ANi<TS;>;LX/ANU;>;LX/ANh<TS;>;Landroidx/compose/runtime/snapshots/SnapshotStateList<TS;>;LX/G2j<-LX/06c;-TS;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public ANT(C0995ANh c0995ANh, AOP aop, SnapshotStateList snapshotStateList, Object obj, G0U g0u, G2j g2j) {
        super(2);
        this.$this_AnimatedContent = aop;
        this.$stateForContent = obj;
        this.$transitionSpec = g0u;
        this.$rootScope = c0995ANh;
        this.$currentlyVisible = snapshotStateList;
        this.$content = g2j;
    }
}
