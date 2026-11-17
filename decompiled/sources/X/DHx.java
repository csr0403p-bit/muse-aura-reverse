package X;

import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.QuickEventImpl;

/* loaded from: classes5.dex */
public final class DHx implements EventBuilder {
    public static final ThreadLocal<DHx> A02 = new ThreadLocal<>();
    public QuickEventImpl A00;
    public DHu A01;

    @Override // com.facebook.quicklog.EventBuilder
    public final boolean isSampled() {
        return true;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final void report() {
        QuickEventImpl quickEventImpl = this.A00;
        if (quickEventImpl != null) {
            DHu dHu = this.A01;
            if (dHu == null) {
                throw C3cG.A0Q("Required value was null.");
            }
            DI8.A02("qpl.sendMarkEvent", Integer.valueOf(quickEventImpl.mMarkerId));
            try {
                if (dHu.A0W.isMarkerBlocked(quickEventImpl.mMarkerId)) {
                    dHu.A07.A08(DHu.A07(dHu), quickEventImpl.mMarkerId, dHu.A06.now());
                } else {
                    DHu.A07(dHu).A00(quickEventImpl);
                    DHu.A0R(quickEventImpl, dHu, true);
                }
            } finally {
                DI8.A00();
            }
        }
        this.A00 = null;
        this.A01 = null;
        A02.set(this);
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder setActionId(short s) {
        QuickEventImpl quickEventImpl = this.A00;
        if (quickEventImpl == null) {
            throw BV4.A0U();
        }
        quickEventImpl.A0J = s;
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder setLevel(int i) {
        QuickEventImpl quickEventImpl = this.A00;
        if (quickEventImpl == null) {
            throw BV4.A0U();
        }
        quickEventImpl.A00 = i;
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, double d) {
        C7384Etj.A0Y(str, 0);
        QuickEventImpl quickEventImpl = this.A00;
        if (quickEventImpl != null) {
            quickEventImpl.A0R.A09(str, d);
            return this;
        }
        throw BV4.A0U();
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, int i) {
        C7384Etj.A0Y(str, 0);
        QuickEventImpl quickEventImpl = this.A00;
        if (quickEventImpl != null) {
            quickEventImpl.A0R.A0A(str, i);
            return this;
        }
        throw BV4.A0U();
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, long j) {
        C7384Etj.A0Y(str, 0);
        QuickEventImpl quickEventImpl = this.A00;
        if (quickEventImpl != null) {
            quickEventImpl.A0R.A0B(str, j);
            return this;
        }
        throw BV4.A0U();
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        QuickEventImpl quickEventImpl = this.A00;
        if (quickEventImpl != null) {
            quickEventImpl.A0R.A0C(str, str2);
            return this;
        }
        throw BV4.A0U();
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        QuickEventImpl quickEventImpl = this.A00;
        if (quickEventImpl != null) {
            quickEventImpl.A0R.A0D(str, z);
            return this;
        }
        throw BV4.A0U();
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, double[] dArr) {
        AnonymousClass003.A0u(str, dArr);
        QuickEventImpl quickEventImpl = this.A00;
        if (quickEventImpl != null) {
            quickEventImpl.A0R.A0E(str, dArr);
            return this;
        }
        throw BV4.A0U();
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, int[] iArr) {
        AnonymousClass003.A0u(str, iArr);
        QuickEventImpl quickEventImpl = this.A00;
        if (quickEventImpl != null) {
            quickEventImpl.A0R.A0F(str, iArr);
            return this;
        }
        throw BV4.A0U();
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, long[] jArr) {
        AnonymousClass003.A0u(str, jArr);
        QuickEventImpl quickEventImpl = this.A00;
        if (quickEventImpl != null) {
            quickEventImpl.A0R.A0G(str, jArr);
            return this;
        }
        throw BV4.A0U();
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, String[] strArr) {
        AnonymousClass003.A0u(str, strArr);
        QuickEventImpl quickEventImpl = this.A00;
        if (quickEventImpl != null) {
            quickEventImpl.A0R.A0I(strArr, str);
            return this;
        }
        throw BV4.A0U();
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, boolean[] zArr) {
        AnonymousClass003.A0u(str, zArr);
        QuickEventImpl quickEventImpl = this.A00;
        if (quickEventImpl != null) {
            quickEventImpl.A0R.A0H(str, zArr);
            return this;
        }
        throw BV4.A0U();
    }
}
