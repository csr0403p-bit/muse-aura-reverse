package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.BOf;
import X.C06G;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.button.IconContext;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$HatchCodeBlockKt$lambda$1917249636$1 extends AbstractC7559F3s implements G0W<IconContext, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchCodeBlockKt$lambda$1917249636$1 INSTANCE = new ComposableSingletons$HatchCodeBlockKt$lambda$1917249636$1();

    public ComposableSingletons$HatchCodeBlockKt$lambda$1917249636$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(IconContext iconContext, BFM bfm, Integer num) {
        invoke(iconContext, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(IconContext iconContext, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.copy_wght400_outline_24, 0), AuraIconSize.X_SMALL, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ac3), C06G.A06(bfm), null, bfm, AnonymousClass001.A03(), 33);
            return;
        }
        bfm.Afo();
    }
}
