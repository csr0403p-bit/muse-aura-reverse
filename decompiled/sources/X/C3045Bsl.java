package X;

/* renamed from: X.Bsl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3045Bsl extends AbstractC3027BsM {
    public C3045Bsl() {
        super("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
    }
}
