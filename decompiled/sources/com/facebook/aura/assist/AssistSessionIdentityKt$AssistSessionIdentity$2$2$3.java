package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.G0W;
import X.InterfaceC05151eP;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AssistSessionIdentityKt$AssistSessionIdentity$2$2$3 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
    public final /* synthetic */ Function0<Unit> $onRestore;
    public final /* synthetic */ AssistIdentityState $state;

    public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
        if (AnonymousClass002.A0B(interfaceC05151eP, i) == 0) {
            i |= AnonymousClass004.A0d(bfm, interfaceC05151eP);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
            AssistSessionIdentityKt.AssistSessionIdentityPill(interfaceC05151eP, this.$state, this.$onRestore, null, bfm, (i & 14) | (AssistIdentityState.$stable << 3), 4);
        } else {
            bfm.Afo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistSessionIdentityKt$AssistSessionIdentity$2$2$3(AssistIdentityState assistIdentityState, Function0<Unit> function0) {
        super(3);
        this.$state = assistIdentityState;
        this.$onRestore = function0;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
        invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
