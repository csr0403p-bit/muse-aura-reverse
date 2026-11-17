package com.facebook.aura.network.http;

import X.EnumC10460Hji;
import X.HsJ;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.network.http.HatchHttpApi", f = "HatchHttpApi.kt", l = {1351, 1365}, m = "executeBodylessJarvisRequestWith-p3iPjrY", v = 2)
/* loaded from: classes3.dex */
public final class HatchHttpApi$executeBodylessJarvisRequestWith$1<Res> extends HzP {
    public Object L$0;
    public Object L$1;
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
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchHttpApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchHttpApi$executeBodylessJarvisRequestWith$1(HatchHttpApi hatchHttpApi, HtJ<? super HatchHttpApi$executeBodylessJarvisRequestWith$1> htJ) {
        super(htJ);
        this.this$0 = hatchHttpApi;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM1595executeBodylessJarvisRequestWithp3iPjrY = this.this$0.m1595executeBodylessJarvisRequestWithp3iPjrY(null, false, null, null, null, null, null, null, null, false, null, false, null, false, this);
        return objM1595executeBodylessJarvisRequestWithp3iPjrY != EnumC10460Hji.A02 ? new HsJ(objM1595executeBodylessJarvisRequestWithp3iPjrY) : objM1595executeBodylessJarvisRequestWithp3iPjrY;
    }
}
