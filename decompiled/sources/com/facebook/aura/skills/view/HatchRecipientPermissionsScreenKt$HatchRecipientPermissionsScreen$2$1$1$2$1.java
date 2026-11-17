package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.C3U4;
import X.G0V;
import com.facebook.aura.skills.viewmodel.RecipientPermissionGroup;
import com.facebook.aura.vds.compose.header.AuraSectionHeaderKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchRecipientPermissionsScreenKt$HatchRecipientPermissionsScreen$2$1$1$2$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ RecipientPermissionGroup $group;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRecipientPermissionsScreenKt$HatchRecipientPermissionsScreen$2$1$1$2$1(RecipientPermissionGroup recipientPermissionGroup) {
        super(2);
        this.$group = recipientPermissionGroup;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AuraSectionHeaderKt.AuraSectionHeader(this.$group.label, null, C3U4.A04(BRg.A00, 16.0f), bfm, 432, 0);
        } else {
            bfm.Afo();
        }
    }
}
