package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AbstractC7606F5t;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C06H;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cF;
import X.C3cG;
import X.C3cI;
import X.C3rb;
import X.C60O;
import X.C7384Etj;
import X.C78W;
import X.C8eO;
import X.EnumC10460Hji;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.GAt;
import X.GDB;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.InterfaceC10560Hsz;
import android.app.Presentation;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.media.Image;
import android.media.ImageReader;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.nodes.transport.HatchNodeOperationLease;
import com.facebook.aura.nodes.transport.HatchNodeServiceState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes5.dex */
public final class LocalBrowserHeadlessHost implements AutoCloseable {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final String DISPLAY_NAME = "local-browser-headless";
    public static final float HIDDEN_APP_REFRESH_RATE = 30.0f;
    public static final String LEASE_REASON = "localbrowser:headless";
    public static final int MAX_FRAMES = 2;
    public static final long SERVICE_START_TIMEOUT_MS = 10000;
    public static final String TAG = "LocalBrowserHeadlessHost";
    public boolean closed;
    public FrameLayout container;
    public VirtualDisplay display;
    public boolean displayStopped;
    public final InterfaceC10560Hsz<Unit> firstLayout;
    public boolean isReady;
    public boolean isStarting;
    public final View.OnLayoutChangeListener layoutListener;
    public HoC leaseJob;
    public G0U<? super LocalBrowserHeadlessHost, Unit> onAvailabilityChanged;
    public Presentation presentation;
    public ImageReader reader;
    public final C3UX scope;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserHeadlessHost$ensureLease$1", f = "LocalBrowserHeadlessHost.kt", l = {147}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserHeadlessHost$ensureLease$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserHeadlessHost$ensureLease$1$1", f = "LocalBrowserHeadlessHost.kt", l = {149, 158}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.localbrowser.LocalBrowserHeadlessHost$ensureLease$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02011 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public Object L$0;
            public int label;
            public final /* synthetic */ LocalBrowserHeadlessHost this$0;

            @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserHeadlessHost$ensureLease$1$1$1", f = "LocalBrowserHeadlessHost.kt", l = {}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.localbrowser.LocalBrowserHeadlessHost$ensureLease$1$1$1, reason: invalid class name and collision with other inner class name */
            public final class C02021 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
                public /* synthetic */ boolean Z$0;
                public int label;

                public C02021(HtJ<? super C02021> htJ) {
                    super(2, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    C02021 c02021 = new C02021(htJ);
                    c02021.Z$0 = AnonymousClass001.A1X(obj);
                    return c02021;
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    boolean z = this.Z$0;
                    if (this.label != 0) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return C3cG.A0P(z);
                }

                @Override // X.G0V
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
                    return invoke(AnonymousClass001.A1X(bool), htJ);
                }

