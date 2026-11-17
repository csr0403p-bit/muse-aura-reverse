package X;

/* renamed from: X.C7m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3282C7m {
    public static byte[] A00(String str, String str2, String str3) {
        return FGI.A0k("--", str, "\r\nContent-Disposition: ", str2, "\"", str3, "\"\r\nContent-Type: application/binary\r\nContent-Transfer-Encoding: binary\r\n\r\n").getBytes();
    }
}
