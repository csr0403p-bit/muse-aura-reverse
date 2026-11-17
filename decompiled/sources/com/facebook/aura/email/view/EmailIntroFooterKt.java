package com.facebook.aura.email.view;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C31u;
import X.C3U4;
import X.C78N;
import X.C7BY;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7359EnW;
import com.facebook.aura.R;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.email.model.EmailSetupDisplay;
import com.facebook.aura.email.view.MC;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class EmailIntroFooterKt {

    /* renamed from: com.facebook.aura.email.view.EmailIntroFooterKt$EmailIntroFooter$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ EmailSetupDisplay $display;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onContinue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(EmailSetupDisplay emailSetupDisplay, BRg bRg, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$display = emailSetupDisplay;
            this.$modifier = bRg;
            this.$onContinue = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            EmailIntroFooterKt.EmailIntroFooter(this.$display, this.$modifier, this.$onContinue, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.ApQ rememberEmailLinkText(java.lang.String r30, X.BFM r31, int r32) {
        /*
            r0 = 0
            r3 = r30
            X.C7384Etj.A0Y(r3, r0)
            r2 = r31
            long r24 = X.C06G.A07(r2)
            X.BG3 r21 = X.BG3.A03
            r13 = 0
            long r26 = X.C1809ArT.A01
            long r30 = X.B6A.A07
            X.Aro r12 = new X.Aro
            r14 = r13
            r15 = r13
            r16 = r13
            r17 = r13
            r18 = r13
            r19 = r13
            r20 = r13
            r22 = r13
            r23 = r13
            r28 = r26
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r30)
            r0 = r32 & 14
            r0 = r0 ^ 6
            r6 = 4
            r1 = 0
            r5 = 1
            if (r0 <= r6) goto L39
            boolean r0 = r2.A65(r3)
            if (r0 != 0) goto L3e
        L39:
            r4 = r32 & 6
            r0 = 0
            if (r4 != r6) goto L3f
        L3e:
            r0 = 1
        L3f:
            boolean r0 = X.AnonymousClass001.A1R(r2, r12, r0)
            java.lang.Object r4 = r2.AaT()
            if (r0 != 0) goto L4d
            java.lang.Object r0 = X.C78N.A00
            if (r4 != r0) goto Ldc
        L4d:
            X.ApS r4 = X.AnonymousClass006.A0W()
            java.lang.String r6 = "\\[([^\\]]+)\\]\\(([^)]+)\\)"
            X.7l3 r0 = new X.7l3
            r0.<init>(r6)
            r6 = 2
            X.79x r0 = X.C06827l3.A00(r3, r0)
            java.util.Iterator r11 = r0.iterator()
        L61:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Lce
            java.lang.Object r10 = r11.next()
            X.1Lu r10 = (X.C1Lu) r10
            X.ADq r0 = r10.AJM()
            int r0 = r0.A00
            X.AnonymousClass005.A0s(r4, r3, r1, r0)
            java.util.List r0 = r10.AG1()
            java.lang.Object r7 = r0.get(r5)
            java.lang.String r7 = (java.lang.String) r7
            java.util.List r0 = r10.AG1()
            java.lang.Object r8 = r0.get(r6)
            java.lang.String r8 = (java.lang.String) r8
            android.net.Uri r9 = android.net.Uri.parse(r8)
            java.lang.String r1 = r9.getScheme()
            java.lang.String r0 = "https"
            if (r1 == 0) goto Lbd
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto Lbd
            java.lang.String r0 = r9.getHost()
            if (r0 == 0) goto Lbd
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 != 0) goto Lbd
            X.Aoc r1 = new X.Aoc
            r1.<init>(r12, r13, r13, r13)
            X.1ji r0 = new X.1ji
            r0.<init>(r1, r8)
            int r1 = r4.A01(r0)
            r4.A0E(r7)     // Catch: java.lang.Throwable -> Lc9
            r4.A06(r1)
            goto Lc0
        Lbd:
            r4.A0E(r7)
        Lc0:
            X.ADq r0 = r10.AJM()
            int r0 = r0.A01
            int r1 = r0 + 1
            goto L61
        Lc9:
            r0 = move-exception
            r4.A06(r1)
            throw r0
        Lce:
            java.lang.String r0 = r3.substring(r1)
            r4.A0E(r0)
            X.ApQ r4 = r4.A04()
            r2.Ai0(r4)
        Ldc:
            X.ApQ r4 = (X.ApQ) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.view.EmailIntroFooterKt.rememberEmailLinkText(java.lang.String, X.BFM, int):X.ApQ");
    }

    public static final void EmailIntroFooter(EmailSetupDisplay emailSetupDisplay, BRg bRg, Function0<Unit> function0, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass002.A1A(emailSetupDisplay, 0, function0);
        bfm.AgG(1588495395);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, emailSetupDisplay) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new Object() { // from class: com.facebook.aura.email.view.EmailIntroFooterKt$EmailIntroFooter$legalUrls$1$1
                    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(EmailIntroFooterKt$EmailIntroFooter$legalUrls$1$1.class, "privacy", "getPrivacy()Ljava/lang/String;");
                    public final C31u privacy$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_legal_urls_sessionless.legal_muse_privacy_url);

                    public final String getPrivacy() {
                        return (String) this.privacy$delegate.getValue(this, $$delegatedProperties[0]);
                    }
                };
                bfm.Ai0(objAaT);
            }
            String privacy = ((EmailIntroFooterKt$EmailIntroFooter$legalUrls$1$1) objAaT).getPrivacy();
            if (C7BY.A0j(privacy)) {
                privacy = "https://muse.ai/privacy";
            }
            String strA02 = emailSetupDisplay.introFooter;
            if (strA02 == null || C7BY.A0j(strA02)) {
                bfm.AgE(1830698955);
                strA02 = AbstractC2271BQs.A02(bfm, new Object[]{HatchAppName.value, HatchAppName.value, privacy}, R.string._name_removed__res_0x7f12097a);
            } else {
                bfm.AgE(1830697064);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA0B = C3U4.A0B(bRg2.then(c1062ATq), 24.0f, 12.0f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            AuraDividerKt.AuraDivider(null, null, false, bfm, 0, 7);
            AuraTextKt.m2640AuraTextVmYn7U0(rememberEmailLinkText(strA02, bfm, 0), C3U4.A06(c1062ATq, 12.0f), C06G.A08(bfm), C06G.A0S(bfm), null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, 48, 0, 32752);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120944), null, c1062ATq, null, null, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 3072, (iA0T << 6) & 57344, 0, 134201333);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(emailSetupDisplay, bRg2, function0, i, i2);
        }
    }
}
