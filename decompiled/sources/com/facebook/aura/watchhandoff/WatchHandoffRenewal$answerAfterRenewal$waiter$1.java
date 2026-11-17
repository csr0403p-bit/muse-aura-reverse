package com.facebook.aura.watchhandoff;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C27k;
import X.C3UX;
import X.C3cG;
import X.CSE;
import X.EnumC10460Hji;
import X.G0V;
import X.GAX;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.watchlink.WatchLinkResponse;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.watchhandoff.WatchHandoffRenewal$answerAfterRenewal$waiter$1", f = "WatchHandoffRenewal.kt", l = {32}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class WatchHandoffRenewal$answerAfterRenewal$waiter$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Function0<WatchLinkResponse> $answer;
    public final /* synthetic */ C27k<AuraSessionManager.AbraTokenRefreshResult> $renewal;
    public final /* synthetic */ CSE<WatchLinkResponse> $response;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.watchhandoff.WatchHandoffRenewal$answerAfterRenewal$waiter$1$1", f = "WatchHandoffRenewal.kt", l = {32}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.watchhandoff.WatchHandoffRenewal$answerAfterRenewal$waiter$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super AuraSessionManager.AbraTokenRefreshResult>, Object> {
        public final /* synthetic */ C27k<AuraSessionManager.AbraTokenRefreshResult> $renewal;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(C27k<? extends AuraSessionManager.AbraTokenRefreshResult> c27k, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$renewal = c27k;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$renewal, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C27k<AuraSessionManager.AbraTokenRefreshResult> c27k = this.$renewal;
                this.label = 1;
                obj = C3cG.A0W(c27k, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super AuraSessionManager.AbraTokenRefreshResult> htJ) {
            return new AnonymousClass1(this.$renewal, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WatchHandoffRenewal$answerAfterRenewal$waiter$1(CSE<WatchLinkResponse> cse, Function0<WatchLinkResponse> function0, C27k<? extends AuraSessionManager.AbraTokenRefreshResult> c27k, HtJ<? super WatchHandoffRenewal$answerAfterRenewal$waiter$1> htJ) {
        super(2, htJ);
        this.$response = cse;
        this.$answer = function0;
        this.$renewal = c27k;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new WatchHandoffRenewal$answerAfterRenewal$waiter$1(this.$response, this.$answer, this.$renewal, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$renewal, null);
                this.label = 1;
                if (GAX.A01(this, anonymousClass1, 8000L) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            this.$response.A02(this.$answer.invoke());
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            this.$response.A01(e2);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((WatchHandoffRenewal$answerAfterRenewal$waiter$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
