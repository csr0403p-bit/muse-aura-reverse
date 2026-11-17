package X;

import androidx.compose.runtime.MutableState;
import java.util.Map;
import kotlin.Unit;

/* renamed from: X.AOy, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1007AOy extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, BRg> {
    public final /* synthetic */ AP0 $boundsTransform;
    public final /* synthetic */ AOO $clipInOverlayDuringTransition;
    public final /* synthetic */ AOP<T> $parentTransition;
    public final /* synthetic */ InterfaceC1021AQf $placeholderSize;
    public final /* synthetic */ boolean $renderInOverlayDuringTransition;
    public final /* synthetic */ boolean $renderOnlyWhenVisible;
    public final /* synthetic */ APL $sharedContentState;
    public final /* synthetic */ G0U<T, Boolean> $visible;
    public final /* synthetic */ float $zIndexInOverlay;
    public final /* synthetic */ APZ this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/APL;LX/AOP<TT;>;LX/G0U<-TT;Ljava/lang/Boolean;>;LX/APZ;LX/AQf;ZLX/AOO;FZLX/AP0;)V */
    public C1007AOy(AP0 ap0, AOO aoo, InterfaceC1021AQf interfaceC1021AQf, APL apl, APZ apz, AOP aop, G0U g0u, float f, boolean z, boolean z2) {
        super(3);
        this.$sharedContentState = apl;
        this.$parentTransition = aop;
        this.$visible = g0u;
        this.this$0 = apz;
        this.$placeholderSize = interfaceC1021AQf;
        this.$renderOnlyWhenVisible = z;
        this.$clipInOverlayDuringTransition = aoo;
        this.$zIndexInOverlay = f;
        this.$renderInOverlayDuringTransition = z2;
        this.$boundsTransform = ap0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.G0W
    public final /* bridge */ /* synthetic */ BRg invoke(BRg bRg, BFM bfm, Integer num) {
        AOP aopA03;
        BRg bRg2 = bRg;
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        bfmA0P.AgE(-1539505585);
        Object obj = this.$sharedContentState.A02;
        bfmA0P.Ag8(-1996110647, obj);
        APZ apz = this.this$0;
        Object objAaT = bfmA0P.AaT();
        Object obj2 = C78N.A00;
        if (objAaT == obj2) {
            Map map = apz.A05;
            objAaT = (APc) map.get(obj);
            if (objAaT == null) {
                objAaT = new APc(apz, obj);
                map.put(obj, objAaT);
            }
            bfmA0P.Ai0(objAaT);
        }
        APc aPc = (APc) objAaT;
        bfmA0P.Ag8(-1996106866, this.$parentTransition);
        boolean z = false;
        if (this.$parentTransition != null) {
            bfmA0P.AgE(-1749734647);
            AOP<T> aop = this.$parentTransition;
            String string = obj.toString();
            G0U<T, Boolean> g0u = this.$visible;
            boolean zA65 = bfmA0P.A65(aop);
            Object objAaT2 = bfmA0P.AaT();
            if (zA65 || objAaT2 == obj2) {
                objAaT2 = aop.A02.A09();
                bfmA0P.Ai0(objAaT2);
            }
            if (aop.A0G()) {
                objAaT2 = aop.A02.A09();
            }
            bfmA0P.AgE(1498260051);
            Boolean boolInvoke = g0u.invoke(objAaT2);
            BBI bbiA07 = C3cG.A07(bfmA0P);
            Object value = aop.A07.getValue();
            bfmA0P.AgE(1498260051);
            Boolean boolInvoke2 = g0u.invoke(value);
            BBI.A0R(bbiA07, false);
            aopA03 = AOR.A02(aop, bfmA0P, boolInvoke, boolInvoke2, string, 0);
        } else {
            bfmA0P.AgE(-1749482679);
            G0U<T, Boolean> g0u2 = this.$visible;
            C7384Etj.A0Z(g0u2, "null cannot be cast to non-null type kotlin.Function1<kotlin.Unit, kotlin.Boolean>");
            C0862A6j.A02(g0u2, 1);
            Boolean boolInvoke3 = g0u2.invoke(Unit.INSTANCE);
            boolean zBooleanValue = boolInvoke3.booleanValue();
            Object objAaT3 = bfmA0P.AaT();
            if (objAaT3 == obj2) {
                if (C8j3.A1C(aPc.A05).isEmpty()) {
                    z = zBooleanValue;
                } else if (!zBooleanValue) {
                    z = true;
                }
                objAaT3 = new AOI(Boolean.valueOf(z));
                BBI.A0T(bfmA0P, objAaT3);
            }
            AOI aoi = (AOI) objAaT3;
            aoi.A0C(boolInvoke3);
            aopA03 = AOR.A03(aoi, bfmA0P, null, 0, 2);
        }
        BBI bbi = (BBI) bfmA0P;
        BBI.A0R(bbi, false);
        bfmA0P.Ag8(-1996043323, Boolean.valueOf(this.this$0.APC()));
        AOS aosA00 = AOR.A00(aopA03, AVd.A07, bfmA0P, 2);
        BBI.A0R(bbi, false);
        boolean zA652 = bfmA0P.A65(aopA03);
        APZ apz2 = this.this$0;
        AP0 ap0 = this.$boundsTransform;
        Object objAaT4 = bfmA0P.AaT();
        if (zA652 || objAaT4 == obj2) {
            objAaT4 = new C1008AOz(ap0, apz2, aosA00, aopA03, aPc.A07);
            BBI.A0O(bbi, objAaT4);
        }
        C1008AOz c1008AOz = (C1008AOz) objAaT4;
        AP0 ap02 = this.$boundsTransform;
        MutableState mutableState = c1008AOz.A02;
        if (!C7384Etj.areEqual(mutableState.getValue(), aosA00)) {
            mutableState.Af8(aosA00);
            c1008AOz.A03.Af8(null);
            c1008AOz.A00 = AbstractC1006AOx.A00;
        }
        c1008AOz.A04.Af8(ap02);
        BBI.A0R(bbi, false);
        InterfaceC1021AQf interfaceC1021AQf = this.$placeholderSize;
        boolean z2 = this.$renderOnlyWhenVisible;
        APL apl = this.$sharedContentState;
        AOO aoo = this.$clipInOverlayDuringTransition;
        float f = this.$zIndexInOverlay;
        boolean z3 = this.$renderInOverlayDuringTransition;
        Object objAaT5 = bfmA0P.AaT();
        if (objAaT5 == obj2) {
            objAaT5 = new APh(c1008AOz, aPc, aoo, interfaceC1021AQf, apl, f, z2, z3);
            bfmA0P.Ai0(objAaT5);
        }
        APh aPh = (APh) objAaT5;
        apl.A01.Af8(aPh);
        aPh.A0B.Af8(aPc);
        MutableState.A09(z2, aPh.A0A);
        aPh.A04.Af8(c1008AOz);
        aPh.A08.Af8(interfaceC1021AQf);
        aPh.A07.Af8(aoo);
        aPh.A03.AdS(f);
        MutableState.A09(z3, aPh.A09);
        aPh.A0C.Af8(apl);
        BBI.A0R(bbi, false);
        BRg bRgThen = bRg2.then(new AQQ(aPh));
        BBI.A0R(bbi, false);
        return bRgThen;
    }
}
