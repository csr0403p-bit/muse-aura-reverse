package X;

import com.facebook.aura.nodes.cards.HatchGeofenceCardKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AQ3 extends Ab8<AQ0> {
    public APu A00;
    public APt A01;
    public InterfaceC1027AQl A02;

    /* JADX WARN: Incorrect inner types in field signature: LX/AOP<LX/1Bv;>.DeferredAnimation<LX/2ae;LX/ARY;>; */
    public AOS A03;

    /* JADX WARN: Incorrect inner types in field signature: LX/AOP<LX/1Bv;>.DeferredAnimation<LX/BL4;LX/ARY;>; */
    public AOS A04;

    /* JADX WARN: Incorrect inner types in field signature: LX/AOP<LX/1Bv;>.DeferredAnimation<LX/2ae;LX/ARY;>; */
    public AOS A05;
    public Function0<Boolean> A06;
    public final AOP<EnumC04711Bv> A07;

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        AOP<EnumC04711Bv> aop = this.A07;
        AOS aos = this.A04;
        AOS aos2 = this.A03;
        AOS aos3 = this.A05;
        return new AQ0(this.A00, this.A01, this.A02, aos, aos2, aos3, aop, this.A06);
    }

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (obj instanceof AQ3) {
            AQ3 aq3 = (AQ3) obj;
            if (C7384Etj.areEqual(aq3.A07, this.A07) && C7384Etj.areEqual(aq3.A04, this.A04) && C7384Etj.areEqual(aq3.A03, this.A03) && C7384Etj.areEqual(aq3.A05, this.A05) && C7384Etj.areEqual(aq3.A00, this.A00) && C7384Etj.areEqual(aq3.A01, this.A01) && aq3.A06 == this.A06 && C7384Etj.areEqual(aq3.A02, this.A02)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, AnonymousClass005.A0F(this.A06, AnonymousClass005.A0F(this.A01, AnonymousClass005.A0F(this.A00, (((((AnonymousClass005.A0E(this.A07) + C60R.A01(this.A04)) * 31) + C60R.A01(this.A03)) * 31) + C8j4.A0E(this.A05, 0)) * 31))));
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "enterExitTransition";
        BHD bhd = asf.A02;
        bhd.A01("transition", this.A07);
        bhd.A01("sizeAnimation", this.A04);
        bhd.A01("offsetAnimation", this.A03);
        bhd.A01("slideAnimation", this.A05);
        bhd.A01(HatchGeofenceCardKt.TRIGGER_ENTER, this.A00);
        bhd.A01(HatchGeofenceCardKt.TRIGGER_EXIT, this.A01);
        bhd.A01("graphicsLayerBlock", this.A02);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        AQ0 aq0 = (AQ0) abstractC1439Aj8;
        aq0.A06 = this.A07;
        aq0.A04 = this.A04;
        aq0.A03 = this.A03;
        aq0.A05 = this.A05;
        aq0.A00 = this.A00;
        aq0.A01 = this.A01;
        aq0.A08 = this.A06;
        aq0.A02 = this.A02;
    }

    /* JADX WARN: Incorrect inner types in method signature: (LX/AOP<LX/1Bv;>;LX/AOP<LX/1Bv;>.DeferredAnimation<LX/BL4;LX/ARY;>;LX/AOP<LX/1Bv;>.DeferredAnimation<LX/2ae;LX/ARY;>;LX/AOP<LX/1Bv;>.DeferredAnimation<LX/2ae;LX/ARY;>;LX/APu;LX/APt;Lkotlin/jvm/functions/Function0<Ljava/lang/Boolean;>;LX/AQl;)V */
    public AQ3(APu aPu, APt aPt, InterfaceC1027AQl interfaceC1027AQl, AOS aos, AOS aos2, AOS aos3, AOP aop, Function0 function0) {
        this.A07 = aop;
        this.A04 = aos;
        this.A03 = aos2;
        this.A05 = aos3;
        this.A00 = aPu;
        this.A01 = aPt;
        this.A06 = function0;
        this.A02 = interfaceC1027AQl;
    }
}
