package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public abstract class EDV {
    public static final AtomicInteger caskCreationCounter = BV5.A17();

    public /* synthetic */ File get(C3380CIk c3380CIk) {
        C7384Etj.A0Y(c3380CIk, 1);
        return getAppNonScoped_DO_NOT_USE_WITH_USER_DATA_OR_YOU_MAY_CAUSE_A_PRIVACY_SEV(c3380CIk.A00, null);
    }

    public /* synthetic */ File getAppNonScoped_DO_NOT_USE_WITH_USER_DATA_OR_YOU_MAY_CAUSE_A_PRIVACY_SEV(int i) {
        return getAppNonScoped_DO_NOT_USE_WITH_USER_DATA_OR_YOU_MAY_CAUSE_A_PRIVACY_SEV(i, null);
    }

    public abstract InterfaceC3421CMj getStorageRegistryPathFactory();

    public /* synthetic */ File getWithoutInit(C3380CIk c3380CIk) {
        C7384Etj.A0Y(c3380CIk, 1);
        return getWithoutInit(c3380CIk, (C6537EDs) null);
    }

    public /* synthetic */ File getWithoutInit_DO_NOT_USE_WITH_USER_DATA_OR_YOU_MAY_CAUSE_A_PRIVACY_SEV(int i) {
        return getWithoutInit_DO_NOT_USE_WITH_USER_DATA_OR_YOU_MAY_CAUSE_A_PRIVACY_SEV(i, null);
    }

    public final void logCacheConfigAnnotations(int i, C6537EDs c6537EDs, int i2) {
        C6531EDd c6531EDd;
        C6533EDj c6533EDj;
        if (c6537EDs != null) {
            Map<String, EE9> map = c6537EDs.A01;
            EE9 ee9 = map.get("stale_removal");
            if ((ee9 instanceof C6533EDj) && (c6533EDj = (C6533EDj) ee9) != null) {
                BV4.A0D().markerAnnotate(i2, i, "stale_age_seconds", c6533EDj.A00);
            }
            EE9 ee92 = map.get("max_size");
            if (!(ee92 instanceof C6531EDd) || (c6531EDd = (C6531EDd) ee92) == null) {
                return;
            }
            BV4.A0D().markerAnnotate(i2, i, "max_size_bytes", c6531EDd.A00);
            BV4.A0D().markerAnnotate(i2, i, "low_space_size_bytes", c6531EDd.A01);
            BV4.A0D().markerAnnotate(i2, i, "critical_space_size_bytes", c6531EDd.A02);
        }
    }

    public boolean shouldUseOptimizedPathMigrator() {
        return false;
    }

    public static QuickPerformanceLogger A00(QuickPerformanceLogger quickPerformanceLogger, String str, int i, int i2) {
        quickPerformanceLogger.markerPoint(i, i2, str);
        QuickPerformanceLogger quickPerformanceLogger2 = QuickPerformanceLoggerProvider.A02;
        return quickPerformanceLogger2 == null ? QuickPerformanceLoggerProvider.A00 : quickPerformanceLogger2;
    }

    public LightweightQuickPerformanceLogger getPerformanceLogger() {
        return BV4.A0D();
    }

    public File get(int i, BXe bXe, C6537EDs c6537EDs) {
        C7384Etj.A0Y(bXe, 1);
        String strA01 = AbstractC6540EDv.A01(i);
        int iIncrementAndGet = caskCreationCounter.incrementAndGet();
        BV4.A0D().markerStart(38480731, iIncrementAndGet);
        BV4.A0D().markerAnnotate(38480731, iIncrementAndGet, "feature", strA01);
        logCacheConfigAnnotations(iIncrementAndGet, c6537EDs, 38480731);
        try {
            BV4.A0D().markerPoint(38480731, iIncrementAndGet, "get_path_scoped_start");
            File withoutInit = getWithoutInit(i, bXe, c6537EDs);
            A00(A00(A00(BV4.A0D(), "get_path_scoped_end", 38480731, iIncrementAndGet), "path_migrator_scoped_start", 38480731, iIncrementAndGet), "path_migrator_scoped_end", 38480731, iIncrementAndGet).markerPoint(38480731, iIncrementAndGet, "mkdirs_scoped_start");
            withoutInit.mkdirs();
            BV4.A0D().markerPoint(38480731, iIncrementAndGet, "mkdirs_scoped_end");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis > 0) {
                withoutInit.setLastModified(jCurrentTimeMillis);
            }
            BV4.A0D().markerEnd(38480731, iIncrementAndGet, (short) 2);
            return withoutInit;
        } catch (Throwable th) {
            BV4.A0D().markerEnd(38480731, iIncrementAndGet, (short) 3);
            throw th;
        }
    }

    public File getAppNonScoped_DO_NOT_USE_WITH_USER_DATA_OR_YOU_MAY_CAUSE_A_PRIVACY_SEV(int i, C6537EDs c6537EDs) {
        String strA01 = AbstractC6540EDv.A01(i);
        if (strA01 != null) {
            int iIncrementAndGet = caskCreationCounter.incrementAndGet();
            BV4.A0D().markerStart(38480731, iIncrementAndGet);
            BV4.A0D().markerAnnotate(38480731, iIncrementAndGet, "feature", strA01);
            logCacheConfigAnnotations(iIncrementAndGet, c6537EDs, 38480731);
            try {
                BV4.A0D().markerPoint(38480731, iIncrementAndGet, "get_path_non_scoped_start");
                File withoutInit_DO_NOT_USE_WITH_USER_DATA_OR_YOU_MAY_CAUSE_A_PRIVACY_SEV = getWithoutInit_DO_NOT_USE_WITH_USER_DATA_OR_YOU_MAY_CAUSE_A_PRIVACY_SEV(i, c6537EDs);
                A00(A00(A00(BV4.A0D(), "get_path_non_scoped_end", 38480731, iIncrementAndGet), "path_migrator_non_scoped_start", 38480731, iIncrementAndGet), "path_migrator_non_scoped_end", 38480731, iIncrementAndGet).markerPoint(38480731, iIncrementAndGet, "mkdirs_non_scoped_start");
                withoutInit_DO_NOT_USE_WITH_USER_DATA_OR_YOU_MAY_CAUSE_A_PRIVACY_SEV.mkdirs();
                BV4.A0D().markerPoint(38480731, iIncrementAndGet, "mkdirs_non_scoped_end");
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis > 0) {
                    withoutInit_DO_NOT_USE_WITH_USER_DATA_OR_YOU_MAY_CAUSE_A_PRIVACY_SEV.setLastModified(jCurrentTimeMillis);
                }
                BV4.A0D().markerEnd(38480731, iIncrementAndGet, (short) 2);
                return withoutInit_DO_NOT_USE_WITH_USER_DATA_OR_YOU_MAY_CAUSE_A_PRIVACY_SEV;
            } catch (Throwable th) {
                BV4.A0D().markerEnd(38480731, iIncrementAndGet, (short) 3);
                throw th;
            }
        }
        throw BV5.A0Q("Invalid storage config id: ", i);
    }

    public File getWithoutInit(int i, BXe bXe, C6537EDs c6537EDs) {
        String strValueOf;
        C7384Etj.A0Y(bXe, 1);
        HashMap mapA0u = BV4.A0u();
        if (c6537EDs != null) {
            mapA0u.putAll(c6537EDs.A00);
        }
        C6534EDp c6534EDpA00 = AbstractC6540EDv.A00(i);
        if (c6534EDpA00 != null && c6534EDpA00.A00 && !mapA0u.containsKey("__scope__")) {
            String str = bXe.A01;
            if (C7BY.A0j(str)) {
                strValueOf = "__out_of_scope__";
            } else {
                strValueOf = String.valueOf(str);
            }
            mapA0u.put("__scope__", strValueOf);
        }
        return getStorageRegistryPathFactory().A7m(mapA0u, i);
    }

    public File getWithoutInit_DO_NOT_USE_WITH_USER_DATA_OR_YOU_MAY_CAUSE_A_PRIVACY_SEV(int i, C6537EDs c6537EDs) {
        HashMap mapA0u = BV4.A0u();
        if (c6537EDs != null) {
            mapA0u.putAll(c6537EDs.A00);
        }
        C6534EDp c6534EDpA00 = AbstractC6540EDv.A00(i);
        if (c6534EDpA00 != null && c6534EDpA00.A00 && !mapA0u.containsKey("__scope__")) {
            mapA0u.put("__scope__", "__out_of_scope__");
        }
        return getStorageRegistryPathFactory().A7m(mapA0u, i);
    }

    public File get(C3380CIk c3380CIk, C6537EDs c6537EDs) {
        C7384Etj.A0Y(c3380CIk, 0);
        return getAppNonScoped_DO_NOT_USE_WITH_USER_DATA_OR_YOU_MAY_CAUSE_A_PRIVACY_SEV(c3380CIk.A00, c6537EDs);
    }

    public File getWithoutInit(C3380CIk c3380CIk, C6537EDs c6537EDs) {
        C7384Etj.A0Y(c3380CIk, 0);
        return getWithoutInit_DO_NOT_USE_WITH_USER_DATA_OR_YOU_MAY_CAUSE_A_PRIVACY_SEV(c3380CIk.A00, c6537EDs);
    }

    public File get(EDP edp, BXe bXe, C6537EDs c6537EDs) {
        AnonymousClass003.A0u(edp, bXe);
        return get(edp.A00, bXe, c6537EDs);
    }

    public File getWithoutInit(EDP edp, BXe bXe, C6537EDs c6537EDs) {
        AnonymousClass003.A0u(edp, bXe);
        return getWithoutInit(edp.A00, bXe, c6537EDs);
    }

    public /* synthetic */ File get(EDP edp, BXe bXe) {
        AnonymousClass003.A0x(edp, bXe);
        return get(edp, bXe, (C6537EDs) null);
    }

    public /* synthetic */ File getWithoutInit(EDP edp, BXe bXe) {
        AnonymousClass003.A0x(edp, bXe);
        return getWithoutInit(edp, bXe, (C6537EDs) null);
    }

    public /* synthetic */ File get(int i, BXe bXe) {
        C7384Etj.A0Y(bXe, 2);
        return get(i, bXe, (C6537EDs) null);
    }

    public /* synthetic */ File getWithoutInit(int i, BXe bXe) {
        C7384Etj.A0Y(bXe, 2);
        return getWithoutInit(i, bXe, (C6537EDs) null);
    }
}
