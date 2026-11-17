package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.util.Arrays;

/* renamed from: X.7nE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7nE {
    public static final C7nE A01 = new C7nE("", 0, 0);
    public final C7nF A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7nE) {
            return Ht0.A00(this.A00, ((C7nE) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return this.A00.toString();
    }

    public C7nE(final String str, final int i, final int i2) {
        this.A00 = new C7nF(str, i, i2) { // from class: X.7nD
            public final int A00;
            public final int A01;
            public final String A02;

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C7nD) {
                        C7nD c7nD = (C7nD) obj;
                        if (!Ht0.A00(this.A02, c7nD.A02) || this.A01 != c7nD.A01 || this.A00 != c7nD.A00) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                String str2 = this.A02;
                Integer numValueOf = Integer.valueOf(this.A01);
                Integer numValueOf2 = Integer.valueOf(this.A00);
                Float fValueOf = Float.valueOf(1.0f);
                return Arrays.hashCode(new Object[]{str2, numValueOf, numValueOf2, fValueOf, 0, 0, 0, fValueOf});
            }

            public final String toString() {
                StringBuilder sbA0x = C60O.A0x("DisplayShapeCompat{ spec=");
                String str2 = this.A02;
                sbA0x.append(str2 != null ? Integer.valueOf(str2.hashCode()) : HatchCcvLoggingKt.NO_POSTAL_FIELD);
                sbA0x.append(" displayWidth=");
                sbA0x.append(this.A01);
                sbA0x.append(" displayHeight=");
                sbA0x.append(this.A00);
                sbA0x.append(" physicalPixelDisplaySizeRatio=");
                sbA0x.append(1.0f);
                sbA0x.append(" rotation=");
                sbA0x.append(0);
                sbA0x.append(" offsetX=");
                sbA0x.append(0);
                sbA0x.append(" offsetY=");
                sbA0x.append(0);
                sbA0x.append(" scale=");
                sbA0x.append(1.0f);
                return AnonymousClass001.A0v("}", sbA0x);
            }

            {
                this.A02 = str;
                this.A01 = i;
                this.A00 = i2;
            }
        };
    }
}
