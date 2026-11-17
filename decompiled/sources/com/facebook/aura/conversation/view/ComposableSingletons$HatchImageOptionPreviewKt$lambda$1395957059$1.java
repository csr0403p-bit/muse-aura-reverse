package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass007;
import X.BFM;
import X.BOf;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.button.AuraButtonDefaults;
import com.facebook.aura.vds.compose.button.IconContext;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$HatchImageOptionPreviewKt$lambda$1395957059$1 extends AbstractC7559F3s implements G0W<IconContext, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchImageOptionPreviewKt$lambda$1395957059$1 INSTANCE = new ComposableSingletons$HatchImageOptionPreviewKt$lambda$1395957059$1();

    public ComposableSingletons$HatchImageOptionPreviewKt$lambda$1395957059$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(IconContext iconContext, BFM bfm, Integer num) {
        invoke(iconContext, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(IconContext iconContext, BFM bfm, int i) {
        int iA0d;
        C7384Etj.A0Y(iconContext, 0);
        if ((i & 6) == 0) {
            iA0d = AnonymousClass004.A0d(bfm, iconContext) | i;
        } else {
            iA0d = i;
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            AnonymousClass007.A0w(bfm, BOf.A00(bfm, R.drawable.arrow_share_wght400_outline_24, 0), AuraButtonDefaults.INSTANCE, iconContext, iA0d);
        } else {
            bfm.Afo();
        }
    }
}
