package com.facebook.aura.network.http;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import com.facebook.aura.components.reactions.AuraCelebrationBlastKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.network.http.HatchHttpApi", f = "HatchHttpApi.kt", l = {AuraCelebrationBlastKt.CELEBRATION_TOTAL_MS, 1245}, m = "executeJarvisRequestWith-Fof5HsY", v = 2)
/* loaded from: classes3.dex */
public final class HatchHttpApi$executeJarvisRequestWith$1<Req, Res> extends HzP {
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
    public boolean Z$0;
    public boolean Z$1;
    public boolean Z$2;
    public boolean Z$3;
    public boolean Z$4;
    public boolean Z$5;
    public boolean Z$6;
    public boolean Z$7;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchHttpApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchHttpApi$executeJarvisRequestWith$1(HatchHttpApi hatchHttpApi, HtJ<? super HatchHttpApi$executeJarvisRequestWith$1> htJ) {
        super(htJ);
        this.this$0 = hatchHttpApi;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m1599executeJarvisRequestWithFof5HsY(null, null, false, null, null, null, null, null, null, null, null, false, false, null, null, false, false, false, false, null, false, this));
    }
}
