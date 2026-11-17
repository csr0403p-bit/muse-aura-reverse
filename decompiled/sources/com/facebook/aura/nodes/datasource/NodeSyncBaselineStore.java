package com.facebook.aura.nodes.datasource;

import X.AbstractC07969sc;
import X.AbstractC07979sd;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BFI;
import X.BQF;
import X.BS3;
import X.BzK;
import X.C06G;
import X.C06H;
import X.C2272BRp;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;
import X.C9hr;
import X.C9jH;
import X.C9sU;
import X.CEV;
import X.CFK;
import X.CH0;
import X.F0C;
import X.G0U;
import android.util.AtomicFile;
import com.facebook.aura.common.prefs.AuraUserPrefStore;
import com.facebook.aura.common.prefs.AuraUserPrefs;
import com.facebook.aura.json.HatchJsonKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Map;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes4.dex */
public final class NodeSyncBaselineStore {
    public static final String DIRECTORY = "node_sync_baselines";
    public static final String TAG = "NodeSyncBaselineStore";
    public final AbstractC3358CGz userSession;
    public static final Companion Companion = new Companion();
    public static final Object LOCK = C3cG.A0T();

    public final class Baseline extends C06G {
        public final String fingerprint;
        public final Map<String, String> hashes;
        public final Map<String, JsonObject> payloads;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Baseline) {
                    Baseline baseline = (Baseline) obj;
                    if (!C7384Etj.areEqual(this.fingerprint, baseline.fingerprint) || !C7384Etj.areEqual(this.hashes, baseline.hashes) || !C7384Etj.areEqual(this.payloads, baseline.payloads)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Baseline copy$default(Baseline baseline, String str, Map map, Map map2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = baseline.fingerprint;
            }
            if ((i & 2) != 0) {
                map = baseline.hashes;
            }
            if ((i & 4) != 0) {
                map2 = baseline.payloads;
            }
            return baseline.copy(str, map, map2);
        }

        public final String component1() {
            return this.fingerprint;
        }

        public final Map<String, String> component2() {
            return this.hashes;
        }

        public final Map<String, JsonObject> component3() {
            return this.payloads;
        }

        public final String getFingerprint() {
            return this.fingerprint;
        }

        public final Map<String, String> getHashes() {
            return this.hashes;
        }

        public final Map<String, JsonObject> getPayloads() {
            return this.payloads;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.payloads, AnonymousClass005.A0F(this.hashes, AnonymousClass001.A0G(this.fingerprint)));
        }

        public Baseline(String str, Map<String, String> map, Map<String, JsonObject> map2) {
            AnonymousClass005.A0x(str, map, map2);
            this.fingerprint = str;
            this.hashes = map;
            this.payloads = map2;
        }

        public final Baseline copy(String str, Map<String, String> map, Map<String, JsonObject> map2) {
            AnonymousClass005.A0x(str, map, map2);
            return new Baseline(str, map, map2);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Baseline(String str, Map map, Map map2, int i, C06H c06h) {
            this(str, map, (i & 4) != 0 ? C9jH.A00 : map2);
        }
    }

