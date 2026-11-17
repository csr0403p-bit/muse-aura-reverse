package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.G0V;
import com.facebook.aura.model.HatchContentViewModelData;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ HatchContentViewModelData $contentViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$5(HatchContentViewModelData hatchContentViewModelData) {
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
            HatchContentViewModelData.Math math = (HatchContentViewModelData.Math) this.$contentViewModel;
            HatchMathContentKt.m682HatchMathContentw0dp6WY(math.expression, math.displayMode, null, 0.0f, 0, 0L, bfm, 3072, 52);
        } else {
            bfm.Afo();
        }
    }
}
