package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchMessageShareImageRenderer$deriveFromCard$2$bitmap$1", f = "HatchMessageShareImageRenderer.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchMessageShareImageRenderer$deriveFromCard$2$bitmap$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Bitmap>, Object> {
    public final /* synthetic */ Bitmap $card;
    public final /* synthetic */ G0U<Bitmap, Bitmap> $transform;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageShareImageRenderer$deriveFromCard$2$bitmap$1(G0U<? super Bitmap, Bitmap> g0u, Bitmap bitmap, HtJ<? super HatchMessageShareImageRenderer$deriveFromCard$2$bitmap$1> htJ) {
        super(2, htJ);
        this.$transform = g0u;
        this.$card = bitmap;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchMessageShareImageRenderer$deriveFromCard$2$bitmap$1(this.$transform, this.$card, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return this.$transform.invoke(this.$card);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Bitmap> htJ) {
        return ((HatchMessageShareImageRenderer$deriveFromCard$2$bitmap$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
