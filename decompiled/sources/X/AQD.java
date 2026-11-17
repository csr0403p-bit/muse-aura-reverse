package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AQD extends AbstractC7559F3s implements G0U<AYU, Unit> {
    public final /* synthetic */ G0U<C2av, Unit> $layerBlock;
    public final /* synthetic */ long $offset;
    public final /* synthetic */ long $offsetDelta;
    public final /* synthetic */ AZE $placeable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/AZE;JJLX/G0U<-LX/2av;Lkotlin/Unit;>;)V */
    public AQD(AZE aze, G0U g0u, long j, long j2) {
        super(1);
        this.$placeable = aze;
        this.$offset = j;
        this.$offsetDelta = j2;
        this.$layerBlock = g0u;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
        AZE aze = this.$placeable;
        long j = this.$offset;
        long j2 = this.$offsetDelta;
        ayu.A0C(aze, this.$layerBlock, ((int) (j2 >> 32)) + ((int) (j >> 32)), AnonymousClass002.A09(j2) + AnonymousClass002.A09(j));
        return Unit.INSTANCE;
    }
}
