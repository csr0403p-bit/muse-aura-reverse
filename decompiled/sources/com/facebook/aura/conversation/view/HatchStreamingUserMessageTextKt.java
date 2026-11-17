package com.facebook.aura.conversation.view;

import X.AEk;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.ApQ;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C06827l3;
import X.C1822Arm;
import X.C1958Aux;
import X.C78N;
import X.G0U;
import X.G0V;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.markdown.render.BlockTextDirectionKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class HatchStreamingUserMessageTextKt {
    public static final long MAX_WORD_DELAY_MS = 120;
    public static final C06827l3 TRANSCRIPT_WORD = new C06827l3("\\S+");
    public static final long WORD_FADE_MS = 300;
    public static final long WORD_STAGGER_MS = 18;

    /* renamed from: com.facebook.aura.conversation.view.HatchStreamingUserMessageTextKt$HatchStreamingUserMessageText$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $reflowSoftLineBreaks;
        public final /* synthetic */ String $text;
        public final /* synthetic */ C1822Arm $textStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, C1822Arm c1822Arm, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$textStyle = c1822Arm;
            this.$reflowSoftLineBreaks = z;
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
            HatchStreamingUserMessageTextKt.HatchStreamingUserMessageText(this.$text, this.$textStyle, this.$reflowSoftLineBreaks, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchStreamingUserMessageText(String str, C1822Arm c1822Arm, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        Object objA00 = c1822Arm;
        boolean zA1b = AnonymousClass004.A1b(str, c1822Arm);
        bfm.AgG(-1396146624);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, c1822Arm);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new VoiceTranscriptReveal();
                bfm.Ai0(objAaT);
            }
            VoiceTranscriptReveal voiceTranscriptReveal = (VoiceTranscriptReveal) objAaT;
            int i4 = iA0d & 14;
            boolean zA1Q = AnonymousClass002.A1Q(i4, 4);
            Object objAaT2 = bfm.AaT();
            if (zA1Q || objAaT2 == obj) {
                objAaT2 = new HatchStreamingUserMessageTextKt$HatchStreamingUserMessageText$1$1(voiceTranscriptReveal, str);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A15(bfm, objAaT2);
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = new HatchStreamingUserMessageTextKt$HatchStreamingUserMessageText$2$1(voiceTranscriptReveal, null);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A18(bfm, objAaT3, voiceTranscriptReveal);
            MutableState mutableState = (MutableState) AnonymousClass005.A0f(bfm, obj, null);
            boolean zA1Q2 = AnonymousClass002.A1Q(i4, 4);
            Object objAaT4 = bfm.AaT();
            if (zA1Q2 || objAaT4 == obj) {
                objAaT4 = AnonymousClass005.A0X(str);
                bfm.Ai0(objAaT4);
            }
            ApQ apQ = (ApQ) objAaT4;
            boolean zA1K = AnonymousClass004.A1K(iA0d) | AnonymousClass003.A1C(iA0d) | AnonymousClass002.A1Q(i4, 4);
            Object objAaT5 = bfm.AaT();
            if (zA1K || objAaT5 == obj) {
                if (z) {
                    objA00 = C1822Arm.A00(null, c1822Arm, null, null, null, null, null, null, null, null, zA1b ? 1 : 0, BlockTextDirectionKt.blockTextDirection(str), zA1b ? 1 : 0, 16711679, 0L, 0L, 0L, 0L);
                }
                bfm.Ai0(objA00);
                objAaT5 = objA00;
            }
            C1822Arm c1822Arm2 = (C1822Arm) objAaT5;
            boolean zA65 = bfm.A65(apQ) | (i4 == 4);
            Object objAaT6 = bfm.AaT();
            if (zA65 || objAaT6 == obj) {
                objAaT6 = new HatchStreamingUserMessageTextKt$HatchStreamingUserMessageText$3$1(voiceTranscriptReveal, str, mutableState, apQ);
                bfm.Ai0(objAaT6);
            }
            BRg bRgA02 = AEk.A02(bRg2, (G0U) objAaT6);
            Object objAaT7 = bfm.AaT();
            if (objAaT7 == obj) {
                objAaT7 = new HatchStreamingUserMessageTextKt$HatchStreamingUserMessageText$4$1(mutableState);
                bfm.Ai0(objAaT7);
            }
            AuraTextKt.m2640AuraTextVmYn7U0(apQ, bRgA02, 0L, c1822Arm2, null, null, null, 0L, zA1b, zA1b ? 1 : 0, zA1b ? 1 : 0, zA1b ? 1 : 0, (G0U) objAaT7, null, null, bfm, zA1b ? 1 : 0, 384, 28660);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(str, c1822Arm, z, bRg2, i, i2);
        }
    }

    public static final /* synthetic */ C1958Aux access$HatchStreamingUserMessageText$lambda$4(MutableState mutableState) {
        return (C1958Aux) mutableState.getValue();
    }
}
