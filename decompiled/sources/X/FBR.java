package X;

import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class FBR extends AbstractC7559F3s implements G0U<C7706FBe, Unit> {
    public final /* synthetic */ String $appId;
    public final /* synthetic */ G0U<HoL, Unit> $backgroundRefetchCallback;
    public final /* synthetic */ FBL $cache;
    public final /* synthetic */ String $cacheKey;
    public final /* synthetic */ String $cacheLookupDedupeKey;
    public final /* synthetic */ G0U<HoL, Unit> $callback;
    public final /* synthetic */ boolean $diskCacheEnabled;
    public final /* synthetic */ G0U<List<F9A>, Unit> $extensionsCallback;
    public final /* synthetic */ AbstractC7712FBk $queryInfo;
    public final /* synthetic */ Long $refetchIfOlderThanSeconds;
    public final /* synthetic */ Executor $responseThreadExecutor;
    public final /* synthetic */ FBQ this$0;

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    @Override // X.G0U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(X.C7706FBe r13) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FBR.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/FBQ;Ljava/lang/String;Ljava/lang/String;LX/FBk;Ljava/lang/Long;LX/FBL;LX/G0U<-Ljava/util/List<LX/F9A;>;Lkotlin/Unit;>;LX/G0U<-LX/HoL;Lkotlin/Unit;>;Ljava/lang/String;Ljava/util/concurrent/Executor;ZLX/G0U<-LX/HoL;Lkotlin/Unit;>;)V */
    public FBR(FBQ fbq, AbstractC7712FBk abstractC7712FBk, FBL fbl, Long l, String str, String str2, String str3, Executor executor, G0U g0u, G0U g0u2, G0U g0u3, boolean z) {
        super(1);
        this.this$0 = fbq;
        this.$cacheLookupDedupeKey = str;
        this.$appId = str2;
        this.$queryInfo = abstractC7712FBk;
        this.$refetchIfOlderThanSeconds = l;
        this.$cache = fbl;
        this.$extensionsCallback = g0u;
        this.$callback = g0u2;
        this.$cacheKey = str3;
        this.$responseThreadExecutor = executor;
        this.$diskCacheEnabled = z;
        this.$backgroundRefetchCallback = g0u3;
    }
}
