package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import X.InterfaceC05151eP;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AssistSessionIdentityKt$AssistSessionIdentityPill$identity$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onRestore;
    public final /* synthetic */ AssistIdentityState $state;
    public final /* synthetic */ InterfaceC05151eP $this_AssistSessionIdentityPill;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistSessionIdentityKt$AssistSessionIdentityPill$identity$1(InterfaceC05151eP interfaceC05151eP, AssistIdentityState assistIdentityState, Function0<Unit> function0, BRg bRg, int i, int i2) {
        super(2);
        this.$this_AssistSessionIdentityPill = interfaceC05151eP;
        this.$state = assistIdentityState;
        this.$onRestore = function0;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AssistSessionIdentityKt.AssistSessionIdentityPill(this.$this_AssistSessionIdentityPill, this.$state, this.$onRestore, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
