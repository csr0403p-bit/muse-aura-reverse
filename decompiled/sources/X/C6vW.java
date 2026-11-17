package X;

/* renamed from: X.6vW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6vW implements C6PP {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C6vW) && this.A00 == ((C6vW) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return FGI.A0G("AppWidgetId(appWidgetId=", ')', this.A00);
    }

    public C6vW(int i) {
        this.A00 = i;
    }
}
