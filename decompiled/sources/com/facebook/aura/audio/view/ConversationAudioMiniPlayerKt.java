package com.facebook.aura.audio.view;

import X.AKQ;
import X.AOW;
import X.ARD;
import X.ARL;
import X.AT5;
import X.AT8;
import X.AVy;
import X.AYD;
import X.AaM;
import X.AbstractC04540eo;
import X.AbstractC07127nr;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B18;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BRr;
import X.BS0;
import X.C00q;
import X.C00x;
import X.C0v5;
import X.C10F;
import X.C10G;
import X.C11U;
import X.C1299Agk;
import X.C1515AkP;
import X.C1BO;
import X.C1D8;
import X.C1DG;
import X.C1DM;
import X.C1OM;
import X.C1b8;
import X.C1er;
import X.C2VU;
import X.C3U4;
import X.C3UX;
import X.C3bM;
import X.C3bN;
import X.C3bf;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.EnumC10460Hji;
import X.F60;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.aura.R;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import com.facebook.aura.vds.compose.button.AuraElevatedButtonKt;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ConversationAudioMiniPlayerKt {
    public static final ContextChain ARTWORK_CONTEXT_CHAIN = new ContextChain(null, "pi", "ConversationAudioMiniPlayer");

    /* renamed from: com.facebook.aura.audio.view.ConversationAudioMiniPlayerKt$ConversationAudioMiniPlayer$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $artworkUrl;
        public final /* synthetic */ boolean $isPlaying;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onForward;
        public final /* synthetic */ Function0<Unit> $onRewind;
        public final /* synthetic */ Function0<Unit> $onTap;
        public final /* synthetic */ Function0<Unit> $onToggle;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, String str2, String str3, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$subtitle = str2;
            this.$artworkUrl = str3;
            this.$isPlaying = z;
            this.$onToggle = function0;
            this.$onRewind = function02;
            this.$onForward = function03;
            this.$onDismiss = function04;
            this.$onTap = function05;
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
            ConversationAudioMiniPlayerKt.ConversationAudioMiniPlayer(this.$title, this.$subtitle, this.$artworkUrl, this.$isPlaying, this.$onToggle, this.$onRewind, this.$onForward, this.$onDismiss, this.$onTap, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ConversationAudioMiniPlayer(String str, String str2, String str3, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, BRg bRg, BFM bfm, int i, int i2) {
        BS0 bs0;
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(str, str2);
        AnonymousClass003.A0y(function0, function02);
        AnonymousClass005.A13(function03, function04, function05, 6);
        bfm.AgG(-199762643);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str3);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function0);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, function02);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, function03);
        }
        if ((12582912 & i) == 0) {
            iA0d |= AnonymousClass004.A0a(bfm, function04);
        }
        if ((100663296 & i) == 0) {
            iA0d |= AnonymousClass004.A0b(bfm, function05);
        }
        int i3 = i2 & 512;
        if (i3 != 0) {
            iA0d |= 805306368;
        } else if ((i & 805306368) == 0) {
            iA0d |= AnonymousClass004.A0m(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1I(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            AuraTypography auraTypographyA0f = AnonymousClass002.A0f(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new ParcelableSnapshotMutableFloatState(0.0f);
                bfm.Ai0(objAaT);
            }
            final C00q c00q = (C00q) objAaT;
            final C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, bfm.AaT(), obj);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201c1);
            final MutableState mutableStateA00 = C1er.A00(bfm, function04);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = new ConversationAudioMiniPlayerKt$ConversationAudioMiniPlayer$1$1(c00q);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA03 = AYD.A03(bRg2, (G0U) objAaT2);
            Unit unit = Unit.INSTANCE;
            boolean zA1N = AnonymousClass003.A1N(bfm, c3ux, mutableStateA00);
            Object objAaT3 = bfm.AaT();
            if (zA1N || objAaT3 == obj) {
                objAaT3 = new PointerInputEventHandler() { // from class: com.facebook.aura.audio.view.ConversationAudioMiniPlayerKt$ConversationAudioMiniPlayer$2$1

                    /* renamed from: com.facebook.aura.audio.view.ConversationAudioMiniPlayerKt$ConversationAudioMiniPlayer$2$1$1, reason: invalid class name */
                    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
                        public final /* synthetic */ C1BO<Function0<Unit>> $currentOnDismiss$delegate;
                        public final /* synthetic */ float $dismissThreshold;
                        public final /* synthetic */ C00q $offsetX$delegate;
                        public final /* synthetic */ C3UX $scope;
                        public final /* synthetic */ float $width;

                        @DebugMetadata(c = "com.facebook.aura.audio.view.ConversationAudioMiniPlayerKt$ConversationAudioMiniPlayer$2$1$1$1", f = "ConversationAudioMiniPlayer.kt", l = {SelfieSnapshotKt.SELFIE_JPEG_QUALITY}, m = "invokeSuspend", v = 2)
                        /* renamed from: com.facebook.aura.audio.view.ConversationAudioMiniPlayerKt$ConversationAudioMiniPlayer$2$1$1$1, reason: invalid class name and collision with other inner class name */
                        public final class C00451 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
                            public final /* synthetic */ C1BO<Function0<Unit>> $currentOnDismiss$delegate;
                            public final /* synthetic */ C00q $offsetX$delegate;
                            public final /* synthetic */ float $target;
                            public int label;

                            /* renamed from: com.facebook.aura.audio.view.ConversationAudioMiniPlayerKt$ConversationAudioMiniPlayer$2$1$1$1$1, reason: invalid class name and collision with other inner class name */
                            public final class C00461 extends AbstractC7559F3s implements G0U<AT5<Float, AOW>, Unit> {
                                public final /* synthetic */ C00q $offsetX$delegate;

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(AT5<Float, AOW> at5) {
                                    C7384Etj.A0Y(at5, 0);
                                    C00q c00q = this.$offsetX$delegate;
                                    float fA00 = MutableState.A00(at5);
                                    ContextChain contextChain = ConversationAudioMiniPlayerKt.ARTWORK_CONTEXT_CHAIN;
                                    c00q.AdS(fA00);
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public C00461(C00q c00q) {
                                    super(1);
                                    this.$offsetX$delegate = c00q;
                                }

                                @Override // X.G0U
                                public /* bridge */ /* synthetic */ Unit invoke(AT5<Float, AOW> at5) {
                                    invoke2(at5);
                                    return Unit.INSTANCE;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public C00451(float f, C00q c00q, C1BO<? extends Function0<Unit>> c1bo, HtJ<? super C00451> htJ) {
                                super(2, htJ);
                                this.$target = f;
                                this.$offsetX$delegate = c00q;
                                this.$currentOnDismiss$delegate = c1bo;
                            }

                            @Override // X.AbstractC8884Fsp
                            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                                return new C00451(this.$target, this.$offsetX$delegate, this.$currentOnDismiss$delegate, htJ);
                            }

                            @Override // X.AbstractC8884Fsp
                            public final Object invokeSuspend(Object obj) {
                                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                                int i = this.label;
                                if (i == 0) {
                                    Hwg.A00(obj);
                                    C00q c00q = this.$offsetX$delegate;
                                    ContextChain contextChain = ConversationAudioMiniPlayerKt.ARTWORK_CONTEXT_CHAIN;
                                    AT5 at5A00 = AT8.A00(c00q.AFn());
                                    Float f = new Float(this.$target);
                                    C00461 c00461 = new C00461(this.$offsetX$delegate);
                                    this.label = 1;
                                    if (AnonymousClass002.A0i(at5A00, at5A00.A08, f, this, c00461) == enumC10460Hji) {
                                        return enumC10460Hji;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw AnonymousClass001.A0n();
                                    }
                                    Hwg.A00(obj);
                                }
                                C1BO<Function0<Unit>> c1bo = this.$currentOnDismiss$delegate;
                                ContextChain contextChain2 = ConversationAudioMiniPlayerKt.ARTWORK_CONTEXT_CHAIN;
                                C1BO.A0D(c1bo);
                                return Unit.INSTANCE;
                            }

                            @Override // X.G0V
                            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                                return ((C00451) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
                            }
                        }

                        @DebugMetadata(c = "com.facebook.aura.audio.view.ConversationAudioMiniPlayerKt$ConversationAudioMiniPlayer$2$1$1$2", f = "ConversationAudioMiniPlayer.kt", l = {99}, m = "invokeSuspend", v = 2)
                        /* renamed from: com.facebook.aura.audio.view.ConversationAudioMiniPlayerKt$ConversationAudioMiniPlayer$2$1$1$2, reason: invalid class name */
                        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
                            public final /* synthetic */ C00q $offsetX$delegate;
                            public int label;

                            /* renamed from: com.facebook.aura.audio.view.ConversationAudioMiniPlayerKt$ConversationAudioMiniPlayer$2$1$1$2$1, reason: invalid class name and collision with other inner class name */
                            public final class C00471 extends AbstractC7559F3s implements G0U<AT5<Float, AOW>, Unit> {
                                public final /* synthetic */ C00q $offsetX$delegate;

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(AT5<Float, AOW> at5) {
                                    C7384Etj.A0Y(at5, 0);
                                    C00q c00q = this.$offsetX$delegate;
                                    float fA00 = MutableState.A00(at5);
                                    ContextChain contextChain = ConversationAudioMiniPlayerKt.ARTWORK_CONTEXT_CHAIN;
                                    c00q.AdS(fA00);
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public C00471(C00q c00q) {
                                    super(1);
                                    this.$offsetX$delegate = c00q;
                                }

                                @Override // X.G0U
                                public /* bridge */ /* synthetic */ Unit invoke(AT5<Float, AOW> at5) {
                                    invoke2(at5);
                                    return Unit.INSTANCE;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass2(C00q c00q, HtJ<? super AnonymousClass2> htJ) {
                                super(2, htJ);
                                this.$offsetX$delegate = c00q;
                            }

                            @Override // X.AbstractC8884Fsp
                            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                                return new AnonymousClass2(this.$offsetX$delegate, htJ);
                            }

                            @Override // X.AbstractC8884Fsp
                            public final Object invokeSuspend(Object obj) {
                                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                                int i = this.label;
                                if (i == 0) {
                                    Hwg.A00(obj);
                                    C00q c00q = this.$offsetX$delegate;
                                    ContextChain contextChain = ConversationAudioMiniPlayerKt.ARTWORK_CONTEXT_CHAIN;
                                    AT5 at5A00 = AT8.A00(c00q.AFn());
                                    Float fA0l = AnonymousClass001.A0l();
                                    C00471 c00471 = new C00471(this.$offsetX$delegate);
                                    this.label = 1;
                                    if (AnonymousClass002.A0i(at5A00, at5A00.A08, fA0l, this, c00471) == enumC10460Hji) {
                                        return enumC10460Hji;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw AnonymousClass001.A0n();
                                    }
                                    Hwg.A00(obj);
                                }
                                return Unit.INSTANCE;
                            }

                            @Override // X.G0V
                            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                                return new AnonymousClass2(this.$offsetX$delegate, htJ).invokeSuspend(Unit.INSTANCE);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public AnonymousClass1(float f, float f2, C3UX c3ux, C00q c00q, C1BO<? extends Function0<Unit>> c1bo) {
                            super(0);
                            this.$dismissThreshold = f;
                            this.$width = f2;
                            this.$scope = c3ux;
                            this.$offsetX$delegate = c00q;
                            this.$currentOnDismiss$delegate = c1bo;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            C3UX c3ux;
                            G0V anonymousClass2;
                            C00q c00q = this.$offsetX$delegate;
                            ContextChain contextChain = ConversationAudioMiniPlayerKt.ARTWORK_CONTEXT_CHAIN;
                            if (Math.abs(c00q.AFn()) > this.$dismissThreshold) {
                                float fAFn = this.$offsetX$delegate.AFn();
                                float f = this.$width;
                                if (fAFn <= 0.0f) {
                                    f = -f;
                                }
                                c3ux = this.$scope;
                                anonymousClass2 = new C00451(f, this.$offsetX$delegate, this.$currentOnDismiss$delegate, null);
                            } else {
                                c3ux = this.$scope;
                                anonymousClass2 = new AnonymousClass2(this.$offsetX$delegate, null);
                            }
                            AnonymousClass001.A1J(anonymousClass2, c3ux);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }
                    }

                    /* renamed from: com.facebook.aura.audio.view.ConversationAudioMiniPlayerKt$ConversationAudioMiniPlayer$2$1$2, reason: invalid class name */
                    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<C1299Agk, Float, Unit> {
                        public final /* synthetic */ C00q $offsetX$delegate;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(C00q c00q) {
                            super(2);
                            this.$offsetX$delegate = c00q;
                        }

                        @Override // X.G0V
                        public /* bridge */ /* synthetic */ Unit invoke(C1299Agk c1299Agk, Float f) {
                            invoke(c1299Agk, AnonymousClass001.A02(f));
                            return Unit.INSTANCE;
                        }

                        public final void invoke(C1299Agk c1299Agk, float f) {
                            C7384Etj.A0Y(c1299Agk, 0);
                            c1299Agk.A02();
                            C00q c00q = this.$offsetX$delegate;
                            ContextChain contextChain = ConversationAudioMiniPlayerKt.ARTWORK_CONTEXT_CHAIN;
                            c00q.AdS(c00q.AFn() + f);
                        }
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                        float fA01 = AnonymousClass007.A01(bRr);
                        C3UX c3ux2 = c3ux;
                        C00q c00q2 = c00q;
                        Object objA0l = AnonymousClass006.A0l(bRr, htJ, new C3bf(null, new AnonymousClass1(fA01 / 3.0f, fA01, c3ux2, c00q2, mutableStateA00), new C3bN(3), new C3bM(1), new AnonymousClass2(c00q2), 0));
                        return objA0l != EnumC10460Hji.A02 ? Unit.INSTANCE : objA0l;
                    }
                };
                bfm.Ai0(objAaT3);
            }
            BRg bRgA00 = AaM.A00(bRgA03, (PointerInputEventHandler) objAaT3, unit);
            boolean zA1K = AnonymousClass003.A1K(bfm, strA01, mutableStateA00);
            Object objAaT4 = bfm.AaT();
            if (zA1K || objAaT4 == obj) {
                objAaT4 = new ConversationAudioMiniPlayerKt$ConversationAudioMiniPlayer$3$1(strA01, mutableStateA00);
                bfm.Ai0(objAaT4);
            }
            BRg bRgA01 = C11U.A01(AbstractC04540eo.A00(ARD.A01(bRgA00, (G0U) objAaT4, false), C1D8.A00(28.0f), 8.0f, 28, 0L, 0L), 28.0f);
            long j = auraColorsA0c.highlight;
            C1DM c1dm = C1OM.A00;
            BRg bRgA0B = C3U4.A0B(C0v5.A05(C1b8.A03(bRgA01, c1dm, j), null, function05, zA1a), 8.0f, 8.0f);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 4.0f);
            BBI bbi = (BBI) bfm;
            long j2 = bbi.A06;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function06 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function06);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            G0V g0vA0t = AnonymousClass002.A0t(bfm, interfaceC1380AiAA0V, akqA04, g0v);
            Integer numValueOf = Integer.valueOf(i4);
            G0V<InterfaceC1516AkQ, Integer, Unit> g0v2 = C1515AkP.A03;
            BPg.A02(bfm, numValueOf, g0v2);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA012, g0u);
            C90m c90m = C90m.A00;
            if (str3 != null) {
                bfm.AgE(-125342184);
                ARL arl = B18.A00;
                ContextChain contextChain = ARTWORK_CONTEXT_CHAIN;
                bs0 = BRg.A00;
                AuraImageKt.m2573AuraImageXRP3Ue8(str3, C11U.A01(C10G.A07(bs0, 40.0f), 8.0f), arl, null, contextChain, false, new C1DG(40.0f), 0L, false, false, false, null, null, null, null, bfm, ((iA0d >> 6) & 14) | 1576320, 0, 32672);
            } else {
                bfm.AgE(-125046909);
                bs0 = BRg.A00;
                BRg bRgA032 = C1b8.A03(C11U.A01(C10G.A07(bs0, 40.0f), 8.0f), c1dm, auraColorsA0c.background);
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, bRgA032);
                AnonymousClass005.A0n(bfm, bbi, function06);
                BPg.A02(bfm, interfaceC1380AiAA0a, g0v);
                BPg.A02(bfm, akqA042, g0vA0t);
                AnonymousClass003.A15(g0u, g0v2, bfm, iA0D);
                BPg.A02(bfm, bRgA013, g0vA0u);
                C10F.A00(bfm, C10G.A07(bs0, 20.0f), BOf.A00(bfm, R.drawable.audio_outline_24_wght400, 0), null, AVy.$stable | 432, 0, auraColorsA0c.secondaryText);
                BBI.A0R(bbi, zA1a);
            }
            BBI.A0R(bbi, false);
            BRg bRgA0B2 = C3U4.A0B(AnonymousClass001.A0O(c90m, bs0, zA1a), 8.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA014 = AxM.A01(bfm, bRgA0B2);
            AnonymousClass005.A0n(bfm, bbi, function06);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            BPg.A02(bfm, akqA043, g0vA0t);
            AnonymousClass003.A15(g0u, g0v2, bfm, iA0D2);
            BPg.A02(bfm, bRgA014, g0vA0u);
            bfm.AgE(-1100997080);
            String strA012 = str;
            if (C7BY.A0j(str)) {
                strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201bf);
            }
            BBI.A0R(bbi, false);
            AuraTextKt.m2639AuraTextUY9GdpU(strA012, null, auraColorsA0c.primaryText, auraTypographyA0f.bodyEmphasized, null, null, null, false, 0, zA1a ? 1 : 0, 2, null, null, null, bfm, 805306368, 6, 14834);
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, auraColorsA0c.secondaryText, auraTypographyA0f.caption1Regular, null, null, null, false, 0, zA1a ? 1 : 0, 2, null, null, null, bfm, ((iA0d >> 3) & 14) | 805306368, 6, 14834);
            BBI.A0R(bbi, zA1a);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.ic_seek_backwards_fifteen, 0);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201c3);
            int i5 = AVy.$stable;
            AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(aVyA00, strA013, function02, null, false, 0.0f, null, null, null, false, false, bfm, i5 | ((iA0d >> 9) & 896), 0, 2040);
            int i6 = R.drawable.ic_playback_play;
            if (z) {
                i6 = R.drawable.ic_playback_pause;
            }
            AVy aVyA002 = BOf.A00(bfm, i6, 0);
            int i7 = R.string._name_removed__res_0x7f120e6c;
            if (z) {
                i7 = R.string._name_removed__res_0x7f120db0;
            }
            AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(aVyA002, AbstractC2271BQs.A01(bfm, i7), function0, null, false, 0.0f, null, null, null, false, false, bfm, i5 | ((iA0d >> 6) & 896), 0, 2040);
            AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(BOf.A00(bfm, R.drawable.ic_seek_forwards_fifteen, 0), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201c0), function03, null, false, 0.0f, null, null, null, false, false, bfm, i5 | ((iA0d >> 12) & 896), 0, 2040);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(str, str2, str3, z, function0, function02, function03, function04, function05, bRg2, i, i2);
        }
    }
}
