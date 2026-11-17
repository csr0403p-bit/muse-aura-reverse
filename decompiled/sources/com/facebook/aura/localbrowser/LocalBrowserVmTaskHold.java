package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AbstractC10627Hzt;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C06H;
import X.C10533Hqc;
import X.C10543Hqv;
import X.C1BN;
import X.C20Z;
import X.C27a;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C7Je;
import X.C8eO;
import X.EnumC10460Hji;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.app.KeyguardManager;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.aura.backgroundwork.api.BackgroundWorkContentClaim;
import com.facebook.aura.browsertask.data.BrowserTaskRepository;
import com.facebook.aura.browsertask.presentation.BrowserTaskActions;
import com.facebook.aura.common.image.AuraBitmapLoader;
import com.facebook.aura.gateway.HatchAgentExecution;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.localbrowser.config.LocalBrowserConfig;
import com.facebook.aura.model.BrowserTaskPresentation;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.maplibre.android.R;

/* loaded from: classes2.dex */
public final class LocalBrowserVmTaskHold {
    public static final int $stable = 8;

    @Deprecated
    public static final String CALLER_CONTEXT = "LocalBrowserVmTaskHold";
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final int PREVIEW_SIZE_PX = 480;

    @Deprecated
    public static final long PREVIEW_TIMEOUT_MS = 10000;

