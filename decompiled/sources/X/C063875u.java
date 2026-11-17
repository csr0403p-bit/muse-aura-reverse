package X;

import android.content.Context;

/* renamed from: X.75u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C063875u implements C76X {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C063875u) && this.A00 == ((C063875u) obj).A00);
    }

    @Override // X.C76X
    public final long ADo(Context context) {
        long color = context.getColor(this.A00) << 32;
        long j = B6A.A01;
        return color;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return FGI.A0G("ResourceColorProvider(resId=", ')', this.A00);
    }

    public C063875u(int i) {
        this.A00 = i;
    }
}
