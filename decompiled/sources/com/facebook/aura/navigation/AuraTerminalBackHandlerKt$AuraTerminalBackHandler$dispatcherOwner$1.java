package com.facebook.aura.navigation;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AuraTerminalBackHandlerKt$AuraTerminalBackHandler$dispatcherOwner$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ Function0<Unit> $onBack;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraTerminalBackHandlerKt$AuraTerminalBackHandler$dispatcherOwner$1(boolean z, Function0<Unit> function0, int i, int i2) {
        super(2);
        this.$enabled = z;
        this.$onBack = function0;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraTerminalBackHandlerKt.AuraTerminalBackHandler(this.$enabled, this.$onBack, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
