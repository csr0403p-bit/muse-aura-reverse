package com.facebook.aura.spaces.menu;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass007;
import X.BFM;
import X.G0V;
import com.facebook.aura.R;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$5$1$2$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $count;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$5$1$2$1(int i) {
        super(2);
        this.$count = i;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            SpaceCollaboratorCountKt.SpaceMenuTrailingValue(AnonymousClass007.A0Y(this.$count, bfm, R.plurals._name_removed__res_0x7f10001e), null, bfm, 0, 2);
        } else {
            bfm.Afo();
        }
    }
}
