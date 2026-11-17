package com.facebook.aura.status.viewmodel;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BLG;
import X.BLL;
import X.C10571Hud;
import X.C1BN;
import X.C22I;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C3pd;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.C9290GCr;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HnJ;
import X.HoC;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.browsertask.data.HatchComputerRepository;
import com.facebook.aura.browsertask.data.HatchComputerRepositoryKt;
import com.facebook.aura.browsertask.navigation.BrowserTaskNavigation;
import com.facebook.aura.browsertask.presentation.BrowserTaskActions;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.status.viewmodel.DesktopUiState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class DesktopViewModel extends AEs {
    public final BLG<Boolean> _isLeasing;
    public final C3Em<BrowserTaskPresentation> _openBrowser;
    public final BLG<DesktopUiState> _uiState;
    public final BrowserTaskActions browserActions;
    public final BrowserTaskNavigation browserNavigation;
    public final C1BN<Boolean> isLeasing;
    public final C22I<BrowserTaskPresentation> openBrowser;
    public String pendingLeaseId;
    public final HatchComputerRepository repository;
    public HoC subscription;
    public final C1BN<DesktopUiState> uiState;

    public final class Factory extends AuraViewModelFactory<DesktopViewModel> {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public DesktopViewModel create() {
            return new DesktopViewModel(HatchComputerRepository.Companion.getInstance(this.userSession), BrowserTaskActions.Companion.getInstance(this.userSession), new BrowserTaskNavigation(this.userSession));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.viewmodel.DesktopViewModel$observeUpdates$1", f = "DesktopViewModel.kt", l = {88, 103}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.viewmodel.DesktopViewModel$observeUpdates$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = DesktopViewModel.this.new AnonymousClass1(htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0070 -> B:9:0x0018). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007f -> B:9:0x0018). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r5 = r8.L$0
                X.3UX r5 = (X.C3UX) r5
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r8.label
                r3 = 2
                r2 = 1
                if (r0 == 0) goto L15
                if (r0 == r2) goto L39
                if (r0 == r3) goto L15
                java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
            L14:
                throw r1
            L15:
                X.Hwg.A00(r9)
            L18:
                boolean r0 = X.Hxb.A04(r5)
                if (r0 == 0) goto L83
                com.facebook.aura.status.viewmodel.DesktopViewModel r7 = com.facebook.aura.status.viewmodel.DesktopViewModel.this
                com.facebook.aura.browsertask.data.HatchComputerRepository r0 = r7.repository     // Catch: java.lang.Throwable -> L3f
                X.20Q r6 = r0.subscribe()     // Catch: java.lang.Throwable -> L3f
                com.facebook.aura.status.viewmodel.DesktopViewModel$observeUpdates$1$1$1 r1 = new com.facebook.aura.status.viewmodel.DesktopViewModel$observeUpdates$1$1$1     // Catch: java.lang.Throwable -> L3f
                r1.<init>()     // Catch: java.lang.Throwable -> L3f
                r8.L$0 = r5     // Catch: java.lang.Throwable -> L3f
                r0 = 0
                r8.L$1 = r0     // Catch: java.lang.Throwable -> L3f
                r8.label = r2     // Catch: java.lang.Throwable -> L3f
                java.lang.Object r0 = r6.collect(r1, r8)     // Catch: java.lang.Throwable -> L3f
                if (r0 != r4) goto L3c
                goto L82
            L39:
                X.Hwg.A00(r9)     // Catch: java.lang.Throwable -> L3f
            L3c:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3f
                goto L44
            L3f:
                r0 = move-exception
                X.Hud r0 = X.C3cG.A0s(r0)
            L44:
                com.facebook.aura.status.viewmodel.DesktopViewModel r6 = com.facebook.aura.status.viewmodel.DesktopViewModel.this
                java.lang.Throwable r1 = X.HsJ.A00(r0)
                if (r1 == 0) goto L6c
                boolean r0 = r1 instanceof java.util.concurrent.CancellationException
                if (r0 != 0) goto L14
                java.lang.String r1 = r1.getMessage()
                java.lang.String r0 = "Computer subscription dropped: "
                java.lang.String r1 = X.FGI.A0M(r0, r1)
                java.lang.String r0 = "DesktopViewModel"
                X.CFK.A06(r0, r1)
                X.BLG<com.facebook.aura.status.viewmodel.DesktopUiState> r0 = r6._uiState
                java.lang.Object r0 = r0.getValue()
                boolean r0 = r0 instanceof com.facebook.aura.status.viewmodel.DesktopUiState.Loading
                if (r0 == 0) goto L6c
                r6.refresh()
            L6c:
                boolean r0 = X.Hxb.A04(r5)
                if (r0 == 0) goto L18
                r8.L$0 = r5
                r0 = 0
                r8.L$1 = r0
                r8.label = r3
                r0 = 3000(0xbb8, double:1.482E-320)
                java.lang.Object r0 = X.C7Bq.A01(r0, r8)
                if (r0 != r4) goto L18
                return r4
            L82:
                return r4
            L83:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.viewmodel.DesktopViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.viewmodel.DesktopViewModel$openNewBrowser$1", f = "DesktopViewModel.kt", l = {166}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.viewmodel.DesktopViewModel$openNewBrowser$1, reason: invalid class name and case insensitive filesystem */
    public final class C140971 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public C140971(HtJ<? super C140971> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return DesktopViewModel.this.new C140971(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM304leaseBrowsergIAlus;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                DesktopViewModel desktopViewModel = DesktopViewModel.this;
                String strA0k = desktopViewModel.pendingLeaseId;
                if (strA0k == null) {
                    strA0k = AnonymousClass002.A0k();
                    desktopViewModel = DesktopViewModel.this;
                    desktopViewModel.pendingLeaseId = strA0k;
                }
                HatchComputerRepository hatchComputerRepository = desktopViewModel.repository;
                this.L$0 = null;
                this.label = 1;
                objM304leaseBrowsergIAlus = hatchComputerRepository.m304leaseBrowsergIAlus(strA0k, this);
                if (objM304leaseBrowsergIAlus == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM304leaseBrowsergIAlus = AnonymousClass001.A0q(obj);
            }
            DesktopViewModel desktopViewModel2 = DesktopViewModel.this;
            if (!(objM304leaseBrowsergIAlus instanceof C10571Hud)) {
                BrowserTaskPresentation browserTaskPresentation = (BrowserTaskPresentation) objM304leaseBrowsergIAlus;
                desktopViewModel2.pendingLeaseId = null;
                desktopViewModel2.browserActions.focusTask(browserTaskPresentation);
                desktopViewModel2._openBrowser.AhV(browserTaskPresentation);
            }
            DesktopViewModel desktopViewModel3 = DesktopViewModel.this;
            Throwable thA00 = HsJ.A00(objM304leaseBrowsergIAlus);
            if (thA00 != null) {
                String strComputerErrorCode = HatchComputerRepositoryKt.computerErrorCode(thA00);
                if (HatchComputerRepositoryKt.BROWSER_LEASE_EXPIRED.equals(strComputerErrorCode)) {
                    desktopViewModel3.pendingLeaseId = null;
                } else if (HatchComputerRepositoryKt.COMPUTER_DISABLED.equals(strComputerErrorCode)) {
                    desktopViewModel3.pendingLeaseId = null;
                    desktopViewModel3._uiState.Af8(DesktopUiState.Unavailable.INSTANCE);
                }
                CFK.A06(DesktopViewModelKt.TAG, FGI.A0M("Failed to lease browser: ", HatchComputerRepositoryKt.computerErrorCode(thA00)));
            }
            AnonymousClass003.A14(DesktopViewModel.this._isLeasing, false);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return DesktopViewModel.this.new C140971(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.viewmodel.DesktopViewModel$refresh$1", f = "DesktopViewModel.kt", l = {126, 148}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.viewmodel.DesktopViewModel$refresh$1, reason: invalid class name and case insensitive filesystem */
    public final class C140981 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        public C140981(HtJ<? super C140981> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return DesktopViewModel.this.new C140981(htJ);
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
        
            if (r10 >= r4) goto L19;
         */
        /* JADX WARN: Path cross not found for [B:26:0x0064, B:28:0x0067], limit reached: 43 */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x009f -> B:7:0x0018). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                X.Hji r8 = X.EnumC10460Hji.A02
                int r0 = r12.label
                r7 = 2
                r6 = 0
                r5 = 1
                if (r0 == 0) goto Lb1
                if (r0 == r5) goto La2
                if (r0 != r7) goto Lba
                int r2 = r12.I$1
                int r4 = r12.I$0
                java.lang.Object r3 = r12.L$0
                com.facebook.aura.status.viewmodel.DesktopViewModel r3 = (com.facebook.aura.status.viewmodel.DesktopViewModel) r3
                X.Hwg.A00(r13)
            L18:
                int r10 = r2 + 1
                if (r10 >= r4) goto L4f
            L1c:
                com.facebook.aura.browsertask.data.HatchComputerRepository r0 = r3.repository
                r12.L$0 = r3
                r12.L$1 = r6
                r12.L$2 = r6
                r12.I$0 = r4
                r12.I$1 = r10
                r12.I$2 = r10
                r12.label = r5
                java.lang.Object r9 = r0.m305loadContextIoAF18A(r12)
                if (r9 == r8) goto L51
                r2 = r10
            L33:
                boolean r0 = r9 instanceof X.C10571Hud
                r1 = r9
                if (r0 == 0) goto L39
                r1 = r6
            L39:
                com.facebook.aura.browsertask.data.HatchComputerContext r1 = (com.facebook.aura.browsertask.data.HatchComputerContext) r1
                if (r1 == 0) goto L52
                X.BLG<com.facebook.aura.status.viewmodel.DesktopUiState> r3 = r3._uiState
                java.util.List<com.facebook.aura.model.BrowserTaskPresentation> r0 = r1.tasks
                X.AHD r2 = X.AGI.A07(r0)
                com.facebook.aura.browsertask.data.HatchDesktopImage r1 = r1.defaultDesktopImage
                com.facebook.aura.status.viewmodel.DesktopUiState$Loaded r0 = new com.facebook.aura.status.viewmodel.DesktopUiState$Loaded
                r0.<init>(r2, r1)
            L4c:
                r3.Af8(r0)
            L4f:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
            L51:
                return r8
            L52:
                java.lang.Throwable r0 = X.HsJ.A00(r9)
                if (r0 == 0) goto L86
                java.lang.String r11 = com.facebook.aura.browsertask.data.HatchComputerRepositoryKt.computerErrorCode(r0)
            L5c:
                java.lang.String r0 = "browser_tasks_unavailable"
                boolean r0 = r0.equals(r11)
                if (r0 == 0) goto L67
                r9 = 1
                if (r10 < r7) goto L68
            L67:
                r9 = 0
            L68:
                java.lang.String r1 = "Failed to load Computer context: "
                java.lang.String r0 = " retryable="
                java.lang.String r1 = X.FGI.A0o(r1, r11, r0, r9)
                java.lang.String r0 = "DesktopViewModel"
                X.CFK.A06(r0, r1)
                if (r9 != 0) goto L88
                X.BLG<com.facebook.aura.status.viewmodel.DesktopUiState> r0 = r3._uiState
                java.lang.Object r0 = r0.getValue()
                boolean r0 = r0 instanceof com.facebook.aura.status.viewmodel.DesktopUiState.Loaded
                if (r0 != 0) goto L4f
                X.BLG<com.facebook.aura.status.viewmodel.DesktopUiState> r3 = r3._uiState
                com.facebook.aura.status.viewmodel.DesktopUiState$Unavailable r0 = com.facebook.aura.status.viewmodel.DesktopUiState.Unavailable.INSTANCE
                goto L4c
            L86:
                r11 = r6
                goto L5c
            L88:
                r12.L$0 = r3
                r0 = 0
                r12.L$1 = r0
                r12.L$2 = r0
                r12.I$0 = r4
                r12.I$1 = r2
                r12.I$2 = r10
                r12.I$3 = r9
                r12.label = r7
                r0 = 500(0x1f4, double:2.47E-321)
                java.lang.Object r0 = X.C7Bq.A01(r0, r12)
                if (r0 != r8) goto L18
                return r8
            La2:
                int r10 = r12.I$2
                int r2 = r12.I$1
                int r4 = r12.I$0
                java.lang.Object r3 = r12.L$0
                com.facebook.aura.status.viewmodel.DesktopViewModel r3 = (com.facebook.aura.status.viewmodel.DesktopViewModel) r3
                java.lang.Object r9 = X.AnonymousClass001.A0q(r13)
                goto L33
            Lb1:
                X.Hwg.A00(r13)
                com.facebook.aura.status.viewmodel.DesktopViewModel r3 = com.facebook.aura.status.viewmodel.DesktopViewModel.this
                r10 = 0
                r4 = 3
                goto L1c
            Lba:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.viewmodel.DesktopViewModel.C140981.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return DesktopViewModel.this.new C140981(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public DesktopViewModel(HatchComputerRepository hatchComputerRepository, BrowserTaskActions browserTaskActions, BrowserTaskNavigation browserTaskNavigation) {
        boolean zA1Z = AnonymousClass005.A1Z(hatchComputerRepository, browserTaskActions, browserTaskNavigation);
        this.repository = hatchComputerRepository;
        this.browserActions = browserTaskActions;
        this.browserNavigation = browserTaskNavigation;
        C9286GCn c9286GCnA01 = HnJ.A01(DesktopUiState.Loading.INSTANCE);
        this._uiState = c9286GCnA01;
        this.uiState = C3cG.A11(c9286GCnA01);
        C9290GCr c9290GCrA12 = C3cG.A12(C79.A00, 0, zA1Z ? 1 : 0);
        this._openBrowser = c9290GCrA12;
        this.openBrowser = C3pd.A00(c9290GCrA12);
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(false);
        this._isLeasing = c9286GCnA0v;
        this.isLeasing = C3cG.A11(c9286GCnA0v);
    }

    public final void openTask(BrowserTaskPresentation browserTaskPresentation) {
        C7384Etj.A0Y(browserTaskPresentation, 0);
        if (this.browserNavigation.canOpenTask(browserTaskPresentation)) {
            this.browserActions.focusTask(browserTaskPresentation);
            this._openBrowser.AhV(browserTaskPresentation);
        }
    }

    public final C22I<BrowserTaskPresentation> getOpenBrowser() {
        return this.openBrowser;
    }

    public final C1BN<DesktopUiState> getUiState() {
        return this.uiState;
    }

    public final C1BN<Boolean> isLeasing() {
        return this.isLeasing;
    }

    public final void observeUpdates() {
        HoC hoC = this.subscription;
        if (hoC == null || !hoC.isActive()) {
            BLL bllA00 = AEu.A00(this);
            this.subscription = GAo.A02(C79.A00, AnonymousClass001.A0y(), new AnonymousClass1(null), bllA00);
        }
    }

    public final void openNewBrowser() {
        if (AnonymousClass003.A1Z(this._isLeasing)) {
            return;
        }
        HtJ htJA14 = C3cI.A14(this._isLeasing, AnonymousClass001.A0i());
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C140971(htJA14), AEu.A00(this));
    }

    public final void stopObserving() {
        this.subscription = C3cI.A15(this.subscription);
    }

    @Override // X.AEs
    public void onCleared() {
        stopObserving();
    }

    public final void refresh() {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C140981(null), AEu.A00(this));
    }
}
