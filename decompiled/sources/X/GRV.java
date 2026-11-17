package X;

/* loaded from: classes6.dex */
public final class GRV extends AbstractC7559F3s implements G0U<Object, Object> {
    public final /* synthetic */ int $instanceId;
    public final /* synthetic */ G0U<Object, Object> $origDispatch;
    public final /* synthetic */ GSO $perfLogger = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GRV(G0U g0u, int i) {
        super(1);
        this.$instanceId = i;
        this.$origDispatch = g0u;
    }

    @Override // X.G0U
    public final Object invoke(Object obj) {
        C7384Etj.A0Y(obj, 0);
        return this.$origDispatch.invoke(obj);
    }
}
