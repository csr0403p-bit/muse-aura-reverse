package com.facebook.aura.confidentialvm;

import X.HtJ;
import X.HzP;
import com.facebook.aura.confidentialvm.HatchVmAccessController;
import com.facebook.aura.gateway.HatchCvmReplacement;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.confidentialvm.HatchVmAccessController$4$4", f = "HatchVmAccessController.kt", l = {224}, m = "emit", v = 2)
/* loaded from: classes2.dex */
public final class HatchVmAccessController$4$4$emit$1 extends HzP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchVmAccessController.AnonymousClass4.C00784<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchVmAccessController$4$4$emit$1(HatchVmAccessController.AnonymousClass4.C00784<? super T> c00784, HtJ<? super HatchVmAccessController$4$4$emit$1> htJ) {
        super(htJ);
        this.this$0 = c00784;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((HatchCvmReplacement.Active) null, (HtJ<? super Unit>) this);
    }
}
