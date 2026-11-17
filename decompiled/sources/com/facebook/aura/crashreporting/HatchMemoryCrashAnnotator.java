package com.facebook.aura.crashreporting;

import X.AbstractC06907md;
import X.AbstractC07127nr;
import X.AbstractC3225C4i;
import X.AbstractC3358CGz;
import X.AbstractC7531Ezs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass801;
import X.BV4;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C78W;
import X.C7Bq;
import X.C8eO;
import X.C98;
import X.CFK;
import X.DCl;
import X.EnumC10460Hji;
import X.EnumC3223C4g;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.memory.AuraMemoryPressure;
import com.facebook.aura.memory.AuraMemoryPressureLevel;
import com.facebook.aura.memory.AuraTrimmable;
import com.facebook.aura.network.transport.HatchLargeReads;
import com.facebook.errorreporting.field.ReportFieldString;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class HatchMemoryCrashAnnotator implements AuraTrimmable {
    public static final long BYTES_PER_KB = 1024;
    public static final String INSTR_VERSION = "1";
    public static final String OOM_FILE_NAME = "hatch_last_oom.txt";
    public static final long SAMPLE_INTERVAL_MS = 60000;
    public static final String TAG = "HatchMemoryCrashAnnotator";
    public static volatile AuraMemoryPressureLevel lastPressure;
    public static final HatchMemoryCrashAnnotator INSTANCE = new HatchMemoryCrashAnnotator();
    public static final ReportFieldString javaUsedKbField = new ReportFieldString(-2, "hatch_mem_java_used_kb", true);
    public static final ReportFieldString javaMaxKbField = new ReportFieldString(-2, "hatch_mem_java_max_kb", true);
    public static final ReportFieldString nativeHeapKbField = new ReportFieldString(-2, "hatch_mem_native_heap_kb", true);
    public static final ReportFieldString pressureField = new ReportFieldString(-2, "hatch_mem_pressure", true);
    public static final ReportFieldString sampledAtField = new ReportFieldString(-2, "hatch_mem_sampled_uptime_s", true);
    public static final ReportFieldString retainedSizesField = new ReportFieldString(-2, "hatch_mem_retained_sizes", true);
    public static final C3UX scope = C78W.A05(new C8eO(null), AuraDispatchers.INSTANCE.m764default());
    public static final AtomicBoolean started = C60O.A1E();
    public static volatile String lastRetainedSizes = "";
    public static Function0<? extends AbstractC3358CGz> userSessionProvider = HatchMemoryCrashAnnotator$userSessionProvider$1.INSTANCE;

    @DebugMetadata(c = "com.facebook.aura.crashreporting.HatchMemoryCrashAnnotator$onMemoryPressure$1", f = "HatchMemoryCrashAnnotator.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.crashreporting.HatchMemoryCrashAnnotator$onMemoryPressure$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            HatchMemoryCrashAnnotator.INSTANCE.record();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.crashreporting.HatchMemoryCrashAnnotator$retainedSizes$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<Map.Entry<String, Long>, CharSequence> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public final CharSequence invoke(Map.Entry<String, Long> entry) {
            C7384Etj.A0Y(entry, 0);
            return AnonymousClass006.A0y(entry.getValue(), InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, C3cG.A0g(C60O.A0t(entry)));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.crashreporting.HatchMemoryCrashAnnotator$start$1", f = "HatchMemoryCrashAnnotator.kt", l = {58}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.crashreporting.HatchMemoryCrashAnnotator$start$1, reason: invalid class name and case insensitive filesystem */
    public final class C115751 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public C115751(HtJ<? super C115751> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C115751 c115751 = new C115751(htJ);
            c115751.L$0 = obj;
            return c115751;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            C115751 c115751 = new C115751(htJ);
            c115751.L$0 = c3ux;
            return c115751.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C3UX c3ux = (C3UX) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i != 0 && i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            while (Hxb.A04(c3ux)) {
                HatchMemoryCrashAnnotator.INSTANCE.record();
                this.L$0 = c3ux;
                this.label = 1;
                if (C7Bq.A01(60000L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void logPreviousProcessOom(File file) {
        C7384Etj.A0Y(file, 0);
        File fileA0O = C3cG.A0O(file, OOM_FILE_NAME);
        if (!fileA0O.exists()) {
            return;
        }
        Properties properties = new Properties();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(BV4.A0H(fileA0O), DCl.A05);
            try {
                properties.load(inputStreamReader);
                inputStreamReader.close();
                fileA0O.delete();
                HatchAppEventLogger hatchAppEventLogger = HatchAppEventLogger.INSTANCE;
                Set<String> setStringPropertyNames = properties.stringPropertyNames();
                C7384Etj.A0U(setStringPropertyNames);
                LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass005.A0C(setStringPropertyNames));
                for (String str : setStringPropertyNames) {
                    linkedHashMap.put(str, properties.getProperty(str));
                }
                hatchAppEventLogger.logEvent("previous_process_oom", ErrorReportingConstants.APP_NAME_KEY, null, null, null, AnonymousClass006.A11("instr_version", "1", linkedHashMap), null);
            } finally {
            }
        } catch (Throwable th) {
            fileA0O.delete();
            throw th;
        }
    }

    @Override // com.facebook.aura.memory.AuraTrimmable
    public void onMemoryPressure(AuraMemoryPressureLevel auraMemoryPressureLevel) {
        C7384Etj.A0Y(auraMemoryPressureLevel, 0);
        lastPressure = auraMemoryPressureLevel;
        AnonymousClass001.A1J(new AnonymousClass1(null), scope);
    }

    public final void start(Function0<? extends AbstractC3358CGz> function0) {
        C7384Etj.A0Y(function0, 0);
        if (BV4.A1V(started)) {
            userSessionProvider = function0;
            AuraMemoryPressure.INSTANCE.register(this);
            AnonymousClass001.A1J(new C115751(null), scope);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void record() {
        AbstractC3225C4i abstractC3225C4i = C98.A00;
        if (abstractC3225C4i != C98.A03) {
            try {
                Runtime runtime = Runtime.getRuntime();
                putMemoryField(abstractC3225C4i, javaUsedKbField, Long.valueOf((runtime.totalMemory() - runtime.freeMemory()) / 1024));
                putMemoryField(abstractC3225C4i, javaMaxKbField, Long.valueOf(runtime.maxMemory() / 1024));
                putMemoryField(abstractC3225C4i, nativeHeapKbField, Long.valueOf(Debug.getNativeHeapAllocatedSize() / 1024));
                ReportFieldString reportFieldString = pressureField;
                AuraMemoryPressureLevel auraMemoryPressureLevel = lastPressure;
                putMemoryField(abstractC3225C4i, reportFieldString, auraMemoryPressureLevel != null ? auraMemoryPressureLevel.name() : "none");
                putMemoryField(abstractC3225C4i, sampledAtField, Long.valueOf(BV4.A04(SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime())));
                String strRetainedSizes = retainedSizes();
                lastRetainedSizes = strRetainedSizes;
                putMemoryField(abstractC3225C4i, retainedSizesField, strRetainedSizes);
            } catch (RuntimeException e) {
                CFK.A0A(TAG, "Failed to record memory snapshot", e);
            }
        }
    }

    private final String retainedSizes() {
        AbstractC3358CGz abstractC3358CGzInvoke = userSessionProvider.invoke();
        int i = 0;
        TreeMap treeMap = new TreeMap();
        int[] iArr = {0, 1, 2, 3};
        do {
            Map<String, Long> mapA0S = AnonymousClass801.A0S(iArr[i], abstractC3358CGzInvoke);
            C7384Etj.A0U(mapA0S);
            treeMap.putAll(mapA0S);
            i++;
        } while (i < 4);
        Set setEntrySet = treeMap.entrySet();
        C7384Etj.A0U(setEntrySet);
        return AbstractC06907md.A01(",", setEntrySet, AnonymousClass2.INSTANCE);
    }

    private final void putMemoryField(AbstractC3225C4i abstractC3225C4i, ReportFieldString reportFieldString, Object obj) {
        abstractC3225C4i.A01(reportFieldString, EnumC3223C4g.CRITICAL_REPORT, obj.toString());
    }

    public final void onJavaCrash(Throwable th, File file) throws IOException {
        AnonymousClass003.A0u(th, file);
        while (th.getCause() != null) {
            th = th.getCause();
        }
        if (th instanceof OutOfMemoryError) {
            Properties properties = new Properties();
            properties.put("crash_time_ms", String.valueOf(System.currentTimeMillis()));
            properties.put("process_age_ms", String.valueOf(SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime()));
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            properties.put("oom_message", message);
            properties.put("large_reads", HatchLargeReads.INSTANCE.snapshot());
            properties.put("retained_sizes", lastRetainedSizes);
            File fileA0O = C3cG.A0O(file, OOM_FILE_NAME);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(BV4.A0I(fileA0O), DCl.A05);
            try {
                properties.store(outputStreamWriter, (String) null);
                outputStreamWriter.close();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AbstractC7531Ezs.A00(outputStreamWriter, th2);
                    throw th3;
                }
            }
        }
    }
}
