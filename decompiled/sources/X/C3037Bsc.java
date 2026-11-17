package X;

import java.util.Locale;

/* renamed from: X.Bsc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3037Bsc implements InterfaceC3048Bss {
    @Override // X.InterfaceC3048Bss
    public final String A7l(String str, String str2) {
        return String.format(Locale.US, "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(%s, %s);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}", str, str2, str, str2);
    }
}
