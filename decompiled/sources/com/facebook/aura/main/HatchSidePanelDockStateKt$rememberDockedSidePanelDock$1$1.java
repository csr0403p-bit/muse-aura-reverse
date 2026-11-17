package com.facebook.aura.main;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.main.HatchSidePanelDockStateKt$rememberDockedSidePanelDock$1$1", f = "HatchSidePanelDockState.kt", l = {87}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchSidePanelDockStateKt$rememberDockedSidePanelDock$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ DockContentFade $contentFade;
    public final /* synthetic */ float $targetWidth;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSidePanelDockStateKt$rememberDockedSidePanelDock$1$1(DockContentFade dockContentFade, float f, HtJ<? super HatchSidePanelDockStateKt$rememberDockedSidePanelDock$1$1> htJ) {
        super(2, htJ);
        this.$contentFade = dockContentFade;
        this.$targetWidth = f;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchSidePanelDockStateKt$rememberDockedSidePanelDock$1$1(this.$contentFade, this.$targetWidth, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            DockContentFade dockContentFade = this.$contentFade;
            float f = this.$targetWidth;
            this.label = 1;
            if (dockContentFade.m1333fadeThroughD5KLDUw(f, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchSidePanelDockStateKt$rememberDockedSidePanelDock$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
