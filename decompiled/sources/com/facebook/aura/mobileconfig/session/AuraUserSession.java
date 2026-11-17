package com.facebook.aura.mobileconfig.session;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3143BzU;
import X.C3UX;
import X.C3cI;
import X.C5057DRi;
import X.C60P;
import X.C7384Etj;
import X.C9X;
import X.CFK;
import X.DRZ;
import X.DS1;
import X.F18;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzP;
import com.facebook.mobileconfig.MobileConfigFetcher;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraUserSession implements AuraMobileConfigProvider {
    public final String deviceId;
    public final MobileConfigFetcher fetcher;
    public final boolean isE2eMode;
    public AuraMobileConfigSession mcSession;
    public final F18<C3143BzU> paramsProvider;
    public final Function0<String> userIdProvider;

    @DebugMetadata(c = "com.facebook.aura.mobileconfig.session.AuraUserSession", f = "AuraUserSession.kt", l = {105}, m = "afterLogin", v = 2)
    /* renamed from: com.facebook.aura.mobileconfig.session.AuraUserSession$afterLogin$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
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
            return AuraUserSession.this.afterLogin(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.mobileconfig.session.AuraUserSession$afterLogin$2", f = "AuraUserSession.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.mobileconfig.session.AuraUserSession$afterLogin$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ DRZ $mc;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DRZ drz, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$mc = drz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$mc, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new AnonymousClass2(this.$mc, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            MobileConfigManagerHolderImpl mobileConfigManagerHolderImplA00 = C5057DRi.A00(this.$mc.A09());
            if (mobileConfigManagerHolderImplA00 != null) {
                mobileConfigManagerHolderImplA00.clearChangeListeners();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.mobileconfig.session.AuraUserSession$fetchDeferredConfigs$1", f = "AuraUserSession.kt", l = {150}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.mobileconfig.session.AuraUserSession$fetchDeferredConfigs$1, reason: invalid class name and case insensitive filesystem */
    public final class C127061 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ DRZ $mc;
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127061(DRZ drz, HtJ<? super C127061> htJ) {
            super(2, htJ);
            this.$mc = drz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C127061(this.$mc, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new C127061(this.$mc, htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0049 -> B:6:0x0018). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                X.Hji r6 = X.EnumC10460Hji.A02
                int r0 = r10.label
                r5 = 1
                if (r0 == 0) goto L4c
                if (r0 != r5) goto L6f
                int r8 = r10.I$1
                int r7 = r10.I$0
                java.lang.Object r4 = r10.L$1
                X.DRZ r4 = (X.DRZ) r4
                java.lang.Object r3 = r10.L$0
                X.DS1 r3 = (X.DS1) r3
                X.Hwg.A00(r11)
            L18:
                int r8 = r8 + 1
            L1a:
                java.lang.String r9 = "AuraUserSession"
                if (r8 >= r7) goto L67
                X.DRi r0 = r4.A09()
                X.DRj r0 = r0.A02
                boolean r0 = r0.updateConfigs(r3)
                if (r0 != 0) goto L6c
                int r2 = r8 + 1
                java.lang.String r1 = "Deferred fetch rejected on attempt "
                java.lang.String r0 = ", retrying"
                java.lang.String r0 = X.FGI.A0I(r1, r2, r0)
                X.CFK.A06(r9, r0)
                r10.L$0 = r3
                r10.L$1 = r4
                r10.I$0 = r7
                r10.I$1 = r8
                r10.I$2 = r8
                r10.label = r5
                r0 = 500(0x1f4, double:2.47E-321)
                java.lang.Object r0 = X.C7Bq.A01(r0, r10)
                if (r0 != r6) goto L18
                return r6
            L4c:
                X.Hwg.A00(r11)
                X.DS1 r3 = new X.DS1
                r3.<init>()
                X.DRZ r4 = r10.$mc
                r0 = 0
                r3.A06 = r0
                r3.A07 = r0
                r3.A00 = r0
                com.facebook.aura.mobileconfig.session.AuraUserSession$fetchDeferredConfigs$1$options$1$1 r0 = new com.facebook.aura.mobileconfig.session.AuraUserSession$fetchDeferredConfigs$1$options$1$1
                r0.<init>()
                r3.A01 = r0
                r8 = 0
                r7 = 5
                goto L1a
            L67:
                java.lang.String r0 = "Deferred fetch of remaining configs never started"
                X.CFK.A04(r9, r0)
            L6c:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L6f:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.mobileconfig.session.AuraUserSession.C127061.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void setMcSession(AuraMobileConfigSession auraMobileConfigSession) {
        C7384Etj.A0Y(auraMobileConfigSession, 0);
        this.mcSession = auraMobileConfigSession;
    }

    public static /* synthetic */ void createSession$default(AuraUserSession auraUserSession, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        auraUserSession.createSession(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean updateMobileConfigsWithRetry(DRZ drz, DS1 ds1) {
        boolean zUpdateConfigs;
        boolean z = this.isE2eMode;
        int i = 1;
        int i2 = z ? 5 : 1;
        while (true) {
            CFK.A05(AuraUserSessionKt.TAG, FGI.A0H("updateMobileConfigsWithRetry: attempt #", i));
            zUpdateConfigs = drz.A09().A02.updateConfigs(ds1);
            CFK.A05(AuraUserSessionKt.TAG, FGI.A0r("updateMobileConfigsWithRetry: ret=", zUpdateConfigs));
            if (zUpdateConfigs || i == i2) {
                break;
            }
            i++;
        }
        return zUpdateConfigs;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    @Override // com.facebook.aura.mobileconfig.session.AuraMobileConfigProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object afterLogin(X.HtJ<? super java.lang.Boolean> r13) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.mobileconfig.session.AuraUserSession.afterLogin(X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.mobileconfig.session.AuraMobileConfigProvider
    public void afterLogout() {
        this.mcSession.reset();
        CFK.A05(AuraUserSessionKt.TAG, "Reset to empty MC on logout");
    }

    public final void createSession(boolean z) {
        AuraMobileConfigSession.create$default(this.mcSession, this.fetcher, this.paramsProvider, null, null, null, null, null, z, 124, null);
    }

    @Override // com.facebook.aura.mobileconfig.session.AuraMobileConfigProvider
    public void fetchConfigs() {
        this.mcSession.fetchConfigs();
        CFK.A05(AuraUserSessionKt.TAG, "Scheduled user session MC fetch");
    }

    @Override // com.facebook.aura.mobileconfig.session.AuraMobileConfigProvider
    public Object fetchConfigsSynchronously(HtJ<? super Boolean> htJ) {
        return this.mcSession.fetchConfigsSynchronously(htJ);
    }

    @Override // com.facebook.aura.mobileconfig.session.AuraMobileConfigProvider
    public Object forceEmergencyPushFetch(HtJ<? super Unit> htJ) {
        DRZ mCFactory = this.mcSession.getMCFactory();
        if (mCFactory != null) {
            mCFactory.A09().updateEmergencyPushConfigs();
        } else {
            CFK.A04(AuraUserSessionKt.TAG, "Emergency Push failed to update");
        }
        return Unit.INSTANCE;
    }

    @Override // com.facebook.aura.mobileconfig.session.AuraMobileConfigProvider
    public DRZ getMCFactory() {
        return this.mcSession.getMCFactory();
    }

    public final AuraMobileConfigSession getMcSession() {
        return this.mcSession;
    }

    public AuraUserSession(MobileConfigFetcher mobileConfigFetcher, F18<C3143BzU> f18, Function0<String> function0, String str) {
        boolean zA1Y = C60P.A1Y(mobileConfigFetcher, f18);
        AnonymousClass002.A1B(function0, 2, str);
        this.fetcher = mobileConfigFetcher;
        this.paramsProvider = f18;
        this.userIdProvider = function0;
        this.deviceId = str;
        this.mcSession = new AuraMobileConfigSession(function0, str, 2);
        this.isE2eMode = C9X.A04();
        if (function0.invoke() != null) {
            createSession(zA1Y);
        } else {
            CFK.A06(AuraUserSessionKt.TAG, "Using AuraUserSession in logout status.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchDeferredConfigs(DRZ drz, AtomicBoolean atomicBoolean) {
        if (C3cI.A1W(atomicBoolean)) {
            AnonymousClass001.A1J(new C127061(drz, null), Hxb.A02(AnonymousClass001.A0y()));
        }
    }
}
