package com.facebook.aura.mobileconfig;

import X.AbstractC5053DRd;
import X.AbstractC5321DgF;
import X.AnonymousClass003;
import X.C3cG;
import X.C3cI;
import X.C4992DKo;
import X.C60O;
import X.C7384Etj;
import X.C7491Exw;
import X.CFK;
import X.DRX;
import X.DRZ;
import X.DSU;
import X.F0C;
import X.F18;
import X.FGI;
import X.HtJ;
import X.HzP;
import X.InterfaceC5054DRe;
import X.InterfaceC5058DRj;
import android.content.res.Resources;
import android.provider.Settings;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.mobileconfig.session.AuraDeviceSession;
import com.facebook.aura.mobileconfig.session.AuraMobileConfigProvider;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class AuraMobileConfig {
    public static final String TAG = "AuraMobileConfig";
    public static final AuraMobileConfig INSTANCE = new AuraMobileConfig();
    public static final AtomicBoolean initialized = C60O.A1E();
    public static final F0C sessionedMC$delegate = AbstractC5321DgF.A03(AuraMobileConfig$sessionedMC$2.INSTANCE);
    public static final F0C sessionlessMC$delegate = AbstractC5321DgF.A03(AuraMobileConfig$sessionlessMC$2.INSTANCE);

    /* renamed from: com.facebook.aura.mobileconfig.AuraMobileConfig$buildBugReportDump$1, reason: invalid class name */
    public final class AnonymousClass1<T> implements F18 {
        public final /* synthetic */ DRZ $sessionedFactory;

        public AnonymousClass1(DRZ drz) {
            this.$sessionedFactory = drz;
        }

        @Override // X.F18
        /* renamed from: get */
        public final DRX AMN() {
            return this.$sessionedFactory;
        }

        @Override // X.F18
        /* renamed from: get */
        public /* bridge */ /* synthetic */ Object AMN() {
            return this.$sessionedFactory;
        }
    }

    /* renamed from: com.facebook.aura.mobileconfig.AuraMobileConfig$buildBugReportDump$2, reason: invalid class name */
    public final class AnonymousClass2<T> implements F18 {
        public final /* synthetic */ DRZ $sessionlessFactory;

        public AnonymousClass2(DRZ drz) {
            this.$sessionlessFactory = drz;
        }

        @Override // X.F18
        /* renamed from: get */
        public final DRX AMN() {
            return this.$sessionlessFactory;
        }

        @Override // X.F18
        /* renamed from: get */
        public /* bridge */ /* synthetic */ Object AMN() {
            return this.$sessionlessFactory;
        }
    }

    /* renamed from: com.facebook.aura.mobileconfig.AuraMobileConfig$buildBugReportDump$3, reason: invalid class name */
    public final class AnonymousClass3<T> implements F18 {
        public final /* synthetic */ DRZ $sessionedFactory;

        public AnonymousClass3(DRZ drz) {
            this.$sessionedFactory = drz;
        }

        @Override // X.F18
        /* renamed from: get */
        public final InterfaceC5058DRj AMN() {
            return this.$sessionedFactory.A09();
        }

        @Override // X.F18
        /* renamed from: get */
        public /* bridge */ /* synthetic */ Object AMN() {
            return this.$sessionedFactory.A09();
        }
    }

    /* renamed from: com.facebook.aura.mobileconfig.AuraMobileConfig$buildBugReportDump$4, reason: invalid class name */
    public final class AnonymousClass4<T> implements F18 {
        public final /* synthetic */ DRZ $sessionlessFactory;

        public AnonymousClass4(DRZ drz) {
            this.$sessionlessFactory = drz;
        }

        @Override // X.F18
        /* renamed from: get */
        public final InterfaceC5058DRj AMN() {
            return this.$sessionlessFactory.A09();
        }

        @Override // X.F18
        /* renamed from: get */
        public /* bridge */ /* synthetic */ Object AMN() {
            return this.$sessionlessFactory.A09();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.mobileconfig.AuraMobileConfig", f = "AuraMobileConfig.kt", l = {122}, m = "safeAfterLogin", v = 2)
    /* renamed from: com.facebook.aura.mobileconfig.AuraMobileConfig$safeAfterLogin$1, reason: invalid class name and case insensitive filesystem */
    public final class C126921 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C126921(HtJ<? super C126921> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraMobileConfig.this.safeAfterLogin(this);
        }
    }

    public final boolean getBoolean$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(C7491Exw<Boolean, ?> c7491Exw) {
        C7384Etj.A0Y(c7491Exw, 0);
        long j = c7491Exw.A00;
        return getMC(j).getBoolean(j);
    }

    public final double getDouble$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(C7491Exw<Double, ?> c7491Exw) {
        C7384Etj.A0Y(c7491Exw, 0);
        long j = c7491Exw.A00;
        return getMC(j).getDouble(j);
    }

    public final double getDoubleWithOptions$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(long j, C4992DKo c4992DKo) {
        C7384Etj.A0Y(c4992DKo, 1);
        return getMC(j).getDoubleWithOptions(j, c4992DKo);
    }

    public final int getInt$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(C7491Exw<Long, ?> c7491Exw) {
        C7384Etj.A0Y(c7491Exw, 0);
        return getInt$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(c7491Exw.A00);
    }

    public final int getIntWithOptions$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(long j, C4992DKo c4992DKo) {
        C7384Etj.A0Y(c4992DKo, 1);
        return (int) getMC(j).getLongWithOptions(j, c4992DKo);
    }

    public final long getLong$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(C7491Exw<Long, ?> c7491Exw) {
        C7384Etj.A0Y(c7491Exw, 0);
        long j = c7491Exw.A00;
        return getMC(j).getLong(j);
    }

    public final String getStringWithOptions$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(long j, C4992DKo c4992DKo) {
        C7384Etj.A0Y(c4992DKo, 1);
        String stringWithOptions = getMC(j).getStringWithOptions(j, c4992DKo);
        C7384Etj.A0U(stringWithOptions);
        return stringWithOptions;
    }

    private final DSU getMC(long j) {
        if (!initialized.get()) {
            CFK.A06(TAG, "MobileConfig accessed before initialization");
        }
        return resolveFactory$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(j, ((AuraMobileConfigProvider) sessionedMC$delegate.getValue()).getMCFactory(), ((AuraDeviceSession) sessionlessMC$delegate.getValue()).mcSession.getMCFactory());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x020c A[Catch: JSONException -> 0x0297, Exception -> 0x02aa, TryCatch #0 {JSONException -> 0x0297, blocks: (B:6:0x0049, B:9:0x0055, B:15:0x0065, B:17:0x006e, B:18:0x0070, B:28:0x0090, B:29:0x0098, B:31:0x009d, B:32:0x009f, B:42:0x00bf, B:43:0x00c7, B:45:0x00ce, B:47:0x00d3, B:48:0x00f5, B:50:0x00fb, B:53:0x010f, B:55:0x0117, B:58:0x0131, B:136:0x0282, B:137:0x0290, B:76:0x0159, B:79:0x0161, B:81:0x0169, B:82:0x0175, B:84:0x0179, B:96:0x01b1, B:97:0x01be, B:99:0x01ca, B:100:0x01d4, B:110:0x01fe, B:114:0x0218, B:115:0x0225, B:116:0x0229, B:118:0x022d, B:120:0x023b, B:121:0x023e, B:123:0x0242, B:125:0x024a, B:128:0x0257, B:131:0x026b, B:132:0x0271, B:134:0x0277, B:135:0x027b, B:112:0x020c, B:85:0x017d, B:88:0x018f, B:89:0x0195, B:91:0x019e, B:75:0x0153, B:57:0x011b, B:138:0x0291, B:33:0x00a2, B:34:0x00a6, B:36:0x00ac, B:38:0x00b2, B:39:0x00b5, B:40:0x00b8, B:19:0x0073, B:20:0x0077, B:22:0x007d, B:24:0x0083, B:25:0x0086, B:26:0x0089), top: B:153:0x0049, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x022d A[Catch: JSONException -> 0x0297, Exception -> 0x02aa, TryCatch #0 {JSONException -> 0x0297, blocks: (B:6:0x0049, B:9:0x0055, B:15:0x0065, B:17:0x006e, B:18:0x0070, B:28:0x0090, B:29:0x0098, B:31:0x009d, B:32:0x009f, B:42:0x00bf, B:43:0x00c7, B:45:0x00ce, B:47:0x00d3, B:48:0x00f5, B:50:0x00fb, B:53:0x010f, B:55:0x0117, B:58:0x0131, B:136:0x0282, B:137:0x0290, B:76:0x0159, B:79:0x0161, B:81:0x0169, B:82:0x0175, B:84:0x0179, B:96:0x01b1, B:97:0x01be, B:99:0x01ca, B:100:0x01d4, B:110:0x01fe, B:114:0x0218, B:115:0x0225, B:116:0x0229, B:118:0x022d, B:120:0x023b, B:121:0x023e, B:123:0x0242, B:125:0x024a, B:128:0x0257, B:131:0x026b, B:132:0x0271, B:134:0x0277, B:135:0x027b, B:112:0x020c, B:85:0x017d, B:88:0x018f, B:89:0x0195, B:91:0x019e, B:75:0x0153, B:57:0x011b, B:138:0x0291, B:33:0x00a2, B:34:0x00a6, B:36:0x00ac, B:38:0x00b2, B:39:0x00b5, B:40:0x00b8, B:19:0x0073, B:20:0x0077, B:22:0x007d, B:24:0x0083, B:25:0x0086, B:26:0x0089), top: B:153:0x0049, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0277 A[Catch: JSONException -> 0x0297, Exception -> 0x02aa, TryCatch #0 {JSONException -> 0x0297, blocks: (B:6:0x0049, B:9:0x0055, B:15:0x0065, B:17:0x006e, B:18:0x0070, B:28:0x0090, B:29:0x0098, B:31:0x009d, B:32:0x009f, B:42:0x00bf, B:43:0x00c7, B:45:0x00ce, B:47:0x00d3, B:48:0x00f5, B:50:0x00fb, B:53:0x010f, B:55:0x0117, B:58:0x0131, B:136:0x0282, B:137:0x0290, B:76:0x0159, B:79:0x0161, B:81:0x0169, B:82:0x0175, B:84:0x0179, B:96:0x01b1, B:97:0x01be, B:99:0x01ca, B:100:0x01d4, B:110:0x01fe, B:114:0x0218, B:115:0x0225, B:116:0x0229, B:118:0x022d, B:120:0x023b, B:121:0x023e, B:123:0x0242, B:125:0x024a, B:128:0x0257, B:131:0x026b, B:132:0x0271, B:134:0x0277, B:135:0x027b, B:112:0x020c, B:85:0x017d, B:88:0x018f, B:89:0x0195, B:91:0x019e, B:75:0x0153, B:57:0x011b, B:138:0x0291, B:33:0x00a2, B:34:0x00a6, B:36:0x00ac, B:38:0x00b2, B:39:0x00b5, B:40:0x00b8, B:19:0x0073, B:20:0x0077, B:22:0x007d, B:24:0x0083, B:25:0x0086, B:26:0x0089), top: B:153:0x0049, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011b A[Catch: JSONException -> 0x0297, Exception -> 0x02aa, TryCatch #0 {JSONException -> 0x0297, blocks: (B:6:0x0049, B:9:0x0055, B:15:0x0065, B:17:0x006e, B:18:0x0070, B:28:0x0090, B:29:0x0098, B:31:0x009d, B:32:0x009f, B:42:0x00bf, B:43:0x00c7, B:45:0x00ce, B:47:0x00d3, B:48:0x00f5, B:50:0x00fb, B:53:0x010f, B:55:0x0117, B:58:0x0131, B:136:0x0282, B:137:0x0290, B:76:0x0159, B:79:0x0161, B:81:0x0169, B:82:0x0175, B:84:0x0179, B:96:0x01b1, B:97:0x01be, B:99:0x01ca, B:100:0x01d4, B:110:0x01fe, B:114:0x0218, B:115:0x0225, B:116:0x0229, B:118:0x022d, B:120:0x023b, B:121:0x023e, B:123:0x0242, B:125:0x024a, B:128:0x0257, B:131:0x026b, B:132:0x0271, B:134:0x0277, B:135:0x027b, B:112:0x020c, B:85:0x017d, B:88:0x018f, B:89:0x0195, B:91:0x019e, B:75:0x0153, B:57:0x011b, B:138:0x0291, B:33:0x00a2, B:34:0x00a6, B:36:0x00ac, B:38:0x00b2, B:39:0x00b5, B:40:0x00b8, B:19:0x0073, B:20:0x0077, B:22:0x007d, B:24:0x0083, B:25:0x0086, B:26:0x0089), top: B:153:0x0049, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0169 A[Catch: JSONException -> 0x0297, Exception -> 0x02aa, TryCatch #0 {JSONException -> 0x0297, blocks: (B:6:0x0049, B:9:0x0055, B:15:0x0065, B:17:0x006e, B:18:0x0070, B:28:0x0090, B:29:0x0098, B:31:0x009d, B:32:0x009f, B:42:0x00bf, B:43:0x00c7, B:45:0x00ce, B:47:0x00d3, B:48:0x00f5, B:50:0x00fb, B:53:0x010f, B:55:0x0117, B:58:0x0131, B:136:0x0282, B:137:0x0290, B:76:0x0159, B:79:0x0161, B:81:0x0169, B:82:0x0175, B:84:0x0179, B:96:0x01b1, B:97:0x01be, B:99:0x01ca, B:100:0x01d4, B:110:0x01fe, B:114:0x0218, B:115:0x0225, B:116:0x0229, B:118:0x022d, B:120:0x023b, B:121:0x023e, B:123:0x0242, B:125:0x024a, B:128:0x0257, B:131:0x026b, B:132:0x0271, B:134:0x0277, B:135:0x027b, B:112:0x020c, B:85:0x017d, B:88:0x018f, B:89:0x0195, B:91:0x019e, B:75:0x0153, B:57:0x011b, B:138:0x0291, B:33:0x00a2, B:34:0x00a6, B:36:0x00ac, B:38:0x00b2, B:39:0x00b5, B:40:0x00b8, B:19:0x0073, B:20:0x0077, B:22:0x007d, B:24:0x0083, B:25:0x0086, B:26:0x0089), top: B:153:0x0049, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0179 A[Catch: JSONException -> 0x0297, Exception -> 0x02aa, TryCatch #0 {JSONException -> 0x0297, blocks: (B:6:0x0049, B:9:0x0055, B:15:0x0065, B:17:0x006e, B:18:0x0070, B:28:0x0090, B:29:0x0098, B:31:0x009d, B:32:0x009f, B:42:0x00bf, B:43:0x00c7, B:45:0x00ce, B:47:0x00d3, B:48:0x00f5, B:50:0x00fb, B:53:0x010f, B:55:0x0117, B:58:0x0131, B:136:0x0282, B:137:0x0290, B:76:0x0159, B:79:0x0161, B:81:0x0169, B:82:0x0175, B:84:0x0179, B:96:0x01b1, B:97:0x01be, B:99:0x01ca, B:100:0x01d4, B:110:0x01fe, B:114:0x0218, B:115:0x0225, B:116:0x0229, B:118:0x022d, B:120:0x023b, B:121:0x023e, B:123:0x0242, B:125:0x024a, B:128:0x0257, B:131:0x026b, B:132:0x0271, B:134:0x0277, B:135:0x027b, B:112:0x020c, B:85:0x017d, B:88:0x018f, B:89:0x0195, B:91:0x019e, B:75:0x0153, B:57:0x011b, B:138:0x0291, B:33:0x00a2, B:34:0x00a6, B:36:0x00ac, B:38:0x00b2, B:39:0x00b5, B:40:0x00b8, B:19:0x0073, B:20:0x0077, B:22:0x007d, B:24:0x0083, B:25:0x0086, B:26:0x0089), top: B:153:0x0049, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017d A[Catch: JSONException -> 0x0297, Exception -> 0x02aa, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0297, blocks: (B:6:0x0049, B:9:0x0055, B:15:0x0065, B:17:0x006e, B:18:0x0070, B:28:0x0090, B:29:0x0098, B:31:0x009d, B:32:0x009f, B:42:0x00bf, B:43:0x00c7, B:45:0x00ce, B:47:0x00d3, B:48:0x00f5, B:50:0x00fb, B:53:0x010f, B:55:0x0117, B:58:0x0131, B:136:0x0282, B:137:0x0290, B:76:0x0159, B:79:0x0161, B:81:0x0169, B:82:0x0175, B:84:0x0179, B:96:0x01b1, B:97:0x01be, B:99:0x01ca, B:100:0x01d4, B:110:0x01fe, B:114:0x0218, B:115:0x0225, B:116:0x0229, B:118:0x022d, B:120:0x023b, B:121:0x023e, B:123:0x0242, B:125:0x024a, B:128:0x0257, B:131:0x026b, B:132:0x0271, B:134:0x0277, B:135:0x027b, B:112:0x020c, B:85:0x017d, B:88:0x018f, B:89:0x0195, B:91:0x019e, B:75:0x0153, B:57:0x011b, B:138:0x0291, B:33:0x00a2, B:34:0x00a6, B:36:0x00ac, B:38:0x00b2, B:39:0x00b5, B:40:0x00b8, B:19:0x0073, B:20:0x0077, B:22:0x007d, B:24:0x0083, B:25:0x0086, B:26:0x0089), top: B:153:0x0049, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ca A[Catch: JSONException -> 0x0297, Exception -> 0x02aa, TryCatch #0 {JSONException -> 0x0297, blocks: (B:6:0x0049, B:9:0x0055, B:15:0x0065, B:17:0x006e, B:18:0x0070, B:28:0x0090, B:29:0x0098, B:31:0x009d, B:32:0x009f, B:42:0x00bf, B:43:0x00c7, B:45:0x00ce, B:47:0x00d3, B:48:0x00f5, B:50:0x00fb, B:53:0x010f, B:55:0x0117, B:58:0x0131, B:136:0x0282, B:137:0x0290, B:76:0x0159, B:79:0x0161, B:81:0x0169, B:82:0x0175, B:84:0x0179, B:96:0x01b1, B:97:0x01be, B:99:0x01ca, B:100:0x01d4, B:110:0x01fe, B:114:0x0218, B:115:0x0225, B:116:0x0229, B:118:0x022d, B:120:0x023b, B:121:0x023e, B:123:0x0242, B:125:0x024a, B:128:0x0257, B:131:0x026b, B:132:0x0271, B:134:0x0277, B:135:0x027b, B:112:0x020c, B:85:0x017d, B:88:0x018f, B:89:0x0195, B:91:0x019e, B:75:0x0153, B:57:0x011b, B:138:0x0291, B:33:0x00a2, B:34:0x00a6, B:36:0x00ac, B:38:0x00b2, B:39:0x00b5, B:40:0x00b8, B:19:0x0073, B:20:0x0077, B:22:0x007d, B:24:0x0083, B:25:0x0086, B:26:0x0089), top: B:153:0x0049, outer: #1 }] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.AbstractMap, java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String buildBugReportDump() throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.mobileconfig.AuraMobileConfig.buildBugReportDump():java.lang.String");
    }

    public final void ensureInitialized() {
        sessionedMC$delegate.getValue();
        sessionlessMC$delegate.getValue();
        if (C3cI.A1W(initialized)) {
            AuraSessionManager.INSTANCE.addSignOutCallback(new Runnable() { // from class: com.facebook.aura.mobileconfig.AuraMobileConfig.ensureInitialized.1
                @Override // java.lang.Runnable
                public final void run() {
                    AuraMobileConfig.INSTANCE.safeAfterLogout();
                }
            });
        }
    }

    public final AuraMobileConfigProvider getSessionedMC() {
        return (AuraMobileConfigProvider) sessionedMC$delegate.getValue();
    }

    public final AuraDeviceSession getSessionlessMC() {
        return (AuraDeviceSession) sessionlessMC$delegate.getValue();
    }

    public final boolean isInitialized() {
        return initialized.get();
    }

    public final DSU resolveFactory$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(long j, DRZ drz, DRZ drz2) {
        boolean z = true;
        if (((int) ((j >>> 54) & 63)) == 1) {
            drz = drz2;
        } else {
            z = false;
        }
        if (!(drz instanceof DSU) || drz == null) {
            throw new IllegalStateException(FGI.A0U("MC factory not available for ", z ? "sessionless" : "sessioned", " param"));
        }
        return drz;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object safeAfterLogin(X.HtJ<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.mobileconfig.AuraMobileConfig.C126921
            if (r0 == 0) goto L1e
            r4 = r6
            com.facebook.aura.mobileconfig.AuraMobileConfig$safeAfterLogin$1 r4 = (com.facebook.aura.mobileconfig.AuraMobileConfig.C126921) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L24
            goto L3d
        L1e:
            com.facebook.aura.mobileconfig.AuraMobileConfig$safeAfterLogin$1 r4 = new com.facebook.aura.mobileconfig.AuraMobileConfig$safeAfterLogin$1
            r4.<init>(r6)
            goto L12
        L24:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L29:
            X.Hwg.A00(r3)
            X.F0C r0 = com.facebook.aura.mobileconfig.AuraMobileConfig.sessionedMC$delegate     // Catch: java.lang.Exception -> L45
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L45
            com.facebook.aura.mobileconfig.session.AuraMobileConfigProvider r0 = (com.facebook.aura.mobileconfig.session.AuraMobileConfigProvider) r0     // Catch: java.lang.Exception -> L45
            r4.label = r1     // Catch: java.lang.Exception -> L45
            java.lang.Object r3 = r0.afterLogin(r4)     // Catch: java.lang.Exception -> L45
            if (r3 != r2) goto L40
            return r2
        L3d:
            X.Hwg.A00(r3)     // Catch: java.lang.Exception -> L45
        L40:
            boolean r0 = X.AnonymousClass001.A1X(r3)     // Catch: java.lang.Exception -> L45
            goto L4e
        L45:
            r2 = move-exception
            java.lang.String r1 = "MC sync fetch failed after login, will use defaults until next fetch"
            java.lang.String r0 = "AuraMobileConfig"
            X.CFK.A08(r0, r1, r2)
            r0 = 0
        L4e:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.mobileconfig.AuraMobileConfig.safeAfterLogin(X.HtJ):java.lang.Object");
    }

    public final void safeAfterLogout() {
        try {
            ((AuraMobileConfigProvider) sessionedMC$delegate.getValue()).afterLogout();
        } catch (Exception e) {
            CFK.A08(TAG, "MC afterLogout failed", e);
        }
    }

    public final void safeFetchSessionedConfigs() {
        try {
            ((AuraMobileConfigProvider) sessionedMC$delegate.getValue()).fetchConfigs();
        } catch (Exception e) {
            CFK.A08(TAG, "Sessioned MC fetch failed", e);
        }
    }

    public final InterfaceC5054DRe user() {
        return new AbstractC5053DRd(((AuraMobileConfigProvider) sessionedMC$delegate.getValue()).getMCFactory()) { // from class: com.facebook.aura.mobileconfig.AuraMobileConfig.user.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(drz);
                C7384Etj.A0Z(drz, "null cannot be cast to non-null type com.facebook.mobileconfig.factory.MobileConfigContext");
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getDeviceId() {
        try {
            String string = Settings.Secure.getString(C3cG.A06().getContentResolver(), "android_id");
            return string == null ? "unknown" : string;
        } catch (Exception unused) {
            return "unknown";
        }
    }

    public final boolean getBooleanWithOptions$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(C7491Exw<Boolean, ?> c7491Exw, C4992DKo c4992DKo) {
        AnonymousClass003.A0u(c7491Exw, c4992DKo);
        long j = c7491Exw.A00;
        return getMC(j).getBooleanWithOptions(j, c4992DKo);
    }

    public final long getLongWithOptions$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(C7491Exw<Long, ?> c7491Exw, C4992DKo c4992DKo) {
        AnonymousClass003.A0u(c7491Exw, c4992DKo);
        long j = c7491Exw.A00;
        return getMC(j).getLongWithOptions(j, c4992DKo);
    }

    public final String getString$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(long j) {
        String string = getMC(j).getString(j);
        C7384Etj.A0U(string);
        return string;
    }

    public final void logExposure(long j) {
        getMC(j).logExposure(j);
    }

    public final boolean getBoolean$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(long j) {
        return getMC(j).getBoolean(j);
    }

    public final boolean getBooleanWithOptions$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(long j, C4992DKo c4992DKo) {
        C7384Etj.A0Y(c4992DKo, 1);
        return getMC(j).getBooleanWithOptions(j, c4992DKo);
    }

    public final double getDouble$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(long j) {
        return getMC(j).getDouble(j);
    }

    public final int getInt$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(long j) {
        return (int) getMC(j).getLong(j);
    }

    public final int getIntWithOptions$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(C7491Exw<Long, ?> c7491Exw, C4992DKo c4992DKo) {
        AnonymousClass003.A0u(c7491Exw, c4992DKo);
        return getIntWithOptions$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(c7491Exw.A00, c4992DKo);
    }

    public final long getLong$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(long j) {
        return getMC(j).getLong(j);
    }

    public final long getLongWithOptions$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(long j, C4992DKo c4992DKo) {
        C7384Etj.A0Y(c4992DKo, 1);
        return getMC(j).getLongWithOptions(j, c4992DKo);
    }

    public final String getString$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(long j, int i, Resources resources) {
        C7384Etj.A0Y(resources, 2);
        String string = getMC(j).getString(j, i, resources);
        C7384Etj.A0U(string);
        return string;
    }

    public final String getStringWithOptions$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(C7491Exw<String, ?> c7491Exw, C4992DKo c4992DKo) {
        AnonymousClass003.A0u(c7491Exw, c4992DKo);
        return getStringWithOptions$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(c7491Exw.A00, c4992DKo);
    }

    public final String getString$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(C7491Exw<String, ?> c7491Exw) {
        C7384Etj.A0Y(c7491Exw, 0);
        return getString$fbandroid_express_aura_java_com_facebook_aura_mobileconfig_mobileconfig(c7491Exw.A00);
    }
}
