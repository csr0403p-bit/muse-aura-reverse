package com.facebook.aura.partners.accountlinking.nativeauthlogging;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger", f = "MAHatchNativeAuthAppStartLogger.kt", l = {180, 375}, m = "logAppStartData$fbandroid_express_aura_java_com_facebook_aura_partners_accountlinking_nativeauthlogging_nativeauthlogging", v = 2)
/* loaded from: classes5.dex */
public final class MAHatchNativeAuthAppStartLogger$logAppStartData$1 extends HzP {
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MAHatchNativeAuthAppStartLogger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAHatchNativeAuthAppStartLogger$logAppStartData$1(MAHatchNativeAuthAppStartLogger mAHatchNativeAuthAppStartLogger, HtJ<? super MAHatchNativeAuthAppStartLogger$logAppStartData$1> htJ) {
        super(htJ);
        this.this$0 = mAHatchNativeAuthAppStartLogger;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.logAppStartData$fbandroid_express_aura_java_com_facebook_aura_partners_accountlinking_nativeauthlogging_nativeauthlogging(null, this);
    }
}
