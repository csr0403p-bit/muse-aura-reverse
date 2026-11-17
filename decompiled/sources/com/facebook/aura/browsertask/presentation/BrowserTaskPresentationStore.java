package com.facebook.aura.browsertask.presentation;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass441;
import X.B1T;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C20Z;
import X.C3Ej;
import X.C3Ek;
import X.C3Pi;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3rb;
import X.C60I;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HoC;
import X.HrH;
import X.HtJ;
import X.HwN;
import X.Hwg;
import X.HxE;
import X.HzC;
import X.InterfaceC2178B0w;
import X.InterfaceC7549F2g;
import android.graphics.Bitmap;
import com.facebook.aura.browsertask.data.BrowserTaskRepository;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.model.BrowserTaskDisplayStatus;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.model.BrowserTaskScreenshot;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class BrowserTaskPresentationStore implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final BLG<BrowserTaskPresentation> _currentTask;
    public final BLG<InterfaceC2178B0w> _previewFrame;
    public final BLG<Long> _sessionStartedAt;
    public final BLG<String> _thumbnailUri;
    public final C1BN<Boolean> canStopTask;
    public final C1BN<BrowserTaskPresentation> currentTask;
    public final C1BN<Boolean> isActive;
    public final C1BN<Boolean> isPreviewRevoked;
    public final C1BN<String> pageUrl;
    public final C1BN<InterfaceC2178B0w> previewFrame;
    public volatile String previewFrameUri;
    public final C1BN<Set<String>> previewRevokedTaskIds;
    public final C3UX scope;
    public final C1BN<Long> sessionStartedAt;
    public final C1BN<String> siteDomain;
    public final C1BN<String> taskActivityTitle;
    public final C1BN<BrowserTaskDisplayStatus> taskDisplayState;
    public final C1BN<String> taskDisplayStatus;
    public final BrowserTaskRepository taskRepository;
    public final C1BN<BrowserTaskPresentation> terminalOutcome;
    public final C1BN<String> thumbnailUri;
    public final AbstractC3358CGz userSession;
    public final CopyOnWriteArraySet<G0U<String, Unit>> viewerResetListeners;

    @DebugMetadata(c = "com.facebook.aura.browsertask.presentation.BrowserTaskPresentationStore$1", f = "BrowserTaskPresentationStore.kt", l = {128}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.browsertask.presentation.BrowserTaskPresentationStore$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.browsertask.presentation.BrowserTaskPresentationStore$1$1", f = "BrowserTaskPresentationStore.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.browsertask.presentation.BrowserTaskPresentationStore$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00531 extends AbstractC07127nr implements G0W<BrowserTaskPresentation, Set<? extends String>, HtJ<? super HxE<? extends BrowserTaskPresentation, ? extends Set<? extends String>>>, Object> {
            public /* synthetic */ Object L$0;
            public /* synthetic */ Object L$1;
            public int label;

            public C00531(HtJ<? super C00531> htJ) {
                super(3, htJ);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(BrowserTaskPresentation browserTaskPresentation, Set<String> set, HtJ<? super HxE<BrowserTaskPresentation, ? extends Set<String>>> htJ) {
                C00531 c00531 = new C00531(htJ);
                c00531.L$0 = browserTaskPresentation;
                c00531.L$1 = set;
                return c00531.invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object obj2 = this.L$0;
                Object obj3 = this.L$1;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return C3cG.A0r(obj2, obj3);
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(BrowserTaskPresentation browserTaskPresentation, Set<? extends String> set, HtJ<? super HxE<? extends BrowserTaskPresentation, ? extends Set<? extends String>>> htJ) {
                return invoke2(browserTaskPresentation, (Set<String>) set, (HtJ<? super HxE<BrowserTaskPresentation, ? extends Set<String>>>) htJ);
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return BrowserTaskPresentationStore.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BrowserTaskPresentationStore browserTaskPresentationStore = BrowserTaskPresentationStore.this;
                C60I c60iA03 = C3rb.A03(new C00531(null), browserTaskPresentationStore.taskRepository.currentTask, browserTaskPresentationStore.previewRevokedTaskIds);
                final BrowserTaskPresentationStore browserTaskPresentationStore2 = BrowserTaskPresentationStore.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.browsertask.presentation.BrowserTaskPresentationStore.1.2
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((HxE<BrowserTaskPresentation, ? extends Set<String>>) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(HxE<BrowserTaskPresentation, ? extends Set<String>> hxE, HtJ<? super Unit> htJ) {
                        String str;
                        String str2;
                        String str3;
                        String str4;
                        BLG blg;
                        Long lA0S;
                        BrowserTaskPresentation browserTaskPresentation = hxE.first;
                        Set set = (Set) hxE.second;
                        String strResolveRawAssetUrl = null;
                        if (browserTaskPresentation != null) {
                            str = browserTaskPresentation.browserTaskId;
                        } else {
                            str = null;
                        }
                        BrowserTaskPresentation browserTaskPresentationA0G = C3cG.A0G(browserTaskPresentationStore2.taskRepository.currentTask);
                        if (browserTaskPresentationA0G != null) {
                            str2 = browserTaskPresentationA0G.browserTaskId;
                        } else {
                            str2 = null;
                        }
                        if (C7384Etj.areEqual(str, str2)) {
                            BrowserTaskPresentation browserTaskPresentationA0G2 = C3cG.A0G(browserTaskPresentationStore2.currentTask);
                            if (browserTaskPresentationA0G2 != null) {
                                str3 = browserTaskPresentationA0G2.browserTaskId;
                            } else {
                                str3 = null;
                            }
                            if (!C7384Etj.areEqual(str3, str)) {
                                browserTaskPresentationStore2.resetPreview();
                                BLG<Long> blg2 = browserTaskPresentationStore2._sessionStartedAt;
                                if (browserTaskPresentation != null) {
                                    lA0S = C3cG.A0S(System.currentTimeMillis());
                                } else {
                                    lA0S = null;
                                }
                                blg2.Af8(lA0S);
                            }
                            BrowserTaskPresentationStore browserTaskPresentationStore3 = browserTaskPresentationStore2;
                            if (browserTaskPresentation == null) {
                                browserTaskPresentationStore3._thumbnailUri.Af8(null);
                                blg = browserTaskPresentationStore2._sessionStartedAt;
                            } else {
                                if (browserTaskPresentationStore3._sessionStartedAt.getValue() == null) {
                                    AnonymousClass001.A1E(browserTaskPresentationStore2._sessionStartedAt, null, C3cG.A0S(System.currentTimeMillis()));
                                }
                                BrowserTaskScreenshot browserTaskScreenshot = browserTaskPresentation.latestScreenshot;
                                if (browserTaskScreenshot != null && (str4 = browserTaskScreenshot.url) != null) {
                                    strResolveRawAssetUrl = WorkspaceUriResolver.INSTANCE.resolveRawAssetUrl(str4, browserTaskPresentationStore2.userSession);
                                    if (strResolveRawAssetUrl != null) {
                                        blg = browserTaskPresentationStore2._thumbnailUri;
                                    }
                                }
                                browserTaskPresentationStore2._currentTask.Af8(browserTaskPresentation);
                                if (str != null && set.contains(str)) {
                                    browserTaskPresentationStore2.notifyViewerReset();
                                }
                            }
                            blg.Af8(strResolveRawAssetUrl);
                            browserTaskPresentationStore2._currentTask.Af8(browserTaskPresentation);
                            if (str != null) {
                                browserTaskPresentationStore2.notifyViewerReset();
                            }
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

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return BrowserTaskPresentationStore.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Companion {
        public final BrowserTaskPresentationStore getInstance(final AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (BrowserTaskPresentationStore) abstractC3358CGz.A03(BrowserTaskPresentationStore.class, new Function0() { // from class: com.facebook.aura.browsertask.presentation.BrowserTaskPresentationStore$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new BrowserTaskPresentationStore(abstractC3358CGz);
                }
            });
        }

        public static final BrowserTaskPresentationStore getInstance$lambda$0(AbstractC3358CGz abstractC3358CGz) {
            return new BrowserTaskPresentationStore(abstractC3358CGz);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.browsertask.presentation.BrowserTaskPresentationStore$isPreviewRevoked$1", f = "BrowserTaskPresentationStore.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.browsertask.presentation.BrowserTaskPresentationStore$isPreviewRevoked$1, reason: invalid class name and case insensitive filesystem */
    public final class C109961 extends AbstractC07127nr implements G0W<BrowserTaskPresentation, Set<? extends String>, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public C109961(HtJ<? super C109961> htJ) {
            super(3, htJ);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(BrowserTaskPresentation browserTaskPresentation, Set<String> set, HtJ<? super Boolean> htJ) {
            C109961 c109961 = new C109961(htJ);
            c109961.L$0 = browserTaskPresentation;
            c109961.L$1 = set;
            return c109961.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r2 = r3.L$0
                com.facebook.aura.model.BrowserTaskPresentation r2 = (com.facebook.aura.model.BrowserTaskPresentation) r2
                java.lang.Object r1 = r3.L$1
                java.util.Set r1 = (java.util.Set) r1
                int r0 = r3.label
                if (r0 != 0) goto L20
                X.Hwg.A00(r4)
                if (r2 == 0) goto L1a
                java.lang.String r0 = r2.browserTaskId
                boolean r1 = r1.contains(r0)
                r0 = 1
                if (r1 != 0) goto L1b
            L1a:
                r0 = 0
            L1b:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            L20:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.presentation.BrowserTaskPresentationStore.C109961.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Object invoke(BrowserTaskPresentation browserTaskPresentation, Set<? extends String> set, HtJ<? super Boolean> htJ) {
            return invoke2(browserTaskPresentation, (Set<String>) set, htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.browsertask.presentation.BrowserTaskPresentationStore$onPreviewFrameDecoded$1", f = "BrowserTaskPresentationStore.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.browsertask.presentation.BrowserTaskPresentationStore$onPreviewFrameDecoded$1, reason: invalid class name and case insensitive filesystem */
    public final class C109971 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Bitmap $bitmap;
        public final /* synthetic */ String $uri;
        public int label;
        public final /* synthetic */ BrowserTaskPresentationStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109971(String str, BrowserTaskPresentationStore browserTaskPresentationStore, Bitmap bitmap, HtJ<? super C109971> htJ) {
            super(2, htJ);
            this.$uri = str;
            this.this$0 = browserTaskPresentationStore;
            this.$bitmap = bitmap;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C109971(this.$uri, this.this$0, this.$bitmap, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            String str = this.$uri;
            if (str != null && str.equals(this.this$0._thumbnailUri.getValue()) && !C7384Etj.areEqual(this.$uri, this.this$0.previewFrameUri) && !this.$bitmap.isRecycled()) {
                this.this$0.previewFrameUri = this.$uri;
                AnonymousClass002.A1I(this.this$0._previewFrame, new B1T(this.$bitmap));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C109971) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void onPreviewFrameDecoded(String str, Bitmap bitmap) {
        C7384Etj.A0Y(bitmap, 1);
        AnonymousClass001.A1I(AuraDispatchers.mainImmediate, new C109971(str, this, bitmap, null), this.scope);
    }

    public final AutoCloseable registerViewerReset(final G0U<? super String, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.viewerResetListeners.add(g0u);
        return new AutoCloseable() { // from class: com.facebook.aura.browsertask.presentation.BrowserTaskPresentationStore$$ExternalSyntheticLambda0
            @Override // java.lang.AutoCloseable
            public final void close() {
                this.f$0.viewerResetListeners.remove(g0u);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyViewerReset() {
        BrowserTaskPresentation browserTaskPresentationA0G = C3cG.A0G(this.currentTask);
        String str = browserTaskPresentationA0G != null ? browserTaskPresentationA0G.browserTaskId : null;
        Iterator<G0U<String, Unit>> it = this.viewerResetListeners.iterator();
        while (it.hasNext()) {
            it.next().invoke(str);
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.viewerResetListeners.clear();
        this._thumbnailUri.Af8(null);
        this._previewFrame.Af8(null);
        this.previewFrameUri = null;
        this._currentTask.Af8(null);
        HoC hoC = (HoC) C3cH.A0t(this.scope);
        if (hoC != null) {
            hoC.A5w(null);
        }
    }

    public final C1BN<Boolean> getCanStopTask() {
        return this.canStopTask;
    }

    public final C1BN<BrowserTaskPresentation> getCurrentTask() {
        return this.currentTask;
    }

    public final C1BN<String> getPageUrl() {
        return this.pageUrl;
    }

    public final C1BN<InterfaceC2178B0w> getPreviewFrame() {
        return this.previewFrame;
    }

    public final C1BN<Set<String>> getPreviewRevokedTaskIds() {
        return this.previewRevokedTaskIds;
    }

    public final C1BN<Long> getSessionStartedAt() {
        return this.sessionStartedAt;
    }

    public final C1BN<String> getSiteDomain() {
        return this.siteDomain;
    }

    public final C1BN<String> getTaskActivityTitle() {
        return this.taskActivityTitle;
    }

    public final C1BN<BrowserTaskDisplayStatus> getTaskDisplayState() {
        return this.taskDisplayState;
    }

    public final C1BN<String> getTaskDisplayStatus() {
        return this.taskDisplayStatus;
    }

    public final C1BN<BrowserTaskPresentation> getTerminalOutcome() {
        return this.terminalOutcome;
    }

    public final C1BN<String> getThumbnailUri() {
        return this.thumbnailUri;
    }

    public final C1BN<Boolean> isActive() {
        return this.isActive;
    }

    public final C1BN<Boolean> isPreviewRevoked() {
        return this.isPreviewRevoked;
    }

    public BrowserTaskPresentationStore(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        BrowserTaskRepository companion = BrowserTaskRepository.Companion.getInstance(abstractC3358CGz);
        this.taskRepository = companion;
        this.viewerResetListeners = new CopyOnWriteArraySet<>();
        HzC hzCA0x = C3cH.A0x(C3cG.A0v());
        this.scope = hzCA0x;
        HrH hrH = HwN.A01;
        C9286GCn c9286GCnA14 = C3cG.A14(hrH);
        this._currentTask = c9286GCnA14;
        C3Pi c3PiA11 = C3cG.A11(c9286GCnA14);
        this.currentTask = c3PiA11;
        BrowserTaskPresentationStore$special$$inlined$map$1 browserTaskPresentationStore$special$$inlined$map$1 = new BrowserTaskPresentationStore$special$$inlined$map$1(c3PiA11);
        C3Ej c3Ej = C3Ek.A00;
        Boolean boolA0h = AnonymousClass001.A0h();
        this.isActive = AnonymousClass441.A00(boolA0h, hzCA0x, browserTaskPresentationStore$special$$inlined$map$1, c3Ej);
        this.terminalOutcome = companion.terminalTask;
        C1BN<Set<String>> c1bn = companion.previewRevokedTaskIds;
        this.previewRevokedTaskIds = c1bn;
        this.isPreviewRevoked = AnonymousClass441.A00(boolA0h, hzCA0x, C3rb.A03(new C109961(null), c3PiA11, c1bn), c3Ej);
        this.taskActivityTitle = AnonymousClass441.A00(null, hzCA0x, new BrowserTaskPresentationStore$special$$inlined$map$2(c3PiA11), c3Ej);
        this.taskDisplayStatus = AnonymousClass441.A00(null, hzCA0x, new BrowserTaskPresentationStore$special$$inlined$map$3(c3PiA11), c3Ej);
        this.taskDisplayState = AnonymousClass441.A00(null, hzCA0x, new BrowserTaskPresentationStore$special$$inlined$map$4(c3PiA11), c3Ej);
        this.siteDomain = AnonymousClass441.A00(null, hzCA0x, new BrowserTaskPresentationStore$special$$inlined$map$5(c3PiA11), c3Ej);
        this.pageUrl = AnonymousClass441.A00(null, hzCA0x, new BrowserTaskPresentationStore$special$$inlined$map$6(c3PiA11), c3Ej);
        this.canStopTask = AnonymousClass441.A00(boolA0h, hzCA0x, new BrowserTaskPresentationStore$special$$inlined$map$7(c3PiA11), c3Ej);
        C9286GCn c9286GCnA142 = C3cG.A14(hrH);
        this._sessionStartedAt = c9286GCnA142;
        this.sessionStartedAt = C3cG.A11(c9286GCnA142);
        C9286GCn c9286GCnA143 = C3cG.A14(hrH);
        this._thumbnailUri = c9286GCnA143;
        this.thumbnailUri = C3cG.A11(c9286GCnA143);
        C9286GCn c9286GCnA144 = C3cG.A14(hrH);
        this._previewFrame = c9286GCnA144;
        this.previewFrame = C3cG.A11(c9286GCnA144);
        companion.start();
        AnonymousClass001.A1I(AuraDispatchers.mainImmediate, new AnonymousClass1(null), hzCA0x);
    }

    public final void resetPreview() {
        notifyViewerReset();
        this._thumbnailUri.Af8(null);
        this._previewFrame.Af8(null);
        this.previewFrameUri = null;
    }

    public /* synthetic */ BrowserTaskPresentationStore(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
