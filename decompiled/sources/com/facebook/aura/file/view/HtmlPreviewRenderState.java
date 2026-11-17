package com.facebook.aura.file.view;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.InterfaceC7549F2g;
import android.graphics.Bitmap;
import android.util.LruCache;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.memory.AuraMemoryPressure;
import com.facebook.aura.memory.AuraMemoryPressureLevel;
import com.facebook.aura.memory.AuraTrimmable;

/* loaded from: classes3.dex */
public final class HtmlPreviewRenderState implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final LruCache<String, Bitmap> bitmapCache;
    public final SingleFlight singleFlight;
    public final LruCache<String, Boolean> terminalFailures;
    public final LruCache<String, Integer> transientFailureCounts;
    public final AuraTrimmable trimmable;

    public final void recordTransientFailure(String str) {
        Object objValueOf;
        C7384Etj.A0Y(str, 0);
        Integer num = this.transientFailureCounts.get(str);
        int iIntValue = (num != null ? num.intValue() : 0) + 1;
        LruCache lruCache = this.transientFailureCounts;
        if (iIntValue >= 3) {
            lruCache.remove(str);
            lruCache = this.terminalFailures;
            objValueOf = true;
        } else {
            objValueOf = Integer.valueOf(iIntValue);
        }
        lruCache.put(str, objValueOf);
    }

    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuraMemoryPressureLevel.values().length];
            try {
                AnonymousClass002.A13(AuraMemoryPressureLevel.MODERATE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AuraMemoryPressureLevel.LOW, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AuraMemoryPressureLevel.BACKGROUNDED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AuraMemoryPressureLevel.CRITICAL, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        AuraMemoryPressure.INSTANCE.unregister(this.trimmable);
        this.singleFlight.clearAndCancelAll();
        this.bitmapCache.evictAll();
        this.terminalFailures.evictAll();
        this.transientFailureCounts.evictAll();
    }

    public final LruCache<String, Bitmap> getBitmapCache() {
        return this.bitmapCache;
    }

    public final SingleFlight getSingleFlight() {
        return this.singleFlight;
    }

    public final LruCache<String, Boolean> getTerminalFailures() {
        return this.terminalFailures;
    }

    public final LruCache<String, Integer> getTransientFailureCounts() {
        return this.transientFailureCounts;
    }

    public final class Companion {
        public final HtmlPreviewRenderState getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HtmlPreviewRenderState) abstractC3358CGz.A03(HtmlPreviewRenderState.class, new HtmlPreviewRenderState$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HtmlPreviewRenderState(AbstractC3358CGz abstractC3358CGz) {
        this.bitmapCache = new LruCache<String, Bitmap>() { // from class: com.facebook.aura.file.view.HtmlPreviewRenderState$bitmapCache$1
            @Override // android.util.LruCache
            public int sizeOf(String str, Bitmap bitmap) {
                C7384Etj.A0Y(bitmap, 1);
                int allocationByteCount = bitmap.getAllocationByteCount() / 1024;
                if (allocationByteCount < 1) {
                    return 1;
                }
                return allocationByteCount;
            }
        };
        this.terminalFailures = new LruCache<>(256);
        this.transientFailureCounts = new LruCache<>(256);
        this.singleFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, false);
        AuraTrimmable auraTrimmable = new AuraTrimmable() { // from class: com.facebook.aura.file.view.HtmlPreviewRenderState$trimmable$1
            @Override // com.facebook.aura.memory.AuraTrimmable
            public final void onMemoryPressure(AuraMemoryPressureLevel auraMemoryPressureLevel) {
                C7384Etj.A0Y(auraMemoryPressureLevel, 0);
                this.this$0.onMemoryPressure(auraMemoryPressureLevel);
            }
        };
        this.trimmable = auraTrimmable;
        AuraMemoryPressure.INSTANCE.register(auraTrimmable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMemoryPressure(AuraMemoryPressureLevel auraMemoryPressureLevel) {
        int iOrdinal = auraMemoryPressureLevel.ordinal();
        if (iOrdinal == 0 || iOrdinal == 2 || iOrdinal == 1) {
            this.bitmapCache.trimToSize(4096);
        } else {
            if (iOrdinal != 3) {
                throw C3cG.A0q();
            }
            this.bitmapCache.evictAll();
        }
    }

    public /* synthetic */ HtmlPreviewRenderState(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