    /* loaded from: classes3.dex */
    public final class Companion {
        public final void deleteAll$fbandroid_express_aura_java_com_facebook_aura_nodes_datasource_datasource() {
            synchronized (NodeSyncBaselineStore.LOCK) {
                CEV.A03(NodeSyncBaselineStore.Companion.rootDirectory());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final File rootDirectory() {
            return C3cG.A0O(C3cG.A06().getFilesDir(), NodeSyncBaselineStore.DIRECTORY);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* renamed from: com.facebook.aura.nodes.datasource.NodeSyncBaselineStore$fileName$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Byte, CharSequence> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
            return C3cJ.A0K(Byte.valueOf(b.byteValue()));
        }

        public final CharSequence invoke(byte b) {
            return C3cJ.A0K(Byte.valueOf(b));
        }
    }

    public NodeSyncBaselineStore(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
    }

    public final void commit(String str, Baseline baseline) {
        FileOutputStream fileOutputStreamStartWrite;
        C9sU c9sU;
        NodeSyncBaselineJson$$serializer nodeSyncBaselineJson$$serializer;
        NodeSyncBaselineJson nodeSyncBaselineJson;
        C2272BRp c2272BRp;
        boolean zA1a = AnonymousClass002.A1a(str, baseline);
        synchronized (LOCK) {
            AtomicFile atomicFileBaselineFile = baselineFile(str);
            try {
                fileOutputStreamStartWrite = atomicFileBaselineFile.startWrite();
            } catch (Exception e) {
                e = e;
            }
            try {
                c9sU = HatchJsonKt.HatchJson;
                F0C<C9hr<Object>>[] f0cArr = NodeSyncBaselineJson.$childSerializers;
                nodeSyncBaselineJson$$serializer = NodeSyncBaselineJson$$serializer.INSTANCE;
                nodeSyncBaselineJson = new NodeSyncBaselineJson(baseline.fingerprint, baseline.hashes, baseline.payloads);
                C7384Etj.A0X(fileOutputStreamStartWrite);
                C7384Etj.A0Y(c9sU, 0);
                C7384Etj.A0Y(nodeSyncBaselineJson$$serializer, zA1a ? 1 : 0);
                c2272BRp = new C2272BRp(fileOutputStreamStartWrite);
            } catch (Exception e2) {
                e = e2;
                if (fileOutputStreamStartWrite != null) {
                    atomicFileBaselineFile.failWrite(fileOutputStreamStartWrite);
                }
                CFK.A0D(TAG, "Failed to persist the %s baseline", e, str);
            }
            try {
                AbstractC07969sc.A00(nodeSyncBaselineJson, nodeSyncBaselineJson$$serializer, c9sU, c2272BRp);
                C2272BRp.A01(c2272BRp);
                BQF.A00.A00(c2272BRp.A01);
                BS3.A00.A00(c2272BRp.A02);
                atomicFileBaselineFile.finishWrite(fileOutputStreamStartWrite);
            } catch (Throwable th) {
                C2272BRp.A01(c2272BRp);
                BQF.A00.A00(c2272BRp.A01);
                BS3.A00.A00(c2272BRp.A02);
                throw th;
            }
        }
    }

    public final Baseline read(String str) {
        Baseline baseline;
        C7384Etj.A0Y(str, 0);
        synchronized (LOCK) {
            AtomicFile atomicFileBaselineFile = baselineFile(str);
            baseline = null;
            if (atomicFileBaselineFile.getBaseFile().exists()) {
                try {
                    FileInputStream fileInputStreamOpenRead = atomicFileBaselineFile.openRead();
                    try {
                        C9sU c9sU = HatchJsonKt.HatchJson;
                        F0C<C9hr<Object>>[] f0cArr = NodeSyncBaselineJson.$childSerializers;
                        NodeSyncBaselineJson$$serializer nodeSyncBaselineJson$$serializer = NodeSyncBaselineJson$$serializer.INSTANCE;
                        C7384Etj.A0X(fileInputStreamOpenRead);
                        NodeSyncBaselineJson nodeSyncBaselineJson = (NodeSyncBaselineJson) AbstractC07979sd.A00(fileInputStreamOpenRead, nodeSyncBaselineJson$$serializer, c9sU);
                        fileInputStreamOpenRead.close();
                        baseline = new Baseline(nodeSyncBaselineJson.fingerprint, nodeSyncBaselineJson.hashes, nodeSyncBaselineJson.payloads);
                    } finally {
                    }
                } catch (Exception e) {
                    CFK.A0D(TAG, "Failed to read the %s baseline", e, str);
                }
            }
        }
        return baseline;
    }

    public final void reset(String str) {
        C7384Etj.A0Y(str, 0);
        synchronized (LOCK) {
            baselineFile(str).delete();
        }
    }

    private final File userDirectory() {
        File file = new File(Companion.rootDirectory(), ((CH0) this.userSession).A01);
        if (!file.exists()) {
            BzK bzKA9q = AuraUserPrefs.INSTANCE.get(((CH0) this.userSession).A01, AuraUserPrefStore.NODE_SYNC_BASELINE).A9q();
            bzKA9q.A08();
            bzKA9q.apply();
            file.mkdirs();
        }
        return file;
    }

    private final AtomicFile baselineFile(String str) {
        return new AtomicFile(new File(userDirectory(), fileName(str)));
    }

    private final String fileName(String str) {
        return BFI.A0C(".json", AnonymousClass1.INSTANCE, C3cG.A1S(str));
    }
}
