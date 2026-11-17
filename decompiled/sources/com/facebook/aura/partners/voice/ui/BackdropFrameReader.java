package com.facebook.aura.partners.voice.ui;

import X.Ab3;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C10543Hqv;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C8j3;
import X.Ey9;
import X.F60;
import X.G0U;
import X.G0V;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BackdropFrameReader {
    public Bitmap backdropBitmap;
    public Bitmap edgeBitmap;
    public volatile int generation;
    public final AtomicInteger legacyRequestsPending = new AtomicInteger(0);
    public int[] rowPixels = new int[0];

    public final class PixelCopyColorResult {
        public static final int $stable = 0;
        public final Integer color;
        public final boolean succeeded;

        public final Integer getColor() {
            return this.color;
        }

        public final boolean getSucceeded() {
            return this.succeeded;
        }

        public PixelCopyColorResult(boolean z, Integer num) {
            this.succeeded = z;
            this.color = num;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class SampleKind {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ SampleKind[] $VALUES;
        public static final SampleKind BACKDROP;
        public static final SampleKind EDGE;

        static {
            SampleKind sampleKind = new SampleKind("BACKDROP", 0);
            BACKDROP = sampleKind;
            SampleKind sampleKind2 = new SampleKind("EDGE", 1);
            EDGE = sampleKind2;
            SampleKind[] sampleKindArr = {sampleKind, sampleKind2};
            $VALUES = sampleKindArr;
            $ENTRIES = C3cG.A0w(sampleKindArr);
        }

        public static Ey9<SampleKind> getEntries() {
            return $ENTRIES;
        }

        public static SampleKind valueOf(String str) {
            return (SampleKind) Enum.valueOf(SampleKind.class, str);
        }

        public static SampleKind[] values() {
            return (SampleKind[]) $VALUES.clone();
        }

        public SampleKind(String str, int i) {
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.ui.BackdropFrameReader$sampleBackdrop$1, reason: invalid class name and case insensitive filesystem */
    public final class C133261 extends AbstractC7559F3s implements G0V<Bitmap, PixelCopy.OnPixelCopyFinishedListener, Unit> {
        public final /* synthetic */ Handler $callbackHandler;
        public final /* synthetic */ Rect $sourceRect;
        public final /* synthetic */ Surface $surface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133261(Surface surface, Rect rect, Handler handler) {
            super(2);
            this.$surface = surface;
            this.$sourceRect = rect;
            this.$callbackHandler = handler;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener) {
            AnonymousClass003.A0u(bitmap, onPixelCopyFinishedListener);
            PixelCopy.request(this.$surface, this.$sourceRect, bitmap, onPixelCopyFinishedListener, this.$callbackHandler);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener) {
            invoke2(bitmap, onPixelCopyFinishedListener);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.ui.BackdropFrameReader$sampleBackdrop$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<Bitmap, Integer> {
        public final /* synthetic */ int $rowWidth;
        public final /* synthetic */ boolean $strict;
        public final /* synthetic */ Surface $surface;
        public final /* synthetic */ BackdropFrameReader this$0;

        @Override // X.G0U
        public final Integer invoke(Bitmap bitmap) {
            C7384Etj.A0Y(bitmap, 0);
            if (!this.$surface.isValid()) {
                return null;
            }
            BackdropFrameReader backdropFrameReader = this.this$0;
            int[] iArr = backdropFrameReader.rowPixels;
            int length = iArr.length;
            int i = this.$rowWidth;
            if (length != i) {
                iArr = new int[i];
                backdropFrameReader.rowPixels = iArr;
            }
            int i2 = 0;
            bitmap.getPixels(iArr, 0, i, 0, 0, i, 1);
            int i3 = this.$rowWidth - 1;
            BackdropFrameReader backdropFrameReader2 = this.this$0;
            ArrayList arrayListA11 = C60O.A11(33);
            do {
                C60Q.A1P(arrayListA11, backdropFrameReader2.rowPixels[(i3 * i2) / 32]);
                i2++;
            } while (i2 < 33);
            return HatchEmbodimentVideoKt.resolveBackdropColor(arrayListA11, this.$strict);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Surface surface, BackdropFrameReader backdropFrameReader, int i, boolean z) {
            super(1);
            this.$surface = surface;
            this.this$0 = backdropFrameReader;
            this.$rowWidth = i;
            this.$strict = z;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.ui.BackdropFrameReader$sampleEdge$1, reason: invalid class name and case insensitive filesystem */
    public final class C133271 extends AbstractC7559F3s implements G0V<Bitmap, PixelCopy.OnPixelCopyFinishedListener, Unit> {
        public final /* synthetic */ Handler $callbackHandler;
        public final /* synthetic */ Rect $sourceRect;
        public final /* synthetic */ Window $window;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133271(Window window, Rect rect, Handler handler) {
            super(2);
            this.$window = window;
            this.$sourceRect = rect;
            this.$callbackHandler = handler;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener) {
            AnonymousClass003.A0u(bitmap, onPixelCopyFinishedListener);
            PixelCopy.request(this.$window, this.$sourceRect, bitmap, onPixelCopyFinishedListener, this.$callbackHandler);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener) {
            invoke2(bitmap, onPixelCopyFinishedListener);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.ui.BackdropFrameReader$sampleEdge$2, reason: invalid class name and case insensitive filesystem */
    public final class C133282 extends AbstractC7559F3s implements G0U<Bitmap, Integer> {
        public final /* synthetic */ int $rowWidth;

        @Override // X.G0U
        public final Integer invoke(Bitmap bitmap) {
            C7384Etj.A0Y(bitmap, 0);
            BackdropFrameReader backdropFrameReader = BackdropFrameReader.this;
            int[] iArr = backdropFrameReader.rowPixels;
            int length = iArr.length;
            int i = this.$rowWidth;
            if (length != i) {
                iArr = new int[i];
                backdropFrameReader.rowPixels = iArr;
            }
            int i2 = 0;
            bitmap.getPixels(iArr, 0, i, 0, 0, i, 1);
            BackdropFrameReader backdropFrameReader2 = BackdropFrameReader.this;
            int i3 = this.$rowWidth;
            ArrayList arrayListA11 = C60O.A11(9);
            do {
                C60Q.A1P(arrayListA11, backdropFrameReader2.rowPixels[((i3 - 1) * ((i2 * 2) + 1)) / 18]);
                i2++;
            } while (i2 < 9);
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator it = arrayListA11.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((AnonymousClass001.A0F(next) >>> 24) & 255) == 255) {
                    arrayListA0h.add(next);
                }
            }
            if (arrayListA0h.size() * 2 >= arrayListA11.size()) {
                return Integer.valueOf(HatchEmbodimentVideoKt.medianBackdropColor(arrayListA0h));
            }
            return null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133282(int i) {
            super(1);
            this.$rowWidth = i;
        }
    }

    public final void releaseSurface(final Surface surface) {
        C7384Etj.A0Y(surface, 0);
        if (Build.VERSION.SDK_INT >= 34 || this.legacyRequestsPending.get() == 0) {
            surface.release();
        } else {
            HatchEmbodimentVideoKt.getBackdropPixelCopyExecutor().execute(new Runnable() { // from class: com.facebook.aura.partners.voice.ui.BackdropFrameReader.releaseSurface.1
                @Override // java.lang.Runnable
                public final void run() {
                    surface.release();
                }
            });
        }
    }

    public final boolean sampleBackdrop(Surface surface, TextureView textureView, boolean z, G0U<? super PixelCopyColorResult, Unit> g0u) {
        C7384Etj.A0Y(surface, 0);
        AnonymousClass002.A1B(textureView, 1, g0u);
        if (!textureView.isAvailable() || !surface.isValid()) {
            return false;
        }
        int width = textureView.getWidth();
        int height = textureView.getHeight();
        Resources resources = textureView.getResources();
        int iA02 = Ab3.A02(20.0f, resources.getDisplayMetrics().density);
        if (iA02 < 0) {
            iA02 = 0;
        }
        int iA022 = Ab3.A02(4.0f, resources.getDisplayMetrics().density);
        if (iA022 < 0) {
            iA022 = 0;
        }
        if (width <= iA02 * 2 || height <= iA022) {
            return false;
        }
        Rect rect = new Rect(iA02, iA022, width - iA02, iA022 + 1);
        int iWidth = rect.width();
        Handler handler = textureView.getHandler();
        if (handler != null) {
            return samplePixelCopy(SampleKind.BACKDROP, iWidth, 1, handler, C8j3.A1T(Build.VERSION.SDK_INT, 34), new C133261(surface, rect, handler), new AnonymousClass2(surface, this, iWidth, z), g0u);
        }
        return false;
    }

    public final boolean sampleEdge(Window window, View view, View view2, EmbodimentEdge embodimentEdge, G0U<? super PixelCopyColorResult, Unit> g0u) {
        boolean zA1a = AnonymousClass002.A1a(window, view);
        AnonymousClass005.A12(view2, embodimentEdge, g0u, 2);
        if (Build.VERSION.SDK_INT >= 34 && view.isShown() && view.getWindowVisibility() == 0 && view.getWidth() > 0 && view.getHeight() > 0 && view2.isShown() && view2.getWindowVisibility() == 0 && view2.getWidth() > 0 && view2.getHeight() > 0) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            Rect rect = new Rect();
            if (view.getLocalVisibleRect(rect) && !rect.isEmpty()) {
                int[] iArr2 = new int[2];
                view2.getLocationInWindow(iArr2);
                Rect rect2 = new Rect();
                if (view2.getLocalVisibleRect(rect2) && !rect2.isEmpty()) {
                    int i = iArr[0];
                    int i2 = i + rect.left;
                    int i3 = iArr2[0];
                    int iMax = Math.max(i2, rect2.left + i3);
                    int iMin = Math.min(i + rect.right, i3 + rect2.right);
                    int i4 = iArr[zA1a ? 1 : 0];
                    int i5 = i4 + rect.top;
                    int i6 = iArr2[zA1a ? 1 : 0];
                    int iMax2 = Math.max(i5, rect2.top + i6);
                    int iMin2 = Math.min(i4 + rect.bottom, i6 + rect2.bottom);
                    View decorView = window.getDecorView();
                    C7384Etj.A0U(decorView);
                    int i7 = iMin2 - 1;
                    if (embodimentEdge == EmbodimentEdge.TOP) {
                        i7 = iMax2;
                    }
                    if (iMax >= 0 && iMin <= decorView.getWidth() && iMin > iMax && iMin2 > iMax2 && i7 >= 0 && i7 < decorView.getHeight()) {
                        Rect rect3 = new Rect(iMax, i7, iMin, i7 + 1);
                        int iWidth = rect3.width();
                        Handler handler = view2.getHandler();
                        if (handler != null) {
                            return samplePixelCopy(SampleKind.EDGE, iWidth, zA1a ? 1 : 0, handler, false, new C133271(window, rect3, handler), new C133282(iWidth), g0u);
                        }
                    }
                }
            }
        }
        return false;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SampleKind.values().length];
            try {
                AnonymousClass002.A13(SampleKind.BACKDROP, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(SampleKind.EDGE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, com.facebook.aura.partners.voice.ui.BackdropFrameReader$samplePixelCopy$1, java.lang.Runnable] */
    private final boolean samplePixelCopy(SampleKind sampleKind, int i, int i2, final Handler handler, boolean z, final G0V<? super Bitmap, ? super PixelCopy.OnPixelCopyFinishedListener, Unit> g0v, G0U<? super Bitmap, Integer> g0u, G0U<? super PixelCopyColorResult, Unit> g0u2) {
        final Bitmap bitmapTakeBitmap = takeBitmap(sampleKind, i, i2);
        final int i3 = this.generation;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        final C10543Hqv c10543HqvA0z = C3cG.A0z();
        final BackdropFrameReader$samplePixelCopy$complete$1 backdropFrameReader$samplePixelCopy$complete$1 = new BackdropFrameReader$samplePixelCopy$complete$1(handler, c10543HqvA0z, atomicBoolean, i3, this, g0u2, atomicBoolean2, bitmapTakeBitmap, sampleKind, g0u);
        ?? r2 = new Runnable() { // from class: com.facebook.aura.partners.voice.ui.BackdropFrameReader.samplePixelCopy.1
            @Override // java.lang.Runnable
            public final void run() {
                backdropFrameReader$samplePixelCopy$complete$1.invoke(null, AnonymousClass001.A0h());
            }
        };
        c10543HqvA0z.element = r2;
        final Runnable runnable = new Runnable() { // from class: com.facebook.aura.partners.voice.ui.BackdropFrameReader$samplePixelCopy$issuePixelCopy$1
            @Override // java.lang.Runnable
            public final void run() {
                Handler handler2;
                Runnable runnable2;
                if (i3 != this.generation || atomicBoolean.get()) {
                    handler2 = handler;
                    runnable2 = c10543HqvA0z.element;
                    if (runnable2 == null) {
                        C7384Etj.A0b("timeout");
                        throw F60.createAndThrow();
                    }
                } else {
                    try {
                        G0V<Bitmap, PixelCopy.OnPixelCopyFinishedListener, Unit> g0v2 = g0v;
                        Bitmap bitmap = bitmapTakeBitmap;
                        final G0V<Integer, Boolean, Unit> g0v3 = backdropFrameReader$samplePixelCopy$complete$1;
                        g0v2.invoke(bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.facebook.aura.partners.voice.ui.BackdropFrameReader$samplePixelCopy$issuePixelCopy$1.1
                            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                            public final void onPixelCopyFinished(int i4) {
                                g0v3.invoke(Integer.valueOf(i4), AnonymousClass001.A0i());
                            }
                        });
                        return;
                    } catch (RuntimeException unused) {
                        Handler handler3 = handler;
                        final G0V<Integer, Boolean, Unit> g0v4 = backdropFrameReader$samplePixelCopy$complete$1;
                        if (handler3.post(new Runnable() { // from class: com.facebook.aura.partners.voice.ui.BackdropFrameReader$samplePixelCopy$issuePixelCopy$1.3
                            @Override // java.lang.Runnable
                            public final void run() {
                                g0v4.invoke(null, AnonymousClass001.A0i());
                            }
                        })) {
                            return;
                        }
                        handler2 = handler;
                        runnable2 = c10543HqvA0z.element;
                        if (runnable2 == null) {
                            C7384Etj.A0b("timeout");
                            throw F60.createAndThrow();
                        }
                    }
                }
                handler2.removeCallbacks(runnable2);
                atomicBoolean.compareAndSet(false, true);
                if (atomicBoolean2.compareAndSet(false, true)) {
                    bitmapTakeBitmap.recycle();
                }
            }
        };
        if (!handler.postDelayed(r2, 1000L)) {
            atomicBoolean.set(true);
            if (atomicBoolean2.compareAndSet(false, true)) {
                bitmapTakeBitmap.recycle();
            }
            return false;
        }
        if (!z) {
            runnable.run();
            return true;
        }
        this.legacyRequestsPending.incrementAndGet();
        try {
            HatchEmbodimentVideoKt.getBackdropPixelCopyExecutor().execute(new Runnable() { // from class: com.facebook.aura.partners.voice.ui.BackdropFrameReader.samplePixelCopy.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        runnable.run();
                    } finally {
                        this.legacyRequestsPending.decrementAndGet();
                    }
                }
            });
            return true;
        } catch (RuntimeException e) {
            this.legacyRequestsPending.decrementAndGet();
            throw e;
        }
    }

    public final void release() {
        this.generation++;
        Bitmap bitmap = this.backdropBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.backdropBitmap = null;
        Bitmap bitmap2 = this.edgeBitmap;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        this.edgeBitmap = null;
        this.rowPixels = new int[0];
    }

    private final Bitmap bitmap(SampleKind sampleKind) {
        int iOrdinal = sampleKind.ordinal();
        if (iOrdinal == 0) {
            return this.backdropBitmap;
        }
        if (iOrdinal == 1) {
            return this.edgeBitmap;
        }
        throw C3cG.A0q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cacheBitmap(SampleKind sampleKind, Bitmap bitmap) {
        Bitmap bitmap2 = bitmap(sampleKind);
        if (bitmap2 != null && bitmap2 != bitmap) {
            bitmap2.recycle();
        }
        setBitmap(sampleKind, bitmap);
    }

    private final void setBitmap(SampleKind sampleKind, Bitmap bitmap) {
        int iOrdinal = sampleKind.ordinal();
        if (iOrdinal == 0) {
            this.backdropBitmap = bitmap;
        } else {
            if (iOrdinal != 1) {
                throw C3cG.A0q();
            }
            this.edgeBitmap = bitmap;
        }
    }

    private final Bitmap takeBitmap(SampleKind sampleKind, int i, int i2) {
        Bitmap bitmap = bitmap(sampleKind);
        setBitmap(sampleKind, null);
        if (bitmap != null && !bitmap.isRecycled() && bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        if (bitmap != null) {
            bitmap.recycle();
        }
        C7384Etj.A0U(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }
}
