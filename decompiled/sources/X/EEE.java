package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.stash.core.FileStash;
import com.facebook.stash.events.IStashWithEvents;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class EEE extends EEG {
    public final int A00;
    public final LightweightQuickPerformanceLogger A01;
    public final FileStash A02;
    public final String A03;
    public final InterfaceC7539F0o A04;

    @Override // com.facebook.stash.events.IStashWithEvents
    public final boolean remove(String str, Map<String, String> map) {
        C7384Etj.A0Y(str, 0);
        return remove(str, 0, map);
    }

    public static final int A00(EEE eee, String str) {
        return AnonymousClass001.A0H(str, (eee.A00 + 527) * 31);
    }

    public static final void A02(EEE eee, String str, Map map, int i, int i2) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = eee.A01;
        if (lightweightQuickPerformanceLogger.isMarkerOn(i, i2, false)) {
            FileStash fileStash = eee.A02;
            boolean zHasKey = fileStash.hasKey(str);
            lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "cache_hit", zHasKey ? 1 : 0);
            A03(eee, map, i, i2);
            if (zHasKey) {
                try {
                    long jNow = eee.A04.now();
                    C3292C9w itemAttributes = fileStash.getItemAttributes(str);
                    long j = itemAttributes.A00;
                    if (j > 0) {
                        lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "time_since_insertion", BV4.A04(jNow - j));
                    }
                    long j2 = itemAttributes.A01;
                    if (j2 > 0) {
                        lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "time_since_last_access", BV4.A04(jNow - j2));
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public static final void A03(EEE eee, Map map, int i, int i2) {
        if (map == null || map.isEmpty()) {
            return;
        }
        A01(eee, "origin", map, i, i2);
        A01(eee, "scope_attribution", map, i, i2);
        A01(eee, "purpose", map, i, i2);
        A01(eee, "ttl", map, i, i2);
        A01(eee, "eviction_priority", map, i, i2);
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            if (!BFI.A0H(new String[]{"origin", "scope_attribution", "purpose", "ttl", "eviction_priority"}).contains(entryA0l.getKey())) {
                AnonymousClass006.A1R(linkedHashMapA0j, entryA0l);
            }
        }
        ArrayList arrayListA11 = C60O.A11(linkedHashMapA0j.size());
        Iterator itA0i = C3cG.A0i(linkedHashMapA0j);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l2 = C3cH.A0l(itA0i);
            arrayListA11.add(AnonymousClass006.A0y(entryA0l2.getValue(), ":", BV5.A0q(entryA0l2.getKey())));
        }
        String strA0e = C3cH.A0e(",", arrayListA11);
        if (strA0e.length() > 0) {
            eee.A01.markerAnnotate(i, i2, "other_annotations", strA0e);
        }
    }

    @Override // com.facebook.stash.events.IStashWithEvents
    public final File insertFile(String str, Map<String, String> map) {
        int iA04 = EEG.A04(this, str);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLoggerA05 = EEG.A05(this, iA04, 42991629);
        A03(this, map, 42991629, iA04);
        short s = 3;
        short s2 = 2;
        try {
            FileStash fileStash = this.A02;
            File fileInsertFile = fileStash instanceof IStashWithEvents ? ((IStashWithEvents) fileStash).insertFile(str, map) : fileStash.insertFile(str);
            if (lightweightQuickPerformanceLoggerA05.isMarkerOn(42991629, iA04, true)) {
                File parentFile = fileStash.getFilePath("insertFile").getParentFile();
                if (parentFile != null && parentFile.isDirectory()) {
                    s = 2;
                }
                s2 = s;
            }
            lightweightQuickPerformanceLoggerA05.markerEnd(42991629, iA04, s2);
            return fileInsertFile;
        } catch (Throwable th) {
            if (lightweightQuickPerformanceLoggerA05.isMarkerOn(42991629, iA04, true)) {
                File parentFile2 = this.A02.getFilePath("insertFile").getParentFile();
                if (parentFile2 != null && parentFile2.isDirectory()) {
                    s = 2;
                }
                s2 = s;
            }
            lightweightQuickPerformanceLoggerA05.markerEnd(42991629, iA04, s2);
            throw th;
        }
    }

    public EEE(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, FileStash fileStash, String str) {
        super(fileStash);
        this.A03 = str;
        this.A02 = fileStash;
        this.A01 = lightweightQuickPerformanceLogger;
        this.A04 = C9u.A00;
        this.A00 = str.hashCode();
    }

    public static void A01(EEE eee, String str, Map map, int i, int i2) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            eee.A01.markerAnnotate(i, i2, str, str2);
        }
    }

    @Override // com.facebook.stash.events.IStashWithEvents
    public final File getFile(String str, Map<String, String> map) {
        int iA04 = EEG.A04(this, str);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLoggerA05 = EEG.A05(this, iA04, 42991628);
        A02(this, str, map, 42991628, iA04);
        short s = 3;
        try {
            FileStash fileStash = this.A02;
            File file = fileStash instanceof IStashWithEvents ? ((IStashWithEvents) fileStash).getFile(str, map) : fileStash.getFile(str);
            if (file != null) {
                fileStash.getFilePath(str).setExecutable(true);
                s = 2;
            }
            return file;
        } finally {
            lightweightQuickPerformanceLoggerA05.markerEnd(42991628, iA04, (short) 3);
        }
    }

    @Override // com.facebook.stash.events.IStashWithEvents
    public final OutputStream write(String str, Map<String, String> map) throws IOException {
        int iA04 = EEG.A04(this, str);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A01;
        String str2 = this.A03;
        lightweightQuickPerformanceLogger.markerStart(42991629, iA04, "stash_name", str2);
        lightweightQuickPerformanceLogger.markerStart(42991646, iA04, "stash_name", str2);
        A03(this, map, 42991629, iA04);
        A03(this, map, 42991646, iA04);
        try {
            FileStash fileStash = this.A02;
            OutputStream outputStreamWrite = fileStash instanceof IStashWithEvents ? ((IStashWithEvents) fileStash).write(str, map) : fileStash.write(str);
            if (lightweightQuickPerformanceLogger.isMarkerOn(42991646, iA04, true)) {
                outputStreamWrite = new EEL(this, outputStreamWrite, iA04);
            }
            lightweightQuickPerformanceLogger.markerEnd(42991629, iA04, (short) 2);
            return outputStreamWrite;
        } catch (IOException e) {
            lightweightQuickPerformanceLogger.markerEnd(42991629, iA04, (short) 3);
            throw e;
        }
    }

    @Override // com.facebook.stash.events.IStashWithEvents
    public final boolean remove(String str, int i, Map<String, String> map) {
        boolean zRemove;
        int iA04 = EEG.A04(this, str);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLoggerA05 = EEG.A05(this, iA04, 42991635);
        lightweightQuickPerformanceLoggerA05.markerAnnotate(42991635, iA04, "reason", i);
        A03(this, map, 42991635, iA04);
        short s = 3;
        try {
            FileStash fileStash = this.A02;
            if (fileStash instanceof IStashWithEvents) {
                zRemove = ((IStashWithEvents) fileStash).remove(str, i, map);
            } else {
                zRemove = fileStash.remove(str, i);
            }
            if (zRemove) {
                s = 2;
            }
            return zRemove;
        } finally {
            lightweightQuickPerformanceLoggerA05.markerEnd(42991635, iA04, (short) 3);
        }
    }

    @Override // com.facebook.stash.events.IStashWithEvents
    public final void write(String str, byte[] bArr, Map<String, String> map) throws Throwable {
        AnonymousClass003.A0u(str, bArr);
        int iA00 = A00(this, str);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLoggerA05 = EEG.A05(this, iA00, 42991646);
        A03(this, map, 42991646, iA00);
        short s = 3;
        try {
            FileStash fileStash = this.A02;
            if (fileStash instanceof IStashWithEvents) {
                ((IStashWithEvents) fileStash).write(str, bArr, map);
            } else {
                fileStash.write(str, bArr);
            }
            try {
                lightweightQuickPerformanceLoggerA05.markerAnnotate(42991646, iA00, "written_bytes", bArr.length);
                lightweightQuickPerformanceLoggerA05.markerEnd(42991646, iA00, (short) 2);
            } catch (Throwable th) {
                th = th;
                s = 2;
                lightweightQuickPerformanceLoggerA05.markerEnd(42991646, iA00, s);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
