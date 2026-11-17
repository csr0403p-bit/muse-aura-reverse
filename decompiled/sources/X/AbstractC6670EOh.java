package X;

import android.os.SystemClock;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.EOh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6670EOh {
    public static final AtomicInteger aggregatedInstanceKeyGenerator = BV4.A13((int) (Math.random() * 2.147483647E9d));
    public String versionId = "2.0";
    public String tableJointId = "";

    /* JADX WARN: Multi-variable type inference failed */
    private final void logEventWithTableJointIdOrSampling(EOj eOj, String str, String str2, EnumC7453EwW enumC7453EwW, String str3, String str4, String str5, Map<String, String> map) {
        EOs logger = getLogger();
        if (logger != 0) {
            String str6 = this.tableJointId;
            if (str6.length() <= 0) {
                if (!((AbstractC6676EOt) logger).A00.isSampled()) {
                    return;
                } else {
                    str6 = "";
                }
            }
            logEvent(eOj, str, str2, enumC7453EwW, str3, str4, str5, map, str6, logger);
        }
    }

    private final String sharedFetchFailureMessage(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        String strA0p = C60O.A0p(HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, map);
        return (strA0p == null || strA0p.length() == 0) ? C60O.A0p("cp_null_reason", map) : strA0p;
    }

    private final void startSharedFetchMarker(String str, String str2, Map<String, String> map) {
        String strA0p;
        Integer numSharedFetchInstanceKey = sharedFetchInstanceKey(map);
        if (numSharedFetchInstanceKey != null) {
            int iIntValue = numSharedFetchInstanceKey.intValue();
            String strA0i = null;
            if (map != null) {
                strA0p = C60O.A0p("resolver_name", map);
                strA0i = BV4.A0i("caller_name", map);
            } else {
                strA0p = null;
            }
            logFetchQplStart(iIntValue, str, str2, strA0p, strA0i);
        }
    }

    public Map<String, String> constructDebugTestData(String... strArr) {
        C7384Etj.A0Y(strArr, 0);
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        int length = strArr.length;
        if (length % 2 != 1) {
            for (int i = 0; i < length; i += 2) {
                String str = strArr[i];
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                String str3 = strArr[i + 1];
                if (str3 != null) {
                    str2 = str3;
                }
                linkedHashMapA0j.put(str, str2);
            }
        }
        return linkedHashMapA0j;
    }

    public abstract EOs getLogger();

    public abstract C5223Ddg getQplHelper();

    public void logAccountItemFetchEmpty(String str, String str2, EPf ePf, Map<String, String> map) {
        C7384Etj.A0Y(ePf, 2);
        logEventWithTableJointIdOrSampling(EOj.FETCH_EMPTY, str, str2, EnumC7453EwW.A00, null, ePf.toString(), null, map);
        C5223Ddg qplHelper = getQplHelper();
        if (qplHelper != null) {
            int iA00 = C5223Ddg.A00(map);
            QuickPerformanceLogger quickPerformanceLogger = qplHelper.A00;
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerEnd(857814189, iA00, (short) 3);
            }
        }
        endSharedFetchMarker(map, ePf);
    }

    public void logAccountItemFetchFailure(String str, String str2, EPf ePf, Map<String, String> map) {
        C7384Etj.A0Y(ePf, 2);
        logEventWithTableJointIdOrSampling(EOj.FETCH_FAILURE, str, str2, EnumC7453EwW.A00, null, ePf.toString(), map != null ? C60O.A0p("waterfall_id", map) : null, map);
        C5223Ddg qplHelper = getQplHelper();
        if (qplHelper != null) {
            int iA00 = C5223Ddg.A00(map);
            QuickPerformanceLogger quickPerformanceLogger = qplHelper.A00;
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerEnd(857814189, iA00, (short) 3);
            }
        }
        endSharedFetchMarker(map, ePf);
    }

    public final void logAggregatedFetchEnd(C6674EOp c6674EOp) {
        C7384Etj.A0Y(c6674EOp, 0);
        logAggregatedFetchEnd(c6674EOp, null);
    }

    public void logContentProviderUri(int i, String str) {
        QuickPerformanceLogger quickPerformanceLogger;
        C7384Etj.A0Y(str, 1);
        C5223Ddg qplHelper = getQplHelper();
        if (qplHelper == null || (quickPerformanceLogger = qplHelper.A00) == null) {
            return;
        }
        quickPerformanceLogger.markerAnnotate(100335617, i, "content_provider_uri", str);
    }

    public void logDeviceItemFetchEmpty(String str, String str2, EPf ePf, Map<String, String> map) {
        C7384Etj.A0Y(ePf, 2);
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || map == null) {
            return;
        }
        logEventWithTableJointIdOrSampling(EOj.FETCH_EMPTY, str, null, EnumC7453EwW.A01, str2, ePf.toString(), BV4.A0i("waterfall_id", map), map);
    }

    public void logDeviceItemFetchFailure(String str, String str2, EPf ePf, Map<String, String> map) {
        C7384Etj.A0Y(ePf, 2);
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || map == null) {
            return;
        }
        logEventWithTableJointIdOrSampling(EOj.FETCH_FAILURE, str, null, EnumC7453EwW.A01, str2, ePf.toString(), BV4.A0i("waterfall_id", map), map);
    }

    public void logDeviceItemFetchStart(String str, String str2, Map<String, String> map) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || map == null) {
            return;
        }
        logEventWithTableJointIdOrSampling(EOj.FETCH_START, str, null, EnumC7453EwW.A01, str2, null, BV4.A0i("waterfall_id", map), map);
    }

    public void logDeviceItemFetchSuccess(String str, String str2, Map<String, String> map) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || map == null) {
            return;
        }
        logEventWithTableJointIdOrSampling(EOj.FETCH_SUCCESS, str, null, EnumC7453EwW.A01, str2, null, BV4.A0i("waterfall_id", map), map);
    }

    public void logEligibilityItemFetchEmpty(String str, String str2, EPf ePf, Map<String, String> map) {
        C7384Etj.A0Y(ePf, 2);
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || map == null) {
            return;
        }
        logEventWithTableJointIdOrSampling(EOj.FETCH_EMPTY, str, null, EnumC7453EwW.A02, str2, ePf.toString(), BV4.A0i("waterfall_id", map), map);
    }

    public void logEligibilityItemFetchFailure(String str, String str2, EPf ePf, Map<String, String> map) {
        C7384Etj.A0Y(ePf, 2);
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || map == null) {
            return;
        }
        logEventWithTableJointIdOrSampling(EOj.FETCH_FAILURE, str, null, EnumC7453EwW.A02, str2, ePf.toString(), BV4.A0i("waterfall_id", map), map);
    }

    public void logEligibilityItemFetchStart(String str, String str2, Map<String, String> map) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || map == null) {
            return;
        }
        logEventWithTableJointIdOrSampling(EOj.FETCH_START, str, null, EnumC7453EwW.A02, str2, null, BV4.A0i("waterfall_id", map), map);
    }

    public void logEligibilityItemFetchSuccess(String str, String str2, Map<String, String> map) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || map == null) {
            return;
        }
        logEventWithTableJointIdOrSampling(EOj.FETCH_SUCCESS, str, null, EnumC7453EwW.A02, str2, null, BV4.A0i("waterfall_id", map), map);
    }

    public void logTargetAppAccountItemFetchFailure(String str, String str2, EPf ePf, Map<String, String> map, String str3) {
        C7384Etj.A0Y(ePf, 2);
        if (map != null) {
            map.put("target_app_fetch_result", "FAILURE");
            logEventWithTableJointIdOrSampling(EOj.TARGET_APP_FETCH_FAILURE, str, str2, EnumC7453EwW.A00, null, ePf.toString(), BV4.A0i("instance_key", map), map);
            C5223Ddg qplHelper = getQplHelper();
            if (qplHelper != null) {
                if (str3 == null) {
                    C5223Ddg.A01(map, qplHelper, C5223Ddg.A00(map));
                    return;
                }
                qplHelper.A02(str3, str2, map);
                int iA00 = C5223Ddg.A00(map);
                QuickPerformanceLogger quickPerformanceLogger = qplHelper.A00;
                if (quickPerformanceLogger != null) {
                    quickPerformanceLogger.markerEnd(857814189, iA00, (short) 3);
                }
            }
        }
    }

    public void logTargetAppAccountItemFetchSuccess(String str, String str2, Map<String, String> map, String str3) {
        if (map != null) {
            map.put("target_app_fetch_result", "SUCCESS");
            logEventWithTableJointIdOrSampling(EOj.TARGET_APP_FETCH_SUCCESS, str, str2, EnumC7453EwW.A00, null, null, BV4.A0i("instance_key", map), map);
            C5223Ddg qplHelper = getQplHelper();
            if (qplHelper != null) {
                if (str3 == null) {
                    C5223Ddg.A01(map, qplHelper, C5223Ddg.A00(map));
                    return;
                }
                qplHelper.A02(str3, str2, map);
                int iA00 = C5223Ddg.A00(map);
                QuickPerformanceLogger quickPerformanceLogger = qplHelper.A00;
                if (quickPerformanceLogger != null) {
                    quickPerformanceLogger.markerEnd(857814189, iA00, (short) 2);
                }
            }
        }
    }

    public final void setTableJointId(String str) {
        C7384Etj.A0Y(str, 0);
        this.tableJointId = str;
    }

    public void setVersionId(String str) {
        C7384Etj.A0Y(str, 0);
        this.versionId = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static <T extends Enum<T>> T A00(Class<T> cls, String str) {
        if (str == null) {
            str = "";
        }
        try {
            switch (str.hashCode()) {
                case -2022672681:
                    if (str.equals("INACTIVE_LOGGED_IN_ACCOUNTS")) {
                        str = "INACTIVE_LOGGED_IN_ACCOUNT";
                        break;
                    }
                    break;
                case -1637367954:
                    if (str.equals("FACEBOOK_RELEASE")) {
                        str = "FACEBOOK";
                        break;
                    }
                    break;
                case 430549694:
                    if (str.equals("SAVED_ACCOUNTS")) {
                        str = "SAVED_ACCOUNT";
                        break;
                    }
                    break;
                case 1925346054:
                    if (str.equals("ACTIVE")) {
                        str = "ACTIVE_ACCOUNT";
                        break;
                    }
                    break;
            }
            return (T) Enum.valueOf(cls, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static /* synthetic */ void logAggregatedFetchEnd$default(AbstractC6670EOh abstractC6670EOh, C6674EOp c6674EOp, Integer num, int i, Object obj) {
        if (obj != null) {
            throw C8j3.A18("Super calls with default arguments not supported in this target, function: logAggregatedFetchEnd");
        }
        if ((i & 2) != 0) {
            num = null;
        }
        abstractC6670EOh.logAggregatedFetchEnd(c6674EOp, num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void logEvent(EOj eOj, String str, String str2, EnumC7453EwW enumC7453EwW, String str3, String str4, String str5, Map<String, String> map, String str6, EOs eOs) {
        AbstractC6676EOt abstractC6676EOt = (AbstractC6676EOt) eOs;
        abstractC6676EOt.A00(eOj, "event");
        abstractC6676EOt.A00((F1V) A00(F1V.class, enumC7453EwW.toString()), "item_type");
        abstractC6676EOt.A00((BWw) A00(BWw.class, str2), "target_credential_source");
        abstractC6676EOt.A00((EnumC6671EOi) A00(EnumC6671EOi.class, str), "target_app_source");
        abstractC6676EOt.A00((EnumC7505EyP) A00(EnumC7505EyP.class, str3), "target_device_item_source");
        abstractC6676EOt.A03(HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, str4);
        abstractC6676EOt.A03("event_session_id", str5);
        abstractC6676EOt.A00.A3g("debug_test_data", map);
        abstractC6676EOt.A03("version_id", this.versionId);
        abstractC6676EOt.A03("table_join_id", str6);
        abstractC6676EOt.APu();
    }

    public static final C6674EOp newAggregatedFetch() {
        return new C6674EOp(aggregatedInstanceKeyGenerator.incrementAndGet(), SystemClock.uptimeMillis());
    }

    private final Integer sharedFetchInstanceKey(Map<String, String> map) {
        String strA0p;
        if (map == null || (strA0p = C60O.A0p("instance_key", map)) == null) {
            return null;
        }
        return C9tI.A0r(strA0p);
    }

    public void logAccountItemFetchStart(String str, String str2, Map<String, String> map) {
        EOj eOj = EOj.FETCH_START;
        EnumC7453EwW enumC7453EwW = EnumC7453EwW.A00;
        logEventWithTableJointIdOrSampling(eOj, str, str2, enumC7453EwW, null, null, map != null ? C60O.A0p("waterfall_id", map) : null, map);
        C5223Ddg qplHelper = getQplHelper();
        if (qplHelper != null) {
            int iA00 = C5223Ddg.A00(map);
            QuickPerformanceLogger quickPerformanceLogger = qplHelper.A00;
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerStart(857814189, iA00);
                quickPerformanceLogger.markerAnnotate(857814189, iA00, "platform", "Android");
                String str3 = str;
                if (str == null) {
                    str3 = "";
                }
                quickPerformanceLogger.markerAnnotate(857814189, iA00, "app_source", str3);
                quickPerformanceLogger.markerAnnotate(857814189, iA00, "item_type", enumC7453EwW.toString());
                String str4 = str2;
                if (str2 == null) {
                    str4 = "";
                }
                quickPerformanceLogger.markerAnnotate(857814189, iA00, "credential_source", str4);
                quickPerformanceLogger.markerAnnotate(857814189, iA00, "logging_version", "3.0");
            }
            C5223Ddg.A01(map, qplHelper, iA00);
        }
        startSharedFetchMarker(str, str2, map);
    }

    public void logAccountItemFetchSuccess(String str, String str2, Map<String, String> map) {
        logEventWithTableJointIdOrSampling(EOj.FETCH_SUCCESS, str, str2, EnumC7453EwW.A00, null, null, map != null ? C60O.A0p("waterfall_id", map) : null, map);
        C5223Ddg qplHelper = getQplHelper();
        if (qplHelper != null) {
            int iA00 = C5223Ddg.A00(map);
            QuickPerformanceLogger quickPerformanceLogger = qplHelper.A00;
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerEnd(857814189, iA00, (short) 2);
            }
        }
        endSharedFetchMarker(map, null);
    }

    public final C6674EOp logAggregatedFetchStart(String str) {
        C6674EOp c6674EOp = new C6674EOp(aggregatedInstanceKeyGenerator.incrementAndGet(), SystemClock.uptimeMillis());
        logAggregatedFetchStart(c6674EOp, str);
        return c6674EOp;
    }

    private final void endSharedFetchMarker(Map<String, String> map, EPf ePf) {
        Integer numSharedFetchInstanceKey = sharedFetchInstanceKey(map);
        if (numSharedFetchInstanceKey != null) {
            logFetchQplEnd(numSharedFetchInstanceKey.intValue(), ePf, sharedFetchFailureMessage(map));
        }
    }

    public void logClientAcquireQplEnd(int i) {
        QuickPerformanceLogger quickPerformanceLogger;
        C5223Ddg qplHelper = getQplHelper();
        if (qplHelper == null || (quickPerformanceLogger = qplHelper.A00) == null) {
            return;
        }
        quickPerformanceLogger.markerPoint(100335617, i, FGI.A0M("client_acquire", "_end"));
    }

    public void logClientAcquireQplStart(int i) {
        QuickPerformanceLogger quickPerformanceLogger;
        C5223Ddg qplHelper = getQplHelper();
        if (qplHelper == null || (quickPerformanceLogger = qplHelper.A00) == null) {
            return;
        }
        quickPerformanceLogger.markerPoint(100335617, i, FGI.A0M("client_acquire", "_start"));
    }

    public void logCpQueryCount(int i, int i2) {
        QuickPerformanceLogger quickPerformanceLogger;
        C5223Ddg qplHelper = getQplHelper();
        if (qplHelper == null || (quickPerformanceLogger = qplHelper.A00) == null) {
            return;
        }
        quickPerformanceLogger.markerAnnotate(100335617, i, "cp_query_count", String.valueOf(i2));
    }

    public void logCpQueryCursorCount(int i, int i2) {
        QuickPerformanceLogger quickPerformanceLogger;
        C5223Ddg qplHelper = getQplHelper();
        if (qplHelper == null || (quickPerformanceLogger = qplHelper.A00) == null) {
            return;
        }
        quickPerformanceLogger.markerAnnotate(100335617, i, "cursor_count", String.valueOf(i2));
    }

    public void logCpQueryQplEnd(int i) {
        QuickPerformanceLogger quickPerformanceLogger;
        C5223Ddg qplHelper = getQplHelper();
        if (qplHelper == null || (quickPerformanceLogger = qplHelper.A00) == null) {
            return;
        }
        quickPerformanceLogger.markerPoint(100335617, i, FGI.A0M("content_provider_query", "_end"));
    }

    public void logCpQueryQplStart(int i) {
        QuickPerformanceLogger quickPerformanceLogger;
        C5223Ddg qplHelper = getQplHelper();
        if (qplHelper == null || (quickPerformanceLogger = qplHelper.A00) == null) {
            return;
        }
        quickPerformanceLogger.markerPoint(100335617, i, FGI.A0M("content_provider_query", "_start"));
    }

    public void logCursorSerializationQplEnd(int i) {
        QuickPerformanceLogger quickPerformanceLogger;
        C5223Ddg qplHelper = getQplHelper();
        if (qplHelper == null || (quickPerformanceLogger = qplHelper.A00) == null) {
            return;
        }
        quickPerformanceLogger.markerPoint(100335617, i, FGI.A0M("cursor_serialization", "_end"));
    }

    public void logCursorSerializationQplStart(int i) {
        QuickPerformanceLogger quickPerformanceLogger;
        C5223Ddg qplHelper = getQplHelper();
        if (qplHelper == null || (quickPerformanceLogger = qplHelper.A00) == null) {
            return;
        }
        quickPerformanceLogger.markerPoint(100335617, i, FGI.A0M("cursor_serialization", "_start"));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void logFetchQplEnd(int r5, X.EPf r6, java.lang.String r7) {
        /*
            r4 = this;
            X.Ddg r0 = r4.getQplHelper()
            if (r0 == 0) goto L67
            r4 = 100335617(0x5fb0001, float:2.3603928E-35)
            com.facebook.quicklog.QuickPerformanceLogger r3 = r0.A00
            if (r3 == 0) goto L67
            java.util.Set<java.lang.Integer> r1 = X.C5223Ddg.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            boolean r0 = r1.remove(r0)
            if (r0 == 0) goto L67
            if (r6 == 0) goto L68
            int r0 = r6.ordinal()
            switch(r0) {
                case 0: goto L39;
                case 1: goto L3c;
                case 2: goto L36;
                case 3: goto L68;
                case 4: goto L2d;
                case 5: goto L3c;
                case 6: goto L2d;
                case 7: goto L30;
                case 8: goto L3c;
                case 9: goto L36;
                case 10: goto L3c;
                case 11: goto L30;
                case 12: goto L30;
                case 13: goto L3f;
                case 14: goto L3c;
                case 15: goto L2a;
                case 16: goto L27;
                case 17: goto L27;
                case 18: goto L3c;
                case 19: goto L33;
                default: goto L22;
            }
        L22:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L27:
            X.ENz r2 = X.ENz.A03
            goto L41
        L2a:
            X.ENz r2 = X.ENz.A02
            goto L41
        L2d:
            X.ENz r2 = X.ENz.A0A
            goto L41
        L30:
            X.ENz r2 = X.ENz.A0B
            goto L41
        L33:
            X.ENz r2 = X.ENz.A0C
            goto L41
        L36:
            X.ENz r2 = X.ENz.A08
            goto L41
        L39:
            X.ENz r2 = X.ENz.A07
            goto L41
        L3c:
            X.ENz r2 = X.ENz.A0D
            goto L41
        L3f:
            X.ENz r2 = X.ENz.A0F
        L41:
            java.lang.String r1 = "error_code"
            java.lang.String r0 = r2.name()
            r3.markerAnnotate(r4, r5, r1, r0)
            if (r7 == 0) goto L52
            int r0 = r7.length()
            if (r0 != 0) goto L56
        L52:
            java.lang.String r7 = r6.name()
        L56:
            java.lang.String r0 = "error_message"
            r3.markerAnnotate(r4, r5, r0, r7)
            X.ENz r0 = X.ENz.A03
            if (r2 == r0) goto L68
            X.ENz r0 = X.ENz.A02
            if (r2 == r0) goto L68
            r0 = 3
        L64:
            r3.markerEnd(r4, r5, r0)
        L67:
            return
        L68:
            r0 = 2
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6670EOh.logFetchQplEnd(int, X.EPf, java.lang.String):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public void logFetchQplStart(int i, String str, String str2, String str3, String str4) {
        String str5;
        Integer num;
        EP0 ep0;
        C5223Ddg qplHelper = getQplHelper();
        if (qplHelper != null) {
            String str6 = this.versionId;
            C7384Etj.A0Y(str6, 6);
            QuickPerformanceLogger quickPerformanceLogger = qplHelper.A00;
            if (quickPerformanceLogger == null || !C5223Ddg.A01.add(Integer.valueOf(i))) {
                return;
            }
            quickPerformanceLogger.markerStart(100335617, i);
            quickPerformanceLogger.markerAnnotate(100335617, i, "logging_version", str6);
            if (str4 == null) {
                str4 = "";
            }
            quickPerformanceLogger.markerAnnotate(100335617, i, "log_location", str4);
            if (str != null) {
                switch (str.hashCode()) {
                    case -792251077:
                        if (str.equals("INSTAGRAM_LITE")) {
                            ep0 = EP0.A0A;
                            str = ep0.name();
                            break;
                        }
                        break;
                    case 30720907:
                        if (str.equals("BARCELONA")) {
                            ep0 = EP0.A0F;
                            str = ep0.name();
                            break;
                        }
                        break;
                    case 471638663:
                        if (str.equals("FACEBOOK_LITE")) {
                            ep0 = EP0.A08;
                            str = ep0.name();
                            break;
                        }
                        break;
                    case 1627938330:
                        if (str.equals("WEARABLES")) {
                            ep0 = EP0.A0D;
                            str = ep0.name();
                            break;
                        }
                        break;
                }
            } else {
                str = "";
            }
            quickPerformanceLogger.markerAnnotate(100335617, i, "app_source", str);
            if (str2 == null) {
                str2 = "";
            }
            quickPerformanceLogger.markerAnnotate(100335617, i, "credential_source", str2);
            if (str3 != null) {
                Locale locale = Locale.US;
                C7384Etj.A0V(locale);
                String upperCase = str3.toUpperCase(locale);
                switch (upperCase.hashCode()) {
                    case -2031160921:
                        str5 = "LEGACY_PROVIDER";
                        break;
                    case -1399627166:
                        if (upperCase.equals("LITE_PROVIDER")) {
                            num = C79.A0C;
                            quickPerformanceLogger.markerAnnotate(100335617, i, "resolver_type", EOY.A00(num));
                        }
                        return;
                    case 667351899:
                        if (upperCase.equals("ACCOUNT_MANAGER")) {
                            num = C79.A00;
                            quickPerformanceLogger.markerAnnotate(100335617, i, "resolver_type", EOY.A00(num));
                        }
                        return;
                    case 1783413527:
                        str5 = "CONTENT_PROVIDER";
                        break;
                    default:
                        return;
                }
                if (upperCase.equals(str5)) {
                    num = C79.A0K;
                    quickPerformanceLogger.markerAnnotate(100335617, i, "resolver_type", EOY.A00(num));
                }
            }
        }
    }

    public void logLiteCpFetchPoint(String str, Map<String, String> map) {
        QuickPerformanceLogger quickPerformanceLogger;
        C5223Ddg qplHelper = getQplHelper();
        if (qplHelper != null) {
            int iA00 = C5223Ddg.A00(map);
            if (str == null || (quickPerformanceLogger = qplHelper.A00) == null) {
                return;
            }
            quickPerformanceLogger.markerPoint(857814189, iA00, str);
        }
    }

    public final void logAggregatedFetchEnd(C6674EOp c6674EOp, Integer num) {
        C7384Etj.A0Y(c6674EOp, 0);
        C5223Ddg qplHelper = getQplHelper();
        if (qplHelper != null) {
            int i = c6674EOp.A01;
            String str = c6674EOp.A00;
            QuickPerformanceLogger quickPerformanceLogger = qplHelper.A00;
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerAnnotate(100335618, i, "logging_version", str);
                if (num != null) {
                    quickPerformanceLogger.markerAnnotate(100335618, i, "item_count", String.valueOf(num.intValue()));
                }
                quickPerformanceLogger.markerEnd(100335618, i, (short) 2);
            }
        }
    }

    public final void logAggregatedFetchStart(C6674EOp c6674EOp, String str) {
        C7384Etj.A0Y(c6674EOp, 0);
        String str2 = this.versionId;
        C7384Etj.A0Y(str2, 0);
        c6674EOp.A00 = str2;
        C5223Ddg qplHelper = getQplHelper();
        if (qplHelper != null) {
            int i = c6674EOp.A01;
            long j = c6674EOp.A02;
            QuickPerformanceLogger quickPerformanceLogger = qplHelper.A00;
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerStart(100335618, i, j, TimeUnit.MILLISECONDS);
                quickPerformanceLogger.markerAnnotate(100335618, i, "platform", "Android");
                if (str == null) {
                    str = "";
                }
                quickPerformanceLogger.markerAnnotate(100335618, i, "caller_name", str);
                quickPerformanceLogger.markerAnnotate(100335618, i, "log_location", str);
            }
        }
    }
}
