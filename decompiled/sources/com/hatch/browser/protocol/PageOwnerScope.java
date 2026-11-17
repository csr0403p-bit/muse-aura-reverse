package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C60R;
import X.C7384Etj;
import X.HwO;

/* loaded from: classes6.dex */
public final class PageOwnerScope {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public String browserContextId;
    public long generation;
    public NativePageIdentity nativePage;
    public PageStorageMode storageMode;
    public BrowserTaskBinding task;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PageOwnerScope) {
                PageOwnerScope pageOwnerScope = (PageOwnerScope) obj;
                if (!C7384Etj.areEqual(this.task, pageOwnerScope.task) || !C7384Etj.areEqual(this.nativePage, pageOwnerScope.nativePage) || this.generation != pageOwnerScope.generation || this.storageMode != pageOwnerScope.storageMode || !C7384Etj.areEqual(this.browserContextId, pageOwnerScope.browserContextId)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setNativePage(NativePageIdentity nativePageIdentity) {
        C7384Etj.A0Y(nativePageIdentity, 0);
        this.nativePage = nativePageIdentity;
    }

    public final void setStorageMode(PageStorageMode pageStorageMode) {
        C7384Etj.A0Y(pageStorageMode, 0);
        this.storageMode = pageStorageMode;
    }

    public final void setTask(BrowserTaskBinding browserTaskBinding) {
        C7384Etj.A0Y(browserTaskBinding, 0);
        this.task = browserTaskBinding;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* renamed from: copy-bdvP6-E$default, reason: not valid java name */
    public static /* synthetic */ PageOwnerScope m3658copybdvP6E$default(PageOwnerScope pageOwnerScope, BrowserTaskBinding browserTaskBinding, NativePageIdentity nativePageIdentity, long j, PageStorageMode pageStorageMode, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            browserTaskBinding = pageOwnerScope.task;
        }
        if ((i & 2) != 0) {
            nativePageIdentity = pageOwnerScope.nativePage;
        }
        if ((i & 4) != 0) {
            j = pageOwnerScope.generation;
        }
        if ((i & 8) != 0) {
            pageStorageMode = pageOwnerScope.storageMode;
        }
        if ((i & 16) != 0) {
            str = pageOwnerScope.browserContextId;
        }
        return pageOwnerScope.m3660copybdvP6E(browserTaskBinding, nativePageIdentity, j, pageStorageMode, str);
    }

    public final BrowserTaskBinding component1() {
        return this.task;
    }

    public final NativePageIdentity component2() {
        return this.nativePage;
    }

    /* renamed from: component3-s-VKNKU, reason: not valid java name */
    public final long m3659component3sVKNKU() {
        return this.generation;
    }

    public final PageStorageMode component4() {
        return this.storageMode;
    }

    public final String component5() {
        return this.browserContextId;
    }

    public final String getBrowserContextId() {
        return this.browserContextId;
    }

    /* renamed from: getGeneration-s-VKNKU, reason: not valid java name */
    public final long m3661getGenerationsVKNKU() {
        return this.generation;
    }

    public final NativePageIdentity getNativePage() {
        return this.nativePage;
    }

    public final PageStorageMode getStorageMode() {
        return this.storageMode;
    }

    public final BrowserTaskBinding getTask() {
        return this.task;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.storageMode, C60R.A00(this.generation, AnonymousClass005.A0F(this.nativePage, AnonymousClass005.A0E(this.task)))) + AnonymousClass006.A0G(this.browserContextId);
    }

    public final void setBrowserContextId(String str) {
        this.browserContextId = str;
    }

    /* renamed from: setGeneration-VKZWuLQ, reason: not valid java name */
    public final void m3662setGenerationVKZWuLQ(long j) {
        this.generation = j;
    }

    public String toString() {
        BrowserTaskBinding browserTaskBinding = this.task;
        NativePageIdentity nativePageIdentity = this.nativePage;
        String strA00 = HwO.A00(this.generation);
        PageStorageMode pageStorageMode = this.storageMode;
        String str = this.browserContextId;
        StringBuilder sbA0f = C3cG.A0f(browserTaskBinding, "PageOwnerScope(task=");
        sbA0f.append(", nativePage=");
        sbA0f.append(nativePageIdentity);
        sbA0f.append(", generation=");
        sbA0f.append(strA00);
        sbA0f.append(", storageMode=");
        sbA0f.append(pageStorageMode);
        return C3cJ.A0N(", browserContextId=", str, sbA0f);
    }

    public PageOwnerScope(BrowserTaskBinding browserTaskBinding, NativePageIdentity nativePageIdentity, long j, PageStorageMode pageStorageMode, String str) {
        AnonymousClass005.A0y(browserTaskBinding, nativePageIdentity, pageStorageMode);
        this.task = browserTaskBinding;
        this.nativePage = nativePageIdentity;
        this.generation = j;
        this.storageMode = pageStorageMode;
        this.browserContextId = str;
    }

    /* renamed from: copy-bdvP6-E, reason: not valid java name */
    public final PageOwnerScope m3660copybdvP6E(BrowserTaskBinding browserTaskBinding, NativePageIdentity nativePageIdentity, long j, PageStorageMode pageStorageMode, String str) {
        AnonymousClass005.A0y(browserTaskBinding, nativePageIdentity, pageStorageMode);
        return new PageOwnerScope(browserTaskBinding, nativePageIdentity, j, pageStorageMode, str);
    }

    public /* synthetic */ PageOwnerScope(BrowserTaskBinding browserTaskBinding, NativePageIdentity nativePageIdentity, long j, PageStorageMode pageStorageMode, String str, C06H c06h) {
        this(browserTaskBinding, nativePageIdentity, j, pageStorageMode, str);
    }
}
