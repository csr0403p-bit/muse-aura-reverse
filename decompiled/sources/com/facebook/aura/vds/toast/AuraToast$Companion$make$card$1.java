package com.facebook.aura.vds.toast;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.B1V;
import X.B6A;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C3U4;
import X.C78N;
import X.G0V;
import X.Hm3;
import android.view.View;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt;
import com.facebook.aura.vds.compose.toast.AuraToastContentKt;
import com.facebook.aura.vds.compose.toast.AuraToastOption;
import com.facebook.aura.vds.compose.toast.AuraToastSwipeToDismissBackgroundProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraToast$Companion$make$card$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ boolean $dismissOnClick;
    public final /* synthetic */ Integer $leadingIcon;
    public final /* synthetic */ AuraIconSize $leadingIconSize;
    public final /* synthetic */ B6A $leadingIconTint;
    public final /* synthetic */ View.OnClickListener $onClickListener;
    public final /* synthetic */ Hm3 $snackbar;
    public final /* synthetic */ String $subtitle;
    public final /* synthetic */ String $title;
    public final /* synthetic */ AuraToastOption $type;

    /* renamed from: com.facebook.aura.vds.toast.AuraToast$Companion$make$card$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ boolean $dismissOnClick;
        public final /* synthetic */ Integer $leadingIcon;
        public final /* synthetic */ AuraIconSize $leadingIconSize;
        public final /* synthetic */ B6A $leadingIconTint;
        public final /* synthetic */ View.OnClickListener $onClickListener;
        public final /* synthetic */ Hm3 $snackbar;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;
        public final /* synthetic */ AuraToastOption $type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, Integer num, View.OnClickListener onClickListener, Hm3 hm3, boolean z, AuraToastOption auraToastOption, AuraIconSize auraIconSize, B6A b6a) {
            super(2);
            this.$title = str;
            this.$subtitle = str2;
            this.$leadingIcon = num;
            this.$onClickListener = onClickListener;
            this.$snackbar = hm3;
            this.$dismissOnClick = z;
            this.$type = auraToastOption;
            this.$leadingIconSize = auraIconSize;
            this.$leadingIconTint = b6a;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                String str = this.$title;
                String str2 = this.$subtitle;
                Integer num = this.$leadingIcon;
                boolean zA1U = AnonymousClass001.A1U(bfm, this.$dismissOnClick, AnonymousClass001.A1T(bfm, this.$snackbar, bfm.A67(this.$onClickListener)));
                View.OnClickListener onClickListener = this.$onClickListener;
                Hm3 hm3 = this.$snackbar;
                boolean z = this.$dismissOnClick;
                Object objAaT = bfm.AaT();
                if (zA1U || objAaT == C78N.A00) {
                    objAaT = new AuraToast$Companion$make$card$1$2$1$1(onClickListener, hm3, z);
                    bfm.Ai0(objAaT);
                }
                AuraToastContentKt.m3084AuraToastContentAAXhOkM(str, null, str2, num, (Function0) objAaT, this.$type, this.$leadingIconSize, this.$leadingIconTint, bfm, 0, 2);
                return;
            }
            bfm.Afo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraToast$Companion$make$card$1(Hm3 hm3, String str, String str2, Integer num, View.OnClickListener onClickListener, boolean z, AuraToastOption auraToastOption, AuraIconSize auraIconSize, B6A b6a) {
        super(2);
        this.$snackbar = hm3;
        this.$title = str;
        this.$subtitle = str2;
        this.$leadingIcon = num;
        this.$onClickListener = onClickListener;
        this.$dismissOnClick = z;
        this.$type = auraToastOption;
        this.$leadingIconSize = auraIconSize;
        this.$leadingIconTint = b6a;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            BS0 bs0 = BRg.A00;
            float f = AuraDimensKt.SpacingSmall;
            BRg bRgA0C = C3U4.A0C(bs0, f, AuraDimensKt.SpacingMicro, f, AuraDimensKt.SpacingLarge);
            AuraToastSwipeToDismissBackgroundProvider auraToastSwipeToDismissBackgroundProvider = AuraToastSwipeToDismissBackgroundProvider.INSTANCE;
            boolean zA67 = bfm.A67(this.$snackbar);
            Hm3 hm3 = this.$snackbar;
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new AuraToast$Companion$make$card$1$1$1(hm3);
                bfm.Ai0(objAaT);
            }
            AuraSwipeableCardKt.AuraSwipeableCard((Function0) objAaT, null, bRgA0C, false, false, auraToastSwipeToDismissBackgroundProvider, null, false, null, B1V.A00(bfm, new AnonymousClass2(this.$title, this.$subtitle, this.$leadingIcon, this.$onClickListener, this.$snackbar, this.$dismissOnClick, this.$type, this.$leadingIconSize, this.$leadingIconTint), -1428290399), bfm, 805503024, 472);
            return;
        }
        bfm.Afo();
    }
}
