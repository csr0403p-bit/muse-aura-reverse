package X;

import android.util.Size;
import java.util.List;

/* renamed from: X.Baz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2423Baz extends Bb0 {
    public final int A00;
    public final String A01;
    public final List<Size> A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Bb0) {
                C2423Baz c2423Baz = (C2423Baz) ((Bb0) obj);
                if (this.A00 != c2423Baz.A00 || !this.A01.equals(c2423Baz.A01) || !this.A02.equals(c2423Baz.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.A00 ^ 1000003) * 1000003) ^ this.A01.hashCode()) * 1000003) ^ this.A02.hashCode();
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ConstantQuality{value=");
        sbA0x.append(this.A00);
        sbA0x.append(", name=");
        sbA0x.append(this.A01);
        sbA0x.append(", typicalSizes=");
        return BV8.A0v(this.A02, sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/lang/String;Ljava/util/List<Landroid/util/Size;>;)V */
    public C2423Baz(String str, List list, int i) {
        this.A00 = i;
        this.A01 = str;
        if (list == null) {
            throw BV4.A0a("Null typicalSizes");
        }
        this.A02 = list;
    }
}
