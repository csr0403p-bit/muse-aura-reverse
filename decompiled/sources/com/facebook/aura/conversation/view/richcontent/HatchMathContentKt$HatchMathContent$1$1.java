package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HtJ;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.richcontent.HatchMathContentKt$HatchMathContent$1$1", f = "HatchMathContent.kt", l = {97}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class HatchMathContentKt$HatchMathContent$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $displayMode;
    public final /* synthetic */ String $expression;
    public final /* synthetic */ int $fontSizeSp;
    public final /* synthetic */ boolean $isRenderingEnabled;
    public final /* synthetic */ MutableState<HatchKatexRenderer.RenderResult> $renderResult$delegate;
    public final /* synthetic */ String $textColorHex;
    public Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMathContentKt$HatchMathContent$1$1(boolean z, String str, boolean z2, String str2, int i, Context context, MutableState<HatchKatexRenderer.RenderResult> mutableState, HtJ<? super HatchMathContentKt$HatchMathContent$1$1> htJ) {
        super(2, htJ);
        this.$isRenderingEnabled = z;
        this.$expression = str;
        this.$displayMode = z2;
        this.$textColorHex = str2;
        this.$fontSizeSp = i;
        this.$context = context;
        this.$renderResult$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchMathContentKt$HatchMathContent$1$1(this.$isRenderingEnabled, this.$expression, this.$displayMode, this.$textColorHex, this.$fontSizeSp, this.$context, this.$renderResult$delegate, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r12.label
            r3 = 1
            if (r0 == 0) goto L17
            if (r0 != r3) goto L12
            java.lang.Object r0 = r12.L$1
            androidx.compose.runtime.MutableState r0 = (androidx.compose.runtime.MutableState) r0
            java.lang.Object r3 = r12.L$0
            androidx.compose.runtime.MutableState r3 = (androidx.compose.runtime.MutableState) r3
            goto L59
        L12:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L17:
            X.Hwg.A00(r13)
            boolean r0 = r12.$isRenderingEnabled
            if (r0 == 0) goto L38
            com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer r6 = com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer.INSTANCE
            java.lang.String r5 = r12.$expression
            boolean r2 = r12.$displayMode
            java.lang.String r1 = r12.$textColorHex
            int r0 = r12.$fontSizeSp
            android.graphics.Bitmap r2 = r6.peekCachedBitmap(r5, r2, r1, r0)
            androidx.compose.runtime.MutableState<com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$RenderResult> r1 = r12.$renderResult$delegate
            if (r2 == 0) goto L3b
            com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$RenderResult$Success r0 = new com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$RenderResult$Success
            r0.<init>(r2)
            r1.Af8(r0)
        L38:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L3a:
            return r4
        L3b:
            r0 = 0
            r1.Af8(r0)
            androidx.compose.runtime.MutableState<com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$RenderResult> r0 = r12.$renderResult$delegate
            android.content.Context r7 = r12.$context     // Catch: java.lang.Exception -> L61
            java.lang.String r8 = r12.$expression     // Catch: java.lang.Exception -> L61
            boolean r9 = r12.$displayMode     // Catch: java.lang.Exception -> L61
            java.lang.String r10 = r12.$textColorHex     // Catch: java.lang.Exception -> L61
            int r11 = r12.$fontSizeSp     // Catch: java.lang.Exception -> L61
            r12.L$0 = r0     // Catch: java.lang.Exception -> L61
            r12.L$1 = r0     // Catch: java.lang.Exception -> L61
            r12.label = r3     // Catch: java.lang.Exception -> L61
            java.lang.Object r13 = r6.renderToBitmap(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L61
            if (r13 == r4) goto L3a
            r3 = r0
            goto L5c
        L59:
            X.Hwg.A00(r13)     // Catch: java.lang.Exception -> L5f
        L5c:
            com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$RenderResult r13 = (com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer.RenderResult) r13     // Catch: java.lang.Exception -> L5f
            goto L7b
        L5f:
            r2 = move-exception
            goto L63
        L61:
            r2 = move-exception
            r3 = r0
        L63:
            java.lang.String r1 = "KaTeX render failed"
            java.lang.String r0 = "HatchMathContent"
            X.CFK.A0A(r0, r1, r2)
            java.lang.String r0 = r2.getMessage()
            if (r0 != 0) goto L75
            r0 = 0
            java.lang.String r0 = X.C60N.A00(r0)
        L75:
            com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$RenderResult$Error r13 = new com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$RenderResult$Error
            r13.<init>(r0)
            r0 = r3
        L7b:
            r0.Af8(r13)
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.richcontent.HatchMathContentKt$HatchMathContent$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchMathContentKt$HatchMathContent$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
