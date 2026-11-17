package X;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.facebook.aura.analytics.timespent.config.MC;
import com.facebook.aura.commands.health.MC;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderStateMachine;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* loaded from: classes5.dex */
public final class BqQ {
    public static final Charset A0K;
    public static final SimpleDateFormat A0L;
    public static final boolean A0M = Log.isLoggable("ExifInterface", 3);
    public static final byte[] A0N;
    public static final byte[] A0O;
    public static final byte[] A0P;
    public static final byte[] A0Q;
    public static final byte[] A0R;
    public static final byte[] A0S;
    public static final byte[] A0T;
    public static final byte[] A0U;
    public static final byte[] A0V;
    public static final byte[] A0W;
    public static final byte[] A0X;
    public static final byte[] A0Y;
    public static final byte[] A0Z;
    public static final byte[] A0a;
    public static final byte[] A0b;
    public static final byte[] A0c;
    public static final byte[] A0d;
    public static final byte[] A0e;
    public static final byte[] A0f;
    public static final byte[] A0g;
    public static final byte[] A0h;
    public static final byte[] A0i;
    public static final int[] A0j;
    public static final int[] A0k;
    public static final int[] A0l;
    public static final String[] A0m;
    public static final Bqa[][] A0n;
    public static final SimpleDateFormat A0o;
    public static final HashMap<Integer, Integer> A0p;
    public static final List<Integer> A0q;
    public static final List<Integer> A0r;
    public static final Set<String> A0s;
    public static final Pattern A0t;
    public static final Pattern A0u;
    public static final Pattern A0v;
    public static final Pattern A0w;
    public static final Bqa[] A0x;
    public static final Bqa[] A0y;
    public static final Bqa[] A0z;
    public static final Bqa[] A10;
    public static final Bqa[] A11;
    public static final Bqa[] A12;
    public static final Bqa[] A13;
    public static final Bqa[] A14;
    public static final Bqa[] A15;
    public static final Bqa[] A16;
    public static final HashMap<Integer, Bqa>[] A17;
    public static final HashMap<String, Bqa>[] A18;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public AssetManager.AssetInputStream A06;
    public C2970BqR A07;
    public FileDescriptor A08;
    public String A09;
    public ByteOrder A0A;
    public Set<Integer> A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public byte[] A0G;
    public int A0H;
    public int A0I;
    public final HashMap<String, C2970BqR>[] A0J;

    public static C2970BqR A04(BqQ bqQ, int i) {
        return C2970BqR.A02(bqQ.A0A, new long[]{i});
    }

