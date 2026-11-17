package com.facebook.aura.localbrowser;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7611F5y;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BLG;
import X.BV4;
import X.BV5;
import X.C1BN;
import X.C1HY;
import X.C3UX;
import X.C3cF;
import X.C3cG;
import X.C3cH;
import X.C5303Dfm;
import X.C7384Etj;
import X.C78T;
import X.C7BY;
import X.C7Bm;
import X.C9286GCn;
import X.Dg5;
import X.EnumC10460Hji;
import X.EnumC10573Huf;
import X.Ey9;
import X.F1F;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.GBL;
import X.HrH;
import X.HtJ;
import X.HwN;
import X.Hwg;
import X.HxE;
import X.HzP;
import X.InterfaceC10560Hsz;
import X.ViewOnAttachStateChangeListenerC8438Fe2;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebHistoryItem;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.activity.ComponentActivity;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.localbrowser.LocalBrowserHeadlessHost;
import com.facebook.aura.localbrowser.LocalBrowserTarget;
import com.facebook.aura.nodes.transport.HatchNodeServiceState;
import com.facebook.aura.partners.voice.infra.VideoConfigJsonKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.DispatchException;

/* loaded from: classes6.dex */
public final class LocalBrowserTarget {
    public static final int $stable = 8;
    public Function0<Boolean> acceptsAutofill;
    public Function0<Boolean> acceptsInput;
    public final LocalBrowserActivityBridge activityBridge;
    public LocalBrowserHeadlessHost automationHost;
    public final C1BN<HostLease> availableHost;
    public boolean browsingEnabled;
    public final boolean captureLayerSupported;
    public int captureLayerType;
    public int capturesInFlight;
    public final C1BN<HostLease> currentHost;
    public final LocalBrowserFileChooser fileChooser;
    public final Function0<Boolean> hasAccess;
    public Function0<Boolean> headlessEligible;
    public final View.OnLayoutChangeListener headlessLayoutListener;
    public final BLG<HostReadiness> hostReadiness;
    public final String id;
    public boolean isDestroyed;
    public Function0<Boolean> isFileStageActive;
    public String lastNavigatedUrl;
    public Bitmap lastNotificationPreview;
    public Bitmap lastUserThumbnail;
    public final BLG<HostLease> mutableAvailableHost;
    public final BLG<HostLease> mutableHost;
    public final BLG<Integer> mutablePreviewWatchers;
    public final LocalBrowserNativeRequests nativeRequests;
    public final LocalBrowserNativeUi nativeUi;
    public G0U<? super Boolean, Unit> onHostAvailability;
    public final Function0<Unit> onRendererGone;
    public final LocalBrowserPage page;
    public G0W<? super LocalBrowserPopupAction, ? super Boolean, ? super Boolean, Unit> popupEvents;
    public final C1BN<LocalBrowserPageState> popupPage;
    public final C1BN<Integer> previewWatchers;
    public long readinessChangedAt;
    public boolean reconcilePending;
    public boolean reconciling;
    public final LocalBrowserRendering rendering;
    public boolean retired;
    public boolean retirementSucceeded;
    public volatile G0U<? super String, ? extends WebResourceResponse> screenPopup;
    public final List<HostSlot> slots;
    public LocalBrowserTakeoverSink takeoverSink;
    public final LocalBrowserWebView webView;
    public final LocalBrowserWindows windows;

