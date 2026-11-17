package com.facebook.aura.network.fresco;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7Bq;
import X.EUm;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.network.fresco.AuraImageNetworkFetcher;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.network.fresco.AuraImageNetworkFetcher$scheduleRetry$job$1", f = "AuraImageNetworkFetcher.kt", l = {600}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class AuraImageNetworkFetcher$scheduleRetry$job$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ int $attempt;
    public final /* synthetic */ EUm $callback;
    public final /* synthetic */ long $delayMs;
    public final /* synthetic */ AuraImageNetworkFetcher.ImageNetworkFetchState $fetchState;
    public int label;
    public final /* synthetic */ AuraImageNetworkFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraImageNetworkFetcher$scheduleRetry$job$1(long j, AuraImageNetworkFetcher auraImageNetworkFetcher, AuraImageNetworkFetcher.ImageNetworkFetchState imageNetworkFetchState, EUm eUm, int i, HtJ<? super AuraImageNetworkFetcher$scheduleRetry$job$1> htJ) {
        super(2, htJ);
        this.$delayMs = j;
        this.this$0 = auraImageNetworkFetcher;
        this.$fetchState = imageNetworkFetchState;
        this.$callback = eUm;
        this.$attempt = i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraImageNetworkFetcher$scheduleRetry$job$1(this.$delayMs, this.this$0, this.$fetchState, this.$callback, this.$attempt, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            long j = this.$delayMs;
            this.label = 1;
            if (C7Bq.A01(j, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        this.this$0.fetchOnce(this.$fetchState, this.$callback, this.$attempt);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AuraImageNetworkFetcher$scheduleRetry$job$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
