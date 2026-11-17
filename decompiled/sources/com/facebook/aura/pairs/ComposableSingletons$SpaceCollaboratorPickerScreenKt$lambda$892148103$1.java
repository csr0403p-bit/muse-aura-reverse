package com.facebook.aura.pairs;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass037;
import X.BFM;
import X.G0W;
import com.facebook.aura.R;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ComposableSingletons$SpaceCollaboratorPickerScreenKt$lambda$892148103$1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public static final ComposableSingletons$SpaceCollaboratorPickerScreenKt$lambda$892148103$1 INSTANCE = new ComposableSingletons$SpaceCollaboratorPickerScreenKt$lambda$892148103$1();

    public ComposableSingletons$SpaceCollaboratorPickerScreenKt$lambda$892148103$1() {
        super(3);
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            SpaceCollaboratorPickerScreenKt.SpacePickerNote(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fc7), null, bfm, 0, 2);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
        invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
