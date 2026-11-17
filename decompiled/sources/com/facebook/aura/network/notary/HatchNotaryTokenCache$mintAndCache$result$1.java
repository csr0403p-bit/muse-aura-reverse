package com.facebook.aura.network.notary;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C10571Hud;
import X.C3cG;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.network.notary.HatchNotaryTokenCache$mintAndCache$result$1", f = "HatchNotaryTokenCache.kt", l = {102}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchNotaryTokenCache$mintAndCache$result$1 extends AbstractC07127nr implements G0U<HtJ<? super HsJ<? extends MintedNotaryTokens>>, Object> {
    public final /* synthetic */ CacheKey $key;
    public final /* synthetic */ G0V<String, HtJ<? super HsJ<MintedNotaryTokens>>, Object> $mint;
    public final /* synthetic */ long $mintGeneration;
    public int label;
    public final /* synthetic */ HatchNotaryTokenCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchNotaryTokenCache$mintAndCache$result$1(G0V<? super String, ? super HtJ<? super HsJ<MintedNotaryTokens>>, ? extends Object> g0v, CacheKey cacheKey, HatchNotaryTokenCache hatchNotaryTokenCache, long j, HtJ<? super HatchNotaryTokenCache$mintAndCache$result$1> htJ) {
        super(1, htJ);
        this.$mint = g0v;
        this.$key = cacheKey;
        this.this$0 = hatchNotaryTokenCache;
        this.$mintGeneration = j;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HatchNotaryTokenCache$mintAndCache$result$1(this.$mint, this.$key, this.this$0, this.$mintGeneration, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            G0V<String, HtJ<? super HsJ<MintedNotaryTokens>>, Object> g0v = this.$mint;
            String str = this.$key.vmId;
            this.label = 1;
            obj = g0v.invoke(str, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        Object objA0s = ((HsJ) obj).value;
        HatchNotaryTokenCache hatchNotaryTokenCache = this.this$0;
        long j = this.$mintGeneration;
        CacheKey cacheKey = this.$key;
        if (!(objA0s instanceof C10571Hud)) {
            try {
                objA0s = (MintedNotaryTokens) objA0s;
                synchronized (hatchNotaryTokenCache.cacheLock) {
                    if (hatchNotaryTokenCache.generation != j) {
                        throw HatchNotaryTokenCacheKt.notaryException(FGI.A0M("User changed while minting ", cacheKey.mintEndpoint), HatchNotaryTokenCacheKt.STALE_USER);
                    }
                    hatchNotaryTokenCache.cache.put(cacheKey, objA0s);
                }
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
        }
        return C3cG.A0t(objA0s);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(HtJ<? super HsJ<MintedNotaryTokens>> htJ) {
        return ((HatchNotaryTokenCache$mintAndCache$result$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Object invoke(HtJ<? super HsJ<? extends MintedNotaryTokens>> htJ) {
        return invoke2((HtJ<? super HsJ<MintedNotaryTokens>>) htJ);
    }
}
