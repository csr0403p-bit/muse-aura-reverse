package X;

import android.content.pm.PackageInfo;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* renamed from: X.D9c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4857D9c {
    public static final InterfaceC4498CxV A00 = new C4868D9n();
    public static final InterfaceC4498CxV A01 = new C4861D9g();

    public static byte[] A02(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStreamA0F = BV4.A0F();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStreamA0F, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStreamA0F.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static void A01(PackageInfo packageInfo, File file) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(BV4.A0I(C3cG.A0O(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x042a A[Catch: all -> 0x04da, PHI: r12
  0x042a: PHI (r12v7 byte[]) = (r12v6 byte[]), (r12v8 byte[]) binds: [B:119:0x032d, B:133:0x03ad] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #23 {all -> 0x04da, blocks: (B:34:0x00d6, B:36:0x00e6, B:44:0x0143, B:54:0x018f, B:87:0x0268, B:88:0x0284, B:90:0x028a, B:91:0x0298, B:95:0x02a3, B:97:0x02af, B:98:0x02bf, B:100:0x02d0, B:99:0x02c3, B:101:0x02d5, B:103:0x02db, B:163:0x04ba, B:168:0x04d9, B:167:0x04d6, B:118:0x0327, B:120:0x032f, B:122:0x0337, B:124:0x0341, B:125:0x037c, B:127:0x0382, B:128:0x0394, B:130:0x039a, B:131:0x03a4, B:132:0x03a7, B:134:0x03af, B:136:0x03b7, B:138:0x03c0, B:139:0x03f6, B:141:0x03fc, B:142:0x0409, B:144:0x040f, B:145:0x0418, B:146:0x041b, B:148:0x042a, B:150:0x0430, B:151:0x045a, B:155:0x046a, B:157:0x047c, B:160:0x0499, B:162:0x049f, B:165:0x04c4, B:159:0x0486, B:109:0x02fc, B:113:0x030f, B:117:0x0322, B:37:0x00f3, B:40:0x0100, B:41:0x0133, B:43:0x013a, B:114:0x0314, B:115:0x0320, B:57:0x01a1, B:58:0x01aa, B:60:0x01b0, B:61:0x01ba, B:77:0x021b, B:79:0x0229, B:107:0x02fa, B:106:0x02f7, B:84:0x0258, B:86:0x025f, B:104:0x02e9, B:81:0x024d, B:83:0x0253, B:78:0x0222, B:62:0x01be, B:63:0x01d5, B:65:0x01db, B:69:0x01f8, B:71:0x01fc, B:73:0x0200, B:74:0x020f, B:75:0x0211, B:76:0x0214, B:47:0x0155, B:49:0x0170, B:50:0x017c, B:51:0x017f, B:53:0x0186, B:110:0x0301, B:111:0x030d), top: B:274:0x00d6, inners: #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v24, types: [X.D9l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v7, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(android.content.Context r28, X.InterfaceC4498CxV r29, java.util.concurrent.Executor r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 1472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC4857D9c.A00(android.content.Context, X.CxV, java.util.concurrent.Executor, boolean):void");
    }
}
