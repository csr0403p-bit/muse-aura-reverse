package X;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ANQ extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
    public final /* synthetic */ G2j<C06c, S, BFM, Integer, Unit> $content;
    public final /* synthetic */ SnapshotStateList<S> $currentlyVisible;
    public final /* synthetic */ C0995ANh<S> $rootScope;
    public final /* synthetic */ S $stateForContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/runtime/snapshots/SnapshotStateList<TS;>;TS;LX/ANh<TS;>;LX/G2j<-LX/06c;-TS;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public ANQ(C0995ANh c0995ANh, SnapshotStateList snapshotStateList, Object obj, G2j g2j) {
        super(3);
        this.$currentlyVisible = snapshotStateList;
        this.$stateForContent = obj;
        this.$rootScope = c0995ANh;
        this.$content = g2j;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) {
        C1Cd c1Cd2 = c1Cd;
        BFM bfm2 = bfm;
        int iA0F = AnonymousClass001.A0F(num);
        if ((iA0F & 6) == 0) {
            iA0F |= AnonymousClass002.A05(AnonymousClass004.A1X(c1Cd2, bfm2, iA0F) ? 1 : 0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0F & 19, 18), bfm2, iA0F)) {
            boolean zA1T = AnonymousClass001.A1T(bfm2, this.$rootScope, AnonymousClass001.A1T(bfm2, this.$stateForContent, bfm2.A65(this.$currentlyVisible)));
            SnapshotStateList<S> snapshotStateList = this.$currentlyVisible;
            S s = this.$stateForContent;
            C0995ANh<S> c0995ANh = this.$rootScope;
            Object objAaT = bfm2.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new C2339BUn(c0995ANh, snapshotStateList, s, 0);
                bfm2.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm2, objAaT, c1Cd2);
            C0918AHu<S, C1BO<BL4>> c0918AHu = this.$rootScope.A02;
            S s2 = this.$stateForContent;
            C7384Etj.A0Z(c1Cd2, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
            c0918AHu.A0E(s2, ((C04691Bt) c1Cd2).A01);
            Object objAaT2 = bfm2.AaT();
            if (objAaT2 == C78N.A00) {
                objAaT2 = new C1Ce(c1Cd2);
                BBI.A0T(bfm2, objAaT2);
            }
            AnonymousClass001.A1F(objAaT2, this.$stateForContent, bfm2, this.$content, 0);
        } else {
            bfm2.Afo();
        }
        return Unit.INSTANCE;
    }
}
