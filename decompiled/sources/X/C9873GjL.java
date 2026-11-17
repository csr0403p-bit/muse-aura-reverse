package X;

import com.facebook.acra.util.JavaProcFileReader;

/* renamed from: X.GjL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9873GjL extends C9868GjG {
    public static final long serialVersionUID = 1;

    @Override // X.C9868GjG, X.AbstractC9870GjI
    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("[map type; class ");
        BV6.A18(this._class, sbA0x);
        C8j3.A1K(sbA0x);
        sbA0x.append(this._keyType);
        sbA0x.append(JavaProcFileReader.LS_SYMLINK_ARROW);
        return BV8.A0u(this._valueType, sbA0x);
    }
}
