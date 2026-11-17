package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* renamed from: com.facebook.aura.pairs.ComposableSingletons$SpaceCollaboratorsSheetKt$lambda$-965724866$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$SpaceCollaboratorsSheetKt$lambda$965724866$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$SpaceCollaboratorsSheetKt$lambda$965724866$1 INSTANCE = new ComposableSingletons$SpaceCollaboratorsSheetKt$lambda$965724866$1();

    public ComposableSingletons$SpaceCollaboratorsSheetKt$lambda$965724866$1() {
        super(2);
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            return;
        }
        bfm.Afo();
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
