package X;

import android.os.SystemClock;
import com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate;
import java.util.Deque;

/* loaded from: classes5.dex */
public final class DXM {
    public boolean A01;
    public final E7C A02;
    public final Deque<DXP> A03 = BV4.A0y();
    public final Deque<DXQ> A04 = BV4.A0y();
    public VideoBandwidthEstimate A00 = new VideoBandwidthEstimate();

    /* JADX WARN: Removed duplicated region for block: B:149:0x03c4 A[Catch: all -> 0x05b8, TryCatch #1 {, blocks: (B:15:0x002f, B:16:0x003a, B:18:0x0040, B:20:0x0048, B:22:0x0052, B:24:0x0058, B:27:0x0068, B:29:0x0071, B:31:0x0079, B:40:0x0095, B:41:0x00a1, B:42:0x00aa, B:44:0x00b0, B:46:0x00b8, B:48:0x00c2, B:50:0x00c8, B:53:0x00d8, B:55:0x00e1, B:57:0x00e7, B:63:0x00f9, B:64:0x0104, B:66:0x0110, B:68:0x0125, B:69:0x0136, B:71:0x013c, B:72:0x0150, B:74:0x0156, B:75:0x015e, B:78:0x016d, B:79:0x0187, B:81:0x018d, B:82:0x019e, B:84:0x01a4, B:85:0x01ae, B:145:0x037e, B:146:0x03ae, B:88:0x01ba, B:213:0x051c, B:212:0x0518, B:54:0x00dd, B:28:0x006d, B:91:0x01c8, B:93:0x01da, B:94:0x01e2, B:96:0x01e8, B:98:0x01fe, B:99:0x020a, B:101:0x0217, B:107:0x0237, B:108:0x0245, B:111:0x0270, B:112:0x0276, B:114:0x027c, B:116:0x0290, B:117:0x0299, B:119:0x029f, B:125:0x02bd, B:126:0x02cb, B:129:0x02f1, B:135:0x0302, B:136:0x0308, B:137:0x030f, B:139:0x0315, B:140:0x032c, B:141:0x0331, B:143:0x0337, B:144:0x034f, B:147:0x03b2, B:149:0x03c4, B:154:0x03d2, B:155:0x03d8, B:157:0x03de, B:162:0x03f7, B:163:0x03fd, B:164:0x040a, B:166:0x0417, B:168:0x0426, B:171:0x042e, B:178:0x0441, B:179:0x044c, B:180:0x046d, B:173:0x0435, B:181:0x0473, B:183:0x047b, B:184:0x0481, B:186:0x0487, B:191:0x04a0, B:192:0x04a6, B:193:0x04b0, B:195:0x04b6, B:197:0x04c5, B:200:0x04cd, B:208:0x04e5, B:209:0x04f0, B:210:0x050e, B:202:0x04d4, B:211:0x0513, B:214:0x051d, B:215:0x0533, B:217:0x0539, B:218:0x0555, B:219:0x055d, B:221:0x0563, B:222:0x057e), top: B:235:0x0027, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05ba A[Catch: all -> 0x05c7, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:7:0x000e, B:9:0x001a, B:13:0x0029, B:228:0x05c1, B:89:0x01c0, B:226:0x05b9, B:227:0x05ba, B:15:0x002f, B:16:0x003a, B:18:0x0040, B:20:0x0048, B:22:0x0052, B:24:0x0058, B:27:0x0068, B:29:0x0071, B:31:0x0079, B:40:0x0095, B:41:0x00a1, B:42:0x00aa, B:44:0x00b0, B:46:0x00b8, B:48:0x00c2, B:50:0x00c8, B:53:0x00d8, B:55:0x00e1, B:57:0x00e7, B:63:0x00f9, B:64:0x0104, B:66:0x0110, B:68:0x0125, B:69:0x0136, B:71:0x013c, B:72:0x0150, B:74:0x0156, B:75:0x015e, B:78:0x016d, B:79:0x0187, B:81:0x018d, B:82:0x019e, B:84:0x01a4, B:85:0x01ae, B:145:0x037e, B:146:0x03ae, B:88:0x01ba, B:213:0x051c, B:212:0x0518, B:54:0x00dd, B:28:0x006d, B:91:0x01c8, B:93:0x01da, B:94:0x01e2, B:96:0x01e8, B:98:0x01fe, B:99:0x020a, B:101:0x0217, B:107:0x0237, B:108:0x0245, B:111:0x0270, B:112:0x0276, B:114:0x027c, B:116:0x0290, B:117:0x0299, B:119:0x029f, B:125:0x02bd, B:126:0x02cb, B:129:0x02f1, B:135:0x0302, B:136:0x0308, B:137:0x030f, B:139:0x0315, B:140:0x032c, B:141:0x0331, B:143:0x0337, B:144:0x034f, B:147:0x03b2, B:149:0x03c4, B:154:0x03d2, B:155:0x03d8, B:157:0x03de, B:162:0x03f7, B:163:0x03fd, B:164:0x040a, B:166:0x0417, B:168:0x0426, B:171:0x042e, B:178:0x0441, B:179:0x044c, B:180:0x046d, B:173:0x0435, B:181:0x0473, B:183:0x047b, B:184:0x0481, B:186:0x0487, B:191:0x04a0, B:192:0x04a6, B:193:0x04b0, B:195:0x04b6, B:197:0x04c5, B:200:0x04cd, B:208:0x04e5, B:209:0x04f0, B:210:0x050e, B:202:0x04d4, B:211:0x0513, B:214:0x051d, B:215:0x0533, B:217:0x0539, B:218:0x0555, B:219:0x055d, B:221:0x0563, B:222:0x057e), top: B:234:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate A01(com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r39) {
        /*
            Method dump skipped, instructions count: 1482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DXM.A01(com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration):com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate");
    }

    public DXM(E7C e7c) {
        this.A02 = e7c;
    }

    public static final void A00(DXM dxm) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Deque<DXP> deque = dxm.A03;
            if (deque.size() <= 10 || jElapsedRealtime - ((DXO) deque.getFirst()).A00 <= 20000) {
                break;
            }
            deque.removeFirst();
            dxm.A01 = true;
        }
        while (true) {
            Deque<DXQ> deque2 = dxm.A04;
            if (deque2.size() <= 10 || jElapsedRealtime - ((DXO) deque2.getFirst()).A00 <= 20000) {
                return;
            }
            deque2.removeFirst();
            dxm.A01 = true;
        }
    }
}
