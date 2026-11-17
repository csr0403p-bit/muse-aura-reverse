package X;

import android.util.Pair;
import androidx.media3.common.ParserException;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.google.common.collect.ImmutableList;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public abstract class E2Q {
    public static final byte[] A00 = "OpusHead".getBytes(StandardCharsets.UTF_8);

    public static Pair<Integer, C6365E2s> A01(E1P e1p, int i, int i2) throws ParserException {
        int i3;
        int i4;
        int i5 = e1p.A01;
        while (i5 - i < i2) {
            int iA05 = BV6.A05(e1p, i5);
            A0C(AnonymousClass002.A1N(iA05), "childAtomSize must be positive");
            if (e1p.A05() == 1936289382) {
                int i6 = i5 + 8;
                boolean z = false;
                C6365E2s c6365E2s = null;
                String strA0M = null;
                Integer numValueOf = null;
                int i7 = -1;
                int i8 = 0;
                while (i6 - i5 < iA05) {
                    int iA052 = BV6.A05(e1p, i6);
                    int iA053 = e1p.A05();
                    if (iA053 == 1718775137) {
                        numValueOf = Integer.valueOf(e1p.A05());
                    } else if (iA053 == 1935894637) {
                        e1p.A0S(4);
                        strA0M = e1p.A0M(StandardCharsets.UTF_8, 4);
                    } else if (iA053 == 1935894633) {
                        i7 = i6;
                        i8 = iA052;
                    }
                    i6 += iA052;
                }
                if ("cenc".equals(strA0M) || "cbc1".equals(strA0M) || "cens".equals(strA0M) || "cbcs".equals(strA0M)) {
                    A0C(AnonymousClass002.A1X(numValueOf), "frma atom is mandatory");
                    A0C(AnonymousClass002.A1P(i7, -1), "schi atom is mandatory");
                    int i9 = i7 + 8;
                    while (true) {
                        byte[] bArr = null;
                        if (i9 - i7 >= i8) {
                            break;
                        }
                        int iA054 = BV6.A05(e1p, i9);
                        if (e1p.A05() == 1952804451) {
                            int iA055 = (e1p.A05() >> 24) & 255;
                            e1p.A0S(1);
                            if (iA055 == 0) {
                                e1p.A0S(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int iA0A = e1p.A0A();
                                i3 = (iA0A & 240) >> 4;
                                i4 = iA0A & 15;
                            }
                            boolean zA1Q = AnonymousClass002.A1Q(e1p.A0A(), 1);
                            int iA0A2 = e1p.A0A();
                            byte[] bArr2 = new byte[16];
                            e1p.A0U(bArr2, 0, 16);
                            if (zA1Q && iA0A2 == 0) {
                                int iA0A3 = e1p.A0A();
                                bArr = new byte[iA0A3];
                                e1p.A0U(bArr, 0, iA0A3);
                            }
                            c6365E2s = new C6365E2s(strA0M, bArr2, bArr, iA0A2, i3, i4, zA1Q);
                            z = true;
                        } else {
                            i9 += iA054;
                        }
                    }
                    A0C(z, "tenc atom is mandatory");
                    Pair<Integer, C6365E2s> pairCreate = Pair.create(numValueOf, c6365E2s);
                    if (pairCreate != null) {
                        return pairCreate;
                    }
                }
            }
            i5 += iA05;
        }
        return null;
    }

    public static C6162Dx5 A02(String str, int i) {
        C6162Dx5 c6162Dx5 = new C6162Dx5();
        c6162Dx5.A0W = Integer.toString(i);
        c6162Dx5.A06(str);
        return c6162Dx5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0208, code lost:
    
        if (r10 != 757935405) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x020a, code lost:
    
        r12 = null;
        r11 = null;
        r10 = null;
        r13 = -1;
        r2 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0211, code lost:
    
        r15 = r6.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0213, code lost:
    
        if (r15 >= r8) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0215, code lost:
    
        r16 = r6.A05();
        r14 = r6.A05();
        r6.A0S(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0224, code lost:
    
        if (r14 != 1835360622) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0226, code lost:
    
        r11 = r6.A0K(r16 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0230, code lost:
    
        if (r14 != 1851878757) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0232, code lost:
    
        r10 = r6.A0K(r16 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x023c, code lost:
    
        if (r14 != 1684108385) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x023e, code lost:
    
        r13 = r15;
        r2 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0241, code lost:
    
        r6.A0S(r16 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0247, code lost:
    
        if (r11 == null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0249, code lost:
    
        if (r10 == null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x024d, code lost:
    
        if (r13 == (-1)) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x024f, code lost:
    
        r6.A0R(r13);
        r6.A0S(16);
        r12 = new X.E3V(r11, r10, r6.A0K(r2 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0263, code lost:
    
        r2 = 16777215 & r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x026a, code lost:
    
        if (r2 != 6516084) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x026c, code lost:
    
        r11 = r6.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0277, code lost:
    
        if (r6.A05() != 1684108385) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0279, code lost:
    
        r6.A0S(8);
        r2 = r6.A0K(r11 - 16);
        r13 = new X.E3W(com.facebook.aura.network.AuraAcceptLanguage.UNDETERMINED_TAG, r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x028c, code lost:
    
        A0A(r10, "Failed to parse comment attribute: ");
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0297, code lost:
    
        if (r2 == 7233901) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x029c, code lost:
    
        if (r2 == 7631467) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        r6.A0R(r9);
        r9 = r9 + r3;
        r6.A0S(8);
        r3 = X.C3cG.A0h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02a1, code lost:
    
        if (r2 == 6516589) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02a6, code lost:
    
        if (r2 == 7828084) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02ab, code lost:
    
        if (r2 != 6578553) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02ad, code lost:
    
        r13 = A07(r6, "TDRC", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02b7, code lost:
    
        if (r2 != 4280916) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02b9, code lost:
    
        r13 = A07(r6, "TPE1", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        r8 = r6.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02c3, code lost:
    
        if (r2 != 7630703) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02c5, code lost:
    
        r13 = A07(r6, "TSSE", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02cf, code lost:
    
        if (r2 != 6384738) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02d1, code lost:
    
        r13 = A07(r6, "TALB", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02db, code lost:
    
        if (r2 != 7108978) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02dd, code lost:
    
        r13 = A07(r6, "USLT", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r8 >= r9) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02e7, code lost:
    
        if (r2 != 6776174) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02e9, code lost:
    
        r13 = A07(r6, "TCON", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02f3, code lost:
    
        if (r2 != 6779504) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02f5, code lost:
    
        r13 = A07(r6, "TIT1", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02fc, code lost:
    
        X.CNC.A01("MetadataUtil", X.FGI.A0M("Skipped unknown metadata entry: ", X.AbstractC6398E4a.A00(r10)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0309, code lost:
    
        r6.A0R(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x030e, code lost:
    
        r13 = A07(r6, "TCOM", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0315, code lost:
    
        r13 = A07(r6, "TIT2", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x031c, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        r8 = r8 + r6.A05();
        r10 = r6.A05();
        r2 = (r10 >> 24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x031d, code lost:
    
        r6.A0R(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0320, code lost:
    
        if (r13 == null) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0322, code lost:
    
        r3.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x032b, code lost:
    
        if (r3.isEmpty() != false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x032d, code lost:
    
        r2 = new X.C5402Dhv(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        if (r2 == 169) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (r2 == 253) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r10 != 1735291493) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0422, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0423, code lost:
    
        r6.A0R(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0426, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        r10 = A00(r6) - 1;
        r0 = X.DOC.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x03e8, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        if (r10 < 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        r2 = X.DOC.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
    
        if (r10 >= r0.size()) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        r0 = X.C60Q.A0n(r2, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        r11 = new X.E2V("TCON", null, com.google.common.collect.ImmutableList.of(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
    
        X.CNC.A04("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
    
        if (r10 != 1684632427) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        r13 = A06(r6, "TPOS", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
    
        if (r10 != 1953655662) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b0, code lost:
    
        r13 = A06(r6, "TRCK", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bb, code lost:
    
        if (r10 != 1953329263) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bd, code lost:
    
        r0 = A00(r6);
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c4, code lost:
    
        if (r0 < 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c6, code lost:
    
        r13 = new X.E2V("TBPM", null, com.google.common.collect.ImmutableList.of(java.lang.Integer.toString(r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d5, code lost:
    
        A0A(1953329263, "Failed to parse uint8 attribute: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00df, code lost:
    
        if (r10 != 1668311404) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e1, code lost:
    
        r0 = java.lang.Math.min(1, A00(r6));
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ed, code lost:
    
        if (r0 < 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ef, code lost:
    
        r13 = new X.E2V("TCMP", null, com.google.common.collect.ImmutableList.of(java.lang.Integer.toString(r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fe, code lost:
    
        A0A(1668311404, "Failed to parse uint8 attribute: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0108, code lost:
    
        if (r10 != 1668249202) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010a, code lost:
    
        r11 = r6.A05();
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0118, code lost:
    
        if (r6.A05() != 1684108385) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011a, code lost:
    
        r2 = r6.A05() & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0124, code lost:
    
        if (r2 != 13) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0126, code lost:
    
        r10 = com.facebook.aura.commands.photos.MediaDeviceSyncClientKt.FALLBACK_MIME;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0128, code lost:
    
        r6.A0S(4);
        r0 = r11 - 16;
        r2 = new byte[r0];
        r6.A0U(r2, 0, r0);
        r11 = new X.C6363E2p(r10, null, r2, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013c, code lost:
    
        if (r2 != 14) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013e, code lost:
    
        r10 = com.facebook.aura.sharesheet.HatchShareSheetViewModelKt.AVATAR_STORY_STICKER_MIME_TYPE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0141, code lost:
    
        r13 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0144, code lost:
    
        r0 = "Failed to parse cover art attribute";
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0147, code lost:
    
        r0 = X.FGI.A0H("Unrecognized cover art flags: ", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014d, code lost:
    
        X.CNC.A04("MetadataUtil", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0155, code lost:
    
        if (r10 != 1631670868) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0157, code lost:
    
        r13 = A07(r6, "TPE2", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0162, code lost:
    
        if (r10 != 1936682605) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0164, code lost:
    
        r13 = A07(r6, "TSOT", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016f, code lost:
    
        if (r10 != 1936679276) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0171, code lost:
    
        r13 = A07(r6, "TSOA", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x017c, code lost:
    
        if (r10 != 1936679282) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017e, code lost:
    
        r13 = A07(r6, "TSOP", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0189, code lost:
    
        if (r10 != 1936679265) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x018b, code lost:
    
        r13 = A07(r6, "TSO2", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0196, code lost:
    
        if (r10 != 1936679791) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0198, code lost:
    
        r13 = A07(r6, "TSOC", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a3, code lost:
    
        if (r10 != 1920233063) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a5, code lost:
    
        r0 = A00(r6);
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ac, code lost:
    
        if (r0 < 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ae, code lost:
    
        r13 = new X.E3W(com.facebook.aura.network.AuraAcceptLanguage.UNDETERMINED_TAG, "ITUNESADVISORY", java.lang.Integer.toString(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01bc, code lost:
    
        A0A(1920233063, "Failed to parse uint8 attribute: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c6, code lost:
    
        if (r10 != 1885823344) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c8, code lost:
    
        r0 = java.lang.Math.min(1, A00(r6));
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d4, code lost:
    
        if (r0 < 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d6, code lost:
    
        r13 = new X.E3W(com.facebook.aura.network.AuraAcceptLanguage.UNDETERMINED_TAG, "ITUNESGAPLESS", java.lang.Integer.toString(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01e4, code lost:
    
        A0A(1885823344, "Failed to parse uint8 attribute: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ee, code lost:
    
        if (r10 != 1936683886) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01f0, code lost:
    
        r13 = A07(r6, "TVSHOWSORT", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01fb, code lost:
    
        if (r10 != 1953919848) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01fd, code lost:
    
        r13 = A07(r6, "TVSHOW", r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C5402Dhv A04(X.C6419E4v r18) {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E2Q.A04(X.E4v):X.Dhv");
    }

    public static C6415E4r A08(E1P e1p, int i) {
        e1p.A0R(i + 12);
        e1p.A0S(1);
        while ((e1p.A0A() & 128) == 128) {
        }
        int iA06 = BV6.A06(e1p, 2);
        if ((iA06 & 128) != 0) {
            e1p.A0S(2);
        }
        if ((iA06 & 64) != 0) {
            e1p.A0S(e1p.A0A());
        }
        if ((iA06 & 32) != 0) {
            e1p.A0S(2);
        }
        e1p.A0S(1);
        while ((e1p.A0A() & 128) == 128) {
        }
        String strA03 = AbstractC6161Dx4.A03(e1p.A0A());
        if ("audio/mpeg".equals(strA03) || "audio/vnd.dts".equals(strA03) || "audio/vnd.dts.hd".equals(strA03)) {
            return new C6415E4r(null, strA03, -1L, -1L);
        }
        e1p.A0S(4);
        long jA0H = e1p.A0H();
        long jA0H2 = e1p.A0H();
        int iA062 = BV6.A06(e1p, 1);
        int i2 = iA062 & 127;
        while ((iA062 & 128) == 128) {
            iA062 = e1p.A0A();
            i2 = (i2 << 7) | (iA062 & 127);
        }
        byte[] bArr = new byte[i2];
        e1p.A0U(bArr, 0, i2);
        if (jA0H2 <= 0) {
            jA0H2 = -1;
        }
        return new C6415E4r(bArr, strA03, jA0H2, jA0H > 0 ? jA0H : -1L);
    }

    public static void A0B(E1P e1p) {
        int i = e1p.A01;
        e1p.A0S(4);
        if (e1p.A05() != 1751411826) {
            i += 4;
        }
        e1p.A0R(i);
    }

    public static void A0C(boolean z, String str) throws ParserException {
        if (!z) {
            throw BV8.A0c(str);
        }
    }

    public static int A00(E1P e1p) {
        int iA05 = e1p.A05();
        if (e1p.A05() == 1684108385) {
            e1p.A0S(8);
            int i = iA05 - 16;
            if (i == 1) {
                return e1p.A0A();
            }
            if (i == 2) {
                return e1p.A0D();
            }
            if (i == 3) {
                return e1p.A0B();
            }
            if (i == 4 && (e1p.A02[e1p.A01] & 255 & 128) == 0) {
                return e1p.A0C();
            }
        }
        CNC.A04("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static C5402Dhv A03(C6358E2k c6358E2k) {
        C6419E4v c6419E4vA01 = c6358E2k.A01(1751411826);
        C6419E4v c6419E4vA012 = c6358E2k.A01(1801812339);
        C6419E4v c6419E4vA013 = c6358E2k.A01(1768715124);
        if (c6419E4vA01 != null && c6419E4vA012 != null && c6419E4vA013 != null && BV6.A05(c6419E4vA01.A00, 16) == 1835299937) {
            E1P e1p = c6419E4vA012.A00;
            int iA05 = BV6.A05(e1p, 12);
            String[] strArr = new String[iA05];
            for (int i = 0; i < iA05; i++) {
                int iA052 = e1p.A05();
                e1p.A0S(4);
                strArr[i] = e1p.A0M(StandardCharsets.UTF_8, iA052 - 8);
            }
            E1P e1p2 = c6419E4vA013.A00;
            e1p2.A0R(8);
            ArrayList arrayListA0h = C3cG.A0h();
            while (e1p2.A04() > 8) {
                int i2 = e1p2.A01;
                int iA053 = e1p2.A05();
                int iA054 = e1p2.A05() - 1;
                if (iA054 < 0 || iA054 >= iA05) {
                    CNC.A04("BoxParsers", FGI.A0H("Skipped metadata with unknown key index: ", iA054));
                } else {
                    String str = strArr[iA054];
                    int i3 = i2 + iA053;
                    while (true) {
                        int i4 = e1p2.A01;
                        if (i4 < i3) {
                            int iA055 = e1p2.A05();
                            if (e1p2.A05() == 1684108385) {
                                int iA056 = e1p2.A05();
                                int iA057 = e1p2.A05();
                                int i5 = iA055 - 16;
                                byte[] bArr = new byte[i5];
                                e1p2.A0U(bArr, 0, i5);
                                try {
                                    arrayListA0h.add(new C3423CMl(bArr, iA057, iA056, str));
                                    break;
                                } catch (Exception unused) {
                                    CNC.A04("MetadataUtil", FGI.A0M("Failed to parse metadata entry with key: ", str));
                                }
                            } else {
                                e1p2.A0R(i4 + iA055);
                            }
                        }
                    }
                }
                e1p2.A0R(i2 + iA053);
            }
            if (!arrayListA0h.isEmpty()) {
                return new C5402Dhv(arrayListA0h);
            }
        }
        return null;
    }

    public static C3118Byi A05(E1P e1p) {
        long jA0G;
        long jA0G2;
        if (BV8.A07(e1p) == 0) {
            jA0G = e1p.A0H();
            jA0G2 = e1p.A0H();
        } else {
            jA0G = e1p.A0G();
            jA0G2 = e1p.A0G();
        }
        return new C3118Byi(jA0G, jA0G2, e1p.A0H());
    }

    public static E2V A06(E1P e1p, String str, int i) {
        int iA05 = e1p.A05();
        if (e1p.A05() == 1684108385 && iA05 >= 22) {
            e1p.A0S(10);
            int iA0D = e1p.A0D();
            if (iA0D > 0) {
                String strA0H = FGI.A0H("", iA0D);
                int iA0D2 = e1p.A0D();
                if (iA0D2 > 0) {
                    strA0H = FGI.A0S(strA0H, CustomConnectorRegisterRepositoryKt.ROOT_PATH, iA0D2);
                }
                return new E2V(str, null, ImmutableList.of(strA0H));
            }
        }
        A0A(i, "Failed to parse index/count attribute: ");
        return null;
    }

    public static E2V A07(E1P e1p, String str, int i) {
        int iA05 = e1p.A05();
        if (e1p.A05() == 1684108385) {
            e1p.A0S(8);
            return new E2V(str, null, ImmutableList.of(e1p.A0K(iA05 - 16)));
        }
        A0A(i, "Failed to parse text attribute: ");
        return null;
    }

    public static void A0A(int i, String str) {
        CNC.A04("MetadataUtil", FGI.A0M(str, AbstractC6398E4a.A00(i)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:323:0x074e, code lost:
    
        throw androidx.media3.common.ParserException.A00(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1044:0x168e  */
    /* JADX WARN: Removed duplicated region for block: B:1122:0x18bc  */
    /* JADX WARN: Removed duplicated region for block: B:1125:0x18e4 A[ADDED_TO_REGION, LOOP:44: B:1125:0x18e4->B:1154:0x1992, LOOP_START, PHI: r6 r7 r14 r24 r27 r35
  0x18e4: PHI (r6v3 int) = (r6v2 int), (r6v4 int) binds: [B:1124:0x18e2, B:1154:0x1992] A[DONT_GENERATE, DONT_INLINE]
  0x18e4: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:1124:0x18e2, B:1154:0x1992] A[DONT_GENERATE, DONT_INLINE]
  0x18e4: PHI (r14v4 int) = (r14v2 int), (r14v7 int) binds: [B:1124:0x18e2, B:1154:0x1992] A[DONT_GENERATE, DONT_INLINE]
  0x18e4: PHI (r24v2 long) = (r24v1 long), (r24v5 long) binds: [B:1124:0x18e2, B:1154:0x1992] A[DONT_GENERATE, DONT_INLINE]
  0x18e4: PHI (r27v2 int) = (r27v1 int), (r27v3 int) binds: [B:1124:0x18e2, B:1154:0x1992] A[DONT_GENERATE, DONT_INLINE]
  0x18e4: PHI (r35v2 int) = (r35v1 int), (r35v3 int) binds: [B:1124:0x18e2, B:1154:0x1992] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:1131:0x1912 A[ADDED_TO_REGION, LOOP:45: B:1131:0x1912->B:1146:0x196e, LOOP_START, PHI: r33
  0x1912: PHI (r33v3 int) = (r33v2 int), (r33v4 int) binds: [B:1130:0x1910, B:1146:0x196e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:1136:0x191d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:1141:0x1927  */
    /* JADX WARN: Removed duplicated region for block: B:1143:0x195e  */
    /* JADX WARN: Removed duplicated region for block: B:1145:0x196b  */
    /* JADX WARN: Removed duplicated region for block: B:1147:0x1974  */
    /* JADX WARN: Removed duplicated region for block: B:1210:0x1ae0  */
    /* JADX WARN: Removed duplicated region for block: B:1274:0x1c69  */
    /* JADX WARN: Removed duplicated region for block: B:1293:0x1c9e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1301:0x095a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1313:0x1621 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1316:0x1613 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1332:0x030c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1464:0x190c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x056e A[PHI: r5 r20
  0x056e: PHI (r5v140 byte[]) = (r5v139 byte[]), (r5v143 byte[]) binds: [B:258:0x0563, B:249:0x0538] A[DONT_GENERATE, DONT_INLINE]
  0x056e: PHI (r20v16 java.lang.String) = (r20v12 java.lang.String), (r20v19 java.lang.String) binds: [B:258:0x0563, B:249:0x0538] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x090a  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0934  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x097f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0b99  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0cb4  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x0d5c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x0e61  */
    /* JADX WARN: Removed duplicated region for block: B:733:0x0efd  */
    /* JADX WARN: Removed duplicated region for block: B:738:0x0f3a  */
    /* JADX WARN: Removed duplicated region for block: B:753:0x0fb1  */
    /* JADX WARN: Removed duplicated region for block: B:793:0x10c8  */
    /* JADX WARN: Removed duplicated region for block: B:834:0x11f5  */
    /* JADX WARN: Removed duplicated region for block: B:837:0x121c  */
    /* JADX WARN: Removed duplicated region for block: B:882:0x12c9  */
    /* JADX WARN: Removed duplicated region for block: B:900:0x1300  */
    /* JADX WARN: Removed duplicated region for block: B:975:0x1570  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList A09(androidx.media3.common.DrmInitData r87, X.C6358E2k r88, X.C6361E2n r89, com.google.common.base.Function r90, long r91, boolean r93) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 7380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E2Q.A09(androidx.media3.common.DrmInitData, X.E2k, X.E2n, com.google.common.base.Function, long, boolean):java.util.ArrayList");
    }
}
