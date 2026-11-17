package com.facebook.aura.partners.voice.ui;

import X.ARL;
import X.AWA;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.B18;
import X.B1T;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1SA;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.C8j3;
import X.G0V;
import X.InterfaceC2178B0w;
import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class EmbodimentActivityCoverKt {
    public static final long ACTIVITY_COVER_CAPTURE_INITIAL_RETRY_MS = 250;
    public static final long ACTIVITY_COVER_CAPTURE_MAX_RETRY_MS = 5000;

    /* renamed from: com.facebook.aura.partners.voice.ui.EmbodimentActivityCoverKt$EmbodimentActivityCover$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function0<Float> $bottomAlignmentFraction;
        public final /* synthetic */ boolean $fillViewport;
        public final /* synthetic */ InterfaceC2178B0w $frame;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC2178B0w interfaceC2178B0w, BRg bRg, boolean z, Function0<Float> function0, int i, int i2) {
            super(2);
            this.$frame = interfaceC2178B0w;
            this.$modifier = bRg;
            this.$fillViewport = z;
            this.$bottomAlignmentFraction = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            EmbodimentActivityCoverKt.EmbodimentActivityCover(this.$frame, this.$modifier, this.$fillViewport, this.$bottomAlignmentFraction, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void EmbodimentActivityCover(InterfaceC2178B0w interfaceC2178B0w, BRg bRg, boolean z, Function0<Float> function0, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1K = z;
        Function0<Float> function02 = function0;
        C7384Etj.A0Y(interfaceC2178B0w, 0);
        bfm.AgG(-160857406);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(interfaceC2178B0w, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            zA1K = C3cG.A1K(i4, z);
            if (i5 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = EmbodimentActivityCoverKt$EmbodimentActivityCover$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                function02 = (Function0) objAaT;
            }
            ARL arl = B18.A01;
            Bitmap bitmap = ((B1T) interfaceC2178B0w).A00;
            C1SA.A01(bfm, null, EmbodimentReferenceFramingKt.m1803embodimentReferenceFraming5oXFXW4(bRg2, new AWA((C8j3.A0P(bitmap.getWidth()) << 32) | (4294967295L & C8j3.A0P(bitmap.getHeight()))), null, zA1K, function02), interfaceC2178B0w, arl, null, (iA05 & 14) | 24624, 232);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(interfaceC2178B0w, bRg2, zA1K, function02, i, i2);
        }
    }

    public static final /* synthetic */ RetainedActivityCover access$rememberEmbodimentActivityCover$lambda$1(MutableState mutableState) {
        return (RetainedActivityCover) mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.partners.voice.ui.RetainedActivityCover rememberEmbodimentActivityCover(long r22, boolean r24, com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaReducerState r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31, kotlin.jvm.functions.Function0<android.graphics.Bitmap> r32, kotlin.jvm.functions.Function0<X.AWA> r33, X.BFM r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.ui.EmbodimentActivityCoverKt.rememberEmbodimentActivityCover(long, boolean, com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaReducerState, boolean, boolean, boolean, boolean, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BFM, int, int):com.facebook.aura.partners.voice.ui.RetainedActivityCover");
    }
}
