package com.facebook.aura.nodes;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient$pinReminderDispatcher$1", f = "HatchNodeClient.kt", l = {223}, m = "reply", v = 2)
/* loaded from: classes3.dex */
public final class HatchNodeClient$pinReminderDispatcher$1$reply$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchNodeClient$pinReminderDispatcher$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNodeClient$pinReminderDispatcher$1$reply$1(HatchNodeClient$pinReminderDispatcher$1 hatchNodeClient$pinReminderDispatcher$1, HtJ<? super HatchNodeClient$pinReminderDispatcher$1$reply$1> htJ) {
        super(htJ);
        this.this$0 = hatchNodeClient$pinReminderDispatcher$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.reply(null, false, null, null, null, this);
    }
}
