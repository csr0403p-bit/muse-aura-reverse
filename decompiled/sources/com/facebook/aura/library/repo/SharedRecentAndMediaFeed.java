package com.facebook.aura.library.repo;

import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.C8eO;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HnJ;
import X.HtJ;
import X.HwV;
import X.Hwg;
import X.Hxb;
import X.HzP;
import X.InterfaceC7549F2g;
import com.facebook.aura.gateway.FileUpdateEvent;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.iap.MC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class SharedRecentAndMediaFeed implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final BLG<AHD<HatchFileOperations.LibraryEntry>> _artifacts;
    public final BLG<Boolean> _isLoadingMoreMedia;
    public final BLG<Boolean> _isLoadingMoreRecents;
    public final BLG<LoadingState> _loadingState;
    public final BLG<AHD<WorkspaceEntry>> _media;
    public final BLG<Boolean> _mediaHasMore;
    public final BLG<AHD<WorkspaceEntry>> _recents;
    public final BLG<Boolean> _recentsHasMore;
    public final C1BN<AHD<HatchFileOperations.LibraryEntry>> artifacts;
    public final Set<String> deletedArtifactPaths;
    public final C1BN<Boolean> isLoadingMoreMedia;
    public final C1BN<Boolean> isLoadingMoreRecents;
    public boolean isSubscribed;
    public final C1BN<LoadingState> loadingState;
    public final C1BN<AHD<WorkspaceEntry>> media;
    public final C1BN<Boolean> mediaHasMoreFlow;
    public final ConcurrentHashMap<String, WorkspaceEntry> mediaMap;
    public final List<String> mediaOrder;
    public int mediaServerOffset;
    public final C1BN<AHD<WorkspaceEntry>> recents;
    public final C1BN<Boolean> recentsHasMoreFlow;
    public final ConcurrentHashMap<String, WorkspaceEntry> recentsMap;
    public int recentsServerOffset;
    public final C3UX scope;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.library.repo.SharedRecentAndMediaFeed", f = "SharedRecentAndMediaFeed.kt", l = {MC.stella_payments_in_app_purchases.__CONFIG__}, m = "loadMoreMedia", v = 2)
    /* renamed from: com.facebook.aura.library.repo.SharedRecentAndMediaFeed$loadMoreMedia$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedRecentAndMediaFeed.this.loadMoreMedia(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.SharedRecentAndMediaFeed", f = "SharedRecentAndMediaFeed.kt", l = {368}, m = "loadMoreRecents", v = 2)
    /* renamed from: com.facebook.aura.library.repo.SharedRecentAndMediaFeed$loadMoreRecents$1, reason: invalid class name and case insensitive filesystem */
    public final class C123101 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C123101(HtJ<? super C123101> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedRecentAndMediaFeed.this.loadMoreRecents(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.SharedRecentAndMediaFeed", f = "SharedRecentAndMediaFeed.kt", l = {128}, m = "refresh", v = 2)
    /* renamed from: com.facebook.aura.library.repo.SharedRecentAndMediaFeed$refresh$1, reason: invalid class name and case insensitive filesystem */
    public final class C123111 extends HzP {
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C123111(HtJ<? super C123111> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedRecentAndMediaFeed.this.refresh(false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.SharedRecentAndMediaFeed$refresh$2", f = "SharedRecentAndMediaFeed.kt", l = {150, 150, 150}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.SharedRecentAndMediaFeed$refresh$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HwV<? extends HatchFileOperations.LibraryResult, ? extends HatchFileOperations.LibraryResult, ? extends HatchFileOperations.LibraryResult>>, Object> {
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = SharedRecentAndMediaFeed.this.new AnonymousClass2(htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r10 = r12.L$0
                X.3UX r10 = (X.C3UX) r10
                X.Hji r6 = X.EnumC10460Hji.A02
                int r0 = r12.label
                r7 = 3
                r9 = 2
                r8 = 1
                if (r0 == 0) goto L20
                if (r0 == r8) goto L5a
                if (r0 == r9) goto L7b
                if (r0 != r7) goto L9d
                java.lang.Object r1 = r12.L$5
                java.lang.Object r2 = r12.L$4
                X.Hwg.A00(r13)
            L1a:
                X.HwV r0 = new X.HwV
                r0.<init>(r2, r1, r13)
                return r0
            L20:
                X.Hwg.A00(r13)
                com.facebook.aura.library.repo.SharedRecentAndMediaFeed r1 = com.facebook.aura.library.repo.SharedRecentAndMediaFeed.this
                r5 = 0
                com.facebook.aura.library.repo.SharedRecentAndMediaFeed$refresh$2$recentsDeferred$1 r0 = new com.facebook.aura.library.repo.SharedRecentAndMediaFeed$refresh$2$recentsDeferred$1
                r0.<init>(r1, r5)
                X.6ys r4 = X.C6ys.A00
                java.lang.Integer r3 = X.C79.A00
                X.Hrx r2 = X.GAo.A01(r3, r4, r0, r10)
                com.facebook.aura.library.repo.SharedRecentAndMediaFeed r1 = com.facebook.aura.library.repo.SharedRecentAndMediaFeed.this
                com.facebook.aura.library.repo.SharedRecentAndMediaFeed$refresh$2$mediaDeferred$1 r0 = new com.facebook.aura.library.repo.SharedRecentAndMediaFeed$refresh$2$mediaDeferred$1
                r0.<init>(r1, r5)
                X.Hrx r11 = X.GAo.A01(r3, r4, r0, r10)
                com.facebook.aura.library.repo.SharedRecentAndMediaFeed r1 = com.facebook.aura.library.repo.SharedRecentAndMediaFeed.this
                com.facebook.aura.library.repo.SharedRecentAndMediaFeed$refresh$2$artifactsDeferred$1 r0 = new com.facebook.aura.library.repo.SharedRecentAndMediaFeed$refresh$2$artifactsDeferred$1
                r0.<init>(r1, r5)
                X.Hrx r1 = X.GAo.A01(r3, r4, r0, r10)
                r12.L$0 = r5
                r12.L$1 = r5
                r12.L$2 = r11
                r12.L$3 = r1
                r12.label = r8
                java.lang.Object r13 = r2.A0E(r12)
                if (r13 != r6) goto L65
            L59:
                return r6
            L5a:
                java.lang.Object r1 = r12.L$3
                X.27k r1 = (X.C27k) r1
                java.lang.Object r11 = r12.L$2
                X.27k r11 = (X.C27k) r11
                X.Hwg.A00(r13)
            L65:
                r0 = 0
                r12.L$0 = r0
                r12.L$1 = r0
                r12.L$2 = r0
                r12.L$3 = r1
                r12.L$4 = r13
                r12.label = r9
                java.lang.Object r0 = X.C3cG.A0W(r11, r12)
                if (r0 == r6) goto L59
                r2 = r13
                r13 = r0
                goto L84
            L7b:
                java.lang.Object r2 = r12.L$4
                java.lang.Object r1 = r12.L$3
                X.27k r1 = (X.C27k) r1
                X.Hwg.A00(r13)
            L84:
                r0 = 0
                r12.L$0 = r0
                r12.L$1 = r0
                r12.L$2 = r0
                r12.L$3 = r0
                r12.L$4 = r2
                r12.L$5 = r13
                r12.label = r7
                java.lang.Object r0 = X.C3cG.A0W(r1, r12)
                if (r0 == r6) goto L59
                r1 = r13
                r13 = r0
                goto L1a
            L9d:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.SharedRecentAndMediaFeed.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super HwV<? extends HatchFileOperations.LibraryResult, ? extends HatchFileOperations.LibraryResult, ? extends HatchFileOperations.LibraryResult>> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.SharedRecentAndMediaFeed$start$1", f = "SharedRecentAndMediaFeed.kt", l = {106}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.SharedRecentAndMediaFeed$start$1, reason: invalid class name and case insensitive filesystem */
    public final class C123121 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C123121(HtJ<? super C123121> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SharedRecentAndMediaFeed.this.new C123121(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SharedRecentAndMediaFeed.this.new C123121(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SharedRecentAndMediaFeed sharedRecentAndMediaFeed = SharedRecentAndMediaFeed.this;
                this.label = 1;
                if (sharedRecentAndMediaFeed.refresh(false, this) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.library.repo.SharedRecentAndMediaFeed$subscribeToFileEvents$1", f = "SharedRecentAndMediaFeed.kt", l = {250}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.SharedRecentAndMediaFeed$subscribeToFileEvents$1, reason: invalid class name and case insensitive filesystem */
    public final class C123131 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public C123131(HtJ<? super C123131> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SharedRecentAndMediaFeed.this.new C123131(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SharedRecentAndMediaFeed.this.new C123131(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    C1BN<FileUpdateEvent> c1bn = HatchGatewayServiceManager.INSTANCE.getGateway(SharedRecentAndMediaFeed.this.userSession).getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().fileUpdateEvents;
                    final SharedRecentAndMediaFeed sharedRecentAndMediaFeed = SharedRecentAndMediaFeed.this;
                    C20Z<? super FileUpdateEvent> c20z = new C20Z() { // from class: com.facebook.aura.library.repo.SharedRecentAndMediaFeed.subscribeToFileEvents.1.1
                        public final Object emit(FileUpdateEvent fileUpdateEvent, HtJ<? super Unit> htJ) {
                            Object objOnFileEvent;
                            return (fileUpdateEvent == null || (objOnFileEvent = sharedRecentAndMediaFeed.onFileEvent(fileUpdateEvent, htJ)) != EnumC10460Hji.A02) ? Unit.INSTANCE : objOnFileEvent;
                        }

                        @Override // X.C20Z
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                            return emit((FileUpdateEvent) obj2, (HtJ<? super Unit>) htJ);
                        }
                    };
                    this.L$0 = null;
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
            } catch (Exception e) {
                CFK.A08(SharedRecentAndMediaFeedKt.TAG, "Failed to subscribe to file events", e);
                return Unit.INSTANCE;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.SharedRecentAndMediaFeed", f = "SharedRecentAndMediaFeed.kt", l = {289}, m = "upsertPath", v = 2)
    /* renamed from: com.facebook.aura.library.repo.SharedRecentAndMediaFeed$upsertPath$1, reason: invalid class name and case insensitive filesystem */
    public final class C123141 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C123141(HtJ<? super C123141> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedRecentAndMediaFeed.this.upsertPath(null, this);
        }
    }

    public final void removeByPath(String str) {
        C7384Etj.A0Y(str, 0);
        removePath(str);
    }

    private final void commit() {
        BLG<AHD<WorkspaceEntry>> blg = this._recents;
        Collection<WorkspaceEntry> collectionValues = this.recentsMap.values();
        C7384Etj.A0U(collectionValues);
        blg.Af8(SharedRecentAndMediaFeedKt.sortByModifiedDesc(collectionValues));
        List<String> list = this.mediaOrder;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            WorkspaceEntry workspaceEntry = this.mediaMap.get(it.next());
            if (workspaceEntry != null) {
                arrayListA0h.add(workspaceEntry);
            }
        }
        Set setA0g = AbstractC0878AGe.A0g(this.mediaOrder);
        Collection<WorkspaceEntry> collectionValues2 = this.mediaMap.values();
        ArrayList arrayListA0s = C60Q.A0s(collectionValues2);
        for (WorkspaceEntry workspaceEntry2 : collectionValues2) {
            C60Q.A1H(workspaceEntry2.relativePath, workspaceEntry2, arrayListA0s, setA0g);
        }
        C60O.A1L(AbstractC0878AGe.A0P(arrayListA0h, arrayListA0s), this._media);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Object onFileEvent(FileUpdateEvent fileUpdateEvent, HtJ<? super Unit> htJ) {
        String str;
        Object objUpsertPath;
        String str2 = fileUpdateEvent.path;
        if (!C7BY.A0j(str2)) {
            String str3 = fileUpdateEvent.op;
            switch (str3.hashCode()) {
                case -1352294148:
                    str = "create";
                    break;
                case -1335458389:
                    if (str3.equals("delete")) {
                        removePath(str2);
                        break;
                    }
                    break;
                case -1068795718:
                    str = "modify";
                    break;
                case -934594754:
                    str = "rename";
                    break;
                case 3108362:
                    str = "edit";
                    break;
            }
            if (str3.equals(str) && (objUpsertPath = upsertPath(str2, htJ)) == EnumC10460Hji.A02) {
                return objUpsertPath;
            }
        }
        return Unit.INSTANCE;
    }

    private final void subscribeToFileEvents() {
        AnonymousClass001.A1J(new C123131(null), this.scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00d2: INVOKE (r0v2 ?? I:java.util.AbstractMap), (r6 I:java.lang.Object) VIRTUAL call: java.util.AbstractMap.remove(java.lang.Object):java.lang.Object A[MD:(java.lang.Object):V (c)] (LINE:210), block:B:39:0x00d0 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object upsertPath(java.lang.String r10, X.HtJ<? super kotlin.Unit> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.facebook.aura.library.repo.SharedRecentAndMediaFeed.C123141
            if (r0 == 0) goto L22
            r5 = r11
            com.facebook.aura.library.repo.SharedRecentAndMediaFeed$upsertPath$1 r5 = (com.facebook.aura.library.repo.SharedRecentAndMediaFeed.C123141) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L2d
            if (r0 != r3) goto L28
            java.lang.Object r6 = r5.L$1
            java.lang.String r6 = (java.lang.String) r6
            goto L5d
        L22:
            com.facebook.aura.library.repo.SharedRecentAndMediaFeed$upsertPath$1 r5 = new com.facebook.aura.library.repo.SharedRecentAndMediaFeed$upsertPath$1
            r5.<init>(r11)
            goto L12
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r1)
            java.lang.String r6 = com.facebook.aura.library.repo.SharedRecentAndMediaFeedKt.normalizePath(r10)
            boolean r0 = com.facebook.aura.library.repo.SharedRecentAndMediaFeedKt.shouldHidePath(r6)
            if (r0 == 0) goto L4a
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.facebook.aura.library.repo.WorkspaceEntry> r0 = r9.recentsMap
            r0.remove(r6)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.facebook.aura.library.repo.WorkspaceEntry> r0 = r9.mediaMap
            r0.remove(r6)
            r9.commit()
        L47:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L4a:
            com.facebook.aura.gateway.HatchFileOperations r2 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE     // Catch: java.lang.Exception -> Ld0
            X.CGz r1 = r9.userSession     // Catch: java.lang.Exception -> Ld0
            r0 = 0
            r5.L$0 = r0     // Catch: java.lang.Exception -> Ld0
            r5.L$1 = r6     // Catch: java.lang.Exception -> Ld0
            r5.label = r3     // Catch: java.lang.Exception -> Ld0
            java.lang.Object r1 = r2.statFile(r6, r1, r5)     // Catch: java.lang.Exception -> Ld0
            if (r1 != r4) goto L60
            goto Ldf
        L5d:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> Ld0
        L60:
            com.facebook.aura.gateway.HatchFileOperations$StatResult r1 = (com.facebook.aura.gateway.HatchFileOperations.StatResult) r1     // Catch: java.lang.Exception -> Ld0
            boolean r0 = r1 instanceof com.facebook.aura.gateway.HatchFileOperations.StatResult.Failed     // Catch: java.lang.Exception -> Ld0
            if (r0 == 0) goto L76
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.facebook.aura.library.repo.WorkspaceEntry> r0 = r9.recentsMap     // Catch: java.lang.Exception -> Ld0
            r0.remove(r6)     // Catch: java.lang.Exception -> Ld0
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.facebook.aura.library.repo.WorkspaceEntry> r0 = r9.mediaMap     // Catch: java.lang.Exception -> Ld0
            r0.remove(r6)     // Catch: java.lang.Exception -> Ld0
            r9.commit()     // Catch: java.lang.Exception -> Ld0
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> Ld0
            return r0
        L76:
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.aura.gateway.HatchFileOperations.StatResult.Success"
            X.C7384Etj.A0Z(r1, r0)     // Catch: java.lang.Exception -> Ld0
            com.facebook.aura.gateway.HatchFileOperations$StatResult$Success r1 = (com.facebook.aura.gateway.HatchFileOperations.StatResult.Success) r1     // Catch: java.lang.Exception -> Ld0
            com.facebook.aura.gateway.HatchFileOperations$FileEntry r2 = r1.entry     // Catch: java.lang.Exception -> Ld0
            com.facebook.aura.gateway.HatchFileOperations$FileEntryType r1 = r2.type     // Catch: java.lang.Exception -> Ld0
            com.facebook.aura.gateway.HatchFileOperations$FileEntryType r0 = com.facebook.aura.gateway.HatchFileOperations.FileEntryType.FILE     // Catch: java.lang.Exception -> Ld0
            if (r1 == r0) goto L95
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.facebook.aura.library.repo.WorkspaceEntry> r0 = r9.recentsMap     // Catch: java.lang.Exception -> Ld0
            r0.remove(r6)     // Catch: java.lang.Exception -> Ld0
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.facebook.aura.library.repo.WorkspaceEntry> r0 = r9.mediaMap     // Catch: java.lang.Exception -> Ld0
            r0.remove(r6)     // Catch: java.lang.Exception -> Ld0
            r9.commit()     // Catch: java.lang.Exception -> Ld0
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> Ld0
            return r0
        L95:
            java.lang.String r4 = X.C7BY.A0M(r6)     // Catch: java.lang.Exception -> Ld0
            com.facebook.aura.library.repo.WorkspaceEntry$EntryType r5 = com.facebook.aura.library.repo.WorkspaceEntry.EntryType.FILE     // Catch: java.lang.Exception -> Ld0
            java.lang.Long r7 = r2.size     // Catch: java.lang.Exception -> Ld0
            java.lang.String r8 = r2.modifiedAt     // Catch: java.lang.Exception -> Ld0
            com.facebook.aura.library.repo.WorkspaceEntry r3 = new com.facebook.aura.library.repo.WorkspaceEntry     // Catch: java.lang.Exception -> Ld0
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> Ld0
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.facebook.aura.library.repo.WorkspaceEntry> r0 = r9.recentsMap     // Catch: java.lang.Exception -> Ld0
            r0.put(r6, r3)     // Catch: java.lang.Exception -> Ld0
            boolean r1 = com.facebook.aura.library.repo.SharedRecentAndMediaFeedKt.isMediaEntry(r3)     // Catch: java.lang.Exception -> Ld0
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.facebook.aura.library.repo.WorkspaceEntry> r0 = r9.mediaMap
            if (r1 == 0) goto Lc3
            r0.put(r6, r3)     // Catch: java.lang.Exception -> Ld0
            java.util.List<java.lang.String> r0 = r9.mediaOrder     // Catch: java.lang.Exception -> Ld0
            boolean r0 = r0.contains(r6)     // Catch: java.lang.Exception -> Ld0
            if (r0 != 0) goto Lcb
            java.util.List<java.lang.String> r1 = r9.mediaOrder     // Catch: java.lang.Exception -> Ld0
            r0 = 0
            r1.add(r0, r6)     // Catch: java.lang.Exception -> Ld0
            goto Lcb
        Lc3:
            r0.remove(r6)     // Catch: java.lang.Exception -> Ld0
            java.util.List<java.lang.String> r0 = r9.mediaOrder     // Catch: java.lang.Exception -> Ld0
            r0.remove(r6)     // Catch: java.lang.Exception -> Ld0
        Lcb:
            r9.commit()     // Catch: java.lang.Exception -> Ld0
            goto L47
        Ld0:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.facebook.aura.library.repo.WorkspaceEntry> r0 = r9.recentsMap
            r0.remove(r6)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.facebook.aura.library.repo.WorkspaceEntry> r0 = r9.mediaMap
            r0.remove(r6)
            r9.commit()
            goto L47
        Ldf:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.SharedRecentAndMediaFeed.upsertPath(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final void clearData() {
        this.recentsMap.clear();
        this.mediaMap.clear();
        this.mediaOrder.clear();
        this.deletedArtifactPaths.clear();
        this.recentsServerOffset = 0;
        this.mediaServerOffset = 0;
        BLG<AHD<WorkspaceEntry>> blg = this._recents;
        AHI ahi = AHI.A01;
        blg.Af8(ahi);
        this._media.Af8(ahi);
        this._artifacts.Af8(ahi);
        C9286GCn.A00(null, LoadingState.INITIAL, (C9286GCn) this._loadingState);
        AnonymousClass001.A1E(this._recentsHasMore, null, false);
        AnonymousClass001.A1E(this._isLoadingMoreRecents, null, false);
        AnonymousClass001.A1E(this._mediaHasMore, null, false);
        AnonymousClass001.A1E(this._isLoadingMoreMedia, null, false);
        this.isSubscribed = false;
    }

    public final C1BN<AHD<HatchFileOperations.LibraryEntry>> getArtifacts() {
        return this.artifacts;
    }

    public final C1BN<LoadingState> getLoadingState() {
        return this.loadingState;
    }

    public final C1BN<AHD<WorkspaceEntry>> getMedia() {
        return this.media;
    }

    public final C1BN<Boolean> getMediaHasMoreFlow() {
        return this.mediaHasMoreFlow;
    }

    public final C1BN<AHD<WorkspaceEntry>> getRecents() {
        return this.recents;
    }

    public final C1BN<Boolean> getRecentsHasMoreFlow() {
        return this.recentsHasMoreFlow;
    }

    public final C1BN<Boolean> isLoadingMoreMedia() {
        return this.isLoadingMoreMedia;
    }

    public final C1BN<Boolean> isLoadingMoreRecents() {
        return this.isLoadingMoreRecents;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadMoreMedia(X.HtJ<? super kotlin.Unit> r12) {
        /*
            r11 = this;
            java.lang.String r3 = "Failed to load more media: "
            boolean r0 = r12 instanceof com.facebook.aura.library.repo.SharedRecentAndMediaFeed.AnonymousClass1
            if (r0 == 0) goto L20
            r10 = r12
            com.facebook.aura.library.repo.SharedRecentAndMediaFeed$loadMoreMedia$1 r10 = (com.facebook.aura.library.repo.SharedRecentAndMediaFeed.AnonymousClass1) r10
            int r2 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r10.label = r2
        L14:
            java.lang.Object r2 = r10.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r10.label
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 != r1) goto L26
            goto L5e
        L20:
            com.facebook.aura.library.repo.SharedRecentAndMediaFeed$loadMoreMedia$1 r10 = new com.facebook.aura.library.repo.SharedRecentAndMediaFeed$loadMoreMedia$1
            r10.<init>(r12)
            goto L14
        L26:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2b:
            X.Hwg.A00(r2)
            X.BLG<java.lang.Boolean> r0 = r11._isLoadingMoreMedia
            boolean r0 = X.AnonymousClass003.A1Z(r0)
            if (r0 != 0) goto Ld7
            X.BLG<java.lang.Boolean> r0 = r11._mediaHasMore
            boolean r0 = X.AnonymousClass003.A1Z(r0)
            if (r0 == 0) goto Ld7
            X.BLG<java.lang.Boolean> r0 = r11._isLoadingMoreMedia
            X.AnonymousClass004.A1D(r1, r0)
            com.facebook.aura.gateway.HatchFileOperations r5 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r6 = "media"
            X.CGz r7 = r11.userSession     // Catch: java.lang.Throwable -> Lc9
            r0 = 10
            java.lang.Integer r8 = X.C3cG.A0R(r0)     // Catch: java.lang.Throwable -> Lc9
            int r0 = r11.mediaServerOffset     // Catch: java.lang.Throwable -> Lc9
            java.lang.Integer r9 = X.C3cG.A0R(r0)     // Catch: java.lang.Throwable -> Lc9
            r10.label = r1     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r2 = r5.libraryFiles(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lc9
            if (r2 != r4) goto L61
            return r4
        L5e:
            X.Hwg.A00(r2)     // Catch: java.lang.Throwable -> Lc9
        L61:
            com.facebook.aura.gateway.HatchFileOperations$LibraryResult r2 = (com.facebook.aura.gateway.HatchFileOperations.LibraryResult) r2     // Catch: java.lang.Throwable -> Lc9
            boolean r0 = r2 instanceof com.facebook.aura.gateway.HatchFileOperations.LibraryResult.Success     // Catch: java.lang.Throwable -> Lc9
            if (r0 == 0) goto Lb6
            com.facebook.aura.gateway.HatchFileOperations$LibraryResult$Success r2 = (com.facebook.aura.gateway.HatchFileOperations.LibraryResult.Success) r2     // Catch: java.lang.Throwable -> Lc9
            java.util.List<com.facebook.aura.gateway.HatchFileOperations$LibraryEntry> r0 = r2.entries     // Catch: java.lang.Throwable -> Lc9
            java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Throwable -> Lc9
        L6f:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> Lc9
            if (r0 == 0) goto La0
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> Lc9
            com.facebook.aura.gateway.HatchFileOperations$LibraryEntry r0 = (com.facebook.aura.gateway.HatchFileOperations.LibraryEntry) r0     // Catch: java.lang.Throwable -> Lc9
            com.facebook.aura.library.repo.WorkspaceEntry r3 = com.facebook.aura.library.repo.SharedRecentAndMediaFeedKt.libraryEntryToWorkspaceEntry(r0)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r0 = r3.relativePath     // Catch: java.lang.Throwable -> Lc9
            boolean r0 = com.facebook.aura.library.repo.SharedRecentAndMediaFeedKt.shouldHidePath(r0)     // Catch: java.lang.Throwable -> Lc9
            if (r0 != 0) goto L6f
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.facebook.aura.library.repo.WorkspaceEntry> r1 = r11.mediaMap     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r0 = r3.relativePath     // Catch: java.lang.Throwable -> Lc9
            r1.put(r0, r3)     // Catch: java.lang.Throwable -> Lc9
            java.util.List<java.lang.String> r1 = r11.mediaOrder     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r0 = r3.relativePath     // Catch: java.lang.Throwable -> Lc9
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> Lc9
            if (r0 != 0) goto L6f
            java.util.List<java.lang.String> r1 = r11.mediaOrder     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r0 = r3.relativePath     // Catch: java.lang.Throwable -> Lc9
            r1.add(r0)     // Catch: java.lang.Throwable -> Lc9
            goto L6f
        La0:
            int r1 = r11.mediaServerOffset     // Catch: java.lang.Throwable -> Lc9
            java.util.List<com.facebook.aura.gateway.HatchFileOperations$LibraryEntry> r0 = r2.entries     // Catch: java.lang.Throwable -> Lc9
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lc9
            int r1 = r1 + r0
            r11.mediaServerOffset = r1     // Catch: java.lang.Throwable -> Lc9
            X.BLG<java.lang.Boolean> r1 = r11._mediaHasMore     // Catch: java.lang.Throwable -> Lc9
            boolean r0 = r2.hasMore     // Catch: java.lang.Throwable -> Lc9
            X.AnonymousClass004.A1D(r0, r1)     // Catch: java.lang.Throwable -> Lc9
            r11.commit()     // Catch: java.lang.Throwable -> Lc9
            goto Ld1
        Lb6:
            boolean r0 = r2 instanceof com.facebook.aura.gateway.HatchFileOperations.LibraryResult.Failed     // Catch: java.lang.Throwable -> Lc9
            if (r0 == 0) goto Lc4
            java.lang.String r1 = "SharedRecentAndMediaFeed"
            com.facebook.aura.gateway.HatchFileOperations$LibraryResult$Failed r2 = (com.facebook.aura.gateway.HatchFileOperations.LibraryResult.Failed) r2     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r0 = r2.message     // Catch: java.lang.Throwable -> Lc9
            X.C3cG.A1G(r3, r0, r1)     // Catch: java.lang.Throwable -> Lc9
            goto Ld1
        Lc4:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()     // Catch: java.lang.Throwable -> Lc9
            throw r0     // Catch: java.lang.Throwable -> Lc9
        Lc9:
            r2 = move-exception
            X.BLG<java.lang.Boolean> r1 = r11._isLoadingMoreMedia
            r0 = 0
            X.AnonymousClass004.A1D(r0, r1)
            throw r2
        Ld1:
            X.BLG<java.lang.Boolean> r1 = r11._isLoadingMoreMedia
            r0 = 0
            X.AnonymousClass004.A1D(r0, r1)
        Ld7:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.SharedRecentAndMediaFeed.loadMoreMedia(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadMoreRecents(X.HtJ<? super kotlin.Unit> r12) {
        /*
            r11 = this;
            java.lang.String r2 = "Failed to load more recents: "
            boolean r0 = r12 instanceof com.facebook.aura.library.repo.SharedRecentAndMediaFeed.C123101
            if (r0 == 0) goto L20
            r10 = r12
            com.facebook.aura.library.repo.SharedRecentAndMediaFeed$loadMoreRecents$1 r10 = (com.facebook.aura.library.repo.SharedRecentAndMediaFeed.C123101) r10
            int r3 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L20
            int r3 = r3 - r1
            r10.label = r3
        L14:
            java.lang.Object r3 = r10.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r10.label
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 != r1) goto L26
            goto L5e
        L20:
            com.facebook.aura.library.repo.SharedRecentAndMediaFeed$loadMoreRecents$1 r10 = new com.facebook.aura.library.repo.SharedRecentAndMediaFeed$loadMoreRecents$1
            r10.<init>(r12)
            goto L14
        L26:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2b:
            X.Hwg.A00(r3)
            X.BLG<java.lang.Boolean> r0 = r11._isLoadingMoreRecents
            boolean r0 = X.AnonymousClass003.A1Z(r0)
            if (r0 != 0) goto Lc6
            X.BLG<java.lang.Boolean> r0 = r11._recentsHasMore
            boolean r0 = X.AnonymousClass003.A1Z(r0)
            if (r0 == 0) goto Lc6
            X.BLG<java.lang.Boolean> r0 = r11._isLoadingMoreRecents
            X.AnonymousClass004.A1D(r1, r0)
            com.facebook.aura.gateway.HatchFileOperations r5 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r6 = "recents"
            X.CGz r7 = r11.userSession     // Catch: java.lang.Throwable -> Lb8
            r0 = 10
            java.lang.Integer r8 = X.C3cG.A0R(r0)     // Catch: java.lang.Throwable -> Lb8
            int r0 = r11.recentsServerOffset     // Catch: java.lang.Throwable -> Lb8
            java.lang.Integer r9 = X.C3cG.A0R(r0)     // Catch: java.lang.Throwable -> Lb8
            r10.label = r1     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r3 = r5.libraryFiles(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lb8
            if (r3 != r4) goto L61
            return r4
        L5e:
            X.Hwg.A00(r3)     // Catch: java.lang.Throwable -> Lb8
        L61:
            com.facebook.aura.gateway.HatchFileOperations$LibraryResult r3 = (com.facebook.aura.gateway.HatchFileOperations.LibraryResult) r3     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r3 instanceof com.facebook.aura.gateway.HatchFileOperations.LibraryResult.Success     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto La5
            com.facebook.aura.gateway.HatchFileOperations$LibraryResult$Success r3 = (com.facebook.aura.gateway.HatchFileOperations.LibraryResult.Success) r3     // Catch: java.lang.Throwable -> Lb8
            java.util.List<com.facebook.aura.gateway.HatchFileOperations$LibraryEntry> r0 = r3.entries     // Catch: java.lang.Throwable -> Lb8
            java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Throwable -> Lb8
        L6f:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> Lb8
            com.facebook.aura.gateway.HatchFileOperations$LibraryEntry r0 = (com.facebook.aura.gateway.HatchFileOperations.LibraryEntry) r0     // Catch: java.lang.Throwable -> Lb8
            com.facebook.aura.library.repo.WorkspaceEntry r2 = com.facebook.aura.library.repo.SharedRecentAndMediaFeedKt.libraryEntryToWorkspaceEntry(r0)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r0 = r2.relativePath     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = com.facebook.aura.library.repo.SharedRecentAndMediaFeedKt.shouldHidePath(r0)     // Catch: java.lang.Throwable -> Lb8
            if (r0 != 0) goto L6f
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.facebook.aura.library.repo.WorkspaceEntry> r1 = r11.recentsMap     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r0 = r2.relativePath     // Catch: java.lang.Throwable -> Lb8
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> Lb8
            goto L6f
        L8f:
            int r1 = r11.recentsServerOffset     // Catch: java.lang.Throwable -> Lb8
            java.util.List<com.facebook.aura.gateway.HatchFileOperations$LibraryEntry> r0 = r3.entries     // Catch: java.lang.Throwable -> Lb8
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lb8
            int r1 = r1 + r0
            r11.recentsServerOffset = r1     // Catch: java.lang.Throwable -> Lb8
            X.BLG<java.lang.Boolean> r1 = r11._recentsHasMore     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r3.hasMore     // Catch: java.lang.Throwable -> Lb8
            X.AnonymousClass004.A1D(r0, r1)     // Catch: java.lang.Throwable -> Lb8
            r11.commit()     // Catch: java.lang.Throwable -> Lb8
            goto Lc0
        La5:
            boolean r0 = r3 instanceof com.facebook.aura.gateway.HatchFileOperations.LibraryResult.Failed     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto Lb3
            java.lang.String r1 = "SharedRecentAndMediaFeed"
            com.facebook.aura.gateway.HatchFileOperations$LibraryResult$Failed r3 = (com.facebook.aura.gateway.HatchFileOperations.LibraryResult.Failed) r3     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r0 = r3.message     // Catch: java.lang.Throwable -> Lb8
            X.C3cG.A1G(r2, r0, r1)     // Catch: java.lang.Throwable -> Lb8
            goto Lc0
        Lb3:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()     // Catch: java.lang.Throwable -> Lb8
            throw r0     // Catch: java.lang.Throwable -> Lb8
        Lb8:
            r2 = move-exception
            X.BLG<java.lang.Boolean> r1 = r11._isLoadingMoreRecents
            r0 = 0
            X.AnonymousClass004.A1D(r0, r1)
            throw r2
        Lc0:
            X.BLG<java.lang.Boolean> r1 = r11._isLoadingMoreRecents
            r0 = 0
            X.AnonymousClass004.A1D(r0, r1)
        Lc6:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.SharedRecentAndMediaFeed.loadMoreRecents(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refresh(boolean r11, X.HtJ<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.SharedRecentAndMediaFeed.refresh(boolean, X.HtJ):java.lang.Object");
    }

    public final void start() {
        if (this.isSubscribed) {
            return;
        }
        this.isSubscribed = true;
        subscribeToFileEvents();
        AnonymousClass001.A1J(new C123121(null), this.scope);
    }

    /* loaded from: classes.dex */
    public final class Companion {
        public final SharedRecentAndMediaFeed getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (SharedRecentAndMediaFeed) abstractC3358CGz.A03(SharedRecentAndMediaFeed.class, new SharedRecentAndMediaFeed$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SharedRecentAndMediaFeed(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.scope = Hxb.A02(new C8eO(null));
        this.recentsMap = C60O.A1C();
        this.mediaMap = C60O.A1C();
        this.mediaOrder = C3cG.A0h();
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        C7384Etj.A0U(keySetViewNewKeySet);
        this.deletedArtifactPaths = keySetViewNewKeySet;
        AHI ahi = AHI.A01;
        C9286GCn c9286GCnA01 = HnJ.A01(ahi);
        this._recents = c9286GCnA01;
        this.recents = C3cG.A11(c9286GCnA01);
        C9286GCn c9286GCnA012 = HnJ.A01(ahi);
        this._media = c9286GCnA012;
        this.media = C3cG.A11(c9286GCnA012);
        C9286GCn c9286GCnA013 = HnJ.A01(ahi);
        this._artifacts = c9286GCnA013;
        this.artifacts = C3cG.A11(c9286GCnA013);
        C9286GCn c9286GCnA14 = C3cG.A14(LoadingState.INITIAL);
        this._loadingState = c9286GCnA14;
        this.loadingState = C3cG.A11(c9286GCnA14);
        Boolean boolA0h = AnonymousClass001.A0h();
        C9286GCn c9286GCnA142 = C3cG.A14(boolA0h);
        this._recentsHasMore = c9286GCnA142;
        this.recentsHasMoreFlow = C3cG.A11(c9286GCnA142);
        C9286GCn c9286GCnA143 = C3cG.A14(boolA0h);
        this._isLoadingMoreRecents = c9286GCnA143;
        this.isLoadingMoreRecents = C3cG.A11(c9286GCnA143);
        C9286GCn c9286GCnA144 = C3cG.A14(boolA0h);
        this._mediaHasMore = c9286GCnA144;
        this.mediaHasMoreFlow = C3cG.A11(c9286GCnA144);
        C9286GCn c9286GCnA145 = C3cG.A14(boolA0h);
        this._isLoadingMoreMedia = c9286GCnA145;
        this.isLoadingMoreMedia = C3cG.A11(c9286GCnA145);
    }

    private final void removePath(String str) {
        AHD<HatchFileOperations.LibraryEntry> value;
        ArrayList arrayListA0h;
        String strNormalizePath = SharedRecentAndMediaFeedKt.normalizePath(str);
        this.recentsMap.remove(strNormalizePath);
        this.mediaMap.remove(strNormalizePath);
        this.mediaOrder.remove(strNormalizePath);
        this.deletedArtifactPaths.add(strNormalizePath);
        BLG<AHD<HatchFileOperations.LibraryEntry>> blg = this._artifacts;
        do {
            value = blg.getValue();
            arrayListA0h = C3cG.A0h();
            for (Object obj : value) {
                AnonymousClass006.A1O(((HatchFileOperations.LibraryEntry) obj).getNormalizedPath(), strNormalizePath, obj, arrayListA0h);
            }
        } while (!blg.A6e(value, AGI.A07(arrayListA0h)));
        commit();
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        clearData();
    }

    public /* synthetic */ SharedRecentAndMediaFeed(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
