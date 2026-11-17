package com.facebook.rp.platform.metaai.rsys;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C3cG;
import X.C7384Etj;
import X.C78T;
import X.C8631Fhi;
import X.C9586GQf;
import X.C9587GQk;
import X.C9590GQp;
import X.EY5;
import X.F0C;
import X.G0U;
import X.G2j;
import X.GQM;
import X.GQi;
import X.GTS;
import X.HoC;
import X.InterfaceC5054DRe;
import android.content.Context;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import com.facebook.rsys.ai.gen.AiSessionCreateResult;
import com.facebook.rsys.ai.gen.OptionalParams;
import java.util.Set;

/* loaded from: classes6.dex */
public final class MetaAiRsysSdk {
    public HoC A00;
    public final InterfaceC5054DRe A01;
    public final GTS A02;
    public final C9590GQp A03;
    public final String A04;
    public final Set<String> A05;
    public final C78T A06;
    public final G0U<Context, AudioManager> A07;
    public final G0U<Context, ConnectivityManager> A08;
    public final G2j<String, Integer, String, OptionalParams, AiSessionCreateResult> A09;
    public volatile MetaAiRsysSdkRealTimeSession A0A;

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r2v0 com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk) */
    public static final synchronized void A00(MetaAiRsysSdk metaAiRsysSdk, String str) {
        synchronized (metaAiRsysSdk) {
            metaAiRsysSdk.A05.remove(str);
            MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession = metaAiRsysSdk.A0A;
            if (C7384Etj.areEqual(metaAiRsysSdkRealTimeSession != null ? metaAiRsysSdkRealTimeSession.A0C.A04 : null, str)) {
                metaAiRsysSdk.A0A = null;
                metaAiRsysSdk.A00 = null;
            }
        }
    }

    public /* synthetic */ MetaAiRsysSdk(InterfaceC5054DRe interfaceC5054DRe, GTS gts, String str, C78T c78t) {
        EY5 ey5 = new EY5(19);
        C8631Fhi c8631FhiA00 = C8631Fhi.A00(20);
        C9590GQp c9590GQp = new C9590GQp();
        GQi gQi = new GQi();
        AnonymousClass005.A0x(str, c78t, gts);
        this.A04 = str;
        this.A06 = c78t;
        this.A02 = gts;
        this.A01 = interfaceC5054DRe;
        this.A08 = ey5;
        this.A07 = c8631FhiA00;
        this.A03 = c9590GQp;
        this.A09 = gQi;
        this.A05 = C3cG.A0k();
    }

    public static final boolean A01(C9586GQf c9586GQf, MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession) {
        String str;
        F0C f0c = metaAiRsysSdkRealTimeSession.A0T;
        C9587GQk value = ((GQM) f0c.getValue()).A03.getValue();
        if (value == null || (str = value.A00) == null) {
            C9587GQk value2 = ((GQM) f0c.getValue()).A02.getValue();
            str = value2 != null ? value2.A00 : null;
        }
        return AnonymousClass002.A1M(String.valueOf(c9586GQf.A0D).equals(str) ? 1 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ce, code lost:
    
        if (r0 != r1) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0323 A[PHI: r41
  0x0323: PHI (r41v3 boolean) = (r41v1 boolean), (r41v4 boolean) binds: [B:151:0x0320, B:149:0x031c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x036a A[Catch: all -> 0x048e, TRY_ENTER, TryCatch #6 {all -> 0x048e, blocks: (B:78:0x01d1, B:79:0x01d4, B:81:0x01de, B:82:0x01e6, B:86:0x01fc, B:87:0x01fd, B:89:0x0211, B:90:0x0216, B:92:0x0228, B:93:0x0231, B:96:0x0246, B:98:0x024f, B:104:0x025f, B:106:0x026f, B:107:0x0274, B:109:0x027a, B:110:0x027f, B:111:0x0283, B:115:0x029a, B:168:0x038f, B:116:0x029f, B:118:0x02b0, B:121:0x02b8, B:128:0x02c4, B:129:0x02c9, B:131:0x02cf, B:136:0x02d9, B:145:0x02eb, B:155:0x0330, B:156:0x035e, B:175:0x03a8, B:176:0x03a9, B:179:0x03c1, B:182:0x03c6, B:184:0x03d1, B:185:0x03d5, B:190:0x0410, B:192:0x0418, B:194:0x0429, B:195:0x042b, B:189:0x03ff, B:196:0x0456, B:198:0x045c, B:159:0x0365, B:154:0x0326, B:40:0x011f, B:41:0x0122, B:45:0x012b, B:47:0x0135, B:49:0x0143, B:199:0x0488, B:51:0x0149, B:53:0x014d, B:56:0x015b, B:57:0x016d, B:59:0x017a, B:173:0x03a5, B:67:0x0199, B:68:0x019a, B:70:0x01ba, B:72:0x01c0, B:75:0x01cc, B:164:0x036a, B:172:0x03a1, B:18:0x008f, B:20:0x0097, B:165:0x037b, B:25:0x00a5, B:27:0x00a9, B:28:0x00af, B:30:0x00c0, B:32:0x00cc, B:34:0x00e2, B:36:0x00ed, B:37:0x00f1, B:171:0x0397, B:167:0x037f, B:22:0x009f, B:24:0x00a3, B:170:0x0393, B:157:0x035f), top: B:215:0x002e, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0149 A[Catch: all -> 0x048e, TryCatch #6 {all -> 0x048e, blocks: (B:78:0x01d1, B:79:0x01d4, B:81:0x01de, B:82:0x01e6, B:86:0x01fc, B:87:0x01fd, B:89:0x0211, B:90:0x0216, B:92:0x0228, B:93:0x0231, B:96:0x0246, B:98:0x024f, B:104:0x025f, B:106:0x026f, B:107:0x0274, B:109:0x027a, B:110:0x027f, B:111:0x0283, B:115:0x029a, B:168:0x038f, B:116:0x029f, B:118:0x02b0, B:121:0x02b8, B:128:0x02c4, B:129:0x02c9, B:131:0x02cf, B:136:0x02d9, B:145:0x02eb, B:155:0x0330, B:156:0x035e, B:175:0x03a8, B:176:0x03a9, B:179:0x03c1, B:182:0x03c6, B:184:0x03d1, B:185:0x03d5, B:190:0x0410, B:192:0x0418, B:194:0x0429, B:195:0x042b, B:189:0x03ff, B:196:0x0456, B:198:0x045c, B:159:0x0365, B:154:0x0326, B:40:0x011f, B:41:0x0122, B:45:0x012b, B:47:0x0135, B:49:0x0143, B:199:0x0488, B:51:0x0149, B:53:0x014d, B:56:0x015b, B:57:0x016d, B:59:0x017a, B:173:0x03a5, B:67:0x0199, B:68:0x019a, B:70:0x01ba, B:72:0x01c0, B:75:0x01cc, B:164:0x036a, B:172:0x03a1, B:18:0x008f, B:20:0x0097, B:165:0x037b, B:25:0x00a5, B:27:0x00a9, B:28:0x00af, B:30:0x00c0, B:32:0x00cc, B:34:0x00e2, B:36:0x00ed, B:37:0x00f1, B:171:0x0397, B:167:0x037f, B:22:0x009f, B:24:0x00a3, B:170:0x0393, B:157:0x035f), top: B:215:0x002e, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014d A[Catch: all -> 0x048e, TryCatch #6 {all -> 0x048e, blocks: (B:78:0x01d1, B:79:0x01d4, B:81:0x01de, B:82:0x01e6, B:86:0x01fc, B:87:0x01fd, B:89:0x0211, B:90:0x0216, B:92:0x0228, B:93:0x0231, B:96:0x0246, B:98:0x024f, B:104:0x025f, B:106:0x026f, B:107:0x0274, B:109:0x027a, B:110:0x027f, B:111:0x0283, B:115:0x029a, B:168:0x038f, B:116:0x029f, B:118:0x02b0, B:121:0x02b8, B:128:0x02c4, B:129:0x02c9, B:131:0x02cf, B:136:0x02d9, B:145:0x02eb, B:155:0x0330, B:156:0x035e, B:175:0x03a8, B:176:0x03a9, B:179:0x03c1, B:182:0x03c6, B:184:0x03d1, B:185:0x03d5, B:190:0x0410, B:192:0x0418, B:194:0x0429, B:195:0x042b, B:189:0x03ff, B:196:0x0456, B:198:0x045c, B:159:0x0365, B:154:0x0326, B:40:0x011f, B:41:0x0122, B:45:0x012b, B:47:0x0135, B:49:0x0143, B:199:0x0488, B:51:0x0149, B:53:0x014d, B:56:0x015b, B:57:0x016d, B:59:0x017a, B:173:0x03a5, B:67:0x0199, B:68:0x019a, B:70:0x01ba, B:72:0x01c0, B:75:0x01cc, B:164:0x036a, B:172:0x03a1, B:18:0x008f, B:20:0x0097, B:165:0x037b, B:25:0x00a5, B:27:0x00a9, B:28:0x00af, B:30:0x00c0, B:32:0x00cc, B:34:0x00e2, B:36:0x00ed, B:37:0x00f1, B:171:0x0397, B:167:0x037f, B:22:0x009f, B:24:0x00a3, B:170:0x0393, B:157:0x035f), top: B:215:0x002e, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017a A[Catch: all -> 0x048e, TRY_LEAVE, TryCatch #6 {all -> 0x048e, blocks: (B:78:0x01d1, B:79:0x01d4, B:81:0x01de, B:82:0x01e6, B:86:0x01fc, B:87:0x01fd, B:89:0x0211, B:90:0x0216, B:92:0x0228, B:93:0x0231, B:96:0x0246, B:98:0x024f, B:104:0x025f, B:106:0x026f, B:107:0x0274, B:109:0x027a, B:110:0x027f, B:111:0x0283, B:115:0x029a, B:168:0x038f, B:116:0x029f, B:118:0x02b0, B:121:0x02b8, B:128:0x02c4, B:129:0x02c9, B:131:0x02cf, B:136:0x02d9, B:145:0x02eb, B:155:0x0330, B:156:0x035e, B:175:0x03a8, B:176:0x03a9, B:179:0x03c1, B:182:0x03c6, B:184:0x03d1, B:185:0x03d5, B:190:0x0410, B:192:0x0418, B:194:0x0429, B:195:0x042b, B:189:0x03ff, B:196:0x0456, B:198:0x045c, B:159:0x0365, B:154:0x0326, B:40:0x011f, B:41:0x0122, B:45:0x012b, B:47:0x0135, B:49:0x0143, B:199:0x0488, B:51:0x0149, B:53:0x014d, B:56:0x015b, B:57:0x016d, B:59:0x017a, B:173:0x03a5, B:67:0x0199, B:68:0x019a, B:70:0x01ba, B:72:0x01c0, B:75:0x01cc, B:164:0x036a, B:172:0x03a1, B:18:0x008f, B:20:0x0097, B:165:0x037b, B:25:0x00a5, B:27:0x00a9, B:28:0x00af, B:30:0x00c0, B:32:0x00cc, B:34:0x00e2, B:36:0x00ed, B:37:0x00f1, B:171:0x0397, B:167:0x037f, B:22:0x009f, B:24:0x00a3, B:170:0x0393, B:157:0x035f), top: B:215:0x002e, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01cc A[Catch: all -> 0x048e, TryCatch #6 {all -> 0x048e, blocks: (B:78:0x01d1, B:79:0x01d4, B:81:0x01de, B:82:0x01e6, B:86:0x01fc, B:87:0x01fd, B:89:0x0211, B:90:0x0216, B:92:0x0228, B:93:0x0231, B:96:0x0246, B:98:0x024f, B:104:0x025f, B:106:0x026f, B:107:0x0274, B:109:0x027a, B:110:0x027f, B:111:0x0283, B:115:0x029a, B:168:0x038f, B:116:0x029f, B:118:0x02b0, B:121:0x02b8, B:128:0x02c4, B:129:0x02c9, B:131:0x02cf, B:136:0x02d9, B:145:0x02eb, B:155:0x0330, B:156:0x035e, B:175:0x03a8, B:176:0x03a9, B:179:0x03c1, B:182:0x03c6, B:184:0x03d1, B:185:0x03d5, B:190:0x0410, B:192:0x0418, B:194:0x0429, B:195:0x042b, B:189:0x03ff, B:196:0x0456, B:198:0x045c, B:159:0x0365, B:154:0x0326, B:40:0x011f, B:41:0x0122, B:45:0x012b, B:47:0x0135, B:49:0x0143, B:199:0x0488, B:51:0x0149, B:53:0x014d, B:56:0x015b, B:57:0x016d, B:59:0x017a, B:173:0x03a5, B:67:0x0199, B:68:0x019a, B:70:0x01ba, B:72:0x01c0, B:75:0x01cc, B:164:0x036a, B:172:0x03a1, B:18:0x008f, B:20:0x0097, B:165:0x037b, B:25:0x00a5, B:27:0x00a9, B:28:0x00af, B:30:0x00c0, B:32:0x00cc, B:34:0x00e2, B:36:0x00ed, B:37:0x00f1, B:171:0x0397, B:167:0x037f, B:22:0x009f, B:24:0x00a3, B:170:0x0393, B:157:0x035f), top: B:215:0x002e, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Type inference failed for: r0v103, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v96, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.GSV r41, X.C9586GQf r42, X.GXO r43, X.GX5 r44, X.HtJ r45) {
        /*
            Method dump skipped, instructions count: 1171
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk.A02(X.GSV, X.GQf, X.GXO, X.GX5, X.HtJ):java.lang.Object");
    }
}
