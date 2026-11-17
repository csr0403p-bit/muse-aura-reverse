package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C60N;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.richcontent.HatchMermaidContentKt$rememberMermaidRenderResult$1$1", f = "HatchMermaidContent.kt", l = {115}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchMermaidContentKt$rememberMermaidRenderResult$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $mermaidSource;
    public final /* synthetic */ MutableState<MermaidSvgRenderer.RenderResult> $result$delegate;
    public final /* synthetic */ MermaidThemeColors $theme;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMermaidContentKt$rememberMermaidRenderResult$1$1(Context context, String str, MermaidThemeColors mermaidThemeColors, MutableState<MermaidSvgRenderer.RenderResult> mutableState, HtJ<? super HatchMermaidContentKt$rememberMermaidRenderResult$1$1> htJ) {
        super(2, htJ);
        this.$context = context;
        this.$mermaidSource = str;
        this.$theme = mermaidThemeColors;
        this.$result$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchMermaidContentKt$rememberMermaidRenderResult$1$1(this.$context, this.$mermaidSource, this.$theme, this.$result$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        MermaidSvgRenderer.RenderResult error;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                MermaidSvgRenderer mermaidSvgRenderer = MermaidSvgRenderer.INSTANCE;
                Context context = this.$context;
                String str = this.$mermaidSource;
                MermaidThemeColors mermaidThemeColors = this.$theme;
                String str2 = mermaidThemeColors.bgColor;
                String str3 = mermaidThemeColors.nodeBgColor;
                String str4 = mermaidThemeColors.textColor;
                String str5 = mermaidThemeColors.lineColor;
                String str6 = mermaidThemeColors.nodeBorderColor;
                List<String> list = mermaidThemeColors.chartColors;
                this.label = 1;
                obj = mermaidSvgRenderer.renderToSvg(context, str, str2, str3, str4, str5, str6, list, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            error = (MermaidSvgRenderer.RenderResult) obj;
        } catch (Exception e) {
            CFK.A0A(HatchMermaidContentKt.TAG, "Render failed", e);
            String message = e.getMessage();
            if (message == null) {
                message = C60N.A00(0);
            }
            error = new MermaidSvgRenderer.RenderResult.Error(message);
        }
        this.$result$delegate.Af8(error);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchMermaidContentKt$rememberMermaidRenderResult$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
