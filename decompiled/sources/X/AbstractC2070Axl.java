package X;

import android.graphics.Shader;
import android.os.Build;

/* renamed from: X.Axl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2070Axl {
    public static final Shader.TileMode A00(int i) {
        if (i != 0) {
            if (i == 1) {
                return Shader.TileMode.REPEAT;
            }
            if (i == 2) {
                return Shader.TileMode.MIRROR;
            }
            if (i == 3 && Build.VERSION.SDK_INT >= 31) {
                return AzH.A00();
            }
        }
        return Shader.TileMode.CLAMP;
    }
}
