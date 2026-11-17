package com.facebook.rp.platform.metaai.rsys;

import X.AbstractC07127nr;
import X.AbstractC7608F5v;
import X.AnonymousClass001;
import X.C10543Hqv;
import X.C27k;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession$endAfterMicAccessLoss$1", f = "MetaAiRsysSdkRealTimeSession.kt", l = {1220}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class MetaAiRsysSdkRealTimeSession$endAfterMicAccessLoss$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public int I$0;
    public int I$1;
    public int I$2;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ MetaAiRsysSdkRealTimeSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaAiRsysSdkRealTimeSession$endAfterMicAccessLoss$1(MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession, HtJ<? super MetaAiRsysSdkRealTimeSession$endAfterMicAccessLoss$1> htJ) {
        super(2, htJ);
        this.this$0 = metaAiRsysSdkRealTimeSession;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new MetaAiRsysSdkRealTimeSession$endAfterMicAccessLoss$1(this.this$0, htJ);
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new MetaAiRsysSdkRealTimeSession$endAfterMicAccessLoss$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Exception] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003d -> B:14:0x0043). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession;
        C10543Hqv c10543HqvA10;
        Object obj2 = EnumC10460Hji.A02;
        int i3 = this.label;
        try {
        } catch (Exception e) {
            c10543HqvA10.element = e;
            if (!MetaAiRsysSdkRealTimeSession.A0B(metaAiRsysSdkRealTimeSession)) {
                i++;
                if (i >= i2) {
                    if (c10543HqvA10.element != 0) {
                        AbstractC7608F5v.A1L("Ordered mic-access termination failed; forcing call end");
                    }
                    try {
                        this.this$0.A0C.A02(1, "no_mic_access");
                    } catch (Exception unused) {
                        AbstractC7608F5v.A1L("Forced mic-access call end failed");
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i3 != 0) {
            if (i3 != 1) {
                throw AnonymousClass001.A0n();
            }
            i = this.I$1;
            i2 = this.I$0;
            metaAiRsysSdkRealTimeSession = (MetaAiRsysSdkRealTimeSession) this.L$1;
            c10543HqvA10 = (C10543Hqv) this.L$0;
            Hwg.A00(obj);
            obj2 = Unit.INSTANCE;
            return obj2;
        }
        c10543HqvA10 = C3cG.A10(obj);
        metaAiRsysSdkRealTimeSession = this.this$0;
        i = 0;
        i2 = 2;
        C27k c27kA04 = MetaAiRsysSdkRealTimeSession.A04(metaAiRsysSdkRealTimeSession, "no_mic_access", 1, false);
        this.L$0 = c10543HqvA10;
        this.L$1 = metaAiRsysSdkRealTimeSession;
        this.L$2 = null;
        this.I$0 = i2;
        this.I$1 = i;
        this.I$2 = i;
        this.label = 1;
        if (C3cG.A0W(c27kA04, this) == obj2) {
            return obj2;
        }
        obj2 = Unit.INSTANCE;
        return obj2;
    }
}
