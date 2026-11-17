package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.G0V;
import com.facebook.aura.pairs.SpaceCollaboratorsUiState;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SpaceCollaboratorsSheetKt$SpaceCollaboratorsList$1$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ SpaceCollaboratorsUiState.Loaded $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceCollaboratorsSheetKt$SpaceCollaboratorsList$1$3(SpaceCollaboratorsUiState.Loaded loaded) {
        super(2);
        this.$state = loaded;
    }

    public final void invoke(BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            bfm.Afo();
        } else {
            SpaceViewerProfileJson spaceViewerProfileJson = this.$state.owner;
            PairsComponentsKt.m1661PairsAvataruFdPcIQ(spaceViewerProfileJson != null ? spaceViewerProfileJson.profile_picture_url : null, 44.0f, null, bfm, 48, 4);
        }
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
