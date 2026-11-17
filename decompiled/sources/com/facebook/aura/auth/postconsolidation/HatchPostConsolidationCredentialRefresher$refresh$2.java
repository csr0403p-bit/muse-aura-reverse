package com.facebook.aura.auth.postconsolidation;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7BY;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.auth.postconsolidation.HatchPostConsolidationCredentialRefresher$refresh$2", f = "HatchPostConsolidationCredentialRefresher.kt", l = {84, 109}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class HatchPostConsolidationCredentialRefresher$refresh$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super PostConsolidationCredentialRefreshResult>, Object> {
    public final /* synthetic */ PostConsolidationSessionCapture $captured;
    public final /* synthetic */ PostConsolidationSurvivorFrlCredential $survivor;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ HatchPostConsolidationCredentialRefresher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPostConsolidationCredentialRefresher$refresh$2(HatchPostConsolidationCredentialRefresher hatchPostConsolidationCredentialRefresher, PostConsolidationSessionCapture postConsolidationSessionCapture, PostConsolidationSurvivorFrlCredential postConsolidationSurvivorFrlCredential, HtJ<? super HatchPostConsolidationCredentialRefresher$refresh$2> htJ) {
        super(2, htJ);
        this.this$0 = hatchPostConsolidationCredentialRefresher;
        this.$captured = postConsolidationSessionCapture;
        this.$survivor = postConsolidationSurvivorFrlCredential;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchPostConsolidationCredentialRefresher$refresh$2(this.this$0, this.$captured, this.$survivor, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws Throwable {
        HatchPostConsolidationCredentialRefresher hatchPostConsolidationCredentialRefresher;
        PostConsolidationCredentialRefreshResult postConsolidationCredentialRefreshResult;
        ?? r4;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                G0U<HtJ<? super HsJ<String>>, Object> g0u = this.this$0.getTempToken;
                this.label = 1;
                obj = g0u.invoke(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    r4 = this.L$2;
                    try {
                        Hwg.A00(obj);
                        r4 = r4;
                        postConsolidationCredentialRefreshResult = (PostConsolidationCredentialRefreshResult) obj;
                        this.this$0.invalidateTempToken.invoke(r4);
                        hatchPostConsolidationCredentialRefresher = this.this$0;
                        HatchPostConsolidationCredentialRefresher.access$report(hatchPostConsolidationCredentialRefresher, postConsolidationCredentialRefreshResult);
                        return postConsolidationCredentialRefreshResult;
                    } catch (Throwable th) {
                        th = th;
                        this.this$0.invalidateTempToken.invoke(r4);
                        throw th;
                    }
                }
                Hwg.A00(obj);
            }
            Object obj2 = ((HsJ) obj).value;
            Throwable thA00 = HsJ.A00(obj2);
            if (thA00 instanceof CancellationException) {
                throw thA00;
            }
            hatchPostConsolidationCredentialRefresher = this.this$0;
            if (thA00 == null) {
                r4 = (String) obj2;
                boolean zA0j = C7BY.A0j(r4);
                HatchPostConsolidationCredentialRefresher hatchPostConsolidationCredentialRefresher2 = this.this$0;
                if (!zA0j) {
                    try {
                        PostConsolidationSessionCapture postConsolidationSessionCapture = this.$captured;
                        PostConsolidationSurvivorFrlCredential postConsolidationSurvivorFrlCredential = this.$survivor;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = r4;
                        this.label = 2;
                        obj = hatchPostConsolidationCredentialRefresher2.exchangeAndCommit(postConsolidationSessionCapture, postConsolidationSurvivorFrlCredential, r4, this);
                        r4 = r4;
                        if (obj == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                        postConsolidationCredentialRefreshResult = (PostConsolidationCredentialRefreshResult) obj;
                        this.this$0.invalidateTempToken.invoke(r4);
                        hatchPostConsolidationCredentialRefresher = this.this$0;
                        HatchPostConsolidationCredentialRefresher.access$report(hatchPostConsolidationCredentialRefresher, postConsolidationCredentialRefreshResult);
                        return postConsolidationCredentialRefreshResult;
                    } catch (Throwable th2) {
                        th = th2;
                        this.this$0.invalidateTempToken.invoke(r4);
                        throw th;
                    }
                }
                hatchPostConsolidationCredentialRefresher2.invalidateTempToken.invoke(r4);
                hatchPostConsolidationCredentialRefresher = this.this$0;
            }
            postConsolidationCredentialRefreshResult = PostConsolidationCredentialRefreshResult.TEMP_TOKEN_UNAVAILABLE;
            HatchPostConsolidationCredentialRefresher.access$report(hatchPostConsolidationCredentialRefresher, postConsolidationCredentialRefreshResult);
            return postConsolidationCredentialRefreshResult;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            HatchPostConsolidationCredentialRefresher hatchPostConsolidationCredentialRefresher3 = this.this$0;
            PostConsolidationCredentialRefreshResult postConsolidationCredentialRefreshResult2 = PostConsolidationCredentialRefreshResult.TEMP_TOKEN_UNAVAILABLE;
            HatchPostConsolidationCredentialRefresher.access$report(hatchPostConsolidationCredentialRefresher3, postConsolidationCredentialRefreshResult2);
            return postConsolidationCredentialRefreshResult2;
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super PostConsolidationCredentialRefreshResult> htJ) {
        return ((HatchPostConsolidationCredentialRefresher$refresh$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
