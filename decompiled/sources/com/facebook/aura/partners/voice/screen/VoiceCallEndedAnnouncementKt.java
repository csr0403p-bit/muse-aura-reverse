package com.facebook.aura.partners.voice.screen;

import X.AbstractC07127nr;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C10G;
import X.C1BO;
import X.C1HY;
import X.C2CK;
import X.C3Pi;
import X.C3UX;
import X.C3Ue;
import X.C3cG;
import X.C3cH;
import X.C5303Dfm;
import X.C78N;
import X.EnumC10460Hji;
import X.EnumC10573Huf;
import X.F2N;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.microphone.view.SilencedByMicrophoneKt;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.vds.compose.accessibility.ScreenReaderKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public abstract class VoiceCallEndedAnnouncementKt {
    public static final long CALL_ENDED_ANNOUNCEMENT_HOLD_MS = 2000;
    public static final long CALL_ENDED_AUDIO_RELEASE_TIMEOUT_MS = 10000;
    public static final long CALL_ENDED_REFOCUS_SETTLE_MS = 800;

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallEndedAnnouncementKt$VoiceCallEndedAnnouncement$1, reason: invalid class name */
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
            VoiceCallEndedAnnouncementKt.VoiceCallEndedAnnouncement(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallEndedAnnouncementKt$VoiceCallEndedAnnouncement$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BRg bRg, int i, int i2) {
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
            VoiceCallEndedAnnouncementKt.VoiceCallEndedAnnouncement(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallEndedAnnouncementKt$VoiceCallEndedAnnouncement$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(BRg bRg, int i, int i2) {
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
            VoiceCallEndedAnnouncementKt.VoiceCallEndedAnnouncement(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallEndedAnnouncementKt$VoiceCallEndedAnnouncement$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(BRg bRg, int i, int i2) {
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
            VoiceCallEndedAnnouncementKt.VoiceCallEndedAnnouncement(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceCallEndedAnnouncementKt", f = "VoiceCallEndedAnnouncement.kt", l = {79}, m = "leavesResumedWithin", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallEndedAnnouncementKt$leavesResumedWithin$1, reason: invalid class name and case insensitive filesystem */
    public final class C131831 extends HzP {
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceCallEndedAnnouncementKt.leavesResumedWithin(null, 0L, this);
        }

        public C131831(HtJ<? super C131831> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceCallEndedAnnouncementKt$leavesResumedWithin$2", f = "VoiceCallEndedAnnouncement.kt", l = {80}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallEndedAnnouncementKt$leavesResumedWithin$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super EnumC10573Huf>, Object> {
        public final /* synthetic */ F2N $this_leavesResumedWithin;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceCallEndedAnnouncementKt$leavesResumedWithin$2$1", f = "VoiceCallEndedAnnouncement.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallEndedAnnouncementKt$leavesResumedWithin$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<EnumC10573Huf, HtJ<? super Boolean>, Object> {
            public /* synthetic */ Object L$0;
            public int label;

            public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10573Huf enumC10573Huf = (EnumC10573Huf) this.L$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return C3cG.A0P(enumC10573Huf.A00(EnumC10573Huf.A05));
            }

            @Override // X.G0V
            public final Object invoke(EnumC10573Huf enumC10573Huf, HtJ<? super Boolean> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                anonymousClass1.L$0 = enumC10573Huf;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(F2N f2n, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$this_leavesResumedWithin = f2n;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$this_leavesResumedWithin, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C3Pi c3PiA11 = C3cG.A11(((C5303Dfm) this.$this_leavesResumedWithin).A06);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                obj = AbstractC9777Gfy.A00(this, anonymousClass1, c3PiA11);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super EnumC10573Huf> htJ) {
            return new AnonymousClass2(this.$this_leavesResumedWithin, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final void VoiceCallEndedAnnouncement(BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass6;
        BRg bRg2 = bRg;
        bfm.AgG(1413658924);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (ScreenReaderKt.rememberIsScreenReaderEnabled(bfm, 0)) {
                VoiceCallStateHolder companion = VoiceCallStateHolder.Companion.getInstance(AnonymousClass002.A0h(bfm));
                F2N f2nA00 = C1HY.A00(bfm);
                C1BO c1boA02 = C2CK.A02(bfm, companion.isCallActive);
                C1BO c1boA022 = C2CK.A02(bfm, companion.callGeneration);
                Object objAaT = bfm.AaT();
                Object obj = C78N.A00;
                if (objAaT == obj) {
                    objAaT = AnonymousClass005.A0S(bfm, C1BO.A0F(c1boA02));
                }
                MutableState mutableState = (MutableState) objAaT;
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == obj) {
                    objAaT2 = AnonymousClass004.A11(bfm, CallEndedPhase.IDLE);
                }
                MutableState mutableState2 = (MutableState) objAaT2;
                Boolean boolValueOf = Boolean.valueOf(C1BO.A0F(c1boA02));
                Long lValueOf = Long.valueOf(C3cG.A05(c1boA022.getValue()));
                boolean zA1R = AnonymousClass001.A1R(bfm, c1boA022, C3cH.A1O(bfm, c1boA02, f2nA00, companion));
                Object objAaT3 = bfm.AaT();
                if (zA1R || objAaT3 == obj) {
                    objAaT3 = new VoiceCallEndedAnnouncementKt$VoiceCallEndedAnnouncement$2$1(f2nA00, companion, mutableState, c1boA02, mutableState2, c1boA022, null);
                    bfm.Ai0(objAaT3);
                }
                AnonymousClass001.A1A(bfm, objAaT3, boolValueOf, lValueOf);
                if (mutableState2.getValue() == CallEndedPhase.IDLE) {
                    bBbAAc = bfm.AAc();
                    if (bBbAAc == null) {
                        return;
                    } else {
                        anonymousClass6 = new AnonymousClass3(bRg2, i, i2);
                    }
                } else if (SilencedByMicrophoneKt.rememberSilencedByMicrophone(Long.valueOf(C3cG.A05(c1boA022.getValue())), bfm, 0)) {
                    bBbAAc = bfm.AAc();
                    if (bBbAAc == null) {
                        return;
                    } else {
                        anonymousClass6 = new AnonymousClass4(bRg2, i, i2);
                    }
                } else {
                    String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120646);
                    BRg bRgA07 = C10G.A07(bRg2, 1.0f);
                    boolean zA65 = bfm.A65(strA01);
                    Object objAaT4 = bfm.AaT();
                    if (zA65 || objAaT4 == obj) {
                        objAaT4 = new VoiceCallEndedAnnouncementKt$VoiceCallEndedAnnouncement$5$1(strA01, mutableState2);
                        bfm.Ai0(objAaT4);
                    }
                    C3Ue.A04(AnonymousClass001.A0Y(bRgA07, objAaT4, false), bfm, 0);
                }
            } else {
                bBbAAc = bfm.AAc();
                if (bBbAAc == null) {
                    return;
                } else {
                    anonymousClass6 = new AnonymousClass1(bRg2, i, i2);
                }
            }
            C3cG.A1D(bBbAAc, anonymousClass6);
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass6 = new AnonymousClass6(bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object leavesResumedWithin(X.F2N r5, long r6, X.HtJ<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof com.facebook.aura.partners.voice.screen.VoiceCallEndedAnnouncementKt.C131831
            if (r0 == 0) goto L4e
            r4 = r8
            com.facebook.aura.partners.voice.screen.VoiceCallEndedAnnouncementKt$leavesResumedWithin$1 r4 = (com.facebook.aura.partners.voice.screen.VoiceCallEndedAnnouncementKt.C131831) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L38
            if (r0 != r2) goto L54
            java.lang.Object r5 = r4.L$0
            X.F2N r5 = (X.F2N) r5
            X.Hwg.A00(r1)
        L24:
            if (r1 != 0) goto L33
            X.Dfm r5 = (X.C5303Dfm) r5
            X.Huf r1 = r5.A01
            X.Huf r0 = X.EnumC10573Huf.A05
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L33
            r2 = 0
        L33:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L38:
            X.Hwg.A00(r1)
            r1 = 0
            com.facebook.aura.partners.voice.screen.VoiceCallEndedAnnouncementKt$leavesResumedWithin$2 r0 = new com.facebook.aura.partners.voice.screen.VoiceCallEndedAnnouncementKt$leavesResumedWithin$2
            r0.<init>(r5, r1)
            r4.L$0 = r5
            r4.J$0 = r6
            r4.label = r2
            java.lang.Object r1 = X.GAX.A01(r4, r0, r6)
            if (r1 != r3) goto L24
            return r3
        L4e:
            com.facebook.aura.partners.voice.screen.VoiceCallEndedAnnouncementKt$leavesResumedWithin$1 r4 = new com.facebook.aura.partners.voice.screen.VoiceCallEndedAnnouncementKt$leavesResumedWithin$1
            r4.<init>(r8)
            goto L12
        L54:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceCallEndedAnnouncementKt.leavesResumedWithin(X.F2N, long, X.HtJ):java.lang.Object");
    }

    public static final /* synthetic */ CallEndedPhase access$VoiceCallEndedAnnouncement$lambda$6(MutableState mutableState) {
        return (CallEndedPhase) mutableState.getValue();
    }
}
