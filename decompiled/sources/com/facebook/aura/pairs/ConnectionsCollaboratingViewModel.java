package com.facebook.aura.pairs;

import X.AEs;
import X.AEu;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BLG;
import X.BLL;
import X.BO6;
import X.C0953AJg;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C78T;
import X.C79;
import X.C9258GBl;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC2261BLa;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.library.repo.ArtifactItem;
import com.facebook.aura.library.repo.ArtifactsDataSource;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class ConnectionsCollaboratingViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<ConnectionsCollaboratingUiState> _uiState;
    public final ArtifactsDataSource artifacts;
    public final String groupConnectionId;
    public final InterfaceC2261BLa loadLock;
    public final String museId;
    public final PairsRepository repository;
    public final C1BN<ConnectionsCollaboratingUiState> uiState;

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsCollaboratingViewModel$1", f = "ConnectionsCollaboratingViewModel.kt", l = {61}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsCollaboratingViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConnectionsCollaboratingViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConnectionsCollaboratingViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final ConnectionsCollaboratingViewModel connectionsCollaboratingViewModel = ConnectionsCollaboratingViewModel.this;
                C20Q<Unit> c20q = connectionsCollaboratingViewModel.repository.changes;
                C20Z<? super Unit> c20z = new C20Z() { // from class: com.facebook.aura.pairs.ConnectionsCollaboratingViewModel.1.1
                    public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                        return C3cG.A0U(connectionsCollaboratingViewModel.load(null, htJ));
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((Unit) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (c20q.collect(c20z, this) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsCollaboratingViewModel$2", f = "ConnectionsCollaboratingViewModel.kt", l = {64}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsCollaboratingViewModel$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConnectionsCollaboratingViewModel.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConnectionsCollaboratingViewModel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final ConnectionsCollaboratingViewModel connectionsCollaboratingViewModel = ConnectionsCollaboratingViewModel.this;
                C1BN<AHD<ArtifactItem>> c1bn = connectionsCollaboratingViewModel.artifacts.items;
                C20Z<? super AHD<ArtifactItem>> c20z = new C20Z() { // from class: com.facebook.aura.pairs.ConnectionsCollaboratingViewModel.2.1
                    public final Object emit(AHD<ArtifactItem> ahd, HtJ<? super Unit> htJ) {
                        ConnectionsCollaboratingUiState value;
                        BO6<String, ConnectionsSpaceIcon> bo6SpaceIcons;
                        AHD<ConnectionsResource> ahd2;
                        String str;
                        boolean z;
                        BLG<ConnectionsCollaboratingUiState> blg = connectionsCollaboratingViewModel._uiState;
                        do {
                            value = blg.getValue();
                            ConnectionsCollaboratingUiState connectionsCollaboratingUiState = value;
                            bo6SpaceIcons = ConnectionsCollaboratingViewModelKt.spaceIcons(connectionsCollaboratingUiState.items, ahd);
                            ahd2 = connectionsCollaboratingUiState.items;
                            str = connectionsCollaboratingUiState.next;
                            z = connectionsCollaboratingUiState.isLoading;
                            AnonymousClass003.A0u(ahd2, bo6SpaceIcons);
                        } while (!blg.A6e(value, new ConnectionsCollaboratingUiState(ahd2, bo6SpaceIcons, str, z)));
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((AHD<ArtifactItem>) obj2, (HtJ<? super Unit>) htJ);
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

    public final class Factory extends AuraViewModelFactory<ConnectionsCollaboratingViewModel> {
        public static final int $stable = 8;
        public final String groupConnectionId;
        public final String museId;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz, String str, String str2) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
            this.museId = str;
            this.groupConnectionId = str2;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ConnectionsCollaboratingViewModel create() {
            return new ConnectionsCollaboratingViewModel(PairsRepository.Companion.getInstance(this.userSession), ArtifactsDataSource.Companion.getInstance(this.userSession), this.museId, this.groupConnectionId);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsCollaboratingViewModel", f = "ConnectionsCollaboratingViewModel.kt", l = {157, 81}, m = "load", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsCollaboratingViewModel$load$1, reason: invalid class name and case insensitive filesystem */
    public final class C128191 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C128191(HtJ<? super C128191> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConnectionsCollaboratingViewModel.this.load(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsCollaboratingViewModel$loadMore$1", f = "ConnectionsCollaboratingViewModel.kt", l = {73}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsCollaboratingViewModel$loadMore$1, reason: invalid class name and case insensitive filesystem */
    public final class C128201 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $next;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128201(String str, HtJ<? super C128201> htJ) {
            super(2, htJ);
            this.$next = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConnectionsCollaboratingViewModel.this.new C128201(this.$next, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ConnectionsCollaboratingViewModel connectionsCollaboratingViewModel = ConnectionsCollaboratingViewModel.this;
                String str = this.$next;
                this.label = 1;
                if (connectionsCollaboratingViewModel.load(str, this) == enumC10460Hji) {
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
            return ((C128201) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c A[Catch: all -> 0x013e, TryCatch #5 {all -> 0x013e, blocks: (B:25:0x0081, B:26:0x0084, B:28:0x0088, B:31:0x008e, B:32:0x0096, B:34:0x009c, B:35:0x00ab, B:36:0x00ad, B:40:0x00be, B:41:0x00ca, B:43:0x00d0, B:44:0x00dd, B:46:0x00f1, B:47:0x00f3, B:49:0x00fe, B:39:0x00b8, B:30:0x008c, B:58:0x010c, B:59:0x011b, B:61:0x0136, B:65:0x013d), top: B:73:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c A[Catch: all -> 0x013e, LOOP:0: B:32:0x0096->B:34:0x009c, LOOP_END, TryCatch #5 {all -> 0x013e, blocks: (B:25:0x0081, B:26:0x0084, B:28:0x0088, B:31:0x008e, B:32:0x0096, B:34:0x009c, B:35:0x00ab, B:36:0x00ad, B:40:0x00be, B:41:0x00ca, B:43:0x00d0, B:44:0x00dd, B:46:0x00f1, B:47:0x00f3, B:49:0x00fe, B:39:0x00b8, B:30:0x008c, B:58:0x010c, B:59:0x011b, B:61:0x0136, B:65:0x013d), top: B:73:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8 A[Catch: all -> 0x013e, TryCatch #5 {all -> 0x013e, blocks: (B:25:0x0081, B:26:0x0084, B:28:0x0088, B:31:0x008e, B:32:0x0096, B:34:0x009c, B:35:0x00ab, B:36:0x00ad, B:40:0x00be, B:41:0x00ca, B:43:0x00d0, B:44:0x00dd, B:46:0x00f1, B:47:0x00f3, B:49:0x00fe, B:39:0x00b8, B:30:0x008c, B:58:0x010c, B:59:0x011b, B:61:0x0136, B:65:0x013d), top: B:73:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0 A[Catch: all -> 0x013e, LOOP:2: B:41:0x00ca->B:43:0x00d0, LOOP_END, TryCatch #5 {all -> 0x013e, blocks: (B:25:0x0081, B:26:0x0084, B:28:0x0088, B:31:0x008e, B:32:0x0096, B:34:0x009c, B:35:0x00ab, B:36:0x00ad, B:40:0x00be, B:41:0x00ca, B:43:0x00d0, B:44:0x00dd, B:46:0x00f1, B:47:0x00f3, B:49:0x00fe, B:39:0x00b8, B:30:0x008c, B:58:0x010c, B:59:0x011b, B:61:0x0136, B:65:0x013d), top: B:73:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1 A[Catch: all -> 0x013e, TryCatch #5 {all -> 0x013e, blocks: (B:25:0x0081, B:26:0x0084, B:28:0x0088, B:31:0x008e, B:32:0x0096, B:34:0x009c, B:35:0x00ab, B:36:0x00ad, B:40:0x00be, B:41:0x00ca, B:43:0x00d0, B:44:0x00dd, B:46:0x00f1, B:47:0x00f3, B:49:0x00fe, B:39:0x00b8, B:30:0x008c, B:58:0x010c, B:59:0x011b, B:61:0x0136, B:65:0x013d), top: B:73:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object load(java.lang.String r14, X.HtJ<? super kotlin.Unit> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsCollaboratingViewModel.load(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final C1BN<ConnectionsCollaboratingUiState> getUiState() {
        return this.uiState;
    }

    public final void loadMore() {
        String str = this._uiState.getValue().next;
        if (str == null || this._uiState.getValue().isLoading) {
            return;
        }
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C128201(str, null), AEu.A00(this));
    }

    public ConnectionsCollaboratingViewModel(PairsRepository pairsRepository, ArtifactsDataSource artifactsDataSource, String str, String str2) {
        boolean zA1b = AnonymousClass004.A1b(pairsRepository, artifactsDataSource);
        this.repository = pairsRepository;
        this.artifacts = artifactsDataSource;
        this.museId = str;
        this.groupConnectionId = str2;
        C9286GCn c9286GCnA14 = C3cG.A14(new ConnectionsCollaboratingUiState(AHI.A01, C0953AJg.A00(), null, zA1b));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        this.loadLock = new C9258GBl();
        BLL bllA00 = AEu.A00(this);
        AuraDispatchers auraDispatchers = AuraDispatchers.INSTANCE;
        C78T c78tIo = auraDispatchers.io();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        Integer num = C79.A00;
        GAo.A02(num, auraDispatchers.io(), new AnonymousClass2(null), AnonymousClass001.A0e(this, num, c78tIo, anonymousClass1, bllA00));
    }
}
