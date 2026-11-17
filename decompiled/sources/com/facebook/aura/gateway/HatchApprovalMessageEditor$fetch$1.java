package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchApprovalMessageEditor", f = "HatchApprovalMessageEditor.kt", l = {19}, m = "fetch-gIAlu-s", v = 2)
/* loaded from: classes2.dex */
public final class HatchApprovalMessageEditor$fetch$1 extends HzP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchApprovalMessageEditor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchApprovalMessageEditor$fetch$1(HatchApprovalMessageEditor hatchApprovalMessageEditor, HtJ<? super HatchApprovalMessageEditor$fetch$1> htJ) {
        super(htJ);
        this.this$0 = hatchApprovalMessageEditor;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m953fetchgIAlus(null, this));
    }
}
