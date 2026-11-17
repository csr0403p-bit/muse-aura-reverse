package X;

import com.facebook.hyperthrift.HyperThriftBase;
import com.facebook.logginginfra.falco.Checksum;
import com.facebook.logginginfra.falco.Identity;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: X.DJk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4971DJk {
    public final Checksum A00;
    public final Identity A01;
    public final C4981DJy A02;
    public final DK5 A03;
    public final C4977DJu A04;
    public final DK7 A05;
    public final C4975DJq A06;

    public static String A01(Identity identity) throws NoSuchAlgorithmException {
        String strValueOf;
        C4974DJp c4974DJp;
        if (identity != null) {
            HyperThriftBase hyperThriftBase = (HyperThriftBase) identity.A00(0);
            HyperThriftBase hyperThriftBase2 = (HyperThriftBase) identity.A00(1);
            if (hyperThriftBase != null) {
                StringBuilder sbA0w = C60O.A0w();
                sbA0w.append(hyperThriftBase.A00(0));
                sbA0w.append("_");
                strValueOf = C8j3.A14(hyperThriftBase.A00(1), sbA0w);
            } else if (hyperThriftBase2 != null) {
                strValueOf = (String) hyperThriftBase2.A00(2);
                if (strValueOf == null || strValueOf.trim().equals("")) {
                    Number number = (Number) hyperThriftBase2.A00(0);
                    if (number != null) {
                        strValueOf = String.valueOf(number.longValue());
                    }
                }
            }
            C4973DJo c4973DJo = AbstractC4982DJz.A00;
            Charset charset = Charsets.UTF_8;
            if (c4973DJo.supportsClone) {
                try {
                    c4974DJp = new C4974DJp((MessageDigest) c4973DJo.prototype.clone(), c4973DJo.bytes);
                } catch (CloneNotSupportedException unused) {
                }
            } else {
                try {
                    c4974DJp = new C4974DJp(MessageDigest.getInstance(c4973DJo.prototype.getAlgorithm()), c4973DJo.bytes);
                } catch (NoSuchAlgorithmException e) {
                    throw BV4.A0N(e);
                }
            }
            byte[] bytes = strValueOf.toString().getBytes(charset);
            int length = bytes.length;
            Preconditions.checkState(!c4974DJp.A00, "Cannot re-use a Hasher after calling hash() on it");
            MessageDigest messageDigest = c4974DJp.A02;
            messageDigest.update(bytes, 0, length);
            Preconditions.checkState(!c4974DJp.A00, "Cannot re-use a Hasher after calling hash() on it");
            c4974DJp.A00 = true;
            int i = c4974DJp.A01;
            int digestLength = messageDigest.getDigestLength();
            byte[] bArrDigest = messageDigest.digest();
            if (i != digestLength) {
                bArrDigest = Arrays.copyOf(bArrDigest, i);
            }
            return new DKM(bArrDigest).toString();
        }
        return null;
    }

    public C4971DJk(Checksum checksum, Identity identity, C4981DJy c4981DJy, DK5 dk5, C4977DJu c4977DJu, DK7 dk7, C4975DJq c4975DJq) {
        this.A01 = identity;
        this.A04 = c4977DJu;
        this.A03 = dk5;
        this.A05 = dk7;
        this.A06 = c4975DJq;
        this.A02 = c4981DJy;
        this.A00 = checksum;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0042 A[Catch: all -> 0x00a0, TRY_LEAVE, TryCatch #0 {all -> 0x00a0, blocks: (B:4:0x003b, B:7:0x0042, B:10:0x004a, B:11:0x0059, B:12:0x006d, B:14:0x0080, B:17:0x0087, B:21:0x0097), top: B:30:0x003b, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C4971DJk A00(X.DKG r13, com.facebook.logginginfra.falco.Identity r14, X.C14 r15, X.InterfaceC4945DGj r16, java.util.concurrent.atomic.AtomicReference r17) throws java.lang.IllegalAccessException, java.security.NoSuchAlgorithmException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            java.lang.String r4 = A01(r14)
            java.lang.String r3 = "qpl_sampling_config_v2.%s"
            android.content.Context r1 = r15.A00
            X.CIk r0 = X.DK6.A00
            X.AnonymousClass003.A0u(r1, r0)
            r0 = 1045170971(0x3e4c0b1b, float:0.19926111)
            java.io.File r2 = X.AbstractC3416CMe.A00(r1, r0)
            r2.mkdirs()
            java.util.Locale r1 = java.util.Locale.US
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[]{r4}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            java.lang.String r0 = java.lang.String.format(r1, r3, r0)
            java.io.File r0 = X.C3cG.A0O(r2, r0)
            java.io.FileInputStream r1 = X.BV4.A0H(r0)
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r0.<init>(r1)
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream
            r2.<init>(r0)
            r4 = 0
            if (r17 == 0) goto L42
            java.lang.Object r0 = r17.get()     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L42
            goto L9c
        L42:
            int r0 = r2.readInt()     // Catch: java.lang.Throwable -> La0
            java.lang.String r3 = "QPLConfig"
            if (r0 == r5) goto L59
            java.lang.String r1 = "unsupported config version %d"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> La0
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> La0
            X.CFK.A0F(r3, r1, r0)     // Catch: java.lang.Throwable -> La0
            goto L9c
        L59:
            X.DVl r8 = new X.DVl     // Catch: java.lang.Throwable -> La0
            r8.<init>()     // Catch: java.lang.Throwable -> La0
            r8.A01 = r4     // Catch: java.lang.Throwable -> La0
            r8.A00 = r2     // Catch: java.lang.Throwable -> La0
            r9 = 10000000(0x989680, double:4.9406565E-317)
            r11 = 100000(0x186a0, double:4.94066E-319)
            X.DVa r7 = new X.DVa     // Catch: java.lang.Throwable -> La0
            r7.<init>(r8, r9, r11)     // Catch: java.lang.Throwable -> La0
            java.lang.String r6 = "com.facebook.logginginfra.falco.SetQPLConfigDirective"
            X.DKJ r5 = r13.A00     // Catch: com.facebook.thrift.TException -> L96 java.lang.Throwable -> La0
            com.facebook.hyperthrift.reflect.GeneratedHyperThriftClassLookup r1 = r13.A01     // Catch: com.facebook.thrift.TException -> L96 java.lang.Throwable -> La0
            X.DVY r0 = new X.DVY     // Catch: com.facebook.thrift.TException -> L96 java.lang.Throwable -> La0
            r0.<init>(r5, r1, r7)     // Catch: com.facebook.thrift.TException -> L96 java.lang.Throwable -> La0
            com.facebook.hyperthrift.HyperThriftBase r1 = X.DVY.A00(r0, r6)     // Catch: com.facebook.thrift.TException -> L96 java.lang.Throwable -> La0
            com.facebook.logginginfra.falco.SetQPLConfigDirective r1 = (com.facebook.logginginfra.falco.SetQPLConfigDirective) r1     // Catch: com.facebook.thrift.TException -> L96 java.lang.Throwable -> La0
            if (r17 == 0) goto L87
            java.lang.Object r0 = r17.get()     // Catch: com.facebook.thrift.TException -> L96 java.lang.Throwable -> La0
            if (r0 == 0) goto L87
            goto L9c
        L87:
            X.DJm r0 = new X.DJm     // Catch: com.facebook.thrift.TException -> L96 java.lang.Throwable -> La0
            r5 = r16
            r0.<init>(r5)     // Catch: com.facebook.thrift.TException -> L96 java.lang.Throwable -> La0
            X.DJk r0 = r0.A00(r1)     // Catch: com.facebook.thrift.TException -> L96 java.lang.Throwable -> La0
            r2.close()
            return r0
        L96:
            r1 = move-exception
            java.lang.String r0 = "Failed to deserialize config - file may be corrupted"
            X.CFK.A08(r3, r0, r1)     // Catch: java.lang.Throwable -> La0
        L9c:
            r2.close()
            return r4
        La0:
            r1 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> La5
            throw r1
        La5:
            r0 = move-exception
            X.C2E.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4971DJk.A00(X.DKG, com.facebook.logginginfra.falco.Identity, X.C14, X.DGj, java.util.concurrent.atomic.AtomicReference):X.DJk");
    }
}
