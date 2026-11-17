package com.facebook.aura.navigation;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ModalFlowScene$content$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ ModalFlowScene<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalFlowScene$content$1(ModalFlowScene<T> modalFlowScene) {
        super(2);
        this.this$0 = modalFlowScene;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            ModalFlowSceneState sceneState = this.this$0.getSceneState();
            if (!sceneState.isHiddenByOverlay) {
                bfm.AgE(-1067328208);
                this.this$0.ModalFlowDialog(sceneState.flowEntries, bfm, 0);
            } else {
                bfm.AgE(-1067282080);
            }
            AnonymousClass001.A1D(bfm);
            return;
        }
        bfm.Afo();
    }
}
