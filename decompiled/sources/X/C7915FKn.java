package X;

import android.graphics.Color;
import java.util.Collection;
import java.util.List;

/* renamed from: X.FKn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7915FKn {
    public final float A00;
    public final float A01;
    public final int A02;
    public final List<C7916FKo> A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7915FKn) {
                C7915FKn c7915FKn = (C7915FKn) obj;
                if (!this.A03.equals(c7915FKn.A03) || Float.compare(this.A01, c7915FKn.A01) != 0 || this.A02 != c7915FKn.A02 || Float.compare(this.A00, c7915FKn.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A06((AnonymousClass005.A02(AnonymousClass005.A0E(this.A03), this.A01) + this.A02) * 31, this.A00);
    }

    public final String toString() {
        List<C7916FKo> list = this.A03;
        float f = this.A01;
        int i = this.A02;
        float f2 = this.A00;
        StringBuilder sbA0f = C3cG.A0f(list, "BoxShadowStyle(layers=");
        sbA0f.append(", cornerRadius=");
        sbA0f.append(f);
        sbA0f.append(", corners=");
        sbA0f.append(i);
        sbA0f.append(", borderWidth=");
        sbA0f.append(f2);
        return BV7.A10(sbA0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7915FKn(List<C7916FKo> list, float f, int i, float f2) {
        boolean z;
        this.A03 = list;
        this.A01 = f;
        this.A02 = f2;
        this.A00 = i;
        boolean z2 = true;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            for (C7916FKo c7916FKo : list) {
                if (!c7916FKo.A05 && Color.alpha(c7916FKo.A04) != 0) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        this.A05 = z;
        List<C7916FKo> list2 = this.A03;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z2 = false;
        } else {
            for (C7916FKo c7916FKo2 : list2) {
                if (c7916FKo2.A05 && Color.alpha(c7916FKo2.A04) != 0) {
                    break;
                }
            }
            z2 = false;
        }
        this.A04 = z2;
    }
}
