package com.facebook.aura.toast;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.B6A;
import X.BBb;
import X.BFM;
import X.BGR;
import X.BRg;
import X.C0lh;
import X.C1er;
import X.C78N;
import X.G0V;
import X.InterfaceC10560Hsz;
import android.view.View;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.toast.AuraToastContentKt;
import com.facebook.aura.vds.compose.toast.AuraToastOption;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchToastHostKt {
    public static final long LONG_DURATION_MS = 2750;
    public static final long SHORT_DURATION_MS = 1500;

    /* renamed from: com.facebook.aura.toast.HatchToastHostKt$HatchToastHostOverlay$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function0<Boolean> $acceptsToasts;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(BRg bRg, Function0<Boolean> function0, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$acceptsToasts = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchToastHostKt.HatchToastHostOverlay(this.$modifier, this.$acceptsToasts, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuraToast.Duration.values().length];
            try {
                AnonymousClass002.A13(AuraToast.Duration.SHORT, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AuraToast.Duration.LONG, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AuraToast.Duration.INDEFINITE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AuraToast.Duration.CUSTOMIZED, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void HatchToastHostOverlay(BRg bRg, Function0<Boolean> function0, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass4;
        BRg bRg2 = bRg;
        Function0<Boolean> function02 = function0;
        bfm.AgG(1783947594);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = HatchToastHostKt$HatchToastHostOverlay$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                function02 = (Function0) objAaT;
            }
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT2 == obj) {
                objAaT2 = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT2;
            MutableState mutableState2 = (MutableState) AnonymousClass005.A0f(bfm, obj, null);
            View viewA0J = AnonymousClass001.A0J(bfm);
            MutableState mutableStateA00 = C1er.A00(bfm, function02);
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = new HatchToastHostKt$HatchToastHostOverlay$host$1$1(mutableStateA00, mutableState, mutableState2);
                bfm.Ai0(objAaT3);
            }
            HatchToastHostKt$HatchToastHostOverlay$host$1$1 hatchToastHostKt$HatchToastHostOverlay$host$1$1 = (HatchToastHostKt$HatchToastHostOverlay$host$1$1) objAaT3;
            boolean zA67 = bfm.A67(hatchToastHostKt$HatchToastHostOverlay$host$1$1);
            Object objAaT4 = bfm.AaT();
            if (zA67 || objAaT4 == obj) {
                objAaT4 = new HatchToastHostKt$HatchToastHostOverlay$2$1(hatchToastHostKt$HatchToastHostOverlay$host$1$1);
                bfm.Ai0(objAaT4);
            }
            AnonymousClass001.A17(bfm, objAaT4, hatchToastHostKt$HatchToastHostOverlay$host$1$1);
            AuraToast.ToastArgs toastArgs = (AuraToast.ToastArgs) mutableState.getValue();
            if (toastArgs == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass4 = new HatchToastHostKt$HatchToastHostOverlay$args$1(bRg2, function02, i, i2);
                    bBbAAc.A06 = anonymousClass4;
                }
                return;
            }
            String str = toastArgs.title;
            BRg bRgA00 = BGR.A00(C0lh.A03, AnonymousClass001.A0R(bRg2));
            String str2 = toastArgs.subtitle;
            Integer num = toastArgs.leadingIcon;
            AuraIconSize auraIconSize = toastArgs.leadingIconSize;
            B6A b6a = toastArgs.leadingIconTint;
            AuraToastOption auraToastOption = toastArgs.type;
            boolean zA1M = AnonymousClass003.A1M(bfm, toastArgs, viewA0J);
            Object objAaT5 = bfm.AaT();
            if (zA1M || objAaT5 == obj) {
                objAaT5 = new HatchToastHostKt$HatchToastHostOverlay$3$1(toastArgs, viewA0J, mutableState2);
                bfm.Ai0(objAaT5);
            }
            AuraToastContentKt.m3084AuraToastContentAAXhOkM(str, bRgA00, str2, num, (Function0) objAaT5, auraToastOption, auraIconSize, b6a, bfm, 0, 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass4 = new AnonymousClass4(bRg2, function02, i, i2);
            bBbAAc.A06 = anonymousClass4;
        }
    }

    public static final long durationMs(AuraToast.ToastArgs toastArgs) {
        int iOrdinal = toastArgs.duration.ordinal();
        if (iOrdinal == 0) {
            return 1500L;
        }
        if (iOrdinal != 1 && iOrdinal != 2) {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (toastArgs.customizedDuration != null) {
                return r0.intValue();
            }
        }
        return LONG_DURATION_MS;
    }

    public static final /* synthetic */ InterfaceC10560Hsz access$HatchToastHostOverlay$lambda$5(MutableState mutableState) {
        return (InterfaceC10560Hsz) mutableState.getValue();
    }
}
