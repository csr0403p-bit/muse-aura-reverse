package com.facebook.aura.settings;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.settings.AgentResetLogging", f = "AgentResetLogging.kt", l = {33, R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight}, m = "logRequest-0E7RQCE", v = 2)
/* loaded from: classes3.dex */
public final class AgentResetLogging$logRequest$1 extends HzP {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AgentResetLogging this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentResetLogging$logRequest$1(AgentResetLogging agentResetLogging, HtJ<? super AgentResetLogging$logRequest$1> htJ) {
        super(htJ);
        this.this$0 = agentResetLogging;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m1895logRequest0E7RQCE(null, null, this));
    }
}
