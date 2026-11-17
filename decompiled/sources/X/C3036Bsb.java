package X;

import java.util.Locale;

/* renamed from: X.Bsb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3036Bsb implements InterfaceC3048Bss {
    @Override // X.InterfaceC3048Bss
    public final String A7l(String str, String str2) {
        return String.format(Locale.US, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 %s;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(%s, %s);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n", str2, str, str, str2);
    }
}
