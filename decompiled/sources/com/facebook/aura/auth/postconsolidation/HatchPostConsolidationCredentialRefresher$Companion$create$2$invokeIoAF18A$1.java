package com.facebook.aura.auth.postconsolidation;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.auth.postconsolidation.HatchPostConsolidationCredentialRefresher$Companion$create$2", f = "HatchPostConsolidationCredentialRefresher.kt", l = {188}, m = "invoke-IoAF18A", v = 2)
/* renamed from: com.facebook.aura.auth.postconsolidation.HatchPostConsolidationCredentialRefresher$Companion$create$2$invoke-IoAF18A$1, reason: invalid class name */
/* loaded from: classes5.dex */
public final class HatchPostConsolidationCredentialRefresher$Companion$create$2$invokeIoAF18A$1 extends HzP {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchPostConsolidationCredentialRefresher$Companion$create$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPostConsolidationCredentialRefresher$Companion$create$2$invokeIoAF18A$1(HatchPostConsolidationCredentialRefresher$Companion$create$2 hatchPostConsolidationCredentialRefresher$Companion$create$2, HtJ<? super HatchPostConsolidationCredentialRefresher$Companion$create$2$invokeIoAF18A$1> htJ) {
        super(htJ);
        this.this$0 = hatchPostConsolidationCredentialRefresher$Companion$create$2;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(this);
    }
}
