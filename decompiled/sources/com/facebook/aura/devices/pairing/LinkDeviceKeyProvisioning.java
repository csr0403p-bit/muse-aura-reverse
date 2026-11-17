package com.facebook.aura.devices.pairing;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFI;
import X.C06H;
import X.C60O;
import X.C7384Etj;
import X.G0U;
import X.G2j;
import X.HtJ;
import X.HzP;
import com.facebook.aura.devices.token.LinkDeviceKey;
import com.facebook.aura.devices.token.LinkDeviceKeyRecord;
import com.facebook.aura.devices.token.LinkDeviceKeyRegisterResult;
import com.facebook.aura.devices.token.LinkDeviceKeyRegistration;
import com.facebook.aura.devices.token.LinkDeviceKeyRole;
import com.facebook.aura.devices.token.LinkDeviceKeyTarget;
import com.facebook.aura.devices.token.LinkDeviceKeyTargetResult;
import com.facebook.aura.devices.token.LinkDeviceKeys;
import com.facebook.aura.devices.token.LinkDeviceVmKind;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class LinkDeviceKeyProvisioning {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public static final Set<String> KEY_NOT_KEPT_STATUSES = BFI.A0H(new String[]{"auth_failed", "error_cvm_unsupported", "error_invalid_device_key", "error_missing_credentials", "error_storage", "wifi_failed"});
    public static final int REGISTRATION_ATTEMPTS = 3;
    public final G2j<LinkDeviceKeyRegistration, LinkDeviceKeyTarget, LinkDeviceKeyRecord, HtJ<? super LinkDeviceKeyRegisterResult>, Object> register;
    public final G0U<HtJ<? super LinkDeviceKeyTargetResult>, Object> resolveTarget;
    public final G0U<LinkDeviceKey, Unit> revokeDetached;
    public final G0U<HtJ<? super LinkDeviceVmKind>, Object> selectedVmKind;

    public final class Companion {
        public final LinkDeviceKeyProvisioning forSession(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            LinkDeviceKeys linkDeviceKeysForSession = LinkDeviceKeys.Companion.forSession(abstractC3358CGz);
            return new LinkDeviceKeyProvisioning(new LinkDeviceKeyProvisioning$Companion$forSession$1(linkDeviceKeysForSession), new LinkDeviceKeyProvisioning$Companion$forSession$2(linkDeviceKeysForSession, null), new LinkDeviceKeyProvisioning$Companion$forSession$3(linkDeviceKeysForSession, null), new LinkDeviceKeyProvisioning$Companion$forSession$4(linkDeviceKeysForSession));
        }

        public final String linkDeviceFamilyOf$fbandroid_express_aura_java_com_facebook_aura_devices_pairing_pairing(String str) {
            C7384Etj.A0Y(str, 0);
            StringBuilder sbA0w = C60O.A0w();
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (!Character.isISOControl(cCharAt)) {
                    sbA0w.append(cCharAt);
                }
            }
            String string = sbA0w.toString();
            if (string.length() > 32) {
                return string.substring(0, Character.isHighSurrogate(string.charAt(31)) ? 31 : 32);
            }
            return string;
        }

        public final LinkDeviceKeyRegistration registrationFor(LinkDeviceInfo linkDeviceInfo, boolean z) {
            C7384Etj.A0Y(linkDeviceInfo, 0);
            LinkDeviceKeyRole linkDeviceKeyRole = z ? LinkDeviceKeyRole.GADGET : LinkDeviceKeyRole.MUSE_HOME_LINK;
            String str = linkDeviceInfo.nodeId;
            return new LinkDeviceKeyRegistration(linkDeviceKeyRole, str, str, linkDeviceFamilyOf$fbandroid_express_aura_java_com_facebook_aura_devices_pairing_pairing(linkDeviceInfo.model));
        }

        public final Set<String> getKEY_NOT_KEPT_STATUSES() {
            return LinkDeviceKeyProvisioning.KEY_NOT_KEPT_STATUSES;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkDeviceKeyProvisioning", f = "LinkDeviceKeyProvisioning.kt", l = {105}, m = "keyedPlan", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.LinkDeviceKeyProvisioning$keyedPlan$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkDeviceKeyProvisioning.this.keyedPlan(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkDeviceKeyProvisioning", f = "LinkDeviceKeyProvisioning.kt", l = {126, 130}, m = "mintKey", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.LinkDeviceKeyProvisioning$mintKey$1, reason: invalid class name and case insensitive filesystem */
    public final class C116651 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C116651(HtJ<? super C116651> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkDeviceKeyProvisioning.this.mintKey(null, null, false, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkDeviceKeyProvisioning", f = "LinkDeviceKeyProvisioning.kt", l = {83, 89, 98}, m = "plan", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.LinkDeviceKeyProvisioning$plan$1, reason: invalid class name and case insensitive filesystem */
    public final class C116661 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C116661(HtJ<? super C116661> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkDeviceKeyProvisioning.this.plan(null, null, this);
        }
    }

    public final boolean isOutcome(String str) {
        C7384Etj.A0Y(str, 0);
        return str.equals(LinkDeviceKeyProvisioningKt.LINK_STATUS_AUTH_OK) || KEY_NOT_KEPT_STATUSES.contains(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f5, code lost:
    
        if (r14 >= r4) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, com.facebook.aura.devices.token.LinkDeviceKeyRecord] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c5 -> B:34:0x00ed). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00e8 -> B:12:0x0047). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mintKey(com.facebook.aura.devices.token.LinkDeviceKeyTarget r13, com.facebook.aura.devices.pairing.LinkDeviceInfo r14, boolean r15, java.util.Set<java.lang.String> r16, X.G0V<? super com.facebook.aura.devices.token.LinkDeviceKeyRecord, ? super X.HtJ<? super java.lang.Boolean>, ? extends java.lang.Object> r17, X.HtJ<? super com.facebook.aura.devices.pairing.LinkDeviceKeyMintResult> r18) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.LinkDeviceKeyProvisioning.mintKey(com.facebook.aura.devices.token.LinkDeviceKeyTarget, com.facebook.aura.devices.pairing.LinkDeviceInfo, boolean, java.util.Set, X.G0V, X.HtJ):java.lang.Object");
    }

    public final void revoke(LinkDeviceKey linkDeviceKey) {
        C7384Etj.A0Y(linkDeviceKey, 0);
        this.revokeDetached.invoke(linkDeviceKey);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LinkDeviceVmKind.values().length];
            try {
                AnonymousClass002.A13(LinkDeviceVmKind.CVM, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(LinkDeviceVmKind.SVM, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object keyedPlan(com.facebook.aura.devices.token.LinkDeviceVmKind r6, X.HtJ<? super com.facebook.aura.devices.pairing.LinkDeviceKeyPlan> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.devices.pairing.LinkDeviceKeyProvisioning.AnonymousClass1
            if (r0 == 0) goto L46
            r4 = r7
            com.facebook.aura.devices.pairing.LinkDeviceKeyProvisioning$keyedPlan$1 r4 = (com.facebook.aura.devices.pairing.LinkDeviceKeyProvisioning.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L46
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 != r1) goto L5d
            java.lang.Object r6 = r4.L$0
            X.Hwg.A00(r3)
        L22:
            com.facebook.aura.devices.token.LinkDeviceKeyTargetResult r3 = (com.facebook.aura.devices.token.LinkDeviceKeyTargetResult) r3
            boolean r0 = r3 instanceof com.facebook.aura.devices.token.LinkDeviceKeyTargetResult.Resolved
            if (r0 == 0) goto L4c
            com.facebook.aura.devices.token.LinkDeviceKeyTargetResult$Resolved r3 = (com.facebook.aura.devices.token.LinkDeviceKeyTargetResult.Resolved) r3
            com.facebook.aura.devices.token.LinkDeviceKeyTarget r2 = r3.target
            com.facebook.aura.devices.token.LinkDeviceVmKind r0 = r2.vmKind
            if (r0 != r6) goto L55
            com.facebook.aura.devices.pairing.LinkDeviceKeyPlan$Keyed r1 = new com.facebook.aura.devices.pairing.LinkDeviceKeyPlan$Keyed
            r1.<init>(r2)
            return r1
        L36:
            X.Hwg.A00(r3)
            X.G0U<X.HtJ<? super com.facebook.aura.devices.token.LinkDeviceKeyTargetResult>, java.lang.Object> r0 = r5.resolveTarget
            r4.L$0 = r6
            r4.label = r1
            java.lang.Object r3 = r0.invoke(r4)
            if (r3 != r2) goto L22
            return r2
        L46:
            com.facebook.aura.devices.pairing.LinkDeviceKeyProvisioning$keyedPlan$1 r4 = new com.facebook.aura.devices.pairing.LinkDeviceKeyProvisioning$keyedPlan$1
            r4.<init>(r7)
            goto L12
        L4c:
            boolean r0 = r3 instanceof com.facebook.aura.devices.token.LinkDeviceKeyTargetResult.Failed
            if (r0 != 0) goto L55
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L55:
            com.facebook.aura.devices.pairing.LinkDeviceKeySetupFailure r0 = com.facebook.aura.devices.pairing.LinkDeviceKeySetupFailure.DEVICE_KEY_UNAVAILABLE
            com.facebook.aura.devices.pairing.LinkDeviceKeyPlan$Blocked r1 = new com.facebook.aura.devices.pairing.LinkDeviceKeyPlan$Blocked
            r1.<init>(r0)
            return r1
        L5d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.LinkDeviceKeyProvisioning.keyedPlan(com.facebook.aura.devices.token.LinkDeviceVmKind, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object plan(com.facebook.aura.devices.pairing.LinkDeviceInfo r11, com.facebook.aura.devices.pairing.LinkOtaOffer r12, X.HtJ<? super com.facebook.aura.devices.pairing.LinkDeviceKeyPlan> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.facebook.aura.devices.pairing.LinkDeviceKeyProvisioning.C116661
            if (r0 == 0) goto L29
            r5 = r13
            com.facebook.aura.devices.pairing.LinkDeviceKeyProvisioning$plan$1 r5 = (com.facebook.aura.devices.pairing.LinkDeviceKeyProvisioning.C116661) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L29
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r8 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r7 = 3
            r6 = 2
            r3 = 0
            r9 = 1
            if (r0 == 0) goto L33
            if (r0 == r9) goto L51
            if (r0 == r6) goto L2f
            if (r0 == r7) goto L2f
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L29:
            com.facebook.aura.devices.pairing.LinkDeviceKeyProvisioning$plan$1 r5 = new com.facebook.aura.devices.pairing.LinkDeviceKeyProvisioning$plan$1
            r5.<init>(r13)
            goto L12
        L2f:
            X.Hwg.A00(r8)
            return r8
        L33:
            X.Hwg.A00(r8)
            boolean r0 = r12.isAvailable
            if (r0 == 0) goto L3f
            boolean r0 = r12.isRequestedByConfig
            r2 = 1
            if (r0 != 0) goto L40
        L3f:
            r2 = 0
        L40:
            X.G0U<X.HtJ<? super com.facebook.aura.devices.token.LinkDeviceVmKind>, java.lang.Object> r0 = r10.selectedVmKind
            r5.L$0 = r11
            r5.L$1 = r12
            r5.I$0 = r2
            r5.label = r9
            java.lang.Object r8 = r0.invoke(r5)
            if (r8 != r4) goto L5e
            return r4
        L51:
            int r2 = r5.I$0
            java.lang.Object r12 = r5.L$1
            com.facebook.aura.devices.pairing.LinkOtaOffer r12 = (com.facebook.aura.devices.pairing.LinkOtaOffer) r12
            java.lang.Object r11 = r5.L$0
            com.facebook.aura.devices.pairing.LinkDeviceInfo r11 = (com.facebook.aura.devices.pairing.LinkDeviceInfo) r11
            X.Hwg.A00(r8)
        L5e:
            com.facebook.aura.devices.token.LinkDeviceVmKind r8 = (com.facebook.aura.devices.token.LinkDeviceVmKind) r8
            if (r8 != 0) goto L6a
            com.facebook.aura.devices.pairing.LinkDeviceKeySetupFailure r1 = com.facebook.aura.devices.pairing.LinkDeviceKeySetupFailure.DEVICE_KEY_UNAVAILABLE
        L64:
            com.facebook.aura.devices.pairing.LinkDeviceKeyPlan$Blocked r0 = new com.facebook.aura.devices.pairing.LinkDeviceKeyPlan$Blocked
            r0.<init>(r1)
        L69:
            return r0
        L6a:
            int r0 = r11.deviceKeyAuth
            r1 = 0
            if (r0 < r9) goto L70
            r1 = 1
        L70:
            int r0 = r8.ordinal()
            if (r0 == r9) goto L90
            if (r0 != r3) goto Lb3
            if (r2 != 0) goto Lb8
            if (r1 == 0) goto Lb0
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.I$0 = r2
            r5.I$1 = r1
            r5.label = r7
        L89:
            java.lang.Object r0 = r10.keyedPlan(r8, r5)
            if (r0 != r4) goto L69
            return r4
        L90:
            boolean r0 = r11.getCanBindConfidentialVm()
            if (r0 == 0) goto La4
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.I$0 = r2
            r5.I$1 = r1
            r5.label = r6
            goto L89
        La4:
            if (r1 == 0) goto La9
            com.facebook.aura.devices.pairing.LinkDeviceKeySetupFailure r1 = com.facebook.aura.devices.pairing.LinkDeviceKeySetupFailure.CVM_UNSUPPORTED
            goto L64
        La9:
            boolean r0 = r12.isAvailable
            if (r0 != 0) goto Lb8
            com.facebook.aura.devices.pairing.LinkDeviceKeySetupFailure r1 = com.facebook.aura.devices.pairing.LinkDeviceKeySetupFailure.FIRMWARE_UPDATE_REQUIRED
            goto L64
        Lb0:
            com.facebook.aura.devices.pairing.LinkDeviceKeyPlan$Keyless r0 = com.facebook.aura.devices.pairing.LinkDeviceKeyPlan.Keyless.INSTANCE
            return r0
        Lb3:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        Lb8:
            com.facebook.aura.devices.pairing.LinkDeviceKeyPlan$OtaRound r0 = new com.facebook.aura.devices.pairing.LinkDeviceKeyPlan$OtaRound
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.LinkDeviceKeyProvisioning.plan(com.facebook.aura.devices.pairing.LinkDeviceInfo, com.facebook.aura.devices.pairing.LinkOtaOffer, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LinkDeviceKeyProvisioning(G0U<? super HtJ<? super LinkDeviceVmKind>, ? extends Object> g0u, G0U<? super HtJ<? super LinkDeviceKeyTargetResult>, ? extends Object> g0u2, G2j<? super LinkDeviceKeyRegistration, ? super LinkDeviceKeyTarget, ? super LinkDeviceKeyRecord, ? super HtJ<? super LinkDeviceKeyRegisterResult>, ? extends Object> g2j, G0U<? super LinkDeviceKey, Unit> g0u3) {
        AnonymousClass005.A14(g0u, g0u2, g2j, g0u3);
        this.selectedVmKind = g0u;
        this.resolveTarget = g0u2;
        this.register = g2j;
        this.revokeDetached = g0u3;
    }

    public final boolean settle(LinkDeviceKey linkDeviceKey, String str) {
        AnonymousClass003.A0u(linkDeviceKey, str);
        if (KEY_NOT_KEPT_STATUSES.contains(str)) {
            this.revokeDetached.invoke(linkDeviceKey);
        }
        return isOutcome(str);
    }
}
