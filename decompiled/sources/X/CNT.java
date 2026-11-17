package X;

import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public abstract class CNT {
    public static void A00(final CNL cnl, final CNH cnh, C3620CZj c3620CZj, final Integer num) throws PackageManager.NameNotFoundException {
        BZJ bzj;
        CZx cZx;
        if (c3620CZj == null) {
            bzj = BZJ.UNKNOWN;
        } else {
            CZl cZlA01 = c3620CZj.A01();
            if (!cZlA01.A06) {
                bzj = BZJ.NOT_PRELOADED;
            } else if (!cZlA01.A05 && ((cZx = cZlA01.A00) == null || !cZx.A05)) {
                bzj = BZJ.AM_DISABLED;
            } else {
                if (c3620CZj.A02(27)) {
                    final CNS cns = cnh.A04;
                    final Runnable runnable = new Runnable() { // from class: X.CNF
                        public static final String __redex_internal_original_name = "InstallReferrerSession$$ExternalSyntheticLambda0";

                        /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(Ljava/lang/Class<+TT;>;Landroid/os/Bundle;Ljava/lang/String;)TT; */
                        public static Long A00(Bundle bundle, String str) {
                            if (!bundle.containsKey(str)) {
                                throw C3cG.A0Q(String.format(null, "key %s is missing but required", str));
                            }
                            Object obj = bundle.get(str);
                            if (!(obj instanceof Long)) {
                                throw C3cG.A0Q(String.format(null, "value for required key %s is not of type $s", str, Long.class.getSimpleName()));
                            }
                            Long l = (Long) obj;
                            if (l != null) {
                                return l;
                            }
                            throw C3cG.A0Q(String.format(null, "value for required key %s is null", str));
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:42:0x010f, code lost:
                        
                            if (r6 != r2) goto L44;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:103:0x020d A[Catch: Exception -> 0x0245, OxInstallSdkException -> 0x024e, IllegalArgumentException | UnsupportedOperationException -> 0x0250, IllegalArgumentException | UnsupportedOperationException -> 0x0250, IllegalStateException -> 0x0259, OxInstallSdkException -> 0x0262, TryCatch #5 {IllegalArgumentException | UnsupportedOperationException -> 0x0250, blocks: (B:4:0x000e, B:6:0x0022, B:8:0x002a, B:10:0x003f, B:11:0x0045, B:24:0x0060, B:25:0x0063, B:27:0x0072, B:28:0x0099, B:29:0x00a5, B:48:0x011c, B:48:0x011c, B:61:0x0150, B:61:0x0150, B:63:0x0154, B:63:0x0154, B:65:0x015c, B:65:0x015c, B:66:0x015e, B:66:0x015e, B:68:0x0171, B:68:0x0171, B:69:0x0179, B:69:0x0179, B:71:0x017f, B:71:0x017f, B:73:0x018b, B:73:0x018b, B:74:0x0197, B:74:0x0197, B:75:0x019b, B:75:0x019b, B:77:0x01ac, B:77:0x01ac, B:79:0x01b2, B:79:0x01b2, B:81:0x01b6, B:81:0x01b6, B:83:0x01c2, B:83:0x01c2, B:85:0x01d2, B:85:0x01d2, B:87:0x01d8, B:87:0x01d8, B:88:0x01dc, B:88:0x01dc, B:107:0x021d, B:107:0x021d, B:109:0x0223, B:109:0x0223, B:92:0x01ee, B:92:0x01ee, B:101:0x0207, B:101:0x0207, B:103:0x020d, B:103:0x020d, B:89:0x01df, B:89:0x01df, B:91:0x01e7, B:91:0x01e7, B:110:0x022b, B:110:0x022b, B:111:0x0233, B:111:0x0233, B:113:0x0244, B:113:0x0244, B:60:0x0145, B:60:0x0145, B:59:0x0142, B:59:0x0142, B:112:0x023b, B:112:0x023b), top: B:138:0x000e, outer: #6 }] */
                        /* JADX WARN: Removed duplicated region for block: B:109:0x0223 A[Catch: Exception -> 0x0245, OxInstallSdkException -> 0x024e, IllegalArgumentException | UnsupportedOperationException -> 0x0250, IllegalArgumentException | UnsupportedOperationException -> 0x0250, IllegalStateException -> 0x0259, OxInstallSdkException -> 0x0262, TryCatch #5 {IllegalArgumentException | UnsupportedOperationException -> 0x0250, blocks: (B:4:0x000e, B:6:0x0022, B:8:0x002a, B:10:0x003f, B:11:0x0045, B:24:0x0060, B:25:0x0063, B:27:0x0072, B:28:0x0099, B:29:0x00a5, B:48:0x011c, B:48:0x011c, B:61:0x0150, B:61:0x0150, B:63:0x0154, B:63:0x0154, B:65:0x015c, B:65:0x015c, B:66:0x015e, B:66:0x015e, B:68:0x0171, B:68:0x0171, B:69:0x0179, B:69:0x0179, B:71:0x017f, B:71:0x017f, B:73:0x018b, B:73:0x018b, B:74:0x0197, B:74:0x0197, B:75:0x019b, B:75:0x019b, B:77:0x01ac, B:77:0x01ac, B:79:0x01b2, B:79:0x01b2, B:81:0x01b6, B:81:0x01b6, B:83:0x01c2, B:83:0x01c2, B:85:0x01d2, B:85:0x01d2, B:87:0x01d8, B:87:0x01d8, B:88:0x01dc, B:88:0x01dc, B:107:0x021d, B:107:0x021d, B:109:0x0223, B:109:0x0223, B:92:0x01ee, B:92:0x01ee, B:101:0x0207, B:101:0x0207, B:103:0x020d, B:103:0x020d, B:89:0x01df, B:89:0x01df, B:91:0x01e7, B:91:0x01e7, B:110:0x022b, B:110:0x022b, B:111:0x0233, B:111:0x0233, B:113:0x0244, B:113:0x0244, B:60:0x0145, B:60:0x0145, B:59:0x0142, B:59:0x0142, B:112:0x023b, B:112:0x023b), top: B:138:0x000e, outer: #6 }] */
                        /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:27:0x0072 A[Catch: Exception -> 0x0245, OxInstallSdkException -> 0x024e, IllegalArgumentException | UnsupportedOperationException -> 0x0250, IllegalStateException -> 0x0259, OxInstallSdkException -> 0x0262, TryCatch #5 {IllegalArgumentException | UnsupportedOperationException -> 0x0250, blocks: (B:4:0x000e, B:6:0x0022, B:8:0x002a, B:10:0x003f, B:11:0x0045, B:24:0x0060, B:25:0x0063, B:27:0x0072, B:28:0x0099, B:29:0x00a5, B:48:0x011c, B:48:0x011c, B:61:0x0150, B:61:0x0150, B:63:0x0154, B:63:0x0154, B:65:0x015c, B:65:0x015c, B:66:0x015e, B:66:0x015e, B:68:0x0171, B:68:0x0171, B:69:0x0179, B:69:0x0179, B:71:0x017f, B:71:0x017f, B:73:0x018b, B:73:0x018b, B:74:0x0197, B:74:0x0197, B:75:0x019b, B:75:0x019b, B:77:0x01ac, B:77:0x01ac, B:79:0x01b2, B:79:0x01b2, B:81:0x01b6, B:81:0x01b6, B:83:0x01c2, B:83:0x01c2, B:85:0x01d2, B:85:0x01d2, B:87:0x01d8, B:87:0x01d8, B:88:0x01dc, B:88:0x01dc, B:107:0x021d, B:107:0x021d, B:109:0x0223, B:109:0x0223, B:92:0x01ee, B:92:0x01ee, B:101:0x0207, B:101:0x0207, B:103:0x020d, B:103:0x020d, B:89:0x01df, B:89:0x01df, B:91:0x01e7, B:91:0x01e7, B:110:0x022b, B:110:0x022b, B:111:0x0233, B:111:0x0233, B:113:0x0244, B:113:0x0244, B:60:0x0145, B:60:0x0145, B:59:0x0142, B:59:0x0142, B:112:0x023b, B:112:0x023b), top: B:138:0x000e, outer: #6 }] */
                        /* JADX WARN: Removed duplicated region for block: B:29:0x00a5 A[Catch: Exception -> 0x0245, OxInstallSdkException -> 0x024e, IllegalArgumentException | UnsupportedOperationException -> 0x0250, IllegalStateException -> 0x0259, OxInstallSdkException -> 0x0262, TRY_LEAVE, TryCatch #5 {IllegalArgumentException | UnsupportedOperationException -> 0x0250, blocks: (B:4:0x000e, B:6:0x0022, B:8:0x002a, B:10:0x003f, B:11:0x0045, B:24:0x0060, B:25:0x0063, B:27:0x0072, B:28:0x0099, B:29:0x00a5, B:48:0x011c, B:48:0x011c, B:61:0x0150, B:61:0x0150, B:63:0x0154, B:63:0x0154, B:65:0x015c, B:65:0x015c, B:66:0x015e, B:66:0x015e, B:68:0x0171, B:68:0x0171, B:69:0x0179, B:69:0x0179, B:71:0x017f, B:71:0x017f, B:73:0x018b, B:73:0x018b, B:74:0x0197, B:74:0x0197, B:75:0x019b, B:75:0x019b, B:77:0x01ac, B:77:0x01ac, B:79:0x01b2, B:79:0x01b2, B:81:0x01b6, B:81:0x01b6, B:83:0x01c2, B:83:0x01c2, B:85:0x01d2, B:85:0x01d2, B:87:0x01d8, B:87:0x01d8, B:88:0x01dc, B:88:0x01dc, B:107:0x021d, B:107:0x021d, B:109:0x0223, B:109:0x0223, B:92:0x01ee, B:92:0x01ee, B:101:0x0207, B:101:0x0207, B:103:0x020d, B:103:0x020d, B:89:0x01df, B:89:0x01df, B:91:0x01e7, B:91:0x01e7, B:110:0x022b, B:110:0x022b, B:111:0x0233, B:111:0x0233, B:113:0x0244, B:113:0x0244, B:60:0x0145, B:60:0x0145, B:59:0x0142, B:59:0x0142, B:112:0x023b, B:112:0x023b), top: B:138:0x000e, outer: #6 }] */
                        /* JADX WARN: Removed duplicated region for block: B:32:0x00f2 A[Catch: OxInstallSdkException -> 0x0262, TryCatch #6 {OxInstallSdkException -> 0x0262, blocks: (B:3:0x0008, B:4:0x000e, B:6:0x0022, B:8:0x002a, B:10:0x003f, B:11:0x0045, B:24:0x0060, B:25:0x0063, B:27:0x0072, B:28:0x0099, B:30:0x00eb, B:32:0x00f2, B:34:0x00f8, B:35:0x00fa, B:37:0x0100, B:39:0x0108, B:44:0x0112, B:46:0x0118, B:29:0x00a5, B:48:0x011c, B:61:0x0150, B:63:0x0154, B:65:0x015c, B:66:0x015e, B:68:0x0171, B:69:0x0179, B:71:0x017f, B:73:0x018b, B:74:0x0197, B:75:0x019b, B:77:0x01ac, B:79:0x01b2, B:81:0x01b6, B:83:0x01c2, B:85:0x01d2, B:87:0x01d8, B:88:0x01dc, B:107:0x021d, B:109:0x0223, B:92:0x01ee, B:101:0x0207, B:103:0x020d, B:89:0x01df, B:91:0x01e7, B:110:0x022b, B:111:0x0233, B:113:0x0244, B:60:0x0145, B:59:0x0142, B:112:0x023b, B:115:0x0246, B:122:0x0261, B:117:0x024f, B:119:0x0251, B:121:0x025a), top: B:139:0x0008, inners: #5, #7 }] */
                        /* JADX WARN: Removed duplicated region for block: B:68:0x0171 A[Catch: Exception -> 0x0245, OxInstallSdkException -> 0x024e, IllegalArgumentException | UnsupportedOperationException -> 0x0250, IllegalArgumentException | UnsupportedOperationException -> 0x0250, IllegalStateException -> 0x0259, OxInstallSdkException -> 0x0262, TryCatch #5 {IllegalArgumentException | UnsupportedOperationException -> 0x0250, blocks: (B:4:0x000e, B:6:0x0022, B:8:0x002a, B:10:0x003f, B:11:0x0045, B:24:0x0060, B:25:0x0063, B:27:0x0072, B:28:0x0099, B:29:0x00a5, B:48:0x011c, B:48:0x011c, B:61:0x0150, B:61:0x0150, B:63:0x0154, B:63:0x0154, B:65:0x015c, B:65:0x015c, B:66:0x015e, B:66:0x015e, B:68:0x0171, B:68:0x0171, B:69:0x0179, B:69:0x0179, B:71:0x017f, B:71:0x017f, B:73:0x018b, B:73:0x018b, B:74:0x0197, B:74:0x0197, B:75:0x019b, B:75:0x019b, B:77:0x01ac, B:77:0x01ac, B:79:0x01b2, B:79:0x01b2, B:81:0x01b6, B:81:0x01b6, B:83:0x01c2, B:83:0x01c2, B:85:0x01d2, B:85:0x01d2, B:87:0x01d8, B:87:0x01d8, B:88:0x01dc, B:88:0x01dc, B:107:0x021d, B:107:0x021d, B:109:0x0223, B:109:0x0223, B:92:0x01ee, B:92:0x01ee, B:101:0x0207, B:101:0x0207, B:103:0x020d, B:103:0x020d, B:89:0x01df, B:89:0x01df, B:91:0x01e7, B:91:0x01e7, B:110:0x022b, B:110:0x022b, B:111:0x0233, B:111:0x0233, B:113:0x0244, B:113:0x0244, B:60:0x0145, B:60:0x0145, B:59:0x0142, B:59:0x0142, B:112:0x023b, B:112:0x023b), top: B:138:0x000e, outer: #6 }] */
                        /* JADX WARN: Removed duplicated region for block: B:77:0x01ac A[Catch: Exception -> 0x0245, OxInstallSdkException -> 0x024e, IllegalArgumentException | UnsupportedOperationException -> 0x0250, IllegalArgumentException | UnsupportedOperationException -> 0x0250, IllegalStateException -> 0x0259, OxInstallSdkException -> 0x0262, TryCatch #5 {IllegalArgumentException | UnsupportedOperationException -> 0x0250, blocks: (B:4:0x000e, B:6:0x0022, B:8:0x002a, B:10:0x003f, B:11:0x0045, B:24:0x0060, B:25:0x0063, B:27:0x0072, B:28:0x0099, B:29:0x00a5, B:48:0x011c, B:48:0x011c, B:61:0x0150, B:61:0x0150, B:63:0x0154, B:63:0x0154, B:65:0x015c, B:65:0x015c, B:66:0x015e, B:66:0x015e, B:68:0x0171, B:68:0x0171, B:69:0x0179, B:69:0x0179, B:71:0x017f, B:71:0x017f, B:73:0x018b, B:73:0x018b, B:74:0x0197, B:74:0x0197, B:75:0x019b, B:75:0x019b, B:77:0x01ac, B:77:0x01ac, B:79:0x01b2, B:79:0x01b2, B:81:0x01b6, B:81:0x01b6, B:83:0x01c2, B:83:0x01c2, B:85:0x01d2, B:85:0x01d2, B:87:0x01d8, B:87:0x01d8, B:88:0x01dc, B:88:0x01dc, B:107:0x021d, B:107:0x021d, B:109:0x0223, B:109:0x0223, B:92:0x01ee, B:92:0x01ee, B:101:0x0207, B:101:0x0207, B:103:0x020d, B:103:0x020d, B:89:0x01df, B:89:0x01df, B:91:0x01e7, B:91:0x01e7, B:110:0x022b, B:110:0x022b, B:111:0x0233, B:111:0x0233, B:113:0x0244, B:113:0x0244, B:60:0x0145, B:60:0x0145, B:59:0x0142, B:59:0x0142, B:112:0x023b, B:112:0x023b), top: B:138:0x000e, outer: #6 }] */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void run() throws java.lang.Throwable {
                            /*
                                Method dump skipped, instructions count: 710
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.CNF.run():void");
                        }
                    };
                    try {
                        ScheduledExecutorService scheduledExecutorService = cns.A01;
                        if (scheduledExecutorService.isShutdown()) {
                            return;
                        }
                        scheduledExecutorService.submit(new Runnable() { // from class: X.CNU
                            public static final String __redex_internal_original_name = "ExecutorManager$$ExternalSyntheticLambda0";

                            @Override // java.lang.Runnable
                            public final void run() {
                                CNS cns2 = cns;
                                try {
                                    runnable.run();
                                } catch (Throwable th) {
                                    cns2.A00.softReport("OxygenInstallSDK_UNEXPECTED_THREAD_EXCEPTION", th);
                                }
                            }
                        });
                        return;
                    } catch (Throwable th) {
                        cns.A00.softReport("OxygenInstallSDK_UNEXPECTED_THREAD_EXCEPTION", th);
                        return;
                    }
                }
                bzj = BZJ.FEATURE_NOT_SUPPORTED;
            }
        }
        cnl.onError(bzj);
    }
}
