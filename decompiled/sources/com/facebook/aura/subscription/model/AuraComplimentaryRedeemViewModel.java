package com.facebook.aura.subscription.model;

import X.AEs;
import X.AEu;
import X.AbstractC05633ui;
import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass441;
import X.C06G;
import X.C0KA;
import X.C1BN;
import X.C3Ek;
import X.C3pS;
import X.C7384Etj;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.navigation.key.ComplimentaryRedeemEntryPoint;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepository;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryKt;
import com.facebook.aura.subscription.repo.ComplimentaryRedeemPage;

/* loaded from: classes.dex */
public final class AuraComplimentaryRedeemViewModel extends AEs {
    public static final int $stable = 8;
    public final ComplimentarySubscriptionRedemptionController controller;
    public final C1BN<UiState> uiState;

    public final class Factory extends AuraViewModelFactory<AuraComplimentaryRedeemViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public AuraComplimentaryRedeemViewModel create() {
            return new AuraComplimentaryRedeemViewModel(AuraSubscriptionRepository.Companion.getInstance(this.userSession), ComplimentarySubscriptionRedemptionController.Companion.getInstance(this.userSession));
        }
    }

    public interface UiState {

        public final class Closed implements UiState {
            public static final int $stable = 0;
            public static final Closed INSTANCE = new Closed();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Closed);
            }

            public String toString() {
                return "Closed";
            }

            public int hashCode() {
                return 1111480088;
            }
        }

        public final class Loading implements UiState {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public String toString() {
                return "Loading";
            }

            public int hashCode() {
                return -433741552;
            }
        }

        public final class Ready extends C06G implements UiState {
            public static final int $stable = 0;
            public final boolean isRedeeming;
            public final ComplimentaryRedeemPage page;
            public final boolean showFailure;

            public Ready(ComplimentaryRedeemPage complimentaryRedeemPage, boolean z, boolean z2) {
                C7384Etj.A0Y(complimentaryRedeemPage, 0);
                this.page = complimentaryRedeemPage;
                this.isRedeeming = z;
                this.showFailure = z2;
            }

            public final Ready copy(ComplimentaryRedeemPage complimentaryRedeemPage, boolean z, boolean z2) {
                C7384Etj.A0Y(complimentaryRedeemPage, 0);
                return new Ready(complimentaryRedeemPage, z, z2);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Ready) {
                        Ready ready = (Ready) obj;
                        if (!C7384Etj.areEqual(this.page, ready.page) || this.isRedeeming != ready.isRedeeming || this.showFailure != ready.showFailure) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ Ready copy$default(Ready ready, ComplimentaryRedeemPage complimentaryRedeemPage, boolean z, boolean z2, int i, Object obj) {
                if ((i & 1) != 0) {
                    complimentaryRedeemPage = ready.page;
                }
                if ((i & 2) != 0) {
                    z = ready.isRedeeming;
                }
                if ((i & 4) != 0) {
                    z2 = ready.showFailure;
                }
                return ready.copy(complimentaryRedeemPage, z, z2);
            }

            public final ComplimentaryRedeemPage component1() {
                return this.page;
            }

            public final boolean component2() {
                return this.isRedeeming;
            }

            public final boolean component3() {
                return this.showFailure;
            }

            public final ComplimentaryRedeemPage getPage() {
                return this.page;
            }

            public final boolean getShowFailure() {
                return this.showFailure;
            }

            public int hashCode() {
                return C0KA.A00(C0KA.A01(AnonymousClass005.A0E(this.page), this.isRedeeming), this.showFailure);
            }

            public final boolean isRedeeming() {
                return this.isRedeeming;
            }

            public String toString() {
                return super.toString();
            }
        }
    }

    public final void redeem(ComplimentaryRedeemEntryPoint complimentaryRedeemEntryPoint) {
        UiState.Ready ready;
        C7384Etj.A0Y(complimentaryRedeemEntryPoint, 0);
        UiState value = this.uiState.getValue();
        if (!(value instanceof UiState.Ready) || (ready = (UiState.Ready) value) == null) {
            return;
        }
        ComplimentarySubscriptionRedemptionController complimentarySubscriptionRedemptionController = this.controller;
        ComplimentaryRedeemPage complimentaryRedeemPage = ready.page;
        complimentarySubscriptionRedemptionController.activate(complimentaryRedeemPage.offerId, complimentaryRedeemPage.action, complimentaryRedeemEntryPoint, null);
    }

    public final void dismissFailure() {
        UiState.Ready ready;
        UiState value = this.uiState.getValue();
        if (!(value instanceof UiState.Ready) || (ready = (UiState.Ready) value) == null) {
            return;
        }
        this.controller.dismissFailure(ready.page.offerId);
    }

    public final C1BN<UiState> getUiState() {
        return this.uiState;
    }

    public AuraComplimentaryRedeemViewModel(AuraSubscriptionRepository auraSubscriptionRepository, ComplimentarySubscriptionRedemptionController complimentarySubscriptionRedemptionController) {
        AnonymousClass003.A0u(auraSubscriptionRepository, complimentarySubscriptionRedemptionController);
        this.controller = complimentarySubscriptionRedemptionController;
        C3pS c3pSA00 = AbstractC05633ui.A00(new AuraComplimentaryRedeemViewModel$special$$inlined$flatMapLatest$1(null, this), auraSubscriptionRepository.subscriptionDetailsState);
        this.uiState = AnonymousClass441.A00(UiState.Loading.INSTANCE, AEu.A00(this), c3pSA00, C3Ek.A00);
        auraSubscriptionRepository.m2262refreshIfStaleLRDsOJo(AuraSubscriptionRepositoryKt.DEFAULT_SUBSCRIPTION_FRESHNESS);
    }
}
