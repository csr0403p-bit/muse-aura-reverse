package com.facebook.aura.confidentialvm;

import X.AbstractC3358CGz;
import X.AbstractC5321DgF;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass007;
import X.BLG;
import X.BzK;
import X.C06H;
import X.C1BN;
import X.C3Pi;
import X.C3cG;
import X.C4oT;
import X.C7384Etj;
import X.C9286GCn;
import X.CFK;
import X.F0C;
import X.HnJ;
import X.InterfaceC7549F2g;
import com.facebook.aura.gateway.HatchlingVmType;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class ConfidentialVmSetupGate implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final BLG<Boolean> _isSetupRequired;
    public final BLG<HatchlingVmType> _selectedVmType;
    public final HatchlingVmType initialSelectedVmType;
    public final C1BN<Boolean> isSetupRequired;
    public final F0C prefs$delegate;
    public final AbstractC3358CGz userSession;

    public ConfidentialVmSetupGate(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        this.prefs$delegate = AbstractC5321DgF.A03(new ConfidentialVmSetupGate$prefs$2(this));
        HatchlingVmType hatchlingVmTypeLoadInitialSelectedVmType = loadInitialSelectedVmType();
        this.initialSelectedVmType = hatchlingVmTypeLoadInitialSelectedVmType;
        this._selectedVmType = HnJ.A01(hatchlingVmTypeLoadInitialSelectedVmType);
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(AnonymousClass002.A1Y(hatchlingVmTypeLoadInitialSelectedVmType));
        this._isSetupRequired = c9286GCnA0v;
        this.isSetupRequired = C3Pi.A00(c9286GCnA0v);
    }

    public final boolean markSelected(HatchlingVmType hatchlingVmType) {
        C7384Etj.A0Y(hatchlingVmType, 0);
        return setSelectedVmType(hatchlingVmType, true);
    }

    public final boolean resetSelection() {
        return setSelectedVmType(null, true);
    }

    private final C4oT getPrefs() {
        return (C4oT) this.prefs$delegate.getValue();
    }

    private final HatchlingVmType loadInitialSelectedVmType() {
        HatchlingVmType next;
        try {
            String string = getPrefs().getString(ConfidentialVmSetupGateKt.PREF_SELECTED_VM_TYPE, null);
            if (string != null) {
                Iterator<HatchlingVmType> it = HatchlingVmType.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (next.name().equalsIgnoreCase(string)) {
                        break;
                    }
                }
                HatchlingVmType hatchlingVmType = next;
                if (hatchlingVmType != null) {
                    return hatchlingVmType;
                }
                C3cG.A1G("Unknown persisted VM type: ", string, ConfidentialVmSetupGateKt.TAG);
            }
            if (getPrefs().getBoolean(ConfidentialVmSetupGateKt.PREF_CVM_ESCROW_COMMITTED, false)) {
                return HatchlingVmType.HATCH_CVM;
            }
            return null;
        } catch (Exception e) {
            CFK.A0A(ConfidentialVmSetupGateKt.TAG, "Failed to read confidential VM setup selection", e);
            return null;
        }
    }

    private final boolean setSelectedVmType(HatchlingVmType hatchlingVmType, boolean z) {
        try {
            BzK bzKA9q = getPrefs().A9q();
            if (hatchlingVmType == null) {
                bzKA9q.Aae(ConfidentialVmSetupGateKt.PREF_SELECTED_VM_TYPE);
            } else {
                bzKA9q.AYr(ConfidentialVmSetupGateKt.PREF_SELECTED_VM_TYPE, hatchlingVmType.name());
            }
            if (z) {
                bzKA9q.Aae(ConfidentialVmSetupGateKt.PREF_CVM_ESCROW_COMMITTED);
            }
            if (bzKA9q.commit()) {
                this._selectedVmType.Af8(hatchlingVmType);
                AnonymousClass004.A1D(hatchlingVmType == null, this._isSetupRequired);
                return true;
            }
        } catch (Exception e) {
            CFK.A0A(ConfidentialVmSetupGateKt.TAG, AnonymousClass007.A0a("Failed to persist confidential VM setup selection=", hatchlingVmType), e);
        }
        CFK.A06(ConfidentialVmSetupGateKt.TAG, AnonymousClass007.A0a("Confidential VM setup selection was not persisted: ", hatchlingVmType));
        return false;
    }

    public static /* synthetic */ boolean setSelectedVmType$default(ConfidentialVmSetupGate confidentialVmSetupGate, HatchlingVmType hatchlingVmType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = AnonymousClass002.A1X(hatchlingVmType);
        }
        return confidentialVmSetupGate.setSelectedVmType(hatchlingVmType, z);
    }

    public final boolean commitCvmSelectionAfterEscrow() {
        try {
            BzK bzKA9q = getPrefs().A9q();
            bzKA9q.A0A(ConfidentialVmSetupGateKt.PREF_CVM_ESCROW_COMMITTED, true);
            if (bzKA9q.commit()) {
                BLG<HatchlingVmType> blg = this._selectedVmType;
                HatchlingVmType hatchlingVmType = HatchlingVmType.HATCH_CVM;
                C3cG.A0V(blg, hatchlingVmType);
                AnonymousClass003.A14(this._isSetupRequired, false);
                if (!setSelectedVmType(hatchlingVmType, true)) {
                    CFK.A06(ConfidentialVmSetupGateKt.TAG, "Committed CVM escrow retained because canonical type write failed");
                }
                return true;
            }
        } catch (Exception e) {
            CFK.A0A(ConfidentialVmSetupGateKt.TAG, "Failed to persist committed CVM escrow", e);
        }
        return false;
    }

    public final HatchlingVmType getSelectedVmType() {
        return this._selectedVmType.getValue();
    }

    public final C1BN<Boolean> isSetupRequired() {
        return this.isSetupRequired;
    }

    public final class Companion {
        public final ConfidentialVmSetupGate getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (ConfidentialVmSetupGate) abstractC3358CGz.A03(ConfidentialVmSetupGate.class, new ConfidentialVmSetupGate$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        resetSelection();
    }
}
