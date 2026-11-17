package com.facebook.aura.storagerecovery;

import X.AEs;
import X.AEu;
import X.AGI;
import X.AHD;
import X.AHI;
import X.ATD;
import X.AbstractC06907md;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.BLL;
import X.BQI;
import X.C0881AGi;
import X.C0943AIw;
import X.C1BN;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3rb;
import X.C60I;
import X.C60O;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.G0W;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.HzP;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.common.ui.StaggeredEntranceKt;
import com.facebook.aura.common.video.HatchTransportHttpDataSourceKt;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.navigation.key.StorageRecoveryOverlayScreenKey;
import com.facebook.aura.overlay.api.OverlayApi;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.storagerecovery.StorageRecoveryDialog;
import com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient;
import com.facebook.aura.storagerecovery.data.HatchStorageRecoveryDeleteReceipt;
import com.facebook.aura.storagerecovery.data.HatchStorageRecoveryEntry;
import com.facebook.aura.storagerecovery.data.HatchStorageRecoveryEntryKind;
import com.facebook.aura.storagerecovery.data.HatchStorageRecoveryError;
import com.facebook.aura.storagerecovery.data.HatchStorageRecoveryErrorCode;
import com.facebook.aura.storagerecovery.data.HatchStorageRecoveryState;
import com.facebook.aura.storagerecovery.data.HatchStorageRecoveryStatus;
import com.facebook.aura.storagerecovery.data.HatchStorageRecoveryStore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class StorageRecoveryViewModel extends AEs {
    public final BLG<StorageRecoveryUiState> _uiState;
    public final HatchStorageRecoveryClient client;
    public final AtomicReference<List<Directory>> directoryStack;
    public final HatchGatewayConnection gateway;
    public final OverlayApi overlayApi;
    public final BLG<Boolean> settingsVisible;
    public final HatchStorageRecoveryStore store;
    public final C1BN<StorageRecoveryUiState> uiState;
    public HoC work;

    /* loaded from: classes2.dex */
    public final class Factory extends AuraViewModelFactory<StorageRecoveryViewModel> {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public StorageRecoveryViewModel create() {
            return new StorageRecoveryViewModel(HatchGatewayConnection.Companion.getInstance(this.userSession), HatchStorageRecoveryStore.Companion.getInstance(this.userSession), new HatchStorageRecoveryClient(this.userSession), OverlayApi.Companion.getInstance(this.userSession));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.storagerecovery.StorageRecoveryViewModel$delete$1", f = "StorageRecoveryViewModel.kt", l = {HatchMessageShareDocumentRenderer.MIN_CONTENT_HEIGHT_PX, 311, 315}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.storagerecovery.StorageRecoveryViewModel$delete$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $directoryToken;
        public final /* synthetic */ List<HatchStorageRecoveryEntry> $entries;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<HatchStorageRecoveryEntry> list, String str, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$entries = list;
            this.$directoryToken = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return StorageRecoveryViewModel.this.new AnonymousClass1(this.$entries, this.$directoryToken, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r5 = 3
                r6 = 2
                r3 = 1
                if (r0 == 0) goto L15
                if (r0 == r3) goto L27
                if (r0 == r6) goto L3e
                if (r0 != r5) goto L65
                X.Hwg.A00(r8)
            L12:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            L15:
                X.Hwg.A00(r8)
                com.facebook.aura.storagerecovery.StorageRecoveryViewModel r2 = com.facebook.aura.storagerecovery.StorageRecoveryViewModel.this
                java.util.List<com.facebook.aura.storagerecovery.data.HatchStorageRecoveryEntry> r1 = r7.$entries
                java.lang.String r0 = r7.$directoryToken
                r7.label = r3
                java.lang.Object r8 = com.facebook.aura.storagerecovery.StorageRecoveryViewModel.access$refreshSelection(r2, r1, r0, r7)
                if (r8 != r4) goto L2a
                return r4
            L27:
                X.Hwg.A00(r8)
            L2a:
                r3 = r8
                java.util.List r3 = (java.util.List) r3
                if (r3 == 0) goto L12
                com.facebook.aura.storagerecovery.StorageRecoveryViewModel r1 = com.facebook.aura.storagerecovery.StorageRecoveryViewModel.this
                java.lang.String r0 = r7.$directoryToken
                r7.L$0 = r3
                r7.label = r6
                java.lang.Object r8 = com.facebook.aura.storagerecovery.StorageRecoveryViewModel.access$deleteAll(r1, r3, r0, r7)
                if (r8 != r4) goto L45
                return r4
            L3e:
                java.lang.Object r3 = r7.L$0
                java.util.List r3 = (java.util.List) r3
                X.Hwg.A00(r8)
            L45:
                com.facebook.aura.storagerecovery.data.HatchStorageRecoveryDeleteReceipt r8 = (com.facebook.aura.storagerecovery.data.HatchStorageRecoveryDeleteReceipt) r8
                if (r8 == 0) goto L12
                com.facebook.aura.storagerecovery.data.HatchStorageRecoveryDeleteOutcome r1 = r8.outcome
                com.facebook.aura.storagerecovery.data.HatchStorageRecoveryDeleteOutcome r0 = com.facebook.aura.storagerecovery.data.HatchStorageRecoveryDeleteOutcome.PARTIAL
                if (r1 == r0) goto L51
                X.AGi r3 = X.C0881AGi.A00
            L51:
                com.facebook.aura.storagerecovery.StorageRecoveryViewModel r2 = com.facebook.aura.storagerecovery.StorageRecoveryViewModel.this
                java.lang.String r1 = r7.$directoryToken
                r0 = 0
                r7.L$0 = r0
                r7.L$1 = r0
                r7.L$2 = r0
                r7.label = r5
                java.lang.Object r0 = com.facebook.aura.storagerecovery.StorageRecoveryViewModel.access$reloadAfterDelete(r2, r3, r1, r7)
                if (r0 != r4) goto L12
                return r4
            L65:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.storagerecovery.StorageRecoveryViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.storagerecovery.StorageRecoveryViewModel", f = "StorageRecoveryViewModel.kt", l = {351, 363}, m = "deleteAll", v = 2)
    /* renamed from: com.facebook.aura.storagerecovery.StorageRecoveryViewModel$deleteAll$1, reason: invalid class name and case insensitive filesystem */
    public final class C141111 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C141111(HtJ<? super C141111> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StorageRecoveryViewModel.this.deleteAll(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.storagerecovery.StorageRecoveryViewModel", f = "StorageRecoveryViewModel.kt", l = {512}, m = "listAllEntries", v = 2)
    /* renamed from: com.facebook.aura.storagerecovery.StorageRecoveryViewModel$listAllEntries$1, reason: invalid class name and case insensitive filesystem */
    public final class C141121 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C141121(HtJ<? super C141121> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StorageRecoveryViewModel.this.listAllEntries(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.storagerecovery.StorageRecoveryViewModel$loadEntries$2", f = "StorageRecoveryViewModel.kt", l = {198, HatchTransportHttpDataSourceKt.HTTP_PARTIAL_CONTENT}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.storagerecovery.StorageRecoveryViewModel$loadEntries$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $directoryToken;
        public final /* synthetic */ boolean $refreshStatus;
        public int label;
        public final /* synthetic */ StorageRecoveryViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, StorageRecoveryViewModel storageRecoveryViewModel, String str, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$refreshStatus = z;
            this.this$0 = storageRecoveryViewModel;
            this.$directoryToken = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$refreshStatus, this.this$0, this.$directoryToken, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0057 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0067 A[Catch: Exception -> 0x0097, CancellationException -> 0x00cf, TryCatch #2 {CancellationException -> 0x00cf, Exception -> 0x0097, blocks: (B:28:0x0058, B:29:0x005b, B:31:0x0067, B:33:0x006a, B:34:0x006e, B:15:0x0028, B:16:0x002b, B:19:0x0037, B:21:0x003f, B:23:0x0048, B:24:0x004a, B:25:0x004b, B:10:0x0015, B:12:0x0019), top: B:53:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x006a A[Catch: Exception -> 0x0097, CancellationException -> 0x00cf, TryCatch #2 {CancellationException -> 0x00cf, Exception -> 0x0097, blocks: (B:28:0x0058, B:29:0x005b, B:31:0x0067, B:33:0x006a, B:34:0x006e, B:15:0x0028, B:16:0x002b, B:19:0x0037, B:21:0x003f, B:23:0x0048, B:24:0x004a, B:25:0x004b, B:10:0x0015, B:12:0x0019), top: B:53:0x0006 }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws com.facebook.aura.storagerecovery.data.HatchStorageRecoveryError.Unavailable {
            /*
                r14 = this;
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r14.label
                r4 = 2
                r2 = 1
                if (r0 == 0) goto L12
                if (r0 == r2) goto L28
                if (r0 != r4) goto Ld
                goto L58
            Ld:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L12:
                X.Hwg.A00(r15)
                boolean r0 = r14.$refreshStatus     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                if (r0 == 0) goto L4b
                com.facebook.aura.storagerecovery.StorageRecoveryViewModel r0 = r14.this$0     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient r3 = r0.client     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                r14.label = r2     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                r0 = 15
                java.lang.Object r15 = r3.fetchStatus(r0, r14)     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                if (r15 != r5) goto L2b
                return r5
            L28:
                X.Hwg.A00(r15)     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
            L2b:
                com.facebook.aura.storagerecovery.data.HatchStorageRecoveryStatus r15 = (com.facebook.aura.storagerecovery.data.HatchStorageRecoveryStatus) r15     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                com.facebook.aura.storagerecovery.data.HatchStorageRecoveryServerStatus r0 = r15.status     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                boolean r1 = r0.isRecoveryActive()     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                com.facebook.aura.storagerecovery.StorageRecoveryViewModel r0 = r14.this$0
                if (r1 != 0) goto L3f
                com.facebook.aura.storagerecovery.data.HatchStorageRecoveryStore r0 = r0.store     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                r0.setAvailable()     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                return r0
            L3f:
                com.facebook.aura.storagerecovery.data.HatchStorageRecoveryStore r0 = r0.store     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                r0.setActive(r15)     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                boolean r0 = r15.canList     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                if (r0 != 0) goto L4b
                com.facebook.aura.storagerecovery.data.HatchStorageRecoveryError$Unavailable r0 = com.facebook.aura.storagerecovery.data.HatchStorageRecoveryError.Unavailable.INSTANCE     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                throw r0     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
            L4b:
                com.facebook.aura.storagerecovery.StorageRecoveryViewModel r1 = r14.this$0     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                java.lang.String r0 = r14.$directoryToken     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                r14.label = r4     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                java.lang.Object r15 = com.facebook.aura.storagerecovery.StorageRecoveryViewModel.access$listAllEntries(r1, r0, r14)     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                if (r15 != r5) goto L5b
                return r5
            L58:
                X.Hwg.A00(r15)     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
            L5b:
                java.util.List r15 = (java.util.List) r15     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                com.facebook.aura.storagerecovery.StorageRecoveryViewModel r1 = r14.this$0     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                java.lang.String r0 = r14.$directoryToken     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                boolean r0 = com.facebook.aura.storagerecovery.StorageRecoveryViewModel.access$isStillViewing(r1, r0)     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                if (r0 != 0) goto L6a
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                return r0
            L6a:
                com.facebook.aura.storagerecovery.StorageRecoveryViewModel r0 = r14.this$0     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                X.BLG<com.facebook.aura.storagerecovery.StorageRecoveryUiState> r1 = r0._uiState     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
            L6e:
                java.lang.Object r3 = r1.getValue()     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                r0 = r3
                com.facebook.aura.storagerecovery.StorageRecoveryUiState r0 = (com.facebook.aura.storagerecovery.StorageRecoveryUiState) r0     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                com.facebook.aura.storagerecovery.StorageRecoveryPhase r5 = com.facebook.aura.storagerecovery.StorageRecoveryPhase.READY     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                X.AHD r6 = X.AGI.A07(r15)     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                X.AIw r7 = X.C0943AIw.A03     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                java.lang.Double r9 = r0.usagePercentage     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                boolean r10 = r0.canDelete     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                java.lang.String r11 = r0.currentDirectoryName     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                com.facebook.aura.storagerecovery.StorageRecoveryDialog r12 = r0.dialog     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                boolean r13 = r0.isFileListVisible     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                r8 = 0
                X.AnonymousClass005.A0x(r5, r6, r7)     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                com.facebook.aura.storagerecovery.StorageRecoveryUiState r4 = new com.facebook.aura.storagerecovery.StorageRecoveryUiState     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                boolean r0 = r1.A6e(r3, r4)     // Catch: java.lang.Exception -> L97 java.util.concurrent.CancellationException -> Lcf
                if (r0 == 0) goto L6e
                goto Lbf
            L97:
                r4 = move-exception
                com.facebook.aura.storagerecovery.StorageRecoveryViewModel r1 = r14.this$0
                java.lang.String r0 = r14.$directoryToken
                boolean r0 = com.facebook.aura.storagerecovery.StorageRecoveryViewModel.access$isStillViewing(r1, r0)
                if (r0 == 0) goto Lbf
                java.lang.String r1 = "Failed to list recovery entries"
                java.lang.String r0 = "StorageRecoveryViewModel"
                X.CFK.A0A(r0, r1, r4)
                boolean r0 = r4 instanceof com.facebook.aura.storagerecovery.data.HatchStorageRecoveryError.Api
                r3 = 0
                if (r0 == 0) goto Lb4
                com.facebook.aura.storagerecovery.data.HatchStorageRecoveryError$Api r4 = (com.facebook.aura.storagerecovery.data.HatchStorageRecoveryError.Api) r4
                if (r4 == 0) goto Lb4
                com.facebook.aura.storagerecovery.data.HatchStorageRecoveryErrorCode r3 = r4.code
            Lb4:
                com.facebook.aura.storagerecovery.data.HatchStorageRecoveryErrorCode r0 = com.facebook.aura.storagerecovery.data.HatchStorageRecoveryErrorCode.RECOVERY_NOT_ACTIVE
                com.facebook.aura.storagerecovery.StorageRecoveryViewModel r1 = r14.this$0
                if (r3 != r0) goto Lc2
                com.facebook.aura.storagerecovery.data.HatchStorageRecoveryStore r0 = r1.store
                r0.setAvailable()
            Lbf:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            Lc2:
                com.facebook.aura.storagerecovery.StorageRecoveryPhase r0 = com.facebook.aura.storagerecovery.StorageRecoveryPhase.READY
                com.facebook.aura.storagerecovery.StorageRecoveryViewModel.access$setPhase(r1, r0)
                com.facebook.aura.storagerecovery.StorageRecoveryViewModel r1 = r14.this$0
                com.facebook.aura.storagerecovery.StorageRecoveryErrorKind r0 = com.facebook.aura.storagerecovery.StorageRecoveryErrorKind.REQUEST_FAILED
                com.facebook.aura.storagerecovery.StorageRecoveryViewModel.access$showError(r1, r0, r2)
                goto Lbf
            Lcf:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.storagerecovery.StorageRecoveryViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeAppForeground$1", f = "StorageRecoveryViewModel.kt", l = {109}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeAppForeground$1, reason: invalid class name and case insensitive filesystem */
    public final class C141131 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C141131(HtJ<? super C141131> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return StorageRecoveryViewModel.this.new C141131(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return StorageRecoveryViewModel.this.new C141131(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                StorageRecoveryViewModel$observeAppForeground$1$invokeSuspend$$inlined$filter$1 storageRecoveryViewModel$observeAppForeground$1$invokeSuspend$$inlined$filter$1 = new StorageRecoveryViewModel$observeAppForeground$1$invokeSuspend$$inlined$filter$1(AuraAppLifecycleManager.isAppInForegroundImmediateFlow);
                final StorageRecoveryViewModel storageRecoveryViewModel = StorageRecoveryViewModel.this;
                C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.storagerecovery.StorageRecoveryViewModel.observeAppForeground.1.2
                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        if ((storageRecoveryViewModel.store.state.getValue() instanceof HatchStorageRecoveryState.Active) && C60O.A0C(storageRecoveryViewModel).phase != StorageRecoveryPhase.DELETING && C60O.A0C(storageRecoveryViewModel).dialog == null) {
                            storageRecoveryViewModel.reloadFromRoot();
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (storageRecoveryViewModel$observeAppForeground$1$invokeSuspend$$inlined$filter$1.collect(c20z, this) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeConnectionState$1", f = "StorageRecoveryViewModel.kt", l = {160}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeConnectionState$1, reason: invalid class name and case insensitive filesystem */
    public final class C141141 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeConnectionState$1$1", f = "StorageRecoveryViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeConnectionState$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public final class C04021 extends AbstractC07127nr implements G0W<Boolean, HatchGatewayConnectionState, HtJ<? super HxE<? extends Boolean, ? extends HatchGatewayConnectionState>>, Object> {
            public /* synthetic */ Object L$0;
            public /* synthetic */ boolean Z$0;
            public int label;

            public C04021(HtJ<? super C04021> htJ) {
                super(3, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                boolean z = this.Z$0;
                Object obj2 = this.L$0;
                if (this.label == 0) {
                    return new HxE(AnonymousClass001.A0k(obj, z), obj2);
                }
                throw AnonymousClass001.A0n();
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HatchGatewayConnectionState hatchGatewayConnectionState, HtJ<? super HxE<? extends Boolean, ? extends HatchGatewayConnectionState>> htJ) {
                return invoke(AnonymousClass001.A1X(bool), hatchGatewayConnectionState, (HtJ<? super HxE<Boolean, ? extends HatchGatewayConnectionState>>) htJ);
            }

            public final Object invoke(boolean z, HatchGatewayConnectionState hatchGatewayConnectionState, HtJ<? super HxE<Boolean, ? extends HatchGatewayConnectionState>> htJ) {
                C04021 c04021 = new C04021(htJ);
                c04021.Z$0 = z;
                c04021.L$0 = hatchGatewayConnectionState;
                return c04021.invokeSuspend(Unit.INSTANCE);
            }
        }

        public C141141(HtJ<? super C141141> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return StorageRecoveryViewModel.this.new C141141(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return StorageRecoveryViewModel.this.new C141141(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchGatewayConnection hatchGatewayConnection = StorageRecoveryViewModel.this.gateway;
                C60I c60iA03 = C3rb.A03(new C04021(null), hatchGatewayConnection.storageRecoveryConnected, hatchGatewayConnection.connectionState);
                final StorageRecoveryViewModel storageRecoveryViewModel = StorageRecoveryViewModel.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.storagerecovery.StorageRecoveryViewModel.observeConnectionState.1.2
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(X.HxE<java.lang.Boolean, ? extends com.facebook.aura.gateway.HatchGatewayConnectionState> r4, X.HtJ<? super kotlin.Unit> r5) {
                        /*
                            r3 = this;
                            A r0 = r4.first
                            boolean r0 = X.AnonymousClass001.A1X(r0)
                            B r2 = r4.second
                            com.facebook.aura.gateway.HatchGatewayConnectionState r2 = (com.facebook.aura.gateway.HatchGatewayConnectionState) r2
                            if (r0 == 0) goto L16
                            com.facebook.aura.storagerecovery.StorageRecoveryViewModel r0 = r1
                            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryStore r0 = r0.store
                            r0.setRequired()
                        L13:
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        L16:
                            boolean r0 = r2 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Connected
                            if (r0 != 0) goto L53
                            boolean r0 = r2 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Error
                            if (r0 == 0) goto L46
                            r0 = r2
                            com.facebook.aura.gateway.HatchGatewayConnectionState$Error r0 = (com.facebook.aura.gateway.HatchGatewayConnectionState.Error) r0
                            boolean r0 = r0.retriesExhausted
                            if (r0 == 0) goto L46
                            com.facebook.aura.storagerecovery.StorageRecoveryViewModel r0 = r1
                            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryStore r0 = r0.store
                            X.1BN<com.facebook.aura.storagerecovery.data.HatchStorageRecoveryState> r0 = r0.state
                            java.lang.Object r1 = r0.getValue()
                            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryState$Inactive r0 = com.facebook.aura.storagerecovery.data.HatchStorageRecoveryState.Inactive.INSTANCE
                            boolean r1 = X.C7384Etj.areEqual(r1, r0)
                            com.facebook.aura.storagerecovery.StorageRecoveryViewModel r0 = r1
                            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryStore r0 = r0.store
                            r0.markTransportLost()
                            if (r1 != 0) goto L13
                            com.facebook.aura.storagerecovery.StorageRecoveryViewModel r1 = r1
                            com.facebook.aura.storagerecovery.StorageRecoveryPhase r0 = com.facebook.aura.storagerecovery.StorageRecoveryPhase.RECONNECT_FAILED
                            com.facebook.aura.storagerecovery.StorageRecoveryViewModel.access$setPhase(r1, r0)
                            goto L13
                        L46:
                            boolean r0 = r2 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Disconnected
                            if (r0 == 0) goto L5b
                            r0 = r2
                            com.facebook.aura.gateway.HatchGatewayConnectionState$Disconnected r0 = (com.facebook.aura.gateway.HatchGatewayConnectionState.Disconnected) r0
                            com.facebook.aura.gateway.HatchGatewayConnectionState$Reason r1 = r0.reason
                            com.facebook.aura.gateway.HatchGatewayConnectionState$Reason r0 = com.facebook.aura.gateway.HatchGatewayConnectionState.Reason.NONE
                            if (r1 != r0) goto L5b
                        L53:
                            com.facebook.aura.storagerecovery.StorageRecoveryViewModel r0 = r1
                            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryStore r0 = r0.store
                            r0.setInactive()
                            goto L13
                        L5b:
                            boolean r0 = r2 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Paused
                            if (r0 != 0) goto L53
                            boolean r0 = r2 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Resetting
                            if (r0 != 0) goto L53
                            com.facebook.aura.storagerecovery.StorageRecoveryViewModel r0 = r1
                            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryStore r0 = r0.store
                            r0.markTransportLost()
                            goto L13
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.storagerecovery.StorageRecoveryViewModel.C141141.AnonymousClass2.emit(X.HxE, X.HtJ):java.lang.Object");
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((HxE<Boolean, ? extends HatchGatewayConnectionState>) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (c60iA03.collect(c20z, this) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeGatewayState$1", f = "StorageRecoveryViewModel.kt", l = {81}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeGatewayState$1, reason: invalid class name and case insensitive filesystem */
    public final class C141151 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C141151(HtJ<? super C141151> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return StorageRecoveryViewModel.this.new C141151(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return StorageRecoveryViewModel.this.new C141151(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final StorageRecoveryViewModel storageRecoveryViewModel = StorageRecoveryViewModel.this;
                C1BN<HatchStorageRecoveryState> c1bn = storageRecoveryViewModel.store.state;
                C20Z<? super HatchStorageRecoveryState> c20z = new C20Z() { // from class: com.facebook.aura.storagerecovery.StorageRecoveryViewModel.observeGatewayState.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        storageRecoveryViewModel.onGatewayState((HatchStorageRecoveryState) obj2);
                        return Unit.INSTANCE;
                    }

                    public final Object emit(HatchStorageRecoveryState hatchStorageRecoveryState, HtJ<? super Unit> htJ) {
                        storageRecoveryViewModel.onGatewayState(hatchStorageRecoveryState);
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
            throw C3cG.A0p();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeOverlayVisibility$1", f = "StorageRecoveryViewModel.kt", l = {SelfieSnapshotKt.SELFIE_JPEG_QUALITY}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeOverlayVisibility$1, reason: invalid class name and case insensitive filesystem */
    public final class C141161 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeOverlayVisibility$1$1", f = "StorageRecoveryViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeOverlayVisibility$1$1, reason: invalid class name and collision with other inner class name */
        public final class C04041 extends AbstractC07127nr implements G0W<HatchStorageRecoveryState, Boolean, HtJ<? super Boolean>, Object> {
            public /* synthetic */ Object L$0;
            public /* synthetic */ boolean Z$0;
            public int label;

            public C04041(HtJ<? super C04041> htJ) {
                super(3, htJ);
            }

            public final Object invoke(HatchStorageRecoveryState hatchStorageRecoveryState, boolean z, HtJ<? super Boolean> htJ) {
                C04041 c04041 = new C04041(htJ);
                c04041.L$0 = hatchStorageRecoveryState;
                c04041.Z$0 = z;
                return c04041.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                /*
                    r3 = this;
                    java.lang.Object r2 = r3.L$0
                    boolean r1 = r3.Z$0
                    int r0 = r3.label
                    if (r0 != 0) goto L1c
                    X.Hwg.A00(r4)
                    com.facebook.aura.storagerecovery.data.HatchStorageRecoveryState$Inactive r0 = com.facebook.aura.storagerecovery.data.HatchStorageRecoveryState.Inactive.INSTANCE
                    boolean r0 = X.C7384Etj.areEqual(r2, r0)
                    if (r0 != 0) goto L16
                    r0 = 1
                    if (r1 == 0) goto L17
                L16:
                    r0 = 0
                L17:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                L1c:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.storagerecovery.StorageRecoveryViewModel.C141161.C04041.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(HatchStorageRecoveryState hatchStorageRecoveryState, Boolean bool, HtJ<? super Boolean> htJ) {
                return invoke(hatchStorageRecoveryState, AnonymousClass001.A1X(bool), htJ);
            }
        }

        public C141161(HtJ<? super C141161> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return StorageRecoveryViewModel.this.new C141161(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return StorageRecoveryViewModel.this.new C141161(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                StorageRecoveryViewModel storageRecoveryViewModel = StorageRecoveryViewModel.this;
                C60I c60iA03 = C3rb.A03(new C04041(null), storageRecoveryViewModel.store.state, storageRecoveryViewModel.settingsVisible);
                final StorageRecoveryViewModel storageRecoveryViewModel2 = StorageRecoveryViewModel.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.storagerecovery.StorageRecoveryViewModel.observeOverlayVisibility.1.2
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        OverlayApi overlayApi = storageRecoveryViewModel2.overlayApi;
                        StorageRecoveryOverlayScreenKey storageRecoveryOverlayScreenKey = StorageRecoveryOverlayScreenKey.INSTANCE;
                        if (z) {
                            overlayApi.showOverlay(storageRecoveryOverlayScreenKey);
                        } else {
                            overlayApi.hideOverlay(storageRecoveryOverlayScreenKey);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c60iA03.collect(c20z, this) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.storagerecovery.StorageRecoveryViewModel$reconnect$1", f = "StorageRecoveryViewModel.kt", l = {427}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.storagerecovery.StorageRecoveryViewModel$reconnect$1, reason: invalid class name and case insensitive filesystem */
    public final class C141191 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C141191(HtJ<? super C141191> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return StorageRecoveryViewModel.this.new C141191(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return StorageRecoveryViewModel.this.new C141191(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws HatchStorageRecoveryError.Unavailable {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchGatewayConnection hatchGatewayConnection = StorageRecoveryViewModel.this.gateway;
                    this.label = 1;
                    obj = hatchGatewayConnection.reconnectAfterStorageRecovery(this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                if (!AnonymousClass001.A1X(obj) && !StorageRecoveryViewModel.this.gateway.isStorageRecoveryConnected()) {
                    throw HatchStorageRecoveryError.Unavailable.INSTANCE;
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0A(StorageRecoveryViewModelKt.TAG, "Reconnect after storage recovery failed", e2);
                StorageRecoveryViewModel.this.setPhase(StorageRecoveryPhase.RECONNECT_FAILED);
                StorageRecoveryViewModel.this.showError(StorageRecoveryErrorKind.REQUEST_FAILED, false);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.storagerecovery.StorageRecoveryViewModel", f = "StorageRecoveryViewModel.kt", l = {324}, m = "refreshSelection", v = 2)
    /* renamed from: com.facebook.aura.storagerecovery.StorageRecoveryViewModel$refreshSelection$1, reason: invalid class name and case insensitive filesystem */
    public final class C141201 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C141201(HtJ<? super C141201> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StorageRecoveryViewModel.this.refreshSelection(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.storagerecovery.StorageRecoveryViewModel", f = "StorageRecoveryViewModel.kt", l = {373, StaggeredEntranceKt.StaggeredEntranceDurationMs}, m = "reloadAfterDelete", v = 2)
    /* renamed from: com.facebook.aura.storagerecovery.StorageRecoveryViewModel$reloadAfterDelete$1, reason: invalid class name and case insensitive filesystem */
    public final class C141211 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C141211(HtJ<? super C141211> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StorageRecoveryViewModel.this.reloadAfterDelete(null, null, this);
        }
    }

    public StorageRecoveryViewModel(HatchGatewayConnection hatchGatewayConnection, HatchStorageRecoveryStore hatchStorageRecoveryStore, HatchStorageRecoveryClient hatchStorageRecoveryClient, OverlayApi overlayApi) {
        C7384Etj.A0Y(hatchGatewayConnection, 0);
        AnonymousClass005.A11(hatchStorageRecoveryStore, hatchStorageRecoveryClient, overlayApi, 1);
        this.gateway = hatchGatewayConnection;
        this.store = hatchStorageRecoveryStore;
        this.client = hatchStorageRecoveryClient;
        this.overlayApi = overlayApi;
        C9286GCn c9286GCnA14 = C3cG.A14(new StorageRecoveryUiState(StorageRecoveryPhase.LOADING, AHI.A01, C0943AIw.A03, false, null, false, null, null, true));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        this.directoryStack = new AtomicReference<>(C0881AGi.A00);
        this.settingsVisible = AnonymousClass002.A0v(false);
        observeConnectionState();
        observeGatewayState();
        observeOverlayVisibility();
        observeAppForeground();
    }

    public final void onEntryTap(String str) {
        Object next;
        C7384Etj.A0Y(str, 0);
        StorageRecoveryUiState storageRecoveryUiStateA0C = C60O.A0C(this);
        if (storageRecoveryUiStateA0C.isMutationEnabled()) {
            Iterator it = storageRecoveryUiStateA0C.entries.iterator();
            do {
                next = null;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            } while (!str.equals(((HatchStorageRecoveryEntry) next).selectionToken));
            final HatchStorageRecoveryEntry hatchStorageRecoveryEntry = (HatchStorageRecoveryEntry) next;
            if (hatchStorageRecoveryEntry != null) {
                if (storageRecoveryUiStateA0C.isSelecting) {
                    toggleSelection(str);
                } else if (hatchStorageRecoveryEntry.kind != HatchStorageRecoveryEntryKind.DIRECTORY) {
                    requestDeleteConfirmation(Collections.singletonList(hatchStorageRecoveryEntry));
                } else {
                    this.directoryStack.updateAndGet(new UnaryOperator() { // from class: com.facebook.aura.storagerecovery.StorageRecoveryViewModel.onEntryTap.1
                        @Override // java.util.function.Function
                        public final List<Directory> apply(List<Directory> list) {
                            C7384Etj.A0X(list);
                            HatchStorageRecoveryEntry hatchStorageRecoveryEntry2 = hatchStorageRecoveryEntry;
                            return AbstractC0878AGe.A0Q(new Directory(hatchStorageRecoveryEntry2.displayName, hatchStorageRecoveryEntry2.selectionToken), list);
                        }
                    });
                    loadEntries(false);
                }
            }
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[StorageRecoveryPhase.values().length];
            try {
                AnonymousClass005.A0v(StorageRecoveryPhase.AVAILABLE, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(StorageRecoveryPhase.RECONNECT_FAILED, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(StorageRecoveryPhase.LOADING, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(StorageRecoveryPhase.READY, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(StorageRecoveryPhase.DELETING, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(StorageRecoveryPhase.RECONNECTING, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HatchStorageRecoveryErrorCode.values().length];
            try {
                AnonymousClass005.A0v(HatchStorageRecoveryErrorCode.SELECTION_EXPIRED, iArr2, 1);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass005.A0v(HatchStorageRecoveryErrorCode.SELECTION_STALE, iArr2, 2);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass005.A0v(HatchStorageRecoveryErrorCode.RECOVERY_NOT_ACTIVE, iArr2, 3);
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private final void delete(List<HatchStorageRecoveryEntry> list) {
        HoC hoC = this.work;
        if (hoC != null) {
            hoC.A5w(null);
        }
        Directory directoryA00 = AbstractC06907md.A00(this);
        String str = directoryA00 != null ? directoryA00.selectionToken : null;
        setPhase(StorageRecoveryPhase.DELETING);
        this.work = GAo.A02(C79.A00, AnonymousClass001.A0y(), new AnonymousClass1(list, str, null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deleteAll(java.util.List<com.facebook.aura.storagerecovery.data.HatchStorageRecoveryEntry> r10, java.lang.String r11, X.HtJ<? super com.facebook.aura.storagerecovery.data.HatchStorageRecoveryDeleteReceipt> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.facebook.aura.storagerecovery.StorageRecoveryViewModel.C141111
            if (r0 == 0) goto L25
            r3 = r12
            com.facebook.aura.storagerecovery.StorageRecoveryViewModel$deleteAll$1 r3 = (com.facebook.aura.storagerecovery.StorageRecoveryViewModel.C141111) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r1 = r3.result
            X.Hji r8 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r4 = 2
            r7 = 1
            r2 = 0
            if (r0 == 0) goto L35
            if (r0 == r7) goto L30
            if (r0 != r4) goto L2b
            X.Hwg.A00(r1)
            return r2
        L25:
            com.facebook.aura.storagerecovery.StorageRecoveryViewModel$deleteAll$1 r3 = new com.facebook.aura.storagerecovery.StorageRecoveryViewModel$deleteAll$1
            r3.<init>(r12)
            goto L12
        L2b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L30:
            java.lang.Object r11 = r3.L$1
            java.lang.String r11 = (java.lang.String) r11
            goto L65
        L35:
            X.Hwg.A00(r1)
            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient r6 = r9.client     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L99
            java.util.ArrayList r5 = X.AnonymousClass003.A0i(r10)     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L99
            java.util.Iterator r1 = r10.iterator()     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L99
        L42:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L99
            if (r0 == 0) goto L54
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L99
            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryEntry r0 = (com.facebook.aura.storagerecovery.data.HatchStorageRecoveryEntry) r0     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L99
            java.lang.String r0 = r0.selectionToken     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L99
            r5.add(r0)     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L99
            goto L42
        L54:
            r3.L$0 = r2     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L99
            r3.L$1 = r11     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L99
            r3.label = r7     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L99
            java.lang.String r0 = X.AnonymousClass002.A0k()     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L99
            java.lang.Object r1 = r6.delete(r5, r0, r3)     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L99
            if (r1 != r8) goto L68
            return r8
        L65:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L99
        L68:
            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryDeleteReceipt r1 = (com.facebook.aura.storagerecovery.data.HatchStorageRecoveryDeleteReceipt) r1     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L99
            boolean r0 = r9.isStillViewing(r11)     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L99
            if (r0 != 0) goto L71
            return r2
        L71:
            r9.updateUsage(r1)     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L99
            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryServerStatus r0 = r1.serverStatusAfter     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L99
            if (r0 == 0) goto L84
            boolean r0 = r0.isRecoveryActive()     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L99
            if (r0 != 0) goto L84
            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryStore r0 = r9.store     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L99
            r0.setAvailable()     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L99
            return r2
        L84:
            return r1
        L85:
            r1 = move-exception
            boolean r0 = r9.isStillViewing(r11)
            if (r0 != 0) goto L8d
            return r2
        L8d:
            r3.L$0 = r2
            r3.L$1 = r2
            r3.L$2 = r2
            r3.label = r4
            r9.onDeleteFailed(r1, r3)
            return r2
        L99:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.storagerecovery.StorageRecoveryViewModel.deleteAll(java.util.List, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0063 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object listAllEntries(java.lang.String r10, X.HtJ<? super java.util.List<com.facebook.aura.storagerecovery.data.HatchStorageRecoveryEntry>> r11) throws com.facebook.aura.storagerecovery.data.HatchStorageRecoveryError.InvalidResponse {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.facebook.aura.storagerecovery.StorageRecoveryViewModel.C141121
            if (r0 == 0) goto L66
            r7 = r11
            com.facebook.aura.storagerecovery.StorageRecoveryViewModel$listAllEntries$1 r7 = (com.facebook.aura.storagerecovery.StorageRecoveryViewModel.C141121) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L66
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r1 = r7.result
            X.Hji r8 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L48
            if (r0 != r6) goto L6d
            java.lang.Object r4 = r7.L$2
            java.util.Set r4 = (java.util.Set) r4
            java.lang.Object r3 = r7.L$1
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = r7.L$0
            java.lang.String r10 = X.C3cG.A0d(r0, r1)
        L2c:
            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryListResult r1 = (com.facebook.aura.storagerecovery.data.HatchStorageRecoveryListResult) r1
            java.util.List<com.facebook.aura.storagerecovery.data.HatchStorageRecoveryEntry> r0 = r1.entries
            r3.addAll(r0)
            java.lang.String r2 = r1.nextCursor
            if (r2 == 0) goto L6c
            if (r10 == 0) goto L6c
            boolean r0 = X.C7BY.A0j(r2)
            if (r0 != 0) goto L6c
            boolean r0 = r4.add(r2)
            if (r0 != 0) goto L51
            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryError$InvalidResponse r0 = com.facebook.aura.storagerecovery.data.HatchStorageRecoveryError.InvalidResponse.INSTANCE
            throw r0
        L48:
            java.util.ArrayList r3 = X.C60O.A12(r1)
            java.util.LinkedHashSet r4 = X.C3cG.A0k()
            r2 = r5
        L51:
            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient r1 = r9.client
            r7.L$0 = r10
            r7.L$1 = r3
            r7.L$2 = r4
            r7.L$3 = r5
            r7.label = r6
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.Object r1 = r1.listEntries(r10, r2, r0, r7)
            if (r1 != r8) goto L2c
            return r8
        L66:
            com.facebook.aura.storagerecovery.StorageRecoveryViewModel$listAllEntries$1 r7 = new com.facebook.aura.storagerecovery.StorageRecoveryViewModel$listAllEntries$1
            r7.<init>(r11)
            goto L12
        L6c:
            return r3
        L6d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.storagerecovery.StorageRecoveryViewModel.listAllEntries(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadEntries(boolean z) {
        StorageRecoveryUiState value;
        StorageRecoveryPhase storageRecoveryPhase;
        AHI ahi;
        C0943AIw c0943AIw;
        String str;
        Double d;
        boolean z2;
        StorageRecoveryDialog storageRecoveryDialog;
        HoC hoC = this.work;
        if (hoC != null) {
            hoC.A5w(null);
        }
        Directory directoryA00 = AbstractC06907md.A00(this);
        String str2 = directoryA00 != null ? directoryA00.selectionToken : null;
        BLG<StorageRecoveryUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            StorageRecoveryUiState storageRecoveryUiState = value;
            storageRecoveryPhase = StorageRecoveryPhase.LOADING;
            ahi = AHI.A01;
            c0943AIw = C0943AIw.A03;
            Directory directoryA002 = AbstractC06907md.A00(this);
            str = directoryA002 != null ? directoryA002.displayName : null;
            d = storageRecoveryUiState.usagePercentage;
            z2 = storageRecoveryUiState.canDelete;
            storageRecoveryDialog = storageRecoveryUiState.dialog;
            AnonymousClass005.A0x(storageRecoveryPhase, ahi, c0943AIw);
        } while (!blg.A6e(value, new StorageRecoveryUiState(storageRecoveryPhase, ahi, c0943AIw, false, d, z2, str, storageRecoveryDialog, true)));
        this.work = GAo.A02(C79.A00, AnonymousClass001.A0y(), new AnonymousClass2(z, this, str2, null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onDeleteFailed(java.lang.Throwable r3, X.HtJ<? super kotlin.Unit> r4) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.facebook.aura.storagerecovery.data.HatchStorageRecoveryError.Api
            if (r0 == 0) goto L26
            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryError$Api r3 = (com.facebook.aura.storagerecovery.data.HatchStorageRecoveryError.Api) r3
            if (r3 == 0) goto L26
            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryErrorCode r0 = r3.code
            if (r0 == 0) goto L26
            int r1 = r0.ordinal()
            r0 = 7
            if (r1 == r0) goto L22
            r0 = 8
            if (r1 == r0) goto L22
            r0 = 4
            if (r1 != r0) goto L26
            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryStore r0 = r2.store
            r0.setAvailable()
        L1f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L22:
            r2.onSelectionExpired()
            goto L1f
        L26:
            r2.resetSelection()
            com.facebook.aura.storagerecovery.StorageRecoveryErrorKind r1 = com.facebook.aura.storagerecovery.StorageRecoveryErrorKind.DELETE_FAILED
            r0 = 0
            r2.showError(r1, r0)
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.storagerecovery.StorageRecoveryViewModel.onDeleteFailed(java.lang.Throwable, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onGatewayState(HatchStorageRecoveryState hatchStorageRecoveryState) {
        StorageRecoveryUiState value;
        StorageRecoveryPhase storageRecoveryPhase;
        Double d;
        boolean z;
        AHD<HatchStorageRecoveryEntry> ahd;
        BQI<String> bqi;
        boolean z2;
        boolean z3;
        String str;
        StorageRecoveryDialog storageRecoveryDialog;
        StorageRecoveryUiState value2;
        Double dValueOf;
        boolean z4;
        StorageRecoveryPhase storageRecoveryPhase2;
        AHD<HatchStorageRecoveryEntry> ahd2;
        BQI<String> bqi2;
        boolean z5;
        String str2;
        StorageRecoveryDialog storageRecoveryDialog2;
        boolean z6;
        if (C7384Etj.areEqual(hatchStorageRecoveryState, HatchStorageRecoveryState.Required.INSTANCE)) {
            reloadFromRoot();
            return;
        }
        if (hatchStorageRecoveryState instanceof HatchStorageRecoveryState.Active) {
            BLG<StorageRecoveryUiState> blg = this._uiState;
            do {
                value2 = blg.getValue();
                StorageRecoveryUiState storageRecoveryUiState = value2;
                HatchStorageRecoveryState.Active active = (HatchStorageRecoveryState.Active) hatchStorageRecoveryState;
                dValueOf = Double.valueOf(StorageRecoveryViewModelKt.clampPercent(active.status.usagePercentage));
                z4 = active.status.canDelete;
                storageRecoveryPhase2 = storageRecoveryUiState.phase;
                ahd2 = storageRecoveryUiState.entries;
                bqi2 = storageRecoveryUiState.selectedTokens;
                z5 = storageRecoveryUiState.isSelecting;
                str2 = storageRecoveryUiState.currentDirectoryName;
                storageRecoveryDialog2 = storageRecoveryUiState.dialog;
                z6 = storageRecoveryUiState.isFileListVisible;
                AnonymousClass005.A0x(storageRecoveryPhase2, ahd2, bqi2);
            } while (!blg.A6e(value2, new StorageRecoveryUiState(storageRecoveryPhase2, ahd2, bqi2, z5, dValueOf, z4, str2, storageRecoveryDialog2, z6)));
            return;
        }
        if (C7384Etj.areEqual(hatchStorageRecoveryState, HatchStorageRecoveryState.Reconnecting.INSTANCE)) {
            setPhase(StorageRecoveryPhase.RECONNECTING);
            return;
        }
        if (!C7384Etj.areEqual(hatchStorageRecoveryState, HatchStorageRecoveryState.Available.INSTANCE)) {
            if (!C7384Etj.areEqual(hatchStorageRecoveryState, HatchStorageRecoveryState.Inactive.INSTANCE)) {
                throw C3cG.A0q();
            }
            HoC hoC = this.work;
            if (hoC != null) {
                hoC.A5w(null);
            }
            AnonymousClass001.A1E(this._uiState, null, new StorageRecoveryUiState(StorageRecoveryPhase.LOADING, AHI.A01, C0943AIw.A03, false, null, false, null, null, true));
            return;
        }
        BLG<StorageRecoveryUiState> blg2 = this._uiState;
        do {
            value = blg2.getValue();
            StorageRecoveryUiState storageRecoveryUiState2 = value;
            storageRecoveryPhase = StorageRecoveryPhase.AVAILABLE;
            d = storageRecoveryUiState2.entries.isEmpty() ? null : storageRecoveryUiState2.usagePercentage;
            z = !storageRecoveryUiState2.entries.isEmpty();
            ahd = storageRecoveryUiState2.entries;
            bqi = storageRecoveryUiState2.selectedTokens;
            z2 = storageRecoveryUiState2.isSelecting;
            z3 = storageRecoveryUiState2.canDelete;
            str = storageRecoveryUiState2.currentDirectoryName;
            storageRecoveryDialog = storageRecoveryUiState2.dialog;
            AnonymousClass005.A0x(storageRecoveryPhase, ahd, bqi);
        } while (!blg2.A6e(value, new StorageRecoveryUiState(storageRecoveryPhase, ahd, bqi, z2, d, z3, str, storageRecoveryDialog, z)));
    }

    private final void onRequestFailed(Throwable th) {
        HatchStorageRecoveryError.Api api;
        if (((!(th instanceof HatchStorageRecoveryError.Api) || (api = (HatchStorageRecoveryError.Api) th) == null) ? null : api.code) == HatchStorageRecoveryErrorCode.RECOVERY_NOT_ACTIVE) {
            this.store.setAvailable();
            return;
        }
        HatchStorageRecoveryError hatchStorageRecoveryError = th instanceof HatchStorageRecoveryError ? (HatchStorageRecoveryError) th : null;
        if (hatchStorageRecoveryError != null && hatchStorageRecoveryError.isSelectionExpired()) {
            onSelectionExpired();
        } else {
            resetSelection();
            showError(StorageRecoveryErrorKind.REQUEST_FAILED, true);
        }
    }

    private final void onSelectionExpired() {
        this.directoryStack.set(C0881AGi.A00);
        loadEntries(false);
        showError(StorageRecoveryErrorKind.SELECTION_EXPIRED, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshSelection(java.util.List<com.facebook.aura.storagerecovery.data.HatchStorageRecoveryEntry> r11, java.lang.String r12, X.HtJ<? super java.util.List<com.facebook.aura.storagerecovery.data.HatchStorageRecoveryEntry>> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.facebook.aura.storagerecovery.StorageRecoveryViewModel.C141201
            if (r0 == 0) goto L27
            r3 = r13
            com.facebook.aura.storagerecovery.StorageRecoveryViewModel$refreshSelection$1 r3 = (com.facebook.aura.storagerecovery.StorageRecoveryViewModel.C141201) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r7 = r3.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r1 = r3.label
            r0 = 1
            r9 = 0
            if (r1 == 0) goto L32
            if (r1 != r0) goto L2d
            java.lang.Object r12 = r3.L$1
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r3.L$0
            java.util.List r11 = (java.util.List) r11
            goto L42
        L27:
            com.facebook.aura.storagerecovery.StorageRecoveryViewModel$refreshSelection$1 r3 = new com.facebook.aura.storagerecovery.StorageRecoveryViewModel$refreshSelection$1
            r3.<init>(r13)
            goto L12
        L2d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L32:
            X.Hwg.A00(r7)
            r3.L$0 = r11     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> La8
            r3.L$1 = r12     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> La8
            r3.label = r0     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> La8
            java.lang.Object r7 = r10.listAllEntries(r12, r3)     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> La8
            if (r7 != r6) goto L45
            return r6
        L42:
            X.Hwg.A00(r7)     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> La8
        L45:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> La8
            boolean r0 = r10.isStillViewing(r12)     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> La8
            if (r0 != 0) goto L4e
            return r9
        L4e:
            java.util.ArrayList r6 = X.C3cG.A0h()     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> La8
            java.util.Iterator r8 = r11.iterator()     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> La8
        L56:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> La8
            if (r0 == 0) goto L8d
            java.lang.Object r5 = r8.next()     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> La8
            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryEntry r5 = (com.facebook.aura.storagerecovery.data.HatchStorageRecoveryEntry) r5     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> La8
            java.util.Iterator r4 = r7.iterator()     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> La8
        L66:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> La8
            if (r0 == 0) goto L8b
            java.lang.Object r3 = r4.next()     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> La8
            r2 = r3
            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryEntry r2 = (com.facebook.aura.storagerecovery.data.HatchStorageRecoveryEntry) r2     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> La8
            java.lang.String r1 = r2.displayName     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> La8
            java.lang.String r0 = r5.displayName     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> La8
            boolean r0 = X.C7384Etj.areEqual(r1, r0)     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> La8
            if (r0 == 0) goto L66
            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryEntryKind r1 = r2.kind     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> La8
            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryEntryKind r0 = r5.kind     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> La8
            if (r1 != r0) goto L66
        L83:
            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryEntry r3 = (com.facebook.aura.storagerecovery.data.HatchStorageRecoveryEntry) r3     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> La8
            if (r3 == 0) goto L56
            r6.add(r3)     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> La8
            goto L56
        L8b:
            r3 = r9
            goto L83
        L8d:
            int r1 = r6.size()     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> La8
            int r0 = r11.size()     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> La8
            if (r1 == r0) goto L9b
            r10.onSelectionExpired()     // Catch: java.lang.Exception -> L9c java.util.concurrent.CancellationException -> La8
            return r9
        L9b:
            return r6
        L9c:
            r1 = move-exception
            boolean r0 = r10.isStillViewing(r12)
            if (r0 != 0) goto La4
            return r9
        La4:
            r10.onRequestFailed(r1)
            return r9
        La8:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.storagerecovery.StorageRecoveryViewModel.refreshSelection(java.util.List, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[Catch: Exception -> 0x0147, CancellationException -> 0x0154, TryCatch #2 {CancellationException -> 0x0154, Exception -> 0x0147, blocks: (B:33:0x008a, B:34:0x008d, B:36:0x0095, B:38:0x0098, B:39:0x00a0, B:41:0x00a6, B:43:0x00b1, B:46:0x00b8, B:47:0x00bc, B:49:0x00c2, B:51:0x00d2, B:53:0x00d8, B:54:0x00dc, B:55:0x00e4, B:57:0x00ea, B:58:0x00f6, B:59:0x00f8, B:61:0x013b, B:63:0x0141, B:20:0x0059, B:21:0x005c, B:23:0x0064, B:25:0x0067, B:28:0x0071, B:30:0x0077, B:17:0x0048), top: B:72:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098 A[Catch: Exception -> 0x0147, CancellationException -> 0x0154, TryCatch #2 {CancellationException -> 0x0154, Exception -> 0x0147, blocks: (B:33:0x008a, B:34:0x008d, B:36:0x0095, B:38:0x0098, B:39:0x00a0, B:41:0x00a6, B:43:0x00b1, B:46:0x00b8, B:47:0x00bc, B:49:0x00c2, B:51:0x00d2, B:53:0x00d8, B:54:0x00dc, B:55:0x00e4, B:57:0x00ea, B:58:0x00f6, B:59:0x00f8, B:61:0x013b, B:63:0x0141, B:20:0x0059, B:21:0x005c, B:23:0x0064, B:25:0x0067, B:28:0x0071, B:30:0x0077, B:17:0x0048), top: B:72:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reloadAfterDelete(java.util.List<com.facebook.aura.storagerecovery.data.HatchStorageRecoveryEntry> r22, java.lang.String r23, X.HtJ<? super kotlin.Unit> r24) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.storagerecovery.StorageRecoveryViewModel.reloadAfterDelete(java.util.List, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reloadFromRoot() {
        this.directoryStack.set(C0881AGi.A00);
        loadEntries(true);
    }

    private final void resetSelection() {
        StorageRecoveryUiState value;
        StorageRecoveryPhase storageRecoveryPhase;
        C0943AIw c0943AIw;
        AHD<HatchStorageRecoveryEntry> ahd;
        Double d;
        boolean z;
        String str;
        StorageRecoveryDialog storageRecoveryDialog;
        boolean z2;
        BLG<StorageRecoveryUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            StorageRecoveryUiState storageRecoveryUiState = value;
            storageRecoveryPhase = StorageRecoveryPhase.READY;
            c0943AIw = C0943AIw.A03;
            ahd = storageRecoveryUiState.entries;
            d = storageRecoveryUiState.usagePercentage;
            z = storageRecoveryUiState.canDelete;
            str = storageRecoveryUiState.currentDirectoryName;
            storageRecoveryDialog = storageRecoveryUiState.dialog;
            z2 = storageRecoveryUiState.isFileListVisible;
            AnonymousClass005.A0x(storageRecoveryPhase, ahd, c0943AIw);
        } while (!blg.A6e(value, new StorageRecoveryUiState(storageRecoveryPhase, ahd, c0943AIw, false, d, z, str, storageRecoveryDialog, z2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPhase(StorageRecoveryPhase storageRecoveryPhase) {
        StorageRecoveryUiState value;
        BLG<StorageRecoveryUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, StorageRecoveryUiState.copy$default(value, storageRecoveryPhase, null, null, false, null, false, null, null, false, 510, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(StorageRecoveryErrorKind storageRecoveryErrorKind, boolean z) {
        StorageRecoveryUiState value;
        BLG<StorageRecoveryUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, StorageRecoveryUiState.copy$default(value, null, null, null, false, null, false, null, new StorageRecoveryDialog.Error(storageRecoveryErrorKind, z), false, 383, null)));
    }

    private final void toggleSelection(String str) {
        StorageRecoveryUiState value;
        BQI bqiA09;
        StorageRecoveryPhase storageRecoveryPhase;
        AHD<HatchStorageRecoveryEntry> ahd;
        Double d;
        boolean z;
        String str2;
        StorageRecoveryDialog storageRecoveryDialog;
        boolean z2;
        BLG<StorageRecoveryUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            StorageRecoveryUiState storageRecoveryUiState = value;
            Set setA0f = AbstractC0878AGe.A0f(storageRecoveryUiState.selectedTokens);
            if (!setA0f.remove(str)) {
                setA0f.add(str);
            }
            bqiA09 = AGI.A09(setA0f);
            storageRecoveryPhase = storageRecoveryUiState.phase;
            ahd = storageRecoveryUiState.entries;
            d = storageRecoveryUiState.usagePercentage;
            z = storageRecoveryUiState.canDelete;
            str2 = storageRecoveryUiState.currentDirectoryName;
            storageRecoveryDialog = storageRecoveryUiState.dialog;
            z2 = storageRecoveryUiState.isFileListVisible;
            AnonymousClass005.A0x(storageRecoveryPhase, ahd, bqiA09);
        } while (!blg.A6e(value, new StorageRecoveryUiState(storageRecoveryPhase, ahd, bqiA09, true, d, z, str2, storageRecoveryDialog, z2)));
    }

    private final void updateUsage(HatchStorageRecoveryDeleteReceipt hatchStorageRecoveryDeleteReceipt) {
        StorageRecoveryUiState value;
        Double dUsageFromAvailableBytes = hatchStorageRecoveryDeleteReceipt.usagePercentageAfter;
        if (dUsageFromAvailableBytes == null && (dUsageFromAvailableBytes = usageFromAvailableBytes(hatchStorageRecoveryDeleteReceipt.availableBytesAfter)) == null) {
            return;
        }
        double dDoubleValue = dUsageFromAvailableBytes.doubleValue();
        BLG<StorageRecoveryUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, StorageRecoveryUiState.copy$default(value, null, null, null, false, Double.valueOf(StorageRecoveryViewModelKt.clampPercent(dDoubleValue)), false, null, null, false, 495, null)));
    }

    private final Double usageFromAvailableBytes(Long l) {
        HatchStorageRecoveryState.Active active;
        HatchStorageRecoveryStatus hatchStorageRecoveryStatus;
        HatchStorageRecoveryState value = this.store.state.getValue();
        Long lValueOf = (!(value instanceof HatchStorageRecoveryState.Active) || (active = (HatchStorageRecoveryState.Active) value) == null || (hatchStorageRecoveryStatus = active.status) == null) ? null : Long.valueOf(hatchStorageRecoveryStatus.totalBytes);
        if (l == null || lValueOf == null) {
            return null;
        }
        long jLongValue = lValueOf.longValue();
        if (jLongValue > 0) {
            return Double.valueOf(((jLongValue - ATD.A07(l.longValue(), 0L, jLongValue)) / jLongValue) * 100.0d);
        }
        return null;
    }

    public final C1BN<StorageRecoveryUiState> getUiState() {
        return this.uiState;
    }

    public final void onDialogDismissed() {
        while (!C60R.A1a(this._uiState)) {
        }
    }

    public final void onNavigateBack() {
        if (this.directoryStack.get().isEmpty() || !C60O.A0C(this).getCanNavigateBack()) {
            return;
        }
        this.directoryStack.updateAndGet(new UnaryOperator() { // from class: com.facebook.aura.storagerecovery.StorageRecoveryViewModel.onNavigateBack.1
            @Override // java.util.function.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                C7384Etj.A0X(list);
                return AbstractC0878AGe.A0d(list, 1);
            }

            public final List<Directory> apply(List<Directory> list) {
                C7384Etj.A0X(list);
                return AbstractC0878AGe.A0d(list, 1);
            }
        });
        loadEntries(false);
    }

    public final void onRetry() {
        while (!C60R.A1a(this._uiState)) {
        }
        loadEntries(C7384Etj.areEqual(this.store.state.getValue(), HatchStorageRecoveryState.Required.INSTANCE));
    }

    public final void onSettingsVisibilityChanged(boolean z) {
        AnonymousClass004.A1D(z, this.settingsVisible);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isStillViewing(String str) {
        Directory directoryA00 = AbstractC06907md.A00(this);
        return C7384Etj.areEqual(directoryA00 != null ? directoryA00.selectionToken : null, str);
    }

    private final void observeAppForeground() {
        AnonymousClass001.A1I(AuraDispatchers.mainImmediate, new C141131(null), AEu.A00(this));
    }

    private final void observeConnectionState() {
        AnonymousClass001.A1I(C3cG.A0v(), new C141141(null), AEu.A00(this));
    }

    private final void observeGatewayState() {
        AnonymousClass001.A1I(C3cG.A0v(), new C141151(null), AEu.A00(this));
    }

    private final void observeOverlayVisibility() {
        AnonymousClass001.A1I(C3cG.A0v(), new C141161(null), AEu.A00(this));
    }

    private final void reconnect() {
        StorageRecoveryPhase storageRecoveryPhase = C60O.A0C(this).phase;
        StorageRecoveryPhase storageRecoveryPhase2 = StorageRecoveryPhase.RECONNECTING;
        if (storageRecoveryPhase != storageRecoveryPhase2) {
            setPhase(storageRecoveryPhase2);
            HtJ htJA13 = AnonymousClass006.A13(this.work);
            BLL bllA00 = AEu.A00(this);
            this.work = GAo.A02(C79.A00, AnonymousClass001.A0y(), new C141191(htJA13), bllA00);
        }
    }

    private final void requestDeleteConfirmation(List<HatchStorageRecoveryEntry> list) {
        StorageRecoveryUiState value;
        if (list.isEmpty() || !C60O.A0C(this).isMutationEnabled()) {
            return;
        }
        BLG<StorageRecoveryUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, StorageRecoveryUiState.copy$default(value, null, null, null, false, null, false, null, new StorageRecoveryDialog.ConfirmDelete(AGI.A07(list)), false, 383, null)));
    }

    public final void onDeleteConfirmed() {
        StorageRecoveryDialog.ConfirmDelete confirmDelete;
        StorageRecoveryDialog storageRecoveryDialog = C60O.A0C(this).dialog;
        AHD<HatchStorageRecoveryEntry> ahd = null;
        if ((storageRecoveryDialog instanceof StorageRecoveryDialog.ConfirmDelete) && (confirmDelete = (StorageRecoveryDialog.ConfirmDelete) storageRecoveryDialog) != null) {
            ahd = confirmDelete.entries;
        }
        while (!C60R.A1a(this._uiState)) {
        }
        if (ahd == null || ahd.isEmpty()) {
            return;
        }
        delete(ahd);
    }

    public final void onDeleteSelected() {
        StorageRecoveryUiState storageRecoveryUiStateA0C = C60O.A0C(this);
        AHD<HatchStorageRecoveryEntry> ahd = storageRecoveryUiStateA0C.entries;
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : ahd) {
            C60Q.A1G(((HatchStorageRecoveryEntry) obj).selectionToken, obj, arrayListA0h, storageRecoveryUiStateA0C.selectedTokens);
        }
        requestDeleteConfirmation(arrayListA0h);
    }

    public final void onPrimaryAction() {
        switch (C60O.A0C(this).phase.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            case 4:
            case 5:
                reconnect();
                return;
            default:
                throw C3cG.A0q();
        }
    }

    public final void onToggleSelectionMode() {
        StorageRecoveryUiState value;
        C0943AIw c0943AIw;
        boolean z;
        StorageRecoveryPhase storageRecoveryPhase;
        AHD<HatchStorageRecoveryEntry> ahd;
        Double d;
        boolean z2;
        String str;
        StorageRecoveryDialog storageRecoveryDialog;
        boolean z3;
        if (C60O.A0C(this).isMutationEnabled()) {
            BLG<StorageRecoveryUiState> blg = this._uiState;
            do {
                value = blg.getValue();
                StorageRecoveryUiState storageRecoveryUiState = value;
                c0943AIw = C0943AIw.A03;
                z = !storageRecoveryUiState.isSelecting;
                storageRecoveryPhase = storageRecoveryUiState.phase;
                ahd = storageRecoveryUiState.entries;
                d = storageRecoveryUiState.usagePercentage;
                z2 = storageRecoveryUiState.canDelete;
                str = storageRecoveryUiState.currentDirectoryName;
                storageRecoveryDialog = storageRecoveryUiState.dialog;
                z3 = storageRecoveryUiState.isFileListVisible;
                AnonymousClass005.A0x(storageRecoveryPhase, ahd, c0943AIw);
            } while (!blg.A6e(value, new StorageRecoveryUiState(storageRecoveryPhase, ahd, c0943AIw, z, d, z2, str, storageRecoveryDialog, z3)));
        }
    }
}
