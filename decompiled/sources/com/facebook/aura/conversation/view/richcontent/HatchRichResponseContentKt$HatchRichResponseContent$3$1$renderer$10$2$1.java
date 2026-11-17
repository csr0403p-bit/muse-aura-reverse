package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G2l;
import com.facebook.aura.model.HatchContentViewModelData;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$10$2$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ HatchContentViewModelData $contentViewModel;
    public final /* synthetic */ String $previewPath;
    public final /* synthetic */ G2l<String, String, String, G0U<? super String, Unit>, BFM, Integer, Unit> $previewer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$10$2$1(G2l<? super String, ? super String, ? super String, ? super G0U<? super String, Unit>, ? super BFM, ? super Integer, Unit> g2l, String str, HatchContentViewModelData hatchContentViewModelData) {
        super(2);
        this.$previewer = g2l;
        this.$previewPath = str;
        this.$contentViewModel = hatchContentViewModelData;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            G2l<String, String, String, G0U<? super String, Unit>, BFM, Integer, Unit> g2l = this.$previewer;
            String str = this.$previewPath;
            HatchContentViewModelData.InlineHtml inlineHtml = (HatchContentViewModelData.InlineHtml) this.$contentViewModel;
            String strResolveFileExtension = HatchInlineFileChipKt.resolveFileExtension(inlineHtml.fileName, inlineHtml.url);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$10$2$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            g2l.invoke(str, strResolveFileExtension, "text/html", objAaT, bfm, 3456);
            return;
        }
        bfm.Afo();
    }
}
