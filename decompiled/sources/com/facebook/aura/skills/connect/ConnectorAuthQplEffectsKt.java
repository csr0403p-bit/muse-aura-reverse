package com.facebook.aura.skills.connect;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.G0V;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.model.SkillState;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class ConnectorAuthQplEffectsKt {

    /* renamed from: com.facebook.aura.skills.connect.ConnectorAuthQplEffectsKt$ConnectorAuthConsentQplEffects$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $hasSkills;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ String $refreshKey;
        public final /* synthetic */ Skill $skill;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, boolean z, boolean z2, Skill skill, int i) {
            super(2);
            this.$refreshKey = str;
            this.$hasSkills = z;
            this.$isLoading = z2;
            this.$skill = skill;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectorAuthQplEffectsKt.ConnectorAuthConsentQplEffects(this.$refreshKey, this.$hasSkills, this.$isLoading, this.$skill, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void ConnectorAuthConsentQplEffects(String str, boolean z, boolean z2, Skill skill, BFM bfm, int i) {
        String str2;
        SkillState skillState;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1934372754);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, skill);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            boolean zA1C = AnonymousClass003.A1C(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = new ConnectorAuthQplEffectsKt$ConnectorAuthConsentQplEffects$1$1(z, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, str);
            Boolean boolValueOf = Boolean.valueOf(z2);
            if (skill != null) {
                str2 = skill.id;
                skillState = skill.state;
            } else {
                str2 = null;
                skillState = null;
            }
            boolean zA1S = AnonymousClass001.A1S(bfm, skill, (iA0d & 896) == 256);
            Object objAaT2 = bfm.AaT();
            if (zA1S || objAaT2 == C78N.A00) {
                objAaT2 = new ConnectorAuthQplEffectsKt$ConnectorAuthConsentQplEffects$2$1(z2, skill, null);
                bfm.Ai0(objAaT2);
            }
            C78e.A02(bfm, boolValueOf, str2, skillState, (G0V) objAaT2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, z, z2, skill, i);
        }
    }
}
