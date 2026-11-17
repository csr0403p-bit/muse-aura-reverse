package com.facebook.aura.devices.token;

import X.A3q;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BzK;
import X.C3UX;
import X.C3cI;
import X.C4oT;
import X.C9258GBl;
import X.CH0;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC2261BLa;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefStore;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefs;
import com.facebook.aura.common.prefs.AuraUserPrefStoreKey;
import com.facebook.aura.common.prefs.AuraUserPrefs;
import com.facebook.aura.devices.intf.LinkDeviceTokenRevokeOutcome;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.json.HatchProblemJson;
import com.facebook.aura.json.HatchProblemJsonKt;
import com.facebook.aura.json.NetworkException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class LinkDeviceTokenMinter {
    public static final LinkDeviceTokenMinter INSTANCE = new LinkDeviceTokenMinter();
    public static final InterfaceC2261BLa unknownRevokesLock = new C9258GBl();
    public static final AtomicBoolean legacyRecordDropped = new AtomicBoolean(false);

    public final class RevokesStore implements AuraUserPrefStoreKey {
        public static final RevokesStore INSTANCE = new RevokesStore();
        public static final String key = "hatch_link_device_token_revokes";

        @Override // com.facebook.aura.common.prefs.AuraUserPrefStoreKey
        public String getKey() {
            return key;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceTokenMinter$dropLegacyRecord$2", f = "LinkDeviceTokenMinter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceTokenMinter$dropLegacyRecord$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            BzK bzKA9q = AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.LINK_DEVICE_KEY_REVOCATIONS).A9q();
            bzKA9q.Aae(LinkDeviceTokenMinterKt.UNKNOWN_REVOKES_KEY);
            bzKA9q.apply();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceTokenMinter", f = "LinkDeviceTokenMinter.kt", l = {176}, m = "hasUnknownRevoke", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceTokenMinter$hasUnknownRevoke$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkDeviceTokenMinter.this.hasUnknownRevoke(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceTokenMinter", f = "LinkDeviceTokenMinter.kt", l = {71, 74, 75, 240}, m = "mintDeviceTokens", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceTokenMinter$mintDeviceTokens$1, reason: invalid class name and case insensitive filesystem */
    public final class C117051 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;
        public /* synthetic */ Object result;

        public C117051(HtJ<? super C117051> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkDeviceTokenMinter.this.mintDeviceTokens(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceTokenMinter", f = "LinkDeviceTokenMinter.kt", l = {234, 191, 194}, m = "recordUnknownRevoke", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceTokenMinter$recordUnknownRevoke$1, reason: invalid class name and case insensitive filesystem */
    public final class C117061 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C117061(HtJ<? super C117061> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkDeviceTokenMinter.this.recordUnknownRevoke(null, null, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceTokenMinter", f = "LinkDeviceTokenMinter.kt", l = {120}, m = "revokeDeviceTokens", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceTokenMinter$revokeDeviceTokens$1, reason: invalid class name and case insensitive filesystem */
    public final class C117071 extends HzP {
        public Object L$0;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C117071(HtJ<? super C117071> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkDeviceTokenMinter.this.revokeDeviceTokens(null, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceTokenMinter", f = "LinkDeviceTokenMinter.kt", l = {AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS, 132, 241, 159}, m = "revokeDeviceTokensWithOutcome", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceTokenMinter$revokeDeviceTokensWithOutcome$1, reason: invalid class name and case insensitive filesystem */
    public final class C117081 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C117081(HtJ<? super C117081> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkDeviceTokenMinter.this.revokeDeviceTokensWithOutcome(null, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceTokenMinter", f = "LinkDeviceTokenMinter.kt", l = {220}, m = "settleUnknownRevoke", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceTokenMinter$settleUnknownRevoke$1, reason: invalid class name and case insensitive filesystem */
    public final class C117091 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C117091(HtJ<? super C117091> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkDeviceTokenMinter.this.settleUnknownRevoke(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceTokenMinter", f = "LinkDeviceTokenMinter.kt", l = {180}, m = "unknownRevokes", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceTokenMinter$unknownRevokes$1, reason: invalid class name and case insensitive filesystem */
    public final class C117101 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C117101(HtJ<? super C117101> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkDeviceTokenMinter.this.unknownRevokes(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceTokenMinter$unknownRevokes$2", f = "LinkDeviceTokenMinter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceTokenMinter$unknownRevokes$2, reason: invalid class name and case insensitive filesystem */
    public final class C117112 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Set<String>>, Object> {
        public final /* synthetic */ AbstractC3358CGz $session;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117112(AbstractC3358CGz abstractC3358CGz, HtJ<? super C117112> htJ) {
            super(2, htJ);
            this.$session = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C117112(this.$session, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Set<String>> htJ) {
            return new C117112(this.$session, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return LinkDeviceTokenMinter.INSTANCE.unknownRevokesPrefs(this.$session).getStringSet(LinkDeviceTokenMinterKt.UNKNOWN_REVOKES_KEY, A3q.A00);
        }
    }

    private final boolean answeredByServer(NetworkException networkException) {
        int i;
        return (networkException == null || (i = networkException.httpResponseCode) < 1 || i == 502 || i == 503 || i == 504) ? false : true;
    }

    /* loaded from: classes.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LinkDeviceTokenRevokeOutcome.values().length];
            try {
                AnonymousClass002.A13(LinkDeviceTokenRevokeOutcome.REVOKED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(LinkDeviceTokenRevokeOutcome.ANSWERED_NOT_REVOKED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(LinkDeviceTokenRevokeOutcome.NOT_SENT, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(LinkDeviceTokenRevokeOutcome.UNKNOWN, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object dropLegacyRecord(HtJ<? super Unit> htJ) {
        Object objA00;
        return (C3cI.A1W(legacyRecordDropped) && (objA00 = GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(null))) == EnumC10460Hji.A02) ? objA00 : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hasUnknownRevoke(java.lang.String r6, X.HtJ<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.devices.token.LinkDeviceTokenMinter.AnonymousClass1
            if (r0 == 0) goto L48
            r4 = r7
            com.facebook.aura.devices.token.LinkDeviceTokenMinter$hasUnknownRevoke$1 r4 = (com.facebook.aura.devices.token.LinkDeviceTokenMinter.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 != r2) goto L4e
            java.lang.Object r6 = r4.L$0
            X.Hwg.A00(r1)
        L22:
            java.util.Set r1 = (java.util.Set) r1
            boolean r0 = r1.contains(r6)
        L28:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L2d:
            X.Hwg.A00(r1)
            com.facebook.aura.auth.AuraSessionManager r0 = com.facebook.aura.auth.AuraSessionManager.INSTANCE
            X.CGz r1 = r0.getCurrentSession()
            if (r1 != 0) goto L3a
            r0 = 0
            goto L28
        L3a:
            r4.L$0 = r6
            r0 = 0
            r4.L$1 = r0
            r4.label = r2
            java.lang.Object r1 = r5.unknownRevokes(r1, r4)
            if (r1 != r3) goto L22
            return r3
        L48:
            com.facebook.aura.devices.token.LinkDeviceTokenMinter$hasUnknownRevoke$1 r4 = new com.facebook.aura.devices.token.LinkDeviceTokenMinter$hasUnknownRevoke$1
            r4.<init>(r7)
            goto L12
        L4e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.token.LinkDeviceTokenMinter.hasUnknownRevoke(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(2:4|(1:6)(1:13))(0)|7|(1:(3:(1:(5:12|54|14|45|46)(2:17|18))(7:19|53|32|33|(1:35)(1:39)|36|(3:38|40|41)(4:42|(1:44)|45|46))|50|51)(1:20))(2:21|(1:23))|52|24|(3:26|27|28)(6:29|(1:31)|33|(0)(0)|36|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: all -> 0x00d2, TryCatch #1 {all -> 0x00d2, blocks: (B:32:0x008f, B:33:0x0092, B:35:0x0096, B:36:0x009a, B:38:0x00a0, B:42:0x00ac, B:39:0x00a3), top: B:53:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0 A[Catch: all -> 0x00d2, TryCatch #1 {all -> 0x00d2, blocks: (B:32:0x008f, B:33:0x0092, B:35:0x0096, B:36:0x009a, B:38:0x00a0, B:42:0x00ac, B:39:0x00a3), top: B:53:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3 A[Catch: all -> 0x00d2, TRY_LEAVE, TryCatch #1 {all -> 0x00d2, blocks: (B:32:0x008f, B:33:0x0092, B:35:0x0096, B:36:0x009a, B:38:0x00a0, B:42:0x00ac, B:39:0x00a3), top: B:53:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac A[Catch: all -> 0x00d2, TRY_ENTER, TryCatch #1 {all -> 0x00d2, blocks: (B:32:0x008f, B:33:0x0092, B:35:0x0096, B:36:0x009a, B:38:0x00a0, B:42:0x00ac, B:39:0x00a3), top: B:53:0x008f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object recordUnknownRevoke(X.AbstractC3358CGz r8, java.lang.String r9, boolean r10, X.HtJ<? super kotlin.Unit> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.token.LinkDeviceTokenMinter.recordUnknownRevoke(X.CGz, java.lang.String, boolean, X.HtJ):java.lang.Object");
    }

    private final LinkSdkTokenFailure sdkTokenFailureOf(Throwable th) {
        HatchProblemJson hatchProblemJsonHatchProblemOf = HatchProblemJsonKt.hatchProblemOf((!(th instanceof NetworkException) || th == null) ? null : th.getMessage());
        String str = hatchProblemJsonHatchProblemOf != null ? hatchProblemJsonHatchProblemOf.type : null;
        if ("sdkTokenInvalid".equals(str)) {
            return LinkSdkTokenFailure.INVALID;
        }
        if ("sdkTokenDeviceLimitReached".equals(str)) {
            return LinkSdkTokenFailure.DEVICE_LIMIT_REACHED;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object settleUnknownRevoke(java.lang.String r7, X.HtJ<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.devices.token.LinkDeviceTokenMinter.C117091
            if (r0 == 0) goto L45
            r5 = r8
            com.facebook.aura.devices.token.LinkDeviceTokenMinter$settleUnknownRevoke$1 r5 = (com.facebook.aura.devices.token.LinkDeviceTokenMinter.C117091) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L36
            if (r0 != r3) goto L51
            X.Hwg.A00(r4)
        L21:
            com.facebook.aura.devices.intf.LinkDeviceTokenRevokeOutcome r4 = (com.facebook.aura.devices.intf.LinkDeviceTokenRevokeOutcome) r4
            int r1 = r4.ordinal()
            if (r1 == r2) goto L4c
            if (r1 == r3) goto L4c
            r0 = 2
            if (r1 == r0) goto L4b
            r0 = 3
            if (r1 == r0) goto L4b
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L36:
            X.Hwg.A00(r4)
            r0 = 0
            r5.L$0 = r0
            r5.label = r3
            java.lang.Object r4 = r6.revokeDeviceTokensWithOutcome(r7, r3, r5)
            if (r4 != r1) goto L21
            return r1
        L45:
            com.facebook.aura.devices.token.LinkDeviceTokenMinter$settleUnknownRevoke$1 r5 = new com.facebook.aura.devices.token.LinkDeviceTokenMinter$settleUnknownRevoke$1
            r5.<init>(r8)
            goto L12
        L4b:
            r3 = 0
        L4c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L51:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.token.LinkDeviceTokenMinter.settleUnknownRevoke(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object unknownRevokes(X.AbstractC3358CGz r7, X.HtJ<? super java.util.Set<java.lang.String>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.devices.token.LinkDeviceTokenMinter.C117101
            if (r0 == 0) goto L39
            r5 = r8
            com.facebook.aura.devices.token.LinkDeviceTokenMinter$unknownRevokes$1 r5 = (com.facebook.aura.devices.token.LinkDeviceTokenMinter.C117101) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r0 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 != r3) goto L3f
            X.Hwg.A00(r0)
        L20:
            X.C7384Etj.A0W(r0)
            return r0
        L24:
            X.78T r2 = X.AnonymousClass002.A0s(r0)
            r1 = 0
            com.facebook.aura.devices.token.LinkDeviceTokenMinter$unknownRevokes$2 r0 = new com.facebook.aura.devices.token.LinkDeviceTokenMinter$unknownRevokes$2
            r0.<init>(r7, r1)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r0 = X.GAo.A00(r5, r2, r0)
            if (r0 != r4) goto L20
            return r4
        L39:
            com.facebook.aura.devices.token.LinkDeviceTokenMinter$unknownRevokes$1 r5 = new com.facebook.aura.devices.token.LinkDeviceTokenMinter$unknownRevokes$1
            r5.<init>(r8)
            goto L12
        L3f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.token.LinkDeviceTokenMinter.unknownRevokes(X.CGz, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4oT unknownRevokesPrefs(AbstractC3358CGz abstractC3358CGz) {
        return AuraUserPrefs.INSTANCE.get(((CH0) abstractC3358CGz).A01, RevokesStore.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mintDeviceTokens(java.lang.String r16, com.facebook.aura.devices.token.LinkDeviceApp r17, java.lang.String r18, X.HtJ<? super com.facebook.aura.devices.token.LinkDeviceTokenMintResult> r19) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.token.LinkDeviceTokenMinter.mintDeviceTokens(java.lang.String, com.facebook.aura.devices.token.LinkDeviceApp, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object revokeDeviceTokens(java.lang.String r6, boolean r7, X.HtJ<? super java.lang.Boolean> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.facebook.aura.devices.token.LinkDeviceTokenMinter.C117071
            if (r0 == 0) goto L3b
            r4 = r8
            com.facebook.aura.devices.token.LinkDeviceTokenMinter$revokeDeviceTokens$1 r4 = (com.facebook.aura.devices.token.LinkDeviceTokenMinter.C117071) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 != r1) goto L41
            X.Hwg.A00(r3)
        L20:
            com.facebook.aura.devices.intf.LinkDeviceTokenRevokeOutcome r0 = com.facebook.aura.devices.intf.LinkDeviceTokenRevokeOutcome.REVOKED
            if (r3 == r0) goto L25
            r1 = 0
        L25:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L2a:
            X.Hwg.A00(r3)
            r0 = 0
            r4.L$0 = r0
            r4.Z$0 = r7
            r4.label = r1
            java.lang.Object r3 = r5.revokeDeviceTokensWithOutcome(r6, r7, r4)
            if (r3 != r2) goto L20
            return r2
        L3b:
            com.facebook.aura.devices.token.LinkDeviceTokenMinter$revokeDeviceTokens$1 r4 = new com.facebook.aura.devices.token.LinkDeviceTokenMinter$revokeDeviceTokens$1
            r4.<init>(r8)
            goto L12
        L41:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.token.LinkDeviceTokenMinter.revokeDeviceTokens(java.lang.String, boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0118 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object revokeDeviceTokensWithOutcome(java.lang.String r19, boolean r20, X.HtJ<? super com.facebook.aura.devices.intf.LinkDeviceTokenRevokeOutcome> r21) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.token.LinkDeviceTokenMinter.revokeDeviceTokensWithOutcome(java.lang.String, boolean, X.HtJ):java.lang.Object");
    }
}
