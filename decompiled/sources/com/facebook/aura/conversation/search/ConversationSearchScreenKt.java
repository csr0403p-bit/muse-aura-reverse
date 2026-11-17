package com.facebook.aura.conversation.search;

import X.A6B;
import X.ADq;
import X.AEk;
import X.AHD;
import X.AKQ;
import X.AVy;
import X.AbstractC0878AGe;
import X.AbstractC1754Apr;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AnonymousClass037;
import X.ApQ;
import X.AxM;
import X.B1V;
import X.B6A;
import X.B81;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06827l3;
import X.C06847l8;
import X.C06G;
import X.C0AU;
import X.C0CD;
import X.C0v5;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1731ApS;
import X.C1736ApY;
import X.C1805ArO;
import X.C1809ArT;
import X.C1822Arm;
import X.C1824Aro;
import X.C1BO;
import X.C1D8;
import X.C1DE;
import X.C1EQ;
import X.C1Lu;
import X.C1YL;
import X.C1YY;
import X.C1Z5;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C3TH;
import X.C3TQ;
import X.C3U4;
import X.C3Ue;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C7LE;
import X.C8iN;
import X.C90m;
import X.EnumC06837l4;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.HDi;
import X.HxS;
import X.InterfaceC05151eP;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import com.facebook.aura.R;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.conversation.repo.HatchSearchUiState;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.conversation.viewmodel.HatchSearchViewModel;
import com.facebook.aura.header.view.HatchHeaderScrimKt;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.header.view.ScrimConfig;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraElevatedButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.loading.AutoLoadMoreKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.common.dextricks.RuntimeInternals;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ConversationSearchScreenKt {
    public static final float SearchFieldCornerRadius;
    public static final long SearchPillFillColor;
    public static final float SearchPillShadowBlur;
    public static final long SearchPillShadowColor;
    public static final long SearchResultScreenSeparatorColor;
    public static final long SearchResultSeparatorColor;
    public static final float SearchScrollFadeHeight;
    public static final float SearchResultContentVerticalPadding = 12.0f;
    public static final float SearchResultSeparatorHeight = 1.0f;

    /* renamed from: com.facebook.aura.conversation.search.ConversationSearchScreenKt$ConversationSearchScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $initialQuery;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, int i, int i2) {
            super(2);
            this.$initialQuery = str;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConversationSearchScreenKt.ConversationSearchScreen(this.$initialQuery, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.search.ConversationSearchScreenKt$HatchSearchResultItem$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $attributionLabel;
        public final /* synthetic */ C3TQ $contentPadding;
        public final /* synthetic */ com.facebook.aura.conversation.data.HatchSearchHit $hit;
        public final /* synthetic */ C1822Arm $metadataTextStyle;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $query;
        public final /* synthetic */ C1822Arm $snippetTextStyle;
        public final /* synthetic */ boolean $useCompactMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, com.facebook.aura.conversation.data.HatchSearchHit hatchSearchHit, String str, String str2, Function0<Unit> function0, C1822Arm c1822Arm, C1822Arm c1822Arm2, boolean z, C3TQ c3tq, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$hit = hatchSearchHit;
            this.$query = str;
            this.$attributionLabel = str2;
            this.$onClick = function0;
            this.$snippetTextStyle = c1822Arm;
            this.$metadataTextStyle = c1822Arm2;
            this.$useCompactMetadata = z;
            this.$contentPadding = c3tq;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConversationSearchScreenKt.HatchSearchResultItem(this.$modifier, this.$hit, this.$query, this.$attributionLabel, this.$onClick, this.$snippetTextStyle, this.$metadataTextStyle, this.$useCompactMetadata, this.$contentPadding, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.search.ConversationSearchScreenKt$SearchNullState$2, reason: invalid class name and case insensitive filesystem */
    public final class C113962 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113962(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            ConversationSearchScreenKt.SearchNullState(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.search.ConversationSearchScreenKt$SearchResultFooter$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $attributionLabel;
        public final /* synthetic */ C1822Arm $metadataTextStyle;
        public final /* synthetic */ String $timestampLabel;
        public final /* synthetic */ boolean $useCompactMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, C1822Arm c1822Arm, boolean z, int i) {
            super(2);
            this.$attributionLabel = str;
            this.$timestampLabel = str2;
            this.$metadataTextStyle = c1822Arm;
            this.$useCompactMetadata = z;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConversationSearchScreenKt.SearchResultFooter(this.$attributionLabel, this.$timestampLabel, this.$metadataTextStyle, this.$useCompactMetadata, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.conversation.search.ConversationSearchScreenKt$SearchResultFooter$2, reason: invalid class name and case insensitive filesystem */
    public final class C113972 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $attributionLabel;
        public final /* synthetic */ C1822Arm $metadataTextStyle;
        public final /* synthetic */ String $timestampLabel;
        public final /* synthetic */ boolean $useCompactMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113972(String str, String str2, C1822Arm c1822Arm, boolean z, int i) {
            super(2);
            this.$attributionLabel = str;
            this.$timestampLabel = str2;
            this.$metadataTextStyle = c1822Arm;
            this.$useCompactMetadata = z;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConversationSearchScreenKt.SearchResultFooter(this.$attributionLabel, this.$timestampLabel, this.$metadataTextStyle, this.$useCompactMetadata, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.conversation.search.ConversationSearchScreenKt$SearchResultFooter$4, reason: invalid class name and case insensitive filesystem */
    public final class C113984 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $attributionLabel;
        public final /* synthetic */ C1822Arm $metadataTextStyle;
        public final /* synthetic */ String $timestampLabel;
        public final /* synthetic */ boolean $useCompactMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113984(String str, String str2, C1822Arm c1822Arm, boolean z, int i) {
            super(2);
            this.$attributionLabel = str;
            this.$timestampLabel = str2;
            this.$metadataTextStyle = c1822Arm;
            this.$useCompactMetadata = z;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConversationSearchScreenKt.SearchResultFooter(this.$attributionLabel, this.$timestampLabel, this.$metadataTextStyle, this.$useCompactMetadata, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.conversation.search.ConversationSearchScreenKt$SearchStateMessage$1, reason: invalid class name and case insensitive filesystem */
    public final class C113991 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113991(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
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
            ConversationSearchScreenKt.SearchStateMessage(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.search.ConversationSearchScreenKt$boxItem$1, reason: invalid class name and case insensitive filesystem */
    public final class C114001 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ G0W<InterfaceC05151eP, BFM, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114001(G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w) {
            super(3);
            this.$content = g0w;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            C7384Etj.A0Y(anonymousClass037, 0);
            if ((i & 6) == 0) {
                i |= AnonymousClass004.A0d(bfm, anonymousClass037);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
                BRg bRgThen = C10G.A02.then(new C1Z5(null, ((C0AU) anonymousClass037).A00, "fillParentMaxHeight", 0.8f));
                Alignment alignment = C2VU.A09;
                G0W<InterfaceC05151eP, BFM, Integer, Unit> g0w = this.$content;
                InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
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
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
                AnonymousClass004.A1B(bbi, C0z7.A00, bfm, g0w, 6);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.conversation.search.ConversationSearchScreenKt$centeredItem$1, reason: invalid class name and case insensitive filesystem */
    public final class C114011 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ G0W<InterfaceC05151eP, BFM, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114011(G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w) {
            super(3);
            this.$content = g0w;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            C7384Etj.A0Y(anonymousClass037, 0);
            if ((i & 6) == 0) {
                i |= AnonymousClass004.A0d(bfm, anonymousClass037);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
                BRg bRgThen = C10G.A02.then(new C1Z5(null, ((C0AU) anonymousClass037).A00, "fillParentMaxHeight", 1.0f));
                Alignment alignment = C2VU.A09;
                G0W<InterfaceC05151eP, BFM, Integer, Unit> g0w = this.$content;
                InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
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
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
                AnonymousClass004.A1B(bbi, C0z7.A00, bfm, g0w, 6);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.conversation.search.ConversationSearchScreenKt$formatSearchSnippet$1, reason: invalid class name and case insensitive filesystem */
    public final class C114021 extends AbstractC7559F3s implements G0U<String, String> {
        public static final C114021 INSTANCE = new C114021();

        public C114021() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ String invoke(String str) {
            String str2 = str;
            C7384Etj.A0Y(str2, 0);
            return AnonymousClass002.A0l(str2);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String invoke2(String str) {
            C7384Etj.A0Y(str, 0);
            return AnonymousClass002.A0l(str);
        }
    }

    /* renamed from: com.facebook.aura.conversation.search.ConversationSearchScreenKt$formatSearchSnippet$2, reason: invalid class name and case insensitive filesystem */
    public final class C114032 extends AbstractC7559F3s implements G0U<String, Boolean> {
        public static final C114032 INSTANCE = new C114032();

        public C114032() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
        @Override // X.G0U
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(java.lang.String r1) {
            /*
                r0 = this;
                r0 = 0
                X.C7384Etj.A0Y(r1, r0)
                int r0 = r1.length()
                if (r0 <= 0) goto L13
                java.lang.String r0 = "..."
                boolean r1 = r1.equals(r0)
                r0 = 1
                if (r1 == 0) goto L14
            L13:
                r0 = 0
            L14:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.search.ConversationSearchScreenKt.C114032.invoke(java.lang.String):java.lang.Boolean");
        }
    }

    /* renamed from: com.facebook.aura.conversation.search.ConversationSearchScreenKt$topItem$1, reason: invalid class name and case insensitive filesystem */
    public final class C114041 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ G0W<InterfaceC05151eP, BFM, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114041(G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w) {
            super(3);
            this.$content = g0w;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                C1062ATq c1062ATq = C10G.A02;
                float f = AuraDimensKt.SpacingLarge;
                float f2 = AuraDimensKt.SpacingMedium;
                BRg bRgA0C = C3U4.A0C(c1062ATq, f2, f, f2, 0.0f);
                Alignment alignment = C2VU.A0C;
                G0W<InterfaceC05151eP, BFM, Integer, Unit> g0w = this.$content;
                InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0C);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
                AnonymousClass004.A1B(bbi, C0z7.A00, bfm, g0w, 6);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: SearchPillSurface-FHprtrg, reason: not valid java name */
    public static final void m502SearchPillSurfaceFHprtrg(BRg bRg, Function0<Unit> function0, String str, boolean z, long j, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        BRg bRgA05;
        BRg bRg2 = bRg;
        Function0<Unit> function02 = function0;
        String str2 = str;
        boolean z2 = z;
        long j2 = j;
        C7384Etj.A0Y(g0w, 5);
        bfm.AgG(-286024383);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z2);
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0Q(bfm, j2);
        }
        if ((i & 196608) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 74899, 74898), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                function02 = null;
            }
            String str3 = i5 == 0 ? str2 : null;
            if (i6 != 0) {
                z2 = true;
            }
            if (i7 != 0) {
                j2 = SearchPillFillColor;
            }
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = C1D8.A00(SearchFieldCornerRadius);
                bfm.Ai0(objAaT);
            }
            C1DE c1de = (C1DE) objAaT;
            if (function02 == null || (bRgA05 = C0v5.A05(BRg.A00, str3, function02, z2)) == null) {
                bRgA05 = BRg.A00;
            }
            BRg bRgThen = C11U.A04(m507searchPillSoftShadowH2RKhps(bRg2, SearchPillShadowBlur, SearchPillShadowColor), c1de, j2).then(bRgA05);
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A0B, false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
            AnonymousClass004.A1B(bbi, C0z7.A00, bfm, g0w, ((iA0d >> 12) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6);
            str2 = str3;
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new ConversationSearchScreenKt$SearchPillSurface$2(bRg2, function02, str2, z2, j2, g0w, i, i2);
        }
    }

    /* renamed from: searchResultRows-533V2PY, reason: not valid java name */
    public static final void m508searchResultRows533V2PY(C0CD c0cd, final List<com.facebook.aura.conversation.data.HatchSearchHit> list, final String str, final String str2, final String str3, final long j, final G0W<? super com.facebook.aura.conversation.data.HatchSearchHit, ? super String, ? super String, Unit> g0w, final BRg bRg) {
        C7384Etj.A0Y(c0cd, 0);
        AnonymousClass005.A11(list, str, str2, 1);
        C7384Etj.A0Y(str3, 4);
        AnonymousClass003.A10(g0w, bRg);
        final ConversationSearchScreenKt$searchResultRows$1 conversationSearchScreenKt$searchResultRows$1 = ConversationSearchScreenKt$searchResultRows$1.INSTANCE;
        c0cd.APL(conversationSearchScreenKt$searchResultRows$1 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.conversation.search.ConversationSearchScreenKt$searchResultRows-533V2PY$$inlined$itemsIndexed$default$1
            public final Object invoke(int i) {
                return AnonymousClass006.A0n(Integer.valueOf(i), list, conversationSearchScreenKt$searchResultRows$1, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.conversation.search.ConversationSearchScreenKt$searchResultRows-533V2PY$$inlined$itemsIndexed$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                list.get(AnonymousClass001.A0F(num));
                return null;
            }

            public final Object invoke(int i) {
                list.get(i);
                return null;
            }
        }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.conversation.search.ConversationSearchScreenKt$searchResultRows-533V2PY$$inlined$itemsIndexed$default$3
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                String strA0l;
                String strA0l2;
                int iA0d = (i2 & 6) == 0 ? i2 | AnonymousClass004.A0d(bfm, anonymousClass037) : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                com.facebook.aura.conversation.data.HatchSearchHit hatchSearchHit = (com.facebook.aura.conversation.data.HatchSearchHit) list.get(i);
                bfm.AgE(839122801);
                String str4 = hatchSearchHit.sessionId;
                if (str4 == null || str4.length() <= 0) {
                    str4 = null;
                }
                if (hatchSearchHit.isThread) {
                    String str5 = hatchSearchHit.title;
                    if (str5 == null || (strA0l = AnonymousClass002.A0l(str5)) == null || strA0l.length() <= 0) {
                        strA0l = str2;
                    }
                } else {
                    strA0l = str3;
                }
                String str6 = hatchSearchHit.title;
                if (str6 == null || (strA0l2 = AnonymousClass002.A0l(str6)) == null || strA0l2.length() <= 0) {
                    strA0l2 = null;
                }
                BRg bRg2 = bRg;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRg2);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                C1062ATq c1062ATq = C10G.A02;
                String str7 = str;
                boolean zA1W = AnonymousClass005.A1W(bfm, hatchSearchHit, str4, strA0l2, bfm.A65(g0w));
                Object objAaT = bfm.AaT();
                if (zA1W || objAaT == C78N.A00) {
                    objAaT = new ConversationSearchScreenKt$searchResultRows$2$1$1$1(g0w, hatchSearchHit, str4, strA0l2);
                    bfm.Ai0(objAaT);
                }
                ConversationSearchScreenKt.HatchSearchResultItem(c1062ATq, hatchSearchHit, str7, strA0l, (Function0) objAaT, null, null, false, null, bfm, 6, 480);
                if (i < AnonymousClass002.A0E(list)) {
                    bfm.AgE(1169922015);
                    C1b8.A04(bfm, C10G.A04(c1062ATq, ConversationSearchScreenKt.SearchResultSeparatorHeight), j);
                } else {
                    bfm.AgE(1170115176);
                }
                AnonymousClass003.A0q(bbi);
                BBI.A0R(bbi, false);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 2039820996, true), list.size());
    }

    public static final boolean searchResultStateItems(C0CD c0cd, String str, HatchSearchUiState hatchSearchUiState, SearchResultStatePlacement searchResultStatePlacement) {
        String str2;
        G0W<InterfaceC05151eP, BFM, Integer, Unit> g0w;
        G0W<InterfaceC05151eP, BFM, Integer, Unit> g0w2;
        String str3;
        C7384Etj.A0Y(c0cd, 0);
        AnonymousClass005.A11(str, hatchSearchUiState, searchResultStatePlacement, 1);
        if (!hatchSearchUiState.isLoading) {
            if (!hatchSearchUiState.isError) {
                int length = str.length();
                if (length > 0) {
                    if (hatchSearchUiState.results.isEmpty()) {
                        g0w2 = ComposableSingletons$ConversationSearchScreenKt.lambda$1361883973;
                        str3 = "no-results";
                        if (searchResultStatePlacement != SearchResultStatePlacement.CENTERED) {
                            boxItem(c0cd, "no-results", g0w2);
                            return true;
                        }
                    }
                } else if (length == 0) {
                    str2 = "empty-search";
                    if (searchResultStatePlacement != SearchResultStatePlacement.CENTERED) {
                        boxItem(c0cd, "empty-search", ComposableSingletons$ConversationSearchScreenKt.lambda$1937945535);
                        return true;
                    }
                    g0w = ComposableSingletons$ConversationSearchScreenKt.lambda$1268436023;
                }
                return false;
            }
            g0w2 = ComposableSingletons$ConversationSearchScreenKt.lambda$783117828;
            str3 = "error";
            if (searchResultStatePlacement != SearchResultStatePlacement.CENTERED) {
                topItem(c0cd, "error", g0w2);
                return true;
            }
            centeredItem(c0cd, str3, g0w2);
            return true;
        }
        SearchResultStatePlacement searchResultStatePlacement2 = SearchResultStatePlacement.CENTERED;
        str2 = AuraButtonKt.LOADING_TAG;
        if (searchResultStatePlacement != searchResultStatePlacement2) {
            topItem(c0cd, AuraButtonKt.LOADING_TAG, ComposableSingletons$ConversationSearchScreenKt.lambda$1826811324);
            return true;
        }
        g0w = ComposableSingletons$ConversationSearchScreenKt.f26lambda$466699138;
        centeredItem(c0cd, str2, g0w);
        return true;
    }

    static {
        long j = B6A.A08;
        SearchResultSeparatorColor = HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.15f);
        long j2 = B6A.A01;
        SearchResultScreenSeparatorColor = HxS.A04(HDi.A0O[(int) (j2 & 63)], B6A.A03(j2), B6A.A02(j2), B6A.A01(j2), 0.1f);
        SearchScrollFadeHeight = 32.0f;
        SearchFieldCornerRadius = 26.0f;
        SearchPillFillColor = HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.25f);
        SearchPillShadowColor = HxS.A04(HDi.A0O[(int) (j2 & 63)], B6A.A03(j2), B6A.A02(j2), B6A.A01(j2), 0.06f);
        SearchPillShadowBlur = 16.0f;
    }

    public static final void ConversationSearchScreen(String str, BFM bfm, int i, int i2) {
        BBI bbiA0M;
        String str2 = str;
        bfm.AgG(-1909147790);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str2) : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                str2 = null;
            }
            AbstractC3358CGz abstractC3358CGzA0g = AnonymousClass002.A0g(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            HatchConversationViewModel.Factory factory = new HatchConversationViewModel.Factory(AnonymousClass001.A0I(AnonymousClass002.A0H(bfm)), abstractC3358CGzA0g, "primary_session_id", false, false);
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            HatchConversationViewModel hatchConversationViewModel = (HatchConversationViewModel) AnonymousClass003.A0Y(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), HatchConversationViewModel.class, "primary_session_id");
            HatchSearchViewModel.Factory factory2 = new HatchSearchViewModel.Factory(abstractC3358CGzA0g);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            HatchSearchViewModel hatchSearchViewModel = (HatchSearchViewModel) AnonymousClass003.A0Y(factory2, bodA00, AnonymousClass005.A0Y(bodA00), HatchSearchViewModel.class, null);
            C1BO c1boA02 = C2CK.A02(bfm, hatchSearchViewModel.uiState);
            AHD<com.facebook.aura.conversation.data.HatchSearchHit> ahd = ((HatchSearchUiState) c1boA02.getValue()).results;
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120895);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12086b);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                String str3 = str2 == null ? "" : str2;
                if (str3.length() == 0) {
                    str3 = hatchSearchViewModel.uiState.getValue().query;
                }
                objAaT = AnonymousClass004.A11(bfm, str3);
            }
            MutableState mutableState = (MutableState) objAaT;
            boolean zA1T = AnonymousClass001.A1T(bfm, hatchSearchViewModel, AnonymousClass004.A1F(iA0d));
            Object objAaT2 = bfm.AaT();
            if (zA1T || objAaT2 == obj) {
                objAaT2 = new ConversationSearchScreenKt$ConversationSearchScreen$1$1(str2, hatchSearchViewModel);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, str2);
            LazyListState lazyListStateRememberSearchResultsListState = SearchResultsListStateKt.rememberSearchResultsListState(hatchSearchViewModel, SearchResultsListStateKt.SEARCH_SURFACE_FULL_SCREEN, MutableState.A05(mutableState), bfm, HatchSearchViewModel.$stable | 48);
            boolean zA1M = AnonymousClass003.A1M(bfm, hatchSearchViewModel, auraNavigatorA0b);
            Object objAaT3 = bfm.AaT();
            if (zA1M || objAaT3 == obj) {
                objAaT3 = new ConversationSearchScreenKt$ConversationSearchScreen$onDismiss$1$1(hatchSearchViewModel, auraNavigatorA0b);
                bfm.Ai0(objAaT3);
            }
            Function0 function0 = (Function0) objAaT3;
            B81.A00(false, function0, bfm, 0, 1);
            if (((HatchSearchUiState) c1boA02.getValue()).hasMore) {
                boolean zA1Z = AnonymousClass001.A1Z(hatchSearchViewModel, bfm, -1462350268);
                Object objAaT4 = bfm.AaT();
                if (zA1Z || objAaT4 == obj) {
                    objAaT4 = new ConversationSearchScreenKt$ConversationSearchScreen$2$1(hatchSearchViewModel);
                    bfm.Ai0(objAaT4);
                }
                AutoLoadMoreKt.AutoLoadMore(lazyListStateRememberSearchResultsListState, 0, (Function0<Unit>) objAaT4, bfm, 0, 1);
                bbiA0M = (BBI) bfm;
                BBI.A0R(bbiA0M, false);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, -1462277232);
            }
            long j = SearchResultScreenSeparatorColor;
            float fA00 = C06G.A00(bfm);
            float f = AuraDimensKt.SpacingMedium;
            float fM998getHatchPageHeaderHeightkHDZbjc = HatchPageScreenKt.m998getHatchPageHeaderHeightkHDZbjc(f, bfm, 0, 0);
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A01;
            BRg bRgA01 = C1b8.A01(c1062ATq, auraColorsA0c.background);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            long j2 = bbiA0M.A06;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0c, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA012, g0u);
            BRg bRgA00 = AbstractC1754Apr.A00(c1062ATq);
            boolean zA1T2 = AnonymousClass004.A1T(bfm, auraNavigatorA0b, hatchConversationViewModel, AnonymousClass005.A1W(bfm, ahd, strA01, strA012, AnonymousClass001.A1R(bfm, c1boA02, bfm.A62(fM998getHatchPageHeaderHeightkHDZbjc)) | bfm.A62(fA00)));
            Object objAaT5 = bfm.AaT();
            if (zA1T2 || objAaT5 == obj) {
                objAaT5 = new ConversationSearchScreenKt$ConversationSearchScreen$3$1$1(fA00, ahd, strA01, strA012, j, fM998getHatchPageHeaderHeightkHDZbjc, mutableState, c1boA02, auraNavigatorA0b, hatchConversationViewModel);
                bfm.Ai0(objAaT5);
            }
            C1YY.A01(null, null, null, null, lazyListStateRememberSearchResultsListState, bfm, null, bRgA00, (G0U) objAaT5, 0, 508, false, false);
            m503SearchScrollFadesBazWgJc(lazyListStateRememberSearchResultsListState, auraColorsA0c.background, fM998getHatchPageHeaderHeightkHDZbjc, null, bfm, 0, 8);
            HatchHeaderScrimKt.m995HatchHeaderScrimDzVHIIc(new ScrimConfig.Heavy(auraColorsA0c.background), 60.0f + f, null, 0.0f, bfm, 0, 12);
            BRg bRgA02 = AbstractC1754Apr.A02(C10G.A02);
            float f2 = AuraDimensKt.SpacingSmall;
            BRg bRgA0B = C3U4.A0B(bRgA02, f2, f2);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            int iA0D = AnonymousClass001.A0D(bbiA0M);
            AKQ akqA042 = BBI.A04(bbiA0M);
            BRg bRgA013 = AxM.A01(bfm, bRgA0B);
            AnonymousClass005.A0n(bfm, bbiA0M, function02);
            BPg.A02(bfm, interfaceC1380AiAA0W, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA013, g0vA0u);
            C90m c90m = C90m.A00;
            AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(BOf.A00(bfm, R.drawable.aura_nav_close_20, 0), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e81), function0, null, false, 0.0f, null, null, null, false, false, bfm, AVy.$stable, 0, 2040);
            C01N.A09(bfm, bs0, f2);
            String strA05 = MutableState.A05(mutableState);
            boolean zA67 = bfm.A67(hatchSearchViewModel);
            Object objAaT6 = bfm.AaT();
            if (zA67 || objAaT6 == obj) {
                objAaT6 = new ConversationSearchScreenKt$ConversationSearchScreen$3$2$1$1(hatchSearchViewModel, mutableState);
                bfm.Ai0(objAaT6);
            }
            m504SearchTextFieldOqVHbNc(strA05, (G0U) objAaT6, AnonymousClass001.A0O(c90m, bs0, true), false, false, null, false, null, null, null, null, null, null, 0L, bfm, 0, 0, 16376);
            BBI.A0R(bbiA0M, true);
            BBI.A0R(bbiA0M, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(str2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchSearchResultItem(X.BRg r38, com.facebook.aura.conversation.data.HatchSearchHit r39, java.lang.String r40, java.lang.String r41, kotlin.jvm.functions.Function0<kotlin.Unit> r42, X.C1822Arm r43, X.C1822Arm r44, boolean r45, X.C3TQ r46, X.BFM r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.search.ConversationSearchScreenKt.HatchSearchResultItem(X.BRg, com.facebook.aura.conversation.data.HatchSearchHit, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, X.Arm, X.Arm, boolean, X.3TQ, X.BFM, int, int):void");
    }

    /* renamed from: SearchScrollFades-BazWgJc, reason: not valid java name */
    public static final void m503SearchScrollFadesBazWgJc(LazyListState lazyListState, long j, float f, BRg bRg, BFM bfm, int i, int i2) {
        float f2 = f;
        BRg bRgA0Q = bRg;
        bfm.AgG(-287217269);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, lazyListState) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0N(bfm, j);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A06(bfm, f2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                f2 = 0.0f;
            }
            if (i4 != 0) {
                bRgA0Q = BRg.A00;
            }
            int i5 = iA0d & 14;
            boolean zA1Q = AnonymousClass002.A1Q(i5, 4);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = AnonymousClass003.A0R(bfm, new ConversationSearchScreenKt$SearchScrollFades$showTopFade$2$1(lazyListState));
            }
            C1BO c1bo = (C1BO) objAaT;
            boolean zA1Q2 = AnonymousClass002.A1Q(i5, 4);
            Object objAaT2 = bfm.AaT();
            if (zA1Q2 || objAaT2 == C78N.A00) {
                objAaT2 = AnonymousClass003.A0R(bfm, new ConversationSearchScreenKt$SearchScrollFades$showBottomFade$2$1(lazyListState));
            }
            C1BO c1bo2 = (C1BO) objAaT2;
            BRg bRgA0T = AnonymousClass001.A0T(bRgA0Q);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0T);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            C0z7 c0z7 = C0z7.A00;
            if (C1BO.A0F(c1bo)) {
                bfm.AgE(1931826477);
                C1b8.A05(bfm, C10G.A04(AnonymousClass001.A0R(C3U4.A0C(c0z7.A4C(C2VU.A0C, BRg.A00), 0.0f, f2, 0.0f, 0.0f)), SearchScrollFadeHeight), C1EQ.A01(AnonymousClass004.A17(new B6A(j), B6A.A06), 0.0f, Float.POSITIVE_INFINITY));
            } else {
                bfm.AgE(1932137841);
            }
            BBI.A0R(bbi, false);
            if (C1BO.A0F(c1bo2)) {
                bfm.AgE(1932171445);
                C1EQ.A05(bfm, C10G.A04(AnonymousClass007.A0G(c0z7, BRg.A00), SearchScrollFadeHeight), new B6A(B6A.A06), new B6A(j));
            } else {
                bfm.AgE(1932444369);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new ConversationSearchScreenKt$SearchScrollFades$2(lazyListState, j, f2, bRgA0Q, i, i2);
        }
    }

    public static final void SearchStateMessage(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(609977812);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRg2, C06G.A08(bfm), C06G.A0T(bfm), null, null, C1YL.A00(), false, 0, 0, 0, null, null, null, bfm, iA0d & 126, 0, 16304);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C113991(str, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    /* renamed from: SearchTextField-OqVHbNc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m504SearchTextFieldOqVHbNc(java.lang.String r48, X.G0U<? super java.lang.String, kotlin.Unit> r49, X.BRg r50, boolean r51, boolean r52, kotlin.jvm.functions.Function0<kotlin.Unit> r53, boolean r54, X.C1822Arm r55, java.lang.String r56, java.lang.String r57, kotlin.jvm.functions.Function0<kotlin.Unit> r58, kotlin.jvm.functions.Function0<kotlin.Unit> r59, java.lang.Integer r60, long r61, X.BFM r63, int r64, int r65, int r66) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.search.ConversationSearchScreenKt.m504SearchTextFieldOqVHbNc(java.lang.String, X.G0U, X.BRg, boolean, boolean, kotlin.jvm.functions.Function0, boolean, X.Arm, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, java.lang.Integer, long, X.BFM, int, int, int):void");
    }

    public static final void boxItem(C0CD c0cd, String str, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w) {
        c0cd.APJ(str, null, AnonymousClass001.A0M(new C114001(g0w), -1645317838));
    }

    public static final void centeredItem(C0CD c0cd, String str, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w) {
        c0cd.APJ(str, null, AnonymousClass001.A0M(new C114011(g0w), -665530857));
    }

    public static final String formatSearchSnippet(String str, String str2) {
        String strTruncateToMatch = truncateToMatch(str, str2, 20, 60);
        C7384Etj.A0Y(strTruncateToMatch, 0);
        return new C06827l3("\\s+").A03(A6B.A01(InviteCodeScratcherKt.CODE_SEPARATOR, A6B.A03(C114032.INSTANCE, A6B.A08(C114021.INSTANCE, new C8iN(strTruncateToMatch, 1)))), InviteCodeScratcherKt.CODE_SEPARATOR);
    }

    public static final String formatSearchTimestamp(long j, String str, String str2, boolean z) {
        if (j == 0) {
            return "";
        }
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
            return str;
        }
        calendar.add(6, -1);
        if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
            return str2;
        }
        String str3 = new SimpleDateFormat(calendar.get(1) == calendar2.get(1) ? z ? "MMM d" : "M/d" : "M/d/yy", Locale.getDefault()).format(new Date(j));
        C7384Etj.A0U(str3);
        return str3;
    }

    /* renamed from: searchPillSoftShadow-H2RKhps, reason: not valid java name */
    public static final BRg m507searchPillSoftShadowH2RKhps(BRg bRg, float f, long j) {
        return AEk.A02(bRg, new ConversationSearchScreenKt$searchPillSoftShadow$1(f, j));
    }

    /* renamed from: searchResultRows-533V2PY$default, reason: not valid java name */
    public static /* synthetic */ void m509searchResultRows533V2PY$default(C0CD c0cd, List list, String str, String str2, String str3, long j, G0W g0w, BRg bRg, int i, Object obj) {
        if ((i & 64) != 0) {
            bRg = C10G.A02;
        }
        m508searchResultRows533V2PY(c0cd, list, str, str2, str3, j, g0w, bRg);
    }

    public static /* synthetic */ boolean searchResultStateItems$default(C0CD c0cd, String str, HatchSearchUiState hatchSearchUiState, SearchResultStatePlacement searchResultStatePlacement, int i, Object obj) {
        if ((i & 4) != 0) {
            searchResultStatePlacement = SearchResultStatePlacement.FULL_SCREEN;
        }
        return searchResultStateItems(c0cd, str, hatchSearchUiState, searchResultStatePlacement);
    }

    public static final void topItem(C0CD c0cd, String str, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w) {
        c0cd.APJ(str, null, AnonymousClass001.A0M(new C114041(g0w), 1601331304));
    }

    public static /* synthetic */ String truncateToMatch$default(String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 20;
        }
        if ((i3 & 8) != 0) {
            i2 = 60;
        }
        return truncateToMatch(str, str2, i, i2);
    }

    public static final void SearchNullState(BFM bfm, int i) {
        bfm.AgG(-1088178606);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            C3TH c3th = C2VU.A00;
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass002.A0V(bfm, c3th);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bs0);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0V, akqA04, bRgA01, iA0J);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.ic_magnifying_glass, 0), AuraIconSize.LARGE, null, C06G.A08(bfm), null, bfm, AnonymousClass001.A03(), 41);
            C01N.A05(bfm, bs0);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e86), null, C06G.A08(bfm), C06G.A0T(bfm), null, null, C1YL.A00(), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C113962(i);
        }
    }

    public static final void SearchResultFooter(String str, String str2, C1822Arm c1822Arm, boolean z, BFM bfm, int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c113984;
        BBI bbiA0M;
        String strA0w;
        bfm.AgG(1371942084);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, c1822Arm);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if ((str == null || C7BY.A0j(str)) && C7BY.A0j(str2)) {
                bBbAAc = bfm.AAc();
                if (bBbAAc == null) {
                    return;
                } else {
                    c113984 = new AnonymousClass1(str, str2, c1822Arm, z, i);
                }
            } else {
                AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
                AuraTypography auraTypographyA0f = AnonymousClass002.A0f(bfm);
                if (z) {
                    bfm.AgE(618191776);
                    if (C7BY.A0j(str2)) {
                        bbiA0M = AnonymousClass002.A0M(bfm, -118602835);
                        strA0w = str == null ? "" : str;
                    } else if (str == null || C7BY.A0j(str)) {
                        bbiA0M = AnonymousClass002.A0M(bfm, -118600910);
                        strA0w = str2;
                    } else {
                        bfm.AgE(-118598985);
                        strA0w = AnonymousClass006.A0w(bfm, str2, str, R.string._name_removed__res_0x7f120e87);
                        bbiA0M = (BBI) bfm;
                        BBI.A0R(bbiA0M, false);
                    }
                    AuraTextKt.m2639AuraTextUY9GdpU(strA0w, C3U4.A04(C10G.A02, 8.0f), auraColorsA0c.primaryText, c1822Arm == null ? auraTypographyA0f.subheadlineMedium : c1822Arm, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306416, 6, 14832);
                    bBbAAc = AnonymousClass001.A0L(bfm, bbiA0M);
                    if (bBbAAc == null) {
                        return;
                    } else {
                        c113984 = new C113972(str, str2, c1822Arm, z, i);
                    }
                } else {
                    BBI bbiA0M2 = AnonymousClass002.A0M(bfm, 618835646);
                    BS0 bs0 = BRg.A00;
                    BRg bRgA0C = C3U4.A0C(C10G.A02, 0.0f, 12.0f, 0.0f, 0.0f);
                    InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
                    int iA0J = AnonymousClass003.A0J(bbiA0M2);
                    AKQ akqA04 = BBI.A04(bbiA0M2);
                    BRg bRgA01 = AxM.A01(bfm, bRgA0C);
                    Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                    if (bbiA0M2.A0V == null) {
                        C00x.A00();
                        throw F60.createAndThrow();
                    }
                    AnonymousClass005.A0n(bfm, bbiA0M2, function0);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0J);
                    C90m c90m = C90m.A00;
                    if (str == null || C7BY.A0j(str)) {
                        bfm.AgE(-423171378);
                        C01N.A07(bfm, AnonymousClass001.A0O(c90m, bs0, true));
                    } else {
                        bfm.AgE(-423719024);
                        AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.horizontal_lines_speech_bubble_outline, 0), AuraIconSize.TINY, null, auraColorsA0c.primaryText, null, bfm, AnonymousClass001.A03(), 41);
                        C01N.A09(bfm, bs0, AuraDimensKt.SpacingMicroPlusNano);
                        AuraTextKt.m2639AuraTextUY9GdpU(str, C3U4.A0C(AnonymousClass001.A0O(c90m, bs0, true), 0.0f, 0.0f, AuraDimensKt.SpacingSmall, 0.0f), auraColorsA0c.primaryText, c1822Arm == null ? auraTypographyA0f.subheadlineMedium : c1822Arm, null, null, null, false, 0, 1, 2, null, null, null, bfm, (iA0d & 14) | 805306368, 6, 14832);
                    }
                    BBI.A0R(bbiA0M2, false);
                    if (C7BY.A0j(str2)) {
                        bfm.AgE(-422844638);
                    } else {
                        bfm.AgE(-423068737);
                        AuraTextKt.m2639AuraTextUY9GdpU(str2, null, auraColorsA0c.tertiaryText, c1822Arm == null ? auraTypographyA0f.subheadlineRegular : c1822Arm, null, null, null, false, 0, 1, 2, null, null, null, bfm, ((iA0d >> 3) & 14) | 805306368, 6, 14834);
                    }
                    BBI.A0R(bbiA0M2, false);
                    BBI.A0R(bbiA0M2, true);
                }
            }
            bBbAAc.A06 = c113984;
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c113984 = new C113984(str, str2, c1822Arm, z, i);
            bBbAAc.A06 = c113984;
        }
    }

    public static final /* synthetic */ HatchSearchUiState access$ConversationSearchScreen$lambda$0(C1BO c1bo) {
        return (HatchSearchUiState) c1bo.getValue();
    }

    public static final /* synthetic */ C1805ArO access$SearchTextField_OqVHbNc$lambda$9(MutableState mutableState) {
        return (C1805ArO) mutableState.getValue();
    }

    /* renamed from: highlightMatches-bw27NRU, reason: not valid java name */
    public static final ApQ m506highlightMatchesbw27NRU(String str, long j, String str2) {
        C1731ApS c1731ApSA0W;
        int i = 0;
        if (C7BY.A0j(str2)) {
            c1731ApSA0W = AnonymousClass006.A0X(str);
        } else {
            List listA05 = new C06827l3("\\s+").A05(AnonymousClass002.A0l(str2));
            ArrayList arrayList = new ArrayList();
            Iterator it = listA05.iterator();
            while (it.hasNext()) {
                AnonymousClass007.A19(arrayList, it);
            }
            ArrayList arrayListA0i = AnonymousClass003.A0i(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayListA0i.add(AnonymousClass001.A0u(AnonymousClass005.A0j(it2)));
            }
            C06827l3 c06827l3 = new C06827l3(AbstractC0878AGe.A0L("|", "", "", arrayListA0i, ConversationSearchScreenKt$highlightMatches$pattern$1.INSTANCE), EnumC06837l4.A03);
            c1731ApSA0W = AnonymousClass006.A0W();
            Iterator it3 = C06827l3.A00(str, c06827l3).iterator();
            while (it3.hasNext()) {
                C1Lu c1Lu = (C1Lu) it3.next();
                AnonymousClass005.A0s(c1731ApSA0W, str, i, c1Lu.AJM().A00);
                C1736ApY c1736ApY = C1736ApY.A01;
                long j2 = C1809ArT.A01;
                c1731ApSA0W.A02(new C1824Aro(null, null, null, null, null, c1736ApY, null, null, null, null, null, j, j2, j2, B6A.A07));
                String strGroup = ((C06847l8) c1Lu).A01.group();
                C7384Etj.A0U(strGroup);
                c1731ApSA0W.A0E(strGroup);
                c1731ApSA0W.A05();
                i = c1Lu.AJM().A01 + 1;
            }
            if (i < str.length()) {
                c1731ApSA0W.A0E(str.substring(i));
            }
        }
        return c1731ApSA0W.A04();
    }

    public static final String truncateToMatch(String str, String str2, int i, int i2) {
        C06847l8 c06847l8A01;
        ADq aDqAJM;
        int i3;
        if (C7BY.A0j(str2)) {
            return str;
        }
        List listA05 = new C06827l3("\\s+").A05(AnonymousClass002.A0l(str2));
        ArrayList arrayList = new ArrayList();
        Iterator it = listA05.iterator();
        while (it.hasNext()) {
            AnonymousClass007.A19(arrayList, it);
        }
        if (arrayList.isEmpty() || (c06847l8A01 = C06827l3.A01(str, new C06827l3(AbstractC0878AGe.A0L("|", "", "", arrayList, ConversationSearchScreenKt$truncateToMatch$pattern$1.INSTANCE), EnumC06837l4.A03))) == null || (aDqAJM = c06847l8A01.AJM()) == null || (i3 = aDqAJM.A00) <= i) {
            return str;
        }
        int i4 = i3 - i;
        int length = str.length();
        int i5 = length - i2;
        if (i5 < 0) {
            i5 = 0;
        }
        int iMin = Math.min(i4, i5);
        if (iMin <= 0) {
            return str;
        }
        while (iMin < length && !C7LE.A00(str.charAt(iMin))) {
            iMin++;
        }
        while (iMin < length && C7LE.A00(str.charAt(iMin))) {
            iMin++;
        }
        return iMin < length ? FGI.A0M("...", str.substring(iMin)) : str;
    }
}
