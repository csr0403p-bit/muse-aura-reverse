package com.facebook.aura.appupdate;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BLG;
import X.BV5;
import X.C1BN;
import X.C3Pi;
import X.C7384Etj;
import X.C7mU;
import X.C8j4;
import X.C9286GCn;
import X.CFK;
import X.HnJ;
import X.HtJ;
import X.HzP;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.aura.appupdate.AppUpdateState;
import com.facebook.aura.composer.util.ImageCompressor;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class AppUpdateChecker {
    public static final int $stable = 0;
    public static final long HARD_BLOCK_INSTALL_AGE_DAYS = 7;
    public static final int HARD_BLOCK_MAJOR_GAP = 2;
    public static final long HARD_BLOCK_SNOOZE_MS = 86400000;
    public static final int MAJOR_SEGMENT = 0;
    public static final String MOBILE_HOME_DEEPLINK_URL = "fbmobilehome://apps/builds?app=aura_for_android";
    public static final String MOBILE_HOME_URL = "https://www.internalfb.com/intern/mobile_builds/aura_for_android/?popular=0";
    public static final String ORCHARD_INSTALL_URL = "https://www.internalfb.com/intern/orchard/install/aura_for_android/latest/?build_variant=DISTRIBUTION_IN_HOUSE";
    public static final long SOFT_BLOCK_INSTALL_AGE_DAYS = 3;
    public static final String TAG = "AppUpdateChecker";
    public static final int VERSION_SEGMENTS = 5;
    public static final BLG<AppUpdateState> _updateState;
    public static final C1BN<AppUpdateState> updateState;
    public static final AppUpdateChecker INSTANCE = new AppUpdateChecker();
    public static final AppUpdateNudgeCooldown hardBlockSnooze = new AppUpdateNudgeCooldown("hard_block_snoozed_at", 86400000);

    @DebugMetadata(c = "com.facebook.aura.appupdate.AppUpdateChecker", f = "AppUpdateChecker.kt", l = {ImageCompressor.IMAGE_COMPRESSION_QUALITY}, m = "checkForUpdate", v = 2)
    /* renamed from: com.facebook.aura.appupdate.AppUpdateChecker$checkForUpdate$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppUpdateChecker.this.checkForUpdate(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.appupdate.AppUpdateChecker", f = "AppUpdateChecker.kt", l = {257}, m = "fetchLatestVersion", v = 2)
    /* renamed from: com.facebook.aura.appupdate.AppUpdateChecker$fetchLatestVersion$1, reason: invalid class name and case insensitive filesystem */
    public final class C109431 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C109431(HtJ<? super C109431> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppUpdateChecker.this.fetchLatestVersion(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        r0 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<java.lang.Integer> parseVersion(java.lang.String r6) {
        /*
            r5 = this;
            r5 = 0
            java.lang.String r0 = "."
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r4 = 0
            java.util.List r0 = X.C7BY.A0i(r6, r0, r5)
            java.util.ArrayList r3 = X.AnonymousClass003.A0i(r0)
            java.util.Iterator r1 = r0.iterator()
        L14:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2e
            java.lang.String r0 = X.AnonymousClass005.A0j(r1)
            java.lang.Integer r0 = X.C9tI.A0r(r0)
            if (r0 == 0) goto L2c
            int r0 = r0.intValue()
        L28:
            X.C60Q.A1P(r3, r0)
            goto L14
        L2c:
            r0 = 0
            goto L28
        L2e:
            r2 = 5
            java.util.ArrayList r1 = X.C60O.A11(r2)
        L33:
            int r0 = r3.size()
            if (r4 >= r0) goto L4b
            java.lang.Object r0 = r3.get(r4)
        L3d:
            int r0 = X.AnonymousClass001.A0F(r0)
            X.C60Q.A1P(r1, r0)
            int r4 = r4 + 1
            if (r4 >= r2) goto L50
            if (r4 < 0) goto L4b
            goto L33
        L4b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            goto L3d
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.appupdate.AppUpdateChecker.parseVersion(java.lang.String):java.util.List");
    }

    public final void openUpdate(Context context) {
        C7384Etj.A0Y(context, 0);
        Iterator it = BV5.A12(MOBILE_HOME_DEEPLINK_URL, MOBILE_HOME_URL, ORCHARD_INSTALL_URL).iterator();
        while (it.hasNext()) {
            try {
                C7mU.A00().A04().A05(context, new Intent("android.intent.action.VIEW", Uri.parse(AnonymousClass005.A0j(it))));
                return;
            } catch (ActivityNotFoundException unused) {
            }
        }
        CFK.A04(TAG, "All update URLs failed to open");
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlockType.values().length];
            try {
                AnonymousClass002.A13(BlockType.HARD, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(BlockType.SOFT, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(BlockType.NONE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        C9286GCn c9286GCnA01 = HnJ.A01(AppUpdateState.None.INSTANCE);
        _updateState = c9286GCnA01;
        updateState = C3Pi.A00(c9286GCnA01);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchLatestVersion(X.HtJ<? super java.lang.String> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.facebook.aura.appupdate.AppUpdateChecker.C109431
            if (r0 == 0) goto L5e
            r12 = r14
            com.facebook.aura.appupdate.AppUpdateChecker$fetchLatestVersion$1 r12 = (com.facebook.aura.appupdate.AppUpdateChecker.C109431) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5e
            int r2 = r2 - r1
            r12.label = r2
        L12:
            java.lang.Object r3 = r12.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r12.label
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L64
            java.lang.Object r1 = X.AnonymousClass001.A0q(r3)
        L21:
            java.lang.Throwable r0 = X.HsJ.A00(r1)
            r2 = 0
            if (r0 != 0) goto L5d
            com.facebook.aura.appupdate.LatestAppVersionResponseJson r1 = (com.facebook.aura.appupdate.LatestAppVersionResponseJson) r1
            java.lang.String r1 = r1.version
            int r0 = r1.length()
            if (r0 <= 0) goto L5d
            return r1
        L33:
            X.Hwg.A00(r3)
            com.facebook.aura.network.http.HatchHttpApi r3 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            java.lang.String r0 = "4331325740476680"
            com.facebook.aura.appupdate.AppUpdateStefiPath$LatestAppVersion r6 = new com.facebook.aura.appupdate.AppUpdateStefiPath$LatestAppVersion
            r6.<init>(r0)
            com.facebook.aura.network.http.RequestType r7 = com.facebook.aura.network.http.RequestType.GET
            X.9jH r10 = X.AGH.A0E()
            com.facebook.aura.appupdate.AppUpdateChecker$fetchLatestVersion$$inlined$executeStefiRequest-bMdYcbs$default$1 r4 = com.facebook.aura.appupdate.AppUpdateChecker$fetchLatestVersion$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE
            r5 = 0
            r8 = 0
            r12.L$0 = r8
            r12.L$1 = r8
            r12.L$2 = r8
            r12.L$3 = r8
            r12.L$4 = r8
            r12.label = r1
            r9 = r8
            r11 = r10
            java.lang.Object r1 = r3.m1596executeBodylessStefiRequestWithtZkwj4A(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r1 != r2) goto L21
        L5d:
            return r2
        L5e:
            com.facebook.aura.appupdate.AppUpdateChecker$fetchLatestVersion$1 r12 = new com.facebook.aura.appupdate.AppUpdateChecker$fetchLatestVersion$1
            r12.<init>(r14)
            goto L12
        L64:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.appupdate.AppUpdateChecker.fetchLatestVersion(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object checkForUpdate(X.AbstractC3358CGz r11, X.HtJ<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.appupdate.AppUpdateChecker.checkForUpdate(X.CGz, X.HtJ):java.lang.Object");
    }

    public final String getDueSoftUpdateVersion() {
        AppUpdateState.SoftBlock softBlock;
        String str;
        AppUpdateState value = _updateState.getValue();
        if (!(value instanceof AppUpdateState.SoftBlock) || (softBlock = (AppUpdateState.SoftBlock) value) == null || (str = softBlock.recommendedVersion) == null || !hardBlockSnooze.isElapsed()) {
            return null;
        }
        return str;
    }

    public final C1BN<AppUpdateState> getUpdateState() {
        return updateState;
    }

    public final void snoozeHardBlock() {
        hardBlockSnooze.record();
        _updateState.Af8(AppUpdateState.None.INSTANCE);
    }

    private final long installAgeDays(Context context) {
        return (System.currentTimeMillis() - BV5.A0A(context).lastUpdateTime) / 86400000;
    }

    private final boolean isOlderThan(List<Integer> list, List<Integer> list2) {
        int iMax = Math.max(list.size(), list2.size());
        int i = 0;
        while (i < iMax) {
            int iA0F = AnonymousClass001.A0F((i < 0 || i >= list.size()) ? 0 : list.get(i));
            int iA0F2 = AnonymousClass001.A0F((i < 0 || i >= list2.size()) ? 0 : list2.get(i));
            if (iA0F < iA0F2) {
                return true;
            }
            if (iA0F > iA0F2) {
                return false;
            }
            i++;
        }
        return false;
    }

    public final BlockType determineBlockType$fbandroid_express_aura_java_com_facebook_aura_appupdate_appupdate(String str, String str2, long j) {
        boolean zA1b = AnonymousClass004.A1b(str, str2);
        List<Integer> version = parseVersion(str);
        List<Integer> version2 = parseVersion(str2);
        if (isOlderThan(version, version2)) {
            if (C8j4.A0H(version2, zA1b ? 1 : 0) - C8j4.A0H(version, zA1b ? 1 : 0) >= 2 || j >= 7) {
                return BlockType.HARD;
            }
            if (j >= 3) {
                return BlockType.SOFT;
            }
        }
        return BlockType.NONE;
    }

    public final boolean isVersionOlderThan$fbandroid_express_aura_java_com_facebook_aura_appupdate_appupdate(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return isOlderThan(parseVersion(str), parseVersion(str2));
    }
}