                public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
                    return ((C02021) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02011(LocalBrowserHeadlessHost localBrowserHeadlessHost, HtJ<? super C02011> htJ) {
                super(1, htJ);
                this.this$0 = localBrowserHeadlessHost;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C02011(this.this$0, htJ);
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return new C02011(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    LocalBrowserHeadlessHost$ensureLease$1$1$running$1 localBrowserHeadlessHost$ensureLease$1$1$running$1 = new LocalBrowserHeadlessHost$ensureLease$1$1$running$1(this.this$0, null);
                    this.label = 1;
                    obj = C3cI.A0S(localBrowserHeadlessHost$ensureLease$1$1$running$1, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                        return Unit.INSTANCE;
                    }
                    Hwg.A00(obj);
                }
                if (C3cG.A1P(obj, true)) {
                    LocalBrowserHeadlessHost localBrowserHeadlessHost = this.this$0;
                    localBrowserHeadlessHost.isReady = true;
                    localBrowserHeadlessHost.isStarting = false;
                    localBrowserHeadlessHost.onAvailabilityChanged.invoke(localBrowserHeadlessHost);
                    C1BN<Boolean> c1bn = HatchNodeServiceState.isForeground;
                    C02021 c02021 = new C02021(null);
                    this.L$0 = null;
                    this.label = 2;
                    if (AbstractC9777Gfy.A00(this, c02021, c1bn) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserHeadlessHost.this.new AnonymousClass1(htJ);
        }

        /* JADX WARN: Finally extract failed */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchNodeOperationLease hatchNodeOperationLease = HatchNodeOperationLease.INSTANCE;
                    C02011 c02011 = new C02011(LocalBrowserHeadlessHost.this, null);
                    this.label = 1;
                    if (hatchNodeOperationLease.withHostLease(LocalBrowserHeadlessHost.LEASE_REASON, c02011, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                LocalBrowserHeadlessHost localBrowserHeadlessHost = LocalBrowserHeadlessHost.this;
                localBrowserHeadlessHost.isReady = false;
                localBrowserHeadlessHost.isStarting = false;
                if (!localBrowserHeadlessHost.closed) {
                    localBrowserHeadlessHost.onAvailabilityChanged.invoke(localBrowserHeadlessHost);
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                LocalBrowserHeadlessHost localBrowserHeadlessHost2 = LocalBrowserHeadlessHost.this;
                localBrowserHeadlessHost2.isReady = false;
                localBrowserHeadlessHost2.isStarting = false;
                if (localBrowserHeadlessHost2.closed) {
                    throw th;
                }
                localBrowserHeadlessHost2.onAvailabilityChanged.invoke(localBrowserHeadlessHost2);
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return LocalBrowserHeadlessHost.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserHeadlessHost$throttleWhileAppHidden$1", f = "LocalBrowserHeadlessHost.kt", l = {133}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserHeadlessHost$throttleWhileAppHidden$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes2.dex */
    public final class C124301 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Window $window;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserHeadlessHost$throttleWhileAppHidden$1$1", f = "LocalBrowserHeadlessHost.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.localbrowser.LocalBrowserHeadlessHost$throttleWhileAppHidden$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02031 extends AbstractC07127nr implements G2j<Boolean, Boolean, Boolean, HtJ<? super Boolean>, Object> {
            public /* synthetic */ boolean Z$0;
            public /* synthetic */ boolean Z$1;
            public /* synthetic */ boolean Z$2;
            public int label;

            public C02031(HtJ<? super C02031> htJ) {
                super(4, htJ);
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    boolean r3 = r4.Z$0
                    boolean r2 = r4.Z$1
                    boolean r1 = r4.Z$2
                    int r0 = r4.label
                    if (r0 != 0) goto L1a
                    X.Hwg.A00(r5)
                    if (r3 != 0) goto L14
                    if (r2 != 0) goto L14
                    r0 = 0
                    if (r1 == 0) goto L15
                L14:
                    r0 = 1
                L15:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                L1a:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserHeadlessHost.C124301.C02031.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Boolean bool3, HtJ<? super Boolean> htJ) {
                return invoke(AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2), AnonymousClass001.A1X(bool3), htJ);
            }

            public final Object invoke(boolean z, boolean z2, boolean z3, HtJ<? super Boolean> htJ) {
                C02031 c02031 = new C02031(htJ);
                c02031.Z$0 = z;
                c02031.Z$1 = z2;
                c02031.Z$2 = z3;
                return c02031.invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124301(Window window, HtJ<? super C124301> htJ) {
            super(2, htJ);
            this.$window = window;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C124301(this.$window, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C20Q c20qA01 = GDB.A01(C3rb.A00(new C02031(null), AuraAppLifecycleManager.isAppInForegroundImmediateFlow, AuraAppLifecycleManager.isAssistOverlayActiveFlow, AuraAppLifecycleManager.isWindowSurfaceVisibleFlow));
                final Window window = this.$window;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.localbrowser.LocalBrowserHeadlessHost.throttleWhileAppHidden.1.2
                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        Window window2 = window;
                        WindowManager.LayoutParams attributes = window2.getAttributes();
                        attributes.preferredRefreshRate = z ? 0.0f : 30.0f;
                        window2.setAttributes(attributes);
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (c20qA01.collect(c20z, this) == enumC10460Hji) {
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
            return new C124301(this.$window, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void bindAvailability(G0U<? super LocalBrowserHeadlessHost, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.onAvailabilityChanged = g0u;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        /* renamed from: open-95KtPRI, reason: not valid java name */
        public final LocalBrowserHeadlessHost m1220open95KtPRI(Context context, long j, int i, G0U<? super LocalBrowserHeadlessHost, Unit> g0u) {
            AnonymousClass003.A0w(context, g0u);
            LocalBrowserHeadlessHost localBrowserHeadlessHost = new LocalBrowserHeadlessHost(g0u);
            try {
                localBrowserHeadlessHost.m1219showJVtK1S4(context, j, i);
                return localBrowserHeadlessHost;
            } catch (RuntimeException e) {
                localBrowserHeadlessHost.close();
                throw e;
            }
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: show-JVtK1S4, reason: not valid java name */
    public final void m1219showJVtK1S4(Context context, long j, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        ImageReader imageReaderNewInstance = ImageReader.newInstance(i2, i3, 1, 2);
        this.reader = imageReaderNewInstance;
        C7384Etj.A0U(imageReaderNewInstance);
        imageReaderNewInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: com.facebook.aura.localbrowser.LocalBrowserHeadlessHost$$ExternalSyntheticLambda1
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                LocalBrowserHeadlessHost.show_JVtK1S4$lambda$1(imageReader);
            }
        }, C60O.A02());
        VirtualDisplay virtualDisplayCreateVirtualDisplay = ((DisplayManager) context.getSystemService(DisplayManager.class)).createVirtualDisplay(DISPLAY_NAME, i2, i3, i, imageReaderNewInstance.getSurface(), 0, new VirtualDisplay.Callback() { // from class: com.facebook.aura.localbrowser.LocalBrowserHeadlessHost$show$virtualDisplay$1
            @Override // android.hardware.display.VirtualDisplay.Callback
            public void onStopped() {
                LocalBrowserHeadlessHost localBrowserHeadlessHost = this.this$0;
                if (localBrowserHeadlessHost.closed) {
                    return;
                }
                localBrowserHeadlessHost.displayStopped = true;
                LocalBrowserTelemetry.INSTANCE.event(AbstractC7606F5t.A00(45), "error", AnonymousClass006.A10(C3cF.A00(4), "display_stopped"), null);
                HoC hoC = this.this$0.leaseJob;
                if (hoC != null) {
                    hoC.A5w(null);
                }
                LocalBrowserHeadlessHost localBrowserHeadlessHost2 = this.this$0;
                localBrowserHeadlessHost2.isReady = false;
                localBrowserHeadlessHost2.isStarting = false;
                localBrowserHeadlessHost2.onAvailabilityChanged.invoke(localBrowserHeadlessHost2);
            }
        }, C60O.A02());
        this.display = virtualDisplayCreateVirtualDisplay;
        Presentation presentation = new Presentation(context, virtualDisplayCreateVirtualDisplay.getDisplay());
        this.presentation = presentation;
        this.container = new FrameLayout(presentation.getContext());
        getContainer().addOnLayoutChangeListener(this.layoutListener);
        presentation.setContentView(getContainer());
        presentation.show();
        Window window = presentation.getWindow();
        if (window != null) {
            throttleWhileAppHidden(window);
        }
        ensureLease();
    }

    private final void throttleWhileAppHidden(Window window) {
        AnonymousClass001.A1J(new C124301(window, null), this.scope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.isReady = false;
        this.isStarting = false;
        Hxb.A03(null, this.scope);
        if (this.container != null) {
            getContainer().removeOnLayoutChangeListener(this.layoutListener);
        }
        try {
            Presentation presentation = this.presentation;
            if (presentation != null) {
                presentation.dismiss();
            }
            this.presentation = null;
            try {
                VirtualDisplay virtualDisplay = this.display;
                if (virtualDisplay != null) {
                    virtualDisplay.release();
                }
            } finally {
                this.display = null;
                ImageReader imageReader = this.reader;
                if (imageReader != null) {
                    imageReader.setOnImageAvailableListener(null, null);
                }
                ImageReader imageReader2 = this.reader;
                if (imageReader2 != null) {
                    imageReader2.close();
                }
                this.reader = null;
            }
        } catch (Throwable th) {
            this.presentation = null;
            try {
                VirtualDisplay virtualDisplay2 = this.display;
                if (virtualDisplay2 != null) {
                    virtualDisplay2.release();
                }
                this.display = null;
                ImageReader imageReader3 = this.reader;
                if (imageReader3 != null) {
                    imageReader3.setOnImageAvailableListener(null, null);
                }
                ImageReader imageReader4 = this.reader;
                if (imageReader4 != null) {
                    imageReader4.close();
                }
                this.reader = null;
                throw th;
            } finally {
                this.display = null;
                ImageReader imageReader5 = this.reader;
                if (imageReader5 != null) {
                    imageReader5.setOnImageAvailableListener(null, null);
                }
                ImageReader imageReader6 = this.reader;
                if (imageReader6 != null) {
                    imageReader6.close();
                }
                this.reader = null;
            }
        }
    }

    public final void ensureLease() {
        if (this.closed || this.displayStopped) {
            return;
        }
        HoC hoC = this.leaseJob;
        if (hoC == null || !hoC.isActive()) {
            this.isStarting = true;
            this.leaseJob = AnonymousClass001.A11(new AnonymousClass1(null), this.scope);
        }
    }

    public final FrameLayout getContainer() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            return frameLayout;
        }
        C7384Etj.A0b("container");
        throw F60.createAndThrow();
    }

    public final boolean getDisplayStopped() {
        return this.displayStopped;
    }

    public final Window getWindow() {
        Presentation presentation = this.presentation;
        if (presentation != null) {
            return presentation.getWindow();
        }
        return null;
    }

    public final boolean isReady() {
        return this.isReady;
    }

    public final boolean isStarting() {
        return this.isStarting;
    }

    public LocalBrowserHeadlessHost(G0U<? super LocalBrowserHeadlessHost, Unit> g0u) {
        this.onAvailabilityChanged = g0u;
        this.firstLayout = new GAt(null);
        this.layoutListener = new View.OnLayoutChangeListener() { // from class: com.facebook.aura.localbrowser.LocalBrowserHeadlessHost$$ExternalSyntheticLambda0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                LocalBrowserHeadlessHost localBrowserHeadlessHost = this.f$0;
                if (!view.isAttachedToWindow() || view.getWidth() <= 0 || view.getHeight() <= 0) {
                    return;
                }
                C3cG.A1F(localBrowserHeadlessHost.firstLayout, Unit.INSTANCE);
            }
        };
        this.isStarting = true;
        this.scope = Hxb.A02(C78W.A02(new C8eO(null), AuraDispatchers.mainImmediate).plus(new LocalBrowserHeadlessHost$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key)));
    }

    public static final void layoutListener$lambda$0(LocalBrowserHeadlessHost localBrowserHeadlessHost, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (!view.isAttachedToWindow() || view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        C3cG.A1F(localBrowserHeadlessHost.firstLayout, Unit.INSTANCE);
    }

    public static final void show_JVtK1S4$lambda$1(ImageReader imageReader) {
        Image imageAcquireLatestImage = imageReader.acquireLatestImage();
        if (imageAcquireLatestImage != null) {
            imageAcquireLatestImage.close();
        }
    }

    public final Context getWindowContext() {
        Context context = getContainer().getContext();
        C7384Etj.A0U(context);
        return context;
    }

    public /* synthetic */ LocalBrowserHeadlessHost(G0U g0u, C06H c06h) {
        this(g0u);
    }
}
