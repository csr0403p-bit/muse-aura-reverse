package com.facebook.aura.navigation.entries;

import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C31u;
import X.C3UX;
import X.C7462Ewq;
import X.C78N;
import X.C7OQ;
import X.C7OU;
import X.G0U;
import X.G0V;
import X.HpR;
import X.InterfaceC7359EnW;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.entries.MC;
import com.facebook.aura.navigation.key.HatchSettingsSubdestination;
import com.facebook.aura.settings.HatchSettingsConfig;
import com.facebook.aura.settings.HatchSettingsScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class SettingsEntryProviderKt {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7462Ewq(SettingsEntryProviderKt.class, "addToHomeShortcutEnabled", "getAddToHomeShortcutEnabled()Z", 1)};
    public static final C31u addToHomeShortcutEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_add_to_home_shortcut);

    /* renamed from: com.facebook.aura.navigation.entries.SettingsEntryProviderKt$SettingsScreenContent$22, reason: invalid class name */
    public final class AnonymousClass22 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchSettingsSubdestination $initialSubdestination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass22(HatchSettingsSubdestination hatchSettingsSubdestination, int i, int i2) {
            super(2);
            this.$initialSubdestination = hatchSettingsSubdestination;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            SettingsEntryProviderKt.SettingsScreenContent(this.$initialSubdestination, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void SettingsScreenContent(HatchSettingsSubdestination hatchSettingsSubdestination, BFM bfm, int i, int i2) {
        Function0 function0;
        HatchSettingsSubdestination hatchSettingsSubdestination2 = hatchSettingsSubdestination;
        bfm.AgG(1276494567);
        int i3 = i2 & 1;
        int iA0D = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0D(bfm, AnonymousClass003.A0K(hatchSettingsSubdestination2)) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 3, 2), bfm, iA0D)) {
            if (i3 != 0) {
                hatchSettingsSubdestination2 = null;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT, obj);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f88);
            HpR hpR = new HpR();
            boolean zA1M = AnonymousClass003.A1M(bfm, abstractC3358CGzA0h, contextA0H);
            Object objAaT2 = bfm.AaT();
            if (zA1M || objAaT2 == obj) {
                objAaT2 = new SettingsEntryProviderKt$SettingsScreenContent$roleRequestLauncher$1$1(abstractC3358CGzA0h, contextA0H);
                bfm.Ai0(objAaT2);
            }
            C7OU c7ouA00 = C7OQ.A00(hpR, bfm, (G0U) objAaT2);
            HatchSettingsConfig hatchSettingsConfig = new HatchSettingsConfig(false, true, true, true, true, true, true, true, true, true, true, true, true, true);
            if (getAddToHomeShortcutEnabled()) {
                bfm.AgE(413522287);
                boolean zA1R = AnonymousClass001.A1R(bfm, strA01, AnonymousClass005.A1S(bfm, c3ux, abstractC3358CGzA0h, contextA0H));
                Object objAaT3 = bfm.AaT();
                if (zA1R || objAaT3 == obj) {
                    objAaT3 = new SettingsEntryProviderKt$SettingsScreenContent$1$1(c3ux, abstractC3358CGzA0h, contextA0H, strA01);
                    bfm.Ai0(objAaT3);
                }
                function0 = (Function0) objAaT3;
                AnonymousClass001.A1D(bfm);
            } else {
                AnonymousClass003.A0l(bfm, 414155741);
                function0 = null;
            }
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT4 = bfm.AaT();
            if (zA67 || objAaT4 == obj) {
                objAaT4 = new SettingsEntryProviderKt$SettingsScreenContent$2$1(auraNavigatorA0b);
                bfm.Ai0(objAaT4);
            }
            Function0 function02 = (Function0) objAaT4;
            boolean zA672 = bfm.A67(auraNavigatorA0b);
            Object objAaT5 = bfm.AaT();
            if (zA672 || objAaT5 == obj) {
                objAaT5 = new SettingsEntryProviderKt$SettingsScreenContent$3$1(auraNavigatorA0b);
                bfm.Ai0(objAaT5);
            }
            Function0 function03 = (Function0) objAaT5;
            boolean zA673 = bfm.A67(auraNavigatorA0b);
            Object objAaT6 = bfm.AaT();
            if (zA673 || objAaT6 == obj) {
                objAaT6 = new SettingsEntryProviderKt$SettingsScreenContent$4$1(auraNavigatorA0b);
                bfm.Ai0(objAaT6);
            }
            Function0 function04 = (Function0) objAaT6;
            boolean zA674 = bfm.A67(auraNavigatorA0b);
            Object objAaT7 = bfm.AaT();
            if (zA674 || objAaT7 == obj) {
                objAaT7 = new SettingsEntryProviderKt$SettingsScreenContent$5$1(auraNavigatorA0b);
                bfm.Ai0(objAaT7);
            }
            Function0 function05 = (Function0) objAaT7;
            boolean zA675 = bfm.A67(auraNavigatorA0b);
            Object objAaT8 = bfm.AaT();
            if (zA675 || objAaT8 == obj) {
                objAaT8 = new SettingsEntryProviderKt$SettingsScreenContent$6$1(auraNavigatorA0b);
                bfm.Ai0(objAaT8);
            }
            Function0 function06 = (Function0) objAaT8;
            Object objAaT9 = bfm.AaT();
            if (objAaT9 == obj) {
                objAaT9 = SettingsEntryProviderKt$SettingsScreenContent$7$1.INSTANCE;
                bfm.Ai0(objAaT9);
            }
            Function0 function07 = (Function0) objAaT9;
            boolean zA676 = bfm.A67(auraNavigatorA0b);
            Object objAaT10 = bfm.AaT();
            if (zA676 || objAaT10 == obj) {
                objAaT10 = new SettingsEntryProviderKt$SettingsScreenContent$8$1(auraNavigatorA0b);
                bfm.Ai0(objAaT10);
            }
            Function0 function08 = (Function0) objAaT10;
            boolean zA677 = bfm.A67(auraNavigatorA0b);
            Object objAaT11 = bfm.AaT();
            if (zA677 || objAaT11 == obj) {
                objAaT11 = new SettingsEntryProviderKt$SettingsScreenContent$9$1(auraNavigatorA0b);
                bfm.Ai0(objAaT11);
            }
            Function0 function09 = (Function0) objAaT11;
            boolean zA678 = bfm.A67(auraNavigatorA0b);
            Object objAaT12 = bfm.AaT();
            if (zA678 || objAaT12 == obj) {
                objAaT12 = new SettingsEntryProviderKt$SettingsScreenContent$10$1(auraNavigatorA0b);
                bfm.Ai0(objAaT12);
            }
            Function0 function010 = (Function0) objAaT12;
            boolean zA679 = bfm.A67(auraNavigatorA0b);
            Object objAaT13 = bfm.AaT();
            if (zA679 || objAaT13 == obj) {
                objAaT13 = new SettingsEntryProviderKt$SettingsScreenContent$11$1(auraNavigatorA0b);
                bfm.Ai0(objAaT13);
            }
            Function0 function011 = (Function0) objAaT13;
            boolean zA6710 = bfm.A67(auraNavigatorA0b);
            Object objAaT14 = bfm.AaT();
            if (zA6710 || objAaT14 == obj) {
                objAaT14 = new SettingsEntryProviderKt$SettingsScreenContent$12$1(auraNavigatorA0b);
                bfm.Ai0(objAaT14);
            }
            Function0 function012 = (Function0) objAaT14;
            boolean zA6711 = bfm.A67(auraNavigatorA0b);
            Object objAaT15 = bfm.AaT();
            if (zA6711 || objAaT15 == obj) {
                objAaT15 = new SettingsEntryProviderKt$SettingsScreenContent$13$1(auraNavigatorA0b);
                bfm.Ai0(objAaT15);
            }
            Function0 function013 = (Function0) objAaT15;
            boolean zA6712 = bfm.A67(auraNavigatorA0b);
            Object objAaT16 = bfm.AaT();
            if (zA6712 || objAaT16 == obj) {
                objAaT16 = new SettingsEntryProviderKt$SettingsScreenContent$14$1(auraNavigatorA0b);
                bfm.Ai0(objAaT16);
            }
            Function0 function014 = (Function0) objAaT16;
            boolean zA6713 = bfm.A67(auraNavigatorA0b);
            Object objAaT17 = bfm.AaT();
            if (zA6713 || objAaT17 == obj) {
                objAaT17 = new SettingsEntryProviderKt$SettingsScreenContent$15$1(auraNavigatorA0b);
                bfm.Ai0(objAaT17);
            }
            Function0 function015 = (Function0) objAaT17;
            boolean zA6714 = bfm.A67(auraNavigatorA0b);
            Object objAaT18 = bfm.AaT();
            if (zA6714 || objAaT18 == obj) {
                objAaT18 = new SettingsEntryProviderKt$SettingsScreenContent$16$1(auraNavigatorA0b);
                bfm.Ai0(objAaT18);
            }
            Function0 function016 = (Function0) objAaT18;
            Object objAaT19 = bfm.AaT();
            if (objAaT19 == obj) {
                objAaT19 = new SettingsEntryProviderKt$SettingsScreenContent$17$1(null);
                bfm.Ai0(objAaT19);
            }
            G0U g0u = (G0U) objAaT19;
            boolean zA6715 = bfm.A67(auraNavigatorA0b);
            Object objAaT20 = bfm.AaT();
            if (zA6715 || objAaT20 == obj) {
                objAaT20 = new SettingsEntryProviderKt$SettingsScreenContent$18$1(auraNavigatorA0b);
                bfm.Ai0(objAaT20);
            }
            Function0 function017 = (Function0) objAaT20;
            boolean zA6716 = bfm.A67(auraNavigatorA0b);
            Object objAaT21 = bfm.AaT();
            if (zA6716 || objAaT21 == obj) {
                objAaT21 = new SettingsEntryProviderKt$SettingsScreenContent$19$1(auraNavigatorA0b);
                bfm.Ai0(objAaT21);
            }
            Function0 function018 = (Function0) objAaT21;
            boolean zA1S = AnonymousClass005.A1S(bfm, contextA0H, auraNavigatorA0b, c7ouA00);
            Object objAaT22 = bfm.AaT();
            if (zA1S || objAaT22 == obj) {
                objAaT22 = new SettingsEntryProviderKt$SettingsScreenContent$20$1(contextA0H, auraNavigatorA0b, c7ouA00);
                bfm.Ai0(objAaT22);
            }
            Function0 function019 = (Function0) objAaT22;
            boolean zA6717 = bfm.A67(contextA0H);
            Object objAaT23 = bfm.AaT();
            if (zA6717 || objAaT23 == obj) {
                objAaT23 = new SettingsEntryProviderKt$SettingsScreenContent$21$1(contextA0H);
                bfm.Ai0(objAaT23);
            }
            HatchSettingsScreenKt.HatchSettingsScreen(null, hatchSettingsConfig, hatchSettingsSubdestination2, function02, function03, function04, function05, function06, function07, function08, function09, function010, function011, function012, function013, function014, function015, function016, g0u, function017, function018, function019, (Function0) objAaT23, function0, bfm, (HatchSettingsConfig.$stable << 3) | 100663296 | ((iA0D << 6) & 896), 0, 0, 1);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass22(hatchSettingsSubdestination2, i, i2);
        }
    }

    public static final boolean getAddToHomeShortcutEnabled() {
        return AnonymousClass001.A1X(C31u.A00(addToHomeShortcutEnabled$delegate, $$delegatedProperties));
    }
}