    @Deprecated
    public static final String TAG = "LocalBrowserVmTaskHold";
    public final C27a job;
    public final C3UX scope;
    public final AbstractC3358CGz userSession;
    public HoC watch;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserVmTaskHold", f = "LocalBrowserVmTaskHold.kt", l = {98}, m = "hold", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserVmTaskHold$hold$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserVmTaskHold.this.hold(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserVmTaskHold$hold$2", f = "LocalBrowserVmTaskHold.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserVmTaskHold$hold$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<BrowserTaskPresentation, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            /*
                r2 = this;
                java.lang.Object r1 = r2.L$0
                com.facebook.aura.model.BrowserTaskPresentation r1 = (com.facebook.aura.model.BrowserTaskPresentation) r1
                int r0 = r2.label
                if (r0 != 0) goto L22
                X.Hwg.A00(r3)
                if (r1 == 0) goto L1c
                com.facebook.aura.model.BrowserTaskExecution r0 = r1.execution
                boolean r0 = r0.isVm()
                if (r0 == 0) goto L1c
                boolean r1 = r1.isTerminal()
                r0 = 1
                if (r1 == 0) goto L1d
            L1c:
                r0 = 0
            L1d:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            L22:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserVmTaskHold.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(BrowserTaskPresentation browserTaskPresentation, HtJ<? super Boolean> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = browserTaskPresentation;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserVmTaskHold$hold$3", f = "LocalBrowserVmTaskHold.kt", l = {102}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserVmTaskHold$hold$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<BrowserTaskPresentation, HtJ<? super Unit>, Object> {
        public final /* synthetic */ BackgroundWorkContentClaim $claim;
        public final /* synthetic */ C10543Hqv<Bitmap> $preview;
        public final /* synthetic */ C10543Hqv<String> $previewUrl;
        public final /* synthetic */ BrowserTaskRepository $repository;
        public final /* synthetic */ Function0<Unit> $stop;
        public final /* synthetic */ String $taskId;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public final /* synthetic */ LocalBrowserVmTaskHold this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BackgroundWorkContentClaim backgroundWorkContentClaim, String str, C10543Hqv<Bitmap> c10543Hqv, Function0<Unit> function0, C10543Hqv<String> c10543Hqv2, LocalBrowserVmTaskHold localBrowserVmTaskHold, BrowserTaskRepository browserTaskRepository, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$claim = backgroundWorkContentClaim;
            this.$taskId = str;
            this.$preview = c10543Hqv;
            this.$stop = function0;
            this.$previewUrl = c10543Hqv2;
            this.this$0 = localBrowserVmTaskHold;
            this.$repository = browserTaskRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$claim, this.$taskId, this.$preview, this.$stop, this.$previewUrl, this.this$0, this.$repository, htJ);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r5 = r11.L$0
                com.facebook.aura.model.BrowserTaskPresentation r5 = (com.facebook.aura.model.BrowserTaskPresentation) r5
                X.Hji r2 = X.EnumC10460Hji.A02
                int r0 = r11.label
                r1 = 1
                if (r0 == 0) goto L35
                if (r0 != r1) goto L84
                java.lang.Object r3 = r11.L$3
                X.Hqv r3 = (X.C10543Hqv) r3
                java.lang.Object r4 = r11.L$1
                X.Hwg.A00(r12)
            L16:
                r3.element = r12
                X.Hqv<java.lang.String> r0 = r11.$previewUrl
                r0.element = r4
                com.facebook.aura.backgroundwork.api.BackgroundWorkContentClaim r1 = r11.$claim
                java.lang.String r4 = r11.$taskId
                X.Hqv<android.graphics.Bitmap> r0 = r11.$preview
                T r7 = r0.element
                android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
                kotlin.jvm.functions.Function0<kotlin.Unit> r8 = r11.$stop
                r6 = 0
                r9 = 0
                r10 = r9
                com.facebook.aura.backgroundwork.api.BackgroundWorkContent r0 = com.facebook.aura.localbrowser.LocalBrowserBackgroundWorkKt.localBrowserBackgroundWorkContent(r4, r5, r6, r7, r8, r9, r10)
                r1.update(r0)
            L32:
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                return r2
            L35:
                X.Hwg.A00(r12)
                com.facebook.aura.backgroundwork.api.BackgroundWorkContentClaim r3 = r11.$claim
                java.lang.String r4 = r11.$taskId
                X.Hqv<android.graphics.Bitmap> r0 = r11.$preview
                T r7 = r0.element
                android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
                kotlin.jvm.functions.Function0<kotlin.Unit> r8 = r11.$stop
                r6 = 0
                r9 = 0
                r10 = r9
                com.facebook.aura.backgroundwork.api.BackgroundWorkContent r0 = com.facebook.aura.localbrowser.LocalBrowserBackgroundWorkKt.localBrowserBackgroundWorkContent(r4, r5, r6, r7, r8, r9, r10)
                r3.update(r0)
                com.facebook.aura.model.BrowserTaskScreenshot r0 = r5.latestScreenshot
                r12 = 0
                if (r0 == 0) goto L82
                java.lang.String r4 = r0.url
                if (r4 == 0) goto L82
                com.facebook.aura.localbrowser.LocalBrowserVmTaskHold r3 = r11.this$0
                com.facebook.aura.browsertask.data.BrowserTaskRepository r0 = r11.$repository
                boolean r0 = com.facebook.aura.localbrowser.LocalBrowserVmTaskHold.access$canShowPreview(r3, r0, r5)
                if (r0 == 0) goto L82
            L61:
                X.Hqv<java.lang.String> r0 = r11.$previewUrl
                T r0 = r0.element
                boolean r0 = X.C7384Etj.areEqual(r4, r0)
                if (r0 != 0) goto L32
                X.Hqv<android.graphics.Bitmap> r3 = r11.$preview
                if (r4 == 0) goto L16
                com.facebook.aura.localbrowser.LocalBrowserVmTaskHold r0 = r11.this$0
                r11.L$0 = r5
                r11.L$1 = r4
                r11.L$2 = r6
                r11.L$3 = r3
                r11.label = r1
                java.lang.Object r12 = com.facebook.aura.localbrowser.LocalBrowserVmTaskHold.access$loadPreview(r0, r4, r11)
                if (r12 != r2) goto L16
                return r2
            L82:
                r4 = r6
                goto L61
            L84:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserVmTaskHold.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(BrowserTaskPresentation browserTaskPresentation, HtJ<? super Unit> htJ) {
            return ((AnonymousClass3) create(browserTaskPresentation, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserVmTaskHold$holdTurnTasks$2", f = "LocalBrowserVmTaskHold.kt", l = {63}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserVmTaskHold$holdTurnTasks$2, reason: invalid class name and case insensitive filesystem */
    public final class C124822 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;

        public C124822(HtJ<? super C124822> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C124822 c124822 = LocalBrowserVmTaskHold.this.new C124822(htJ);
            c124822.L$0 = obj;
            return c124822;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            final C3UX c3ux = (C3UX) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final BrowserTaskRepository companion = BrowserTaskRepository.Companion.getInstance(LocalBrowserVmTaskHold.this.userSession);
                companion.start();
                final HatchAgentExecution companion2 = HatchAgentExecution.Companion.getInstance(LocalBrowserVmTaskHold.this.userSession);
                List<BrowserTaskPresentation> value = companion.activeTasks.getValue();
                final LinkedHashSet linkedHashSetA0k = C3cG.A0k();
                Iterator<T> it = value.iterator();
                while (it.hasNext()) {
                    linkedHashSetA0k.add(((BrowserTaskPresentation) it.next()).browserTaskId);
                }
                final LinkedHashSet linkedHashSetA0k2 = C3cG.A0k();
                final ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
                C1BN<List<BrowserTaskPresentation>> c1bn = companion.activeTasks;
                final LocalBrowserVmTaskHold localBrowserVmTaskHold = LocalBrowserVmTaskHold.this;
                C20Z<? super List<BrowserTaskPresentation>> c20z = new C20Z() { // from class: com.facebook.aura.localbrowser.LocalBrowserVmTaskHold.holdTurnTasks.2.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((List<BrowserTaskPresentation>) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(List<BrowserTaskPresentation> list, HtJ<? super Unit> htJ) {
                        Set<String> set = linkedHashSetA0k;
                        HatchAgentExecution hatchAgentExecution = companion2;
                        Set<String> set2 = linkedHashSetA0k2;
                        ConcurrentHashMap.KeySetView<String, Boolean> keySetView = keySetViewNewKeySet;
                        C3UX c3ux2 = c3ux;
                        LocalBrowserVmTaskHold localBrowserVmTaskHold2 = localBrowserVmTaskHold;
                        BrowserTaskRepository browserTaskRepository = companion;
                        for (BrowserTaskPresentation browserTaskPresentation : list) {
                            String str = browserTaskPresentation.browserTaskId;
                            if (set.add(str) && hatchAgentExecution.isActive()) {
                                set2.add(str);
                            }
                            if (browserTaskPresentation.isTerminal()) {
                                set2.remove(str);
                            }
                            if (set2.contains(str) && browserTaskPresentation.execution.isVm() && !LocalBrowserConfig.INSTANCE.isDefaultRoute() && keySetView.add(str)) {
                                AnonymousClass001.A1J(new LocalBrowserVmTaskHold$holdTurnTasks$2$1$1$1(localBrowserVmTaskHold2, browserTaskRepository, str, keySetView, null), c3ux2);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
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

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C124822) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserVmTaskHold$loadPreview$2", f = "LocalBrowserVmTaskHold.kt", l = {126}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserVmTaskHold$loadPreview$2, reason: invalid class name and case insensitive filesystem */
    public final class C124832 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Bitmap>, Object> {
        public final /* synthetic */ Uri $uri;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124832(Uri uri, HtJ<? super C124832> htJ) {
            super(2, htJ);
            this.$uri = uri;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C124832(this.$uri, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AuraBitmapLoader auraBitmapLoader = AuraBitmapLoader.INSTANCE;
                Uri uri = this.$uri;
                Integer numA0R = C3cG.A0R(480);
                this.label = 1;
                obj = auraBitmapLoader.load(uri, "LocalBrowserVmTaskHold", numA0R, null, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Bitmap> htJ) {
            return new C124832(this.$uri, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserVmTaskHold$setActive$1", f = "LocalBrowserVmTaskHold.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserVmTaskHold$setActive$1, reason: invalid class name and case insensitive filesystem */
    public final class C124841 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C124841(HtJ<? super C124841> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserVmTaskHold.this.new C124841(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LocalBrowserVmTaskHold localBrowserVmTaskHold = LocalBrowserVmTaskHold.this;
                this.label = 1;
                if (localBrowserVmTaskHold.holdTurnTasks(this) == enumC10460Hji) {
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
            return LocalBrowserVmTaskHold.this.new C124841(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public LocalBrowserVmTaskHold(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        C8eO c8eO = new C8eO(null);
        this.job = c8eO;
        this.scope = C3cH.A0y(C3cG.A0v().plus(c8eO), new LocalBrowserVmTaskHold$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object holdTurnTasks(HtJ<? super Unit> htJ) {
        return C3cG.A0U(AbstractC10627Hzt.A00(new C124822(null), htJ));
    }

    public final synchronized void close() {
        this.watch = null;
        this.job.A5w(null);
    }

    public final synchronized void setActive(boolean z) {
        HoC hoC = this.watch;
        C10533Hqc c10533HqcA11 = null;
        if (z) {
            if (hoC == null) {
                c10533HqcA11 = AnonymousClass001.A11(new C124841(null), this.scope);
            }
        } else if (hoC != null) {
            hoC.A5w(null);
        }
        this.watch = c10533HqcA11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.facebook.aura.backgroundwork.api.BackgroundWorkClaim] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hold(final com.facebook.aura.browsertask.data.BrowserTaskRepository r19, final java.lang.String r20, X.HtJ<? super kotlin.Unit> r21) {
        /*
            r18 = this;
            r3 = r21
            boolean r0 = r3 instanceof com.facebook.aura.localbrowser.LocalBrowserVmTaskHold.AnonymousClass1
            r12 = r18
            if (r0 == 0) goto L26
            r5 = r3
            com.facebook.aura.localbrowser.LocalBrowserVmTaskHold$hold$1 r5 = (com.facebook.aura.localbrowser.LocalBrowserVmTaskHold.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r5.label = r2
        L16:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L35
            if (r0 != r3) goto L30
            java.lang.Object r7 = r5.L$3
            com.facebook.aura.backgroundwork.api.BackgroundWorkClaim r7 = (com.facebook.aura.backgroundwork.api.BackgroundWorkClaim) r7
            goto L2c
        L26:
            com.facebook.aura.localbrowser.LocalBrowserVmTaskHold$hold$1 r5 = new com.facebook.aura.localbrowser.LocalBrowserVmTaskHold$hold$1
            r5.<init>(r3)
            goto L16
        L2c:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L98
            goto L92
        L30:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L35:
            X.Hwg.A00(r1)
            com.facebook.aura.localbrowser.LocalBrowserVmTaskHold$$ExternalSyntheticLambda0 r10 = new com.facebook.aura.localbrowser.LocalBrowserVmTaskHold$$ExternalSyntheticLambda0
            r13 = r19
            r8 = r20
            r10.<init>()
            com.facebook.aura.backgroundwork.api.BackgroundWork r2 = com.facebook.aura.backgroundwork.api.BackgroundWork.INSTANCE
            X.CGz r1 = r12.userSession
            r14 = 0
            r20 = 0
            r15 = r8
            r16 = r14
            r17 = r14
            r18 = r14
            r19 = r14
            r21 = r20
            com.facebook.aura.backgroundwork.api.BackgroundWorkContent r0 = com.facebook.aura.localbrowser.LocalBrowserBackgroundWorkKt.localBrowserBackgroundWorkContent(r15, r16, r17, r18, r19, r20, r21)
            com.facebook.aura.backgroundwork.api.BackgroundWorkContentClaim r7 = r2.claim(r1, r0)
            X.Hqv r9 = X.C3cG.A0z()
            X.Hqv r11 = X.C3cG.A0z()
            X.20Q r6 = r13.presentationUpdates(r8)     // Catch: java.lang.Throwable -> L98
            com.facebook.aura.localbrowser.LocalBrowserVmTaskHold$hold$2 r1 = new com.facebook.aura.localbrowser.LocalBrowserVmTaskHold$hold$2     // Catch: java.lang.Throwable -> L98
            r1.<init>(r14)     // Catch: java.lang.Throwable -> L98
            r0 = 4
            X.I0u r2 = new X.I0u     // Catch: java.lang.Throwable -> L98
            r2.<init>(r1, r6, r0)     // Catch: java.lang.Throwable -> L98
            r1 = 2
            X.I0t r0 = new X.I0t     // Catch: java.lang.Throwable -> L98
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L98
            com.facebook.aura.localbrowser.LocalBrowserVmTaskHold$hold$3 r6 = new com.facebook.aura.localbrowser.LocalBrowserVmTaskHold$hold$3     // Catch: java.lang.Throwable -> L98
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L98
            r5.L$0 = r14     // Catch: java.lang.Throwable -> L98
            r5.L$1 = r14     // Catch: java.lang.Throwable -> L98
            r5.L$2 = r14     // Catch: java.lang.Throwable -> L98
            r5.L$3 = r7     // Catch: java.lang.Throwable -> L98
            r5.L$4 = r14     // Catch: java.lang.Throwable -> L98
            r5.L$5 = r14     // Catch: java.lang.Throwable -> L98
            r5.label = r3     // Catch: java.lang.Throwable -> L98
            java.lang.Object r0 = X.C3pU.A00(r5, r6, r0)     // Catch: java.lang.Throwable -> L98
            if (r0 != r4) goto L92
            return r4
        L92:
            r7.release()
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L98:
            r0 = move-exception
            r7.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserVmTaskHold.hold(com.facebook.aura.browsertask.data.BrowserTaskRepository, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadPreview(String str, HtJ<? super Bitmap> htJ) {
        String strResolveScreenshotUrl = WorkspaceUriResolver.INSTANCE.resolveScreenshotUrl(str, this.userSession);
        if (strResolveScreenshotUrl != null) {
            Uri uriA01 = null;
            try {
                uriA01 = C7Je.A01(strResolveScreenshotUrl);
            } catch (SecurityException | UnsupportedOperationException unused) {
            }
            if (uriA01 != null) {
                return C3cI.A0S(new C124832(uriA01, null), htJ);
            }
        }
        return null;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canShowPreview(BrowserTaskRepository browserTaskRepository, BrowserTaskPresentation browserTaskPresentation) {
        KeyguardManager keyguardManager = (KeyguardManager) C3cG.A06().getSystemService(KeyguardManager.class);
        return (keyguardManager == null || keyguardManager.isKeyguardLocked() || browserTaskRepository.previewRevokedTaskIds.getValue().contains(browserTaskPresentation.browserTaskId)) ? false : true;
    }

    public static final Unit hold$lambda$0(BrowserTaskRepository browserTaskRepository, String str, LocalBrowserVmTaskHold localBrowserVmTaskHold) {
        BrowserTaskPresentation browserTaskPresentationPresentation = browserTaskRepository.presentation(str);
        if (browserTaskPresentationPresentation != null) {
            BrowserTaskActions.Companion.getInstance(localBrowserVmTaskHold.userSession).stopTask(browserTaskPresentationPresentation);
        }
        return Unit.INSTANCE;
    }
}
