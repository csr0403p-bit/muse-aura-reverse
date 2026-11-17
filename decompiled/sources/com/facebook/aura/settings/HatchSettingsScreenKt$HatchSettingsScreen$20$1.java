package com.facebook.aura.settings;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1C3;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.settings.HatchSettingsScreenKt$HatchSettingsScreen$20$1", f = "HatchSettingsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchSettingsScreenKt$HatchSettingsScreen$20$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1C3 $keyboardController;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSettingsScreenKt$HatchSettingsScreen$20$1(C1C3 c1c3, HtJ<? super HatchSettingsScreenKt$HatchSettingsScreen$20$1> htJ) {
        super(2, htJ);
        this.$keyboardController = c1c3;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchSettingsScreenKt$HatchSettingsScreen$20$1(this.$keyboardController, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        C1C3 c1c3 = this.$keyboardController;
        if (c1c3 != null) {
            c1c3.hide();
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new HatchSettingsScreenKt$HatchSettingsScreen$20$1(this.$keyboardController, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
