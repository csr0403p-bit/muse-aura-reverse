package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.C0z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3171C0z extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ long $cacheSizeBefore;
    public final /* synthetic */ int $cachedVideoCountAfter;
    public final /* synthetic */ long $evictedBytes;
    public final /* synthetic */ String $reason;
    public final /* synthetic */ String $videoId;
    public final /* synthetic */ C3168C0w this$0;
    public final /* synthetic */ G0U<C1R, Unit> $detail = null;
    public final /* synthetic */ G0U<String, Unit> $videoCallback = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3171C0z(C3168C0w c3168C0w, String str, String str2, int i, long j, long j2) {
        super(0);
        this.$videoId = str;
        this.this$0 = c3168C0w;
        this.$reason = str2;
        this.$evictedBytes = j;
        this.$cacheSizeBefore = j2;
        this.$cachedVideoCountAfter = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Unit invoke() {
        if (this.$detail != null) {
            String str = this.$videoId;
            String str2 = this.$reason;
            C7384Etj.A0Y(str2, 0);
            try {
                this.$detail.invoke(new C1R(str2.equals("lru_policy") ? C79.A00 : str2.equals("ttl_eviction") ? C79.A01 : C79.A02, C79.A00, str, this.$cachedVideoCountAfter, this.$evictedBytes, this.$cacheSizeBefore, this.this$0.A01));
            } catch (Exception e) {
                BV6.A1J("onEvictionDetail callback threw for videoId=%s", "OfflineCacheEvictionHandler", e, new Object[]{this.$videoId});
            }
        }
        G0U<String, Unit> g0u = this.$videoCallback;
        if (g0u != null) {
            g0u.invoke(this.$videoId);
        }
        return Unit.INSTANCE;
    }
}
