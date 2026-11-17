package X;

/* loaded from: classes4.dex */
public final class AQ2<S> extends Ab8<AQ1<S>> {
    public final C0995ANh<S> A00;

    /* JADX WARN: Incorrect inner types in field signature: LX/AOP<TS;>.DeferredAnimation<LX/BL4;LX/ARY;>; */
    public final AOS A01;
    public final C1BO<InterfaceC2264BNd> A02;

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        AOS aos = this.A01;
        C1BO<InterfaceC2264BNd> c1bo = this.A02;
        C0995ANh<S> c0995ANh = this.A00;
        AQ1 aq1 = new AQ1();
        aq1.A02 = aos;
        aq1.A03 = c1bo;
        aq1.A01 = c0995ANh;
        aq1.A00 = ANR.A00;
        return aq1;
    }

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (obj instanceof AQ2) {
            AQ2 aq2 = (AQ2) obj;
            if (C7384Etj.areEqual(aq2.A01, this.A01) && C7384Etj.areEqual(aq2.A02, this.A02)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, (AnonymousClass005.A0E(this.A00) + C60R.A01(this.A01)) * 31);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "sizeTransform";
        BHD bhd = asf.A02;
        bhd.A01("sizeAnimation", this.A01);
        bhd.A01("sizeTransform", this.A02);
        bhd.A01("scope", this.A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        AQ1 aq1 = (AQ1) abstractC1439Aj8;
        aq1.A02 = this.A01;
        aq1.A03 = this.A02;
        aq1.A01 = this.A00;
    }

    /* JADX WARN: Incorrect inner types in method signature: (LX/AOP<TS;>.DeferredAnimation<LX/BL4;LX/ARY;>;LX/1BO<+LX/BNd;>;LX/ANh<TS;>;)V */
    public AQ2(C0995ANh c0995ANh, AOS aos, C1BO c1bo) {
        this.A01 = aos;
        this.A02 = c1bo;
        this.A00 = c0995ANh;
    }
}
