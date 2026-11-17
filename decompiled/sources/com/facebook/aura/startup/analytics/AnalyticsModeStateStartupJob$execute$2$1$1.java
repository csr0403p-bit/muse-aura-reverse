package com.facebook.aura.startup.analytics;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.analytics.impl.MetaAnalyticsSessionManager;
import com.facebook.aura.confidentialvm.session.ConfidentialSessionGate;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.startup.analytics.AnalyticsModeStateStartupJob$execute$2$1$1", f = "AnalyticsModeStateStartupJob.kt", l = {58}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AnalyticsModeStateStartupJob$execute$2$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsModeStateStartupJob$execute$2$1$1(AbstractC3358CGz abstractC3358CGz, HtJ<? super AnalyticsModeStateStartupJob$execute$2$1$1> htJ) {
        super(2, htJ);
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AnalyticsModeStateStartupJob$execute$2$1$1(this.$userSession, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C20Q<Boolean> c20q = ConfidentialSessionGate.Companion.getInstance(this.$userSession).isConfidentialVmFlow;
            C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.startup.analytics.AnalyticsModeStateStartupJob$execute$2$1$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    MetaAnalyticsSessionManager.instance.notifyClientModeStateChanged();
                    return Unit.INSTANCE;
                }

                public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                    MetaAnalyticsSessionManager.instance.notifyClientModeStateChanged();
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c20q.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new AnalyticsModeStateStartupJob$execute$2$1$1(this.$userSession, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
