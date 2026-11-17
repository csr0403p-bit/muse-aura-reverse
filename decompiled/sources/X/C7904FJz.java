package X;

/* renamed from: X.FJz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7904FJz extends AbstractC7559F3s implements G0W<C7897FJr, FK0, EtN, FK1> {
    public final /* synthetic */ int $layerType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7904FJz(int i) {
        super(3);
        this.$layerType = i;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ FK1 invoke(C7897FJr c7897FJr, FK0 fk0, EtN etN) {
        int i;
        FK0 fk02 = fk0;
        boolean zA1Y = C60P.A1Y(c7897FJr, fk02);
        C7384Etj.A0Y(etN, 2);
        int layerType = fk02.getLayerType();
        int i2 = this.$layerType;
        if (i2 == zA1Y) {
            i = 1;
        } else {
            i = 0;
            if (i2 == 2) {
                i = 2;
            }
        }
        if (fk02.getLayerType() != i) {
            fk02.setLayerType(i, null);
        }
        return new FK1(new C2350BUz(fk02, layerType, 3));
    }
}
