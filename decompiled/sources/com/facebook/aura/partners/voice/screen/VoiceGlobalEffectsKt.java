package com.facebook.aura.partners.voice.screen;

import X.AKL;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C1BO;
import X.C1HY;
import X.C1er;
import X.C20Q;
import X.C22I;
import X.C3Em;
import X.C3P4;
import X.C3cG;
import X.C78N;
import X.C78e;
import X.C79;
import X.EnumC10573Huf;
import X.G0U;
import X.G0V;
import X.InterfaceC7353EnQ;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.partners.voice.intf.VoiceCallStart;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.intf.VoicePreConnectFailure;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchPictureInPictureModeKt;
import com.facebook.aura.vds.toast.AuraToast;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class VoiceGlobalEffectsKt {
    public static final long RETRY_TOAST_MIN_INTERVAL_MS = 1000;
    public static final String TAG = "VoiceGlobalEffects";
    public static final long TOAST_MIN_INTERVAL_MS = 3000;

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceGlobalEffectsKt$ForegroundOnlyToast$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ VoiceCallErrorToastAction $action;
        public final /* synthetic */ C20Q<T> $events;
        public final /* synthetic */ long $minIntervalMs;
        public final /* synthetic */ VoiceCallErrorToastReason $reason;
        public final /* synthetic */ G0U<T, Boolean> $stillRelevant;
        public final /* synthetic */ Function0<AuraToast.ToastArgs> $toast;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(C20Q<? extends T> c20q, G0U<? super T, Boolean> g0u, VoiceCallErrorToastReason voiceCallErrorToastReason, Function0<AuraToast.ToastArgs> function0, VoiceCallErrorToastAction voiceCallErrorToastAction, long j, int i, int i2) {
            super(2);
            this.$events = c20q;
            this.$stillRelevant = g0u;
            this.$reason = voiceCallErrorToastReason;
            this.$toast = function0;
            this.$action = voiceCallErrorToastAction;
            this.$minIntervalMs = j;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceGlobalEffectsKt.ForegroundOnlyToast(this.$events, this.$stillRelevant, this.$reason, this.$toast, this.$action, this.$minIntervalMs, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceGlobalEffectsKt$LiveAvatarUnavailableToast$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ VoiceCallStateHolder $voiceCallStateHolder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(VoiceCallStateHolder voiceCallStateHolder, int i) {
            super(2);
            this.$voiceCallStateHolder = voiceCallStateHolder;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceGlobalEffectsKt.LiveAvatarUnavailableToast(this.$voiceCallStateHolder, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceGlobalEffectsKt$OtherCallActiveToast$4, reason: invalid class name and case insensitive filesystem */
    public final class C131944 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ VoiceCallStateHolder $voiceCallStateHolder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131944(VoiceCallStateHolder voiceCallStateHolder, int i) {
            super(2);
            this.$voiceCallStateHolder = voiceCallStateHolder;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceGlobalEffectsKt.OtherCallActiveToast(this.$voiceCallStateHolder, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceGlobalEffectsKt$OutOfCreditsToast$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ VoiceCallStateHolder $voiceCallStateHolder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(VoiceCallStateHolder voiceCallStateHolder, int i) {
            super(2);
            this.$voiceCallStateHolder = voiceCallStateHolder;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceGlobalEffectsKt.OutOfCreditsToast(this.$voiceCallStateHolder, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceGlobalEffectsKt$RetryableFailureToasts$4, reason: invalid class name and case insensitive filesystem */
    public final class C131954 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ VoiceCallStateHolder $voiceCallStateHolder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131954(VoiceCallStateHolder voiceCallStateHolder, int i) {
            super(2);
            this.$voiceCallStateHolder = voiceCallStateHolder;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceGlobalEffectsKt.RetryableFailureToasts(this.$voiceCallStateHolder, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceGlobalEffectsKt$ServerVideoDisabledToast$3, reason: invalid class name and case insensitive filesystem */
    public final class C131963 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ VoiceCallStateHolder $voiceCallStateHolder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131963(VoiceCallStateHolder voiceCallStateHolder, int i) {
            super(2);
            this.$voiceCallStateHolder = voiceCallStateHolder;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceGlobalEffectsKt.ServerVideoDisabledToast(this.$voiceCallStateHolder, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceGlobalEffectsKt$ThrottledToast$2, reason: invalid class name and case insensitive filesystem */
    public final class C131972 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C20Q<Unit> $events;
        public final /* synthetic */ String $message;
        public final /* synthetic */ VoiceCallErrorToastReason $reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131972(C20Q<Unit> c20q, String str, VoiceCallErrorToastReason voiceCallErrorToastReason, int i, int i2) {
            super(2);
            this.$events = c20q;
            this.$message = str;
            this.$reason = voiceCallErrorToastReason;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceGlobalEffectsKt.ThrottledToast(this.$events, this.$message, this.$reason, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceGlobalEffectsKt$ThrottledToast$4, reason: invalid class name and case insensitive filesystem */
    public final class C131984 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ VoiceCallErrorToastAction $action;
        public final /* synthetic */ C20Q<Unit> $events;
        public final /* synthetic */ long $minIntervalMs;
        public final /* synthetic */ VoiceCallErrorToastReason $reason;
        public final /* synthetic */ Function0<AuraToast.ToastArgs> $toast;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131984(C20Q<Unit> c20q, Function0<AuraToast.ToastArgs> function0, VoiceCallErrorToastReason voiceCallErrorToastReason, VoiceCallErrorToastAction voiceCallErrorToastAction, long j, int i, int i2) {
            super(2);
            this.$events = c20q;
            this.$toast = function0;
            this.$reason = voiceCallErrorToastReason;
            this.$action = voiceCallErrorToastAction;
            this.$minIntervalMs = j;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceGlobalEffectsKt.ThrottledToast(this.$events, this.$toast, this.$reason, this.$action, this.$minIntervalMs, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceGlobalEffectsKt$UiControlVoiceCallToasts$3, reason: invalid class name and case insensitive filesystem */
    public final class C131993 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131993(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceGlobalEffectsKt.UiControlVoiceCallToasts(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceGlobalEffectsKt$VoiceGlobalEffects$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceGlobalEffectsKt.VoiceGlobalEffects(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceGlobalEffectsKt$WeakNetworkToast$3, reason: invalid class name and case insensitive filesystem */
    public final class C132003 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ C20Q<Unit> $events;
        public final /* synthetic */ String $message;
        public final /* synthetic */ Function0<Boolean> $stillWeak;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132003(C20Q<Unit> c20q, String str, Function0<Boolean> function0, int i) {
            super(2);
            this.$events = c20q;
            this.$message = str;
            this.$stillWeak = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceGlobalEffectsKt.WeakNetworkToast(this.$events, this.$message, this.$stillWeak, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final <T> void ForegroundOnlyToast(C20Q<? extends T> c20q, G0U<? super T, Boolean> g0u, VoiceCallErrorToastReason voiceCallErrorToastReason, Function0<AuraToast.ToastArgs> function0, VoiceCallErrorToastAction voiceCallErrorToastAction, long j, BFM bfm, int i, int i2) {
        VoiceCallErrorToastAction voiceCallErrorToastAction2 = voiceCallErrorToastAction;
        long j2 = j;
        bfm.AgG(-1341641293);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(c20q, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass005.A0A(bfm, voiceCallErrorToastReason);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0G(bfm, AnonymousClass003.A0K(voiceCallErrorToastAction2));
        }
        int i4 = i2 & 32;
        int iA02 = 196608;
        if (i4 != 0) {
            iA05 |= iA02;
        } else if ((196608 & i) == 0) {
            iA02 = AnonymousClass002.A02(bfm.A64(j2) ? 1 : 0);
            iA05 |= iA02;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA05, 74898), bfm, iA05)) {
            if (i3 != 0) {
                voiceCallErrorToastAction2 = VoiceCallErrorToastAction.NONE;
            }
            if (i4 != 0) {
                j2 = 3000;
            }
            boolean zIsForegroundOutsidePictureInPicture = isForegroundOutsidePictureInPicture(bfm, 0);
            Boolean boolValueOf = Boolean.valueOf(zIsForegroundOutsidePictureInPicture);
            MutableState mutableStateA00 = C1er.A00(bfm, boolValueOf);
            int i5 = iA05 >> 3;
            MutableState mutableStateA002 = C1er.A00(bfm, g0u);
            int i6 = iA05 & 14;
            boolean z = i6 == 4 || ((iA05 & 8) != 0 && bfm.A65(c20q));
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT;
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT2 == obj) {
                objAaT2 = C3cG.A12(C79.A00, 0, 1);
                bfm.Ai0(objAaT2);
            }
            C3Em c3Em = (C3Em) objAaT2;
            boolean zA1U = AnonymousClass005.A1U(bfm, mutableStateA00, c3Em, mutableState, i6 == 4 || ((iA05 & 8) != 0 && bfm.A67(c20q)));
            Object objAaT3 = bfm.AaT();
            if (zA1U || objAaT3 == obj) {
                objAaT3 = new VoiceGlobalEffectsKt$ForegroundOnlyToast$1$1(c20q, c3Em, mutableStateA00, mutableState, null);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A18(bfm, objAaT3, c20q);
            boolean zA1X = AnonymousClass005.A1X(bfm, mutableStateA002, c3Em, bfm.A65(mutableState), bfm.A66(zIsForegroundOutsidePictureInPicture));
            Object objAaT4 = bfm.AaT();
            if (zA1X || objAaT4 == obj) {
                objAaT4 = new VoiceGlobalEffectsKt$ForegroundOnlyToast$2$1(zIsForegroundOutsidePictureInPicture, c3Em, mutableState, mutableStateA002);
                bfm.Ai0(objAaT4);
            }
            AnonymousClass001.A17(bfm, objAaT4, boolValueOf);
            ThrottledToast(c3Em, function0, voiceCallErrorToastReason, voiceCallErrorToastAction2, j2, bfm, AnonymousClass001.A0A(i5, ((iA05 >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (iA05 & 896) | (i5 & 7168)), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(c20q, g0u, voiceCallErrorToastReason, function0, voiceCallErrorToastAction2, j2, i, i2);
        }
    }

    public static final void ThrottledToast(C20Q<Unit> c20q, Function0<AuraToast.ToastArgs> function0, VoiceCallErrorToastReason voiceCallErrorToastReason, VoiceCallErrorToastAction voiceCallErrorToastAction, long j, BFM bfm, int i, int i2) {
        int i3;
        VoiceCallErrorToastAction voiceCallErrorToastAction2 = voiceCallErrorToastAction;
        long j2 = j;
        bfm.AgG(1773706801);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? bfm.A65(c20q) : bfm.A67(c20q) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bfm.A67(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bfm.A63(voiceCallErrorToastReason == null ? -1 : voiceCallErrorToastReason.ordinal()) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= bfm.A63(voiceCallErrorToastAction == null ? -1 : voiceCallErrorToastAction2.ordinal()) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= bfm.A64(j2) ? 16384 : 8192;
        }
        if (bfm.AfS(i3 & 1, (i3 & 9363) != 9362)) {
            if (i4 != 0) {
                voiceCallErrorToastAction2 = VoiceCallErrorToastAction.NONE;
            }
            if (i5 != 0) {
                j2 = 3000;
            }
            MutableState mutableStateA00 = C1er.A00(bfm, function0);
            boolean zA65 = ((i3 & 14) == 4 || ((i3 & 8) != 0 && bfm.A67(c20q))) | ((57344 & i3) == 16384) | bfm.A65(mutableStateA00) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new VoiceGlobalEffectsKt$ThrottledToast$3$1(c20q, j2, voiceCallErrorToastReason, mutableStateA00, voiceCallErrorToastAction2, null);
                bfm.Ai0(objAaT);
            }
            C78e.A06(bfm, c20q, (G0V) objAaT);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C131984(c20q, function0, voiceCallErrorToastReason, voiceCallErrorToastAction2, j2, i, i2);
        }
    }

    public static final void LiveAvatarUnavailableToast(VoiceCallStateHolder voiceCallStateHolder, BFM bfm, int i) {
        bfm.AgG(-546039781);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(voiceCallStateHolder, bfm, i) ? 1 : 0) | i : i;
        boolean z = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 3, 2), bfm, iA05)) {
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = C3cG.A12(C79.A00, 0, 1);
                bfm.Ai0(objAaT2);
            }
            C3Em c3Em = (C3Em) objAaT2;
            int i2 = iA05 & 14;
            boolean zA1T = AnonymousClass001.A1T(bfm, c3Em, i2 == 4 || ((iA05 & 8) != 0 && bfm.A67(voiceCallStateHolder)));
            Object objAaT3 = bfm.AaT();
            if (zA1T || objAaT3 == obj) {
                objAaT3 = new VoiceGlobalEffectsKt$LiveAvatarUnavailableToast$1$1(voiceCallStateHolder, c3Em, mutableState, null);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A18(bfm, objAaT3, voiceCallStateHolder);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121142);
            boolean z2 = i2 == 4 || ((iA05 & 8) != 0 && bfm.A67(voiceCallStateHolder));
            Object objAaT4 = bfm.AaT();
            if (z2 || objAaT4 == obj) {
                objAaT4 = new VoiceGlobalEffectsKt$LiveAvatarUnavailableToast$2$1(voiceCallStateHolder);
                bfm.Ai0(objAaT4);
            }
            G0U g0u = (G0U) objAaT4;
            VoiceCallErrorToastReason voiceCallErrorToastReason = VoiceCallErrorToastReason.LIVE_AVATAR_UNAVAILABLE;
            if (i2 != 4 && ((iA05 & 8) == 0 || !bfm.A67(voiceCallStateHolder))) {
                z = false;
            }
            boolean zA65 = bfm.A65(strA01) | z;
            Object objAaT5 = bfm.AaT();
            if (zA65 || objAaT5 == obj) {
                objAaT5 = new VoiceGlobalEffectsKt$LiveAvatarUnavailableToast$3$1(voiceCallStateHolder, strA01, mutableState);
                bfm.Ai0(objAaT5);
            }
            ForegroundOnlyToast(c3Em, g0u, voiceCallErrorToastReason, (Function0) objAaT5, null, 0L, bfm, 384, 48);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(voiceCallStateHolder, i);
        }
    }

    public static final void OtherCallActiveToast(VoiceCallStateHolder voiceCallStateHolder, BFM bfm, int i) {
        bfm.AgG(1922909028);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(voiceCallStateHolder, bfm, i) ? 1 : 0) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 3, 2), bfm, iA05)) {
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT;
            MutableState mutableStateA00 = C1er.A00(bfm, VoiceCallStarterKt.rememberConversationCallStarter(MutableState.A05(mutableState), true, null, null, null, bfm, 48, 28));
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = C3cG.A12(C79.A00, 0, 1);
                bfm.Ai0(objAaT2);
            }
            C3Em c3Em = (C3Em) objAaT2;
            boolean zA1T = AnonymousClass001.A1T(bfm, c3Em, (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(voiceCallStateHolder)));
            Object objAaT3 = bfm.AaT();
            if (zA1T || objAaT3 == obj) {
                objAaT3 = new VoiceGlobalEffectsKt$OtherCallActiveToast$1$1(voiceCallStateHolder, c3Em, mutableState, null);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A18(bfm, objAaT3, voiceCallStateHolder);
            String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f12064c);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120647);
            VoiceCallErrorToastReason voiceCallErrorToastReason = VoiceCallErrorToastReason.ALREADY_ON_CALL;
            VoiceCallErrorToastAction voiceCallErrorToastAction = VoiceCallErrorToastAction.RETRY;
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = VoiceGlobalEffectsKt$OtherCallActiveToast$2$1.INSTANCE;
                bfm.Ai0(objAaT4);
            }
            G0U g0u = (G0U) objAaT4;
            boolean zA1R = AnonymousClass005.A1R(bfm, strA01, mutableStateA00, strA0v);
            Object objAaT5 = bfm.AaT();
            if (zA1R || objAaT5 == obj) {
                objAaT5 = new VoiceGlobalEffectsKt$OtherCallActiveToast$3$1(strA01, strA0v, mutableStateA00);
                bfm.Ai0(objAaT5);
            }
            ForegroundOnlyToast(c3Em, g0u, voiceCallErrorToastReason, (Function0) objAaT5, voiceCallErrorToastAction, 1000L, bfm, 221616, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C131944(voiceCallStateHolder, i);
        }
    }

    public static final void OutOfCreditsToast(VoiceCallStateHolder voiceCallStateHolder, BFM bfm, int i) {
        bfm.AgG(-320173919);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(voiceCallStateHolder, bfm, i) ? 1 : 0) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA05), bfm, iA05)) {
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            MutableState mutableStateA00 = C1er.A00(bfm, bfm.A6v(AuraNavigatorKt.LocalNavigator));
            String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f12114c);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12114b);
            C22I<Unit> c22i = voiceCallStateHolder.outOfCreditsEvents;
            VoiceCallErrorToastReason voiceCallErrorToastReason = VoiceCallErrorToastReason.OUT_OF_CREDITS;
            VoiceCallErrorToastAction voiceCallErrorToastAction = VoiceCallErrorToastAction.UPGRADE;
            boolean zA1U = AnonymousClass005.A1U(bfm, mutableStateA00, abstractC3358CGzA0h, strA0v, bfm.A65(strA01));
            Object objAaT = bfm.AaT();
            if (zA1U || objAaT == C78N.A00) {
                objAaT = new VoiceGlobalEffectsKt$OutOfCreditsToast$1$1(strA01, strA0v, abstractC3358CGzA0h, mutableStateA00);
                bfm.Ai0(objAaT);
            }
            ThrottledToast(c22i, (Function0) objAaT, voiceCallErrorToastReason, voiceCallErrorToastAction, 0L, bfm, 3456, 16);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(voiceCallStateHolder, i);
        }
    }

    public static final void RetryableFailureToasts(VoiceCallStateHolder voiceCallStateHolder, BFM bfm, int i) {
        bfm.AgG(-1808321821);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(voiceCallStateHolder, bfm, i) ? 1 : 0) | i : i;
        boolean z = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 3, 2), bfm, iA05)) {
            G0U<VoiceCallStart, Unit> g0uRememberConversationCallStarter = VoiceCallStarterKt.rememberConversationCallStarter((String) C1BO.A07(bfm, voiceCallStateHolder.activeThreadId), true, null, null, null, bfm, 48, 28);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120647);
            boolean zA1K = AnonymousClass003.A1K(bfm, strA01, g0uRememberConversationCallStarter);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = new VoiceGlobalEffectsKt$RetryableFailureToasts$retryToast$1$1(strA01, g0uRememberConversationCallStarter);
                bfm.Ai0(objAaT);
            }
            G0V g0v = (G0V) objAaT;
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12114a);
            C22I<Unit> c22i = voiceCallStateHolder.connectTimeoutEvents;
            VoiceCallErrorToastReason voiceCallErrorToastReason = VoiceCallErrorToastReason.CONNECT_TIMEOUT;
            VoiceCallErrorToastAction voiceCallErrorToastAction = VoiceCallErrorToastAction.RETRY;
            boolean zA1K2 = AnonymousClass003.A1K(bfm, g0v, strA012);
            Object objAaT2 = bfm.AaT();
            if (zA1K2 || objAaT2 == C78N.A00) {
                objAaT2 = new VoiceGlobalEffectsKt$RetryableFailureToasts$1$1(g0v, strA012);
                bfm.Ai0(objAaT2);
            }
            ThrottledToast(c22i, (Function0) objAaT2, voiceCallErrorToastReason, voiceCallErrorToastAction, 0L, bfm, 3456, 16);
            String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120648);
            C22I<VoicePreConnectFailure> c22i2 = voiceCallStateHolder.preConnectFailureEvents;
            if ((iA05 & 14) != 4 && ((iA05 & 8) == 0 || !bfm.A67(voiceCallStateHolder))) {
                z = false;
            }
            Object objAaT3 = bfm.AaT();
            if (z || objAaT3 == C78N.A00) {
                objAaT3 = new VoiceGlobalEffectsKt$RetryableFailureToasts$2$1(voiceCallStateHolder);
                bfm.Ai0(objAaT3);
            }
            VoiceCallErrorToastReason voiceCallErrorToastReason2 = VoiceCallErrorToastReason.GENERIC_FAILURE;
            G0U g0u = (G0U) ((InterfaceC7353EnQ) objAaT3);
            boolean zA1K3 = AnonymousClass003.A1K(bfm, g0v, strA0v);
            Object objAaT4 = bfm.AaT();
            if (zA1K3 || objAaT4 == C78N.A00) {
                objAaT4 = new VoiceGlobalEffectsKt$RetryableFailureToasts$3$1(g0v, strA0v);
                bfm.Ai0(objAaT4);
            }
            ForegroundOnlyToast(c22i2, g0u, voiceCallErrorToastReason2, (Function0) objAaT4, voiceCallErrorToastAction, 1000L, bfm, 221568, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C131954(voiceCallStateHolder, i);
        }
    }

    public static final void ServerVideoDisabledToast(VoiceCallStateHolder voiceCallStateHolder, BFM bfm, int i) {
        bfm.AgG(47030724);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(voiceCallStateHolder, bfm, i) ? 1 : 0) | i : i;
        boolean z = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 3, 2), bfm, iA05)) {
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12064d);
            C22I<Unit> c22i = voiceCallStateHolder.serverVideoDisabledEvents;
            if ((iA05 & 14) != 4 && ((iA05 & 8) == 0 || !bfm.A67(voiceCallStateHolder))) {
                z = false;
            }
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = new VoiceGlobalEffectsKt$ServerVideoDisabledToast$1$1(voiceCallStateHolder);
                bfm.Ai0(objAaT);
            }
            G0U g0u = (G0U) objAaT;
            VoiceCallErrorToastReason voiceCallErrorToastReason = VoiceCallErrorToastReason.SERVER_VIDEO_DISABLED;
            boolean zA65 = bfm.A65(strA01);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = new VoiceGlobalEffectsKt$ServerVideoDisabledToast$2$1(strA01);
                bfm.Ai0(objAaT2);
            }
            ForegroundOnlyToast(c22i, g0u, voiceCallErrorToastReason, (Function0) objAaT2, null, 0L, bfm, 384, 48);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C131963(voiceCallStateHolder, i);
        }
    }

    public static final void UiControlVoiceCallToasts(BFM bfm, int i) {
        bfm.AgG(-684440521);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            VoiceCallStateHolder voiceCallStateHolderA0K = C3cG.A0K(AnonymousClass002.A0h(bfm));
            int i2 = VoiceCallStateHolder.$stable;
            OutOfCreditsToast(voiceCallStateHolderA0K, bfm, i2);
            LiveAvatarUnavailableToast(voiceCallStateHolderA0K, bfm, i2);
            ThrottledToast(voiceCallStateHolderA0K.undeliveredSpeechSentEvents, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121149), null, bfm, 0, 4);
            ThrottledToast(voiceCallStateHolderA0K.networkDropEndEvents, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120645), VoiceCallErrorToastReason.NETWORK_LOST, bfm, 384, 0);
            ThrottledToast(voiceCallStateHolderA0K.callMovedEvents, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12064a), null, bfm, 0, 4);
            ThrottledToast(voiceCallStateHolderA0K.capacityUnavailableEvents, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120644), VoiceCallErrorToastReason.CAPACITY, bfm, 384, 0);
            ThrottledToast(voiceCallStateHolderA0K.noNetworkCallBlockedEvents, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12064b), VoiceCallErrorToastReason.NO_NETWORK, bfm, 384, 0);
            C22I<Unit> c22i = voiceCallStateHolderA0K.weakNetworkEvents;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120653);
            boolean zA67 = bfm.A67(voiceCallStateHolderA0K);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new VoiceGlobalEffectsKt$UiControlVoiceCallToasts$1$1(voiceCallStateHolderA0K);
                bfm.Ai0(objAaT);
            }
            WeakNetworkToast(c22i, strA01, (Function0) objAaT, bfm, 0);
            C22I<Unit> c22i2 = voiceCallStateHolderA0K.weakConnectionEvents;
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120652);
            boolean zA672 = bfm.A67(voiceCallStateHolderA0K);
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new VoiceGlobalEffectsKt$UiControlVoiceCallToasts$2$1(voiceCallStateHolderA0K);
                bfm.Ai0(objAaT2);
            }
            WeakNetworkToast(c22i2, strA012, (Function0) objAaT2, bfm, 0);
            ServerVideoDisabledToast(voiceCallStateHolderA0K, bfm, i2);
            RetryableFailureToasts(voiceCallStateHolderA0K, bfm, i2);
            OtherCallActiveToast(voiceCallStateHolderA0K, bfm, i2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C131993(i);
        }
    }

    public static final void VoiceGlobalEffects(BFM bfm, int i) {
        bfm.AgG(-1787517251);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            UiControlVoiceCallToasts(bfm, 0);
            VoiceAnnouncementEffectsKt.VoiceAnnouncementEffects(null, bfm, 0, 1);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(i);
        }
    }

    public static final void WeakNetworkToast(C20Q<Unit> c20q, String str, Function0<Boolean> function0, BFM bfm, int i) {
        bfm.AgG(-1516280510);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(c20q, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            boolean zA1D = AnonymousClass003.A1D(iA05);
            Object objAaT = bfm.AaT();
            if (zA1D || objAaT == C78N.A00) {
                objAaT = new VoiceGlobalEffectsKt$WeakNetworkToast$1$1(function0);
                bfm.Ai0(objAaT);
            }
            G0U g0u = (G0U) objAaT;
            VoiceCallErrorToastReason voiceCallErrorToastReason = VoiceCallErrorToastReason.WEAK_NETWORK;
            boolean z = (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32;
            Object objAaT2 = bfm.AaT();
            if (z || objAaT2 == C78N.A00) {
                objAaT2 = new VoiceGlobalEffectsKt$WeakNetworkToast$2$1(str);
                bfm.Ai0(objAaT2);
            }
            ForegroundOnlyToast(c20q, g0u, voiceCallErrorToastReason, (Function0) objAaT2, null, 0L, bfm, (iA05 & 14) | 384, 48);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C132003(c20q, str, function0, i);
        }
    }

    public static final /* synthetic */ AuraNavigator access$OutOfCreditsToast$lambda$0(C1BO c1bo) {
        return (AuraNavigator) c1bo.getValue();
    }

    public static final boolean isForegroundOutsidePictureInPicture(BFM bfm, int i) {
        boolean zRememberIsInPictureInPictureMode;
        ComponentActivity componentActivity;
        C1BO c1boA00 = C3P4.A00(bfm, C1HY.A00(bfm));
        Object objA6v = bfm.A6v(AKL.A00);
        if (!(objA6v instanceof ComponentActivity) || (componentActivity = (ComponentActivity) objA6v) == null) {
            AnonymousClass003.A0l(bfm, -773594320);
            zRememberIsInPictureInPictureMode = false;
        } else {
            bfm.AgE(390687301);
            zRememberIsInPictureInPictureMode = HatchPictureInPictureModeKt.rememberIsInPictureInPictureMode(componentActivity, bfm, 0);
            AnonymousClass001.A1D(bfm);
        }
        return ((EnumC10573Huf) c1boA00.getValue()).A00(EnumC10573Huf.A06) && !zRememberIsInPictureInPictureMode;
    }

    public static final void ThrottledToast(C20Q<Unit> c20q, String str, VoiceCallErrorToastReason voiceCallErrorToastReason, BFM bfm, int i, int i2) {
        int iA0F;
        VoiceCallErrorToastReason voiceCallErrorToastReason2 = voiceCallErrorToastReason;
        bfm.AgG(1553181817);
        if ((i & 6) == 0) {
            iA0F = AnonymousClass002.A05(AnonymousClass004.A1X(c20q, bfm, i) ? 1 : 0) | i;
        } else {
            iA0F = i;
        }
        if ((i & 48) == 0) {
            iA0F |= AnonymousClass004.A0e(bfm, str);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0F |= 384;
        } else if ((i & 384) == 0) {
            iA0F |= AnonymousClass004.A0F(bfm, AnonymousClass003.A0K(voiceCallErrorToastReason2));
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0F & 147, 146), bfm, iA0F)) {
            if (i3 != 0) {
                voiceCallErrorToastReason2 = null;
            }
            boolean z = (iA0F & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32;
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = new VoiceGlobalEffectsKt$ThrottledToast$1$1(str);
                bfm.Ai0(objAaT);
            }
            ThrottledToast(c20q, (Function0) objAaT, voiceCallErrorToastReason2, null, 0L, bfm, iA0F & 910, 24);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C131972(c20q, str, voiceCallErrorToastReason2, i, i2);
        }
    }
}
