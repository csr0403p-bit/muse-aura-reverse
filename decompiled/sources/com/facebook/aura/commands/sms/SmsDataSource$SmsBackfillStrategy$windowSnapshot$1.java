package com.facebook.aura.commands.sms;

import X.HtJ;
import X.HzP;
import com.facebook.aura.commands.sms.SmsDataSource;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.commands.sms.SmsDataSource$SmsBackfillStrategy", f = "SmsDataSource.kt", l = {271}, m = "windowSnapshot", v = 2)
/* loaded from: classes3.dex */
public final class SmsDataSource$SmsBackfillStrategy$windowSnapshot$1 extends HzP {
    public long J$0;
    public long J$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SmsDataSource.SmsBackfillStrategy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmsDataSource$SmsBackfillStrategy$windowSnapshot$1(SmsDataSource.SmsBackfillStrategy smsBackfillStrategy, HtJ<? super SmsDataSource$SmsBackfillStrategy$windowSnapshot$1> htJ) {
        super(htJ);
        this.this$0 = smsBackfillStrategy;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.windowSnapshot(0L, 0L, this);
    }
}
