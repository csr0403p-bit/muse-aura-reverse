package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import android.content.res.Resources;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class NativeLoginGoogleSignInButtonKt {

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginGoogleSignInButtonKt$NativeLoginGoogleSignInButton$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ boolean $loading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Function0<Unit> function0, BRg bRg, boolean z, boolean z2, int i, int i2) {
            super(2);
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$enabled = z;
            this.$loading = z2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) throws XmlPullParserException, Resources.NotFoundException, IOException {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
            NativeLoginGoogleSignInButtonKt.NativeLoginGoogleSignInButton(this.$onClick, this.$modifier, this.$enabled, this.$loading, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NativeLoginGoogleSignInButton(kotlin.jvm.functions.Function0<kotlin.Unit> r35, X.BRg r36, boolean r37, boolean r38, X.BFM r39, int r40, int r41) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginGoogleSignInButtonKt.NativeLoginGoogleSignInButton(kotlin.jvm.functions.Function0, X.BRg, boolean, boolean, X.BFM, int, int):void");
    }
}
