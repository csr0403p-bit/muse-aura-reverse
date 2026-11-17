package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;
import com.facebook.aura.ccv.nativeflow.HatchCheckoutClientKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class PageImageLoadState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PageImageLoadState[] $VALUES;
    public static final Companion Companion;
    public static final PageImageLoadState DECODED;
    public static final PageImageLoadState PENDING;
    public static final PageImageLoadState UNAVAILABLE;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        PageImageLoadState pageImageLoadState = new PageImageLoadState("DECODED", 0);
        DECODED = pageImageLoadState;
        PageImageLoadState pageImageLoadState2 = new PageImageLoadState(HatchCheckoutClientKt.CHECKOUT_STATUS_PENDING, 1);
        PENDING = pageImageLoadState2;
        PageImageLoadState pageImageLoadState3 = new PageImageLoadState("UNAVAILABLE", 2);
        UNAVAILABLE = pageImageLoadState3;
        PageImageLoadState[] pageImageLoadStateArr = {pageImageLoadState, pageImageLoadState2, pageImageLoadState3};
        $VALUES = pageImageLoadStateArr;
        $ENTRIES = C3cG.A0w(pageImageLoadStateArr);
        Companion = new Companion();
    }

    public static Ey9<PageImageLoadState> getEntries() {
        return $ENTRIES;
    }

    public static PageImageLoadState valueOf(String str) {
        return (PageImageLoadState) Enum.valueOf(PageImageLoadState.class, str);
    }

    public static PageImageLoadState[] values() {
        return (PageImageLoadState[]) $VALUES.clone();
    }

    public PageImageLoadState(String str, int i) {
    }
}
