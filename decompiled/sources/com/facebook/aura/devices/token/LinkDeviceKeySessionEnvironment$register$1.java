package com.facebook.aura.devices.token;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceKeySessionEnvironment", f = "LinkDeviceKeyOwnerSession.kt", l = {168}, m = "register-0E7RQCE", v = 2)
/* loaded from: classes4.dex */
public final class LinkDeviceKeySessionEnvironment$register$1 extends HzP {
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public int I$4;
    public int I$5;
    public int I$6;
    public Object L$0;
    public Object L$1;
    public Object L$10;
    public Object L$11;
    public Object L$12;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LinkDeviceKeySessionEnvironment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkDeviceKeySessionEnvironment$register$1(LinkDeviceKeySessionEnvironment linkDeviceKeySessionEnvironment, HtJ<? super LinkDeviceKeySessionEnvironment$register$1> htJ) {
        super(htJ);
        this.this$0 = linkDeviceKeySessionEnvironment;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.mo731register0E7RQCE(null, null, this));
    }
}
