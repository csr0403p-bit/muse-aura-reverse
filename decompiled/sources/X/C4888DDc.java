package X;

import android.net.Uri;
import com.facebook.debug.tracer.Tracer;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.DDc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4888DDc implements InterfaceC4896DDp {
    public long A00;
    public long A01;
    public long A02;
    public C1N A03;
    public C1J A04;
    public DDj A05;
    public C0J A06;
    public DDh A07;
    public C3154C0c A08;
    public boolean A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public boolean A0D;
    public boolean A0E;
    public final int A0F;
    public final long A0G;
    public final CXK A0H;
    public final DDR A0I;
    public final DEF A0J;
    public final C3159C0h A0K;
    public final HeroPlayerSetting A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final CX9 A0O;
    public final C3167C0s A0P;
    public final AtomicBoolean A0Q;
    public final boolean A0R;

    public C4888DDc(CXK cxk, DDj dDj, DDR ddr, DEF def, C3159C0h c3159C0h, C3167C0s c3167C0s, HeroPlayerSetting heroPlayerSetting, AtomicBoolean atomicBoolean, int i, long j, boolean z, boolean z2, boolean z3) {
        this.A0K = c3159C0h;
        this.A0I = ddr;
        this.A0H = cxk;
        this.A0P = c3167C0s;
        this.A0F = i;
        this.A0R = z;
        this.A0N = z2;
        this.A0L = heroPlayerSetting;
        this.A0Q = atomicBoolean;
        this.A0J = def;
        this.A0M = z3;
        this.A0G = j;
        this.A0O = heroPlayerSetting.gen.enable_hero_file_data_source ? new C3603CWo(false) : new CWn(false);
        this.A01 = -1L;
        this.A05 = dDj;
        this.A02 = 0L;
        this.A00 = 0L;
        this.A0D = false;
    }

    @Override // X.C1J
    public final void addTransferListener(CXB cxb) {
        DDj c4892DDl;
        C7384Etj.A0Y(cxb, 0);
        if (cxb instanceof DDj) {
            DDj dDj = this.A05;
            if (dDj instanceof DDg) {
                DDg dDg = (DDg) dDj;
                ArrayList arrayListA0t = BV4.A0t(dDg.A00);
                arrayListA0t.add(cxb);
                dDg.A00 = arrayListA0t;
                return;
            }
            c4892DDl = (DDj) cxb;
        } else {
            c4892DDl = new C4892DDl(cxb);
        }
        this.A05 = c4892DDl;
    }

    @Override // X.InterfaceC4896DDp
    public final void cancel() {
        this.A09 = false;
        this.A01 = -1L;
        this.A0D = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x026a A[Catch: IOException -> 0x02ce, all -> 0x0301, Merged into TryCatch #0 {all -> 0x0301, all -> 0x02fc, IOException -> 0x02ce, blocks: (B:3:0x000b, B:4:0x0011, B:6:0x0031, B:9:0x0039, B:11:0x0057, B:13:0x005f, B:15:0x006d, B:17:0x007b, B:21:0x0087, B:23:0x00af, B:25:0x00b4, B:27:0x00b8, B:29:0x00c0, B:31:0x00c8, B:32:0x00ef, B:34:0x00f3, B:35:0x0115, B:37:0x0125, B:39:0x013d, B:41:0x0143, B:48:0x0156, B:76:0x01c9, B:73:0x01c0, B:75:0x01c8, B:74:0x01c4, B:77:0x01cc, B:79:0x01d0, B:81:0x01d6, B:83:0x01de, B:86:0x01e8, B:88:0x021d, B:91:0x0225, B:93:0x022b, B:95:0x023c, B:96:0x0240, B:98:0x0246, B:100:0x024c, B:101:0x0250, B:103:0x0256, B:105:0x025c, B:108:0x0263, B:111:0x026a, B:113:0x026e, B:115:0x0274, B:117:0x027a, B:119:0x0282, B:121:0x0286, B:123:0x0292, B:125:0x0298, B:127:0x029e, B:129:0x02a4, B:130:0x02ad, B:132:0x02b2, B:134:0x02b6, B:137:0x02c2, B:136:0x02bf, B:44:0x014a, B:46:0x0150, B:142:0x02cf, B:144:0x02dd, B:146:0x02e1, B:148:0x02e9, B:156:0x02fd, B:157:0x0300, B:149:0x02ec, B:151:0x02f0, B:153:0x02f4, B:154:0x02f8, B:147:0x02e7), top: B:161:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02bf A[Catch: IOException -> 0x02ce, all -> 0x0301, Merged into TryCatch #0 {all -> 0x0301, all -> 0x02fc, IOException -> 0x02ce, blocks: (B:3:0x000b, B:4:0x0011, B:6:0x0031, B:9:0x0039, B:11:0x0057, B:13:0x005f, B:15:0x006d, B:17:0x007b, B:21:0x0087, B:23:0x00af, B:25:0x00b4, B:27:0x00b8, B:29:0x00c0, B:31:0x00c8, B:32:0x00ef, B:34:0x00f3, B:35:0x0115, B:37:0x0125, B:39:0x013d, B:41:0x0143, B:48:0x0156, B:76:0x01c9, B:73:0x01c0, B:75:0x01c8, B:74:0x01c4, B:77:0x01cc, B:79:0x01d0, B:81:0x01d6, B:83:0x01de, B:86:0x01e8, B:88:0x021d, B:91:0x0225, B:93:0x022b, B:95:0x023c, B:96:0x0240, B:98:0x0246, B:100:0x024c, B:101:0x0250, B:103:0x0256, B:105:0x025c, B:108:0x0263, B:111:0x026a, B:113:0x026e, B:115:0x0274, B:117:0x027a, B:119:0x0282, B:121:0x0286, B:123:0x0292, B:125:0x0298, B:127:0x029e, B:129:0x02a4, B:130:0x02ad, B:132:0x02b2, B:134:0x02b6, B:137:0x02c2, B:136:0x02bf, B:44:0x014a, B:46:0x0150, B:142:0x02cf, B:144:0x02dd, B:146:0x02e1, B:148:0x02e9, B:156:0x02fd, B:157:0x0300, B:149:0x02ec, B:151:0x02f0, B:153:0x02f4, B:154:0x02f8, B:147:0x02e7), top: B:161:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ef A[Catch: IOException -> 0x02ce, all -> 0x0301, Merged into TryCatch #0 {all -> 0x0301, all -> 0x02fc, IOException -> 0x02ce, blocks: (B:3:0x000b, B:4:0x0011, B:6:0x0031, B:9:0x0039, B:11:0x0057, B:13:0x005f, B:15:0x006d, B:17:0x007b, B:21:0x0087, B:23:0x00af, B:25:0x00b4, B:27:0x00b8, B:29:0x00c0, B:31:0x00c8, B:32:0x00ef, B:34:0x00f3, B:35:0x0115, B:37:0x0125, B:39:0x013d, B:41:0x0143, B:48:0x0156, B:76:0x01c9, B:73:0x01c0, B:75:0x01c8, B:74:0x01c4, B:77:0x01cc, B:79:0x01d0, B:81:0x01d6, B:83:0x01de, B:86:0x01e8, B:88:0x021d, B:91:0x0225, B:93:0x022b, B:95:0x023c, B:96:0x0240, B:98:0x0246, B:100:0x024c, B:101:0x0250, B:103:0x0256, B:105:0x025c, B:108:0x0263, B:111:0x026a, B:113:0x026e, B:115:0x0274, B:117:0x027a, B:119:0x0282, B:121:0x0286, B:123:0x0292, B:125:0x0298, B:127:0x029e, B:129:0x02a4, B:130:0x02ad, B:132:0x02b2, B:134:0x02b6, B:137:0x02c2, B:136:0x02bf, B:44:0x014a, B:46:0x0150, B:142:0x02cf, B:144:0x02dd, B:146:0x02e1, B:148:0x02e9, B:156:0x02fd, B:157:0x0300, B:149:0x02ec, B:151:0x02f0, B:153:0x02f4, B:154:0x02f8, B:147:0x02e7), top: B:161:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0167 A[Catch: all -> 0x01bf, TryCatch #3 {all -> 0x01bf, blocks: (B:49:0x015b, B:51:0x0167, B:52:0x0169, B:55:0x0173, B:57:0x0179, B:62:0x0183, B:64:0x018b, B:66:0x0191, B:68:0x01a5, B:71:0x01ad), top: B:165:0x015b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021d A[Catch: IOException -> 0x02ce, all -> 0x0301, Merged into TryCatch #0 {all -> 0x0301, all -> 0x02fc, IOException -> 0x02ce, blocks: (B:3:0x000b, B:4:0x0011, B:6:0x0031, B:9:0x0039, B:11:0x0057, B:13:0x005f, B:15:0x006d, B:17:0x007b, B:21:0x0087, B:23:0x00af, B:25:0x00b4, B:27:0x00b8, B:29:0x00c0, B:31:0x00c8, B:32:0x00ef, B:34:0x00f3, B:35:0x0115, B:37:0x0125, B:39:0x013d, B:41:0x0143, B:48:0x0156, B:76:0x01c9, B:73:0x01c0, B:75:0x01c8, B:74:0x01c4, B:77:0x01cc, B:79:0x01d0, B:81:0x01d6, B:83:0x01de, B:86:0x01e8, B:88:0x021d, B:91:0x0225, B:93:0x022b, B:95:0x023c, B:96:0x0240, B:98:0x0246, B:100:0x024c, B:101:0x0250, B:103:0x0256, B:105:0x025c, B:108:0x0263, B:111:0x026a, B:113:0x026e, B:115:0x0274, B:117:0x027a, B:119:0x0282, B:121:0x0286, B:123:0x0292, B:125:0x0298, B:127:0x029e, B:129:0x02a4, B:130:0x02ad, B:132:0x02b2, B:134:0x02b6, B:137:0x02c2, B:136:0x02bf, B:44:0x014a, B:46:0x0150, B:142:0x02cf, B:144:0x02dd, B:146:0x02e1, B:148:0x02e9, B:156:0x02fd, B:157:0x0300, B:149:0x02ec, B:151:0x02f0, B:153:0x02f4, B:154:0x02f8, B:147:0x02e7), top: B:161:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0225 A[Catch: IOException -> 0x02ce, all -> 0x0301, Merged into TryCatch #0 {all -> 0x0301, all -> 0x02fc, IOException -> 0x02ce, blocks: (B:3:0x000b, B:4:0x0011, B:6:0x0031, B:9:0x0039, B:11:0x0057, B:13:0x005f, B:15:0x006d, B:17:0x007b, B:21:0x0087, B:23:0x00af, B:25:0x00b4, B:27:0x00b8, B:29:0x00c0, B:31:0x00c8, B:32:0x00ef, B:34:0x00f3, B:35:0x0115, B:37:0x0125, B:39:0x013d, B:41:0x0143, B:48:0x0156, B:76:0x01c9, B:73:0x01c0, B:75:0x01c8, B:74:0x01c4, B:77:0x01cc, B:79:0x01d0, B:81:0x01d6, B:83:0x01de, B:86:0x01e8, B:88:0x021d, B:91:0x0225, B:93:0x022b, B:95:0x023c, B:96:0x0240, B:98:0x0246, B:100:0x024c, B:101:0x0250, B:103:0x0256, B:105:0x025c, B:108:0x0263, B:111:0x026a, B:113:0x026e, B:115:0x0274, B:117:0x027a, B:119:0x0282, B:121:0x0286, B:123:0x0292, B:125:0x0298, B:127:0x029e, B:129:0x02a4, B:130:0x02ad, B:132:0x02b2, B:134:0x02b6, B:137:0x02c2, B:136:0x02bf, B:44:0x014a, B:46:0x0150, B:142:0x02cf, B:144:0x02dd, B:146:0x02e1, B:148:0x02e9, B:156:0x02fd, B:157:0x0300, B:149:0x02ec, B:151:0x02f0, B:153:0x02f4, B:154:0x02f8, B:147:0x02e7), top: B:161:0x000b }] */
    @Override // X.C1J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long open(X.C1O r37) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4888DDc.open(X.C1O):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e0 A[Catch: IOException -> 0x0131, TryCatch #2 {IOException -> 0x0131, blocks: (B:3:0x0005, B:5:0x000f, B:7:0x0013, B:9:0x001d, B:10:0x0024, B:11:0x0026, B:13:0x002b, B:14:0x0039, B:15:0x003d, B:17:0x0043, B:19:0x0047, B:21:0x004d, B:23:0x0055, B:25:0x0067, B:27:0x0070, B:29:0x0080, B:31:0x0086, B:33:0x008a, B:35:0x0094, B:36:0x009c, B:38:0x00a0, B:40:0x00ab, B:41:0x00af, B:43:0x00b4, B:57:0x00d9, B:59:0x00e0, B:62:0x00f2, B:63:0x00f7, B:64:0x0102, B:66:0x0108, B:68:0x010c, B:70:0x0110, B:74:0x0119, B:75:0x0124, B:77:0x0128, B:80:0x012d, B:45:0x00c2, B:47:0x00c8, B:49:0x00cc, B:72:0x0114), top: B:101:0x0005, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0108 A[Catch: IOException -> 0x0131, TryCatch #2 {IOException -> 0x0131, blocks: (B:3:0x0005, B:5:0x000f, B:7:0x0013, B:9:0x001d, B:10:0x0024, B:11:0x0026, B:13:0x002b, B:14:0x0039, B:15:0x003d, B:17:0x0043, B:19:0x0047, B:21:0x004d, B:23:0x0055, B:25:0x0067, B:27:0x0070, B:29:0x0080, B:31:0x0086, B:33:0x008a, B:35:0x0094, B:36:0x009c, B:38:0x00a0, B:40:0x00ab, B:41:0x00af, B:43:0x00b4, B:57:0x00d9, B:59:0x00e0, B:62:0x00f2, B:63:0x00f7, B:64:0x0102, B:66:0x0108, B:68:0x010c, B:70:0x0110, B:74:0x0119, B:75:0x0124, B:77:0x0128, B:80:0x012d, B:45:0x00c2, B:47:0x00c8, B:49:0x00cc, B:72:0x0114), top: B:101:0x0005, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0128 A[Catch: IOException -> 0x0131, TryCatch #2 {IOException -> 0x0131, blocks: (B:3:0x0005, B:5:0x000f, B:7:0x0013, B:9:0x001d, B:10:0x0024, B:11:0x0026, B:13:0x002b, B:14:0x0039, B:15:0x003d, B:17:0x0043, B:19:0x0047, B:21:0x004d, B:23:0x0055, B:25:0x0067, B:27:0x0070, B:29:0x0080, B:31:0x0086, B:33:0x008a, B:35:0x0094, B:36:0x009c, B:38:0x00a0, B:40:0x00ab, B:41:0x00af, B:43:0x00b4, B:57:0x00d9, B:59:0x00e0, B:62:0x00f2, B:63:0x00f7, B:64:0x0102, B:66:0x0108, B:68:0x010c, B:70:0x0110, B:74:0x0119, B:75:0x0124, B:77:0x0128, B:80:0x012d, B:45:0x00c2, B:47:0x00c8, B:49:0x00cc, B:72:0x0114), top: B:101:0x0005, inners: #0, #1 }] */
    @Override // X.C1L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r14, int r15, int r16) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4888DDc.read(byte[], int, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a A[PHI: r13 r15
  0x003a: PHI (r13v1 long) = (r13v0 long), (r13v3 long), (r13v3 long) binds: [B:8:0x0017, B:15:0x0032, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x003a: PHI (r15v2 long) = (r15v1 long), (r15v6 long), (r15v6 long) binds: [B:8:0x0017, B:15:0x0032, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C1O A00() {
        /*
            r16 = this;
            r4 = r16
            X.DDh r3 = r4.A07
            if (r3 == 0) goto L5e
            long r13 = r3.A02
            long r15 = r3.A01
            r1 = -1
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 != 0) goto L15
            r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L15:
            X.C0J r2 = r4.A06
            if (r2 == 0) goto L3a
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r4.A0L
            boolean r0 = r0.checkCachedLockedCacheSpan
            if (r0 == 0) goto L30
            boolean r0 = r2.A07
            if (r0 == 0) goto L30
            long r0 = r2.A04
            long r13 = r13 - r0
            long r0 = r2.A03
            long r0 = r0 - r13
            double r4 = (double) r0
            double r0 = (double) r15
            double r0 = java.lang.Math.min(r4, r0)
            long r15 = (long) r0
        L30:
            java.io.File r0 = r2.A05
            if (r0 == 0) goto L3a
            android.net.Uri r4 = android.net.Uri.fromFile(r0)
            if (r4 != 0) goto L3c
        L3a:
            android.net.Uri r4 = android.net.Uri.EMPTY
        L3c:
            r8 = 0
            java.util.Map r7 = java.util.Collections.EMPTY_MAP
            if (r4 != 0) goto L43
            android.net.Uri r4 = android.net.Uri.EMPTY
        L43:
            long r11 = r3.A00
            long r11 = r11 - r13
            r1 = 0
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 > 0) goto L4e
            r15 = -1
        L4e:
            java.lang.String r6 = r3.A06
            int r10 = r3.A03
            X.DDe r5 = r3.A05
            X.C1G.A04(r4)
            r9 = 1
            X.C1O r3 = new X.C1O
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r13, r15)
            return r3
        L5e:
            java.lang.IllegalStateException r0 = X.BV4.A0U()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4888DDc.A00():X.C1O");
    }

    private final C0J A01(InterfaceC3158C0g interfaceC3158C0g) {
        NavigableSet<C0J> navigableSetADD;
        DDh dDh = this.A07;
        if (dDh != null && (navigableSetADD = interfaceC3158C0g.ADD(dDh.A06)) != null) {
            Iterator<C0J> it = navigableSetADD.iterator();
            C7384Etj.A0U(it);
            while (it.hasNext()) {
                C0J next = it.next();
                if (dDh.A02 < next.A04) {
                    return next;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072 A[Catch: all -> 0x00c2, TryCatch #2 {all -> 0x00c2, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x000d, B:8:0x0012, B:10:0x0016, B:12:0x001a, B:18:0x002a, B:13:0x001d, B:15:0x0023, B:35:0x006c, B:32:0x0066, B:33:0x0068, B:34:0x0069, B:36:0x006e, B:38:0x0072, B:40:0x0076, B:42:0x0090, B:43:0x0092, B:47:0x00a1, B:49:0x00a8, B:19:0x0032, B:21:0x0039, B:22:0x003d, B:24:0x0042, B:29:0x0060, B:26:0x004e, B:28:0x0056, B:30:0x0064), top: B:69:0x0006, outer: #0, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090 A[Catch: all -> 0x00c2, TryCatch #2 {all -> 0x00c2, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x000d, B:8:0x0012, B:10:0x0016, B:12:0x001a, B:18:0x002a, B:13:0x001d, B:15:0x0023, B:35:0x006c, B:32:0x0066, B:33:0x0068, B:34:0x0069, B:36:0x006e, B:38:0x0072, B:40:0x0076, B:42:0x0090, B:43:0x0092, B:47:0x00a1, B:49:0x00a8, B:19:0x0032, B:21:0x0039, B:22:0x003d, B:24:0x0042, B:29:0x0060, B:26:0x004e, B:28:0x0056, B:30:0x0064), top: B:69:0x0006, outer: #0, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b5 A[Catch: all -> 0x00d1, DONT_GENERATE, TryCatch #0 {all -> 0x00d1, blocks: (B:50:0x00b1, B:52:0x00b5, B:54:0x00b9, B:55:0x00bc, B:59:0x00c3, B:61:0x00c7, B:63:0x00cb, B:64:0x00ce, B:65:0x00d0, B:3:0x0006, B:5:0x000a, B:6:0x000d, B:8:0x0012, B:10:0x0016, B:12:0x001a, B:18:0x002a, B:13:0x001d, B:15:0x0023, B:35:0x006c, B:32:0x0066, B:33:0x0068, B:34:0x0069, B:36:0x006e, B:38:0x0072, B:40:0x0076, B:42:0x0090, B:43:0x0092, B:47:0x00a1, B:49:0x00a8, B:19:0x0032, B:21:0x0039), top: B:69:0x0006, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A02() {
        /*
            r8 = this;
            java.lang.String r0 = "FbHttpCacheDataSource.closeCurrentStream"
            com.facebook.debug.tracer.Tracer.A01(r0)
            r3 = 0
            X.C0J r0 = r8.A06     // Catch: java.lang.Throwable -> Lc2
            if (r0 != 0) goto L32
            r8.hashCode()     // Catch: java.lang.Throwable -> Lc2
        Ld:
            X.C1J r4 = r8.A04     // Catch: java.lang.Throwable -> Lc2
            r2 = 1
            if (r4 == 0) goto L6e
            X.DDj r1 = r8.A05     // Catch: java.lang.Throwable -> Lc2
            if (r1 == 0) goto L1d
            boolean r0 = r8.A0D     // Catch: java.lang.Throwable -> Lc2
            if (r0 == 0) goto L2a
            r1.AWg()     // Catch: java.lang.Throwable -> Lc2
        L1d:
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r8.A0L     // Catch: java.lang.Throwable -> Lc2
            boolean r0 = r0.enableCacheDataSourceCleanClose     // Catch: java.lang.Throwable -> Lc2
            if (r0 == 0) goto L69
            java.lang.String r4 = "DataSource Close has been interrupted by loadable.cancel: %s"
            X.C1J r0 = r8.A04     // Catch: java.lang.Throwable -> Lc2
            if (r0 == 0) goto L6e
            goto L3d
        L2a:
            X.C1O r0 = r8.A00()     // Catch: java.lang.Throwable -> Lc2
            r1.AWh(r8, r0, r2)     // Catch: java.lang.Throwable -> Lc2
            goto L1d
        L32:
            r8.hashCode()     // Catch: java.lang.Throwable -> Lc2
            java.io.File r0 = r0.A05     // Catch: java.lang.Throwable -> Lc2
            if (r0 == 0) goto Ld
            r0.getPath()     // Catch: java.lang.Throwable -> Lc2
            goto Ld
        L3d:
            r0.close()     // Catch: java.io.InterruptedIOException -> L41 androidx.media3.datasource.HttpDataSource$HttpDataSourceException -> L4d java.lang.Throwable -> L65
            goto L6c
        L41:
            r0 = move-exception
            java.lang.String r1 = "FbHttpCacheDataSource"
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L65
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L65
            goto L60
        L4d:
            r2 = move-exception
            java.lang.Throwable r0 = r2.getCause()     // Catch: java.lang.Throwable -> L65
            boolean r0 = r0 instanceof java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L65
            if (r0 == 0) goto L64
            java.lang.String r1 = "FbHttpCacheDataSource"
            java.lang.String r0 = r2.getMessage()     // Catch: java.lang.Throwable -> L65
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L65
        L60:
            X.AbstractC3426CMt.A03(r1, r4, r0)     // Catch: java.lang.Throwable -> L65
            goto L6c
        L64:
            throw r2     // Catch: java.lang.Throwable -> L65
        L65:
            r0 = move-exception
            r8.A04 = r3     // Catch: java.lang.Throwable -> Lc2
            throw r0     // Catch: java.lang.Throwable -> Lc2
        L69:
            r4.close()     // Catch: java.lang.Throwable -> Lc2
        L6c:
            r8.A04 = r3     // Catch: java.lang.Throwable -> Lc2
        L6e:
            X.C0J r2 = r8.A06     // Catch: java.lang.Throwable -> Lc2
            if (r2 == 0) goto Lb1
            boolean r0 = r2.A07     // Catch: java.lang.Throwable -> Lc2
            if (r0 != 0) goto Lb1
            java.lang.String r5 = "FbHttpCacheDataSource"
            java.lang.String r7 = "Cache data sink close stream. Type:%s, Offset:%d, FileSize:%d, Vid:%s, Key:%s"
            X.DEF r6 = r8.A0J     // Catch: java.lang.Throwable -> Lc2
            long r0 = r2.A04     // Catch: java.lang.Throwable -> Lc2
            java.lang.Long r4 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> Lc2
            long r0 = r2.A03     // Catch: java.lang.Throwable -> Lc2
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> Lc2
            X.C0h r0 = r8.A0K     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r1 = r0.A04     // Catch: java.lang.Throwable -> Lc2
            X.DDh r0 = r8.A07     // Catch: java.lang.Throwable -> Lc2
            if (r0 == 0) goto L9e
            java.lang.String r0 = r0.A06     // Catch: java.lang.Throwable -> Lc2
        L92:
            java.lang.Object[] r0 = new java.lang.Object[]{r6, r4, r2, r1, r0}     // Catch: java.lang.Throwable -> Lc2
            X.AbstractC3426CMt.A03(r5, r7, r0)     // Catch: java.lang.Throwable -> Lc2
            X.C1N r0 = r8.A03     // Catch: java.lang.Throwable -> Lc2
            if (r0 == 0) goto Lb1
            goto La1
        L9e:
            java.lang.String r0 = "mDataSpecBuilder is null"
            goto L92
        La1:
            r0.close()     // Catch: com.facebook.video.heroplayer.cache.CacheDataSink$CacheDataSinkException -> La7 java.lang.Throwable -> Lc2
            r8.A03 = r3     // Catch: com.facebook.video.heroplayer.cache.CacheDataSink$CacheDataSinkException -> La7 java.lang.Throwable -> Lc2
            goto Lb1
        La7:
            r0 = move-exception
            java.lang.String r1 = "Failed to close cache data sink"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> Lc2
            X.BzX.A00(r5, r1, r0)     // Catch: java.lang.Throwable -> Lc2
        Lb1:
            X.C0J r1 = r8.A06     // Catch: java.lang.Throwable -> Ld1
            if (r1 == 0) goto Lbc
            boolean r0 = r1.A07     // Catch: java.lang.Throwable -> Ld1
            if (r0 != 0) goto Lbc
            r8.A04(r1)     // Catch: java.lang.Throwable -> Ld1
        Lbc:
            r8.A06 = r3     // Catch: java.lang.Throwable -> Ld1
            com.facebook.debug.tracer.Tracer.A00()
            return
        Lc2:
            r2 = move-exception
            X.C0J r1 = r8.A06     // Catch: java.lang.Throwable -> Ld1
            if (r1 == 0) goto Lce
            boolean r0 = r1.A07     // Catch: java.lang.Throwable -> Ld1
            if (r0 != 0) goto Lce
            r8.A04(r1)     // Catch: java.lang.Throwable -> Ld1
        Lce:
            r8.A06 = r3     // Catch: java.lang.Throwable -> Ld1
            throw r2     // Catch: java.lang.Throwable -> Ld1
        Ld1:
            r0 = move-exception
            com.facebook.debug.tracer.Tracer.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4888DDc.A02():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A03() {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4888DDc.A03():void");
    }

    private final void A04(C0J c0j) {
        C0J c0j2;
        C3157C0f c3157C0fA02 = this.A0I.A02();
        if (c3157C0fA02 != null) {
            if (this.A0L.cache.enableCacheInstrumentation && (c0j2 = this.A06) != null) {
                C0b c0b = C0b.A05;
                if (c0b == null) {
                    c0b = new C0b();
                    C0b.A05 = c0b;
                }
                Tracer.A01("CacheInstrumentationListener.onReleaseHoleSpan");
                try {
                    C3155C0d c3155C0d = c0b.A00;
                    if (c3155C0d != null) {
                        synchronized (c3155C0d) {
                            c3155C0d.A01.remove(c0j2);
                            c3155C0d.A00.remove(c0j2);
                        }
                    }
                } finally {
                    Tracer.A00();
                }
            }
            c3157C0fA02.AaF(c0j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0367 A[Catch: all -> 0x0798, TryCatch #3 {all -> 0x0798, blocks: (B:120:0x01e2, B:122:0x01e6, B:124:0x01ea, B:126:0x01fa, B:130:0x01fe, B:140:0x0232, B:143:0x0238, B:149:0x024a, B:152:0x0252, B:154:0x025c, B:156:0x0266, B:158:0x026e, B:163:0x028c, B:165:0x0294, B:168:0x02a6, B:170:0x02be, B:171:0x02ca, B:174:0x02dd, B:176:0x030f, B:178:0x0317, B:180:0x031c, B:182:0x0324, B:184:0x032a, B:186:0x0338, B:193:0x0367, B:194:0x0384, B:196:0x038a, B:197:0x03a2, B:201:0x03b0, B:218:0x048f, B:219:0x049b, B:221:0x04a1, B:225:0x04b5, B:227:0x04d1, B:217:0x0482, B:204:0x03c1, B:231:0x04dd, B:232:0x04e8, B:234:0x04ee, B:237:0x04fd, B:239:0x0505, B:241:0x0513, B:242:0x0517, B:244:0x0523, B:254:0x0540, B:208:0x03d1, B:210:0x03d9, B:213:0x03f1, B:256:0x0550, B:212:0x03e1, B:216:0x0478, B:188:0x0343, B:190:0x0347, B:192:0x034f, B:257:0x05b7, B:258:0x05bd, B:260:0x05d5, B:266:0x05e4, B:267:0x05ed, B:269:0x05f3, B:270:0x05f7, B:272:0x0632, B:274:0x0636, B:281:0x0655, B:339:0x0787, B:340:0x078a, B:282:0x0658, B:284:0x065c, B:288:0x0664, B:290:0x066d, B:292:0x0675, B:294:0x067b, B:295:0x0692, B:297:0x0698, B:298:0x069a, B:300:0x06b9, B:301:0x06bc, B:302:0x06d1, B:307:0x06fd, B:308:0x0701, B:303:0x06d4, B:305:0x06da, B:306:0x06f8, B:310:0x0703, B:311:0x070c, B:262:0x05db, B:264:0x05df, B:313:0x0715, B:315:0x0726, B:317:0x072f, B:319:0x073d, B:320:0x0744, B:322:0x074a, B:324:0x0750, B:325:0x0752, B:327:0x0767, B:328:0x076a, B:330:0x0770, B:332:0x0774, B:146:0x0240, B:148:0x0246, B:337:0x0781, B:275:0x063d, B:277:0x0649, B:278:0x064b, B:280:0x0653, B:125:0x01eb), top: B:357:0x01e2, outer: #6, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0523 A[Catch: all -> 0x0798, TryCatch #3 {all -> 0x0798, blocks: (B:120:0x01e2, B:122:0x01e6, B:124:0x01ea, B:126:0x01fa, B:130:0x01fe, B:140:0x0232, B:143:0x0238, B:149:0x024a, B:152:0x0252, B:154:0x025c, B:156:0x0266, B:158:0x026e, B:163:0x028c, B:165:0x0294, B:168:0x02a6, B:170:0x02be, B:171:0x02ca, B:174:0x02dd, B:176:0x030f, B:178:0x0317, B:180:0x031c, B:182:0x0324, B:184:0x032a, B:186:0x0338, B:193:0x0367, B:194:0x0384, B:196:0x038a, B:197:0x03a2, B:201:0x03b0, B:218:0x048f, B:219:0x049b, B:221:0x04a1, B:225:0x04b5, B:227:0x04d1, B:217:0x0482, B:204:0x03c1, B:231:0x04dd, B:232:0x04e8, B:234:0x04ee, B:237:0x04fd, B:239:0x0505, B:241:0x0513, B:242:0x0517, B:244:0x0523, B:254:0x0540, B:208:0x03d1, B:210:0x03d9, B:213:0x03f1, B:256:0x0550, B:212:0x03e1, B:216:0x0478, B:188:0x0343, B:190:0x0347, B:192:0x034f, B:257:0x05b7, B:258:0x05bd, B:260:0x05d5, B:266:0x05e4, B:267:0x05ed, B:269:0x05f3, B:270:0x05f7, B:272:0x0632, B:274:0x0636, B:281:0x0655, B:339:0x0787, B:340:0x078a, B:282:0x0658, B:284:0x065c, B:288:0x0664, B:290:0x066d, B:292:0x0675, B:294:0x067b, B:295:0x0692, B:297:0x0698, B:298:0x069a, B:300:0x06b9, B:301:0x06bc, B:302:0x06d1, B:307:0x06fd, B:308:0x0701, B:303:0x06d4, B:305:0x06da, B:306:0x06f8, B:310:0x0703, B:311:0x070c, B:262:0x05db, B:264:0x05df, B:313:0x0715, B:315:0x0726, B:317:0x072f, B:319:0x073d, B:320:0x0744, B:322:0x074a, B:324:0x0750, B:325:0x0752, B:327:0x0767, B:328:0x076a, B:330:0x0770, B:332:0x0774, B:146:0x0240, B:148:0x0246, B:337:0x0781, B:275:0x063d, B:277:0x0649, B:278:0x064b, B:280:0x0653, B:125:0x01eb), top: B:357:0x01e2, outer: #6, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0153 A[Catch: all -> 0x079d, TryCatch #6 {all -> 0x079d, blocks: (B:3:0x0005, B:5:0x000b, B:10:0x0025, B:13:0x0033, B:15:0x0037, B:17:0x003d, B:21:0x004b, B:23:0x0055, B:25:0x005f, B:27:0x0065, B:29:0x006f, B:30:0x0078, B:32:0x007c, B:33:0x0085, B:34:0x008a, B:35:0x008d, B:37:0x0091, B:39:0x0097, B:41:0x009b, B:43:0x00a1, B:45:0x00a7, B:47:0x00ae, B:49:0x00b3, B:51:0x00b7, B:53:0x00bd, B:55:0x00c1, B:70:0x0108, B:72:0x010e, B:74:0x0112, B:75:0x011a, B:76:0x011d, B:79:0x013b, B:81:0x013f, B:83:0x0143, B:85:0x0149, B:87:0x014f, B:89:0x0153, B:90:0x0155, B:91:0x0162, B:93:0x0166, B:99:0x017d, B:101:0x0187, B:58:0x00ce, B:60:0x00d4, B:61:0x00d7, B:62:0x00db, B:63:0x00dc, B:65:0x00e2, B:67:0x00e6, B:68:0x00ef, B:69:0x00ff, B:48:0x00b1, B:78:0x012e, B:94:0x016c, B:96:0x0174, B:98:0x017a, B:103:0x0191, B:105:0x0198, B:106:0x019f, B:108:0x01a3, B:110:0x01a7, B:111:0x01b0, B:113:0x01b6, B:115:0x01c0, B:117:0x01c4, B:118:0x01cb, B:131:0x01ff, B:347:0x0799, B:348:0x079c, B:133:0x0204, B:135:0x0208, B:136:0x021a, B:138:0x021e, B:139:0x022d, B:159:0x0281, B:333:0x0777, B:345:0x0793, B:120:0x01e2, B:122:0x01e6, B:124:0x01ea, B:126:0x01fa, B:130:0x01fe, B:140:0x0232, B:143:0x0238, B:149:0x024a, B:152:0x0252, B:154:0x025c, B:156:0x0266, B:158:0x026e, B:163:0x028c, B:165:0x0294, B:168:0x02a6, B:170:0x02be, B:171:0x02ca, B:174:0x02dd, B:176:0x030f, B:178:0x0317, B:180:0x031c, B:182:0x0324, B:184:0x032a, B:186:0x0338, B:193:0x0367, B:194:0x0384, B:196:0x038a, B:197:0x03a2, B:201:0x03b0, B:218:0x048f, B:219:0x049b, B:221:0x04a1, B:225:0x04b5, B:227:0x04d1, B:217:0x0482, B:204:0x03c1, B:231:0x04dd, B:232:0x04e8, B:234:0x04ee, B:237:0x04fd, B:239:0x0505, B:241:0x0513, B:242:0x0517, B:244:0x0523, B:254:0x0540, B:208:0x03d1, B:210:0x03d9, B:213:0x03f1, B:256:0x0550, B:212:0x03e1, B:216:0x0478, B:188:0x0343, B:190:0x0347, B:192:0x034f, B:257:0x05b7, B:258:0x05bd, B:260:0x05d5, B:266:0x05e4, B:267:0x05ed, B:269:0x05f3, B:270:0x05f7, B:272:0x0632, B:274:0x0636, B:281:0x0655, B:339:0x0787, B:340:0x078a, B:282:0x0658, B:284:0x065c, B:288:0x0664, B:290:0x066d, B:292:0x0675, B:294:0x067b, B:295:0x0692, B:297:0x0698, B:298:0x069a, B:300:0x06b9, B:301:0x06bc, B:302:0x06d1, B:307:0x06fd, B:308:0x0701, B:303:0x06d4, B:305:0x06da, B:306:0x06f8, B:310:0x0703, B:311:0x070c, B:262:0x05db, B:264:0x05df, B:313:0x0715, B:315:0x0726, B:317:0x072f, B:319:0x073d, B:320:0x0744, B:322:0x074a, B:324:0x0750, B:325:0x0752, B:327:0x0767, B:328:0x076a, B:330:0x0770, B:332:0x0774, B:146:0x0240, B:148:0x0246, B:337:0x0781, B:275:0x063d, B:277:0x0649, B:278:0x064b, B:280:0x0653, B:125:0x01eb), top: B:361:0x0005, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0166 A[Catch: all -> 0x079d, TryCatch #6 {all -> 0x079d, blocks: (B:3:0x0005, B:5:0x000b, B:10:0x0025, B:13:0x0033, B:15:0x0037, B:17:0x003d, B:21:0x004b, B:23:0x0055, B:25:0x005f, B:27:0x0065, B:29:0x006f, B:30:0x0078, B:32:0x007c, B:33:0x0085, B:34:0x008a, B:35:0x008d, B:37:0x0091, B:39:0x0097, B:41:0x009b, B:43:0x00a1, B:45:0x00a7, B:47:0x00ae, B:49:0x00b3, B:51:0x00b7, B:53:0x00bd, B:55:0x00c1, B:70:0x0108, B:72:0x010e, B:74:0x0112, B:75:0x011a, B:76:0x011d, B:79:0x013b, B:81:0x013f, B:83:0x0143, B:85:0x0149, B:87:0x014f, B:89:0x0153, B:90:0x0155, B:91:0x0162, B:93:0x0166, B:99:0x017d, B:101:0x0187, B:58:0x00ce, B:60:0x00d4, B:61:0x00d7, B:62:0x00db, B:63:0x00dc, B:65:0x00e2, B:67:0x00e6, B:68:0x00ef, B:69:0x00ff, B:48:0x00b1, B:78:0x012e, B:94:0x016c, B:96:0x0174, B:98:0x017a, B:103:0x0191, B:105:0x0198, B:106:0x019f, B:108:0x01a3, B:110:0x01a7, B:111:0x01b0, B:113:0x01b6, B:115:0x01c0, B:117:0x01c4, B:118:0x01cb, B:131:0x01ff, B:347:0x0799, B:348:0x079c, B:133:0x0204, B:135:0x0208, B:136:0x021a, B:138:0x021e, B:139:0x022d, B:159:0x0281, B:333:0x0777, B:345:0x0793, B:120:0x01e2, B:122:0x01e6, B:124:0x01ea, B:126:0x01fa, B:130:0x01fe, B:140:0x0232, B:143:0x0238, B:149:0x024a, B:152:0x0252, B:154:0x025c, B:156:0x0266, B:158:0x026e, B:163:0x028c, B:165:0x0294, B:168:0x02a6, B:170:0x02be, B:171:0x02ca, B:174:0x02dd, B:176:0x030f, B:178:0x0317, B:180:0x031c, B:182:0x0324, B:184:0x032a, B:186:0x0338, B:193:0x0367, B:194:0x0384, B:196:0x038a, B:197:0x03a2, B:201:0x03b0, B:218:0x048f, B:219:0x049b, B:221:0x04a1, B:225:0x04b5, B:227:0x04d1, B:217:0x0482, B:204:0x03c1, B:231:0x04dd, B:232:0x04e8, B:234:0x04ee, B:237:0x04fd, B:239:0x0505, B:241:0x0513, B:242:0x0517, B:244:0x0523, B:254:0x0540, B:208:0x03d1, B:210:0x03d9, B:213:0x03f1, B:256:0x0550, B:212:0x03e1, B:216:0x0478, B:188:0x0343, B:190:0x0347, B:192:0x034f, B:257:0x05b7, B:258:0x05bd, B:260:0x05d5, B:266:0x05e4, B:267:0x05ed, B:269:0x05f3, B:270:0x05f7, B:272:0x0632, B:274:0x0636, B:281:0x0655, B:339:0x0787, B:340:0x078a, B:282:0x0658, B:284:0x065c, B:288:0x0664, B:290:0x066d, B:292:0x0675, B:294:0x067b, B:295:0x0692, B:297:0x0698, B:298:0x069a, B:300:0x06b9, B:301:0x06bc, B:302:0x06d1, B:307:0x06fd, B:308:0x0701, B:303:0x06d4, B:305:0x06da, B:306:0x06f8, B:310:0x0703, B:311:0x070c, B:262:0x05db, B:264:0x05df, B:313:0x0715, B:315:0x0726, B:317:0x072f, B:319:0x073d, B:320:0x0744, B:322:0x074a, B:324:0x0750, B:325:0x0752, B:327:0x0767, B:328:0x076a, B:330:0x0770, B:332:0x0774, B:146:0x0240, B:148:0x0246, B:337:0x0781, B:275:0x063d, B:277:0x0649, B:278:0x064b, B:280:0x0653, B:125:0x01eb), top: B:361:0x0005, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017d A[Catch: all -> 0x079d, TryCatch #6 {all -> 0x079d, blocks: (B:3:0x0005, B:5:0x000b, B:10:0x0025, B:13:0x0033, B:15:0x0037, B:17:0x003d, B:21:0x004b, B:23:0x0055, B:25:0x005f, B:27:0x0065, B:29:0x006f, B:30:0x0078, B:32:0x007c, B:33:0x0085, B:34:0x008a, B:35:0x008d, B:37:0x0091, B:39:0x0097, B:41:0x009b, B:43:0x00a1, B:45:0x00a7, B:47:0x00ae, B:49:0x00b3, B:51:0x00b7, B:53:0x00bd, B:55:0x00c1, B:70:0x0108, B:72:0x010e, B:74:0x0112, B:75:0x011a, B:76:0x011d, B:79:0x013b, B:81:0x013f, B:83:0x0143, B:85:0x0149, B:87:0x014f, B:89:0x0153, B:90:0x0155, B:91:0x0162, B:93:0x0166, B:99:0x017d, B:101:0x0187, B:58:0x00ce, B:60:0x00d4, B:61:0x00d7, B:62:0x00db, B:63:0x00dc, B:65:0x00e2, B:67:0x00e6, B:68:0x00ef, B:69:0x00ff, B:48:0x00b1, B:78:0x012e, B:94:0x016c, B:96:0x0174, B:98:0x017a, B:103:0x0191, B:105:0x0198, B:106:0x019f, B:108:0x01a3, B:110:0x01a7, B:111:0x01b0, B:113:0x01b6, B:115:0x01c0, B:117:0x01c4, B:118:0x01cb, B:131:0x01ff, B:347:0x0799, B:348:0x079c, B:133:0x0204, B:135:0x0208, B:136:0x021a, B:138:0x021e, B:139:0x022d, B:159:0x0281, B:333:0x0777, B:345:0x0793, B:120:0x01e2, B:122:0x01e6, B:124:0x01ea, B:126:0x01fa, B:130:0x01fe, B:140:0x0232, B:143:0x0238, B:149:0x024a, B:152:0x0252, B:154:0x025c, B:156:0x0266, B:158:0x026e, B:163:0x028c, B:165:0x0294, B:168:0x02a6, B:170:0x02be, B:171:0x02ca, B:174:0x02dd, B:176:0x030f, B:178:0x0317, B:180:0x031c, B:182:0x0324, B:184:0x032a, B:186:0x0338, B:193:0x0367, B:194:0x0384, B:196:0x038a, B:197:0x03a2, B:201:0x03b0, B:218:0x048f, B:219:0x049b, B:221:0x04a1, B:225:0x04b5, B:227:0x04d1, B:217:0x0482, B:204:0x03c1, B:231:0x04dd, B:232:0x04e8, B:234:0x04ee, B:237:0x04fd, B:239:0x0505, B:241:0x0513, B:242:0x0517, B:244:0x0523, B:254:0x0540, B:208:0x03d1, B:210:0x03d9, B:213:0x03f1, B:256:0x0550, B:212:0x03e1, B:216:0x0478, B:188:0x0343, B:190:0x0347, B:192:0x034f, B:257:0x05b7, B:258:0x05bd, B:260:0x05d5, B:266:0x05e4, B:267:0x05ed, B:269:0x05f3, B:270:0x05f7, B:272:0x0632, B:274:0x0636, B:281:0x0655, B:339:0x0787, B:340:0x078a, B:282:0x0658, B:284:0x065c, B:288:0x0664, B:290:0x066d, B:292:0x0675, B:294:0x067b, B:295:0x0692, B:297:0x0698, B:298:0x069a, B:300:0x06b9, B:301:0x06bc, B:302:0x06d1, B:307:0x06fd, B:308:0x0701, B:303:0x06d4, B:305:0x06da, B:306:0x06f8, B:310:0x0703, B:311:0x070c, B:262:0x05db, B:264:0x05df, B:313:0x0715, B:315:0x0726, B:317:0x072f, B:319:0x073d, B:320:0x0744, B:322:0x074a, B:324:0x0750, B:325:0x0752, B:327:0x0767, B:328:0x076a, B:330:0x0770, B:332:0x0774, B:146:0x0240, B:148:0x0246, B:337:0x0781, B:275:0x063d, B:277:0x0649, B:278:0x064b, B:280:0x0653, B:125:0x01eb), top: B:361:0x0005, inners: #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A05(boolean r99) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4888DDc.A05(boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
    
        throw r0;
     */
    @Override // X.C1J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r4 = this;
            java.lang.String r0 = "FbHttpCacheDataSource.close"
            com.facebook.debug.tracer.Tracer.A01(r0)
            boolean r0 = r4.A09     // Catch: java.lang.Throwable -> L8a
            if (r0 != 0) goto L5e
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r1 = r4.A0L     // Catch: java.lang.Throwable -> L8a
            boolean r0 = r1.enableCacheDataSourceCleanClose     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L3f
            java.lang.String r0 = "FbHttpCacheDataSource.closeCurrentStreamSafely"
            com.facebook.debug.tracer.Tracer.A01(r0)     // Catch: java.lang.Throwable -> L8a
            r2 = 0
            X.DDS r0 = r1.cache     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.enableCacheInstrumentation     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L2d
            X.C0c r1 = r4.A08     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L2d
            X.C0b r0 = X.C0b.A05     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L2a
            X.C0b r0 = new X.C0b     // Catch: java.lang.Throwable -> L36
            r0.<init>()     // Catch: java.lang.Throwable -> L36
            X.C0b.A05 = r0     // Catch: java.lang.Throwable -> L36
        L2a:
            r0.A00(r1)     // Catch: java.lang.Throwable -> L36
        L2d:
            r4.A02()     // Catch: java.lang.Throwable -> L36
            r4.A07 = r2     // Catch: java.lang.Throwable -> L3a
            com.facebook.debug.tracer.Tracer.A00()     // Catch: java.lang.Throwable -> L8a
            goto L86
        L36:
            r0 = move-exception
            r4.A07 = r2     // Catch: java.lang.Throwable -> L3a
            throw r0     // Catch: java.lang.Throwable -> L3a
        L3a:
            r0 = move-exception
            com.facebook.debug.tracer.Tracer.A00()     // Catch: java.lang.Throwable -> L8a
            throw r0     // Catch: java.lang.Throwable -> L8a
        L3f:
            X.DDS r0 = r1.cache     // Catch: java.lang.Throwable -> L8a
            boolean r0 = r0.enableCacheInstrumentation     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L57
            X.C0c r1 = r4.A08     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L57
            X.C0b r0 = X.C0b.A05     // Catch: java.lang.Throwable -> L8a
            if (r0 != 0) goto L54
            X.C0b r0 = new X.C0b     // Catch: java.lang.Throwable -> L8a
            r0.<init>()     // Catch: java.lang.Throwable -> L8a
            X.C0b.A05 = r0     // Catch: java.lang.Throwable -> L8a
        L54:
            r0.A00(r1)     // Catch: java.lang.Throwable -> L8a
        L57:
            r4.A02()     // Catch: java.lang.Throwable -> L8a
            r0 = 0
            r4.A07 = r0     // Catch: java.lang.Throwable -> L8a
            goto L86
        L5e:
            X.DDh r4 = r4.A07     // Catch: java.lang.Throwable -> L8a
            if (r4 == 0) goto L83
            java.lang.String r3 = "[overfetch] datasource is attempted to call close, but continue for position: %d length: %d"
            long r0 = r4.A02     // Catch: java.lang.Throwable -> L8a
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L8a
            long r0 = r4.A01     // Catch: java.lang.Throwable -> L8a
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L8a
            r1 = 2
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}     // Catch: java.lang.Throwable -> L8a
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = java.lang.String.format(r3, r0)     // Catch: java.lang.Throwable -> L8a
        L7d:
            java.lang.String r0 = "FbHttpCacheDataSource"
            X.AbstractC3426CMt.A02(r0, r1)     // Catch: java.lang.Throwable -> L8a
            goto L86
        L83:
            java.lang.String r1 = "[overfetch] datasource is attempted to call close"
            goto L7d
        L86:
            com.facebook.debug.tracer.Tracer.A00()
            return
        L8a:
            r0 = move-exception
            com.facebook.debug.tracer.Tracer.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4888DDc.close():void");
    }

    @Override // X.C1J
    public final /* synthetic */ Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override // X.C1J
    public final Uri getUri() {
        return null;
    }
}
