package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.CFK;
import X.G0V;
import X.HB8;
import X.HBA;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer;
import java.io.ByteArrayInputStream;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer$renderToSvg$3$1$finalResult$1", f = "MermaidSvgRenderer.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class MermaidSvgRenderer$renderToSvg$3$1$finalResult$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super MermaidSvgRenderer.RenderResult>, Object> {
    public final /* synthetic */ MermaidSvgRenderer.RawRenderResult $rawResult;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MermaidSvgRenderer$renderToSvg$3$1$finalResult$1(MermaidSvgRenderer.RawRenderResult rawRenderResult, HtJ<? super MermaidSvgRenderer$renderToSvg$3$1$finalResult$1> htJ) {
        super(2, htJ);
        this.$rawResult = rawRenderResult;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new MermaidSvgRenderer$renderToSvg$3$1$finalResult$1(this.$rawResult, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super MermaidSvgRenderer.RenderResult> htJ) {
        return new MermaidSvgRenderer$renderToSvg$3$1$finalResult$1(this.$rawResult, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        String str;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        MermaidSvgRenderer.RawRenderResult rawRenderResult = this.$rawResult;
        if (rawRenderResult instanceof MermaidSvgRenderer.RawRenderResult.Error) {
            str = ((MermaidSvgRenderer.RawRenderResult.Error) rawRenderResult).message;
        } else {
            if (!(rawRenderResult instanceof MermaidSvgRenderer.RawRenderResult.Success)) {
                throw C3cG.A0q();
            }
            try {
                String strA03 = MermaidSvgRenderer.WORD_SPACE.A03(((MermaidSvgRenderer.RawRenderResult.Success) rawRenderResult).svgString, " $1");
                HBA hbaA0X = new HB8().A0X(new ByteArrayInputStream(strA03.getBytes()));
                C7384Etj.A0U(hbaA0X);
                return new MermaidSvgRenderer.RenderResult.Success(strA03, hbaA0X);
            } catch (Exception e) {
                str = "Failed to parse SVG";
                CFK.A0A(MermaidSvgRenderer.TAG, "Failed to parse SVG", e);
                String message = e.getMessage();
                if (message != null) {
                    str = message;
                }
            }
        }
        return new MermaidSvgRenderer.RenderResult.Error(str);
    }
}
