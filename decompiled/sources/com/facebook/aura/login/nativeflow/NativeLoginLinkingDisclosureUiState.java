package com.facebook.aura.login.nativeflow;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.login.nativeflow.HatchTosGroup;

/* loaded from: classes.dex */
public final class NativeLoginLinkingDisclosureUiState extends C06G {
    public static final int $stable = 8;
    public final NativeLoginAccountUiModel account;
    public final String confirmLabel;
    public final String contentVersion;
    public final String declineLabel;
    public final HatchTosDisclosure footer;
    public final HatchItemizedConsent itemizedConsent;
    public final HatchDisclosurePresentation presentation;
    public final HatchTosGroup.Prose prose;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NativeLoginLinkingDisclosureUiState) {
                NativeLoginLinkingDisclosureUiState nativeLoginLinkingDisclosureUiState = (NativeLoginLinkingDisclosureUiState) obj;
                if (!C7384Etj.areEqual(this.account, nativeLoginLinkingDisclosureUiState.account) || this.presentation != nativeLoginLinkingDisclosureUiState.presentation || !C7384Etj.areEqual(this.prose, nativeLoginLinkingDisclosureUiState.prose) || !C7384Etj.areEqual(this.footer, nativeLoginLinkingDisclosureUiState.footer) || !C7384Etj.areEqual(this.contentVersion, nativeLoginLinkingDisclosureUiState.contentVersion) || !C7384Etj.areEqual(this.confirmLabel, nativeLoginLinkingDisclosureUiState.confirmLabel) || !C7384Etj.areEqual(this.declineLabel, nativeLoginLinkingDisclosureUiState.declineLabel) || !C7384Etj.areEqual(this.itemizedConsent, nativeLoginLinkingDisclosureUiState.itemizedConsent)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NativeLoginLinkingDisclosureUiState copy$default(NativeLoginLinkingDisclosureUiState nativeLoginLinkingDisclosureUiState, NativeLoginAccountUiModel nativeLoginAccountUiModel, HatchDisclosurePresentation hatchDisclosurePresentation, HatchTosGroup.Prose prose, HatchTosDisclosure hatchTosDisclosure, String str, String str2, String str3, HatchItemizedConsent hatchItemizedConsent, int i, Object obj) {
        if ((i & 1) != 0) {
            nativeLoginAccountUiModel = nativeLoginLinkingDisclosureUiState.account;
        }
        if ((i & 2) != 0) {
            hatchDisclosurePresentation = nativeLoginLinkingDisclosureUiState.presentation;
        }
        if ((i & 4) != 0) {
            prose = nativeLoginLinkingDisclosureUiState.prose;
        }
        if ((i & 8) != 0) {
            hatchTosDisclosure = nativeLoginLinkingDisclosureUiState.footer;
        }
        if ((i & 16) != 0) {
            str = nativeLoginLinkingDisclosureUiState.contentVersion;
        }
        if ((i & 32) != 0) {
            str2 = nativeLoginLinkingDisclosureUiState.confirmLabel;
        }
        if ((i & 64) != 0) {
            str3 = nativeLoginLinkingDisclosureUiState.declineLabel;
        }
        if ((i & 128) != 0) {
            hatchItemizedConsent = nativeLoginLinkingDisclosureUiState.itemizedConsent;
        }
        return nativeLoginLinkingDisclosureUiState.copy(nativeLoginAccountUiModel, hatchDisclosurePresentation, prose, hatchTosDisclosure, str, str2, str3, hatchItemizedConsent);
    }

    public final NativeLoginAccountUiModel component1() {
        return this.account;
    }

    public final HatchDisclosurePresentation component2() {
        return this.presentation;
    }

    public final HatchTosGroup.Prose component3() {
        return this.prose;
    }

    public final HatchTosDisclosure component4() {
        return this.footer;
    }

    public final String component5() {
        return this.contentVersion;
    }

    public final String component6() {
        return this.confirmLabel;
    }

    public final String component7() {
        return this.declineLabel;
    }

    public final HatchItemizedConsent component8() {
        return this.itemizedConsent;
    }

    public final NativeLoginAccountUiModel getAccount() {
        return this.account;
    }

    public final String getConfirmLabel() {
        return this.confirmLabel;
    }

    public final String getContentVersion() {
        return this.contentVersion;
    }

    public final String getDeclineLabel() {
        return this.declineLabel;
    }

    public final HatchTosDisclosure getFooter() {
        return this.footer;
    }

    public final HatchItemizedConsent getItemizedConsent() {
        return this.itemizedConsent;
    }

    public final HatchDisclosurePresentation getPresentation() {
        return this.presentation;
    }

    public final HatchTosGroup.Prose getProse() {
        return this.prose;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0I(this.contentVersion, (AnonymousClass005.A0F(this.prose, AnonymousClass005.A0F(this.presentation, AnonymousClass005.A0E(this.account))) + AnonymousClass006.A0D(this.footer)) * 31) + AnonymousClass006.A0G(this.confirmLabel)) * 31) + AnonymousClass006.A0G(this.declineLabel)) * 31) + C06G.A04(this.itemizedConsent);
    }

    public NativeLoginLinkingDisclosureUiState(NativeLoginAccountUiModel nativeLoginAccountUiModel, HatchDisclosurePresentation hatchDisclosurePresentation, HatchTosGroup.Prose prose, HatchTosDisclosure hatchTosDisclosure, String str, String str2, String str3, HatchItemizedConsent hatchItemizedConsent) {
        AnonymousClass005.A0x(nativeLoginAccountUiModel, hatchDisclosurePresentation, prose);
        C7384Etj.A0Y(str, 4);
        this.account = nativeLoginAccountUiModel;
        this.presentation = hatchDisclosurePresentation;
        this.prose = prose;
        this.footer = hatchTosDisclosure;
        this.contentVersion = str;
        this.confirmLabel = str2;
        this.declineLabel = str3;
        this.itemizedConsent = hatchItemizedConsent;
    }

    public final NativeLoginLinkingDisclosureUiState copy(NativeLoginAccountUiModel nativeLoginAccountUiModel, HatchDisclosurePresentation hatchDisclosurePresentation, HatchTosGroup.Prose prose, HatchTosDisclosure hatchTosDisclosure, String str, String str2, String str3, HatchItemizedConsent hatchItemizedConsent) {
        AnonymousClass005.A0x(nativeLoginAccountUiModel, hatchDisclosurePresentation, prose);
        C7384Etj.A0Y(str, 4);
        return new NativeLoginLinkingDisclosureUiState(nativeLoginAccountUiModel, hatchDisclosurePresentation, prose, hatchTosDisclosure, str, str2, str3, hatchItemizedConsent);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NativeLoginLinkingDisclosureUiState(NativeLoginAccountUiModel nativeLoginAccountUiModel, HatchDisclosurePresentation hatchDisclosurePresentation, HatchTosGroup.Prose prose, HatchTosDisclosure hatchTosDisclosure, String str, String str2, String str3, HatchItemizedConsent hatchItemizedConsent, int i, C06H c06h) {
        this(nativeLoginAccountUiModel, hatchDisclosurePresentation, prose, hatchTosDisclosure, str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : hatchItemizedConsent);
    }
}
