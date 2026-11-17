package X;

import java.io.IOException;
import java.io.Serializable;

/* renamed from: X.Glq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9941Glq extends AbstractC9804GhQ implements Serializable {
    public static final long serialVersionUID = 1;

    public abstract int hashCode();

    /* JADX WARN: Removed duplicated region for block: B:66:0x00cc  */
    @Override // X.InterfaceC9786Ggu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AcY(X.AbstractC9919GlE r5, X.AbstractC9842Gii r6) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9941Glq.AcY(X.GlE, X.Gii):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01a5, code lost:
    
        if (r6.A0E(X.EnumC9975Gmp.A0A) != false) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x019f A[Catch: Exception -> 0x01e1, all -> 0x01ea, TryCatch #9 {Exception -> 0x01e1, blocks: (B:20:0x004f, B:22:0x005b, B:23:0x0060, B:25:0x0064, B:28:0x0078, B:30:0x0080, B:34:0x0088, B:36:0x008e, B:48:0x00c4, B:37:0x0092, B:39:0x0098, B:41:0x00a0, B:43:0x00ad, B:44:0x00b3, B:46:0x00b7, B:47:0x00c0, B:53:0x00de, B:55:0x00e3, B:117:0x01cc, B:118:0x01d0, B:49:0x00cd, B:52:0x00d5, B:56:0x00e8, B:58:0x00ee, B:60:0x00f2, B:62:0x00fa, B:63:0x00fd, B:65:0x0103, B:68:0x010d, B:105:0x01b3, B:102:0x01a7, B:104:0x01ab, B:115:0x01c7, B:112:0x01bd, B:114:0x01c3, B:70:0x011b, B:72:0x0125, B:73:0x0128, B:75:0x013a, B:76:0x013c, B:80:0x0152, B:82:0x0160, B:83:0x016a, B:84:0x016c, B:98:0x0199, B:100:0x019f, B:92:0x0189, B:90:0x0185, B:94:0x018d, B:96:0x0195, B:119:0x01d1, B:26:0x006b), top: B:152:0x004f, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01bd A[Catch: Exception -> 0x01e1, all -> 0x01ea, PHI: r1 r5
  0x01bd: PHI (r1v13 X.Gnh) = (r1v8 X.Gnh), (r1v15 X.Gnh) binds: [B:99:0x019d, B:64:0x0101] A[DONT_GENERATE, DONT_INLINE]
  0x01bd: PHI (r5v10 com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) = 
  (r5v4 com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>)
  (r5v1 com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>)
 binds: [B:99:0x019d, B:64:0x0101] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #9 {Exception -> 0x01e1, blocks: (B:20:0x004f, B:22:0x005b, B:23:0x0060, B:25:0x0064, B:28:0x0078, B:30:0x0080, B:34:0x0088, B:36:0x008e, B:48:0x00c4, B:37:0x0092, B:39:0x0098, B:41:0x00a0, B:43:0x00ad, B:44:0x00b3, B:46:0x00b7, B:47:0x00c0, B:53:0x00de, B:55:0x00e3, B:117:0x01cc, B:118:0x01d0, B:49:0x00cd, B:52:0x00d5, B:56:0x00e8, B:58:0x00ee, B:60:0x00f2, B:62:0x00fa, B:63:0x00fd, B:65:0x0103, B:68:0x010d, B:105:0x01b3, B:102:0x01a7, B:104:0x01ab, B:115:0x01c7, B:112:0x01bd, B:114:0x01c3, B:70:0x011b, B:72:0x0125, B:73:0x0128, B:75:0x013a, B:76:0x013c, B:80:0x0152, B:82:0x0160, B:83:0x016a, B:84:0x016c, B:98:0x0199, B:100:0x019f, B:92:0x0189, B:90:0x0185, B:94:0x018d, B:96:0x0195, B:119:0x01d1, B:26:0x006b), top: B:152:0x004f, outer: #6 }] */
    @Override // X.AbstractC9804GhQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9941Glq.toString():java.lang.String");
    }

    public Object writeReplace() {
        try {
            byte[] bArrA08 = AbstractC9989GnF.A02.A08(this);
            C9923GlK c9923GlK = new C9923GlK();
            c9923GlK.json = bArrA08;
            return c9923GlK;
        } catch (IOException e) {
            throw BV4.A0Q(FGI.A0d("Failed to JDK serialize `", C3cI.A0Y(this), "` value: ", e.getMessage()), e);
        }
    }
}
