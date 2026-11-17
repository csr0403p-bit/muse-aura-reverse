package com.facebook.aura.navigation;

import X.HtJ;
import X.HzP;
import com.facebook.aura.navigation.SidePanelOpenGestureKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.navigation.SidePanelOpenGestureKt$hatchSidePanelOpenGesture$1", f = "SidePanelOpenGesture.kt", l = {83}, m = "invoke", v = 2)
/* loaded from: classes.dex */
public final class SidePanelOpenGestureKt$hatchSidePanelOpenGesture$1$invoke$1 extends HzP {
    public float F$0;
    public float F$1;
    public float F$2;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SidePanelOpenGestureKt.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SidePanelOpenGestureKt$hatchSidePanelOpenGesture$1$invoke$1(SidePanelOpenGestureKt.AnonymousClass1 anonymousClass1, HtJ<? super SidePanelOpenGestureKt$hatchSidePanelOpenGesture$1$invoke$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, this);
    }
}
