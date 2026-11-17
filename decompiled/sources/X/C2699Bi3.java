package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.Bi3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2699Bi3 extends AbstractC2401BaE {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Matrix A03;
    public final Rect A04;
    public final BiW A05;
    public final C2771Bkn A06;
    public final List<BeX> A07;
    public final Executor A08;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC2401BaE) {
                C2699Bi3 c2699Bi3 = (C2699Bi3) ((AbstractC2401BaE) obj);
                if (this.A08.equals(c2699Bi3.A08)) {
                    BiW biW = this.A05;
                    BiW biW2 = c2699Bi3.A05;
                    if (biW != null ? biW.equals(biW2) : biW2 == null) {
                        C2771Bkn c2771Bkn = this.A06;
                        C2771Bkn c2771Bkn2 = c2699Bi3.A06;
                        if (c2771Bkn != null ? c2771Bkn.equals(c2771Bkn2) : c2771Bkn2 == null) {
                            if (!this.A04.equals(c2699Bi3.A04) || !this.A03.equals(c2699Bi3.A03) || this.A02 != c2699Bi3.A02 || this.A01 != c2699Bi3.A01 || this.A00 != c2699Bi3.A00 || !this.A07.equals(c2699Bi3.A07)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((BV6.A08(this.A03, BV6.A08(this.A04, ((((((this.A08.hashCode() ^ 1000003) * 1000003) * 1000003) ^ AnonymousClass006.A0D(this.A05)) * 1000003) ^ C3cH.A02(this.A06)) * 1000003)) ^ this.A02) * 1000003) ^ this.A01) * 1000003) ^ this.A00) * 1000003) ^ this.A07.hashCode();
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("TakePictureRequest{appExecutor=");
        sbA0x.append(this.A08);
        sbA0x.append(", inMemoryCallback=");
        sbA0x.append((Object) null);
        sbA0x.append(", onDiskCallback=");
        sbA0x.append(this.A05);
        sbA0x.append(", outputFileOptions=");
        sbA0x.append(this.A06);
        sbA0x.append(", cropRect=");
        sbA0x.append(this.A04);
        sbA0x.append(", sensorToBufferTransform=");
        sbA0x.append(this.A03);
        sbA0x.append(", rotationDegrees=");
        sbA0x.append(this.A02);
        sbA0x.append(", jpegQuality=");
        sbA0x.append(this.A01);
        sbA0x.append(", captureMode=");
        sbA0x.append(this.A00);
        sbA0x.append(", sessionConfigCameraCaptureCallbacks=");
        return BV8.A0v(this.A07, sbA0x);
    }

    public C2699Bi3(Matrix matrix, Rect rect, BiW biW, C2771Bkn c2771Bkn, List list, Executor executor, int i, int i2, int i3) {
        if (executor == null) {
            throw BV4.A0a("Null appExecutor");
        }
        this.A08 = executor;
        this.A05 = biW;
        this.A06 = c2771Bkn;
        if (rect == null) {
            throw BV4.A0a("Null cropRect");
        }
        this.A04 = rect;
        this.A03 = matrix;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
        if (list == null) {
            throw BV4.A0a("Null sessionConfigCameraCaptureCallbacks");
        }
        this.A07 = list;
    }
}
