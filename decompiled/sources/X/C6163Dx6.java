package X;

import android.graphics.Bitmap;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import java.util.ArrayDeque;

/* renamed from: X.Dx6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6163Dx6 extends AbstractC6146Dwo {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public Bitmap A05;
    public C6154Dwx A06;
    public Di2 A07;
    public DyZ A08;
    public InterfaceC6281Dzd A09;
    public C6268DzL A0A;
    public C6262DzD A0B;
    public C6262DzD A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final ArrayDeque<C6268DzL> A0G;
    public final Di2 A0H;
    public final BVH A0I;

    public C6163Dx6(BVH bvh) {
        super(4);
        this.A0I = bvh;
        this.A09 = InterfaceC6281Dzd.A00;
        this.A0H = new Di2(0);
        this.A0A = C6268DzL.A02;
        this.A0G = BV4.A0s();
        this.A03 = -9223372036854775807L;
        this.A04 = -9223372036854775807L;
        this.A01 = 0;
        this.A02 = 1;
    }

    private void A03() {
        this.A07 = null;
        this.A01 = 0;
        this.A03 = -9223372036854775807L;
        DyZ dyZ = this.A08;
        if (dyZ != null) {
            dyZ.release();
            this.A08 = null;
        }
    }

    @Override // X.AbstractC6146Dwo
    public final void A0X() {
        this.A06 = null;
        this.A0A = C6268DzL.A02;
        this.A0G.clear();
        A03();
    }

    @Override // X.AbstractC6146Dwo
    public final void A0Y(long j, boolean z) {
        this.A02 = Math.min(this.A02, 1);
        this.A0E = false;
        this.A0D = false;
        this.A05 = null;
        this.A0C = null;
        this.A0B = null;
        this.A0F = false;
        this.A07 = null;
        DyZ dyZ = this.A08;
        if (dyZ != null) {
            dyZ.flush();
        }
        this.A0G.clear();
    }

    private void A00() throws ExoPlaybackException {
        String str = this.A06.A0b;
        if (str == null || !AbstractC6161Dx4.A07(str) || !Util.A0S(str)) {
            throw AbstractC6146Dwo.A02(this.A06, this, new ImageDecoderException("Provided decoder factory can't create decoder for format."), 4005);
        }
        DyZ dyZ = this.A08;
        if (dyZ != null) {
            dyZ.release();
        }
        this.A08 = new C6164Dx7(((BVS) this.A0I).A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r3 >= r5) goto L12;
     */
    @Override // X.AbstractC6146Dwo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0Z(X.Dy6 r9, X.C6154Dwx[] r10, long r11, long r13) {
        /*
            r8 = this;
            X.DzL r0 = r8.A0A
            long r3 = r0.A01
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L25
            java.util.ArrayDeque<X.DzL> r7 = r8.A0G
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L2d
            long r5 = r8.A03
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L25
            long r3 = r8.A04
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L2d
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L2d
        L25:
            X.DzL r0 = new X.DzL
            r0.<init>(r1, r13)
            r8.A0A = r0
            return
        L2d:
            long r1 = r8.A03
            X.DzL r0 = new X.DzL
            r0.<init>(r1, r13)
            r7.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6163Dx6.A0Z(X.Dy6, X.Dwx[], long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01b7 A[Catch: ImageDecoderException -> 0x027e, TryCatch #0 {ImageDecoderException -> 0x027e, blocks: (B:13:0x0037, B:14:0x003c, B:16:0x0040, B:18:0x0044, B:20:0x0049, B:22:0x004d, B:23:0x0052, B:25:0x005d, B:27:0x0062, B:29:0x0066, B:31:0x006a, B:34:0x0075, B:36:0x007a, B:37:0x008a, B:153:0x0274, B:155:0x027d, B:44:0x009a, B:46:0x00ac, B:49:0x00c8, B:51:0x00d4, B:82:0x0136, B:83:0x013c, B:85:0x0148, B:87:0x014e, B:86:0x014b, B:52:0x00d7, B:54:0x00ea, B:56:0x00f4, B:59:0x00fb, B:61:0x00ff, B:66:0x010b, B:68:0x0116, B:70:0x011a, B:77:0x0128, B:78:0x012b, B:48:0x00b8, B:90:0x0156, B:91:0x0161, B:93:0x0165, B:98:0x0170, B:100:0x017f, B:102:0x0185, B:104:0x0189, B:105:0x0196, B:107:0x01a1, B:108:0x01a5, B:109:0x01b3, B:111:0x01b7, B:113:0x01bc, B:115:0x01c0, B:117:0x01c9, B:124:0x01d6, B:127:0x01dc, B:129:0x020c, B:128:0x0209, B:130:0x020e, B:132:0x0220, B:154:0x0279, B:140:0x0231, B:141:0x0233, B:143:0x023b, B:145:0x0247, B:146:0x0250, B:148:0x0255, B:151:0x026b, B:150:0x0269, B:121:0x01d0), top: B:160:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0255 A[Catch: ImageDecoderException -> 0x027e, TryCatch #0 {ImageDecoderException -> 0x027e, blocks: (B:13:0x0037, B:14:0x003c, B:16:0x0040, B:18:0x0044, B:20:0x0049, B:22:0x004d, B:23:0x0052, B:25:0x005d, B:27:0x0062, B:29:0x0066, B:31:0x006a, B:34:0x0075, B:36:0x007a, B:37:0x008a, B:153:0x0274, B:155:0x027d, B:44:0x009a, B:46:0x00ac, B:49:0x00c8, B:51:0x00d4, B:82:0x0136, B:83:0x013c, B:85:0x0148, B:87:0x014e, B:86:0x014b, B:52:0x00d7, B:54:0x00ea, B:56:0x00f4, B:59:0x00fb, B:61:0x00ff, B:66:0x010b, B:68:0x0116, B:70:0x011a, B:77:0x0128, B:78:0x012b, B:48:0x00b8, B:90:0x0156, B:91:0x0161, B:93:0x0165, B:98:0x0170, B:100:0x017f, B:102:0x0185, B:104:0x0189, B:105:0x0196, B:107:0x01a1, B:108:0x01a5, B:109:0x01b3, B:111:0x01b7, B:113:0x01bc, B:115:0x01c0, B:117:0x01c9, B:124:0x01d6, B:127:0x01dc, B:129:0x020c, B:128:0x0209, B:130:0x020e, B:132:0x0220, B:154:0x0279, B:140:0x0231, B:141:0x0233, B:143:0x023b, B:145:0x0247, B:146:0x0250, B:148:0x0255, B:151:0x026b, B:150:0x0269, B:121:0x01d0), top: B:160:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0269 A[Catch: ImageDecoderException -> 0x027e, TryCatch #0 {ImageDecoderException -> 0x027e, blocks: (B:13:0x0037, B:14:0x003c, B:16:0x0040, B:18:0x0044, B:20:0x0049, B:22:0x004d, B:23:0x0052, B:25:0x005d, B:27:0x0062, B:29:0x0066, B:31:0x006a, B:34:0x0075, B:36:0x007a, B:37:0x008a, B:153:0x0274, B:155:0x027d, B:44:0x009a, B:46:0x00ac, B:49:0x00c8, B:51:0x00d4, B:82:0x0136, B:83:0x013c, B:85:0x0148, B:87:0x014e, B:86:0x014b, B:52:0x00d7, B:54:0x00ea, B:56:0x00f4, B:59:0x00fb, B:61:0x00ff, B:66:0x010b, B:68:0x0116, B:70:0x011a, B:77:0x0128, B:78:0x012b, B:48:0x00b8, B:90:0x0156, B:91:0x0161, B:93:0x0165, B:98:0x0170, B:100:0x017f, B:102:0x0185, B:104:0x0189, B:105:0x0196, B:107:0x01a1, B:108:0x01a5, B:109:0x01b3, B:111:0x01b7, B:113:0x01bc, B:115:0x01c0, B:117:0x01c9, B:124:0x01d6, B:127:0x01dc, B:129:0x020c, B:128:0x0209, B:130:0x020e, B:132:0x0220, B:154:0x0279, B:140:0x0231, B:141:0x0233, B:143:0x023b, B:145:0x0247, B:146:0x0250, B:148:0x0255, B:151:0x026b, B:150:0x0269, B:121:0x01d0), top: B:160:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0044 A[EDGE_INSN: B:162:0x0044->B:186:? BREAK  A[LOOP:0: B:14:0x003c->B:151:0x026b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0044 A[EDGE_INSN: B:167:0x0044->B:186:? BREAK  A[LOOP:0: B:14:0x003c->B:151:0x026b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075 A[Catch: ImageDecoderException -> 0x027e, PHI: r1
  0x0075: PHI (r1v16 X.Di2) = (r1v15 X.Di2), (r1v24 X.Di2) binds: [B:30:0x0068, B:32:0x0072] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {ImageDecoderException -> 0x027e, blocks: (B:13:0x0037, B:14:0x003c, B:16:0x0040, B:18:0x0044, B:20:0x0049, B:22:0x004d, B:23:0x0052, B:25:0x005d, B:27:0x0062, B:29:0x0066, B:31:0x006a, B:34:0x0075, B:36:0x007a, B:37:0x008a, B:153:0x0274, B:155:0x027d, B:44:0x009a, B:46:0x00ac, B:49:0x00c8, B:51:0x00d4, B:82:0x0136, B:83:0x013c, B:85:0x0148, B:87:0x014e, B:86:0x014b, B:52:0x00d7, B:54:0x00ea, B:56:0x00f4, B:59:0x00fb, B:61:0x00ff, B:66:0x010b, B:68:0x0116, B:70:0x011a, B:77:0x0128, B:78:0x012b, B:48:0x00b8, B:90:0x0156, B:91:0x0161, B:93:0x0165, B:98:0x0170, B:100:0x017f, B:102:0x0185, B:104:0x0189, B:105:0x0196, B:107:0x01a1, B:108:0x01a5, B:109:0x01b3, B:111:0x01b7, B:113:0x01bc, B:115:0x01c0, B:117:0x01c9, B:124:0x01d6, B:127:0x01dc, B:129:0x020c, B:128:0x0209, B:130:0x020e, B:132:0x0220, B:154:0x0279, B:140:0x0231, B:141:0x0233, B:143:0x023b, B:145:0x0247, B:146:0x0250, B:148:0x0255, B:151:0x026b, B:150:0x0269, B:121:0x01d0), top: B:160:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d4 A[Catch: ImageDecoderException -> 0x027e, TryCatch #0 {ImageDecoderException -> 0x027e, blocks: (B:13:0x0037, B:14:0x003c, B:16:0x0040, B:18:0x0044, B:20:0x0049, B:22:0x004d, B:23:0x0052, B:25:0x005d, B:27:0x0062, B:29:0x0066, B:31:0x006a, B:34:0x0075, B:36:0x007a, B:37:0x008a, B:153:0x0274, B:155:0x027d, B:44:0x009a, B:46:0x00ac, B:49:0x00c8, B:51:0x00d4, B:82:0x0136, B:83:0x013c, B:85:0x0148, B:87:0x014e, B:86:0x014b, B:52:0x00d7, B:54:0x00ea, B:56:0x00f4, B:59:0x00fb, B:61:0x00ff, B:66:0x010b, B:68:0x0116, B:70:0x011a, B:77:0x0128, B:78:0x012b, B:48:0x00b8, B:90:0x0156, B:91:0x0161, B:93:0x0165, B:98:0x0170, B:100:0x017f, B:102:0x0185, B:104:0x0189, B:105:0x0196, B:107:0x01a1, B:108:0x01a5, B:109:0x01b3, B:111:0x01b7, B:113:0x01bc, B:115:0x01c0, B:117:0x01c9, B:124:0x01d6, B:127:0x01dc, B:129:0x020c, B:128:0x0209, B:130:0x020e, B:132:0x0220, B:154:0x0279, B:140:0x0231, B:141:0x0233, B:143:0x023b, B:145:0x0247, B:146:0x0250, B:148:0x0255, B:151:0x026b, B:150:0x0269, B:121:0x01d0), top: B:160:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d7 A[Catch: ImageDecoderException -> 0x027e, TryCatch #0 {ImageDecoderException -> 0x027e, blocks: (B:13:0x0037, B:14:0x003c, B:16:0x0040, B:18:0x0044, B:20:0x0049, B:22:0x004d, B:23:0x0052, B:25:0x005d, B:27:0x0062, B:29:0x0066, B:31:0x006a, B:34:0x0075, B:36:0x007a, B:37:0x008a, B:153:0x0274, B:155:0x027d, B:44:0x009a, B:46:0x00ac, B:49:0x00c8, B:51:0x00d4, B:82:0x0136, B:83:0x013c, B:85:0x0148, B:87:0x014e, B:86:0x014b, B:52:0x00d7, B:54:0x00ea, B:56:0x00f4, B:59:0x00fb, B:61:0x00ff, B:66:0x010b, B:68:0x0116, B:70:0x011a, B:77:0x0128, B:78:0x012b, B:48:0x00b8, B:90:0x0156, B:91:0x0161, B:93:0x0165, B:98:0x0170, B:100:0x017f, B:102:0x0185, B:104:0x0189, B:105:0x0196, B:107:0x01a1, B:108:0x01a5, B:109:0x01b3, B:111:0x01b7, B:113:0x01bc, B:115:0x01c0, B:117:0x01c9, B:124:0x01d6, B:127:0x01dc, B:129:0x020c, B:128:0x0209, B:130:0x020e, B:132:0x0220, B:154:0x0279, B:140:0x0231, B:141:0x0233, B:143:0x023b, B:145:0x0247, B:146:0x0250, B:148:0x0255, B:151:0x026b, B:150:0x0269, B:121:0x01d0), top: B:160:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0116 A[Catch: ImageDecoderException -> 0x027e, TryCatch #0 {ImageDecoderException -> 0x027e, blocks: (B:13:0x0037, B:14:0x003c, B:16:0x0040, B:18:0x0044, B:20:0x0049, B:22:0x004d, B:23:0x0052, B:25:0x005d, B:27:0x0062, B:29:0x0066, B:31:0x006a, B:34:0x0075, B:36:0x007a, B:37:0x008a, B:153:0x0274, B:155:0x027d, B:44:0x009a, B:46:0x00ac, B:49:0x00c8, B:51:0x00d4, B:82:0x0136, B:83:0x013c, B:85:0x0148, B:87:0x014e, B:86:0x014b, B:52:0x00d7, B:54:0x00ea, B:56:0x00f4, B:59:0x00fb, B:61:0x00ff, B:66:0x010b, B:68:0x0116, B:70:0x011a, B:77:0x0128, B:78:0x012b, B:48:0x00b8, B:90:0x0156, B:91:0x0161, B:93:0x0165, B:98:0x0170, B:100:0x017f, B:102:0x0185, B:104:0x0189, B:105:0x0196, B:107:0x01a1, B:108:0x01a5, B:109:0x01b3, B:111:0x01b7, B:113:0x01bc, B:115:0x01c0, B:117:0x01c9, B:124:0x01d6, B:127:0x01dc, B:129:0x020c, B:128:0x0209, B:130:0x020e, B:132:0x0220, B:154:0x0279, B:140:0x0231, B:141:0x0233, B:143:0x023b, B:145:0x0247, B:146:0x0250, B:148:0x0255, B:151:0x026b, B:150:0x0269, B:121:0x01d0), top: B:160:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0123 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0132 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013c A[Catch: ImageDecoderException -> 0x027e, TryCatch #0 {ImageDecoderException -> 0x027e, blocks: (B:13:0x0037, B:14:0x003c, B:16:0x0040, B:18:0x0044, B:20:0x0049, B:22:0x004d, B:23:0x0052, B:25:0x005d, B:27:0x0062, B:29:0x0066, B:31:0x006a, B:34:0x0075, B:36:0x007a, B:37:0x008a, B:153:0x0274, B:155:0x027d, B:44:0x009a, B:46:0x00ac, B:49:0x00c8, B:51:0x00d4, B:82:0x0136, B:83:0x013c, B:85:0x0148, B:87:0x014e, B:86:0x014b, B:52:0x00d7, B:54:0x00ea, B:56:0x00f4, B:59:0x00fb, B:61:0x00ff, B:66:0x010b, B:68:0x0116, B:70:0x011a, B:77:0x0128, B:78:0x012b, B:48:0x00b8, B:90:0x0156, B:91:0x0161, B:93:0x0165, B:98:0x0170, B:100:0x017f, B:102:0x0185, B:104:0x0189, B:105:0x0196, B:107:0x01a1, B:108:0x01a5, B:109:0x01b3, B:111:0x01b7, B:113:0x01bc, B:115:0x01c0, B:117:0x01c9, B:124:0x01d6, B:127:0x01dc, B:129:0x020c, B:128:0x0209, B:130:0x020e, B:132:0x0220, B:154:0x0279, B:140:0x0231, B:141:0x0233, B:143:0x023b, B:145:0x0247, B:146:0x0250, B:148:0x0255, B:151:0x026b, B:150:0x0269, B:121:0x01d0), top: B:160:0x0037 }] */
    @Override // X.InterfaceC6068Dv6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Aaz(long r16, long r18) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6163Dx6.Aaz(long, long):void");
    }

    @Override // X.InterfaceC5921Ds8
    public final int Agf(C6154Dwx c6154Dwx) {
        int i;
        String str = c6154Dwx.A0b;
        if (str == null || !AbstractC6161Dx4.A07(str)) {
            i = 0;
        } else {
            i = 1;
            if (Util.A0S(str)) {
                i = 4;
            }
        }
        return i | 0 | 128;
    }

    @Override // X.InterfaceC6068Dv6, X.InterfaceC5921Ds8
    public final String getName() {
        return "ImageRenderer";
    }

    @Override // X.InterfaceC6068Dv6
    public final boolean isEnded() {
        return this.A0E;
    }

    @Override // X.InterfaceC6068Dv6
    public final boolean isReady() {
        int i = this.A02;
        if (i != 3) {
            return i == 0 && this.A0F;
        }
        return true;
    }

    @Override // X.AbstractC6146Dwo
    public final void A0W() {
        A03();
        this.A02 = Math.min(this.A02, 1);
    }

    @Override // X.AbstractC6146Dwo
    public final void A0a(boolean z, boolean z2) {
        this.A02 = z2 ? 1 : 0;
    }
}
