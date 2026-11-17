package com.facebook.aura.spaces.menu;

import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.B6A;
import X.BFM;
import X.G0V;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class SpaceMenuPresentationKt$SpaceMenuCardAction$2$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ AuraContextMenuItem $item;
    public final /* synthetic */ AVy $painter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceMenuPresentationKt$SpaceMenuCardAction$2$1(AVy aVy, AuraContextMenuItem auraContextMenuItem) {
        super(2);
        this.$painter = aVy;
        this.$item = auraContextMenuItem;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        long j;
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AVy aVy = this.$painter;
            if (this.$item.isDestructive) {
                j = AnonymousClass003.A0c(bfm, 2050530855).destructiveIcon.enabled;
            } else {
                bfm.AgE(-858016880);
                B6A b6a = this.$item.startIconTint;
                if (b6a == null) {
                    j = AnonymousClass003.A0c(bfm, 2050533227).primaryText;
                    AnonymousClass002.A19(bfm);
                } else {
                    AnonymousClass004.A1A(bfm, 2050532018);
                    j = b6a.A00;
                }
            }
            AnonymousClass002.A19(bfm);
            AuraIconKt.m2568AuraIconFyETyZw(null, aVy, 24.0f, null, j, null, bfm, AnonymousClass001.A03(), 41);
            return;
        }
        bfm.Afo();
    }
}
