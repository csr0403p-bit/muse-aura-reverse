package com.facebook.aura.localbrowser;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.C06H;
import X.C3cG;
import X.C79;
import X.C9hr;
import X.C9iL;
import X.Ey9;
import X.F0C;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes2.dex */
public final class LocalBrowserTaskOutcome {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LocalBrowserTaskOutcome[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final LocalBrowserTaskOutcome ABANDONED;
    public static final LocalBrowserTaskOutcome BROWSER_LOST;
    public static final Companion Companion;
    public static final LocalBrowserTaskOutcome FAILED_TO_START;
    public static final LocalBrowserTaskOutcome IDLE;
    public static final LocalBrowserTaskOutcome INTERRUPTED;
    public static final LocalBrowserTaskOutcome STOPPED;
    public final boolean leavesRunToJarvis;

    public final class Companion {
        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(LocalBrowserTaskOutcome.$cachedSerializer$delegate);
        }

        public final C9hr<LocalBrowserTaskOutcome> serializer() {
            return AnonymousClass001.A12(LocalBrowserTaskOutcome.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        boolean z = false;
        int i = 1;
        LocalBrowserTaskOutcome localBrowserTaskOutcome = new LocalBrowserTaskOutcome("INTERRUPTED", 0, true);
        INTERRUPTED = localBrowserTaskOutcome;
        C06H c06h = null;
        LocalBrowserTaskOutcome localBrowserTaskOutcome2 = new LocalBrowserTaskOutcome("IDLE", i, z, i, c06h);
        IDLE = localBrowserTaskOutcome2;
        LocalBrowserTaskOutcome localBrowserTaskOutcome3 = new LocalBrowserTaskOutcome("FAILED_TO_START", 2, true);
        FAILED_TO_START = localBrowserTaskOutcome3;
        LocalBrowserTaskOutcome localBrowserTaskOutcome4 = new LocalBrowserTaskOutcome("BROWSER_LOST", 3, true);
        BROWSER_LOST = localBrowserTaskOutcome4;
        LocalBrowserTaskOutcome localBrowserTaskOutcome5 = new LocalBrowserTaskOutcome("STOPPED", 4, false, i, c06h);
        STOPPED = localBrowserTaskOutcome5;
        LocalBrowserTaskOutcome localBrowserTaskOutcome6 = new LocalBrowserTaskOutcome("ABANDONED", 5, z, i, c06h);
        ABANDONED = localBrowserTaskOutcome6;
        LocalBrowserTaskOutcome[] localBrowserTaskOutcomeArr = {localBrowserTaskOutcome, localBrowserTaskOutcome2, localBrowserTaskOutcome3, localBrowserTaskOutcome4, localBrowserTaskOutcome5, localBrowserTaskOutcome6};
        $VALUES = localBrowserTaskOutcomeArr;
        $ENTRIES = C3cG.A0w(localBrowserTaskOutcomeArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTaskOutcome$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalBrowserTaskOutcome._init_$_anonymous_();
            }
        });
    }

    public static Ey9<LocalBrowserTaskOutcome> getEntries() {
        return $ENTRIES;
    }

    public static LocalBrowserTaskOutcome valueOf(String str) {
        return (LocalBrowserTaskOutcome) Enum.valueOf(LocalBrowserTaskOutcome.class, str);
    }

    public static LocalBrowserTaskOutcome[] values() {
        return (LocalBrowserTaskOutcome[]) $VALUES.clone();
    }

    public final boolean getLeavesRunToJarvis() {
        return this.leavesRunToJarvis;
    }

    public LocalBrowserTaskOutcome(String str, int i, boolean z) {
        this.leavesRunToJarvis = z;
    }

    public static final /* synthetic */ C9hr _init_$_anonymous_() {
        return C9iL.A01("com.facebook.aura.localbrowser.LocalBrowserTaskOutcome", values());
    }

    public /* synthetic */ LocalBrowserTaskOutcome(String str, int i, boolean z, int i2, C06H c06h) {
        this(str, i, AnonymousClass001.A1P(i2, z));
    }
}
