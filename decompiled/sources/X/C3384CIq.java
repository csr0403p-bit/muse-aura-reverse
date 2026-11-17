package X;

import java.util.Map;

/* renamed from: X.CIq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3384CIq extends AbstractC3386CIs {
    public final Integer A00;
    public final Map A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC3386CIs) {
                Integer num = this.A00;
                C3384CIq c3384CIq = (C3384CIq) ((AbstractC3386CIs) obj);
                Integer num2 = c3384CIq.A00;
                if (num != null ? num.equals(num2) : num2 == null) {
                    if (this.A01.equals(c3384CIq.A01)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV6.A09(this.A01, (AnonymousClass006.A0D(this.A00) ^ 1000003) * 1000003);
    }

    public final String toString() {
        Integer num = this.A00;
        String strValueOf = String.valueOf(this.A01);
        StringBuilder sbA0f = C3cG.A0f(num, "LocalTestingConfig{defaultSplitInstallErrorCode=");
        sbA0f.append(", splitInstallErrorCodeByModule=");
        sbA0f.append(strValueOf);
        return BV7.A11(sbA0f);
    }

    public /* synthetic */ C3384CIq(Integer num, Map map) {
        this.A00 = num;
        this.A01 = map;
    }
}
