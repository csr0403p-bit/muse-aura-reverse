package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C10G;
import X.G0V;
import com.facebook.aura.model.HatchContentViewModelData;
import com.facebook.aura.webview.WebContent;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$11 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ HatchContentViewModelData $contentViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$11(HatchContentViewModelData hatchContentViewModelData) {
        super(2);
        this.$contentViewModel = hatchContentViewModelData;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            String str = ((HatchContentViewModelData.EmbeddedFileHTMLContent) this.$contentViewModel).htmlContent;
            if (str != null) {
                HatchEmbeddedHtmlKt.HatchEmbeddedHtml(new WebContent.Data(str, null, "utf-8", "text/html", null), C10G.A02, false, bfm, 48, 4);
                return;
            }
            return;
        }
        bfm.Afo();
    }
}
