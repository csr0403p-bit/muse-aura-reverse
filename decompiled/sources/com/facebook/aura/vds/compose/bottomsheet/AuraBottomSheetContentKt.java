package com.facebook.aura.vds.compose.bottomsheet;

import X.AKQ;
import X.AbstractC1103AYp;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C06I;
import X.C07C;
import X.C0CD;
import X.C1062ATq;
import X.C10G;
import X.C1110AYw;
import X.C1515AkP;
import X.C1DG;
import X.C1DP;
import X.C1Y7;
import X.C1YY;
import X.C2VU;
import X.C3U4;
import X.C90l;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC05343Un;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraBottomSheetContentKt {
    public static final float CardCornerRadius = 22.0f;

    /* renamed from: com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt$AuraBottomSheetContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $fillHeight;
        public final /* synthetic */ C1110AYw $scrollState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(boolean z, C1110AYw c1110AYw, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w) {
            super(2);
            this.$fillHeight = z;
            this.$scrollState = c1110AYw;
            this.$content = g0w;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                BRg bRg = BRg.A00;
                C1062ATq c1062ATq = C10G.A02;
                if (this.$fillHeight) {
                    bRg = C10G.A00;
                }
                BRg bRgThen = c1062ATq.then(bRg);
                C1110AYw c1110AYw = this.$scrollState;
                if (c1110AYw != null) {
                    bRgThen = AbstractC1103AYp.A02(c1110AYw, bRgThen, true);
                }
                C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingLarge);
                G0W<C07C, BFM, Integer, Unit> g0w = this.$content;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, C2VU.A02, 0);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgThen);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
                AnonymousClass004.A1B(bbi, C90l.A00, bfm, g0w, 6);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt$AuraBottomSheetContent$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0W<C1DG, BFM, Integer, Unit> $background;
        public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $dismissible;
        public final /* synthetic */ boolean $fillHeight;
        public final /* synthetic */ boolean $floatingDragHandle;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $footer;
        public final /* synthetic */ AuraBottomSheetHeaderConfig $header;
        public final /* synthetic */ AuraThemeMode $modeOverride;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ C1110AYw $scrollState;
        public final /* synthetic */ AuraContainer.AuraBottomSheet $type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(AuraContainer.AuraBottomSheet auraBottomSheet, BRg bRg, C1110AYw c1110AYw, AuraBottomSheetHeaderConfig auraBottomSheetHeaderConfig, G0V<? super BFM, ? super Integer, Unit> g0v, G0W<? super C1DG, ? super BFM, ? super Integer, Unit> g0w, Function0<Unit> function0, boolean z, boolean z2, boolean z3, AuraThemeMode auraThemeMode, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w2, int i, int i2, int i3) {
            super(2);
            this.$type = auraBottomSheet;
            this.$modifier = bRg;
            this.$scrollState = c1110AYw;
            this.$header = auraBottomSheetHeaderConfig;
            this.$footer = g0v;
            this.$background = g0w;
            this.$onDismissRequest = function0;
            this.$dismissible = z;
            this.$floatingDragHandle = z2;
            this.$fillHeight = z3;
            this.$modeOverride = auraThemeMode;
            this.$content = g0w2;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraBottomSheetContentKt.AuraBottomSheetContent(this.$type, this.$modifier, this.$scrollState, this.$header, this.$footer, this.$background, this.$onDismissRequest, this.$dismissible, this.$floatingDragHandle, this.$fillHeight, this.$modeOverride, this.$content, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt$AuraBottomSheetLazyColumnContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C142652 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0U<C0CD, Unit> $content;
        public final /* synthetic */ boolean $fillHeight;
        public final /* synthetic */ BRg $listModifier;
        public final /* synthetic */ LazyListState $listState;
        public final /* synthetic */ InterfaceC1185Ado $verticalArrangement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C142652(LazyListState lazyListState, BRg bRg, boolean z, InterfaceC1185Ado interfaceC1185Ado, G0U<? super C0CD, Unit> g0u) {
            super(2);
            this.$listState = lazyListState;
            this.$listModifier = bRg;
            this.$fillHeight = z;
            this.$verticalArrangement = interfaceC1185Ado;
            this.$content = g0u;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            BRg bRg;
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                InterfaceC05343Un interfaceC05343UnA00 = C1Y7.A00(null, this.$listState, bfm, 0, 2);
                BRg bRgA0R = AnonymousClass001.A0R(this.$listModifier);
                if (this.$fillHeight) {
                    bRg = C10G.A00;
                } else {
                    bRg = BRg.A00;
                }
                BRg bRgThen = bRgA0R.then(bRg);
                float f = AuraDimensKt.SpacingLarge;
                BRg bRgA0B = C3U4.A0B(bRgThen, f, 0.0f);
                C1YY.A01(null, interfaceC05343UnA00, this.$verticalArrangement, new C1DP(0.0f, 0.0f, 0.0f, f), this.$listState, bfm, null, bRgA0B, this.$content, 0, 424, false, false);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt$AuraBottomSheetLazyColumnContent$3, reason: invalid class name and case insensitive filesystem */
    public final class C142663 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0W<C1DG, BFM, Integer, Unit> $background;
        public final /* synthetic */ G0U<C0CD, Unit> $content;
        public final /* synthetic */ boolean $dismissible;
        public final /* synthetic */ boolean $fillHeight;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $footer;
        public final /* synthetic */ AuraBottomSheetHeaderConfig $header;
        public final /* synthetic */ BRg $listModifier;
        public final /* synthetic */ LazyListState $listState;
        public final /* synthetic */ AuraThemeMode $modeOverride;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ AuraContainer.AuraBottomSheet $type;
        public final /* synthetic */ InterfaceC1185Ado $verticalArrangement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C142663(AuraContainer.AuraBottomSheet auraBottomSheet, BRg bRg, BRg bRg2, LazyListState lazyListState, InterfaceC1185Ado interfaceC1185Ado, AuraBottomSheetHeaderConfig auraBottomSheetHeaderConfig, G0V<? super BFM, ? super Integer, Unit> g0v, G0W<? super C1DG, ? super BFM, ? super Integer, Unit> g0w, Function0<Unit> function0, boolean z, boolean z2, AuraThemeMode auraThemeMode, G0U<? super C0CD, Unit> g0u, int i, int i2, int i3) {
            super(2);
            this.$type = auraBottomSheet;
            this.$modifier = bRg;
            this.$listModifier = bRg2;
            this.$listState = lazyListState;
            this.$verticalArrangement = interfaceC1185Ado;
            this.$header = auraBottomSheetHeaderConfig;
            this.$footer = g0v;
            this.$background = g0w;
            this.$onDismissRequest = function0;
            this.$dismissible = z;
            this.$fillHeight = z2;
            this.$modeOverride = auraThemeMode;
            this.$content = g0u;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraBottomSheetContentKt.AuraBottomSheetLazyColumnContent(this.$type, this.$modifier, this.$listModifier, this.$listState, this.$verticalArrangement, this.$header, this.$footer, this.$background, this.$onDismissRequest, this.$dismissible, this.$fillHeight, this.$modeOverride, this.$content, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* renamed from: lazyRowCardBackground-RPmYEkk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg m2404lazyRowCardBackgroundRPmYEkk(X.BRg r6, long r7, int r9, int r10) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r6, r0)
            if (r9 != 0) goto L19
            if (r10 != 0) goto L13
            float r0 = com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt.CardCornerRadius
            X.1D3 r0 = X.C1D8.A00(r0)
        Le:
            X.BRg r0 = X.C1b8.A03(r6, r0, r7)
            return r0
        L13:
            float r3 = com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt.CardCornerRadius
            r4 = 12
            r5 = 0
            goto L1f
        L19:
            if (r9 != r10) goto L3a
            float r5 = com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt.CardCornerRadius
            r4 = 3
            r3 = 0
        L1f:
            r2 = r3
            r1 = r5
            r0 = r4 & 1
            if (r0 == 0) goto L26
            r3 = 0
        L26:
            r0 = r4 & 2
            if (r0 == 0) goto L2b
            r2 = 0
        L2b:
            r0 = r4 & 4
            if (r0 == 0) goto L30
            r5 = 0
        L30:
            r0 = r4 & 8
            if (r0 == 0) goto L35
            r1 = 0
        L35:
            X.1D3 r0 = X.C1D8.A01(r3, r2, r5, r1)
            goto Le
        L3a:
            X.1DM r0 = X.C1OM.A00
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt.m2404lazyRowCardBackgroundRPmYEkk(X.BRg, long, int, int):X.BRg");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraBottomSheetContent(com.facebook.aura.vds.compose.theme.AuraContainer.AuraBottomSheet r41, X.BRg r42, X.C1110AYw r43, com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig r44, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r45, X.G0W<? super X.C1DG, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r46, kotlin.jvm.functions.Function0<kotlin.Unit> r47, boolean r48, boolean r49, boolean r50, com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode r51, X.G0W<? super X.C07C, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r52, X.BFM r53, int r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt.AuraBottomSheetContent(com.facebook.aura.vds.compose.theme.AuraContainer$AuraBottomSheet, X.BRg, X.AYw, com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig, X.G0V, X.G0W, kotlin.jvm.functions.Function0, boolean, boolean, boolean, com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode, X.G0W, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraBottomSheetLazyColumnContent(com.facebook.aura.vds.compose.theme.AuraContainer.AuraBottomSheet r30, X.BRg r31, X.BRg r32, androidx.compose.foundation.lazy.LazyListState r33, X.InterfaceC1185Ado r34, com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig r35, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r36, X.G0W<? super X.C1DG, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r37, kotlin.jvm.functions.Function0<kotlin.Unit> r38, boolean r39, boolean r40, com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode r41, X.G0U<? super X.C0CD, kotlin.Unit> r42, X.BFM r43, int r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt.AuraBottomSheetLazyColumnContent(com.facebook.aura.vds.compose.theme.AuraContainer$AuraBottomSheet, X.BRg, X.BRg, androidx.compose.foundation.lazy.LazyListState, X.Ado, com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig, X.G0V, X.G0W, kotlin.jvm.functions.Function0, boolean, boolean, com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode, X.G0U, X.BFM, int, int, int):void");
    }
}
