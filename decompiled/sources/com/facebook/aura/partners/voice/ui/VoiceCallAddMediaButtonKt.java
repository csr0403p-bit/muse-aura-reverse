package com.facebook.aura.partners.voice.ui;

import X.AVy;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C78N;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.button.AuraElevatedButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class VoiceCallAddMediaButtonKt {
    public static final float ControlButtonSize = 64.0f;

    /* renamed from: com.facebook.aura.partners.voice.ui.VoiceCallAddMediaButtonKt$VoiceCallAddMediaButton$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onClick = function0;
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
            VoiceCallAddMediaButtonKt.VoiceCallAddMediaButton(this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void VoiceCallAddMediaButton(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        Function0<Unit> function02 = function0;
        BRg bRg2 = bRg;
        bfm.AgG(620299448);
        int i3 = i2 & 1;
        int iA0T = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function02) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = VoiceCallAddMediaButtonKt$VoiceCallAddMediaButton$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                function02 = (Function0) objAaT;
            }
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(BOf.A00(bfm, R.drawable.voice_plus_24, 0), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120637), function02, AbstractC07539Wl.A00(bRg2, "voice-add-media-button"), false, ControlButtonSize, null, null, null, false, false, bfm, 196608 | AVy.$stable | ((iA0T << 6) & 896), 0, 2000);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function02, bRg2, i, i2);
        }
    }
}
