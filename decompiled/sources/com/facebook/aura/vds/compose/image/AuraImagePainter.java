package com.facebook.aura.vds.compose.image;

import X.AGF;
import X.AT3;
import X.AVy;
import X.AWA;
import X.AaI;
import X.Ab3;
import X.AbstractC1290Aga;
import X.AbstractC5321DgF;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.BV4;
import X.C00r;
import X.C06H;
import X.C1423Ais;
import X.C1572Alm;
import X.C2eL;
import X.C3cG;
import X.C5322DgG;
import X.C7109EgN;
import X.C7182Ehs;
import X.C7183Eht;
import X.C7184Ehu;
import X.C7197Ei9;
import X.C7218Eii;
import X.C7219Eij;
import X.C7226Eiq;
import X.C7252EjY;
import X.C7253EjZ;
import X.C7254Ejd;
import X.C7384Etj;
import X.C7506EyQ;
import X.C79;
import X.CFK;
import X.DV5;
import X.Ej6;
import X.EjN;
import X.Ejq;
import X.EnumC1820Arj;
import X.F0C;
import X.F0N;
import X.G0U;
import X.InterfaceC1327AhE;
import X.InterfaceC1559AlZ;
import X.InterfaceC7300EkR;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.ContextChain;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraImagePainter extends AVy implements InterfaceC1559AlZ {
    public static final int $stable = 8;
    public static final long ARGB_8888_BYTES_PER_PIXEL = 4;
    public static final long AUTO_RETRY_BASE_DELAY_MS = 2000;
    public static final long AUTO_RETRY_MAX_DELAY_MS = 30000;
    public static final long LOAD_WATCHDOG_TIMEOUT_MS = 60000;
    public static final long MAX_CANVAS_BITMAP_BYTES = 104857600;
    public static final String TAG = "AuraImagePainter";
    public static final long WATCHDOG_IMAGE_ID = 0;
    public int autoRetryAttempt;
    public volatile CallerContext callerContext;
    public volatile ContextChain contextChain;
    public volatile Ej6 currentListener;
    public final C00r drawInvalidateCount$delegate;
    public final InterfaceC7300EkR drawable;
    public final Drawable drawableAsDrawable;
    public final F0C drawableCallback$delegate;
    public final MutableState drawableIntrinsicSize$delegate;
    public volatile boolean hasFinalImage;
    public volatile boolean isBitmapTooLargeToDraw;
    public final int maxAutoRetries;
    public volatile C7197Ei9 options;
    public Runnable pendingLoadWatchdog;
    public Runnable pendingRetry;
    public final Ej6 proxyListener;
    public volatile boolean remembered;
    public final Resources resources;
    public final G0U<Throwable, Boolean> shouldRetry;
    public final Ejq source;
    public volatile G0U<? super Throwable, Unit> terminalFailureHandler;
    public static final Companion Companion = new Companion();
    public static final F0C<Handler> MAIN_HANDLER$delegate = AbstractC5321DgF.A02(C79.A0C, AuraImagePainter$Companion$MAIN_HANDLER$2.INSTANCE);

    public final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        public final long autoRetryBackoffMs(int i) {
            if (i < 0) {
                i = 0;
            } else if (i > 16) {
                i = 16;
            }
            long j = 2000 << i;
            if (j > 30000) {
                return 30000L;
            }
            return j;
        }

        private final Handler getMAIN_HANDLER() {
            return AuraImagePainter.MAIN_HANDLER$delegate.getValue();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuraImagePainter(Resources resources, CallerContext callerContext, Ejq ejq, C7197Ei9 c7197Ei9, ContextChain contextChain, int i, G0U<? super Throwable, Boolean> g0u) {
        C7384Etj.A0Y(resources, 0);
        AnonymousClass005.A11(callerContext, ejq, c7197Ei9, 1);
        this.resources = resources;
        this.source = ejq;
        this.maxAutoRetries = i;
        this.shouldRetry = g0u;
        this.options = c7197Ei9;
        this.callerContext = callerContext;
        this.contextChain = contextChain;
        C7219Eij c7219Eij = new C7219Eij(((C7218Eii) EjN.A00()).A01);
        this.drawable = c7219Eij;
        this.drawableAsDrawable = c7219Eij;
        this.proxyListener = new Ej6() { // from class: com.facebook.aura.vds.compose.image.AuraImagePainter$proxyListener$1
            @Override // X.Ej6
            public void onFailure(long j, Drawable drawable, Throwable th) {
                this.this$0.hasFinalImage = false;
                this.this$0.cancelLoadWatchdog();
                if (this.this$0.maybeScheduleAutoRetry(th)) {
                    return;
                }
                Ej6 ej6 = this.this$0.currentListener;
                if (ej6 != null) {
                    ej6.onFailure(j, drawable, th);
                }
                G0U<? super Throwable, Unit> g0u2 = this.this$0.terminalFailureHandler;
                if (g0u2 != null) {
                    g0u2.invoke(th);
                }
            }

            @Override // X.Ej6
            public void onFinalImageSet(long j, int i2, C2eL c2eL, Drawable drawable) {
                AuraImagePainter auraImagePainter = this.this$0;
                auraImagePainter.autoRetryAttempt = 0;
                auraImagePainter.hasFinalImage = true;
                this.this$0.recordDecodedSize(c2eL);
                this.this$0.cancelPendingRetry();
                this.this$0.cancelLoadWatchdog();
                Ej6 ej6 = this.this$0.currentListener;
                if (ej6 != null) {
                    ej6.onFinalImageSet(j, i2, c2eL, drawable);
                }
            }

            @Override // X.Ej6
            public void onIntermediateImageFailed(long j, Throwable th) {
                AuraImagePainter auraImagePainter = this.this$0;
                int i2 = AuraImagePainter.$stable;
                Ej6 ej6 = auraImagePainter.currentListener;
                if (ej6 != null) {
                    ej6.onIntermediateImageFailed(j, th);
                }
            }

            @Override // X.Ej6
            public void onIntermediateImageSet(long j, C2eL c2eL) {
                this.this$0.recordDecodedSize(c2eL);
                this.this$0.cancelLoadWatchdog();
                Ej6 ej6 = this.this$0.currentListener;
                if (ej6 != null) {
                    ej6.onIntermediateImageSet(j, c2eL);
                }
            }

            @Override // X.Ej6
            public void onPlaceholderSet(long j, Drawable drawable) {
                if (drawable != null && !drawable.equals(C7254Ejd.A00)) {
                    this.this$0.cancelLoadWatchdog();
                }
                AuraImagePainter auraImagePainter = this.this$0;
                int i2 = AuraImagePainter.$stable;
                Ej6 ej6 = auraImagePainter.currentListener;
                if (ej6 != null) {
                    ej6.onPlaceholderSet(j, drawable);
                }
            }

            @Override // X.Ej6
            public void onRelease(long j) {
                this.this$0.cancelLoadWatchdog();
                Ej6 ej6 = this.this$0.currentListener;
                if (ej6 != null) {
                    ej6.onRelease(j);
                }
            }

            @Override // X.Ej6
            public void onSubmit(long j, Object obj) {
                AuraImagePainter auraImagePainter = this.this$0;
                int i2 = AuraImagePainter.$stable;
                auraImagePainter.isBitmapTooLargeToDraw = false;
                Ej6 ej6 = this.this$0.currentListener;
                if (ej6 != null) {
                    ej6.onSubmit(j, obj);
                }
            }

            @Override // X.InterfaceC7256Ejf
            public void onImageDrawn(String str, C2eL c2eL, F0N f0n) {
                AnonymousClass005.A0x(str, c2eL, f0n);
                this.this$0.cancelLoadWatchdog();
                Ej6 ej6 = this.this$0.currentListener;
                if (ej6 != null) {
                    ej6.onImageDrawn(str, c2eL, f0n);
                }
            }
        };
        this.drawInvalidateCount$delegate = new ParcelableSnapshotMutableIntState(0);
        this.drawableIntrinsicSize$delegate = new ParcelableSnapshotMutableState(AGF.A01(), new AWA(m2581getIntrinsicSizeOrUnspecified7Ah8Wj8(c7219Eij)));
        this.drawableCallback$delegate = C5322DgG.A01((Function0) new AuraImagePainter$drawableCallback$2(this));
        long jM2580getDrawableIntrinsicSizeNHjbRc = m2580getDrawableIntrinsicSizeNHjbRc();
        if (jM2580getDrawableIntrinsicSizeNHjbRc != 9205357640488583168L) {
            c7219Eij.setBounds(0, 0, (int) AnonymousClass003.A03(jM2580getDrawableIntrinsicSizeNHjbRc), (int) AnonymousClass004.A00(jM2580getDrawableIntrinsicSizeNHjbRc));
        }
    }

    private final void release() {
        this.remembered = false;
        cancelPendingRetry();
        cancelLoadWatchdog();
        this.drawableAsDrawable.setCallback(null);
        EjN.A00().AaG(this.drawable);
    }

    @Override // X.AVy
    public boolean applyLayoutDirection(EnumC1820Arj enumC1820Arj) {
        C7384Etj.A0Y(enumC1820Arj, 0);
        int i = 0;
        Drawable drawable = this.drawableAsDrawable;
        int iOrdinal = enumC1820Arj.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                throw C3cG.A0q();
            }
        }
        return drawable.setLayoutDirection(i);
    }

    @Override // X.AVy
    public void onDraw(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        InterfaceC1327AhE interfaceC1327AhE = ((AaI) at3.AEq()).A02.A02.A01;
        getDrawInvalidateCount();
        if (this.isBitmapTooLargeToDraw) {
            return;
        }
        long jAKb = at3.AKb();
        if (jAKb != 9205357640488583168L) {
            this.drawableAsDrawable.setBounds(0, 0, Ab3.A01(AnonymousClass003.A03(jAKb)), Ab3.A01(AnonymousClass004.A00(jAKb)));
        }
        try {
            interfaceC1327AhE.Ac2();
            Drawable drawable = this.drawableAsDrawable;
            Canvas canvas = AbstractC1290Aga.A00;
            drawable.draw(((C1572Alm) interfaceC1327AhE).A00);
        } finally {
            interfaceC1327AhE.Abc();
        }
    }

    @Override // X.InterfaceC1559AlZ
    public void onRemembered() {
        this.remembered = true;
        this.drawableAsDrawable.setCallback(getDrawableCallback());
        issueFetch();
    }

    /* loaded from: classes4.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC1820Arj.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelLoadWatchdog() {
        Runnable runnable = this.pendingLoadWatchdog;
        if (runnable != null) {
            MAIN_HANDLER$delegate.getValue().removeCallbacks(runnable);
        }
        this.pendingLoadWatchdog = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelPendingRetry() {
        Runnable runnable = this.pendingRetry;
        if (runnable != null) {
            MAIN_HANDLER$delegate.getValue().removeCallbacks(runnable);
        }
        this.pendingRetry = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void evictCachedSourceForRetry() throws NumberFormatException {
        C7506EyQ c7506EyQ;
        Ejq ejq = this.source;
        if (!(ejq instanceof C7506EyQ) || (c7506EyQ = (C7506EyQ) ejq) == null) {
            return;
        }
        Uri uri = c7506EyQ.A01;
        C7182Ehs c7182EhsA06 = C7109EgN.A03().A06();
        C7184Ehu c7184Ehu = new C7184Ehu();
        c7184Ehu.A02 = uri;
        C7183Eht c7183EhtA01 = c7184Ehu.A01();
        CancellationException cancellationException = C7182Ehs.A0E;
        DV5 dv5 = c7182EhsA06.A03;
        c7182EhsA06.A04.Aaf(new C7252EjY(dv5.getBitmapCacheKey(c7183EhtA01, null), dv5.getPostprocessedBitmapCacheKey(c7183EhtA01, null)));
        c7182EhsA06.A05.Aaf(new C7253EjZ(dv5.getEncodedCacheKey(c7183EhtA01, null)));
        C7182Ehs.A02(c7182EhsA06, c7183EhtA01);
    }

    private final int getDrawInvalidateCount() {
        return this.drawInvalidateCount$delegate.AGd();
    }

    private final Drawable.Callback getDrawableCallback() {
        return (Drawable.Callback) this.drawableCallback$delegate.getValue();
    }

    /* renamed from: getDrawableIntrinsicSize-NH-jbRc, reason: not valid java name */
    private final long m2580getDrawableIntrinsicSizeNHjbRc() {
        return ((AWA) this.drawableIntrinsicSize$delegate.getValue()).A00;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean maybeScheduleAutoRetry(Throwable th) {
        int i;
        G0U<Throwable, Boolean> g0u;
        if (!this.remembered || (i = this.maxAutoRetries) <= 0 || this.autoRetryAttempt >= i || !((g0u = this.shouldRetry) == null || AnonymousClass003.A1X(th, g0u))) {
            return false;
        }
        Companion companion = Companion;
        int i2 = this.autoRetryAttempt;
        long jAutoRetryBackoffMs = companion.autoRetryBackoffMs(i2);
        this.autoRetryAttempt = i2 + 1;
        cancelPendingRetry();
        Runnable runnable = new Runnable() { // from class: com.facebook.aura.vds.compose.image.AuraImagePainter$maybeScheduleAutoRetry$runnable$1
            @Override // java.lang.Runnable
            public final void run() throws NumberFormatException {
                AuraImagePainter auraImagePainter = this.this$0;
                int i3 = AuraImagePainter.$stable;
                auraImagePainter.pendingRetry = null;
                if (auraImagePainter.remembered) {
                    this.this$0.evictCachedSourceForRetry();
                    this.this$0.issueFetch();
                }
            }
        };
        this.pendingRetry = runnable;
        MAIN_HANDLER$delegate.getValue().postDelayed(runnable, jAutoRetryBackoffMs);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordDecodedSize(C2eL c2eL) {
        int width;
        int height;
        if (c2eL != null) {
            width = c2eL.getWidth();
            height = c2eL.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        long j = width * height * 4;
        this.isBitmapTooLargeToDraw = AnonymousClass002.A1N((j > 104857600L ? 1 : (j == 104857600L ? 0 : -1)));
        if (this.isBitmapTooLargeToDraw) {
            CFK.A0F(TAG, "skipping draw of oversized image %dx%d (%d bytes, Canvas limit %d): %s", Integer.valueOf(width), Integer.valueOf(height), Long.valueOf(j), 104857600L, this.source.ADg());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDrawInvalidateCount(int i) {
        this.drawInvalidateCount$delegate.AdX(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDrawableIntrinsicSize-uvyYCjk, reason: not valid java name */
    public final void m2582setDrawableIntrinsicSizeuvyYCjk(long j) {
        this.drawableIntrinsicSize$delegate.Af8(new AWA(j));
    }

    @Override // X.AVy
    public boolean applyAlpha(float f) {
        Drawable drawable = this.drawableAsDrawable;
        int iA02 = Ab3.A02(f, 255.0f);
        if (iA02 < 0) {
            iA02 = 0;
        } else if (iA02 > 255) {
            iA02 = 255;
        }
        drawable.setAlpha(iA02);
        return true;
    }

    @Override // X.AVy
    public boolean applyColorFilter(C1423Ais c1423Ais) {
        this.drawableAsDrawable.setColorFilter(c1423Ais != null ? c1423Ais.A00 : null);
        return true;
    }

    public final void reissueInPlace() {
        if (this.remembered) {
            cancelPendingRetry();
            this.autoRetryAttempt = 0;
            issueFetch();
        }
    }

    public final void retry() throws NumberFormatException {
        if (this.hasFinalImage) {
            return;
        }
        cancelPendingRetry();
        this.autoRetryAttempt = 0;
        evictCachedSourceForRetry();
        EjN.A00().AaG(this.drawable);
        issueFetch();
    }

    private final void armLoadWatchdog() {
        cancelLoadWatchdog();
        Runnable runnable = new Runnable() { // from class: com.facebook.aura.vds.compose.image.AuraImagePainter$armLoadWatchdog$runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                AuraImagePainter auraImagePainter = this.this$0;
                int i = AuraImagePainter.$stable;
                auraImagePainter.pendingLoadWatchdog = null;
                if (!auraImagePainter.remembered || this.this$0.hasFinalImage) {
                    return;
                }
                CFK.A0F(AuraImagePainter.TAG, "load watchdog fired after %dms with no Vito callback, failing image: %s", 60000L, this.this$0.source.ADg());
                this.this$0.proxyListener.onFailure(0L, null, BV4.A0K("AuraImage: no Vito callback within 60000ms"));
            }
        };
        this.pendingLoadWatchdog = runnable;
        MAIN_HANDLER$delegate.getValue().postDelayed(runnable, 60000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getIntrinsicSizeOrUnspecified-7Ah8Wj8, reason: not valid java name */
    public final long m2581getIntrinsicSizeOrUnspecified7Ah8Wj8(Drawable drawable) {
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return 9205357640488583168L;
        }
        return AnonymousClass007.A0A(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void issueFetch() {
        C7226Eiq c7226EiqA7p = EjN.A02().A7p(this.resources, null, null, this.options, this.source, this.callerContext);
        if (EjN.A00().ABJ(null, null, null, this.drawable, c7226EiqA7p, null, this.proxyListener, this.callerContext)) {
            return;
        }
        armLoadWatchdog();
    }

    @Override // X.AVy
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo0getIntrinsicSizeNHjbRc() {
        return m2580getDrawableIntrinsicSizeNHjbRc();
    }

    @Override // X.InterfaceC1559AlZ
    public void onAbandoned() {
        release();
    }

    @Override // X.InterfaceC1559AlZ
    public void onForgotten() {
        release();
    }

    public final void setTerminalFailureHandler(G0U<? super Throwable, Unit> g0u) {
        this.terminalFailureHandler = g0u;
    }

    public final void update(Ej6 ej6) {
        this.currentListener = ej6;
    }

    public /* synthetic */ AuraImagePainter(Resources resources, CallerContext callerContext, Ejq ejq, C7197Ei9 c7197Ei9, ContextChain contextChain, int i, G0U g0u, int i2, C06H c06h) {
        this(resources, callerContext, ejq, c7197Ei9, (i2 & 16) != 0 ? null : contextChain, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? null : g0u);
    }

    public final void update(C7197Ei9 c7197Ei9, CallerContext callerContext, ContextChain contextChain) {
        boolean z;
        boolean zA1b = AnonymousClass004.A1b(c7197Ei9, callerContext);
        if (!c7197Ei9.equals(this.options)) {
            this.options = c7197Ei9;
            z = true;
        } else {
            z = false;
        }
        if (callerContext != this.callerContext) {
            this.callerContext = callerContext;
            z = true;
        }
        if (contextChain != this.contextChain) {
            this.contextChain = contextChain;
        } else if (!z) {
            return;
        }
        if (this.remembered) {
            cancelPendingRetry();
            this.autoRetryAttempt = zA1b ? 1 : 0;
            issueFetch();
        }
    }
}
