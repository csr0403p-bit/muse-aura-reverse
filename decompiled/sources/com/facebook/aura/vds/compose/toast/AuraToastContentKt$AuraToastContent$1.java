package com.facebook.aura.vds.compose.toast;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.B1U;
import X.B1V;
import X.B6A;
import X.BFM;
import X.BRg;
import X.C1DM;
import X.C78N;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.surface.AuraSurfaceKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraToastContentKt$AuraToastContent$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ boolean $hasEndItem;
    public final /* synthetic */ boolean $hasStartItem;
    public final /* synthetic */ Integer $leadingIcon;
    public final /* synthetic */ AuraIconSize $leadingIconSize;
    public final /* synthetic */ B6A $leadingIconTint;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ C1DM $shape;
    public final /* synthetic */ String $subtitle;
    public final /* synthetic */ BRg $surfaceModifier;
    public final /* synthetic */ String $title;
    public final /* synthetic */ AuraToastOption $type;

    /* renamed from: com.facebook.aura.vds.compose.toast.AuraToastContentKt$AuraToastContent$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $inner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(G0V<? super BFM, ? super Integer, Unit> g0v) {
            super(3);
            this.$inner = g0v;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
            invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                AnonymousClass006.A1Q(bfm, this.$inner);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.toast.AuraToastContentKt$AuraToastContent$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $inner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(G0V<? super BFM, ? super Integer, Unit> g0v) {
            super(3);
            this.$inner = g0v;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
            invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                AnonymousClass006.A1Q(bfm, this.$inner);
            } else {
                bfm.Afo();
            }
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InteractionType.values().length];
            try {
                AnonymousClass002.A13(InteractionType.CLICKABLE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(InteractionType.NONE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraToastContentKt$AuraToastContent$1(AuraToastOption auraToastOption, Function0<Unit> function0, BRg bRg, C1DM c1dm, long j, boolean z, Integer num, boolean z2, AuraIconSize auraIconSize, B6A b6a, String str, String str2) {
        super(2);
        this.$type = auraToastOption;
        this.$onClick = function0;
        this.$surfaceModifier = bRg;
        this.$shape = c1dm;
        this.$backgroundColor = j;
        this.$hasStartItem = z;
        this.$leadingIcon = num;
        this.$hasEndItem = z2;
        this.$leadingIconSize = auraIconSize;
        this.$leadingIconTint = b6a;
        this.$title = str;
        this.$subtitle = str2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            B1U b1uA00 = B1V.A00(bfm, new AuraToastContentKt$AuraToastContent$1$inner$1(this.$hasStartItem, this.$leadingIcon, this.$hasEndItem, this.$type, this.$leadingIconSize, this.$leadingIconTint, this.$title, this.$subtitle, this.$onClick), -41075088);
            int iOrdinal = AuraToastContentKt.toInteractionType(this.$type).ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal == 0) {
                    bfm.AgE(155038918);
                    AuraSurfaceKt.m2623AuraSurface1esR5Hs(this.$surfaceModifier, this.$shape, false, this.$backgroundColor, null, 0L, null, true, B1V.A00(bfm, new AnonymousClass4(b1uA00), -395001325), bfm, 113246208, 116);
                } else {
                    throw AnonymousClass005.A0k(bfm, 697727134);
                }
            } else {
                bfm.AgE(154771977);
                Function0<Unit> function0 = this.$onClick;
                if (function0 == null) {
                    Object objA0p = AnonymousClass001.A0p(bfm, 154850190);
                    if (objA0p == C78N.A00) {
                        objA0p = AuraToastContentKt$AuraToastContent$1$1$1.INSTANCE;
                        bfm.Ai0(objA0p);
                    }
                    function0 = (Function0) objA0p;
                } else {
                    bfm.AgE(697731487);
                }
                AnonymousClass001.A1D(bfm);
                BRg bRg = this.$surfaceModifier;
                C1DM c1dm = this.$shape;
                boolean zA64 = bfm.A64(this.$backgroundColor);
                long j = this.$backgroundColor;
                Object objAaT = bfm.AaT();
                if (zA64 || objAaT == C78N.A00) {
                    objAaT = new AuraToastContentKt$AuraToastContent$1$2$1(j);
                    bfm.Ai0(objAaT);
                }
                AuraSurfaceKt.m2624AuraSurfaceWiQJ_vM(bRg, c1dm, false, (Function0) objAaT, null, 0L, null, function0, null, null, null, null, null, true, B1V.A00(bfm, new AnonymousClass3(b1uA00), -1862707579), bfm, 0, 27648, 8052);
            }
            AnonymousClass001.A1D(bfm);
            return;
        }
        bfm.Afo();
    }
}
