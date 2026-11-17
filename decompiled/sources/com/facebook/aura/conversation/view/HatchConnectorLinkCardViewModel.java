package com.facebook.aura.conversation.view;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BLG;
import X.C06H;
import X.C0881AGi;
import X.C1BN;
import X.C20Q;
import X.C3UX;
import X.C7384Etj;
import X.C9286GCn;
import X.G0U;
import X.G0V;
import X.HtJ;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.skills.repo.HatchConnectorCatalogRepository;
import com.facebook.aura.skills.repo.SkillsConnectorAccountsRepository;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HatchConnectorLinkCardViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<Boolean> _isReconnecting;
    public final SkillsConnectorAccountsRepository accountsRepository;
    public final HatchGatewayConnection gateway;
    public final C1BN<Boolean> isReconnecting;
    public final BLG<String> observedConnectorId;
    public final C20Q<Boolean> otherWalletConnected;
    public final List<String> otherWalletIds;
    public final HatchConnectorCatalogRepository repository;
    public final C1BN<ConnectorCardState> uiState;

    public final class Factory extends AuraViewModelFactory<HatchConnectorLinkCardViewModel> {
        public static final int $stable = 8;
        public final String connectUrl;
        public final String connectorId;
        public final AbstractC3358CGz userSession;
        public final List<String> walletConnectorIds;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchConnectorLinkCardViewModel create() {
            return new HatchConnectorLinkCardViewModel(this.userSession, this.connectorId, this.connectUrl, this.walletConnectorIds);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str, String str2, List<String> list) {
            AnonymousClass003.A0w(abstractC3358CGz, list);
            this.userSession = abstractC3358CGz;
            this.connectorId = str;
            this.connectUrl = str2;
            this.walletConnectorIds = list;
        }

        public /* synthetic */ Factory(AbstractC3358CGz abstractC3358CGz, String str, String str2, List list, int i, C06H c06h) {
            this(abstractC3358CGz, str, str2, (i & 8) != 0 ? C0881AGi.A00 : list);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConnectorLinkCardViewModel$reconnect$1", f = "HatchConnectorLinkCardViewModel.kt", l = {109}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchConnectorLinkCardViewModel$reconnect$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $accountId;
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ G0U<String, Unit> $onLinkReady;
        public final /* synthetic */ String $sourceSessionId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, String str2, String str3, G0U<? super String, Unit> g0u, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$connectorId = str;
            this.$accountId = str2;
            this.$sourceSessionId = str3;
            this.$onLinkReady = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConnectorLinkCardViewModel.this.new AnonymousClass1(this.$connectorId, this.$accountId, this.$sourceSessionId, this.$onLinkReady, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0084 A[Catch: all -> 0x0095, TRY_LEAVE, TryCatch #0 {all -> 0x0095, blocks: (B:12:0x0025, B:13:0x0029, B:15:0x0035, B:16:0x0039, B:18:0x003e, B:21:0x0044, B:24:0x004a, B:39:0x007c, B:41:0x0084, B:31:0x005e, B:34:0x0065, B:36:0x006d, B:38:0x0073, B:9:0x0012), top: B:47:0x0005 }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r6.label
                r4 = 1
                if (r0 == 0) goto Lf
                if (r0 != r4) goto La
                goto L25
            La:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            Lf:
                X.Hwg.A00(r7)
                com.facebook.aura.conversation.view.HatchConnectorLinkCardViewModel r0 = com.facebook.aura.conversation.view.HatchConnectorLinkCardViewModel.this     // Catch: java.lang.Throwable -> L95
                com.facebook.aura.skills.repo.SkillsConnectorAccountsRepository r3 = r0.accountsRepository     // Catch: java.lang.Throwable -> L95
                java.lang.String r2 = r6.$connectorId     // Catch: java.lang.Throwable -> L95
                java.lang.String r1 = r6.$accountId     // Catch: java.lang.Throwable -> L95
                java.lang.String r0 = r6.$sourceSessionId     // Catch: java.lang.Throwable -> L95
                r6.label = r4     // Catch: java.lang.Throwable -> L95
                java.lang.Object r2 = r3.m2127fetchReconnectLinkUrlBWLJW6A(r2, r1, r0, r6)     // Catch: java.lang.Throwable -> L95
                if (r2 != r5) goto L29
                return r5
            L25:
                java.lang.Object r2 = X.AnonymousClass001.A0q(r7)     // Catch: java.lang.Throwable -> L95
            L29:
                X.G0U<java.lang.String, kotlin.Unit> r0 = r6.$onLinkReady     // Catch: java.lang.Throwable -> L95
                com.facebook.aura.conversation.view.HatchConnectorLinkCardViewModel r5 = com.facebook.aura.conversation.view.HatchConnectorLinkCardViewModel.this     // Catch: java.lang.Throwable -> L95
                java.lang.String r4 = r6.$connectorId     // Catch: java.lang.Throwable -> L95
                java.lang.Throwable r1 = X.HsJ.A00(r2)     // Catch: java.lang.Throwable -> L95
                if (r1 != 0) goto L39
                r0.invoke(r2)     // Catch: java.lang.Throwable -> L95
                goto L8a
            L39:
                boolean r0 = r1 instanceof com.facebook.aura.json.NetworkException     // Catch: java.lang.Throwable -> L95
                r3 = 0
                if (r0 == 0) goto L41
                com.facebook.aura.json.NetworkException r1 = (com.facebook.aura.json.NetworkException) r1     // Catch: java.lang.Throwable -> L95
                goto L42
            L41:
                r1 = r3
            L42:
                if (r1 == 0) goto L46
                java.lang.String r3 = r1.errorCode     // Catch: java.lang.Throwable -> L95
            L46:
                java.lang.String r2 = "reauth_not_required"
                if (r3 == 0) goto L6d
                int r1 = r3.hashCode()     // Catch: java.lang.Throwable -> L95
                r0 = -227623207(0xfffffffff26ebed9, float:-4.7288418E30)
                if (r1 == r0) goto L65
                r0 = 1146546927(0x4456eaef, float:859.67084)
                if (r1 == r0) goto L5e
                r0 = 1615526678(0x604afb16, float:5.8505234E19)
                if (r1 != r0) goto L6d
                goto L7c
            L5e:
                boolean r0 = r3.equals(r2)     // Catch: java.lang.Throwable -> L95
                if (r0 != 0) goto L84
                goto L6d
            L65:
                java.lang.String r0 = "account_reconnect_required"
                boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> L95
                if (r0 != 0) goto L84
            L6d:
                boolean r0 = r2.equals(r3)     // Catch: java.lang.Throwable -> L95
                if (r0 != 0) goto L8a
                com.facebook.aura.toast.api.ToastApi r1 = com.facebook.aura.toast.api.ToastApi.INSTANCE     // Catch: java.lang.Throwable -> L95
                r0 = 2131890089(0x7f120fa9, float:1.941486E38)
                r1.showToast(r0)     // Catch: java.lang.Throwable -> L95
                goto L8a
            L7c:
                java.lang.String r0 = "not_found"
                boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> L95
                if (r0 == 0) goto L6d
            L84:
                com.facebook.aura.skills.repo.HatchConnectorCatalogRepository r0 = r5.repository     // Catch: java.lang.Throwable -> L95
                r0.onResumeAfterAuth(r4)     // Catch: java.lang.Throwable -> L95
                goto L6d
            L8a:
                com.facebook.aura.conversation.view.HatchConnectorLinkCardViewModel r0 = com.facebook.aura.conversation.view.HatchConnectorLinkCardViewModel.this
                X.BLG<java.lang.Boolean> r1 = r0._isReconnecting
                r0 = 0
                X.AnonymousClass004.A1D(r0, r1)
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L95:
                r2 = move-exception
                com.facebook.aura.conversation.view.HatchConnectorLinkCardViewModel r0 = com.facebook.aura.conversation.view.HatchConnectorLinkCardViewModel.this
                X.BLG<java.lang.Boolean> r1 = r0._isReconnecting
                r0 = 0
                X.AnonymousClass004.A1D(r0, r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConnectorLinkCardViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HatchConnectorLinkCardViewModel(X.AbstractC3358CGz r11, java.lang.String r12, java.lang.String r13, java.util.List<java.lang.String> r14) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConnectorLinkCardViewModel.<init>(X.CGz, java.lang.String, java.lang.String, java.util.List):void");
    }

    public final void reconnect(String str, String str2, G0U<? super String, Unit> g0u) {
        C7384Etj.A0Y(g0u, 2);
        String value = this.observedConnectorId.getValue();
        if (value == null || AnonymousClass003.A1Z(this._isReconnecting)) {
            return;
        }
        C9286GCn.A00(null, AnonymousClass001.A0i(), (C9286GCn) this._isReconnecting);
        AnonymousClass001.A1J(new AnonymousClass1(value, str, str2, g0u, null), AEu.A00(this));
    }

    public final C1BN<ConnectorCardState> getUiState() {
        return this.uiState;
    }

    public final C1BN<Boolean> isReconnecting() {
        return this.isReconnecting;
    }
}
