package com.facebook.aura.watchhandoff;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.auth.AuraSessionManager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.watchhandoff.WatchHandoffRenewal$answerAfterRenewal$renewal$1", f = "WatchHandoffRenewal.kt", l = {29}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class WatchHandoffRenewal$answerAfterRenewal$renewal$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super AuraSessionManager.AbraTokenRefreshResult>, Object> {
    public final /* synthetic */ String $rejectedToken;
    public int label;
    public final /* synthetic */ WatchHandoffRenewal this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchHandoffRenewal$answerAfterRenewal$renewal$1(WatchHandoffRenewal watchHandoffRenewal, String str, HtJ<? super WatchHandoffRenewal$answerAfterRenewal$renewal$1> htJ) {
        super(2, htJ);
        this.this$0 = watchHandoffRenewal;
        this.$rejectedToken = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new WatchHandoffRenewal$answerAfterRenewal$renewal$1(this.this$0, this.$rejectedToken, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AuraSessionManager auraSessionManager = AuraSessionManager.INSTANCE;
            AbstractC3358CGz abstractC3358CGz = this.this$0.session;
            String str = this.$rejectedToken;
            this.label = 1;
            obj = auraSessionManager.refreshAbraToken(abstractC3358CGz, str, this);
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
        return ((WatchHandoffRenewal$answerAfterRenewal$renewal$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
