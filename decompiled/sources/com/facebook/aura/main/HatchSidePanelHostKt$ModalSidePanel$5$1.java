package com.facebook.aura.main;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C0Hi;
import X.C1C3;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.navigation.HatchSidePanelController;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.main.HatchSidePanelHostKt$ModalSidePanel$5$1", f = "HatchSidePanelHost.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchSidePanelHostKt$ModalSidePanel$5$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ C1C3 $keyboardController;
    public final /* synthetic */ HatchSidePanelController $sidePanelController;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSidePanelHostKt$ModalSidePanel$5$1(HatchSidePanelController hatchSidePanelController, C0Hi c0Hi, C1C3 c1c3, HtJ<? super HatchSidePanelHostKt$ModalSidePanel$5$1> htJ) {
        super(2, htJ);
        this.$sidePanelController = hatchSidePanelController;
        this.$focusManager = c0Hi;
        this.$keyboardController = c1c3;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchSidePanelHostKt$ModalSidePanel$5$1(this.$sidePanelController, this.$focusManager, this.$keyboardController, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (this.$sidePanelController.getOpenDragContentKey() != null) {
            this.$focusManager.A6G(false);
            C1C3 c1c3 = this.$keyboardController;
            if (c1c3 != null) {
                c1c3.hide();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchSidePanelHostKt$ModalSidePanel$5$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
