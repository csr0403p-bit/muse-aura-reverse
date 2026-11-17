package com.facebook.aura.file.view;

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
import com.facebook.aura.vds.compose.theme.AuraColors;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchPublishArtifactSheetKt$HasChangesPublishSheetContent$1$1 extends AbstractC7559F3s implements G0W<IconContext, BFM, Integer, Unit> {
    public final /* synthetic */ AuraColors $colors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPublishArtifactSheetKt$HasChangesPublishSheetContent$1$1(AuraColors auraColors) {
        super(3);
        this.$colors = auraColors;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(IconContext iconContext, BFM bfm, Integer num) {
        invoke(iconContext, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(IconContext iconContext, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            AnonymousClass007.A0z(bfm, BOf.A00(bfm, R.drawable.aura_wand, 0), AuraIconSize.X_SMALL, this.$colors.onMedia);
        } else {
            bfm.Afo();
        }
    }
}
