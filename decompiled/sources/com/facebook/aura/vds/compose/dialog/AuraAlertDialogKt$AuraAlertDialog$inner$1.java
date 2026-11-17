package com.facebook.aura.vds.compose.dialog;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.B1V;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraAlertDialogKt$AuraAlertDialog$inner$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ AHD<String> $bodyList;
    public final /* synthetic */ G0U<String, Unit> $bodyTextOnUrlClick;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $buttons;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
    public final /* synthetic */ boolean $defaultTheme;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $illustration;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ String $title;

    /* renamed from: com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt$AuraAlertDialog$inner$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ AHD<String> $bodyList;
        public final /* synthetic */ G0U<String, Unit> $bodyTextOnUrlClick;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $buttons;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $illustration;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, AHD<String> ahd, G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2, G0V<? super BFM, ? super Integer, Unit> g0v3, G0U<? super String, Unit> g0u, BRg bRg) {
            super(2);
            this.$title = str;
            this.$bodyList = ahd;
            this.$illustration = g0v;
            this.$content = g0v2;
            this.$buttons = g0v3;
            this.$bodyTextOnUrlClick = g0u;
            this.$modifier = bRg;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AuraAlertDialogKt.InnerAuraAlertDialog(this.$title, this.$bodyList, this.$illustration, this.$content, this.$buttons, this.$bodyTextOnUrlClick, this.$modifier, bfm, 0, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraAlertDialogKt$AuraAlertDialog$inner$1(boolean z, String str, AHD<String> ahd, G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2, G0V<? super BFM, ? super Integer, Unit> g0v3, G0U<? super String, Unit> g0u, BRg bRg) {
        super(2);
        this.$defaultTheme = z;
        this.$title = str;
        this.$bodyList = ahd;
        this.$illustration = g0v;
        this.$content = g0v2;
        this.$buttons = g0v3;
        this.$bodyTextOnUrlClick = g0u;
        this.$modifier = bRg;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            AuraAlertDialogKt.DialogThemeWrapper(this.$defaultTheme, null, B1V.A00(bfm, new AnonymousClass1(this.$title, this.$bodyList, this.$illustration, this.$content, this.$buttons, this.$bodyTextOnUrlClick, this.$modifier), 104452311), bfm, 384, 2);
        } else {
            bfm.Afo();
        }
    }
}
