package X;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.util.SparseArray;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.aura.mobileconfig.emergencypush.AuraMobileConfigEmergencyPushHandler;
import com.facebook.aura.mobileconfig.session.AuraMobileConfigSession$create$builder$1;
import com.facebook.aura.mobileconfig.session.AuraMobileConfigSessionKt$sam$com_facebook_mobileconfig_impl_MobileConfigFactoryImpl_ManagerHolderCreator$0;
import com.facebook.aura.pairs.PairsInviteMailboxKt;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.mobileconfig.MobileConfigCxxChangeListener;
import com.facebook.mobileconfig.MobileConfigEmergencyPushChangeListener;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import com.facebook.mobileconfig.MobileConfigUpdateOverridesTableCallback;
import com.facebook.mobileconfig.factory.MobileConfigValueSource;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes5.dex */
public final class DRZ implements MobileConfigCxxChangeListener, MobileConfigEmergencyPushChangeListener, DRX {
    public DS5 A00;
    public F18<C3143BzU> A01;
    public final int A03;
    public final AssetManager A04;
    public final AuraMobileConfigSession$create$builder$1 A05;
    public final AuraMobileConfigSessionKt$sam$com_facebook_mobileconfig_impl_MobileConfigFactoryImpl_ManagerHolderCreator$0 A06;
    public final DS4 A08;
    public final C5057DRi A09;
    public final File A0A;
    public final Set A0D;
    public final boolean A0I;
    public final AuraMobileConfigEmergencyPushHandler A0J;
    public final C4997DMn A0K;
    public final C4997DMn A0L;
    public final C4997DMn A0M;
    public final C4997DMn A0N;
    public final boolean A0Q;
    public volatile DSU A0S;
    public volatile AtomicIntegerArray A0T;
    public volatile AtomicReferenceArray<DSU> A0U;
    public volatile AtomicReferenceArray<DSU> A0V;
    public volatile F18 A0W;
    public C3143BzU A02 = null;
    public final AtomicBoolean A0H = BV4.A12(false);
    public final AtomicBoolean A0F = BV4.A12(true);
    public final AtomicBoolean A0E = BV4.A12(false);
    public final Object A0B = C3cG.A0T();
    public final AtomicBoolean A0G = BV4.A12(false);
    public volatile EnumC7514Eye A0R = EnumC7514Eye.NONE;
    public final Set<Long> A0P = C60O.A18();
    public final Set<Long> A0C = Collections.synchronizedSet(C60O.A13());
    public final Bzd A07 = new Bzd();
    public final Random A0O = new Random();

    public final synchronized C5057DRi A09() {
        return this.A09;
    }

    public final synchronized void A0C(InterfaceC5058DRj interfaceC5058DRj) {
        C5057DRi c5057DRi = this.A09;
        synchronized (c5057DRi) {
            InterfaceC5058DRj interfaceC5058DRjA01 = c5057DRi.A01();
            c5057DRi.A02 = interfaceC5058DRj;
            c5057DRi.A01 = this;
            if (c5057DRi.A00 != null) {
                c5057DRi.A02.setResolvedParamsReceiver(c5057DRi.A00);
            }
            if ((interfaceC5058DRjA01 instanceof C5051DRb) && (c5057DRi.A02 instanceof MobileConfigManagerHolderImpl)) {
                C5051DRb c5051DRb = (C5051DRb) interfaceC5058DRjA01;
                Set setUnmodifiableSet = Collections.unmodifiableSet(BV4.A0x(c5051DRb.A0A));
                DSU dsuA07 = A07(0);
                Iterator it = setUnmodifiableSet.iterator();
                while (it.hasNext()) {
                    dsuA07.logExposure(((Long) it.next()).longValue());
                }
                Set<DSR> setUnmodifiableSet2 = Collections.unmodifiableSet(BV4.A0x(c5051DRb.A09));
                HashSet hashSetA13 = C60O.A13();
                Iterator it2 = setUnmodifiableSet2.iterator();
                while (it2.hasNext()) {
                    hashSetA13.add(((DSR) it2.next()).A02);
                }
                Set<String> setTryLogExposuresInJava = interfaceC5058DRj.tryLogExposuresInJava(hashSetA13);
                for (DSR dsr : setUnmodifiableSet2) {
                    String str = dsr.A02;
                    if (setTryLogExposuresInJava.contains(str)) {
                        interfaceC5058DRj.logExposure(str, dsr.A00, dsr.A03, dsr.A01);
                    }
                }
                for (DSR dsr2 : Collections.unmodifiableSet(BV4.A0x(c5051DRb.A08))) {
                    interfaceC5058DRj.logAccessWithoutExposure(dsr2.A02, dsr2.A01);
                }
                interfaceC5058DRj.isValid();
            } else {
                interfaceC5058DRj.isValid();
            }
        }
        if (interfaceC5058DRj instanceof MobileConfigManagerHolderImpl) {
            MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl = (MobileConfigManagerHolderImpl) interfaceC5058DRj;
            mobileConfigManagerHolderImpl.mOverridesTableCallback = new MobileConfigUpdateOverridesTableCallback() { // from class: X.DS9
                @Override // com.facebook.mobileconfig.MobileConfigUpdateOverridesTableCallback
                public final void onOverridesFileUpdated() {
                    CA6.A01(DRZ.A02(this.A00)).A03();
                }
            };
            CFK.A02(DSB.A00(this.A03), mobileConfigManagerHolderImpl.registerConfigChangeListener(this) ? PairsInviteMailboxKt.OUTCOME_OK : "fail", "MobileConfigFactoryImpl", "Registered %s factory change listener: %s");
            mobileConfigManagerHolderImpl.setEpHandler(this);
            CFK.A05("MobileConfigFactoryImpl", "Set Java EP Handler");
        }
        this.A00 = c5057DRi.A02.getOrCreateOverridesTable();
        if (A02(this).exists()) {
            CA6.A01(A02(this)).A03();
        }
    }

