package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass037;
import X.BFM;
import X.G0W;
import X.HxE;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1$1$1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public final /* synthetic */ HxE<String, String> $boundaryCardIds;
    public final /* synthetic */ MutableState<String> $swipingIdeaCardId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1$1$1(MutableState<String> mutableState, HxE<String, String> hxE) {
        super(3);
        this.$swipingIdeaCardId = mutableState;
        this.$boundaryCardIds = hxE;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
        invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            String strA05 = MutableState.A05(this.$swipingIdeaCardId);
            HxE<String, String> hxE = this.$boundaryCardIds;
            HatchIdeasTabScreenKt.IdeasSectionDivider(HatchIdeasTabScreenKt.isEitherOf(strA05, hxE.first, hxE.second), null, bfm, 0, 2);
            return;
        }
        bfm.Afo();
    }
}
