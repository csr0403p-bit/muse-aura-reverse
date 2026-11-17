package com.facebook.aura.maps;

import X.AbstractC1798ArH;
import X.AbstractC3358CGz;
import X.C06H;
import X.C7384Etj;
import X.InterfaceC7549F2g;
import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class HatchMapPresentationState implements InterfaceC7549F2g {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final MutableState fullscreenPresentationId$delegate;

    public final void beginFullscreenPresentation(String str) {
        C7384Etj.A0Y(str, 0);
        setFullscreenPresentationId(str);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        setFullscreenPresentationId(null);
    }

    public final void endFullscreenPresentation(String str) {
        C7384Etj.A0Y(str, 0);
        if (str.equals(MutableState.A05(this.fullscreenPresentationId$delegate))) {
            setFullscreenPresentationId(null);
        }
    }

    public final boolean isFullscreenPresented(String str) {
        C7384Etj.A0Y(str, 0);
        return str.equals(MutableState.A05(this.fullscreenPresentationId$delegate));
    }

    private final String getFullscreenPresentationId() {
        return MutableState.A05(this.fullscreenPresentationId$delegate);
    }

    private final void setFullscreenPresentationId(String str) {
        this.fullscreenPresentationId$delegate.Af8(str);
    }

    public final class Companion {
        public final HatchMapPresentationState getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchMapPresentationState) abstractC3358CGz.A03(HatchMapPresentationState.class, HatchMapPresentationState$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ HatchMapPresentationState(C06H c06h) {
        this();
    }

    public HatchMapPresentationState() {
        this.fullscreenPresentationId$delegate = AbstractC1798ArH.A03();
    }
}
