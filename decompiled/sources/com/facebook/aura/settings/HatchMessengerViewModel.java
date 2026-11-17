package com.facebook.aura.settings;

import X.A6J;
import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC08429uh;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BLG;
import X.BLL;
import X.C06G;
import X.C06H;
import X.C1BN;
import X.C22I;
import X.C3Em;
import X.C3Pi;
import X.C3UX;
import X.C3pd;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.C9290GCr;
import X.C9uG;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.InterfaceC08439ui;
import com.facebook.aura.R;
import com.facebook.aura.channels.ChannelLaunchOutcome;
import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.fxcache.LinkedAccountsRepository;
import com.facebook.aura.fxcache.LinkedFacebookAccount;
import com.facebook.aura.settings.MessengerEffect;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HatchMessengerViewModel extends AEs {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final long POLL_INTERVAL_MS = 3000;
    public static final String TAG = "HatchMessengerViewModel";
    public final C3Em<MessengerEffect> _effect;
    public final BLG<HatchMessengerUiState> _uiState;
    public final C22I<MessengerEffect> effect;
    public HoC fetchFBAccountsJob;
    public HoC fetchStatusJob;
    public boolean hasShownAccountLinkingUpsell;
    public final HatchMessengerRepository repository;
    public final C1BN<HatchMessengerUiState> uiState;
    public final AbstractC3358CGz userSession;

    /* loaded from: classes4.dex */
    public final class Factory implements InterfaceC08439ui {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.InterfaceC08439ui
        public <T extends AEs> T create(Class<T> cls) {
            return new HatchMessengerViewModel(this.userSession, null, 2, 0 == true ? 1 : 0);
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

    @DebugMetadata(c = "com.facebook.aura.settings.HatchMessengerViewModel$connect$1", f = "HatchMessengerViewModel.kt", l = {153, 156, 174, 178, 185, 189}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchMessengerViewModel$connect$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchMessengerViewModel.this.new AnonymousClass1(htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x004c A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:7:0x0013, B:8:0x0017, B:10:0x0037, B:14:0x0048, B:16:0x004c, B:17:0x0050, B:19:0x0070, B:23:0x008b, B:25:0x008e, B:27:0x0092, B:29:0x0098, B:30:0x009c, B:32:0x00bb, B:33:0x00d1, B:35:0x00d5, B:37:0x00d9, B:38:0x00dd, B:40:0x00fd, B:44:0x011a, B:46:0x011d, B:48:0x0121, B:51:0x0128, B:52:0x012c, B:54:0x0154, B:58:0x0170, B:13:0x0045, B:22:0x0088, B:43:0x0117, B:57:0x016d, B:60:0x0173), top: B:71:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x008e A[Catch: Exception -> 0x0177, TryCatch #0 {Exception -> 0x0177, blocks: (B:7:0x0013, B:8:0x0017, B:10:0x0037, B:14:0x0048, B:16:0x004c, B:17:0x0050, B:19:0x0070, B:23:0x008b, B:25:0x008e, B:27:0x0092, B:29:0x0098, B:30:0x009c, B:32:0x00bb, B:33:0x00d1, B:35:0x00d5, B:37:0x00d9, B:38:0x00dd, B:40:0x00fd, B:44:0x011a, B:46:0x011d, B:48:0x0121, B:51:0x0128, B:52:0x012c, B:54:0x0154, B:58:0x0170, B:13:0x0045, B:22:0x0088, B:43:0x0117, B:57:0x016d, B:60:0x0173), top: B:71:0x0008 }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 472
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchMessengerViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchMessengerViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchMessengerViewModel$disconnect$1", f = "HatchMessengerViewModel.kt", l = {273, 284, 288, 293}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchMessengerViewModel$disconnect$1, reason: invalid class name and case insensitive filesystem */
    public final class C135481 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public boolean Z$0;
        public int label;

        public C135481(HtJ<? super C135481> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchMessengerViewModel.this.new C135481(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchMessengerUiState value;
            HatchMessengerUiState value2;
            HatchMessengerUiState value3;
            HatchMessengerUiState value4;
            HatchMessengerUiState hatchMessengerUiState;
            Object objUnlinkChannel = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (Exception e) {
                CFK.A0J(HatchMessengerViewModel.TAG, e, "disconnect failed");
                BLG<HatchMessengerUiState> blg = HatchMessengerViewModel.this._uiState;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, HatchMessengerUiState.copy$default(value, false, false, null, null, false, null, false, false, null, null, 1021, null)));
                C3Em<MessengerEffect> c3Em = HatchMessengerViewModel.this._effect;
                MessengerEffect.ShowToast showToast = new MessengerEffect.ShowToast(R.string._name_removed__res_0x7f120cf2);
                this.L$0 = null;
                this.label = 4;
                if (c3Em.emit(showToast, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            if (i == 0) {
                Hwg.A00(objUnlinkChannel);
                BLG<HatchMessengerUiState> blg2 = HatchMessengerViewModel.this._uiState;
                do {
                    value2 = blg2.getValue();
                } while (!blg2.A6e(value2, HatchMessengerUiState.copy$default(value2, false, true, null, null, false, null, false, false, null, null, 1005, null)));
                HatchMessengerRepository hatchMessengerRepository = HatchMessengerViewModel.this.repository;
                this.label = 1;
                objUnlinkChannel = hatchMessengerRepository.unlinkChannel(this);
                if (objUnlinkChannel == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2 && i != 3 && i != 4) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objUnlinkChannel);
                    return Unit.INSTANCE;
                }
                Hwg.A00(objUnlinkChannel);
            }
            boolean zA1X = AnonymousClass001.A1X(objUnlinkChannel);
            if (zA1X) {
                BLG<HatchMessengerUiState> blg3 = HatchMessengerViewModel.this._uiState;
                do {
                    value4 = blg3.getValue();
                    hatchMessengerUiState = value4;
                } while (!blg3.A6e(value4, hatchMessengerUiState.copy(false, false, hatchMessengerUiState.connectPhase, hatchMessengerUiState.pairingUrl, hatchMessengerUiState.showDisconnectDialog, hatchMessengerUiState.linkedFBAccount, false, hatchMessengerUiState.showAccountLinkingUpsell, null, hatchMessengerUiState.pendingToastResId)));
                C3Em<MessengerEffect> c3Em2 = HatchMessengerViewModel.this._effect;
                MessengerEffect.ShowToast showToast2 = new MessengerEffect.ShowToast(R.string._name_removed__res_0x7f120cf3);
                this.Z$0 = zA1X;
                this.label = 2;
                if (c3Em2.emit(showToast2, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                CFK.A06(HatchMessengerViewModel.TAG, "disconnect: failed");
                BLG<HatchMessengerUiState> blg4 = HatchMessengerViewModel.this._uiState;
                do {
                    value3 = blg4.getValue();
                } while (!C06G.A0t(value3, value3, blg4, 1021));
                C3Em<MessengerEffect> c3Em3 = HatchMessengerViewModel.this._effect;
                MessengerEffect.ShowToast showToast3 = new MessengerEffect.ShowToast(R.string._name_removed__res_0x7f120cf2);
                this.Z$0 = zA1X;
                this.label = 3;
                if (c3Em3.emit(showToast3, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchMessengerViewModel.this.new C135481(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchMessengerViewModel$fetchLinkedFBAccounts$1", f = "HatchMessengerViewModel.kt", l = {226}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchMessengerViewModel$fetchLinkedFBAccounts$1, reason: invalid class name and case insensitive filesystem */
    public final class C135491 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C135491(HtJ<? super C135491> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchMessengerViewModel.this.new C135491(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchMessengerUiState value;
            HatchMessengerUiState hatchMessengerUiState;
            LinkedFBAccountInfo linkedFBAccountInfo;
            boolean z;
            Object objFetchLinkedFacebookAccount = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objFetchLinkedFacebookAccount);
                LinkedAccountsRepository companion = LinkedAccountsRepository.Companion.getInstance(HatchMessengerViewModel.this.userSession);
                this.label = 1;
                objFetchLinkedFacebookAccount = companion.fetchLinkedFacebookAccount(this);
                if (objFetchLinkedFacebookAccount == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objFetchLinkedFacebookAccount);
            }
            LinkedFacebookAccount linkedFacebookAccount = (LinkedFacebookAccount) objFetchLinkedFacebookAccount;
            HatchMessengerViewModel hatchMessengerViewModel = HatchMessengerViewModel.this;
            BLG<HatchMessengerUiState> blg = hatchMessengerViewModel._uiState;
            do {
                value = blg.getValue();
                hatchMessengerUiState = value;
                if (linkedFacebookAccount != null) {
                    linkedFBAccountInfo = new LinkedFBAccountInfo(linkedFacebookAccount.name, linkedFacebookAccount.profilePictureUrl);
                } else {
                    linkedFBAccountInfo = null;
                    z = true;
                    if (hatchMessengerViewModel.hasShownAccountLinkingUpsell) {
                    }
                }
                z = false;
            } while (!blg.A6e(value, hatchMessengerUiState.copy(hatchMessengerUiState.isLinked, hatchMessengerUiState.isLoading, hatchMessengerUiState.connectPhase, hatchMessengerUiState.pairingUrl, hatchMessengerUiState.showDisconnectDialog, linkedFBAccountInfo, true, z, hatchMessengerUiState.agentId, hatchMessengerUiState.pendingToastResId)));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchMessengerViewModel.this.new C135491(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchMessengerViewModel$fetchStatus$1", f = "HatchMessengerViewModel.kt", l = {118}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchMessengerViewModel$fetchStatus$1, reason: invalid class name and case insensitive filesystem */
    public final class C135501 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C135501(HtJ<? super C135501> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchMessengerViewModel.this.new C135501(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchMessengerUiState value;
            HatchMessengerUiState value2;
            HatchMessengerUiState value3;
            HatchMessengerUiState hatchMessengerUiState;
            boolean z;
            Object objFetchChannelStatus = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(objFetchChannelStatus);
                    BLG<HatchMessengerUiState> blg = HatchMessengerViewModel.this._uiState;
                    do {
                        value2 = blg.getValue();
                    } while (!blg.A6e(value2, HatchMessengerUiState.copy$default(value2, false, true, null, null, false, null, false, false, null, null, 1021, null)));
                    HatchMessengerRepository hatchMessengerRepository = HatchMessengerViewModel.this.repository;
                    this.label = 1;
                    objFetchChannelStatus = hatchMessengerRepository.fetchChannelStatus(this);
                    if (objFetchChannelStatus == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objFetchChannelStatus);
                }
                MessengerChannelStatus messengerChannelStatus = (MessengerChannelStatus) objFetchChannelStatus;
                BLG<HatchMessengerUiState> blg2 = HatchMessengerViewModel.this._uiState;
                do {
                    value3 = blg2.getValue();
                    hatchMessengerUiState = value3;
                    z = messengerChannelStatus.isLinked;
                } while (!blg2.A6e(value3, hatchMessengerUiState.copy(z, false, hatchMessengerUiState.connectPhase, hatchMessengerUiState.pairingUrl, hatchMessengerUiState.showDisconnectDialog, hatchMessengerUiState.linkedFBAccount, hatchMessengerUiState.hasFetchedFBAccounts, hatchMessengerUiState.showAccountLinkingUpsell, z ? messengerChannelStatus.agentId : null, hatchMessengerUiState.pendingToastResId)));
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0J(HatchMessengerViewModel.TAG, e2, "fetchStatus failed");
                BLG<HatchMessengerUiState> blg3 = HatchMessengerViewModel.this._uiState;
                do {
                    value = blg3.getValue();
                } while (!C06G.A0t(value, value, blg3, 1021));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchMessengerViewModel.this.new C135501(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchMessengerViewModel$onDeeplinkLaunched$1", f = "HatchMessengerViewModel.kt", l = {HatchWidgetWebViewKt.HTTP_NO_CONTENT}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchMessengerViewModel$onDeeplinkLaunched$1, reason: invalid class name and case insensitive filesystem */
    public final class C135511 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ChannelLaunchOutcome $outcome;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135511(ChannelLaunchOutcome channelLaunchOutcome, HtJ<? super C135511> htJ) {
            super(2, htJ);
            this.$outcome = channelLaunchOutcome;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchMessengerViewModel.this.new C135511(this.$outcome, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchMessengerUiState value;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BLG<HatchMessengerUiState> blg = HatchMessengerViewModel.this._uiState;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, HatchMessengerUiState.copy$default(value, false, false, MessengerConnectPhase.IDLE, null, false, null, false, false, null, null, 1011, null)));
                if (this.$outcome == ChannelLaunchOutcome.FAILED) {
                    C3Em<MessengerEffect> c3Em = HatchMessengerViewModel.this._effect;
                    MessengerEffect.ShowToast showToast = new MessengerEffect.ShowToast(R.string._name_removed__res_0x7f120ced);
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
            return ((C135511) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchMessengerViewModel$startPollingForConnection$1", f = "HatchMessengerViewModel.kt", l = {318, 329, 332, 337}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchMessengerViewModel$startPollingForConnection$1, reason: invalid class name and case insensitive filesystem */
    public final class C135521 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public int label;

        public C135521(HtJ<? super C135521> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchMessengerViewModel.this.new C135521(htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x006d A[Catch: Exception -> 0x013e, TryCatch #0 {Exception -> 0x013e, blocks: (B:8:0x0016, B:12:0x0028, B:19:0x0068, B:22:0x006d, B:26:0x0086, B:28:0x008c, B:29:0x008e, B:31:0x00cc, B:39:0x00fc, B:34:0x00e2, B:42:0x0100, B:43:0x0104, B:45:0x0125, B:38:0x00f9, B:25:0x0083, B:15:0x003a, B:16:0x003e, B:18:0x0062), top: B:54:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x008c A[Catch: Exception -> 0x013e, TryCatch #0 {Exception -> 0x013e, blocks: (B:8:0x0016, B:12:0x0028, B:19:0x0068, B:22:0x006d, B:26:0x0086, B:28:0x008c, B:29:0x008e, B:31:0x00cc, B:39:0x00fc, B:34:0x00e2, B:42:0x0100, B:43:0x0104, B:45:0x0125, B:38:0x00f9, B:25:0x0083, B:15:0x003a, B:16:0x003e, B:18:0x0062), top: B:54:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e2 A[Catch: Exception -> 0x013e, TryCatch #0 {Exception -> 0x013e, blocks: (B:8:0x0016, B:12:0x0028, B:19:0x0068, B:22:0x006d, B:26:0x0086, B:28:0x008c, B:29:0x008e, B:31:0x00cc, B:39:0x00fc, B:34:0x00e2, B:42:0x0100, B:43:0x0104, B:45:0x0125, B:38:0x00f9, B:25:0x0083, B:15:0x003a, B:16:0x003e, B:18:0x0062), top: B:54:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0100 A[Catch: Exception -> 0x013e, TryCatch #0 {Exception -> 0x013e, blocks: (B:8:0x0016, B:12:0x0028, B:19:0x0068, B:22:0x006d, B:26:0x0086, B:28:0x008c, B:29:0x008e, B:31:0x00cc, B:39:0x00fc, B:34:0x00e2, B:42:0x0100, B:43:0x0104, B:45:0x0125, B:38:0x00f9, B:25:0x0083, B:15:0x003a, B:16:0x003e, B:18:0x0062), top: B:54:0x000c }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00f5 -> B:19:0x0068). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 364
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchMessengerViewModel.C135521.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchMessengerViewModel.this.new C135521(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void onAccountLinkingUpsellShown() {
        HatchMessengerUiState value;
        this.hasShownAccountLinkingUpsell = true;
        BLG<HatchMessengerUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!C06G.A0t(value, value, blg, 895));
    }

    public final void onDeeplinkLaunched(ChannelLaunchOutcome channelLaunchOutcome) {
        C7384Etj.A0Y(channelLaunchOutcome, 0);
        if (channelLaunchOutcome.getReachedChannel()) {
            return;
        }
        AnonymousClass001.A1J(new C135511(channelLaunchOutcome, null), AEu.A00(this));
    }

    public final void connect() {
        HtJ htJA13 = AnonymousClass006.A13(this.fetchStatusJob);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(htJA13), AEu.A00(this));
    }

    public final void consumePendingToast() {
        HatchMessengerUiState value;
        BLG<HatchMessengerUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!C06G.A0t(value, value, blg, 511));
    }

    public final void disconnect() {
        HtJ htJA13 = AnonymousClass006.A13(this.fetchStatusJob);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C135481(htJA13), AEu.A00(this));
    }

    public final void dismissDisconnectDialog() {
        HatchMessengerUiState value;
        BLG<HatchMessengerUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!C06G.A0t(value, value, blg, 1007));
    }

    public final void fetchLinkedFBAccounts() {
        if (this._uiState.getValue().hasFetchedFBAccounts) {
            return;
        }
        HtJ htJA13 = AnonymousClass006.A13(this.fetchFBAccountsJob);
        BLL bllA00 = AEu.A00(this);
        this.fetchFBAccountsJob = GAo.A02(C79.A00, AnonymousClass001.A0y(), new C135491(htJA13), bllA00);
    }

    public final void fetchStatus() {
        HtJ htJA13 = AnonymousClass006.A13(this.fetchStatusJob);
        BLL bllA00 = AEu.A00(this);
        this.fetchStatusJob = GAo.A02(C79.A00, AnonymousClass001.A0y(), new C135501(htJA13), bllA00);
    }

    public final C22I<MessengerEffect> getEffect() {
        return this.effect;
    }

    public final C1BN<HatchMessengerUiState> getUiState() {
        return this.uiState;
    }

    public final void invalidateFBAccountCache() {
        HatchMessengerUiState value;
        BLG<HatchMessengerUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!C06G.A0t(value, value, blg, 959));
    }

    public final void onResumeFromMessenger() {
        if (this._uiState.getValue().connectPhase == MessengerConnectPhase.AWAITING_RETURN) {
            startPollingForConnection();
        }
    }

    public final void onScreenShown(boolean z) {
        HatchMessengerUiState value;
        HatchMessengerUiState hatchMessengerUiState;
        BLG<HatchMessengerUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            hatchMessengerUiState = value;
        } while (!blg.A6e(value, HatchMessengerUiState.copy$default(hatchMessengerUiState, z, false, null, null, false, null, false, false, z ? hatchMessengerUiState.agentId : null, null, 766, null)));
        fetchStatus();
    }

    public final void showDisconnectDialog() {
        HatchMessengerUiState value;
        BLG<HatchMessengerUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchMessengerUiState.copy$default(value, false, false, null, null, true, null, false, false, null, null, 1007, null)));
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchMessengerViewModel(AbstractC3358CGz abstractC3358CGz, HatchMessengerRepository hatchMessengerRepository) {
        boolean zA1b = AnonymousClass004.A1b(abstractC3358CGz, hatchMessengerRepository);
        this.userSession = abstractC3358CGz;
        this.repository = hatchMessengerRepository;
        C9286GCn c9286GCn = new C9286GCn(new HatchMessengerUiState(zA1b, zA1b, MessengerConnectPhase.IDLE, null, zA1b, null, zA1b, zA1b, null, null));
        this._uiState = c9286GCn;
        this.uiState = new C3Pi(null, c9286GCn);
        C9290GCr c9290GCr = new C9290GCr(C79.A00, zA1b ? 1 : 0, zA1b ? 1 : 0);
        this._effect = c9290GCr;
        this.effect = new C3pd(c9290GCr);
    }

    private final void startPollingForConnection() {
        AnonymousClass001.A1I(AuraDispatchers.INSTANCE.m764default(), new C135521(null), AEu.A00(this));
    }

    public /* synthetic */ HatchMessengerViewModel(AbstractC3358CGz abstractC3358CGz, HatchMessengerRepository hatchMessengerRepository, int i, C06H c06h) {
        this(abstractC3358CGz, (i & 2) != 0 ? new HatchMessengerRepository(abstractC3358CGz) : hatchMessengerRepository);
    }
}
