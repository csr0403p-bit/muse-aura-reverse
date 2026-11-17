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
public final class HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$10 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $attachmentSender;
    public final /* synthetic */ HatchContentViewModelData $contentViewModel;
    public final /* synthetic */ G2l<String, String, String, G0U<? super String, Unit>, BFM, Integer, Unit> $inlineFilePreview;
    public final /* synthetic */ G0U<String, Unit> $onArtifactVisible;
    public final /* synthetic */ G0V<String, String, Unit> $onInlineFileClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$10(G0U<? super String, Unit> g0u, HatchContentViewModelData hatchContentViewModelData, G2l<? super String, ? super String, ? super String, ? super G0U<? super String, Unit>, ? super BFM, ? super Integer, Unit> g2l, String str, G0V<? super String, ? super String, Unit> g0v) {
        super(2);
        this.$onArtifactVisible = g0u;
        this.$contentViewModel = hatchContentViewModelData;
        this.$inlineFilePreview = g2l;
        this.$attachmentSender = str;
        this.$onInlineFileClick = g0v;
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
                bfm.AgE(-78630410);
                String str = ((HatchContentViewModelData.InlineHtml) this.$contentViewModel).url;
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$contentViewModel, bfm.A65(this.$onArtifactVisible));
                G0U<String, Unit> g0u = this.$onArtifactVisible;
                HatchContentViewModelData hatchContentViewModelData = this.$contentViewModel;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$10$1$1(g0u, hatchContentViewModelData, null);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass001.A18(bfm, objAaT, str);
                bbiA0M = C3cG.A07(bfm);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, -78517012);
            }
            String strResolvePreviewPathFromUrl = HatchFileUIUtils.INSTANCE.resolvePreviewPathFromUrl(((HatchContentViewModelData.InlineHtml) this.$contentViewModel).url);
            HatchContentViewModelData.InlineHtml inlineHtml = (HatchContentViewModelData.InlineHtml) this.$contentViewModel;
            String str2 = inlineHtml.fileName;
            String str3 = inlineHtml.url;
            boolean z = inlineHtml.deleted;
            boolean z2 = inlineHtml.loading;
            if (strResolvePreviewPathFromUrl != null && !z && !z2) {
                bfm.AgE(-77528360);
                G2l<String, String, String, G0U<? super String, Unit>, BFM, Integer, Unit> g2l = this.$inlineFilePreview;
                if (g2l == null) {
                    bfm.AgE(-77528361);
                } else {
                    bfm.AgE(-77528360);
                    b1uA00 = B1V.A00(bfm, new HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$10$2$1(g2l, strResolvePreviewPathFromUrl, this.$contentViewModel), -1344449642);
                }
                BBI.A0R(bbiA0M, false);
            } else {
                bfm.AgE(-76985241);
            }
            BBI.A0R(bbiA0M, false);
            String str4 = this.$attachmentSender;
            boolean zA1R2 = AnonymousClass001.A1R(bfm, this.$contentViewModel, bfm.A65(this.$onInlineFileClick));
            G0V<String, String, Unit> g0v = this.$onInlineFileClick;
            HatchContentViewModelData hatchContentViewModelData2 = this.$contentViewModel;
            Object objAaT2 = bfm.AaT();
            if (zA1R2 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$10$3$1(g0v, hatchContentViewModelData2);
                bfm.Ai0(objAaT2);
            }
            HatchInlineFileChipKt.HatchInlineFileChip(str2, str3, "text/html", null, null, z, z2, false, false, false, str4, (Function0) objAaT2, b1uA00, bfm, 384, 0, 920);
            return;
        }
        bfm.Afo();
    }
}
