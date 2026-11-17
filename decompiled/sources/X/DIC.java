package X;

import com.facebook.quicklog.EventBuilder;

/* loaded from: classes5.dex */
public final class DIC implements EventBuilder {
    public static final EventBuilder A00;
    public static final DIC A01;

    @Override // com.facebook.quicklog.EventBuilder
    public final void report() {
    }

    static {
        DIC dic = new DIC();
        A01 = dic;
        A00 = dic;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final boolean isSampled() {
        return false;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder setActionId(short s) {
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder setLevel(int i) {
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, double d) {
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, int i) {
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, long j) {
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, String str2) {
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, boolean z) {
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, double[] dArr) {
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, int[] iArr) {
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, long[] jArr) {
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, String[] strArr) {
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, boolean[] zArr) {
        return this;
    }
}
