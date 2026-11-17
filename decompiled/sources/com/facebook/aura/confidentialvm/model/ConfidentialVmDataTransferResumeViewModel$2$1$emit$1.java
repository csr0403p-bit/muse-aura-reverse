package com.facebook.aura.confidentialvm.model;

import X.HtJ;
import X.HzP;
import com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferResumeViewModel;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferResumeViewModel$2$1", f = "ConfidentialVmDataTransferResumeViewModel.kt", l = {LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE}, m = "emit", v = 2)
/* loaded from: classes2.dex */
public final class ConfidentialVmDataTransferResumeViewModel$2$1$emit$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ConfidentialVmDataTransferResumeViewModel.AnonymousClass2.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConfidentialVmDataTransferResumeViewModel$2$1$emit$1(ConfidentialVmDataTransferResumeViewModel.AnonymousClass2.AnonymousClass1<? super T> anonymousClass1, HtJ<? super ConfidentialVmDataTransferResumeViewModel$2$1$emit$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((List<String>) null, (HtJ<? super Unit>) this);
    }
}
