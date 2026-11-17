package com.facebook.aura.login.nativeflow;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public interface NativeLoginItemizedConsentTarget {

    public final class Completion extends C06G implements NativeLoginItemizedConsentTarget {
        public static final int $stable = 8;
        public final HatchItemizedConsent consent;

        public Completion(HatchItemizedConsent hatchItemizedConsent) {
            C7384Etj.A0Y(hatchItemizedConsent, 0);
            this.consent = hatchItemizedConsent;
        }

        public final Completion copy(HatchItemizedConsent hatchItemizedConsent) {
            C7384Etj.A0Y(hatchItemizedConsent, 0);
            return new Completion(hatchItemizedConsent);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Completion) && C7384Etj.areEqual(this.consent, ((Completion) obj).consent));
        }

        public static /* synthetic */ Completion copy$default(Completion completion, HatchItemizedConsent hatchItemizedConsent, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchItemizedConsent = completion.consent;
            }
            C7384Etj.A0Y(hatchItemizedConsent, 0);
            return new Completion(hatchItemizedConsent);
        }

        public final HatchItemizedConsent component1() {
            return this.consent;
        }

        @Override // com.facebook.aura.login.nativeflow.NativeLoginItemizedConsentTarget
        public HatchItemizedConsent getConsent() {
            return this.consent;
        }

        public int hashCode() {
            return this.consent.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Linking extends C06G implements NativeLoginItemizedConsentTarget {
        public static final int $stable = 8;
        public final HatchItemizedConsent consent;
        public final NativeLoginLinkingDisclosureUiState disclosure;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Linking) {
                    Linking linking = (Linking) obj;
                    if (!C7384Etj.areEqual(this.disclosure, linking.disclosure) || !C7384Etj.areEqual(this.consent, linking.consent)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Linking copy$default(Linking linking, NativeLoginLinkingDisclosureUiState nativeLoginLinkingDisclosureUiState, HatchItemizedConsent hatchItemizedConsent, int i, Object obj) {
            if ((i & 1) != 0) {
                nativeLoginLinkingDisclosureUiState = linking.disclosure;
            }
            if ((i & 2) != 0) {
                hatchItemizedConsent = linking.consent;
            }
            AnonymousClass003.A0u(nativeLoginLinkingDisclosureUiState, hatchItemizedConsent);
            return new Linking(nativeLoginLinkingDisclosureUiState, hatchItemizedConsent);
        }

        public final NativeLoginLinkingDisclosureUiState component1() {
            return this.disclosure;
        }

        public final HatchItemizedConsent component2() {
            return this.consent;
        }

        @Override // com.facebook.aura.login.nativeflow.NativeLoginItemizedConsentTarget
        public HatchItemizedConsent getConsent() {
            return this.consent;
        }

        public final NativeLoginLinkingDisclosureUiState getDisclosure() {
            return this.disclosure;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.consent, AnonymousClass005.A0E(this.disclosure));
        }

        public Linking(NativeLoginLinkingDisclosureUiState nativeLoginLinkingDisclosureUiState, HatchItemizedConsent hatchItemizedConsent) {
            AnonymousClass003.A0u(nativeLoginLinkingDisclosureUiState, hatchItemizedConsent);
            this.disclosure = nativeLoginLinkingDisclosureUiState;
            this.consent = hatchItemizedConsent;
        }

        public final Linking copy(NativeLoginLinkingDisclosureUiState nativeLoginLinkingDisclosureUiState, HatchItemizedConsent hatchItemizedConsent) {
            AnonymousClass003.A0u(nativeLoginLinkingDisclosureUiState, hatchItemizedConsent);
            return new Linking(nativeLoginLinkingDisclosureUiState, hatchItemizedConsent);
        }

        public String toString() {
            return super.toString();
        }
    }

    HatchItemizedConsent getConsent();
}
