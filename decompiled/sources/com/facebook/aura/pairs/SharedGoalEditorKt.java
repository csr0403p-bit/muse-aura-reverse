package com.facebook.aura.pairs;

import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1er;
import X.C78N;
import X.Ey9;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.AuraRadioGroupKt;
import com.facebook.aura.vds.compose.card.AuraRadioTapOption;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class SharedGoalEditorKt {

    /* renamed from: com.facebook.aura.pairs.SharedGoalEditorKt$SharedGoalEditor$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SharedGoal $goal;
        public final /* synthetic */ boolean $isSaving;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ G2j<String, String, SharedGoalStatus, String, Unit> $onSave;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(SharedGoal sharedGoal, boolean z, G2j<? super String, ? super String, ? super SharedGoalStatus, ? super String, Unit> g2j, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$goal = sharedGoal;
            this.$isSaving = z;
            this.$onSave = g2j;
            this.$onCancel = function0;
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
            SharedGoalEditorKt.SharedGoalEditor(this.$goal, this.$isSaving, this.$onSave, this.$onCancel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.pairs.SharedGoalEditorKt$SharedGoalStatusPicker$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<SharedGoalStatus, Unit> $onSelect;
        public final /* synthetic */ SharedGoalStatus $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(SharedGoalStatus sharedGoalStatus, G0U<? super SharedGoalStatus, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$selected = sharedGoalStatus;
            this.$onSelect = g0u;
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
            SharedGoalEditorKt.SharedGoalStatusPicker(this.$selected, this.$onSelect, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SharedGoalStatus.values().length];
            try {
                AnonymousClass002.A13(SharedGoalStatus.ACTIVE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(SharedGoalStatus.PAUSED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(SharedGoalStatus.COMPLETED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(SharedGoalStatus.RETIRED, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SharedGoalEditor(com.facebook.aura.pairs.SharedGoal r64, boolean r65, X.G2j<? super java.lang.String, ? super java.lang.String, ? super com.facebook.aura.pairs.SharedGoalStatus, ? super java.lang.String, kotlin.Unit> r66, kotlin.jvm.functions.Function0<kotlin.Unit> r67, X.BRg r68, X.BFM r69, int r70, int r71) {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.SharedGoalEditorKt.SharedGoalEditor(com.facebook.aura.pairs.SharedGoal, boolean, X.G2j, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    public static final void SharedGoalStatusPicker(SharedGoalStatus sharedGoalStatus, G0U<? super SharedGoalStatus, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(457393876);
        int iA0D = (i & 6) == 0 ? AnonymousClass004.A0D(bfm, AnonymousClass003.A0K(sharedGoalStatus)) | i : i;
        if ((i & 48) == 0) {
            iA0D |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0D |= 384;
        } else if ((i & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 147, 146), bfm, iA0D)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            MutableState mutableStateA00 = C1er.A00(bfm, g0u);
            bfm.AgE(1468858301);
            Ey9<SharedGoalStatus> entries = SharedGoalStatus.getEntries();
            ArrayList arrayListA0m = AnonymousClass002.A0m(entries);
            Iterator<SharedGoalStatus> it = entries.iterator();
            while (it.hasNext()) {
                arrayListA0m.add(AbstractC2271BQs.A01(bfm, labelRes(it.next())));
            }
            AnonymousClass001.A1D(bfm);
            boolean zA65 = bfm.A65(arrayListA0m);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                Ey9<SharedGoalStatus> entries2 = SharedGoalStatus.getEntries();
                ArrayList arrayListA0m2 = AnonymousClass002.A0m(entries2);
                int i4 = 0;
                for (SharedGoalStatus sharedGoalStatus2 : entries2) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        AbstractC0885AGm.A14();
                        throw F60.createAndThrow();
                    }
                    SharedGoalStatus sharedGoalStatus3 = sharedGoalStatus2;
                    arrayListA0m2.add(new AuraRadioTapOption((String) arrayListA0m.get(i4), null, null, false, null, null, AnonymousClass002.A1Z(sharedGoalStatus3, sharedGoalStatus), true, 1.0f, new SharedGoalEditorKt$SharedGoalStatusPicker$options$1$1$1(sharedGoalStatus3, mutableStateA00), false, new AuraCardType.Checkbox(null), true, null, null, null));
                    i4 = i5;
                }
                objAaT = AnonymousClass007.A0F(bfm, arrayListA0m2);
            }
            AuraRadioGroupKt.AuraRadioGroup(AnonymousClass001.A0R(bRg2), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f7e), (SnapshotStateList) objAaT, bfm, 0, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(sharedGoalStatus, g0u, bRg2, i, i2);
        }
    }

    public static final /* synthetic */ SharedGoalStatus access$SharedGoalEditor$lambda$7(MutableState mutableState) {
        return (SharedGoalStatus) mutableState.getValue();
    }

    public static final int labelRes(SharedGoalStatus sharedGoalStatus) {
        int iOrdinal = sharedGoalStatus.ordinal();
        if (iOrdinal == 0) {
            return R.string._name_removed__res_0x7f120f7c;
        }
        if (iOrdinal == 1) {
            return R.string._name_removed__res_0x7f120f7f;
        }
        if (iOrdinal == 2) {
            return R.string._name_removed__res_0x7f120f7d;
        }
        if (iOrdinal == 3) {
            return R.string._name_removed__res_0x7f120f80;
        }
        throw new NoWhenBranchMatchedException();
    }
}
