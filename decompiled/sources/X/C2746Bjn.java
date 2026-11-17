package X;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* renamed from: X.Bjn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2746Bjn {
    public final Bl6 A00;

    public static C2746Bjn A00(Object obj) {
        if (obj == null) {
            return null;
        }
        OutputConfiguration outputConfiguration = (OutputConfiguration) obj;
        return new C2746Bjn(Build.VERSION.SDK_INT >= 33 ? C2757Bjy.A00(outputConfiguration) : new BkE(new BkG(outputConfiguration)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2746Bjn) {
            return this.A00.equals(((C2746Bjn) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C2746Bjn(Bl6 bl6) {
        this.A00 = bl6;
    }

    public C2746Bjn(int i, Surface surface) {
        Bl6 bkE;
        if (Build.VERSION.SDK_INT >= 33) {
            bkE = new C2757Bjy(i, surface);
        } else {
            bkE = new BkE(new BkG(new OutputConfiguration(i, surface)));
        }
        this.A00 = bkE;
    }
}
