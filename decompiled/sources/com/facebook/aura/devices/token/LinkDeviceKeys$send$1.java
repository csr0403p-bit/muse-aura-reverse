package com.facebook.aura.devices.token;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceKeys", f = "LinkDeviceKeys.kt", l = {363}, m = "send-gIAlu-s", v = 2)
/* loaded from: classes4.dex */
public final class LinkDeviceKeys$send$1<T> extends HzP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LinkDeviceKeys this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkDeviceKeys$send$1(LinkDeviceKeys linkDeviceKeys, HtJ<? super LinkDeviceKeys$send$1> htJ) {
        super(htJ);
        this.this$0 = linkDeviceKeys;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m734sendgIAlus(null, this));
    }
}
