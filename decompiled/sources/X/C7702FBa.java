package X;

import java.security.NoSuchAlgorithmException;
import kotlin.Unit;

/* renamed from: X.FBa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7702FBa extends AbstractC7559F3s implements G0U<Hly, Unit> {
    public final /* synthetic */ C7403Euh $cacheKeyInputs;
    public final /* synthetic */ Hkm $cacheSummary;
    public final /* synthetic */ C7711FBj $cacheTtl;
    public final /* synthetic */ G0U<C7706FBe, Unit> $callback;
    public final /* synthetic */ long $currentTimestampMs;
    public final /* synthetic */ long $diskReadStartTs = 0;
    public final /* synthetic */ HlX $queryPurpose;
    public final /* synthetic */ FBL this$0;

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(Hly hly) throws NoSuchAlgorithmException {
        Hly hly2 = hly;
        C7384Etj.A0Y(hly2, 0);
        G0U<C7706FBe, Unit> g0u = this.$callback;
        FBL fbl = this.this$0;
        HxE hxEA00 = FBL.A00(this.$cacheKeyInputs, this.$queryPurpose, this.$cacheSummary, fbl, this.$cacheTtl, hly2, this.$currentTimestampMs, this.$diskReadStartTs);
        g0u.invoke(hxEA00 != null ? new C7706FBe(hxEA00) : null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7702FBa(C7403Euh c7403Euh, HlX hlX, Hkm hkm, FBL fbl, C7711FBj c7711FBj, G0U g0u, long j) {
        super(1);
        this.$callback = g0u;
        this.this$0 = fbl;
        this.$cacheKeyInputs = c7403Euh;
        this.$cacheTtl = c7711FBj;
        this.$queryPurpose = hlX;
        this.$currentTimestampMs = j;
        this.$cacheSummary = hkm;
    }
}
