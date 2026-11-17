package X;

/* loaded from: classes6.dex */
public final class GRT extends AbstractC7559F3s implements G0W<GRU<GRH>, G0U<? super Object, ? extends Object>, Object, Object> {
    public final /* synthetic */ G0U<G0U<Object, ? extends Object>, G0U<Object, Object>> $composedChain;
    public final /* synthetic */ int $instanceId;
    public final /* synthetic */ GSO $perfLogger = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GRT(G0U g0u, int i) {
        super(3);
        this.$instanceId = i;
        this.$composedChain = g0u;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(GRU<GRH> gru, G0U<? super Object, ? extends Object> g0u, Object obj) {
        AnonymousClass003.A0x(g0u, obj);
        return this.$composedChain.invoke(g0u).invoke(obj);
    }
}
