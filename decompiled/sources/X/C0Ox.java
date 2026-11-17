package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.0Ox, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Ox extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, Unit> {
    public final /* synthetic */ C1822Arm $bodyLarge;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $placeholder;
    public final /* synthetic */ C1BO<Float> $placeholderAlpha;
    public final /* synthetic */ long $placeholderColor;

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Unit invoke(BRg bRg, BFM bfm, Integer num) {
        BRg bRg2 = bRg;
        BFM bfm2 = bfm;
        int iA0F = AnonymousClass001.A0F(num);
        if ((iA0F & 6) == 0) {
            iA0F |= AnonymousClass004.A0d(bfm2, bRg2);
        }
        if ((iA0F & 19) == 18 && bfm2.AKh()) {
            bfm2.Afo();
        } else {
            boolean zA65 = bfm2.A65(this.$placeholderAlpha);
            C1BO<Float> c1bo = this.$placeholderAlpha;
            Object objAaT = bfm2.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new C05463bs(c1bo, 19);
                bfm2.Ai0(objAaT);
            }
            BRg bRgA0W = AnonymousClass001.A0W(bRg2, objAaT);
            long j = this.$placeholderColor;
            C1822Arm c1822Arm = this.$bodyLarge;
            G0V<BFM, Integer, Unit> g0v = this.$placeholder;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A0E, false);
            BBI bbi = (BBI) bfm2;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm2, bRgA0W);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm2, bbi, function0);
            AnonymousClass003.A0o(bfm2, interfaceC1380AiAA01, akqA04);
            G0V<InterfaceC1516AkQ, Integer, Unit> g0v2 = C1515AkP.A03;
            if (bbi.A0M || !AnonymousClass007.A1K(bfm2, iA0J)) {
                AnonymousClass006.A1U(g0v2, bfm2, iA0J);
            }
            AnonymousClass001.A16(bfm2, bRgA01);
            AbstractC046219w.A03(bfm2, c1822Arm, g0v, 0, j);
            BBI.A0R(bbi, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/1BO<Ljava/lang/Float;>;JLX/Arm;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;)V */
    public C0Ox(C1BO c1bo, C1822Arm c1822Arm, G0V g0v, long j) {
        super(3);
        this.$placeholderAlpha = c1bo;
        this.$placeholderColor = j;
        this.$bodyLarge = c1822Arm;
        this.$placeholder = g0v;
    }
}
