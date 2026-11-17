package com.google.firebase.messaging;

import X.BV5;
import X.CTB;
import android.content.Intent;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes5.dex */
public class FirebaseMessagingService extends CTB {
    public static final Queue<String> A00 = new ArrayDeque(10);

    public static boolean A02(Intent intent) {
        if (BV5.A1Q(intent, "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT")) {
            return false;
        }
        return "1".equals(intent.getStringExtra("google.c.a.e"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0249 A[Catch: all -> 0x0602, TRY_ENTER, TryCatch #1 {all -> 0x0602, blocks: (B:72:0x0195, B:74:0x01a1, B:76:0x01b0, B:78:0x01c2, B:79:0x01c6, B:81:0x01cc, B:83:0x01d6, B:86:0x01de, B:88:0x01eb, B:95:0x0212, B:96:0x022b, B:97:0x0236, B:114:0x02b6, B:118:0x02d0, B:120:0x02e4, B:121:0x02fd, B:123:0x030c, B:124:0x031d, B:126:0x0329, B:128:0x0337, B:130:0x033f, B:139:0x0390, B:141:0x039f, B:142:0x03a5, B:144:0x03ab, B:146:0x03b3, B:148:0x03c1, B:151:0x03e5, B:149:0x03de, B:152:0x0401, B:154:0x040d, B:155:0x041b, B:156:0x0429, B:158:0x042f, B:160:0x0435, B:162:0x043d, B:174:0x0480, B:175:0x0487, B:177:0x048d, B:179:0x0499, B:181:0x04a1, B:183:0x04a8, B:185:0x04c0, B:186:0x04f0, B:188:0x04fe, B:190:0x052d, B:191:0x0531, B:193:0x053d, B:199:0x057c, B:200:0x0582, B:202:0x058e, B:203:0x059e, B:205:0x05a7, B:208:0x05e1, B:210:0x05e7, B:211:0x05ec, B:206:0x05cd, B:207:0x05d6, B:195:0x0561, B:197:0x056d, B:198:0x0576, B:194:0x0546, B:163:0x0441, B:165:0x044d, B:166:0x0453, B:168:0x0459, B:170:0x045f, B:171:0x046e, B:173:0x047a, B:131:0x035a, B:133:0x0366, B:137:0x0376, B:101:0x0249, B:103:0x0257, B:105:0x025d, B:106:0x0278, B:108:0x0288, B:111:0x0290, B:113:0x029b, B:89:0x01f6, B:91:0x0202, B:92:0x0206, B:93:0x020a), top: B:288:0x0195, inners: #4, #7, #8, #9, #10, #13, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0288 A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:72:0x0195, B:74:0x01a1, B:76:0x01b0, B:78:0x01c2, B:79:0x01c6, B:81:0x01cc, B:83:0x01d6, B:86:0x01de, B:88:0x01eb, B:95:0x0212, B:96:0x022b, B:97:0x0236, B:114:0x02b6, B:118:0x02d0, B:120:0x02e4, B:121:0x02fd, B:123:0x030c, B:124:0x031d, B:126:0x0329, B:128:0x0337, B:130:0x033f, B:139:0x0390, B:141:0x039f, B:142:0x03a5, B:144:0x03ab, B:146:0x03b3, B:148:0x03c1, B:151:0x03e5, B:149:0x03de, B:152:0x0401, B:154:0x040d, B:155:0x041b, B:156:0x0429, B:158:0x042f, B:160:0x0435, B:162:0x043d, B:174:0x0480, B:175:0x0487, B:177:0x048d, B:179:0x0499, B:181:0x04a1, B:183:0x04a8, B:185:0x04c0, B:186:0x04f0, B:188:0x04fe, B:190:0x052d, B:191:0x0531, B:193:0x053d, B:199:0x057c, B:200:0x0582, B:202:0x058e, B:203:0x059e, B:205:0x05a7, B:208:0x05e1, B:210:0x05e7, B:211:0x05ec, B:206:0x05cd, B:207:0x05d6, B:195:0x0561, B:197:0x056d, B:198:0x0576, B:194:0x0546, B:163:0x0441, B:165:0x044d, B:166:0x0453, B:168:0x0459, B:170:0x045f, B:171:0x046e, B:173:0x047a, B:131:0x035a, B:133:0x0366, B:137:0x0376, B:101:0x0249, B:103:0x0257, B:105:0x025d, B:106:0x0278, B:108:0x0288, B:111:0x0290, B:113:0x029b, B:89:0x01f6, B:91:0x0202, B:92:0x0206, B:93:0x020a), top: B:288:0x0195, inners: #4, #7, #8, #9, #10, #13, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x029b A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:72:0x0195, B:74:0x01a1, B:76:0x01b0, B:78:0x01c2, B:79:0x01c6, B:81:0x01cc, B:83:0x01d6, B:86:0x01de, B:88:0x01eb, B:95:0x0212, B:96:0x022b, B:97:0x0236, B:114:0x02b6, B:118:0x02d0, B:120:0x02e4, B:121:0x02fd, B:123:0x030c, B:124:0x031d, B:126:0x0329, B:128:0x0337, B:130:0x033f, B:139:0x0390, B:141:0x039f, B:142:0x03a5, B:144:0x03ab, B:146:0x03b3, B:148:0x03c1, B:151:0x03e5, B:149:0x03de, B:152:0x0401, B:154:0x040d, B:155:0x041b, B:156:0x0429, B:158:0x042f, B:160:0x0435, B:162:0x043d, B:174:0x0480, B:175:0x0487, B:177:0x048d, B:179:0x0499, B:181:0x04a1, B:183:0x04a8, B:185:0x04c0, B:186:0x04f0, B:188:0x04fe, B:190:0x052d, B:191:0x0531, B:193:0x053d, B:199:0x057c, B:200:0x0582, B:202:0x058e, B:203:0x059e, B:205:0x05a7, B:208:0x05e1, B:210:0x05e7, B:211:0x05ec, B:206:0x05cd, B:207:0x05d6, B:195:0x0561, B:197:0x056d, B:198:0x0576, B:194:0x0546, B:163:0x0441, B:165:0x044d, B:166:0x0453, B:168:0x0459, B:170:0x045f, B:171:0x046e, B:173:0x047a, B:131:0x035a, B:133:0x0366, B:137:0x0376, B:101:0x0249, B:103:0x0257, B:105:0x025d, B:106:0x0278, B:108:0x0288, B:111:0x0290, B:113:0x029b, B:89:0x01f6, B:91:0x0202, B:92:0x0206, B:93:0x020a), top: B:288:0x0195, inners: #4, #7, #8, #9, #10, #13, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x030c A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:72:0x0195, B:74:0x01a1, B:76:0x01b0, B:78:0x01c2, B:79:0x01c6, B:81:0x01cc, B:83:0x01d6, B:86:0x01de, B:88:0x01eb, B:95:0x0212, B:96:0x022b, B:97:0x0236, B:114:0x02b6, B:118:0x02d0, B:120:0x02e4, B:121:0x02fd, B:123:0x030c, B:124:0x031d, B:126:0x0329, B:128:0x0337, B:130:0x033f, B:139:0x0390, B:141:0x039f, B:142:0x03a5, B:144:0x03ab, B:146:0x03b3, B:148:0x03c1, B:151:0x03e5, B:149:0x03de, B:152:0x0401, B:154:0x040d, B:155:0x041b, B:156:0x0429, B:158:0x042f, B:160:0x0435, B:162:0x043d, B:174:0x0480, B:175:0x0487, B:177:0x048d, B:179:0x0499, B:181:0x04a1, B:183:0x04a8, B:185:0x04c0, B:186:0x04f0, B:188:0x04fe, B:190:0x052d, B:191:0x0531, B:193:0x053d, B:199:0x057c, B:200:0x0582, B:202:0x058e, B:203:0x059e, B:205:0x05a7, B:208:0x05e1, B:210:0x05e7, B:211:0x05ec, B:206:0x05cd, B:207:0x05d6, B:195:0x0561, B:197:0x056d, B:198:0x0576, B:194:0x0546, B:163:0x0441, B:165:0x044d, B:166:0x0453, B:168:0x0459, B:170:0x045f, B:171:0x046e, B:173:0x047a, B:131:0x035a, B:133:0x0366, B:137:0x0376, B:101:0x0249, B:103:0x0257, B:105:0x025d, B:106:0x0278, B:108:0x0288, B:111:0x0290, B:113:0x029b, B:89:0x01f6, B:91:0x0202, B:92:0x0206, B:93:0x020a), top: B:288:0x0195, inners: #4, #7, #8, #9, #10, #13, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0329 A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:72:0x0195, B:74:0x01a1, B:76:0x01b0, B:78:0x01c2, B:79:0x01c6, B:81:0x01cc, B:83:0x01d6, B:86:0x01de, B:88:0x01eb, B:95:0x0212, B:96:0x022b, B:97:0x0236, B:114:0x02b6, B:118:0x02d0, B:120:0x02e4, B:121:0x02fd, B:123:0x030c, B:124:0x031d, B:126:0x0329, B:128:0x0337, B:130:0x033f, B:139:0x0390, B:141:0x039f, B:142:0x03a5, B:144:0x03ab, B:146:0x03b3, B:148:0x03c1, B:151:0x03e5, B:149:0x03de, B:152:0x0401, B:154:0x040d, B:155:0x041b, B:156:0x0429, B:158:0x042f, B:160:0x0435, B:162:0x043d, B:174:0x0480, B:175:0x0487, B:177:0x048d, B:179:0x0499, B:181:0x04a1, B:183:0x04a8, B:185:0x04c0, B:186:0x04f0, B:188:0x04fe, B:190:0x052d, B:191:0x0531, B:193:0x053d, B:199:0x057c, B:200:0x0582, B:202:0x058e, B:203:0x059e, B:205:0x05a7, B:208:0x05e1, B:210:0x05e7, B:211:0x05ec, B:206:0x05cd, B:207:0x05d6, B:195:0x0561, B:197:0x056d, B:198:0x0576, B:194:0x0546, B:163:0x0441, B:165:0x044d, B:166:0x0453, B:168:0x0459, B:170:0x045f, B:171:0x046e, B:173:0x047a, B:131:0x035a, B:133:0x0366, B:137:0x0376, B:101:0x0249, B:103:0x0257, B:105:0x025d, B:106:0x0278, B:108:0x0288, B:111:0x0290, B:113:0x029b, B:89:0x01f6, B:91:0x0202, B:92:0x0206, B:93:0x020a), top: B:288:0x0195, inners: #4, #7, #8, #9, #10, #13, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x035a A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:72:0x0195, B:74:0x01a1, B:76:0x01b0, B:78:0x01c2, B:79:0x01c6, B:81:0x01cc, B:83:0x01d6, B:86:0x01de, B:88:0x01eb, B:95:0x0212, B:96:0x022b, B:97:0x0236, B:114:0x02b6, B:118:0x02d0, B:120:0x02e4, B:121:0x02fd, B:123:0x030c, B:124:0x031d, B:126:0x0329, B:128:0x0337, B:130:0x033f, B:139:0x0390, B:141:0x039f, B:142:0x03a5, B:144:0x03ab, B:146:0x03b3, B:148:0x03c1, B:151:0x03e5, B:149:0x03de, B:152:0x0401, B:154:0x040d, B:155:0x041b, B:156:0x0429, B:158:0x042f, B:160:0x0435, B:162:0x043d, B:174:0x0480, B:175:0x0487, B:177:0x048d, B:179:0x0499, B:181:0x04a1, B:183:0x04a8, B:185:0x04c0, B:186:0x04f0, B:188:0x04fe, B:190:0x052d, B:191:0x0531, B:193:0x053d, B:199:0x057c, B:200:0x0582, B:202:0x058e, B:203:0x059e, B:205:0x05a7, B:208:0x05e1, B:210:0x05e7, B:211:0x05ec, B:206:0x05cd, B:207:0x05d6, B:195:0x0561, B:197:0x056d, B:198:0x0576, B:194:0x0546, B:163:0x0441, B:165:0x044d, B:166:0x0453, B:168:0x0459, B:170:0x045f, B:171:0x046e, B:173:0x047a, B:131:0x035a, B:133:0x0366, B:137:0x0376, B:101:0x0249, B:103:0x0257, B:105:0x025d, B:106:0x0278, B:108:0x0288, B:111:0x0290, B:113:0x029b, B:89:0x01f6, B:91:0x0202, B:92:0x0206, B:93:0x020a), top: B:288:0x0195, inners: #4, #7, #8, #9, #10, #13, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x039f A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:72:0x0195, B:74:0x01a1, B:76:0x01b0, B:78:0x01c2, B:79:0x01c6, B:81:0x01cc, B:83:0x01d6, B:86:0x01de, B:88:0x01eb, B:95:0x0212, B:96:0x022b, B:97:0x0236, B:114:0x02b6, B:118:0x02d0, B:120:0x02e4, B:121:0x02fd, B:123:0x030c, B:124:0x031d, B:126:0x0329, B:128:0x0337, B:130:0x033f, B:139:0x0390, B:141:0x039f, B:142:0x03a5, B:144:0x03ab, B:146:0x03b3, B:148:0x03c1, B:151:0x03e5, B:149:0x03de, B:152:0x0401, B:154:0x040d, B:155:0x041b, B:156:0x0429, B:158:0x042f, B:160:0x0435, B:162:0x043d, B:174:0x0480, B:175:0x0487, B:177:0x048d, B:179:0x0499, B:181:0x04a1, B:183:0x04a8, B:185:0x04c0, B:186:0x04f0, B:188:0x04fe, B:190:0x052d, B:191:0x0531, B:193:0x053d, B:199:0x057c, B:200:0x0582, B:202:0x058e, B:203:0x059e, B:205:0x05a7, B:208:0x05e1, B:210:0x05e7, B:211:0x05ec, B:206:0x05cd, B:207:0x05d6, B:195:0x0561, B:197:0x056d, B:198:0x0576, B:194:0x0546, B:163:0x0441, B:165:0x044d, B:166:0x0453, B:168:0x0459, B:170:0x045f, B:171:0x046e, B:173:0x047a, B:131:0x035a, B:133:0x0366, B:137:0x0376, B:101:0x0249, B:103:0x0257, B:105:0x025d, B:106:0x0278, B:108:0x0288, B:111:0x0290, B:113:0x029b, B:89:0x01f6, B:91:0x0202, B:92:0x0206, B:93:0x020a), top: B:288:0x0195, inners: #4, #7, #8, #9, #10, #13, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03ab A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:72:0x0195, B:74:0x01a1, B:76:0x01b0, B:78:0x01c2, B:79:0x01c6, B:81:0x01cc, B:83:0x01d6, B:86:0x01de, B:88:0x01eb, B:95:0x0212, B:96:0x022b, B:97:0x0236, B:114:0x02b6, B:118:0x02d0, B:120:0x02e4, B:121:0x02fd, B:123:0x030c, B:124:0x031d, B:126:0x0329, B:128:0x0337, B:130:0x033f, B:139:0x0390, B:141:0x039f, B:142:0x03a5, B:144:0x03ab, B:146:0x03b3, B:148:0x03c1, B:151:0x03e5, B:149:0x03de, B:152:0x0401, B:154:0x040d, B:155:0x041b, B:156:0x0429, B:158:0x042f, B:160:0x0435, B:162:0x043d, B:174:0x0480, B:175:0x0487, B:177:0x048d, B:179:0x0499, B:181:0x04a1, B:183:0x04a8, B:185:0x04c0, B:186:0x04f0, B:188:0x04fe, B:190:0x052d, B:191:0x0531, B:193:0x053d, B:199:0x057c, B:200:0x0582, B:202:0x058e, B:203:0x059e, B:205:0x05a7, B:208:0x05e1, B:210:0x05e7, B:211:0x05ec, B:206:0x05cd, B:207:0x05d6, B:195:0x0561, B:197:0x056d, B:198:0x0576, B:194:0x0546, B:163:0x0441, B:165:0x044d, B:166:0x0453, B:168:0x0459, B:170:0x045f, B:171:0x046e, B:173:0x047a, B:131:0x035a, B:133:0x0366, B:137:0x0376, B:101:0x0249, B:103:0x0257, B:105:0x025d, B:106:0x0278, B:108:0x0288, B:111:0x0290, B:113:0x029b, B:89:0x01f6, B:91:0x0202, B:92:0x0206, B:93:0x020a), top: B:288:0x0195, inners: #4, #7, #8, #9, #10, #13, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x040d A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:72:0x0195, B:74:0x01a1, B:76:0x01b0, B:78:0x01c2, B:79:0x01c6, B:81:0x01cc, B:83:0x01d6, B:86:0x01de, B:88:0x01eb, B:95:0x0212, B:96:0x022b, B:97:0x0236, B:114:0x02b6, B:118:0x02d0, B:120:0x02e4, B:121:0x02fd, B:123:0x030c, B:124:0x031d, B:126:0x0329, B:128:0x0337, B:130:0x033f, B:139:0x0390, B:141:0x039f, B:142:0x03a5, B:144:0x03ab, B:146:0x03b3, B:148:0x03c1, B:151:0x03e5, B:149:0x03de, B:152:0x0401, B:154:0x040d, B:155:0x041b, B:156:0x0429, B:158:0x042f, B:160:0x0435, B:162:0x043d, B:174:0x0480, B:175:0x0487, B:177:0x048d, B:179:0x0499, B:181:0x04a1, B:183:0x04a8, B:185:0x04c0, B:186:0x04f0, B:188:0x04fe, B:190:0x052d, B:191:0x0531, B:193:0x053d, B:199:0x057c, B:200:0x0582, B:202:0x058e, B:203:0x059e, B:205:0x05a7, B:208:0x05e1, B:210:0x05e7, B:211:0x05ec, B:206:0x05cd, B:207:0x05d6, B:195:0x0561, B:197:0x056d, B:198:0x0576, B:194:0x0546, B:163:0x0441, B:165:0x044d, B:166:0x0453, B:168:0x0459, B:170:0x045f, B:171:0x046e, B:173:0x047a, B:131:0x035a, B:133:0x0366, B:137:0x0376, B:101:0x0249, B:103:0x0257, B:105:0x025d, B:106:0x0278, B:108:0x0288, B:111:0x0290, B:113:0x029b, B:89:0x01f6, B:91:0x0202, B:92:0x0206, B:93:0x020a), top: B:288:0x0195, inners: #4, #7, #8, #9, #10, #13, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x042f A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:72:0x0195, B:74:0x01a1, B:76:0x01b0, B:78:0x01c2, B:79:0x01c6, B:81:0x01cc, B:83:0x01d6, B:86:0x01de, B:88:0x01eb, B:95:0x0212, B:96:0x022b, B:97:0x0236, B:114:0x02b6, B:118:0x02d0, B:120:0x02e4, B:121:0x02fd, B:123:0x030c, B:124:0x031d, B:126:0x0329, B:128:0x0337, B:130:0x033f, B:139:0x0390, B:141:0x039f, B:142:0x03a5, B:144:0x03ab, B:146:0x03b3, B:148:0x03c1, B:151:0x03e5, B:149:0x03de, B:152:0x0401, B:154:0x040d, B:155:0x041b, B:156:0x0429, B:158:0x042f, B:160:0x0435, B:162:0x043d, B:174:0x0480, B:175:0x0487, B:177:0x048d, B:179:0x0499, B:181:0x04a1, B:183:0x04a8, B:185:0x04c0, B:186:0x04f0, B:188:0x04fe, B:190:0x052d, B:191:0x0531, B:193:0x053d, B:199:0x057c, B:200:0x0582, B:202:0x058e, B:203:0x059e, B:205:0x05a7, B:208:0x05e1, B:210:0x05e7, B:211:0x05ec, B:206:0x05cd, B:207:0x05d6, B:195:0x0561, B:197:0x056d, B:198:0x0576, B:194:0x0546, B:163:0x0441, B:165:0x044d, B:166:0x0453, B:168:0x0459, B:170:0x045f, B:171:0x046e, B:173:0x047a, B:131:0x035a, B:133:0x0366, B:137:0x0376, B:101:0x0249, B:103:0x0257, B:105:0x025d, B:106:0x0278, B:108:0x0288, B:111:0x0290, B:113:0x029b, B:89:0x01f6, B:91:0x0202, B:92:0x0206, B:93:0x020a), top: B:288:0x0195, inners: #4, #7, #8, #9, #10, #13, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0441 A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:72:0x0195, B:74:0x01a1, B:76:0x01b0, B:78:0x01c2, B:79:0x01c6, B:81:0x01cc, B:83:0x01d6, B:86:0x01de, B:88:0x01eb, B:95:0x0212, B:96:0x022b, B:97:0x0236, B:114:0x02b6, B:118:0x02d0, B:120:0x02e4, B:121:0x02fd, B:123:0x030c, B:124:0x031d, B:126:0x0329, B:128:0x0337, B:130:0x033f, B:139:0x0390, B:141:0x039f, B:142:0x03a5, B:144:0x03ab, B:146:0x03b3, B:148:0x03c1, B:151:0x03e5, B:149:0x03de, B:152:0x0401, B:154:0x040d, B:155:0x041b, B:156:0x0429, B:158:0x042f, B:160:0x0435, B:162:0x043d, B:174:0x0480, B:175:0x0487, B:177:0x048d, B:179:0x0499, B:181:0x04a1, B:183:0x04a8, B:185:0x04c0, B:186:0x04f0, B:188:0x04fe, B:190:0x052d, B:191:0x0531, B:193:0x053d, B:199:0x057c, B:200:0x0582, B:202:0x058e, B:203:0x059e, B:205:0x05a7, B:208:0x05e1, B:210:0x05e7, B:211:0x05ec, B:206:0x05cd, B:207:0x05d6, B:195:0x0561, B:197:0x056d, B:198:0x0576, B:194:0x0546, B:163:0x0441, B:165:0x044d, B:166:0x0453, B:168:0x0459, B:170:0x045f, B:171:0x046e, B:173:0x047a, B:131:0x035a, B:133:0x0366, B:137:0x0376, B:101:0x0249, B:103:0x0257, B:105:0x025d, B:106:0x0278, B:108:0x0288, B:111:0x0290, B:113:0x029b, B:89:0x01f6, B:91:0x0202, B:92:0x0206, B:93:0x020a), top: B:288:0x0195, inners: #4, #7, #8, #9, #10, #13, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x048d A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:72:0x0195, B:74:0x01a1, B:76:0x01b0, B:78:0x01c2, B:79:0x01c6, B:81:0x01cc, B:83:0x01d6, B:86:0x01de, B:88:0x01eb, B:95:0x0212, B:96:0x022b, B:97:0x0236, B:114:0x02b6, B:118:0x02d0, B:120:0x02e4, B:121:0x02fd, B:123:0x030c, B:124:0x031d, B:126:0x0329, B:128:0x0337, B:130:0x033f, B:139:0x0390, B:141:0x039f, B:142:0x03a5, B:144:0x03ab, B:146:0x03b3, B:148:0x03c1, B:151:0x03e5, B:149:0x03de, B:152:0x0401, B:154:0x040d, B:155:0x041b, B:156:0x0429, B:158:0x042f, B:160:0x0435, B:162:0x043d, B:174:0x0480, B:175:0x0487, B:177:0x048d, B:179:0x0499, B:181:0x04a1, B:183:0x04a8, B:185:0x04c0, B:186:0x04f0, B:188:0x04fe, B:190:0x052d, B:191:0x0531, B:193:0x053d, B:199:0x057c, B:200:0x0582, B:202:0x058e, B:203:0x059e, B:205:0x05a7, B:208:0x05e1, B:210:0x05e7, B:211:0x05ec, B:206:0x05cd, B:207:0x05d6, B:195:0x0561, B:197:0x056d, B:198:0x0576, B:194:0x0546, B:163:0x0441, B:165:0x044d, B:166:0x0453, B:168:0x0459, B:170:0x045f, B:171:0x046e, B:173:0x047a, B:131:0x035a, B:133:0x0366, B:137:0x0376, B:101:0x0249, B:103:0x0257, B:105:0x025d, B:106:0x0278, B:108:0x0288, B:111:0x0290, B:113:0x029b, B:89:0x01f6, B:91:0x0202, B:92:0x0206, B:93:0x020a), top: B:288:0x0195, inners: #4, #7, #8, #9, #10, #13, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04c0 A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:72:0x0195, B:74:0x01a1, B:76:0x01b0, B:78:0x01c2, B:79:0x01c6, B:81:0x01cc, B:83:0x01d6, B:86:0x01de, B:88:0x01eb, B:95:0x0212, B:96:0x022b, B:97:0x0236, B:114:0x02b6, B:118:0x02d0, B:120:0x02e4, B:121:0x02fd, B:123:0x030c, B:124:0x031d, B:126:0x0329, B:128:0x0337, B:130:0x033f, B:139:0x0390, B:141:0x039f, B:142:0x03a5, B:144:0x03ab, B:146:0x03b3, B:148:0x03c1, B:151:0x03e5, B:149:0x03de, B:152:0x0401, B:154:0x040d, B:155:0x041b, B:156:0x0429, B:158:0x042f, B:160:0x0435, B:162:0x043d, B:174:0x0480, B:175:0x0487, B:177:0x048d, B:179:0x0499, B:181:0x04a1, B:183:0x04a8, B:185:0x04c0, B:186:0x04f0, B:188:0x04fe, B:190:0x052d, B:191:0x0531, B:193:0x053d, B:199:0x057c, B:200:0x0582, B:202:0x058e, B:203:0x059e, B:205:0x05a7, B:208:0x05e1, B:210:0x05e7, B:211:0x05ec, B:206:0x05cd, B:207:0x05d6, B:195:0x0561, B:197:0x056d, B:198:0x0576, B:194:0x0546, B:163:0x0441, B:165:0x044d, B:166:0x0453, B:168:0x0459, B:170:0x045f, B:171:0x046e, B:173:0x047a, B:131:0x035a, B:133:0x0366, B:137:0x0376, B:101:0x0249, B:103:0x0257, B:105:0x025d, B:106:0x0278, B:108:0x0288, B:111:0x0290, B:113:0x029b, B:89:0x01f6, B:91:0x0202, B:92:0x0206, B:93:0x020a), top: B:288:0x0195, inners: #4, #7, #8, #9, #10, #13, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04fe A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:72:0x0195, B:74:0x01a1, B:76:0x01b0, B:78:0x01c2, B:79:0x01c6, B:81:0x01cc, B:83:0x01d6, B:86:0x01de, B:88:0x01eb, B:95:0x0212, B:96:0x022b, B:97:0x0236, B:114:0x02b6, B:118:0x02d0, B:120:0x02e4, B:121:0x02fd, B:123:0x030c, B:124:0x031d, B:126:0x0329, B:128:0x0337, B:130:0x033f, B:139:0x0390, B:141:0x039f, B:142:0x03a5, B:144:0x03ab, B:146:0x03b3, B:148:0x03c1, B:151:0x03e5, B:149:0x03de, B:152:0x0401, B:154:0x040d, B:155:0x041b, B:156:0x0429, B:158:0x042f, B:160:0x0435, B:162:0x043d, B:174:0x0480, B:175:0x0487, B:177:0x048d, B:179:0x0499, B:181:0x04a1, B:183:0x04a8, B:185:0x04c0, B:186:0x04f0, B:188:0x04fe, B:190:0x052d, B:191:0x0531, B:193:0x053d, B:199:0x057c, B:200:0x0582, B:202:0x058e, B:203:0x059e, B:205:0x05a7, B:208:0x05e1, B:210:0x05e7, B:211:0x05ec, B:206:0x05cd, B:207:0x05d6, B:195:0x0561, B:197:0x056d, B:198:0x0576, B:194:0x0546, B:163:0x0441, B:165:0x044d, B:166:0x0453, B:168:0x0459, B:170:0x045f, B:171:0x046e, B:173:0x047a, B:131:0x035a, B:133:0x0366, B:137:0x0376, B:101:0x0249, B:103:0x0257, B:105:0x025d, B:106:0x0278, B:108:0x0288, B:111:0x0290, B:113:0x029b, B:89:0x01f6, B:91:0x0202, B:92:0x0206, B:93:0x020a), top: B:288:0x0195, inners: #4, #7, #8, #9, #10, #13, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0561 A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:72:0x0195, B:74:0x01a1, B:76:0x01b0, B:78:0x01c2, B:79:0x01c6, B:81:0x01cc, B:83:0x01d6, B:86:0x01de, B:88:0x01eb, B:95:0x0212, B:96:0x022b, B:97:0x0236, B:114:0x02b6, B:118:0x02d0, B:120:0x02e4, B:121:0x02fd, B:123:0x030c, B:124:0x031d, B:126:0x0329, B:128:0x0337, B:130:0x033f, B:139:0x0390, B:141:0x039f, B:142:0x03a5, B:144:0x03ab, B:146:0x03b3, B:148:0x03c1, B:151:0x03e5, B:149:0x03de, B:152:0x0401, B:154:0x040d, B:155:0x041b, B:156:0x0429, B:158:0x042f, B:160:0x0435, B:162:0x043d, B:174:0x0480, B:175:0x0487, B:177:0x048d, B:179:0x0499, B:181:0x04a1, B:183:0x04a8, B:185:0x04c0, B:186:0x04f0, B:188:0x04fe, B:190:0x052d, B:191:0x0531, B:193:0x053d, B:199:0x057c, B:200:0x0582, B:202:0x058e, B:203:0x059e, B:205:0x05a7, B:208:0x05e1, B:210:0x05e7, B:211:0x05ec, B:206:0x05cd, B:207:0x05d6, B:195:0x0561, B:197:0x056d, B:198:0x0576, B:194:0x0546, B:163:0x0441, B:165:0x044d, B:166:0x0453, B:168:0x0459, B:170:0x045f, B:171:0x046e, B:173:0x047a, B:131:0x035a, B:133:0x0366, B:137:0x0376, B:101:0x0249, B:103:0x0257, B:105:0x025d, B:106:0x0278, B:108:0x0288, B:111:0x0290, B:113:0x029b, B:89:0x01f6, B:91:0x0202, B:92:0x0206, B:93:0x020a), top: B:288:0x0195, inners: #4, #7, #8, #9, #10, #13, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x058e A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:72:0x0195, B:74:0x01a1, B:76:0x01b0, B:78:0x01c2, B:79:0x01c6, B:81:0x01cc, B:83:0x01d6, B:86:0x01de, B:88:0x01eb, B:95:0x0212, B:96:0x022b, B:97:0x0236, B:114:0x02b6, B:118:0x02d0, B:120:0x02e4, B:121:0x02fd, B:123:0x030c, B:124:0x031d, B:126:0x0329, B:128:0x0337, B:130:0x033f, B:139:0x0390, B:141:0x039f, B:142:0x03a5, B:144:0x03ab, B:146:0x03b3, B:148:0x03c1, B:151:0x03e5, B:149:0x03de, B:152:0x0401, B:154:0x040d, B:155:0x041b, B:156:0x0429, B:158:0x042f, B:160:0x0435, B:162:0x043d, B:174:0x0480, B:175:0x0487, B:177:0x048d, B:179:0x0499, B:181:0x04a1, B:183:0x04a8, B:185:0x04c0, B:186:0x04f0, B:188:0x04fe, B:190:0x052d, B:191:0x0531, B:193:0x053d, B:199:0x057c, B:200:0x0582, B:202:0x058e, B:203:0x059e, B:205:0x05a7, B:208:0x05e1, B:210:0x05e7, B:211:0x05ec, B:206:0x05cd, B:207:0x05d6, B:195:0x0561, B:197:0x056d, B:198:0x0576, B:194:0x0546, B:163:0x0441, B:165:0x044d, B:166:0x0453, B:168:0x0459, B:170:0x045f, B:171:0x046e, B:173:0x047a, B:131:0x035a, B:133:0x0366, B:137:0x0376, B:101:0x0249, B:103:0x0257, B:105:0x025d, B:106:0x0278, B:108:0x0288, B:111:0x0290, B:113:0x029b, B:89:0x01f6, B:91:0x0202, B:92:0x0206, B:93:0x020a), top: B:288:0x0195, inners: #4, #7, #8, #9, #10, #13, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05e7 A[Catch: all -> 0x0602, TryCatch #1 {all -> 0x0602, blocks: (B:72:0x0195, B:74:0x01a1, B:76:0x01b0, B:78:0x01c2, B:79:0x01c6, B:81:0x01cc, B:83:0x01d6, B:86:0x01de, B:88:0x01eb, B:95:0x0212, B:96:0x022b, B:97:0x0236, B:114:0x02b6, B:118:0x02d0, B:120:0x02e4, B:121:0x02fd, B:123:0x030c, B:124:0x031d, B:126:0x0329, B:128:0x0337, B:130:0x033f, B:139:0x0390, B:141:0x039f, B:142:0x03a5, B:144:0x03ab, B:146:0x03b3, B:148:0x03c1, B:151:0x03e5, B:149:0x03de, B:152:0x0401, B:154:0x040d, B:155:0x041b, B:156:0x0429, B:158:0x042f, B:160:0x0435, B:162:0x043d, B:174:0x0480, B:175:0x0487, B:177:0x048d, B:179:0x0499, B:181:0x04a1, B:183:0x04a8, B:185:0x04c0, B:186:0x04f0, B:188:0x04fe, B:190:0x052d, B:191:0x0531, B:193:0x053d, B:199:0x057c, B:200:0x0582, B:202:0x058e, B:203:0x059e, B:205:0x05a7, B:208:0x05e1, B:210:0x05e7, B:211:0x05ec, B:206:0x05cd, B:207:0x05d6, B:195:0x0561, B:197:0x056d, B:198:0x0576, B:194:0x0546, B:163:0x0441, B:165:0x044d, B:166:0x0453, B:168:0x0459, B:170:0x045f, B:171:0x046e, B:173:0x047a, B:131:0x035a, B:133:0x0366, B:137:0x0376, B:101:0x0249, B:103:0x0257, B:105:0x025d, B:106:0x0278, B:108:0x0288, B:111:0x0290, B:113:0x029b, B:89:0x01f6, B:91:0x0202, B:92:0x0206, B:93:0x020a), top: B:288:0x0195, inners: #4, #7, #8, #9, #10, #13, #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0366 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x053d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016e  */
    @Override // X.CTB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(android.content.Intent r39) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 2012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.A04(android.content.Intent):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(android.content.Intent r5, java.lang.String r6) throws java.lang.NumberFormatException {
        /*
            android.os.Bundle r4 = X.BV6.A0N()
            java.lang.String r0 = "google.c.a.c_id"
            java.lang.String r1 = r5.getStringExtra(r0)
            if (r1 == 0) goto L11
            java.lang.String r0 = "_nmid"
            r4.putString(r0, r1)
        L11:
            java.lang.String r0 = "google.c.a.c_l"
            java.lang.String r1 = r5.getStringExtra(r0)
            if (r1 == 0) goto L1e
            java.lang.String r0 = "_nmn"
            r4.putString(r0, r1)
        L1e:
            java.lang.String r0 = "google.c.a.m_l"
            java.lang.String r1 = r5.getStringExtra(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L2f
            java.lang.String r0 = "label"
            r4.putString(r0, r1)
        L2f:
            java.lang.String r0 = "google.c.a.m_c"
            java.lang.String r1 = r5.getStringExtra(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L40
            java.lang.String r0 = "message_channel"
            r4.putString(r0, r1)
        L40:
            java.lang.String r0 = "from"
            java.lang.String r1 = r5.getStringExtra(r0)
            if (r1 == 0) goto L55
            java.lang.String r0 = "/topics/"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L55
            java.lang.String r0 = "_nt"
            r4.putString(r0, r1)
        L55:
            java.lang.String r1 = "google.c.a.ts"
            boolean r0 = r5.hasExtra(r1)
            java.lang.String r3 = "FirebaseMessaging"
            if (r0 == 0) goto L73
            java.lang.String r0 = r5.getStringExtra(r1)     // Catch: java.lang.NumberFormatException -> L6d
            java.lang.String r1 = "_nmt"
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L6d
            r4.putInt(r1, r0)     // Catch: java.lang.NumberFormatException -> L6d
            goto L73
        L6d:
            r1 = move-exception
            java.lang.String r0 = "Error while parsing timestamp in GCM event"
            android.util.Log.w(r3, r0, r1)
        L73:
            java.lang.String r1 = "google.c.a.udt"
            boolean r0 = r5.hasExtra(r1)
            if (r0 == 0) goto L8f
            java.lang.String r0 = r5.getStringExtra(r1)     // Catch: java.lang.NumberFormatException -> L89
            java.lang.String r1 = "_ndt"
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L89
            r4.putInt(r1, r0)     // Catch: java.lang.NumberFormatException -> L89
            goto L8f
        L89:
            r1 = move-exception
            java.lang.String r0 = "Error while parsing use_device_time in GCM event"
            android.util.Log.w(r3, r0, r1)
        L8f:
            java.lang.String r0 = "_nr"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L9f
            java.lang.String r0 = "_nf"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lc6
        L9f:
            android.os.Bundle r0 = r5.getExtras()
            if (r0 == 0) goto Lfb
            android.os.Bundle r2 = r5.getExtras()
            java.lang.String r0 = "gcm.n.e"
            java.lang.String r1 = X.C3549CTj.A02(r2, r0)
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lbf
            java.lang.String r0 = "gcm.n.icon"
            java.lang.String r0 = X.C3549CTj.A02(r2, r0)
            if (r0 == 0) goto Lfb
        Lbf:
            java.lang.String r1 = "display"
        Lc1:
            java.lang.String r0 = "_nmc"
            r4.putString(r0, r1)
        Lc6:
            boolean r0 = X.BV4.A1U(r3)
            if (r0 == 0) goto Le7
            java.lang.String r2 = java.lang.String.valueOf(r4)
            int r0 = X.BV5.A04(r6)
            int r0 = r0 + 22
            java.lang.StringBuilder r1 = X.BV5.A0r(r2, r0)
            java.lang.String r0 = "Sending event="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " params="
            X.BV8.A1P(r1, r0, r2, r3)
        Le7:
            X.CTr r0 = X.C3554CTr.A00()
            java.lang.Class<X.CTo> r1 = X.InterfaceC3552CTo.class
            X.C3554CTr.A01(r0)
            X.CUO r0 = r0.A02
            r0.A02(r1)
            java.lang.String r0 = "Unable to log event: analytics library is missing"
            android.util.Log.w(r3, r0)
            return
        Lfb:
            java.lang.String r1 = "data"
            goto Lc1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.A01(android.content.Intent, java.lang.String):void");
    }
}
