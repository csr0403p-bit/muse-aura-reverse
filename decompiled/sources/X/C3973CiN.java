package X;

import android.content.Context;
import com.facebook.perf.background.BackgroundStartupDetector;
import com.facebook.pushlite.model.PushInfraMetaData;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import java.util.UUID;

/* renamed from: X.CiN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3973CiN {
    public final Context A00;
    public final C8ee<?> A01;
    public final InterfaceC7539F0o A02;
    public final C3966CiB A03;
    public final F0G A04;
    public final QuickPerformanceLogger A05;

    public /* synthetic */ C3973CiN(Context context, C8ee c8ee, C3966CiB c3966CiB, F0G f0g) {
        C9u c9u = C9u.A00;
        AnonymousClass003.A0w(c3966CiB, context);
        this.A03 = c3966CiB;
        this.A04 = f0g;
        this.A01 = c8ee;
        this.A00 = context;
        this.A02 = c9u;
        this.A05 = QuickPerformanceLoggerProvider.getQPLInstance();
    }

    public static final int A00(PushInfraMetaData pushInfraMetaData, Integer num) {
        if (num != null) {
            return num.intValue();
        }
        if (pushInfraMetaData == null) {
            return (int) System.nanoTime();
        }
        String str = pushInfraMetaData.A0G;
        if (str == null) {
            return pushInfraMetaData.hashCode();
        }
        try {
            return UUID.fromString(str).hashCode();
        } catch (IllegalArgumentException unused) {
            CFK.A0H("PushProcessor", "Malformed pjid, falling back to hashCode: %s", str);
            return pushInfraMetaData.hashCode();
        }
    }

    public static final MarkerEditor A01(C3973CiN c3973CiN, PushInfraMetaData pushInfraMetaData, Integer num) {
        QuickPerformanceLogger quickPerformanceLogger = c3973CiN.A05;
        if (quickPerformanceLogger != null) {
            return quickPerformanceLogger.withMarker(875309620, A00(pushInfraMetaData, num));
        }
        return null;
    }

    public static final void A02(C3973CiN c3973CiN, PushInfraMetaData pushInfraMetaData, Integer num) {
        QuickPerformanceLogger quickPerformanceLogger = c3973CiN.A05;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerAnnotate(875309620, A00(pushInfraMetaData, num), "is_background", AnonymousClass001.A0i().equals(BackgroundStartupDetector.isBackgroundState));
        }
    }

    public static final void A04(C3973CiN c3973CiN, PushInfraMetaData pushInfraMetaData, Integer num) {
        QuickPerformanceLogger quickPerformanceLogger = c3973CiN.A05;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerEnd(875309620, A00(pushInfraMetaData, num), (short) 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x0413 A[Catch: JSONException -> 0x0435, all -> 0x0474, TRY_LEAVE, TryCatch #7 {JSONException -> 0x0435, blocks: (B:69:0x01c4, B:71:0x01d0, B:73:0x01d6, B:75:0x01e2, B:76:0x01f2, B:78:0x020a, B:80:0x0218, B:81:0x021f, B:82:0x0220, B:84:0x024d, B:86:0x028d, B:88:0x0296, B:89:0x029d, B:90:0x02a1, B:93:0x02e0, B:97:0x02ee, B:98:0x02f2, B:92:0x02d9, B:100:0x02f4, B:187:0x0403, B:114:0x031e, B:115:0x0324, B:116:0x0325, B:120:0x0333, B:121:0x0337, B:123:0x0339, B:127:0x034a, B:128:0x034e, B:129:0x034f, B:130:0x0374, B:133:0x037d, B:134:0x037e, B:138:0x038c, B:139:0x0390, B:163:0x03c6, B:164:0x03c7, B:165:0x03cf, B:167:0x03d8, B:168:0x03d9, B:170:0x03dd, B:173:0x03e9, B:174:0x03f3, B:186:0x0402, B:188:0x0409, B:190:0x0413), top: B:229:0x01c4, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0422 A[Catch: all -> 0x0474, TryCatch #8 {all -> 0x0474, blocks: (B:3:0x000c, B:5:0x0016, B:6:0x004a, B:7:0x0053, B:9:0x0059, B:11:0x0065, B:13:0x006d, B:14:0x007a, B:16:0x0084, B:18:0x008a, B:19:0x0097, B:21:0x009d, B:22:0x00a0, B:24:0x00a6, B:30:0x010f, B:31:0x0116, B:33:0x011c, B:34:0x0121, B:36:0x0127, B:37:0x0130, B:39:0x0136, B:40:0x0140, B:42:0x0146, B:43:0x014f, B:45:0x0155, B:46:0x015a, B:48:0x0161, B:51:0x0170, B:52:0x0190, B:25:0x00ca, B:27:0x00d2, B:57:0x01a0, B:59:0x01ae, B:60:0x01b2, B:62:0x01b6, B:63:0x01b9, B:65:0x01bd, B:69:0x01c4, B:71:0x01d0, B:73:0x01d6, B:75:0x01e2, B:76:0x01f2, B:78:0x020a, B:80:0x0218, B:81:0x021f, B:82:0x0220, B:84:0x024d, B:86:0x028d, B:88:0x0296, B:89:0x029d, B:90:0x02a1, B:93:0x02e0, B:97:0x02ee, B:98:0x02f2, B:92:0x02d9, B:100:0x02f4, B:187:0x0403, B:114:0x031e, B:115:0x0324, B:116:0x0325, B:120:0x0333, B:121:0x0337, B:123:0x0339, B:127:0x034a, B:128:0x034e, B:129:0x034f, B:130:0x0374, B:133:0x037d, B:134:0x037e, B:138:0x038c, B:139:0x0390, B:191:0x041a, B:193:0x0422, B:194:0x0429, B:196:0x042f, B:206:0x0458, B:208:0x045e, B:209:0x0463, B:211:0x0467, B:163:0x03c6, B:164:0x03c7, B:165:0x03cf, B:167:0x03d8, B:168:0x03d9, B:170:0x03dd, B:173:0x03e9, B:174:0x03f3, B:186:0x0402, B:198:0x0436, B:199:0x043d, B:188:0x0409, B:190:0x0413, B:200:0x043e, B:202:0x0446, B:203:0x044d, B:205:0x0453, B:28:0x00e1), top: B:230:0x000c, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x042f A[Catch: all -> 0x0474, TryCatch #8 {all -> 0x0474, blocks: (B:3:0x000c, B:5:0x0016, B:6:0x004a, B:7:0x0053, B:9:0x0059, B:11:0x0065, B:13:0x006d, B:14:0x007a, B:16:0x0084, B:18:0x008a, B:19:0x0097, B:21:0x009d, B:22:0x00a0, B:24:0x00a6, B:30:0x010f, B:31:0x0116, B:33:0x011c, B:34:0x0121, B:36:0x0127, B:37:0x0130, B:39:0x0136, B:40:0x0140, B:42:0x0146, B:43:0x014f, B:45:0x0155, B:46:0x015a, B:48:0x0161, B:51:0x0170, B:52:0x0190, B:25:0x00ca, B:27:0x00d2, B:57:0x01a0, B:59:0x01ae, B:60:0x01b2, B:62:0x01b6, B:63:0x01b9, B:65:0x01bd, B:69:0x01c4, B:71:0x01d0, B:73:0x01d6, B:75:0x01e2, B:76:0x01f2, B:78:0x020a, B:80:0x0218, B:81:0x021f, B:82:0x0220, B:84:0x024d, B:86:0x028d, B:88:0x0296, B:89:0x029d, B:90:0x02a1, B:93:0x02e0, B:97:0x02ee, B:98:0x02f2, B:92:0x02d9, B:100:0x02f4, B:187:0x0403, B:114:0x031e, B:115:0x0324, B:116:0x0325, B:120:0x0333, B:121:0x0337, B:123:0x0339, B:127:0x034a, B:128:0x034e, B:129:0x034f, B:130:0x0374, B:133:0x037d, B:134:0x037e, B:138:0x038c, B:139:0x0390, B:191:0x041a, B:193:0x0422, B:194:0x0429, B:196:0x042f, B:206:0x0458, B:208:0x045e, B:209:0x0463, B:211:0x0467, B:163:0x03c6, B:164:0x03c7, B:165:0x03cf, B:167:0x03d8, B:168:0x03d9, B:170:0x03dd, B:173:0x03e9, B:174:0x03f3, B:186:0x0402, B:198:0x0436, B:199:0x043d, B:188:0x0409, B:190:0x0413, B:200:0x043e, B:202:0x0446, B:203:0x044d, B:205:0x0453, B:28:0x00e1), top: B:230:0x000c, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x045e A[Catch: all -> 0x0474, TryCatch #8 {all -> 0x0474, blocks: (B:3:0x000c, B:5:0x0016, B:6:0x004a, B:7:0x0053, B:9:0x0059, B:11:0x0065, B:13:0x006d, B:14:0x007a, B:16:0x0084, B:18:0x008a, B:19:0x0097, B:21:0x009d, B:22:0x00a0, B:24:0x00a6, B:30:0x010f, B:31:0x0116, B:33:0x011c, B:34:0x0121, B:36:0x0127, B:37:0x0130, B:39:0x0136, B:40:0x0140, B:42:0x0146, B:43:0x014f, B:45:0x0155, B:46:0x015a, B:48:0x0161, B:51:0x0170, B:52:0x0190, B:25:0x00ca, B:27:0x00d2, B:57:0x01a0, B:59:0x01ae, B:60:0x01b2, B:62:0x01b6, B:63:0x01b9, B:65:0x01bd, B:69:0x01c4, B:71:0x01d0, B:73:0x01d6, B:75:0x01e2, B:76:0x01f2, B:78:0x020a, B:80:0x0218, B:81:0x021f, B:82:0x0220, B:84:0x024d, B:86:0x028d, B:88:0x0296, B:89:0x029d, B:90:0x02a1, B:93:0x02e0, B:97:0x02ee, B:98:0x02f2, B:92:0x02d9, B:100:0x02f4, B:187:0x0403, B:114:0x031e, B:115:0x0324, B:116:0x0325, B:120:0x0333, B:121:0x0337, B:123:0x0339, B:127:0x034a, B:128:0x034e, B:129:0x034f, B:130:0x0374, B:133:0x037d, B:134:0x037e, B:138:0x038c, B:139:0x0390, B:191:0x041a, B:193:0x0422, B:194:0x0429, B:196:0x042f, B:206:0x0458, B:208:0x045e, B:209:0x0463, B:211:0x0467, B:163:0x03c6, B:164:0x03c7, B:165:0x03cf, B:167:0x03d8, B:168:0x03d9, B:170:0x03dd, B:173:0x03e9, B:174:0x03f3, B:186:0x0402, B:198:0x0436, B:199:0x043d, B:188:0x0409, B:190:0x0413, B:200:0x043e, B:202:0x0446, B:203:0x044d, B:205:0x0453, B:28:0x00e1), top: B:230:0x000c, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0467 A[Catch: all -> 0x0474, TryCatch #8 {all -> 0x0474, blocks: (B:3:0x000c, B:5:0x0016, B:6:0x004a, B:7:0x0053, B:9:0x0059, B:11:0x0065, B:13:0x006d, B:14:0x007a, B:16:0x0084, B:18:0x008a, B:19:0x0097, B:21:0x009d, B:22:0x00a0, B:24:0x00a6, B:30:0x010f, B:31:0x0116, B:33:0x011c, B:34:0x0121, B:36:0x0127, B:37:0x0130, B:39:0x0136, B:40:0x0140, B:42:0x0146, B:43:0x014f, B:45:0x0155, B:46:0x015a, B:48:0x0161, B:51:0x0170, B:52:0x0190, B:25:0x00ca, B:27:0x00d2, B:57:0x01a0, B:59:0x01ae, B:60:0x01b2, B:62:0x01b6, B:63:0x01b9, B:65:0x01bd, B:69:0x01c4, B:71:0x01d0, B:73:0x01d6, B:75:0x01e2, B:76:0x01f2, B:78:0x020a, B:80:0x0218, B:81:0x021f, B:82:0x0220, B:84:0x024d, B:86:0x028d, B:88:0x0296, B:89:0x029d, B:90:0x02a1, B:93:0x02e0, B:97:0x02ee, B:98:0x02f2, B:92:0x02d9, B:100:0x02f4, B:187:0x0403, B:114:0x031e, B:115:0x0324, B:116:0x0325, B:120:0x0333, B:121:0x0337, B:123:0x0339, B:127:0x034a, B:128:0x034e, B:129:0x034f, B:130:0x0374, B:133:0x037d, B:134:0x037e, B:138:0x038c, B:139:0x0390, B:191:0x041a, B:193:0x0422, B:194:0x0429, B:196:0x042f, B:206:0x0458, B:208:0x045e, B:209:0x0463, B:211:0x0467, B:163:0x03c6, B:164:0x03c7, B:165:0x03cf, B:167:0x03d8, B:168:0x03d9, B:170:0x03dd, B:173:0x03e9, B:174:0x03f3, B:186:0x0402, B:198:0x0436, B:199:0x043d, B:188:0x0409, B:190:0x0413, B:200:0x043e, B:202:0x0446, B:203:0x044d, B:205:0x0453, B:28:0x00e1), top: B:230:0x000c, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(X.C3973CiN r30, X.C3979CiT r31) {
        /*
            Method dump skipped, instructions count: 1209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3973CiN.A05(X.CiN, X.CiT):void");
    }

    public static void A06(C3967CiC c3967CiC, String str, Throwable th) {
        C3981CiV c3981CiV = c3967CiC.A00;
        th.getMessage();
        c3981CiV.A00(str);
    }

    public static final void A03(C3973CiN c3973CiN, PushInfraMetaData pushInfraMetaData, Integer num) {
        int iA00 = A00(pushInfraMetaData, num);
        String str = pushInfraMetaData.A0G;
        QuickPerformanceLogger quickPerformanceLogger = c3973CiN.A05;
        if (str != null) {
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerAnnotate(875309620, iA00, "push_infra_notif_id", str);
            }
        } else if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(875309620, iA00, "push_infra_notif_id_missing");
        }
        Long l = pushInfraMetaData.A04;
        if (l != null) {
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerAnnotate(875309620, iA00, "push_infra_use_case_id", l.longValue());
            }
        } else if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(875309620, iA00, "push_infra_use_case_id_missing");
        }
        String str2 = pushInfraMetaData.A0H;
        if (str2 != null) {
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerAnnotate(875309620, iA00, "token_fbid", str2);
            }
        } else if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(875309620, iA00, "token_fbid_missing");
        }
        String str3 = pushInfraMetaData.A0D;
        if (str3 != null) {
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerAnnotate(875309620, iA00, "log_notification_request_on_client", str3);
            }
        } else if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(875309620, iA00, "log_notification_request_on_client_missing");
        }
        String str4 = pushInfraMetaData.A06;
        if (str4 != null) {
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerAnnotate(875309620, iA00, "compression_algorithm", str4);
            }
        } else if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(875309620, iA00, "compression_flag_not_present");
        }
        String str5 = pushInfraMetaData.A07;
        if (str5 != null) {
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerAnnotate(875309620, iA00, "hpke_ciphersuite", str5);
            }
        } else if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(875309620, iA00, "hpke_ciphersuite_not_present");
        }
        String str6 = pushInfraMetaData.A0F;
        if (str6 != null) {
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerAnnotate(875309620, iA00, "pre_fan_out_notification_request_identifier", str6);
            }
        } else if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(875309620, iA00, "pre_fan_out_notification_request_identifier_missing");
        }
        String str7 = pushInfraMetaData.A09;
        if (str7 != null) {
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerAnnotate(875309620, iA00, "hpke_keystore_id", str7);
            }
        } else if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(875309620, iA00, "hpke_keystore_id_not_present");
        }
        String str8 = pushInfraMetaData.A0E;
        if (str8 != null) {
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerAnnotate(875309620, iA00, C60N.A00(94), str8);
            }
        } else if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(875309620, iA00, "notification_type_missing");
        }
    }
}
