package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C06H;
import X.C20Q;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3pU;
import X.C3rb;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.G0W;
import X.GDB;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.Hxb;
import X.HzC;
import X.HzP;
import X.InterfaceC7549F2g;
import com.facebook.aura.gateway.HatchCvmReplacement;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes2.dex */
public final class HatchCvmReplacePoller implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final long MAX_POLL_INTERVAL_MS = 60000;
    public static final long POLL_INTERVAL_MS = 5000;
    public final HatchGatewayPrefsStore prefsStore;
    public final C3UX scope;
    public final HatchCvmReplaceStore store;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchCvmReplacePoller$1", f = "HatchCvmReplacePoller.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchCvmReplacePoller$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.gateway.HatchCvmReplacePoller$1$1", f = "HatchCvmReplacePoller.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.gateway.HatchCvmReplacePoller$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01671 extends AbstractC07127nr implements G0W<Boolean, HatchCvmReplacement, HtJ<? super HxE<? extends String, ? extends String>>, Object> {
            public /* synthetic */ Object L$0;
            public /* synthetic */ boolean Z$0;
            public int label;
            public final /* synthetic */ HatchCvmReplacePoller this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01671(HatchCvmReplacePoller hatchCvmReplacePoller, HtJ<? super C01671> htJ) {
                super(3, htJ);
                this.this$0 = hatchCvmReplacePoller;
            }

            public final Object invoke(boolean z, HatchCvmReplacement hatchCvmReplacement, HtJ<? super HxE<String, String>> htJ) {
                C01671 c01671 = new C01671(this.this$0, htJ);
                c01671.Z$0 = z;
                c01671.L$0 = hatchCvmReplacement;
                return c01671.invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                boolean z = this.Z$0;
                HatchCvmReplacement hatchCvmReplacement = (HatchCvmReplacement) this.L$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                HatchCvmReplacement.Active activeForVm = HatchCvmReplaceStoreKt.forVm(hatchCvmReplacement, C3cG.A0a(this.this$0.prefsStore));
                if (!z || activeForVm == null) {
                    return null;
                }
                return C3cG.A0r(activeForVm.vmId, activeForVm.attemptId);
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HatchCvmReplacement hatchCvmReplacement, HtJ<? super HxE<? extends String, ? extends String>> htJ) {
                return invoke(AnonymousClass001.A1X(bool), hatchCvmReplacement, (HtJ<? super HxE<String, String>>) htJ);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.gateway.HatchCvmReplacePoller$1$2", f = "HatchCvmReplacePoller.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.gateway.HatchCvmReplacePoller$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<HxE<? extends String, ? extends String>, HtJ<? super Unit>, Object> {
            public /* synthetic */ Object L$0;
            public int label;
            public final /* synthetic */ HatchCvmReplacePoller this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(HatchCvmReplacePoller hatchCvmReplacePoller, HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
                this.this$0 = hatchCvmReplacePoller;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, htJ);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(HxE<? extends String, ? extends String> hxE, HtJ<? super Unit> htJ) {
                return invoke2((HxE<String, String>) hxE, htJ);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                HxE hxE = (HxE) this.L$0;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    if (hxE != null) {
                        HatchCvmReplacePoller hatchCvmReplacePoller = this.this$0;
                        String str = (String) hxE.first;
                        this.L$0 = null;
                        this.label = 1;
                        if (hatchCvmReplacePoller.pollUntilSettled(str, this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(HxE<String, String> hxE, HtJ<? super Unit> htJ) {
                return ((AnonymousClass2) create(hxE, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchCvmReplacePoller.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C20Q c20qA01 = GDB.A01(AuraAppLifecycleManager.isAppInForegroundFlow);
                HatchCvmReplacePoller hatchCvmReplacePoller = HatchCvmReplacePoller.this;
                C20Q c20qA04 = C3rb.A04(new C01671(hatchCvmReplacePoller, null), c20qA01, hatchCvmReplacePoller.store.replacement);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(HatchCvmReplacePoller.this, null);
                this.label = 1;
                if (C3pU.A00(this, anonymousClass2, c20qA04) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchCvmReplacePoller.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchCvmReplacePoller", f = "HatchCvmReplacePoller.kt", l = {61, 63}, m = "pollUntilSettled", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchCvmReplacePoller$pollUntilSettled$1, reason: invalid class name and case insensitive filesystem */
    public final class C120631 extends HzP {
        public int I$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C120631(HtJ<? super C120631> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchCvmReplacePoller.this.pollUntilSettled(null, this);
        }
    }

    private final long pollDelayMs(int i) {
        if (i > 4) {
            i = 4;
        }
        long j = 5000 << i;
        if (j > 60000) {
            return 60000L;
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        if (com.facebook.aura.gateway.HatchVmRepository.INSTANCE.serverStatedVmType$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(r7.userSession, r8) != com.facebook.aura.gateway.HatchlingVmType.HATCH_CVM) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0090 -> B:12:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object pollUntilSettled(java.lang.String r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.gateway.HatchCvmReplacePoller.C120631
            if (r0 == 0) goto La7
            r4 = r9
            com.facebook.aura.gateway.HatchCvmReplacePoller$pollUntilSettled$1 r4 = (com.facebook.aura.gateway.HatchCvmReplacePoller.C120631) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La7
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L93
            if (r0 == r2) goto L6e
            if (r0 != r3) goto Lae
            int r6 = r4.I$0
            java.lang.Object r0 = r4.L$0
            java.lang.String r8 = X.C3cG.A0d(r0, r1)
        L28:
            if (r1 != 0) goto L4d
            int r6 = r6 + 1
        L2c:
            com.facebook.aura.gateway.HatchCvmReplaceStore r0 = r7.store
            X.1BN<com.facebook.aura.gateway.HatchCvmReplacement> r0 = r0.replacement
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.gateway.HatchCvmReplacement r0 = (com.facebook.aura.gateway.HatchCvmReplacement) r0
            com.facebook.aura.gateway.HatchCvmReplacement$Active r0 = com.facebook.aura.gateway.HatchCvmReplaceStoreKt.forVm(r0, r8)
            if (r0 == 0) goto La2
            long r0 = r7.pollDelayMs(r6)
            r4.L$0 = r8
            r4.I$0 = r6
            r4.label = r2
            java.lang.Object r0 = X.C7Bq.A01(r0, r4)
            if (r0 != r5) goto L76
            return r5
        L4d:
            com.facebook.aura.gateway.HatchCvmReplacement$Unknown r0 = com.facebook.aura.gateway.HatchCvmReplacement.Unknown.INSTANCE
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto La2
            com.facebook.aura.gateway.HatchCvmReplacement$NotFound r0 = com.facebook.aura.gateway.HatchCvmReplacement.NotFound.INSTANCE
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto La2
            com.facebook.aura.gateway.HatchCvmReplacement$None r0 = com.facebook.aura.gateway.HatchCvmReplacement.None.INSTANCE
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto La5
            boolean r0 = r1 instanceof com.facebook.aura.gateway.HatchCvmReplacement.Active
            if (r0 != 0) goto La5
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L6e:
            int r6 = r4.I$0
            java.lang.Object r0 = r4.L$0
            java.lang.String r8 = X.C3cG.A0d(r0, r1)
        L76:
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore r0 = r7.prefsStore
            java.lang.String r0 = X.C3cG.A0a(r0)
            boolean r0 = X.C7384Etj.areEqual(r0, r8)
            if (r0 == 0) goto La2
            com.facebook.aura.gateway.HatchCvmReplaceStore r1 = r7.store
            com.facebook.aura.gateway.HatchCvmReplaceSource r0 = com.facebook.aura.gateway.HatchCvmReplaceSource.POLL
            r4.L$0 = r8
            r4.I$0 = r6
            r4.label = r3
            java.lang.Object r1 = r1.refresh(r8, r0, r4)
            if (r1 != r5) goto L28
            return r5
        L93:
            X.Hwg.A00(r1)
            com.facebook.aura.gateway.HatchVmRepository r1 = com.facebook.aura.gateway.HatchVmRepository.INSTANCE
            X.CGz r0 = r7.userSession
            com.facebook.aura.gateway.HatchlingVmType r1 = r1.serverStatedVmType$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(r0, r8)
            com.facebook.aura.gateway.HatchlingVmType r0 = com.facebook.aura.gateway.HatchlingVmType.HATCH_CVM
            if (r1 == r0) goto La5
        La2:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        La5:
            r6 = 0
            goto L2c
        La7:
            com.facebook.aura.gateway.HatchCvmReplacePoller$pollUntilSettled$1 r4 = new com.facebook.aura.gateway.HatchCvmReplacePoller$pollUntilSettled$1
            r4.<init>(r9)
            goto L12
        Lae:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchCvmReplacePoller.pollUntilSettled(java.lang.String, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        Hxb.A03(null, this.scope);
    }

    public final class Companion {
        public final HatchCvmReplacePoller getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchCvmReplacePoller) abstractC3358CGz.A03(HatchCvmReplacePoller.class, new HatchCvmReplacePoller$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchCvmReplacePoller(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        HzC hzCA0x = C3cH.A0x(C3cG.A0v());
        this.scope = hzCA0x;
        this.prefsStore = C3cG.A0D(abstractC3358CGz);
        this.store = HatchCvmReplaceStore.Companion.getInstance(abstractC3358CGz);
        AnonymousClass001.A1J(new AnonymousClass1(null), hzCA0x);
    }

    public /* synthetic */ HatchCvmReplacePoller(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
