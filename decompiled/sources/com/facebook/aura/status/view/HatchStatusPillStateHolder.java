package com.facebook.aura.status.view;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3Pi;
import X.C7384Etj;
import X.C9286GCn;
import X.HwN;
import X.InterfaceC7549F2g;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;

/* loaded from: classes.dex */
public final class HatchStatusPillStateHolder implements InterfaceC7549F2g {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final BLG<Boolean> _hidden;
    public final BLG<String> _revealedSessionId;
    public final C1BN<Boolean> hidden;
    public final MutableState modeOverride$delegate;
    public final C1BN<String> revealedSessionId;

    public final void setModeOverride(AuraThemeMode auraThemeMode) {
        C7384Etj.A0Y(auraThemeMode, 0);
        this.modeOverride$delegate.Af8(auraThemeMode);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        C9286GCn.A00(null, AnonymousClass001.A0h(), (C9286GCn) this._hidden);
        setModeOverride(AuraThemeMode.DEFAULT);
        this._revealedSessionId.Af8(null);
    }

    public final C1BN<Boolean> getHidden() {
        return this.hidden;
    }

    public final AuraThemeMode getModeOverride() {
        return (AuraThemeMode) this.modeOverride$delegate.getValue();
    }

    public final C1BN<String> getRevealedSessionId() {
        return this.revealedSessionId;
    }

    public final void setHidden(boolean z) {
        AnonymousClass004.A1D(z, this._hidden);
    }

    public final void setRevealed(String str) {
        this._revealedSessionId.Af8(str);
    }

    public final class Companion {
        public final HatchStatusPillStateHolder getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchStatusPillStateHolder) abstractC3358CGz.A03(HatchStatusPillStateHolder.class, HatchStatusPillStateHolder$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ HatchStatusPillStateHolder(C06H c06h) {
        this();
    }

    public HatchStatusPillStateHolder() {
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(false);
        this._hidden = c9286GCnA0v;
        this.hidden = new C3Pi(null, c9286GCnA0v);
        this.modeOverride$delegate = AnonymousClass002.A0P(AuraThemeMode.DEFAULT);
        C9286GCn c9286GCn = new C9286GCn(HwN.A01);
        this._revealedSessionId = c9286GCn;
        this.revealedSessionId = new C3Pi(null, c9286GCn);
    }
}
