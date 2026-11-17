package com.facebook.aura.partners.voice.ui;

import X.A6B;
import X.ASj;
import X.AbstractC05192Wm;
import X.AbstractC1103AYp;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.B1V;
import X.B6A;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C06827l3;
import X.C06G;
import X.C0968AJv;
import X.C10G;
import X.C1110AYw;
import X.C11U;
import X.C1731ApS;
import X.C1809ArT;
import X.C1822Arm;
import X.C1824Aro;
import X.C1YL;
import X.C1b8;
import X.C1er;
import X.C2HU;
import X.C2VG;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.EnumC1820Arj;
import X.G0V;
import X.HDi;
import X.HxS;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.view.typewritertext.HatchTrailingFadeTypewriterTextKt;
import com.facebook.aura.markdown.render.BlockTextDirectionKt;
import com.facebook.aura.markdown.render.reveal.WordRevealController;
import com.facebook.aura.partners.voice.intf.CaptionEntry;
import com.facebook.aura.partners.voice.intf.CaptionSpeaker;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraModeOverriderKt;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class VoiceCallCaptionsKt {
    public static final float CaptionVerticalPadding = 12.0f;
    public static final int PACED_VOICE_CALL_CAPTION_MAX_LINES = 3;
    public static final int PASSIVE_CAPTION_MAX_LINES = 2;
    public static final float PassiveCaptionVerticalPadding = AuraDimensKt.SpacingXsmallPlusNano;
    public static final int VOICE_CALL_CAPTION_MAX_LINES = 4;

    /* renamed from: com.facebook.aura.partners.voice.ui.VoiceCallCaptionsKt$VoiceCallOverlayCaption$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ boolean $animateResize;
        public final /* synthetic */ CaptionEntry $entry;
        public final /* synthetic */ Function0<Float> $entryProgress;
        public final /* synthetic */ boolean $fadeInWords;
        public final /* synthetic */ int $initialVisibleCharacterCount;
        public final /* synthetic */ boolean $isStreaming;
        public final /* synthetic */ float $maxHeight;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $passive;
        public final /* synthetic */ boolean $startAligned;
        public final /* synthetic */ C1822Arm $style;
        public final /* synthetic */ boolean $textIsRtl;

        /* renamed from: com.facebook.aura.partners.voice.ui.VoiceCallCaptionsKt$VoiceCallOverlayCaption$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03251 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ boolean $animateResize;
            public final /* synthetic */ long $background;
            public final /* synthetic */ CaptionEntry $entry;
            public final /* synthetic */ Function0<Float> $entryProgress;
            public final /* synthetic */ boolean $fadeInWords;
            public final /* synthetic */ int $initialVisibleCharacterCount;
            public final /* synthetic */ boolean $isStreaming;
            public final /* synthetic */ float $maxHeight;
            public final /* synthetic */ BRg $modifier;
            public final /* synthetic */ boolean $passive;
            public final /* synthetic */ boolean $startAligned;
            public final /* synthetic */ C1822Arm $style;
            public final /* synthetic */ boolean $textIsRtl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03251(boolean z, BRg bRg, boolean z2, Function0<Float> function0, boolean z3, long j, boolean z4, float f, CaptionEntry captionEntry, boolean z5, C1822Arm c1822Arm, int i, boolean z6) {
                super(2);
                this.$startAligned = z;
                this.$modifier = bRg;
                this.$textIsRtl = z2;
                this.$entryProgress = function0;
                this.$passive = z3;
                this.$background = j;
                this.$animateResize = z4;
                this.$maxHeight = f;
                this.$entry = captionEntry;
                this.$isStreaming = z5;
                this.$style = c1822Arm;
                this.$initialVisibleCharacterCount = i;
                this.$fadeInWords = z6;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                C3TH c3th;
                float f;
                if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                    int i2 = 3;
                    if (this.$startAligned) {
                        i2 = 5;
                    }
                    long jA0C = C06G.A0C(bfm);
                    bfm.AgE(-1661396387);
                    BRg bRgA0R = AnonymousClass001.A0R(this.$modifier);
                    if (!this.$startAligned) {
                        c3th = C2VU.A00;
                    } else if (this.$textIsRtl) {
                        c3th = C2VG.A01;
                    } else {
                        c3th = C2VG.A00;
                    }
                    BRg bRgA00 = C10G.A00(c3th, bRgA0R, false);
                    Function0<Float> function0 = this.$entryProgress;
                    boolean z = this.$textIsRtl;
                    if (function0 != null) {
                        float fA00 = AnonymousClass006.A00(z ? 1 : 0);
                        BS0 bs0 = BRg.A00;
                        boolean zA1I = AnonymousClass003.A1I(bfm, function0, fA00);
                        Object objAaT = bfm.AaT();
                        if (zA1I || objAaT == C78N.A00) {
                            objAaT = new VoiceCallCaptionsKt$VoiceCallOverlayCaption$1$1$1$1$1(function0, fA00);
                            bfm.Ai0(objAaT);
                        }
                        bRgA00 = bRgA00.then(AnonymousClass001.A0W(bs0, objAaT));
                    }
                    AnonymousClass001.A1D(bfm);
                    boolean z2 = this.$passive;
                    float f2 = 22.0f;
                    if (z2) {
                        f2 = 16.0f;
                    }
                    BRg bRgA01 = C1b8.A01(C11U.A01(bRgA00, f2), this.$background);
                    boolean z3 = this.$animateResize;
                    if (z3) {
                        bRgA01 = bRgA01.then(AbstractC05192Wm.A00(new ASj(C2HU.A03, 150, 0), BRg.A00));
                    }
                    if (z2) {
                        f = VoiceCallCaptionsKt.PassiveCaptionVerticalPadding;
                    } else {
                        f = VoiceCallCaptionsKt.CaptionVerticalPadding;
                    }
                    BRg bRgA0A = C10G.A0A(C3U4.A0B(bRgA01, 16.0f, f), Float.NaN, this.$maxHeight);
                    C1110AYw c1110AYwRememberCaptionScrollState = VoiceCallCaptionsKt.rememberCaptionScrollState(z3, bfm, 0);
                    boolean z4 = this.$passive;
                    VoiceCallCaptionsKt.m1819CaptionText609ORrk(this.$entry, this.$isStreaming, jA0C, this.$style, this.$initialVisibleCharacterCount, z4, this.$fadeInWords, i2, AbstractC1103AYp.A02(c1110AYwRememberCaptionScrollState, bRgA0A, !z4), bfm, CaptionEntry.$stable, 0);
                    return;
                }
                bfm.Afo();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, boolean z2, BRg bRg, boolean z3, Function0<Float> function0, boolean z4, float f, CaptionEntry captionEntry, boolean z5, C1822Arm c1822Arm, int i, boolean z6) {
            super(2);
            this.$passive = z;
            this.$startAligned = z2;
            this.$modifier = bRg;
            this.$textIsRtl = z3;
            this.$entryProgress = function0;
            this.$animateResize = z4;
            this.$maxHeight = f;
            this.$entry = captionEntry;
            this.$isStreaming = z5;
            this.$style = c1822Arm;
            this.$initialVisibleCharacterCount = i;
            this.$fadeInWords = z6;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraThemeMode auraThemeMode;
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                long j = AnonymousClass002.A0c(bfm).toast;
                long jA04 = HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.85f);
                boolean z = this.$passive;
                if (z) {
                    auraThemeMode = AuraThemeMode.DARK;
                } else {
                    auraThemeMode = AuraThemeMode.LIGHT;
                }
                AuraModeOverriderKt.AuraModeOverrider(auraThemeMode, null, B1V.A00(bfm, new C03251(this.$startAligned, this.$modifier, this.$textIsRtl, this.$entryProgress, z, jA04, this.$animateResize, this.$maxHeight, this.$entry, this.$isStreaming, this.$style, this.$initialVisibleCharacterCount, this.$fadeInWords), 1303297637), bfm, 384, 2);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.ui.VoiceCallCaptionsKt$VoiceCallOverlayCaption$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $animateResize;
        public final /* synthetic */ CaptionEntry $entry;
        public final /* synthetic */ Function0<Float> $entryProgress;
        public final /* synthetic */ boolean $fadeInWords;
        public final /* synthetic */ int $initialVisibleCharacterCount;
        public final /* synthetic */ boolean $isStreaming;
        public final /* synthetic */ int $maxLines;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $passive;
        public final /* synthetic */ boolean $startAligned;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CaptionEntry captionEntry, boolean z, boolean z2, int i, boolean z3, BRg bRg, int i2, boolean z4, boolean z5, Function0<Float> function0, int i3, int i4) {
            super(2);
            this.$entry = captionEntry;
            this.$isStreaming = z;
            this.$animateResize = z2;
            this.$maxLines = i;
            this.$startAligned = z3;
            this.$modifier = bRg;
            this.$initialVisibleCharacterCount = i2;
            this.$passive = z4;
            this.$fadeInWords = z5;
            this.$entryProgress = function0;
            this.$$changed = i3;
            this.$$default = i4;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceCallCaptionsKt.VoiceCallOverlayCaption(this.$entry, this.$isStreaming, this.$animateResize, this.$maxLines, this.$startAligned, this.$modifier, this.$initialVisibleCharacterCount, this.$passive, this.$fadeInWords, this.$entryProgress, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: CaptionText-609ORrk, reason: not valid java name */
    public static final void m1819CaptionText609ORrk(CaptionEntry captionEntry, boolean z, long j, C1822Arm c1822Arm, int i, boolean z2, boolean z3, int i2, BRg bRg, BFM bfm, int i3, int i4) {
        BRg bRg2 = bRg;
        bfm.AgG(-295079782);
        int iA05 = (i3 & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(captionEntry, bfm, i3) ? 1 : 0) | i3 : i3;
        if ((i3 & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i3 & 384) == 0) {
            iA05 |= AnonymousClass004.A0O(bfm, j);
        }
        if ((i3 & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, c1822Arm);
        }
        if ((i3 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0G(bfm, i);
        }
        if ((196608 & i3) == 0) {
            iA05 |= AnonymousClass004.A0s(bfm, z2);
        }
        if ((1572864 & i3) == 0) {
            iA05 |= AnonymousClass004.A0t(bfm, z3);
        }
        if ((12582912 & i3) == 0) {
            iA05 |= AnonymousClass004.A0J(bfm, i2);
        }
        int i5 = i4 & 256;
        int iA0l = 100663296;
        if (i5 != 0) {
            iA05 |= iA0l;
        } else if ((100663296 & i3) == 0) {
            iA0l = AnonymousClass004.A0l(bfm, bRg2);
            iA05 |= iA0l;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1G(iA05), bfm, iA05)) {
            if (i5 != 0) {
                bRg2 = BRg.A00;
            }
            if (z3) {
                bfm.AgE(1076557342);
                int i6 = iA05 >> 3;
                AuraTextKt.m2640AuraTextVmYn7U0(m1821rememberWordFadeInRPmYEkk(captionEntry, j, bfm, CaptionEntry.$stable | (iA05 & 14) | (i6 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX)), bRg2, j, c1822Arm, null, null, new C1YL(i2), 0L, false, 0, 0, 0, null, null, null, bfm, AnonymousClass002.A08(iA05, (iA05 >> 21) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (i6 & 3670016), 0, 32688);
            } else if (captionEntry.speaker == CaptionSpeaker.BOT && z && !z2) {
                bfm.AgE(1076813619);
                String str = captionEntry.text;
                HatchTrailingFadeTypewriterTextKt.m698HatchTrailingFadeTypewriterTextYXPlkAI(str, AnonymousClass005.A0X(str), i2, bRg2, i, false, 0L, 0, 0, null, c1822Arm, j, null, null, null, null, null, 0L, false, 0, null, null, null, null, false, bfm, AnonymousClass001.A0A(iA05, (iA05 >> 15) & 8064), ((iA05 >> 9) & 14) | ((iA05 >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0, 33551328);
            } else {
                bfm.AgE(1077131028);
                AuraTextKt.m2639AuraTextUY9GdpU(captionEntry.text, bRg2, j, c1822Arm, null, null, new C1YL(i2), false, 0, 0, 0, null, null, null, bfm, AnonymousClass002.A08(iA05, (iA05 >> 21) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ((iA05 >> 3) & 3670016), 0, 16304);
            }
            AnonymousClass002.A19(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new VoiceCallCaptionsKt$CaptionText$1(captionEntry, z, j, c1822Arm, i, z2, z3, i2, bRg2, i3, i4);
        }
    }

    public static final void VoiceCallOverlayCaption(CaptionEntry captionEntry, boolean z, boolean z2, int i, boolean z3, BRg bRg, int i2, boolean z4, boolean z5, Function0<Float> function0, BFM bfm, int i3, int i4) {
        int i5 = i2;
        boolean z6 = z4;
        boolean z7 = z5;
        Function0<Float> function02 = function0;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(captionEntry, 0);
        bfm.AgG(1824686981);
        int iA05 = (i3 & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(captionEntry, bfm, i3) ? 1 : 0) | i3 : i3;
        if ((i3 & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i3 & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i3 & 3072) == 0) {
            iA05 |= AnonymousClass007.A06(bfm, i);
        }
        if ((i3 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0r(bfm, z3);
        }
        int i6 = i4 & 32;
        int iA0i = 196608;
        if (i6 != 0) {
            iA05 |= iA0i;
        } else if ((196608 & i3) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA05 |= iA0i;
        }
        int i7 = i4 & 64;
        int iA0I = 1572864;
        if (i7 != 0) {
            iA05 |= iA0I;
        } else if ((1572864 & i3) == 0) {
            iA0I = AnonymousClass004.A0I(bfm, i5);
            iA05 |= iA0I;
        }
        int i8 = i4 & 128;
        int iA0u = 12582912;
        if (i8 != 0) {
            iA05 |= iA0u;
        } else if ((12582912 & i3) == 0) {
            iA0u = AnonymousClass004.A0u(bfm, z6);
            iA05 |= iA0u;
        }
        int i9 = i4 & 256;
        int iA0v = 100663296;
        if (i9 != 0) {
            iA05 |= iA0v;
        } else if ((100663296 & i3) == 0) {
            i9 = 0;
            iA0v = AnonymousClass004.A0v(bfm, z7);
            iA05 |= iA0v;
        }
        int i10 = i4 & 512;
        int iA0c = 805306368;
        if (i10 != 0) {
            iA05 |= iA0c;
        } else if ((805306368 & i3) == 0) {
            i10 = 0;
            iA0c = AnonymousClass004.A0c(bfm, function02);
            iA05 |= iA0c;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1I(iA05), bfm, iA05)) {
            if (i6 != 0) {
                bRg2 = BRg.A00;
            }
            if (i7 != 0) {
                i5 = 0;
            }
            if (i8 != 0) {
                z6 = false;
            }
            if (i9 != 0) {
                z7 = false;
            }
            if (i10 != 0) {
                function02 = null;
            }
            EnumC1820Arj enumC1820ArjA0d = AnonymousClass001.A0d(bfm);
            boolean zA1H = AnonymousClass003.A1H(bfm, enumC1820ArjA0d, bfm.A65(captionEntry.text));
            Object objAaT = bfm.AaT();
            if (zA1H || objAaT == C78N.A00) {
                int iBlockTextDirection = BlockTextDirectionKt.blockTextDirection(captionEntry.text);
                objAaT = AnonymousClass001.A0j(bfm, iBlockTextDirection == 2 || (iBlockTextDirection != 1 && enumC1820ArjA0d == EnumC1820Arj.A03));
            }
            boolean zA1X = AnonymousClass001.A1X(objAaT);
            C1822Arm subheadlineCompactRegular = z6 ? AnonymousClass006.A0k(bfm, 1177554814).getSubheadlineCompactRegular() : AnonymousClass006.A0k(bfm, 1177556656).bodyRegular;
            AnonymousClass001.A1D(bfm);
            boolean zA1U = AnonymousClass001.A1U(bfm, zA1X, AnonymousClass005.A1M(iA05) | bfm.A65(subheadlineCompactRegular));
            Object objAaT2 = bfm.AaT();
            if (zA1U || objAaT2 == C78N.A00) {
                if (z3) {
                    subheadlineCompactRegular = C1822Arm.A00(null, subheadlineCompactRegular, null, null, null, null, null, null, null, null, 0, zA1X ? 2 : 1, 0, 16711679, 0L, 0L, 0L, 0L);
                }
                bfm.Ai0(subheadlineCompactRegular);
                objAaT2 = subheadlineCompactRegular;
            }
            C1822Arm c1822Arm = (C1822Arm) objAaT2;
            int i11 = i;
            if (z6) {
                i11 = 2;
            }
            AuraModeOverriderKt.AuraModeOverrider(z6 ? AuraThemeMode.LIGHT : AuraThemeMode.DARK, null, B1V.A00(bfm, new AnonymousClass1(z6, z3, bRg2, zA1X, function02, z2, rememberCaptionTextMaxHeight(c1822Arm, i11, bfm, 0), captionEntry, z, c1822Arm, i5, z7), 1577197554), bfm, 384, 2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(captionEntry, z, z2, i, z3, bRg2, i5, z6, z7, function02, i3, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float rememberCaptionTextMaxHeight(X.C1822Arm r15, int r16, X.BFM r17, int r18) {
        /*
            r5 = r16
            r6 = 0
            r14 = 1
            r2 = r17
            X.Asi r8 = X.C2KR.A00(r2, r6, r14)
            X.AXN r1 = X.AnonymousClass002.A0Y(r2)
            boolean r7 = r2.A65(r8)
            r0 = r18 & 14
            r0 = r0 ^ 6
            r4 = 4
            r9 = r15
            if (r0 <= r4) goto L20
            boolean r0 = r2.A65(r15)
            if (r0 != 0) goto L25
        L20:
            r3 = r18 & 6
            r0 = 0
            if (r3 != r4) goto L26
        L25:
            r0 = 1
        L26:
            boolean r4 = X.AnonymousClass002.A1W(r2, r1, r7, r0)
            r0 = r18 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r3 = 32
            if (r0 <= r3) goto L38
            boolean r0 = r2.A63(r5)
            if (r0 != 0) goto L3c
        L38:
            r0 = r18 & 48
            if (r0 != r3) goto L3d
        L3c:
            r6 = 1
        L3d:
            r4 = r4 | r6
            java.lang.Object r0 = r2.AaT()
            if (r4 != 0) goto L48
            java.lang.Object r3 = X.C78N.A00
            if (r0 != r3) goto L7d
        L48:
            java.lang.String r0 = "\n"
            int r5 = r16 - r14
            java.lang.String r0 = X.AbstractC2159Azp.A0y(r0, r5)
            X.AGi r13 = X.C0881AGi.A00
            X.ApQ r7 = new X.ApQ
            r7.<init>(r0, r13)
            r15 = 2147483647(0x7fffffff, float:NaN)
            r0 = 0
            long r16 = X.AYL.A06(r0, r15, r0, r15)
            X.Arj r12 = r8.A02
            X.AXN r11 = r8.A01
            X.2K7 r10 = r8.A00
            r18 = r14
            X.Aux r0 = X.C1868Asi.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18)
            long r3 = r0.A02
            int r0 = X.AnonymousClass002.A09(r3)
            float r1 = r1.Agy(r0)
            X.1DG r0 = new X.1DG
            r0.<init>(r1)
            r2.Ai0(r0)
        L7d:
            X.1DG r0 = (X.C1DG) r0
            float r0 = r0.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.ui.VoiceCallCaptionsKt.rememberCaptionTextMaxHeight(X.Arm, int, X.BFM, int):float");
    }

    /* renamed from: rememberWordFadeIn-RPmYEkk, reason: not valid java name */
    public static final ApQ m1821rememberWordFadeInRPmYEkk(CaptionEntry captionEntry, long j, BFM bfm, int i) {
        String str = captionEntry.text;
        boolean zA1R = AnonymousClass001.A1R(bfm, captionEntry.messageId, AnonymousClass002.A1U(bfm, captionEntry.speaker));
        Object objAaT = bfm.AaT();
        if (zA1R || objAaT == C78N.A00) {
            objAaT = new WordRevealController();
            bfm.Ai0(objAaT);
        }
        WordRevealController wordRevealController = (WordRevealController) objAaT;
        boolean zA65 = bfm.A65(str);
        Object objAaT2 = bfm.AaT();
        if (zA65 || objAaT2 == C78N.A00) {
            objAaT2 = A6B.A02(A6B.A08(VoiceCallCaptionsKt$rememberWordFadeIn$words$1$1.INSTANCE, C06827l3.A00(str, new C06827l3("\\S+"))));
            bfm.Ai0(objAaT2);
        }
        List list = (List) objAaT2;
        boolean zA1M = AnonymousClass003.A1M(bfm, wordRevealController, list);
        Object objAaT3 = bfm.AaT();
        if (zA1M || objAaT3 == C78N.A00) {
            objAaT3 = new VoiceCallCaptionsKt$rememberWordFadeIn$1$1(wordRevealController, list);
            bfm.Ai0(objAaT3);
        }
        AnonymousClass001.A15(bfm, objAaT3);
        boolean zA67 = bfm.A67(wordRevealController);
        Object objAaT4 = bfm.AaT();
        if (zA67 || objAaT4 == C78N.A00) {
            objAaT4 = new VoiceCallCaptionsKt$rememberWordFadeIn$2$1(wordRevealController, null);
            bfm.Ai0(objAaT4);
        }
        AnonymousClass001.A18(bfm, objAaT4, wordRevealController);
        C1731ApS c1731ApSA0X = AnonymousClass006.A0X(str);
        int size = list.size();
        for (int settledWords = wordRevealController.getSettledWords(); settledWords < size; settledWords++) {
            float fAlpha = wordRevealController.alpha(settledWords);
            if (fAlpha < 1.0f) {
                C0968AJv c0968AJv = (C0968AJv) list.get(settledWords);
                long jA04 = HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), fAlpha);
                long j2 = C1809ArT.A01;
                c1731ApSA0X.A0A(new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, jA04, j2, j2, B6A.A07), c0968AJv.A00, c0968AJv.A01 + 1);
            }
        }
        return c1731ApSA0X.A04();
    }

    public static final C1110AYw rememberCaptionScrollState(boolean z, BFM bfm, int i) {
        C1110AYw c1110AYwA00 = AbstractC1103AYp.A00(Integer.MAX_VALUE, bfm, 6, 0);
        MutableState mutableStateA00 = C1er.A00(bfm, Boolean.valueOf(z));
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT == obj) {
            objAaT = new AtomicBoolean(true);
            bfm.Ai0(objAaT);
        }
        AtomicBoolean atomicBoolean = (AtomicBoolean) objAaT;
        boolean zA1J = AnonymousClass003.A1J(bfm, c1110AYwA00, atomicBoolean);
        Object objAaT2 = bfm.AaT();
        if (zA1J || objAaT2 == obj) {
            objAaT2 = new VoiceCallCaptionsKt$rememberCaptionScrollState$1$1(c1110AYwA00, atomicBoolean, null);
            bfm.Ai0(objAaT2);
        }
        AnonymousClass001.A18(bfm, objAaT2, c1110AYwA00);
        boolean zA1J2 = AnonymousClass003.A1J(bfm, c1110AYwA00, atomicBoolean);
        Object objAaT3 = bfm.AaT();
        if (zA1J2 || objAaT3 == obj) {
            objAaT3 = new VoiceCallCaptionsKt$rememberCaptionScrollState$2$1(c1110AYwA00, atomicBoolean, null);
            bfm.Ai0(objAaT3);
        }
        AnonymousClass001.A18(bfm, objAaT3, c1110AYwA00);
        boolean zA1O = AnonymousClass003.A1O(bfm, atomicBoolean, mutableStateA00, bfm.A65(c1110AYwA00));
        Object objAaT4 = bfm.AaT();
        if (zA1O || objAaT4 == obj) {
            objAaT4 = new VoiceCallCaptionsKt$rememberCaptionScrollState$3$1(c1110AYwA00, atomicBoolean, mutableStateA00, null);
            bfm.Ai0(objAaT4);
        }
        AnonymousClass001.A18(bfm, objAaT4, c1110AYwA00);
        return c1110AYwA00;
    }

    public static final float rememberVoiceCallOverlayCaptionMaxHeight(BFM bfm, int i) {
        return rememberCaptionTextMaxHeight(AnonymousClass002.A0f(bfm).getSubheadlineCompactRegular(), 2, bfm, 48) + (PassiveCaptionVerticalPadding * 2.0f);
    }
}
