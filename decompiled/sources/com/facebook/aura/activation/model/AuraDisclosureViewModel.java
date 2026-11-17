package com.facebook.aura.activation.model;

import X.AEs;
import X.AEu;
import X.AGI;
import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFI;
import X.BLG;
import X.BLL;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C1BN;
import X.C20Z;
import X.C22I;
import X.C3Em;
import X.C3Pi;
import X.C3UX;
import X.C3pd;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.C9290GCr;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.activation.data.HatchDisclosureEntity;
import com.facebook.aura.activation.data.HatchDisclosureText;
import com.facebook.aura.activation.data.HatchInfoBanner;
import com.facebook.aura.activation.data.HatchInfoSheetSection;
import com.facebook.aura.activation.data.HatchTosMetadata;
import com.facebook.aura.activation.data.HatchUpsellCell;
import com.facebook.aura.activation.repo.AuraActivationRepository;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.composer.util.ImageCompressor;
import com.facebook.aura.confidentialvm.ConfidentialVmSetupGate;
import com.facebook.aura.confidentialvm.model.ConfidentialVmAnalytics;
import com.facebook.aura.deeplink.HatchDeferredDeeplinks;
import com.facebook.aura.gateway.HatchlingVmType;
import com.facebook.aura.linktext.HatchTextLink;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class AuraDisclosureViewModel extends AEs {
    public final BLG<UiState> _uiState;
    public final C3Em<ViewEffect> _viewEffect;
    public final AuraActivationRepository activationRepository;
    public final HatchDeferredDeeplinks deferredDeeplinks;
    public final ConfidentialVmSetupGate setupGate;
    public final C1BN<UiState> uiState;
    public final C22I<ViewEffect> viewEffect;
    public static final Companion Companion = new Companion();
    public static final Set<String> CONFIDENTIAL_VM_ROUTES = BFI.A0H(new String[]{ConfidentialVmAnalytics.SWITCH_EVENT_NAME, "cvm_off_waitlist"});

    @DebugMetadata(c = "com.facebook.aura.activation.model.AuraDisclosureViewModel$1", f = "AuraDisclosureViewModel.kt", l = {78}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.AuraDisclosureViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraDisclosureViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final AuraDisclosureViewModel auraDisclosureViewModel = AuraDisclosureViewModel.this;
                C1BN<HatchDeferredDeeplinks.Link> c1bn = auraDisclosureViewModel.deferredDeeplinks.awaitingActivation;
                C20Z<? super HatchDeferredDeeplinks.Link> c20z = new C20Z() { // from class: com.facebook.aura.activation.model.AuraDisclosureViewModel.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((HatchDeferredDeeplinks.Link) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(HatchDeferredDeeplinks.Link link, HtJ<? super Unit> htJ) {
                        UiState value;
                        AuraDisclosureViewModel auraDisclosureViewModel2 = auraDisclosureViewModel;
                        BLG<UiState> blg = auraDisclosureViewModel2._uiState;
                        do {
                            value = blg.getValue();
                        } while (!blg.A6e(value, auraDisclosureViewModel2.withUpsellCell(value)));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c1bn.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return AuraDisclosureViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Companion {
        public final Set<String> getCONFIDENTIAL_VM_ROUTES() {
            return AuraDisclosureViewModel.CONFIDENTIAL_VM_ROUTES;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final class Factory extends AuraViewModelFactory<AuraDisclosureViewModel> {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public AuraDisclosureViewModel create() {
            return new AuraDisclosureViewModel(AuraActivationRepository.Companion.getInstance(this.userSession), ConfidentialVmSetupGate.Companion.getInstance(this.userSession), HatchDeferredDeeplinks.Companion.getInstance(this.userSession));
        }
    }

    public final class InfoBanner extends C06G {
        public final String closeText;
        public final AHD<InfoSheetSection> sections;
        public final String text;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof InfoBanner) {
                    InfoBanner infoBanner = (InfoBanner) obj;
                    if (!C7384Etj.areEqual(this.text, infoBanner.text) || !C7384Etj.areEqual(this.sections, infoBanner.sections) || !C7384Etj.areEqual(this.closeText, infoBanner.closeText)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InfoBanner copy$default(InfoBanner infoBanner, String str, AHD ahd, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = infoBanner.text;
            }
            if ((i & 2) != 0) {
                ahd = infoBanner.sections;
            }
            if ((i & 4) != 0) {
                str2 = infoBanner.closeText;
            }
            return infoBanner.copy(str, ahd, str2);
        }

        public final String component1() {
            return this.text;
        }

        public final AHD<InfoSheetSection> component2() {
            return this.sections;
        }

        public final String component3() {
            return this.closeText;
        }

        public final String getCloseText() {
            return this.closeText;
        }

        public final AHD<InfoSheetSection> getSections() {
            return this.sections;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.closeText, AnonymousClass005.A0F(this.sections, AnonymousClass001.A0G(this.text)));
        }

        public InfoBanner(String str, AHD<InfoSheetSection> ahd, String str2) {
            AnonymousClass005.A0x(str, ahd, str2);
            this.text = str;
            this.sections = ahd;
            this.closeText = str2;
        }

        public final InfoBanner copy(String str, AHD<InfoSheetSection> ahd, String str2) {
            AnonymousClass005.A0x(str, ahd, str2);
            return new InfoBanner(str, ahd, str2);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class InfoSheetSection extends C06G {
        public final SubscriptionLegalText body;
        public final String title;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof InfoSheetSection) {
                    InfoSheetSection infoSheetSection = (InfoSheetSection) obj;
                    if (!C7384Etj.areEqual(this.title, infoSheetSection.title) || !C7384Etj.areEqual(this.body, infoSheetSection.body)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ InfoSheetSection copy$default(InfoSheetSection infoSheetSection, String str, SubscriptionLegalText subscriptionLegalText, int i, Object obj) {
            if ((i & 1) != 0) {
                str = infoSheetSection.title;
            }
            if ((i & 2) != 0) {
                subscriptionLegalText = infoSheetSection.body;
            }
            AnonymousClass003.A0u(str, subscriptionLegalText);
            return new InfoSheetSection(str, subscriptionLegalText);
        }

        public final String component1() {
            return this.title;
        }

        public final SubscriptionLegalText component2() {
            return this.body;
        }

        public final SubscriptionLegalText getBody() {
            return this.body;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.body, AnonymousClass001.A0G(this.title));
        }

        public InfoSheetSection(String str, SubscriptionLegalText subscriptionLegalText) {
            AnonymousClass003.A0u(str, subscriptionLegalText);
            this.title = str;
            this.body = subscriptionLegalText;
        }

        public final InfoSheetSection copy(String str, SubscriptionLegalText subscriptionLegalText) {
            AnonymousClass003.A0u(str, subscriptionLegalText);
            return new InfoSheetSection(str, subscriptionLegalText);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class SubscriptionLegalText extends C06G {
        public final AHD<HatchTextLink> links;
        public final String text;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof SubscriptionLegalText) {
                    SubscriptionLegalText subscriptionLegalText = (SubscriptionLegalText) obj;
                    if (!C7384Etj.areEqual(this.text, subscriptionLegalText.text) || !C7384Etj.areEqual(this.links, subscriptionLegalText.links)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ SubscriptionLegalText copy$default(SubscriptionLegalText subscriptionLegalText, String str, AHD ahd, int i, Object obj) {
            if ((i & 1) != 0) {
                str = subscriptionLegalText.text;
            }
            if ((i & 2) != 0) {
                ahd = subscriptionLegalText.links;
            }
            AnonymousClass003.A0u(str, ahd);
            return new SubscriptionLegalText(str, ahd);
        }

        public final String component1() {
            return this.text;
        }

        public final AHD<HatchTextLink> component2() {
            return this.links;
        }

        public final AHD<HatchTextLink> getLinks() {
            return this.links;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.links, AnonymousClass001.A0G(this.text));
        }

        public SubscriptionLegalText(String str, AHD<HatchTextLink> ahd) {
            AnonymousClass003.A0u(str, ahd);
            this.text = str;
            this.links = ahd;
        }

        public final SubscriptionLegalText copy(String str, AHD<HatchTextLink> ahd) {
            AnonymousClass003.A0u(str, ahd);
            return new SubscriptionLegalText(str, ahd);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class UiState extends C06G {
        public final InfoBanner infoBanner;
        public final boolean isFetchingMetadata;
        public final boolean isLoading;
        public final SubscriptionLegalText subscriptionLegalText;
        public final HatchTosMetadata tosMetadata;
        public final HatchUpsellCell upsellCell;

        public UiState() {
            this(false, true, null, null, null, null);
        }

        public static /* synthetic */ UiState copy$default(UiState uiState, boolean z, boolean z2, HatchTosMetadata hatchTosMetadata, SubscriptionLegalText subscriptionLegalText, InfoBanner infoBanner, HatchUpsellCell hatchUpsellCell, int i, Object obj) {
            boolean z3 = z;
            boolean z4 = z2;
            HatchTosMetadata hatchTosMetadata2 = hatchTosMetadata;
            SubscriptionLegalText subscriptionLegalText2 = subscriptionLegalText;
            InfoBanner infoBanner2 = infoBanner;
            HatchUpsellCell hatchUpsellCell2 = hatchUpsellCell;
            if ((i & 1) != 0) {
                z3 = uiState.isLoading;
            }
            if ((i & 2) != 0) {
                z4 = uiState.isFetchingMetadata;
            }
            if ((i & 4) != 0) {
                hatchTosMetadata2 = uiState.tosMetadata;
            }
            if ((i & 8) != 0) {
                subscriptionLegalText2 = uiState.subscriptionLegalText;
            }
            if ((i & 16) != 0) {
                infoBanner2 = uiState.infoBanner;
            }
            if ((i & 32) != 0) {
                hatchUpsellCell2 = uiState.upsellCell;
            }
            return new UiState(z3, z4, hatchTosMetadata2, subscriptionLegalText2, infoBanner2, hatchUpsellCell2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof UiState) {
                    UiState uiState = (UiState) obj;
                    if (this.isLoading != uiState.isLoading || this.isFetchingMetadata != uiState.isFetchingMetadata || !C7384Etj.areEqual(this.tosMetadata, uiState.tosMetadata) || !C7384Etj.areEqual(this.subscriptionLegalText, uiState.subscriptionLegalText) || !C7384Etj.areEqual(this.infoBanner, uiState.infoBanner) || !C7384Etj.areEqual(this.upsellCell, uiState.upsellCell)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final boolean component1() {
            return this.isLoading;
        }

        public final boolean component2() {
            return this.isFetchingMetadata;
        }

        public final HatchTosMetadata component3() {
            return this.tosMetadata;
        }

        public final SubscriptionLegalText component4() {
            return this.subscriptionLegalText;
        }

        public final InfoBanner component5() {
            return this.infoBanner;
        }

        public final HatchUpsellCell component6() {
            return this.upsellCell;
        }

        public final UiState copy(boolean z, boolean z2, HatchTosMetadata hatchTosMetadata, SubscriptionLegalText subscriptionLegalText, InfoBanner infoBanner, HatchUpsellCell hatchUpsellCell) {
            return new UiState(z, z2, hatchTosMetadata, subscriptionLegalText, infoBanner, hatchUpsellCell);
        }

        public final InfoBanner getInfoBanner() {
            return this.infoBanner;
        }

        public final SubscriptionLegalText getSubscriptionLegalText() {
            return this.subscriptionLegalText;
        }

        public final HatchTosMetadata getTosMetadata() {
            return this.tosMetadata;
        }

        public final HatchUpsellCell getUpsellCell() {
            return this.upsellCell;
        }

        public int hashCode() {
            return ((((((C0KA.A01(C0KA.A02(this.isLoading), this.isFetchingMetadata) + AnonymousClass006.A0D(this.tosMetadata)) * 31) + AnonymousClass006.A0D(this.subscriptionLegalText)) * 31) + AnonymousClass006.A0D(this.infoBanner)) * 31) + C06G.A04(this.upsellCell);
        }

        public final boolean isFetchingMetadata() {
            return this.isFetchingMetadata;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ UiState(boolean z, boolean z2, HatchTosMetadata hatchTosMetadata, SubscriptionLegalText subscriptionLegalText, InfoBanner infoBanner, HatchUpsellCell hatchUpsellCell, int i, C06H c06h) {
            this(AnonymousClass001.A1P(i, z), (i & 2) != 0 ? true : z2, (i & 4) != 0 ? null : hatchTosMetadata, (i & 8) != 0 ? null : subscriptionLegalText, (i & 16) != 0 ? null : infoBanner, (i & 32) != 0 ? null : hatchUpsellCell);
        }

        public UiState(boolean z, boolean z2, HatchTosMetadata hatchTosMetadata, SubscriptionLegalText subscriptionLegalText, InfoBanner infoBanner, HatchUpsellCell hatchUpsellCell) {
            this.isLoading = z;
            this.isFetchingMetadata = z2;
            this.tosMetadata = hatchTosMetadata;
            this.subscriptionLegalText = subscriptionLegalText;
            this.infoBanner = infoBanner;
            this.upsellCell = hatchUpsellCell;
        }
    }

    public interface ViewEffect {

        public final class AcceptFailed implements ViewEffect {
            public static final AcceptFailed INSTANCE = new AcceptFailed();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof AcceptFailed);
            }

            public String toString() {
                return "AcceptFailed";
            }

            public int hashCode() {
                return 631845334;
            }
        }

        public final class DisclosureAccepted implements ViewEffect {
            public static final DisclosureAccepted INSTANCE = new DisclosureAccepted();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof DisclosureAccepted);
            }

            public String toString() {
                return "DisclosureAccepted";
            }

            public int hashCode() {
                return -1766278555;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.AuraDisclosureViewModel$fetchTosMetadata$1", f = "AuraDisclosureViewModel.kt", l = {ImageCompressor.IMAGE_COMPRESSION_QUALITY}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.AuraDisclosureViewModel$fetchTosMetadata$1, reason: invalid class name and case insensitive filesystem */
    public final class C106721 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            UiState value;
            UiState uiState;
            UiState value2;
            UiState uiState2;
            InfoBanner uiModel;
            SubscriptionLegalText legalText;
            HatchDisclosureText hatchDisclosureText;
            Object objFetchTosMetadata = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BLG<UiState> blg = AuraDisclosureViewModel.this._uiState;
                do {
                    value = blg.getValue();
                    uiState = value;
                } while (!blg.A6e(value, new UiState(uiState.isLoading, true, uiState.tosMetadata, uiState.subscriptionLegalText, uiState.infoBanner, uiState.upsellCell)));
                AuraActivationRepository auraActivationRepository = AuraDisclosureViewModel.this.activationRepository;
                this.label = 1;
                objFetchTosMetadata = auraActivationRepository.fetchTosMetadata(this);
                if (objFetchTosMetadata == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HatchTosMetadata hatchTosMetadata = (HatchTosMetadata) objFetchTosMetadata;
            AuraDisclosureViewModel auraDisclosureViewModel = AuraDisclosureViewModel.this;
            BLG<UiState> blg2 = auraDisclosureViewModel._uiState;
            do {
                value2 = blg2.getValue();
                uiState2 = value2;
                uiModel = null;
                if (hatchTosMetadata == null || (hatchDisclosureText = hatchTosMetadata.subscriptionDisclosure) == null) {
                    legalText = null;
                    if (hatchTosMetadata != null) {
                    }
                } else {
                    legalText = auraDisclosureViewModel.toLegalText(hatchDisclosureText);
                }
                HatchInfoBanner hatchInfoBanner = hatchTosMetadata.infoBanner;
                if (hatchInfoBanner != null) {
                    uiModel = auraDisclosureViewModel.toUiModel(hatchInfoBanner);
                }
            } while (!blg2.A6e(value2, auraDisclosureViewModel.withUpsellCell(new UiState(uiState2.isLoading, false, hatchTosMetadata, legalText, uiModel, uiState2.upsellCell))));
            return Unit.INSTANCE;
        }

        public C106721(HtJ<? super C106721> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraDisclosureViewModel.this.new C106721(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return AuraDisclosureViewModel.this.new C106721(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.AuraDisclosureViewModel$onClose$1", f = "AuraDisclosureViewModel.kt", l = {121, 126}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.AuraDisclosureViewModel$onClose$1, reason: invalid class name and case insensitive filesystem */
    public final class C106731 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $fallbackDisclosureText;
        public boolean Z$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106731(String str, HtJ<? super C106731> htJ) {
            super(2, htJ);
            this.$fallbackDisclosureText = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraDisclosureViewModel.this.new C106731(this.$fallbackDisclosureText, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            UiState value;
            UiState uiState;
            UiState value2;
            UiState uiState2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BLG<UiState> blg = AuraDisclosureViewModel.this._uiState;
                do {
                    value = blg.getValue();
                    uiState = value;
                } while (!blg.A6e(value, new UiState(true, uiState.isFetchingMetadata, uiState.tosMetadata, uiState.subscriptionLegalText, uiState.infoBanner, uiState.upsellCell)));
                AuraDisclosureViewModel.this.setupGate.markSelected(HatchlingVmType.HATCH_VM);
                AuraDisclosureViewModel auraDisclosureViewModel = AuraDisclosureViewModel.this;
                AuraActivationRepository auraActivationRepository = auraDisclosureViewModel.activationRepository;
                HatchTosMetadata hatchTosMetadata = auraDisclosureViewModel._uiState.getValue().tosMetadata;
                String str = this.$fallbackDisclosureText;
                this.label = 1;
                obj = TosConsentKt.submitTosConsent(auraActivationRepository, hatchTosMetadata, str, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            boolean zA1X = AnonymousClass001.A1X(obj);
            if (!zA1X) {
                AuraDisclosureViewModel.this.setupGate.resetSelection();
            }
            BLG<UiState> blg2 = AuraDisclosureViewModel.this._uiState;
            do {
                value2 = blg2.getValue();
                uiState2 = value2;
            } while (!blg2.A6e(value2, new UiState(false, uiState2.isFetchingMetadata, uiState2.tosMetadata, uiState2.subscriptionLegalText, uiState2.infoBanner, uiState2.upsellCell)));
            C3Em<ViewEffect> c3Em = AuraDisclosureViewModel.this._viewEffect;
            ViewEffect viewEffect = zA1X ? ViewEffect.DisclosureAccepted.INSTANCE : ViewEffect.AcceptFailed.INSTANCE;
            this.Z$0 = zA1X;
            this.label = 2;
            if (c3Em.emit(viewEffect, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C106731) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public AuraDisclosureViewModel(AuraActivationRepository auraActivationRepository, ConfidentialVmSetupGate confidentialVmSetupGate, HatchDeferredDeeplinks hatchDeferredDeeplinks) {
        boolean zA1Z = AnonymousClass005.A1Z(auraActivationRepository, confidentialVmSetupGate, hatchDeferredDeeplinks);
        this.activationRepository = auraActivationRepository;
        this.setupGate = confidentialVmSetupGate;
        this.deferredDeeplinks = hatchDeferredDeeplinks;
        Integer num = C79.A00;
        C9290GCr c9290GCr = new C9290GCr(num, 0, 0);
        this._viewEffect = c9290GCr;
        this.viewEffect = new C3pd(c9290GCr);
        C9286GCn c9286GCn = new C9286GCn(new UiState(false, zA1Z, null, null, null, null));
        this._uiState = c9286GCn;
        this.uiState = new C3Pi(null, c9286GCn);
        fetchTosMetadata();
        BLL bllA00 = AEu.A00(this);
        GAo.A02(num, C6ys.A00, new AnonymousClass1(null), bllA00);
    }

    public final void onClose(String str) {
        C7384Etj.A0Y(str, 0);
        if (this._uiState.getValue().isLoading) {
            return;
        }
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C106731(str, null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SubscriptionLegalText toLegalText(HatchDisclosureText hatchDisclosureText) {
        String str = hatchDisclosureText.text;
        List<HatchDisclosureEntity> list = hatchDisclosureText.entities;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        for (HatchDisclosureEntity hatchDisclosureEntity : list) {
            arrayListA0i.add(new HatchTextLink(hatchDisclosureEntity.offset, hatchDisclosureEntity.length, hatchDisclosureEntity.url));
        }
        return new SubscriptionLegalText(str, AGI.A07(arrayListA0i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InfoBanner toUiModel(HatchInfoBanner hatchInfoBanner) {
        String str = hatchInfoBanner.text;
        List<HatchInfoSheetSection> list = hatchInfoBanner.sections;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        for (HatchInfoSheetSection hatchInfoSheetSection : list) {
            arrayListA0i.add(new InfoSheetSection(hatchInfoSheetSection.title, toLegalText(hatchInfoSheetSection.body)));
        }
        return new InfoBanner(str, AGI.A07(arrayListA0i), hatchInfoBanner.closeText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UiState withUpsellCell(UiState uiState) {
        Set<String> set = CONFIDENTIAL_VM_ROUTES;
        HatchDeferredDeeplinks.Link value = this.deferredDeeplinks.awaitingActivation.getValue();
        HatchUpsellCell hatchUpsellCell = null;
        boolean zA0k = AbstractC0878AGe.A0k(set, value != null ? value.routeName : null);
        HatchTosMetadata hatchTosMetadata = uiState.tosMetadata;
        if (zA0k) {
            if (hatchTosMetadata != null) {
                hatchUpsellCell = hatchTosMetadata.cvmUpsellCell;
            }
        } else if (hatchTosMetadata != null) {
            hatchUpsellCell = hatchTosMetadata.subscriptionUpsellCell;
        }
        return new UiState(uiState.isLoading, uiState.isFetchingMetadata, hatchTosMetadata, uiState.subscriptionLegalText, uiState.infoBanner, hatchUpsellCell);
    }

    public final C1BN<UiState> getUiState() {
        return this.uiState;
    }

    public final C22I<ViewEffect> getViewEffect() {
        return this.viewEffect;
    }

    public final void onInfoBannerClick() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.ONBOARDING, null, HatchScreen.ONBOARDING_DISCLOSURE, HatchComponent.PRIVACY_INFO_BANNER, null, null, null);
    }

    private final void fetchTosMetadata() {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C106721(null), AEu.A00(this));
    }
}
