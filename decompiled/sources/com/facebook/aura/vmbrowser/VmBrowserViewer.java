package com.facebook.aura.vmbrowser;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BLG;
import X.BRg;
import X.C06H;
import X.C1BN;
import X.C27a;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C8eO;
import X.C9286GCn;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC7549F2g;
import com.facebook.aura.browsertask.view.AgentComputerScreenKt;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.AgentComputerScreenKey;
import com.facebook.aura.navigation.key.AgentComputerTakeOverScreenKey;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vmbrowser.runtime.AgentBrowserSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VmBrowserViewer implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final BLG<VmBrowserViewerState> _state;
    public final C27a job;
    public final C3UX scope;
    public final C1BN<VmBrowserViewerState> state;
    public VmAgentComputerSurface surface;
    public final AbstractC3358CGz userSession;

    public final class Companion {
        public final VmBrowserViewer getInstance(final AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (VmBrowserViewer) abstractC3358CGz.A03(VmBrowserViewer.class, new Function0() { // from class: com.facebook.aura.vmbrowser.VmBrowserViewer$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new VmBrowserViewer(abstractC3358CGz);
                }
            });
        }

        public static final VmBrowserViewer getInstance$lambda$0(AbstractC3358CGz abstractC3358CGz) {
            return new VmBrowserViewer(abstractC3358CGz);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final boolean Screen$lambda$2$0$0(AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 0);
        return (auraNavKey instanceof AgentComputerScreenKey) || (auraNavKey instanceof AgentComputerTakeOverScreenKey);
    }

    private final VmAgentComputerSurface getSurface() {
        VmAgentComputerSurface vmAgentComputerSurface;
        synchronized (this) {
            vmAgentComputerSurface = null;
            if (this.job.isActive()) {
                VmAgentComputerSurface vmAgentComputerSurface2 = this.surface;
                if (vmAgentComputerSurface2 == null) {
                    AgentBrowserSurface companion = AgentBrowserSurface.Companion.getInstance(this.userSession);
                    AnonymousClass001.A1I(AuraDispatchers.mainImmediate, new VmBrowserViewer$getSurface$1$1$1(companion, this, null), this.scope);
                    vmAgentComputerSurface = new VmAgentComputerSurface(companion, this.scope);
                    this.surface = vmAgentComputerSurface;
                } else {
                    vmAgentComputerSurface = vmAgentComputerSurface2;
                }
            }
        }
        return vmAgentComputerSurface;
    }

    public final void Screen(final boolean z, final G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, final BRg bRg, BFM bfm, final int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> g0v;
        C7384Etj.A0Y(bRg, 2);
        bfm.AgG(-47201814);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, g0w);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRg);
        }
        if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0W(bfm, this);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0n), bfm, iA0n)) {
            boolean zA65 = bfm.A65(this);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = getSurface();
                bfm.Ai0(objAaT);
            }
            final VmAgentComputerSurface vmAgentComputerSurface = (VmAgentComputerSurface) objAaT;
            if (vmAgentComputerSurface == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    g0v = new G0V() { // from class: com.facebook.aura.vmbrowser.VmBrowserViewer$$ExternalSyntheticLambda0
                        @Override // X.G0V
                        public final Object invoke(Object obj, Object obj2) {
                            this.f$0.Screen(z, g0w, bRg, (BFM) obj, AnonymousClass011.A02(obj2, i));
                            return Unit.INSTANCE;
                        }
                    };
                    bBbAAc.A06 = g0v;
                }
                return;
            }
            final AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            boolean zA1M = AnonymousClass003.A1M(bfm, vmAgentComputerSurface, auraNavigatorA0b);
            Object objAaT2 = bfm.AaT();
            if (zA1M || objAaT2 == C78N.A00) {
                objAaT2 = new Function0() { // from class: com.facebook.aura.vmbrowser.VmBrowserViewer$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return VmBrowserViewer.Screen$lambda$2$0(vmAgentComputerSurface, auraNavigatorA0b);
                    }
                };
                bfm.Ai0(objAaT2);
            }
            AgentComputerScreenKt.AgentComputerScreen(vmAgentComputerSurface, z, (Function0) objAaT2, g0w, bRg, bfm, AnonymousClass003.A07(iA0n << 6, VmAgentComputerSurface.$stable | ((iA0n << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX)), 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            g0v = new G0V() { // from class: com.facebook.aura.vmbrowser.VmBrowserViewer$$ExternalSyntheticLambda2
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    this.f$0.Screen(z, g0w, bRg, (BFM) obj, AnonymousClass011.A02(obj2, i));
                    return Unit.INSTANCE;
                }
            };
            bBbAAc.A06 = g0v;
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        synchronized (this) {
            this.job.A5w(null);
            this.surface = null;
            AnonymousClass001.A1E(this._state, null, new VmBrowserViewerState(null, false));
        }
    }

    public final AuraNavKey focusedTaskScreenKey(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        if (C7BY.A0j(str) || !this.job.isActive()) {
            return null;
        }
        return z ? AgentComputerTakeOverScreenKey.INSTANCE : AgentComputerScreenKey.INSTANCE;
    }

    public final C1BN<VmBrowserViewerState> getState() {
        return this.state;
    }

    public VmBrowserViewer(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        C8eO c8eO = new C8eO(null);
        this.job = c8eO;
        this.scope = C3cH.A0y(C3cG.A0v(), c8eO);
        C9286GCn c9286GCnA14 = C3cG.A14(new VmBrowserViewerState(null, false));
        this._state = c9286GCnA14;
        this.state = C3cG.A11(c9286GCnA14);
    }

    public static final Unit Screen$lambda$1(VmBrowserViewer vmBrowserViewer, boolean z, G0W g0w, BRg bRg, int i, BFM bfm, int i2) {
        vmBrowserViewer.Screen(z, g0w, bRg, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final Unit Screen$lambda$2$0(VmAgentComputerSurface vmAgentComputerSurface, AuraNavigator auraNavigator) {
        vmAgentComputerSurface.closeViewer();
        auraNavigator.popAll(new G0U() { // from class: com.facebook.aura.vmbrowser.VmBrowserViewer$$ExternalSyntheticLambda3
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return Boolean.valueOf(VmBrowserViewer.Screen$lambda$2$0$0((AuraNavKey) obj));
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit Screen$lambda$3(VmBrowserViewer vmBrowserViewer, boolean z, G0W g0w, BRg bRg, int i, BFM bfm, int i2) {
        vmBrowserViewer.Screen(z, g0w, bRg, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public /* synthetic */ VmBrowserViewer(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
