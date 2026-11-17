package com.facebook.aura.vds.toolbar;

import X.AbstractC7559F3s;
import X.AbstractC8407FdO;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass007;
import X.BFM;
import X.G0W;
import com.facebook.aura.vds.compose.button.AuraButtonDefaults;
import com.facebook.aura.vds.compose.button.IconContext;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class EndButtonsKt$EndButtons$1$1$1 extends AbstractC7559F3s implements G0W<IconContext, BFM, Integer, Unit> {
    public final /* synthetic */ Integer $icon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EndButtonsKt$EndButtons$1$1$1(Integer num) {
        super(3);
        this.$icon = num;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(IconContext iconContext, BFM bfm, Integer num) {
        invoke(iconContext, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(IconContext iconContext, BFM bfm, int i) {
        if (AnonymousClass002.A0B(iconContext, i) == 0) {
            i |= AnonymousClass004.A0d(bfm, iconContext);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
            AnonymousClass007.A0w(bfm, AbstractC8407FdO.A00(bfm, this.$icon.intValue()), AuraButtonDefaults.INSTANCE, iconContext, i);
        } else {
            bfm.Afo();
        }
    }
}
