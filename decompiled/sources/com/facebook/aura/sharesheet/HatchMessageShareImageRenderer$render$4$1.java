package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7384Etj;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchMessageShareImageRenderer$render$4$1", f = "HatchMessageShareImageRenderer.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchMessageShareImageRenderer$render$4$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
    public final /* synthetic */ Context $applicationContext;
    public final /* synthetic */ Bitmap $bitmap;
    public final /* synthetic */ String $cacheKey;
    public final /* synthetic */ HatchMessageShareImageRenderer $this_run;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageShareImageRenderer$render$4$1(HatchMessageShareImageRenderer hatchMessageShareImageRenderer, Context context, String str, Bitmap bitmap, HtJ<? super HatchMessageShareImageRenderer$render$4$1> htJ) {
        super(2, htJ);
        this.$this_run = hatchMessageShareImageRenderer;
        this.$applicationContext = context;
        this.$cacheKey = str;
        this.$bitmap = bitmap;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchMessageShareImageRenderer$render$4$1(this.$this_run, this.$applicationContext, this.$cacheKey, this.$bitmap, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        HatchMessageShareImageRenderer hatchMessageShareImageRenderer = this.$this_run;
        Context context = this.$applicationContext;
        C7384Etj.A0X(context);
        return hatchMessageShareImageRenderer.storePng(context, this.$cacheKey, this.$bitmap);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
        return ((HatchMessageShareImageRenderer$render$4$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
