package com.facebook.aura.settings;

import X.A6J;
import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC08429uh;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.BLG;
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
import X.C7BY;
import X.C9286GCn;
import X.C9290GCr;
import X.C9uG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.HzP;
import X.InterfaceC08439ui;
import com.facebook.aura.R;
import com.facebook.aura.channels.ChannelLaunchOutcome;
import com.facebook.aura.graphql.AuraGraphQLQueryExecutor;
import com.facebook.aura.settings.TelegramEffect;
import com.facebook.aura.settings.support.HatchContactSupportViewModelKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HatchTelegramViewModel extends AEs {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final long POLL_INTERVAL_MS = 3000;
    public final C3Em<TelegramEffect> _effect;
    public final BLG<HatchTelegramUiState> _uiState;
    public final C22I<TelegramEffect> effect;
    public final C1BN<HatchTelegramUiState> uiState;
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
            return new HatchTelegramViewModel(this.userSession);
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

    @DebugMetadata(c = "com.facebook.aura.settings.HatchTelegramViewModel$connect$1", f = "HatchTelegramViewModel.kt", l = {127, 130, 145, 149, 154}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchTelegramViewModel$connect$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $token;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$token = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchTelegramViewModel.this.new AnonymousClass1(this.$token, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchTelegramUiState value;
            HatchTelegramUiState value2;
            C3Em<TelegramEffect> c3Em;
            TelegramEffect showToast;
            HatchTelegramUiState value3;
            HatchTelegramUiState hatchTelegramUiState;
            HatchTelegramUiState value4;
            HatchTelegramUiState value5;
            Object objLinkChannelForPairing = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objLinkChannelForPairing);
                BLG<HatchTelegramUiState> blg = HatchTelegramViewModel.this._uiState;
                do {
                    value = blg.getValue();
                } while (!C06G.A0u(value, TelegramConnectPhase.CONNECTING, value, blg));
                HatchTelegramViewModel hatchTelegramViewModel = HatchTelegramViewModel.this;
                String str = this.$token;
                this.label = 1;
                objLinkChannelForPairing = hatchTelegramViewModel.linkChannelForPairing(str, this);
                if (objLinkChannelForPairing == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2 && i != 3 && i != 4 && i != 5) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objLinkChannelForPairing);
                    return Unit.INSTANCE;
                }
                Hwg.A00(objLinkChannelForPairing);
            }
            ChannelLinkResult channelLinkResult = (ChannelLinkResult) objLinkChannelForPairing;
            if (channelLinkResult == null) {
                BLG<HatchTelegramUiState> blg2 = HatchTelegramViewModel.this._uiState;
                do {
                    value5 = blg2.getValue();
                } while (!C06G.A0u(value5, TelegramConnectPhase.IDLE, value5, blg2));
                c3Em = HatchTelegramViewModel.this._effect;
                showToast = new TelegramEffect.ShowToast(R.string._name_removed__res_0x7f1210e7);
                this.L$0 = null;
                this.label = 2;
            } else {
                String str2 = channelLinkResult.pairingUrl;
                if (str2 == null || C7BY.A0j(str2)) {
                    boolean z = channelLinkResult.isPaired;
                    BLG<HatchTelegramUiState> blg3 = HatchTelegramViewModel.this._uiState;
                    if (z) {
                        do {
                            value3 = blg3.getValue();
                            hatchTelegramUiState = value3;
                        } while (!blg3.A6e(value3, new HatchTelegramUiState(true, hatchTelegramUiState.isLoading, TelegramConnectPhase.IDLE, false, hatchTelegramUiState.showDisconnectDialog, hatchTelegramUiState.botUsername)));
                        c3Em = HatchTelegramViewModel.this._effect;
                        showToast = new TelegramEffect.ShowToast(R.string._name_removed__res_0x7f1210e8);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                    } else {
                        do {
                            value2 = blg3.getValue();
                        } while (!C06G.A0u(value2, TelegramConnectPhase.IDLE, value2, blg3));
                        c3Em = HatchTelegramViewModel.this._effect;
                        showToast = new TelegramEffect.ShowToast(R.string._name_removed__res_0x7f1210e7);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 4;
                    }
                } else {
                    BLG<HatchTelegramUiState> blg4 = HatchTelegramViewModel.this._uiState;
                    do {
                        value4 = blg4.getValue();
                    } while (!C06G.A0u(value4, TelegramConnectPhase.AWAITING_RETURN, value4, blg4));
                    c3Em = HatchTelegramViewModel.this._effect;
                    showToast = new TelegramEffect.OpenDeeplink(str2);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 5;
                }
            }
            if (c3Em.emit(showToast, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchTelegramViewModel$disconnect$1", f = "HatchTelegramViewModel.kt", l = {HatchContactSupportViewModelKt.MAX_EMAIL_LENGTH, 186, 187, AuraGraphQLQueryExecutor.API_EC_PARAM_ACCESS_TOKEN}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchTelegramViewModel$disconnect$1, reason: invalid class name and case insensitive filesystem */
    public final class C135981 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;

        public C135981(HtJ<? super C135981> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchTelegramViewModel.this.new C135981(htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0144 A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r32) {
            /*
                Method dump skipped, instructions count: 331
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchTelegramViewModel.C135981.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchTelegramViewModel.this.new C135981(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchTelegramViewModel", f = "HatchTelegramViewModel.kt", l = {291}, m = "fetchChannelLinkedStatus", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchTelegramViewModel$fetchChannelLinkedStatus$1, reason: invalid class name and case insensitive filesystem */
    public final class C135991 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C135991(HtJ<? super C135991> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchTelegramViewModel.this.fetchChannelLinkedStatus(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchTelegramViewModel$fetchStatus$1", f = "HatchTelegramViewModel.kt", l = {84}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchTelegramViewModel$fetchStatus$1, reason: invalid class name and case insensitive filesystem */
    public final class C136001 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C136001(HtJ<? super C136001> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchTelegramViewModel.this.new C136001(htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchTelegramUiState value;
            HatchTelegramUiState hatchTelegramUiState;
            HatchTelegramUiState value2;
            HatchTelegramUiState hatchTelegramUiState2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BLG<HatchTelegramUiState> blg = HatchTelegramViewModel.this._uiState;
                do {
                    value = blg.getValue();
                    hatchTelegramUiState = value;
                } while (!blg.A6e(value, hatchTelegramUiState.copy(hatchTelegramUiState.isLinked, true, hatchTelegramUiState.connectPhase, hatchTelegramUiState.showOnboarding, hatchTelegramUiState.showDisconnectDialog, hatchTelegramUiState.botUsername)));
                HatchTelegramViewModel hatchTelegramViewModel = HatchTelegramViewModel.this;
                this.label = 1;
                obj = hatchTelegramViewModel.fetchChannelLinkedStatus(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HxE hxE = (HxE) obj;
            boolean zA1X = AnonymousClass001.A1X(hxE.first);
            String str = (String) hxE.second;
            BLG<HatchTelegramUiState> blg2 = HatchTelegramViewModel.this._uiState;
            do {
                value2 = blg2.getValue();
                hatchTelegramUiState2 = value2;
            } while (!blg2.A6e(value2, hatchTelegramUiState2.copy(zA1X, false, hatchTelegramUiState2.connectPhase, hatchTelegramUiState2.showOnboarding, hatchTelegramUiState2.showDisconnectDialog, str)));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchTelegramViewModel.this.new C136001(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchTelegramViewModel", f = "HatchTelegramViewModel.kt", l = {315}, m = "linkChannelForPairing", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchTelegramViewModel$linkChannelForPairing$1, reason: invalid class name and case insensitive filesystem */
    public final class C136011 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;
        public /* synthetic */ Object result;

        public C136011(HtJ<? super C136011> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchTelegramViewModel.this.linkChannelForPairing(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchTelegramViewModel$onDeeplinkLaunched$1", f = "HatchTelegramViewModel.kt", l = {168}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchTelegramViewModel$onDeeplinkLaunched$1, reason: invalid class name and case insensitive filesystem */
    public final class C136021 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ChannelLaunchOutcome $outcome;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136021(ChannelLaunchOutcome channelLaunchOutcome, HtJ<? super C136021> htJ) {
            super(2, htJ);
            this.$outcome = channelLaunchOutcome;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchTelegramViewModel.this.new C136021(this.$outcome, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchTelegramUiState value;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BLG<HatchTelegramUiState> blg = HatchTelegramViewModel.this._uiState;
                do {
                    value = blg.getValue();
                } while (!C06G.A0u(value, TelegramConnectPhase.IDLE, value, blg));
                if (this.$outcome == ChannelLaunchOutcome.FAILED) {
                    C3Em<TelegramEffect> c3Em = HatchTelegramViewModel.this._effect;
                    TelegramEffect.ShowToast showToast = new TelegramEffect.ShowToast(R.string._name_removed__res_0x7f1210e7);
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
            return ((C136021) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchTelegramViewModel$startPollingForConnection$1", f = "HatchTelegramViewModel.kt", l = {214, 224, 227, 232}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchTelegramViewModel$startPollingForConnection$1, reason: invalid class name and case insensitive filesystem */
    public final class C136031 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public boolean Z$0;
        public int label;

        public C136031(HtJ<? super C136031> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchTelegramViewModel.this.new C136031(htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00a1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00b7 -> B:33:0x00c5). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 245
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchTelegramViewModel.C136031.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchTelegramViewModel.this.new C136031(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HatchTelegramViewModel(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        C9286GCn c9286GCn = new C9286GCn(new HatchTelegramUiState(false, false, TelegramConnectPhase.IDLE, false, false, null));
        this._uiState = c9286GCn;
        this.uiState = new C3Pi(null, c9286GCn);
        C9290GCr c9290GCr = new C9290GCr(C79.A00, 0, 0);
        this._effect = c9290GCr;
        this.effect = new C3pd(c9290GCr);
    }

    public final void connect(String str) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass001.A1J(new AnonymousClass1(str, null), AEu.A00(this));
    }

    public final void onDeeplinkLaunched(ChannelLaunchOutcome channelLaunchOutcome) {
        C7384Etj.A0Y(channelLaunchOutcome, 0);
        if (channelLaunchOutcome.getReachedChannel()) {
            return;
        }
        AnonymousClass001.A1J(new C136021(channelLaunchOutcome, null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchChannelLinkedStatus(X.HtJ<? super X.HxE<java.lang.Boolean, java.lang.String>> r19) {
        /*
            r18 = this;
            r4 = r19
            boolean r0 = r4 instanceof com.facebook.aura.settings.HatchTelegramViewModel.C135991
            r5 = r18
            if (r0 == 0) goto Lb6
            r3 = r4
            com.facebook.aura.settings.HatchTelegramViewModel$fetchChannelLinkedStatus$1 r3 = (com.facebook.aura.settings.HatchTelegramViewModel.C135991) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb6
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r1 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r6 = 0
            r14 = 1
            if (r0 == 0) goto L78
            if (r0 != r14) goto Lbd
            java.lang.Object r1 = X.AnonymousClass001.A0q(r1)
        L26:
            boolean r0 = r1 instanceof X.C10571Hud
            r4 = 0
            if (r0 == 0) goto L2c
            r1 = r4
        L2c:
            com.facebook.aura.settings.ChannelsPayloadJson r1 = (com.facebook.aura.settings.ChannelsPayloadJson) r1
            if (r1 == 0) goto L73
            java.util.List r0 = r1.detailedChannels()
            if (r0 == 0) goto L73
            java.util.Iterator r2 = r0.iterator()
        L3a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r3 = r2.next()
            r0 = r3
            com.facebook.aura.settings.ChannelJson r0 = (com.facebook.aura.settings.ChannelJson) r0
            java.lang.String r1 = r0.provider
            java.lang.String r0 = "telegram"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3a
        L51:
            com.facebook.aura.settings.ChannelJson r3 = (com.facebook.aura.settings.ChannelJson) r3
            if (r3 != 0) goto L5f
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
        L59:
            X.HxE r0 = new X.HxE
            r0.<init>(r2, r4)
            return r0
        L5f:
            boolean r0 = r3.linked
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = r3.bot_username
            if (r1 == 0) goto L59
            int r0 = r1.length()
            if (r0 <= 0) goto L59
            r4 = r1
            goto L59
        L71:
            r3 = r4
            goto L51
        L73:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            goto L59
        L78:
            X.Hwg.A00(r1)
            com.facebook.aura.network.http.HatchHttpApi r4 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.network.api.JarvisPath$ChannelsStatus r7 = com.facebook.aura.network.api.JarvisPath.ChannelsStatus.INSTANCE
            com.facebook.aura.network.http.RequestType r8 = com.facebook.aura.network.http.RequestType.GET
            X.CGz r9 = r5.userSession
            X.HxE[] r11 = new X.HxE[r6]
            java.util.Set r13 = X.AnonymousClass004.A18()
            X.9jH r15 = X.AGH.A0E()
            com.facebook.aura.settings.HatchTelegramViewModel$fetchChannelLinkedStatus$$inlined$executeJarvisRequest-1iavgos$default$1 r5 = com.facebook.aura.settings.HatchTelegramViewModel$fetchChannelLinkedStatus$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r10 = 0
            r3.L$0 = r10
            r3.L$1 = r10
            r3.L$2 = r10
            r3.L$3 = r10
            r3.L$4 = r10
            r3.L$5 = r10
            r3.L$6 = r10
            r3.I$0 = r14
            r3.I$1 = r14
            r3.I$2 = r6
            r3.label = r14
            r12 = r10
            r16 = r14
            r17 = r10
            r18 = r6
            r19 = r3
            java.lang.Object r1 = r4.m1595executeBodylessJarvisRequestWithp3iPjrY(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            if (r1 != r2) goto L26
            return r2
        Lb6:
            com.facebook.aura.settings.HatchTelegramViewModel$fetchChannelLinkedStatus$1 r3 = new com.facebook.aura.settings.HatchTelegramViewModel$fetchChannelLinkedStatus$1
            r3.<init>(r4)
            goto L16
        Lbd:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchTelegramViewModel.fetchChannelLinkedStatus(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object linkChannelForPairing(java.lang.String r27, X.HtJ<? super com.facebook.aura.settings.ChannelLinkResult> r28) {
        /*
            r26 = this;
            r4 = r28
            boolean r0 = r4 instanceof com.facebook.aura.settings.HatchTelegramViewModel.C136011
            r5 = r26
            if (r0 == 0) goto L98
            r2 = r4
            com.facebook.aura.settings.HatchTelegramViewModel$linkChannelForPairing$1 r2 = (com.facebook.aura.settings.HatchTelegramViewModel.C136011) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L98
            int r3 = r3 - r1
            r2.label = r3
        L16:
            java.lang.Object r4 = r2.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r2.label
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto La0
            java.lang.Object r2 = X.AnonymousClass001.A0q(r4)
        L25:
            boolean r1 = r2 instanceof X.C10571Hud
            r0 = 0
            if (r1 == 0) goto L2b
            r2 = r0
        L2b:
            com.facebook.aura.settings.ChannelLinkOuterJson r2 = (com.facebook.aura.settings.ChannelLinkOuterJson) r2
            if (r2 == 0) goto L9f
            com.facebook.aura.settings.ChannelLinkResult r3 = com.facebook.aura.settings.HatchChannelsJsonKt.toDomain(r2)
            return r3
        L34:
            X.Hwg.A00(r4)
            com.facebook.aura.network.http.HatchHttpApi r6 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.network.api.JarvisPath$ChannelsLink r10 = com.facebook.aura.network.api.JarvisPath.ChannelsLink.INSTANCE
            java.lang.String r0 = "telegram"
            com.facebook.aura.settings.ChannelProviderRequestJson r11 = new com.facebook.aura.settings.ChannelProviderRequestJson
            r4 = r27
            r11.<init>(r0, r4)
            com.facebook.aura.network.http.RequestType r12 = com.facebook.aura.network.http.RequestType.POST
            X.CGz r13 = r5.userSession
            r9 = 0
            X.HxE[] r0 = new X.HxE[r9]
            java.util.Set r17 = X.AnonymousClass004.A18()
            X.9jH r20 = X.AGH.A0E()
            com.facebook.aura.settings.HatchTelegramViewModel$linkChannelForPairing$$inlined$executeJarvisRequest-Z6QaZII$default$1 r7 = com.facebook.aura.settings.HatchTelegramViewModel$linkChannelForPairing$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
            com.facebook.aura.settings.HatchTelegramViewModel$linkChannelForPairing$$inlined$executeJarvisRequest-Z6QaZII$default$2 r8 = com.facebook.aura.settings.HatchTelegramViewModel$linkChannelForPairing$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r14 = 0
            r2.L$0 = r14
            r2.L$1 = r14
            r2.L$2 = r14
            r2.L$3 = r14
            r2.L$4 = r14
            r2.L$5 = r14
            r2.L$6 = r14
            r2.L$7 = r14
            r2.L$8 = r14
            r2.I$0 = r1
            r2.I$1 = r1
            r2.I$2 = r9
            r2.I$3 = r1
            r2.I$4 = r9
            r2.I$5 = r9
            r2.I$6 = r9
            r2.label = r1
            r15 = r14
            r19 = r1
            r21 = r14
            r22 = r9
            r23 = r1
            r24 = r9
            r25 = r9
            r26 = r14
            r27 = r9
            r28 = r2
            r18 = r1
            r16 = r0
            java.lang.Object r2 = r6.m1599executeJarvisRequestWithFof5HsY(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            if (r2 != r3) goto L25
            return r3
        L98:
            com.facebook.aura.settings.HatchTelegramViewModel$linkChannelForPairing$1 r2 = new com.facebook.aura.settings.HatchTelegramViewModel$linkChannelForPairing$1
            r2.<init>(r4)
            goto L16
        L9f:
            return r0
        La0:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchTelegramViewModel.linkChannelForPairing(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final void dismissDisconnectDialog() {
        HatchTelegramUiState value;
        HatchTelegramUiState hatchTelegramUiState;
        BLG<HatchTelegramUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            hatchTelegramUiState = value;
        } while (!blg.A6e(value, hatchTelegramUiState.copy(hatchTelegramUiState.isLinked, hatchTelegramUiState.isLoading, hatchTelegramUiState.connectPhase, hatchTelegramUiState.showOnboarding, false, hatchTelegramUiState.botUsername)));
    }

    public final void dismissOnboarding() {
        HatchTelegramUiState value;
        HatchTelegramUiState hatchTelegramUiState;
        TelegramConnectPhase telegramConnectPhase = this._uiState.getValue().connectPhase;
        if (telegramConnectPhase == TelegramConnectPhase.CONNECTING || telegramConnectPhase == TelegramConnectPhase.POLLING) {
            return;
        }
        BLG<HatchTelegramUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            hatchTelegramUiState = value;
        } while (!blg.A6e(value, hatchTelegramUiState.copy(hatchTelegramUiState.isLinked, hatchTelegramUiState.isLoading, hatchTelegramUiState.connectPhase, false, hatchTelegramUiState.showDisconnectDialog, hatchTelegramUiState.botUsername)));
    }

    public final C22I<TelegramEffect> getEffect() {
        return this.effect;
    }

    public final C1BN<HatchTelegramUiState> getUiState() {
        return this.uiState;
    }

    public final void onResumeFromTelegram() {
        if (this._uiState.getValue().connectPhase == TelegramConnectPhase.AWAITING_RETURN) {
            startPollingForConnection();
        }
    }

    public final void onScreenShown(boolean z) {
        HatchTelegramUiState value;
        HatchTelegramUiState hatchTelegramUiState;
        BLG<HatchTelegramUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            hatchTelegramUiState = value;
        } while (!blg.A6e(value, hatchTelegramUiState.copy(z, hatchTelegramUiState.isLoading, hatchTelegramUiState.connectPhase, hatchTelegramUiState.showOnboarding, hatchTelegramUiState.showDisconnectDialog, hatchTelegramUiState.botUsername)));
        fetchStatus();
    }

    public final void showDisconnectDialog() {
        HatchTelegramUiState value;
        HatchTelegramUiState hatchTelegramUiState;
        BLG<HatchTelegramUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            hatchTelegramUiState = value;
        } while (!blg.A6e(value, hatchTelegramUiState.copy(hatchTelegramUiState.isLinked, hatchTelegramUiState.isLoading, hatchTelegramUiState.connectPhase, hatchTelegramUiState.showOnboarding, true, hatchTelegramUiState.botUsername)));
    }

    public final void showOnboarding() {
        HatchTelegramUiState value;
        HatchTelegramUiState hatchTelegramUiState;
        BLG<HatchTelegramUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            hatchTelegramUiState = value;
        } while (!blg.A6e(value, hatchTelegramUiState.copy(hatchTelegramUiState.isLinked, hatchTelegramUiState.isLoading, hatchTelegramUiState.connectPhase, true, hatchTelegramUiState.showDisconnectDialog, hatchTelegramUiState.botUsername)));
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final void startPollingForConnection() {
        AnonymousClass001.A1J(new C136031(null), AEu.A00(this));
    }

    public final void disconnect() {
        AnonymousClass001.A1J(new C135981(null), AEu.A00(this));
    }

    public final void fetchStatus() {
        AnonymousClass001.A1J(new C136001(null), AEu.A00(this));
    }
}
