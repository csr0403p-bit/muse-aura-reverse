package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass007;
import X.BFM;
import X.BOf;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.button.IconContext;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$ExploreIdeaCardDetailSheetKt$lambda$1556007039$1 extends AbstractC7559F3s implements G0W<IconContext, BFM, Integer, Unit> {
    public static final ComposableSingletons$ExploreIdeaCardDetailSheetKt$lambda$1556007039$1 INSTANCE = new ComposableSingletons$ExploreIdeaCardDetailSheetKt$lambda$1556007039$1();

    public ComposableSingletons$ExploreIdeaCardDetailSheetKt$lambda$1556007039$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(IconContext iconContext, BFM bfm, Integer num) {
        invoke(iconContext, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(IconContext iconContext, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            AnonymousClass007.A0x(bfm, BOf.A00(bfm, R.drawable.ic_checkmark_circle_filled_24, 0), AuraIconSize.X_SMALL);
        } else {
            bfm.Afo();
        }
    }
}
