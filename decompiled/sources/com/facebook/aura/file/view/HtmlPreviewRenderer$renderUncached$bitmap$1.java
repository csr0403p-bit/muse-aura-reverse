package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.GAX;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.view.HtmlPreviewRenderer$renderUncached$bitmap$1", f = "HtmlPreviewRenderer.kt", l = {FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HtmlPreviewRenderer$renderUncached$bitmap$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Bitmap>, Object> {
    public final /* synthetic */ Context $appContext;
    public final /* synthetic */ String $html;
    public final /* synthetic */ String $relativePath;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.file.view.HtmlPreviewRenderer$renderUncached$bitmap$1$1", f = "HtmlPreviewRenderer.kt", l = {102}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.HtmlPreviewRenderer$renderUncached$bitmap$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Bitmap>, Object> {
        public final /* synthetic */ Context $appContext;
        public final /* synthetic */ String $html;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, String str, String str2, AbstractC3358CGz abstractC3358CGz, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$appContext = context;
            this.$html = str;
            this.$relativePath = str2;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$appContext, this.$html, this.$relativePath, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HtmlPreviewRenderer htmlPreviewRenderer = HtmlPreviewRenderer.INSTANCE;
                Context context = this.$appContext;
                String str = this.$html;
                String str2 = this.$relativePath;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                this.label = 1;
                obj = htmlPreviewRenderer.renderHtmlToBitmap(context, str, str2, abstractC3358CGz, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Bitmap> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlPreviewRenderer$renderUncached$bitmap$1(Context context, String str, String str2, AbstractC3358CGz abstractC3358CGz, HtJ<? super HtmlPreviewRenderer$renderUncached$bitmap$1> htJ) {
        super(2, htJ);
        this.$appContext = context;
        this.$html = str;
        this.$relativePath = str2;
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HtmlPreviewRenderer$renderUncached$bitmap$1(this.$appContext, this.$html, this.$relativePath, this.$userSession, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$appContext, this.$html, this.$relativePath, this.$userSession, null);
            this.label = 1;
            obj = GAX.A01(this, anonymousClass1, 12000L);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Bitmap> htJ) {
        return ((HtmlPreviewRenderer$renderUncached$bitmap$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
