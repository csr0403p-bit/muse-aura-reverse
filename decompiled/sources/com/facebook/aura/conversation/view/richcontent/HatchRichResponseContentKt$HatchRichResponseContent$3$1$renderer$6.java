package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C78N;
import X.FGI;
import X.G0U;
import X.G0V;
import com.facebook.aura.model.HatchContentViewModelData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ HatchContentViewModelData $contentViewModel;
    public final /* synthetic */ G0U<String, Unit> $onImageError;
    public final /* synthetic */ G0V<String, String, Unit> $onInlineImageClick;
    public final /* synthetic */ String $sharedElementKeyPrefix;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$6(HatchContentViewModelData hatchContentViewModelData, G0V<? super String, ? super String, Unit> g0v, G0U<? super String, Unit> g0u, String str) {
        super(2);
        this.$contentViewModel = hatchContentViewModelData;
        this.$onInlineImageClick = g0v;
        this.$onImageError = g0u;
        this.$sharedElementKeyPrefix = str;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(BFM bfm, int i) {
        Function0 function0;
        int iA1P;
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            HatchContentViewModelData.InlineImage inlineImage = (HatchContentViewModelData.InlineImage) this.$contentViewModel;
            String str = inlineImage.url;
            String str2 = inlineImage.alt;
            boolean z = inlineImage.deleted;
            String strA0U = null;
            if (this.$onInlineImageClick != null) {
                bfm.AgE(1591163000);
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$contentViewModel, bfm.A65(this.$onInlineImageClick));
                G0V<String, String, Unit> g0v = this.$onInlineImageClick;
                HatchContentViewModelData hatchContentViewModelData = this.$contentViewModel;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$6$1$1(g0v, hatchContentViewModelData);
                    bfm.Ai0(objAaT);
                }
                function0 = (Function0) objAaT;
                iA1P = AnonymousClass001.A1V(bfm);
            } else {
                function0 = null;
                iA1P = AnonymousClass004.A1P(bfm, 1591284395);
            }
            G0U<String, Unit> g0u = this.$onImageError;
            String str3 = this.$sharedElementKeyPrefix;
            if (str3 != null) {
                strA0U = FGI.A0U(str3, "_", ((HatchContentViewModelData.InlineImage) this.$contentViewModel).url);
            }
            HatchInlineImageKt.m676HatchInlineImageTxD2sAc(str, str2, null, 0.0f, 0.0f, z, null, function0, g0u, strA0U, bfm, iA1P, 92);
            return;
        }
        bfm.Afo();
    }
}
