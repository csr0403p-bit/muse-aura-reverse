package com.facebook.aura.vds.compose.header;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.C1b8;
import X.C7384Etj;
import X.G0V;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.facebook.aura.R;
import com.facebook.aura.vds.toolbar.AuraToolbarAgent;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class AuraPageHeaderKt {

    /* renamed from: com.facebook.aura.vds.compose.header.AuraPageHeaderKt$AuraPageHeader$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $centerLogoContent;
        public final /* synthetic */ AuraToolbarAgent.Config $config;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $shouldHaveTopInset;
        public final /* synthetic */ String $toolbarSubtext;
        public final /* synthetic */ String $toolbarText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(BRg bRg, String str, String str2, AuraToolbarAgent.Config config, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$toolbarText = str;
            this.$toolbarSubtext = str2;
            this.$config = config;
            this.$shouldHaveTopInset = z;
            this.$content = g0v;
            this.$centerLogoContent = g0v2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraPageHeaderKt.AuraPageHeader(this.$modifier, this.$toolbarText, this.$toolbarSubtext, this.$config, this.$shouldHaveTopInset, this.$content, this.$centerLogoContent, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
    @kotlin.Deprecated(message = "Use HatchPageHeader instead")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraPageHeader(X.BRg r29, java.lang.String r30, java.lang.String r31, com.facebook.aura.vds.toolbar.AuraToolbarAgent.Config r32, boolean r33, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r34, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r35, X.BFM r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.header.AuraPageHeaderKt.AuraPageHeader(X.BRg, java.lang.String, java.lang.String, com.facebook.aura.vds.toolbar.AuraToolbarAgent$Config, boolean, X.G0V, X.G0V, X.BFM, int, int):void");
    }

    public static final BRg backgroundIfNeeded(BRg bRg, Context context, AuraToolbarAgent.Config config) {
        BRg bRg2;
        if (config.addGradient) {
            long j = B6A.A01;
            bRg2 = bRg;
            bRg = C1b8.A01(bRg, getColorFromAttr(context, R.attr._name_removed__res_0x7f0405ea) << 32);
        } else {
            bRg2 = bRg;
        }
        return bRg2.then(bRg);
    }

    public static final int getColorFromAttr(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{i});
        C7384Etj.A0U(typedArrayObtainStyledAttributes);
        int color = typedArrayObtainStyledAttributes.getColor(0, context.getColor(R.color._name_removed__res_0x7f060082));
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }
}
