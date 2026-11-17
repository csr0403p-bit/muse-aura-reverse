package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C78T;
import X.C8j4;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.facebook.aura.model.HatchFileProviderUtil;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer$render$4$1", f = "HatchIdeaShareImageRenderer.kt", l = {148}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchIdeaShareImageRenderer$render$4$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
    public final /* synthetic */ Context $applicationContext;
    public final /* synthetic */ String $cacheKey;
    public final /* synthetic */ Bitmap $image;
    public final /* synthetic */ String $imageUrl;
    public final /* synthetic */ boolean $isColorImage;
    public final /* synthetic */ boolean $isDarkTheme;
    public final /* synthetic */ String $label;
    public final /* synthetic */ String $summary;
    public final /* synthetic */ HatchIdeaShareImageRenderer $this_run;
    public final /* synthetic */ String $title;
    public Object L$0;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer$render$4$1$1", f = "HatchIdeaShareImageRenderer.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer$render$4$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
        public final /* synthetic */ Context $applicationContext;
        public final /* synthetic */ Bitmap $bitmap;
        public final /* synthetic */ String $cacheKey;
        public final /* synthetic */ Bitmap $image;
        public final /* synthetic */ String $imageUrl;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Bitmap bitmap, String str2, Context context, Bitmap bitmap2, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$imageUrl = str;
            this.$image = bitmap;
            this.$cacheKey = str2;
            this.$applicationContext = context;
            this.$bitmap = bitmap2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$imageUrl, this.$image, this.$cacheKey, this.$applicationContext, this.$bitmap, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Exception {
            StringBuilder sbA0g;
            String str;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            if (this.$imageUrl == null || this.$image != null) {
                sbA0g = C3cG.A0g(this.$cacheKey);
                str = ".png";
            } else {
                sbA0g = C3cG.A0g(this.$cacheKey);
                str = "-fallback.png";
            }
            File fileStoreNamed = C8j4.A0k(this.$applicationContext).storeNamed(AnonymousClass001.A0v(str, sbA0g), new HatchIdeaShareImageRenderer$render$4$1$1$file$1(this.$bitmap));
            return C8j4.A0v(this.$applicationContext, HatchFileProviderUtil.INSTANCE, fileStoreNamed);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchIdeaShareImageRenderer$render$4$1(HatchIdeaShareImageRenderer hatchIdeaShareImageRenderer, Context context, String str, String str2, String str3, Bitmap bitmap, boolean z, boolean z2, String str4, String str5, HtJ<? super HatchIdeaShareImageRenderer$render$4$1> htJ) {
        super(2, htJ);
        this.$this_run = hatchIdeaShareImageRenderer;
        this.$applicationContext = context;
        this.$label = str;
        this.$title = str2;
        this.$summary = str3;
        this.$image = bitmap;
        this.$isColorImage = z;
        this.$isDarkTheme = z2;
        this.$imageUrl = str4;
        this.$cacheKey = str5;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchIdeaShareImageRenderer$render$4$1(this.$this_run, this.$applicationContext, this.$label, this.$title, this.$summary, this.$image, this.$isColorImage, this.$isDarkTheme, this.$imageUrl, this.$cacheKey, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
        Bitmap bitmapRenderCard;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                HatchIdeaShareImageRenderer hatchIdeaShareImageRenderer = this.$this_run;
                Context context = this.$applicationContext;
                C7384Etj.A0X(context);
                bitmapRenderCard = hatchIdeaShareImageRenderer.renderCard(context, this.$label, this.$title, this.$summary, this.$image, this.$isColorImage, this.$isDarkTheme ? HatchMessageShareImageColors.Dark : HatchMessageShareImageColors.Light);
                C78T c78tA0y = AnonymousClass001.A0y();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$imageUrl, this.$image, this.$cacheKey, this.$applicationContext, bitmapRenderCard, null);
                this.L$0 = bitmapRenderCard;
                this.label = 1;
                obj = GAo.A00(this, c78tA0y, anonymousClass1);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                bitmapRenderCard = (Bitmap) this.L$0;
                Hwg.A00(obj);
            }
            return (String) obj;
        } finally {
            bitmapRenderCard.recycle();
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
        return ((HatchIdeaShareImageRenderer$render$4$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
