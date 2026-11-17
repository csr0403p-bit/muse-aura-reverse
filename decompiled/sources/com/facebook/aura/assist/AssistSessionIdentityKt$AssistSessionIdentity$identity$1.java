package com.facebook.aura.assist;

import X.AaC;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AssistSessionIdentityKt$AssistSessionIdentity$identity$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<AaC, Unit> $onBoundsChanged;
    public final /* synthetic */ Function0<Unit> $onRestore;
    public final /* synthetic */ AssistIdentityState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AssistSessionIdentityKt$AssistSessionIdentity$identity$1(AssistIdentityState assistIdentityState, Function0<Unit> function0, G0U<? super AaC, Unit> g0u, BRg bRg, int i, int i2) {
        super(2);
        this.$state = assistIdentityState;
        this.$onRestore = function0;
        this.$onBoundsChanged = g0u;
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
        AssistSessionIdentityKt.AssistSessionIdentity(this.$state, this.$onRestore, this.$onBoundsChanged, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
