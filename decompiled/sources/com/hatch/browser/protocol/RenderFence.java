package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class RenderFence {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ RenderFence[] $VALUES;
    public static final RenderFence BEST_EFFORT;
    public static final Companion Companion;
    public static final RenderFence NONE;
    public static final RenderFence REQUIRED;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        RenderFence renderFence = new RenderFence(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 0);
        NONE = renderFence;
        RenderFence renderFence2 = new RenderFence("BEST_EFFORT", 1);
        BEST_EFFORT = renderFence2;
        RenderFence renderFence3 = new RenderFence("REQUIRED", 2);
        REQUIRED = renderFence3;
        RenderFence[] renderFenceArr = {renderFence, renderFence2, renderFence3};
        $VALUES = renderFenceArr;
        $ENTRIES = C3cG.A0w(renderFenceArr);
        Companion = new Companion();
    }

    public static Ey9<RenderFence> getEntries() {
        return $ENTRIES;
    }

    public static RenderFence valueOf(String str) {
        return (RenderFence) Enum.valueOf(RenderFence.class, str);
    }

    public static RenderFence[] values() {
        return (RenderFence[]) $VALUES.clone();
    }

    public RenderFence(String str, int i) {
    }
}
