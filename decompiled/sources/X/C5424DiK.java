package X;

import java.util.IdentityHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: X.DiK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5424DiK implements InterfaceC6006Dtp, InterfaceC5495DjX<C5422DiI<InterfaceC5541DkJ>>, InterfaceC5365DhH<InterfaceC5541DkJ> {
    public static final Pattern A0T = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern A0U = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public int A00;
    public InterfaceC5503Djf A03;
    public C5580Dky A04;
    public List<C5483DjL> A05;
    public C5422DiI<InterfaceC5541DkJ>[] A06;
    public InterfaceC5487DjP A07;
    public C5445Dig[] A08;
    public final int A09;
    public final long A0A;
    public final E6Y A0B;
    public final C6014Dtx A0C;
    public final InterfaceC5460Div A0D;
    public final C6013Dtw A0E;
    public final C5414DiA A0F;
    public final InterfaceC5538DkF A0G;
    public final InterfaceC5334DgV A0H;
    public final DhA A0I;
    public final C5423DiJ A0J;
    public final DhS A0K;
    public final DhC A0L;
    public final C5366DhI A0M;
    public final IdentityHashMap<C5422DiI<InterfaceC5541DkJ>, C5375DhR> A0N;
    public final boolean A0O;
    public final DjI[] A0P;
    public final CXB A0Q;
    public final InterfaceC5512Djo A0R;
    public final boolean A0S;
    public long A02 = -9223372036854775807L;
    public long A01 = -9223372036854775807L;

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<LX/DjV;>;Ljava/lang/String;)LX/DjV; */
    public static C5493DjV A00(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            C5493DjV c5493DjV = (C5493DjV) list.get(i);
            if (str.equals(c5493DjV.A01)) {
                return c5493DjV;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x0420, code lost:
    
        r7.A00 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x042b, code lost:
    
        if (r7.A0M == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0431, code lost:
    
        if (r0 != r7.A07) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0437, code lost:
    
        if (r7.A0F.A0S != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0439, code lost:
    
        r7.A0M = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x043d, code lost:
    
        r7.A07 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x043f, code lost:
    
        if (r32 == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0443, code lost:
    
        if (r20 == (-9223372036854775807L)) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0445, code lost:
    
        r5 = r7.A0E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0449, code lost:
    
        if (r0 <= r20) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x044b, code lost:
    
        r5.A0P = true;
        r8 = r5.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0451, code lost:
    
        monitor-enter(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0454, code lost:
    
        if (r8.A0G != false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0458, code lost:
    
        if (r8.A0E != false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x045a, code lost:
    
        r5 = r8.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x045e, code lost:
    
        if (r5 == (-9223372036854775807L)) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0462, code lost:
    
        if (r8.A0H == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0464, code lost:
    
        r1 = r8.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0467, code lost:
    
        r1 = r8.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x046b, code lost:
    
        if (r5 != r1) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x046e, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0470, code lost:
    
        r1 = r8.A03 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0474, code lost:
    
        r8.A03 = r1;
        r8.A09 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0479, code lost:
    
        if (r1 < 3) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x047b, code lost:
    
        r8.A0E = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0480, code lost:
    
        X.C5448Dij.A00(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0483, code lost:
    
        monitor-exit(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0485, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x031a A[Catch: BehindLiveWindowException -> 0x048e, TryCatch #1 {BehindLiveWindowException -> 0x048e, blocks: (B:12:0x0057, B:14:0x005f, B:16:0x0064, B:19:0x008c, B:21:0x0096, B:24:0x009e, B:26:0x00a2, B:30:0x00ab, B:32:0x00b6, B:34:0x00bc, B:36:0x00da, B:37:0x0109, B:39:0x0112, B:41:0x011e, B:42:0x0128, B:44:0x0136, B:46:0x015a, B:49:0x0164, B:51:0x0176, B:53:0x0188, B:55:0x018e, B:57:0x0194, B:59:0x019a, B:61:0x01a0, B:63:0x01aa, B:64:0x01ae, B:66:0x01b7, B:69:0x01bf, B:73:0x01c7, B:74:0x01cb, B:144:0x03a5, B:146:0x03a9, B:147:0x03c5, B:148:0x03ca, B:149:0x03d0, B:150:0x03eb, B:152:0x03f3, B:158:0x040a, B:201:0x0488, B:202:0x048d, B:79:0x01f1, B:92:0x025d, B:91:0x025b, B:80:0x01f4, B:84:0x0216, B:86:0x021a, B:159:0x040e, B:89:0x0247, B:90:0x0253, B:93:0x0261, B:94:0x026b, B:96:0x0292, B:98:0x029a, B:100:0x02a6, B:102:0x02b6, B:104:0x02bc, B:106:0x02c2, B:108:0x02c8, B:110:0x02ce, B:112:0x02d8, B:113:0x02dc, B:115:0x02e3, B:118:0x02eb, B:122:0x02f2, B:123:0x02f6, B:135:0x0364, B:137:0x0368, B:138:0x0388, B:160:0x0414, B:142:0x039c, B:143:0x03a0, B:140:0x0397, B:141:0x0399, B:128:0x031a, B:132:0x0331, B:134:0x0335, B:161:0x041a, B:139:0x038e, B:162:0x0420, B:164:0x042d, B:166:0x0433, B:168:0x0439, B:169:0x043d, B:173:0x0445, B:175:0x044b, B:176:0x0451, B:196:0x0483), top: B:223:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03f3 A[Catch: BehindLiveWindowException -> 0x048e, TryCatch #1 {BehindLiveWindowException -> 0x048e, blocks: (B:12:0x0057, B:14:0x005f, B:16:0x0064, B:19:0x008c, B:21:0x0096, B:24:0x009e, B:26:0x00a2, B:30:0x00ab, B:32:0x00b6, B:34:0x00bc, B:36:0x00da, B:37:0x0109, B:39:0x0112, B:41:0x011e, B:42:0x0128, B:44:0x0136, B:46:0x015a, B:49:0x0164, B:51:0x0176, B:53:0x0188, B:55:0x018e, B:57:0x0194, B:59:0x019a, B:61:0x01a0, B:63:0x01aa, B:64:0x01ae, B:66:0x01b7, B:69:0x01bf, B:73:0x01c7, B:74:0x01cb, B:144:0x03a5, B:146:0x03a9, B:147:0x03c5, B:148:0x03ca, B:149:0x03d0, B:150:0x03eb, B:152:0x03f3, B:158:0x040a, B:201:0x0488, B:202:0x048d, B:79:0x01f1, B:92:0x025d, B:91:0x025b, B:80:0x01f4, B:84:0x0216, B:86:0x021a, B:159:0x040e, B:89:0x0247, B:90:0x0253, B:93:0x0261, B:94:0x026b, B:96:0x0292, B:98:0x029a, B:100:0x02a6, B:102:0x02b6, B:104:0x02bc, B:106:0x02c2, B:108:0x02c8, B:110:0x02ce, B:112:0x02d8, B:113:0x02dc, B:115:0x02e3, B:118:0x02eb, B:122:0x02f2, B:123:0x02f6, B:135:0x0364, B:137:0x0368, B:138:0x0388, B:160:0x0414, B:142:0x039c, B:143:0x03a0, B:140:0x0397, B:141:0x0399, B:128:0x031a, B:132:0x0331, B:134:0x0335, B:161:0x041a, B:139:0x038e, B:162:0x0420, B:164:0x042d, B:166:0x0433, B:168:0x0439, B:169:0x043d, B:173:0x0445, B:175:0x044b, B:176:0x0451, B:196:0x0483), top: B:223:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c A[Catch: BehindLiveWindowException -> 0x048e, TRY_LEAVE, TryCatch #1 {BehindLiveWindowException -> 0x048e, blocks: (B:12:0x0057, B:14:0x005f, B:16:0x0064, B:19:0x008c, B:21:0x0096, B:24:0x009e, B:26:0x00a2, B:30:0x00ab, B:32:0x00b6, B:34:0x00bc, B:36:0x00da, B:37:0x0109, B:39:0x0112, B:41:0x011e, B:42:0x0128, B:44:0x0136, B:46:0x015a, B:49:0x0164, B:51:0x0176, B:53:0x0188, B:55:0x018e, B:57:0x0194, B:59:0x019a, B:61:0x01a0, B:63:0x01aa, B:64:0x01ae, B:66:0x01b7, B:69:0x01bf, B:73:0x01c7, B:74:0x01cb, B:144:0x03a5, B:146:0x03a9, B:147:0x03c5, B:148:0x03ca, B:149:0x03d0, B:150:0x03eb, B:152:0x03f3, B:158:0x040a, B:201:0x0488, B:202:0x048d, B:79:0x01f1, B:92:0x025d, B:91:0x025b, B:80:0x01f4, B:84:0x0216, B:86:0x021a, B:159:0x040e, B:89:0x0247, B:90:0x0253, B:93:0x0261, B:94:0x026b, B:96:0x0292, B:98:0x029a, B:100:0x02a6, B:102:0x02b6, B:104:0x02bc, B:106:0x02c2, B:108:0x02c8, B:110:0x02ce, B:112:0x02d8, B:113:0x02dc, B:115:0x02e3, B:118:0x02eb, B:122:0x02f2, B:123:0x02f6, B:135:0x0364, B:137:0x0368, B:138:0x0388, B:160:0x0414, B:142:0x039c, B:143:0x03a0, B:140:0x0397, B:141:0x0399, B:128:0x031a, B:132:0x0331, B:134:0x0335, B:161:0x041a, B:139:0x038e, B:162:0x0420, B:164:0x042d, B:166:0x0433, B:168:0x0439, B:169:0x043d, B:173:0x0445, B:175:0x044b, B:176:0x0451, B:196:0x0483), top: B:223:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f4 A[Catch: BehindLiveWindowException -> 0x048e, TryCatch #1 {BehindLiveWindowException -> 0x048e, blocks: (B:12:0x0057, B:14:0x005f, B:16:0x0064, B:19:0x008c, B:21:0x0096, B:24:0x009e, B:26:0x00a2, B:30:0x00ab, B:32:0x00b6, B:34:0x00bc, B:36:0x00da, B:37:0x0109, B:39:0x0112, B:41:0x011e, B:42:0x0128, B:44:0x0136, B:46:0x015a, B:49:0x0164, B:51:0x0176, B:53:0x0188, B:55:0x018e, B:57:0x0194, B:59:0x019a, B:61:0x01a0, B:63:0x01aa, B:64:0x01ae, B:66:0x01b7, B:69:0x01bf, B:73:0x01c7, B:74:0x01cb, B:144:0x03a5, B:146:0x03a9, B:147:0x03c5, B:148:0x03ca, B:149:0x03d0, B:150:0x03eb, B:152:0x03f3, B:158:0x040a, B:201:0x0488, B:202:0x048d, B:79:0x01f1, B:92:0x025d, B:91:0x025b, B:80:0x01f4, B:84:0x0216, B:86:0x021a, B:159:0x040e, B:89:0x0247, B:90:0x0253, B:93:0x0261, B:94:0x026b, B:96:0x0292, B:98:0x029a, B:100:0x02a6, B:102:0x02b6, B:104:0x02bc, B:106:0x02c2, B:108:0x02c8, B:110:0x02ce, B:112:0x02d8, B:113:0x02dc, B:115:0x02e3, B:118:0x02eb, B:122:0x02f2, B:123:0x02f6, B:135:0x0364, B:137:0x0368, B:138:0x0388, B:160:0x0414, B:142:0x039c, B:143:0x03a0, B:140:0x0397, B:141:0x0399, B:128:0x031a, B:132:0x0331, B:134:0x0335, B:161:0x041a, B:139:0x038e, B:162:0x0420, B:164:0x042d, B:166:0x0433, B:168:0x0439, B:169:0x043d, B:173:0x0445, B:175:0x044b, B:176:0x0451, B:196:0x0483), top: B:223:0x0057 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.C5580Dky r60, int r61) throws androidx.media3.exoplayer.source.BehindLiveWindowException {
        /*
            Method dump skipped, instructions count: 1277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5424DiK.A01(X.Dky, int):void");
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final boolean A7A(Du1 du1) {
        C5437DiY c5437DiY;
        C5518Dju c5518Dju;
        AtomicReference<C5518Dju> atomicReference;
        C5518Dju c5518Dju2;
        int i;
        C5423DiJ c5423DiJ = this.A0J;
        if (c5423DiJ.A0j) {
            long j = du1.A02;
            C5422DiI<InterfaceC5541DkJ>[] c5422DiIArr = this.A06;
            if (c5422DiIArr.length > 0 && (c5437DiY = ((C5425DiL) ((InterfaceC5541DkJ) c5422DiIArr[0].A0S)).A0E) != null && (c5518Dju = c5437DiY.A0J.get()) != null && c5518Dju.A02) {
                C5422DiI<InterfaceC5541DkJ>[] c5422DiIArr2 = this.A06;
                long jMax = -9223372036854775807L;
                boolean z = false;
                boolean z2 = true;
                boolean zA1Q = false;
                boolean zA1Q2 = false;
                for (C5422DiI<InterfaceC5541DkJ> c5422DiI : c5422DiIArr2) {
                    int i2 = c5422DiI.A0I;
                    if (i2 == 1 || i2 == 2) {
                        int i3 = c5422DiI.A0I;
                        zA1Q |= AnonymousClass002.A1Q(i3, 1);
                        zA1Q2 |= AnonymousClass002.A1Q(i3, 2);
                        boolean zA0F = c5422DiI.A0F();
                        z |= zA0F;
                        z2 &= zA0F;
                        jMax = Math.max(jMax, c5422DiI.AI5());
                    }
                }
                if (c5518Dju.A01) {
                    if (z2 && (zA1Q || zA1Q2)) {
                        atomicReference = c5437DiY.A0J;
                        c5518Dju2 = null;
                        Bs8.A00(c5518Dju, c5518Dju2, atomicReference);
                    }
                } else if (!z && zA1Q && zA1Q2) {
                    long j2 = c5518Dju.A00;
                    if (jMax <= j2 && j2 - j >= BV6.A0H(c5423DiJ.A03)) {
                        loop1: for (C5422DiI<InterfaceC5541DkJ> c5422DiI2 : c5422DiIArr2) {
                            int i4 = c5422DiI2.A0I;
                            if (i4 == 1 || i4 == 2) {
                                C5425DiL c5425DiL = (C5425DiL) ((InterfaceC5541DkJ) c5422DiI2.A0S);
                                while (i < c5425DiL.A0D.length()) {
                                    C5432DiT c5432DiT = c5425DiL.A0w[i];
                                    i = (c5432DiT.A02 == null || !C5425DiL.A0B(c5432DiT, c5425DiL, c5432DiT.A05(j2))) ? i + 1 : 0;
                                }
                                break loop1;
                            }
                        }
                        atomicReference = c5437DiY.A0J;
                        c5518Dju2 = new C5518Dju(j2, true, true);
                        Bs8.A00(c5518Dju, c5518Dju2, atomicReference);
                    }
                }
            }
        }
        return this.A07.A7A(du1);
    }

    @Override // X.InterfaceC6006Dtp
    public final void A94(long j, boolean z) {
        for (C5422DiI<InterfaceC5541DkJ> c5422DiI : this.A06) {
            if (!c5422DiI.A0F()) {
                if (!AbstractC5653Dmh.A03(EnumC5618Dlz.A0l) || c5422DiI.A0Q.A00 == null) {
                    C5422DiI.A09(c5422DiI, j, z);
                } else {
                    c5422DiI.A02 = j;
                    c5422DiI.A0F = z;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        return r17;
     */
    @Override // X.InterfaceC6006Dtp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long ACF(X.DpX r16, long r17) {
        /*
            r15 = this;
            r13 = r17
            X.DiI<X.DkJ>[] r4 = r15.A06
            int r3 = r4.length
            r2 = 0
        L6:
            if (r2 >= r3) goto L1f
            r5 = r4[r2]
            int r1 = r5.A0I
            r0 = 2
            if (r1 != r0) goto L84
            boolean r0 = X.C5422DiI.A0B(r5)
            r12 = r16
            if (r0 == 0) goto L20
            X.DpX r0 = X.DpX.A04
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L20
        L1f:
            return r13
        L20:
            boolean r0 = X.C5422DiI.A0C(r5)
            if (r0 == 0) goto L34
            long r3 = X.C5422DiI.A01(r12, r5, r13)
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L34
            return r3
        L34:
            T extends X.DjD r0 = r5.A0S
            X.DiL r0 = (X.C5425DiL) r0
            X.DiT[] r5 = r0.A0w
            int r4 = r5.length
            r3 = 0
        L3c:
            if (r3 >= r4) goto L1f
            r7 = r5[r3]
            X.DhD r0 = r7.A02
            if (r0 == 0) goto L81
            X.DhD r2 = r7.A02
            long r0 = r7.A00
            long r10 = r2.AK9(r0)
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 == 0) goto L81
            long r1 = r7.A05(r13)
            long r17 = X.DhD.A00(r7, r1)
            r15 = r17
            int r0 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r0 >= 0) goto L7c
            r3 = -1
            r8 = 1
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 == 0) goto L77
            X.DhD r0 = r7.A02
            long r5 = r0.AFg()
            long r3 = r7.A01
            long r5 = r5 + r3
            long r5 = r5 + r10
            long r5 = r5 - r8
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L7c
        L77:
            long r1 = r1 + r8
            long r17 = X.DhD.A00(r7, r1)
        L7c:
            long r13 = r12.A00(r13, r15, r17)
            return r13
        L81:
            int r3 = r3 + 1
            goto L3c
        L84:
            int r2 = r2 + 1
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5424DiK.ACF(X.DpX, long):long");
    }

    @Override // X.InterfaceC5487DjP
    public final long AD6(long j) {
        return this.A07.AD6(j);
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final long AD8() {
        return this.A07.AD8();
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final long AI5() {
        boolean zA03 = AbstractC5653Dmh.A03(EnumC5618Dlz.A0T);
        InterfaceC5487DjP interfaceC5487DjP = this.A07;
        return zA03 ? interfaceC5487DjP.AD8() : interfaceC5487DjP.AI5();
    }

    @Override // X.InterfaceC6006Dtp
    public final C5414DiA ALu() {
        return this.A0F;
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final boolean AOd() {
        return this.A07.AOd();
    }

    @Override // X.InterfaceC6006Dtp
    public final void AQR() {
        this.A0I.AQQ();
    }

    @Override // X.InterfaceC5495DjX
    public final /* bridge */ /* synthetic */ void ASS(InterfaceC5487DjP interfaceC5487DjP) {
        InterfaceC5503Djf interfaceC5503Djf = this.A03;
        if (interfaceC5503Djf != null) {
            interfaceC5503Djf.ASS(this);
        }
    }

    @Override // X.InterfaceC6006Dtp
    public final void AYP(InterfaceC5503Djf interfaceC5503Djf, long j) {
        this.A03 = interfaceC5503Djf;
        interfaceC5503Djf.AUv(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a0  */
    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AZv(long r30) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5424DiK.AZv(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bb, code lost:
    
        if (X.C5422DiI.A0C(r2) != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[PHI: r6
  0x0048: PHI (r6v1 X.DiN) = (r6v3 X.DiN), (r6v6 X.DiN) binds: [B:19:0x0046, B:49:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[LOOP:4: B:25:0x0061->B:26:0x0063, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce A[PHI: r6
  0x00ce: PHI (r6v5 X.DiN) = (r6v1 X.DiN), (r6v3 X.DiN), (r6v6 X.DiN) binds: [B:23:0x0050, B:19:0x0046, B:53:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0118  */
    @Override // X.InterfaceC6006Dtp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long AcP(long r18) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5424DiK.AcP(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x008b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d8  */
    @Override // X.InterfaceC6006Dtp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long AcS(X.InterfaceC6022DuF[] r54, X.InterfaceC5441Dic[] r55, boolean[] r56, boolean[] r57, long r58) {
        /*
            Method dump skipped, instructions count: 869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5424DiK.AcS(X.DuF[], X.Dic[], boolean[], boolean[], long):long");
    }

    @Override // X.InterfaceC6006Dtp
    public final long AZF() {
        return -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0277 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0275  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5424DiK(X.CXB r15, X.E6Y r16, X.C6014Dtx r17, X.InterfaceC5460Div r18, X.InterfaceC5512Djo r19, X.C6013Dtw r20, X.InterfaceC5538DkF r21, X.InterfaceC5334DgV r22, X.DhA r23, X.C5423DiJ r24, X.DhS r25, X.DhC r26, X.DhB r27, X.C5580Dky r28, int r29, int r30, long r31, boolean r33) {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5424DiK.<init>(X.CXB, X.E6Y, X.Dtx, X.Div, X.Djo, X.Dtw, X.DkF, X.DgV, X.DhA, X.DiJ, X.DhS, X.DhC, X.DhB, X.Dky, int, int, long, boolean):void");
    }
}
