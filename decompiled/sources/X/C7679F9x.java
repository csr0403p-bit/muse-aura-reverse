package X;

import com.facebook.aura.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.F9x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7679F9x {
    public static final C7679F9x A00 = new C7679F9x();

    public static final C7674F9s A00(FBB fbb, F9X f9x, C7674F9s c7674F9s, FDW fdw, F9N f9n) {
        Htq<F6D> htqA02 = FBA.A02(fbb);
        Map<String, InterfaceC7700FAy<Object>> mapA06 = FBA.A06(fbb);
        C7384Etj.A0U(mapA06);
        C7690FAj c7690FAj = (C7690FAj) fbb.A03(R.id.bk_context_key_scoped_client_id_mapper);
        C7384Etj.A0U(c7690FAj);
        C7680F9y c7680F9y = new C7680F9y(f9x, c7690FAj, c7674F9s, f9n, htqA02, FBB.A02(fbb), mapA06);
        F9O f9o = new F9O();
        C7679F9x c7679F9x = A00;
        FDW fdwA01 = c7679F9x.A01(f9o, c7680F9y, fdw, c7674F9s != null ? c7674F9s.A02 : null, null);
        Set<String> set = f9o.A02;
        HashMap mapA0v = BV4.A0v(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            Object objAMX = c7680F9y.AMX(strA0j);
            if (objAMX == null && !c7680F9y.A76(strA0j)) {
                objAMX = C7680F9y.A0H;
            }
            mapA0v.put(strA0j, objAMX);
        }
        HashMap<String, F8J> map = c7680F9y.A0C;
        c7679F9x.A03(c7680F9y, map, mapA0v);
        F9X f9x2 = c7680F9y.A00;
        Map<String, Object> map2 = f9x2.A0A;
        HashMap<String, Object> map3 = c7680F9y.A0B;
        return new C7674F9s(f9x2.A00, c7680F9y.A04, fdw, fdwA01, c7680F9y.A0A, c7680F9y.A08, c7680F9y.A09, map2, map3, mapA0v, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x027f A[Catch: BloksComponentRenderException -> 0x04e3, RuntimeException -> 0x04e5, all -> 0x04ec, TryCatch #5 {BloksComponentRenderException -> 0x04e3, RuntimeException -> 0x04e5, blocks: (B:36:0x00c4, B:38:0x00d9, B:41:0x00df, B:42:0x00e6, B:45:0x00f7, B:47:0x00fb, B:49:0x00ff, B:51:0x0105, B:53:0x010f, B:55:0x0114, B:56:0x0118, B:58:0x0132, B:62:0x016d, B:66:0x0177, B:67:0x0196, B:69:0x01a8, B:77:0x01ca, B:81:0x01d8, B:82:0x01dc, B:84:0x01e2, B:85:0x01e4, B:86:0x01e8, B:88:0x01ee, B:90:0x01f4, B:92:0x01f8, B:93:0x01fc, B:96:0x0203, B:99:0x020d, B:101:0x0215, B:102:0x021f, B:108:0x0235, B:110:0x023b, B:114:0x0245, B:72:0x01ad, B:74:0x01b2, B:76:0x01bf, B:103:0x0222, B:105:0x0226, B:107:0x022c, B:111:0x0240, B:119:0x0263, B:115:0x024f, B:117:0x0254, B:121:0x0265, B:123:0x0273, B:125:0x027f, B:126:0x0286, B:128:0x0297, B:133:0x02a4, B:134:0x02a8, B:136:0x02bb, B:138:0x02c5, B:140:0x02cb, B:141:0x02cd, B:142:0x02d6, B:143:0x02d9, B:146:0x02ee, B:151:0x02fb, B:152:0x02ff, B:155:0x030b, B:157:0x0313, B:159:0x032d, B:161:0x0337, B:163:0x033d, B:164:0x033f, B:169:0x0352, B:171:0x0358, B:173:0x0372, B:172:0x036c, B:174:0x0374, B:176:0x0379, B:178:0x037f, B:180:0x0385, B:181:0x0387, B:184:0x0392, B:185:0x0394, B:186:0x0398, B:189:0x03a5, B:194:0x03b4, B:195:0x03b8, B:198:0x03c4, B:200:0x03cc, B:202:0x03e6, B:204:0x03f0, B:206:0x03f6, B:207:0x03f8, B:212:0x040b, B:214:0x0411, B:216:0x042b, B:215:0x0425, B:217:0x042d, B:219:0x0432, B:221:0x0438, B:223:0x043e, B:224:0x0440, B:227:0x044b, B:228:0x044d, B:231:0x0455, B:234:0x045c, B:236:0x0462, B:238:0x0468, B:239:0x046f, B:240:0x0478, B:242:0x0485, B:244:0x048b, B:245:0x0490, B:247:0x0497, B:251:0x04a0, B:260:0x04b3, B:262:0x04bc, B:264:0x04c0, B:265:0x04c6, B:266:0x04c9, B:269:0x04cf, B:271:0x04d5, B:273:0x04d9, B:274:0x04df, B:257:0x04ab), top: B:311:0x00c4, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0297 A[Catch: BloksComponentRenderException -> 0x04e3, RuntimeException -> 0x04e5, all -> 0x04ec, TryCatch #5 {BloksComponentRenderException -> 0x04e3, RuntimeException -> 0x04e5, blocks: (B:36:0x00c4, B:38:0x00d9, B:41:0x00df, B:42:0x00e6, B:45:0x00f7, B:47:0x00fb, B:49:0x00ff, B:51:0x0105, B:53:0x010f, B:55:0x0114, B:56:0x0118, B:58:0x0132, B:62:0x016d, B:66:0x0177, B:67:0x0196, B:69:0x01a8, B:77:0x01ca, B:81:0x01d8, B:82:0x01dc, B:84:0x01e2, B:85:0x01e4, B:86:0x01e8, B:88:0x01ee, B:90:0x01f4, B:92:0x01f8, B:93:0x01fc, B:96:0x0203, B:99:0x020d, B:101:0x0215, B:102:0x021f, B:108:0x0235, B:110:0x023b, B:114:0x0245, B:72:0x01ad, B:74:0x01b2, B:76:0x01bf, B:103:0x0222, B:105:0x0226, B:107:0x022c, B:111:0x0240, B:119:0x0263, B:115:0x024f, B:117:0x0254, B:121:0x0265, B:123:0x0273, B:125:0x027f, B:126:0x0286, B:128:0x0297, B:133:0x02a4, B:134:0x02a8, B:136:0x02bb, B:138:0x02c5, B:140:0x02cb, B:141:0x02cd, B:142:0x02d6, B:143:0x02d9, B:146:0x02ee, B:151:0x02fb, B:152:0x02ff, B:155:0x030b, B:157:0x0313, B:159:0x032d, B:161:0x0337, B:163:0x033d, B:164:0x033f, B:169:0x0352, B:171:0x0358, B:173:0x0372, B:172:0x036c, B:174:0x0374, B:176:0x0379, B:178:0x037f, B:180:0x0385, B:181:0x0387, B:184:0x0392, B:185:0x0394, B:186:0x0398, B:189:0x03a5, B:194:0x03b4, B:195:0x03b8, B:198:0x03c4, B:200:0x03cc, B:202:0x03e6, B:204:0x03f0, B:206:0x03f6, B:207:0x03f8, B:212:0x040b, B:214:0x0411, B:216:0x042b, B:215:0x0425, B:217:0x042d, B:219:0x0432, B:221:0x0438, B:223:0x043e, B:224:0x0440, B:227:0x044b, B:228:0x044d, B:231:0x0455, B:234:0x045c, B:236:0x0462, B:238:0x0468, B:239:0x046f, B:240:0x0478, B:242:0x0485, B:244:0x048b, B:245:0x0490, B:247:0x0497, B:251:0x04a0, B:260:0x04b3, B:262:0x04bc, B:264:0x04c0, B:265:0x04c6, B:266:0x04c9, B:269:0x04cf, B:271:0x04d5, B:273:0x04d9, B:274:0x04df, B:257:0x04ab), top: B:311:0x00c4, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ee A[Catch: BloksComponentRenderException -> 0x04e3, RuntimeException -> 0x04e5, all -> 0x04ec, TryCatch #5 {BloksComponentRenderException -> 0x04e3, RuntimeException -> 0x04e5, blocks: (B:36:0x00c4, B:38:0x00d9, B:41:0x00df, B:42:0x00e6, B:45:0x00f7, B:47:0x00fb, B:49:0x00ff, B:51:0x0105, B:53:0x010f, B:55:0x0114, B:56:0x0118, B:58:0x0132, B:62:0x016d, B:66:0x0177, B:67:0x0196, B:69:0x01a8, B:77:0x01ca, B:81:0x01d8, B:82:0x01dc, B:84:0x01e2, B:85:0x01e4, B:86:0x01e8, B:88:0x01ee, B:90:0x01f4, B:92:0x01f8, B:93:0x01fc, B:96:0x0203, B:99:0x020d, B:101:0x0215, B:102:0x021f, B:108:0x0235, B:110:0x023b, B:114:0x0245, B:72:0x01ad, B:74:0x01b2, B:76:0x01bf, B:103:0x0222, B:105:0x0226, B:107:0x022c, B:111:0x0240, B:119:0x0263, B:115:0x024f, B:117:0x0254, B:121:0x0265, B:123:0x0273, B:125:0x027f, B:126:0x0286, B:128:0x0297, B:133:0x02a4, B:134:0x02a8, B:136:0x02bb, B:138:0x02c5, B:140:0x02cb, B:141:0x02cd, B:142:0x02d6, B:143:0x02d9, B:146:0x02ee, B:151:0x02fb, B:152:0x02ff, B:155:0x030b, B:157:0x0313, B:159:0x032d, B:161:0x0337, B:163:0x033d, B:164:0x033f, B:169:0x0352, B:171:0x0358, B:173:0x0372, B:172:0x036c, B:174:0x0374, B:176:0x0379, B:178:0x037f, B:180:0x0385, B:181:0x0387, B:184:0x0392, B:185:0x0394, B:186:0x0398, B:189:0x03a5, B:194:0x03b4, B:195:0x03b8, B:198:0x03c4, B:200:0x03cc, B:202:0x03e6, B:204:0x03f0, B:206:0x03f6, B:207:0x03f8, B:212:0x040b, B:214:0x0411, B:216:0x042b, B:215:0x0425, B:217:0x042d, B:219:0x0432, B:221:0x0438, B:223:0x043e, B:224:0x0440, B:227:0x044b, B:228:0x044d, B:231:0x0455, B:234:0x045c, B:236:0x0462, B:238:0x0468, B:239:0x046f, B:240:0x0478, B:242:0x0485, B:244:0x048b, B:245:0x0490, B:247:0x0497, B:251:0x04a0, B:260:0x04b3, B:262:0x04bc, B:264:0x04c0, B:265:0x04c6, B:266:0x04c9, B:269:0x04cf, B:271:0x04d5, B:273:0x04d9, B:274:0x04df, B:257:0x04ab), top: B:311:0x00c4, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03a5 A[Catch: BloksComponentRenderException -> 0x04e3, RuntimeException -> 0x04e5, all -> 0x04ec, TryCatch #5 {BloksComponentRenderException -> 0x04e3, RuntimeException -> 0x04e5, blocks: (B:36:0x00c4, B:38:0x00d9, B:41:0x00df, B:42:0x00e6, B:45:0x00f7, B:47:0x00fb, B:49:0x00ff, B:51:0x0105, B:53:0x010f, B:55:0x0114, B:56:0x0118, B:58:0x0132, B:62:0x016d, B:66:0x0177, B:67:0x0196, B:69:0x01a8, B:77:0x01ca, B:81:0x01d8, B:82:0x01dc, B:84:0x01e2, B:85:0x01e4, B:86:0x01e8, B:88:0x01ee, B:90:0x01f4, B:92:0x01f8, B:93:0x01fc, B:96:0x0203, B:99:0x020d, B:101:0x0215, B:102:0x021f, B:108:0x0235, B:110:0x023b, B:114:0x0245, B:72:0x01ad, B:74:0x01b2, B:76:0x01bf, B:103:0x0222, B:105:0x0226, B:107:0x022c, B:111:0x0240, B:119:0x0263, B:115:0x024f, B:117:0x0254, B:121:0x0265, B:123:0x0273, B:125:0x027f, B:126:0x0286, B:128:0x0297, B:133:0x02a4, B:134:0x02a8, B:136:0x02bb, B:138:0x02c5, B:140:0x02cb, B:141:0x02cd, B:142:0x02d6, B:143:0x02d9, B:146:0x02ee, B:151:0x02fb, B:152:0x02ff, B:155:0x030b, B:157:0x0313, B:159:0x032d, B:161:0x0337, B:163:0x033d, B:164:0x033f, B:169:0x0352, B:171:0x0358, B:173:0x0372, B:172:0x036c, B:174:0x0374, B:176:0x0379, B:178:0x037f, B:180:0x0385, B:181:0x0387, B:184:0x0392, B:185:0x0394, B:186:0x0398, B:189:0x03a5, B:194:0x03b4, B:195:0x03b8, B:198:0x03c4, B:200:0x03cc, B:202:0x03e6, B:204:0x03f0, B:206:0x03f6, B:207:0x03f8, B:212:0x040b, B:214:0x0411, B:216:0x042b, B:215:0x0425, B:217:0x042d, B:219:0x0432, B:221:0x0438, B:223:0x043e, B:224:0x0440, B:227:0x044b, B:228:0x044d, B:231:0x0455, B:234:0x045c, B:236:0x0462, B:238:0x0468, B:239:0x046f, B:240:0x0478, B:242:0x0485, B:244:0x048b, B:245:0x0490, B:247:0x0497, B:251:0x04a0, B:260:0x04b3, B:262:0x04bc, B:264:0x04c0, B:265:0x04c6, B:266:0x04c9, B:269:0x04cf, B:271:0x04d5, B:273:0x04d9, B:274:0x04df, B:257:0x04ab), top: B:311:0x00c4, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0453 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0462 A[Catch: BloksComponentRenderException -> 0x04e3, RuntimeException -> 0x04e5, all -> 0x04ec, TryCatch #5 {BloksComponentRenderException -> 0x04e3, RuntimeException -> 0x04e5, blocks: (B:36:0x00c4, B:38:0x00d9, B:41:0x00df, B:42:0x00e6, B:45:0x00f7, B:47:0x00fb, B:49:0x00ff, B:51:0x0105, B:53:0x010f, B:55:0x0114, B:56:0x0118, B:58:0x0132, B:62:0x016d, B:66:0x0177, B:67:0x0196, B:69:0x01a8, B:77:0x01ca, B:81:0x01d8, B:82:0x01dc, B:84:0x01e2, B:85:0x01e4, B:86:0x01e8, B:88:0x01ee, B:90:0x01f4, B:92:0x01f8, B:93:0x01fc, B:96:0x0203, B:99:0x020d, B:101:0x0215, B:102:0x021f, B:108:0x0235, B:110:0x023b, B:114:0x0245, B:72:0x01ad, B:74:0x01b2, B:76:0x01bf, B:103:0x0222, B:105:0x0226, B:107:0x022c, B:111:0x0240, B:119:0x0263, B:115:0x024f, B:117:0x0254, B:121:0x0265, B:123:0x0273, B:125:0x027f, B:126:0x0286, B:128:0x0297, B:133:0x02a4, B:134:0x02a8, B:136:0x02bb, B:138:0x02c5, B:140:0x02cb, B:141:0x02cd, B:142:0x02d6, B:143:0x02d9, B:146:0x02ee, B:151:0x02fb, B:152:0x02ff, B:155:0x030b, B:157:0x0313, B:159:0x032d, B:161:0x0337, B:163:0x033d, B:164:0x033f, B:169:0x0352, B:171:0x0358, B:173:0x0372, B:172:0x036c, B:174:0x0374, B:176:0x0379, B:178:0x037f, B:180:0x0385, B:181:0x0387, B:184:0x0392, B:185:0x0394, B:186:0x0398, B:189:0x03a5, B:194:0x03b4, B:195:0x03b8, B:198:0x03c4, B:200:0x03cc, B:202:0x03e6, B:204:0x03f0, B:206:0x03f6, B:207:0x03f8, B:212:0x040b, B:214:0x0411, B:216:0x042b, B:215:0x0425, B:217:0x042d, B:219:0x0432, B:221:0x0438, B:223:0x043e, B:224:0x0440, B:227:0x044b, B:228:0x044d, B:231:0x0455, B:234:0x045c, B:236:0x0462, B:238:0x0468, B:239:0x046f, B:240:0x0478, B:242:0x0485, B:244:0x048b, B:245:0x0490, B:247:0x0497, B:251:0x04a0, B:260:0x04b3, B:262:0x04bc, B:264:0x04c0, B:265:0x04c6, B:266:0x04c9, B:269:0x04cf, B:271:0x04d5, B:273:0x04d9, B:274:0x04df, B:257:0x04ab), top: B:311:0x00c4, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0485 A[Catch: BloksComponentRenderException -> 0x04e3, RuntimeException -> 0x04e5, all -> 0x04ec, TryCatch #5 {BloksComponentRenderException -> 0x04e3, RuntimeException -> 0x04e5, blocks: (B:36:0x00c4, B:38:0x00d9, B:41:0x00df, B:42:0x00e6, B:45:0x00f7, B:47:0x00fb, B:49:0x00ff, B:51:0x0105, B:53:0x010f, B:55:0x0114, B:56:0x0118, B:58:0x0132, B:62:0x016d, B:66:0x0177, B:67:0x0196, B:69:0x01a8, B:77:0x01ca, B:81:0x01d8, B:82:0x01dc, B:84:0x01e2, B:85:0x01e4, B:86:0x01e8, B:88:0x01ee, B:90:0x01f4, B:92:0x01f8, B:93:0x01fc, B:96:0x0203, B:99:0x020d, B:101:0x0215, B:102:0x021f, B:108:0x0235, B:110:0x023b, B:114:0x0245, B:72:0x01ad, B:74:0x01b2, B:76:0x01bf, B:103:0x0222, B:105:0x0226, B:107:0x022c, B:111:0x0240, B:119:0x0263, B:115:0x024f, B:117:0x0254, B:121:0x0265, B:123:0x0273, B:125:0x027f, B:126:0x0286, B:128:0x0297, B:133:0x02a4, B:134:0x02a8, B:136:0x02bb, B:138:0x02c5, B:140:0x02cb, B:141:0x02cd, B:142:0x02d6, B:143:0x02d9, B:146:0x02ee, B:151:0x02fb, B:152:0x02ff, B:155:0x030b, B:157:0x0313, B:159:0x032d, B:161:0x0337, B:163:0x033d, B:164:0x033f, B:169:0x0352, B:171:0x0358, B:173:0x0372, B:172:0x036c, B:174:0x0374, B:176:0x0379, B:178:0x037f, B:180:0x0385, B:181:0x0387, B:184:0x0392, B:185:0x0394, B:186:0x0398, B:189:0x03a5, B:194:0x03b4, B:195:0x03b8, B:198:0x03c4, B:200:0x03cc, B:202:0x03e6, B:204:0x03f0, B:206:0x03f6, B:207:0x03f8, B:212:0x040b, B:214:0x0411, B:216:0x042b, B:215:0x0425, B:217:0x042d, B:219:0x0432, B:221:0x0438, B:223:0x043e, B:224:0x0440, B:227:0x044b, B:228:0x044d, B:231:0x0455, B:234:0x045c, B:236:0x0462, B:238:0x0468, B:239:0x046f, B:240:0x0478, B:242:0x0485, B:244:0x048b, B:245:0x0490, B:247:0x0497, B:251:0x04a0, B:260:0x04b3, B:262:0x04bc, B:264:0x04c0, B:265:0x04c6, B:266:0x04c9, B:269:0x04cf, B:271:0x04d5, B:273:0x04d9, B:274:0x04df, B:257:0x04ab), top: B:311:0x00c4, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0497 A[Catch: BloksComponentRenderException -> 0x04e3, RuntimeException -> 0x04e5, all -> 0x04ec, TryCatch #5 {BloksComponentRenderException -> 0x04e3, RuntimeException -> 0x04e5, blocks: (B:36:0x00c4, B:38:0x00d9, B:41:0x00df, B:42:0x00e6, B:45:0x00f7, B:47:0x00fb, B:49:0x00ff, B:51:0x0105, B:53:0x010f, B:55:0x0114, B:56:0x0118, B:58:0x0132, B:62:0x016d, B:66:0x0177, B:67:0x0196, B:69:0x01a8, B:77:0x01ca, B:81:0x01d8, B:82:0x01dc, B:84:0x01e2, B:85:0x01e4, B:86:0x01e8, B:88:0x01ee, B:90:0x01f4, B:92:0x01f8, B:93:0x01fc, B:96:0x0203, B:99:0x020d, B:101:0x0215, B:102:0x021f, B:108:0x0235, B:110:0x023b, B:114:0x0245, B:72:0x01ad, B:74:0x01b2, B:76:0x01bf, B:103:0x0222, B:105:0x0226, B:107:0x022c, B:111:0x0240, B:119:0x0263, B:115:0x024f, B:117:0x0254, B:121:0x0265, B:123:0x0273, B:125:0x027f, B:126:0x0286, B:128:0x0297, B:133:0x02a4, B:134:0x02a8, B:136:0x02bb, B:138:0x02c5, B:140:0x02cb, B:141:0x02cd, B:142:0x02d6, B:143:0x02d9, B:146:0x02ee, B:151:0x02fb, B:152:0x02ff, B:155:0x030b, B:157:0x0313, B:159:0x032d, B:161:0x0337, B:163:0x033d, B:164:0x033f, B:169:0x0352, B:171:0x0358, B:173:0x0372, B:172:0x036c, B:174:0x0374, B:176:0x0379, B:178:0x037f, B:180:0x0385, B:181:0x0387, B:184:0x0392, B:185:0x0394, B:186:0x0398, B:189:0x03a5, B:194:0x03b4, B:195:0x03b8, B:198:0x03c4, B:200:0x03cc, B:202:0x03e6, B:204:0x03f0, B:206:0x03f6, B:207:0x03f8, B:212:0x040b, B:214:0x0411, B:216:0x042b, B:215:0x0425, B:217:0x042d, B:219:0x0432, B:221:0x0438, B:223:0x043e, B:224:0x0440, B:227:0x044b, B:228:0x044d, B:231:0x0455, B:234:0x045c, B:236:0x0462, B:238:0x0468, B:239:0x046f, B:240:0x0478, B:242:0x0485, B:244:0x048b, B:245:0x0490, B:247:0x0497, B:251:0x04a0, B:260:0x04b3, B:262:0x04bc, B:264:0x04c0, B:265:0x04c6, B:266:0x04c9, B:269:0x04cf, B:271:0x04d5, B:273:0x04d9, B:274:0x04df, B:257:0x04ab), top: B:311:0x00c4, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x024f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0132 A[Catch: BloksComponentRenderException -> 0x04e3, RuntimeException -> 0x04e5, all -> 0x04ec, TRY_LEAVE, TryCatch #5 {BloksComponentRenderException -> 0x04e3, RuntimeException -> 0x04e5, blocks: (B:36:0x00c4, B:38:0x00d9, B:41:0x00df, B:42:0x00e6, B:45:0x00f7, B:47:0x00fb, B:49:0x00ff, B:51:0x0105, B:53:0x010f, B:55:0x0114, B:56:0x0118, B:58:0x0132, B:62:0x016d, B:66:0x0177, B:67:0x0196, B:69:0x01a8, B:77:0x01ca, B:81:0x01d8, B:82:0x01dc, B:84:0x01e2, B:85:0x01e4, B:86:0x01e8, B:88:0x01ee, B:90:0x01f4, B:92:0x01f8, B:93:0x01fc, B:96:0x0203, B:99:0x020d, B:101:0x0215, B:102:0x021f, B:108:0x0235, B:110:0x023b, B:114:0x0245, B:72:0x01ad, B:74:0x01b2, B:76:0x01bf, B:103:0x0222, B:105:0x0226, B:107:0x022c, B:111:0x0240, B:119:0x0263, B:115:0x024f, B:117:0x0254, B:121:0x0265, B:123:0x0273, B:125:0x027f, B:126:0x0286, B:128:0x0297, B:133:0x02a4, B:134:0x02a8, B:136:0x02bb, B:138:0x02c5, B:140:0x02cb, B:141:0x02cd, B:142:0x02d6, B:143:0x02d9, B:146:0x02ee, B:151:0x02fb, B:152:0x02ff, B:155:0x030b, B:157:0x0313, B:159:0x032d, B:161:0x0337, B:163:0x033d, B:164:0x033f, B:169:0x0352, B:171:0x0358, B:173:0x0372, B:172:0x036c, B:174:0x0374, B:176:0x0379, B:178:0x037f, B:180:0x0385, B:181:0x0387, B:184:0x0392, B:185:0x0394, B:186:0x0398, B:189:0x03a5, B:194:0x03b4, B:195:0x03b8, B:198:0x03c4, B:200:0x03cc, B:202:0x03e6, B:204:0x03f0, B:206:0x03f6, B:207:0x03f8, B:212:0x040b, B:214:0x0411, B:216:0x042b, B:215:0x0425, B:217:0x042d, B:219:0x0432, B:221:0x0438, B:223:0x043e, B:224:0x0440, B:227:0x044b, B:228:0x044d, B:231:0x0455, B:234:0x045c, B:236:0x0462, B:238:0x0468, B:239:0x046f, B:240:0x0478, B:242:0x0485, B:244:0x048b, B:245:0x0490, B:247:0x0497, B:251:0x04a0, B:260:0x04b3, B:262:0x04bc, B:264:0x04c0, B:265:0x04c6, B:266:0x04c9, B:269:0x04cf, B:271:0x04d5, B:273:0x04d9, B:274:0x04df, B:257:0x04ab), top: B:311:0x00c4, outer: #3 }] */
    /* JADX WARN: Type inference failed for: r17v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r34v0, types: [X.F9O] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14, types: [X.FDW, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.FDW A01(X.F9O r34, X.C7680F9y r35, X.FDW r36, X.FDW r37, X.C7648F8p r38) {
        /*
            Method dump skipped, instructions count: 1389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7679F9x.A01(X.F9O, X.F9y, X.FDW, X.FDW, X.F8p):X.FDW");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.FDW A02(X.F9O r22, X.C7680F9y r23, X.FDW r24, X.C7648F8p r25, java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7679F9x.A02(X.F9O, X.F9y, X.FDW, X.F8p, java.lang.Object):X.FDW");
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<Ljava/lang/String;LX/F8J;>;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;LX/F9y;)V */
    private final void A03(C7680F9y c7680F9y, Map map, Map map2) {
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            F8J f8j = (F8J) BV7.A0s(itA0n);
            Iterator<String> it = f8j.A04.iterator();
            while (it.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it);
                if (!map2.containsKey(strA0j)) {
                    Object objAMX = c7680F9y.AMX(strA0j);
                    if (objAMX == null && !c7680F9y.A76(strA0j)) {
                        objAMX = C7680F9y.A0H;
                    }
                    map2.put(strA0j, objAMX);
                }
            }
            A03(c7680F9y, f8j.A03, map2);
        }
    }
}
