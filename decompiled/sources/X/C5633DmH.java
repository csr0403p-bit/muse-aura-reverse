package X;

import android.os.SystemClock;
import androidx.media3.common.util.Util;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.DmH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5633DmH implements InterfaceC5745Dog {
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public long A05;
    public C7427Evj A08;
    public Integer A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final int A0E;
    public final C5462Dix A0F;
    public final C5650Dme A0G;
    public final C5092DXa A0H;
    public final C5596Dlb A0I;
    public final AtomicBoolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final int A0Q;
    public final long A0R;
    public final long A0S;
    public final DwB A0T;
    public final DVC A0U;
    public final AtomicBoolean A0V;
    public final AtomicBoolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public volatile C5437DiY A0b;
    public volatile Boolean A0c;
    public long A06 = -9223372036854775807L;
    public volatile long A0Z = -9223372036854775807L;
    public volatile long A0a = -9223372036854775807L;
    public long A07 = -1;
    public long A03 = -9223372036854775807L;

    private void A01(boolean z) {
        this.A01 = 0;
        this.A0A = false;
        this.A0c = null;
        if (z) {
            C5462Dix c5462Dix = this.A0F;
            synchronized (c5462Dix) {
                c5462Dix.A00(0);
            }
        }
        this.A0Z = -9223372036854775807L;
        this.A06 = -9223372036854775807L;
        this.A07 = -1L;
        this.A03 = -9223372036854775807L;
    }

    @Override // X.InterfaceC5745Dog
    public final void AUu(E6Y e6y) {
        A01(false);
    }

    @Override // X.InterfaceC5745Dog
    public final void AVG(E6Y e6y) {
        A01(true);
    }

    @Override // X.InterfaceC5745Dog
    public final void AWJ(E6Y e6y) {
        A01(true);
    }

    private long A00() {
        long jA00;
        C5596Dlb c5596Dlb;
        int i;
        long j = this.A0Z;
        long j2 = this.A0a;
        if (j == -9223372036854775807L) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = this.A06;
            if (j3 == -9223372036854775807L) {
                this.A06 = jElapsedRealtime;
            } else if (jElapsedRealtime - j3 > j2) {
                this.A0Z = -9223372036854775807L;
                this.A06 = -9223372036854775807L;
            }
        }
        long j4 = this.A0Z;
        if (j4 != -9223372036854775807L) {
            UUID uuid = AbstractC5400Dhr.A04;
            jA00 = Util.A0A(j4);
        } else if (!this.A0C || (c5596Dlb = this.A0I) == null) {
            jA00 = this.A04;
        } else {
            if (this.A0B) {
                i = 5;
                if (C79.A00.equals(C79.A01)) {
                    i = 4;
                }
            } else {
                i = 7;
                if (this.A09.intValue() != 0) {
                    i = 3;
                }
            }
            jA00 = C5596Dlb.A00(c5596Dlb, i) * 1000;
        }
        return (long) (jA00 * 1.0d);
    }

    private boolean A02() {
        AtomicBoolean atomicBoolean;
        if (this.A0X && (atomicBoolean = this.A0J) != null && atomicBoolean.get()) {
            return true;
        }
        AtomicBoolean atomicBoolean2 = this.A0V;
        if (atomicBoolean2 != null && atomicBoolean2.get()) {
            return true;
        }
        AtomicBoolean atomicBoolean3 = this.A0W;
        return atomicBoolean3 != null && atomicBoolean3.get();
    }

    @Override // X.InterfaceC5745Dog
    public final InterfaceC5538DkF ACN() {
        return this.A0F;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    @Override // X.InterfaceC5745Dog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AWf(X.C5820Dq6 r7, X.C5414DiA r8, X.InterfaceC5441Dic[] r9) {
        /*
            r6 = this;
            int r3 = r6.A0Q
            r0 = -1
            if (r3 != r0) goto L40
            int r5 = r9.length
            r4 = 0
            r3 = 0
        L8:
            if (r4 >= r5) goto L40
            r0 = r9[r4]
            if (r0 == 0) goto L26
            X.DhZ r0 = r0.ALt()
            int r2 = r0.A02
            boolean r0 = r6.A0D
            r1 = 0
            if (r0 == 0) goto L2f
            r0 = 1
            if (r2 == r0) goto L2c
            r0 = 2
            if (r2 == r0) goto L29
            r0 = 3
            if (r2 == r0) goto L32
            r0 = 5
            if (r2 == r0) goto L32
        L25:
            int r3 = r3 + r1
        L26:
            int r4 = r4 + 1
            goto L8
        L29:
            int r1 = r6.A02
            goto L25
        L2c:
            int r1 = r6.A00
            goto L25
        L2f:
            switch(r2) {
                case -1: goto L3b;
                case 0: goto L32;
                case 1: goto L38;
                case 2: goto L35;
                default: goto L32;
            }
        L32:
            r1 = 131072(0x20000, float:1.83671E-40)
            goto L25
        L35:
            r1 = 13107200(0xc80000, float:1.8367099E-38)
            goto L25
        L38:
            r1 = 3538944(0x360000, float:4.959117E-39)
            goto L25
        L3b:
            java.lang.IllegalArgumentException r0 = X.BV4.A0P()
            throw r0
        L40:
            r6.A01 = r3
            X.Dix r0 = r6.A0F
            r0.A00(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5633DmH.AWf(X.Dq6, X.DiA, X.Dic[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018c A[Catch: all -> 0x027e, TryCatch #1 {all -> 0x027e, blocks: (B:3:0x000c, B:5:0x001b, B:7:0x0023, B:13:0x002d, B:15:0x0031, B:16:0x0042, B:18:0x0052, B:21:0x005a, B:23:0x0060, B:29:0x0071, B:31:0x0074, B:39:0x0085, B:35:0x007e, B:42:0x008b, B:43:0x008c, B:45:0x0092, B:48:0x009a, B:50:0x00a1, B:52:0x00a7, B:75:0x00eb, B:77:0x00f1, B:79:0x00f9, B:81:0x0100, B:84:0x0108, B:86:0x010e, B:88:0x0114, B:128:0x0196, B:130:0x019c, B:132:0x01a4, B:133:0x01a9, B:135:0x01ad, B:137:0x01b1, B:139:0x01b7, B:141:0x01c5, B:142:0x01ca, B:145:0x01d2, B:146:0x01dc, B:148:0x01e0, B:149:0x01eb, B:151:0x01f1, B:155:0x01f8, B:165:0x020f, B:166:0x0211, B:169:0x0217, B:170:0x0230, B:172:0x0236, B:174:0x023a, B:176:0x0240, B:179:0x0246, B:181:0x024c, B:183:0x0257, B:184:0x025f, B:187:0x026c, B:161:0x0203, B:163:0x0207, B:164:0x020a, B:89:0x0119, B:91:0x0121, B:94:0x012b, B:97:0x0132, B:101:0x013c, B:104:0x0142, B:109:0x014c, B:111:0x0150, B:113:0x0154, B:115:0x0158, B:117:0x0179, B:118:0x017b, B:120:0x0183, B:116:0x0176, B:124:0x018c, B:125:0x018f, B:55:0x00b2, B:57:0x00ba, B:60:0x00c4, B:63:0x00cb, B:67:0x00d5, B:70:0x00db, B:72:0x00e3, B:73:0x00e6, B:24:0x0061, B:26:0x0069), top: B:198:0x000c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008c A[Catch: all -> 0x027e, TryCatch #1 {all -> 0x027e, blocks: (B:3:0x000c, B:5:0x001b, B:7:0x0023, B:13:0x002d, B:15:0x0031, B:16:0x0042, B:18:0x0052, B:21:0x005a, B:23:0x0060, B:29:0x0071, B:31:0x0074, B:39:0x0085, B:35:0x007e, B:42:0x008b, B:43:0x008c, B:45:0x0092, B:48:0x009a, B:50:0x00a1, B:52:0x00a7, B:75:0x00eb, B:77:0x00f1, B:79:0x00f9, B:81:0x0100, B:84:0x0108, B:86:0x010e, B:88:0x0114, B:128:0x0196, B:130:0x019c, B:132:0x01a4, B:133:0x01a9, B:135:0x01ad, B:137:0x01b1, B:139:0x01b7, B:141:0x01c5, B:142:0x01ca, B:145:0x01d2, B:146:0x01dc, B:148:0x01e0, B:149:0x01eb, B:151:0x01f1, B:155:0x01f8, B:165:0x020f, B:166:0x0211, B:169:0x0217, B:170:0x0230, B:172:0x0236, B:174:0x023a, B:176:0x0240, B:179:0x0246, B:181:0x024c, B:183:0x0257, B:184:0x025f, B:187:0x026c, B:161:0x0203, B:163:0x0207, B:164:0x020a, B:89:0x0119, B:91:0x0121, B:94:0x012b, B:97:0x0132, B:101:0x013c, B:104:0x0142, B:109:0x014c, B:111:0x0150, B:113:0x0154, B:115:0x0158, B:117:0x0179, B:118:0x017b, B:120:0x0183, B:116:0x0176, B:124:0x018c, B:125:0x018f, B:55:0x00b2, B:57:0x00ba, B:60:0x00c4, B:63:0x00cb, B:67:0x00d5, B:70:0x00db, B:72:0x00e3, B:73:0x00e6, B:24:0x0061, B:26:0x0069), top: B:198:0x000c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b2 A[Catch: all -> 0x027e, TryCatch #1 {all -> 0x027e, blocks: (B:3:0x000c, B:5:0x001b, B:7:0x0023, B:13:0x002d, B:15:0x0031, B:16:0x0042, B:18:0x0052, B:21:0x005a, B:23:0x0060, B:29:0x0071, B:31:0x0074, B:39:0x0085, B:35:0x007e, B:42:0x008b, B:43:0x008c, B:45:0x0092, B:48:0x009a, B:50:0x00a1, B:52:0x00a7, B:75:0x00eb, B:77:0x00f1, B:79:0x00f9, B:81:0x0100, B:84:0x0108, B:86:0x010e, B:88:0x0114, B:128:0x0196, B:130:0x019c, B:132:0x01a4, B:133:0x01a9, B:135:0x01ad, B:137:0x01b1, B:139:0x01b7, B:141:0x01c5, B:142:0x01ca, B:145:0x01d2, B:146:0x01dc, B:148:0x01e0, B:149:0x01eb, B:151:0x01f1, B:155:0x01f8, B:165:0x020f, B:166:0x0211, B:169:0x0217, B:170:0x0230, B:172:0x0236, B:174:0x023a, B:176:0x0240, B:179:0x0246, B:181:0x024c, B:183:0x0257, B:184:0x025f, B:187:0x026c, B:161:0x0203, B:163:0x0207, B:164:0x020a, B:89:0x0119, B:91:0x0121, B:94:0x012b, B:97:0x0132, B:101:0x013c, B:104:0x0142, B:109:0x014c, B:111:0x0150, B:113:0x0154, B:115:0x0158, B:117:0x0179, B:118:0x017b, B:120:0x0183, B:116:0x0176, B:124:0x018c, B:125:0x018f, B:55:0x00b2, B:57:0x00ba, B:60:0x00c4, B:63:0x00cb, B:67:0x00d5, B:70:0x00db, B:72:0x00e3, B:73:0x00e6, B:24:0x0061, B:26:0x0069), top: B:198:0x000c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cb A[Catch: all -> 0x027e, TryCatch #1 {all -> 0x027e, blocks: (B:3:0x000c, B:5:0x001b, B:7:0x0023, B:13:0x002d, B:15:0x0031, B:16:0x0042, B:18:0x0052, B:21:0x005a, B:23:0x0060, B:29:0x0071, B:31:0x0074, B:39:0x0085, B:35:0x007e, B:42:0x008b, B:43:0x008c, B:45:0x0092, B:48:0x009a, B:50:0x00a1, B:52:0x00a7, B:75:0x00eb, B:77:0x00f1, B:79:0x00f9, B:81:0x0100, B:84:0x0108, B:86:0x010e, B:88:0x0114, B:128:0x0196, B:130:0x019c, B:132:0x01a4, B:133:0x01a9, B:135:0x01ad, B:137:0x01b1, B:139:0x01b7, B:141:0x01c5, B:142:0x01ca, B:145:0x01d2, B:146:0x01dc, B:148:0x01e0, B:149:0x01eb, B:151:0x01f1, B:155:0x01f8, B:165:0x020f, B:166:0x0211, B:169:0x0217, B:170:0x0230, B:172:0x0236, B:174:0x023a, B:176:0x0240, B:179:0x0246, B:181:0x024c, B:183:0x0257, B:184:0x025f, B:187:0x026c, B:161:0x0203, B:163:0x0207, B:164:0x020a, B:89:0x0119, B:91:0x0121, B:94:0x012b, B:97:0x0132, B:101:0x013c, B:104:0x0142, B:109:0x014c, B:111:0x0150, B:113:0x0154, B:115:0x0158, B:117:0x0179, B:118:0x017b, B:120:0x0183, B:116:0x0176, B:124:0x018c, B:125:0x018f, B:55:0x00b2, B:57:0x00ba, B:60:0x00c4, B:63:0x00cb, B:67:0x00d5, B:70:0x00db, B:72:0x00e3, B:73:0x00e6, B:24:0x0061, B:26:0x0069), top: B:198:0x000c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0119 A[Catch: all -> 0x027e, TryCatch #1 {all -> 0x027e, blocks: (B:3:0x000c, B:5:0x001b, B:7:0x0023, B:13:0x002d, B:15:0x0031, B:16:0x0042, B:18:0x0052, B:21:0x005a, B:23:0x0060, B:29:0x0071, B:31:0x0074, B:39:0x0085, B:35:0x007e, B:42:0x008b, B:43:0x008c, B:45:0x0092, B:48:0x009a, B:50:0x00a1, B:52:0x00a7, B:75:0x00eb, B:77:0x00f1, B:79:0x00f9, B:81:0x0100, B:84:0x0108, B:86:0x010e, B:88:0x0114, B:128:0x0196, B:130:0x019c, B:132:0x01a4, B:133:0x01a9, B:135:0x01ad, B:137:0x01b1, B:139:0x01b7, B:141:0x01c5, B:142:0x01ca, B:145:0x01d2, B:146:0x01dc, B:148:0x01e0, B:149:0x01eb, B:151:0x01f1, B:155:0x01f8, B:165:0x020f, B:166:0x0211, B:169:0x0217, B:170:0x0230, B:172:0x0236, B:174:0x023a, B:176:0x0240, B:179:0x0246, B:181:0x024c, B:183:0x0257, B:184:0x025f, B:187:0x026c, B:161:0x0203, B:163:0x0207, B:164:0x020a, B:89:0x0119, B:91:0x0121, B:94:0x012b, B:97:0x0132, B:101:0x013c, B:104:0x0142, B:109:0x014c, B:111:0x0150, B:113:0x0154, B:115:0x0158, B:117:0x0179, B:118:0x017b, B:120:0x0183, B:116:0x0176, B:124:0x018c, B:125:0x018f, B:55:0x00b2, B:57:0x00ba, B:60:0x00c4, B:63:0x00cb, B:67:0x00d5, B:70:0x00db, B:72:0x00e3, B:73:0x00e6, B:24:0x0061, B:26:0x0069), top: B:198:0x000c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0132 A[Catch: all -> 0x027e, TryCatch #1 {all -> 0x027e, blocks: (B:3:0x000c, B:5:0x001b, B:7:0x0023, B:13:0x002d, B:15:0x0031, B:16:0x0042, B:18:0x0052, B:21:0x005a, B:23:0x0060, B:29:0x0071, B:31:0x0074, B:39:0x0085, B:35:0x007e, B:42:0x008b, B:43:0x008c, B:45:0x0092, B:48:0x009a, B:50:0x00a1, B:52:0x00a7, B:75:0x00eb, B:77:0x00f1, B:79:0x00f9, B:81:0x0100, B:84:0x0108, B:86:0x010e, B:88:0x0114, B:128:0x0196, B:130:0x019c, B:132:0x01a4, B:133:0x01a9, B:135:0x01ad, B:137:0x01b1, B:139:0x01b7, B:141:0x01c5, B:142:0x01ca, B:145:0x01d2, B:146:0x01dc, B:148:0x01e0, B:149:0x01eb, B:151:0x01f1, B:155:0x01f8, B:165:0x020f, B:166:0x0211, B:169:0x0217, B:170:0x0230, B:172:0x0236, B:174:0x023a, B:176:0x0240, B:179:0x0246, B:181:0x024c, B:183:0x0257, B:184:0x025f, B:187:0x026c, B:161:0x0203, B:163:0x0207, B:164:0x020a, B:89:0x0119, B:91:0x0121, B:94:0x012b, B:97:0x0132, B:101:0x013c, B:104:0x0142, B:109:0x014c, B:111:0x0150, B:113:0x0154, B:115:0x0158, B:117:0x0179, B:118:0x017b, B:120:0x0183, B:116:0x0176, B:124:0x018c, B:125:0x018f, B:55:0x00b2, B:57:0x00ba, B:60:0x00c4, B:63:0x00cb, B:67:0x00d5, B:70:0x00db, B:72:0x00e3, B:73:0x00e6, B:24:0x0061, B:26:0x0069), top: B:198:0x000c, inners: #0 }] */
    @Override // X.InterfaceC5745Dog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AfO(X.C5820Dq6 r30) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5633DmH.AfO(X.Dq6):boolean");
    }

    @Override // X.InterfaceC5745Dog
    public final /* synthetic */ boolean AfP() {
        CNC.A04("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Override // X.InterfaceC5745Dog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Afb(X.C5820Dq6 r11) {
        /*
            r10 = this;
            long r3 = r10.A0S
            r8 = 0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 <= 0) goto L17
            long r1 = r11.A02
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L17
            long r1 = X.C3cG.A04(r1)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 1
            if (r0 < 0) goto L18
        L17:
            r4 = 0
        L18:
            long r2 = r11.A01
            float r1 = r11.A00
            boolean r0 = r11.A09
            long r6 = androidx.media3.common.util.Util.A0D(r2, r1)
            if (r0 == 0) goto L5d
            if (r4 == 0) goto L58
            X.Dlb r1 = r10.A0I
            r0 = 9
            int r0 = X.C5596Dlb.A00(r1, r0)
            int r0 = r0 * 1000
            long r1 = (long) r0
        L31:
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L47
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L47
            boolean r0 = r10.A0M
            if (r0 != 0) goto L94
            X.Dix r0 = r10.A0F
            int r1 = r0.ALp()
            int r0 = r10.A01
            if (r1 < r0) goto L94
        L47:
            r4 = 1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10.A0Z = r2
            r10.A06 = r2
            r0 = -1
            r10.A07 = r0
            r10.A03 = r2
            return r4
        L58:
            long r1 = r10.A00()
            goto L31
        L5d:
            boolean r0 = r10.A0C
            if (r0 == 0) goto L91
            X.Dlb r4 = r10.A0I
            if (r4 == 0) goto L91
            boolean r0 = r10.A0B
            r2 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L86
            java.lang.Integer r0 = X.C79.A00
            boolean r0 = r0.equals(r0)
            r1 = 5
            if (r0 == 0) goto L75
            r1 = 4
        L75:
            int r0 = X.C5596Dlb.A00(r4, r1)
            long r0 = (long) r0
            long r0 = r0 * r2
        L7b:
            double r4 = (double) r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4 * r0
            long r2 = (long) r4
            float r1 = (float) r2
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r0
            long r1 = (long) r1
            goto L31
        L86:
            java.lang.Integer r0 = r10.A09
            int r0 = r0.intValue()
            r1 = 6
            if (r0 == 0) goto L75
            r1 = 2
            goto L75
        L91:
            long r0 = r10.A05
            goto L7b
        L94:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5633DmH.Afb(X.Dq6):boolean");
    }

    public C5633DmH(C5462Dix c5462Dix, DwB dwB, C5650Dme c5650Dme, DVC dvc, C5092DXa c5092DXa, C5596Dlb c5596Dlb, Integer num, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, AtomicBoolean atomicBoolean3, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        C1G.A09(BV5.A1P(i, 0), FGI.A0U("mBufferForPlaybackMs", " cannot be less than ", HatchPriceImpressionEventDataKt.NO_DISCOUNT));
        C1G.A09(BV5.A1P(i2, 0), FGI.A0U("mBufferForPlaybackAfterRebufferMs", " cannot be less than ", HatchPriceImpressionEventDataKt.NO_DISCOUNT));
        this.A0F = c5462Dix;
        this.A05 = i * 1000;
        this.A04 = i2 * 1000;
        this.A0I = c5596Dlb;
        this.A0Q = i3;
        this.A02 = i4;
        this.A00 = i5;
        this.A0D = z;
        this.A0M = z2;
        this.A0O = z3;
        this.A0G = c5650Dme;
        this.A0H = c5092DXa;
        this.A0T = dwB;
        this.A0U = dvc;
        this.A0W = atomicBoolean;
        this.A0V = atomicBoolean2;
        this.A0J = atomicBoolean3;
        this.A0X = z4;
        this.A0B = z5;
        this.A0Y = z6;
        this.A09 = num;
        this.A0C = z7;
        this.A0N = z8;
        this.A0L = z9;
        this.A0P = z10;
        this.A0E = i6;
        this.A0K = z11;
        this.A0S = j;
        this.A0R = i7 * 1000;
    }

    @Override // X.InterfaceC5745Dog
    public final long ACi(E6Y e6y) {
        return this.A0R;
    }

    @Override // X.InterfaceC5745Dog
    public final boolean Abj(E6Y e6y) {
        return false;
    }
}
