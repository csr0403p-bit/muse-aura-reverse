package X;

import android.graphics.RuntimeShader;
import java.util.List;

/* loaded from: classes6.dex */
public final class Hz4 {
    public final C5219Ddb A00;
    public final List<RuntimeShader> A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Hz4) {
                Hz4 hz4 = (Hz4) obj;
                if (!this.A00.equals(hz4.A00) || !C7384Etj.areEqual(this.A01, hz4.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A00) + C3cH.A02(this.A01);
    }

    public final String toString() {
        return C3cJ.A0L(this.A01, ", compiledShaders=", C3cG.A0f(this.A00, "ShaderHostLayoutData(shaderConfig="));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Hz4(C5219Ddb c5219Ddb, List<? extends RuntimeShader> list) {
        this.A00 = c5219Ddb;
        this.A01 = list;
    }
}
