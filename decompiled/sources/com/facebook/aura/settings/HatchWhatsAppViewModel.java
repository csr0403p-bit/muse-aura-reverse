package com.facebook.aura.settings;

import X.A6J;
import X.AEs;
import X.AEu;
import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC08429uh;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass441;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C22I;
import X.C3Ek;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.C3pd;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.C9290GCr;
import X.C9uG;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC08439ui;
import com.facebook.aura.R;
import com.facebook.aura.accountcenter.MC;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.analytics.hatch.HatchClientCvmOutcome;
import com.facebook.aura.analytics.timespent.config.MC;
import com.facebook.aura.channels.ChannelLaunchOutcome;
import com.facebook.aura.common.coroutines.LazyStartSingleFlightImpl;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.graphql.AuraGraphQLQueryExecutor;
import com.facebook.aura.settings.WhatsAppConnectDisclosure;
import com.facebook.aura.settings.WhatsAppEffect;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public final class HatchWhatsAppViewModel extends AEs {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final long POLL_INTERVAL_MS = 3000;
    public static final int UNLINK_STATUS_ATTEMPTS = 5;
    public static final long UNLINK_STATUS_INTERVAL_MS = 1000;
    public final C3Em<WhatsAppEffect> _effect;
    public final BLG<HatchWhatsAppUiState> _uiState;
    public final WhatsAppConnectConsentApi consentRepository;
    public final SingleFlight disclosureFlight;
    public final SingleFlight disconnectFlight;
    public final C22I<WhatsAppEffect> effect;
    public boolean isConnectAttemptOpen;
    public boolean linkFailedNeedsUnlink;
    public final ChannelPairingLinkLogger pairingLinkLogger;
    public final C1BN<WhatsAppSheetState> sheetState;
    public HoC statusCheck;
    public final HatchChannelStatusRepository statusRepository;
    public final C1BN<HatchWhatsAppUiState> uiState;
    public HoC unlinkCheck;
    public final AbstractC3358CGz userSession;

    /* loaded from: classes4.dex */
    public final class Factory implements InterfaceC08439ui {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // X.InterfaceC08439ui
        public <T extends AEs> T create(Class<T> cls) {
            return new HatchWhatsAppViewModel(this.userSession, WhatsAppConnectConsentRepository.INSTANCE);
        }

        @Override // X.InterfaceC08439ui
        public /* bridge */ <T extends AEs> T create(C9uG<T> c9uG, A6J a6j) {
            return (T) AbstractC08429uh.A00(this, a6j, c9uG);
        }

        @Override // X.InterfaceC08439ui
        public /* bridge */ <T extends AEs> T create(Class<T> cls, A6J a6j) {
            return (T) InterfaceC08439ui.A00(this, cls);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchWhatsAppViewModel", f = "HatchWhatsAppViewModel.kt", l = {357, 360}, m = "awaitUnlinkedStatus", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchWhatsAppViewModel$awaitUnlinkedStatus$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchWhatsAppViewModel.this.awaitUnlinkedStatus(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchWhatsAppViewModel$connect$1", f = "HatchWhatsAppViewModel.kt", l = {233, 236, 239, 243, MC.mwa_accounts_center_settings.__CONFIG__, 266, 273}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchWhatsAppViewModel$connect$1, reason: invalid class name and case insensitive filesystem */
    public final class C136161 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        public C136161(HtJ<? super C136161> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchWhatsAppViewModel.this.new C136161(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchWhatsAppViewModel.this.new C136161(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x006c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 338
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchWhatsAppViewModel.C136161.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchWhatsAppViewModel$disconnect$1", f = "HatchWhatsAppViewModel.kt", l = {410}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchWhatsAppViewModel$disconnect$1, reason: invalid class name and case insensitive filesystem */
    public final class C136171 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.settings.HatchWhatsAppViewModel$disconnect$1$1", f = "HatchWhatsAppViewModel.kt", l = {412, 422, 425}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.settings.HatchWhatsAppViewModel$disconnect$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03531 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ HatchWhatsAppViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03531(HatchWhatsAppViewModel hatchWhatsAppViewModel, HtJ<? super C03531> htJ) {
                super(1, htJ);
                this.this$0 = hatchWhatsAppViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C03531(this.this$0, htJ);
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return new C03531(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                HatchWhatsAppUiState value;
                HatchWhatsAppUiState value2;
                C3Em<WhatsAppEffect> c3Em;
                WhatsAppEffect.ShowToast showToast;
                HatchWhatsAppUiState value3;
                HatchWhatsAppUiState hatchWhatsAppUiState;
                Object objUnlinkChannel = obj;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(objUnlinkChannel);
                    BLG<HatchWhatsAppUiState> blg = this.this$0._uiState;
                    do {
                        value = blg.getValue();
                    } while (!blg.A6e(value, HatchWhatsAppUiState.copy$default(value, false, false, true, null, null, false, null, false, false, false, null, 2011, null)));
                    HatchWhatsAppViewModel hatchWhatsAppViewModel = this.this$0;
                    this.label = 1;
                    objUnlinkChannel = hatchWhatsAppViewModel.unlinkChannel(this);
                    if (objUnlinkChannel == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(objUnlinkChannel);
                        return Unit.INSTANCE;
                    }
                    Hwg.A00(objUnlinkChannel);
                }
                boolean zA1X = AnonymousClass001.A1X(objUnlinkChannel);
                HatchWhatsAppViewModel hatchWhatsAppViewModel2 = this.this$0;
                if (zA1X) {
                    hatchWhatsAppViewModel2.linkFailedNeedsUnlink = false;
                    BLG<HatchWhatsAppUiState> blg2 = hatchWhatsAppViewModel2._uiState;
                    do {
                        value3 = blg2.getValue();
                        hatchWhatsAppUiState = value3;
                    } while (!blg2.A6e(value3, hatchWhatsAppUiState.copy(false, false, false, hatchWhatsAppUiState.connectPhase, hatchWhatsAppUiState.pairingUrl, hatchWhatsAppUiState.showDisconnectDialog, hatchWhatsAppUiState.replacePhase, hatchWhatsAppUiState.statusLoaded, hatchWhatsAppUiState.isHandoff, true, hatchWhatsAppUiState.disclosure)));
                    c3Em = this.this$0._effect;
                    showToast = new WhatsAppEffect.ShowToast(R.string._name_removed__res_0x7f121177);
                    this.label = 2;
                } else {
                    BLG<HatchWhatsAppUiState> blg3 = hatchWhatsAppViewModel2._uiState;
                    do {
                        value2 = blg3.getValue();
                    } while (!blg3.A6e(value2, HatchWhatsAppUiState.copy$default(value2, false, false, false, null, null, false, null, false, false, false, null, 2043, null)));
                    c3Em = this.this$0._effect;
                    showToast = new WhatsAppEffect.ShowToast(R.string._name_removed__res_0x7f121176);
                    this.label = 3;
                }
                if (c3Em.emit(showToast, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
                return Unit.INSTANCE;
            }
        }

        public C136171(HtJ<? super C136171> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchWhatsAppViewModel.this.new C136171(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchWhatsAppViewModel.this.new C136171(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchWhatsAppViewModel hatchWhatsAppViewModel = HatchWhatsAppViewModel.this;
                SingleFlight singleFlight = hatchWhatsAppViewModel.disconnectFlight;
                C03531 c03531 = new C03531(hatchWhatsAppViewModel, null);
                this.label = 1;
                if (singleFlight.invoke(Unit.INSTANCE, c03531, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchWhatsAppViewModel$fetchDisclosure$1", f = "HatchWhatsAppViewModel.kt", l = {188}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchWhatsAppViewModel$fetchDisclosure$1, reason: invalid class name and case insensitive filesystem */
    public final class C136181 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $toastOnFailure;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.settings.HatchWhatsAppViewModel$fetchDisclosure$1$1", f = "HatchWhatsAppViewModel.kt", l = {AuraGraphQLQueryExecutor.API_EC_PARAM_ACCESS_TOKEN, 194}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.settings.HatchWhatsAppViewModel$fetchDisclosure$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03541 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ boolean $toastOnFailure;
            public Object L$0;
            public int label;
            public final /* synthetic */ HatchWhatsAppViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03541(HatchWhatsAppViewModel hatchWhatsAppViewModel, boolean z, HtJ<? super C03541> htJ) {
                super(1, htJ);
                this.this$0 = hatchWhatsAppViewModel;
                this.$toastOnFailure = z;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C03541(this.this$0, this.$toastOnFailure, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                HatchWhatsAppUiState value;
                HatchWhatsAppUiState value2;
                HatchWhatsAppUiState value3;
                Object objFooterRuns = obj;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(objFooterRuns);
                    BLG<HatchWhatsAppUiState> blg = this.this$0._uiState;
                    do {
                        value = blg.getValue();
                    } while (!blg.A6e(value, HatchWhatsAppUiState.copy$default(value, false, false, false, null, null, false, null, false, false, false, WhatsAppConnectDisclosure.Loading.INSTANCE, 1023, null)));
                    WhatsAppConnectConsentApi whatsAppConnectConsentApi = this.this$0.consentRepository;
                    this.label = 1;
                    objFooterRuns = whatsAppConnectConsentApi.footerRuns(this);
                    if (objFooterRuns == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(objFooterRuns);
                        return Unit.INSTANCE;
                    }
                    Hwg.A00(objFooterRuns);
                }
                AHD ahd = (AHD) objFooterRuns;
                BLG<HatchWhatsAppUiState> blg2 = this.this$0._uiState;
                if (ahd == null) {
                    do {
                        value3 = blg2.getValue();
                    } while (!blg2.A6e(value3, HatchWhatsAppUiState.copy$default(value3, false, false, false, null, null, false, null, false, false, false, WhatsAppConnectDisclosure.Failed.INSTANCE, 1023, null)));
                    if (this.$toastOnFailure) {
                        C3Em<WhatsAppEffect> c3Em = this.this$0._effect;
                        WhatsAppEffect.ShowToast showToast = new WhatsAppEffect.ShowToast(R.string._name_removed__res_0x7f121171);
                        this.L$0 = null;
                        this.label = 2;
                        if (c3Em.emit(showToast, this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    }
                } else {
                    do {
                        value2 = blg2.getValue();
                    } while (!blg2.A6e(value2, HatchWhatsAppUiState.copy$default(value2, false, false, false, null, null, false, null, false, false, false, new WhatsAppConnectDisclosure.Loaded(ahd), 1023, null)));
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return ((C03541) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136181(boolean z, HtJ<? super C136181> htJ) {
            super(2, htJ);
            this.$toastOnFailure = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchWhatsAppViewModel.this.new C136181(this.$toastOnFailure, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchWhatsAppViewModel hatchWhatsAppViewModel = HatchWhatsAppViewModel.this;
                SingleFlight singleFlight = hatchWhatsAppViewModel.disclosureFlight;
                C03541 c03541 = new C03541(hatchWhatsAppViewModel, this.$toastOnFailure, null);
                this.label = 1;
                if (singleFlight.invoke(Unit.INSTANCE, c03541, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C136181) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchWhatsAppViewModel$fetchStatus$1", f = "HatchWhatsAppViewModel.kt", l = {177}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchWhatsAppViewModel$fetchStatus$1, reason: invalid class name and case insensitive filesystem */
    public final class C136191 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C136191(HtJ<? super C136191> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchWhatsAppViewModel.this.new C136191(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchWhatsAppViewModel.this.new C136191(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchWhatsAppUiState value;
            HatchWhatsAppUiState value2;
            Object objFetchWhatsAppChannel = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objFetchWhatsAppChannel);
                BLG<HatchWhatsAppUiState> blg = HatchWhatsAppViewModel.this._uiState;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, HatchWhatsAppUiState.copy$default(value, false, false, true, null, null, false, null, false, false, false, null, 2043, null)));
                HatchWhatsAppViewModel hatchWhatsAppViewModel = HatchWhatsAppViewModel.this;
                this.label = 1;
                objFetchWhatsAppChannel = hatchWhatsAppViewModel.fetchWhatsAppChannel(this);
                if (objFetchWhatsAppChannel == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objFetchWhatsAppChannel);
            }
            ChannelJson channelJson = (ChannelJson) objFetchWhatsAppChannel;
            HatchWhatsAppViewModel hatchWhatsAppViewModel2 = HatchWhatsAppViewModel.this;
            BLG<HatchWhatsAppUiState> blg2 = hatchWhatsAppViewModel2._uiState;
            do {
                value2 = blg2.getValue();
            } while (!blg2.A6e(value2, HatchWhatsAppUiState.copy$default(HatchWhatsAppViewModelKt.withStatus(value2, channelJson, hatchWhatsAppViewModel2.linkFailedNeedsUnlink), false, false, false, null, null, false, null, true, false, false, null, 1919, null)));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchWhatsAppViewModel", f = "HatchWhatsAppViewModel.kt", l = {498}, m = "fetchWhatsAppChannel", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchWhatsAppViewModel$fetchWhatsAppChannel$1, reason: invalid class name and case insensitive filesystem */
    public final class C136201 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C136201(HtJ<? super C136201> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchWhatsAppViewModel.this.fetchWhatsAppChannel(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchWhatsAppViewModel$onDeeplinkLaunched$1", f = "HatchWhatsAppViewModel.kt", l = {393}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchWhatsAppViewModel$onDeeplinkLaunched$1, reason: invalid class name and case insensitive filesystem */
    public final class C136211 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ChannelLaunchOutcome $outcome;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136211(ChannelLaunchOutcome channelLaunchOutcome, HtJ<? super C136211> htJ) {
            super(2, htJ);
            this.$outcome = channelLaunchOutcome;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchWhatsAppViewModel.this.new C136211(this.$outcome, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchWhatsAppUiState value;
            HatchWhatsAppUiState hatchWhatsAppUiState;
            WhatsAppConnectPhase whatsAppConnectPhase;
            WhatsAppReplacePhase whatsAppReplacePhase;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BLG<HatchWhatsAppUiState> blg = HatchWhatsAppViewModel.this._uiState;
                do {
                    value = blg.getValue();
                    hatchWhatsAppUiState = value;
                    whatsAppConnectPhase = WhatsAppConnectPhase.IDLE;
                    whatsAppReplacePhase = hatchWhatsAppUiState.replacePhase;
                    if (whatsAppReplacePhase == WhatsAppReplacePhase.SWITCHING) {
                        whatsAppReplacePhase = WhatsAppReplacePhase.SWITCHED;
                    }
                } while (!blg.A6e(value, HatchWhatsAppUiState.copy$default(hatchWhatsAppUiState, false, false, false, whatsAppConnectPhase, null, false, whatsAppReplacePhase, false, false, false, null, 1959, null)));
                if (this.$outcome == ChannelLaunchOutcome.FAILED) {
                    C3Em<WhatsAppEffect> c3Em = HatchWhatsAppViewModel.this._effect;
                    WhatsAppEffect.ShowToast showToast = new WhatsAppEffect.ShowToast(R.string._name_removed__res_0x7f121171);
                    this.label = 1;
                    if (c3Em.emit(showToast, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C136211) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchWhatsAppViewModel", f = "HatchWhatsAppViewModel.kt", l = {367}, m = "onLinkFailed", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchWhatsAppViewModel$onLinkFailed$1, reason: invalid class name and case insensitive filesystem */
    public final class C136221 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C136221(HtJ<? super C136221> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchWhatsAppViewModel.this.onLinkFailed(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchWhatsAppViewModel$onLinkFailed$3", f = "HatchWhatsAppViewModel.kt", l = {369}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchWhatsAppViewModel$onLinkFailed$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchWhatsAppViewModel.this.new AnonymousClass3(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchWhatsAppViewModel.this.new AnonymousClass3(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchWhatsAppUiState value;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchWhatsAppViewModel hatchWhatsAppViewModel = HatchWhatsAppViewModel.this;
                this.label = 1;
                obj = hatchWhatsAppViewModel.fetchWhatsAppChannel(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            ChannelJson channelJson = (ChannelJson) obj;
            HatchWhatsAppViewModel hatchWhatsAppViewModel2 = HatchWhatsAppViewModel.this;
            hatchWhatsAppViewModel2.linkFailedNeedsUnlink = (channelJson == null || channelJson.linked || !channelJson.requiresUnlink()) ? false : true;
            BLG<HatchWhatsAppUiState> blg = hatchWhatsAppViewModel2._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, HatchWhatsAppViewModelKt.withStatus(value, channelJson, hatchWhatsAppViewModel2.linkFailedNeedsUnlink)));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchWhatsAppViewModel$replaceConnection$1", f = "HatchWhatsAppViewModel.kt", l = {286, 290, 293, 296, 299, 302, MC.mwa_time_spent_killswitch.__CONFIG__, 327, 338}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchWhatsAppViewModel$replaceConnection$1, reason: invalid class name and case insensitive filesystem */
    public final class C136231 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        public C136231(HtJ<? super C136231> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchWhatsAppViewModel.this.new C136231(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchWhatsAppViewModel.this.new C136231(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0075 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0105  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x017c  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x01be  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 488
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchWhatsAppViewModel.C136231.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchWhatsAppViewModel$startPollingForConnection$1", f = "HatchWhatsAppViewModel.kt", l = {451, 463, 466, 476}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchWhatsAppViewModel$startPollingForConnection$1, reason: invalid class name and case insensitive filesystem */
    public final class C136241 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public int label;

        public C136241(HtJ<? super C136241> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchWhatsAppViewModel.this.new C136241(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchWhatsAppViewModel.this.new C136241(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00cd A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00de -> B:36:0x00ec). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                Method dump skipped, instructions count: 313
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchWhatsAppViewModel.C136241.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public HatchWhatsAppViewModel(AbstractC3358CGz abstractC3358CGz, WhatsAppConnectConsentApi whatsAppConnectConsentApi) {
        boolean zA1a = AnonymousClass002.A1a(abstractC3358CGz, whatsAppConnectConsentApi);
        this.userSession = abstractC3358CGz;
        this.consentRepository = whatsAppConnectConsentApi;
        C9286GCn c9286GCnA14 = C3cG.A14(new HatchWhatsAppUiState(false, false, false, WhatsAppConnectPhase.IDLE, null, false, WhatsAppReplacePhase.IDLE, false, false, false, WhatsAppConnectDisclosure.Loading.INSTANCE));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        HatchWhatsAppViewModel$special$$inlined$map$1 hatchWhatsAppViewModel$special$$inlined$map$1 = new HatchWhatsAppViewModel$special$$inlined$map$1(c9286GCnA14, this);
        this.sheetState = AnonymousClass441.A00(WhatsAppSheetState.LOADING, AEu.A00(this), hatchWhatsAppViewModel$special$$inlined$map$1, C3Ek.A00);
        C9290GCr c9290GCr = new C9290GCr(C79.A00, 0, 0);
        this._effect = c9290GCr;
        this.effect = new C3pd(c9290GCr);
        OnDuplicateCall.Join join = OnDuplicateCall.Join.INSTANCE;
        C7384Etj.A0Y(join, zA1a ? 1 : 0);
        this.disconnectFlight = new LazyStartSingleFlightImpl(join);
        this.disclosureFlight = new LazyStartSingleFlightImpl(new OnDuplicateCall.SkipWhen(new HatchWhatsAppViewModel$disclosureFlight$1(this)));
        this.statusRepository = HatchChannelStatusRepository.Companion.getInstance(abstractC3358CGz);
        this.pairingLinkLogger = new ChannelPairingLinkLogger(MessagingChannel.WHATSAPP.getProvider());
    }

    private final void startConnectAttempt() {
        this.isConnectAttemptOpen = true;
        HatchClientCvmEventLogger.INSTANCE.logWhatsAppConnect(HatchClientCvmOutcome.ATTEMPT);
    }

    public final void connect(ChannelPairingEntryPoint channelPairingEntryPoint) {
        C7384Etj.A0Y(channelPairingEntryPoint, 0);
        if (ensureDisclosureLoaded()) {
            this.pairingLinkLogger.startAttempt(channelPairingEntryPoint);
            startConnectAttempt();
            HoC hoC = this.unlinkCheck;
            if (hoC != null) {
                hoC.A5w(null);
            }
            HoC hoC2 = this.statusCheck;
            if (hoC2 != null) {
                hoC2.A5w(null);
            }
            this.linkFailedNeedsUnlink = false;
            AnonymousClass001.A1J(new C136161(null), AEu.A00(this));
        }
    }

    public final void loadDisclosure() {
        fetchDisclosure(false);
    }

    public final void onDeeplinkLaunched(ChannelLaunchOutcome channelLaunchOutcome) {
        C7384Etj.A0Y(channelLaunchOutcome, 0);
        this.pairingLinkLogger.logLaunch(channelLaunchOutcome);
        if (channelLaunchOutcome.getReachedChannel()) {
            return;
        }
        finishConnectAttempt(HatchClientCvmOutcome.FAILURE);
        AnonymousClass001.A1J(new C136211(channelLaunchOutcome, null), AEu.A00(this));
    }

    public final void onScreenShown(boolean z, boolean z2, boolean z3) {
        HatchWhatsAppUiState value;
        HatchWhatsAppUiState hatchWhatsAppUiStateCopy$default;
        this.linkFailedNeedsUnlink = false;
        BLG<HatchWhatsAppUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            hatchWhatsAppUiStateCopy$default = value;
            if (z3 && hatchWhatsAppUiStateCopy$default.connectPhase == WhatsAppConnectPhase.AWAITING_RETURN) {
                hatchWhatsAppUiStateCopy$default = HatchWhatsAppUiState.copy$default(hatchWhatsAppUiStateCopy$default, false, false, false, WhatsAppConnectPhase.IDLE, null, false, null, false, false, false, null, 2023, null);
            }
            if (!hatchWhatsAppUiStateCopy$default.awaitingStatusAfterDisconnect) {
                hatchWhatsAppUiStateCopy$default = HatchWhatsAppUiState.copy$default(hatchWhatsAppUiStateCopy$default, z, z2, false, null, null, false, null, false, false, false, null, 2044, null);
            }
        } while (!blg.A6e(value, hatchWhatsAppUiStateCopy$default));
    }

    public final void replaceConnection(ChannelPairingEntryPoint channelPairingEntryPoint) {
        C7384Etj.A0Y(channelPairingEntryPoint, 0);
        if (this._uiState.getValue().replacePhase == WhatsAppReplacePhase.IDLE && ensureDisclosureLoaded()) {
            this.pairingLinkLogger.startAttempt(channelPairingEntryPoint);
            startConnectAttempt();
            HoC hoC = this.unlinkCheck;
            if (hoC != null) {
                hoC.A5w(null);
            }
            HoC hoC2 = this.statusCheck;
            if (hoC2 != null) {
                hoC2.A5w(null);
            }
            AnonymousClass001.A1J(new C136231(null), AEu.A00(this));
        }
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* loaded from: classes.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WhatsAppConnectPhase.values().length];
            try {
                AnonymousClass002.A13(WhatsAppConnectPhase.AWAITING_RETURN, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(WhatsAppConnectPhase.IDLE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(WhatsAppConnectPhase.CONNECTING, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(WhatsAppConnectPhase.POLLING, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ WhatsAppReplacePhase access$settled(HatchWhatsAppViewModel hatchWhatsAppViewModel, WhatsAppReplacePhase whatsAppReplacePhase) {
        return whatsAppReplacePhase == WhatsAppReplacePhase.SWITCHING ? WhatsAppReplacePhase.SWITCHED : whatsAppReplacePhase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r2 < r4) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (X.C7Bq.A01(1000, r7) == r8) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005e -> B:12:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitUnlinkedStatus(X.HtJ<? super java.lang.Boolean> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.facebook.aura.settings.HatchWhatsAppViewModel.AnonymousClass1
            if (r0 == 0) goto L71
            r7 = r10
            com.facebook.aura.settings.HatchWhatsAppViewModel$awaitUnlinkedStatus$1 r7 = (com.facebook.aura.settings.HatchWhatsAppViewModel.AnonymousClass1) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L71
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r3 = r7.result
            X.Hji r8 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L6b
            if (r0 == r5) goto L61
            if (r0 != r6) goto L7d
            int r2 = r7.I$1
            int r4 = r7.I$0
            X.Hwg.A00(r3)
        L27:
            int r2 = r2 + 1
            if (r2 >= r4) goto L77
        L2b:
            r0 = 0
            r7.L$0 = r0
            r7.I$0 = r4
            r7.I$1 = r2
            r7.I$2 = r2
            r7.label = r5
            java.lang.Object r3 = r9.fetchWhatsAppChannel(r7)
            if (r3 == r8) goto L60
            r1 = r2
        L3d:
            com.facebook.aura.settings.ChannelJson r3 = (com.facebook.aura.settings.ChannelJson) r3
            if (r3 == 0) goto L77
            boolean r0 = r3.isUnlinked()
            if (r0 == r5) goto L78
            boolean r0 = r3.isChecking()
            if (r0 != r5) goto L77
            r0 = 0
            r7.L$0 = r0
            r7.I$0 = r4
            r7.I$1 = r2
            r7.I$2 = r1
            r7.label = r6
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.C7Bq.A01(r0, r7)
            if (r0 != r8) goto L27
        L60:
            return r8
        L61:
            int r1 = r7.I$2
            int r2 = r7.I$1
            int r4 = r7.I$0
            X.Hwg.A00(r3)
            goto L3d
        L6b:
            X.Hwg.A00(r3)
            r4 = 5
            r2 = 0
            goto L2b
        L71:
            com.facebook.aura.settings.HatchWhatsAppViewModel$awaitUnlinkedStatus$1 r7 = new com.facebook.aura.settings.HatchWhatsAppViewModel$awaitUnlinkedStatus$1
            r7.<init>(r10)
            goto L12
        L77:
            r5 = 0
        L78:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
            return r8
        L7d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchWhatsAppViewModel.awaitUnlinkedStatus(X.HtJ):java.lang.Object");
    }

    private final boolean ensureDisclosureLoaded() {
        if (this._uiState.getValue().disclosure instanceof WhatsAppConnectDisclosure.Loaded) {
            return true;
        }
        fetchDisclosure(true);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchWhatsAppChannel(X.HtJ<? super com.facebook.aura.settings.ChannelJson> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.facebook.aura.settings.HatchWhatsAppViewModel.C136201
            if (r0 == 0) goto L66
            r4 = r9
            com.facebook.aura.settings.HatchWhatsAppViewModel$fetchWhatsAppChannel$1 r4 = (com.facebook.aura.settings.HatchWhatsAppViewModel.C136201) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L66
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L58
            if (r0 != r1) goto L6c
            X.Hwg.A00(r3)
        L20:
            java.util.List r3 = (java.util.List) r3
            r2 = 0
            if (r3 == 0) goto L57
            java.util.Iterator r3 = r3.iterator()
        L29:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.facebook.aura.settings.ChannelJson r0 = (com.facebook.aura.settings.ChannelJson) r0
            java.lang.String r1 = r0.provider
            com.facebook.aura.settings.MessagingChannel r0 = com.facebook.aura.settings.MessagingChannel.WHATSAPP
            java.lang.String r0 = r0.getProvider()
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L29
            if (r2 != 0) goto L57
        L46:
            com.facebook.aura.settings.MessagingChannel r0 = com.facebook.aura.settings.MessagingChannel.WHATSAPP
            java.lang.String r3 = r0.getProvider()
            r5 = 0
            r4 = 0
            com.facebook.aura.settings.ChannelJson r2 = new com.facebook.aura.settings.ChannelJson
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
        L57:
            return r2
        L58:
            X.Hwg.A00(r3)
            com.facebook.aura.settings.HatchChannelStatusRepository r0 = r8.statusRepository
            r4.label = r1
            java.lang.Object r3 = r0.refresh(r4)
            if (r3 != r2) goto L20
            return r2
        L66:
            com.facebook.aura.settings.HatchWhatsAppViewModel$fetchWhatsAppChannel$1 r4 = new com.facebook.aura.settings.HatchWhatsAppViewModel$fetchWhatsAppChannel$1
            r4.<init>(r9)
            goto L12
        L6c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchWhatsAppViewModel.fetchWhatsAppChannel(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishConnectAttempt(HatchClientCvmOutcome hatchClientCvmOutcome) {
        if (this.isConnectAttemptOpen) {
            this.isConnectAttemptOpen = false;
            HatchClientCvmEventLogger.INSTANCE.logWhatsAppConnect(hatchClientCvmOutcome);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object linkChannelForPairing(HtJ<? super ChannelLinkResult> htJ) {
        return this.statusRepository.link(MessagingChannel.WHATSAPP.getProvider(), htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLinkFailed(X.HtJ<? super kotlin.Unit> r20) {
        /*
            r19 = this;
            r4 = r20
            boolean r0 = r4 instanceof com.facebook.aura.settings.HatchWhatsAppViewModel.C136221
            r3 = r19
            if (r0 == 0) goto L73
            r6 = r4
            com.facebook.aura.settings.HatchWhatsAppViewModel$onLinkFailed$1 r6 = (com.facebook.aura.settings.HatchWhatsAppViewModel.C136221) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L73
            int r2 = r2 - r1
            r6.label = r2
        L16:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L37
            if (r0 != r4) goto L79
            X.Hwg.A00(r1)
        L24:
            X.BLL r2 = X.AEu.A00(r3)
            r1 = 0
            com.facebook.aura.settings.HatchWhatsAppViewModel$onLinkFailed$3 r0 = new com.facebook.aura.settings.HatchWhatsAppViewModel$onLinkFailed$3
            r0.<init>(r1)
            X.Hqc r0 = X.AnonymousClass001.A11(r0, r2)
            r3.unlinkCheck = r0
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L37:
            X.Hwg.A00(r1)
            X.BLG<com.facebook.aura.settings.HatchWhatsAppUiState> r2 = r3._uiState
        L3c:
            java.lang.Object r1 = r2.getValue()
            r7 = r1
            com.facebook.aura.settings.HatchWhatsAppUiState r7 = (com.facebook.aura.settings.HatchWhatsAppUiState) r7
            com.facebook.aura.settings.WhatsAppConnectPhase r11 = com.facebook.aura.settings.WhatsAppConnectPhase.IDLE
            r19 = 2039(0x7f7, float:2.857E-42)
            r12 = 0
            r8 = 0
            r9 = r8
            r10 = r8
            r13 = r8
            r14 = r12
            r15 = r8
            r16 = r8
            r17 = r8
            r18 = r12
            r20 = r12
            com.facebook.aura.settings.HatchWhatsAppUiState r0 = com.facebook.aura.settings.HatchWhatsAppUiState.copy$default(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r0 = r2.A6e(r1, r0)
            if (r0 == 0) goto L3c
            X.3Em<com.facebook.aura.settings.WhatsAppEffect> r2 = r3._effect
            r1 = 2131890545(0x7f121171, float:1.9415785E38)
            com.facebook.aura.settings.WhatsAppEffect$ShowToast r0 = new com.facebook.aura.settings.WhatsAppEffect$ShowToast
            r0.<init>(r1)
            r6.label = r4
            java.lang.Object r0 = r2.emit(r0, r6)
            if (r0 != r5) goto L24
            return r5
        L73:
            com.facebook.aura.settings.HatchWhatsAppViewModel$onLinkFailed$1 r6 = new com.facebook.aura.settings.HatchWhatsAppViewModel$onLinkFailed$1
            r6.<init>(r4)
            goto L16
        L79:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchWhatsAppViewModel.onLinkFailed(X.HtJ):java.lang.Object");
    }

    private final WhatsAppReplacePhase settled(WhatsAppReplacePhase whatsAppReplacePhase) {
        return whatsAppReplacePhase == WhatsAppReplacePhase.SWITCHING ? WhatsAppReplacePhase.SWITCHED : whatsAppReplacePhase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WhatsAppSheetState sheetStateFor(HatchWhatsAppUiState hatchWhatsAppUiState) {
        if (!hatchWhatsAppUiState.statusLoaded || hatchWhatsAppUiState.isLoading) {
            return WhatsAppSheetState.LOADING;
        }
        WhatsAppReplacePhase whatsAppReplacePhase = hatchWhatsAppUiState.replacePhase;
        if (whatsAppReplacePhase == WhatsAppReplacePhase.SWITCHING) {
            return WhatsAppSheetState.SWITCHING;
        }
        boolean z = hatchWhatsAppUiState.isLinked;
        return (z && hatchWhatsAppUiState.isHandoff && whatsAppReplacePhase == WhatsAppReplacePhase.IDLE) ? WhatsAppSheetState.REPLACE : z ? WhatsAppSheetState.CONNECTED : WhatsAppSheetState.CONNECT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object unlinkChannel(HtJ<? super Boolean> htJ) {
        return this.statusRepository.unlink(MessagingChannel.WHATSAPP.getProvider(), htJ);
    }

    public final void disconnect() {
        HoC hoC = this.statusCheck;
        if (hoC != null) {
            hoC.A5w(null);
        }
        AnonymousClass001.A1J(new C136171(null), AEu.A00(this));
    }

    public final void dismissDisconnectDialog() {
        HatchWhatsAppUiState value;
        BLG<HatchWhatsAppUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchWhatsAppUiState.copy$default(value, false, false, false, null, null, false, null, false, false, false, null, 2015, null)));
    }

    public final void fetchStatus() {
        HoC hoC = this.statusCheck;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.statusCheck = AnonymousClass001.A11(new C136191(null), AEu.A00(this));
    }

    public final C22I<WhatsAppEffect> getEffect() {
        return this.effect;
    }

    public final C1BN<WhatsAppSheetState> getSheetState() {
        return this.sheetState;
    }

    public final C1BN<HatchWhatsAppUiState> getUiState() {
        return this.uiState;
    }

    public final void onResumeFromWhatsApp() {
        if (this._uiState.getValue().connectPhase == WhatsAppConnectPhase.AWAITING_RETURN) {
            this.pairingLinkLogger.logReturnIfLaunched();
            startPollingForConnection();
        }
    }

    public final void onScreenResumed() {
        int iOrdinal = this._uiState.getValue().connectPhase.ordinal();
        if (iOrdinal == 2) {
            onResumeFromWhatsApp();
            return;
        }
        if (iOrdinal != 0) {
            if (iOrdinal != 1 && iOrdinal != 3) {
                throw C3cG.A0q();
            }
        } else {
            if (this.disconnectFlight.hasActiveJobForKey(Unit.INSTANCE) || this._uiState.getValue().replacePhase == WhatsAppReplacePhase.SWITCHING) {
                return;
            }
            fetchStatus();
        }
    }

    public final void onSheetShown(boolean z) {
        HatchWhatsAppUiState value;
        BLG<HatchWhatsAppUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchWhatsAppUiState.copy$default(value, false, false, false, null, null, false, null, false, z, false, null, 1791, null)));
        fetchStatus();
    }

    public final void showDisconnectDialog() {
        HatchWhatsAppUiState value;
        BLG<HatchWhatsAppUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchWhatsAppUiState.copy$default(value, false, false, false, null, null, true, null, false, false, false, null, 2015, null)));
    }

    private final void fetchDisclosure(boolean z) {
        AnonymousClass001.A1J(new C136181(z, null), AEu.A00(this));
    }

    public static /* synthetic */ void onScreenShown$default(HatchWhatsAppViewModel hatchWhatsAppViewModel, boolean z, boolean z2, boolean z3, int i, Object obj) {
        boolean zA1Q = AnonymousClass001.A1Q(i, z2);
        if ((i & 4) != 0) {
            z3 = true;
        }
        hatchWhatsAppViewModel.onScreenShown(z, zA1Q, z3);
    }

    private final void startPollingForConnection() {
        AnonymousClass001.A1J(new C136241(null), AEu.A00(this));
    }

    public /* synthetic */ HatchWhatsAppViewModel(AbstractC3358CGz abstractC3358CGz, WhatsAppConnectConsentApi whatsAppConnectConsentApi, int i, C06H c06h) {
        this(abstractC3358CGz, (i & 2) != 0 ? WhatsAppConnectConsentRepository.INSTANCE : whatsAppConnectConsentApi);
    }
}
