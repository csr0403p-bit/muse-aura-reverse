package com.facebook.aura.network.acs;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.network.acs.HatchAnonCredProvider", f = "HatchAnonCredProvider.kt", l = {HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX}, m = "fetchAndRedeem-gIAlu-s", v = 2)
/* loaded from: classes4.dex */
public final class HatchAnonCredProvider$fetchAndRedeem$1 extends HzP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchAnonCredProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAnonCredProvider$fetchAndRedeem$1(HatchAnonCredProvider hatchAnonCredProvider, HtJ<? super HatchAnonCredProvider$fetchAndRedeem$1> htJ) {
        super(htJ);
        this.this$0 = hatchAnonCredProvider;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m1584fetchAndRedeemgIAlus(null, this));
    }
}
