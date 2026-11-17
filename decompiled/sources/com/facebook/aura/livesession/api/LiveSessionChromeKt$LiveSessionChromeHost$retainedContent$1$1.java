package com.facebook.aura.livesession.api;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.C1BO;
import X.G0W;
import X.InterfaceC05151eP;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class LiveSessionChromeKt$LiveSessionChromeHost$retainedContent$1$1 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
    public final /* synthetic */ C1BO<G0W<InterfaceC05151eP, BFM, Integer, Unit>> $currentContent$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LiveSessionChromeKt$LiveSessionChromeHost$retainedContent$1$1(C1BO<? extends G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit>> c1bo) {
        super(3);
        this.$currentContent$delegate = c1bo;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
        invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
        if (AnonymousClass002.A0B(interfaceC05151eP, i) == 0) {
            i |= AnonymousClass004.A0d(bfm, interfaceC05151eP);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
            AnonymousClass001.A1G(interfaceC05151eP, bfm, this.$currentContent$delegate.getValue(), i & 14);
        } else {
            bfm.Afo();
        }
    }
}