    @Override // X.InterfaceC5054DRe
    public final synchronized void addChangeListener(DSh dSh) {
        Bs9 bs9 = DSd.A00;
        if (bs9 == null) {
            bs9 = new Bs9();
            DSd.A00 = bs9;
        }
        synchronized (bs9) {
            throw BV4.A0a("getConfigKey");
        }
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final double getDoubleWithOptions(long j, C4992DKo c4992DKo) {
        return getDoubleWithOptions(j, DSC.A00(j), c4992DKo);
    }

    @Override // X.InterfaceC5054DRe
    public final Map<Integer, Integer> getEmergencyPushInfo() {
        return A08(-1).getEmergencyPushInfo();
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final long getLongWithOptions(long j, C4992DKo c4992DKo) {
        return getLongWithOptions(j, DSC.A01(j), c4992DKo);
    }

    public DRZ(AssetManager assetManager, AuraMobileConfigEmergencyPushHandler auraMobileConfigEmergencyPushHandler, AuraMobileConfigSession$create$builder$1 auraMobileConfigSession$create$builder$1, AuraMobileConfigSessionKt$sam$com_facebook_mobileconfig_impl_MobileConfigFactoryImpl_ManagerHolderCreator$0 auraMobileConfigSessionKt$sam$com_facebook_mobileconfig_impl_MobileConfigFactoryImpl_ManagerHolderCreator$0, DS4 ds4, C5057DRi c5057DRi, File file, Set set, F18 f18, F18 f182, int i, boolean z) {
        this.A09 = c5057DRi;
        this.A0J = auraMobileConfigEmergencyPushHandler;
        this.A03 = i;
        this.A0A = file;
        this.A04 = assetManager;
        this.A0D = set;
        this.A0Q = !set.isEmpty();
        this.A0W = f18;
        this.A0I = z;
        this.A01 = f182;
        this.A05 = auraMobileConfigSession$create$builder$1;
        this.A06 = auraMobileConfigSessionKt$sam$com_facebook_mobileconfig_impl_MobileConfigFactoryImpl_ManagerHolderCreator$0;
        this.A08 = ds4;
        DS5 orCreateOverridesTable = c5057DRi.A02.getOrCreateOverridesTable();
        this.A00 = orCreateOverridesTable;
        this.A0K = new C4997DMn(orCreateOverridesTable, MobileConfigValueSource.DEFAULT__ACCESSED_AFTER_MC_DISPOSE, ds4);
        this.A0L = new C4997DMn(orCreateOverridesTable, MobileConfigValueSource.DEFAULT__ACCESSED_BEFORE_MC_INIT, ds4);
        this.A0M = new C4997DMn(orCreateOverridesTable, MobileConfigValueSource.DEFAULT__INVALID_CONFIG_PARAM_NAME, ds4);
        this.A0N = new C4997DMn(orCreateOverridesTable, MobileConfigValueSource.DEFAULT__SERVICE_NOT_FOUND, ds4);
        this.A0S = null;
        this.A0V = new AtomicReferenceArray<>(10000);
        this.A0U = new AtomicReferenceArray<>(10000);
        this.A0T = new AtomicIntegerArray(10000);
    }

    private final DSU A00(long j) {
        return A07((int) ((j >>> 32) & 65535));
    }

    private AbstractC5052DRc A01() {
        C5057DRi c5057DRi = this.A09;
        DSZ latestHandle = c5057DRi.A02.getLatestHandle();
        if (latestHandle == null || latestHandle.getJavaByteBuffer() == null) {
            CFK.A02(DSB.A00(this.A03), Boolean.valueOf(AnonymousClass002.A1Y(latestHandle)), "MobileConfigFactoryImpl", "No contextV2 from null buffer, probably fresh install/login, unitType: %s, null handleHolder: %b");
            if (c5057DRi.A01() instanceof C5055DRf) {
                return this.A0L;
            }
        }
        for (InterfaceC5058DRj interfaceC5058DRjA09 = A09(); interfaceC5058DRjA09 instanceof C5057DRi; interfaceC5058DRjA09 = ((C5057DRi) interfaceC5058DRjA09).A01()) {
        }
        return new C5056DRh(latestHandle, c5057DRi, this.A00, this.A08);
    }

    public static File A02(DRZ drz) {
        String dataDirPath = drz.A09.A02.getDataDirPath();
        if (dataDirPath == null || dataDirPath.isEmpty()) {
            File file = drz.A0A;
            dataDirPath = file == null ? null : file.getPath();
        }
        return C3cG.A0O(new File(dataDirPath, "mobileconfig"), "mc_overrides.json");
    }

    private Set A03() {
        boolean z = this.A0Q;
        Set hashSet = Collections.EMPTY_SET;
        if (z) {
            for (CGP cgp : this.A0D) {
                if (this.A0O.nextInt(cgp.A01 ? 1 : Integer.MAX_VALUE) == 0) {
                    if (hashSet.isEmpty()) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(cgp);
                }
            }
        }
        return hashSet;
    }

    private void A04(long j, String str) {
        CFK.A06("MobileConfigFactoryImpl", StringFormatUtil.formatStrLocaleSafe("Invalid param type used for %d:%d(configKey:paramKey), %d(paramSpecifier); return value: %s.", Integer.valueOf(((j >>> 62) & 1) == 1 ? ((int) ((j >>> 16) & 4294967295L)) >>> 12 : -1), Integer.valueOf(CA5.A00(j)), Long.valueOf(j), str));
    }

    private boolean A05() {
        String userId;
        int i = this.A03;
        if (i == 2 || i == 4) {
            AuraMobileConfigSession$create$builder$1 auraMobileConfigSession$create$builder$1 = this.A05;
            if (auraMobileConfigSession$create$builder$1 == null || (userId = auraMobileConfigSession$create$builder$1.getUserId()) == null) {
                userId = "";
            }
            if ("".equals(userId)) {
                return true;
            }
        }
        return false;
    }

    private boolean A06(long j) {
        int i = this.A03;
        int i2 = (int) ((j >>> 54) & 63);
        if (i == i2) {
            return true;
        }
        CFK.A06("MobileConfigFactoryImpl", StringFormatUtil.formatStrLocaleSafe("%s factory used for %s param %d:%d(configKey:paramKey), %d(paramSpecifier)", DSB.A00(i), DSB.A00(i2), Integer.valueOf(((j >>> 62) & 1) == 1 ? ((int) ((j >>> 16) & 4294967295L)) >>> 12 : -1), Integer.valueOf(CA5.A00(j)), Long.valueOf(j)));
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.DSU A07(int r13) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DRZ.A07(int):X.DSU");
    }

    /* JADX WARN: Code restructure failed: missing block: B:257:0x0467, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x046b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x046c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0470, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x019c A[Catch: all -> 0x0462, EDGE_INSN: B:60:0x0118->B:106:0x019c BREAK  A[LOOP:3: B:67:0x013c->B:319:?], Merged into Merged into TryCatch #5 {all -> 0x046c, all -> 0x0467, all -> 0x0462, blocks: (B:40:0x0087, B:221:0x03f4, B:223:0x03f9, B:225:0x0406, B:226:0x0407, B:258:0x0468, B:259:0x046b, B:41:0x008c, B:210:0x03c5, B:214:0x03d9, B:215:0x03dd, B:217:0x03e2, B:255:0x0463, B:256:0x0466, B:42:0x0095, B:44:0x00a6, B:46:0x00ac, B:48:0x00cc, B:50:0x00d4, B:52:0x00de, B:54:0x00ea, B:56:0x00f2, B:60:0x0118, B:106:0x019c, B:112:0x01b3, B:114:0x01bd, B:116:0x01c7, B:118:0x01cd, B:119:0x01d7, B:121:0x01dd, B:122:0x01e5, B:123:0x01e6, B:126:0x01eb, B:128:0x01f5, B:130:0x020f, B:131:0x0212, B:133:0x021d, B:135:0x0227, B:136:0x022b, B:138:0x0241, B:140:0x024b, B:142:0x0256, B:143:0x025d, B:144:0x0266, B:145:0x0268, B:180:0x0362, B:252:0x0460, B:253:0x0461, B:181:0x0363, B:184:0x036e, B:185:0x0372, B:187:0x0375, B:189:0x0378, B:190:0x037a, B:192:0x0380, B:193:0x038a, B:195:0x038e, B:197:0x0394, B:208:0x03b5, B:199:0x039a, B:201:0x03a4, B:202:0x03a6, B:204:0x03a9, B:249:0x045d, B:207:0x03ad, B:209:0x03bd, B:61:0x011e, B:67:0x013c, B:79:0x0154, B:84:0x015e, B:90:0x0172, B:92:0x0178, B:94:0x0181, B:95:0x0185, B:247:0x044c, B:108:0x01a6, B:110:0x01ac, B:111:0x01ae, B:125:0x01e8, B:86:0x0165, B:88:0x016c, B:203:0x03a7, B:146:0x0269, B:147:0x026e, B:148:0x0277, B:150:0x027d, B:151:0x0283, B:152:0x028a, B:154:0x0290, B:156:0x0299, B:160:0x02a7, B:161:0x02b1, B:162:0x02d5, B:164:0x02e5, B:165:0x02ea, B:166:0x02f2, B:168:0x02f8, B:169:0x0323, B:171:0x0341, B:176:0x0356, B:175:0x0353, B:177:0x0357, B:179:0x035b, B:186:0x0373), top: B:286:0x0087, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01bd A[Catch: all -> 0x0462, Merged into Merged into TryCatch #5 {all -> 0x046c, all -> 0x0467, all -> 0x0462, blocks: (B:40:0x0087, B:221:0x03f4, B:223:0x03f9, B:225:0x0406, B:226:0x0407, B:258:0x0468, B:259:0x046b, B:41:0x008c, B:210:0x03c5, B:214:0x03d9, B:215:0x03dd, B:217:0x03e2, B:255:0x0463, B:256:0x0466, B:42:0x0095, B:44:0x00a6, B:46:0x00ac, B:48:0x00cc, B:50:0x00d4, B:52:0x00de, B:54:0x00ea, B:56:0x00f2, B:60:0x0118, B:106:0x019c, B:112:0x01b3, B:114:0x01bd, B:116:0x01c7, B:118:0x01cd, B:119:0x01d7, B:121:0x01dd, B:122:0x01e5, B:123:0x01e6, B:126:0x01eb, B:128:0x01f5, B:130:0x020f, B:131:0x0212, B:133:0x021d, B:135:0x0227, B:136:0x022b, B:138:0x0241, B:140:0x024b, B:142:0x0256, B:143:0x025d, B:144:0x0266, B:145:0x0268, B:180:0x0362, B:252:0x0460, B:253:0x0461, B:181:0x0363, B:184:0x036e, B:185:0x0372, B:187:0x0375, B:189:0x0378, B:190:0x037a, B:192:0x0380, B:193:0x038a, B:195:0x038e, B:197:0x0394, B:208:0x03b5, B:199:0x039a, B:201:0x03a4, B:202:0x03a6, B:204:0x03a9, B:249:0x045d, B:207:0x03ad, B:209:0x03bd, B:61:0x011e, B:67:0x013c, B:79:0x0154, B:84:0x015e, B:90:0x0172, B:92:0x0178, B:94:0x0181, B:95:0x0185, B:247:0x044c, B:108:0x01a6, B:110:0x01ac, B:111:0x01ae, B:125:0x01e8, B:86:0x0165, B:88:0x016c, B:203:0x03a7, B:146:0x0269, B:147:0x026e, B:148:0x0277, B:150:0x027d, B:151:0x0283, B:152:0x028a, B:154:0x0290, B:156:0x0299, B:160:0x02a7, B:161:0x02b1, B:162:0x02d5, B:164:0x02e5, B:165:0x02ea, B:166:0x02f2, B:168:0x02f8, B:169:0x0323, B:171:0x0341, B:176:0x0356, B:175:0x0353, B:177:0x0357, B:179:0x035b, B:186:0x0373), top: B:286:0x0087, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x037a A[Catch: all -> 0x0462, Merged into Merged into TryCatch #5 {all -> 0x046c, all -> 0x0467, all -> 0x0462, blocks: (B:40:0x0087, B:221:0x03f4, B:223:0x03f9, B:225:0x0406, B:226:0x0407, B:258:0x0468, B:259:0x046b, B:41:0x008c, B:210:0x03c5, B:214:0x03d9, B:215:0x03dd, B:217:0x03e2, B:255:0x0463, B:256:0x0466, B:42:0x0095, B:44:0x00a6, B:46:0x00ac, B:48:0x00cc, B:50:0x00d4, B:52:0x00de, B:54:0x00ea, B:56:0x00f2, B:60:0x0118, B:106:0x019c, B:112:0x01b3, B:114:0x01bd, B:116:0x01c7, B:118:0x01cd, B:119:0x01d7, B:121:0x01dd, B:122:0x01e5, B:123:0x01e6, B:126:0x01eb, B:128:0x01f5, B:130:0x020f, B:131:0x0212, B:133:0x021d, B:135:0x0227, B:136:0x022b, B:138:0x0241, B:140:0x024b, B:142:0x0256, B:143:0x025d, B:144:0x0266, B:145:0x0268, B:180:0x0362, B:252:0x0460, B:253:0x0461, B:181:0x0363, B:184:0x036e, B:185:0x0372, B:187:0x0375, B:189:0x0378, B:190:0x037a, B:192:0x0380, B:193:0x038a, B:195:0x038e, B:197:0x0394, B:208:0x03b5, B:199:0x039a, B:201:0x03a4, B:202:0x03a6, B:204:0x03a9, B:249:0x045d, B:207:0x03ad, B:209:0x03bd, B:61:0x011e, B:67:0x013c, B:79:0x0154, B:84:0x015e, B:90:0x0172, B:92:0x0178, B:94:0x0181, B:95:0x0185, B:247:0x044c, B:108:0x01a6, B:110:0x01ac, B:111:0x01ae, B:125:0x01e8, B:86:0x0165, B:88:0x016c, B:203:0x03a7, B:146:0x0269, B:147:0x026e, B:148:0x0277, B:150:0x027d, B:151:0x0283, B:152:0x028a, B:154:0x0290, B:156:0x0299, B:160:0x02a7, B:161:0x02b1, B:162:0x02d5, B:164:0x02e5, B:165:0x02ea, B:166:0x02f2, B:168:0x02f8, B:169:0x0323, B:171:0x0341, B:176:0x0356, B:175:0x0353, B:177:0x0357, B:179:0x035b, B:186:0x0373), top: B:286:0x0087, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0380 A[Catch: all -> 0x0462, Merged into Merged into TryCatch #5 {all -> 0x046c, all -> 0x0467, all -> 0x0462, blocks: (B:40:0x0087, B:221:0x03f4, B:223:0x03f9, B:225:0x0406, B:226:0x0407, B:258:0x0468, B:259:0x046b, B:41:0x008c, B:210:0x03c5, B:214:0x03d9, B:215:0x03dd, B:217:0x03e2, B:255:0x0463, B:256:0x0466, B:42:0x0095, B:44:0x00a6, B:46:0x00ac, B:48:0x00cc, B:50:0x00d4, B:52:0x00de, B:54:0x00ea, B:56:0x00f2, B:60:0x0118, B:106:0x019c, B:112:0x01b3, B:114:0x01bd, B:116:0x01c7, B:118:0x01cd, B:119:0x01d7, B:121:0x01dd, B:122:0x01e5, B:123:0x01e6, B:126:0x01eb, B:128:0x01f5, B:130:0x020f, B:131:0x0212, B:133:0x021d, B:135:0x0227, B:136:0x022b, B:138:0x0241, B:140:0x024b, B:142:0x0256, B:143:0x025d, B:144:0x0266, B:145:0x0268, B:180:0x0362, B:252:0x0460, B:253:0x0461, B:181:0x0363, B:184:0x036e, B:185:0x0372, B:187:0x0375, B:189:0x0378, B:190:0x037a, B:192:0x0380, B:193:0x038a, B:195:0x038e, B:197:0x0394, B:208:0x03b5, B:199:0x039a, B:201:0x03a4, B:202:0x03a6, B:204:0x03a9, B:249:0x045d, B:207:0x03ad, B:209:0x03bd, B:61:0x011e, B:67:0x013c, B:79:0x0154, B:84:0x015e, B:90:0x0172, B:92:0x0178, B:94:0x0181, B:95:0x0185, B:247:0x044c, B:108:0x01a6, B:110:0x01ac, B:111:0x01ae, B:125:0x01e8, B:86:0x0165, B:88:0x016c, B:203:0x03a7, B:146:0x0269, B:147:0x026e, B:148:0x0277, B:150:0x027d, B:151:0x0283, B:152:0x028a, B:154:0x0290, B:156:0x0299, B:160:0x02a7, B:161:0x02b1, B:162:0x02d5, B:164:0x02e5, B:165:0x02ea, B:166:0x02f2, B:168:0x02f8, B:169:0x0323, B:171:0x0341, B:176:0x0356, B:175:0x0353, B:177:0x0357, B:179:0x035b, B:186:0x0373), top: B:286:0x0087, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x038a A[Catch: all -> 0x0462, Merged into Merged into TryCatch #5 {all -> 0x046c, all -> 0x0467, all -> 0x0462, blocks: (B:40:0x0087, B:221:0x03f4, B:223:0x03f9, B:225:0x0406, B:226:0x0407, B:258:0x0468, B:259:0x046b, B:41:0x008c, B:210:0x03c5, B:214:0x03d9, B:215:0x03dd, B:217:0x03e2, B:255:0x0463, B:256:0x0466, B:42:0x0095, B:44:0x00a6, B:46:0x00ac, B:48:0x00cc, B:50:0x00d4, B:52:0x00de, B:54:0x00ea, B:56:0x00f2, B:60:0x0118, B:106:0x019c, B:112:0x01b3, B:114:0x01bd, B:116:0x01c7, B:118:0x01cd, B:119:0x01d7, B:121:0x01dd, B:122:0x01e5, B:123:0x01e6, B:126:0x01eb, B:128:0x01f5, B:130:0x020f, B:131:0x0212, B:133:0x021d, B:135:0x0227, B:136:0x022b, B:138:0x0241, B:140:0x024b, B:142:0x0256, B:143:0x025d, B:144:0x0266, B:145:0x0268, B:180:0x0362, B:252:0x0460, B:253:0x0461, B:181:0x0363, B:184:0x036e, B:185:0x0372, B:187:0x0375, B:189:0x0378, B:190:0x037a, B:192:0x0380, B:193:0x038a, B:195:0x038e, B:197:0x0394, B:208:0x03b5, B:199:0x039a, B:201:0x03a4, B:202:0x03a6, B:204:0x03a9, B:249:0x045d, B:207:0x03ad, B:209:0x03bd, B:61:0x011e, B:67:0x013c, B:79:0x0154, B:84:0x015e, B:90:0x0172, B:92:0x0178, B:94:0x0181, B:95:0x0185, B:247:0x044c, B:108:0x01a6, B:110:0x01ac, B:111:0x01ae, B:125:0x01e8, B:86:0x0165, B:88:0x016c, B:203:0x03a7, B:146:0x0269, B:147:0x026e, B:148:0x0277, B:150:0x027d, B:151:0x0283, B:152:0x028a, B:154:0x0290, B:156:0x0299, B:160:0x02a7, B:161:0x02b1, B:162:0x02d5, B:164:0x02e5, B:165:0x02ea, B:166:0x02f2, B:168:0x02f8, B:169:0x0323, B:171:0x0341, B:176:0x0356, B:175:0x0353, B:177:0x0357, B:179:0x035b, B:186:0x0373), top: B:286:0x0087, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03f9 A[Catch: all -> 0x046c, TryCatch #5 {all -> 0x046c, all -> 0x0467, all -> 0x0462, blocks: (B:40:0x0087, B:221:0x03f4, B:223:0x03f9, B:225:0x0406, B:226:0x0407, B:258:0x0468, B:259:0x046b, B:41:0x008c, B:210:0x03c5, B:214:0x03d9, B:215:0x03dd, B:217:0x03e2, B:255:0x0463, B:256:0x0466, B:42:0x0095, B:44:0x00a6, B:46:0x00ac, B:48:0x00cc, B:50:0x00d4, B:52:0x00de, B:54:0x00ea, B:56:0x00f2, B:60:0x0118, B:106:0x019c, B:112:0x01b3, B:114:0x01bd, B:116:0x01c7, B:118:0x01cd, B:119:0x01d7, B:121:0x01dd, B:122:0x01e5, B:123:0x01e6, B:126:0x01eb, B:128:0x01f5, B:130:0x020f, B:131:0x0212, B:133:0x021d, B:135:0x0227, B:136:0x022b, B:138:0x0241, B:140:0x024b, B:142:0x0256, B:143:0x025d, B:144:0x0266, B:145:0x0268, B:180:0x0362, B:252:0x0460, B:253:0x0461, B:181:0x0363, B:184:0x036e, B:185:0x0372, B:187:0x0375, B:189:0x0378, B:190:0x037a, B:192:0x0380, B:193:0x038a, B:195:0x038e, B:197:0x0394, B:208:0x03b5, B:199:0x039a, B:201:0x03a4, B:202:0x03a6, B:204:0x03a9, B:249:0x045d, B:207:0x03ad, B:209:0x03bd, B:61:0x011e, B:67:0x013c, B:79:0x0154, B:84:0x015e, B:90:0x0172, B:92:0x0178, B:94:0x0181, B:95:0x0185, B:247:0x044c, B:108:0x01a6, B:110:0x01ac, B:111:0x01ae, B:125:0x01e8, B:86:0x0165, B:88:0x016c, B:203:0x03a7, B:146:0x0269, B:147:0x026e, B:148:0x0277, B:150:0x027d, B:151:0x0283, B:152:0x028a, B:154:0x0290, B:156:0x0299, B:160:0x02a7, B:161:0x02b1, B:162:0x02d5, B:164:0x02e5, B:165:0x02ea, B:166:0x02f2, B:168:0x02f8, B:169:0x0323, B:171:0x0341, B:176:0x0356, B:175:0x0353, B:177:0x0357, B:179:0x035b, B:186:0x0373), top: B:286:0x0087, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0178 A[Catch: all -> 0x0462, Merged into Merged into TryCatch #5 {all -> 0x046c, all -> 0x0467, all -> 0x0462, blocks: (B:40:0x0087, B:221:0x03f4, B:223:0x03f9, B:225:0x0406, B:226:0x0407, B:258:0x0468, B:259:0x046b, B:41:0x008c, B:210:0x03c5, B:214:0x03d9, B:215:0x03dd, B:217:0x03e2, B:255:0x0463, B:256:0x0466, B:42:0x0095, B:44:0x00a6, B:46:0x00ac, B:48:0x00cc, B:50:0x00d4, B:52:0x00de, B:54:0x00ea, B:56:0x00f2, B:60:0x0118, B:106:0x019c, B:112:0x01b3, B:114:0x01bd, B:116:0x01c7, B:118:0x01cd, B:119:0x01d7, B:121:0x01dd, B:122:0x01e5, B:123:0x01e6, B:126:0x01eb, B:128:0x01f5, B:130:0x020f, B:131:0x0212, B:133:0x021d, B:135:0x0227, B:136:0x022b, B:138:0x0241, B:140:0x024b, B:142:0x0256, B:143:0x025d, B:144:0x0266, B:145:0x0268, B:180:0x0362, B:252:0x0460, B:253:0x0461, B:181:0x0363, B:184:0x036e, B:185:0x0372, B:187:0x0375, B:189:0x0378, B:190:0x037a, B:192:0x0380, B:193:0x038a, B:195:0x038e, B:197:0x0394, B:208:0x03b5, B:199:0x039a, B:201:0x03a4, B:202:0x03a6, B:204:0x03a9, B:249:0x045d, B:207:0x03ad, B:209:0x03bd, B:61:0x011e, B:67:0x013c, B:79:0x0154, B:84:0x015e, B:90:0x0172, B:92:0x0178, B:94:0x0181, B:95:0x0185, B:247:0x044c, B:108:0x01a6, B:110:0x01ac, B:111:0x01ae, B:125:0x01e8, B:86:0x0165, B:88:0x016c, B:203:0x03a7, B:146:0x0269, B:147:0x026e, B:148:0x0277, B:150:0x027d, B:151:0x0283, B:152:0x028a, B:154:0x0290, B:156:0x0299, B:160:0x02a7, B:161:0x02b1, B:162:0x02d5, B:164:0x02e5, B:165:0x02ea, B:166:0x02f2, B:168:0x02f8, B:169:0x0323, B:171:0x0341, B:176:0x0356, B:175:0x0353, B:177:0x0357, B:179:0x035b, B:186:0x0373), top: B:286:0x0087, outer: #7 }] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.DSU] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.DSU A08(int r27) {
        /*
            Method dump skipped, instructions count: 1176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DRZ.A08(int):X.DSU");
    }

    public final C3143BzU A0A() {
        File file;
        if (this.A02 == null) {
            F18<C3143BzU> f18 = this.A01;
            C3143BzU c3143BzUAMN = f18 != null ? f18.AMN() : null;
            this.A02 = c3143BzUAMN;
            if (c3143BzUAMN != null && (file = this.A0A) != null) {
                String path = file.getPath();
                C3143BzU c3143BzU = this.A02;
                CA2 ca2 = new CA2();
                ca2.A02(path);
                if ((!ca2.A00.isEmpty()) && c3143BzU != null && !c3143BzU.A03.isEmpty()) {
                    this.A02 = ca2.A01(c3143BzU);
                }
            }
        }
        return this.A02;
    }

    @Override // X.InterfaceC5054DRe
    public final boolean getBoolean(C7491Exw<Boolean, ? extends Object> c7491Exw) {
        return getBooleanWithOptions(c7491Exw.A00, C4992DKo.A05);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final boolean getBooleanWithOptions(long j, C4992DKo c4992DKo) {
        return getBooleanWithOptions(j, ((j >>> 61) & 1) == 1, c4992DKo);
    }

    @Override // X.InterfaceC5054DRe
    public final double getDouble(C7491Exw<Double, ? extends Object> c7491Exw) {
        return getDoubleWithOptions(c7491Exw.A00, C4992DKo.A05);
    }

    @Override // X.InterfaceC5054DRe
    public final long getLong(C7491Exw<Long, ? extends Object> c7491Exw) {
        return getLongWithOptions(c7491Exw.A00, C4992DKo.A05);
    }

    @Override // X.InterfaceC5054DRe
    public final String getString(C7491Exw<String, ? extends Object> c7491Exw) {
        return getStringWithOptions(c7491Exw.A00, C4992DKo.A05);
    }

    @Override // X.InterfaceC5054DRe
    public final boolean hasExposure(C7491Exw<?, ? extends Object> c7491Exw) {
        long j = c7491Exw.A00;
        return A00(j).hasExposure(j);
    }

    @Override // com.facebook.mobileconfig.MobileConfigCxxChangeListener
    public final void onConfigChanged(String[] strArr) {
        AbstractC5052DRc abstractC5052DRcA01;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        CFK.A05("MobileConfigFactoryImpl", "Refreshing cached config context");
        synchronized (this) {
            try {
                abstractC5052DRcA01 = A01();
            } finally {
                this.A0S = abstractC5052DRcA01;
            }
            this.A0S = abstractC5052DRcA01;
        }
    }

    @Override // com.facebook.mobileconfig.MobileConfigEmergencyPushChangeListener
    public final boolean onEpConfigChanged(String[] strArr, String[] strArr2) throws NumberFormatException {
        int i;
        int i2;
        int i3;
        int i4;
        if (strArr != null && (strArr.length) != 0 && strArr2 != null && (strArr2.length) != 0) {
            C4995DKw c4995DKw = new C4995DKw();
            c4995DKw.A00 = BV4.A0B();
            for (String str : strArr) {
                String[] strArrSplit = str.split(",");
                if (strArrSplit.length == 7) {
                    String str2 = strArrSplit[0];
                    if (str2.matches("\\d+") && (i2 = Integer.parseInt(str2)) != -1) {
                        String str3 = strArrSplit[1];
                        if (str3.matches("\\d+") && (i3 = Integer.parseInt(str3)) > 0) {
                            String str4 = strArrSplit[2];
                            if (str4.matches("\\d+") && (i4 = Integer.parseInt(str4)) != -1) {
                                String str5 = strArrSplit[3];
                                boolean zA1S = str5.matches("\\d+") ? C8j3.A1S(Integer.parseInt(str5)) : false;
                                String str6 = strArrSplit[4];
                                int i5 = (zA1S && str6.matches("\\d+")) ? Integer.parseInt(str6) : -1;
                                String str7 = strArrSplit[5];
                                boolean zA1S2 = str7.matches("\\d+") ? C8j3.A1S(Integer.parseInt(str7)) : false;
                                String str8 = strArrSplit[6];
                                if (str8.matches("\\d+")) {
                                    Integer.parseInt(str8);
                                }
                                c4995DKw.A00.put(i2, new DKu(i3, i4, i5, zA1S, zA1S2));
                            }
                        }
                    }
                }
            }
            for (String str9 : strArr2) {
                String[] strArrSplit2 = str9.split(",");
                String str10 = strArrSplit2[0];
                if (str10.matches("\\d+") && (i = Integer.parseInt(str10)) != -1) {
                    HashSet hashSetA13 = C60O.A13();
                    for (int i6 = 1; i6 < strArrSplit2.length; i6++) {
                        String str11 = strArrSplit2[i6];
                        if (str11.matches("\\d+")) {
                            long j = Long.parseLong(str11);
                            if (j != -1) {
                                BV6.A1R(hashSetA13, j);
                            }
                        }
                    }
                    int iIndexOfKey = c4995DKw.A00.indexOfKey(i);
                    SparseArray<DKu> sparseArray = c4995DKw.A00;
                    if (iIndexOfKey >= 0) {
                        DKu dKu = sparseArray.get(i);
                        if (dKu != null) {
                            dKu.A00 = hashSetA13;
                        }
                    } else {
                        sparseArray.remove(i);
                    }
                }
            }
            AuraMobileConfigEmergencyPushHandler auraMobileConfigEmergencyPushHandler = this.A0J;
            if (auraMobileConfigEmergencyPushHandler != null) {
                return auraMobileConfigEmergencyPushHandler.onEpConfigChanged(c4995DKw, this);
            }
        }
        return false;
    }

    public final void A0B() {
        boolean zA05 = A05();
        CFK.A03(Boolean.valueOf(zA05), "MobileConfigFactoryImpl", "refreshSessionState isLoggedOut: %s");
        synchronized (this) {
            this.A00 = this.A09.A02.getOrCreateOverridesTable();
            this.A0V = new AtomicReferenceArray<>(10000);
            this.A0U = new AtomicReferenceArray<>(10000);
            this.A0T = new AtomicIntegerArray(10000);
            this.A0S = null;
            this.A0C.clear();
            Bzd bzd = this.A07;
            bzd.A00.clear();
            bzd.A01.set(false);
            if (zA05) {
                Bs9 bs9 = DSd.A00;
                if (bs9 == null) {
                    bs9 = new Bs9();
                    DSd.A00 = bs9;
                }
                synchronized (bs9) {
                    bs9.A00.clear();
                }
                this.A0G.set(false);
                this.A0H.set(false);
                this.A0F.set(true);
                this.A0E.set(false);
                this.A0W = null;
            }
        }
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final String getStringWithOptions(long j, C4992DKo c4992DKo) {
        return getStringWithOptions(j, DSC.A02(j), c4992DKo);
    }

    @Override // X.InterfaceC5054DRe
    public final boolean isAdvancedConsistencyLoggingEnabled(long j) {
        return A00(j).isAdvancedConsistencyLoggingEnabled(j);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final void logExposure(long j) {
        if (A06(j)) {
            A00(j).logExposure(j);
        }
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final boolean getBoolean(long j, boolean z) {
        if (A06(j)) {
            if (1 != BV8.A04(j)) {
                A04(j, String.valueOf(z));
            } else {
                return A00(j).getBoolean(j, z);
            }
        }
        return z;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final boolean getBooleanWithOptions(long j, boolean z, C4992DKo c4992DKo) {
        DSU dsuA00;
        MobileConfigValueSource mobileConfigValueSource;
        String str;
        Set setA03 = A03();
        if (!setA03.isEmpty()) {
            c4992DKo = C4992DKo.A00(c4992DKo);
            c4992DKo.A02 = true;
        }
        if (!A06(j)) {
            if (c4992DKo.A02) {
                mobileConfigValueSource = MobileConfigValueSource.DEFAULT__MISMATCH_UNIT_TYPE;
                c4992DKo.A01(mobileConfigValueSource);
            }
        } else if (1 != ((int) ((j >>> 48) & 63))) {
            A04(j, String.valueOf(z));
            if (c4992DKo.A02) {
                mobileConfigValueSource = MobileConfigValueSource.DEFAULT__MISMATCH_PARAM_TYPE;
                c4992DKo.A01(mobileConfigValueSource);
            }
        } else {
            if (c4992DKo.A01) {
                dsuA00 = A08((int) ((j >>> 32) & 65535));
            } else {
                dsuA00 = A00(j);
            }
            z = dsuA00.getBooleanWithOptions(j, z, c4992DKo);
        }
        if (!setA03.isEmpty()) {
            MobileConfigValueSource mobileConfigValueSource2 = c4992DKo.A00.A01;
            this.A09.syncFetchReason();
            if (z) {
                str = "1";
            } else {
                str = HatchPriceImpressionEventDataKt.NO_DISCOUNT;
            }
            Iterator it = setA03.iterator();
            while (it.hasNext()) {
                ((CGP) it.next()).A00(mobileConfigValueSource2.name(), str, j);
            }
        }
        return z;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final double getDouble(long j, double d) {
        if (A06(j)) {
            if (4 != BV8.A04(j)) {
                A04(j, String.valueOf(d));
            } else {
                return A00(j).getDouble(j, d);
            }
        }
        return d;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final double getDoubleWithOptions(long j, double d, C4992DKo c4992DKo) {
        DSU dsuA00;
        MobileConfigValueSource mobileConfigValueSource;
        double doubleWithOptions = d;
        C4992DKo c4992DKoA00 = c4992DKo;
        Set setA03 = A03();
        if (!setA03.isEmpty()) {
            c4992DKoA00 = C4992DKo.A00(c4992DKoA00);
            c4992DKoA00.A02 = true;
        }
        if (!A06(j)) {
            if (c4992DKoA00.A02) {
                mobileConfigValueSource = MobileConfigValueSource.DEFAULT__MISMATCH_UNIT_TYPE;
                c4992DKoA00.A01(mobileConfigValueSource);
            }
        } else if (4 != BV8.A04(j)) {
            A04(j, String.valueOf(doubleWithOptions));
            if (c4992DKoA00.A02) {
                mobileConfigValueSource = MobileConfigValueSource.DEFAULT__MISMATCH_PARAM_TYPE;
                c4992DKoA00.A01(mobileConfigValueSource);
            }
        } else {
            if (c4992DKoA00.A01) {
                dsuA00 = A08((int) ((j >>> 32) & 65535));
            } else {
                dsuA00 = A00(j);
            }
            doubleWithOptions = dsuA00.getDoubleWithOptions(j, doubleWithOptions, c4992DKoA00);
        }
        if (!setA03.isEmpty()) {
            MobileConfigValueSource mobileConfigValueSource2 = c4992DKoA00.A00.A01;
            this.A09.syncFetchReason();
            Iterator it = setA03.iterator();
            while (it.hasNext()) {
                ((CGP) it.next()).A00(mobileConfigValueSource2.name(), Double.toString(doubleWithOptions), j);
            }
        }
        return doubleWithOptions;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final long getLong(long j, long j2) {
        if (A06(j)) {
            if (2 != BV8.A04(j)) {
                A04(j, String.valueOf(j2));
            } else {
                return A00(j).getLong(j, j2);
            }
        }
        return j2;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final long getLongWithOptions(long j, long j2, C4992DKo c4992DKo) {
        DSU dsuA00;
        MobileConfigValueSource mobileConfigValueSource;
        long longWithOptions = j2;
        C4992DKo c4992DKoA00 = c4992DKo;
        Set setA03 = A03();
        if (!setA03.isEmpty()) {
            c4992DKoA00 = C4992DKo.A00(c4992DKoA00);
            c4992DKoA00.A02 = true;
        }
        if (!A06(j)) {
            if (c4992DKoA00.A02) {
                mobileConfigValueSource = MobileConfigValueSource.DEFAULT__MISMATCH_UNIT_TYPE;
                c4992DKoA00.A01(mobileConfigValueSource);
            }
        } else if (2 != ((int) ((j >>> 48) & 63))) {
            A04(j, String.valueOf(longWithOptions));
            if (c4992DKoA00.A02) {
                mobileConfigValueSource = MobileConfigValueSource.DEFAULT__MISMATCH_PARAM_TYPE;
                c4992DKoA00.A01(mobileConfigValueSource);
            }
        } else {
            if (c4992DKoA00.A01) {
                dsuA00 = A08((int) ((j >>> 32) & 65535));
            } else {
                dsuA00 = A00(j);
            }
            longWithOptions = dsuA00.getLongWithOptions(j, longWithOptions, c4992DKoA00);
        }
        if (!setA03.isEmpty()) {
            MobileConfigValueSource mobileConfigValueSource2 = c4992DKoA00.A00.A01;
            this.A09.syncFetchReason();
            Iterator it = setA03.iterator();
            while (it.hasNext()) {
                ((CGP) it.next()).A00(mobileConfigValueSource2.name(), Long.toString(longWithOptions), j);
            }
        }
        return longWithOptions;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final String getString(long j, int i, Resources resources) {
        if (A06(j)) {
            if (3 != BV8.A04(j)) {
                A04(j, "FBT CALLSITE UNKNOWN");
            } else {
                return A00(j).getString(j, i, resources);
            }
        }
        return resources.getString(i);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final String getStringWithOptions(long j, String str, C4992DKo c4992DKo) {
        DSU dsuA00;
        MobileConfigValueSource mobileConfigValueSource;
        Set<CGP> setA03 = A03();
        if (!setA03.isEmpty()) {
            c4992DKo = C4992DKo.A00(c4992DKo);
            c4992DKo.A02 = true;
        }
        if (!A06(j)) {
            if (c4992DKo.A02) {
                mobileConfigValueSource = MobileConfigValueSource.DEFAULT__MISMATCH_UNIT_TYPE;
                c4992DKo.A01(mobileConfigValueSource);
            }
        } else if (3 != ((int) ((j >>> 48) & 63))) {
            A04(j, str);
            if (c4992DKo.A02) {
                mobileConfigValueSource = MobileConfigValueSource.DEFAULT__MISMATCH_PARAM_TYPE;
                c4992DKo.A01(mobileConfigValueSource);
            }
        } else {
            if (c4992DKo.A01) {
                dsuA00 = A08((int) ((j >>> 32) & 65535));
            } else {
                dsuA00 = A00(j);
            }
            str = dsuA00.getStringWithOptions(j, str, c4992DKo);
        }
        if (!setA03.isEmpty()) {
            MobileConfigValueSource mobileConfigValueSource2 = c4992DKo.A00.A01;
            this.A09.syncFetchReason();
            for (CGP cgp : setA03) {
                String strName = mobileConfigValueSource2.name();
                String strSubstring = str;
                if (str == null) {
                    strSubstring = "<null>";
                } else if (str.length() > 50) {
                    strSubstring = str.substring(0, 50);
                }
                cgp.A00(strName, strSubstring, j);
            }
        }
        return str;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final boolean hasExposure(long j) {
        return A00(j).hasExposure(j);
    }

    @Override // X.InterfaceC5054DRe
    public final void logExposure(C7491Exw<?, ?> c7491Exw) {
        logExposure(c7491Exw.A00);
    }

    @Override // com.facebook.mobileconfig.MobileConfigCxxChangeListener
    public final /* synthetic */ void onConfigChanged(String[] strArr, String str) {
        onConfigChanged(strArr);
    }

    @Override // X.InterfaceC5054DRe
    public final boolean getBoolean(C7491Exw<Boolean, ? extends Object> c7491Exw, boolean z) {
        return getBoolean(c7491Exw.A00, z);
    }

    @Override // X.InterfaceC5054DRe
    public final boolean getBooleanWithOptions(C7491Exw<Boolean, ? extends Object> c7491Exw, C4992DKo c4992DKo) {
        return getBooleanWithOptions(c7491Exw.A00, c4992DKo);
    }

    @Override // X.InterfaceC5054DRe
    public final double getDouble(C7491Exw<Double, ? extends Object> c7491Exw, double d) {
        return getDouble(c7491Exw.A00, d);
    }

    @Override // X.InterfaceC5054DRe
    public final double getDoubleWithOptions(C7491Exw<Double, ? extends Object> c7491Exw, C4992DKo c4992DKo) {
        return getDoubleWithOptions(c7491Exw.A00, c4992DKo);
    }

    @Override // X.InterfaceC5054DRe
    public final long getLong(C7491Exw<Long, ? extends Object> c7491Exw, long j) {
        return getLong(c7491Exw.A00, j);
    }

    @Override // X.InterfaceC5054DRe
    public final long getLongWithOptions(C7491Exw<Long, ? extends Object> c7491Exw, C4992DKo c4992DKo) {
        return getLongWithOptions(c7491Exw.A00, c4992DKo);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final String getString(long j, String str) {
        if (A06(j)) {
            if (3 != BV8.A04(j)) {
                A04(j, str);
            } else {
                return A00(j).getString(j, str);
            }
        }
        return str;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final String getStringWithOptions(long j, int i, Resources resources, C4992DKo c4992DKo) {
        String stringWithOptions = getStringWithOptions(j, (String) null, c4992DKo);
        if (stringWithOptions == null) {
            return resources.getString(i);
        }
        return stringWithOptions;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final boolean getBoolean(long j) {
        return getBooleanWithOptions(j, C4992DKo.A05);
    }

    @Override // X.InterfaceC5054DRe
    public final boolean getBooleanWithOptions(C7491Exw<Boolean, ? extends Object> c7491Exw, boolean z, C4992DKo c4992DKo) {
        return getBooleanWithOptions(c7491Exw.A00, z, c4992DKo);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final double getDouble(long j) {
        return getDoubleWithOptions(j, C4992DKo.A05);
    }

    @Override // X.InterfaceC5054DRe
    public final double getDoubleWithOptions(C7491Exw<Double, ? extends Object> c7491Exw, double d, C4992DKo c4992DKo) {
        return getDoubleWithOptions(c7491Exw.A00, d, c4992DKo);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final long getLong(long j) {
        return getLongWithOptions(j, C4992DKo.A05);
    }

    @Override // X.InterfaceC5054DRe
    public final long getLongWithOptions(C7491Exw<Long, ? extends Object> c7491Exw, long j, C4992DKo c4992DKo) {
        return getLongWithOptions(c7491Exw.A00, j, c4992DKo);
    }

    @Override // X.InterfaceC5054DRe
    public final String getString(C7491Exw<String, ? extends Object> c7491Exw, int i, Resources resources) {
        return getString(c7491Exw.A00, i, resources);
    }

    @Override // X.InterfaceC5054DRe
    public final String getStringWithOptions(C7491Exw<String, ? extends Object> c7491Exw, int i, Resources resources, C4992DKo c4992DKo) {
        return getStringWithOptions(c7491Exw.A00, i, resources, c4992DKo);
    }

    @Override // X.InterfaceC5054DRe
    public final String getString(C7491Exw<String, ? extends Object> c7491Exw, String str) {
        return getString(c7491Exw.A00, str);
    }

    @Override // X.InterfaceC5054DRe
    public final String getStringWithOptions(C7491Exw<String, ? extends Object> c7491Exw, String str, C4992DKo c4992DKo) {
        return getStringWithOptions(c7491Exw.A00, str, c4992DKo);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final String getString(long j) {
        return getStringWithOptions(j, C4992DKo.A05);
    }

    @Override // X.InterfaceC5054DRe
    public final String getStringWithOptions(C7491Exw<String, ? extends Object> c7491Exw, C4992DKo c4992DKo) {
        return getStringWithOptions(c7491Exw.A00, c4992DKo);
    }
}
