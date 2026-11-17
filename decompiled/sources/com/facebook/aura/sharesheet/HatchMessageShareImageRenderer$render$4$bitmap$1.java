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
import com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchMessageShareImageRenderer$render$4$bitmap$1", f = "HatchMessageShareImageRenderer.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchMessageShareImageRenderer$render$4$bitmap$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Bitmap>, Object> {
    public final /* synthetic */ Context $applicationContext;
    public final /* synthetic */ HatchMessageShareImageColors $colors;
    public final /* synthetic */ AuraMarkdownDocument $document;
    public final /* synthetic */ Map<String, Bitmap> $loadedImages;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageShareImageRenderer$render$4$bitmap$1(Context context, AuraMarkdownDocument auraMarkdownDocument, Map<String, Bitmap> map, HatchMessageShareImageColors hatchMessageShareImageColors, HtJ<? super HatchMessageShareImageRenderer$render$4$bitmap$1> htJ) {
        super(2, htJ);
        this.$applicationContext = context;
        this.$document = auraMarkdownDocument;
        this.$loadedImages = map;
        this.$colors = hatchMessageShareImageColors;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchMessageShareImageRenderer$render$4$bitmap$1(this.$applicationContext, this.$document, this.$loadedImages, this.$colors, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        int i = HatchMessageShareDocumentRenderer.$stable;
        Context context = this.$applicationContext;
        C7384Etj.A0X(context);
        return new HatchMessageShareDocumentRenderer(context, this.$document, this.$loadedImages, this.$colors).render();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Bitmap> htJ) {
        return ((HatchMessageShareImageRenderer$render$4$bitmap$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
