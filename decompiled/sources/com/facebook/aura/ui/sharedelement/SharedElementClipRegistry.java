package com.facebook.aura.ui.sharedelement;

import X.APS;
import X.ATD;
import X.AXN;
import X.AaC;
import X.AbstractC1555AlK;
import X.AnonymousClass005;
import X.C0981AMm;
import X.C1BO;
import X.C1DM;
import X.C7384Etj;
import X.C8j3;
import X.EnumC1820Arj;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class SharedElementClipRegistry {
    public long nextRegistrationOrder;
    public final C0981AMm<String, SnapshotStateList<SharedElementClipParticipant>> participants = new C0981AMm<>();

    public final HatchSharedElementTransform activeTransformFor(String str) {
        C7384Etj.A0Y(str, 0);
        SnapshotStateList<SharedElementClipParticipant> snapshotStateList = this.participants.get(str);
        if (snapshotStateList != null) {
            Iterator it = snapshotStateList.iterator();
            while (it.hasNext()) {
                HatchSharedElementTransform transform = ((SharedElementClipParticipant) it.next()).getTransform();
                if (transform != null && transform.isActive()) {
                    return transform;
                }
            }
        }
        return null;
    }

    public final void register(SharedElementClipParticipant sharedElementClipParticipant) {
        C7384Etj.A0Y(sharedElementClipParticipant, 0);
        long j = this.nextRegistrationOrder;
        this.nextRegistrationOrder = 1 + j;
        sharedElementClipParticipant.registrationOrder = j;
        C0981AMm<String, SnapshotStateList<SharedElementClipParticipant>> c0981AMm = this.participants;
        String str = sharedElementClipParticipant.key;
        SnapshotStateList<SharedElementClipParticipant> snapshotStateList = c0981AMm.get(str);
        if (snapshotStateList == null) {
            snapshotStateList = new SnapshotStateList();
            c0981AMm.put(str, snapshotStateList);
        }
        snapshotStateList.add(sharedElementClipParticipant);
    }

    public final void reportPlacedDestinationForInteractiveTransform(SharedElementClipParticipant sharedElementClipParticipant) {
        HatchSharedElementTransform transform;
        C7384Etj.A0Y(sharedElementClipParticipant, 0);
        SharedElementClipParticipant sharedElementClipParticipantActiveTransformOwnerFor = activeTransformOwnerFor(sharedElementClipParticipant);
        if (sharedElementClipParticipantActiveTransformOwnerFor == null || sharedElementClipParticipantActiveTransformOwnerFor == sharedElementClipParticipant || !sharedElementClipParticipant.isTargetVisible() || !sharedElementClipParticipant.isMatchFound() || sharedElementClipParticipantActiveTransformOwnerFor.endpointSize == 0 || sharedElementClipParticipant.endpointSize == 0 || (transform = sharedElementClipParticipantActiveTransformOwnerFor.getTransform()) == null) {
            return;
        }
        transform.onSharedElementDestinationReady();
    }

    public final float scaleFor(SharedElementClipParticipant sharedElementClipParticipant) {
        SharedElementClipParticipant sharedElementClipParticipantCounterpartFor;
        C7384Etj.A0Y(sharedElementClipParticipant, 0);
        HatchSharedElementTransform transform = sharedElementClipParticipant.getTransform();
        if (transform == null || !transform.isActive() || (sharedElementClipParticipantCounterpartFor = counterpartFor(sharedElementClipParticipant)) == null) {
            return 1.0f;
        }
        long j = sharedElementClipParticipant.endpointSize;
        int iMin = Math.min((int) (j >> 32), (int) (j & 4294967295L));
        long j2 = sharedElementClipParticipantCounterpartFor.endpointSize;
        int iMin2 = Math.min((int) (j2 >> 32), (int) (j2 & 4294967295L));
        if (iMin <= 0 || iMin2 <= 0) {
            return 1.0f;
        }
        float fTransitionProgressFor = transitionProgressFor(sharedElementClipParticipant);
        float f = (iMin2 / iMin) - 1.0f;
        float fA02 = (C8j3.A02(1.0f, ATD.A03(transform.getDestinationProgress(), 0.0f, 1.0f), fTransitionProgressFor) * f) + 1.0f;
        float f2 = (f * fTransitionProgressFor) + 1.0f;
        if (f2 > 0.0f) {
            return fA02 / f2;
        }
        return 1.0f;
    }

    public final boolean shouldSuppressForInteractiveTransform(SharedElementClipParticipant sharedElementClipParticipant) {
        C7384Etj.A0Y(sharedElementClipParticipant, 0);
        SharedElementClipParticipant sharedElementClipParticipantActiveTransformOwnerFor = activeTransformOwnerFor(sharedElementClipParticipant);
        return (sharedElementClipParticipantActiveTransformOwnerFor == null || !sharedElementClipParticipant.isMatchFound() || sharedElementClipParticipantActiveTransformOwnerFor == sharedElementClipParticipant) ? false : true;
    }

    public final HatchSharedElementTransform transformFor(SharedElementClipParticipant sharedElementClipParticipant) {
        HatchSharedElementTransform transform;
        C7384Etj.A0Y(sharedElementClipParticipant, 0);
        SharedElementClipParticipant sharedElementClipParticipantActiveTransformOwnerFor = activeTransformOwnerFor(sharedElementClipParticipant);
        if (sharedElementClipParticipantActiveTransformOwnerFor != null && (transform = sharedElementClipParticipantActiveTransformOwnerFor.getTransform()) != null) {
            return transform;
        }
        HatchSharedElementTransform transform2 = sharedElementClipParticipant.getTransform();
        if (transform2 != null) {
            return transform2;
        }
        SharedElementClipParticipant sharedElementClipParticipantCounterpartFor = counterpartFor(sharedElementClipParticipant);
        if (sharedElementClipParticipantCounterpartFor != null) {
            return sharedElementClipParticipantCounterpartFor.getTransform();
        }
        return null;
    }

    public final float transitionProgressFor(SharedElementClipParticipant sharedElementClipParticipant) {
        SharedElementClipParticipant sharedElementClipParticipantCounterpartFor;
        float fA01;
        C7384Etj.A0Y(sharedElementClipParticipant, 0);
        if (!sharedElementClipParticipant.isMatchFound() || (sharedElementClipParticipantCounterpartFor = counterpartFor(sharedElementClipParticipant)) == null) {
            return 0.0f;
        }
        HatchSharedElementTransform hatchSharedElementTransformActiveTransformFor = activeTransformFor(sharedElementClipParticipant.key);
        if (hatchSharedElementTransformActiveTransformFor != null) {
            fA01 = hatchSharedElementTransformActiveTransformFor.getInteractiveTransitionProgress();
        } else {
            if (!sharedElementClipParticipant.isTargetVisible()) {
                sharedElementClipParticipant = sharedElementClipParticipantCounterpartFor;
            }
            fA01 = C1BO.A01(sharedElementClipParticipant.progressState);
        }
        return ATD.A03(fA01, 0.0f, 1.0f);
    }

    public final void unregister(SharedElementClipParticipant sharedElementClipParticipant) {
        C7384Etj.A0Y(sharedElementClipParticipant, 0);
        SnapshotStateList<SharedElementClipParticipant> snapshotStateList = this.participants.get(sharedElementClipParticipant.key);
        if (snapshotStateList != null) {
            snapshotStateList.remove(sharedElementClipParticipant);
            if (snapshotStateList.isEmpty()) {
                this.participants.remove(sharedElementClipParticipant.key);
            }
        }
    }

    private final SharedElementClipParticipant counterpartFor(SharedElementClipParticipant sharedElementClipParticipant) {
        SnapshotStateList<SharedElementClipParticipant> snapshotStateList = this.participants.get(sharedElementClipParticipant.key);
        SharedElementClipParticipant sharedElementClipParticipant2 = null;
        if (snapshotStateList != null) {
            Iterator it = snapshotStateList.iterator();
            long j = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
            while (it.hasNext()) {
                SharedElementClipParticipant sharedElementClipParticipant3 = (SharedElementClipParticipant) it.next();
                if (sharedElementClipParticipant3 != sharedElementClipParticipant && sharedElementClipParticipant3.isMatchFound() && sharedElementClipParticipant3.isTargetVisible() != sharedElementClipParticipant.isTargetVisible()) {
                    long j2 = sharedElementClipParticipant3.registrationOrder;
                    long jAbs = Math.abs(j2 - sharedElementClipParticipant.registrationOrder);
                    if (jAbs >= j) {
                        if (jAbs == j) {
                            if (j2 > (sharedElementClipParticipant2 != null ? sharedElementClipParticipant2.registrationOrder : Long.MIN_VALUE)) {
                            }
                        }
                    }
                    sharedElementClipParticipant2 = sharedElementClipParticipant3;
                    j = jAbs;
                }
            }
        }
        return sharedElementClipParticipant2;
    }

    private final SharedElementClipParticipant activeTransformOwnerFor(SharedElementClipParticipant sharedElementClipParticipant) {
        HatchSharedElementTransform transform;
        HatchSharedElementTransform transform2 = sharedElementClipParticipant.getTransform();
        if (transform2 != null && transform2.isActive()) {
            return sharedElementClipParticipant;
        }
        SharedElementClipParticipant sharedElementClipParticipantCounterpartFor = counterpartFor(sharedElementClipParticipant);
        if (sharedElementClipParticipantCounterpartFor == null || (transform = sharedElementClipParticipantCounterpartFor.getTransform()) == null || !transform.isActive()) {
            return null;
        }
        return sharedElementClipParticipantCounterpartFor;
    }

    public final AbstractC1555AlK outlineFor(SharedElementClipParticipant sharedElementClipParticipant, AaC aaC, EnumC1820Arj enumC1820Arj, AXN axn) {
        C1DM shape;
        SharedElementClipParticipant sharedElementClipParticipantCounterpartFor;
        Object objAPb;
        C1DM c1dm;
        AnonymousClass005.A14(sharedElementClipParticipant, aaC, enumC1820Arj, axn);
        if (!sharedElementClipParticipant.isMatchFound() || (sharedElementClipParticipantCounterpartFor = counterpartFor(sharedElementClipParticipant)) == null) {
            shape = sharedElementClipParticipant.getShape();
        } else {
            SharedElementClipParticipant sharedElementClipParticipant2 = sharedElementClipParticipantCounterpartFor;
            if (sharedElementClipParticipant.isTargetVisible()) {
                sharedElementClipParticipant2 = sharedElementClipParticipant;
            }
            if (sharedElementClipParticipant2 != sharedElementClipParticipant) {
                sharedElementClipParticipantCounterpartFor = sharedElementClipParticipant;
            }
            float fTransitionProgressFor = transitionProgressFor(sharedElementClipParticipant);
            HatchSharedElementTransform hatchSharedElementTransformTransformFor = transformFor(sharedElementClipParticipant);
            float fA02 = C8j3.A02(1.0f, hatchSharedElementTransformTransformFor != null ? ATD.A03(hatchSharedElementTransformTransformFor.getDestinationProgress(), 0.0f, 1.0f) : 0.0f, fTransitionProgressFor);
            shape = sharedElementClipParticipantCounterpartFor.getShape();
            C1DM shape2 = sharedElementClipParticipant2.getShape();
            if (C7384Etj.areEqual(shape, shape2) || ((!(shape instanceof APS) || (objAPb = ((APS) shape).APb(shape2, fA02)) == null) && (!(shape2 instanceof APS) || (objAPb = ((APS) shape2).APb(shape, 1.0f - fA02)) == null))) {
                objAPb = shape2;
                if (fA02 < 0.5f) {
                    objAPb = shape;
                }
            }
            if ((objAPb instanceof C1DM) && (c1dm = (C1DM) objAPb) != null) {
                shape = c1dm;
            } else if (fA02 >= 0.5f) {
                shape = shape2;
            }
        }
        return shape.mo2createOutlinePq9zytI(aaC.A01(), enumC1820Arj, axn);
    }
}
