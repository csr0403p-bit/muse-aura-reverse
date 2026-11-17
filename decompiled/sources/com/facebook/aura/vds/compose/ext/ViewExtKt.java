package com.facebook.aura.vds.compose.ext;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.Ap7;
import X.B1U;
import X.B1V;
import X.BBb;
import X.BDa;
import X.BFM;
import X.C7384Etj;
import X.G0V;
import X.InterfaceC1725ApE;
import android.content.Context;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.facebook.aura.vds.compose.perf.AuraTraceTag;
import com.facebook.aura.vds.compose.perf.LocalRootContextNameKt;
import com.facebook.aura.vds.compose.theme.root.AuraRootKt;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class ViewExtKt {

    /* renamed from: com.facebook.aura.vds.compose.ext.ViewExtKt$FwaRootContent$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0V<? super BFM, ? super Integer, Unit> g0v) {
            super(2);
            this.$content = g0v;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                AnonymousClass001.A1H(bfm, this.$content, 0);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.ext.ViewExtKt$FwaRootContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ AuraThemeMode $modeOverride;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AuraThemeMode auraThemeMode, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$modeOverride = auraThemeMode;
            this.$content = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ViewExtKt.FwaRootContent(this.$modeOverride, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.ext.ViewExtKt$WithTraceTag$1, reason: invalid class name and case insensitive filesystem */
    public final class C142821 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ String $traceTag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C142821(String str, G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
            super(2);
            this.$traceTag = str;
            this.$content = g0v;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            ViewExtKt.WithTraceTag(this.$traceTag, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.ext.ViewExtKt$auraComposeView$1, reason: invalid class name and case insensitive filesystem */
    public final class C142831 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ String $traceTag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C142831(String str, G0V<? super BFM, ? super Integer, Unit> g0v) {
            super(2);
            this.$traceTag = str;
            this.$content = g0v;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                ViewExtKt.WithTraceTag(this.$traceTag, this.$content, bfm, 0);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.ext.ViewExtKt$auraSetContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C142842 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ AuraThemeMode $modeOverride;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C142842(AuraThemeMode auraThemeMode, G0V<? super BFM, ? super Integer, Unit> g0v) {
            super(2);
            this.$modeOverride = auraThemeMode;
            this.$content = g0v;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                ViewExtKt.FwaRootContent(this.$modeOverride, this.$content, bfm, 0, 0);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void FwaRootContent(AuraThemeMode auraThemeMode, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        AuraThemeMode auraThemeMode2 = auraThemeMode;
        C7384Etj.A0Y(g0v, 1);
        bfm.AgG(-303002991);
        int i3 = i2 & 1;
        int iA0D = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0D(bfm, AnonymousClass003.A0K(auraThemeMode)) | i : i;
        if ((i & 48) == 0) {
            iA0D |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0D), bfm, iA0D)) {
            if (i3 != 0) {
                auraThemeMode2 = AuraThemeMode.DEFAULT;
            }
            AuraRootKt.AuraRoot(auraThemeMode2, null, B1V.A00(bfm, new AnonymousClass1(g0v), 282061701), bfm, (iA0D & 14) | 384, 2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(auraThemeMode2, g0v, i, i2);
        }
    }

    public static final void WithTraceTag(String str, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        C7384Etj.A0Y(g0v, 1);
        bfm.AgG(-435184073);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (str != null) {
                bfm.AgE(1937643611);
                LocalRootContextNameKt.WithRootContextName(str, g0v, bfm, iA0d & 126);
            } else {
                bfm.AgE(1937696280);
                AnonymousClass003.A13(bfm, g0v, iA0d >> 3);
            }
            AnonymousClass002.A19(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142821(str, g0v, i);
        }
    }

    public static final String getTraceTag(Fragment fragment) {
        C7384Etj.A0Y(fragment, 0);
        Bundle bundle = fragment.mArguments;
        if (bundle != null) {
            return bundle.getString(AuraTraceTag.FRAGMENT_ARGUMENT_NAME);
        }
        return null;
    }

    public static /* synthetic */ ComposeView auraComposeView$default(Context context, AuraThemeMode auraThemeMode, InterfaceC1725ApE interfaceC1725ApE, String str, G0V g0v, int i, Object obj) {
        if ((i & 2) != 0) {
            auraThemeMode = AuraThemeMode.DEFAULT;
        }
        if ((i & 4) != 0) {
            interfaceC1725ApE = BDa.A00;
        }
        return auraComposeView(context, auraThemeMode, interfaceC1725ApE, AnonymousClass006.A0u(i, str), g0v);
    }

    public static /* synthetic */ void auraSetContent$default(ComponentActivity componentActivity, AuraThemeMode auraThemeMode, G0V g0v, int i, Object obj) {
        if ((i & 1) != 0) {
            auraThemeMode = AuraThemeMode.DEFAULT;
        }
        auraSetContent(componentActivity, auraThemeMode, g0v);
    }

    public static /* synthetic */ ComposeView auraSetContentInverted$default(ComposeView composeView, InterfaceC1725ApE interfaceC1725ApE, G0V g0v, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC1725ApE = BDa.A00;
        }
        auraSetContentInverted(composeView, interfaceC1725ApE, g0v);
        return composeView;
    }

    public static final ComposeView auraComposeView(Fragment fragment, AuraThemeMode auraThemeMode, InterfaceC1725ApE interfaceC1725ApE, G0V<? super BFM, ? super Integer, Unit> g0v) {
        AnonymousClass005.A14(fragment, auraThemeMode, interfaceC1725ApE, g0v);
        Context contextRequireContext = fragment.requireContext();
        C7384Etj.A0U(contextRequireContext);
        return auraComposeView(contextRequireContext, auraThemeMode, interfaceC1725ApE, getTraceTag(fragment), g0v);
    }

    public static final void auraSetContent(ComponentActivity componentActivity, AuraThemeMode auraThemeMode, G0V<? super BFM, ? super Integer, Unit> g0v) {
        Ap7.A00(componentActivity, B1U.A03(new C142842(auraThemeMode, g0v), 1161670657, AnonymousClass005.A1Z(componentActivity, auraThemeMode, g0v)));
    }

    public static final ComposeView auraSetContentInverted(ComposeView composeView, InterfaceC1725ApE interfaceC1725ApE, G0V<? super BFM, ? super Integer, Unit> g0v) {
        boolean zA1Z = AnonymousClass005.A1Z(composeView, interfaceC1725ApE, g0v);
        composeView.setViewCompositionStrategy(interfaceC1725ApE);
        composeView.setContent(B1U.A03(new ViewExtKt$auraSetContentInverted$1$1(g0v), 1639532276, zA1Z));
        return composeView;
    }

    public static final ComposeView auraComposeView(Context context, AuraThemeMode auraThemeMode, InterfaceC1725ApE interfaceC1725ApE, String str, G0V<? super BFM, ? super Integer, Unit> g0v) {
        boolean zA1Z = AnonymousClass005.A1Z(context, auraThemeMode, interfaceC1725ApE);
        C7384Etj.A0Y(g0v, 4);
        ComposeView composeView = new ComposeView(context);
        auraSetContent(composeView, auraThemeMode, interfaceC1725ApE, B1U.A03(new C142831(str, g0v), 1909141028, zA1Z));
        return composeView;
    }

    public static /* synthetic */ ComposeView auraComposeView$default(Fragment fragment, AuraThemeMode auraThemeMode, InterfaceC1725ApE interfaceC1725ApE, G0V g0v, int i, Object obj) {
        if ((i & 2) != 0) {
            auraThemeMode = AuraThemeMode.DEFAULT;
        }
        if ((i & 4) != 0) {
            interfaceC1725ApE = BDa.A00;
        }
        return auraComposeView(fragment, auraThemeMode, interfaceC1725ApE, g0v);
    }

    public static final ComposeView auraSetContent(ComposeView composeView, AuraThemeMode auraThemeMode, InterfaceC1725ApE interfaceC1725ApE, G0V<? super BFM, ? super Integer, Unit> g0v) {
        C7384Etj.A0Y(composeView, 0);
        AnonymousClass005.A11(auraThemeMode, interfaceC1725ApE, g0v, 1);
        composeView.setViewCompositionStrategy(interfaceC1725ApE);
        composeView.setContent(B1U.A03(new ViewExtKt$auraSetContent$1$1(auraThemeMode, g0v), -1561844676, true));
        return composeView;
    }

    public static /* synthetic */ ComposeView auraSetContent$default(ComposeView composeView, AuraThemeMode auraThemeMode, InterfaceC1725ApE interfaceC1725ApE, G0V g0v, int i, Object obj) {
        if ((i & 1) != 0) {
            auraThemeMode = AuraThemeMode.DEFAULT;
        }
        if ((i & 2) != 0) {
            interfaceC1725ApE = BDa.A00;
        }
        auraSetContent(composeView, auraThemeMode, interfaceC1725ApE, g0v);
        return composeView;
    }
}
