package com.facebook.aura.main;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.main.DockContentFade", f = "HatchSidePanelDockState.kt", l = {115, 118}, m = "fadeThrough-D5KLDUw", v = 2)
/* loaded from: classes.dex */
public final class DockContentFade$fadeThrough$1 extends HzP {
    public float F$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DockContentFade this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DockContentFade$fadeThrough$1(DockContentFade dockContentFade, HtJ<? super DockContentFade$fadeThrough$1> htJ) {
        super(htJ);
        this.this$0 = dockContentFade;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m1333fadeThroughD5KLDUw(0.0f, this);
    }
}
