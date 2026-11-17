package X;

import com.facebook.dsp.core.ColorData;
import com.instagram.common.bloks.lexer.ParsingException;

/* renamed from: X.FMc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7947FMc {
    public static final ColorData A01(FDW fdw) {
        if (fdw == null) {
            return null;
        }
        return new ColorData(null, null, HiY.A08(AbstractC7608F5v.A0p(fdw), 0), HiY.A08(AbstractC7608F5v.A0o(fdw), 0));
    }

    public static final ColorData A02(FDW fdw) {
        ColorData colorDataA01 = FP4.A01(FP5.A0A);
        if (fdw == null) {
            return null;
        }
        return new ColorData(null, null, HiY.A08(AbstractC7608F5v.A0p(fdw), colorDataA01.A01), HiY.A08(AbstractC7608F5v.A0o(fdw), colorDataA01.A00));
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02a8 A[Catch: Exception -> 0x0356, TryCatch #2 {Exception -> 0x0356, blocks: (B:6:0x000d, B:8:0x001b, B:11:0x0029, B:13:0x002f, B:21:0x004a, B:24:0x0054, B:26:0x005c, B:40:0x008b, B:42:0x0093, B:43:0x0095, B:45:0x0099, B:46:0x009b, B:59:0x00b8, B:60:0x00ba, B:62:0x00d4, B:64:0x00da, B:67:0x00e2, B:56:0x00af, B:57:0x00b2, B:58:0x00b5, B:49:0x00a2, B:50:0x00a5, B:27:0x005f, B:29:0x0067, B:30:0x006a, B:32:0x0070, B:33:0x0073, B:35:0x007b, B:36:0x007e, B:37:0x0082, B:39:0x0084, B:14:0x0032, B:16:0x003a, B:17:0x003d, B:18:0x0041, B:20:0x0043, B:71:0x011e, B:74:0x0126, B:77:0x0131, B:80:0x013e, B:82:0x0144, B:84:0x0150, B:86:0x015a, B:89:0x0163, B:92:0x0179, B:95:0x0184, B:99:0x01b5, B:101:0x01e1, B:103:0x01e5, B:105:0x01e9, B:107:0x01ed, B:112:0x01fb, B:114:0x0203, B:116:0x0207, B:119:0x020f, B:109:0x01f1, B:111:0x01f9, B:98:0x019c, B:85:0x0153, B:123:0x0233, B:126:0x023a, B:128:0x0244, B:129:0x024a, B:134:0x025a, B:138:0x0268, B:142:0x027d, B:145:0x0284, B:147:0x02a8, B:148:0x02ac, B:150:0x02b0, B:152:0x02b8, B:163:0x02dc, B:165:0x02f4, B:166:0x02fa, B:171:0x0307, B:173:0x031b, B:176:0x0321, B:178:0x0325, B:183:0x032f, B:153:0x02bb, B:155:0x02c3, B:156:0x02c6, B:158:0x02ce, B:160:0x02d4, B:162:0x02da, B:139:0x0271, B:132:0x0254, B:185:0x034f), top: B:191:0x000d, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02f4 A[Catch: Exception -> 0x0356, TryCatch #2 {Exception -> 0x0356, blocks: (B:6:0x000d, B:8:0x001b, B:11:0x0029, B:13:0x002f, B:21:0x004a, B:24:0x0054, B:26:0x005c, B:40:0x008b, B:42:0x0093, B:43:0x0095, B:45:0x0099, B:46:0x009b, B:59:0x00b8, B:60:0x00ba, B:62:0x00d4, B:64:0x00da, B:67:0x00e2, B:56:0x00af, B:57:0x00b2, B:58:0x00b5, B:49:0x00a2, B:50:0x00a5, B:27:0x005f, B:29:0x0067, B:30:0x006a, B:32:0x0070, B:33:0x0073, B:35:0x007b, B:36:0x007e, B:37:0x0082, B:39:0x0084, B:14:0x0032, B:16:0x003a, B:17:0x003d, B:18:0x0041, B:20:0x0043, B:71:0x011e, B:74:0x0126, B:77:0x0131, B:80:0x013e, B:82:0x0144, B:84:0x0150, B:86:0x015a, B:89:0x0163, B:92:0x0179, B:95:0x0184, B:99:0x01b5, B:101:0x01e1, B:103:0x01e5, B:105:0x01e9, B:107:0x01ed, B:112:0x01fb, B:114:0x0203, B:116:0x0207, B:119:0x020f, B:109:0x01f1, B:111:0x01f9, B:98:0x019c, B:85:0x0153, B:123:0x0233, B:126:0x023a, B:128:0x0244, B:129:0x024a, B:134:0x025a, B:138:0x0268, B:142:0x027d, B:145:0x0284, B:147:0x02a8, B:148:0x02ac, B:150:0x02b0, B:152:0x02b8, B:163:0x02dc, B:165:0x02f4, B:166:0x02fa, B:171:0x0307, B:173:0x031b, B:176:0x0321, B:178:0x0325, B:183:0x032f, B:153:0x02bb, B:155:0x02c3, B:156:0x02c6, B:158:0x02ce, B:160:0x02d4, B:162:0x02da, B:139:0x0271, B:132:0x0254, B:185:0x034f), top: B:191:0x000d, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x031b A[Catch: Exception -> 0x0356, TryCatch #2 {Exception -> 0x0356, blocks: (B:6:0x000d, B:8:0x001b, B:11:0x0029, B:13:0x002f, B:21:0x004a, B:24:0x0054, B:26:0x005c, B:40:0x008b, B:42:0x0093, B:43:0x0095, B:45:0x0099, B:46:0x009b, B:59:0x00b8, B:60:0x00ba, B:62:0x00d4, B:64:0x00da, B:67:0x00e2, B:56:0x00af, B:57:0x00b2, B:58:0x00b5, B:49:0x00a2, B:50:0x00a5, B:27:0x005f, B:29:0x0067, B:30:0x006a, B:32:0x0070, B:33:0x0073, B:35:0x007b, B:36:0x007e, B:37:0x0082, B:39:0x0084, B:14:0x0032, B:16:0x003a, B:17:0x003d, B:18:0x0041, B:20:0x0043, B:71:0x011e, B:74:0x0126, B:77:0x0131, B:80:0x013e, B:82:0x0144, B:84:0x0150, B:86:0x015a, B:89:0x0163, B:92:0x0179, B:95:0x0184, B:99:0x01b5, B:101:0x01e1, B:103:0x01e5, B:105:0x01e9, B:107:0x01ed, B:112:0x01fb, B:114:0x0203, B:116:0x0207, B:119:0x020f, B:109:0x01f1, B:111:0x01f9, B:98:0x019c, B:85:0x0153, B:123:0x0233, B:126:0x023a, B:128:0x0244, B:129:0x024a, B:134:0x025a, B:138:0x0268, B:142:0x027d, B:145:0x0284, B:147:0x02a8, B:148:0x02ac, B:150:0x02b0, B:152:0x02b8, B:163:0x02dc, B:165:0x02f4, B:166:0x02fa, B:171:0x0307, B:173:0x031b, B:176:0x0321, B:178:0x0325, B:183:0x032f, B:153:0x02bb, B:155:0x02c3, B:156:0x02c6, B:158:0x02ce, B:160:0x02d4, B:162:0x02da, B:139:0x0271, B:132:0x0254, B:185:0x034f), top: B:191:0x000d, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e0 A[PHI: r24
  0x00e0: PHI (r24v5 X.FMi) = (r24v4 X.FMi), (r24v7 X.FMi), (r24v7 X.FMi) binds: [B:61:0x00d2, B:63:0x00d8, B:65:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.FMd A03(X.F6D r41, X.FDW r42) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC7947FMc.A03(X.F6D, X.FDW):X.FMd");
    }

    public static final int A00(FDW fdw, int i) {
        String str;
        StringBuilder sbA0x;
        String strA0F = fdw.A0F(i);
        float fA01 = 4.0f;
        if (strA0F != null) {
            try {
                fA01 = HiY.A01(strA0F);
            } catch (ParsingException unused) {
                if (i == 35) {
                    str = "bottom";
                } else if (i == 36) {
                    str = "left";
                } else if (i == 38) {
                    str = "right";
                } else {
                    if (i != 40) {
                        sbA0x = C60O.A0y("Invalid BottomSheetMargin prop constant: ", i);
                        FFI.A01(null, sbA0x.toString(), null);
                        return 0;
                    }
                    str = "top";
                }
                sbA0x = C3cI.A0x("Invalid format for bottom-sheet-margin prop ", str);
                sbA0x.append(" : ");
                sbA0x.append(strA0F);
                FFI.A01(null, sbA0x.toString(), null);
                return 0;
            }
        }
        return (int) fA01;
    }
}
