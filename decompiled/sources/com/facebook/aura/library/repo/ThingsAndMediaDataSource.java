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
import X.C10550Hrx;
import X.C1BN;
import X.C20Z;
import X.C27k;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C8eO;
import X.C9258GBl;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.Hxb;
import X.HzP;
import X.InterfaceC2261BLa;
import X.InterfaceC7549F2g;
import com.facebook.aura.browsertask.control.BrowserTaskStopKt;
import com.facebook.aura.dancingavatars.gating.MC;
import com.facebook.aura.gateway.FileUpdateEvent;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.library.repo.WorkspaceEntry;
import com.facebook.aura.perf.HatchNavTTRCCoordinator;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class ThingsAndMediaDataSource implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final BLG<AHD<WorkspaceEntry>> _artifacts;
    public final BLG<Boolean> _artifactsHasMore;
    public final BLG<Boolean> _isLoadingMoreArtifacts;
    public final BLG<Boolean> _isLoadingMoreMedia;
    public final BLG<LoadingState> _loadingState;
    public final BLG<AHD<WorkspaceEntry>> _media;
    public final BLG<Boolean> _mediaHasMore;
    public final BLG<Boolean> _mediaLoadFailed;
    public int artifactServerOffset;
    public final C1BN<AHD<WorkspaceEntry>> artifacts;
    public final C1BN<Boolean> artifactsHasMoreFlow;
    public final Set<String> deletedArtifactPaths;
    public final C1BN<Boolean> isLoadingMoreArtifacts;
    public final C1BN<Boolean> isLoadingMoreMedia;
    public boolean isSubscribed;
    public final C1BN<LoadingState> loadingState;
    public final C1BN<AHD<WorkspaceEntry>> media;
    public final C1BN<Boolean> mediaHasMoreFlow;
    public final C1BN<Boolean> mediaLoadFailed;
    public final ConcurrentHashMap<String, WorkspaceEntry> mediaMap;
    public final CopyOnWriteArrayList<String> mediaOrder;
    public int mediaServerOffset;
    public final HatchNavTTRCCoordinator navTtrcCoordinator;
    public final InterfaceC2261BLa pagingMutex;
    public final C3UX scope;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.library.repo.ThingsAndMediaDataSource", f = "ThingsAndMediaDataSource.kt", l = {BrowserTaskStopKt.HTTP_SERVICE_UNAVAILABLE}, m = "loadMoreArtifacts", v = 2)
    /* renamed from: com.facebook.aura.library.repo.ThingsAndMediaDataSource$loadMoreArtifacts$1, reason: invalid class name */
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
            return ThingsAndMediaDataSource.this.loadMoreArtifacts(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.ThingsAndMediaDataSource", f = "ThingsAndMediaDataSource.kt", l = {MC.hatch_android_dancing_avatars.__CONFIG__, 465}, m = "loadMoreMedia", v = 2)
    /* renamed from: com.facebook.aura.library.repo.ThingsAndMediaDataSource$loadMoreMedia$1, reason: invalid class name and case insensitive filesystem */
    public final class C123151 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C123151(HtJ<? super C123151> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ThingsAndMediaDataSource.this.loadMoreMedia(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.ThingsAndMediaDataSource", f = "ThingsAndMediaDataSource.kt", l = {MC.hatch_android_dancing_avatars.__CONFIG__, 119}, m = "refresh", v = 2)
    /* renamed from: com.facebook.aura.library.repo.ThingsAndMediaDataSource$refresh$1, reason: invalid class name and case insensitive filesystem */
    public final class C123161 extends HzP {
        public Object L$0;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C123161(HtJ<? super C123161> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ThingsAndMediaDataSource.this.refresh(false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.ThingsAndMediaDataSource", f = "ThingsAndMediaDataSource.kt", l = {172}, m = "refresh", v = 2)
    /* renamed from: com.facebook.aura.library.repo.ThingsAndMediaDataSource$refresh$3, reason: invalid class name */
    public final class AnonymousClass3 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public boolean Z$0;
        public boolean Z$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ThingsAndMediaDataSource.this.refresh(false, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.ThingsAndMediaDataSource$refresh$4", f = "ThingsAndMediaDataSource.kt", l = {187, 187}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.ThingsAndMediaDataSource$refresh$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HxE<? extends HatchFileOperations.LibraryResult, ? extends HatchFileOperations.LibraryResult>>, Object> {
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        public AnonymousClass4(HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass4 anonymousClass4 = ThingsAndMediaDataSource.this.new AnonymousClass4(htJ);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objA01;
            Object obj2;
            C3UX c3ux = (C3UX) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ThingsAndMediaDataSource$refresh$4$mediaDeferred$1 thingsAndMediaDataSource$refresh$4$mediaDeferred$1 = new ThingsAndMediaDataSource$refresh$4$mediaDeferred$1(ThingsAndMediaDataSource.this, null);
                C6ys c6ys = C6ys.A00;
                Integer num = C79.A00;
                C10550Hrx c10550HrxA01 = GAo.A01(num, c6ys, thingsAndMediaDataSource$refresh$4$mediaDeferred$1, c3ux);
                objA01 = GAo.A01(num, c6ys, new ThingsAndMediaDataSource$refresh$4$artifactsDeferred$1(ThingsAndMediaDataSource.this, null), c3ux);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = objA01;
                this.label = 1;
                obj = c10550HrxA01.A0E(this);
                if (obj != enumC10460Hji) {
                }
                return enumC10460Hji;
            }
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0n();
                }
                obj2 = this.L$3;
                Hwg.A00(obj);
                return C3cG.A0r(obj2, obj);
            }
            objA01 = (C27k) this.L$2;
            Hwg.A00(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = obj;
            this.label = 2;
            Object objA0W = C3cG.A0W(objA01, this);
            if (objA0W != enumC10460Hji) {
                obj2 = obj;
                obj = objA0W;
                return C3cG.A0r(obj2, obj);
            }
            return enumC10460Hji;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super HxE<? extends HatchFileOperations.LibraryResult, ? extends HatchFileOperations.LibraryResult>> htJ) {
            return ((AnonymousClass4) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.ThingsAndMediaDataSource", f = "ThingsAndMediaDataSource.kt", l = {MC.hatch_android_dancing_avatars.__CONFIG__, 388}, m = "reloadLoadedMedia", v = 2)
    /* renamed from: com.facebook.aura.library.repo.ThingsAndMediaDataSource$reloadLoadedMedia$1, reason: invalid class name and case insensitive filesystem */
    public final class C123171 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C123171(HtJ<? super C123171> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ThingsAndMediaDataSource.this.reloadLoadedMedia(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.ThingsAndMediaDataSource$start$1", f = "ThingsAndMediaDataSource.kt", l = {MC.hatch_android_dancing_avatars.__CONFIG__, 113}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.ThingsAndMediaDataSource$start$1, reason: invalid class name and case insensitive filesystem */
    public final class C123181 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        public C123181(HtJ<? super C123181> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ThingsAndMediaDataSource.this.new C123181(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ThingsAndMediaDataSource.this.new C123181(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Throwable {
            ThingsAndMediaDataSource thingsAndMediaDataSource;
            InterfaceC2261BLa interfaceC2261BLa;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    thingsAndMediaDataSource = ThingsAndMediaDataSource.this;
                    interfaceC2261BLa = thingsAndMediaDataSource.pagingMutex;
                    this.L$0 = interfaceC2261BLa;
                    this.L$1 = thingsAndMediaDataSource;
                    this.label = 1;
                    if (interfaceC2261BLa.APs(null, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw AnonymousClass001.A0n();
                        }
                        interfaceC2261BLa = (InterfaceC2261BLa) this.L$0;
                        try {
                            Hwg.A00(obj);
                            Unit unit = Unit.INSTANCE;
                            interfaceC2261BLa.Ahe(null);
                            return unit;
                        } catch (Throwable th) {
                            th = th;
                            interfaceC2261BLa.Ahe(null);
                            throw th;
                        }
                    }
                    thingsAndMediaDataSource = (ThingsAndMediaDataSource) this.L$1;
                    interfaceC2261BLa = (InterfaceC2261BLa) this.L$0;
                    Hwg.A00(obj);
                }
                this.L$0 = interfaceC2261BLa;
                this.L$1 = null;
                this.label = 2;
                if (thingsAndMediaDataSource.refresh(false, true, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
                Unit unit2 = Unit.INSTANCE;
                interfaceC2261BLa.Ahe(null);
                return unit2;
            } catch (Throwable th2) {
                th = th2;
                interfaceC2261BLa.Ahe(null);
                throw th;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.ThingsAndMediaDataSource$subscribeToFileEvents$1", f = "ThingsAndMediaDataSource.kt", l = {304}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.ThingsAndMediaDataSource$subscribeToFileEvents$1, reason: invalid class name and case insensitive filesystem */
    public final class C123191 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public C123191(HtJ<? super C123191> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ThingsAndMediaDataSource.this.new C123191(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ThingsAndMediaDataSource.this.new C123191(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    C1BN<FileUpdateEvent> c1bn = HatchGatewayServiceManager.INSTANCE.getGateway(ThingsAndMediaDataSource.this.userSession).getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().fileUpdateEvents;
                    final ThingsAndMediaDataSource thingsAndMediaDataSource = ThingsAndMediaDataSource.this;
                    C20Z<? super FileUpdateEvent> c20z = new C20Z() { // from class: com.facebook.aura.library.repo.ThingsAndMediaDataSource.subscribeToFileEvents.1.1
                        public final Object emit(FileUpdateEvent fileUpdateEvent, HtJ<? super Unit> htJ) {
                            Object objOnFileEvent;
                            return (fileUpdateEvent == null || (objOnFileEvent = thingsAndMediaDataSource.onFileEvent(fileUpdateEvent, htJ)) != EnumC10460Hji.A02) ? Unit.INSTANCE : objOnFileEvent;
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
                CFK.A08(ThingsAndMediaDataSourceKt.TAG, "Failed to subscribe to file events", e);
                return Unit.INSTANCE;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.ThingsAndMediaDataSource", f = "ThingsAndMediaDataSource.kt", l = {348, 351}, m = "upsertPath", v = 2)
    /* renamed from: com.facebook.aura.library.repo.ThingsAndMediaDataSource$upsertPath$1, reason: invalid class name and case insensitive filesystem */
    public final class C123201 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C123201(HtJ<? super C123201> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ThingsAndMediaDataSource.this.upsertPath(null, this);
        }
    }

    private final boolean isMediaPath(String str) {
        return ThingsAndMediaDataSourceKt.isMediaEntry(new WorkspaceEntry(C7BY.A0M(str), WorkspaceEntry.EntryType.FILE, str, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1 A[Catch: Exception -> 0x0236, CancellationException -> 0x026e, all -> 0x0270, TRY_ENTER, TryCatch #1 {CancellationException -> 0x026e, blocks: (B:27:0x009c, B:28:0x009f, B:31:0x00b1, B:33:0x00c1, B:34:0x00cb, B:35:0x00d1, B:37:0x00d7, B:39:0x00e9, B:41:0x00ef, B:44:0x00fa, B:45:0x0100, B:47:0x0108, B:53:0x0125, B:54:0x0134, B:57:0x013a, B:58:0x0150, B:60:0x0156, B:61:0x0167, B:62:0x016f, B:64:0x0175, B:65:0x0183, B:71:0x0198, B:72:0x01a7, B:74:0x01ae, B:76:0x01b2, B:77:0x01b4, B:79:0x01b8, B:81:0x01bc, B:85:0x01c4, B:87:0x01cf, B:90:0x01dc, B:91:0x020c, B:68:0x018b, B:70:0x018f, B:93:0x0231, B:94:0x0235, B:50:0x0113, B:52:0x0117, B:92:0x022c, B:24:0x0084), top: B:108:0x0020, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0113 A[Catch: Exception -> 0x0236, CancellationException -> 0x026e, all -> 0x0270, TryCatch #1 {CancellationException -> 0x026e, blocks: (B:27:0x009c, B:28:0x009f, B:31:0x00b1, B:33:0x00c1, B:34:0x00cb, B:35:0x00d1, B:37:0x00d7, B:39:0x00e9, B:41:0x00ef, B:44:0x00fa, B:45:0x0100, B:47:0x0108, B:53:0x0125, B:54:0x0134, B:57:0x013a, B:58:0x0150, B:60:0x0156, B:61:0x0167, B:62:0x016f, B:64:0x0175, B:65:0x0183, B:71:0x0198, B:72:0x01a7, B:74:0x01ae, B:76:0x01b2, B:77:0x01b4, B:79:0x01b8, B:81:0x01bc, B:85:0x01c4, B:87:0x01cf, B:90:0x01dc, B:91:0x020c, B:68:0x018b, B:70:0x018f, B:93:0x0231, B:94:0x0235, B:50:0x0113, B:52:0x0117, B:92:0x022c, B:24:0x0084), top: B:108:0x0020, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013a A[Catch: Exception -> 0x0236, CancellationException -> 0x026e, all -> 0x0270, TRY_ENTER, TryCatch #1 {CancellationException -> 0x026e, blocks: (B:27:0x009c, B:28:0x009f, B:31:0x00b1, B:33:0x00c1, B:34:0x00cb, B:35:0x00d1, B:37:0x00d7, B:39:0x00e9, B:41:0x00ef, B:44:0x00fa, B:45:0x0100, B:47:0x0108, B:53:0x0125, B:54:0x0134, B:57:0x013a, B:58:0x0150, B:60:0x0156, B:61:0x0167, B:62:0x016f, B:64:0x0175, B:65:0x0183, B:71:0x0198, B:72:0x01a7, B:74:0x01ae, B:76:0x01b2, B:77:0x01b4, B:79:0x01b8, B:81:0x01bc, B:85:0x01c4, B:87:0x01cf, B:90:0x01dc, B:91:0x020c, B:68:0x018b, B:70:0x018f, B:93:0x0231, B:94:0x0235, B:50:0x0113, B:52:0x0117, B:92:0x022c, B:24:0x0084), top: B:108:0x0020, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018b A[Catch: Exception -> 0x0236, CancellationException -> 0x026e, all -> 0x0270, TryCatch #1 {CancellationException -> 0x026e, blocks: (B:27:0x009c, B:28:0x009f, B:31:0x00b1, B:33:0x00c1, B:34:0x00cb, B:35:0x00d1, B:37:0x00d7, B:39:0x00e9, B:41:0x00ef, B:44:0x00fa, B:45:0x0100, B:47:0x0108, B:53:0x0125, B:54:0x0134, B:57:0x013a, B:58:0x0150, B:60:0x0156, B:61:0x0167, B:62:0x016f, B:64:0x0175, B:65:0x0183, B:71:0x0198, B:72:0x01a7, B:74:0x01ae, B:76:0x01b2, B:77:0x01b4, B:79:0x01b8, B:81:0x01bc, B:85:0x01c4, B:87:0x01cf, B:90:0x01dc, B:91:0x020c, B:68:0x018b, B:70:0x018f, B:93:0x0231, B:94:0x0235, B:50:0x0113, B:52:0x0117, B:92:0x022c, B:24:0x0084), top: B:108:0x0020, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c4 A[Catch: Exception -> 0x0236, CancellationException -> 0x026e, all -> 0x0270, TryCatch #1 {CancellationException -> 0x026e, blocks: (B:27:0x009c, B:28:0x009f, B:31:0x00b1, B:33:0x00c1, B:34:0x00cb, B:35:0x00d1, B:37:0x00d7, B:39:0x00e9, B:41:0x00ef, B:44:0x00fa, B:45:0x0100, B:47:0x0108, B:53:0x0125, B:54:0x0134, B:57:0x013a, B:58:0x0150, B:60:0x0156, B:61:0x0167, B:62:0x016f, B:64:0x0175, B:65:0x0183, B:71:0x0198, B:72:0x01a7, B:74:0x01ae, B:76:0x01b2, B:77:0x01b4, B:79:0x01b8, B:81:0x01bc, B:85:0x01c4, B:87:0x01cf, B:90:0x01dc, B:91:0x020c, B:68:0x018b, B:70:0x018f, B:93:0x0231, B:94:0x0235, B:50:0x0113, B:52:0x0117, B:92:0x022c, B:24:0x0084), top: B:108:0x0020, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cf A[Catch: Exception -> 0x0236, CancellationException -> 0x026e, all -> 0x0270, TryCatch #1 {CancellationException -> 0x026e, blocks: (B:27:0x009c, B:28:0x009f, B:31:0x00b1, B:33:0x00c1, B:34:0x00cb, B:35:0x00d1, B:37:0x00d7, B:39:0x00e9, B:41:0x00ef, B:44:0x00fa, B:45:0x0100, B:47:0x0108, B:53:0x0125, B:54:0x0134, B:57:0x013a, B:58:0x0150, B:60:0x0156, B:61:0x0167, B:62:0x016f, B:64:0x0175, B:65:0x0183, B:71:0x0198, B:72:0x01a7, B:74:0x01ae, B:76:0x01b2, B:77:0x01b4, B:79:0x01b8, B:81:0x01bc, B:85:0x01c4, B:87:0x01cf, B:90:0x01dc, B:91:0x020c, B:68:0x018b, B:70:0x018f, B:93:0x0231, B:94:0x0235, B:50:0x0113, B:52:0x0117, B:92:0x022c, B:24:0x0084), top: B:108:0x0020, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refresh(boolean r15, boolean r16, X.HtJ<? super kotlin.Unit> r17) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.ThingsAndMediaDataSource.refresh(boolean, boolean, X.HtJ):java.lang.Object");
    }

    public final void removeByPath(String str) {
        C7384Etj.A0Y(str, 0);
        removePath(str);
    }

    private final void commit() {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = this.mediaOrder;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<String> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WorkspaceEntry workspaceEntry = this.mediaMap.get(it.next());
            if (workspaceEntry != null) {
                arrayListA0h.add(workspaceEntry);
            }
        }
        Set setA0g = AbstractC0878AGe.A0g(this.mediaOrder);
        Collection<WorkspaceEntry> collectionValues = this.mediaMap.values();
        ArrayList arrayListA0s = C60Q.A0s(collectionValues);
        for (WorkspaceEntry workspaceEntry2 : collectionValues) {
            C60Q.A1H(workspaceEntry2.relativePath, workspaceEntry2, arrayListA0s, setA0g);
        }
        C60O.A1L(AbstractC0878AGe.A0P(arrayListA0h, arrayListA0s), this._media);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onFileEvent(com.facebook.aura.gateway.FileUpdateEvent r4, X.HtJ<? super kotlin.Unit> r5) {
        /*
            r3 = this;
            java.lang.String r2 = r4.path
            boolean r0 = X.C7BY.A0j(r2)
            if (r0 != 0) goto L11
            java.lang.String r1 = r4.op
            int r0 = r1.hashCode()
            switch(r0) {
                case -1352294148: goto L14;
                case -1335458389: goto L17;
                case -1068795718: goto L2c;
                case -934610812: goto L20;
                case -934594754: goto L2f;
                case 3108362: goto L32;
                case 113399775: goto L35;
                default: goto L11;
            }
        L11:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L14:
            java.lang.String r0 = "create"
            goto L37
        L17:
            java.lang.String r0 = "delete"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L28
            goto L11
        L20:
            java.lang.String r0 = "remove"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L11
        L28:
            r3.removePath(r2)
            goto L11
        L2c:
            java.lang.String r0 = "modify"
            goto L37
        L2f:
            java.lang.String r0 = "rename"
            goto L37
        L32:
            java.lang.String r0 = "edit"
            goto L37
        L35:
            java.lang.String r0 = "write"
        L37:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L11
            java.lang.Object r1 = r3.upsertPath(r2, r5)
            X.Hji r0 = X.EnumC10460Hji.A02
            if (r1 != r0) goto L11
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.ThingsAndMediaDataSource.onFileEvent(com.facebook.aura.gateway.FileUpdateEvent, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f A[Catch: all -> 0x0113, TryCatch #0 {all -> 0x0113, blocks: (B:22:0x0066, B:23:0x0069, B:25:0x006f, B:26:0x007b, B:28:0x0081, B:29:0x008f, B:30:0x0097, B:32:0x009d, B:34:0x00ac, B:36:0x00b2, B:37:0x00ba, B:38:0x00c8, B:40:0x00ce, B:41:0x00dc, B:42:0x00e6, B:44:0x00ec, B:45:0x00f8, B:46:0x010d), top: B:54:0x0066 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reloadLoadedMedia(X.HtJ<? super kotlin.Unit> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.ThingsAndMediaDataSource.reloadLoadedMedia(X.HtJ):java.lang.Object");
    }

    private final void removeArtifactByPath(String str) {
        AHD<WorkspaceEntry> value;
        ArrayList arrayListA0h;
        BLG<AHD<WorkspaceEntry>> blg = this._artifacts;
        do {
            value = blg.getValue();
            arrayListA0h = C3cG.A0h();
            for (Object obj : value) {
                AnonymousClass006.A1O(((WorkspaceEntry) obj).relativePath, str, obj, arrayListA0h);
            }
        } while (!blg.A6e(value, AGI.A07(arrayListA0h)));
    }

    private final void subscribeToFileEvents() {
        AnonymousClass001.A1J(new C123191(null), this.scope);
    }

    private final void upsertArtifact(WorkspaceEntry workspaceEntry) {
        AHD<WorkspaceEntry> value;
        ArrayList arrayListA0h;
        BLG<AHD<WorkspaceEntry>> blg = this._artifacts;
        do {
            value = blg.getValue();
            arrayListA0h = C3cG.A0h();
            for (Object obj : value) {
                AnonymousClass006.A1O(((WorkspaceEntry) obj).relativePath, workspaceEntry.relativePath, obj, arrayListA0h);
            }
        } while (!blg.A6e(value, AGI.A07(AbstractC0878AGe.A0P(arrayListA0h, Collections.singletonList(workspaceEntry)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00db: INVOKE (r0v2 ?? I:java.util.AbstractMap), (r6 I:java.lang.Object) VIRTUAL call: java.util.AbstractMap.remove(java.lang.Object):java.lang.Object A[MD:(java.lang.Object):V (c)] (LINE:219), block:B:42:0x00d9 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d A[Catch: Exception -> 0x00d9, TryCatch #0 {Exception -> 0x00d9, blocks: (B:32:0x0084, B:33:0x0087, B:35:0x008d, B:37:0x009b, B:39:0x00aa, B:41:0x00b8, B:26:0x006c, B:27:0x006f, B:21:0x0055, B:23:0x005b, B:29:0x0072), top: B:45:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b A[Catch: Exception -> 0x00d9, TryCatch #0 {Exception -> 0x00d9, blocks: (B:32:0x0084, B:33:0x0087, B:35:0x008d, B:37:0x009b, B:39:0x00aa, B:41:0x00b8, B:26:0x006c, B:27:0x006f, B:21:0x0055, B:23:0x005b, B:29:0x0072), top: B:45:0x001a }] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object upsertPath(java.lang.String r10, X.HtJ<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.ThingsAndMediaDataSource.upsertPath(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final void clearData() {
        this.mediaMap.clear();
        this.mediaOrder.clear();
        this.deletedArtifactPaths.clear();
        this.navTtrcCoordinator.clearObservedQuery(HatchNavTTRCSpec.Surface.LIBRARY, HatchNavTTRCSpec.Queries.LIBRARY_DATA);
        this.mediaServerOffset = 0;
        this.artifactServerOffset = 0;
        BLG<AHD<WorkspaceEntry>> blg = this._media;
        AHI ahi = AHI.A01;
        blg.Af8(ahi);
        this._artifacts.Af8(ahi);
        C9286GCn.A00(null, LoadingState.INITIAL, (C9286GCn) this._loadingState);
        AnonymousClass001.A1E(this._mediaLoadFailed, null, false);
        AnonymousClass001.A1E(this._mediaHasMore, null, false);
        AnonymousClass001.A1E(this._isLoadingMoreMedia, null, false);
        AnonymousClass001.A1E(this._artifactsHasMore, null, false);
        AnonymousClass001.A1E(this._isLoadingMoreArtifacts, null, false);
        this.isSubscribed = false;
    }

    public final C1BN<AHD<WorkspaceEntry>> getArtifacts() {
        return this.artifacts;
    }

    public final C1BN<Boolean> getArtifactsHasMoreFlow() {
        return this.artifactsHasMoreFlow;
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

    public final C1BN<Boolean> getMediaLoadFailed() {
        return this.mediaLoadFailed;
    }

    public final C1BN<Boolean> isLoadingMoreArtifacts() {
        return this.isLoadingMoreArtifacts;
    }

    public final C1BN<Boolean> isLoadingMoreMedia() {
        return this.isLoadingMoreMedia;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadMoreArtifacts(X.HtJ<? super kotlin.Unit> r13) {
        /*
            r12 = this;
            java.lang.String r3 = "Failed to load more artifacts: "
            boolean r0 = r13 instanceof com.facebook.aura.library.repo.ThingsAndMediaDataSource.AnonymousClass1
            if (r0 == 0) goto L22
            r11 = r13
            com.facebook.aura.library.repo.ThingsAndMediaDataSource$loadMoreArtifacts$1 r11 = (com.facebook.aura.library.repo.ThingsAndMediaDataSource.AnonymousClass1) r11
            int r2 = r11.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r11.label = r2
        L14:
            java.lang.Object r2 = r11.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r11.label
            r5 = 10
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L28
            goto L5e
        L22:
            com.facebook.aura.library.repo.ThingsAndMediaDataSource$loadMoreArtifacts$1 r11 = new com.facebook.aura.library.repo.ThingsAndMediaDataSource$loadMoreArtifacts$1
            r11.<init>(r13)
            goto L14
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r2)
            X.BLG<java.lang.Boolean> r0 = r12._isLoadingMoreArtifacts
            boolean r0 = X.AnonymousClass003.A1Z(r0)
            if (r0 != 0) goto Lca
            X.BLG<java.lang.Boolean> r0 = r12._artifactsHasMore
            boolean r0 = X.AnonymousClass003.A1Z(r0)
            if (r0 == 0) goto Lca
            X.BLG<java.lang.Boolean> r0 = r12._isLoadingMoreArtifacts
            X.AnonymousClass004.A1D(r1, r0)
            com.facebook.aura.gateway.HatchFileOperations r6 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r7 = "artifacts"
            X.CGz r8 = r12.userSession     // Catch: java.lang.Throwable -> Lbc
            java.lang.Integer r9 = X.C3cG.A0R(r5)     // Catch: java.lang.Throwable -> Lbc
            int r0 = r12.artifactServerOffset     // Catch: java.lang.Throwable -> Lbc
            java.lang.Integer r10 = X.C3cG.A0R(r0)     // Catch: java.lang.Throwable -> Lbc
            r11.label = r1     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r2 = r6.libraryFiles(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lbc
            if (r2 != r4) goto L61
            return r4
        L5e:
            X.Hwg.A00(r2)     // Catch: java.lang.Throwable -> Lbc
        L61:
            com.facebook.aura.gateway.HatchFileOperations$LibraryResult r2 = (com.facebook.aura.gateway.HatchFileOperations.LibraryResult) r2     // Catch: java.lang.Throwable -> Lbc
            boolean r0 = r2 instanceof com.facebook.aura.gateway.HatchFileOperations.LibraryResult.Success     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto La9
            com.facebook.aura.gateway.HatchFileOperations$LibraryResult$Success r2 = (com.facebook.aura.gateway.HatchFileOperations.LibraryResult.Success) r2     // Catch: java.lang.Throwable -> Lbc
            java.util.List<com.facebook.aura.gateway.HatchFileOperations$LibraryEntry> r0 = r2.entries     // Catch: java.lang.Throwable -> Lbc
            java.util.ArrayList r3 = X.AnonymousClass002.A0m(r0)     // Catch: java.lang.Throwable -> Lbc
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> Lbc
        L73:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto L87
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> Lbc
            com.facebook.aura.gateway.HatchFileOperations$LibraryEntry r0 = (com.facebook.aura.gateway.HatchFileOperations.LibraryEntry) r0     // Catch: java.lang.Throwable -> Lbc
            com.facebook.aura.library.repo.WorkspaceEntry r0 = com.facebook.aura.library.repo.ThingsAndMediaDataSourceKt.libraryEntryToWorkspaceEntry(r0)     // Catch: java.lang.Throwable -> Lbc
            r3.add(r0)     // Catch: java.lang.Throwable -> Lbc
            goto L73
        L87:
            X.BLG<X.AHD<com.facebook.aura.library.repo.WorkspaceEntry>> r1 = r12._artifacts     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r0 = r1.getValue()     // Catch: java.lang.Throwable -> Lbc
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> Lbc
            java.util.ArrayList r0 = X.AbstractC0878AGe.A0P(r3, r0)     // Catch: java.lang.Throwable -> Lbc
            X.C60O.A1L(r0, r1)     // Catch: java.lang.Throwable -> Lbc
            int r1 = r12.artifactServerOffset     // Catch: java.lang.Throwable -> Lbc
            java.util.List<com.facebook.aura.gateway.HatchFileOperations$LibraryEntry> r0 = r2.entries     // Catch: java.lang.Throwable -> Lbc
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lbc
            int r1 = r1 + r0
            r12.artifactServerOffset = r1     // Catch: java.lang.Throwable -> Lbc
            X.BLG<java.lang.Boolean> r1 = r12._artifactsHasMore     // Catch: java.lang.Throwable -> Lbc
            boolean r0 = r2.hasMore     // Catch: java.lang.Throwable -> Lbc
            X.AnonymousClass004.A1D(r0, r1)     // Catch: java.lang.Throwable -> Lbc
            goto Lc4
        La9:
            boolean r0 = r2 instanceof com.facebook.aura.gateway.HatchFileOperations.LibraryResult.Failed     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto Lb7
            java.lang.String r1 = "ThingsAndMediaDataSource"
            com.facebook.aura.gateway.HatchFileOperations$LibraryResult$Failed r2 = (com.facebook.aura.gateway.HatchFileOperations.LibraryResult.Failed) r2     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r0 = r2.message     // Catch: java.lang.Throwable -> Lbc
            X.C3cG.A1G(r3, r0, r1)     // Catch: java.lang.Throwable -> Lbc
            goto Lc4
        Lb7:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()     // Catch: java.lang.Throwable -> Lbc
            throw r0     // Catch: java.lang.Throwable -> Lbc
        Lbc:
            r2 = move-exception
            X.BLG<java.lang.Boolean> r1 = r12._isLoadingMoreArtifacts
            r0 = 0
            X.AnonymousClass004.A1D(r0, r1)
            throw r2
        Lc4:
            X.BLG<java.lang.Boolean> r1 = r12._isLoadingMoreArtifacts
            r0 = 0
            X.AnonymousClass004.A1D(r0, r1)
        Lca:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.ThingsAndMediaDataSource.loadMoreArtifacts(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086 A[Catch: all -> 0x00f1, TryCatch #0 {all -> 0x00f1, blocks: (B:28:0x007d, B:29:0x0080, B:31:0x0086, B:32:0x008e, B:34:0x0094, B:36:0x00a6, B:38:0x00ac, B:40:0x00bd, B:41:0x00c5, B:42:0x00db, B:44:0x00df, B:46:0x00ec, B:47:0x00f0), top: B:59:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db A[Catch: all -> 0x00f1, TryCatch #0 {all -> 0x00f1, blocks: (B:28:0x007d, B:29:0x0080, B:31:0x0086, B:32:0x008e, B:34:0x0094, B:36:0x00a6, B:38:0x00ac, B:40:0x00bd, B:41:0x00c5, B:42:0x00db, B:44:0x00df, B:46:0x00ec, B:47:0x00f0), top: B:59:0x007d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadMoreMedia(X.HtJ<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.ThingsAndMediaDataSource.loadMoreMedia(X.HtJ):java.lang.Object");
    }

    public final void start() {
        if (this.isSubscribed) {
            return;
        }
        this.isSubscribed = true;
        subscribeToFileEvents();
        AnonymousClass001.A1J(new C123181(null), this.scope);
    }

    /* loaded from: classes.dex */
    public final class Companion {
        public final ThingsAndMediaDataSource getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (ThingsAndMediaDataSource) abstractC3358CGz.A03(ThingsAndMediaDataSource.class, new ThingsAndMediaDataSource$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ThingsAndMediaDataSource(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.scope = Hxb.A02(new C8eO(null));
        this.navTtrcCoordinator = HatchNavTTRCCoordinator.Companion.getInstance(abstractC3358CGz);
        this.mediaMap = C60O.A1C();
        this.mediaOrder = new CopyOnWriteArrayList<>();
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        C7384Etj.A0U(keySetViewNewKeySet);
        this.deletedArtifactPaths = keySetViewNewKeySet;
        Boolean boolA0h = AnonymousClass001.A0h();
        this.pagingMutex = new C9258GBl();
        AHI ahi = AHI.A01;
        C9286GCn c9286GCnA01 = HnJ.A01(ahi);
        this._media = c9286GCnA01;
        this.media = C3cG.A11(c9286GCnA01);
        C9286GCn c9286GCnA012 = HnJ.A01(ahi);
        this._artifacts = c9286GCnA012;
        this.artifacts = C3cG.A11(c9286GCnA012);
        C9286GCn c9286GCnA14 = C3cG.A14(LoadingState.INITIAL);
        this._loadingState = c9286GCnA14;
        this.loadingState = C3cG.A11(c9286GCnA14);
        C9286GCn c9286GCnA142 = C3cG.A14(boolA0h);
        this._mediaLoadFailed = c9286GCnA142;
        this.mediaLoadFailed = C3cG.A11(c9286GCnA142);
        C9286GCn c9286GCnA143 = C3cG.A14(boolA0h);
        this._mediaHasMore = c9286GCnA143;
        this.mediaHasMoreFlow = C3cG.A11(c9286GCnA143);
        C9286GCn c9286GCnA144 = C3cG.A14(boolA0h);
        this._isLoadingMoreMedia = c9286GCnA144;
        this.isLoadingMoreMedia = C3cG.A11(c9286GCnA144);
        C9286GCn c9286GCnA145 = C3cG.A14(boolA0h);
        this._artifactsHasMore = c9286GCnA145;
        this.artifactsHasMoreFlow = C3cG.A11(c9286GCnA145);
        C9286GCn c9286GCnA146 = C3cG.A14(boolA0h);
        this._isLoadingMoreArtifacts = c9286GCnA146;
        this.isLoadingMoreArtifacts = C3cG.A11(c9286GCnA146);
    }

    private final void removePath(String str) {
        String strNormalizePath = ThingsAndMediaDataSourceKt.normalizePath(str);
        this.mediaMap.remove(strNormalizePath);
        this.mediaOrder.remove(strNormalizePath);
        this.deletedArtifactPaths.add(strNormalizePath);
        removeArtifactByPath(strNormalizePath);
        commit();
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        clearData();
    }

    public /* synthetic */ ThingsAndMediaDataSource(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refresh(boolean r9, X.HtJ<? super kotlin.Unit> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.library.repo.ThingsAndMediaDataSource.C123161
            if (r0 == 0) goto L26
            r7 = r10
            com.facebook.aura.library.repo.ThingsAndMediaDataSource$refresh$1 r7 = (com.facebook.aura.library.repo.ThingsAndMediaDataSource.C123161) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r6 = r7.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r4 = 2
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L3b
            if (r0 == r3) goto L31
            if (r0 != r4) goto L2c
            java.lang.Object r1 = r7.L$0
            X.BLa r1 = (X.InterfaceC2261BLa) r1
            goto L68
        L26:
            com.facebook.aura.library.repo.ThingsAndMediaDataSource$refresh$1 r7 = new com.facebook.aura.library.repo.ThingsAndMediaDataSource$refresh$1
            r7.<init>(r10)
            goto L12
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            boolean r9 = r7.Z$0
            java.lang.Object r1 = r7.L$0
            X.BLa r1 = (X.InterfaceC2261BLa) r1
            X.Hwg.A00(r6)
            goto L5a
        L3b:
            X.Hwg.A00(r6)
            X.BLG<com.facebook.aura.library.repo.LoadingState> r0 = r8._loadingState
            java.lang.Object r1 = r0.getValue()
            com.facebook.aura.library.repo.LoadingState r0 = com.facebook.aura.library.repo.LoadingState.REFRESH_LOADING
            if (r1 != r0) goto L4b
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L4b:
            X.BLa r1 = r8.pagingMutex
            r7.L$0 = r1
            r7.Z$0 = r9
            r7.label = r3
            java.lang.Object r0 = r1.APs(r2, r7)
            if (r0 != r5) goto L5a
            return r5
        L5a:
            r7.L$0 = r1     // Catch: java.lang.Throwable -> L71
            r7.Z$0 = r9     // Catch: java.lang.Throwable -> L71
            r7.label = r4     // Catch: java.lang.Throwable -> L71
            r0 = 0
            java.lang.Object r0 = r8.refresh(r9, r0, r7)     // Catch: java.lang.Throwable -> L71
            if (r0 != r5) goto L6b
            return r5
        L68:
            X.Hwg.A00(r6)     // Catch: java.lang.Throwable -> L73
        L6b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L73
            r1.Ahe(r2)
            return r0
        L71:
            r0 = move-exception
            goto L74
        L73:
            r0 = move-exception
        L74:
            r1.Ahe(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.ThingsAndMediaDataSource.refresh(boolean, X.HtJ):java.lang.Object");
    }
}
