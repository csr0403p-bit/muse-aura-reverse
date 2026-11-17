package com.facebook.aura.network.transport.tigon;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C4884DBm;
import com.facebook.tigon.TigonRequestToken;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class TigonHatchHttpClient$openResponseStream$2$closeStream$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AtomicBoolean $cancelRequested;
    public final /* synthetic */ AtomicReference<TigonRequestToken> $requestToken;
    public final /* synthetic */ C4884DBm $responseBody;
    public final /* synthetic */ TigonHatchHttpClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TigonHatchHttpClient$openResponseStream$2$closeStream$1(C4884DBm c4884DBm, TigonHatchHttpClient tigonHatchHttpClient, AtomicBoolean atomicBoolean, AtomicReference<TigonRequestToken> atomicReference) {
        super(0);
        this.$responseBody = c4884DBm;
        this.this$0 = tigonHatchHttpClient;
        this.$cancelRequested = atomicBoolean;
        this.$requestToken = atomicReference;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        TigonHatchHttpClient.openResponseStream$lambda$0$cancelRequest(this.$cancelRequested, this.$requestToken);
        this.$responseBody.A01();
        try {
            this.$responseBody.close();
        } catch (Throwable th) {
            C3cG.A0s(th);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
