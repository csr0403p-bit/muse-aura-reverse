package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BL4;
import X.BLG;
import X.C06H;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.F1F;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.ViewOnAttachStateChangeListenerC8438Fe2;
import android.os.IBinder;
import android.view.View;
import android.webkit.WebView;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class LocalBrowserRendering implements AutoCloseable {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final int MAX_REDRAWS = 100;

    @Deprecated
    public static final long REDRAW_RETRY_MS = 50;
    public final LocalBrowserRendering$attachListener$1 attachListener;
    public boolean closed;
    public long frame;
    public boolean isTakeover;
    public final View.OnLayoutChangeListener layoutListener;
    public final Function0<Unit> onChanged;
    public ViewOnAttachStateChangeListenerC8438Fe2 pendingDraw;
    public final BLG<Boolean> ready;
    public boolean resetZoom;
    public final LocalBrowserAutomationViewport viewport;
    public final LocalBrowserWebView webView;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRendering", f = "LocalBrowserRendering.kt", l = {83}, m = "awaitAutomation", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRendering$awaitAutomation$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserRendering.this.awaitAutomation(0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRendering$awaitAutomation$2", f = "LocalBrowserRendering.kt", l = {84}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRendering$awaitAutomation$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRendering$awaitAutomation$2$1", f = "LocalBrowserRendering.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRendering$awaitAutomation$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
            public /* synthetic */ boolean Z$0;
            public int label;
            public final /* synthetic */ LocalBrowserRendering this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LocalBrowserRendering localBrowserRendering, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.this$0 = localBrowserRendering;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, htJ);
                anonymousClass1.Z$0 = AnonymousClass001.A1X(obj);
                return anonymousClass1;
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                /*
                    r2 = this;
                    boolean r1 = r2.Z$0
                    int r0 = r2.label
                    if (r0 != 0) goto L18
                    X.Hwg.A00(r3)
                    if (r1 == 0) goto L12
                    com.facebook.aura.localbrowser.LocalBrowserRendering r0 = r2.this$0
                    boolean r1 = r0.isTakeover
                    r0 = 1
                    if (r1 == 0) goto L13
                L12:
                    r0 = 0
                L13:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                L18:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserRendering.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), htJ)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
                return invoke(AnonymousClass001.A1X(bool), htJ);
            }
        }

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserRendering.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return LocalBrowserRendering.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LocalBrowserRendering localBrowserRendering = LocalBrowserRendering.this;
                BLG<Boolean> blg = localBrowserRendering.ready;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(localBrowserRendering, null);
                this.label = 1;
                if (AbstractC9777Gfy.A00(this, anonymousClass1, blg) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return C3cG.A0P(LocalBrowserRendering.this.closed);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View$OnAttachStateChangeListener, com.facebook.aura.localbrowser.LocalBrowserRendering$attachListener$1] */
    public LocalBrowserRendering(LocalBrowserWebView localBrowserWebView, LocalBrowserAutomationViewport localBrowserAutomationViewport, Function0<Unit> function0) {
        AnonymousClass005.A10(localBrowserWebView, localBrowserAutomationViewport, function0);
        this.webView = localBrowserWebView;
        this.viewport = localBrowserAutomationViewport;
        this.onChanged = function0;
        this.ready = AnonymousClass002.A0v(false);
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.facebook.aura.localbrowser.LocalBrowserRendering$$ExternalSyntheticLambda0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                LocalBrowserRendering.layoutListener$lambda$0(this.f$0, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        };
        this.layoutListener = onLayoutChangeListener;
        ?? r3 = new View.OnAttachStateChangeListener() { // from class: com.facebook.aura.localbrowser.LocalBrowserRendering$attachListener$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                this.this$0.scheduleFrame();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                LocalBrowserRendering localBrowserRendering = this.this$0;
                localBrowserRendering.frame++;
                ViewOnAttachStateChangeListenerC8438Fe2 viewOnAttachStateChangeListenerC8438Fe2 = localBrowserRendering.pendingDraw;
                if (viewOnAttachStateChangeListenerC8438Fe2 != null) {
                    viewOnAttachStateChangeListenerC8438Fe2.A01();
                }
                LocalBrowserRendering localBrowserRendering2 = this.this$0;
                localBrowserRendering2.pendingDraw = null;
                localBrowserRendering2.setReady(false);
            }
        };
        this.attachListener = r3;
        localBrowserWebView.m1233setAutomationViewportfhxjrPA(new BL4(localBrowserAutomationViewport.size));
        localBrowserWebView.addOnLayoutChangeListener(onLayoutChangeListener);
        localBrowserWebView.addOnAttachStateChangeListener(r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void redrawUntil(final long j, final int i, final Function0<Boolean> function0) {
        if (i > 0) {
            this.webView.postDelayed(new Runnable() { // from class: com.facebook.aura.localbrowser.LocalBrowserRendering$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    LocalBrowserRendering.redrawUntil$lambda$0(this.f$0, j, function0, i);
                }
            }, 50L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleFrame() {
        if (this.closed) {
            return;
        }
        setReady(false);
        final long j = this.frame + 1;
        this.frame = j;
        ViewOnAttachStateChangeListenerC8438Fe2 viewOnAttachStateChangeListenerC8438Fe2 = this.pendingDraw;
        if (viewOnAttachStateChangeListenerC8438Fe2 != null) {
            viewOnAttachStateChangeListenerC8438Fe2.A01();
        }
        this.pendingDraw = null;
        if (this.webView.isAttachedToWindow()) {
            final IBinder windowToken = this.webView.getWindowToken();
            final LocalBrowserWebView localBrowserWebView = this.webView;
            this.pendingDraw = ViewOnAttachStateChangeListenerC8438Fe2.A00(localBrowserWebView, new Runnable() { // from class: com.facebook.aura.localbrowser.LocalBrowserRendering$scheduleFrame$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    LocalBrowserRendering localBrowserRendering = this;
                    localBrowserRendering.pendingDraw = null;
                    if (localBrowserRendering.resetZoom) {
                        localBrowserRendering.resetZoom = false;
                        localBrowserRendering.webView.zoomBy(0.02f);
                    }
                    final F1F f1f = new F1F();
                    final LocalBrowserRendering localBrowserRendering2 = this;
                    LocalBrowserWebView localBrowserWebView2 = localBrowserRendering2.webView;
                    long j2 = j;
                    final IBinder iBinder = windowToken;
                    localBrowserWebView2.postVisualStateCallback(j2, new WebView.VisualStateCallback() { // from class: com.facebook.aura.localbrowser.LocalBrowserRendering$scheduleFrame$1$1
                        @Override // android.webkit.WebView.VisualStateCallback
                        public void onComplete(long j3) {
                            f1f.element = true;
                            LocalBrowserRendering localBrowserRendering3 = localBrowserRendering2;
                            if (!localBrowserRendering3.closed && j3 == localBrowserRendering3.frame && localBrowserRendering3.webView.isAttachedToWindow() && localBrowserRendering2.webView.getWindowToken() == iBinder) {
                                LocalBrowserRendering localBrowserRendering4 = localBrowserRendering2;
                                if (!localBrowserRendering4.isTakeover) {
                                    int width = localBrowserRendering4.webView.getWidth();
                                    LocalBrowserRendering localBrowserRendering5 = localBrowserRendering2;
                                    if (width != ((int) (localBrowserRendering5.viewport.size >> 32))) {
                                        return;
                                    }
                                    int height = localBrowserRendering5.webView.getHeight();
                                    localBrowserRendering4 = localBrowserRendering2;
                                    if (height != ((int) (localBrowserRendering4.viewport.size & 4294967295L))) {
                                        return;
                                    }
                                }
                                localBrowserRendering4.setReady(true);
                            }
                        }
                    });
                    this.redrawUntil(j, 100, new Function0<Boolean>() { // from class: com.facebook.aura.localbrowser.LocalBrowserRendering$scheduleFrame$1$2
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return Boolean.valueOf(f1f.element);
                        }
                    });
                }
            });
            this.webView.invalidate();
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.closed = true;
        this.frame++;
        ViewOnAttachStateChangeListenerC8438Fe2 viewOnAttachStateChangeListenerC8438Fe2 = this.pendingDraw;
        if (viewOnAttachStateChangeListenerC8438Fe2 != null) {
            viewOnAttachStateChangeListenerC8438Fe2.A01();
        }
        this.pendingDraw = null;
        this.webView.removeOnLayoutChangeListener(this.layoutListener);
        this.webView.removeOnAttachStateChangeListener(this.attachListener);
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static final void redrawUntil$lambda$0(LocalBrowserRendering localBrowserRendering, long j, Function0 function0, int i) {
        if (localBrowserRendering.closed || j != localBrowserRendering.frame || AnonymousClass003.A1Y(function0)) {
            return;
        }
        localBrowserRendering.webView.invalidate();
        localBrowserRendering.redrawUntil(j, i - 1, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setReady(boolean z) {
        if (AnonymousClass001.A1X(this.ready.getValue()) != z) {
            AnonymousClass004.A1D(z, this.ready);
            this.onChanged.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitAutomation(long r10, X.HtJ<? super java.lang.Boolean> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.facebook.aura.localbrowser.LocalBrowserRendering.AnonymousClass1
            if (r0 == 0) goto L4b
            r7 = r12
            com.facebook.aura.localbrowser.LocalBrowserRendering$awaitAutomation$1 r7 = (com.facebook.aura.localbrowser.LocalBrowserRendering.AnonymousClass1) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4b
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r1 = r7.result
            X.Hji r8 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r6 = 1
            if (r0 == 0) goto L29
            if (r0 != r6) goto L51
            X.Hwg.A00(r1)
        L20:
            boolean r0 = X.C3cG.A1P(r1, r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L29:
            X.Hwg.A00(r1)
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r10 - r0
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L3a
            r2 = 0
        L3a:
            r1 = 0
            com.facebook.aura.localbrowser.LocalBrowserRendering$awaitAutomation$2 r0 = new com.facebook.aura.localbrowser.LocalBrowserRendering$awaitAutomation$2
            r0.<init>(r1)
            r7.J$0 = r10
            r7.label = r6
            java.lang.Object r1 = X.GAX.A01(r7, r0, r2)
            if (r1 != r8) goto L20
            return r8
        L4b:
            com.facebook.aura.localbrowser.LocalBrowserRendering$awaitAutomation$1 r7 = new com.facebook.aura.localbrowser.LocalBrowserRendering$awaitAutomation$1
            r7.<init>(r12)
            goto L12
        L51:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserRendering.awaitAutomation(long, X.HtJ):java.lang.Object");
    }

    public final LocalBrowserAutomationViewport getViewport() {
        return this.viewport;
    }

    public final boolean isReady() {
        return AnonymousClass001.A1X(this.ready.getValue());
    }

    public final boolean isTakeover() {
        return this.isTakeover;
    }

    public final void requestTakeover(boolean z) {
        if (this.closed || this.isTakeover == z) {
            return;
        }
        this.isTakeover = z;
        this.resetZoom = !z;
        setReady(false);
        this.webView.m1233setAutomationViewportfhxjrPA(z ? null : new BL4(this.viewport.size));
        scheduleFrame();
    }

    public static final void layoutListener$lambda$0(LocalBrowserRendering localBrowserRendering, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (localBrowserRendering.isReady()) {
            if (localBrowserRendering.isTakeover) {
                return;
            }
            if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
                return;
            }
        }
        localBrowserRendering.scheduleFrame();
    }
}
