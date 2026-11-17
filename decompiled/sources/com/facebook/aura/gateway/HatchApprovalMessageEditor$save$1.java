package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchApprovalMessageEditor", f = "HatchApprovalMessageEditor.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft}, m = "save-bMdYcbs", v = 2)
/* loaded from: classes2.dex */
public final class HatchApprovalMessageEditor$save$1 extends HzP {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchApprovalMessageEditor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchApprovalMessageEditor$save$1(HatchApprovalMessageEditor hatchApprovalMessageEditor, HtJ<? super HatchApprovalMessageEditor$save$1> htJ) {
        super(htJ);
        this.this$0 = hatchApprovalMessageEditor;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m954savebMdYcbs(null, null, null, null, 0L, null, this));
    }
}