    public final class HostLease implements AutoCloseable, Dg5 {
        public static final int $stable = 0;
        public ComponentActivity activity;
        public final LocalBrowserTarget$HostLease$attachListener$1 attachListener;
        public boolean closed;
        public ViewGroup container;
        public final String id;
        public final LocalBrowserHostKind kind;
        public final HostSlot slot;
        public final /* synthetic */ LocalBrowserTarget this$0;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$OnAttachStateChangeListener, com.facebook.aura.localbrowser.LocalBrowserTarget$HostLease$attachListener$1] */
        public HostLease(final LocalBrowserTarget localBrowserTarget, ComponentActivity componentActivity, ViewGroup viewGroup, LocalBrowserHostKind localBrowserHostKind, HostSlot hostSlot) {
            AnonymousClass005.A11(componentActivity, viewGroup, localBrowserHostKind, 1);
            C7384Etj.A0Y(hostSlot, 4);
            this.this$0 = localBrowserTarget;
            this.kind = localBrowserHostKind;
            this.slot = hostSlot;
            this.id = AnonymousClass002.A0k();
            this.activity = componentActivity;
            this.container = viewGroup;
            ?? r1 = new View.OnAttachStateChangeListener() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$HostLease$attachListener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    this.this$0.updateAvailability$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser();
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    if (this.this$0.closed || localBrowserTarget.getHostLease() != this.this$0) {
                        return;
                    }
                    localBrowserTarget.mutableAvailableHost.Af8(null);
                    localBrowserTarget.setHostReadiness(LocalBrowserTarget.HostReadiness.UNAVAILABLE);
                }
            };
            this.attachListener = r1;
            localBrowserTarget.webView.addOnAttachStateChangeListener(r1);
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            close(false);
        }

        public final ComponentActivity getActivity() {
            return this.activity;
        }

        public final String getId() {
            return this.id;
        }

        public final LocalBrowserHostKind getKind() {
            return this.kind;
        }

        public final HostSlot getSlot$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser() {
            return this.slot;
        }

        @Override // X.Dg5
        public /* bridge */ void onCreate(C1HY c1hy) {
        }

        @Override // X.Dg5
        public /* bridge */ void onDestroy(C1HY c1hy) {
        }

        @Override // X.Dg5
        public void onPause(C1HY c1hy) {
            if (!this.closed && this.this$0.getHostLease() == this && this.kind == LocalBrowserHostKind.PRESENTATION) {
                this.this$0.mutableAvailableHost.Af8(null);
            }
        }

        @Override // X.Dg5
        public void onStart(C1HY c1hy) {
            if (this.closed || this.this$0.getHostLease() != this) {
                return;
            }
            LocalBrowserTarget localBrowserTarget = this.this$0;
            if (localBrowserTarget.retired) {
                return;
            }
            localBrowserTarget.webView.onResume();
            LocalBrowserTarget localBrowserTarget2 = this.this$0;
            localBrowserTarget2.windows.setResumed(AnonymousClass003.A1Y(localBrowserTarget2.hasAccess));
            updateAvailability$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser();
        }

        @Override // X.Dg5
        public /* bridge */ void onStop(C1HY c1hy) {
        }

        public final void updateAvailability$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser() {
            if (this.closed || this.this$0.getHostLease() != this) {
                return;
            }
            boolean zIsEligible$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser = this.slot.isEligible$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser();
            LocalBrowserTarget localBrowserTarget = this.this$0;
            if (!zIsEligible$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser) {
                localBrowserTarget.reconcileHost();
                return;
            }
            boolean zHasStartedHost = localBrowserTarget.hasStartedHost();
            LocalBrowserTarget localBrowserTarget2 = this.this$0;
            localBrowserTarget2.mutableAvailableHost.Af8((zHasStartedHost && localBrowserTarget2.rendering.isReady() && (this.kind != LocalBrowserHostKind.PRESENTATION || localBrowserTarget2.isUserHost(this))) ? this : null);
            if (this.this$0.getHeadless() == null) {
                this.this$0.setHostReadiness(zHasStartedHost ? HostReadiness.READY : HostReadiness.STARTING);
            }
        }

        @Override // X.Dg5
        public void onResume(C1HY c1hy) {
            updateAvailability$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser();
        }

        public final void close(boolean z) {
            C5303Dfm c5303Dfm;
            this.this$0.checkMainThread();
            if (!this.closed) {
                this.closed = true;
                this.this$0.webView.removeOnAttachStateChangeListener(this.attachListener);
                ViewGroup viewGroup = this.container;
                ComponentActivity componentActivity = this.activity;
                this.container = null;
                this.activity = null;
                HostSlot hostSlot = this.slot;
                if (hostSlot.lease == this) {
                    hostSlot.setLease$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(null);
                }
                if (componentActivity != null && (c5303Dfm = componentActivity.lifecycleRegistry) != null) {
                    c5303Dfm.A05(this);
                }
                if (this.this$0.getHostLease() == this) {
                    this.this$0.mutableAvailableHost.Af8(null);
                    this.this$0.setHostLease(null);
                    if (!z && this.this$0.getHeadless() == null) {
                        this.this$0.setHostReadiness(HostReadiness.UNAVAILABLE);
                    }
                    if (this.this$0.webView.getParent() == viewGroup) {
                        this.this$0.detachWebView();
                        if (!z) {
                            this.this$0.webView.onPause();
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class HostReadiness {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ HostReadiness[] $VALUES;
        public static final HostReadiness READY;
        public static final HostReadiness STARTING;
        public static final HostReadiness UNAVAILABLE;

        static {
            HostReadiness hostReadiness = new HostReadiness("STARTING", 0);
            STARTING = hostReadiness;
            HostReadiness hostReadiness2 = new HostReadiness("READY", 1);
            READY = hostReadiness2;
            HostReadiness hostReadiness3 = new HostReadiness("UNAVAILABLE", 2);
            UNAVAILABLE = hostReadiness3;
            HostReadiness[] hostReadinessArr = {hostReadiness, hostReadiness2, hostReadiness3};
            $VALUES = hostReadinessArr;
            $ENTRIES = C3cG.A0w(hostReadinessArr);
        }

        public static Ey9<HostReadiness> getEntries() {
            return $ENTRIES;
        }

        public static HostReadiness valueOf(String str) {
            return (HostReadiness) Enum.valueOf(HostReadiness.class, str);
        }

        public static HostReadiness[] values() {
            return (HostReadiness[]) $VALUES.clone();
        }

        public HostReadiness(String str, int i) {
        }
    }

    public final class HostSlot implements AutoCloseable, Dg5 {
        public final ComponentActivity activity;
        public final ViewGroup container;
        public final LocalBrowserHostKind kind;
        public final View.OnLayoutChangeListener layoutListener;
        public HostLease lease;
        public final G0U<HostLease, Unit> onLease;
        public ViewOnAttachStateChangeListenerC8438Fe2 pendingDraw;
        public final /* synthetic */ LocalBrowserTarget this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public HostSlot(final LocalBrowserTarget localBrowserTarget, ComponentActivity componentActivity, ViewGroup viewGroup, LocalBrowserHostKind localBrowserHostKind, G0U<? super HostLease, Unit> g0u) {
            AnonymousClass005.A11(componentActivity, viewGroup, localBrowserHostKind, 1);
            C7384Etj.A0Y(g0u, 4);
            this.this$0 = localBrowserTarget;
            this.activity = componentActivity;
            this.container = viewGroup;
            this.kind = localBrowserHostKind;
            this.onLease = g0u;
            this.layoutListener = new View.OnLayoutChangeListener() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$HostSlot$$ExternalSyntheticLambda0
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    localBrowserTarget.reconcileHost();
                }
            };
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            this.this$0.checkMainThread();
            if (this.this$0.slots.remove(this)) {
                this.container.removeOnLayoutChangeListener(this.layoutListener);
                ViewOnAttachStateChangeListenerC8438Fe2 viewOnAttachStateChangeListenerC8438Fe2 = this.pendingDraw;
                if (viewOnAttachStateChangeListenerC8438Fe2 != null) {
                    viewOnAttachStateChangeListenerC8438Fe2.A01();
                }
                this.pendingDraw = null;
                this.activity.lifecycleRegistry.A05(this);
                this.this$0.reconcileHost();
            }
        }

        public final ComponentActivity getActivity() {
            return this.activity;
        }

        public final ViewGroup getContainer() {
            return this.container;
        }

        public final LocalBrowserHostKind getKind() {
            return this.kind;
        }

        public final View.OnLayoutChangeListener getLayoutListener$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser() {
            return this.layoutListener;
        }

        public final HostLease getLease$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser() {
            return this.lease;
        }

        public final boolean isEligible$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser() {
            if (this.this$0.retired || this.activity.isFinishing() || this.activity.isDestroyed()) {
                return false;
            }
            if (this.this$0.fileChooser.holds(this.lease)) {
                return true;
            }
            return this.activity.lifecycleRegistry.A01.A00(EnumC10573Huf.A06) && this.container.isAttachedToWindow() && this.container.isShown() && this.container.getWindowVisibility() == 0 && this.container.getWidth() > 0 && this.container.getHeight() > 0;
        }

        @Override // X.Dg5
        public /* bridge */ void onCreate(C1HY c1hy) {
        }

        @Override // X.Dg5
        public /* bridge */ void onPause(C1HY c1hy) {
        }

        @Override // X.Dg5
        public /* bridge */ void onResume(C1HY c1hy) {
        }

        @Override // X.Dg5
        public void onStart(C1HY c1hy) {
            ViewOnAttachStateChangeListenerC8438Fe2 viewOnAttachStateChangeListenerC8438Fe2 = this.pendingDraw;
            if (viewOnAttachStateChangeListenerC8438Fe2 != null) {
                viewOnAttachStateChangeListenerC8438Fe2.A01();
            }
            final View viewA0b = AbstractC7607F5u.A0b(this.activity);
            final LocalBrowserTarget localBrowserTarget = this.this$0;
            this.pendingDraw = ViewOnAttachStateChangeListenerC8438Fe2.A00(viewA0b, new Runnable() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$HostSlot$onStart$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    this.pendingDraw = null;
                    localBrowserTarget.reconcileHost();
                }
            });
            this.this$0.reconcileHost();
        }

        @Override // X.Dg5
        public void onStop(C1HY c1hy) {
            ViewOnAttachStateChangeListenerC8438Fe2 viewOnAttachStateChangeListenerC8438Fe2 = this.pendingDraw;
            if (viewOnAttachStateChangeListenerC8438Fe2 != null) {
                viewOnAttachStateChangeListenerC8438Fe2.A01();
            }
            this.pendingDraw = null;
            this.this$0.reconcileHost();
        }

        public final void setLease$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(HostLease hostLease) {
            this.lease = hostLease;
            this.onLease.invoke(hostLease);
        }

        @Override // X.Dg5
        public void onDestroy(C1HY c1hy) {
            close();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTarget", f = "LocalBrowserTarget.kt", l = {264, 265}, m = "awaitAutomationViewport", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTarget$awaitAutomationViewport$1, reason: invalid class name */
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
            return LocalBrowserTarget.this.awaitAutomationViewport(0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTarget", f = "LocalBrowserTarget.kt", l = {VideoConfigJsonKt.SOURCE_WIDTH}, m = "awaitExecutableHost", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTarget$awaitExecutableHost$1, reason: invalid class name and case insensitive filesystem */
    public final class C124611 extends HzP {
        public long J$0;
        public int label;
        public /* synthetic */ Object result;

        public C124611(HtJ<? super C124611> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserTarget.this.awaitExecutableHost(0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTarget$awaitExecutableHost$2", f = "LocalBrowserTarget.kt", l = {451}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTarget$awaitExecutableHost$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTarget$awaitExecutableHost$2$1", f = "LocalBrowserTarget.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTarget$awaitExecutableHost$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<HostReadiness, HtJ<? super Boolean>, Object> {
            public /* synthetic */ Object L$0;
            public int label;

            public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // X.G0V
            public final Object invoke(HostReadiness hostReadiness, HtJ<? super Boolean> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                anonymousClass1.L$0 = hostReadiness;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object obj2 = this.L$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Boolean.valueOf(AnonymousClass006.A1Z(obj2, HostReadiness.STARTING));
            }
        }

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserTarget.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return LocalBrowserTarget.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BLG<HostReadiness> blg = LocalBrowserTarget.this.hostReadiness;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                obj = AbstractC9777Gfy.A00(this, anonymousClass1, blg);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Boolean.valueOf(obj == HostReadiness.READY);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTarget", f = "LocalBrowserTarget.kt", l = {627}, m = "captureFrame", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTarget$captureFrame$1, reason: invalid class name and case insensitive filesystem */
    public final class C124621 extends HzP {
        public float F$0;
        public float F$1;
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C124621(HtJ<? super C124621> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserTarget.this.captureFrame(0.0f, 0.0f, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTarget", f = "LocalBrowserTarget.kt", l = {608}, m = "captureNotificationPreview", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTarget$captureNotificationPreview$1, reason: invalid class name and case insensitive filesystem */
    public final class C124631 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C124631(HtJ<? super C124631> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserTarget.this.captureNotificationPreview(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTarget", f = "LocalBrowserTarget.kt", l = {600, 600}, m = "captureUserThumbnail", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTarget$captureUserThumbnail$1, reason: invalid class name and case insensitive filesystem */
    public final class C124641 extends HzP {
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C124641(HtJ<? super C124641> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserTarget.this.captureUserThumbnail(false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTarget", f = "LocalBrowserTarget.kt", l = {223}, m = "terminateIfUnresponsive", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTarget$terminateIfUnresponsive$1, reason: invalid class name and case insensitive filesystem */
    public final class C124651 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C124651(HtJ<? super C124651> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserTarget.this.terminateIfUnresponsive(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTarget$terminateIfUnresponsive$3", f = "LocalBrowserTarget.kt", l = {223}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTarget$terminateIfUnresponsive$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ InterfaceC10560Hsz<Unit> $response;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(InterfaceC10560Hsz<Unit> interfaceC10560Hsz, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$response = interfaceC10560Hsz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass3(this.$response, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new AnonymousClass3(this.$response, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                InterfaceC10560Hsz<Unit> interfaceC10560Hsz = this.$response;
                this.label = 1;
                if (C3cG.A0W(interfaceC10560Hsz, this) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTarget", f = "LocalBrowserTarget.kt", l = {281}, m = "watchPreview", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTarget$watchPreview$1, reason: invalid class name and case insensitive filesystem */
    public final class C124661 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C124661(HtJ<? super C124661> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserTarget.this.watchPreview(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTarget", f = "LocalBrowserTarget.kt", l = {474}, m = "withCaptureFrames", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTarget$withCaptureFrames$1, reason: invalid class name and case insensitive filesystem */
    public final class C124671<T> extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C124671(HtJ<? super C124671> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserTarget.this.withCaptureFrames(null, this);
        }
    }

    private final void attach(HostSlot hostSlot) {
        if (this.retired || !hostSlot.isEligible$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser()) {
            return;
        }
        this.fileChooser.cancel();
        if (hostSlot.container.getChildCount() != 0 && (hostSlot.container.getChildCount() != 1 || hostSlot.container.getChildAt(0) != this.webView)) {
            throw BV4.A0S();
        }
        if (getHeadless() == null) {
            setHostReadiness(HostReadiness.STARTING);
        }
        HostLease hostLease = getHostLease();
        if (hostLease != null) {
            hostLease.close(true);
        }
        try {
            HostLease hostLease2 = new HostLease(this, hostSlot.activity, hostSlot.container, hostSlot.kind, hostSlot);
            setHostLease(hostLease2);
            try {
                hostSlot.activity.lifecycleRegistry.A04(hostLease2);
                hostSlot.setLease$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(hostLease2);
            } catch (RuntimeException e) {
                hostLease2.close();
                throw e;
            }
        } catch (RuntimeException e2) {
            if (getHeadless() != null) {
                throw e2;
            }
            setHostReadiness(HostReadiness.UNAVAILABLE);
            throw e2;
        }
    }

    public static final Unit bindAutomationHost$lambda$0(LocalBrowserTarget localBrowserTarget, LocalBrowserHeadlessHost localBrowserHeadlessHost) {
        C7384Etj.A0Y(localBrowserHeadlessHost, 1);
        if (localBrowserHeadlessHost == localBrowserTarget.automationHost) {
            localBrowserTarget.refreshAccess();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ee  */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.facebook.aura.localbrowser.LocalBrowserTarget] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object captureFrame(float r12, float r13, X.HtJ<? super android.graphics.Bitmap> r14) throws kotlinx.coroutines.DispatchException {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserTarget.captureFrame(float, float, X.HtJ):java.lang.Object");
    }

    public static final boolean nativeRequests$lambda$0(LocalBrowserTarget localBrowserTarget, WebView webView, boolean z, boolean z2, Message message) {
        AnonymousClass002.A1C(webView, 1, message);
        return localBrowserTarget.windows.open(webView, z, z2, message);
    }

    public static final Unit nativeRequests$lambda$1(LocalBrowserTarget localBrowserTarget, WebView webView) {
        C7384Etj.A0Y(webView, 1);
        localBrowserTarget.windows.close(webView);
        return Unit.INSTANCE;
    }

    public static final Unit retire$lambda$5(LocalBrowserTarget localBrowserTarget) {
        localBrowserTarget.closeHeadless(false);
        return Unit.INSTANCE;
    }

    public static final WebResourceResponse windows$lambda$3(LocalBrowserTarget localBrowserTarget, String str) {
        C7384Etj.A0Y(str, 1);
        return localBrowserTarget.screenPopup.invoke(str);
    }

    public static final Unit windows$lambda$5(LocalBrowserTarget localBrowserTarget, LocalBrowserPopupAction localBrowserPopupAction, boolean z, boolean z2) {
        C7384Etj.A0Y(localBrowserPopupAction, 1);
        localBrowserTarget.popupEvents.invoke(localBrowserPopupAction, Boolean.valueOf(z), Boolean.valueOf(z2));
        return Unit.INSTANCE;
    }

    public final void bindBlockSignals(G0U<? super LocalBrowserBlockSignal, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        checkMainThread();
        this.page.blockSignal = g0u;
    }

    public final void bindBlocklistScreen(G0U<? super String, ? extends WebResourceResponse> g0u) {
        C7384Etj.A0Y(g0u, 0);
        checkMainThread();
        this.screenPopup = g0u;
    }

    public final void bindDialogs(LocalBrowserDialogs localBrowserDialogs) {
        C7384Etj.A0Y(localBrowserDialogs, 0);
        checkMainThread();
        if (!this.retired) {
            LocalBrowserNativeRequests localBrowserNativeRequests = this.nativeRequests;
            if (localBrowserNativeRequests.dialogs == null) {
                localBrowserNativeRequests.dialogs = localBrowserDialogs;
                return;
            }
        }
        throw BV4.A0S();
    }

    public final void bindFileStaging(Function0<Boolean> function0) {
        C7384Etj.A0Y(function0, 0);
        checkMainThread();
        this.isFileStageActive = function0;
    }

    public final void bindHeadless(Function0<Boolean> function0) {
        C7384Etj.A0Y(function0, 0);
        checkMainThread();
        this.headlessEligible = function0;
        reconcileHost();
    }

    public final void bindHostAvailability(G0U<? super Boolean, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        checkMainThread();
        this.onHostAvailability = g0u;
    }

    public final void bindPopupEvents(G0W<? super LocalBrowserPopupAction, ? super Boolean, ? super Boolean, Unit> g0w) {
        C7384Etj.A0Y(g0w, 0);
        checkMainThread();
        this.popupEvents = g0w;
    }

    public final void load(String str) {
        C7384Etj.A0Y(str, 0);
        checkMainThread();
        if (this.retired || !this.browsingEnabled) {
            return;
        }
        this.webView.loadUrl(str);
    }

    public final void loadIdentity(String str, String str2) {
        boolean zA1b = AnonymousClass004.A1b(str, str2);
        checkMainThread();
        if (this.retired) {
            throw BV4.A0S();
        }
        this.webView.getSettings().setBlockNetworkLoads(zA1b);
        this.webView.loadDataWithBaseURL(str, str2, "text/html", "utf-8", str);
    }

    public final boolean navigateFromUser(String str) {
        C7384Etj.A0Y(str, 0);
        checkMainThread();
        if (this.retired || !this.browsingEnabled || !AnonymousClass003.A1Y(this.acceptsInput)) {
            return false;
        }
        String strA0l = AnonymousClass002.A0l(str);
        LocalBrowserUrlPolicy localBrowserUrlPolicy = LocalBrowserUrlPolicy.INSTANCE;
        if (!C7BY.A0q(strA0l, "://", false) && !C3cF.A00(1).equals(strA0l)) {
            strA0l = FGI.A0M("https://", strA0l);
        }
        String strNavigationUrl = localBrowserUrlPolicy.navigationUrl(strA0l);
        if (strNavigationUrl == null || !this.windows.getVisiblePage().allowsNavigation(strNavigationUrl)) {
            return false;
        }
        this.windows.getVisibleWebView().loadUrl(strNavigationUrl);
        return true;
    }

    public LocalBrowserTarget(LocalBrowserWebView localBrowserWebView, LocalBrowserHeadlessHost localBrowserHeadlessHost, LocalBrowserAutomationViewport localBrowserAutomationViewport, Function0<Unit> function0, Function0<Boolean> function02) {
        C7384Etj.A0Y(localBrowserWebView, 0);
        AnonymousClass005.A11(localBrowserHeadlessHost, localBrowserAutomationViewport, function0, 1);
        C7384Etj.A0Y(function02, 4);
        this.webView = localBrowserWebView;
        this.automationHost = localBrowserHeadlessHost;
        this.onRendererGone = function0;
        this.hasAccess = function02;
        this.id = AnonymousClass002.A0k();
        HrH hrH = HwN.A01;
        C9286GCn c9286GCnA14 = C3cG.A14(hrH);
        this.mutableHost = c9286GCnA14;
        this.currentHost = C3cG.A11(c9286GCnA14);
        C9286GCn c9286GCnA142 = C3cG.A14(hrH);
        this.mutableAvailableHost = c9286GCnA142;
        this.availableHost = C3cG.A11(c9286GCnA142);
        this.hostReadiness = C3cG.A14(HostReadiness.UNAVAILABLE);
        this.readinessChangedAt = SystemClock.elapsedRealtime();
        this.headlessEligible = new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnonymousClass001.A0h();
            }
        };
        this.acceptsInput = new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnonymousClass001.A0h();
            }
        };
        this.acceptsAutofill = new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnonymousClass001.A0h();
            }
        };
        this.captureLayerSupported = BV5.A1P(Build.VERSION.SDK_INT, 31);
        this.headlessLayoutListener = new View.OnLayoutChangeListener() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda17
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.f$0.refreshHeadlessAvailability();
            }
        };
        this.slots = C3cG.A0h();
        LocalBrowserFileChooser localBrowserFileChooser = new LocalBrowserFileChooser(new LocalBrowserTarget$fileChooser$1(this));
        this.fileChooser = localBrowserFileChooser;
        LocalBrowserPage localBrowserPage = new LocalBrowserPage(localBrowserWebView, function0, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalBrowserTarget.page$lambda$0(this.f$0);
            }
        }, new LocalBrowserTarget$page$2(this));
        this.page = localBrowserPage;
        LocalBrowserNativeRequests localBrowserNativeRequests = new LocalBrowserNativeRequests(new G2j() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda19
            @Override // X.G2j
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return Boolean.valueOf(LocalBrowserTarget.nativeRequests$lambda$0(this.f$0, (WebView) obj, AnonymousClass001.A1X(obj2), AnonymousClass001.A1X(obj3), (Message) obj4));
            }
        }, new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda20
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return LocalBrowserTarget.nativeRequests$lambda$1(this.f$0, (WebView) obj);
            }
        }, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalBrowserTarget.nativeRequests$lambda$2(this.f$0);
            }
        }, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(AnonymousClass003.A1Y(this.f$0.isFileStageActive));
            }
        }, new LocalBrowserTarget$nativeRequests$5(this));
        this.nativeRequests = localBrowserNativeRequests;
        LocalBrowserWindows localBrowserWindows = new LocalBrowserWindows(localBrowserWebView, localBrowserPage, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.nativeRequests.dialogs;
            }
        }, new LocalBrowserTarget$windows$2(this), new LocalBrowserTarget$windows$3(localBrowserFileChooser), new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(LocalBrowserTarget.windows$lambda$1(this.f$0));
            }
        }, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(LocalBrowserTarget.windows$lambda$2(this.f$0));
            }
        }, function0, new LocalBrowserTarget$windows$6(this), new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda7
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return LocalBrowserTarget.windows$lambda$3(this.f$0, (String) obj);
            }
        }, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(this.f$0.browsingEnabled);
            }
        }, new G0W() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda9
            @Override // X.G0W
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return LocalBrowserTarget.windows$lambda$5(this.f$0, (LocalBrowserPopupAction) obj, AnonymousClass001.A1X(obj2), AnonymousClass001.A1X(obj3));
            }
        }, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.takeoverSink;
            }
        });
        this.windows = localBrowserWindows;
        this.popupPage = localBrowserWindows.page;
        this.rendering = new LocalBrowserRendering(localBrowserWebView, localBrowserAutomationViewport, new LocalBrowserTarget$rendering$1(this));
        this.nativeUi = new LocalBrowserNativeUi(localBrowserWebView);
        LocalBrowserActivityBridge localBrowserActivityBridge = new LocalBrowserActivityBridge(localBrowserWebView);
        localBrowserActivityBridge.sink = new LocalBrowserTakeoverActivitySink(new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.takeoverSink;
            }
        }, null);
        this.activityBridge = localBrowserActivityBridge;
        this.isFileStageActive = new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnonymousClass001.A0h();
            }
        };
        this.popupEvents = new G0W() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda13
            @Override // X.G0W
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return Unit.INSTANCE;
            }
        };
        this.screenPopup = new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda14
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return null;
            }
        };
        C9286GCn c9286GCnA143 = C3cG.A14(0);
        this.mutablePreviewWatchers = c9286GCnA143;
        this.previewWatchers = C3cG.A11(c9286GCnA143);
        localBrowserWebView.setWebViewClient(localBrowserPage.client);
        localBrowserWebView.setWebChromeClient(localBrowserNativeRequests);
        bindAutomationHost();
    }

    public static final boolean acceptsAutofill$lambda$0() {
        return false;
    }

    public static final boolean acceptsInput$lambda$0() {
        return false;
    }

    private final void bindAutomationHost() {
        this.automationHost.onAvailabilityChanged = new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda3
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return LocalBrowserTarget.bindAutomationHost$lambda$0(this.f$0, (LocalBrowserHeadlessHost) obj);
            }
        };
    }

    public static final boolean bindUserInput$lambda$0(LocalBrowserTarget localBrowserTarget, Function0 function0) {
        return localBrowserTarget.browsingEnabled && !localBrowserTarget.windows.getBlocksAutomation() && AnonymousClass003.A1Y(function0);
    }

    public static final boolean bindUserInput$lambda$1(LocalBrowserTarget localBrowserTarget, Function0 function0) {
        return !localBrowserTarget.windows.getBlocksAutomation() && AnonymousClass003.A1Y(function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void detachWebView() {
        ViewGroup viewGroup;
        this.nativeUi.userHost = false;
        this.webView.removeOnLayoutChangeListener(this.headlessLayoutListener);
        releaseUserInput();
        this.windows.detach();
        ViewParent parent = this.webView.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            viewGroup.removeView(this.webView);
        }
        AbstractC7611F5y.A0g(this.webView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocalBrowserHeadlessHost getHeadless() {
        LocalBrowserHeadlessHost localBrowserHeadlessHost = this.automationHost;
        if (this.webView.getParent() != localBrowserHeadlessHost.getContainer()) {
            return null;
        }
        return localBrowserHeadlessHost;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HostLease getHostLease() {
        return this.mutableHost.getValue();
    }

    public static final boolean headlessEligible$lambda$0() {
        return false;
    }

    public static final boolean isFileStageActive$lambda$0() {
        return false;
    }

    public static final Unit nativeRequests$lambda$2(LocalBrowserTarget localBrowserTarget) {
        localBrowserTarget.page.fail(LocalBrowserPageFailure.UNSUPPORTED_NATIVE_INTERACTION, null);
        return Unit.INSTANCE;
    }

    private final void navigateHistoryFromUser(int i) {
        String url;
        LocalBrowserWebView visibleWebView = this.windows.getVisibleWebView();
        WebBackForwardList webBackForwardListCopyBackForwardList = visibleWebView.copyBackForwardList();
        C7384Etj.A0U(webBackForwardListCopyBackForwardList);
        WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(webBackForwardListCopyBackForwardList.getCurrentIndex() + i);
        if (itemAtIndex == null || (url = itemAtIndex.getUrl()) == null || !this.windows.getVisiblePage().allowsNavigation(url)) {
            return;
        }
        visibleWebView.goBackOrForward(i);
    }

    public static final Unit page$lambda$0(LocalBrowserTarget localBrowserTarget) {
        localBrowserTarget.fileChooser.cancel();
        LocalBrowserDialogs localBrowserDialogs = localBrowserTarget.nativeRequests.dialogs;
        if (localBrowserDialogs != null) {
            localBrowserDialogs.cancelPending();
        }
        return Unit.INSTANCE;
    }

    public static final boolean printLoadedPage$lambda$0(LocalBrowserTarget localBrowserTarget, Function0 function0) {
        return !localBrowserTarget.retired && localBrowserTarget.isHostAvailable() && AnonymousClass003.A1Y(localBrowserTarget.hasAccess) && AnonymousClass003.A1Y(function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reconcileHost() {
        if (this.reconciling) {
            this.reconcilePending = true;
            return;
        }
        this.reconciling = true;
        do {
            try {
                this.reconcilePending = false;
                reconcileOnce();
            } finally {
                this.reconciling = false;
            }
        } while (this.reconcilePending);
    }

    private final void recordDisplayFailure(String str, RuntimeException runtimeException) {
        LocalBrowserTelemetry localBrowserTelemetry = LocalBrowserTelemetry.INSTANCE;
        HxE hxEA0r = C3cG.A0r(C3cF.A00(4), str);
        localBrowserTelemetry.event("local_browser_host", "error", AnonymousClass007.A0d(C3cF.A00(38), localBrowserTelemetry.exceptionClass(runtimeException), hxEA0r), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordNavigation() {
        LocalBrowserPageState value = this.page.state.getValue();
        if (value.phase == LocalBrowserPagePhase.READY && LocalBrowserTakeoverJournalKt.isTakeoverJournalUrl(value.url) && !C7384Etj.areEqual(value.url, this.lastNavigatedUrl)) {
            String str = value.url;
            this.lastNavigatedUrl = str;
            LocalBrowserTakeoverSink localBrowserTakeoverSink = this.takeoverSink;
            if (localBrowserTakeoverSink != null) {
                localBrowserTakeoverSink.record(null, LocalBrowserTakeoverJournalJsonKt.takeoverActivityNavigated(str));
            }
        }
    }

    private final boolean recoverStoppedDisplay() {
        if (!this.automationHost.displayStopped || this.retired || !AnonymousClass003.A1Y(this.hasAccess) || this.rendering.isTakeover || !AnonymousClass003.A1Y(this.headlessEligible)) {
            return true;
        }
        try {
            LocalBrowserHeadlessHost.Companion companion = LocalBrowserHeadlessHost.Companion;
            Context contextA0I = AnonymousClass001.A0I(this.automationHost.getWindowContext());
            LocalBrowserAutomationViewport localBrowserAutomationViewport = this.rendering.viewport;
            LocalBrowserHeadlessHost localBrowserHeadlessHostM1220open95KtPRI = companion.m1220open95KtPRI(contextA0I, localBrowserAutomationViewport.size, localBrowserAutomationViewport.densityDpi, new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda0
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    return Unit.INSTANCE;
                }
            });
            try {
                closeHeadless(true);
                LocalBrowserHeadlessHost localBrowserHeadlessHost = this.automationHost;
                this.automationHost = localBrowserHeadlessHostM1220open95KtPRI;
                bindAutomationHost();
                try {
                    localBrowserHeadlessHost.close();
                } catch (RuntimeException e) {
                    recordDisplayFailure("display_release", e);
                }
                LocalBrowserTelemetry.INSTANCE.event("local_browser_host", "transition", AnonymousClass006.A10("result", "display_recreated"), null);
                return true;
            } catch (RuntimeException e2) {
                recordDisplayFailure("display_detach", e2);
                try {
                    localBrowserHeadlessHostM1220open95KtPRI.close();
                    return false;
                } catch (RuntimeException e3) {
                    recordDisplayFailure("display_release", e3);
                    return false;
                }
            }
        } catch (RuntimeException e4) {
            recordDisplayFailure("display_recreate", e4);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshRenderingAvailability() {
        if (this.rendering.isReady()) {
            refreshAccess();
        } else {
            this.mutableAvailableHost.Af8(null);
            setHostReadiness(HostReadiness.STARTING);
        }
    }

    public static final boolean retire$lambda$0() {
        return false;
    }

    public static final Unit retire$lambda$10(LocalBrowserTarget localBrowserTarget) {
        localBrowserTarget.webView.setWebChromeClient(null);
        return Unit.INSTANCE;
    }

    public static final Unit retire$lambda$11(LocalBrowserTarget localBrowserTarget) {
        localBrowserTarget.webView.setWebViewClient(new WebViewClient());
        return Unit.INSTANCE;
    }

    public static final Unit retire$lambda$12(LocalBrowserTarget localBrowserTarget) {
        ViewGroup viewGroup;
        ViewParent parent = localBrowserTarget.webView.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            viewGroup.removeView(localBrowserTarget.webView);
        }
        return Unit.INSTANCE;
    }

    public static final Unit retire$lambda$13(LocalBrowserTarget localBrowserTarget) {
        AbstractC7611F5y.A0g(localBrowserTarget.webView);
        return Unit.INSTANCE;
    }

    public static final Unit retire$lambda$14(LocalBrowserTarget localBrowserTarget) {
        localBrowserTarget.webView.removeAllViews();
        return Unit.INSTANCE;
    }

    public static final Unit retire$lambda$15(LocalBrowserTarget localBrowserTarget) {
        localBrowserTarget.webView.destroy();
        localBrowserTarget.isDestroyed = true;
        return Unit.INSTANCE;
    }

    public static final Unit retire$lambda$2(LocalBrowserTarget localBrowserTarget) {
        localBrowserTarget.nativeUi.close();
        return Unit.INSTANCE;
    }

    public static final Unit retire$lambda$3(LocalBrowserTarget localBrowserTarget) {
        localBrowserTarget.activityBridge.close();
        return Unit.INSTANCE;
    }

    public static final Unit retire$lambda$4(LocalBrowserTarget localBrowserTarget) {
        localBrowserTarget.rendering.close();
        return Unit.INSTANCE;
    }

    public static final Unit retire$lambda$6(LocalBrowserTarget localBrowserTarget) {
        localBrowserTarget.automationHost.close();
        return Unit.INSTANCE;
    }

    public static final Unit retire$lambda$7(LocalBrowserTarget localBrowserTarget, F1F f1f) {
        if (!localBrowserTarget.windows.retire()) {
            f1f.element = false;
        }
        return Unit.INSTANCE;
    }

    public static final Unit retire$lambda$8(LocalBrowserTarget localBrowserTarget) {
        localBrowserTarget.nativeRequests.close();
        return Unit.INSTANCE;
    }

    public static final Unit retire$lambda$9(LocalBrowserTarget localBrowserTarget) {
        localBrowserTarget.webView.stopLoading();
        return Unit.INSTANCE;
    }

    public static final WebResourceResponse screenPopup$lambda$0(String str) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setHostLease(HostLease hostLease) {
        this.mutableHost.Af8(hostLease);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setHostReadiness(HostReadiness hostReadiness) {
        if (this.retired || !AnonymousClass003.A1Y(this.hasAccess) || this.windows.getBlocksAutomation()) {
            hostReadiness = HostReadiness.UNAVAILABLE;
        } else if (hostReadiness == HostReadiness.READY && !this.rendering.isReady()) {
            hostReadiness = HostReadiness.STARTING;
        }
        G0U<? super Boolean, Unit> g0u = this.onHostAvailability;
        if (g0u != null) {
            AnonymousClass001.A1K(AnonymousClass002.A1Z(hostReadiness, HostReadiness.READY), g0u);
        }
        if (this.retired) {
            hostReadiness = HostReadiness.UNAVAILABLE;
        }
        if (this.hostReadiness.getValue() != hostReadiness) {
            this.readinessChangedAt = SystemClock.elapsedRealtime();
        }
        this.hostReadiness.Af8(hostReadiness);
    }

    private final HostSlot successor() {
        LocalBrowserHostKind localBrowserHostKind;
        List<HostSlot> list = this.slots;
        ArrayList arrayListA0h = C3cG.A0h();
        for (HostSlot hostSlot : list) {
            if (hostSlot.isEligible$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser()) {
                arrayListA0h.add(hostSlot);
            }
        }
        Iterator it = arrayListA0h.iterator();
        if (it.hasNext()) {
            LocalBrowserHostKind localBrowserHostKind2 = ((HostSlot) it.next()).kind;
            loop1: while (true) {
                localBrowserHostKind = localBrowserHostKind2;
                while (it.hasNext()) {
                    localBrowserHostKind2 = ((HostSlot) it.next()).kind;
                    if (localBrowserHostKind.compareTo(localBrowserHostKind2) < 0) {
                        break;
                    }
                }
            }
            if (localBrowserHostKind != null) {
                ListIterator listIterator = arrayListA0h.listIterator(arrayListA0h.size());
                while (listIterator.hasPrevious()) {
                    HostSlot hostSlot2 = (HostSlot) listIterator.previous();
                    if (hostSlot2.kind == localBrowserHostKind) {
                        return hostSlot2;
                    }
                }
                throw new NoSuchElementException("List contains no element matching the predicate.");
            }
        }
        return null;
    }

    public static final boolean windows$lambda$1(LocalBrowserTarget localBrowserTarget) {
        return !localBrowserTarget.retired && localBrowserTarget.browsingEnabled && AnonymousClass003.A1Y(localBrowserTarget.acceptsInput);
    }

    public static final boolean windows$lambda$2(LocalBrowserTarget localBrowserTarget) {
        return !localBrowserTarget.retired && AnonymousClass003.A1Y(localBrowserTarget.acceptsAutofill);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitAutomationViewport(long r8, X.HtJ<? super java.lang.Boolean> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.localbrowser.LocalBrowserTarget.AnonymousClass1
            if (r0 == 0) goto L5f
            r6 = r10
            com.facebook.aura.localbrowser.LocalBrowserTarget$awaitAutomationViewport$1 r6 = (com.facebook.aura.localbrowser.LocalBrowserTarget.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r5 = r6.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r3 = r6.label
            r2 = 0
            r1 = 2
            r0 = 1
            if (r3 == 0) goto L36
            if (r3 == r0) goto L47
            if (r3 != r1) goto L65
            X.Hwg.A00(r5)
        L24:
            boolean r0 = X.AnonymousClass001.A1X(r5)
            if (r0 == 0) goto L31
            boolean r0 = r7.isHostAvailable()
            if (r0 == 0) goto L31
            r2 = 1
        L31:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L36:
            X.Hwg.A00(r5)
            r7.prepareAutomationViewport()
            r6.J$0 = r8
            r6.label = r0
            java.lang.Object r5 = r7.awaitExecutableHost(r8, r6)
            if (r5 != r4) goto L4c
            return r4
        L47:
            long r8 = r6.J$0
            X.Hwg.A00(r5)
        L4c:
            boolean r0 = X.AnonymousClass001.A1X(r5)
            if (r0 == 0) goto L31
            com.facebook.aura.localbrowser.LocalBrowserRendering r0 = r7.rendering
            r6.J$0 = r8
            r6.label = r1
            java.lang.Object r5 = r0.awaitAutomation(r8, r6)
            if (r5 != r4) goto L24
            return r4
        L5f:
            com.facebook.aura.localbrowser.LocalBrowserTarget$awaitAutomationViewport$1 r6 = new com.facebook.aura.localbrowser.LocalBrowserTarget$awaitAutomationViewport$1
            r6.<init>(r10)
            goto L12
        L65:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserTarget.awaitAutomationViewport(long, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitExecutableHost(long r10, X.HtJ<? super java.lang.Boolean> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.facebook.aura.localbrowser.LocalBrowserTarget.C124611
            if (r0 == 0) goto L85
            r7 = r12
            com.facebook.aura.localbrowser.LocalBrowserTarget$awaitExecutableHost$1 r7 = (com.facebook.aura.localbrowser.LocalBrowserTarget.C124611) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L85
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r1 = r7.result
            X.Hji r8 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r6 = 1
            if (r0 == 0) goto L29
            if (r0 != r6) goto L8b
            X.Hwg.A00(r1)
        L20:
            boolean r0 = X.C3cG.A1P(r1, r6)
        L24:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            return r8
        L29:
            X.Hwg.A00(r1)
            r9.checkMainThread()
            long r1 = android.os.SystemClock.elapsedRealtime()
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 >= 0) goto L3f
            boolean r0 = r9.recoverStoppedDisplay()
            if (r0 != 0) goto L3f
            r0 = 0
            goto L24
        L3f:
            r9.reconcileHost()
            long r1 = android.os.SystemClock.elapsedRealtime()
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 >= 0) goto L53
            com.facebook.aura.localbrowser.LocalBrowserHeadlessHost r0 = r9.getHeadless()
            if (r0 == 0) goto L53
            r0.ensureLease()
        L53:
            com.facebook.aura.localbrowser.LocalBrowserHeadlessHost r0 = r9.getHeadless()
            if (r0 == 0) goto L7b
            r9.refreshHeadlessAvailability()
        L5c:
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r10 - r0
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L6a
            r2 = 0
        L6a:
            r1 = 0
            com.facebook.aura.localbrowser.LocalBrowserTarget$awaitExecutableHost$2 r0 = new com.facebook.aura.localbrowser.LocalBrowserTarget$awaitExecutableHost$2
            r0.<init>(r1)
            r7.J$0 = r10
            r7.label = r6
            java.lang.Object r1 = X.GAX.A01(r7, r0, r2)
            if (r1 != r8) goto L20
            return r8
        L7b:
            com.facebook.aura.localbrowser.LocalBrowserTarget$HostLease r0 = r9.getHostLease()
            if (r0 == 0) goto L5c
            r0.updateAvailability$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser()
            goto L5c
        L85:
            com.facebook.aura.localbrowser.LocalBrowserTarget$awaitExecutableHost$1 r7 = new com.facebook.aura.localbrowser.LocalBrowserTarget$awaitExecutableHost$1
            r7.<init>(r12)
            goto L12
        L8b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserTarget.awaitExecutableHost(long, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object captureNotificationPreview(X.HtJ<? super android.graphics.Bitmap> r6) throws kotlinx.coroutines.DispatchException {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.localbrowser.LocalBrowserTarget.C124631
            if (r0 == 0) goto L35
            r4 = r6
            com.facebook.aura.localbrowser.LocalBrowserTarget$captureNotificationPreview$1 r4 = (com.facebook.aura.localbrowser.LocalBrowserTarget.C124631) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L35
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L27
            if (r1 != r0) goto L3d
            X.Hwg.A00(r3)
        L20:
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            if (r3 == 0) goto L3b
            r5.lastNotificationPreview = r3
            return r3
        L27:
            X.Hwg.A00(r3)
            r4.label = r0
            r0 = 1139802112(0x43f00000, float:480.0)
            java.lang.Object r3 = r5.captureFrame(r0, r0, r4)
            if (r3 != r2) goto L20
            return r2
        L35:
            com.facebook.aura.localbrowser.LocalBrowserTarget$captureNotificationPreview$1 r4 = new com.facebook.aura.localbrowser.LocalBrowserTarget$captureNotificationPreview$1
            r4.<init>(r6)
            goto L12
        L3b:
            r3 = 0
            return r3
        L3d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserTarget.captureNotificationPreview(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object captureUserThumbnail(boolean r7, X.HtJ<? super android.graphics.Bitmap> r8) throws kotlinx.coroutines.DispatchException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.localbrowser.LocalBrowserTarget.C124641
            if (r0 == 0) goto L25
            r5 = r8
            com.facebook.aura.localbrowser.LocalBrowserTarget$captureUserThumbnail$1 r5 = (com.facebook.aura.localbrowser.LocalBrowserTarget.C124641) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r2 = r5.label
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L2b
            if (r2 == r0) goto L49
            if (r2 == r1) goto L49
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L25:
            com.facebook.aura.localbrowser.LocalBrowserTarget$captureUserThumbnail$1 r5 = new com.facebook.aura.localbrowser.LocalBrowserTarget$captureUserThumbnail$1
            r5.<init>(r8)
            goto L12
        L2b:
            X.Hwg.A00(r4)
            r5.Z$0 = r7
            if (r7 == 0) goto L40
            r5.label = r0
            r1 = 1149698048(0x44870000, float:1080.0)
            r0 = 1158823936(0x45124000, float:2340.0)
            java.lang.Object r4 = r6.captureFrame(r1, r0, r5)
        L3d:
            if (r4 != r3) goto L4c
            return r3
        L40:
            r5.label = r1
            r0 = 1144258560(0x44340000, float:720.0)
            java.lang.Object r4 = r6.captureFrame(r0, r0, r5)
            goto L3d
        L49:
            X.Hwg.A00(r4)
        L4c:
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            if (r4 == 0) goto L53
            r6.lastUserThumbnail = r4
            return r4
        L53:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserTarget.captureUserThumbnail(boolean, X.HtJ):java.lang.Object");
    }

    public final C1BN<HostLease> getAvailableHost() {
        return this.availableHost;
    }

    public final C1BN<HostLease> getCurrentHost() {
        return this.currentHost;
    }

    public final LocalBrowserFileChooser getFileChooser() {
        return this.fileChooser;
    }

    public final String getId() {
        return this.id;
    }

    public final Bitmap getLastNotificationPreview() {
        return this.lastNotificationPreview;
    }

    public final Bitmap getLastUserThumbnail() {
        return this.lastUserThumbnail;
    }

    public final LocalBrowserNativeUi getNativeUi() {
        return this.nativeUi;
    }

    public final LocalBrowserPage getPage() {
        return this.page;
    }

    public final C1BN<LocalBrowserPageState> getPopupPage() {
        return this.popupPage;
    }

    public final C1BN<Integer> getPreviewWatchers() {
        return this.previewWatchers;
    }

    public final LocalBrowserRendering getRendering() {
        return this.rendering;
    }

    public final boolean isDestroyed() {
        return this.isDestroyed;
    }

    public final boolean isHostAvailable() {
        return AnonymousClass002.A1Z(this.hostReadiness.getValue(), HostReadiness.READY);
    }

    public final boolean isHostBlocked() {
        return this.retired || !AnonymousClass003.A1Y(this.hasAccess) || this.windows.getBlocksAutomation() || this.automationHost.displayStopped;
    }

    public final boolean isTakeoverRecordingSupported() {
        return this.activityBridge.isInstalled;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object terminateIfUnresponsive(kotlin.jvm.functions.Function0<java.lang.Boolean> r12, X.HtJ<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserTarget.terminateIfUnresponsive(kotlin.jvm.functions.Function0, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object watchPreview(X.G0U<? super X.HtJ<? super kotlin.Unit>, ? extends java.lang.Object> r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.localbrowser.LocalBrowserTarget.C124661
            if (r0 == 0) goto L1e
            r5 = r8
            com.facebook.aura.localbrowser.LocalBrowserTarget$watchPreview$1 r5 = (com.facebook.aura.localbrowser.LocalBrowserTarget.C124661) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L2d
            if (r0 != r3) goto L28
            goto L24
        L1e:
            com.facebook.aura.localbrowser.LocalBrowserTarget$watchPreview$1 r5 = new com.facebook.aura.localbrowser.LocalBrowserTarget$watchPreview$1
            r5.<init>(r8)
            goto L12
        L24:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L6a
            goto L54
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r1)
            r6.checkMainThread()
            X.BLG<java.lang.Integer> r2 = r6.mutablePreviewWatchers
            java.lang.Object r0 = r2.getValue()
            int r0 = X.AnonymousClass001.A0F(r0)
            int r0 = r0 + 1
            java.lang.Integer r1 = X.C3cG.A0R(r0)
            X.GCn r2 = (X.C9286GCn) r2
            r0 = 0
            X.C9286GCn.A00(r0, r1, r2)
            r5.L$0 = r0     // Catch: java.lang.Throwable -> L6a
            r5.label = r3     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r0 = r7.invoke(r5)     // Catch: java.lang.Throwable -> L6a
            if (r0 != r4) goto L54
            return r4
        L54:
            X.BLG<java.lang.Integer> r1 = r6.mutablePreviewWatchers
            java.lang.Object r0 = r1.getValue()
            int r0 = X.AnonymousClass001.A0F(r0)
            int r0 = r0 + (-1)
            java.lang.Integer r0 = X.C3cG.A0R(r0)
            X.AnonymousClass002.A1I(r1, r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L6a:
            r2 = move-exception
            X.BLG<java.lang.Integer> r1 = r6.mutablePreviewWatchers
            java.lang.Object r0 = r1.getValue()
            int r0 = X.AnonymousClass001.A0F(r0)
            int r0 = r0 + (-1)
            java.lang.Integer r0 = X.C3cG.A0R(r0)
            X.AnonymousClass002.A1I(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserTarget.watchPreview(X.G0U, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object withCaptureFrames(X.G0U<? super X.HtJ<? super T>, ? extends java.lang.Object> r10, X.HtJ<? super T> r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.facebook.aura.localbrowser.LocalBrowserTarget.C124671
            if (r0 == 0) goto L27
            r7 = r11
            com.facebook.aura.localbrowser.LocalBrowserTarget$withCaptureFrames$1 r7 = (com.facebook.aura.localbrowser.LocalBrowserTarget.C124671) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r2 = r7.result
            X.Hji r8 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r3 = 0
            r6 = 1
            if (r0 == 0) goto L36
            if (r0 != r6) goto L31
            java.lang.Object r5 = r7.L$2
            com.facebook.aura.localbrowser.LocalBrowserTarget$withCaptureFrames$callback$1 r5 = (com.facebook.aura.localbrowser.LocalBrowserTarget$withCaptureFrames$callback$1) r5
            java.lang.Object r4 = r7.L$1
            android.view.Choreographer r4 = (android.view.Choreographer) r4
            goto L2d
        L27:
            com.facebook.aura.localbrowser.LocalBrowserTarget$withCaptureFrames$1 r7 = new com.facebook.aura.localbrowser.LocalBrowserTarget$withCaptureFrames$1
            r7.<init>(r11)
            goto L12
        L2d:
            X.Hwg.A00(r2)     // Catch: java.lang.Throwable -> L8e
            goto L75
        L31:
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A0n()
            throw r2
        L36:
            X.Hwg.A00(r2)
            r9.checkMainThread()
            android.view.Choreographer r4 = android.view.Choreographer.getInstance()
            com.facebook.aura.localbrowser.LocalBrowserTarget$withCaptureFrames$callback$1 r5 = new com.facebook.aura.localbrowser.LocalBrowserTarget$withCaptureFrames$callback$1
            r5.<init>()
            int r0 = r9.capturesInFlight
            if (r0 != 0) goto L51
            com.facebook.aura.localbrowser.LocalBrowserWebView r0 = r9.webView
            int r0 = r0.getLayerType()
            r9.captureLayerType = r0
        L51:
            int r0 = r9.capturesInFlight     // Catch: java.lang.Throwable -> L8c
            int r0 = r0 + 1
            r9.capturesInFlight = r0     // Catch: java.lang.Throwable -> L8c
            if (r0 != r6) goto L63
            boolean r0 = r9.captureLayerSupported     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L63
            com.facebook.aura.localbrowser.LocalBrowserWebView r1 = r9.webView     // Catch: java.lang.Throwable -> L8c
            r0 = 2
            r1.setLayerType(r0, r3)     // Catch: java.lang.Throwable -> L8c
        L63:
            r4.postFrameCallback(r5)     // Catch: java.lang.Throwable -> L8c
            r7.L$0 = r3     // Catch: java.lang.Throwable -> L8c
            r7.L$1 = r4     // Catch: java.lang.Throwable -> L8c
            r7.L$2 = r5     // Catch: java.lang.Throwable -> L8c
            r7.label = r6     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r2 = r10.invoke(r7)     // Catch: java.lang.Throwable -> L8c
            if (r2 != r8) goto L75
            return r8
        L75:
            r4.removeFrameCallback(r5)
            int r0 = r9.capturesInFlight
            int r0 = r0 + (-1)
            r9.capturesInFlight = r0
            if (r0 != 0) goto L8b
            boolean r0 = r9.retired
            if (r0 != 0) goto L8b
            com.facebook.aura.localbrowser.LocalBrowserWebView r1 = r9.webView
            int r0 = r9.captureLayerType
            r1.setLayerType(r0, r3)
        L8b:
            return r2
        L8c:
            r2 = move-exception
            goto L8f
        L8e:
            r2 = move-exception
        L8f:
            r4.removeFrameCallback(r5)
            int r0 = r9.capturesInFlight
            int r0 = r0 + (-1)
            r9.capturesInFlight = r0
            if (r0 != 0) goto La5
            boolean r0 = r9.retired
            if (r0 != 0) goto La5
            com.facebook.aura.localbrowser.LocalBrowserWebView r1 = r9.webView
            int r0 = r9.captureLayerType
            r1.setLayerType(r0, r3)
        La5:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserTarget.withCaptureFrames(X.G0U, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object captureBitmap(LocalBrowserWebView localBrowserWebView, Window window, float f, float f2, HtJ<? super Bitmap> htJ) throws DispatchException {
        if (localBrowserWebView.getWidth() <= 0 || localBrowserWebView.getHeight() <= 0) {
            return null;
        }
        float fMin = Math.min(1.0f, Math.min(AbstractC7608F5v.A00(localBrowserWebView, f), AbstractC7608F5v.A01(localBrowserWebView, f2)));
        int iA02 = (int) (AbstractC7607F5u.A02(localBrowserWebView) * fMin);
        if (iA02 < 1) {
            iA02 = 1;
        }
        int iA03 = (int) (AbstractC7607F5u.A03(localBrowserWebView) * fMin);
        if (iA03 < 1) {
            iA03 = 1;
        }
        int[] iArr = new int[2];
        localBrowserWebView.getLocationInWindow(iArr);
        int i = iArr[0];
        Rect rect = new Rect(i, iArr[1], localBrowserWebView.getWidth() + i, iArr[1] + localBrowserWebView.getHeight());
        final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iA02, iA03, Bitmap.Config.ARGB_8888);
        C7384Etj.A0U(bitmapCreateBitmap);
        final GBL gblA04 = C7Bm.A04(htJ);
        try {
            PixelCopy.request(window, rect, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$captureBitmap$2$1
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i2) {
                    if (i2 == 0) {
                        gblA04.Abe(bitmapCreateBitmap, new G0W<Throwable, Bitmap, C78T, Unit>() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$captureBitmap$2$1.1
                            @Override // X.G0W
                            public /* bridge */ /* synthetic */ Unit invoke(Throwable th, Bitmap bitmap, C78T c78t) {
                                Bitmap bitmap2 = bitmap;
                                C7384Etj.A0Y(bitmap2, 1);
                                bitmap2.recycle();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Throwable th, Bitmap bitmap, C78T c78t) {
                                C7384Etj.A0Y(bitmap, 1);
                                bitmap.recycle();
                            }
                        });
                    } else {
                        bitmapCreateBitmap.recycle();
                        gblA04.Abe(null, new G0W() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$captureBitmap$2$1.2
                            @Override // X.G0W
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Throwable th, Void r2, C78T c78t) {
                            }
                        });
                    }
                }
            }, AuraExecutors.INSTANCE.getUiThreadHandler());
        } catch (RuntimeException unused) {
            bitmapCreateBitmap.recycle();
            gblA04.Abe(null, new G0W() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$captureBitmap$2$3
                @Override // X.G0W
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return Unit.INSTANCE;
                }

                public final void invoke(Throwable th, Void r2, C78T c78t) {
                }
            });
        }
        return gblA04.A0F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkMainThread() {
        if (!C3cH.A1K()) {
            throw BV4.A0S();
        }
    }

    private final void closeHeadless(boolean z) {
        if (getHeadless() != null) {
            detachWebView();
            if (z) {
                return;
            }
            setHostReadiness(HostReadiness.UNAVAILABLE);
            this.webView.onPause();
        }
    }

    private final boolean isHeadlessReady() {
        LocalBrowserHeadlessHost headless = getHeadless();
        return headless != null && headless.isReady && !this.retired && AnonymousClass003.A1Y(this.hasAccess) && this.webView.isAttachedToWindow() && this.webView.getWidth() > 0 && this.webView.getHeight() > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d7, code lost:
    
        if (r6 != null) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void reconcileOnce() {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserTarget.reconcileOnce():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshHeadlessAvailability() {
        LocalBrowserHeadlessHost headless = getHeadless();
        if (headless != null) {
            if (this.retired || !AnonymousClass003.A1Y(this.hasAccess)) {
                closeHeadless(false);
                return;
            }
            setHostReadiness(isHeadlessReady() ? HostReadiness.READY : (headless.isStarting || headless.isReady) ? HostReadiness.STARTING : HostReadiness.UNAVAILABLE);
            HostLease hostLease = getHostLease();
            if (hostLease != null) {
                hostLease.updateAvailability$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser();
            }
        }
    }

    public static final void retire$release(F1F f1f, Function0<Unit> function0) {
        try {
            function0.invoke();
        } catch (RuntimeException unused) {
            f1f.element = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean showFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        HostLease hostLease = getHostLease();
        if (!this.retired && hostLease != null && AnonymousClass003.A1Y(this.acceptsInput) && webView == this.windows.getVisibleWebView()) {
            this.fileChooser.open(hostLease, fileChooserParams, valueCallback);
            return true;
        }
        valueCallback.onReceiveValue(null);
        if (this.retired) {
            return true;
        }
        this.nativeUi.requireFileSelection();
        return true;
    }

    public final void bindTakeoverSink(LocalBrowserTakeoverSink localBrowserTakeoverSink) {
        checkMainThread();
        this.takeoverSink = localBrowserTakeoverSink;
    }

    public final void bindUserInput(final Function0<Boolean> function0, final Function0<Boolean> function02) {
        AnonymousClass003.A0u(function0, function02);
        checkMainThread();
        this.acceptsInput = function0;
        this.acceptsAutofill = function02;
        LocalBrowserWebView localBrowserWebView = this.webView;
        localBrowserWebView.acceptsUserInput = new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(LocalBrowserTarget.bindUserInput$lambda$0(this.f$0, function0));
            }
        };
        localBrowserWebView.acceptsAutofill = new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(LocalBrowserTarget.bindUserInput$lambda$1(this.f$0, function02));
            }
        };
    }

    public final void broadcastTakeover(boolean z) {
        checkMainThread();
        if (this.retired) {
            return;
        }
        this.activityBridge.broadcast(z);
        this.windows.broadcastTakeover(z);
    }

    public final void clearHistory() {
        checkMainThread();
        if (this.retired) {
            return;
        }
        this.webView.clearHistory();
    }

    public final void closeUserWindows() {
        checkMainThread();
        this.fileChooser.cancel();
        this.windows.closeUserWindows();
    }

    public final Map<String, String> diagnostics() {
        checkMainThread();
        HxE hxEA0r = C3cG.A0r("host_readiness", AnonymousClass006.A0x(this.hostReadiness.getValue()));
        HxE hxEA0r2 = C3cG.A0r("host_readiness_age_ms", String.valueOf(SystemClock.elapsedRealtime() - this.readinessChangedAt));
        LocalBrowserHeadlessHost localBrowserHeadlessHost = this.automationHost;
        return AGH.A0D(hxEA0r, hxEA0r2, C3cG.A0r("headless_ready", String.valueOf(localBrowserHeadlessHost.isReady)), C3cG.A0r("headless_starting", String.valueOf(localBrowserHeadlessHost.isStarting)), C3cG.A0r("headless_display_stopped", String.valueOf(localBrowserHeadlessHost.displayStopped)), C3cG.A0r("headless_attached", String.valueOf(getHeadless() != null)), C3cG.A0r("service_foreground", String.valueOf(C3cH.A1R(HatchNodeServiceState.isForeground))), C3cG.A0r("rendering_ready", String.valueOf(this.rendering.isReady())), C3cG.A0r("host_access", String.valueOf(AnonymousClass003.A1Y(this.hasAccess))), C3cG.A0r("windows_block_automation", String.valueOf(this.windows.getBlocksAutomation())));
    }

    public final void goBackFromUser() {
        checkMainThread();
        if (!this.retired && this.browsingEnabled && AnonymousClass003.A1Y(this.acceptsInput)) {
            if (this.popupPage.getValue() == null || this.windows.getVisibleWebView().canGoBack()) {
                navigateHistoryFromUser(-1);
            } else {
                this.windows.goBack();
            }
        }
    }

    public final void goForwardFromUser() {
        checkMainThread();
        if (!this.retired && this.browsingEnabled && AnonymousClass003.A1Y(this.acceptsInput)) {
            navigateHistoryFromUser(1);
        }
    }

    public final boolean hasStartedHost() {
        HostLease hostLease;
        ComponentActivity componentActivity;
        C5303Dfm c5303Dfm;
        checkMainThread();
        return !this.retired && AnonymousClass003.A1Y(this.hasAccess) && ((PowerManager) this.webView.getContext().getSystemService(PowerManager.class)).isInteractive() && !((KeyguardManager) this.webView.getContext().getSystemService(KeyguardManager.class)).isDeviceLocked() && (hostLease = getHostLease()) != null && (componentActivity = hostLease.activity) != null && (c5303Dfm = componentActivity.lifecycleRegistry) != null && c5303Dfm.A01.A00(EnumC10573Huf.A06) && this.webView.isAttachedToWindow() && this.webView.isShown() && this.webView.getWindowVisibility() == 0 && this.webView.getWidth() > 0 && this.webView.getHeight() > 0;
    }

    public final boolean isUserAutofillHost(HostLease hostLease) {
        ComponentActivity componentActivity;
        checkMainThread();
        return (hostLease == null || (componentActivity = hostLease.activity) == null || getHostLease() != hostLease || hostLease.kind != LocalBrowserHostKind.PRESENTATION || !hasStartedHost() || componentActivity.isFinishing() || componentActivity.isDestroyed() || componentActivity.isInPictureInPictureMode()) ? false : true;
    }

    public final boolean isUserHost(HostLease hostLease) {
        ComponentActivity componentActivity;
        C5303Dfm c5303Dfm;
        return (!isUserAutofillHost(hostLease) || hostLease == null || (componentActivity = hostLease.activity) == null || (c5303Dfm = componentActivity.lifecycleRegistry) == null || !c5303Dfm.A01.A00(EnumC10573Huf.A05)) ? false : true;
    }

    public final LocalBrowserTargetMetadata metadata() {
        String url;
        checkMainThread();
        if (this.retired || !AnonymousClass003.A1Y(this.hasAccess) || (url = this.webView.getUrl()) == null) {
            return null;
        }
        String title = this.webView.getTitle();
        if (title == null) {
            title = "";
        }
        return new LocalBrowserTargetMetadata(url, title);
    }

    public final HostSlot offerHost(ComponentActivity componentActivity, ViewGroup viewGroup, LocalBrowserHostKind localBrowserHostKind, G0U<? super HostLease, Unit> g0u) {
        AnonymousClass005.A14(componentActivity, viewGroup, localBrowserHostKind, g0u);
        checkMainThread();
        HostSlot hostSlot = new HostSlot(this, componentActivity, viewGroup, localBrowserHostKind, g0u);
        if (!this.retired && !componentActivity.isDestroyed()) {
            this.slots.add(hostSlot);
            viewGroup.addOnLayoutChangeListener(hostSlot.layoutListener);
            componentActivity.lifecycleRegistry.A04(hostSlot);
            reconcileHost();
        }
        return hostSlot;
    }

    public final LocalBrowserPopupFact popupFact() {
        checkMainThread();
        if (this.retired) {
            return null;
        }
        return this.windows.heldPopupFact();
    }

    public final void prepareAutomationViewport() {
        checkMainThread();
        requestTakeover(false);
    }

    public final Object printLoadedPage(final Function0<Boolean> function0, HtJ<? super byte[]> htJ) {
        checkMainThread();
        return LocalBrowserPdfPrinter.INSTANCE.print(this.webView, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(LocalBrowserTarget.printLoadedPage$lambda$0(this.f$0, function0));
            }
        }, htJ);
    }

    public final void refreshAccess() {
        checkMainThread();
        reconcileHost();
        this.windows.setResumed(!this.retired && (getHeadless() != null || hasStartedHost()));
        if (getHeadless() != null) {
            refreshHeadlessAvailability();
            return;
        }
        HostLease hostLease = getHostLease();
        if (hostLease != null) {
            hostLease.updateAvailability$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser();
        }
    }

    public final void releaseHeldPopup() {
        checkMainThread();
        this.windows.releaseHeldPopup();
    }

    public final void releaseUserInput() {
        checkMainThread();
        AutofillManager autofillManager = (AutofillManager) this.webView.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            autofillManager.cancel();
        }
        LocalBrowserWebView visibleWebView = this.windows.getVisibleWebView();
        boolean zHasFocus = visibleWebView.hasFocus();
        this.windows.releaseUserInput();
        this.webView.clearFocus();
        if (zHasFocus) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.webView.getContext().getSystemService(InputMethodManager.class);
            inputMethodManager.hideSoftInputFromWindow(visibleWebView.getWindowToken(), 0);
            inputMethodManager.restartInput(visibleWebView);
        }
    }

    public final void reloadFromUser() {
        LocalBrowserWebView visibleWebView;
        String url;
        checkMainThread();
        if (!this.retired && this.browsingEnabled && AnonymousClass003.A1Y(this.acceptsInput) && (url = (visibleWebView = this.windows.getVisibleWebView()).getUrl()) != null && this.windows.getVisiblePage().allowsNavigation(url)) {
            visibleWebView.reload();
        }
    }

    public final void requestTakeover(boolean z) {
        ViewGroup viewGroup;
        checkMainThread();
        if (!z) {
            this.fileChooser.cancel();
            LocalBrowserDialogs localBrowserDialogs = this.nativeRequests.dialogs;
            if (localBrowserDialogs != null) {
                localBrowserDialogs.cancelPending();
            }
            if (this.rendering.isTakeover) {
                this.windows.closeUserWindows();
            }
        }
        this.rendering.requestTakeover(z);
        reconcileHost();
        if (z) {
            LocalBrowserWindows localBrowserWindows = this.windows;
            ViewParent parent = this.webView.getParent();
            ViewGroup viewGroup2 = null;
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null && getHeadless() == null) {
                viewGroup2 = viewGroup;
            }
            localBrowserWindows.showHeldPopup(viewGroup2);
        }
    }

    public final boolean retire() {
        checkMainThread();
        if (this.retired) {
            return this.retirementSucceeded;
        }
        this.retired = true;
        this.fileChooser.cancel();
        this.isFileStageActive = new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnonymousClass001.A0h();
            }
        };
        setHostReadiness(HostReadiness.UNAVAILABLE);
        this.lastUserThumbnail = null;
        this.lastNotificationPreview = null;
        this.page.close();
        final F1F f1f = new F1F();
        f1f.element = true;
        Iterator it = AbstractC0878AGe.A0X(this.slots).iterator();
        while (it.hasNext()) {
            retire$release(f1f, new LocalBrowserTarget$retire$2$1(it.next()));
        }
        retire$release(f1f, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.f$0.nativeUi.close();
                return Unit.INSTANCE;
            }
        });
        retire$release(f1f, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.f$0.activityBridge.close();
                return Unit.INSTANCE;
            }
        });
        this.takeoverSink = null;
        retire$release(f1f, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.f$0.rendering.close();
                return Unit.INSTANCE;
            }
        });
        retire$release(f1f, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalBrowserTarget.retire$lambda$5(this.f$0);
            }
        });
        retire$release(f1f, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.f$0.automationHost.close();
                return Unit.INSTANCE;
            }
        });
        retire$release(f1f, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalBrowserTarget.retire$lambda$7(this.f$0, f1f);
            }
        });
        retire$release(f1f, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.f$0.nativeRequests.close();
                return Unit.INSTANCE;
            }
        });
        retire$release(f1f, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.f$0.webView.stopLoading();
                return Unit.INSTANCE;
            }
        });
        retire$release(f1f, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalBrowserTarget.retire$lambda$10(this.f$0);
            }
        });
        retire$release(f1f, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalBrowserTarget.retire$lambda$11(this.f$0);
            }
        });
        retire$release(f1f, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalBrowserTarget.retire$lambda$12(this.f$0);
            }
        });
        retire$release(f1f, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AbstractC7611F5y.A0g(this.f$0.webView);
                return Unit.INSTANCE;
            }
        });
        retire$release(f1f, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.f$0.webView.removeAllViews();
                return Unit.INSTANCE;
            }
        });
        retire$release(f1f, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTarget$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalBrowserTarget.retire$lambda$15(this.f$0);
            }
        });
        boolean z = f1f.element;
        this.retirementSucceeded = z;
        return z;
    }

    public final void setBrowsingEnabled(boolean z) {
        checkMainThread();
        if (this.retired) {
            return;
        }
        this.browsingEnabled = z;
        WebSettings settings = this.webView.getSettings();
        if (z) {
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
        }
        settings.setBlockNetworkLoads(!z);
        this.windows.setBrowsingEnabled(z);
    }

    public final void stopHeadless() {
        checkMainThread();
        closeHeadless(false);
    }
}
