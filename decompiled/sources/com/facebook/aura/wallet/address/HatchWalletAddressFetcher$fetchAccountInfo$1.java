package com.facebook.aura.wallet.address;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.wallet.address.HatchWalletAddressFetcher", f = "HatchWalletAddressFetcher.kt", l = {24}, m = "fetchAccountInfo-IoAF18A", v = 2)
/* loaded from: classes4.dex */
public final class HatchWalletAddressFetcher$fetchAccountInfo$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchWalletAddressFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWalletAddressFetcher$fetchAccountInfo$1(HatchWalletAddressFetcher hatchWalletAddressFetcher, HtJ<? super HatchWalletAddressFetcher$fetchAccountInfo$1> htJ) {
        super(htJ);
        this.this$0 = hatchWalletAddressFetcher;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m3148fetchAccountInfoIoAF18A(this));
    }
}
