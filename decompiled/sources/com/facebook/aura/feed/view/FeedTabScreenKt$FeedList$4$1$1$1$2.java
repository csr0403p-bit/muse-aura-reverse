package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.C1Cd;
import X.C3U4;
import X.G0W;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedList$4$1$1$1$2 extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
    public final /* synthetic */ Function0<Unit> $onInstructionsEditClick;
    public final /* synthetic */ String $promptDisplayText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTabScreenKt$FeedList$4$1$1$1$2(String str, Function0<Unit> function0) {
        super(3);
        this.$promptDisplayText = str;
        this.$onInstructionsEditClick = function0;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) {
        invoke(c1Cd, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C1Cd c1Cd, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            FeedHeaderKt.FeedPromptPreview(this.$promptDisplayText, this.$onInstructionsEditClick, C3U4.A0C(C3U4.A0B(BRg.A00, AuraDimensKt.SpacingMedium, 0.0f), 0.0f, 0.0f, 0.0f, AuraDimensKt.SpacingLarge), bfm, 0, 0);
        } else {
            bfm.Afo();
        }
    }
}
