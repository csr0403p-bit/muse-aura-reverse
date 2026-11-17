package X;

import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ALD extends AbstractC7559F3s implements G0U<ALA, Unit> {
    public final /* synthetic */ ALE $config;
    public final /* synthetic */ G0U<C9n4, Unit> $onMapReady;
    public final /* synthetic */ G0U<C9n4, Unit> $onMapRelease;
    public final /* synthetic */ AFR $retained;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/AFR;LX/ALE;LX/G0U<-LX/9n4;Lkotlin/Unit;>;LX/G0U<-LX/9n4;Lkotlin/Unit;>;)V */
    public ALD(ALE ale, AFR afr, G0U g0u, G0U g0u2) {
        super(1);
        this.$retained = afr;
        this.$config = ale;
        this.$onMapReady = g0u;
        this.$onMapRelease = g0u2;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(ALA ala) {
        AFR afr;
        ALA ala2 = ala;
        C7384Etj.A0Y(ala2, 0);
        AFR afr2 = this.$retained;
        ALE ale = this.$config;
        G0U<C9n4, Unit> g0u = this.$onMapReady;
        G0U<C9n4, Unit> g0u2 = this.$onMapRelease;
        C7384Etj.A0Y(afr2, 0);
        C7384Etj.A0Y(ale, 1);
        ALK alk = ala2.A02;
        if (alk != null && (afr = alk.A01) != afr2) {
            ALA.A01(ala2);
            ALG.A00(afr, ala2);
            ala2.A03 = false;
        }
        ALK alk2 = new ALK(ale, afr2, g0u, g0u2);
        ala2.A02 = alk2;
        List list = (List) C60R.A0Z(afr2, ALG.A00);
        AbstractC0882AGj.A0v(list, new C2326BUa(ala2, 16));
        list.add(new WeakReference(ala2));
        ALA.A00(alk2, ala2);
        return Unit.INSTANCE;
    }
}
