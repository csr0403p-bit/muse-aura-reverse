package com.facebook.aura.login.nativeflow;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class NativeLoginSiblingDisclosure extends C06G {
    public static final int $stable = 8;
    public final HatchLandingPresentation landingPresentation;
    public final boolean serverSuppressesClause;
    public final HatchTosDisclosure tos;

    public NativeLoginSiblingDisclosure(HatchTosDisclosure hatchTosDisclosure, boolean z, HatchLandingPresentation hatchLandingPresentation) {
        C7384Etj.A0Y(hatchLandingPresentation, 2);
        this.tos = hatchTosDisclosure;
        this.serverSuppressesClause = z;
        this.landingPresentation = hatchLandingPresentation;
    }

    public final NativeLoginSiblingDisclosure copy(HatchTosDisclosure hatchTosDisclosure, boolean z, HatchLandingPresentation hatchLandingPresentation) {
        C7384Etj.A0Y(hatchLandingPresentation, 2);
        return new NativeLoginSiblingDisclosure(hatchTosDisclosure, z, hatchLandingPresentation);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NativeLoginSiblingDisclosure) {
                NativeLoginSiblingDisclosure nativeLoginSiblingDisclosure = (NativeLoginSiblingDisclosure) obj;
                if (!C7384Etj.areEqual(this.tos, nativeLoginSiblingDisclosure.tos) || this.serverSuppressesClause != nativeLoginSiblingDisclosure.serverSuppressesClause || this.landingPresentation != nativeLoginSiblingDisclosure.landingPresentation) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NativeLoginSiblingDisclosure copy$default(NativeLoginSiblingDisclosure nativeLoginSiblingDisclosure, HatchTosDisclosure hatchTosDisclosure, boolean z, HatchLandingPresentation hatchLandingPresentation, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchTosDisclosure = nativeLoginSiblingDisclosure.tos;
        }
        if ((i & 2) != 0) {
            z = nativeLoginSiblingDisclosure.serverSuppressesClause;
        }
        if ((i & 4) != 0) {
            hatchLandingPresentation = nativeLoginSiblingDisclosure.landingPresentation;
        }
        return nativeLoginSiblingDisclosure.copy(hatchTosDisclosure, z, hatchLandingPresentation);
    }

    public final HatchTosDisclosure component1() {
        return this.tos;
    }

    public final boolean component2() {
        return this.serverSuppressesClause;
    }

    public final HatchLandingPresentation component3() {
        return this.landingPresentation;
    }

    public final HatchLandingPresentation getLandingPresentation() {
        return this.landingPresentation;
    }

    public final boolean getServerSuppressesClause() {
        return this.serverSuppressesClause;
    }

    public final HatchTosDisclosure getTos() {
        return this.tos;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.landingPresentation, C0KA.A01(AnonymousClass006.A0D(this.tos) * 31, this.serverSuppressesClause));
    }

    public String toString() {
        return super.toString();
    }
}
