package X;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AP4 extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, BRg> {
    public final /* synthetic */ C1Cd $animatedVisibilityScope;
    public final /* synthetic */ APu $enter;
    public final /* synthetic */ APt $exit;
    public final /* synthetic */ APW $resizeMode;
    public final /* synthetic */ APL $sharedContentState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AP4(C1Cd c1Cd, APu aPu, APt aPt, APW apw, APL apl) {
        super(3);
        this.$animatedVisibilityScope = c1Cd;
        this.$enter = aPu;
        this.$exit = aPt;
        this.$sharedContentState = apl;
        this.$resizeMode = apw;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ BRg invoke(BRg bRg, BFM bfm, Integer num) {
        BBI bbiA0M;
        BRg bRgThen;
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        bfmA0P.AgE(-233734437);
        AOP<EnumC04711Bv> aopAM0 = this.$animatedVisibilityScope.AM0();
        APu aPu = this.$enter;
        APt aPt = this.$exit;
        boolean zA67 = bfmA0P.A67(this.$sharedContentState);
        APL apl = this.$sharedContentState;
        Object objAaT = bfmA0P.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = C2328BUc.A00(apl, 4);
            bfmA0P.Ai0(objAaT);
        }
        BRg bRgA0K = AbstractC1011APs.A0K(aPu, aPt, aopAM0, bfmA0P, C8j3.A14(this.$sharedContentState.A02, C60O.A0x("enter/exit for ")), (Function0) objAaT, 4);
        if (this.$resizeMode instanceof APN) {
            BRg bRgA09 = C3cG.A09(bfmA0P, -1039792755);
            APN apn = (APN) this.$resizeMode;
            boolean zA672 = bfmA0P.A67(this.$sharedContentState);
            APL apl2 = this.$sharedContentState;
            Object objAaT2 = bfmA0P.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = C2328BUc.A00(apl2, 5);
                bfmA0P.Ai0(objAaT2);
            }
            Function0 function0 = (Function0) objAaT2;
            if (apn.A01.equals(B18.A00)) {
                bRgA09 = AbstractC1396AiR.A00(bRgA09, BUX.A00(function0, 11));
            }
            bRgThen = bRgA09.then(new AQ4(apn, function0));
            bbiA0M = C3cG.A07(bfmA0P);
        } else {
            bbiA0M = AnonymousClass002.A0M(bfmA0P, -1039175545);
            bRgThen = BRg.A00;
        }
        BRg bRgThen2 = bRgA0K.then(bRgThen);
        BBI.A0R(bbiA0M, false);
        return bRgThen2;
    }
}
