package com.facebook.aura.toast;

import X.HtJ;
import X.HzP;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.toast.HatchToastHostKt$HatchToastHostOverlay$host$1$1", f = "HatchToastHost.kt", l = {149, SelfieSnapshotKt.SELFIE_JPEG_QUALITY}, m = "show", v = 2)
/* loaded from: classes.dex */
public final class HatchToastHostKt$HatchToastHostOverlay$host$1$1$show$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchToastHostKt$HatchToastHostOverlay$host$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchToastHostKt$HatchToastHostOverlay$host$1$1$show$1(HatchToastHostKt$HatchToastHostOverlay$host$1$1 hatchToastHostKt$HatchToastHostOverlay$host$1$1, HtJ<? super HatchToastHostKt$HatchToastHostOverlay$host$1$1$show$1> htJ) {
        super(htJ);
        this.this$0 = hatchToastHostKt$HatchToastHostOverlay$host$1$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.show(null, this);
    }
}
