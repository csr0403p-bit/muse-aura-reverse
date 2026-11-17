package X;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "libraries.access.src.main.base.interfaces.defaultimpl.DefaultFxUnifiedAccessLibraryReader$readAuthDataWithCoroutineInternal$2", f = "DefaultFxUnifiedAccessLibraryReader.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class EPD extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Object>, Object> {
    public final /* synthetic */ FBB $bloksContext;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $featureName;
    public final /* synthetic */ List<EPY> $fxAccountItems;
    public final /* synthetic */ EQ3 $fxAccountRequestItem;
    public final /* synthetic */ InterfaceC7542F0w $session;
    public final /* synthetic */ String $waterfallId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;LX/F0w;LX/FBB;LX/EQ3;Ljava/util/List<LX/EPY;>;Ljava/lang/String;Ljava/lang/String;LX/HtJ<-LX/EPD;>;)V */
    public EPD(Context context, FBB fbb, InterfaceC7542F0w interfaceC7542F0w, String str, String str2, List list, HtJ htJ, EQ3 eq3) {
        super(2, htJ);
        this.$context = context;
        this.$session = interfaceC7542F0w;
        this.$bloksContext = fbb;
        this.$fxAccountRequestItem = eq3;
        this.$fxAccountItems = list;
        this.$featureName = str;
        this.$waterfallId = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Context context = this.$context;
        InterfaceC7542F0w interfaceC7542F0w = this.$session;
        FBB fbb = this.$bloksContext;
        EQ3 eq3 = this.$fxAccountRequestItem;
        return new EPD(context, fbb, interfaceC7542F0w, this.$featureName, this.$waterfallId, this.$fxAccountItems, htJ, eq3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x010e, code lost:
    
        r38 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0112, code lost:
    
        if (r8 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0114, code lost:
    
        r2 = "sso_data";
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011b, code lost:
    
        r2 = android.accounts.AccountManager.get(r5).getUserData(r8, "sso_data");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0120, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0121, code lost:
    
        X.CFK.A0F(r6, "SecurityException", r2, r1);
        r2 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03ec A[Catch: Exception -> 0x05a9, TryCatch #0 {Exception -> 0x05a9, blocks: (B:5:0x0009, B:6:0x0020, B:8:0x0023, B:9:0x0024, B:11:0x002f, B:14:0x0039, B:20:0x004c, B:22:0x0054, B:24:0x0068, B:26:0x0072, B:27:0x0075, B:29:0x0080, B:33:0x00a3, B:34:0x00d9, B:36:0x00df, B:76:0x01a5, B:77:0x01ad, B:78:0x01b0, B:79:0x01b6, B:80:0x01b7, B:82:0x01bc, B:42:0x0114, B:43:0x011b, B:47:0x012d, B:49:0x0133, B:85:0x01c8, B:87:0x01ce, B:89:0x01d4, B:91:0x01da, B:97:0x0239, B:93:0x020a, B:52:0x0146, B:54:0x014e, B:56:0x0154, B:58:0x015a, B:59:0x015e, B:61:0x0167, B:62:0x016b, B:64:0x0173, B:65:0x0177, B:67:0x017d, B:68:0x0181, B:70:0x018d, B:72:0x0197, B:94:0x0210, B:45:0x0121, B:84:0x01c4, B:81:0x01ba, B:98:0x023e, B:100:0x026e, B:102:0x028b, B:106:0x02a1, B:107:0x02a7, B:111:0x02bb, B:113:0x02c8, B:115:0x02dd, B:117:0x02e3, B:118:0x0302, B:119:0x0306, B:121:0x0316, B:122:0x031d, B:123:0x0325, B:125:0x032b, B:126:0x0339, B:109:0x02ad, B:127:0x0367, B:128:0x036b, B:129:0x0373, B:131:0x0379, B:133:0x0383, B:134:0x0388, B:135:0x03ae, B:136:0x03b3, B:139:0x03b9, B:140:0x03e2, B:141:0x03e6, B:143:0x03ec, B:145:0x03f4, B:146:0x03f8, B:147:0x040c, B:149:0x0412, B:164:0x0485, B:153:0x0437, B:154:0x043f, B:156:0x0445, B:159:0x0457, B:162:0x0462, B:165:0x048e, B:167:0x0496, B:169:0x04a6, B:171:0x04b0, B:172:0x04b3, B:174:0x04bc, B:176:0x04ca, B:178:0x04ce, B:180:0x04d4, B:181:0x04d8, B:182:0x04dc, B:183:0x04e8, B:186:0x04ee, B:187:0x04f3, B:188:0x04fc, B:190:0x0502, B:191:0x0507, B:192:0x0513, B:194:0x051b, B:196:0x052f, B:198:0x0539, B:199:0x053c, B:201:0x0545, B:203:0x054f, B:221:0x0597, B:222:0x059b, B:207:0x0556, B:208:0x055f, B:211:0x0565, B:212:0x056a, B:213:0x0573, B:216:0x0579, B:217:0x057e, B:219:0x0589, B:220:0x058e, B:223:0x059f), top: B:229:0x0009, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0412 A[Catch: Exception -> 0x05a9, TryCatch #0 {Exception -> 0x05a9, blocks: (B:5:0x0009, B:6:0x0020, B:8:0x0023, B:9:0x0024, B:11:0x002f, B:14:0x0039, B:20:0x004c, B:22:0x0054, B:24:0x0068, B:26:0x0072, B:27:0x0075, B:29:0x0080, B:33:0x00a3, B:34:0x00d9, B:36:0x00df, B:76:0x01a5, B:77:0x01ad, B:78:0x01b0, B:79:0x01b6, B:80:0x01b7, B:82:0x01bc, B:42:0x0114, B:43:0x011b, B:47:0x012d, B:49:0x0133, B:85:0x01c8, B:87:0x01ce, B:89:0x01d4, B:91:0x01da, B:97:0x0239, B:93:0x020a, B:52:0x0146, B:54:0x014e, B:56:0x0154, B:58:0x015a, B:59:0x015e, B:61:0x0167, B:62:0x016b, B:64:0x0173, B:65:0x0177, B:67:0x017d, B:68:0x0181, B:70:0x018d, B:72:0x0197, B:94:0x0210, B:45:0x0121, B:84:0x01c4, B:81:0x01ba, B:98:0x023e, B:100:0x026e, B:102:0x028b, B:106:0x02a1, B:107:0x02a7, B:111:0x02bb, B:113:0x02c8, B:115:0x02dd, B:117:0x02e3, B:118:0x0302, B:119:0x0306, B:121:0x0316, B:122:0x031d, B:123:0x0325, B:125:0x032b, B:126:0x0339, B:109:0x02ad, B:127:0x0367, B:128:0x036b, B:129:0x0373, B:131:0x0379, B:133:0x0383, B:134:0x0388, B:135:0x03ae, B:136:0x03b3, B:139:0x03b9, B:140:0x03e2, B:141:0x03e6, B:143:0x03ec, B:145:0x03f4, B:146:0x03f8, B:147:0x040c, B:149:0x0412, B:164:0x0485, B:153:0x0437, B:154:0x043f, B:156:0x0445, B:159:0x0457, B:162:0x0462, B:165:0x048e, B:167:0x0496, B:169:0x04a6, B:171:0x04b0, B:172:0x04b3, B:174:0x04bc, B:176:0x04ca, B:178:0x04ce, B:180:0x04d4, B:181:0x04d8, B:182:0x04dc, B:183:0x04e8, B:186:0x04ee, B:187:0x04f3, B:188:0x04fc, B:190:0x0502, B:191:0x0507, B:192:0x0513, B:194:0x051b, B:196:0x052f, B:198:0x0539, B:199:0x053c, B:201:0x0545, B:203:0x054f, B:221:0x0597, B:222:0x059b, B:207:0x0556, B:208:0x055f, B:211:0x0565, B:212:0x056a, B:213:0x0573, B:216:0x0579, B:217:0x057e, B:219:0x0589, B:220:0x058e, B:223:0x059f), top: B:229:0x0009, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0437 A[Catch: Exception -> 0x05a9, TryCatch #0 {Exception -> 0x05a9, blocks: (B:5:0x0009, B:6:0x0020, B:8:0x0023, B:9:0x0024, B:11:0x002f, B:14:0x0039, B:20:0x004c, B:22:0x0054, B:24:0x0068, B:26:0x0072, B:27:0x0075, B:29:0x0080, B:33:0x00a3, B:34:0x00d9, B:36:0x00df, B:76:0x01a5, B:77:0x01ad, B:78:0x01b0, B:79:0x01b6, B:80:0x01b7, B:82:0x01bc, B:42:0x0114, B:43:0x011b, B:47:0x012d, B:49:0x0133, B:85:0x01c8, B:87:0x01ce, B:89:0x01d4, B:91:0x01da, B:97:0x0239, B:93:0x020a, B:52:0x0146, B:54:0x014e, B:56:0x0154, B:58:0x015a, B:59:0x015e, B:61:0x0167, B:62:0x016b, B:64:0x0173, B:65:0x0177, B:67:0x017d, B:68:0x0181, B:70:0x018d, B:72:0x0197, B:94:0x0210, B:45:0x0121, B:84:0x01c4, B:81:0x01ba, B:98:0x023e, B:100:0x026e, B:102:0x028b, B:106:0x02a1, B:107:0x02a7, B:111:0x02bb, B:113:0x02c8, B:115:0x02dd, B:117:0x02e3, B:118:0x0302, B:119:0x0306, B:121:0x0316, B:122:0x031d, B:123:0x0325, B:125:0x032b, B:126:0x0339, B:109:0x02ad, B:127:0x0367, B:128:0x036b, B:129:0x0373, B:131:0x0379, B:133:0x0383, B:134:0x0388, B:135:0x03ae, B:136:0x03b3, B:139:0x03b9, B:140:0x03e2, B:141:0x03e6, B:143:0x03ec, B:145:0x03f4, B:146:0x03f8, B:147:0x040c, B:149:0x0412, B:164:0x0485, B:153:0x0437, B:154:0x043f, B:156:0x0445, B:159:0x0457, B:162:0x0462, B:165:0x048e, B:167:0x0496, B:169:0x04a6, B:171:0x04b0, B:172:0x04b3, B:174:0x04bc, B:176:0x04ca, B:178:0x04ce, B:180:0x04d4, B:181:0x04d8, B:182:0x04dc, B:183:0x04e8, B:186:0x04ee, B:187:0x04f3, B:188:0x04fc, B:190:0x0502, B:191:0x0507, B:192:0x0513, B:194:0x051b, B:196:0x052f, B:198:0x0539, B:199:0x053c, B:201:0x0545, B:203:0x054f, B:221:0x0597, B:222:0x059b, B:207:0x0556, B:208:0x055f, B:211:0x0565, B:212:0x056a, B:213:0x0573, B:216:0x0579, B:217:0x057e, B:219:0x0589, B:220:0x058e, B:223:0x059f), top: B:229:0x0009, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04bc A[Catch: Exception -> 0x05a9, TryCatch #0 {Exception -> 0x05a9, blocks: (B:5:0x0009, B:6:0x0020, B:8:0x0023, B:9:0x0024, B:11:0x002f, B:14:0x0039, B:20:0x004c, B:22:0x0054, B:24:0x0068, B:26:0x0072, B:27:0x0075, B:29:0x0080, B:33:0x00a3, B:34:0x00d9, B:36:0x00df, B:76:0x01a5, B:77:0x01ad, B:78:0x01b0, B:79:0x01b6, B:80:0x01b7, B:82:0x01bc, B:42:0x0114, B:43:0x011b, B:47:0x012d, B:49:0x0133, B:85:0x01c8, B:87:0x01ce, B:89:0x01d4, B:91:0x01da, B:97:0x0239, B:93:0x020a, B:52:0x0146, B:54:0x014e, B:56:0x0154, B:58:0x015a, B:59:0x015e, B:61:0x0167, B:62:0x016b, B:64:0x0173, B:65:0x0177, B:67:0x017d, B:68:0x0181, B:70:0x018d, B:72:0x0197, B:94:0x0210, B:45:0x0121, B:84:0x01c4, B:81:0x01ba, B:98:0x023e, B:100:0x026e, B:102:0x028b, B:106:0x02a1, B:107:0x02a7, B:111:0x02bb, B:113:0x02c8, B:115:0x02dd, B:117:0x02e3, B:118:0x0302, B:119:0x0306, B:121:0x0316, B:122:0x031d, B:123:0x0325, B:125:0x032b, B:126:0x0339, B:109:0x02ad, B:127:0x0367, B:128:0x036b, B:129:0x0373, B:131:0x0379, B:133:0x0383, B:134:0x0388, B:135:0x03ae, B:136:0x03b3, B:139:0x03b9, B:140:0x03e2, B:141:0x03e6, B:143:0x03ec, B:145:0x03f4, B:146:0x03f8, B:147:0x040c, B:149:0x0412, B:164:0x0485, B:153:0x0437, B:154:0x043f, B:156:0x0445, B:159:0x0457, B:162:0x0462, B:165:0x048e, B:167:0x0496, B:169:0x04a6, B:171:0x04b0, B:172:0x04b3, B:174:0x04bc, B:176:0x04ca, B:178:0x04ce, B:180:0x04d4, B:181:0x04d8, B:182:0x04dc, B:183:0x04e8, B:186:0x04ee, B:187:0x04f3, B:188:0x04fc, B:190:0x0502, B:191:0x0507, B:192:0x0513, B:194:0x051b, B:196:0x052f, B:198:0x0539, B:199:0x053c, B:201:0x0545, B:203:0x054f, B:221:0x0597, B:222:0x059b, B:207:0x0556, B:208:0x055f, B:211:0x0565, B:212:0x056a, B:213:0x0573, B:216:0x0579, B:217:0x057e, B:219:0x0589, B:220:0x058e, B:223:0x059f), top: B:229:0x0009, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0545 A[Catch: Exception -> 0x05a9, TryCatch #0 {Exception -> 0x05a9, blocks: (B:5:0x0009, B:6:0x0020, B:8:0x0023, B:9:0x0024, B:11:0x002f, B:14:0x0039, B:20:0x004c, B:22:0x0054, B:24:0x0068, B:26:0x0072, B:27:0x0075, B:29:0x0080, B:33:0x00a3, B:34:0x00d9, B:36:0x00df, B:76:0x01a5, B:77:0x01ad, B:78:0x01b0, B:79:0x01b6, B:80:0x01b7, B:82:0x01bc, B:42:0x0114, B:43:0x011b, B:47:0x012d, B:49:0x0133, B:85:0x01c8, B:87:0x01ce, B:89:0x01d4, B:91:0x01da, B:97:0x0239, B:93:0x020a, B:52:0x0146, B:54:0x014e, B:56:0x0154, B:58:0x015a, B:59:0x015e, B:61:0x0167, B:62:0x016b, B:64:0x0173, B:65:0x0177, B:67:0x017d, B:68:0x0181, B:70:0x018d, B:72:0x0197, B:94:0x0210, B:45:0x0121, B:84:0x01c4, B:81:0x01ba, B:98:0x023e, B:100:0x026e, B:102:0x028b, B:106:0x02a1, B:107:0x02a7, B:111:0x02bb, B:113:0x02c8, B:115:0x02dd, B:117:0x02e3, B:118:0x0302, B:119:0x0306, B:121:0x0316, B:122:0x031d, B:123:0x0325, B:125:0x032b, B:126:0x0339, B:109:0x02ad, B:127:0x0367, B:128:0x036b, B:129:0x0373, B:131:0x0379, B:133:0x0383, B:134:0x0388, B:135:0x03ae, B:136:0x03b3, B:139:0x03b9, B:140:0x03e2, B:141:0x03e6, B:143:0x03ec, B:145:0x03f4, B:146:0x03f8, B:147:0x040c, B:149:0x0412, B:164:0x0485, B:153:0x0437, B:154:0x043f, B:156:0x0445, B:159:0x0457, B:162:0x0462, B:165:0x048e, B:167:0x0496, B:169:0x04a6, B:171:0x04b0, B:172:0x04b3, B:174:0x04bc, B:176:0x04ca, B:178:0x04ce, B:180:0x04d4, B:181:0x04d8, B:182:0x04dc, B:183:0x04e8, B:186:0x04ee, B:187:0x04f3, B:188:0x04fc, B:190:0x0502, B:191:0x0507, B:192:0x0513, B:194:0x051b, B:196:0x052f, B:198:0x0539, B:199:0x053c, B:201:0x0545, B:203:0x054f, B:221:0x0597, B:222:0x059b, B:207:0x0556, B:208:0x055f, B:211:0x0565, B:212:0x056a, B:213:0x0573, B:216:0x0579, B:217:0x057e, B:219:0x0589, B:220:0x058e, B:223:0x059f), top: B:229:0x0009, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080 A[Catch: Exception -> 0x05a9, TRY_LEAVE, TryCatch #0 {Exception -> 0x05a9, blocks: (B:5:0x0009, B:6:0x0020, B:8:0x0023, B:9:0x0024, B:11:0x002f, B:14:0x0039, B:20:0x004c, B:22:0x0054, B:24:0x0068, B:26:0x0072, B:27:0x0075, B:29:0x0080, B:33:0x00a3, B:34:0x00d9, B:36:0x00df, B:76:0x01a5, B:77:0x01ad, B:78:0x01b0, B:79:0x01b6, B:80:0x01b7, B:82:0x01bc, B:42:0x0114, B:43:0x011b, B:47:0x012d, B:49:0x0133, B:85:0x01c8, B:87:0x01ce, B:89:0x01d4, B:91:0x01da, B:97:0x0239, B:93:0x020a, B:52:0x0146, B:54:0x014e, B:56:0x0154, B:58:0x015a, B:59:0x015e, B:61:0x0167, B:62:0x016b, B:64:0x0173, B:65:0x0177, B:67:0x017d, B:68:0x0181, B:70:0x018d, B:72:0x0197, B:94:0x0210, B:45:0x0121, B:84:0x01c4, B:81:0x01ba, B:98:0x023e, B:100:0x026e, B:102:0x028b, B:106:0x02a1, B:107:0x02a7, B:111:0x02bb, B:113:0x02c8, B:115:0x02dd, B:117:0x02e3, B:118:0x0302, B:119:0x0306, B:121:0x0316, B:122:0x031d, B:123:0x0325, B:125:0x032b, B:126:0x0339, B:109:0x02ad, B:127:0x0367, B:128:0x036b, B:129:0x0373, B:131:0x0379, B:133:0x0383, B:134:0x0388, B:135:0x03ae, B:136:0x03b3, B:139:0x03b9, B:140:0x03e2, B:141:0x03e6, B:143:0x03ec, B:145:0x03f4, B:146:0x03f8, B:147:0x040c, B:149:0x0412, B:164:0x0485, B:153:0x0437, B:154:0x043f, B:156:0x0445, B:159:0x0457, B:162:0x0462, B:165:0x048e, B:167:0x0496, B:169:0x04a6, B:171:0x04b0, B:172:0x04b3, B:174:0x04bc, B:176:0x04ca, B:178:0x04ce, B:180:0x04d4, B:181:0x04d8, B:182:0x04dc, B:183:0x04e8, B:186:0x04ee, B:187:0x04f3, B:188:0x04fc, B:190:0x0502, B:191:0x0507, B:192:0x0513, B:194:0x051b, B:196:0x052f, B:198:0x0539, B:199:0x053c, B:201:0x0545, B:203:0x054f, B:221:0x0597, B:222:0x059b, B:207:0x0556, B:208:0x055f, B:211:0x0565, B:212:0x056a, B:213:0x0573, B:216:0x0579, B:217:0x057e, B:219:0x0589, B:220:0x058e, B:223:0x059f), top: B:229:0x0009, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0235 A[PHI: r38
  0x0235: PHI (r38v3 X.EPY) = 
  (r38v2 X.EPY)
  (r38v2 X.EPY)
  (r38v2 X.EPY)
  (r38v2 X.EPY)
  (r38v2 X.EPY)
  (r38v4 X.EPY)
  (r38v2 X.EPY)
  (r38v2 X.EPY)
  (r38v2 X.EPY)
  (r38v2 X.EPY)
 binds: [B:41:0x0112, B:46:0x012b, B:48:0x0131, B:53:0x014c, B:55:0x0152, B:94:0x0210, B:93:0x020a, B:86:0x01cc, B:88:0x01d2, B:90:0x01d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0239 A[Catch: Exception -> 0x03b8, Exception -> 0x05a9, TryCatch #2 {Exception -> 0x03b8, blocks: (B:34:0x00d9, B:36:0x00df, B:76:0x01a5, B:77:0x01ad, B:78:0x01b0, B:79:0x01b6, B:80:0x01b7, B:82:0x01bc, B:42:0x0114, B:43:0x011b, B:47:0x012d, B:49:0x0133, B:85:0x01c8, B:87:0x01ce, B:89:0x01d4, B:91:0x01da, B:97:0x0239, B:93:0x020a, B:52:0x0146, B:54:0x014e, B:56:0x0154, B:58:0x015a, B:59:0x015e, B:61:0x0167, B:62:0x016b, B:64:0x0173, B:65:0x0177, B:67:0x017d, B:68:0x0181, B:70:0x018d, B:72:0x0197, B:94:0x0210, B:45:0x0121, B:84:0x01c4, B:81:0x01ba, B:98:0x023e, B:100:0x026e, B:102:0x028b, B:106:0x02a1, B:107:0x02a7, B:111:0x02bb, B:113:0x02c8, B:115:0x02dd, B:117:0x02e3, B:118:0x0302, B:119:0x0306, B:121:0x0316, B:122:0x031d, B:123:0x0325, B:125:0x032b, B:126:0x0339, B:109:0x02ad, B:127:0x0367, B:128:0x036b, B:129:0x0373, B:131:0x0379, B:133:0x0383, B:134:0x0388, B:135:0x03ae, B:136:0x03b3), top: B:232:0x00d9, outer: #0 }] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r46) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EPD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static final EPL A0M(EPM epm) {
        switch (epm.ordinal()) {
            case 0:
                return EPL.A05;
            case 1:
                return EPL.A06;
            case 2:
                return EPL.A08;
            case 3:
                return EPL.A09;
            case 4:
                return EPL.A07;
            case 5:
                return EPL.A0D;
            case 6:
                return EPL.A0F;
            case 7:
                return EPL.A0E;
            case 8:
                return EPL.A0M;
            case 9:
                return EPL.A0I;
            case 10:
                return EPL.A0G;
            case 11:
                return EPL.A0H;
            case 12:
                return EPL.A0L;
            case 13:
                return EPL.A0J;
            case 14:
                return EPL.A0K;
            case 15:
                return EPL.A0N;
            case 16:
                return EPL.A0O;
            case 17:
                return EPL.A02;
            case 18:
                return EPL.A03;
            case 19:
                return EPL.A0A;
            case 20:
                return EPL.A0B;
            case 21:
                return EPL.A0C;
            case 22:
                return EPL.A04;
            case 23:
                return EPL.A0P;
            default:
                return null;
        }
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Object> htJ) {
        return ((EPD) AbstractC07127nr.A09(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
