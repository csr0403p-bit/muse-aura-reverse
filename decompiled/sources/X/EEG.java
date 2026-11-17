package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.stash.core.FileStash;
import com.facebook.stash.events.IStashWithEvents;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class EEG implements IStashWithEvents {
    public boolean A00;
    public final FileStash A01;

    public static int A04(EEE eee, String str) {
        C7384Etj.A0Y(str, 0);
        return EEE.A00(eee, str);
    }

    @Override // com.facebook.stash.core.FileStash
    public final long creationTime(String str) {
        C7384Etj.A0Y(str, 0);
        return this.A01.creationTime(str);
    }

    @Override // com.facebook.stash.core.FileStash
    public final File getFilePath(String str) {
        C7384Etj.A0Y(str, 0);
        return this.A01.getFilePath(str);
    }

    @Override // com.facebook.stash.core.FileStash
    public final C3292C9w getItemAttributes(String str) {
        C7384Etj.A0Y(str, 0);
        return this.A01.getItemAttributes(str);
    }

    @Override // com.facebook.stash.events.IStashWithEvents, com.facebook.stash.core.FileStash
    public final /* synthetic */ File insertFile(String str) {
        C7384Etj.A0Y(str, 1);
        return insertFile(str, null);
    }

    @Override // com.facebook.stash.core.Stash
    public final long lastAccessTime(String str) {
        C7384Etj.A0Y(str, 0);
        return this.A01.lastAccessTime(str);
    }

    @Override // com.facebook.stash.events.IStashWithEvents, com.facebook.stash.core.Stash
    public final /* synthetic */ InputStream read(String str) {
        C7384Etj.A0Y(str, 1);
        return read(str, null);
    }

    @Override // com.facebook.stash.events.IStashWithEvents, com.facebook.stash.core.Stash
    public final /* synthetic */ byte[] readResourceToMemory(String str) {
        C7384Etj.A0Y(str, 1);
        return readResourceToMemory(str, (Map<String, String>) null);
    }

    @Override // com.facebook.stash.events.IStashWithEvents, com.facebook.stash.core.Stash
    public final /* synthetic */ boolean remove(String str) {
        C7384Etj.A0Y(str, 1);
        return remove(str, (Map<String, String>) null);
    }

    @Override // com.facebook.stash.events.IStashWithEvents, com.facebook.stash.core.Stash
    public final /* synthetic */ OutputStream write(String str) {
        C7384Etj.A0Y(str, 1);
        return write(str, (Map<String, String>) null);
    }

    public static LightweightQuickPerformanceLogger A05(EEE eee, int i, int i2) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = eee.A01;
        lightweightQuickPerformanceLogger.markerStart(i2, i, "stash_name", eee.A03);
        return lightweightQuickPerformanceLogger;
    }

    @Override // com.facebook.stash.core.FileStash
    public final boolean createSymlinksForKey(String str, List<String> list) {
        if (!(this instanceof EEE)) {
            if (!(this instanceof EEF)) {
                AnonymousClass003.A0u(str, list);
                return this.A01.createSymlinksForKey(str, list);
            }
            EEF eef = (EEF) this;
            AnonymousClass003.A0u(str, list);
            boolean zCreateSymlinksForKey = eef.A01.createSymlinksForKey(str, list);
            if (zCreateSymlinksForKey && !list.isEmpty()) {
                eef.A02.addAll(list);
            }
            return zCreateSymlinksForKey;
        }
        EEE eee = (EEE) this;
        AnonymousClass003.A0u(str, list);
        int iA00 = EEE.A00(eee, str);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLoggerA05 = A05(eee, iA00, 42991646);
        try {
            boolean zCreateSymlinksForKey2 = eee.A02.createSymlinksForKey(str, list);
            s = zCreateSymlinksForKey2 ? (short) 2 : (short) 3;
            if (!list.isEmpty()) {
                lightweightQuickPerformanceLoggerA05.markerAnnotate(42991646, iA00, "link_key_count", list.size());
            }
            return zCreateSymlinksForKey2;
        } finally {
            lightweightQuickPerformanceLoggerA05.markerEnd(42991646, iA00, s);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005f A[Catch: all -> 0x0066, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:17:0x003f, B:19:0x004a, B:23:0x005f), top: B:31:0x003f }] */
    @Override // com.facebook.stash.core.Stash
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Set<java.lang.String> getAllKeys() {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.EEE
            if (r0 == 0) goto L1f
            X.EEE r10 = (X.EEE) r10
            int r4 = r10.A00
            r3 = 42991637(0x2900015, float:2.1158945E-37)
            com.facebook.quicklog.LightweightQuickPerformanceLogger r2 = A05(r10, r4, r3)
            r1 = 2
            com.facebook.stash.core.FileStash r0 = r10.A02     // Catch: java.lang.Throwable -> L1a
            java.util.Set r0 = r0.getAllKeys()     // Catch: java.lang.Throwable -> L1a
            r2.markerEnd(r3, r4, r1)
            return r0
        L1a:
            r0 = move-exception
            r2.markerEnd(r3, r4, r1)
            throw r0
        L1f:
            boolean r0 = r10 instanceof X.EEF
            if (r0 == 0) goto L69
            X.EEF r10 = (X.EEF) r10
            X.DK9 r9 = r10.A00
            long r2 = r9.now()
            long r4 = r9.now()
            long r0 = r10.A03
            long r4 = r4 - r0
            r7 = 14400000(0xdbba00, double:7.1145453E-317)
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 <= 0) goto L59
            java.util.Set<java.lang.String> r6 = r10.A02
            X.C7384Etj.A0T(r6)
            monitor-enter(r6)
            long r4 = r9.now()     // Catch: java.lang.Throwable -> L66
            long r0 = r10.A03     // Catch: java.lang.Throwable -> L66
            long r4 = r4 - r0
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 <= 0) goto L58
            r6.clear()     // Catch: java.lang.Throwable -> L66
            com.facebook.stash.core.FileStash r0 = r10.A01     // Catch: java.lang.Throwable -> L66
            java.util.Set r0 = r0.getAllKeys()     // Catch: java.lang.Throwable -> L66
            r6.addAll(r0)     // Catch: java.lang.Throwable -> L66
            r10.A03 = r2     // Catch: java.lang.Throwable -> L66
        L58:
            monitor-exit(r6)
        L59:
            java.util.Set<java.lang.String> r6 = r10.A02
            X.C7384Etj.A0T(r6)
            monitor-enter(r6)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L66
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L66
            monitor-exit(r6)
            return r0
        L66:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L69:
            com.facebook.stash.core.FileStash r0 = r10.A01
            java.util.Set r0 = r0.getAllKeys()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EEG.getAllKeys():java.util.Set");
    }

    @Override // com.facebook.stash.core.Stash
    public final File getBaseStoragePath_ForInternalUse() {
        return this.A01.getBaseStoragePath_ForInternalUse();
    }

    @Override // com.facebook.stash.events.IStashWithEvents, com.facebook.stash.core.FileStash
    public final /* synthetic */ File getFile(String str) {
        if (!(this instanceof EEE)) {
            C7384Etj.A0Y(str, 1);
            return getFile(str, null);
        }
        EEE eee = (EEE) this;
        int iA04 = A04(eee, str);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLoggerA05 = A05(eee, iA04, 42991628);
        EEE.A02(eee, str, null, 42991628, iA04);
        short s = 3;
        try {
            FileStash fileStash = eee.A02;
            File file = fileStash.getFile(str);
            if (file != null) {
                fileStash.getFilePath(str).setExecutable(true);
                s = 2;
            }
            return file;
        } finally {
            lightweightQuickPerformanceLoggerA05.markerEnd(42991628, iA04, (short) 3);
        }
    }

    @Override // com.facebook.stash.core.Stash
    public final int getItemCount() {
        if (!(this instanceof EEE)) {
            if (!(this instanceof EEF)) {
                return this.A01.getItemCount();
            }
            EEF eef = (EEF) this;
            return (eef.A03 != -28800000 ? eef.A02 : eef.getAllKeys()).size();
        }
        EEE eee = (EEE) this;
        int i = eee.A00;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLoggerA05 = A05(eee, i, 42991649);
        try {
            return eee.A02.getItemCount();
        } finally {
            lightweightQuickPerformanceLoggerA05.markerEnd(42991649, i, (short) 2);
        }
    }

    @Override // com.facebook.stash.core.Stash
    public final long getItemSizeBytes(String str) {
        if (!(this instanceof EEE)) {
            C7384Etj.A0Y(str, 0);
            return this.A01.getItemSizeBytes(str);
        }
        EEE eee = (EEE) this;
        int iA04 = A04(eee, str);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLoggerA05 = A05(eee, iA04, 42996070);
        try {
            long itemSizeBytes = eee.A02.getItemSizeBytes(str);
            lightweightQuickPerformanceLoggerA05.markerAnnotate(42996070, iA04, "item_size_bytes", itemSizeBytes);
            return itemSizeBytes;
        } finally {
            lightweightQuickPerformanceLoggerA05.markerEnd(42996070, iA04, (short) 2);
        }
    }

    @Override // com.facebook.stash.core.Stash
    public final long getSizeBytes() {
        if (!(this instanceof EEE)) {
            return this.A01.getSizeBytes();
        }
        EEE eee = (EEE) this;
        int i = eee.A00;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLoggerA05 = A05(eee, i, 42991638);
        try {
            long sizeBytes = eee.A02.getSizeBytes();
            lightweightQuickPerformanceLoggerA05.markerAnnotate(42991638, i, "size_bytes", sizeBytes);
            return sizeBytes;
        } finally {
            lightweightQuickPerformanceLoggerA05.markerEnd(42991638, i, (short) 2);
        }
    }

    @Override // com.facebook.stash.core.Stash
    public final boolean hasKey(String str) {
        if (this instanceof EEE) {
            EEE eee = (EEE) this;
            int iA04 = A04(eee, str);
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLoggerA05 = A05(eee, iA04, 42991636);
            try {
                boolean zHasKey = eee.A02.hasKey(str);
                lightweightQuickPerformanceLoggerA05.markerAnnotate(42991636, iA04, "has_key", zHasKey ? 1 : 0);
                return zHasKey;
            } finally {
                lightweightQuickPerformanceLoggerA05.markerEnd(42991636, iA04, (short) 2);
            }
        }
        if (!(this instanceof EEF)) {
            C7384Etj.A0Y(str, 0);
            return this.A01.hasKey(str);
        }
        EEF eef = (EEF) this;
        C7384Etj.A0Y(str, 0);
        boolean zA1L = AnonymousClass002.A1L((eef.A03 > (-28800000L) ? 1 : (eef.A03 == (-28800000L) ? 0 : -1)));
        Set<String> set = eef.A02;
        if (zA1L) {
            return set.contains(str);
        }
        if (set.contains(str)) {
            return true;
        }
        if (!eef.A01.hasKey(str)) {
            return false;
        }
        set.add(str);
        return true;
    }

    @Override // com.facebook.stash.core.Stash
    public final boolean removeAll() {
        FileStash fileStash;
        if (!(this instanceof EEE)) {
            if (this instanceof EEF) {
                EEF eef = (EEF) this;
                eef.A02.clear();
                fileStash = eef.A01;
            } else {
                fileStash = this.A01;
            }
            return fileStash.removeAll();
        }
        EEE eee = (EEE) this;
        int i = eee.A00;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLoggerA05 = A05(eee, i, 42991639);
        try {
            boolean zRemoveAll = eee.A02.removeAll();
            short s = zRemoveAll ? (short) 2 : (short) 3;
            return zRemoveAll;
        } finally {
            lightweightQuickPerformanceLoggerA05.markerEnd(42991639, i, (short) 3);
        }
    }

    @Override // com.facebook.stash.core.Stash
    public final boolean touch(String str) {
        if (!(this instanceof EEE)) {
            C7384Etj.A0Y(str, 0);
            return this.A01.touch(str);
        }
        EEE eee = (EEE) this;
        int iA04 = A04(eee, str);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLoggerA05 = A05(eee, iA04, 42993851);
        try {
            boolean z = eee.A02.touch(str);
            short s = z ? (short) 2 : (short) 3;
            return z;
        } finally {
            lightweightQuickPerformanceLoggerA05.markerEnd(42993851, iA04, (short) 3);
        }
    }

    public EEG(FileStash fileStash) {
        this.A01 = fileStash;
        if (fileStash instanceof IStashWithEvents) {
            this.A00 = true;
        }
    }

    @Override // com.facebook.stash.events.IStashWithEvents
    public final InputStream read(String str, Map<String, String> map) {
        FileStash fileStash;
        InputStream c3101ByG;
        if (this instanceof EEE) {
            EEE eee = (EEE) this;
            int iA04 = A04(eee, str);
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = eee.A01;
            String str2 = eee.A03;
            lightweightQuickPerformanceLogger.markerStart(42991628, iA04, "stash_name", str2);
            lightweightQuickPerformanceLogger.markerStart(42991645, iA04, "stash_name", str2);
            EEE.A03(eee, map, 42991628, iA04);
            EEE.A02(eee, str, map, 42991645, iA04);
            FileStash fileStash2 = eee.A02;
            if (fileStash2 instanceof IStashWithEvents) {
                c3101ByG = ((IStashWithEvents) fileStash2).read(str, map);
            } else {
                c3101ByG = fileStash2.read(str);
            }
            if (c3101ByG == null) {
                lightweightQuickPerformanceLogger.markerEnd(42991645, iA04, (short) 3);
                lightweightQuickPerformanceLogger.markerEnd(42991628, iA04, (short) 3);
                return null;
            }
            fileStash2.getFilePath(str).setExecutable(true);
            if (lightweightQuickPerformanceLogger.isMarkerOn(42991645, iA04, true)) {
                c3101ByG = new C3101ByG(eee, c3101ByG, iA04);
            }
            lightweightQuickPerformanceLogger.markerEnd(42991628, iA04, (short) 2);
            return c3101ByG;
        }
        if (this instanceof EEH) {
            EEH eeh = (EEH) this;
            C7384Etj.A0Y(str, 0);
            boolean zIsEmpty = eeh.A01.isEmpty();
            fileStash = eeh.A00;
            if (!zIsEmpty) {
                try {
                    return fileStash.read(str);
                } finally {
                    EEH.A01(eeh);
                }
            }
        } else {
            C7384Etj.A0Y(str, 0);
            boolean z = this.A00;
            fileStash = this.A01;
            if (z) {
                return ((IStashWithEvents) fileStash).read(str, map);
            }
        }
        return fileStash.read(str);
    }

    @Override // com.facebook.stash.events.IStashWithEvents
    public final byte[] readResourceToMemory(String str, Map<String, String> map) {
        FileStash fileStash;
        byte[] resourceToMemory;
        short s;
        if (this instanceof EEE) {
            EEE eee = (EEE) this;
            int iA04 = A04(eee, str);
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = eee.A01;
            String str2 = eee.A03;
            lightweightQuickPerformanceLogger.markerStart(42991628, iA04, "stash_name", str2);
            lightweightQuickPerformanceLogger.markerStart(42991645, iA04, "stash_name", str2);
            EEE.A03(eee, map, 42991628, iA04);
            int length = -1;
            try {
                EEE.A02(eee, str, map, 42991645, iA04);
                FileStash fileStash2 = eee.A02;
                if (fileStash2 instanceof IStashWithEvents) {
                    resourceToMemory = ((IStashWithEvents) fileStash2).readResourceToMemory(str, map);
                } else {
                    resourceToMemory = fileStash2.readResourceToMemory(str);
                }
                if (resourceToMemory != null) {
                    length = resourceToMemory.length;
                    s = 2;
                } else {
                    s = 3;
                }
                lightweightQuickPerformanceLogger.markerAnnotate(42991645, iA04, "read_bytes", length);
                lightweightQuickPerformanceLogger.markerEnd(42991645, iA04, s);
                lightweightQuickPerformanceLogger.markerEnd(42991628, iA04, s);
                return resourceToMemory;
            } catch (Throwable th) {
                lightweightQuickPerformanceLogger.markerAnnotate(42991645, iA04, "read_bytes", length);
                lightweightQuickPerformanceLogger.markerEnd(42991645, iA04, (short) 87);
                lightweightQuickPerformanceLogger.markerEnd(42991628, iA04, (short) 87);
                throw th;
            }
        }
        if (this instanceof EEH) {
            EEH eeh = (EEH) this;
            C7384Etj.A0Y(str, 0);
            boolean zIsEmpty = eeh.A01.isEmpty();
            fileStash = eeh.A00;
            try {
                if (!zIsEmpty) {
                    try {
                        return fileStash.readResourceToMemory(str);
                    } catch (IOException e) {
                        throw e;
                    }
                }
            } finally {
                EEH.A01(eeh);
            }
        } else {
            C7384Etj.A0Y(str, 0);
            boolean z = this.A00;
            fileStash = this.A01;
            if (z) {
                return ((IStashWithEvents) fileStash).readResourceToMemory(str, map);
            }
        }
        return fileStash.readResourceToMemory(str);
    }

    @Override // com.facebook.stash.events.IStashWithEvents, com.facebook.stash.core.Stash
    public final /* synthetic */ boolean remove(String str, int i) {
        C7384Etj.A0Y(str, 1);
        return remove(str, i, null);
    }

    @Override // com.facebook.stash.core.Stash
    public final /* synthetic */ void write(String str, byte[] bArr, List list) {
        AnonymousClass003.A0x(str, bArr);
        write(str, bArr);
    }

    @Override // com.facebook.stash.core.Stash
    public final byte[] readResourceToMemory(String str, int i) {
        C7384Etj.A0Y(str, 0);
        return this.A01.readResourceToMemory(str, i);
    }

    @Override // com.facebook.stash.events.IStashWithEvents, com.facebook.stash.core.Stash
    public final /* synthetic */ void write(String str, byte[] bArr) {
        AnonymousClass003.A0x(str, bArr);
        write(str, bArr, (Map<String, String>) null);
    }
}
