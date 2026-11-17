package com.facebook.aura.skills.connect;

import X.AKL;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1BO;
import X.C1er;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import X.G2j;
import android.app.Activity;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.perf.HatchConnectorAuthTraceId;
import com.facebook.aura.perf.HatchConnectorQplLogger;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.viewmodel.HatchConnectorLookupViewModel;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class SkillConnectScreenKt {

    /* renamed from: com.facebook.aura.skills.connect.SkillConnectScreenKt$ConsentSheetDismissQplEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            SkillConnectScreenKt.ConsentSheetDismissQplEffect(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.SkillConnectScreenKt$SkillConnectScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C137992 extends AbstractC7559F3s implements G2j<Skill, HatchConnectorLookupViewModel, BFM, Integer, Unit> {
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ HatchSkillOAuthOrigin $origin;
        public final /* synthetic */ String $sourceSessionId;

        public final void invoke(Skill skill, HatchConnectorLookupViewModel hatchConnectorLookupViewModel, BFM bfm, int i) {
            C7384Etj.A0Y(skill, 0);
            boolean zA67 = bfm.A67(this.$navigator);
            AuraNavigator auraNavigator = this.$navigator;
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new SkillConnectScreenKt$SkillConnectScreen$2$1$1(auraNavigator);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            boolean zA672 = bfm.A67(this.$navigator);
            AuraNavigator auraNavigator2 = this.$navigator;
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new SkillConnectScreenKt$SkillConnectScreen$2$2$1(auraNavigator2);
                bfm.Ai0(objAaT2);
            }
            SkillConnectBottomSheetKt.SkillConnectSheetContent(skill, null, function0, (Function0) objAaT2, this.$origin, this.$sourceSessionId, HatchComponent.SKILL_AUTH_CONSENT_ACCEPTED, HatchComponent.SKILL_AUTH_CONSENT_DENIED, bfm, (i & 14) | 14155776, 2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137992(AuraNavigator auraNavigator, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str) {
            super(4);
            this.$navigator = auraNavigator;
            this.$origin = hatchSkillOAuthOrigin;
            this.$sourceSessionId = str;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(Skill skill, HatchConnectorLookupViewModel hatchConnectorLookupViewModel, BFM bfm, Integer num) {
            invoke(skill, hatchConnectorLookupViewModel, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.SkillConnectScreenKt$SkillConnectScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchSkillOAuthOrigin $origin;
        public final /* synthetic */ String $skillId;
        public final /* synthetic */ String $sourceSessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, BRg bRg, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2, int i, int i2) {
            super(2);
            this.$skillId = str;
            this.$modifier = bRg;
            this.$origin = hatchSkillOAuthOrigin;
            this.$sourceSessionId = str2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            SkillConnectScreenKt.SkillConnectScreen(this.$skillId, this.$modifier, this.$origin, this.$sourceSessionId, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void SkillConnectScreen(String str, BRg bRg, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2, BFM bfm, int i, int i2) {
        String str3 = str2;
        BRg bRg2 = bRg;
        HatchSkillOAuthOrigin hatchSkillOAuthOrigin2 = hatchSkillOAuthOrigin;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-853075649);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0F(bfm, AnonymousClass003.A0K(hatchSkillOAuthOrigin2));
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                hatchSkillOAuthOrigin2 = HatchSkillOAuthOrigin.CHAT;
            }
            if (i5 != 0) {
                str3 = null;
            }
            ConsentSheetDismissQplEffect(bfm, 0);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            int i6 = iA0d & 14;
            boolean zA1V = AnonymousClass002.A1V(bfm, auraNavigatorA0b, AnonymousClass003.A1D(iA0d), AnonymousClass002.A1O(i6));
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new SkillConnectScreenKt$SkillConnectScreen$1$1(hatchSkillOAuthOrigin2, str, auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            SkillLookupSheetContentKt.SkillLookupSheetContent(str, bRg2, false, (Function0) objAaT, B1V.A00(bfm, new C137992(auraNavigatorA0b, hatchSkillOAuthOrigin2, str3), -1939618499), bfm, i6 | RuntimeInternals.IOPRIO_BACKGROUND | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 4);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, bRg2, hatchSkillOAuthOrigin2, str3, i, i2);
        }
    }

    public static final void ConsentSheetDismissQplEffect(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1Q(bfm, -1385451842, i), bfm, i)) {
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = HatchConnectorQplLogger.INSTANCE.activeAuthTraceId();
                bfm.Ai0(objAaT);
            }
            HatchConnectorAuthTraceId hatchConnectorAuthTraceId = (HatchConnectorAuthTraceId) objAaT;
            MutableState mutableStateA00 = C1er.A00(bfm, bfm.A6v(AKL.A00));
            boolean zA1J = AnonymousClass003.A1J(bfm, mutableStateA00, hatchConnectorAuthTraceId);
            Object objAaT2 = bfm.AaT();
            if (zA1J || objAaT2 == obj) {
                objAaT2 = new SkillConnectScreenKt$ConsentSheetDismissQplEffect$1$1(hatchConnectorAuthTraceId, mutableStateA00);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, hatchConnectorAuthTraceId);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(i);
        }
    }

    public static final /* synthetic */ Activity access$ConsentSheetDismissQplEffect$lambda$1(C1BO c1bo) {
        return (Activity) c1bo.getValue();
    }
}
