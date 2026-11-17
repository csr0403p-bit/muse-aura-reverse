package com.facebook.rp.platform.metaai.rsys;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C8j3;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession$startOptInTermination$1$2", f = "MetaAiRsysSdkRealTimeSession.kt", l = {1030}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class MetaAiRsysSdkRealTimeSession$startOptInTermination$1$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ int $endCallReason;
    public final /* synthetic */ boolean $playEndEarcon;
    public final /* synthetic */ String $reason;
    public int label;
    public final /* synthetic */ MetaAiRsysSdkRealTimeSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lcom/facebook/rp/platform/metaai/rsys/MetaAiRsysSdkRealTimeSession;Ljava/lang/String;ZILX/HtJ<-Lcom/facebook/rp/platform/metaai/rsys/MetaAiRsysSdkRealTimeSession$startOptInTermination$1$2;>;)V */
    public MetaAiRsysSdkRealTimeSession$startOptInTermination$1$2(MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession, String str, HtJ htJ, int i, boolean z) {
        super(2, htJ);
        this.this$0 = metaAiRsysSdkRealTimeSession;
        this.$reason = str;
        this.$playEndEarcon = z;
        this.$endCallReason = i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new MetaAiRsysSdkRealTimeSession$startOptInTermination$1$2(this.this$0, this.$reason, htJ, this.$endCallReason, this.$playEndEarcon);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession = this.this$0;
            String str = this.$reason;
            boolean z = this.$playEndEarcon;
            int i2 = this.$endCallReason;
            this.label = 1;
            if (MetaAiRsysSdkRealTimeSession.A02(metaAiRsysSdkRealTimeSession, str, this, i2, z) == enumC10460Hji) {
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
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((MetaAiRsysSdkRealTimeSession$startOptInTermination$1$2) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
