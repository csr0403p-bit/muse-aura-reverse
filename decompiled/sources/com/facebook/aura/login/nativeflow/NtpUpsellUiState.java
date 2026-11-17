package com.facebook.aura.login.nativeflow;

import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class NtpUpsellUiState extends C06G {
    public static final int $stable = 8;
    public final NativeLoginAccountUiModel account;
    public final boolean drawsTosClause;
    public final HatchLandingPresentation landingPresentation;
    public final HatchTosDisclosure tos;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NtpUpsellUiState) {
                NtpUpsellUiState ntpUpsellUiState = (NtpUpsellUiState) obj;
                if (!C7384Etj.areEqual(this.account, ntpUpsellUiState.account) || !C7384Etj.areEqual(this.tos, ntpUpsellUiState.tos) || this.drawsTosClause != ntpUpsellUiState.drawsTosClause || this.landingPresentation != ntpUpsellUiState.landingPresentation) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NtpUpsellUiState copy$default(NtpUpsellUiState ntpUpsellUiState, NativeLoginAccountUiModel nativeLoginAccountUiModel, HatchTosDisclosure hatchTosDisclosure, boolean z, HatchLandingPresentation hatchLandingPresentation, int i, Object obj) {
        if ((i & 1) != 0) {
            nativeLoginAccountUiModel = ntpUpsellUiState.account;
        }
        if ((i & 2) != 0) {
            hatchTosDisclosure = ntpUpsellUiState.tos;
        }
        if ((i & 4) != 0) {
            z = ntpUpsellUiState.drawsTosClause;
        }
        if ((i & 8) != 0) {
            hatchLandingPresentation = ntpUpsellUiState.landingPresentation;
        }
        AnonymousClass005.A0y(nativeLoginAccountUiModel, hatchTosDisclosure, hatchLandingPresentation);
        return new NtpUpsellUiState(nativeLoginAccountUiModel, hatchTosDisclosure, z, hatchLandingPresentation);
    }

    public final NativeLoginAccountUiModel component1() {
        return this.account;
    }

    public final HatchTosDisclosure component2() {
        return this.tos;
    }

    public final boolean component3() {
        return this.drawsTosClause;
    }

    public final HatchLandingPresentation component4() {
        return this.landingPresentation;
    }

    public final NativeLoginAccountUiModel getAccount() {
        return this.account;
    }

    public final boolean getDrawsTosClause() {
        return this.drawsTosClause;
    }

    public final HatchLandingPresentation getLandingPresentation() {
        return this.landingPresentation;
    }

    public final HatchTosDisclosure getTos() {
        return this.tos;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.landingPresentation, C0KA.A01(AnonymousClass005.A0F(this.tos, AnonymousClass005.A0E(this.account)), this.drawsTosClause));
    }

    public NtpUpsellUiState(NativeLoginAccountUiModel nativeLoginAccountUiModel, HatchTosDisclosure hatchTosDisclosure, boolean z, HatchLandingPresentation hatchLandingPresentation) {
        AnonymousClass005.A0y(nativeLoginAccountUiModel, hatchTosDisclosure, hatchLandingPresentation);
        this.account = nativeLoginAccountUiModel;
        this.tos = hatchTosDisclosure;
        this.drawsTosClause = z;
        this.landingPresentation = hatchLandingPresentation;
    }

    public final NtpUpsellUiState copy(NativeLoginAccountUiModel nativeLoginAccountUiModel, HatchTosDisclosure hatchTosDisclosure, boolean z, HatchLandingPresentation hatchLandingPresentation) {
        AnonymousClass005.A0y(nativeLoginAccountUiModel, hatchTosDisclosure, hatchLandingPresentation);
        return new NtpUpsellUiState(nativeLoginAccountUiModel, hatchTosDisclosure, z, hatchLandingPresentation);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NtpUpsellUiState(NativeLoginAccountUiModel nativeLoginAccountUiModel, HatchTosDisclosure hatchTosDisclosure, boolean z, HatchLandingPresentation hatchLandingPresentation, int i, C06H c06h) {
        this(nativeLoginAccountUiModel, hatchTosDisclosure, z, (i & 8) != 0 ? HatchLandingPresentation.STANDARD : hatchLandingPresentation);
    }
}
