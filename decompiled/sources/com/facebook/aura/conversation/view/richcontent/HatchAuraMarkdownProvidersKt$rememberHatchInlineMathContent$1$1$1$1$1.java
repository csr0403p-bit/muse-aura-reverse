package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer;
import com.facebook.aura.markdown.render.inline.InlineMathEntity;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.richcontent.HatchAuraMarkdownProvidersKt$rememberHatchInlineMathContent$1$1$1$1$1", f = "HatchAuraMarkdownProviders.kt", l = {525}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAuraMarkdownProvidersKt$rememberHatchInlineMathContent$1$1$1$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ InlineMathEntity $entity;
    public final /* synthetic */ int $fontSizeSp;
    public final /* synthetic */ Map<String, Bitmap> $rendered;
    public final /* synthetic */ String $textColorHex;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAuraMarkdownProvidersKt$rememberHatchInlineMathContent$1$1$1$1$1(Context context, InlineMathEntity inlineMathEntity, String str, int i, Map<String, Bitmap> map, HtJ<? super HatchAuraMarkdownProvidersKt$rememberHatchInlineMathContent$1$1$1$1$1> htJ) {
        super(2, htJ);
        this.$context = context;
        this.$entity = inlineMathEntity;
        this.$textColorHex = str;
        this.$fontSizeSp = i;
        this.$rendered = map;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAuraMarkdownProvidersKt$rememberHatchInlineMathContent$1$1$1$1$1(this.$context, this.$entity, this.$textColorHex, this.$fontSizeSp, this.$rendered, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchKatexRenderer hatchKatexRenderer = HatchKatexRenderer.INSTANCE;
            Context context = this.$context;
            String str = this.$entity.expression;
            String str2 = this.$textColorHex;
            int i2 = this.$fontSizeSp;
            this.label = 1;
            obj = hatchKatexRenderer.renderToBitmap(context, str, false, str2, i2, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        HatchKatexRenderer.RenderResult renderResult = (HatchKatexRenderer.RenderResult) obj;
        if (renderResult instanceof HatchKatexRenderer.RenderResult.Success) {
            Map<String, Bitmap> map = this.$rendered;
            InlineMathEntity inlineMathEntity = this.$entity;
            synchronized (map) {
                map.put(inlineMathEntity.key, ((HatchKatexRenderer.RenderResult.Success) renderResult).bitmap);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchAuraMarkdownProvidersKt$rememberHatchInlineMathContent$1$1$1$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