    private void A0B() {
        int i = 0;
        while (true) {
            HashMap<String, C2970BqR>[] mapArr = this.A0J;
            if (i >= 10) {
                return;
            }
            Log.d("ExifInterface", FGI.A0T("The size of tag group[", "]: ", i, mapArr[i].size()));
            Iterator itA0i = C3cG.A0i(mapArr[i]);
            while (itA0i.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0i);
                C2970BqR c2970BqR = (C2970BqR) entryA0l.getValue();
                Log.d("ExifInterface", FGI.A0k("tagName: ", C60O.A0t(entryA0l), ", tagType: ", c2970BqR.toString(), ", tagValue: '", c2970BqR.A08(this.A0A), "'"));
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0C() {
        /*
            r9 = this;
            r8 = 0
            r7 = 5
            r9.A0D(r8, r7)
            r6 = 4
            r9.A0D(r8, r6)
            r9.A0D(r7, r6)
            java.util.HashMap<java.lang.String, X.BqR>[] r3 = r9.A0J
            r4 = 1
            r1 = r3[r4]
            java.lang.String r0 = "PixelXDimension"
            java.lang.Object r2 = r1.get(r0)
            r1 = r3[r4]
            java.lang.String r0 = "PixelYDimension"
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r5 = "ImageLength"
            java.lang.String r4 = "ImageWidth"
            if (r2 == 0) goto L31
            if (r1 == 0) goto L31
            r0 = r3[r8]
            r0.put(r4, r2)
            r0 = r3[r8]
            r0.put(r5, r1)
        L31:
            r0 = r3[r6]
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5f
            r0 = r3[r7]
            X.BqR r1 = A07(r5, r0)
            X.BqR r0 = A07(r4, r0)
            if (r1 == 0) goto L5f
            if (r0 == 0) goto L5f
            int r2 = A02(r1, r9)
            int r1 = A02(r0, r9)
            r0 = 512(0x200, float:7.175E-43)
            if (r2 > r0) goto L5f
            if (r1 > r0) goto L5f
            r0 = r3[r7]
            r3[r6] = r0
            java.util.HashMap r0 = X.BV4.A0u()
            r3[r7] = r0
        L5f:
            r0 = r3[r6]
            X.BqR r1 = A07(r5, r0)
            X.BqR r0 = A07(r4, r0)
            if (r1 == 0) goto L7b
            if (r0 == 0) goto L7b
            int r2 = A02(r1, r9)
            int r1 = A02(r0, r9)
            r0 = 512(0x200, float:7.175E-43)
            if (r2 > r0) goto L7b
            if (r1 <= r0) goto L82
        L7b:
            java.lang.String r1 = "ExifInterface"
            java.lang.String r0 = "No image meets the size requirements of a thumbnail image."
            android.util.Log.d(r1, r0)
        L82:
            java.lang.String r3 = "ThumbnailOrientation"
            java.lang.String r2 = "Orientation"
            r9.A0E(r8, r3, r2)
            java.lang.String r1 = "ThumbnailImageLength"
            r9.A0E(r8, r1, r5)
            java.lang.String r0 = "ThumbnailImageWidth"
            r9.A0E(r8, r0, r4)
            r9.A0E(r7, r3, r2)
            r9.A0E(r7, r1, r5)
            r9.A0E(r7, r0, r4)
            r9.A0E(r6, r2, r3)
            r9.A0E(r6, r5, r1)
            r9.A0E(r6, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BqQ.A0C():void");
    }

    public static void A0O(BqQ bqQ, Object obj, AbstractMap abstractMap) {
        abstractMap.put(obj, C2970BqR.A02(bqQ.A0A, new long[]{0}));
    }

    public static void A0P(BqQ bqQ, String str) {
        if (bqQ.A0c(str) == null) {
            bqQ.A0J[0].put(str, C2970BqR.A02(bqQ.A0A, new long[]{0}));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0182, code lost:
    
        r17.A00 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0185, code lost:
    
        if (r1 == 4) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0189, code lost:
    
        if (r1 == 9) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x018d, code lost:
    
        if (r1 == 13) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0191, code lost:
    
        if (r1 == 14) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0193, code lost:
    
        r6 = new X.C2974BqZ(r3, java.nio.ByteOrder.BIG_ENDIAN);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x019e, code lost:
    
        if (r3.markSupported() == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01a0, code lost:
    
        r6.A04.mark(Integer.MAX_VALUE);
        r1 = r17.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01ac, code lost:
    
        if (r1 == 12) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01b0, code lost:
    
        if (r1 == 15) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01b3, code lost:
    
        if (r1 != 7) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01b5, code lost:
    
        A0K(r6);
        r0 = A07("MakerNote", r10[1]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01c1, code lost:
    
        if (r0 == null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01c3, code lost:
    
        r7 = new X.C2974BqZ(r0.A03);
        r7.A04.mark(Integer.MAX_VALUE);
        r7.A02 = r17.A0A;
        r9 = X.BqQ.A0W;
        r8 = new byte[6];
        r7.readFully(r8);
        r7.A01(0);
        r4 = X.BqQ.A0X;
        r1 = new byte[10];
        r7.readFully(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01ed, code lost:
    
        if (java.util.Arrays.equals(r8, r9) == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01ef, code lost:
    
        r0 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01f6, code lost:
    
        if (java.util.Arrays.equals(r1, r4) == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01f8, code lost:
    
        r0 = 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01fa, code lost:
    
        r7.A01(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01fd, code lost:
    
        A0M(r7, 6);
        r7 = r10[7].get("PreviewImageStart");
        r4 = r10[7].get("PreviewImageLength");
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0211, code lost:
    
        if (r7 == null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0213, code lost:
    
        if (r4 == null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0215, code lost:
    
        r10[5].put("JPEGInterchangeFormat", r7);
        r10[5].put("JPEGInterchangeFormatLength", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0224, code lost:
    
        r1 = A07("AspectFrame", r10[8]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x022e, code lost:
    
        if (r1 == null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0230, code lost:
    
        r7 = (int[]) r1.A07(r17.A0A);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0238, code lost:
    
        if (r7 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x023c, code lost:
    
        if (r7.length != 4) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x023e, code lost:
    
        r4 = r7[2];
        r1 = r7[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0243, code lost:
    
        if (r4 <= r1) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0245, code lost:
    
        r3 = r7[3];
        r0 = r7[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x024a, code lost:
    
        if (r3 <= r0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x024c, code lost:
    
        r1 = (r4 - r1) + 1;
        r0 = (r3 - r0) + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0252, code lost:
    
        if (r1 >= r0) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0254, code lost:
    
        r1 = r1 + r0;
        r0 = r1 - r0;
        r1 = r1 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0258, code lost:
    
        r4 = A05(r17, r1);
        r3 = A05(r17, r0);
        r10[0].put("ImageWidth", r4);
        r10[0].put("ImageLength", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0271, code lost:
    
        if (r1 != 10) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0275, code lost:
    
        if (X.BqQ.A0M == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0277, code lost:
    
        android.util.Log.d("ExifInterface", X.AnonymousClass007.A0a("getRw2Attributes starting with: ", r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0282, code lost:
    
        A0K(r6);
        r1 = A07("JpgFromRaw", r10[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x028d, code lost:
    
        if (r1 == null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x028f, code lost:
    
        A0H(new X.C2971BqS(r1.A03), (int) r1.A02, 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x029d, code lost:
    
        r4 = r10[0].get("ISO");
        r0 = r10[1].get("PhotographicSensitivity");
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02ae, code lost:
    
        if (r4 == null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02b0, code lost:
    
        if (r0 != null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02b2, code lost:
    
        r10[1].put("PhotographicSensitivity", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02b8, code lost:
    
        A0K(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02bc, code lost:
    
        A0L(r6, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02c0, code lost:
    
        android.util.Log.w("ExifInterface", X.FGI.A0M("Invalid aspect frame values. frame=", java.util.Arrays.toString(r7)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02cf, code lost:
    
        r6.A01(r17.A01);
        A0G(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02e2, code lost:
    
        r6 = java.nio.ByteOrder.BIG_ENDIAN;
        r7 = new X.C2971BqS(r3, r6);
        r1 = r17.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02ec, code lost:
    
        if (r1 != 4) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02ee, code lost:
    
        A0H(r7, 0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02f5, code lost:
    
        if (r1 != 13) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02f9, code lost:
    
        if (X.BqQ.A0M == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02fb, code lost:
    
        android.util.Log.d("ExifInterface", X.AnonymousClass007.A0a("getPngAttributes starting with: ", r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0306, code lost:
    
        r7.A02 = r6;
        r6 = r7.A01;
        r7.A00(8);
        r11 = false;
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0311, code lost:
    
        r8 = r7.readInt();
        r10 = r7.readInt();
        r3 = r7.A01;
        r4 = (r3 + r8) + 4;
        r3 = r3 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0322, code lost:
    
        if (r3 != 16) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0327, code lost:
    
        if (r10 == 1229472850) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x032e, code lost:
    
        if (r10 == 1229278788) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0333, code lost:
    
        if (r10 != 1700284774) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0335, code lost:
    
        if (r11 != false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0337, code lost:
    
        r17.A01 = r3;
        r11 = new byte[r8];
        r7.readFully(r11);
        r10 = r7.readInt();
        r8 = new java.util.zip.CRC32();
        r8.update(com.facebook.aura.network.transport.flipper.FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE);
        r8.update(25944);
        r8.update(6641737);
        r8.update(1700284774);
        r8.update(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0362, code lost:
    
        if (((int) r8.getValue()) != r10) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0364, code lost:
    
        A0Y(r11, 0);
        A0C();
        A0G(new X.C2971BqS(r11));
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0377, code lost:
    
        if (r10 != 1767135348) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0379, code lost:
    
        if (r9 != false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x037b, code lost:
    
        r3 = X.BqQ.A0Y;
        r1 = r3.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x037e, code lost:
    
        if (r8 < r1) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0380, code lost:
    
        r0 = new byte[r1];
        r7.readFully(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0389, code lost:
    
        if (java.util.Arrays.equals(r0, r3) == false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x038b, code lost:
    
        r0 = r7.A01 - r6;
        r8 = r8 - r1;
        r15 = new byte[r8];
        r7.readFully(r15);
        r17.A07 = new X.C2970BqR(r0, r15, 1, r8);
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03a1, code lost:
    
        r7.A00(r4 - r7.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03a7, code lost:
    
        if (r11 == false) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03a9, code lost:
    
        if (r9 != false) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x03b4, code lost:
    
        r3 = X.C60O.A0w();
        r3.append("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: ");
        r3.append(r10);
        r3.append(", calculated CRC value: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x03d1, code lost:
    
        throw X.BV4.A0K(X.BV4.A0m(r3, r8.getValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03d2, code lost:
    
        r17.A0D = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x03d6, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03e2, code lost:
    
        if (r1 != 9) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03e4, code lost:
    
        r11 = X.BqQ.A0M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x03e8, code lost:
    
        if (r11 == false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x03ea, code lost:
    
        android.util.Log.d("ExifInterface", X.AnonymousClass007.A0a("getRafAttributes starting with: ", r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x03f3, code lost:
    
        r7.A00(84);
        r0 = new byte[4];
        r1 = new byte[4];
        r3 = new byte[4];
        r7.readFully(r0);
        r7.readFully(r1);
        r7.readFully(r3);
        r8 = java.nio.ByteBuffer.wrap(r0).getInt();
        r1 = java.nio.ByteBuffer.wrap(r1).getInt();
        r4 = java.nio.ByteBuffer.wrap(r3).getInt();
        r3 = new byte[r1];
        r7.A00(r8 - r7.A01);
        r7.readFully(r3);
        A0H(new X.C2971BqS(r3), r8, 5);
        r7.A00(r4 - r7.A01);
        r7.A02 = r6;
        r6 = r7.readInt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0441, code lost:
    
        if (r11 == false) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0443, code lost:
    
        android.util.Log.d("ExifInterface", X.FGI.A0H("numberOfDirectoryEntry: ", r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x044c, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x044d, code lost:
    
        if (r4 >= r6) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x044f, code lost:
    
        r3 = r7.readUnsignedShort();
        r1 = r7.readUnsignedShort();
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0459, code lost:
    
        if (r3 != 273) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x045b, code lost:
    
        r8 = r7.readShort();
        r6 = r7.readShort();
        r4 = A05(r17, r8);
        r3 = A05(r17, r6);
        r10[0].put("ImageLength", r4);
        r10[0].put("ImageWidth", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x047a, code lost:
    
        r7.A00(r1);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0480, code lost:
    
        if (r11 == false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0482, code lost:
    
        android.util.Log.d("ExifInterface", X.FGI.A0T("Updated to length: ", ", width: ", r8, r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0491, code lost:
    
        if (r1 != 14) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0495, code lost:
    
        if (X.BqQ.A0M == false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0497, code lost:
    
        android.util.Log.d("ExifInterface", X.AnonymousClass007.A0a("getWebpAttributes starting with: ", r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x04a2, code lost:
    
        r7.A02 = java.nio.ByteOrder.LITTLE_ENDIAN;
        r7.A00(4);
        r3 = r7.readInt() + 8;
        r7.A00(4);
        r4 = 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x04b6, code lost:
    
        r7.A00(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x04b9, code lost:
    
        r1 = new byte[4];
        r7.readFully(r1);
        r6 = r7.readInt();
        r4 = r4 + 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x04ca, code lost:
    
        if (java.util.Arrays.equals(X.BqQ.A0c, r1) == false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x04cc, code lost:
    
        r3 = new byte[r6];
        r7.readFully(r3);
        r1 = X.BqQ.A0T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x04d7, code lost:
    
        if (A0Z(r3, r1) == false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x04d9, code lost:
    
        r3 = java.util.Arrays.copyOfRange(r3, r1.length, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x04de, code lost:
    
        r17.A01 = r4;
        A0Y(r3, 0);
        A0G(new X.C2971BqS(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x04ef, code lost:
    
        if ((r6 % 2) != 1) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x04f1, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x04f3, code lost:
    
        r4 = r4 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x04f4, code lost:
    
        if (r4 == r3) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x04f6, code lost:
    
        if (r4 > r3) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x04ff, code lost:
    
        throw X.BV4.A0K("Encountered WebP file with invalid chunk size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0500, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:?, code lost:
    
        throw X.BV4.A0K("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:?, code lost:
    
        throw X.C60O.A0i("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:?, code lost:
    
        throw new java.io.IOException("Encountered corrupt PNG file.", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:?, code lost:
    
        throw new java.io.IOException("Encountered corrupt WebP file.", r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0525 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:335:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00de A[Catch: IOException | UnsupportedOperationException -> 0x0514, IOException | UnsupportedOperationException -> 0x0514, all -> 0x0529, TRY_LEAVE, TryCatch #12 {IOException | UnsupportedOperationException -> 0x0514, blocks: (B:3:0x0002, B:5:0x0012, B:6:0x0027, B:8:0x002c, B:10:0x0032, B:13:0x003d, B:15:0x0040, B:59:0x00d0, B:59:0x00d0, B:117:0x0182, B:117:0x0182, B:125:0x0193, B:125:0x0193, B:127:0x01a0, B:127:0x01a0, B:133:0x01b5, B:133:0x01b5, B:135:0x01c3, B:135:0x01c3, B:141:0x01fa, B:141:0x01fa, B:142:0x01fd, B:142:0x01fd, B:145:0x0215, B:145:0x0215, B:146:0x0224, B:146:0x0224, B:148:0x0230, B:148:0x0230, B:150:0x023a, B:150:0x023a, B:152:0x023e, B:152:0x023e, B:154:0x0245, B:154:0x0245, B:156:0x024c, B:156:0x024c, B:158:0x0254, B:158:0x0254, B:159:0x0258, B:159:0x0258, B:174:0x02c0, B:174:0x02c0, B:138:0x01f2, B:138:0x01f2, B:175:0x02cf, B:175:0x02cf, B:162:0x0273, B:162:0x0273, B:164:0x0277, B:164:0x0277, B:165:0x0282, B:165:0x0282, B:167:0x028f, B:167:0x028f, B:168:0x029d, B:168:0x029d, B:171:0x02b2, B:171:0x02b2, B:172:0x02b8, B:172:0x02b8, B:173:0x02bc, B:173:0x02bc, B:176:0x02da, B:176:0x02da, B:259:0x050d, B:259:0x050d, B:177:0x02e2, B:177:0x02e2, B:179:0x02ee, B:179:0x02ee, B:182:0x02f7, B:182:0x02f7, B:184:0x02fb, B:184:0x02fb, B:185:0x0306, B:185:0x0306, B:186:0x0311, B:186:0x0311, B:211:0x03ad, B:211:0x03ad, B:213:0x03d1, B:213:0x03d1, B:207:0x03a1, B:207:0x03a1, B:214:0x03d2, B:214:0x03d2, B:196:0x0337, B:196:0x0337, B:198:0x0364, B:198:0x0364, B:212:0x03b4, B:212:0x03b4, B:202:0x037b, B:202:0x037b, B:204:0x0380, B:204:0x0380, B:206:0x038b, B:206:0x038b, B:216:0x03d7, B:216:0x03d7, B:219:0x03e4, B:219:0x03e4, B:221:0x03ea, B:221:0x03ea, B:222:0x03f3, B:222:0x03f3, B:224:0x0443, B:224:0x0443, B:227:0x044f, B:227:0x044f, B:229:0x045b, B:229:0x045b, B:232:0x0482, B:232:0x0482, B:230:0x047a, B:230:0x047a, B:235:0x0493, B:235:0x0493, B:237:0x0497, B:237:0x0497, B:238:0x04a2, B:238:0x04a2, B:240:0x04b9, B:240:0x04b9, B:242:0x04cc, B:242:0x04cc, B:244:0x04d9, B:244:0x04d9, B:245:0x04de, B:245:0x04de, B:246:0x04ec, B:246:0x04ec, B:248:0x04f1, B:248:0x04f1, B:249:0x04f3, B:249:0x04f3, B:239:0x04b6, B:239:0x04b6, B:256:0x0501, B:256:0x0501, B:253:0x04f9, B:253:0x04f9, B:254:0x04ff, B:254:0x04ff, B:60:0x00d7, B:60:0x00d7, B:58:0x00cc, B:58:0x00cc, B:79:0x0115, B:79:0x0115, B:258:0x050a, B:258:0x050a, B:87:0x0133, B:87:0x0133, B:91:0x013c, B:91:0x013c, B:93:0x0142, B:93:0x0142, B:96:0x014b, B:96:0x014b, B:98:0x0150, B:98:0x0150, B:100:0x0156, B:100:0x0156, B:102:0x015a, B:102:0x015a, B:104:0x015e, B:104:0x015e, B:106:0x0168, B:106:0x0168, B:61:0x00de, B:61:0x00de, B:114:0x0179, B:114:0x0179, B:71:0x00f7, B:71:0x00f7, B:18:0x0047, B:11:0x0039), top: B:287:0x0002, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0S(java.io.InputStream r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BqQ.A0S(java.io.InputStream):void");
    }

    private void A0V(String str) {
        int i = 0;
        do {
            this.A0J[i].remove(str);
            i++;
        } while (i < 10);
    }

    public static boolean A0Z(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            return false;
        }
        int length = bArr.length;
        int length2 = bArr2.length;
        if (length < length2) {
            return false;
        }
        for (int i = 0; i < length2; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    static {
        Integer numA0W = BV4.A0W();
        A0r = Arrays.asList(numA0W, 6, 3, 8);
        A0q = Arrays.asList(2, 7, 4, 5);
        A0k = new int[]{8, 8, 8};
        A0j = new int[]{8};
        A0V = new byte[]{-1, -40, -1};
        A0S = new byte[]{102, 116, 121, 112};
        A0R = new byte[]{109, 105, 102, 49};
        A0Q = new byte[]{104, 101, 105, 99};
        A0O = new byte[]{97, 118, 105, 102};
        A0P = new byte[]{97, 118, 105, 115};
        A0W = new byte[]{79, 76, 89, 77, 80, 0};
        A0X = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        A0Z = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        A0Y = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        A0g = new byte[]{82, 73, 70, 70};
        A0h = new byte[]{87, 69, 66, 80};
        A0c = new byte[]{69, 88, 73, 70};
        A0i = new byte[]{-99, 1, 42};
        A0f = BV7.A1a("VP8X");
        A0e = BV7.A1a("VP8L");
        A0d = BV7.A1a("VP8 ");
        A0a = BV7.A1a("ANIM");
        A0b = BV7.A1a("ANMF");
        A0m = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        A0l = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        A0N = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        Bqa[] bqaArr = new Bqa[42];
        A0X("NewSubfileType", bqaArr, HatchLinkOrderStateMachine.MAX_EMAIL_LENGTH, 4, 0);
        A0X("SubfileType", bqaArr, 255, 4, 1);
        bqaArr[2] = new Bqa("ImageWidth", 256, 3, 4);
        bqaArr[3] = new Bqa("ImageLength", 257, 3, 4);
        A0X("BitsPerSample", bqaArr, 258, 3, 4);
        A0X("Compression", bqaArr, 259, 3, 5);
        A0X("PhotometricInterpretation", bqaArr, 262, 3, 6);
        A0X("ImageDescription", bqaArr, 270, 2, 7);
        A0X("Make", bqaArr, 271, 2, 8);
        A0X("Model", bqaArr, 272, 2, 9);
        bqaArr[10] = new Bqa("StripOffsets", 273, 3, 4);
        A0X("Orientation", bqaArr, 274, 3, 11);
        A0X("SamplesPerPixel", bqaArr, 277, 3, 12);
        bqaArr[13] = new Bqa("RowsPerStrip", 278, 3, 4);
        bqaArr[14] = new Bqa("StripByteCounts", 279, 3, 4);
        bqaArr[15] = A08("XResolution", 282, 5);
        bqaArr[16] = A08("YResolution", 283, 5);
        bqaArr[17] = A08("PlanarConfiguration", 284, 3);
        bqaArr[18] = A08("ResolutionUnit", 296, 3);
        bqaArr[19] = A08("TransferFunction", 301, 3);
        bqaArr[20] = A08("Software", 305, 2);
        bqaArr[21] = A08("DateTime", MC.mwa_time_spent_killswitch.__CONFIG__, 2);
        bqaArr[22] = A08("Artist", 315, 2);
        bqaArr[23] = A08("WhitePoint", 318, 5);
        bqaArr[24] = A08("PrimaryChromaticities", 319, 5);
        bqaArr[25] = A08("SubIFDPointer", 330, 4);
        bqaArr[26] = A08("JPEGInterchangeFormat", 513, 4);
        bqaArr[27] = A08("JPEGInterchangeFormatLength", 514, 4);
        bqaArr[28] = A08("YCbCrCoefficients", 529, 5);
        bqaArr[29] = A08("YCbCrSubSampling", 530, 3);
        bqaArr[30] = A08("YCbCrPositioning", MC.wearables_hatch_health_connectors.__CONFIG__, 3);
        bqaArr[31] = A08("ReferenceBlackWhite", 532, 5);
        bqaArr[32] = A08("Copyright", 33432, 2);
        bqaArr[33] = A08("ExifIFDPointer", 34665, 4);
        bqaArr[34] = A08("GPSInfoIFDPointer", 34853, 4);
        bqaArr[35] = new Bqa("SensorTopBorder", 4, 4);
        bqaArr[36] = A08("SensorLeftBorder", 5, 4);
        bqaArr[37] = A08("SensorBottomBorder", 6, 4);
        bqaArr[38] = A08("SensorRightBorder", 7, 4);
        bqaArr[39] = A08("ISO", 23, 3);
        bqaArr[40] = A08("JpgFromRaw", 46, 7);
        bqaArr[41] = A08("Xmp", 700, 1);
        A12 = bqaArr;
        Bqa[] bqaArr2 = new Bqa[74];
        A0X("ExposureTime", bqaArr2, 33434, 5, 0);
        A0X("FNumber", bqaArr2, 33437, 5, 1);
        A0X("ExposureProgram", bqaArr2, 34850, 3, 2);
        A0X("SpectralSensitivity", bqaArr2, 34852, 2, 3);
        A0X("PhotographicSensitivity", bqaArr2, 34855, 3, 4);
        A0X("OECF", bqaArr2, 34856, 7, 5);
        A0X("SensitivityType", bqaArr2, 34864, 3, 6);
        A0X("StandardOutputSensitivity", bqaArr2, 34865, 4, 7);
        A0X("RecommendedExposureIndex", bqaArr2, 34866, 4, 8);
        A0X("ISOSpeed", bqaArr2, 34867, 4, 9);
        A0X("ISOSpeedLatitudeyyy", bqaArr2, 34868, 4, 10);
        A0X("ISOSpeedLatitudezzz", bqaArr2, 34869, 4, 11);
        A0X("ExifVersion", bqaArr2, 36864, 2, 12);
        A0X("DateTimeOriginal", bqaArr2, 36867, 2, 13);
        A0X("DateTimeDigitized", bqaArr2, 36868, 2, 14);
        A0X("OffsetTime", bqaArr2, 36880, 2, 15);
        A0X("OffsetTimeOriginal", bqaArr2, 36881, 2, 16);
        A0X("OffsetTimeDigitized", bqaArr2, 36882, 2, 17);
        A0X("ComponentsConfiguration", bqaArr2, 37121, 7, 18);
        bqaArr2[19] = A08("CompressedBitsPerPixel", 37122, 5);
        bqaArr2[20] = A08("ShutterSpeedValue", 37377, 10);
        bqaArr2[21] = A08("ApertureValue", 37378, 5);
        bqaArr2[22] = A08("BrightnessValue", 37379, 10);
        bqaArr2[23] = A08("ExposureBiasValue", 37380, 10);
        bqaArr2[24] = A08("MaxApertureValue", 37381, 5);
        bqaArr2[25] = A08("SubjectDistance", 37382, 5);
        A0X("MeteringMode", bqaArr2, 37383, 3, 26);
        bqaArr2[27] = A08("LightSource", 37384, 3);
        bqaArr2[28] = A08("Flash", 37385, 3);
        bqaArr2[29] = A08("FocalLength", 37386, 5);
        bqaArr2[30] = A08("SubjectArea", 37396, 3);
        bqaArr2[31] = A08("MakerNote", 37500, 7);
        bqaArr2[32] = A08("UserComment", 37510, 7);
        bqaArr2[33] = A08("SubSecTime", 37520, 2);
        bqaArr2[34] = A08("SubSecTimeOriginal", 37521, 2);
        bqaArr2[35] = A08("SubSecTimeDigitized", 37522, 2);
        bqaArr2[36] = A08("FlashpixVersion", 40960, 7);
        bqaArr2[37] = A08("ColorSpace", 40961, 3);
        bqaArr2[38] = new Bqa("PixelXDimension", 40962, 3, 4);
        bqaArr2[39] = new Bqa("PixelYDimension", 40963, 3, 4);
        bqaArr2[40] = A08("RelatedSoundFile", 40964, 2);
        bqaArr2[41] = A08("InteroperabilityIFDPointer", 40965, 4);
        bqaArr2[42] = A08("FlashEnergy", 41483, 5);
        bqaArr2[43] = A08("SpatialFrequencyResponse", 41484, 7);
        bqaArr2[44] = A08("FocalPlaneXResolution", 41486, 5);
        bqaArr2[45] = A08("FocalPlaneYResolution", 41487, 5);
        bqaArr2[46] = A08("FocalPlaneResolutionUnit", 41488, 3);
        bqaArr2[47] = A08("SubjectLocation", 41492, 3);
        bqaArr2[48] = A08("ExposureIndex", 41493, 5);
        bqaArr2[49] = A08("SensingMethod", 41495, 3);
        bqaArr2[50] = A08("FileSource", 41728, 7);
        bqaArr2[51] = A08("SceneType", 41729, 7);
        bqaArr2[52] = A08("CFAPattern", 41730, 7);
        bqaArr2[53] = A08("CustomRendered", 41985, 3);
        bqaArr2[54] = A08("ExposureMode", 41986, 3);
        bqaArr2[55] = A08("WhiteBalance", 41987, 3);
        bqaArr2[56] = A08("DigitalZoomRatio", 41988, 5);
        bqaArr2[57] = A08("FocalLengthIn35mmFilm", 41989, 3);
        bqaArr2[58] = A08("SceneCaptureType", 41990, 3);
        bqaArr2[59] = A08("GainControl", 41991, 3);
        bqaArr2[60] = A08("Contrast", 41992, 3);
        bqaArr2[61] = A08("Saturation", 41993, 3);
        bqaArr2[62] = A08("Sharpness", 41994, 3);
        bqaArr2[63] = A08("DeviceSettingDescription", 41995, 7);
        bqaArr2[64] = A08("SubjectDistanceRange", 41996, 3);
        bqaArr2[65] = A08("ImageUniqueID", 42016, 2);
        bqaArr2[66] = A08("CameraOwnerName", 42032, 2);
        bqaArr2[67] = A08("BodySerialNumber", 42033, 2);
        bqaArr2[68] = A08("LensSpecification", 42034, 5);
        bqaArr2[69] = A08("LensMake", 42035, 2);
        bqaArr2[70] = A08("LensModel", 42036, 2);
        bqaArr2[71] = A08("Gamma", 42240, 5);
        bqaArr2[72] = A08("DNGVersion", 50706, 1);
        bqaArr2[73] = new Bqa("DefaultCropSize", 50720, 3, 4);
        A0y = bqaArr2;
        Bqa[] bqaArr3 = new Bqa[32];
        A0W("GPSVersionID", bqaArr3, 0, 1);
        A0W("GPSLatitudeRef", bqaArr3, 1, 2);
        bqaArr3[2] = new Bqa("GPSLatitude", 2, 5, 10);
        A0W("GPSLongitudeRef", bqaArr3, 3, 2);
        bqaArr3[4] = new Bqa("GPSLongitude", 4, 5, 10);
        A0W("GPSAltitudeRef", bqaArr3, 5, 1);
        A0W("GPSAltitude", bqaArr3, 6, 5);
        A0W("GPSTimeStamp", bqaArr3, 7, 5);
        A0W("GPSSatellites", bqaArr3, 8, 2);
        A0W("GPSStatus", bqaArr3, 9, 2);
        A0W("GPSMeasureMode", bqaArr3, 10, 2);
        A0W("GPSDOP", bqaArr3, 11, 5);
        A0W("GPSSpeedRef", bqaArr3, 12, 2);
        A0W("GPSSpeed", bqaArr3, 13, 5);
        A0W("GPSTrackRef", bqaArr3, 14, 2);
        A0W("GPSTrack", bqaArr3, 15, 5);
        A0W("GPSImgDirectionRef", bqaArr3, 16, 2);
        A0W("GPSImgDirection", bqaArr3, 17, 5);
        A0W("GPSMapDatum", bqaArr3, 18, 2);
        A0W("GPSDestLatitudeRef", bqaArr3, 19, 2);
        A0W("GPSDestLatitude", bqaArr3, 20, 5);
        A0W("GPSDestLongitudeRef", bqaArr3, 21, 2);
        A0W("GPSDestLongitude", bqaArr3, 22, 5);
        A0W("GPSDestBearingRef", bqaArr3, 23, 2);
        A0W("GPSDestBearing", bqaArr3, 24, 5);
        A0W("GPSDestDistanceRef", bqaArr3, 25, 2);
        A0W("GPSDestDistance", bqaArr3, 26, 5);
        A0W("GPSProcessingMethod", bqaArr3, 27, 7);
        A0W("GPSAreaInformation", bqaArr3, 28, 7);
        A0W("GPSDateStamp", bqaArr3, 29, 2);
        A0W("GPSDifferential", bqaArr3, 30, 3);
        A0W("GPSHPositioningError", bqaArr3, 31, 5);
        A0z = bqaArr3;
        Bqa[] bqaArr4 = new Bqa[1];
        A0X("InteroperabilityIndex", bqaArr4, 1, 2, 0);
        A10 = bqaArr4;
        Bqa[] bqaArr5 = new Bqa[37];
        A0X("NewSubfileType", bqaArr5, HatchLinkOrderStateMachine.MAX_EMAIL_LENGTH, 4, 0);
        A0X("SubfileType", bqaArr5, 255, 4, 1);
        bqaArr5[2] = new Bqa("ThumbnailImageWidth", 256, 3, 4);
        bqaArr5[3] = new Bqa("ThumbnailImageLength", 257, 3, 4);
        A0X("BitsPerSample", bqaArr5, 258, 3, 4);
        A0X("Compression", bqaArr5, 259, 3, 5);
        A0X("PhotometricInterpretation", bqaArr5, 262, 3, 6);
        A0X("ImageDescription", bqaArr5, 270, 2, 7);
        A0X("Make", bqaArr5, 271, 2, 8);
        A0X("Model", bqaArr5, 272, 2, 9);
        bqaArr5[10] = new Bqa("StripOffsets", 273, 3, 4);
        A0X("ThumbnailOrientation", bqaArr5, 274, 3, 11);
        A0X("SamplesPerPixel", bqaArr5, 277, 3, 12);
        bqaArr5[13] = new Bqa("RowsPerStrip", 278, 3, 4);
        bqaArr5[14] = new Bqa("StripByteCounts", 279, 3, 4);
        A0X("XResolution", bqaArr5, 282, 5, 15);
        A0X("YResolution", bqaArr5, 283, 5, 16);
        A0X("PlanarConfiguration", bqaArr5, 284, 3, 17);
        A0X("ResolutionUnit", bqaArr5, 296, 3, 18);
        bqaArr5[19] = A08("TransferFunction", 301, 3);
        bqaArr5[20] = A08("Software", 305, 2);
        bqaArr5[21] = A08("DateTime", MC.mwa_time_spent_killswitch.__CONFIG__, 2);
        bqaArr5[22] = A08("Artist", 315, 2);
        A0X("WhitePoint", bqaArr5, 318, 5, 23);
        bqaArr5[24] = A08("PrimaryChromaticities", 319, 5);
        bqaArr5[25] = A08("SubIFDPointer", 330, 4);
        A0X("JPEGInterchangeFormat", bqaArr5, 513, 4, 26);
        bqaArr5[27] = A08("JPEGInterchangeFormatLength", 514, 4);
        bqaArr5[28] = A08("YCbCrCoefficients", 529, 5);
        bqaArr5[29] = A08("YCbCrSubSampling", 530, 3);
        bqaArr5[30] = A08("YCbCrPositioning", MC.wearables_hatch_health_connectors.__CONFIG__, 3);
        bqaArr5[31] = A08("ReferenceBlackWhite", 532, 5);
        bqaArr5[32] = A08("Copyright", 33432, 2);
        bqaArr5[33] = A08("ExifIFDPointer", 34665, 4);
        bqaArr5[34] = A08("GPSInfoIFDPointer", 34853, 4);
        bqaArr5[35] = A08("DNGVersion", 50706, 1);
        bqaArr5[36] = new Bqa("DefaultCropSize", 50720, 3, 4);
        A11 = bqaArr5;
        Bqa[] bqaArr6 = new Bqa[3];
        A0X("ThumbnailImage", bqaArr6, 256, 7, 0);
        A0X("CameraSettingsIFDPointer", bqaArr6, 8224, 4, 1);
        A0X("ImageProcessingIFDPointer", bqaArr6, 8256, 4, 2);
        A15 = bqaArr6;
        Bqa[] bqaArr7 = new Bqa[2];
        A0X("PreviewImageStart", bqaArr7, 257, 4, 0);
        A0X("PreviewImageLength", bqaArr7, 258, 4, 1);
        A13 = bqaArr7;
        Bqa[] bqaArr8 = new Bqa[1];
        A0X("AspectFrame", bqaArr8, 4371, 3, 0);
        A14 = bqaArr8;
        Bqa[] bqaArr9 = new Bqa[1];
        A0X("ColorSpace", bqaArr9, 55, 3, 0);
        A16 = bqaArr9;
        A0n = new Bqa[][]{bqaArr, bqaArr2, bqaArr3, bqaArr4, bqaArr5, bqaArr, bqaArr6, bqaArr7, bqaArr8, bqaArr9};
        A0x = new Bqa[]{A08("SubIFDPointer", 330, 4), A08("ExifIFDPointer", 34665, 4), A08("GPSInfoIFDPointer", 34853, 4), A08("InteroperabilityIFDPointer", 40965, 4), A08("CameraSettingsIFDPointer", 8224, 1), A08("ImageProcessingIFDPointer", 8256, 1)};
        A17 = new HashMap[10];
        A18 = new HashMap[10];
        A0s = Collections.unmodifiableSet(BV5.A0v(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance"}));
        A0p = BV4.A0u();
        Charset charsetForName = Charset.forName("US-ASCII");
        A0K = charsetForName;
        A0T = "Exif\u0000\u0000".getBytes(charsetForName);
        A0U = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        A0L = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        A0o = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            Bqa[][] bqaArr10 = A0n;
            if (i >= 10) {
                HashMap<Integer, Integer> map = A0p;
                Bqa[] bqaArr11 = A0x;
                BV6.A1E(5, map, bqaArr11[0].A00);
                BV6.A1E(numA0W, map, bqaArr11[1].A00);
                BV6.A1E(2, map, bqaArr11[2].A00);
                BV6.A1E(3, map, bqaArr11[3].A00);
                BV6.A1E(7, map, bqaArr11[4].A00);
                BV6.A1E(8, map, bqaArr11[5].A00);
                A0w = Pattern.compile(".*[1-9].*");
                A0v = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                A0t = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                A0u = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            HashMap<Integer, Bqa>[] mapArr = A17;
            mapArr[i] = BV4.A0u();
            HashMap<String, Bqa>[] mapArr2 = A18;
            mapArr2[i] = BV4.A0u();
            for (Bqa bqa : bqaArr10[i]) {
                BV6.A1E(bqa, mapArr[i], bqa.A00);
                mapArr2[i].put(bqa.A03, bqa);
            }
            i++;
        }
    }

    public static double A00(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split(CustomConnectorRegisterRepositoryKt.ROOT_PATH, -1);
            double d = Double.parseDouble(BV6.A0r(strArrSplit2, 0)) / Double.parseDouble(BV6.A0r(strArrSplit2, 1));
            String[] strArrSplit3 = strArrSplit[1].split(CustomConnectorRegisterRepositoryKt.ROOT_PATH, -1);
            double d2 = Double.parseDouble(BV6.A0r(strArrSplit3, 0)) / Double.parseDouble(BV6.A0r(strArrSplit3, 1));
            String[] strArrSplit4 = strArrSplit[2].split(CustomConnectorRegisterRepositoryKt.ROOT_PATH, -1);
            double d3 = d + (d2 / 60.0d) + ((Double.parseDouble(BV6.A0r(strArrSplit4, 0)) / Double.parseDouble(BV6.A0r(strArrSplit4, 1))) / 3600.0d);
            if (str2.equals("S") || str2.equals("W")) {
                return -d3;
            }
            if (str2.equals("N") || str2.equals("E")) {
                return d3;
            }
            throw BV4.A0P();
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private int A01(BqT bqT) throws IOException {
        HashMap<String, C2970BqR>[] mapArr;
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        Bqa[] bqaArr = A0x;
        int i = 0;
        do {
            A0V(bqaArr[i].A03);
            i++;
        } while (i < 6);
        if (this.A0E) {
            if (this.A0F) {
                A0V("StripOffsets");
                A0V("StripByteCounts");
            } else {
                A0V("JPEGInterchangeFormat");
                A0V("JPEGInterchangeFormatLength");
            }
        }
        int i2 = 0;
        while (true) {
            mapArr = this.A0J;
            if (i2 >= 10) {
                break;
            }
            Iterator itA0i = C3cG.A0i(mapArr[i2]);
            while (itA0i.hasNext()) {
                if (BV7.A0s(itA0i) == null) {
                    itA0i.remove();
                }
            }
            i2++;
        }
        if (!mapArr[1].isEmpty()) {
            A0O(this, bqaArr[1].A03, mapArr[0]);
        }
        if (!mapArr[2].isEmpty()) {
            A0O(this, bqaArr[2].A03, mapArr[0]);
        }
        if (!mapArr[3].isEmpty()) {
            A0O(this, bqaArr[3].A03, mapArr[1]);
        }
        if (this.A0E) {
            boolean z = this.A0F;
            HashMap<String, C2970BqR> map = mapArr[4];
            if (z) {
                map.put("StripOffsets", A05(this, 0));
                mapArr[4].put("StripByteCounts", A05(this, this.A04));
            } else {
                A0O(this, "JPEGInterchangeFormat", map);
                mapArr[4].put("JPEGInterchangeFormatLength", A04(this, this.A04));
            }
        }
        int i3 = 0;
        do {
            Iterator itA0i2 = C3cG.A0i(mapArr[i3]);
            int i4 = 0;
            while (itA0i2.hasNext()) {
                C2970BqR c2970BqR = (C2970BqR) BV7.A0s(itA0i2);
                int i5 = A0l[c2970BqR.A00] * c2970BqR.A01;
                if (i5 > 4) {
                    i4 += i5;
                }
            }
            iArr2[i3] = iArr2[i3] + i4;
            i3++;
        } while (i3 < 10);
        int size = 8;
        int i6 = 0;
        do {
            if (!mapArr[i6].isEmpty()) {
                iArr[i6] = size;
                size += (mapArr[i6].size() * 12) + 6 + iArr2[i6];
            }
            i6++;
        } while (i6 < 10);
        if (this.A0E) {
            boolean z2 = this.A0F;
            HashMap<String, C2970BqR> map2 = mapArr[4];
            if (z2) {
                map2.put("StripOffsets", A05(this, size));
            } else {
                map2.put("JPEGInterchangeFormat", A04(this, size));
            }
            this.A05 = size;
            size += this.A04;
        }
        if (this.A00 == 4) {
            size += 8;
        }
        if (A0M) {
            int i7 = 0;
            do {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i7), Integer.valueOf(iArr[i7]), Integer.valueOf(mapArr[i7].size()), Integer.valueOf(iArr2[i7]), Integer.valueOf(size)));
                i7++;
            } while (i7 < 10);
        }
        if (!mapArr[1].isEmpty()) {
            mapArr[0].put(bqaArr[1].A03, A04(this, iArr[1]));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[0].put(bqaArr[2].A03, A04(this, iArr[2]));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[1].put(bqaArr[3].A03, A04(this, iArr[3]));
        }
        int i8 = this.A00;
        if (i8 != 4) {
            if (i8 == 13) {
                bqT.A00(size);
                bqT.A00(1700284774);
            } else if (i8 == 14) {
                bqT.write(A0c);
                bqT.A00(size);
            }
        } else {
            if (size > 65535) {
                throw C3cG.A0Q(FGI.A0I("Size of exif data (", size, " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)"));
            }
            bqT.A02((short) size);
            bqT.write(A0T);
        }
        DataOutputStream dataOutputStream = bqT.A01;
        int size2 = dataOutputStream.size();
        bqT.A02(this.A0A == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        bqT.A00 = this.A0A;
        bqT.A02((short) 42);
        bqT.A00(8);
        int i9 = 0;
        do {
            if (!mapArr[i9].isEmpty()) {
                bqT.A01(mapArr[i9].size());
                int i10 = iArr[i9] + 2;
                HashMap<String, C2970BqR> map3 = mapArr[i9];
                int size3 = i10 + (map3.size() * 12) + 4;
                Iterator itA0i3 = C3cG.A0i(map3);
                while (itA0i3.hasNext()) {
                    Map.Entry entryA0l = C3cH.A0l(itA0i3);
                    int i11 = A18[i9].get(entryA0l.getKey()).A00;
                    C2970BqR c2970BqR2 = (C2970BqR) entryA0l.getValue();
                    int[] iArr3 = A0l;
                    int i12 = c2970BqR2.A00;
                    int i13 = iArr3[i12];
                    int i14 = c2970BqR2.A01;
                    int i15 = i13 * i14;
                    bqT.A01(i11);
                    bqT.A01(i12);
                    bqT.A00(i14);
                    if (i15 > 4) {
                        long j = size3;
                        if (j > 4294967295L) {
                            throw C60O.A0i("val is larger than the maximum value of a 32-bit unsigned integer");
                        }
                        bqT.A00((int) j);
                        size3 += i15;
                    } else {
                        bqT.write(c2970BqR2.A03);
                        while (i15 < 4) {
                            dataOutputStream.write(0);
                            i15++;
                        }
                    }
                }
                if (i9 != 0 || mapArr[4].isEmpty()) {
                    bqT.A00(0);
                } else {
                    long j2 = iArr[4];
                    if (j2 > 4294967295L) {
                        throw C60O.A0i("val is larger than the maximum value of a 32-bit unsigned integer");
                    }
                    bqT.A00((int) j2);
                }
                Iterator itA0i4 = C3cG.A0i(mapArr[i9]);
                while (itA0i4.hasNext()) {
                    byte[] bArr = ((C2970BqR) BV7.A0s(itA0i4)).A03;
                    int length = bArr.length;
                    if (length > 4) {
                        bqT.write(bArr, 0, length);
                    }
                }
            }
            i9++;
        } while (i9 < 10);
        if (this.A0E) {
            bqT.write(A0a());
        }
        if (this.A00 == 14 && size % 2 == 1) {
            dataOutputStream.write(0);
        }
        bqT.A00 = ByteOrder.BIG_ENDIAN;
        return size2;
    }

    public static int A02(C2970BqR c2970BqR, BqQ bqQ) {
        return c2970BqR.A06(bqQ.A0A);
    }

    public static Pair<Integer, Integer> A03(String str) throws NumberFormatException {
        Integer numValueOf;
        if (!str.contains(",")) {
            if (!str.contains(CustomConnectorRegisterRepositoryKt.ROOT_PATH)) {
                try {
                    long j = Long.parseLong(str);
                    return (j < 0 || j > 65535) ? j < 0 ? BV7.A0b(-1, 9) : BV7.A0b(-1, 4) : BV5.A0E(BV4.A0Y(), 4);
                } catch (NumberFormatException unused) {
                    Double.parseDouble(str);
                    return BV7.A0b(-1, 12);
                }
            }
            String[] strArrSplit = str.split(CustomConnectorRegisterRepositoryKt.ROOT_PATH, -1);
            if (strArrSplit.length == 2) {
                long jA0L = BV6.A0L(strArrSplit, 0);
                long jA0L2 = BV6.A0L(strArrSplit, 1);
                return (jA0L < 0 || jA0L2 < 0) ? BV7.A0b(-1, 10) : (jA0L > 2147483647L || jA0L2 > 2147483647L) ? BV7.A0b(-1, 5) : BV5.A0E(10, 5);
            }
            return BV4.A0A(2, -1);
        }
        String[] strArrSplit2 = str.split(",", -1);
        Pair<Integer, Integer> pairA03 = A03(strArrSplit2[0]);
        if (BV7.A08(pairA03) != 2) {
            for (int i = 1; i < strArrSplit2.length; i++) {
                Pair<Integer, Integer> pairA032 = A03(strArrSplit2[i]);
                Object obj = pairA032.first;
                int iA08 = (obj.equals(pairA03.first) || pairA032.second.equals(pairA03.first)) ? BV7.A08(pairA03) : -1;
                int iA07 = (BV7.A07(pairA03) == -1 || !(obj.equals(pairA03.second) || pairA032.second.equals(pairA03.second))) ? -1 : BV7.A07(pairA03);
                if (iA08 == -1 && iA07 == -1) {
                    return BV4.A0A(2, -1);
                }
                if (iA08 == -1) {
                    numValueOf = Integer.valueOf(iA07);
                } else if (iA07 == -1) {
                    numValueOf = Integer.valueOf(iA08);
                }
                pairA03 = BV4.A0A(numValueOf, -1);
            }
        }
        return pairA03;
    }

    public static C2970BqR A05(BqQ bqQ, int i) {
        return C2970BqR.A01(bqQ.A0A, new int[]{i});
    }

    public static C2970BqR A06(BqQ bqQ, String str) {
        C2970BqR c2970BqRA07;
        int i;
        C2970BqR c2970BqR;
        if ("ISOSpeedRatings".equals(str)) {
            if (A0M) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        boolean zEquals = "Xmp".equals(str);
        if (zEquals && (i = bqQ.A00) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (c2970BqR = bqQ.A07) != null)) {
            return c2970BqR;
        }
        int i2 = 0;
        while (true) {
            c2970BqRA07 = A07(str, bqQ.A0J[i2]);
            if (c2970BqRA07 != null) {
                break;
            }
            i2++;
            if (i2 >= 10) {
                if (!zEquals || (c2970BqRA07 = bqQ.A07) == null) {
                    return null;
                }
            }
        }
        return c2970BqRA07;
    }

    public static Bqa A08(String str, int i, int i2) {
        return new Bqa(str, i, i2);
    }

    private void A0A() {
        String strA0c = A0c("DateTimeOriginal");
        if (strA0c != null && A0c("DateTime") == null) {
            HashMap<String, C2970BqR> map = this.A0J[0];
            byte[] bytes = FGI.A0E(strA0c, (char) 0).getBytes(A0K);
            map.put("DateTime", C2970BqR.A04(bytes, 2, bytes.length));
        }
        A0P(this, "ImageWidth");
        A0P(this, "ImageLength");
        A0P(this, "Orientation");
        if (A0c("LightSource") == null) {
            this.A0J[1].put("LightSource", C2970BqR.A02(this.A0A, new long[]{0}));
        }
    }

    private void A0D(int i, int i2) {
        String str;
        HashMap<String, C2970BqR>[] mapArr = this.A0J;
        HashMap<String, C2970BqR> map = mapArr[i];
        if (!map.isEmpty() && !mapArr[i2].isEmpty()) {
            C2970BqR c2970BqRA07 = A07("ImageLength", map);
            C2970BqR c2970BqRA072 = A07("ImageWidth", mapArr[i]);
            C2970BqR c2970BqRA073 = A07("ImageLength", mapArr[i2]);
            C2970BqR c2970BqRA074 = A07("ImageWidth", mapArr[i2]);
            if (c2970BqRA07 == null || c2970BqRA072 == null) {
                if (!A0M) {
                    return;
                } else {
                    str = "First image does not contain valid size information";
                }
            } else {
                if (c2970BqRA073 != null && c2970BqRA074 != null) {
                    int iA02 = A02(c2970BqRA07, this);
                    int iA022 = A02(c2970BqRA072, this);
                    int iA023 = A02(c2970BqRA073, this);
                    int iA024 = A02(c2970BqRA074, this);
                    if (iA02 >= iA023 || iA022 >= iA024) {
                        return;
                    }
                    HashMap<String, C2970BqR> map2 = mapArr[i];
                    mapArr[i] = mapArr[i2];
                    mapArr[i2] = map2;
                    return;
                }
                if (!A0M) {
                    return;
                } else {
                    str = "Second image does not contain valid size information";
                }
            }
        } else if (!A0M) {
            return;
        } else {
            str = "Cannot perform swap since only one image data exists";
        }
        Log.d("ExifInterface", str);
    }

    private void A0E(int i, String str, String str2) {
        HashMap<String, C2970BqR>[] mapArr = this.A0J;
        HashMap<String, C2970BqR> map = mapArr[i];
        if (map.isEmpty() || map.get(str) == null) {
            return;
        }
        HashMap<String, C2970BqR> map2 = mapArr[i];
        map2.put(str2, map2.get(str));
        mapArr[i].remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0G(X.C2971BqS r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BqQ.A0G(X.BqS):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0157, code lost:
    
        r25.A02 = r24.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015b, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0H(X.C2971BqS r25, int r26, int r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BqQ.A0H(X.BqS, int, int):void");
    }

    private void A0J(BqT bqT) throws IOException {
        bqT.A00(this.A07.A03.length + 22);
        CRC32 crc32 = new CRC32();
        bqT.A00(1767135348);
        crc32.update(105);
        crc32.update(26964);
        crc32.update(6902872);
        crc32.update(1767135348);
        byte[] bArr = A0Y;
        bqT.write(bArr);
        crc32.update(bArr);
        bqT.write(this.A07.A03);
        crc32.update(this.A07.A03);
        bqT.A00((int) crc32.getValue());
        this.A0D = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0M(X.C2974BqZ r35, int r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BqQ.A0M(X.BqZ, int):void");
    }

    private void A0N(C2974BqZ c2974BqZ, int i) throws Throwable {
        StringBuilder sbA0x;
        String string;
        C2970BqR c2970BqRA05;
        C2970BqR c2970BqRA052;
        HashMap<String, C2970BqR>[] mapArr = this.A0J;
        C2970BqR c2970BqRA07 = A07("DefaultCropSize", mapArr[i]);
        C2970BqR c2970BqRA072 = A07("SensorTopBorder", mapArr[i]);
        C2970BqR c2970BqRA073 = A07("SensorLeftBorder", mapArr[i]);
        C2970BqR c2970BqRA074 = A07("SensorBottomBorder", mapArr[i]);
        C2970BqR c2970BqRA075 = A07("SensorRightBorder", mapArr[i]);
        if (c2970BqRA07 != null) {
            int i2 = c2970BqRA07.A00;
            Object objA07 = c2970BqRA07.A07(this.A0A);
            if (i2 != 5) {
                int[] iArr = (int[]) objA07;
                if (iArr == null || iArr.length != 2) {
                    sbA0x = C60O.A0x("Invalid crop size values. cropSize=");
                    string = Arrays.toString(iArr);
                    Log.w("ExifInterface", AnonymousClass001.A0v(string, sbA0x));
                    return;
                } else {
                    c2970BqRA05 = A05(this, iArr[0]);
                    c2970BqRA052 = A05(this, iArr[1]);
                    mapArr[i].put("ImageWidth", c2970BqRA05);
                    mapArr[i].put("ImageLength", c2970BqRA052);
                    return;
                }
            }
            BqV[] bqVArr = (BqV[]) objA07;
            if (bqVArr == null || bqVArr.length != 2) {
                sbA0x = C60O.A0x("Invalid crop size values. cropSize=");
                string = Arrays.toString(bqVArr);
                Log.w("ExifInterface", AnonymousClass001.A0v(string, sbA0x));
                return;
            } else {
                c2970BqRA05 = C2970BqR.A03(this.A0A, new BqV[]{bqVArr[0]});
                c2970BqRA052 = C2970BqR.A03(this.A0A, new BqV[]{bqVArr[1]});
                mapArr[i].put("ImageWidth", c2970BqRA05);
                mapArr[i].put("ImageLength", c2970BqRA052);
                return;
            }
        }
        if (c2970BqRA072 != null && c2970BqRA073 != null && c2970BqRA074 != null && c2970BqRA075 != null) {
            int iA02 = A02(c2970BqRA072, this);
            int iA022 = A02(c2970BqRA074, this);
            int iA023 = A02(c2970BqRA075, this);
            int iA024 = A02(c2970BqRA073, this);
            if (iA022 <= iA02 || iA023 <= iA024) {
                return;
            }
            C2970BqR c2970BqRA053 = A05(this, iA022 - iA02);
            C2970BqR c2970BqRA054 = A05(this, iA023 - iA024);
            mapArr[i].put("ImageLength", c2970BqRA053);
            mapArr[i].put("ImageWidth", c2970BqRA054);
            return;
        }
        C2970BqR c2970BqR = mapArr[i].get("ImageLength");
        C2970BqR c2970BqR2 = mapArr[i].get("ImageWidth");
        if (c2970BqR == null || c2970BqR2 == null) {
            C2970BqR c2970BqRA076 = A07("JPEGInterchangeFormat", mapArr[i]);
            C2970BqR c2970BqR3 = mapArr[i].get("JPEGInterchangeFormatLength");
            if (c2970BqRA076 == null || c2970BqR3 == null) {
                return;
            }
            int iA025 = A02(c2970BqRA076, this);
            int iA026 = A02(c2970BqRA076, this);
            c2974BqZ.A01(iA025);
            byte[] bArr = new byte[iA026];
            c2974BqZ.readFully(bArr);
            A0H(new C2971BqS(bArr), iA025, i);
        }
    }

    public static void A0Q(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void A0T(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    public static void A0U(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        byte[] bArr = new byte[8192];
        while (i > 0) {
            int iMin = Math.min(i, 8192);
            int i2 = inputStream.read(bArr, 0, iMin);
            if (i2 != iMin) {
                throw BV4.A0K("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i -= i2;
            outputStream.write(bArr, 0, i2);
        }
    }

    public static void A0W(String str, Object[] objArr, int i, int i2) {
        objArr[i] = new Bqa(str, i, i2);
    }

    public static void A0X(String str, Object[] objArr, int i, int i2, int i3) {
        objArr[i3] = new Bqa(str, i, i2);
    }

    private void A0Y(byte[] bArr, int i) throws IOException {
        C2974BqZ c2974BqZ = new C2974BqZ(bArr);
        c2974BqZ.A04.mark(Integer.MAX_VALUE);
        A0F(c2974BqZ);
        A0M(c2974BqZ, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final byte[] A0a() throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.String r5 = "ExifInterface"
            boolean r0 = r7.A0E
            r6 = 0
            if (r0 != 0) goto L8
            return r6
        L8:
            byte[] r0 = r7.A0G
            if (r0 != 0) goto L8d
            android.content.res.AssetManager$AssetInputStream r3 = r7.A06     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6e
            if (r3 == 0) goto L26
            boolean r0 = r3.markSupported()     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L81
            if (r0 == 0) goto L1a
            r3.reset()     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L81
            goto L2f
        L1a:
            java.lang.String r0 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r5, r0)     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L81
            A0Q(r3)
            return r6
        L23:
            r1 = move-exception
            r4 = r6
            goto L71
        L26:
            java.lang.String r0 = r7.A09     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6e
            if (r0 == 0) goto L31
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6e
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6e
        L2f:
            r4 = r6
            goto L43
        L31:
            java.io.FileDescriptor r0 = r7.A08     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6e
            java.io.FileDescriptor r4 = android.system.Os.dup(r0)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6e
            int r2 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            r0 = 0
            android.system.Os.lseek(r4, r0, r2)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
        L43:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L7f
            X.BqS r2 = new X.BqS     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L7f
            r2.<init>(r3, r0)     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L7f
            int r1 = r7.A05     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L7f
            int r0 = r7.A01     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L7f
            int r1 = r1 + r0
            r2.A00(r1)     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L7f
            int r0 = r7.A04     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L7f
            byte[] r0 = new byte[r0]     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L7f
            r2.readFully(r0)     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L7f
            r7.A0G = r0     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L7f
            A0Q(r3)
            if (r4 == 0) goto L8d
            A0R(r4)
            return r0
        L64:
            r1 = move-exception
            goto L71
        L66:
            r0 = move-exception
            goto L84
        L68:
            r1 = move-exception
            r3 = r6
            goto L71
        L6b:
            r0 = move-exception
            r4 = r6
            goto L84
        L6e:
            r1 = move-exception
            r3 = r6
            r4 = r6
        L71:
            java.lang.String r0 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r5, r0, r1)     // Catch: java.lang.Throwable -> L7f
            A0Q(r3)
            if (r4 == 0) goto L7e
            A0R(r4)
        L7e:
            return r6
        L7f:
            r0 = move-exception
            goto L83
        L81:
            r0 = move-exception
            r4 = r6
        L83:
            r6 = r3
        L84:
            A0Q(r6)
            if (r4 == 0) goto L8c
            A0R(r4)
        L8c:
            throw r0
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BqQ.A0a():byte[]");
    }

    public final String A0c(String str) {
        StringBuilder sbA0x;
        if (str == null) {
            throw BV4.A0a("tag shouldn't be null");
        }
        C2970BqR c2970BqRA06 = A06(this, str);
        String string = null;
        if (c2970BqRA06 != null) {
            if (!str.equals("GPSTimeStamp")) {
                boolean zContains = A0s.contains(str);
                ByteOrder byteOrder = this.A0A;
                if (!zContains) {
                    return c2970BqRA06.A08(byteOrder);
                }
                try {
                    string = Double.toString(c2970BqRA06.A05(byteOrder));
                    return string;
                } catch (NumberFormatException unused) {
                    return string;
                }
            }
            int i = c2970BqRA06.A00;
            if (i == 5 || i == 10) {
                BqV[] bqVArr = (BqV[]) c2970BqRA06.A07(this.A0A);
                if (bqVArr != null && bqVArr.length == 3) {
                    BqV bqV = bqVArr[0];
                    Integer numValueOf = Integer.valueOf((int) (bqV.A01 / bqV.A00));
                    BqV bqV2 = bqVArr[1];
                    Integer numValueOf2 = Integer.valueOf((int) (bqV2.A01 / bqV2.A00));
                    BqV bqV3 = bqVArr[2];
                    return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (bqV3.A01 / bqV3.A00)));
                }
                sbA0x = C60O.A0x("Invalid GPS Timestamp array. array=");
                sbA0x.append(Arrays.toString(bqVArr));
            } else {
                sbA0x = C60O.A0y("GPS Timestamp format is not rational. format=", i);
            }
            Log.w("ExifInterface", sbA0x.toString());
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:229:0x04d6, code lost:
    
        if (r14 != false) goto L201;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:201:0x045e, B:230:0x04d8], limit reached: 354 */
    /* JADX WARN: Path cross not found for [B:211:0x048a, B:203:0x046b], limit reached: 354 */
    /* JADX WARN: Path cross not found for [B:230:0x04d8, B:201:0x045e], limit reached: 354 */
    /* JADX WARN: Removed duplicated region for block: B:203:0x046b A[Catch: Exception -> 0x04f6, all -> 0x0546, TryCatch #5 {all -> 0x0546, blocks: (B:44:0x00af, B:46:0x00b4, B:48:0x00b8, B:49:0x00c9, B:51:0x00de, B:53:0x00eb, B:55:0x0100, B:56:0x0120, B:57:0x0126, B:59:0x012c, B:60:0x0130, B:61:0x0131, B:69:0x0143, B:71:0x0154, B:73:0x015b, B:75:0x0167, B:76:0x016c, B:78:0x0174, B:80:0x017b, B:88:0x019c, B:90:0x01a9, B:92:0x01b0, B:94:0x01bc, B:83:0x0182, B:85:0x018f, B:87:0x0197, B:95:0x01c1, B:232:0x04db, B:233:0x04e1, B:96:0x01c7, B:97:0x01cd, B:193:0x042e, B:195:0x0432, B:196:0x0443, B:198:0x0459, B:201:0x045e, B:203:0x046b, B:205:0x047a, B:206:0x047e, B:208:0x0482, B:210:0x0486, B:214:0x0491, B:225:0x04bf, B:227:0x04d1, B:217:0x04a0, B:219:0x04a5, B:221:0x04b4, B:223:0x04b8, B:224:0x04bb, B:226:0x04c8, B:103:0x01dd, B:105:0x01e1, B:106:0x01f2, B:234:0x04e5, B:192:0x0429, B:256:0x0538, B:257:0x0545), top: B:304:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x051c A[Catch: all -> 0x0548, Exception -> 0x054b, TryCatch #21 {Exception -> 0x054b, all -> 0x0548, blocks: (B:251:0x0516, B:253:0x051c, B:254:0x0523, B:255:0x052b), top: B:315:0x0516 }] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x052b A[Catch: all -> 0x0548, Exception -> 0x054b, TRY_LEAVE, TryCatch #21 {Exception -> 0x054b, all -> 0x0548, blocks: (B:251:0x0516, B:253:0x051c, B:254:0x0523, B:255:0x052b), top: B:315:0x0516 }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0574  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.io.BufferedOutputStream, java.io.Closeable, java.io.OutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.io.BufferedInputStream, java.io.Closeable, java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.io.Closeable, java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:229:0x04d6 -> B:201:0x045e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:231:0x04da -> B:201:0x045e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0d() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BqQ.A0d():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x02d6, code lost:
    
        if (r5 == false) goto L139;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0162 A[PHI: r9
  0x0162: PHI (r9v1 int) = (r9v0 int), (r9v0 int), (r9v6 int), (r9v6 int), (r9v6 int), (r9v5 int), (r9v5 int) binds: [B:72:0x0151, B:74:0x0157, B:104:0x024c, B:106:0x024f, B:108:0x0253, B:77:0x015e, B:78:0x0160] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0e(java.lang.String r31, java.lang.String r32) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BqQ.A0e(java.lang.String, java.lang.String):void");
    }

    public final double[] A0f() {
        String strA0c = A0c("GPSLatitude");
        String strA0c2 = A0c("GPSLatitudeRef");
        String strA0c3 = A0c("GPSLongitude");
        String strA0c4 = A0c("GPSLongitudeRef");
        if (strA0c == null || strA0c2 == null || strA0c3 == null || strA0c4 == null) {
            return null;
        }
        try {
            return new double[]{A00(strA0c, strA0c2), A00(strA0c3, strA0c4)};
        } catch (IllegalArgumentException unused) {
            Log.w("ExifInterface", FGI.A0M("Latitude/longitude values are not parsable. ", String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", strA0c, strA0c2, strA0c3, strA0c4)));
            return null;
        }
    }

    public BqQ(String str) throws Throwable {
        this.A0J = new HashMap[10];
        this.A0B = new HashSet(10);
        this.A0A = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw BV4.A0a("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.A06 = null;
        this.A09 = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                try {
                    Os.lseek(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.A08 = fileInputStream2.getFD();
                } catch (Exception unused) {
                    if (A0M) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                    this.A08 = null;
                }
                A0S(fileInputStream2);
                A0Q(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                A0Q(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static C2970BqR A07(Object obj, AbstractMap abstractMap) {
        return (C2970BqR) abstractMap.get(obj);
    }

    public static ByteOrder A09(C2971BqS c2971BqS) throws IOException {
        short s = c2971BqS.readShort();
        if (s == 18761) {
            if (A0M) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s != 19789) {
            throw BV5.A0M("Invalid byte order: ", Integer.toHexString(s));
        }
        if (A0M) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    private void A0F(C2971BqS c2971BqS) throws IOException {
        ByteOrder byteOrderA09 = A09(c2971BqS);
        this.A0A = byteOrderA09;
        c2971BqS.A02 = byteOrderA09;
        int unsignedShort = c2971BqS.readUnsignedShort();
        int i = this.A00;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw BV5.A0M("Invalid start code: ", Integer.toHexString(unsignedShort));
        }
        int i2 = c2971BqS.readInt();
        if (i2 < 8) {
            throw BV4.A0K(FGI.A0H("Invalid first Ifd offset: ", i2));
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            c2971BqS.A00(i3);
        }
    }

    private void A0I(BqT bqT) throws IOException {
        ByteArrayOutputStream byteArrayOutputStreamA0F = BV4.A0F();
        this.A01 = bqT.A01.size() + A01(new BqT(byteArrayOutputStreamA0F, ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStreamA0F.toByteArray();
        bqT.write(byteArray);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        bqT.A00((int) crc32.getValue());
    }

    private void A0K(C2974BqZ c2974BqZ) throws Throwable {
        A0F(c2974BqZ);
        A0M(c2974BqZ, 0);
        A0N(c2974BqZ, 0);
        A0N(c2974BqZ, 5);
        A0N(c2974BqZ, 4);
        A0C();
        if (this.A00 == 8) {
            HashMap<String, C2970BqR>[] mapArr = this.A0J;
            C2970BqR c2970BqRA07 = A07("MakerNote", mapArr[1]);
            if (c2970BqRA07 != null) {
                C2974BqZ c2974BqZ2 = new C2974BqZ(c2970BqRA07.A03);
                c2974BqZ2.A04.mark(Integer.MAX_VALUE);
                c2974BqZ2.A02 = this.A0A;
                c2974BqZ2.A00(6);
                A0M(c2974BqZ2, 9);
                C2970BqR c2970BqR = mapArr[9].get("ColorSpace");
                if (c2970BqR != null) {
                    mapArr[1].put("ColorSpace", c2970BqR);
                }
            }
        }
    }

    private void A0L(C2974BqZ c2974BqZ, int i) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i == 15 && i3 < 31) {
            throw C8j3.A18("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new C2972BqU(c2974BqZ, this));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                if (strExtractMetadata != null) {
                    this.A0J[0].put("ImageWidth", A05(this, Integer.parseInt(strExtractMetadata)));
                }
                if (strExtractMetadata3 != null) {
                    this.A0J[0].put("ImageLength", A05(this, Integer.parseInt(strExtractMetadata3)));
                }
                if (strExtractMetadata2 != null) {
                    int i4 = Integer.parseInt(strExtractMetadata2);
                    if (i4 == 90) {
                        i2 = 6;
                    } else if (i4 != 180) {
                        i2 = 8;
                        if (i4 != 270) {
                            i2 = 1;
                        }
                    } else {
                        i2 = 3;
                    }
                    this.A0J[0].put("Orientation", A05(this, i2));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i5 = Integer.parseInt(strExtractMetadata4);
                    int i6 = Integer.parseInt(strExtractMetadata5);
                    if (i6 <= 6) {
                        throw BV4.A0K("Invalid exif length");
                    }
                    c2974BqZ.A01(i5);
                    byte[] bArr = new byte[6];
                    c2974BqZ.readFully(bArr);
                    int i7 = i5 + 6;
                    int i8 = i6 - 6;
                    if (!Arrays.equals(bArr, A0T)) {
                        throw BV4.A0K("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i8];
                    c2974BqZ.readFully(bArr2);
                    this.A01 = i7;
                    A0Y(bArr2, 0);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i9 = Integer.parseInt(strExtractMetadata8);
                    int i10 = Integer.parseInt(strExtractMetadata9);
                    long j = i9;
                    c2974BqZ.A01(j);
                    byte[] bArr3 = new byte[i10];
                    c2974BqZ.readFully(bArr3);
                    this.A07 = new C2970BqR(j, bArr3, 1, i10);
                    this.A0D = true;
                }
                if (A0M) {
                    Log.d("ExifInterface", FGI.A0j("Heif meta: ", strExtractMetadata, "x", strExtractMetadata3, ", rotation ", strExtractMetadata2));
                }
            } finally {
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            }
        } catch (RuntimeException e) {
            throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);
        }
    }

    public static void A0R(FileDescriptor fileDescriptor) throws ErrnoException {
        try {
            Os.close(fileDescriptor);
        } catch (ErrnoException e) {
            Log.e("ExifInterfaceUtils", "Error closing fd.", e);
        }
    }

    public final int A0b(String str, int i) {
        C2970BqR c2970BqRA06 = A06(this, str);
        if (c2970BqRA06 != null) {
            try {
                return c2970BqRA06.A06(this.A0A);
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public BqQ(InputStream inputStream) throws Throwable {
        this.A0J = new HashMap[10];
        this.A0B = new HashSet(10);
        this.A0A = ByteOrder.BIG_ENDIAN;
        this.A09 = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.A06 = (AssetManager.AssetInputStream) inputStream;
            this.A08 = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.A06 = null;
                this.A08 = fileInputStream.getFD();
            } catch (Exception unused) {
                if (A0M) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
            }
        } else {
            this.A06 = null;
            this.A08 = null;
        }
        A0S(inputStream);
    }
}
