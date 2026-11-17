package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C06G;
import X.C3U4;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.model.SkillState;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.ext.ColorExtKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ConnectorRowKt {

    /* renamed from: com.facebook.aura.skills.view.ConnectorRowKt$ConnectedSkillChevron$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectorRowKt.ConnectedSkillChevron(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.skills.view.ConnectorRowKt$ConnectorRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Integer $localIconRes;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Skill $skill;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $trailing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Skill skill, BRg bRg, Integer num, String str, Function0<Unit> function0, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$skill = skill;
            this.$modifier = bRg;
            this.$localIconRes = num;
            this.$subtitle = str;
            this.$onClick = function0;
            this.$trailing = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectorRowKt.ConnectorRow(this.$skill, this.$modifier, this.$localIconRes, this.$subtitle, this.$onClick, this.$trailing, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.skills.view.ConnectorRowKt$ConnectorRow$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ boolean $hasCvmCallout;
        public final /* synthetic */ String $iconUrl;
        public final /* synthetic */ Integer $localIconRes;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $needsReauth;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $rowTestTag;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $trailing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(String str, String str2, String str3, String str4, BRg bRg, Integer num, String str5, boolean z, boolean z2, Function0<Unit> function0, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2, int i3) {
            super(2);
            this.$connectorId = str;
            this.$title = str2;
            this.$iconUrl = str3;
            this.$rowTestTag = str4;
            this.$modifier = bRg;
            this.$localIconRes = num;
            this.$subtitle = str5;
            this.$needsReauth = z;
            this.$hasCvmCallout = z2;
            this.$onClick = function0;
            this.$trailing = g0v;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectorRowKt.ConnectorRow(this.$connectorId, this.$title, this.$iconUrl, this.$rowTestTag, this.$modifier, this.$localIconRes, this.$subtitle, this.$needsReauth, this.$hasCvmCallout, this.$onClick, this.$trailing, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ConnectorRow(java.lang.String r82, java.lang.String r83, java.lang.String r84, java.lang.String r85, X.BRg r86, java.lang.Integer r87, java.lang.String r88, boolean r89, boolean r90, kotlin.jvm.functions.Function0<kotlin.Unit> r91, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r92, X.BFM r93, int r94, int r95, int r96) {
        /*
            Method dump skipped, instructions count: 769
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.view.ConnectorRowKt.ConnectorRow(java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.BRg, java.lang.Integer, java.lang.String, boolean, boolean, kotlin.jvm.functions.Function0, X.G0V, X.BFM, int, int, int):void");
    }

    public static final void ConnectedSkillChevron(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-1562489148);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            AuraIconKt.m2567AuraIconFHprtrg(C3U4.A0C(bRg, 0.0f, 0.0f, AuraDimensKt.SpacingXsmall, 0.0f), BOf.A00(bfm, R.drawable.meta_brand_design_system_icons_vector_caret_right_outline_24, 0), AuraIconSize.TINY, null, ColorExtKt.m2544applyContentAlphaek8zF_U(C06G.A09(bfm), bfm, 0), null, bfm, AnonymousClass001.A04(), 32);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(bRg, i, i2);
        }
    }

    public static final void ConnectorRow(Skill skill, BRg bRg, Integer num, String str, Function0<Unit> function0, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        String str2;
        boolean z;
        Integer num2 = num;
        String str3 = str;
        Function0<Unit> function02 = function0;
        BRg bRg2 = bRg;
        G0V<? super BFM, ? super Integer, Unit> g0v2 = g0v;
        C7384Etj.A0Y(skill, 0);
        bfm.AgG(1401019472);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, skill) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, num2);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, str3);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0X(bfm, function02);
        }
        int i7 = i2 & 32;
        int iA0Y = 196608;
        if (i7 != 0) {
            iA0T |= iA0Y;
        } else if ((196608 & i) == 0) {
            iA0Y = AnonymousClass004.A0Y(bfm, g0v2);
            iA0T |= iA0Y;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                num2 = null;
            }
            if (i5 != 0) {
                str3 = null;
            }
            if (i6 != 0) {
                function02 = null;
            }
            if (i7 != 0) {
                g0v2 = ComposableSingletons$ConnectorRowKt.lambda$1394439462;
            }
            String str4 = skill.id;
            String str5 = skill.displayName;
            if (str5.length() == 0) {
                str5 = str4;
            }
            String str6 = skill.iconUrl;
            if (skill.state == SkillState.CONNECTED) {
                str2 = "hatch-connected-skill-row";
                boolean z2 = skill.needsReauth;
                z = true;
                if (!z2) {
                }
                ConnectorRow(str4, str5, str6, str2, bRg2, num2, str3, z, skill.getHasCvmCallout(), function02, g0v2, bfm, AnonymousClass001.A06(iA0T << 15, (iA0T << 9) & 4186112), (iA0T >> 15) & 14, 0);
            } else {
                str2 = "hatch-available-skill-row";
            }
            z = false;
            ConnectorRow(str4, str5, str6, str2, bRg2, num2, str3, z, skill.getHasCvmCallout(), function02, g0v2, bfm, AnonymousClass001.A06(iA0T << 15, (iA0T << 9) & 4186112), (iA0T >> 15) & 14, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(skill, bRg2, num2, str3, function02, g0v2, i, i2);
        }
    }
}
