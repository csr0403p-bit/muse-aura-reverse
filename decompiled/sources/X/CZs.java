package X;

import android.content.Context;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class CZs {
    public Context A00;
    public CZr A01;
    public CZl A02;
    public String A03;
    public HashMap<String, String> A05 = BV4.A0u();
    public HashMap<String, ArrayList<String>> A04 = BV4.A0u();

    /* JADX WARN: Can't wrap try/catch for region: R(35:0|2|(4:4|(2:7|5)|185|8)|9|(4:11|(2:14|12)|186|15)|16|(2:18|(1:20))|21|(1:23)(11:70|(1:72)(1:93)|73|(1:75)(1:92)|76|77|79|(1:81)(1:88)|82|83|85)|24|(1:26)(7:57|(1:59)(1:69)|60|(1:62)(1:68)|63|(1:65)(1:67)|66)|27|(1:29)(28:38|(1:40)(1:55)|41|(1:43)(1:54)|44|(1:46)(1:53)|47|(4:49|(2:52|50)|187|56)|31|(4:37|175|94|(3:96|(6:98|(1:100)|101|(1:103)|104|(1:106))|108))|109|(4:179|111|112|(3:118|(1:128)(1:122)|123))|124|(2:171|129)|130|(4:132|183|(1:134)(1:135)|(1:137))|181|138|(2:173|140)|141|142|169|143|(1:145)|146|177|147|(4:149|(2:153|(1:155))|161|162)(1:188))|30|31|(6:33|35|37|175|94|(0))|109|(0)|124|(2:171|129)|130|(0)|181|138|(0)|141|142|169|143|(0)|146|177|147|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:189:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0377 A[Catch: all -> 0x0382, TRY_LEAVE, TryCatch #0 {all -> 0x0382, blocks: (B:143:0x036f, B:145:0x0377), top: B:169:0x036f }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03ac A[Catch: all -> 0x03fd, SecurityException | JSONException -> 0x0404, TryCatch #4 {SecurityException | JSONException -> 0x0404, blocks: (B:147:0x039f, B:149:0x03ac, B:151:0x03b2, B:153:0x03b8, B:155:0x03c3), top: B:177:0x039f }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x035f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0275 A[Catch: SecurityException -> 0x02a8, all -> 0x03fd, TryCatch #3 {SecurityException -> 0x02a8, blocks: (B:94:0x026a, B:96:0x0275, B:98:0x027b, B:100:0x0283, B:101:0x0289, B:103:0x028f, B:104:0x0298, B:106:0x029e), top: B:175:0x026a }] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CZs(android.content.Context r16) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CZs.<init>(android.content.Context):void");
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "FACEBOOK_PRELOAD_PROGRAM";
            case 2:
                return "DEPRECATED_FACEBOOK_DEVICE_OWNER";
            case 3:
                return "OCULUS";
            case 4:
                return "TRITIUM";
            default:
                return HatchPersistedMessageJson.UNSEND_STATUS_NONE;
        }
    }
}
