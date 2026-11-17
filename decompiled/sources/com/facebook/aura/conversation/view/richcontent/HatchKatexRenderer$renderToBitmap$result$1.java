package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.graphics.Bitmap;
import com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$renderToBitmap$result$1", f = "HatchKatexRenderer.kt", l = {185, 189}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class HatchKatexRenderer$renderToBitmap$result$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchKatexRenderer.RenderResult>, Object> {
    public final /* synthetic */ String $cacheKey;
    public final /* synthetic */ boolean $displayMode;
    public final /* synthetic */ String $expression;
    public final /* synthetic */ int $fontSizeSp;
    public final /* synthetic */ HatchKatexRenderer.PooledWebView $pooled;
    public final /* synthetic */ String $textColor;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchKatexRenderer$renderToBitmap$result$1(String str, HatchKatexRenderer.PooledWebView pooledWebView, String str2, boolean z, String str3, int i, HtJ<? super HatchKatexRenderer$renderToBitmap$result$1> htJ) {
        super(2, htJ);
        this.$cacheKey = str;
        this.$pooled = pooledWebView;
        this.$expression = str2;
        this.$displayMode = z;
        this.$textColor = str3;
        this.$fontSizeSp = i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchKatexRenderer$renderToBitmap$result$1(this.$cacheKey, this.$pooled, this.$expression, this.$displayMode, this.$textColor, this.$fontSizeSp, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchKatexRenderer hatchKatexRenderer = HatchKatexRenderer.INSTANCE;
            Bitmap bitmapCachedBitmap = hatchKatexRenderer.cachedBitmap(this.$cacheKey);
            if (bitmapCachedBitmap != null) {
                return new HatchKatexRenderer.RenderResult.Success(bitmapCachedBitmap);
            }
            HatchKatexRenderer.PooledWebView pooledWebView = this.$pooled;
            this.label = 1;
            obj = hatchKatexRenderer.waitForReady(pooledWebView, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    Hwg.A00(obj);
                }
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        if (!AnonymousClass001.A1X(obj)) {
            return new HatchKatexRenderer.RenderResult.Error("WebView initialization timed out");
        }
        HatchKatexRenderer hatchKatexRenderer2 = HatchKatexRenderer.INSTANCE;
        HatchKatexRenderer.PooledWebView pooledWebView2 = this.$pooled;
        String str = this.$expression;
        boolean z = this.$displayMode;
        String str2 = this.$textColor;
        int i2 = this.$fontSizeSp;
        this.label = 2;
        obj = hatchKatexRenderer2.executeRenderOn(pooledWebView2, str, z, str2, i2, this);
        return obj == enumC10460Hji ? enumC10460Hji : obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super HatchKatexRenderer.RenderResult> htJ) {
        return ((HatchKatexRenderer$renderToBitmap$result$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
