package com.facebook.aura.webview;

import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C60O;
import X.C60P;
import X.C6t6;
import X.C7384Etj;
import X.CFK;
import X.G0V;
import X.InterfaceC7549F2g;
import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.aura.memory.AuraMemoryBudget;
import com.facebook.aura.memory.AuraMemoryPressure;
import com.facebook.aura.memory.AuraMemoryPressureLevel;
import com.facebook.aura.memory.AuraTrimmable;
import com.facebook.aura.spaces.view.cards.HtmlSpacesWebViewKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class HtmlWebViewPool implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final String TAG = "HtmlWebViewPool";
    public final int defaultCap;
    public final LinkedHashMap<String, C6t6> entries;
    public final Set<String> evictionGuardedKeys;
    public volatile G0V<? super Context, ? super String, ? extends C6t6> factory;
    public final Set<C6t6> leasedWebViews;
    public volatile int liveCap;
    public final Handler mainHandler;
    public final Set<C6t6> pendingDestruction;
    public final Set<String> pendingEvictionKeys;
    public final Set<String> pinnedKeys;
    public final AuraTrimmable trimmable;

    public final class Lease implements AutoCloseable {
        public static final int $stable = 8;
        public final String cacheKey;
        public final HtmlWebViewPool pool;
        public boolean released;
        public final C6t6 webView;

        @Override // java.lang.AutoCloseable
        public void close() {
            this.pool.release(this);
        }

        public final String getCacheKey$fbandroid_express_aura_java_com_facebook_aura_webview_webview() {
            return this.cacheKey;
        }

        public final boolean getReleased$fbandroid_express_aura_java_com_facebook_aura_webview_webview() {
            return this.released;
        }

        public final C6t6 getWebView() {
            return this.webView;
        }

        public final void setReleased$fbandroid_express_aura_java_com_facebook_aura_webview_webview(boolean z) {
            this.released = z;
        }

        public Lease(HtmlWebViewPool htmlWebViewPool, String str, C6t6 c6t6) {
            AnonymousClass005.A0x(htmlWebViewPool, str, c6t6);
            this.pool = htmlWebViewPool;
            this.cacheKey = str;
            this.webView = c6t6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void release(Lease lease) {
        if (!lease.released) {
            lease.released = true;
            C6t6 c6t6 = lease.webView;
            if (this.leasedWebViews.remove(c6t6)) {
                if (this.pendingDestruction.remove(c6t6)) {
                    destroyEntry(c6t6);
                }
                if (this.entries.get(lease.cacheKey) == c6t6) {
                    evictPendingIfUnprotected(lease.cacheKey);
                    enforceCap(mostRecentWarmKey());
                }
            }
        }
    }

    private final synchronized void shrinkTo(int i, boolean z) {
        String strPickEvictionVictim;
        if (i < 0) {
            i = 0;
        }
        this.liveCap = i;
        while (this.entries.size() > this.liveCap && (strPickEvictionVictim = pickEvictionVictim(z, null)) != null) {
            C6t6 c6t6Remove = this.entries.remove(strPickEvictionVictim);
            if (c6t6Remove != null) {
                if (z) {
                    this.pinnedKeys.remove(strPickEvictionVictim);
                }
                logSpacePoolEvent("evict-memory-pressure", strPickEvictionVictim, c6t6Remove);
                destroyEntry(c6t6Remove);
            }
        }
    }

    public final synchronized C6t6 acquire(String str, Context context, boolean z) {
        C6t6 c6t6Remove;
        AnonymousClass003.A0u(str, context);
        this.pendingEvictionKeys.remove(str);
        if (z) {
            this.pinnedKeys.add(str);
        }
        this.liveCap = this.defaultCap;
        c6t6Remove = this.entries.remove(str);
        if (c6t6Remove != null) {
            this.entries.put(str, c6t6Remove);
            logSpacePoolEvent("reuse", str, c6t6Remove);
        } else {
            c6t6Remove = requireFactory().invoke(AnonymousClass001.A0I(context), str);
            this.entries.put(str, c6t6Remove);
            logSpacePoolEvent("create", str, c6t6Remove);
            enforceCap(str);
        }
        return c6t6Remove;
    }

    public final synchronized Lease acquireForHost(String str, Context context) {
        C6t6 c6t6Acquire;
        boolean zA1b = AnonymousClass004.A1b(str, context);
        C6t6 c6t6 = this.entries.get(str);
        if (c6t6 != null && this.leasedWebViews.contains(c6t6)) {
            this.entries.remove(str);
            destroyEntry(c6t6);
        }
        c6t6Acquire = acquire(str, context, zA1b);
        this.leasedWebViews.add(c6t6Acquire);
        return new Lease(this, str, c6t6Acquire);
    }

    public final synchronized void evict(String str, C6t6 c6t6) {
        C7384Etj.A0Y(str, 0);
        if ((c6t6 == null || this.entries.get(str) == c6t6) && !isCurrentlyBound(str) && !this.pinnedKeys.contains(str) && !this.evictionGuardedKeys.contains(str)) {
            this.pendingEvictionKeys.remove(str);
            C6t6 c6t6Remove = this.entries.remove(str);
            if (c6t6Remove != null) {
                destroyEntry(c6t6Remove);
            }
        }
    }

    public final synchronized void evictRemovedTabWhenUnbound(String str) {
        C7384Etj.A0Y(str, 0);
        this.pendingEvictionKeys.add(str);
        if (!evictPendingIfUnprotected(str)) {
            logSpacePoolEvent("defer-eviction", str, this.entries.get(str));
        }
    }

    public final synchronized int getPendingDestructionCount$fbandroid_express_aura_java_com_facebook_aura_webview_webview() {
        return this.pendingDestruction.size();
    }

    public final synchronized int getPooledCount$fbandroid_express_aura_java_com_facebook_aura_webview_webview() {
        return this.entries.size();
    }

    public final synchronized boolean hasFreeSlot() {
        return this.entries.size() < this.liveCap;
    }

    public final synchronized void invalidate(String str, C6t6 c6t6) {
        C6t6 c6t6Remove;
        C7384Etj.A0Y(str, 0);
        if ((c6t6 == null || this.entries.get(str) == c6t6) && (c6t6Remove = this.entries.remove(str)) != null) {
            this.pinnedKeys.remove(str);
            this.evictionGuardedKeys.remove(str);
            this.pendingEvictionKeys.remove(str);
            destroyEntry(c6t6Remove);
        }
    }

    public final synchronized boolean isCurrentlyBound(String str) {
        C7384Etj.A0Y(str, 0);
        return AbstractC0878AGe.A0k(this.leasedWebViews, this.entries.get(str));
    }

    public final synchronized boolean isPendingEviction(String str) {
        C7384Etj.A0Y(str, 0);
        return this.pendingEvictionKeys.contains(str);
    }

    public final synchronized C6t6 peek(String str) {
        C7384Etj.A0Y(str, 0);
        return this.entries.get(str);
    }

    public final synchronized void retain(String str) {
        C7384Etj.A0Y(str, 0);
        if (this.pendingEvictionKeys.remove(str)) {
            logSpacePoolEvent("cancel-deferred-eviction", str, this.entries.get(str));
        }
    }

    public final synchronized void setEvictionGuard(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        Set<String> set = this.evictionGuardedKeys;
        if (z) {
            set.add(str);
        } else if (set.remove(str)) {
            evictPendingIfUnprotected(str);
            enforceCap(mostRecentWarmKey());
        }
    }

    public final synchronized void setFactory(G0V<? super Context, ? super String, ? extends C6t6> g0v) {
        C7384Etj.A0Y(g0v, 0);
        if (this.factory == null) {
            this.factory = g0v;
        }
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

    private final void destroyEntry(final C6t6 c6t6) {
        if (this.leasedWebViews.contains(c6t6)) {
            this.pendingDestruction.add(c6t6);
        } else {
            this.mainHandler.post(new Runnable() { // from class: com.facebook.aura.webview.HtmlWebViewPool.destroyEntry.1
                @Override // java.lang.Runnable
                public final void run() {
                    ViewGroup viewGroup;
                    try {
                        c6t6.stopLoading();
                        ViewParent parent = c6t6.getParent();
                        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                            viewGroup.removeView(c6t6);
                        }
                        c6t6.clearFocus();
                        c6t6.setTag(null);
                        c6t6.destroy();
                    } catch (RuntimeException e) {
                        CFK.A0A(HtmlWebViewPool.TAG, "Failed to destroy pooled WebView", e);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enforceCap(String str) {
        while (this.entries.size() > this.liveCap) {
            String strPickEvictionVictim = pickEvictionVictim(false, str);
            if (strPickEvictionVictim == null && (strPickEvictionVictim = pickEvictionVictim(true, str)) == null) {
                return;
            }
            C6t6 c6t6Remove = this.entries.remove(strPickEvictionVictim);
            if (c6t6Remove != null) {
                this.pinnedKeys.remove(strPickEvictionVictim);
                logSpacePoolEvent("evict-cap", strPickEvictionVictim, c6t6Remove);
                destroyEntry(c6t6Remove);
            }
        }
    }

    public static /* synthetic */ void evict$default(HtmlWebViewPool htmlWebViewPool, String str, C6t6 c6t6, int i, Object obj) {
        if ((i & 2) != 0) {
            c6t6 = null;
        }
        htmlWebViewPool.evict(str, c6t6);
    }

    private final boolean evictPendingIfUnprotected(String str) {
        if (!this.pendingEvictionKeys.contains(str) || isCurrentlyBound(str) || this.evictionGuardedKeys.contains(str)) {
            return false;
        }
        this.pendingEvictionKeys.remove(str);
        this.pinnedKeys.remove(str);
        C6t6 c6t6Remove = this.entries.remove(str);
        logSpacePoolEvent(c6t6Remove == null ? "evict-removed-tab-miss" : "evict-removed-tab", str, c6t6Remove);
        if (c6t6Remove == null) {
            return true;
        }
        destroyEntry(c6t6Remove);
        return true;
    }

    public static /* synthetic */ void invalidate$default(HtmlWebViewPool htmlWebViewPool, String str, C6t6 c6t6, int i, Object obj) {
        if ((i & 2) != 0) {
            c6t6 = null;
        }
        htmlWebViewPool.invalidate(str, c6t6);
    }

    private final void logSpacePoolEvent(String str, String str2, C6t6 c6t6) {
        if (C60O.A1X(str2, HtmlSpacesWebViewKt.SPACE_CACHE_KEY_PREFIX)) {
            this.entries.size();
            isCurrentlyBound(str2);
            this.pendingEvictionKeys.contains(str2);
        }
    }

    private final String mostRecentWarmKey() {
        if (this.liveCap <= 0) {
            return null;
        }
        Set<String> setKeySet = this.entries.keySet();
        C7384Etj.A0U(setKeySet);
        Object next = null;
        if (setKeySet instanceof List) {
            List list = (List) setKeySet;
            if (!list.isEmpty()) {
                next = list.get(C60O.A00(list));
            }
        } else {
            Iterator<String> it = setKeySet.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
            }
        }
        return (String) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String pickEvictionVictim(boolean z, String str) {
        for (String str2 : this.entries.keySet()) {
            C7384Etj.A0U(str2);
            String str3 = str2;
            if (!isCurrentlyBound(str3) && !C7384Etj.areEqual(str3, str) && !this.evictionGuardedKeys.contains(str3) && (z || !this.pinnedKeys.contains(str3))) {
                return str3;
            }
        }
        return null;
    }

    private final G0V<Context, String, C6t6> requireFactory() {
        G0V g0v = this.factory;
        if (g0v != null) {
            return g0v;
        }
        throw C3cG.A0Q("HtmlWebViewPool factory not set \u2014 call setFactory() before acquire");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        AuraMemoryPressure.INSTANCE.unregister(this.trimmable);
        synchronized (this) {
            Iterator itA1R = C60P.A1R(this.entries);
            while (itA1R.hasNext()) {
                C6t6 c6t6 = (C6t6) itA1R.next();
                C7384Etj.A0X(c6t6);
                destroyEntry(c6t6);
            }
            this.entries.clear();
            this.pinnedKeys.clear();
            this.evictionGuardedKeys.clear();
            this.pendingEvictionKeys.clear();
            this.factory = null;
        }
    }

    public final class Companion {
        public final HtmlWebViewPool getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HtmlWebViewPool) abstractC3358CGz.A03(HtmlWebViewPool.class, HtmlWebViewPool$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMemoryPressure(AuraMemoryPressureLevel auraMemoryPressureLevel) {
        int iOrdinal = auraMemoryPressureLevel.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 2) {
                shrinkTo(1, true);
            } else {
                if (iOrdinal != 1 && iOrdinal != 3) {
                    throw C3cG.A0q();
                }
                shrinkTo(0, true);
            }
        }
    }

    public /* synthetic */ HtmlWebViewPool(C06H c06h) {
        this();
    }

    public HtmlWebViewPool() {
        int i = AuraMemoryBudget.INSTANCE.isLowRamDevice() ? 1 : 2;
        this.defaultCap = i;
        this.entries = C60O.A15(4);
        this.leasedWebViews = C60O.A13();
        this.pendingDestruction = C60O.A13();
        this.liveCap = i;
        this.pinnedKeys = C60O.A13();
        this.evictionGuardedKeys = C60O.A13();
        this.pendingEvictionKeys = C60O.A13();
        this.mainHandler = C60O.A02();
        AuraTrimmable auraTrimmable = new AuraTrimmable() { // from class: com.facebook.aura.webview.HtmlWebViewPool$trimmable$1
            @Override // com.facebook.aura.memory.AuraTrimmable
            public final void onMemoryPressure(AuraMemoryPressureLevel auraMemoryPressureLevel) {
                C7384Etj.A0Y(auraMemoryPressureLevel, 0);
                this.this$0.onMemoryPressure(auraMemoryPressureLevel);
            }
        };
        this.trimmable = auraTrimmable;
        AuraMemoryPressure.INSTANCE.register(auraTrimmable);
    }
}
