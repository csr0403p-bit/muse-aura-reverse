package com.facebook.aura.appupdate;

import X.HtJ;
import X.HzP;
import com.facebook.aura.appupdate.AuraPlayUpdateStatus;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.appupdate.AuraPlayUpdateStatus$Companion", f = "AuraPlayUpdateStatus.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop}, m = BrowserOperationCatalogKt.READ, v = 2)
/* loaded from: classes5.dex */
public final class AuraPlayUpdateStatus$Companion$read$1 extends HzP {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AuraPlayUpdateStatus.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraPlayUpdateStatus$Companion$read$1(AuraPlayUpdateStatus.Companion companion, HtJ<? super AuraPlayUpdateStatus$Companion$read$1> htJ) {
        super(htJ);
        this.this$0 = companion;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.read(this);
    }
}
