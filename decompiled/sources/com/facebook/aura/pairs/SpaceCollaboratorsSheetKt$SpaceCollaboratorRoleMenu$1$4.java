package com.facebook.aura.pairs;

import X.AGI;
import X.AHD;
import X.AHH;
import X.AVy;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.BRg;
import X.BS0;
import X.G0V;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SpaceCollaboratorsSheetKt$SpaceCollaboratorRoleMenu$1$4 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
    public final /* synthetic */ String $name;
    public final /* synthetic */ String $removeLabel;
    public final /* synthetic */ List<AuraContextMenuItem> $roleItems;
    public final /* synthetic */ AVy $trash;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceCollaboratorsSheetKt$SpaceCollaboratorRoleMenu$1$4(String str, List<AuraContextMenuItem> list, String str2, AVy aVy) {
        super(2);
        this.$name = str;
        this.$roleItems = list;
        this.$removeLabel = str2;
        this.$trash = aVy;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
        return invoke(bfm, AnonymousClass001.A0F(num));
    }

    public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) {
        bfm.AgE(1862663281);
        String str = this.$name;
        BS0 bs0 = BRg.A00;
        AHH ahhA0C = AGI.A0C(AbstractC0878AGe.A0Q(new AuraContextMenuItem(-2, this.$removeLabel, null, this.$trash, null, null, false, false, false, true, true, bs0, 1, 1), AbstractC0878AGe.A0P(this.$roleItems, Collections.singletonList(new AuraContextMenuItem(-1, str, null, null, null, null, false, false, true, true, false, bs0, 1, 1)))));
        AnonymousClass001.A1D(bfm);
        return ahhA0C;
    }
}
