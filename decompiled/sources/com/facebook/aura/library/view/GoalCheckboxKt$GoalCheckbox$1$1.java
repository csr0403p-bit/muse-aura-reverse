package com.facebook.aura.library.view;

import X.AOW;
import X.AT5;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C0dx;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.composer.util.ImageCompressor;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.library.view.GoalCheckboxKt$GoalCheckbox$1$1", f = "GoalCheckbox.kt", l = {ImageCompressor.IMAGE_COMPRESSION_QUALITY}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class GoalCheckboxKt$GoalCheckbox$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $checked;
    public final /* synthetic */ C0dx $haptic;
    public final /* synthetic */ AT5<Float, AOW> $scale;
    public final /* synthetic */ MutableState<Boolean> $wasChecked$delegate;
    public /* synthetic */ Object L$0;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.library.view.GoalCheckboxKt$GoalCheckbox$1$1$1", f = "GoalCheckbox.kt", l = {LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE, 66, MessageDraftSenderKt.UNICODE_MULTIPART_CHARS, 75}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.view.GoalCheckboxKt$GoalCheckbox$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AT5<Float, AOW> $scale;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AT5<Float, AOW> at5, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$scale = at5;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$scale, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0068 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0083 A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                X.Hji r6 = X.EnumC10460Hji.A02
                int r0 = r9.label
                r8 = 3
                r2 = 1
                r4 = 2
                r7 = 4
                r5 = 0
                if (r0 == 0) goto L19
                if (r0 == r2) goto L2b
                if (r0 == r4) goto L49
                if (r0 == r8) goto L69
                if (r0 != r7) goto L84
                X.Hwg.A00(r10)
            L16:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L19:
                X.Hwg.A00(r10)
                X.AT5<java.lang.Float, X.AOW> r1 = r9.$scale
                java.lang.Float r0 = X.AnonymousClass001.A0m()
                r9.label = r2
                java.lang.Object r0 = r1.A04(r0, r9)
                if (r0 != r6) goto L2e
                return r6
            L2b:
                X.Hwg.A00(r10)
            L2e:
                X.AT5<java.lang.Float, X.AOW> r3 = r9.$scale
                r0 = 1062333317(0x3f51eb85, float:0.82)
                java.lang.Float r2 = new java.lang.Float
                r2.<init>(r0)
                X.28s r1 = X.C2HU.A01
                r0 = 100
                X.ASj r0 = X.AnonymousClass002.A0J(r1, r0)
                r9.label = r4
                java.lang.Object r0 = X.AnonymousClass002.A0i(r3, r0, r2, r9, r5)
                if (r0 != r6) goto L4c
                return r6
            L49:
                X.Hwg.A00(r10)
            L4c:
                X.AT5<java.lang.Float, X.AOW> r4 = r9.$scale
                r0 = 1066863165(0x3f970a3d, float:1.18)
                java.lang.Float r3 = new java.lang.Float
                r3.<init>(r0)
                r2 = 1061158912(0x3f400000, float:0.75)
                r1 = 1176256512(0x461c4000, float:10000.0)
                X.AOr r0 = new X.AOr
                r0.<init>(r5, r2, r1)
                r9.label = r8
                java.lang.Object r0 = X.AnonymousClass002.A0i(r4, r0, r3, r9, r5)
                if (r0 != r6) goto L6c
                return r6
            L69:
                X.Hwg.A00(r10)
            L6c:
                X.AT5<java.lang.Float, X.AOW> r4 = r9.$scale
                java.lang.Float r3 = X.AnonymousClass001.A0m()
                r2 = 1056964608(0x3f000000, float:0.5)
                r1 = 1137180672(0x43c80000, float:400.0)
                X.AOr r0 = new X.AOr
                r0.<init>(r5, r2, r1)
                r9.label = r7
                java.lang.Object r0 = X.AnonymousClass002.A0i(r4, r0, r3, r9, r5)
                if (r0 != r6) goto L16
                return r6
            L84:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.GoalCheckboxKt$GoalCheckbox$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new AnonymousClass1(this.$scale, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalCheckboxKt$GoalCheckbox$1$1(boolean z, C0dx c0dx, AT5<Float, AOW> at5, MutableState<Boolean> mutableState, HtJ<? super GoalCheckboxKt$GoalCheckbox$1$1> htJ) {
        super(2, htJ);
        this.$checked = z;
        this.$haptic = c0dx;
        this.$scale = at5;
        this.$wasChecked$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        GoalCheckboxKt$GoalCheckbox$1$1 goalCheckboxKt$GoalCheckbox$1$1 = new GoalCheckboxKt$GoalCheckbox$1$1(this.$checked, this.$haptic, this.$scale, this.$wasChecked$delegate, htJ);
        goalCheckboxKt$GoalCheckbox$1$1.L$0 = obj;
        return goalCheckboxKt$GoalCheckbox$1$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C3UX c3ux = (C3UX) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$checked && !MutableState.A0A((MutableState) this.$wasChecked$delegate)) {
                this.$haptic.AXr(AuraHaptics.SUCCESS);
                AnonymousClass001.A1J(new AnonymousClass1(this.$scale, null), c3ux);
            } else if (!this.$checked) {
                AT5<Float, AOW> at5 = this.$scale;
                Float fA0m = AnonymousClass001.A0m();
                this.L$0 = null;
                this.label = 1;
                if (at5.A04(fA0m, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        MutableState.A09(this.$checked, this.$wasChecked$delegate);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((GoalCheckboxKt$GoalCheckbox$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
