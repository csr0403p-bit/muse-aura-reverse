package com.facebook.aura.status.view;

import X.AHD;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass037;
import X.B1V;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C06G;
import X.C0CD;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C1822Arm;
import X.C1YD;
import X.C3U4;
import X.C3cJ;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import X.G2j;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.status.viewmodel.HatchTaskRunUiModel;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class TaskDetailBottomSheetKt$TaskRunsList$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ MutableState<Boolean> $expanded$delegate;
    public final /* synthetic */ AHD<HatchTaskRunUiModel> $runs;
    public final /* synthetic */ String $section;

    /* renamed from: com.facebook.aura.status.view.TaskDetailBottomSheetKt$TaskRunsList$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Integer, Object> {
        public final /* synthetic */ AHD<HatchTaskRunUiModel> $runs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AHD<HatchTaskRunUiModel> ahd) {
            super(1);
            this.$runs = ahd;
        }

        public final Object invoke(int i) {
            return ((HatchTaskRunUiModel) this.$runs.get(i)).runId;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(AnonymousClass001.A0F(num));
        }
    }

    /* renamed from: com.facebook.aura.status.view.TaskDetailBottomSheetKt$TaskRunsList$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<Integer, Object> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            num.intValue();
            return "task_run";
        }

        public final Object invoke(int i) {
            return "task_run";
        }
    }

    /* renamed from: com.facebook.aura.status.view.TaskDetailBottomSheetKt$TaskRunsList$1$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G2j<AnonymousClass037, Integer, BFM, Integer, Unit> {
        public final /* synthetic */ AHD<HatchTaskRunUiModel> $runs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AHD<HatchTaskRunUiModel> ahd) {
            super(4);
            this.$runs = ahd;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
            if ((i2 & 48) == 0) {
                i2 |= AnonymousClass004.A0E(bfm, i);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i2 & 145, VoiceCallForegroundService.AVATAR_TARGET_PX), bfm, i2)) {
                bfm.Afo();
                return;
            }
            if (i > 0) {
                C3cJ.A0Z(bfm, 278073017);
            } else {
                bfm.AgE(278158546);
            }
            AnonymousClass001.A1D(bfm);
            TaskDetailBottomSheetKt.TaskRunRow((HatchTaskRunUiModel) this.$runs.get(i), null, bfm, 0, 2);
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
            invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.TaskDetailBottomSheetKt$TaskRunsList$1$1$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<Boolean> $expanded$delegate;
        public final /* synthetic */ String $section;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, MutableState<Boolean> mutableState) {
            super(3);
            this.$section = str;
            this.$expanded$delegate = mutableState;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, anonymousClass037), bfm, i)) {
                BS0 bs0 = BRg.A00;
                float f = AuraDimensKt.SpacingMedium;
                AuraDividerKt.AuraRowDivider(C3U4.A07(bs0, f), bfm, 0, 0);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12106a);
                C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).subheadlineEmphasized;
                long jA07 = C06G.A07(bfm);
                C1062ATq c1062ATq = C10G.A02;
                C1YD c1yd = new C1YD(0);
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$expanded$delegate, bfm.A65(this.$section));
                String str = this.$section;
                MutableState<Boolean> mutableState = this.$expanded$delegate;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new TaskDetailBottomSheetKt$TaskRunsList$1$1$4$1$1(str, mutableState);
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A0B(AnonymousClass003.A0U(C0v5.A02(c1062ATq, c1yd, objAaT, null)), f, 14.0f), jA07, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        boolean zA0A = MutableState.A0A((MutableState) this.$expanded$delegate);
        int size = this.$runs.size();
        if (!zA0A) {
            size = Math.min(size, 3);
        }
        AHD<HatchTaskRunUiModel> ahd = this.$runs;
        c0cd.APL(new AnonymousClass1(ahd), AnonymousClass2.INSTANCE, B1V.A01(new AnonymousClass3(ahd), -2096366064, true), size);
        if (MutableState.A0A((MutableState) this.$expanded$delegate) || this.$runs.size() <= 3) {
            return;
        }
        c0cd.APJ("see_more", "see_more", B1V.A01(new AnonymousClass4(this.$section, this.$expanded$delegate), 1088409506, true));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskDetailBottomSheetKt$TaskRunsList$1$1(AHD<HatchTaskRunUiModel> ahd, MutableState<Boolean> mutableState, String str) {
        super(1);
        this.$runs = ahd;
        this.$expanded$delegate = mutableState;
        this.$section = str;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
