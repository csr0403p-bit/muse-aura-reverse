package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C00r;
import X.C1BO;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryHostKt$HatchAgeLinkingLauncher$2$1", f = "HatchCcvCardEntryHost.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchCcvCardEntryHostKt$HatchAgeLinkingLauncher$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C00r $consumedOptionsVersion$delegate;
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnOptionsChanged$delegate;
    public final /* synthetic */ int $optionsVersion;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchCcvCardEntryHostKt$HatchAgeLinkingLauncher$2$1(int i, C00r c00r, C1BO<? extends Function0<Unit>> c1bo, HtJ<? super HatchCcvCardEntryHostKt$HatchAgeLinkingLauncher$2$1> htJ) {
        super(2, htJ);
        this.$optionsVersion = i;
        this.$consumedOptionsVersion$delegate = c00r;
        this.$currentOnOptionsChanged$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchCcvCardEntryHostKt$HatchAgeLinkingLauncher$2$1(this.$optionsVersion, this.$consumedOptionsVersion$delegate, this.$currentOnOptionsChanged$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (this.$optionsVersion != this.$consumedOptionsVersion$delegate.AGd()) {
            this.$consumedOptionsVersion$delegate.AdX(this.$optionsVersion);
            C1BO.A0D(this.$currentOnOptionsChanged$delegate);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchCcvCardEntryHostKt$HatchAgeLinkingLauncher$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
