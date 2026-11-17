package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C8eM;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.view.HtmlPreviewRenderer$render$result$1", f = "HtmlPreviewRenderer.kt", l = {277, 68}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HtmlPreviewRenderer$render$result$1 extends AbstractC07127nr implements G0U<HtJ<? super Bitmap>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $relativePath;
    public final /* synthetic */ HtmlPreviewRenderState $state;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlPreviewRenderer$render$result$1(HtmlPreviewRenderState htmlPreviewRenderState, String str, Context context, AbstractC3358CGz abstractC3358CGz, HtJ<? super HtmlPreviewRenderer$render$result$1> htJ) {
        super(1, htJ);
        this.$state = htmlPreviewRenderState;
        this.$relativePath = str;
        this.$context = context;
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HtmlPreviewRenderer$render$result$1(this.$state, this.$relativePath, this.$context, this.$userSession, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        C8eM c8eM;
        Context context;
        String str;
        AbstractC3358CGz abstractC3358CGz;
        HtmlPreviewRenderState htmlPreviewRenderState;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                bitmap = this.$state.bitmapCache.get(this.$relativePath);
                if (bitmap == null) {
                    c8eM = HtmlPreviewRenderer.renderSemaphore;
                    context = this.$context;
                    str = this.$relativePath;
                    abstractC3358CGz = this.$userSession;
                    htmlPreviewRenderState = this.$state;
                    this.L$0 = c8eM;
                    this.L$1 = context;
                    this.L$2 = str;
                    this.L$3 = abstractC3358CGz;
                    this.L$4 = htmlPreviewRenderState;
                    this.label = 1;
                    if (c8eM.A2u(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                return bitmap;
            }
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0n();
                }
                c8eM = (C8eM) this.L$0;
                Hwg.A00(obj);
                bitmap = (Bitmap) obj;
                return bitmap;
            }
            htmlPreviewRenderState = (HtmlPreviewRenderState) this.L$4;
            abstractC3358CGz = (AbstractC3358CGz) this.L$3;
            str = (String) this.L$2;
            context = (Context) this.L$1;
            c8eM = (C8eM) this.L$0;
            Hwg.A00(obj);
            HtmlPreviewRenderer htmlPreviewRenderer = HtmlPreviewRenderer.INSTANCE;
            Context contextA0I = AnonymousClass001.A0I(context);
            this.L$0 = c8eM;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 2;
            obj = htmlPreviewRenderer.renderUncached(contextA0I, str, abstractC3358CGz, htmlPreviewRenderState, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
            bitmap = (Bitmap) obj;
            return bitmap;
        } finally {
            c8eM.release();
        }
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super Bitmap> htJ) {
        return ((HtmlPreviewRenderer$render$result$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
