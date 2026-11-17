package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.B1U;
import X.B1V;
import X.BBI;
import X.BFM;
import X.C3cG;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G2l;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.model.HatchContentViewModelData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$9 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $attachmentSender;
    public final /* synthetic */ HatchContentViewModelData $contentViewModel;
    public final /* synthetic */ G2l<String, String, String, G0U<? super String, Unit>, BFM, Integer, Unit> $inlineFilePreview;
    public final /* synthetic */ G0U<String, Unit> $onArtifactVisible;
    public final /* synthetic */ G0V<String, String, Unit> $onInlineSlidesClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$9(G0U<? super String, Unit> g0u, HatchContentViewModelData hatchContentViewModelData, G2l<? super String, ? super String, ? super String, ? super G0U<? super String, Unit>, ? super BFM, ? super Integer, Unit> g2l, String str, G0V<? super String, ? super String, Unit> g0v) {
        super(2);
        this.$onArtifactVisible = g0u;
        this.$contentViewModel = hatchContentViewModelData;
        this.$inlineFilePreview = g2l;
        this.$attachmentSender = str;
        this.$onInlineSlidesClick = g0v;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        BBI bbiA0M;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            B1U b1uA00 = null;
            if (this.$onArtifactVisible != null) {
                bfm.AgE(-734945225);
                String str = ((HatchContentViewModelData.InlineSlides) this.$contentViewModel).url;
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$contentViewModel, bfm.A65(this.$onArtifactVisible));
                G0U<String, Unit> g0u = this.$onArtifactVisible;
                HatchContentViewModelData hatchContentViewModelData = this.$contentViewModel;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$9$1$1(g0u, hatchContentViewModelData, null);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass001.A18(bfm, objAaT, str);
                bbiA0M = C3cG.A07(bfm);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, -734831827);
            }
            String strResolvePreviewPathFromUrl = HatchFileUIUtils.INSTANCE.resolvePreviewPathFromUrl(((HatchContentViewModelData.InlineSlides) this.$contentViewModel).url);
            HatchContentViewModelData.InlineSlides inlineSlides = (HatchContentViewModelData.InlineSlides) this.$contentViewModel;
            String str2 = inlineSlides.fileName;
            String str3 = inlineSlides.url;
            boolean z = inlineSlides.deleted;
            boolean z2 = inlineSlides.loading;
            if (strResolvePreviewPathFromUrl != null && !z && !z2) {
                bfm.AgE(-733814717);
                G2l<String, String, String, G0U<? super String, Unit>, BFM, Integer, Unit> g2l = this.$inlineFilePreview;
                if (g2l == null) {
                    bfm.AgE(-733814718);
                } else {
                    bfm.AgE(-733814717);
                    b1uA00 = B1V.A00(bfm, new HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$9$2$1(g2l, strResolvePreviewPathFromUrl, this.$contentViewModel), 1398910070);
                }
                BBI.A0R(bbiA0M, false);
            } else {
                bfm.AgE(-733281208);
            }
            BBI.A0R(bbiA0M, false);
            String str4 = this.$attachmentSender;
            boolean zA1R2 = AnonymousClass001.A1R(bfm, this.$contentViewModel, bfm.A65(this.$onInlineSlidesClick));
            G0V<String, String, Unit> g0v = this.$onInlineSlidesClick;
            HatchContentViewModelData hatchContentViewModelData2 = this.$contentViewModel;
            Object objAaT2 = bfm.AaT();
            if (zA1R2 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$9$3$1(g0v, hatchContentViewModelData2);
                bfm.Ai0(objAaT2);
            }
            HatchInlineFileChipKt.HatchInlineFileChip(str2, str3, null, null, null, z, z2, true, false, false, str4, (Function0) objAaT2, b1uA00, bfm, 12583296, 0, 792);
            return;
        }
        bfm.Afo();
    }
}
