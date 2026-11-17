package X;

import com.facebook.aura.common.prefs.AuraPrefsStorage;
import com.facebook.aura.common.prefs.HatchPrefsStore;
import com.facebook.crudolib.prefs.LightSharedPreferencesImpl;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class BzK implements C7bS {
    public final Map<String, Object> A00 = new HashMap(4);
    public volatile boolean A01;
    public volatile boolean A02;
    public final /* synthetic */ LightSharedPreferencesImpl A03;

    private final synchronized void A04() {
        this.A01 = false;
    }

    public final void A0A(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        A05(this);
        this.A00.put(str, Boolean.valueOf(z));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.DP1, java.util.AbstractCollection, java.util.Set] */
    public final boolean A0B(int i) {
        Map<String, Object> map;
        if (i != 0 && C3cH.A1K()) {
            CFK.A07("LightSharedPreferencesImpl", "commit is called on the main thread.");
        }
        synchronized (this) {
            if (this.A01) {
                throw BV4.A0c("Trying to freeze an editor that is already frozen!");
            }
            this.A01 = true;
            map = this.A00;
        }
        try {
            ?? A00 = A00(map);
            if (A00.isEmpty()) {
                return true;
            }
            LightSharedPreferencesImpl.A03(this.A03, A00);
            return A07(this);
        } finally {
            A04();
        }
    }

    @Override // X.C7bS
    public final void AYo(String str, int i) {
        C7384Etj.A0Y(str, 0);
        A05(this);
        BV4.A1H(str, this.A00, i);
    }

    @Override // X.C7bS
    public final void AYp(String str, long j) {
        C7384Etj.A0Y(str, 0);
        A05(this);
        BV4.A1I(str, this.A00, j);
    }

    @Override // X.C7bS
    public final void AYr(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        A05(this);
        Map<String, Object> map = this.A00;
        Object obj = str2;
        if (str2 == null) {
            obj = LightSharedPreferencesImpl.A0D;
        }
        map.put(str, obj);
    }

    @Override // X.C7bS
    public final void Aae(String str) {
        C7384Etj.A0Y(str, 0);
        A05(this);
        this.A00.put(str, LightSharedPreferencesImpl.A0D);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.DP1, java.util.AbstractCollection, java.util.Set] */
    @Override // X.C7bS
    public final void apply() {
        Map<String, Object> map;
        synchronized (this) {
            if (this.A01) {
                throw new RuntimeException("Trying to freeze an editor that is already frozen!");
            }
            this.A01 = true;
            map = this.A00;
        }
        try {
            ?? A00 = A00(map);
            if (!A00.isEmpty()) {
                LightSharedPreferencesImpl lightSharedPreferencesImpl = this.A03;
                LightSharedPreferencesImpl.A03(lightSharedPreferencesImpl, A00);
                lightSharedPreferencesImpl.A09.execute(new RunnableC3139BzL(this));
            }
        } finally {
            A04();
        }
    }

    @Override // X.C7bS
    public final boolean commit() {
        return A0B(0);
    }

    public BzK(LightSharedPreferencesImpl lightSharedPreferencesImpl) {
        this.A03 = lightSharedPreferencesImpl;
    }

    private final Set<String> A00(Map<String, Object> map) {
        DP1 dp1 = new DP1();
        LightSharedPreferencesImpl lightSharedPreferencesImpl = this.A03;
        synchronized (lightSharedPreferencesImpl.A03) {
            if (this.A02) {
                Map<String, Object> map2 = lightSharedPreferencesImpl.A06;
                dp1.addAll(map2.keySet());
                map2.clear();
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == LightSharedPreferencesImpl.A0D) {
                    lightSharedPreferencesImpl.A06.remove(key);
                } else {
                    value.getClass();
                    Map<String, Object> map3 = lightSharedPreferencesImpl.A06;
                    if (!value.equals(map3.get(key))) {
                        map3.put(key, value);
                    }
                }
                dp1.add(key);
            }
            lightSharedPreferencesImpl.A0A.compareAndSet(false, !dp1.isEmpty());
        }
        this.A02 = false;
        map.clear();
        return dp1;
    }

    public static BzK A01() {
        LightSharedPreferencesImpl lightSharedPreferencesImpl = (LightSharedPreferencesImpl) HatchPrefsStore.INSTANCE.internalPrefs();
        LightSharedPreferencesImpl.A02(lightSharedPreferencesImpl);
        return new BzK(lightSharedPreferencesImpl);
    }

    public static BzK A02(Object obj) {
        LightSharedPreferencesImpl lightSharedPreferencesImpl = (LightSharedPreferencesImpl) obj;
        LightSharedPreferencesImpl.A02(lightSharedPreferencesImpl);
        return new BzK(lightSharedPreferencesImpl);
    }

    public static final void A05(BzK bzK) {
        if (bzK.A01) {
            throw new ConcurrentModificationException("Editors shouldn't be modified during commit!");
        }
    }

    public static void A06(BzK bzK, String str) {
        bzK.Aae(FGI.A0M(str, ".pause_token_refresh"));
        bzK.Aae(FGI.A0M(str, ".regis_tried_count"));
        bzK.apply();
    }

    public static final boolean A07(BzK bzK) throws IOException {
        HashMap map;
        LightSharedPreferencesImpl lightSharedPreferencesImpl = bzK.A03;
        AtomicBoolean atomicBoolean = lightSharedPreferencesImpl.A0A;
        if (!atomicBoolean.get()) {
            return true;
        }
        synchronized (lightSharedPreferencesImpl.A03) {
            atomicBoolean.set(false);
            map = new HashMap(lightSharedPreferencesImpl.A06);
        }
        try {
            C3140BzM c3140BzM = lightSharedPreferencesImpl.A02;
            File file = c3140BzM.A01.AMN();
            File fileCreateTempFile = File.createTempFile(FGI.A0M(file.getName(), "."), AuraPrefsStorage.TEMP_FILE_SUFFIX, file.getParentFile());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(fileOutputStream, 512));
                dataOutputStream.writeByte(1);
                dataOutputStream.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    int i = 0;
                    C7384Etj.A0Y(value, 0);
                    if (!(value instanceof Boolean)) {
                        if (value instanceof Integer) {
                            i = 1;
                        } else if (value instanceof Long) {
                            i = 2;
                        } else if (value instanceof Float) {
                            i = 3;
                        } else if (value instanceof Double) {
                            i = 4;
                        } else if (value instanceof String) {
                            i = 5;
                        } else {
                            if (!(value instanceof Set)) {
                                Class<?> cls = value.getClass();
                                StringBuilder sb = new StringBuilder("Unsupported type: ");
                                sb.append(cls);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            i = 6;
                        }
                    }
                    dataOutputStream.write(i);
                    dataOutputStream.writeUTF(str);
                    switch (i) {
                        case 0:
                            dataOutputStream.writeBoolean(((Boolean) value).booleanValue());
                            break;
                        case 1:
                            dataOutputStream.writeInt(((Integer) value).intValue());
                            break;
                        case 2:
                            dataOutputStream.writeLong(((Long) value).longValue());
                            break;
                        case 3:
                            dataOutputStream.writeFloat(((Float) value).floatValue());
                            break;
                        case 4:
                            dataOutputStream.writeDouble(((Double) value).doubleValue());
                            break;
                        case 5:
                            dataOutputStream.writeUTF((String) value);
                            break;
                        default:
                            Set set = (Set) value;
                            C7384Etj.A0Y(set, 1);
                            dataOutputStream.writeInt(set.size());
                            Iterator it = set.iterator();
                            while (it.hasNext()) {
                                dataOutputStream.writeUTF((String) it.next());
                            }
                            break;
                    }
                }
                dataOutputStream.flush();
                fileOutputStream.close();
                synchronized (c3140BzM.A00) {
                    try {
                        if (!fileCreateTempFile.renameTo(file)) {
                            if (!fileCreateTempFile.delete()) {
                                CFK.A06("LightSharedPreferencesStorage", "Unable to delete temporary preferences file.");
                            }
                            throw new IOException("Failed to replace the current preference file!");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AbstractC7531Ezs.A00(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (IOException e) {
            CFK.A0A("LightSharedPreferencesImpl", "Commit to disk failed.", e);
            return false;
        }
    }

    public static BzK A03(F0C f0c) {
        LightSharedPreferencesImpl lightSharedPreferencesImpl = (LightSharedPreferencesImpl) ((C4oT) f0c.getValue());
        LightSharedPreferencesImpl.A02(lightSharedPreferencesImpl);
        return new BzK(lightSharedPreferencesImpl);
    }

    public final void A08() {
        A05(this);
        this.A02 = true;
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/String;Ljava/util/Set<Ljava/lang/String;>;)LX/7bS; */
    public final void A09(String str, Set set) {
        A05(this);
        Map<String, Object> map = this.A00;
        Object obj = set;
        if (set == null) {
            obj = LightSharedPreferencesImpl.A0D;
        }
        map.put(str, obj);
    }
}
